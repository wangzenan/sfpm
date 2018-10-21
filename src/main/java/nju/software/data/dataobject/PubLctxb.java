package nju.software.data.dataobject;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nju.software.util.TransferJsonSerializer;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "pub_lctxb", schema = "auction2", catalog = "")
public class PubLctxb {
    private int lctxbh;
    private String lcdmbh;
    private int ajxh;
    private int bh;
    private String lctxnr;
    private String bmbh;
    private String sjjs;
    private Integer sjyh;
    private String sfcl;
    private Date sqrq;
    private Integer clr;
    private Integer sqr;
    private Date clsj;
    private String bztx;

    @Id
    @Column(name = "LCTXBH")
    public int getLctxbh() {
        return lctxbh;
    }

    public void setLctxbh(int lctxbh) {
        this.lctxbh = lctxbh;
    }

    @Basic
    @Column(name = "LCDMBH")
    public String getLcdmbh() {
        return lcdmbh;
    }

    public void setLcdmbh(String lcdmbh) {
        this.lcdmbh = lcdmbh;
    }

    @Basic
    @Column(name = "AJXH")
    public int getAjxh() {
        return ajxh;
    }

    public void setAjxh(int ajxh) {
        this.ajxh = ajxh;
    }

    @Basic
    @Column(name = "BH")
    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    @Basic
    @Column(name = "LCTXNR")
    public String getLctxnr() {
        return lctxnr;
    }

    public void setLctxnr(String lctxnr) {
        this.lctxnr = lctxnr;
    }

    @Basic
    @Column(name = "BMBH")
    public String getBmbh() {
        return bmbh;
    }

    public void setBmbh(String bmbh) {
        this.bmbh = bmbh;
    }

    @Basic
    @Column(name = "SJJS")
    public String getSjjs() {
        return sjjs;
    }

    public void setSjjs(String sjjs) {
        this.sjjs = sjjs;
    }

    @Basic
    @Column(name = "SJYH")
    public Integer getSjyh() {
        return sjyh;
    }

    public void setSjyh(Integer sjyh) {
        this.sjyh = sjyh;
    }

    @Basic
    @Column(name = "SFCL")
    public String getSfcl() {
        return sfcl;
    }

    public void setSfcl(String sfcl) {
        this.sfcl = sfcl;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "SQRQ")
    public Date getSqrq() {
        return sqrq;
    }

    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    @Basic
    @Column(name = "CLR")
    public Integer getClr() {
        return clr;
    }

    public void setClr(Integer clr) {
        this.clr = clr;
    }

    @Basic
    @Column(name = "SQR")
    public Integer getSqr() {
        return sqr;
    }

    public void setSqr(Integer sqr) {
        this.sqr = sqr;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "CLSJ")
    public Date getClsj() {
        return clsj;
    }

    public void setClsj(Date clsj) {
        this.clsj = clsj;
    }

    @Basic
    @Column(name = "BZTX")
    public String getBztx() {
        return bztx;
    }

    public void setBztx(String bztx) {
        this.bztx = bztx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PubLctxb pubLctxb = (PubLctxb) o;

        if (lctxbh != pubLctxb.lctxbh) return false;
        if (ajxh != pubLctxb.ajxh) return false;
        if (bh != pubLctxb.bh) return false;
        if (lcdmbh != null ? !lcdmbh.equals(pubLctxb.lcdmbh) : pubLctxb.lcdmbh != null) return false;
        if (lctxnr != null ? !lctxnr.equals(pubLctxb.lctxnr) : pubLctxb.lctxnr != null) return false;
        if (bmbh != null ? !bmbh.equals(pubLctxb.bmbh) : pubLctxb.bmbh != null) return false;
        if (sjjs != null ? !sjjs.equals(pubLctxb.sjjs) : pubLctxb.sjjs != null) return false;
        if (sjyh != null ? !sjyh.equals(pubLctxb.sjyh) : pubLctxb.sjyh != null) return false;
        if (sfcl != null ? !sfcl.equals(pubLctxb.sfcl) : pubLctxb.sfcl != null) return false;
        if (sqrq != null ? !sqrq.equals(pubLctxb.sqrq) : pubLctxb.sqrq != null) return false;
        if (clr != null ? !clr.equals(pubLctxb.clr) : pubLctxb.clr != null) return false;
        if (sqr != null ? !sqr.equals(pubLctxb.sqr) : pubLctxb.sqr != null) return false;
        if (clsj != null ? !clsj.equals(pubLctxb.clsj) : pubLctxb.clsj != null) return false;
        if (bztx != null ? !bztx.equals(pubLctxb.bztx) : pubLctxb.bztx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lctxbh;
        result = 31 * result + (lcdmbh != null ? lcdmbh.hashCode() : 0);
        result = 31 * result + ajxh;
        result = 31 * result + bh;
        result = 31 * result + (lctxnr != null ? lctxnr.hashCode() : 0);
        result = 31 * result + (bmbh != null ? bmbh.hashCode() : 0);
        result = 31 * result + (sjjs != null ? sjjs.hashCode() : 0);
        result = 31 * result + (sjyh != null ? sjyh.hashCode() : 0);
        result = 31 * result + (sfcl != null ? sfcl.hashCode() : 0);
        result = 31 * result + (sqrq != null ? sqrq.hashCode() : 0);
        result = 31 * result + (clr != null ? clr.hashCode() : 0);
        result = 31 * result + (sqr != null ? sqr.hashCode() : 0);
        result = 31 * result + (clsj != null ? clsj.hashCode() : 0);
        result = 31 * result + (bztx != null ? bztx.hashCode() : 0);
        return result;
    }
}
