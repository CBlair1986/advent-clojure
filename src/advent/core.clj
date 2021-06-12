(ns advent.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; First I need a mechanism to pull the input files from the net, thankfully Clojure has really easy ways to do this.

(defn pull-input
  [input-number]
  (slurp some-url))