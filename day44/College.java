class College {

    static final String collegeName = "XYZ Engineering College";
    final double registrationFee;
    static int totalStudents = 0;

    College(double fee) {
        this.registrationFee = fee;
        totalStudents++;
    }

    static void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentFee() {
        System.out.println("Student Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {

        College s1 = new College(25000);
        College s2 = new College(30000);

        displayCollegeDetails();

        s1.displayStudentFee();
        s2.displayStudentFee();
    }
}
