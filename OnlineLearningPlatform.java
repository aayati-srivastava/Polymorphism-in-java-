// Parent class
class Course {
    String title;
    String instructor;
    String enrollmentDate;

    Course(String title, String instructor, String enrollmentDate) {
        this.title = title;
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
    }

    void displayProgress() {
        System.out.println("Course Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment Date: " + enrollmentDate);
    }
}

// Video course
class VideoCourse extends Course {
    double completionPercentage;
    double watchTime; // in hours

    VideoCourse(String title, String instructor, String enrollmentDate, double completionPercentage, double watchTime) {
        super(title, instructor, enrollmentDate);
        this.completionPercentage = completionPercentage;
        this.watchTime = watchTime;
    }

    @Override
    void displayProgress() {
        System.out.println("\n--- Video Course Progress ---");
        super.displayProgress();
        System.out.println("Completion: " + completionPercentage + "%");
        System.out.println("Watch Time: " + watchTime + " hours");
    }
}

// Interactive course
class InteractiveCourse extends Course {
    double quizScore;
    int projectsCompleted;

    InteractiveCourse(String title, String instructor, String enrollmentDate, double quizScore, int projectsCompleted) {
        super(title, instructor, enrollmentDate);
        this.quizScore = quizScore;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    void displayProgress() {
        System.out.println("\n--- Interactive Course Progress ---");
        super.displayProgress();
        System.out.println("Quiz Score: " + quizScore + "%");
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}

// Reading course
class ReadingCourse extends Course {
    int pagesRead;
    double notesProgress; // percentage

    ReadingCourse(String title, String instructor, String enrollmentDate, int pagesRead, double notesProgress) {
        super(title, instructor, enrollmentDate);
        this.pagesRead = pagesRead;
        this.notesProgress = notesProgress;
    }

    @Override
    void displayProgress() {
        System.out.println("\n--- Reading Course Progress ---");
        super.displayProgress();
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Note-taking Progress: " + notesProgress + "%");
    }
}

// Certification course
class CertificationCourse extends Course {
    int examAttempts;
    boolean certified;

    CertificationCourse(String title, String instructor, String enrollmentDate, int examAttempts, boolean certified) {
        super(title, instructor, enrollmentDate);
        this.examAttempts = examAttempts;
        this.certified = certified;
    }

    @Override
    void displayProgress() {
        System.out.println("\n--- Certification Course Progress ---");
        super.displayProgress();
        System.out.println("Exam Attempts: " + examAttempts);
        System.out.println("Certification Status: " + (certified ? "Certified" : "Not Certified"));
    }
}

// Main class
public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course[] courses = new Course[4];

        courses[0] = new VideoCourse("Java Programming", "Aayati Srivastava", "2025-09-30", 75.0, 12.5);
        courses[1] = new InteractiveCourse("Web Development Bootcamp", "Dr. Sharma", "2025-08-15", 88.5, 3);
        courses[2] = new ReadingCourse("Data Science Fundamentals", "Prof. Mehta", "2025-07-20", 120, 60.0);
        courses[3] = new CertificationCourse("AWS Cloud Practitioner", "John Doe", "2025-06-10", 2, true);

        System.out.println("📚 Online Learning Platform Progress Report 📚\n");

        for (Course course : courses) {
            course.displayProgress(); // Method overriding in action
        }
    }
}
