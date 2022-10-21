package practiceoct18;

import java.util.Scanner;

class Student {
	
	private int id;
	private String name;
	private int marks[]=new int[10];
	private float average;
	private char grade;
	
	public Student(int id,String name,int[] marks) {
		
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	public float getAverage() {
		return average;
	}


	public void setAverage(float average) {
		this.average = average;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	

	public void calculateAvg() {
		 int totalMarks = 0;

	        for (int mark : marks) {
	            totalMarks=totalMarks+ mark;
	        }

	        average = (float) totalMarks / (float) marks.length;
	    }
public void findGrade() {
	if(average>=80 && average<=100) {
		grade='O';
	}
	else if(average>=50 && average<=80) {
		grade='A';
	
	}
	for (int mark : marks) {
        if (mark < 50) {
            grade = 'F';
        }
    }
}
}	

public class StudentMain {
    public static Student getStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the id:");
        int id = scanner.nextInt();

        System.out.println("Enter the name:");
        String name = scanner.next();

        int subjects = 0;

        while (true) {
            System.out.println("Enter the no of subjects:");
            subjects = scanner.nextInt();

            if (subjects <= 0) {
                System.out.println("Invalid number of subject");
            } else {
                break;
            }
        }

        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; ++i) {
            int mark = 0;

            while (true) {
                System.out.println("Enter mark for subject " + (i + 1) + ":");
                mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid Mark");
                } else {
                    break;
                }
            }

            marks[i] = mark;
        }

        Student student = new Student(id, name, marks);

        return student;
    }

    public static void main(String[] args) {
        Student student = getStudentDetails();
        student.calculateAvg();
        student.findGrade();

        System.out.println("Id:"  + student.getId());
        System.out.println("Name:" + student.getName());
        System.out.println("Average:" + student.getAverage());
        System.out.println("Grade:" + student.getGrade());
    }
}

