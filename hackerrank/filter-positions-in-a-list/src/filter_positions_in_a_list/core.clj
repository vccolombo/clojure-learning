(ns filter-positions-in-a-list.core
  (:gen-class))

(defn remove-elements-odd-positions
  [lst]
  (loop [curr-lst lst
         result []
         iter 1]
    (if (empty? curr-lst)
      result
      (if (odd? iter)
        (recur (rest curr-lst) result (inc iter))
        (recur (rest curr-lst) (conj result (first curr-lst)) (inc iter))))))

(defn -main
  [& args]
  (println (remove-elements-odd-positions '(1 2 3 4 5 6 7 8 9))))
