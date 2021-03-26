(ns reverse-a-list.core
  (:gen-class))

(defn reverse-list
  [lst]
  (loop [reversed-lst '()
         original-lst lst]
    (if (empty? original-lst)
      reversed-lst
      (recur
       (conj reversed-lst (first original-lst))
       (rest original-lst)))))

(defn -main
  [& args]
  (println (reverse-list '(1 2 3 4 5))))
