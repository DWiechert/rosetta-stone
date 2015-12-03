(def s1 (nth *command-line-args* 0))
(def s2 (nth *command-line-args* 1))

(if (= s1 s2) (println "'" s1 "'" "is equal to" "'" s2 "'" "with case."))
(if (= (clojure.string/lower-case s1) (clojure.string/lower-case s2)) (println "'" s1 "'" "is equal to"  "'" s2 "'" "without case."))

(if (< (compare s1 s2) 0) (println "'" s1 "'" "is lexically before"  "'" s2 "'" "."))
(if (= (compare s1 s2) 0) (println "'" s1 "'" "is lexically equal"  "'" s2 "'" "."))
(if (> (compare s1 s2) 0) (println "'" s1 "'" "is lexically after"  "'" s2 "'" "."))