package universitéManagment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UniversityManager {
private ArrayList<Student> students;
private ArrayList<Professor> professors;
private ArrayList<Prospect> prospects;
private ArrayList<Staff> staffs;
private Director director;
public UniversityManager() {
    this.students = new ArrayList<>();
    this.professors = new ArrayList<>();
    this.prospects = new ArrayList<>();
    this.staffs = new ArrayList<>();
    this.director = null;
}

//______________________________________________________________________________Ajouter____________________________________________________________________

public void addStudent() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez le nom de l'étudiant : ");
    String name = scanner.nextLine();

    System.out.print("Entrez le prénom de l'étudiant : ");
    String firstName = scanner.nextLine();

    System.out.print("Entrez la date de naissance de l'étudiant (au format jj/mm/aaaa) : ");
    String dateOfBirth = scanner.nextLine();

    System.out.print("Entrez le niveau de l'étudiant : ");
    String level = scanner.nextLine();

    Student student = new Student(name, firstName, dateOfBirth, level);
    this.students.add(student);
    System.out.println("L'étudiant a bien été ajouté.");
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void addProfessor() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez le nom du professeur : ");
    String name = scanner.nextLine();

    System.out.print("Entrez le prénom du professeur : ");
    String firstName = scanner.nextLine();

    System.out.print("Entrez la date de naissance du professeur (au format jj/mm/aaaa) : ");
    String dateOfBirth = scanner.nextLine();

    System.out.print("Entrez la spécialité du professeur : ");
    String specialty = scanner.nextLine();
    
    System.out.print("Entrez le département du rattachement : ");
    String departement = scanner.nextLine();

    Professor professor = new Professor(name, firstName, dateOfBirth, specialty,departement );
    this.professors.add(professor);
    System.out.println("Le professeur a bien été ajouté.");
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void addProspect() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez le nom du prospect : ");
    String name = scanner.nextLine();

    System.out.print("Entrez le prénom du prospect : ");
    String firstName = scanner.nextLine();

    System.out.print("Entrez la date de naissance du prospect (au format jj/mm/aaaa) : ");
    String dateOfBirth = scanner.nextLine();

    System.out.print("Entrez le niveau d'étude du prospect : ");
    String level = scanner.nextLine();

    Prospect prospect = new Prospect(name, firstName, dateOfBirth, level);
    this.prospects.add(prospect);
    System.out.println("Le prospect a bien été ajouté.");
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void addStaff() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez le nom du membre du personnel : ");
    String name = scanner.nextLine();

    System.out.print("Entrez le prénom du membre du personnel : ");
    String firstName = scanner.nextLine();

    System.out.print("Entrez la date de naissance du membre du personnel (au format jj/mm/aaaa) : ");
    String dateOfBirth = scanner.nextLine();

    System.out.print("Entrez le poste occupé par le membre du personnel : ");
    String position = scanner.nextLine();

    Staff staff = new Staff(name, firstName, dateOfBirth, position);
    this.staffs.add(staff);
    System.out.println("Le membre du personnel a bien été ajouté.");
    
    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void addDirector() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le nom du directeur : ");
    String name = scanner.nextLine();

    System.out.print("Entrez le prénom du directeur : ");
    String firstName = scanner.nextLine();

    System.out.print("Entrez la date de naissance du directeur (au format jj/mm/aaaa) : ");
    String dateOfBirth = scanner.nextLine();

    System.out.print("Entrez l'année d'arrivée du directeur : ");
    int yearOfArrival = scanner.nextInt();
    scanner.nextLine(); // to consume the new line character left by nextInt()

    System.out.print("Entrez le salaire du directeur : ");
    double salary = scanner.nextDouble();
    scanner.nextLine(); // to consume the new line character left by nextDouble()

  
    // create the director object with the input data
    Director director = new Director(name, firstName, dateOfBirth, yearOfArrival);

    // add the director to the university

    System.out.println("Le directeur a été ajouté avec succès.");
}


//_____________________________________________________Affichage__________________________________________________________________________________


public void displayStudents() {
    System.out.println("Liste des étudiants : ");
    for (Student student : students) {
        System.out.println(student);
    }
}


public void displayProfessor() {
    System.out.println("Liste des professeurs : ");
    for (Professor professor : professors) {
        System.out.println(professor);
    }
}

public void displayProspect() {
    System.out.println("Liste des prospects : ");
    for (Prospect prospect : prospects) {
        System.out.println(prospect);
    }
}

public void displayStaff() {
    System.out.println("Liste des membres du personnel : ");
    for (Staff staff : staffs) {
        System.out.println(staff);
    }
}

public void displayDirector() {
    System.out.println("Liste des directeurs : ");
    if (director != null) {
        System.out.println(director);
    } else {
        System.out.println("Aucun directeur n'a été nommé.");
    }
}

//__________________________________________________________________________Stockage_____________________________________________________________________________

public void saveData() {
    try {
        FileOutputStream fileOutputStream = new FileOutputStream("universityData.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.writeObject(professors);
        objectOutputStream.writeObject(prospects);
        objectOutputStream.writeObject(staffs);
        objectOutputStream.writeObject(director);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Les données de l'université ont été sauvegardées dans le fichier universityData.ser");
    } catch (IOException e) {
        System.out.println("Erreur lors de la sauvegarde des données de l'université.");
        e.printStackTrace();
    }}}

