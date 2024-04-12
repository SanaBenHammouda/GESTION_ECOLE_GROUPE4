package application.controllers;

import application.models.Classes_View_Model;

public class ClassesController {

    // Method to calculate the average number of students per class
    public double calculateAverageNumberOfStudents(Classes_View_Model[] classes) {
        int totalNumberOfClasses = classes.length;
        int totalNumberOfStudents = 0;
        for (Classes_View_Model classModel : classes) {
            totalNumberOfStudents += classModel.getNbr_etud_classe();
        }
        return (double) totalNumberOfStudents / totalNumberOfClasses;
    }

    // Method to print information about a class
    public void printClassInfo(Classes_View_Model classModel) {
        System.out.println("Class ID: " + classModel.getId_classe());
        System.out.println("Class Name: " + classModel.getClasse_nom());
        System.out.println("Number of Students: " + classModel.getNbr_etud_classe());
    }

    // Method to print the number of students in a class
    public void printNumberOfStudents(Classes_View_Model classModel) {
        System.out.println("Number of Students: " + classModel.getNbr_etud_classe());
    }

}
