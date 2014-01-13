(ns app.core)

(def card-type '("Spade" "Club" "Diamond" "Heart"))
(def card-val 
		(concat  "A" (range 2 11) '("J" "Q" "K")))
(def used-cards '())
(def deck-of-cards 
	(for [t card-type n card-val]
		{:type t :value n}))


(defn rand-card-int []
	(rand-int (count deck-of-cards)))

(defn get-card []
	(nth  deck-of-cards (rand-card-int)))

(defn put-card-into-list[x-list card]
	(conj x-list card))

		
(defn main [] 
	(do
		(println "Hello world")
		(println card-type)
		(println card-val)
		(println (count deck-of-cards))
		(let [card (get-card) u-c '()]
			(do 
				(put-card-into-list used-cards card)
				(println card)
				(conj u-c 1)
				(println u-c)
				(println (conj used-cards card))))))
