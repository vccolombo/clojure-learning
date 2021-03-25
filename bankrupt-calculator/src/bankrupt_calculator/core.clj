(ns bankrupt-calculator.core)
(def filename "finances.csv")

(def headers [:name :profit :deficit])

(defn str->int
  "Convert string to integer"
  [string]
  (Integer. string))

(def conversions {:name identity
                  :profit str->int
                  :deficit str->int})

(defn convert
  [key value]
  ((get conversions key) value))

(defn parse
  "Convert csv into list of vectors, where each vector is a line in the csv"
  [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

(defn mapify
  "Transform parsed csv in list of maps {:key1 value1, :key2 value2...}"
  [rows]
  (map (fn [unmapped-row]
         (reduce (fn [row-map [key value]]
                   (assoc row-map key (convert key value)))
                 {}
                 (map vector headers unmapped-row)))
       rows))

(defn check-bankruptcy
  [entries]
  (filter #(< (- (:profit %) (:deficit %)) 0) entries))

(defn -main
  [& args]
  (println (map :name (check-bankruptcy (mapify (parse (slurp filename)))))))
