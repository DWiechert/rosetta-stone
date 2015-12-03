(def i1 (read-string (nth *command-line-args* 0)))
(def i2 (read-string (nth *command-line-args* 1)))

(if (< i1 i2) (println i1 "is less than" i2 "."))
(if (= i1 i2) (println i1 "is equal to" i2 "."))
(if (> i1 i2) (println i1 "is greater than" i2 "."))