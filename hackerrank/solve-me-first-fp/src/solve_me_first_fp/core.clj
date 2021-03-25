(ns solve-me-first-fp.core
  (:gen-class))

(defn -main
  [& args]
  (def A (Integer. (read-line)))
  (def B (Integer. (read-line)))
  (println (+ A B)))
