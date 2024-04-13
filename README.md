# GESTION_ECOLE_GROUPE4

# Guide de Projet - Gestion d'École
Ce projet vise à développer une application de gestion d'école en équipe, en utilisant Git pour la gestion de version. Vous allez travailler ensemble pour implémenter les fonctionnalités demandées tout en vous familiarisant avec les commandes Git les plus utilisées.

# Étapes du Projet
Suivez ces étapes pour contribuer au projet:

## 1. Cloner le Répertoire Git
Avant de commencer, clonez le répertoire Git sur votre machine locale pour commencer à travailler.

```bash
git clone <URL_du_répertoire>
```

## 2. Créer une Branche
Créez une branche pour travailler sur une fonctionnalité spécifique ou une partie du projet.

```bash
git checkout -b nom_de_la_branche
```

## 3. Implémenter les Fonctionnalités
Travaillez sur votre branche en implémentant les fonctionnalités assignées.

## 4. Ajouter et Commiter les Changements
Une fois les modifications terminées, ajoutez et committez vos changements.

```bash
git add .
git commit -m "Description des modifications"
```

## 5. Pousser la Branche
Poussez votre branche sur le répertoire distant (GitHub).

```bash
git push origin nom_de_la_branche
```

## 6. Créer une Pull Request
Sur GitHub, créez une pull request pour fusionner votre branche avec la branche principale.

## 7. Attendre les Reviews
Attendez que deux membres de l'équipe approuvent votre pull request avant de la fusionner.

## 8. Fusionner la Pull Request
Une fois que votre pull request a été approuvée, fusionnez-la avec la branche principale.

## 9. Mettre à Jour le Répertoire Local
Mettez à jour votre répertoire local avec les dernières modifications fusionnées.

```bash
git checkout main
git pull origin main
```

## 11. Gestion des Conflits
Si plusieurs membres travaillent sur la même partie du code et que des conflits surviennent lors de la fusion des branches, suivez ces étapes pour les résoudre :

- **Identifier les Conflits :**
  - Lorsque vous fusionnez une branche, Git vous informera des fichiers avec des conflits. Ces fichiers auront des sections de code entourées de balises spéciales (`<<<<<<<`, `=======`, `>>>>>>>`).
![Conflit 1](https://github.com/SanaBenHammouda/GESTION_ECOLE_GROUPE4/assets/133594690/5859934f-521e-42e1-8dcb-b8a4da653040)

- **Ouvrir les Fichiers en Conflit :**
  - Ouvrez chaque fichier en conflit dans un éditeur de code pour examiner les changements et les conflits.
![conflit2](https://github.com/SanaBenHammouda/GESTION_ECOLE_GROUPE4/assets/133594690/36c4241f-59e0-40ef-bd71-66c99b996385)

- **Résoudre les Conflits :**
  - Modifiez manuellement le code en conflit pour intégrer les modifications des différentes branches. Supprimez les balises de conflit et conservez les modifications nécessaires.
    ![conflit3](https://github.com/SanaBenHammouda/GESTION_ECOLE_GROUPE4/assets/133594690/01b01337-587d-4014-927f-94c008795864)
    ![solved](https://github.com/SanaBenHammouda/GESTION_ECOLE_GROUPE4/assets/133594690/22840a4a-2261-4bd2-b74c-d949f1e08233)

- **Ajouter et Commiter les Changements :**
  - Une fois les conflits résolus, ajoutez les fichiers modifiés et committez les changements.
  ```bash
  git add .
  git commit -m "Résolution des conflits"
  ```
- **Finaliser la Fusion :**
  - Continuez la fusion de la branche en conflit en utilisant la commande `git merge --continue`.
- **Pousser les Modifications :**
  - Une fois la fusion terminée, poussez les modifications vers le répertoire distant.
  ```bash
  git push origin nom_de_la_branche
  ```


  # Commandes Git Avancées:
-Dans ce projet, nous utilisons plusieurs commandes Git avancées pour gérer notre workflow de développement de manière efficace. Voici un aperçu de quelques-unes de ces commandes :


- **git reflog/ git log :** Affiche un historique détaillé des mouvements de pointeurs Git dans le dépôt, utile pour récupérer des commits perdus ou pour comprendre les changements récents.

- **git revert:** Annule les modifications apportées par un ou plusieurs commits en créant un nouveau commit d'annulation, préservant ainsi l'historique.

![image](https://github.com/SanaBenHammouda/GESTION_ECOLE_GROUPE4/assets/133594690/f9caba43-a091-424f-9a4e-bb4b64cef2bb)
git revert 4b02f8b

![image](https://github.com/SanaBenHammouda/GESTION_ECOLE_GROUPE4/assets/133594690/36396a7f-8e7c-4af7-9245-326931c17faf)
