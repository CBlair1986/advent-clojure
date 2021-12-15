(ns advent.core
  (:gen-class)
  (:require [clojure.string :as string] [clojure.math.combinatorics]
            [advent.2020.2020]))

(defn -main
  "I don't do a whole lot ... yet."
  [& _args]
  (println "Hello, World!"))

;; First I need a mechanism to pull the input files from the disk, thankfully Clojure has really easy ways to do this. Right?

(defn pull-input
  [input-number]
  (slurp (str "resources/2020/day" input-number "input.txt")))

(advent.2020.2020/day1-part1 (pull-input 1))

(defn day1-part2
  []
  (let [input (pull-input 1)
        lines (string/split-lines input)
        nums (map #(Integer/parseInt %) lines)
        triplets (clojure.math.combinatorics/combinations nums 3) ;; The main meat and potatoes here is the combinations function, how would I make this for myself?
        sums (map #(vector (apply + %) %) triplets)
        matches (filter #(= (first %) 2020) sums)
        product (apply * (second (first matches)))]
    product))

(day1-part2)

;; Here we're parsing passwords

(defn day2-part1
  []
  (let [input (pull-input 2)
        lines (string/split-lines input)
        parts (map #(string/split % #"\s") lines)]
    parts))

(day2-part1)