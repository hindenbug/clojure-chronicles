;; Example for HOF's

;; Logger

(defn print-logger
  [writer]
  #( binding [*out* writer]
     (println %)))

((print-logger *out*) "hello")