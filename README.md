
# Java Avancé

Exercice de Java Avancé réalisé par :
[@Lucas Gégot](https://github.com/Lucasgeg)

![Logo](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.20t2tC-JLlTwyJ9-utQLKAAAAA%26pid%3DApi&f=1&ipt=2c720c4a3ed0c7e4e82e29a4dc7225a9519b315e5bf882c584c35566b12ce45b&ipo=images)
![Logo](https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.DjEeQ0pw9I4u0x2S0SWGwAHaHa%26pid%3DApi&f=1&ipt=a3e9d03e4e122ed62db0a425fb0e43ab061556e9aa308347aa0ec5fc49c9b1e8&ipo=images)

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/lucas-g%C3%A9got-007b0153/)
[![github](https://img.shields.io/github/followers/Lucasgeg?style=social)](https://github.com/Lucasgeg)
# Documentation:
Java Avancé : Exercice 1

La classe Customer représente un client qui peut acheter des jeux. Chaque client a un nom, un prénom, une adresse, un numéro de téléphone et un solde représentant le montant de jeux acheté. Chaque client peut également acheter un ou plusieurs jeux.

La classe Game est une classe abstraite qui représente un jeu. Elle a deux sous-classes : la classe VideoGame et la classe ArcadeGame. La classe VideoGame est utilisée pour les jeux vidéo, elle a des propriétés telles que le genre, la plate-forme et un indicateur indiquant si le jeu est multijoueur ou non. La classe ArcadeGame est utilisée pour les jeux d'arcade et a des propriétés telles que le nombre de joueurs maximum, le temps de jeu et un indicateur indiquant si le jeu est payant ou non.

La classe Purchase représente un achat de jeu par un client. Chaque achat a un client, un jeu et une quantité. La méthode calculatePurchasePrice calcule le prix total de l'achat en multipliant le prix du jeu par la quantité, elle vérifie aussi si l’utilisateur est VIP et si une réduction s’applique selon le type de jeu. La méthode reduceStock réduit le stock du jeu acheté par la quantité achetée et lève une exception si la quantité demandée dépasse le stock disponible.

Il y a aussi deux énumérations : GameGenre et Platform, utilisées pour spécifier le genre et la plate-forme d'un jeu.

Dans la classe Main, des clients, des jeux et des achats sont créés et manipulés. Le solde des clients est affiché avant et après l'achat, ainsi que le prix total de chaque achat. Les détails des jeux et des clients sont également affichés.

Le projet utilise plusieurs fonctionnalités de la programmation orientée objet, telles que l'héritage, les classes abstraites, les exceptions, les énumérations et les références d'objet.


## Résultat de la class Main :

```
totalPurchase début toto : 1300.0
totalPurchase début tata : 125.0
Erreur : Pas assez d'exemplaire en stock pour : Massive Darkness 2
Harley doit payer pour 3 TitanFall la somme de 179.7
Customer{lastName='Gégot', firstName='Lucas', age=34, address='123 rue du dev', phone='0601352850', totalPurchase=1300.0, game=[Game{title='Massive Darkness 2', releaseYear=2021, price=85.0, description=Optional.empty}], VIP? :true}
Customer{lastName='Quinn', firstName='Harley', age=39, address='123 rue de JavaScript', phone='0636206664', totalPurchase=484.4, game=[], VIP? :false}
Game{title='TitanFall', releaseYear=2016, price=59.9, description=Optional[Un FPS dynamique où vous pouvez appellé un robot géant pour tout dégommer]}
Game{title='Massive Darkness 2', releaseYear=2021, price=85.0, description=Optional.empty}
Trying TitanFall on : XBOX
Trying Massive Darkness 2. Estimated duration: 90
totalPurchase fin toto : 1300.0
totalPurchase fin tata : 484.4
Achat de deux exemplaire et calcul du prix pour Lucas et le jeux Massive Darkness 2
Lucas doit payer pour 2 Massive Darkness 2 la somme de 153.0
Nouveau solde Lucas : 1453.0
```
