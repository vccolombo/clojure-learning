(ns filter-array.core
  (:gen-class))

;; (defn filter-array
;;   [delim lst]
;;   (loop [curr-list lst]
;;     (if (empty? curr-list)
;;       nil
;;       (do
;;         (if (< (first curr-list) delim)
;;           (println (first curr-list)))
;;         (recur (drop 1 curr-list))))))

;; (defn filter-array
;;   [delim lst]
;;   (def filtered (filter #(< % delim) lst))
;;   (doall (map println filtered)))

;; (defn filter-array
;;   [delim lst]
;;   (def filtered (remove #(>= % delim) lst))
;;   (doall (map println filtered)))

;; (defn filter-array
;;   [delim lst]
;;   (as-> lst lst
;;     (remove #(>= % delim) lst)
;;     (doall (map println lst))))

(defn realize-print
  [lazy-lst]
  (doall (map println lazy-lst)))

(defn filter-array
  [delim lst]
  (->> lst
       (remove #(>= % delim))
       (realize-print)))

(defn -main
  [& args]
  (filter-array 5 '(1 9 7 2 0 8 3)))
