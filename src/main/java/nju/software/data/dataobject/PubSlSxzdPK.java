package nju.software.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
//@Embeddable
public class PubSlSxzdPK implements Serializable {

    private static final long serialVersionUID = 1464810258343341940L;
    private int ajxh;
    private int zdbh;

    @Column(name = "AJXH")
    @Id
    public int getAjxh() {
        return ajxh;
    }

    public void setAjxh(int ajxh) {
        this.ajxh = ajxh;
    }

    @Column(name = "ZDBH")
    @Id
    public int getZdbh() {
        return zdbh;
    }

    public void setZdbh(int zdbh) {
        this.zdbh = zdbh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PubSlSxzdPK that = (PubSlSxzdPK) o;

        if (ajxh != that.ajxh) return false;
        if (zdbh != that.zdbh) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ajxh;
        result = 31 * result + zdbh;
        return result;
    }
}
