package nju.software.data.dataobject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nju.software.util.TransferJsonSerializer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="sfjd_dwwt")
public class Auction implements Serializable{
    private static final long serialVersionUID = 1L;
    
    /**
     * ���к�
     */
    private Integer XLH;
   
    /**
     * ����
     */
    private String AY;
    
    /**
     * ί�к�
     */
    private String WTH;
    
    /**
     * ���Ͳ���
     */
    private String YISONGBUMEN;
    
    /**
     * ������
     */
    private String YSR;
    /**
     * �绰
     */
    private String PHONE;
    /**
     * ���Ͱ�����ذ����
     */
    private String YSAJXGAJH;
    /**
     * ����ͥ��������
     */
    private Date HYTHYRQ;//
    /**
     * ��������
     */
    private String AJMC;
    /**
     * ���뷽����������
     */
    private String SQFDSRMC;
    /**
     * ���뷽��������ϵ��
     */
    private String SQFDSRLXR;
    /**
     * ��һ������������
     */
    private String LYFDSRMC;
    /**
     * ��һ����������ϵ��
     */
    private String LYFDSRLXR;
    /**
     * ����ժҪ
     */
    private String AQZY;
    /**
     * �ͼ����
     */
    private String SJCL;
    /**
     * ί������
     */
    private String WTSX;
    /**
     * �永���
     */
    private Double SABD;
    /**
     * ������׼��
     */
    private Date JDJZR;
    /**
     * ��������
     */
    private Date YSRQ;
    /**
     * ����ί�б�ע
     */
    private String DWWTBZ;
    /**
     * ������
     */
    private String JBR;
    /**
     * ��������
     */
    private Date JBRQ;
    /**
     * Э����
     */
    private String XBR;
    /**
     * �������Ա
     */
    private String HYZCY;
    /**
     * ����������
     */
    private String LASPR;
    /**
     * ��������
     */
    private Date LARQ;
    /**
     * ��������
     */
    private String AJXZ;
    /**
     * �Ƿ����¼���
     */
    private String SFCX;
    /**
     * �ɽ���
     */
    private Double CJJ;
    /**
     * ����������ֵ
     */
    private Double PGPMJZ;
    /**
     * �������������
     */
    private String JDHPMJG;
    /**
     * �᰸����
     */
    private Date JARQ;
    /**
     * ͥ�����
     */
    private String TSCX;
    /**
     * ����̬��
     */
    private String FWTD;
    /**
     * Υ��ִҵ
     */
    private String WGZY;
    /**
     * Υ��ִҵ��������
     */
    private String WGZYGHJG;
    /**
     * ί�����ע
     */
    private String WTSXBZ;
    /**
     * �Ƿ�����
     */
    private String SFLA;
    /**
     * �Ƿ�᰸
     */
    private String SFJA;
    public Integer getXLH() {
        return XLH;
    }
    public void setXLH(Integer xLH) {
        XLH = xLH;
    }
    public String getAY() {
        return AY;
    }
    public void setAY(String aY) {
        AY = aY;
    }
    public String getWTH() {
        return WTH;
    }
    public void setWTH(String wTH) {
        WTH = wTH;
    }
    public String getYISONGBUMEN() {
        return YISONGBUMEN;
    }
    public void setYISONGBUMEN(String yISONGBUMEN) {
        YISONGBUMEN = yISONGBUMEN;
    }
    public String getYSR() {
        return YSR;
    }
    public void setYSR(String ySR) {
        YSR = ySR;
    }
    public String getPHONE() {
        return PHONE;
    }
    public void setPHONE(String pHONE) {
        PHONE = pHONE;
    }
    public String getYSAJXGAJH() {
        return YSAJXGAJH;
    }
    public void setYSAJXGAJH(String ySAJXGAJH) {
        YSAJXGAJH = ySAJXGAJH;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
 //   @JsonInclude(JsonInclude.Include.NON_NULL)
    public Date getHYTHYRQ() {
        return HYTHYRQ;
    }
    public void setHYTHYRQ(Date hYTHYRQ) {
        HYTHYRQ = hYTHYRQ;
    }
    public String getAJMC() {
        return AJMC;
    }
    public void setAJMC(String aJMC) {
        AJMC = aJMC;
    }
    public String getSQFDSRMC() {
        return SQFDSRMC;
    }
    public void setSQFDSRMC(String sQFDSRMC) {
        SQFDSRMC = sQFDSRMC;
    }
    public String getSQFDSRLXR() {
        return SQFDSRLXR;
    }
    public void setSQFDSRLXR(String sQFDSRLXR) {
        SQFDSRLXR = sQFDSRLXR;
    }
    public String getLYFDSRMC() {
        return LYFDSRMC;
    }
    public void setLYFDSRMC(String lYFDSRMC) {
        LYFDSRMC = lYFDSRMC;
    }
    public String getLYFDSRLXR() {
        return LYFDSRLXR;
    }
    public void setLYFDSRLXR(String lYFDSRLXR) {
        LYFDSRLXR = lYFDSRLXR;
    }
    public String getAQZY() {
        return AQZY;
    }
    public void setAQZY(String aQZY) {
        AQZY = aQZY;
    }
    public String getSJCL() {
        return SJCL;
    }
    public void setSJCL(String sJCL) {
        SJCL = sJCL;
    }
    public String getWTSX() {
        return WTSX;
    }
    public void setWTSX(String wTSX) {
        WTSX = wTSX;
    }
   // @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getSABD() {
        return SABD;
    }
    public void setSABD(Double sABD) {
        SABD = sABD;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
   // @JsonInclude(JsonInclude.Include.NON_NULL)
    public Date getJDJZR() {
        return JDJZR;
    }
    public void setJDJZR(Date jDJZR) {
        JDJZR = jDJZR;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
   // @JsonInclude(JsonInclude.Include.NON_NULL)
    public Date getYSRQ() {
        return YSRQ;
    }
    public void setYSRQ(Date ySRQ) {
        YSRQ = ySRQ;
    }
    public String getDWWTBZ() {
        return DWWTBZ;
    }
    public void setDWWTBZ(String dWWTBZ) {
        DWWTBZ = dWWTBZ;
    }
    public String getJBR() {
        return JBR;
    }
    public void setJBR(String jBR) {
        JBR = jBR;
    }
    @JsonSerialize(using=TransferJsonSerializer.class)
   // @JsonInclude(JsonInclude.Include.NON_NULL)
    public Date getJBRQ() {
        return JBRQ;
    }
    public void setJBRQ(Date jBRQ) {
        JBRQ = jBRQ;
    }
    public String getXBR() {
        return XBR;
    }
    public void setXBR(String xBR) {
        XBR = xBR;
    }
    public String getHYZCY() {
        return HYZCY;
    }
    public void setHYZCY(String hYZCY) {
        HYZCY = hYZCY;
    }
    public String getLASPR() {
        return LASPR;
    }
    public void setLASPR(String lASPR) {
        LASPR = lASPR;
    }
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getLARQ() {
        return LARQ;
    }
    public void setLARQ(Date lARQ) {
        LARQ = lARQ;
    }
    public String getAJXZ() {
        return AJXZ;
    }
    public void setAJXZ(String aJXZ) {
        AJXZ = aJXZ;
    }
    public String getSFCX() {
        return SFCX;
    }
    public void setSFCX(String sFCX) {
        SFCX = sFCX;
    }
    public Double getCJJ() {
        return CJJ;
    }
    public void setCJJ(Double cJJ) {
        CJJ = cJJ;
    }
    public Double getPGPMJZ() {
        return PGPMJZ;
    }
    public void setPGPMJZ(Double pGPMJZ) {
        PGPMJZ = pGPMJZ;
    }
    public String getJDHPMJG() {
        return JDHPMJG;
    }
    public void setJDHPMJG(String jDHPMJG) {
        JDHPMJG = jDHPMJG;
    }
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using=TransferJsonSerializer.class)
    public Date getJARQ() {
        return JARQ;
    }
    public void setJARQ(Date jARQ) {
        JARQ = jARQ;
    }
    public String getTSCX() {
        return TSCX;
    }
    public void setTSCX(String tSCX) {
        TSCX = tSCX;
    }
    public String getFWTD() {
        return FWTD;
    }
    public void setFWTD(String fWTD) {
        FWTD = fWTD;
    }
    public String getWGZY() {
        return WGZY;
    }
    public void setWGZY(String wGZY) {
        WGZY = wGZY;
    }
    public String getWGZYGHJG() {
        return WGZYGHJG;
    }
    public void setWGZYGHJG(String wGZYGHJG) {
        WGZYGHJG = wGZYGHJG;
    }
    public String getWTSXBZ() {
        return WTSXBZ;
    }
    public void setWTSXBZ(String wTSXBZ) {
        WTSXBZ = wTSXBZ;
    }
    public String getSFLA() {
        return SFLA;
    }
    public void setSFLA(String sFLA) {
        SFLA = sFLA;
    }
    public String getSFJA() {
        return SFJA;
    }
    public void setSFJA(String sFJA) {
        SFJA = sFJA;
    }
    public Auction(Integer xLH, String aY, String wTH, String yISONGBUMEN, String ySR, String pHONE, String ySAJXGAJH,
                   Date hYTHYRQ, String aJMC, String sQFDSRMC, String sQFDSRLXR, String lYFDSRMC, String lYFDSRLXR,
                   String aQZY, String sJCL, String wTSX, Double sABD, Date jDJZR, Date ySRQ, String dWWTBZ, String jBR,
                   Date jBRQ, String xBR, String hYZCY, String lASPR, Date lARQ, String aJXZ, String sFCX, Double cJJ,
                   Double pGPMJZ, String jDHPMJG, Date jARQ, String tSCX, String fWTD, String wGZY, String wGZYGHJG,
                   String wTSXBZ, String sFLA, String sFJA) {
        XLH = xLH;
        AY = aY;
        WTH = wTH;
        YISONGBUMEN = yISONGBUMEN;
        YSR = ySR;
        PHONE = pHONE;
        YSAJXGAJH = ySAJXGAJH;
        HYTHYRQ = hYTHYRQ;
        AJMC = aJMC;
        SQFDSRMC = sQFDSRMC;
        SQFDSRLXR = sQFDSRLXR;
        LYFDSRMC = lYFDSRMC;
        LYFDSRLXR = lYFDSRLXR;
        AQZY = aQZY;
        SJCL = sJCL;
        WTSX = wTSX;
        SABD = sABD;
        JDJZR = jDJZR;
        YSRQ = ySRQ;
        DWWTBZ = dWWTBZ;
        JBR = jBR;
        JBRQ = jBRQ;
        XBR = xBR;
        HYZCY = hYZCY;
        LASPR = lASPR;
        LARQ = lARQ;
        AJXZ = aJXZ;
        SFCX = sFCX;
        CJJ = cJJ;
        PGPMJZ = pGPMJZ;
        JDHPMJG = jDHPMJG;
        JARQ = jARQ;
        TSCX = tSCX;
        FWTD = fWTD;
        WGZY = wGZY;
        WGZYGHJG = wGZYGHJG;
        WTSXBZ = wTSXBZ;
        SFLA = sFLA;
        SFJA = sFJA;
    }
    public Auction() {
        
    }
    @Override
    public String toString() {
        return "Auction [XLH=" + XLH + ", AY=" + AY + ", WTH=" + WTH + ", YISONGBUMEN=" + YISONGBUMEN + ", YSR=" + YSR
                + ", PHONE=" + PHONE + ", YSAJXGAJH=" + YSAJXGAJH + ", HYTHYRQ=" + HYTHYRQ + ", AJMC=" + AJMC
                + ", SQFDSRMC=" + SQFDSRMC + ", SQFDSRLXR=" + SQFDSRLXR + ", LYFDSRMC=" + LYFDSRMC + ", LYFDSRLXR="
                + LYFDSRLXR + ", AQZY=" + AQZY + ", SJCL=" + SJCL + ", WTSX=" + WTSX + ", SABD=" + SABD + ", JDJZR="
                + JDJZR + ", YSRQ=" + YSRQ + ", DWWTBZ=" + DWWTBZ + ", JBR=" + JBR + ", JBRQ=" + JBRQ + ", XBR=" + XBR
                + ", HYZCY=" + HYZCY + ", LASPR=" + LASPR + ", LARQ=" + LARQ + ", AJXZ=" + AJXZ + ", SFCX=" + SFCX
                + ", CJJ=" + CJJ + ", PGPMJZ=" + PGPMJZ + ", JDHPMJG=" + JDHPMJG + ", JARQ=" + JARQ + ", TSCX=" + TSCX
                + ", FWTD=" + FWTD + ", WGZY=" + WGZY + ", WGZYGHJG=" + WGZYGHJG + ", WTSXBZ=" + WTSXBZ + ", SFLA="
                + SFLA + ", SFJA=" + SFJA + "]";
    }
    
    
    
}
