package nju.software.service;

//import nju.software.data.dataobject.Auction;

import nju.software.data.dataobject.SfjdDwwt;

public interface LiAnService {
    /**
     * 立案
     */
    void liAn(SfjdDwwt sfjdDwwt);

    /**
     * 退案
     */
    void tuiAn(SfjdDwwt sfjdDwwt);

    /**
     * 保存
     */
    void save(SfjdDwwt sfjdDwwt);
    /**
     * 删除
     */
   void delete(Integer XLH);
    
    SfjdDwwt queryById(Integer id);
    
}
