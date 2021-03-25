(ns list-replication.core
  (:gen-class))

(defn list-replication
  [num lst]
  (loop [curr-list lst result []]
    (if (empty? curr-list)
      result
      (recur (drop 1 curr-list) (into result (take num (repeat (first curr-list))))))))

(defn -main
  [& args]
  (println (list-replication 3 (lazy-seq '(1 2 3)))))


