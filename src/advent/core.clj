(ns advent.core
  (:gen-class)
  (:require [clojure.string :as string] [clojure.math.combinatorics]
            [advent.2020.2020 :as aoc2020]
            [advent.2021.2021 :as aoc2021]))

(defn -main
  "I don't do a whole lot ... yet."
  [& _args]
  (println "Hello, World!"))

;; First I need a mechanism to pull the input files from the disk, thankfully Clojure has really easy ways to do this. Right?

(defn pull-input
  [input-number]
  (slurp (str "resources/2020/day" input-number "input.txt")))

(advent.2020.2020/day1-part1 (pull-input 1))

(day1-part2)

;; Here we're parsing passwords

(defn day2-part1
  []
  (let [input (pull-input 2)
        lines (string/split-lines input)
        parts (map #(string/split % #"\s") lines)]
    parts))

(day2-part1)