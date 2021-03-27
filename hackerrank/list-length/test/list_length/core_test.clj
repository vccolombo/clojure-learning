(ns list-length.core-test
  (:require [clojure.test :refer :all]
            [list-length.core :refer :all]))

(deftest list-length-test
  (testing "List length"
    (is (= 10 (list-length '(2 5 1 4 3 7 8 6 0 9))))
    (is (= 1 (list-length '(42))))
    (is (= 0 (list-length '())))
    (testing "Has nil value"
      (is (= 10 (list-length '(2 5 nil 4 3 7 8 6 0 9)))))))
