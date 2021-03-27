(ns list-replication.core-test
  (:require [clojure.test :refer :all]
            [list-replication.core :refer :all]))

(deftest list-replication-test
  (testing "Populated list"
    (is (= [1 1 2 2 3 3] (list-replication 2 '(1 2 3))))
    (is (= [1 1 1 2 2 2 3 3 3] (list-replication 3 '(1 2 3)))))
  (testing "empty list"
    (is (= [] (list-replication 42 '()))))
  (testing "Lazy seq"
    (is (= [1 1 2 2 3 3] (list-replication 2 (lazy-seq '(1 2 3)))))
    (is (= [1 1 1 2 2 2 3 3 3] (list-replication 3 (lazy-seq '(1 2 3)))))
    (is (= [] (list-replication 42 (lazy-seq '()))))))
