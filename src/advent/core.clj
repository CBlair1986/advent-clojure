(ns advent.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; First I need a mechanism to pull the input files from the disk, thankfully Clojure has really easy ways to do this. Right?

(defn pull-input
  [input-number]
  (slurp (str "resources/day" input-number "input.txt")))

