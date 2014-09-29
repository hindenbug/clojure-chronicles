;; Composition
;; Given any number of functions it
;; using each successive result as the argument to the next provided function

;; eg: negation of a sum of some given numbers as a string

(def negated-sum-str (comp str - +))
(negated-sum-str 10 12 3.5)

;; comp is acting as a pipeline
;; accets any number of functions A,B,C (str - +) in this case
;; produces a new function which accepts same arguments as C
;; then calls B with the result given by C;;
;; then calls A with result of B and so on

;; final result is then given by the first function provided to comp (A)


(clojure.string/split "CamelCase")