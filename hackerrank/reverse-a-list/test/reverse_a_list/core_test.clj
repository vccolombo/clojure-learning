(ns reverse-a-list.core-test
  (:require [clojure.test :refer :all]
            [reverse-a-list.core :refer :all]))

(deftest reverse-list-test
  (testing "Populated list"
    (is (= '(1 42 18) (reverse-list '(18 42 1))))
    (is (= '(1 2 3 4 5) (reverse-list '(5 4 3 2 1)))))
  (testing "Empty list"
    (is (= '() (reverse-list '())))))
