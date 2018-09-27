package br.com.fontana.loja.funcionario.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_FUNC")
public class TbFunc implements Serializable {

    private static final long serialVersionUID = 8063037659690910945L;
    @Id
    @Column(name = "NR_MATR_FUNC", unique = true, nullable = false, precision = 8, scale = 0)
    private Long nrMatrFunc;

    @Column(name = "NM_FUNC", length = 50)
    private String nmFunc;

    @Column(name = "CD_SITU", precision = 2, scale = 0)
    private Short cdSitu;

    @Column(name = "CD_PESS", precision = 8, scale = 0)
    private Long cdPess;

    @Column(name = "CD_SEGM", length = 3)
    private String cdSegm;

    @Column(name = "NR_CPF", precision = 11, scale = 0)
    private Long nrCpf;

    @Column(name = "NM_EMAIL", length = 100)
    private String nmEmail;

    @Column(name = "CD_DDD_TELF", precision = 2, scale = 0)
    private Short cdDddTelf;

    @Column(name = "NR_TELF", precision = 11, scale = 0)
    private Long nrTelf;

    @Column(name = "TP_SITU_FUNC", length = 1)
    private String tpSituFunc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ADMS", length = 7)
    private Date dtAdms;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_DEMI", length = 7)
    private Date dtDemi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INIC_AFAS", length = 7)
    private Date dtInicAfas;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIM_AFAS", length = 7)
    private Date dtFimAfas;

    @Column(name = "TP_UOR_CNTB", precision = 3, scale = 0)
    private Short tpUorCntb;

