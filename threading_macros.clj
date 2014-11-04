;; Threading macros
;; -> and ->>


;; Thread-first macro ->
;; helps write function composition in reversed order.
;; (f (g (h x))) can be written as (-> x h g f)
;; useful for performing operations on the first argument

(-> x & forms)

;; Normal nested form
(first (.split (.replace (.toUpperCase "a b c d") "A" "X") " "))

;; easier thread first macro
(-> "a b c d" .toUpperCase (.replace "A" "X") (.split " ") first)


;; ->> (thrush operator or thread-last)
;; useful in combination with map reduce or filter
(->> x & forms)

;; first filter all +ve elements
;; inc all remaining elements
;; convert to string
(->> [-1 0 1 2]
     (filter pos?)
     (map inc)
     (map str))





