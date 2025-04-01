class Department {
    String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void printDepartmentName() {
        System.out.println("Welcome To " + departmentName +" Department");
    }
}

class Section extends Department {
    String sectionName;


    public Section(String departmentName, String sectionName) {
        super(departmentName);
        this.sectionName = sectionName;
    }

    void printSectionName() {
        System.out.println("Section: " + sectionName);
    }
}

class ClassNo extends Section {
    int classNumber;

    public ClassNo(String departmentName, String sectionName, int classNumber) {
        super(departmentName, sectionName);
        this.classNumber = classNumber;
    }

    void printClassNumber() {
        System.out.println("Class No: " + classNumber);
    }
}

public class ClassDepartment {
    public static void main(String[] args) {
        ClassNo class1 = new ClassNo("Computer Science", "Artificial Intelligence", 101);

        class1.printDepartmentName();
        class1.printSectionName();
        class1.printClassNumber();
    }
}
