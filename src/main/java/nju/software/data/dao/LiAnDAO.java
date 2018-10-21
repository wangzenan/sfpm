package nju.software.data.dao;

import nju.software.data.dataobject.SfjdDwwt;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
//import nju.software.data.dataobject.Auction;


public class LiAnDAO {
    private Configuration configuration = new Configuration().configure();
    private SessionFactory factory = configuration.buildSessionFactory();
    private Session session = null;
    private Transaction transaction = null;

    public LiAnDAO() {
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
    
    public void insert(SfjdDwwt sfjdDwwt) {
        init();
        session.save(sfjdDwwt);
        destroy();
    }
    
    public void delete(Integer XLH) {
        init();
        SfjdDwwt sfjdDwwt =(SfjdDwwt)session.get(SfjdDwwt.class, XLH);
        session.delete(sfjdDwwt);
        destroy();
    }
    
    public SfjdDwwt queryById(Integer id) {
        init();
        String sql = "From SfjdDwwt where xlh="+Integer.toString(id);
        Query query = session.createQuery(sql);
        SfjdDwwt sfjdDwwt = (SfjdDwwt)query.uniqueResult();
        destroy();
        return sfjdDwwt;
    }
    
    public void liAn(SfjdDwwt sfjdDwwt) {
        init();
        sfjdDwwt.setXlh(sfjdDwwt.getXlh());
        sfjdDwwt.setSfla("ÊÇ");
        session.update(sfjdDwwt);
        destroy();
    }
    
    public void tuiAn(SfjdDwwt sfjdDwwt) {
        init();
        sfjdDwwt.setXlh(sfjdDwwt.getXlh());
        sfjdDwwt.setSfla("·ñ");
        session.update(sfjdDwwt);
        destroy();
    }
/*
    public int getMaxXlh(){
        init();
        int maxXlh;
        String sql="SELECT MAX(xlh) FROM SfjdDwwt ";
        Query query=session.createQuery(sql);
        destroy();
        Integer XlhInteger=(Integer) query.uniqueResult();
        if(XlhInteger==null){
            maxXlh=0;
            return maxXlh;
        }else {
            maxXlh=XlhInteger.intValue();
            return maxXlh;
        }
        //int maxXlh=XlhInteger.intValue();
    }*/

    public SfjdDwwt getMaxXlhDwwt(){
        init();
        String sql="FROM SfjdDwwt dwwt1 WHERE dwwt1.xlh>=(SELECT MAX(dwwt2.xlh) from SfjdDwwt dwwt2)";
        Query query=session.createQuery(sql);
        SfjdDwwt dwwt=(SfjdDwwt)query.uniqueResult();
        destroy();
        if(dwwt!=null){
            return  dwwt;
        }else {
            SfjdDwwt result=new SfjdDwwt();
            result.setXlh(0);
            return  result;
        }
    }

}
