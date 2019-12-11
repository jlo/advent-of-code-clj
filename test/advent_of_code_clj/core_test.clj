(ns advent-of-code-clj.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code-clj.core :refer :all]
            [clojure.java.io :as io]))

(def input
  (slurp
    (io/resource "day2-input.txt")))

(def input-list
  (clojure.string/split input #","))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
