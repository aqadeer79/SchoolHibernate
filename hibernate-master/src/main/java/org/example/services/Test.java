//package org.example.services;
//import org.example.model.Student;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import java.util.List;
//public class StudentService implements EntityManagerInt{
//    @Override
//    public EntityManager entityManagerMethod() {
//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("school");
//        EntityManager em=emf.createEntityManager();
//        return em;
//    }
//
//    public void createStudent(String name, Long age){
//        EntityManager em=entityManagerMethod();
//        Student std=new Student();
//        std.setName(name);
//        std.setAge(age);
//        em.getTransaction().begin();
//        em.persist(std);
//        em.getTransaction().commit();
//    }
//
//    public void createStudent(String name, Long age, List course){
//        EntityManager em=entityManagerMethod();
//        Student std=new Student();
//        std.setName(name);
//        std.setAge(age);
//        std.setCourseList(course);
//        em.getTransaction().begin();
//        em.persist(std);
//        em.getTransaction().commit();
//    }
//
//    public void createStudent(Long id,String name, Long age,List course){
//        EntityManager em=entityManagerMethod();
//        Student std=new Student();
//        std.setId(id);
//        std.setName(name);
//        std.setAge(age);
//        std.setCourseList(course);
//        em.getTransaction().begin();
//        em.persist(std);
//        em.getTransaction().commit();
//    }
//
//    public Student readStudent(String name){
//        EntityManager em=entityManagerMethod();
//        Student std=new Student();
//        Student readStd=em.find(Student.class,name);
//        return readStd;
//    }
//
//    public Student readStudent(Long id){
//        EntityManager em=entityManagerMethod();
//        Student std=new Student();
//        Student readStd=em.find(Student.class,id);
//        return readStd;
//    }
//
//    public List<Student> readStudent(){
//        EntityManager em=entityManagerMethod();
//        return em.createQuery("SELECT a FROM Student a", Student.class).getResultList();
//    }
//
//    public Student updateStudent(Long id, List course){
//        EntityManager em=entityManagerMethod();
//        Student std=em.find(Student.class,id);
//        std.setCourseList(course);
//        em.getTransaction().begin();
//        em.merge(std);
//        em.getTransaction().commit();
//        return std;
//    }
//
//    public Student updateStudent(Long id,Long age,List course){
//        EntityManager em=entityManagerMethod();
//        Student std=em.find(Student.class,id);
//        std.setAge(age);
//        std.setCourseList(course);
//        em.getTransaction().begin();
//        em.merge(std);
//        em.getTransaction().commit();
//        return std;
//    }
//
//    public Student updateStudent(Long id,String name, Long age,List course){
//        EntityManager em=entityManagerMethod();
//        Student std=em.find(Student.class,id);
//        std.setName(name);
//        std.setAge(age);
//        std.setCourseList(course);
//        em.getTransaction().begin();
//        em.merge(std);
//        em.getTransaction().commit();
//        return std;
//    }
//
//    public String deleteStudent(Long id){
//        EntityManager em=entityManagerMethod();
//        em.getTransaction().begin();
//        Student std=em.find(Student.class,id);
//        em.remove(std);
//        em.getTransaction().commit();
//        return std.getName();
//    }
//
//}