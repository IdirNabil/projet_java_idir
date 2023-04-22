package universitéManagment;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UniversityManager universityManager = new UniversityManager();

        while (true) {
            System.out.println("\n------- Menu principal -------");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Ajouter un professeur");
            System.out.println("3. Ajouter un prospect");
            System.out.println("4. Ajouter un personnel");
            System.out.println("5. Ajouter un directeur");
            System.out.println("6. Afficher les informations étudiants");
            System.out.println("7. Afficher les informations professeurs");
            System.out.println("8. Afficher les informations prospects");
            System.out.println("9. Afficher les informations personnel");
            System.out.println("10. Afficher les informations du directeur");
            System.out.println("11. Sauvegarder les données");
            System.out.println("12. Quitter");

            System.out.print("\nEntrez votre choix : ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    universityManager.addStudent();
                    break;
                case "2":
                    universityManager.addProfessor();
                    break;
                case "3":
                    universityManager.addProspect();
                    break;
                case "4":
                    universityManager.addStaff();
                    break;
                case "5":
                    universityManager.addDirector();
                    break;
                case "6":
                    universityManager.displayStudents();
                    break;
                case "7":
                    universityManager.displayProfessor();
                    break;
                case "8":
                    universityManager.displayProspect();
                    break;
                case "9":
                    universityManager.displayStaff();
                    break;
                case "10":
                    universityManager.displayDirector();
                    break;
                case "11":
                    universityManager.saveData();
                    break;
                case "12":
                    System.out.println("Merci d'avoir utilisé notre application !");
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 12.");
            }
        }
    }
}