    @Column(name = "CD_UOR_CNTB", precision = 4, scale = 0)
    private Short cdUorCntb;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DH_INCL_REGT", nullable = false, length = 7)
    private Date dhInclRegt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DH_ULTI_ATLZ_REGT", nullable = false, length = 7)
    private Date dhUltiAtlzRegt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "TP_UOR", referencedColumnName = "TP_UOR"), @JoinColumn(name = "CD_UOR", referencedColumnName = "CD_UOR") })
    private TbUorBncr tbUorBncr;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CD_CARG")
    private TbCarg tbCarg;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CD_CATG")
    private TbCatgFunc tbCatgFunc;

    @Transient
    private String indMaiorRelac;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_NASC_FUNC", length = 7)
    private Date dtNascFunc;

    @Column(name = "DS_SIGL_SIST_FUNC", length = 20)
    private String dsSiglSistFunc;

    @Column(name = "DS_PERF_MBS_FUNC", length = 20)
    private String dsPerfMbsFunc;

    @Column(name = "TP_CARG_FUNC", length = 2)
    private String tpCargFunc;

    @Transient
    private String inPermiteJustGereGeral;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbFunc")
    private List<TbFuncCart> tbFuncCarts = new ArrayList<>();

    public TbFunc() {
    }

    public TbFunc(Long nrMatrFunc) {
        super();
        this.nrMatrFunc = nrMatrFunc;
    }

    public TbFunc(Long nrMatrFunc, String nmFunc) {
        super();
        this.nrMatrFunc = nrMatrFunc;
        this.nmFunc = nmFunc;
    }

    public Long getNrMatrFunc() {
        return this.nrMatrFunc;
    }

    public void setNrMatrFunc(Long nrMatrFunc) {
        this.nrMatrFunc = nrMatrFunc;
    }

    public String getNmFunc() {
        return this.nmFunc;
    }

    public void setNmFunc(String nmFunc) {
        this.nmFunc = nmFunc;
    }

    public Short getCdSitu() {
        return this.cdSitu;
    }

    public void setCdSitu(Short cdSitu) {
        this.cdSitu = cdSitu;
    }

    public Long getCdPess() {
        return this.cdPess;
    }

    public void setCdPess(Long cdPess) {
        this.cdPess = cdPess;
    }

    public String getCdSegm() {
        return this.cdSegm;
    }

    public void setCdSegm(String cdSegm) {
        this.cdSegm = cdSegm;
    }

    public Long getNrCpf() {
        return this.nrCpf;
    }

    public void setNrCpf(Long nrCpf) {
        this.nrCpf = nrCpf;
    }

    public String getNmEmail() {
        return this.nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }

    public Short getCdDddTelf() {
        return this.cdDddTelf;
    }

    public void setCdDddTelf(Short cdDddTelf) {
        this.cdDddTelf = cdDddTelf;
    }

    public Long getNrTelf() {
        return this.nrTelf;
    }

    public void setNrTelf(Long nrTelf) {
        this.nrTelf = nrTelf;
    }

    public String getTpSituFunc() {
        return this.tpSituFunc;
    }

    public void setTpSituFunc(String tpSituFunc) {
        this.tpSituFunc = tpSituFunc;
    }

    public Date getDtAdms() {
        return this.dtAdms;
    }

    public void setDtAdms(Date dtAdms) {
        this.dtAdms = dtAdms;
    }

    public Date getDtDemi() {
        return this.dtDemi;
    }

    public void setDtDemi(Date dtDemi) {
        this.dtDemi = dtDemi;
    }

    public Date getDtInicAfas() {
        return this.dtInicAfas;
    }

    public void setDtInicAfas(Date dtInicAfas) {
        this.dtInicAfas = dtInicAfas;
    }

    public Date getDtFimAfas() {
        return this.dtFimAfas;
    }

    public void setDtFimAfas(Date dtFimAfas) {
        this.dtFimAfas = dtFimAfas;
    }

    public Short getTpUorCntb() {
        return this.tpUorCntb;
    }

    public void setTpUorCntb(Short tpUorCntb) {
        this.tpUorCntb = tpUorCntb;
    }

    public Short getCdUorCntb() {
        return this.cdUorCntb;
    }

    public void setCdUorCntb(Short cdUorCntb) {
        this.cdUorCntb = cdUorCntb;
    }

    public Date getDhInclRegt() {
        return this.dhInclRegt;
    }

    public void setDhInclRegt(Date dhInclRegt) {
        this.dhInclRegt = dhInclRegt;
    }

    public Date getDhUltiAtlzRegt() {
        return this.dhUltiAtlzRegt;
    }

    public void setDhUltiAtlzRegt(Date dhUltiAtlzRegt) {
        this.dhUltiAtlzRegt = dhUltiAtlzRegt;
    }

    public String getIndMaiorRelac() {
        return indMaiorRelac;
    }

    public void setIndMaiorRelac(String indMaiorRelac) {
        this.indMaiorRelac = indMaiorRelac;
    }

    public Date getDtNascFunc() {
        return this.dtNascFunc;
    }

    public void setDtNascFunc(Date dtNascFunc) {
        this.dtNascFunc = dtNascFunc;
    }

    public String getDsSiglSistFunc() {
        return dsSiglSistFunc;
    }

    public void setDsSiglSistFunc(String dsSiglSistFunc) {
        this.dsSiglSistFunc = dsSiglSistFunc;
    }

    public String getDsPerfMbsFunc() {
        return dsPerfMbsFunc;
    }

    public void setDsPerfMbsFunc(String dsPerfMbsFunc) {
        this.dsPerfMbsFunc = dsPerfMbsFunc;
    }

    public String getTpCargFunc() {
        return tpCargFunc;
    }

    public void setTpCargFunc(String tpCargFunc) {
        this.tpCargFunc = tpCargFunc;
    }

    public String getInPermiteJustGereGeral() {
        return inPermiteJustGereGeral;
    }

    public void setInPermiteJustGereGeral(String inPermiteJustGereGeral) {
        this.inPermiteJustGereGeral = inPermiteJustGereGeral;
    }

    public TbCarg getTbCarg() {
        return tbCarg;
    }

    public void setTbCarg(TbCarg tbCarg) {
        this.tbCarg = tbCarg;
    }

    public TbUorBncr getTbUorBncr() {
        return this.tbUorBncr;
    }

    public void setTbUorBncr(TbUorBncr tbUorBncr) {
        this.tbUorBncr = tbUorBncr;
    }

    public List<TbFuncCart> getTbFuncCarts() {
        return this.tbFuncCarts;
    }

    public void setTbFuncCarts(List<TbFuncCart> tbFuncCarts) {
        this.tbFuncCarts = tbFuncCarts;
    }

    public TbCatgFunc getTbCatgFunc() {
        return tbCatgFunc;
    }

    public void setTbCatgFunc(TbCatgFunc tbCatgFunc) {
        this.tbCatgFunc = tbCatgFunc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nrMatrFunc == null) ? 0 : nrMatrFunc.hashCode());
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
        TbFunc other = (TbFunc) obj;
        if (nrMatrFunc == null) {
            if (other.nrMatrFunc != null)
                return false;
        } else if (!nrMatrFunc.equals(other.nrMatrFunc))
            return false;
        return true;
    }

}

