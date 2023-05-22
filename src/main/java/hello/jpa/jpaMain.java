package hello.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class jpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        //엔티티 매니저는 쓰레드간에 공유 X (사용하고 버려야 한다)

        EntityTransaction tx = em.getTransaction(); // jpa의 모든 데이터의 변경은 트랜잭션 안에서 실행
        tx.begin();

        try {
            // 영속
            Member member = em.find(Member.class, 20L);


            System.out.println("==================");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
