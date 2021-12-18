# Rapport du projet Citadelle (groupe K)
## Auteurs 
* [LE BIHAN Léo](https://github.com/LeBihanLeo)
* [BONNET Kilian](https://github.com/KilianBonnet)
* [KARRAKCHOU Mourad](https://github.com/MouradKarrakchou)
* [IMAMI Ayoub](https://github.com/AyoubIMAMI)

# L’architecture


# Informations utiles

# Répartition du travail
Afin d’assurer une robustesse dans le code, les différentes fonctionnalités, méthodes et classes ont un ou plusieurs tests associés. Ainsi, lorsque sera évoqué l’auteur d’une fonctionnalité, méthode ou classe cela implique aussi que ce dernier ait travaillé sur les tests associés. L'architecture du projet nous a permis de scinder ce dernier plusieurs blocs de code assez distinct. Au fur et à mesure du temps, chacun a pu se spécialiser dans une partie du code.

## Cartes de personnages
L'implémentation des cartes de personnages _(retrouvable dans le package [characters_class](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/tree/master/src/main/java/fr/unice/polytech/citadelle/characters_class))_ fut faite par [Mourad Karrakchou](https://github.com/MouradKarrakchou). L'implémentation des cartes personnages impliquent aussi l'implémentation des différents sorts de personnage.

### Issues associés :

| Isssue                                                                                     | Description                      | Date       |
|--------------------------------------------------------------------------------------------|----------------------------------|------------|
| [#11](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/11) | Ajout du roi                     | 21/11/2021 |
| [#12](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/12) | Ajout de l’assassin              | 23/11/2021 |
| [#13](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/13) | Ajout du voleur                  | 24/11/2021 |
| [#14](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/14) | Ajout du marchand                | 25/11/2021 |
| [#23](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/23) | Refactor de l’assassin et du roi | 24/11/2021 |
| [#25](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/25) | Ajout de l'architect             | 06/12/2021 |
| [#28](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/28) | Ajout du magicien                | 06/12/2021 |
| [#38](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/38) | Ajout de l'évêque                | 08/12/2021 |
| [#44](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/44) | Refactor des personnages         | 08/12/2021 |
| [#48](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/48) | Ajout du condottiere             | 08/12/2021 |


## Cartes de quartiers
Le la même façon que les cartes de personnages, l'implémentation des cartes de quartiers _(retrouvable dans le package [game](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/tree/master/src/main/java/fr/unice/polytech/citadelle/game) et notamment dans le package [purple_districts](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/tree/master/src/main/java/fr/unice/polytech/citadelle/purple_districts))_ implique aussi l'implémentation des différents sorts de quartiers. Cette dernière fut réalisée par [Ayoub Imami](https://github.com/AyoubIMAMI).

### Issues associés :

| Isssue                                                                                     | Description                                    | Date       |
|--------------------------------------------------------------------------------------------|------------------------------------------------|------------|
| [#7](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/7)   | Ajout des quartiers ayant 8 différents prix    | 18/11/2021 |
| [#19](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/19) | Ajout des couleurs de quartier                 | 24/11/2021 |
| [#27](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/27) | Ajout du sort de quartier : Dragoport          | 03/12/2021 |
| [#34](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/34) | Ajout du sort de quartier : Université         | 05/12/2021 |
| [#39](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/34) | Ajout du sort de quartier : Cour des miracles  | 08/12/2021 |
| [#42](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/42) | Ajout du sort de quartier : École de magie     | 08/12/2021 |


## La représentation du jeu
La représentation jeu correspond à la façon dont le plateau de jeu de Citadelle a été pensé et implémenté dans le code. Ces différents aspects et choix de modélisation sont trouvables dans le package [game](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/tree/master/src/main/java/fr/unice/polytech/citadelle/game). Cet élément regroupant à la fois joueurs et cartes, cette implémentation fut faite par l'ensemble du groupe. 

### Issues associés (les noms seront indiqués):
| Isssue  | Description  | Date | Nom |
|---------|--------------|------|-----|
| [#1](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/7) | Ajout des quartiers ayant 8 différents prix | 11/11/2021 | [KARRAKCHOU Mourad](https://github.com/MouradKarrakchou) |
| [#2](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/2) | Ajout du deck de quartiers | 14/11/2021 | [KARRAKCHOU Mourad](https://github.com/MouradKarrakchou) |
| [#4](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/4) | Ajout de la gestion des de l’or | 16/11/2021 | [BONNET Kilian](https://github.com/KilianBonnet) |
| [#8](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/8) | Piocher deux cartes quartiers et en brûler une | 19/11/2021 | [BONNET Kilian](https://github.com/KilianBonnet) |
| [#9](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/9) | Construire un quartier et passer son tour | 19/11/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |
| [#30](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/30) | Le joueur commence avec 4 cartes quartiers | 07/12/2021 | [BONNET Kilian](https://github.com/KilianBonnet) |
| [#37](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/37) | Le deck de quartiers peut être mélanger| 08/12/2021 | [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#52](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/52) | Les cartes personnages peuvent être brûlées | 16/12/2021 | [BONNET Kilian](https://github.com/KilianBonnet) |

## La gestion du jeu
La gestion du jeu est un élément qui s’est vu séparé du jeu suite à un refactor au vu de la taille que cette dernière prenait au fur et à mesure des ajouts de code. La gestion du jeu _(trouvable dans le package [game_engine](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/tree/master/src/main/java/fr/unice/polytech/citadelle/game_engine))_ fait la liaison entre la décision des robots et la modification de l’état du jeu. Comme l’implémentation du jeu, la gestion du jeu est un élément regroupant à la fois joueurs, cartes et choix des robots, cette implémentation a été faite par l'ensemble du groupe.

### Issues associés (les noms seront indiqués):
| Isssue  | Description  | Date | Nom |
|---------|--------------|------|-----|
| [#3](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/3) | Gestion de l'égalité | 14/11/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |
| [#5](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/5) | Gestion du dernier round | 16/11/2021 |  [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#6](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/6) | Mise à jour du système de recherche du gagnant | 14/11/2021 | [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#8](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/6) | Gestion de la fin du jeu à 8 quartiers posés | 16/11/2021 | [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#22](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/22) | Refactor de la classe d’initialisation | 27/11/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |
| [#29](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/29) | Refactor de la classe d’initialisation | 03/12/2021 |  [BONNET Kilian](https://github.com/KilianBonnet) |

## La gestion des interactions du jeu
Les éléments permettant les interactions avec le jeu se situent dans le package [game_interacor](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/tree/master/src/main/java/fr/unice/polytech/citadelle/game_interactor). Ces interactions _(gérées par [l’executor](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/blob/master/src/main/java/fr/unice/polytech/citadelle/game_interactor/Executor.java))_ sont décidées en fonction du comportement associé à un joueur. Cette implémentation fut en grande partie menée par [LE BIHAN Léo](https://github.com/LeBihanLeo). Vers le début de ce mois de décembre, l’ajout de stratégies a été décidé et est en cours d’implémentation afin d’ajouter aux différents bots des stratégies plus ou moins complexes basées sur une analyse plus poussée des différents paramètres du jeu (joueurs, personnages, bâtiments construits, … ).

### Issues associés (les noms seront indiqués):
| Isssue  | Description  | Date | Nom |
|---------|--------------|------|-----|
| [#9](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/9) | Passer son tour après avoir construit un quarier | 18/11/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |
| [#10](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/10) | Stratégie de fin de jeu | 21/11/2021 | [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#15](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/15) | Stratégie du choix de personnage | 24/11/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |
| [#20](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/20) | Mise à jour de la stratégie de fin de jeu/tour  | 01/12/2021 |  [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#21](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/21) | Bot pour rush les quartiers pas cher | 30/11/2021 | [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#22](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/22) | Refactor de l'implémentation du bot  | 01/12/2021 | [LE BIHAN Léo](https://github.com/LeBihanLeo) |
| [#40](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/40) | Implémentation de la stratégie et de la prédiction | 14/12/2021 |  [KARRAKCHOU Mourad](https://github.com/MouradKarrakchou) |
| [#47](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/47) | Façon intelligente d'uiliser le sort du Voleur | 17/12/2021 |  [KARRAKCHOU Mourad](https://github.com/MouradKarrakchou) |
| [#49](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/19) | Façon intelligente d'uiliser le sort du Magicien | 17/12/2021 | [COLLET Philippe](https://github.com/collet) |
| [#50](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/50) | Façon intelligente d'uiliser le sort du Condottiere | 17/12/2021 [BONNET Kilian](https://github.com/KilianBonnet) |
| [#54](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/40) | Changement de la façon de choisir un personnage | 16/12/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |
| [#54](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/40) | Changement de la façon de choisir un personnage | 16/12/2021 | [IMAMI Ayoub](https://github.com/AyoubIMAMI) |

## La gestion de l’affichage du jeu
L’affichage du jeu permet de véhiculer rapidement les informations essentielles du jeu afin de pouvoir comprendre facilement l’état d’avancement de la partie. Cette implémentation a été en partie réalisée par [Kilian Bonnet](https://github.com/KilianBonnet) | en s’appuyant sur la librairie [JColor](https://github.com/dialex/JColor) conçue par [Diogo Nunes](https://github.com/dialex).

### Issues associés (les noms seront indiqués):
| Isssue  | Description  | Date | Nom |
|---------|--------------|------|-----|
| [#18](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/18) | Couleurs sur les logs | 26/11/2021 | [BONNET Kilian](https://github.com/KilianBonnet) |
| [#38](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/38) | Amélioration des logs | 07/12/2021 | [BONNET Kilian](https://github.com/KilianBonnet)  & [KARRAKCHOU Mourad](https://github.com/MouradKarrakchou) |
| [#45](https://github.com/pns-si3-projects/projet2-ps5-21-22-ps5-21-22-projet2-k/issues/45) | Amélioration de la visibilité des logs | 14/12/2021 | [BONNET Kilian](https://github.com/KilianBonnet) | [LE BIHAN Léo](https://github.com/LeBihanLeo) |


# Fonctionnement de l’équipe

# Avancement du projet