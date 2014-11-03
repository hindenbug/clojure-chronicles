;;;; Functions on LIST
;; peek and pop


;; peek returns the first element in the list
(peek '(1 2 3))

;; => 1

;; pop returns list without the firs element
(pop '(1 2 3))

;; => (2 3)

;; pop returns error on empty list
(pop ())

;; => error

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions on VECTORS

;; PEEK returns the last element from the vector
(peek [1 2 3])

;; => 3

;; POP returns the vector without the last element
(pop [1 2 3])

;; => [1 2]

;; GET
(get [1 2 3 4] 1)

;; => 2

;; NOTE:: Vectors are themselves functions, i.e they take index argument and return the element else
;; return error if the index is out of bound

([:a :b :c :d] 1)
;; => b

;; ASSOC, associates new value with a particular index
(assoc [0 1 2 3] 2 5)
;; => [ 0 1 5 3]


;; SUBVEC, (subvec vector start end)
(subvec [1 2 3 4 5] 3)
;; => [4 5]



