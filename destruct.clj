;; Squential Desctructuring
;; similar to ruby's unpacking x, y, z = [42, "foo", 39]
;; lists vectors seqs strings
;; are intented mirror to the structure of the collection that is being bound (v)

(def v [42 "foo" 99.2 [5 12]])

(let [[x y z] v]
  (+ x z))

;; 141.2

;; Gathering extra positional seq values
;; use &
;; return a sequence ()

(let [[x & rest] v]
  rest)


;; retaining destructred value
;; local binding for original collection
;; useful to retain original value

(let [[x _ z :as original-vector] v]
  (conj original-vector (+ x z)))



;; Map Destructuring
;; Same as above
;; Works with hash-maps, arry-maps, records
;; any value supported by get function , vectors, String, Arrays


(def m {:a 5 :b 6
        :c [7 8 9]
        :d {:e 10 :f 11}
        "foo" 88
        42 false})

(let [{a :a b :b} m]
  (+ a b))

