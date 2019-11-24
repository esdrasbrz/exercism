(ns armstrong-numbers)

(defn numsize [num]
  (count (str num))
)

(defn sumnumpower [num power]
  (reduce + (map #(Math/pow (int %) power) (str num)))
)

(defn armstrong? [num] ;; <- arglist goes here
  (let [size (numsize num)]
    (= (sumnumpower num size) num) 
  )
)

