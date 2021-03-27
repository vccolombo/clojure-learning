(ns update-list.core
  (:gen-class))

(defn abs
  [value]
  (if (neg? value)
    (* value -1)
    value))

(defn absolute-elements
  [lst]
  (map abs lst))

(defn -main
  [& args]
  (println (absolute-elements '(2 -4 3 -1 23 -4 -54))))
