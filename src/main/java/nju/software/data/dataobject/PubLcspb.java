package nju.software.data.dataobject;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nju.software.util.TransferJsonSerializer;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pub_lcspb", schema = "auction2", catalog = "")
public class PubLcspb {
    private int spbh;
    private int fybh;
    private String splx;
    private int sqbh;
    private Date spkssj;
    private int sprbh;
    private String spr;
    private String sprlx;
    private String spjg;
    private int jdbh;
    private String sfspjs;
    private Date spjssj;
    private Integer lctxbh;
    private String spyj;
    private Integer ajxh;

    @Id
    @Column(name = "SPBH")
    public int getSpbh() {
        return spbh;
    }

    public void setSpbh(int spbh) {
        this.spbh = spbh;
    }

    @Basic
    @Column(name = "FYBH")
    public int getFybh() {
        return fybh;
    }

    public void setFybh(int fybh) {
        this.fybh = fybh;
    }

    @Basic
    @Column(name = "SPLX")
    public String getSplx() {
        return splx;
    }

    public void setSplx(String splx) {
        this.splx = splx;
    }

    @Basic
    @Column(name = "SQBH")
    public int getSqbh() {
        return sqbh;
    }

    public void setSqbh(int sqbh) {
        this.sqbh = sqbh;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "SPKSSJ")
    public Date getSpkssj() {
        return spkssj;
    }

    public void setSpkssj(Date spkssj) {
        this.spkssj = spkssj;
    }

    @Basic
    @Column(name = "SPRBH")
    public int getSprbh() {
        return sprbh;
    }

    public void setSprbh(int sprbh) {
        this.sprbh = sprbh;
    }

    @Basic
    @Column(name = "SPR")
    public String getSpr() {
        return spr;
    }

    public void setSpr(String spr) {
        this.spr = spr;
    }

    @Basic
    @Column(name = "SPRLX")
    public String getSprlx() {
        return sprlx;
    }

    public void setSprlx(String sprlx) {
        this.sprlx = sprlx;
    }

    @Basic
    @Column(name = "SPJG")
    public String getSpjg() {
        return spjg;
    }

    public void setSpjg(String spjg) {
        this.spjg = spjg;
    }

    @Basic
    @Column(name = "JDBH")
    public int getJdbh() {
        return jdbh;
    }

    public void setJdbh(int jdbh) {
        this.jdbh = jdbh;
    }

    @Basic
    @Column(name = "SFSPJS")
    public String getSfspjs() {
        return sfspjs;
    }

    public void setSfspjs(String sfspjs) {
        this.sfspjs = sfspjs;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
    @Basic
    @Column(name = "SPJSSJ")
    public Date getSpjssj() {
        return spjssj;
    }

    public void setSpjssj(Date spjssj) {
        this.spjssj = spjssj;
    }

    @Basic
    @Column(name = "LCTXBH")
    public Integer getLctxbh() {
        return lctxbh;
    }

    public void setLctxbh(Integer lctxbh) {
        this.lctxbh = lctxbh;
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
    @Column(name = "AJXH")
    public Integer getAjxh() {
        return ajxh;
    }

    public void setAjxh(Integer ajxh) {
        this.ajxh = ajxh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PubLcspb pubLcspb = (PubLcspb) o;

        if (spbh != pubLcspb.spbh) return false;
        if (fybh != pubLcspb.fybh) return false;
        if (sqbh != pubLcspb.sqbh) return false;
        if (sprbh != pubLcspb.sprbh) return false;
        if (jdbh != pubLcspb.jdbh) return false;
        if (splx != null ? !splx.equals(pubLcspb.splx) : pubLcspb.splx != null) return false;
        if (spkssj != null ? !spkssj.equals(pubLcspb.spkssj) : pubLcspb.spkssj != null) return false;
        if (spr != null ? !spr.equals(pubLcspb.spr) : pubLcspb.spr != null) return false;
        if (sprlx != null ? !sprlx.equals(pubLcspb.sprlx) : pubLcspb.sprlx != null) return false;
        if (spjg != null ? !spjg.equals(pubLcspb.spjg) : pubLcspb.spjg != null) return false;
        if (sfspjs != null ? !sfspjs.equals(pubLcspb.sfspjs) : pubLcspb.sfspjs != null) return false;
        if (spjssj != null ? !spjssj.equals(pubLcspb.spjssj) : pubLcspb.spjssj != null) return false;
        if (lctxbh != null ? !lctxbh.equals(pubLcspb.lctxbh) : pubLcspb.lctxbh != null) return false;
        if (spyj != null ? !spyj.equals(pubLcspb.spyj) : pubLcspb.spyj != null) return false;
        if (ajxh != null ? !ajxh.equals(pubLcspb.ajxh) : pubLcspb.ajxh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spbh;
        result = 31 * result + fybh;
        result = 31 * result + (splx != null ? splx.hashCode() : 0);
        result = 31 * result + sqbh;
        result = 31 * result + (spkssj != null ? spkssj.hashCode() : 0);
        result = 31 * result + sprbh;
        result = 31 * result + (spr != null ? spr.hashCode() : 0);
        result = 31 * result + (sprlx != null ? sprlx.hashCode() : 0);
        result = 31 * result + (spjg != null ? spjg.hashCode() : 0);
        result = 31 * result + jdbh;
        result = 31 * result + (sfspjs != null ? sfspjs.hashCode() : 0);
        result = 31 * result + (spjssj != null ? spjssj.hashCode() : 0);
        result = 31 * result + (lctxbh != null ? lctxbh.hashCode() : 0);
        result = 31 * result + (spyj != null ? spyj.hashCode() : 0);
        result = 31 * result + (ajxh != null ? ajxh.hashCode() : 0);
        return result;
    }
}
