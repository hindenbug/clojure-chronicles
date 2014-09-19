(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(println (average [60 70 80 90]))


;; Scalar Literals
;; Used for non collection values

;; Strings
;; Booleans
;; nil
;; Characters (denoted by '\' eg: \c)
;; Keywords (prefixed with a :, :: becomes a namespaced keyword in current namespace)
;; Symbol (Indentifiers, evaluate to values at runtime by name. eg: average)
;; Numbers (long, double, BIgInt, BgiDecimal, Ratio, hexa, octa)
;; Regular Expressions (prefixed with a #, eg: (class #"(p|h)ail") )


;; Comments
;; (;; Single line, #_ for inline comment eg: + (1 2 3 #_(* 2 2) 8 ) => (+ 1 2 8) )

;; Collection Literals (list vectors map set)

;; Misc
;; quote or ' (suppressing evaluation)
;; #() function literal shorthand
;; # Vars (defined usgin 'def') ;; Vars are not variables
;; @ instance refernces
;; ~@ macros
;; All data structures and reference types support METADATA using ^

;; Namespaces
;; Clojure's fundamental unit for code modularity
;; current namesapce is always bound *ns*




