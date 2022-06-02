package org.example;

import org.example.model.Course;
import org.example.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");





        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // transactions begins
        entityManager.getTransaction().begin();
        // Create student and course objects and add them to db.

//        Course course = new Course();
//        course.setId(3);
//        course.setName("Art");
//        entityManager.persist(course);         // use persist() method to add to db

//        Student student = new Student();
//        student.setId(15);
//        student.setName("naveeds");
//        student.setRollNo(114);
//        student.setAge(24);


        // Read data from db
//        Course course = entityManager.find(Course.class, 1); // find() to find tuple by id
//        System.out.println(course.getName());

//        entityManager.persist(student);


//         Delete using id
//        Course course = entityManager.find(Course.class, 2);
//        entityManager.remove(course); // remove() after finding the object.

//        Student student = entityManager.find(Student.class, 3);
//        entityManager.remove(student);

//
//        Course english = entityManager.find(Course.class, 1);
//        Course math = entityManager.find(Course.class, 2);
//        Course art = entityManager.find(Course.class, 3);
//
//
//        Student student = new Student();
//        List<Course> courseList = new ArrayList<Course>();
//
//        student.setName("Jerry");
//        student.setAge(31);
//        student.setRollNo(13);
//
//        courseList.add(math);
//        courseList.add(english);
//        student.setCourse(courseList);

//         get list of courses for a particular student.
        Student findStudent = entityManager.find(Student.class, 1);
        List<Course> findCourseList = findStudent.getCourse();
        System.out.println(findStudent);
        System.out.println(findCourseList);


//        Student student1 = new Student();
//        student1.setName("Matt");
//        student1.setAge(22);
//        student1.setRollNo(12);
//        student1.getCourse().add(math);
//        student1.getCourse().add(art);
//
//          entityManager.persist(student);
//        entityManager.persist(student1);

//        // Update student
//        Student student = entityManager.find(Student.class, 1);
//        List<Course> courseList = new ArrayList<>();
//        courseList.add(math);
//        courseList.add(english);
//        courseList.add(art);
//        student.setCourse(courseList);
//
//        entityManager.merge(student);


        // all the operations are performed here.
        entityManager.getTransaction().commit();
        entityManager.close();
        System.exit(0);

    }
}
