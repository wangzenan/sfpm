package nju.software.service;

import nju.software.data.dataobject.SfjdDwwt;

import java.util.List;
//import nju.software.data.dataobject.Auction;


public interface MainService {
    List<SfjdDwwt> queryAll();
    void save(SfjdDwwt sfjdDwwt);
    List<SfjdDwwt> search(List<String> select1List,List<String> input2List,List<String> select2List);
}
