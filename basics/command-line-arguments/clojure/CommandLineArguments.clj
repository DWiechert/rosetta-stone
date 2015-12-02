(println (count *command-line-args*) "arguments were provided:")

(doseq [arg *command-line-args*]
  (println arg))