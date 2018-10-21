package nju.software.data.dao;

import nju.software.data.dataobject.PubLcspb;
import nju.software.data.dataobject.PubLctxb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LctxDAO {
    private Configuration configuration = new Configuration().configure();
    private SessionFactory factory = configuration.buildSessionFactory();
    private Session session = null;
    private Transaction transaction = null;

    public LctxDAO() {
        configuration = new Configuration().configure();
    }

    private void init() {
        session = factory.openSession();
        session.beginTransaction();
    }

    private void destroy() {
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    public void insert(PubLctxb lctxb) {
        init();
        String sql = "From PubLcspb where ajxh="+Integer.toString(lctxb.getAjxh());
        Query query = session.createQuery(sql);
        PubLcspb pubLcspb = (PubLcspb)query.uniqueResult();
        lctxb.setLctxbh(pubLcspb.getLctxbh());

        session.save(lctxb);
        destroy();
    }
}
