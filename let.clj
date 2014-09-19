;; let
;; lets you define local bindings
;; implicitly uses let anywhere the locals are required

(defn sqroot
  [x y]
  (let [x2 (+ x x)
        y2 (+ y y)]
    (Math/sqrt (+ x2 y2))))

(println (sqroot 2 4))