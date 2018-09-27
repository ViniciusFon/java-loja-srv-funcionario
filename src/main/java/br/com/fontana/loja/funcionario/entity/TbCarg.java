package br.com.fontana.loja.funcionario.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_CARG", schema = "FEC")
public class TbCarg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CD_CARG", unique = true, nullable = false, length = 6)
    private String cdCarg;
    @Column(name = "NM_CARG", length = 40)
    private String nmCarg;
    @Column(name = "TP_CARG", length = 2)
    private String tpCarg;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DH_ULTI_ATLZ_REGT", nullable = false, length = 7)
    private Date dhUltiAtlzRegt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DH_INCL_REGT", nullable = false, length = 7)
    private Date dhInclRegt;

    public TbCarg() {
    }

    public TbCarg(String cdCarg, Date dhUltiAtlzRegt) {
        this.cdCarg = cdCarg;
        this.dhUltiAtlzRegt = dhUltiAtlzRegt;
    }


    public String getCdCarg() {
        return this.cdCarg;
    }

    public void setCdCarg(String cdCarg) {
        this.cdCarg = cdCarg;
    }

    public String getNmCarg() {
        return this.nmCarg;
    }

    public void setNmCarg(String nmCarg) {
        this.nmCarg = nmCarg;
    }

    public String getTpCarg() {
        return this.tpCarg;
    }

    public void setTpCarg(String tpCarg) {
        this.tpCarg = tpCarg;
    }

    public Date getDhUltiAtlzRegt() {
        return this.dhUltiAtlzRegt;
    }

    public void setDhUltiAtlzRegt(Date dhUltiAtlzRegt) {
        this.dhUltiAtlzRegt = dhUltiAtlzRegt;
    }

    public Date getDhInclRegt() {
        return dhInclRegt;
    }

    public void setDhInclRegt(Date dhInclRegt) {
        this.dhInclRegt = dhInclRegt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cdCarg == null) ? 0 : cdCarg.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TbCarg other = (TbCarg) obj;
        if (cdCarg == null) {
            if (other.cdCarg != null)
                return false;
        } else if (!cdCarg.equals(other.cdCarg))
            return false;
        return true;
    }

}
