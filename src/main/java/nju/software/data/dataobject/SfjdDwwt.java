package nju.software.data.dataobject;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nju.software.util.TransferJsonSerializer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "sfjd_dwwt", schema = "auction2", catalog = "")
public class SfjdDwwt {
    private int xlh;
    private String ay;
    private Integer nd;
    private Integer xh;
    private String jdh;
    private String jdry;
    private String ysbm;
    private String ysr;
    private String dh;
    private String ysajxgajh;
    private Integer ysajxh;
    private String sqfdsrmc;
    private String sqfdsrlxr;
    private String lyfdsrmc;
    private String lyfdsrlxr;
    private String aqzy;
    private String sjcl;
    private String wtsx;
    private BigDecimal sabd;
    private Date jdjzr;
    private Date ysrq;
    private String laspr;
    private Date sprq;
    private Date jbrq;
    private Integer dbqx;
    private Date wtqxzzks;
    private Date wtqxzzjs;
    private Date jdqxzzks;
    private Date jdqxzzjs;
    private Integer ycwtqx;
    private Integer ycjdqx;
    private Date tzxsrq;
    private Date xsrq;
    private Date wtrq;
    private Date jhsrq;
    private Date ckrq;
    private Date jdqdrq;
    private Date xcjgrq;
    private Date zqyjrq;
    private Date jdjsrq;
    private String sfja;
    private String sfzz;
    private Date jarq;
    private String sfgd;
    private Date gdrq;
    private String wtjdjgmc;
    private String xdfs;
    private BigDecimal ysje;
    private String jffmc;
    private BigDecimal zcje;
    private BigDecimal bjje;
    private Date bjrq;
    private BigDecimal thje;
    private String sfjgmc;
    private Date dzrq;
    private Date zcrq;
    private String tjflxz;
    private String tjflzl;
    private String ly;
    private String spyj;
    private String tscx;
    private String fwtd;
    private String yjjdfdsr;
    private String sjbmyj;
    private String jdglbmyj;
    private Date bcclsdrq;
    private Date sjbmrq;
    private Date jdglbmrq;
    private String bz;
    private String ajmc;
    private String wtsxbz;
    private String sfzcjd;
    private Integer wtglgzts;
    private String xbr;
    private String hyzcy;
    private BigDecimal pgpmjz;
    private String wgzy;
    private String wgzyghjg;
    private Integer bcclts;
    private Date ysjahrq;
    private String gdbz;
    private Date hyzspsj;
    private String bdwlb;
    private Date pgbgyxqjzr;
    private Date pgbgyxq;
    private String sfsfjd;
    private String wtlx;
    private String sfcx;
    private String bcxyy;
    private String ishistory;
    private String ajxz;
    private BigDecimal cjj;
    private String jdhpmjg;
    private String sfla;



    @Id
    @Column(name = "XLH")
    public int getXlh() {
        return xlh;
    }

    public void setXlh(int xlh) {
        this.xlh = xlh;
    }

