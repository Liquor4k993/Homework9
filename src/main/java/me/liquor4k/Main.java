package me.liquor4k;

// Задача 1
public class Main {
    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        // Задача 2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);
        // Задача 3
        fullName = "Семёнов Семён Семёнович";
        String correctedFullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);

    }
}