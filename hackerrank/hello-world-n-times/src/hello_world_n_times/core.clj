(ns hello-world-n-times.core
  (:gen-class))

;; (defn hello_word_n_times
;;   [n]
;;   (dorun (map println (repeat n "Hello World"))))
;;   

;; (defn hello_word_n_times
;;   [n]
;;   (dotimes [_ n] (println "Hello World")))
;;   

;; (defn hello_word_n_times
;;   [n]
;;   (doseq [hello-world (repeat n "Hello World")] (println hello-world)))

(defn hello_word_n_times
  [n]
  (loop [count 1]
    (println "Hello World")
    (if (< count n)
      (recur (inc count)))))


(defn -main
  [& args]
  (def n (Integer. (read-line)))
  (hello_word_n_times n))
