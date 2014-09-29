;; First Class and Higher Order Functions
;; As clojure functions are values themselves, they can be used as HOF's

;; map
;; accpets single fn argument followed by one or more collecions and returns a sequence

(map * [1 2 3 4] [ 5 6 7 8])
;; (5 12 21 32)



;; reduce
;; Used to coalesce a collection into a single value that might not be sequential

(reduce max [0 -2 10 48])
;; 48

;; takes a intial seed value too

(reduce + 50 [ 1 2 3 4])
;; 60


;; assoc

(reduce #(assoc % %2 (* %2 %2))
        {}
        [ 1 2 3 4])



;; apply
;; sequence of arguments
;; must be presented with all the arguments

(apply hash-map [:a 5 :b 6])


;; allows to prefix the argument sequence with any number of explicit arguments

(def args [2 -2 10])

(apply * 0.5 3 args)



;; partial
;; provide only some of the arguments to a function
;; accepts some function 'f' and one or more arguments to that function and returns 'g' that retains
;; those arguemtns as well as the reference to 'f'

(def only-strings (partial filter string?))
(only-strings ["a" "b" 4 5 "d"])

((partial map *) [1 2 3] [4 5 6])

;; alternative

(#(filter % ["a" 5 "b" 6]) string?)
;; but requires all arguments to be specified


;; Writin HOF's

(defn adder
  [n]
  (fn [x] (+ n x)))

((adder 5) 18)


(defn doubler
  [f]
  (fn [& args]
    (* 2 (apply f args))))

((doubler +) 1 2 3)

