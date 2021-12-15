(ns advent.2021.2021
  (:require [clojure.string :as str]))

(println "Day 1")

(defn day1-part1
  []
  (let [input-lines (str/split-lines (slurp "resources/2021/day1.txt"))
        numbers (map #(Integer/parseInt %) input-lines)
        lagged-numbers (drop 1 numbers)
        numbers-deltas (map - lagged-numbers numbers)
        positives-count (count (filter #(> % 0) numbers-deltas))]
    positives-count))

(println "Part 1:" (day1-part1))

(defn day1-part2
  []
  (let [input-lines (str/split-lines (slurp "resources/2021/day1.txt"))
        numbers (map #(Integer/parseInt %) input-lines)
        triple-sums (map #(apply + %) (partition 3 1 numbers))
        lagged-triple-sums (drop 1 triple-sums)
        numbers-deltas (map - lagged-triple-sums triple-sums)
        positives-count (count (filter #(> % 0) numbers-deltas))
        ]
    positives-count))

(println "Part 2:" (day1-part2))