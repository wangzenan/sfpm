package nju.software.data.dataobject;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nju.software.util.TransferJsonSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "pub_sl_sxzd", schema = "auction2", catalog = "")
@IdClass(PubSlSxzdPK.class)
public class PubSlSxzd implements Serializable {

    private static final long serialVersionUID = -8774853711234227641L;
   @Id
    private int ajxh;
   @Id
   private int zdbh;

 //   private  PubSlSxzdPK pubSlSxzdPK;
    private String zdyy;
    private String sqr;
    private Date zdrq;
    private String zdcljg;
    private Date hfrq;
    private String bz;
    private String czr;
    private Date zdsqrq;
    private Date hfsqrq;
    private String hfyy;

    //@Id
    @Column(name = "AJXH")
    public int getAjxh() {
        return ajxh;
    }

    public void setAjxh(int ajxh) {
        this.ajxh = ajxh;
    }

    //@Id
    @Column(name = "ZDBH")
    public int getZdbh() {
        return zdbh;
    }

    public void setZdbh(int zdbh) {
        this.zdbh = zdbh;
    }
    /*
@Id
    public PubSlSxzdPK getPubSlSxzdPK() {
        return pubSlSxzdPK;
    }

    public void setPubSlSxzdPK(PubSlSxzdPK pubSlSxzdPK) {
        this.pubSlSxzdPK = pubSlSxzdPK;
    }*/

    @Basic
    @Column(name = "ZDYY")
    public String getZdyy() {
        return zdyy;
    }

    public void setZdyy(String zdyy) {
        this.zdyy = zdyy;
    }

    @Basic
    @Column(name = "SQR")
    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "ZDRQ")
    public Date getZdrq() {
        return zdrq;
    }

    public void setZdrq(Date zdrq) {
        this.zdrq = zdrq;
    }

    @Basic
    @Column(name = "ZDCLJG")
    public String getZdcljg() {
        return zdcljg;
    }

    public void setZdcljg(String zdcljg) {
        this.zdcljg = zdcljg;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "HFRQ")
    public Date getHfrq() {
        return hfrq;
    }

    public void setHfrq(Date hfrq) {
        this.hfrq = hfrq;
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
    @Column(name = "CZR")
    public String getCzr() {
        return czr;
    }

    public void setCzr(String czr) {
        this.czr = czr;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "ZDSQRQ")
    public Date getZdsqrq() {
        return zdsqrq;
    }

    public void setZdsqrq(Date zdsqrq) {
        this.zdsqrq = zdsqrq;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "HFSQRQ")
    public Date getHfsqrq() {
        return hfsqrq;
    }

    public void setHfsqrq(Date hfsqrq) {
        this.hfsqrq = hfsqrq;
    }

    @Basic
    @Column(name = "HFYY")
    public String getHfyy() {
        return hfyy;
    }

    public void setHfyy(String hfyy) {
        this.hfyy = hfyy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PubSlSxzd pubSlSxzd = (PubSlSxzd) o;

        if (ajxh != pubSlSxzd.ajxh) return false;

        if (zdbh != pubSlSxzd.zdbh) return false;
        if (zdyy != null ? !zdyy.equals(pubSlSxzd.zdyy) : pubSlSxzd.zdyy != null) return false;
        if (sqr != null ? !sqr.equals(pubSlSxzd.sqr) : pubSlSxzd.sqr != null) return false;
        if (zdrq != null ? !zdrq.equals(pubSlSxzd.zdrq) : pubSlSxzd.zdrq != null) return false;
        if (zdcljg != null ? !zdcljg.equals(pubSlSxzd.zdcljg) : pubSlSxzd.zdcljg != null) return false;
        if (hfrq != null ? !hfrq.equals(pubSlSxzd.hfrq) : pubSlSxzd.hfrq != null) return false;
        if (bz != null ? !bz.equals(pubSlSxzd.bz) : pubSlSxzd.bz != null) return false;
        if (czr != null ? !czr.equals(pubSlSxzd.czr) : pubSlSxzd.czr != null) return false;
        if (zdsqrq != null ? !zdsqrq.equals(pubSlSxzd.zdsqrq) : pubSlSxzd.zdsqrq != null) return false;
        if (hfsqrq != null ? !hfsqrq.equals(pubSlSxzd.hfsqrq) : pubSlSxzd.hfsqrq != null) return false;
        if (hfyy != null ? !hfyy.equals(pubSlSxzd.hfyy) : pubSlSxzd.hfyy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ajxh;
        result = 31 * result + zdbh;
        result = 31 * result + (zdyy != null ? zdyy.hashCode() : 0);
        result = 31 * result + (sqr != null ? sqr.hashCode() : 0);
        result = 31 * result + (zdrq != null ? zdrq.hashCode() : 0);
        result = 31 * result + (zdcljg != null ? zdcljg.hashCode() : 0);
        result = 31 * result + (hfrq != null ? hfrq.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (czr != null ? czr.hashCode() : 0);
        result = 31 * result + (zdsqrq != null ? zdsqrq.hashCode() : 0);
        result = 31 * result + (hfsqrq != null ? hfsqrq.hashCode() : 0);
        result = 31 * result + (hfyy != null ? hfyy.hashCode() : 0);
        return result;
    }
}
