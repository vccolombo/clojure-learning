(ns list-length.core
  (:gen-class))

;; (defn list-length
;;   [lst]
;;   (loop [curr-lst lst
;;          result 0]
;;     (if (empty? curr-lst)
;;       result
;;       (recur (rest curr-lst) (inc result)))))

(defn list-length
  [lst]
  (reduce
   (fn [a b]
     (inc a))
   0
   lst))

(defn -main
  [& args]
  (println (list-length '(2 5 1 4 3 7 8 6 0 9))))
