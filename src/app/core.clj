(ns app.core)

(def card_type '("Spade" "Club" "Diamond" "Heart"))
(def card_number 
		(concat  "A" (range 2 11) '("J" "Q" "K")))
(def cards
		(vec 
			(for [type card_type 
				num card_number
				:let [res (hash-map :type type :value num)]]
				res)))
		
(defn main [] 
	(do
		(println "Hello world")
		(println card_type)
		(println card_number)
		(println (count cards))
		(println (:value (nth cards 0)))))
