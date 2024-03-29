import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args){
        Comparator<Student> order = (o1, o2) -> {
            if (o1.getCgpa() == o2.getCgpa()) {
                if (o1.getFname().equals(o2.getFname())) {
                    if (o1.getId() < o2.getId()) {
                        return 1;
                    }
                }

                return o1.getFname().compareTo(o2.getFname());
            }

            return o1.getCgpa() < o2.getCgpa() ? 1 : -1;
        };

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, order);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
