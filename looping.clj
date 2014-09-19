;; Looping

;; Loop and Recur
;; Recur transfers control to the local most loop head without stack space
;; loop establishes biding via implicit let (taking vetor binding names)

(loop [x 5]
  (if (neg? x)
    x
    (recur (dec x))))

;; Loop heads are also established by functions, binding function parameters to recur arguments

(defn countdown
  [x]
  (if (zero? x)
    :blastoff!!
    (do (println x)
        (recur (dec x)))))

(countdown 5)


;; Appropriate use of recur (not necessary) when:
;; iterating over collections or sequence, then map, reduce, for are preferred