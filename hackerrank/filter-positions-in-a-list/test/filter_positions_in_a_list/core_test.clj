(ns filter-positions-in-a-list.core-test
  (:require [clojure.test :refer :all]
            [filter-positions-in-a-list.core :refer :all]))

(deftest remove-elements-odd-positions-test
  (testing "Populated list"
    (testing "even amount of elements"
      (is (= '(2 4 6) (remove-elements-odd-positions '(1 2 3 4 5 6))))
      (is (= '(2) (remove-elements-odd-positions '(1 2)))))
    (testing "odd amount of elements"
      (is (= '(2 4 6) (remove-elements-odd-positions '(1 2 3 4 5 6 7))))
      (is (= '(2) (remove-elements-odd-positions '(1 2 3))))
      (is (= '() (remove-elements-odd-positions '(1))))))
  (testing "Empty list"
    (is (= '() (remove-elements-odd-positions '())))))
