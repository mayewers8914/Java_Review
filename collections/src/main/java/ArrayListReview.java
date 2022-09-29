import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        /*
            Instructions:

                Create an ArrayList
                Add Elements
                Iterate on ArrayList using the ff:
                    - For Loop with get(index)
                    - Iterator

                    *Forward Iteration
                    *Backward Iteration

                For Each loop
                Lambda

                Sorting Element in List

        */

        List<Student> student = new ArrayList();

        student.add(new Student("May", 1));
        student.add(new Student("John", 2));
        student.add(new Student("Phoebe", 3));
        student.add(new Student("Zoe", 4));

        System.out.println(student.size());
        System.out.println(student.get(3));
        System.out.println(student.indexOf(2));

        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }

        for (Student name : student) {
            System.out.println(name);
        }

        //lambda
        System.out.println("lambda");
        student.forEach(
                studentInfo-> System.out.println(student)
        );

        System.out.println("Printing backwards");

        for (int i = student.size() - 1; i >=0; i--) {
            System.out.println(student.get(i));
        }

        int num = 1;

        //iterator
        Iterator iter = student.listIterator();
        while (iter.hasNext()) {
            System.out.println("Iterator " + num);
            System.out.println(iter.next());
            num++;
        }

        System.out.println("Print Backwards");

        while (((ListIterator) iter).hasPrevious()) {
            System.out.println(((ListIterator) iter).previous());
        }

        //sorting
        System.out.println("sorting");

        System.out.println("using comparator to sort");
        Collections.sort(student, new sortById());
        System.out.println(student);

        Collections.sort(student, new sortByName());
        System.out.println(student);

    }

    static class sortById implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

}
