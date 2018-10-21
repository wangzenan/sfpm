package nju.software.data.dao;

import nju.software.data.dataobject.PubSlSxzd;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class SxzdDAO {
    private Configuration configuration = new Configuration().configure();
    private SessionFactory factory = configuration.buildSessionFactory();
    private Session session = null;
    private Transaction transaction = null;

    public SxzdDAO(){configuration = new Configuration().configure();}

    private void init() {
        session = factory.openSession();
        session.beginTransaction();
    }

    private void destroy() {
        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    public PubSlSxzd getMaxZdbhOfSxzdByAjxh(int ajxh){
        init();
        String sql = "FROM PubSlSxzd sxzd WHERE sxzd.ajxh="+ajxh+" and sxzd.zdbh=(SELECT MAX(zdbh) from PubSlSxzd where ajxh="+ajxh+" )";
        System.out.println("查询语句:"+sql);
        Query query=session.createQuery(sql);
        PubSlSxzd maxZdbhSxzd=(PubSlSxzd)query.uniqueResult();
        System.out.println(maxZdbhSxzd);
        if(maxZdbhSxzd!=null){
            destroy();
            return  maxZdbhSxzd;
        }else {
            PubSlSxzd result=new PubSlSxzd();
            //result.getPubSlSxzdPK().setZdbh(0);
            result.setZdbh(0);
            destroy();
            return  result;
        }


    }

    public void insert(PubSlSxzd sxzd) {
        init();
        session.save(sxzd);
        destroy();
    }

    public  void updateSxzd(PubSlSxzd sxzd){
        init();
        session.update(sxzd);
        destroy();
    }
/*
   根据案件序号查找由于司法拍卖产生的审限中断
 */
    public PubSlSxzd getSxzdOfSfpmByAjxh(int ajxh){
        init();
        //String zdyy="sfpm";
        String sql="from PubSlSxzd where ajxh="+ajxh+" and zdyy=:zdyy";
        Query query=session.createQuery(sql);
        query.setParameter("zdyy","sfpm");
        PubSlSxzd sxzd=(PubSlSxzd)query.uniqueResult();
        destroy();
        return sxzd;
    }
}
