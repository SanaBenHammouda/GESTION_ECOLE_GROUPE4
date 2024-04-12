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
<<<<<<< HEAD
        return (double) totalNumberOfStudents / 500;
=======
        //divising by 0 
        return (double) totalNumberOfStudents / 0;

>>>>>>> 34fc09cf7c2fb7c909ce315e414f9ebc17dc8b23
    }
//New comment to Merge
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
    //end

}
