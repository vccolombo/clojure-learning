(ns array-of-n-elements.core
  (:gen-class))

(defn array-of-n-elements
  [n]
  (range n))

(defn -main
  [& args]
  (println (array-of-n-elements 10)))
