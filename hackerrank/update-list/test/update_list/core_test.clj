(ns update-list.core-test
  (:require [clojure.test :refer :all]
            [update-list.core :refer :all]))

(deftest abs-test
  (testing "Absolute of single value"
    (is (= 42 (abs -42)))
    (is (= 18 (abs 18)))
    (is (= 0 (abs 0)))))

(deftest absolute-elements-test
  (testing "Absolute elements of a list"
    (is (= '(2 4 3 1 23 4 54) (absolute-elements '(2 -4 3 -1 23 -4 -54))))
    (is (= '(1 2 3) (absolute-elements '(1 2 3))))
    (is (= '() (absolute-elements '())))))