    @Basic
    @Column(name = "AY")
    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay;
    }

    @Basic
    @Column(name = "ND")
    public Integer getNd() {
        return nd;
    }

    public void setNd(Integer nd) {
        this.nd = nd;
    }

    @Basic
    @Column(name = "XH")
    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    @Basic
    @Column(name = "JDH")
    public String getJdh() {
        return jdh;
    }

    public void setJdh(String jdh) {
        this.jdh = jdh;
    }

    @Basic
    @Column(name = "JDRY")
    public String getJdry() {
        return jdry;
    }

    public void setJdry(String jdry) {
        this.jdry = jdry;
    }

    @Basic
    @Column(name = "YSBM")
    public String getYsbm() {
        return ysbm;
    }

    public void setYsbm(String ysbm) {
        this.ysbm = ysbm;
    }

    @Basic
    @Column(name = "YSR")
    public String getYsr() {
        return ysr;
    }

    public void setYsr(String ysr) {
        this.ysr = ysr;
    }

    @Basic
    @Column(name = "DH")
    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    @Basic
    @Column(name = "YSAJXGAJH")
    public String getYsajxgajh() {
        return ysajxgajh;
    }

    public void setYsajxgajh(String ysajxgajh) {
        this.ysajxgajh = ysajxgajh;
    }

    @Basic
    @Column(name = "YSAJXH")
    public Integer getYsajxh() {
        return ysajxh;
    }

    public void setYsajxh(Integer ysajxh) {
        this.ysajxh = ysajxh;
    }

    @Basic
    @Column(name = "SQFDSRMC")
    public String getSqfdsrmc() {
        return sqfdsrmc;
    }

    public void setSqfdsrmc(String sqfdsrmc) {
        this.sqfdsrmc = sqfdsrmc;
    }

    @Basic
    @Column(name = "SQFDSRLXR")
    public String getSqfdsrlxr() {
        return sqfdsrlxr;
    }

    public void setSqfdsrlxr(String sqfdsrlxr) {
        this.sqfdsrlxr = sqfdsrlxr;
    }

    @Basic
    @Column(name = "LYFDSRMC")
    public String getLyfdsrmc() {
        return lyfdsrmc;
    }

    public void setLyfdsrmc(String lyfdsrmc) {
        this.lyfdsrmc = lyfdsrmc;
    }

    @Basic
    @Column(name = "LYFDSRLXR")
    public String getLyfdsrlxr() {
        return lyfdsrlxr;
    }

    public void setLyfdsrlxr(String lyfdsrlxr) {
        this.lyfdsrlxr = lyfdsrlxr;
    }

    @Basic
    @Column(name = "AQZY")
    public String getAqzy() {
        return aqzy;
    }

    public void setAqzy(String aqzy) {
        this.aqzy = aqzy;
    }

    @Basic
    @Column(name = "SJCL")
    public String getSjcl() {
        return sjcl;
    }

    public void setSjcl(String sjcl) {
        this.sjcl = sjcl;
    }

    @Basic
    @Column(name = "WTSX")
    public String getWtsx() {
        return wtsx;
    }

    public void setWtsx(String wtsx) {
        this.wtsx = wtsx;
    }

    @Basic
    @Column(name = "SABD")
    public BigDecimal getSabd() {
        return sabd;
    }

    public void setSabd(BigDecimal sabd) {
        this.sabd = sabd;
    }

    @Basic
    @Column(name = "JDJZR")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJdjzr() {
        return jdjzr;
    }

    public void setJdjzr(Date jdjzr) {
        this.jdjzr = jdjzr;
    }

    @Basic
    @Column(name = "YSRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getYsrq() {
        return ysrq;
    }

    public void setYsrq(Date ysrq) {
        this.ysrq = ysrq;
    }

    @Basic
    @Column(name = "LASPR")
    public String getLaspr() {
        return laspr;
    }

    public void setLaspr(String laspr) {
        this.laspr = laspr;
    }

    @Basic
    @Column(name = "SPRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getSprq() {
        return sprq;
    }

    public void setSprq(Date sprq) {
        this.sprq = sprq;
    }

    @Basic
    @Column(name = "JBRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJbrq() {
        return jbrq;
    }

    public void setJbrq(Date jbrq) {
        this.jbrq = jbrq;
    }

    @Basic
    @Column(name = "DBQX")
    public Integer getDbqx() {
        return dbqx;
    }

    public void setDbqx(Integer dbqx) {
        this.dbqx = dbqx;
    }

    @Basic
    @Column(name = "WTQXZZKS")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getWtqxzzks() {
        return wtqxzzks;
    }

    public void setWtqxzzks(Date wtqxzzks) {
        this.wtqxzzks = wtqxzzks;
    }

    @Basic
    @Column(name = "WTQXZZJS")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getWtqxzzjs() {
        return wtqxzzjs;
    }

    public void setWtqxzzjs(Date wtqxzzjs) {
        this.wtqxzzjs = wtqxzzjs;
    }

    @Basic
    @Column(name = "JDQXZZKS")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJdqxzzks() {
        return jdqxzzks;
    }

    public void setJdqxzzks(Date jdqxzzks) {
        this.jdqxzzks = jdqxzzks;
    }

    @Basic
    @Column(name = "JDQXZZJS")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJdqxzzjs() {
        return jdqxzzjs;
    }

    public void setJdqxzzjs(Date jdqxzzjs) {
        this.jdqxzzjs = jdqxzzjs;
    }

    @Basic
    @Column(name = "YCWTQX")
    public Integer getYcwtqx() {
        return ycwtqx;
    }

    public void setYcwtqx(Integer ycwtqx) {
        this.ycwtqx = ycwtqx;
    }

    @Basic
    @Column(name = "YCJDQX")
    public Integer getYcjdqx() {
        return ycjdqx;
    }

    public void setYcjdqx(Integer ycjdqx) {
        this.ycjdqx = ycjdqx;
    }

    @Basic
    @Column(name = "TZXSRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getTzxsrq() {
        return tzxsrq;
    }

    public void setTzxsrq(Date tzxsrq) {
        this.tzxsrq = tzxsrq;
    }

    @Basic
    @Column(name = "XSRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getXsrq() {
        return xsrq;
    }

    public void setXsrq(Date xsrq) {
        this.xsrq = xsrq;
    }

    @Basic
    @Column(name = "WTRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getWtrq() {
        return wtrq;
    }

    public void setWtrq(Date wtrq) {
        this.wtrq = wtrq;
    }

    @Basic
    @Column(name = "JHSRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJhsrq() {
        return jhsrq;
    }

    public void setJhsrq(Date jhsrq) {
        this.jhsrq = jhsrq;
    }

    @Basic
    @Column(name = "CKRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getCkrq() {
        return ckrq;
    }

    public void setCkrq(Date ckrq) {
        this.ckrq = ckrq;
    }

    @Basic
    @Column(name = "JDQDRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJdqdrq() {
        return jdqdrq;
    }

    public void setJdqdrq(Date jdqdrq) {
        this.jdqdrq = jdqdrq;
    }

    @Basic
    @Column(name = "XCJGRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getXcjgrq() {
        return xcjgrq;
    }

    public void setXcjgrq(Date xcjgrq) {
        this.xcjgrq = xcjgrq;
    }

    @Basic
    @Column(name = "ZQYJRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getZqyjrq() {
        return zqyjrq;
    }

    public void setZqyjrq(Date zqyjrq) {
        this.zqyjrq = zqyjrq;
    }

    @Basic
    @Column(name = "JDJSRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJdjsrq() {
        return jdjsrq;
    }

    public void setJdjsrq(Date jdjsrq) {
        this.jdjsrq = jdjsrq;
    }

    @Basic
    @Column(name = "SFJA")

    public String getSfja() {
        return sfja;
    }

    public void setSfja(String sfja) {
        this.sfja = sfja;
    }

    @Basic
    @Column(name = "SFZZ")
    public String getSfzz() {
        return sfzz;
    }

    public void setSfzz(String sfzz) {
        this.sfzz = sfzz;
    }

    @Basic
    @Column(name = "JARQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJarq() {
        return jarq;
    }

    public void setJarq(Date jarq) {
        this.jarq = jarq;
    }

    @Basic
    @Column(name = "SFGD")
    public String getSfgd() {
        return sfgd;
    }

    public void setSfgd(String sfgd) {
        this.sfgd = sfgd;
    }

    @Basic
    @Column(name = "GDRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getGdrq() {
        return gdrq;
    }

    public void setGdrq(Date gdrq) {
        this.gdrq = gdrq;
    }

    @Basic
    @Column(name = "WTJDJGMC")
    public String getWtjdjgmc() {
        return wtjdjgmc;
    }

    public void setWtjdjgmc(String wtjdjgmc) {
        this.wtjdjgmc = wtjdjgmc;
    }

    @Basic
    @Column(name = "XDFS")
    public String getXdfs() {
        return xdfs;
    }

    public void setXdfs(String xdfs) {
        this.xdfs = xdfs;
    }

    @Basic
    @Column(name = "YSJE")
    public BigDecimal getYsje() {
        return ysje;
    }

    public void setYsje(BigDecimal ysje) {
        this.ysje = ysje;
    }

    @Basic
    @Column(name = "JFFMC")
    public String getJffmc() {
        return jffmc;
    }

    public void setJffmc(String jffmc) {
        this.jffmc = jffmc;
    }

    @Basic
    @Column(name = "ZCJE")
    public BigDecimal getZcje() {
        return zcje;
    }

    public void setZcje(BigDecimal zcje) {
        this.zcje = zcje;
    }

    @Basic
    @Column(name = "BJJE")
    public BigDecimal getBjje() {
        return bjje;
    }

    public void setBjje(BigDecimal bjje) {
        this.bjje = bjje;
    }

    @Basic
    @Column(name = "BJRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getBjrq() {
        return bjrq;
    }

    public void setBjrq(Date bjrq) {
        this.bjrq = bjrq;
    }

    @Basic
    @Column(name = "THJE")
    public BigDecimal getThje() {
        return thje;
    }

    public void setThje(BigDecimal thje) {
        this.thje = thje;
    }

    @Basic
    @Column(name = "SFJGMC")
    public String getSfjgmc() {
        return sfjgmc;
    }

    public void setSfjgmc(String sfjgmc) {
        this.sfjgmc = sfjgmc;
    }

    @Basic
    @Column(name = "DZRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getDzrq() {
        return dzrq;
    }

    public void setDzrq(Date dzrq) {
        this.dzrq = dzrq;
    }

    @Basic
    @Column(name = "ZCRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getZcrq() {
        return zcrq;
    }

    public void setZcrq(Date zcrq) {
        this.zcrq = zcrq;
    }

    @Basic
    @Column(name = "TJFLXZ")
    public String getTjflxz() {
        return tjflxz;
    }

    public void setTjflxz(String tjflxz) {
        this.tjflxz = tjflxz;
    }

    @Basic
    @Column(name = "TJFLZL")
    public String getTjflzl() {
        return tjflzl;
    }

    public void setTjflzl(String tjflzl) {
        this.tjflzl = tjflzl;
    }

    @Basic
    @Column(name = "LY")
    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly;
    }

    @Basic
    @Column(name = "SPYJ")
    public String getSpyj() {
        return spyj;
    }

    public void setSpyj(String spyj) {
        this.spyj = spyj;
    }

    @Basic
    @Column(name = "TSCX")
    public String getTscx() {
        return tscx;
    }

    public void setTscx(String tscx) {
        this.tscx = tscx;
    }

    @Basic
    @Column(name = "FWTD")
    public String getFwtd() {
        return fwtd;
    }

    public void setFwtd(String fwtd) {
        this.fwtd = fwtd;
    }

    @Basic
    @Column(name = "YJJDFDSR")
    public String getYjjdfdsr() {
        return yjjdfdsr;
    }

    public void setYjjdfdsr(String yjjdfdsr) {
        this.yjjdfdsr = yjjdfdsr;
    }

    @Basic
    @Column(name = "SJBMYJ")
    public String getSjbmyj() {
        return sjbmyj;
    }

    public void setSjbmyj(String sjbmyj) {
        this.sjbmyj = sjbmyj;
    }

    @Basic
    @Column(name = "JDGLBMYJ")
    public String getJdglbmyj() {
        return jdglbmyj;
    }

    public void setJdglbmyj(String jdglbmyj) {
        this.jdglbmyj = jdglbmyj;
    }

    @Basic
    @Column(name = "BCCLSDRQ")
    public Date getBcclsdrq() {
        return bcclsdrq;
    }

    public void setBcclsdrq(Date bcclsdrq) {
        this.bcclsdrq = bcclsdrq;
    }

    @Basic
    @Column(name = "SJBMRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getSjbmrq() {
        return sjbmrq;
    }

    public void setSjbmrq(Date sjbmrq) {
        this.sjbmrq = sjbmrq;
    }

    @Basic
    @Column(name = "JDGLBMRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJdglbmrq() {
        return jdglbmrq;
    }

    public void setJdglbmrq(Date jdglbmrq) {
        this.jdglbmrq = jdglbmrq;
    }

    @Basic
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "AJMC")
    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    @Basic
    @Column(name = "WTSXBZ")
    public String getWtsxbz() {
        return wtsxbz;
    }

    public void setWtsxbz(String wtsxbz) {
        this.wtsxbz = wtsxbz;
    }

    @Basic
    @Column(name = "SFZCJD")
    public String getSfzcjd() {
        return sfzcjd;
    }

    public void setSfzcjd(String sfzcjd) {
        this.sfzcjd = sfzcjd;
    }

    @Basic
    @Column(name = "WTGLGZTS")
    public Integer getWtglgzts() {
        return wtglgzts;
    }

    public void setWtglgzts(Integer wtglgzts) {
        this.wtglgzts = wtglgzts;
    }

    @Basic
    @Column(name = "XBR")
    public String getXbr() {
        return xbr;
    }

    public void setXbr(String xbr) {
        this.xbr = xbr;
    }

    @Basic
    @Column(name = "HYZCY")
    public String getHyzcy() {
        return hyzcy;
    }

    public void setHyzcy(String hyzcy) {
        this.hyzcy = hyzcy;
    }

    @Basic
    @Column(name = "PGPMJZ")
    public BigDecimal getPgpmjz() {
        return pgpmjz;
    }

    public void setPgpmjz(BigDecimal pgpmjz) {
        this.pgpmjz = pgpmjz;
    }

    @Basic
    @Column(name = "WGZY")
    public String getWgzy() {
        return wgzy;
    }

    public void setWgzy(String wgzy) {
        this.wgzy = wgzy;
    }

    @Basic
    @Column(name = "WGZYGHJG")
    public String getWgzyghjg() {
        return wgzyghjg;
    }

    public void setWgzyghjg(String wgzyghjg) {
        this.wgzyghjg = wgzyghjg;
    }

    @Basic
    @Column(name = "BCCLTS")
    public Integer getBcclts() {
        return bcclts;
    }

    public void setBcclts(Integer bcclts) {
        this.bcclts = bcclts;
    }

    @Basic
    @Column(name = "YSJAHRQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getYsjahrq() {
        return ysjahrq;
    }

    public void setYsjahrq(Date ysjahrq) {
        this.ysjahrq = ysjahrq;
    }

    @Basic
    @Column(name = "GDBZ")
    public String getGdbz() {
        return gdbz;
    }

    public void setGdbz(String gdbz) {
        this.gdbz = gdbz;
    }

    @Basic
    @Column(name = "HYZSPSJ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getHyzspsj() {
        return hyzspsj;
    }

    public void setHyzspsj(Date hyzspsj) {
        this.hyzspsj = hyzspsj;
    }

    @Basic
    @Column(name = "BDWLB")
    public String getBdwlb() {
        return bdwlb;
    }

    public void setBdwlb(String bdwlb) {
        this.bdwlb = bdwlb;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "PGBGYXQJZR")
    public Date getPgbgyxqjzr() {
        return pgbgyxqjzr;
    }

    public void setPgbgyxqjzr(Date pgbgyxqjzr) {
        this.pgbgyxqjzr = pgbgyxqjzr;
    }

    @Basic
    @Column(name = "PGBGYXQ")
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getPgbgyxq() {
        return pgbgyxq;
    }

    public void setPgbgyxq(Date pgbgyxq) {
        this.pgbgyxq = pgbgyxq;
    }

    @Basic
    @Column(name = "SFSFJD")
    public String getSfsfjd() {
        return sfsfjd;
    }

    public void setSfsfjd(String sfsfjd) {
        this.sfsfjd = sfsfjd;
    }

    @Basic
    @Column(name = "WTLX")
    public String getWtlx() {
        return wtlx;
    }

    public void setWtlx(String wtlx) {
        this.wtlx = wtlx;
    }

    @Basic
    @Column(name = "SFCX")
    public String getSfcx() {
        return sfcx;
    }

    public void setSfcx(String sfcx) {
        this.sfcx = sfcx;
    }

    @Basic
    @Column(name = "BCXYY")
    public String getBcxyy() {
        return bcxyy;
    }

    public void setBcxyy(String bcxyy) {
        this.bcxyy = bcxyy;
    }

    @Basic
    @Column(name = "ISHISTORY")
    public String getIshistory() {
        return ishistory;
    }

    public void setIshistory(String ishistory) {
        this.ishistory = ishistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfjdDwwt sfjdDwwt = (SfjdDwwt) o;

        if (xlh != sfjdDwwt.xlh) return false;
        if (ay != null ? !ay.equals(sfjdDwwt.ay) : sfjdDwwt.ay != null) return false;
        if (nd != null ? !nd.equals(sfjdDwwt.nd) : sfjdDwwt.nd != null) return false;
        if (xh != null ? !xh.equals(sfjdDwwt.xh) : sfjdDwwt.xh != null) return false;
        if (jdh != null ? !jdh.equals(sfjdDwwt.jdh) : sfjdDwwt.jdh != null) return false;
        if (jdry != null ? !jdry.equals(sfjdDwwt.jdry) : sfjdDwwt.jdry != null) return false;
        if (ysbm != null ? !ysbm.equals(sfjdDwwt.ysbm) : sfjdDwwt.ysbm != null) return false;
        if (ysr != null ? !ysr.equals(sfjdDwwt.ysr) : sfjdDwwt.ysr != null) return false;
        if (dh != null ? !dh.equals(sfjdDwwt.dh) : sfjdDwwt.dh != null) return false;
        if (ysajxgajh != null ? !ysajxgajh.equals(sfjdDwwt.ysajxgajh) : sfjdDwwt.ysajxgajh != null) return false;
        if (ysajxh != null ? !ysajxh.equals(sfjdDwwt.ysajxh) : sfjdDwwt.ysajxh != null) return false;
        if (sqfdsrmc != null ? !sqfdsrmc.equals(sfjdDwwt.sqfdsrmc) : sfjdDwwt.sqfdsrmc != null) return false;
        if (sqfdsrlxr != null ? !sqfdsrlxr.equals(sfjdDwwt.sqfdsrlxr) : sfjdDwwt.sqfdsrlxr != null) return false;
        if (lyfdsrmc != null ? !lyfdsrmc.equals(sfjdDwwt.lyfdsrmc) : sfjdDwwt.lyfdsrmc != null) return false;
        if (lyfdsrlxr != null ? !lyfdsrlxr.equals(sfjdDwwt.lyfdsrlxr) : sfjdDwwt.lyfdsrlxr != null) return false;
        if (aqzy != null ? !aqzy.equals(sfjdDwwt.aqzy) : sfjdDwwt.aqzy != null) return false;
        if (sjcl != null ? !sjcl.equals(sfjdDwwt.sjcl) : sfjdDwwt.sjcl != null) return false;
        if (wtsx != null ? !wtsx.equals(sfjdDwwt.wtsx) : sfjdDwwt.wtsx != null) return false;
        if (sabd != null ? !sabd.equals(sfjdDwwt.sabd) : sfjdDwwt.sabd != null) return false;
        if (jdjzr != null ? !jdjzr.equals(sfjdDwwt.jdjzr) : sfjdDwwt.jdjzr != null) return false;
        if (ysrq != null ? !ysrq.equals(sfjdDwwt.ysrq) : sfjdDwwt.ysrq != null) return false;
        if (laspr != null ? !laspr.equals(sfjdDwwt.laspr) : sfjdDwwt.laspr != null) return false;
        if (sprq != null ? !sprq.equals(sfjdDwwt.sprq) : sfjdDwwt.sprq != null) return false;
        if (jbrq != null ? !jbrq.equals(sfjdDwwt.jbrq) : sfjdDwwt.jbrq != null) return false;
        if (dbqx != null ? !dbqx.equals(sfjdDwwt.dbqx) : sfjdDwwt.dbqx != null) return false;
        if (wtqxzzks != null ? !wtqxzzks.equals(sfjdDwwt.wtqxzzks) : sfjdDwwt.wtqxzzks != null) return false;
        if (wtqxzzjs != null ? !wtqxzzjs.equals(sfjdDwwt.wtqxzzjs) : sfjdDwwt.wtqxzzjs != null) return false;
        if (jdqxzzks != null ? !jdqxzzks.equals(sfjdDwwt.jdqxzzks) : sfjdDwwt.jdqxzzks != null) return false;
        if (jdqxzzjs != null ? !jdqxzzjs.equals(sfjdDwwt.jdqxzzjs) : sfjdDwwt.jdqxzzjs != null) return false;
        if (ycwtqx != null ? !ycwtqx.equals(sfjdDwwt.ycwtqx) : sfjdDwwt.ycwtqx != null) return false;
        if (ycjdqx != null ? !ycjdqx.equals(sfjdDwwt.ycjdqx) : sfjdDwwt.ycjdqx != null) return false;
        if (tzxsrq != null ? !tzxsrq.equals(sfjdDwwt.tzxsrq) : sfjdDwwt.tzxsrq != null) return false;
        if (xsrq != null ? !xsrq.equals(sfjdDwwt.xsrq) : sfjdDwwt.xsrq != null) return false;
        if (wtrq != null ? !wtrq.equals(sfjdDwwt.wtrq) : sfjdDwwt.wtrq != null) return false;
        if (jhsrq != null ? !jhsrq.equals(sfjdDwwt.jhsrq) : sfjdDwwt.jhsrq != null) return false;
        if (ckrq != null ? !ckrq.equals(sfjdDwwt.ckrq) : sfjdDwwt.ckrq != null) return false;
        if (jdqdrq != null ? !jdqdrq.equals(sfjdDwwt.jdqdrq) : sfjdDwwt.jdqdrq != null) return false;
        if (xcjgrq != null ? !xcjgrq.equals(sfjdDwwt.xcjgrq) : sfjdDwwt.xcjgrq != null) return false;
        if (zqyjrq != null ? !zqyjrq.equals(sfjdDwwt.zqyjrq) : sfjdDwwt.zqyjrq != null) return false;
        if (jdjsrq != null ? !jdjsrq.equals(sfjdDwwt.jdjsrq) : sfjdDwwt.jdjsrq != null) return false;
        if (sfja != null ? !sfja.equals(sfjdDwwt.sfja) : sfjdDwwt.sfja != null) return false;
        if (sfzz != null ? !sfzz.equals(sfjdDwwt.sfzz) : sfjdDwwt.sfzz != null) return false;
        if (jarq != null ? !jarq.equals(sfjdDwwt.jarq) : sfjdDwwt.jarq != null) return false;
        if (sfgd != null ? !sfgd.equals(sfjdDwwt.sfgd) : sfjdDwwt.sfgd != null) return false;
        if (gdrq != null ? !gdrq.equals(sfjdDwwt.gdrq) : sfjdDwwt.gdrq != null) return false;
        if (wtjdjgmc != null ? !wtjdjgmc.equals(sfjdDwwt.wtjdjgmc) : sfjdDwwt.wtjdjgmc != null) return false;
        if (xdfs != null ? !xdfs.equals(sfjdDwwt.xdfs) : sfjdDwwt.xdfs != null) return false;
        if (ysje != null ? !ysje.equals(sfjdDwwt.ysje) : sfjdDwwt.ysje != null) return false;
        if (jffmc != null ? !jffmc.equals(sfjdDwwt.jffmc) : sfjdDwwt.jffmc != null) return false;
        if (zcje != null ? !zcje.equals(sfjdDwwt.zcje) : sfjdDwwt.zcje != null) return false;
        if (bjje != null ? !bjje.equals(sfjdDwwt.bjje) : sfjdDwwt.bjje != null) return false;
        if (bjrq != null ? !bjrq.equals(sfjdDwwt.bjrq) : sfjdDwwt.bjrq != null) return false;
        if (thje != null ? !thje.equals(sfjdDwwt.thje) : sfjdDwwt.thje != null) return false;
        if (sfjgmc != null ? !sfjgmc.equals(sfjdDwwt.sfjgmc) : sfjdDwwt.sfjgmc != null) return false;
        if (dzrq != null ? !dzrq.equals(sfjdDwwt.dzrq) : sfjdDwwt.dzrq != null) return false;
        if (zcrq != null ? !zcrq.equals(sfjdDwwt.zcrq) : sfjdDwwt.zcrq != null) return false;
        if (tjflxz != null ? !tjflxz.equals(sfjdDwwt.tjflxz) : sfjdDwwt.tjflxz != null) return false;
        if (tjflzl != null ? !tjflzl.equals(sfjdDwwt.tjflzl) : sfjdDwwt.tjflzl != null) return false;
        if (ly != null ? !ly.equals(sfjdDwwt.ly) : sfjdDwwt.ly != null) return false;
        if (spyj != null ? !spyj.equals(sfjdDwwt.spyj) : sfjdDwwt.spyj != null) return false;
        if (tscx != null ? !tscx.equals(sfjdDwwt.tscx) : sfjdDwwt.tscx != null) return false;
        if (fwtd != null ? !fwtd.equals(sfjdDwwt.fwtd) : sfjdDwwt.fwtd != null) return false;
        if (yjjdfdsr != null ? !yjjdfdsr.equals(sfjdDwwt.yjjdfdsr) : sfjdDwwt.yjjdfdsr != null) return false;
        if (sjbmyj != null ? !sjbmyj.equals(sfjdDwwt.sjbmyj) : sfjdDwwt.sjbmyj != null) return false;
        if (jdglbmyj != null ? !jdglbmyj.equals(sfjdDwwt.jdglbmyj) : sfjdDwwt.jdglbmyj != null) return false;
        if (bcclsdrq != null ? !bcclsdrq.equals(sfjdDwwt.bcclsdrq) : sfjdDwwt.bcclsdrq != null) return false;
        if (sjbmrq != null ? !sjbmrq.equals(sfjdDwwt.sjbmrq) : sfjdDwwt.sjbmrq != null) return false;
        if (jdglbmrq != null ? !jdglbmrq.equals(sfjdDwwt.jdglbmrq) : sfjdDwwt.jdglbmrq != null) return false;
        if (bz != null ? !bz.equals(sfjdDwwt.bz) : sfjdDwwt.bz != null) return false;
        if (ajmc != null ? !ajmc.equals(sfjdDwwt.ajmc) : sfjdDwwt.ajmc != null) return false;
        if (wtsxbz != null ? !wtsxbz.equals(sfjdDwwt.wtsxbz) : sfjdDwwt.wtsxbz != null) return false;
        if (sfzcjd != null ? !sfzcjd.equals(sfjdDwwt.sfzcjd) : sfjdDwwt.sfzcjd != null) return false;
        if (wtglgzts != null ? !wtglgzts.equals(sfjdDwwt.wtglgzts) : sfjdDwwt.wtglgzts != null) return false;
        if (xbr != null ? !xbr.equals(sfjdDwwt.xbr) : sfjdDwwt.xbr != null) return false;
        if (hyzcy != null ? !hyzcy.equals(sfjdDwwt.hyzcy) : sfjdDwwt.hyzcy != null) return false;
        if (pgpmjz != null ? !pgpmjz.equals(sfjdDwwt.pgpmjz) : sfjdDwwt.pgpmjz != null) return false;
        if (wgzy != null ? !wgzy.equals(sfjdDwwt.wgzy) : sfjdDwwt.wgzy != null) return false;
        if (wgzyghjg != null ? !wgzyghjg.equals(sfjdDwwt.wgzyghjg) : sfjdDwwt.wgzyghjg != null) return false;
        if (bcclts != null ? !bcclts.equals(sfjdDwwt.bcclts) : sfjdDwwt.bcclts != null) return false;
        if (ysjahrq != null ? !ysjahrq.equals(sfjdDwwt.ysjahrq) : sfjdDwwt.ysjahrq != null) return false;
        if (gdbz != null ? !gdbz.equals(sfjdDwwt.gdbz) : sfjdDwwt.gdbz != null) return false;
        if (hyzspsj != null ? !hyzspsj.equals(sfjdDwwt.hyzspsj) : sfjdDwwt.hyzspsj != null) return false;
        if (bdwlb != null ? !bdwlb.equals(sfjdDwwt.bdwlb) : sfjdDwwt.bdwlb != null) return false;
        if (pgbgyxqjzr != null ? !pgbgyxqjzr.equals(sfjdDwwt.pgbgyxqjzr) : sfjdDwwt.pgbgyxqjzr != null) return false;
        if (pgbgyxq != null ? !pgbgyxq.equals(sfjdDwwt.pgbgyxq) : sfjdDwwt.pgbgyxq != null) return false;
        if (sfsfjd != null ? !sfsfjd.equals(sfjdDwwt.sfsfjd) : sfjdDwwt.sfsfjd != null) return false;
        if (wtlx != null ? !wtlx.equals(sfjdDwwt.wtlx) : sfjdDwwt.wtlx != null) return false;
        if (sfcx != null ? !sfcx.equals(sfjdDwwt.sfcx) : sfjdDwwt.sfcx != null) return false;
        if (bcxyy != null ? !bcxyy.equals(sfjdDwwt.bcxyy) : sfjdDwwt.bcxyy != null) return false;
        if (ishistory != null ? !ishistory.equals(sfjdDwwt.ishistory) : sfjdDwwt.ishistory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xlh;
        result = 31 * result + (ay != null ? ay.hashCode() : 0);
        result = 31 * result + (nd != null ? nd.hashCode() : 0);
        result = 31 * result + (xh != null ? xh.hashCode() : 0);
        result = 31 * result + (jdh != null ? jdh.hashCode() : 0);
        result = 31 * result + (jdry != null ? jdry.hashCode() : 0);
        result = 31 * result + (ysbm != null ? ysbm.hashCode() : 0);
        result = 31 * result + (ysr != null ? ysr.hashCode() : 0);
        result = 31 * result + (dh != null ? dh.hashCode() : 0);
        result = 31 * result + (ysajxgajh != null ? ysajxgajh.hashCode() : 0);
        result = 31 * result + (ysajxh != null ? ysajxh.hashCode() : 0);
        result = 31 * result + (sqfdsrmc != null ? sqfdsrmc.hashCode() : 0);
        result = 31 * result + (sqfdsrlxr != null ? sqfdsrlxr.hashCode() : 0);
        result = 31 * result + (lyfdsrmc != null ? lyfdsrmc.hashCode() : 0);
        result = 31 * result + (lyfdsrlxr != null ? lyfdsrlxr.hashCode() : 0);
        result = 31 * result + (aqzy != null ? aqzy.hashCode() : 0);
        result = 31 * result + (sjcl != null ? sjcl.hashCode() : 0);
        result = 31 * result + (wtsx != null ? wtsx.hashCode() : 0);
        result = 31 * result + (sabd != null ? sabd.hashCode() : 0);
        result = 31 * result + (jdjzr != null ? jdjzr.hashCode() : 0);
        result = 31 * result + (ysrq != null ? ysrq.hashCode() : 0);
        result = 31 * result + (laspr != null ? laspr.hashCode() : 0);
        result = 31 * result + (sprq != null ? sprq.hashCode() : 0);
        result = 31 * result + (jbrq != null ? jbrq.hashCode() : 0);
        result = 31 * result + (dbqx != null ? dbqx.hashCode() : 0);
        result = 31 * result + (wtqxzzks != null ? wtqxzzks.hashCode() : 0);
        result = 31 * result + (wtqxzzjs != null ? wtqxzzjs.hashCode() : 0);
        result = 31 * result + (jdqxzzks != null ? jdqxzzks.hashCode() : 0);
        result = 31 * result + (jdqxzzjs != null ? jdqxzzjs.hashCode() : 0);
        result = 31 * result + (ycwtqx != null ? ycwtqx.hashCode() : 0);
        result = 31 * result + (ycjdqx != null ? ycjdqx.hashCode() : 0);
        result = 31 * result + (tzxsrq != null ? tzxsrq.hashCode() : 0);
        result = 31 * result + (xsrq != null ? xsrq.hashCode() : 0);
        result = 31 * result + (wtrq != null ? wtrq.hashCode() : 0);
        result = 31 * result + (jhsrq != null ? jhsrq.hashCode() : 0);
        result = 31 * result + (ckrq != null ? ckrq.hashCode() : 0);
        result = 31 * result + (jdqdrq != null ? jdqdrq.hashCode() : 0);
        result = 31 * result + (xcjgrq != null ? xcjgrq.hashCode() : 0);
        result = 31 * result + (zqyjrq != null ? zqyjrq.hashCode() : 0);
        result = 31 * result + (jdjsrq != null ? jdjsrq.hashCode() : 0);
        result = 31 * result + (sfja != null ? sfja.hashCode() : 0);
        result = 31 * result + (sfzz != null ? sfzz.hashCode() : 0);
        result = 31 * result + (jarq != null ? jarq.hashCode() : 0);
        result = 31 * result + (sfgd != null ? sfgd.hashCode() : 0);
        result = 31 * result + (gdrq != null ? gdrq.hashCode() : 0);
        result = 31 * result + (wtjdjgmc != null ? wtjdjgmc.hashCode() : 0);
        result = 31 * result + (xdfs != null ? xdfs.hashCode() : 0);
        result = 31 * result + (ysje != null ? ysje.hashCode() : 0);
        result = 31 * result + (jffmc != null ? jffmc.hashCode() : 0);
        result = 31 * result + (zcje != null ? zcje.hashCode() : 0);
        result = 31 * result + (bjje != null ? bjje.hashCode() : 0);
        result = 31 * result + (bjrq != null ? bjrq.hashCode() : 0);
        result = 31 * result + (thje != null ? thje.hashCode() : 0);
        result = 31 * result + (sfjgmc != null ? sfjgmc.hashCode() : 0);
        result = 31 * result + (dzrq != null ? dzrq.hashCode() : 0);
        result = 31 * result + (zcrq != null ? zcrq.hashCode() : 0);
        result = 31 * result + (tjflxz != null ? tjflxz.hashCode() : 0);
        result = 31 * result + (tjflzl != null ? tjflzl.hashCode() : 0);
        result = 31 * result + (ly != null ? ly.hashCode() : 0);
        result = 31 * result + (spyj != null ? spyj.hashCode() : 0);
        result = 31 * result + (tscx != null ? tscx.hashCode() : 0);
        result = 31 * result + (fwtd != null ? fwtd.hashCode() : 0);
        result = 31 * result + (yjjdfdsr != null ? yjjdfdsr.hashCode() : 0);
        result = 31 * result + (sjbmyj != null ? sjbmyj.hashCode() : 0);
        result = 31 * result + (jdglbmyj != null ? jdglbmyj.hashCode() : 0);
        result = 31 * result + (bcclsdrq != null ? bcclsdrq.hashCode() : 0);
        result = 31 * result + (sjbmrq != null ? sjbmrq.hashCode() : 0);
        result = 31 * result + (jdglbmrq != null ? jdglbmrq.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (ajmc != null ? ajmc.hashCode() : 0);
        result = 31 * result + (wtsxbz != null ? wtsxbz.hashCode() : 0);
        result = 31 * result + (sfzcjd != null ? sfzcjd.hashCode() : 0);
        result = 31 * result + (wtglgzts != null ? wtglgzts.hashCode() : 0);
        result = 31 * result + (xbr != null ? xbr.hashCode() : 0);
        result = 31 * result + (hyzcy != null ? hyzcy.hashCode() : 0);
        result = 31 * result + (pgpmjz != null ? pgpmjz.hashCode() : 0);
        result = 31 * result + (wgzy != null ? wgzy.hashCode() : 0);
        result = 31 * result + (wgzyghjg != null ? wgzyghjg.hashCode() : 0);
        result = 31 * result + (bcclts != null ? bcclts.hashCode() : 0);
        result = 31 * result + (ysjahrq != null ? ysjahrq.hashCode() : 0);
        result = 31 * result + (gdbz != null ? gdbz.hashCode() : 0);
        result = 31 * result + (hyzspsj != null ? hyzspsj.hashCode() : 0);
        result = 31 * result + (bdwlb != null ? bdwlb.hashCode() : 0);
        result = 31 * result + (pgbgyxqjzr != null ? pgbgyxqjzr.hashCode() : 0);
        result = 31 * result + (pgbgyxq != null ? pgbgyxq.hashCode() : 0);
        result = 31 * result + (sfsfjd != null ? sfsfjd.hashCode() : 0);
        result = 31 * result + (wtlx != null ? wtlx.hashCode() : 0);
        result = 31 * result + (sfcx != null ? sfcx.hashCode() : 0);
        result = 31 * result + (bcxyy != null ? bcxyy.hashCode() : 0);
        result = 31 * result + (ishistory != null ? ishistory.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "AJXZ")
    public String getAjxz() {
        return ajxz;
    }

    public void setAjxz(String ajxz) {
        this.ajxz = ajxz;
    }

    @Basic
    @Column(name = "CJJ")
    public BigDecimal getCjj() {
        return cjj;
    }

    public void setCjj(BigDecimal cjj) {
        this.cjj = cjj;
    }

    @Basic
    @Column(name = "JDHPMJG")
    public String getJdhpmjg() {
        return jdhpmjg;
    }

    public void setJdhpmjg(String jdhpmjg) {
        this.jdhpmjg = jdhpmjg;
    }

    @Basic
    @Column(name = "SFLA")
    public String getSfla() {
        return sfla;
    }

    public void setSfla(String sfla) {
        this.sfla = sfla;
    }
}
