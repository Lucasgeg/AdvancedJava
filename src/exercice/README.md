
# Java Avancé

exercice de Java Avancé réalisé par :
[@Lucas Gégot](https://github.com/Lucasgeg)

![Logo](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.20t2tC-JLlTwyJ9-utQLKAAAAA%26pid%3DApi&f=1&ipt=2c720c4a3ed0c7e4e82e29a4dc7225a9519b315e5bf882c584c35566b12ce45b&ipo=images)
![Logo](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.DjEeQ0pw9I4u0x2S0SWGwAHaHa%26pid%3DApi&f=1&ipt=a3e9d03e4e122ed62db0a425fb0e43ab061556e9aa308347aa0ec5fc49c9b1e8&ipo=images)

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/lucas-g%C3%A9got-007b0153/)
[![github](https://img.shields.io/github/followers/Lucasgeg?style=social)](https://github.com/Lucasgeg)

## Exercice 2
La méthode convertToRPN prend une chaîne de caractères représentant une expression algébrique et retourne sa forme RPN sous forme de chaîne de caractères.

Nous utilisons une pile pour stocker les opérateurs en attente de traitement.

Nous parcourons chaque caractère de l'expression en cours de traitement et effectuons une action en fonction du type de caractère:

Si c'est une lettre ou un chiffre, nous l'ajoutons simplement à la sortie.

Si c'est une parenthèse ouvrante, nous la poussons sur la pile.

Si c'est une parenthèse fermante, nous défilons la pile et ajoutons les opérateurs à la sortie jusqu'à ce que nous rencontrions la parenthèse ouvrante correspondante.

Sinon, c'est un opérateur, nous défilons la pile et ajoutons les opérateurs à la sortie tant qu'ils ont une priorité supérieure ou égale à l'opérateur en cours, puis nous poussons l'opérateur en cours sur la pile.

Une fois que nous avons parcouru toute l'expression, nous défilons le reste de la pile et ajoutons les opérateurs à la sortie.

La méthode getPrecedence retourne la priorité d'un opérateur donné, où les opérateurs avec une priorité plus élevée ont des nombres plus élevés.

## Exercice 3 :

Pour cet exercice ma méthode à été d'initialiser une List d'integer vide qui contiendra les count, un array de String contenant les données de l'exercice non parsé, et une List de string vide qui contiendra les données parsé.


 ### 1ère étape :
Dans une boucle for, pour chaque élément du tableau unparsedNames:
on parse les données brute avec Normalizer ([@Référence Stack Overflow](https://stackoverflow.com/a/4225698/18401852)) puis avec toLowercase().
Ensuite on les ajoute à la List parsedName.

### 2ème étape :
On compte la Frequence du nom dans le parsedNames ([@Réf StackOverflow](https://stackoverflow.com/a/15062383/18401852)) , puis on ajoute ce compte à la List names.
Pour une sécurité supplémentaire, la données recherchée est elle aussi parse.

### 3ème étape :
On fait un sout de names

## Exercice 4 :

Pour cet ULTIME exercice de java avancé j'ai fait une fonction qui prend en entrée un String[] et un int.

j'initialise une String vide puis je parcours le String[] en vérifiant si chaque String à la même lenght que celle indiqué dans l'entrée de la fonction.

Dans une boucle for, au lieu du classique incrément, j'ai mis un décrément pour inverser le sens de la boucle.

Si je trouve une correspondance, je remplace ma string vide par la nouvelle.

Enfin je quitte la boucle avec le break et retourne la string trouvé.

Je fais ensuite un sout pour indiqué si j'ai trouvé ou non le dernier prénom de la longueur lenght.

