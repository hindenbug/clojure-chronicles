;; Data Structures and Collections

;; conj adds new value to the collection
;; conj aapends value to the vector
;; conj prepends value to a list
;; conj adds key value to a map
;; conj adds valye to the set presumeung that value is not already present
;; conj always add a given vale to the subject collection efficiently


;; seq provides seq view of a vector or a list or a set
;; brings map into the fold by yielding a sequential view over a maps key/value paurs represented in
;; vector pairs

;; Abstractions
;; There are 7 different primary abstractions in Clojure
;; Collection, Sequence, Associative, Indexed, Stack, Set, Sorted

;; Collection

;; Are value that you can use with the set of core collection functions like - conj, seq, count,
;; empty, =, these functions are polymorphic

(conj '(1 2 3) 4)

(into '(1 2 3) [:a :b :c])


;; Sequences
;; produces a seq over its arguments
;; first, rest and next provide ways to consumer seq
;; lazy-seq produces lazy seq that is result of evauating an expression
;; types that are sequable

;; Collection types
;; Arrays
;; nil
;; Strings

(seq "Clojure")

(seq {:a 5 :b 6})
(seq (into-array ["Clojure" "Programming"]))
(seq nil)

;; func taht work with seq call 'seq' on their arguments

(map str "Clojure")
(set "Programming")


;; traversing and processing sequences
;; first, rest, next

;; length determinations of seq is costly


;; creating seqs
;; produced either by explicitly seq or map
;; cons
;; accepts 2 args, a val to serve as head and another as tail seq
;; always prepends at the tails

(cons 0 (range 1 5))
(cons :a [:b :c :d])

;; list*
;; takes any number of head values, followed by seq

(list* 0 1 2 3 (range 4 10))


;; Lazy Seqs
;; evaluated when in demand
;; lazy-seq evalate to seqable value

(lazy-seq [1 2 3])


(defn ints-from [n]
  (cons n (lazy-seq (ints-from (inc n)))))

(take 10 (ints-from 7))



(defn random-ints
  [limit]
  (lazy-seq
    (cons (rand-int limit)
          (random-ints limit))))

(take 10 (random-ints 50))


