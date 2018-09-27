package br.com.fontana.loja.funcionario.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_CLIE", schema = "FEC")
public class TbClie implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_PESS", unique = true, nullable = false, precision = 8, scale = 0)
	private Long cdPess;

	@Column(name = "CD_SEGM")
	private String cdSegm;

	@Column(name = "CD_GRUP_CONG", length = 8)
	private Long cdGrupCong;

	@Column(name = "NM_CLIE", length = 40)
	private String nmClie;

	@Column(name = "NM_RAZA_SOCL", length = 40)
	private String nmRazaSocl;

	@Column(name = "NM_FANT", length = 30)
	private String nmFant;

	@Column(name = "NM_CLIE_PESQ", length = 120)
	private String nmCliePesq;

	@Column(name = "NR_CPF_CNPJ", nullable = false, precision = 14, scale = 0)
	private Long nrCpfCnpj;

	@Column(name = "TP_PESS", nullable = false, length = 1)
	private String tpPess;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NASC_CNST")
	private Date dtNascCnst;

	@Column(name = "TP_SEXO", length = 1)
	private String tpSexo;

	@Column(name = "IN_CLIE_ATIV", nullable = false, length = 1)
	private String inClieAtiv;

	@Column(name = "IN_CLIE_MPRO", nullable = false, length = 1)
	private String inClieMpro;

	@Column(name = "IN_CLIE_VINC", nullable = false, length = 1)
	private String inClieVinc;

	@Column(name = "IN_H21", nullable = false, length = 1)
	private String inH21;

	@Column(name = "TP_RISC_CHURN", precision = 1, scale = 0)
	private Boolean tpRiscChurn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CLIE_DSDE", length = 7)
	private Date dtClieDsde;

	@Column(name = "IN_CHEQ_ESPC", length = 1)
	private String inCheqEspc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INCL_REGT", nullable = false, length = 7)
	private Date dhInclRegt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_ULTI_ATLZ_REGT", nullable = false, length = 7)
	private Date dhUltiAtlzRegt;

	@Column(name = "CD_SETO_AEC", length = 3)
	private String cdSetoAec;

	@Column(name = "CD_RAMO_AEC", length = 4)
	private String cdRamoAec;

	@Column(name = "CD_AEC", length = 8)
	private String cdAec;

	@Column(name = "NR_RG_CLIE", length = 20)
	private String numRg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_EXPE_RG_CLIE")
	private Date dataExpedicaoRg;

	@Column(name = "NM_ORGA_EXPE_RG_CLIE", length = 15)
	private String orgaoExpedicaoRg;

	@Column(name = "NM_LOCA_EXPE_RG_CLIE", length = 2)
	private String localExpedicaoRg;

	@Column(name="CD_SEGM_SECU")
	private String cdSegmSecu;

	@Column(name="CD_SEGM_POTE")
	private String cdSegmPote;


	public TbClie() {
	}

	public Long getCdPess() {
		return this.cdPess;
	}

	public void setCdPess(Long cdPess) {
		this.cdPess = cdPess;
	}

	public String getNumRg() {
		return numRg;
	}

	public void setNumRg(String numRg) {
		this.numRg = numRg;
	}

	public Date getDataExpedicaoRg() {
		return dataExpedicaoRg;
	}

	public void setDataExpedicaoRg(Date dataExpedicaoRg) {
		this.dataExpedicaoRg = dataExpedicaoRg;
	}

	public String getOrgaoExpedicaoRg() {
		return orgaoExpedicaoRg;
	}

	public void setOrgaoExpedicaoRg(String orgaoExpedicaoRg) {
		this.orgaoExpedicaoRg = orgaoExpedicaoRg;
	}

	public String getLocalExpedicaoRg() {
		return localExpedicaoRg;
	}

	public void setLocalExpedicaoRg(String localExpedicaoRg) {
		this.localExpedicaoRg = localExpedicaoRg;
	}

	public Long getCdGrupCong() {
		return this.cdGrupCong;
	}

	public void setCdGrupCong(Long cdGrupCong) {
		this.cdGrupCong = cdGrupCong;
	}

	public String getNmClie() {
		return this.nmClie;
	}

	public void setNmClie(String nmClie) {
		this.nmClie = nmClie;
	}

	public String getNmRazaSocl() {
		return this.nmRazaSocl;
	}

	public void setNmRazaSocl(String nmRazaSocl) {
		this.nmRazaSocl = nmRazaSocl;
	}

	public String getNmFant() {
		return this.nmFant;
	}

	public void setNmFant(String nmFant) {
		this.nmFant = nmFant;
	}

	public String getNmCliePesq() {
		return this.nmCliePesq;
	}

	public void setNmCliePesq(String nmCliePesq) {
		this.nmCliePesq = nmCliePesq;
	}

	public Long getNrCpfCnpj() {
		return this.nrCpfCnpj;
	}

	public void setNrCpfCnpj(Long nrCpfCnpj) {
		this.nrCpfCnpj = nrCpfCnpj;
	}

	public String getTpPess() {
		return this.tpPess;
	}

	public void setTpPess(String tpPess) {
		this.tpPess = tpPess;
	}

	public Date getDtNascCnst() {
		return this.dtNascCnst;
	}

	public void setDtNascCnst(Date dtNascCnst) {
		this.dtNascCnst = dtNascCnst;
	}

	public String getTpSexo() {
		return this.tpSexo;
	}

	public void setTpSexo(String tpSexo) {
		this.tpSexo = tpSexo;
	}

	public String getInClieAtiv() {
		return this.inClieAtiv;
	}

	public void setInClieAtiv(String inClieAtiv) {
		this.inClieAtiv = inClieAtiv;
	}

	public String getInClieMpro() {
		return this.inClieMpro;
	}

	public void setInClieMpro(String inClieMpro) {
		this.inClieMpro = inClieMpro;
	}

	public String getInClieVinc() {
		return this.inClieVinc;
	}

	public void setInClieVinc(String inClieVinc) {
		this.inClieVinc = inClieVinc;
	}

	public String getInH21() {
		return this.inH21;
	}

	public void setInH21(String inH21) {
		this.inH21 = inH21;
	}

	public Boolean getTpRiscChurn() {
		return this.tpRiscChurn;
	}

	public void setTpRiscChurn(Boolean tpRiscChurn) {
		this.tpRiscChurn = tpRiscChurn;
	}

	public Date getDtClieDsde() {
		return this.dtClieDsde;
	}

	public void setDtClieDsde(Date dtClieDsde) {
		this.dtClieDsde = dtClieDsde;
	}

	public String getInCheqEspc() {
		return this.inCheqEspc;
	}

	public void setInCheqEspc(String inCheqEspc) {
		this.inCheqEspc = inCheqEspc;
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

	public String getCdSetoAec() {
		return this.cdSetoAec;
	}

	public void setCdSetoAec(String cdSetoAec) {
		this.cdSetoAec = cdSetoAec;
	}

	public String getCdRamoAec() {
		return this.cdRamoAec;
	}

	public void setCdRamoAec(String cdRamoAec) {
		this.cdRamoAec = cdRamoAec;
	}

	public String getCdAec() {
		return this.cdAec;
	}

	public void setCdAec(String cdAec) {
		this.cdAec = cdAec;
	}

	public String getCdSegmSecu() {
		return cdSegmSecu;
	}

	public void setCdSegmSecu(String cdSegmSecu) {
		this.cdSegmSecu = cdSegmSecu;
	}

	public String getCdSegmPote() {
		return cdSegmPote;
	}

	public void setCdSegmPote(String cdSegmPote) {
		this.cdSegmPote = cdSegmPote;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdPess == null) ? 0 : cdPess.hashCode());
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
		TbClie other = (TbClie) obj;
		if (cdPess == null) {
			if (other.cdPess != null)
				return false;
		} else if (!cdPess.equals(other.cdPess))
			return false;
		return true;
	}
}