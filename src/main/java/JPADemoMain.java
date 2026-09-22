import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


public class JPADemoMain {
    public static void main(String[] args) {
     EntityManager em = JPAUtill.getEntityManager();

        try{
            UserClassHibernate user=
                    new UserClassHibernate("Musaib SHAKEEL");
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            System.out.println("'user saved: " +user.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            JPAUtill.close();
        }
    }

}
