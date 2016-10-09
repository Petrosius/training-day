(ns training-day)

(def answer 42)

(defn                                 ; Start a function definition:
  hai                              ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!"))

(defn square [x]
  (* x x)
   )

(defn average [a b]
  (/ (+ a b) 2))

