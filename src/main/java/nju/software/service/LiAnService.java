package nju.software.service;

//import nju.software.data.dataobject.Auction;

import nju.software.data.dataobject.SfjdDwwt;

public interface LiAnService {
    /**
     * ����
     */
    void liAn(SfjdDwwt sfjdDwwt);

    /**
     * �˰�
     */
    void tuiAn(SfjdDwwt sfjdDwwt);

    /**
     * ����
     */
    void save(SfjdDwwt sfjdDwwt);
    /**
     * ɾ��
     */
   void delete(Integer XLH);
    
    SfjdDwwt queryById(Integer id);
    
}
