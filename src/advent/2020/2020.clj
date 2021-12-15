(ns advent.2020.2020
  (:require [clojure.string :as string] [clojure.math.combinatorics]))

(defn day1-part1
  [input]
  (let [lines (string/split-lines input)
        nums (map #(Integer/parseInt %) lines)
        pairs (clojure.math.combinatorics/combinations nums 2)
        sums (map #(vector (apply + %) %) pairs)
        matches (filter #(= (first %) 2020) sums)
        product (apply * (second (first matches)))]
    product))