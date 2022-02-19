# APM (Application Performance Monitoring)

## Introductie
(Over Teuno en Thijs)

## Inhoud
1. Wat is APM
2. Het probleem waar APM je bij kan helpen
3. Hoe werkt APM
4. Geschiedenis
5. Verschillende tooling en technieken
6. Opdrachten

## 1. Wat is APM en wat kun je er mee bereiken.
APM staat voor Application Performance Monitoring. Dit kun je toepassen in je applicatie landschap om beter inzicht te krijgen in de performance van je applicaties. 
Het bestaat uit verschillende onderdelen (waar we later op terug komen) die er voor zorgen dat activiteiten over je gehele landschap gevolgd kunnen worden. 

## 2. Het probleem waar APM je bij kan helpen
In onderstaande afbeelding hebben wij een voorbeeeld waarin APM erg helpvol zou kunnen zijn. In deze applicatie begint een activiteit vanuit de browser, in de frontend applicatie. De backend bekijkt vervolgens of iets in de database aanwezig is. Zo niet, dan worden gegevens van een derde partij opgevraagd en opgeslagen. Uiteindelijk krijgt de gebruiker weer feedback.
![Het probleem](img/pres_het_probleem.png)
Gebruikers klagen bij het gebruik van deze applicatie. Hij is namelijk erg traag. Voor jou als ontwikkelaar is het nog niet gemakkelijk om er achter te komen waar het probleem zit. Het moment om APM toe te passen.

## 3. Hoe werkt APM
Ieder event in de applicatie krijgt een uniek ID mee. De gehele tijd dat deze ID geldig is, wordt een trace genoemd. 