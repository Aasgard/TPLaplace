# TP Confidentialité Différentielle
### Etudiants : William Le Pévédic - François-Régis Lancien

## Objectifs du TP

* Implémenter le mécanisme de perturbation de Laplace satisfaisant la confidentialité différentielle.
* Mesurer l'erreur introduite par la perturbation

### Mise en oeuvre

Le système consiste à la génération d'un bruit par une variable de Laplace. Cette variable est la transformation d'une variable aléatoire en y applicant une formule.
Le buit ainsi généré sera ajouté à un agrégat de calcul dans le TP (SUM et/ou COUNT), et on obtient une autre valeur.


### Questions du TP

#### Quelle est la sensibilité d'un COUNT ? d'une SUM ?

La sensibilité d'un COUNT est de 1 et la sensibilité d'une SUM est la valeur maximum du tableau de valeurs.

### Test des variables de Laplace générées

Pour tester les variables que l'on génère avec la méthode genNoise(), nous avons généré une grosse quantité de variables de Laplace (ici 1 000 000).
Nous les avons regroupées dans un histogramme par tranche de 10.

![Texte alternatif](http://img4.hostingpics.net/pics/354083LaplaceTest.jpg "texte pour le titre, facultatif")

Sur ces courbes, nous pouvons voir que plus le Laplace est fort, plus les valeurs sont étalées à la base. 
Et plus on revient vers un Laplace faible, plus les valeurs sont groupées et moins de bruit est généré.

Cf : [http://laplace.frlancien.com](http://laplace.frlancien.com "texte pour le titre, facultatif")

### Tableau et courbes

Pour cette question, nous avons utilisé une boucle afin de générer des valeurs bruitées et nous avons fait une moyenne progressive à chaque itération.
On peut constater que plus on avance dans les itérations, plus la moyenne tend vers 0.

![Texte alternatif](http://img4.hostingpics.net/pics/468625LaplaceRatio.jpg "texte pour le titre, facultatif")

Cf : [http://laplace.frlancien.com](http://laplace.frlancien.com "texte pour le titre, facultatif")

### Nombre d'agrégats nécessaires

Nous observons sur le schéma précédent qu'un ratio correct (à 1 +/- 0.1 5 fois d'affilée) se dégage sur le long terme.
Dans l'exemple Java, ce moment intervient au bout de 636 valeurs.

### Finalité du TP

Les questions suivantes consistent à copier cette précédente procédure et l'appliquer à l'agrégat SUM.
