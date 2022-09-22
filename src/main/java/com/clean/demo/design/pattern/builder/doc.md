Problématique:

- Construction d'objet étape par étape (beaucoup de paramètre d'initialisation)
- Mauvais construction par injecter les paramètres dans un constructeur

Solution:

Builder pattern:
 - Création d'une interface de build ou décrire les étapes à réalisé sans détail
 - Pour chaque objet à construire il faut une class spécificque de build à l'objet exemple CarBuilder: 
     * Implémenter l'interface
     * Faire les initialisation des parametre propre au builder pour chaque méthode placé
     * Ne pas ajouter de la logique si la méthode ne correspond pas à l'objet à construire
     * Créer une méthode propre au builder pour retourner l'instance réel de lobjet
     * Créer une class director pour construire des objet personalisé à traver les class builder créer selon le besoin
     * Chaque méthode appelle les step spécifique du builder voulue.
     * Un appel à partir du client de la class builder retourne le résultat de l'objet concret
 - En implémentant l interface Builder dans la clas