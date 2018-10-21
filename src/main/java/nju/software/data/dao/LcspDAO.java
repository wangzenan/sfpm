package nju.software.data.dao;

import nju.software.data.dataobject.PubLcspb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;


public class LcspDAO {
    private Configuration configuration = new Configuration().configure();
    private SessionFactory factory = configuration.buildSessionFactory();
    private Session session = null;
    private Transaction transaction = null;

    public LcspDAO() {
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

    public void updateLCSP(Integer xlh, Date sprq) {
        init();
        PubLcspb pubLcspb = new PubLcspb();
        pubLcspb.setSpbh(this.getMaxSpbh()+1);
        pubLcspb.setFybh(0);
        pubLcspb.setSplx("司法拍卖审限扣除");
        pubLcspb.setSqbh(1);
        pubLcspb.setSpkssj(sprq);
        pubLcspb.setSprbh(0);
        pubLcspb.setSpr("无");
        pubLcspb.setSprlx("无");
        pubLcspb.setSpjg("agree");
        pubLcspb.setJdbh(1);
        pubLcspb.setSfspjs("Y");
        pubLcspb.setSpjssj(sprq);
        pubLcspb.setLctxbh(this.getMaxLctxbh()+1);
        pubLcspb.setSpyj("同意");
        pubLcspb.setAjxh(xlh);
        session.save(pubLcspb);
        destroy();
    }

    private Integer getMaxSpbh() {
        //Integer maxSpbh=0;
        Integer maxSpbh;
        String sql = "select max(publcspb.spbh) from PubLcspb as publcspb";
        maxSpbh = (Integer)session.createQuery(sql).uniqueResult();
        //System.out.println("maxSpbh = "+maxSpbh);
        if(maxSpbh != null) {
            return maxSpbh;
        }else {
            return 0;
        }
    }

    private Integer getMaxLctxbh() {
        //Integer maxLctxbh = 0;
        Integer maxLctxbh;
        String sql = "select max(publcspb.lctxbh) from PubLcspb as publcspb";
        maxLctxbh = (Integer)session.createQuery(sql).uniqueResult();
        if(maxLctxbh != null) {
            return maxLctxbh;
        }else {
            return 0;
        }
    }
}
