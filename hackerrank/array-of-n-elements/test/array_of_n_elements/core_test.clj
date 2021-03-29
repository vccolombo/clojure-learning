(ns array-of-n-elements.core-test
  (:require [clojure.test :refer :all]
            [array-of-n-elements.core :refer :all]))

(deftest array-of-n-elements-test
  (testing "Generate array of n elements"
    (is (= [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] (array-of-n-elements 10)))
    (is (= [0] (array-of-n-elements 1)))
    (is (= [] (array-of-n-elements 0)))))
