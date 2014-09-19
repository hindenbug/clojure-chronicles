;; Functions
;; first class values denoted by fn

(fn [x]
  (+ 10 x))

((fn [x] (+ 10 x)) 8)

;; Function wit multiple arities
;; each airty vector (arg) and body must be enclosed within aa pair of parentheses

(def adder (fn addition
             ([x] (addition x 1))
             ([x y] (+ x y))))

(adder 10)

(adder 10 50)


;; defn
;; def + fn (define and name functions)

(defn adder
  ([x] (adder x 1))
  ([x y] (+ x y)))

;; Variadic functions
;; gather all additional args into a seq

(defn concat-rest
  [x & rest]
  (apply str (butlast rest)))

(concat-rest 0 1 2 3 4 5)


(defn make-user
  [& [user-id]]
  {:user-id (or user-id
              (str (java.util.UUID/randomUUID)))})

(make-user)
(make-user "Spock")


;; KEyword Arguments
;; just like ruby hash as arguments, key pair based


;; Function Literals

(fn [x y] (Math/pow x y))
#(Math/pow %1 %2)


(read-string "#(Math/pow %1 %2")


