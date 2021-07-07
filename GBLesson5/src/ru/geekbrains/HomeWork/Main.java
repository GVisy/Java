package ru.geekbrains.HomeWork;

public class Main {

    public static void main(String[] args) {
	Employee[] employees={
	        new Employee(
	            "Smirnov Alexei Victorovich",
                "Engineer",
                "SAV@mail.com",
                "+7459-435-23-45",
                80000,
                42),
            new Employee(
                    "Volkov Andrei Stepanovich",
                    "Technician - programmer",
                    "VolAnd@mail.com",
                    "",
                    74000,
                    34),
            new Employee(
                    "Karpuhin Serge Grigorovich",
                    "Manager",
                    "SerGrig@mail.com",
                    "+7925-453-78-97",
                    60000,
                    27),
            new Employee(
                    "Odrinov Alexander Yuryevich",
                    "Director (general director, manager)",
                    "Odrin@mail.com",
                    "+7999-777-55-01",
                    180000,
                    45),
            new Employee(
                    "Romanov Svyatoslav Vladimirovich",
                    "Logistics Director",
                    "RomSV@mail.com",
                    "+7632-897-89-43",
                    120000,
                    53)
    };
        int minAge=40;
        for (Employee employee:employees){
            if (employee.age>minAge){
                employee.printInfo();
                System.out.println();
            }
        }
    }

}
