// Base class
class MedicalStaff {
    String name;
    String staffID;

    MedicalStaff(String name, String staffID) {
        this.name = name;
        this.staffID = staffID;
    }

    void shiftSchedule() {
        System.out.println(name + " (ID: " + staffID + ") is scheduled for shift.");
    }

    void idCardAccess() {
        System.out.println(name + " (ID: " + staffID + ") has accessed the hospital premises.");
    }

    void processPayroll() {
        System.out.println(name + " (ID: " + staffID + ") payroll processed.");
    }
}

// Doctor subclass
class Doctor extends MedicalStaff {
    Doctor(String name, String staffID) {
        super(name, staffID);
    }

    void diagnose() {
        System.out.println(name + " is diagnosing patients.");
    }

    void prescribeMedicine() {
        System.out.println(name + " is prescribing medicine.");
    }

    void performSurgery() {
        System.out.println(name + " is performing surgery.");
    }
}

// Nurse subclass
class Nurse extends MedicalStaff {
    Nurse(String name, String staffID) {
        super(name, staffID);
    }

    void administerMedicine() {
        System.out.println(name + " is administering medicine.");
    }

    void monitorPatients() {
        System.out.println(name + " is monitoring patients.");
    }

    void assistProcedure() {
        System.out.println(name + " is assisting in procedures.");
    }
}

// Technician subclass
class Technician extends MedicalStaff {
    Technician(String name, String staffID) {
        super(name, staffID);
    }

    void operateEquipment() {
        System.out.println(name + " is operating medical equipment.");
    }

    void runTests() {
        System.out.println(name + " is running tests.");
    }

    void maintainInstruments() {
        System.out.println(name + " is maintaining instruments.");
    }
}

// Administrator subclass
class Administrator extends MedicalStaff {
    Administrator(String name, String staffID) {
        super(name, staffID);
    }

    void scheduleAppointments() {
        System.out.println(name + " is scheduling appointments.");
    }

    void manageRecords() {
        System.out.println(name + " is managing patient records.");
    }
}

// Main program
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Upcasting: storing different staff types as MedicalStaff
        MedicalStaff[] staff = new MedicalStaff[4];

        staff[0] = new Doctor("Dr. Aayati", "D101");
        staff[1] = new Nurse("Nurse Priya", "N202");
        staff[2] = new Technician("Tech Raj", "T303");
        staff[3] = new Administrator("Admin Suresh", "A404");

        System.out.println("🏥 Hospital Staff Operations 🏥\n");

        for (MedicalStaff m : staff) {
            m.shiftSchedule(); // General operation
            m.idCardAccess();
            m.processPayroll();

            // Downcasting to access specialized methods
            if (m instanceof Doctor) {
                Doctor d = (Doctor) m;
                d.diagnose();
                d.prescribeMedicine();
                d.performSurgery();
            } else if (m instanceof Nurse) {
                Nurse n = (Nurse) m;
                n.administerMedicine();
                n.monitorPatients();
                n.assistProcedure();
            } else if (m instanceof Technician) {
                Technician t = (Technician) m;
                t.operateEquipment();
                t.runTests();
                t.maintainInstruments();
            } else if (m instanceof Administrator) {
                Administrator a = (Administrator) m;
                a.scheduleAppointments();
                a.manageRecords();
            }

            System.out.println();
        }
    }
}
