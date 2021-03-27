(ns sum-of-odd-elements.core
  (:gen-class))

(defn sum-of-odd-elements
  [lst]
  (reduce
   (fn [a b]
     (if (odd? b)
       (+ a b)
       (identity a)))
   0
   lst))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (sum-of-odd-elements '(3 2 4 6 5 7 8 0 1))))
