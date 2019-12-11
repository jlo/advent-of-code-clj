(ns advent-of-code-clj.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn intcode
  "Intcode program"
  [list]
  (println (nth list 0)))

(intcode [1,0,0,3,99])