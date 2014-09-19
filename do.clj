;; Code Blocks
;; do - evaluates all of the expressions provided to it and return the last evaluated value

(do
  (println "hi")
  (apply * [4 5 6]))

;; Other fn, let, loop, try, defn  wrap their bodie in an implicit 'do' expression