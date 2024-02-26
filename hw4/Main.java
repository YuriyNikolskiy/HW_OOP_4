package hw4;

import controller.TeacherControler;

public class Main {
    public static void main(String[] args) {
        
        System.out.println();


        TeacherControler teacherControler = new TeacherControler();
        teacherControler.create("Tatyana", "Petrovna", "Semenova");
        teacherControler.create("Igor", "Semenovich", "Voronin");
        teacherControler.create("Antonina", "Georgievna", "Somova");
        teacherControler.create("Marat", "Igorevich", "Tanagusov");
        teacherControler.sendOnConsole();
        
        


    }


}