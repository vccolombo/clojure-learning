(ns sum-of-odd-elements.core-test
  (:require [clojure.test :refer :all]
            [sum-of-odd-elements.core :refer :all]))

(deftest sum-of-odd-elements-test
  (testing "Populated list"
    (is (= 16 (sum-of-odd-elements '(3 2 4 6 5 7 8 0 1))))
    (is (= 3 (sum-of-odd-elements '(3))))
    (testing "Has negative numbers"
      (is (= -6 (sum-of-odd-elements '(4 -1 6 -3 5 -7 -42))))))
  (testing "Empty list"
    (is (= 0 (sum-of-odd-elements '())))))
