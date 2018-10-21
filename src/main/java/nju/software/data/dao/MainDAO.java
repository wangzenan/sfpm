package nju.software.data.dao;

import nju.software.data.dataobject.SfjdDwwt;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.ArrayList;
import java.util.List;

public class MainDAO {
    private Configuration configuration = new Configuration().configure();
    private SessionFactory factory = configuration.buildSessionFactory();
    private Session session = null;
    private Transaction transaction = null;

    public MainDAO() {
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
    public List<SfjdDwwt> queryAll(){
        init();
        List<SfjdDwwt> sfjdDwwtList;
        String sql = "From SfjdDwwt ";
        Query query = session.createQuery(sql);
        sfjdDwwtList = query.list();
        destroy();
        return sfjdDwwtList;
    }
    
    public void save(SfjdDwwt sfjdDwwt) {
        init();
        session.update(sfjdDwwt);
        destroy();
    }
/*
   查询功能
   para：查询条件、查询内容、且或
 */
    public List<SfjdDwwt> search(List<String> select1List,List<String> input2List,List<String> select2List){
        init();
        List<SfjdDwwt> sfjdDwwtList;
        String sql = "From SfjdDwwt where 1=1 and ";

        for(int i=0;i<select1List.size();i++){
             String con=null;
             String select1=select1List.get(i);
             String input2=input2List.get(i);
             String select2=select2List.get(i);
             if(i==(select1List.size()-1)){con="";}
             else if(select2.equals("且")){  con="and " ;}
             else if(select2.equals("或")){ con="or ";}


             if(con!=null){
                 String hqlFlag=select1+" like '%"+input2+"%'"+con;
                 sql=sql+hqlFlag;
             }else{
                 String hqlFlag=select1+" like '%"+input2+"%'";
                 sql=sql+hqlFlag;
             }
        }

        //System.out.println(sql);
        Query query = session.createQuery(sql);
        sfjdDwwtList = query.list();
        destroy();
        return sfjdDwwtList;

    }
    

    
}
