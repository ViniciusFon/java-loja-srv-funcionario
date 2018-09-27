package br.com.fontana.loja.funcionario.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_UOR_BNCR", schema = "LOJA")
public class TbUorBncr implements Serializable {


	private static final long serialVersionUID = 1L;
	private TbUorBncrId id;
	private TbUorBncr tbUorBncrByFkUorBncr01;
	private TbUorBncr tbUorBncrByFkUorBncr02;
	private TbUorBncr tbUorBncrByFkUorBncr03;
	private String nmTipoUor;
	private String nmUor;
	private Short cdEmprCral;
	private Short tpCral;
	private Short cdCral;
	private Date dtEnce;
	private Short tpUorSperSele;
	private Short cdUorSperSele;
	private Short tpUorNive1;
	private Short cdUorNive1;
	private String nmUorNive1;
	private Short tpUorNive2;
	private Short cdUorNive2;
	private String nmUorNive2;
	private Short tpUorNive3;
	private Short cdUorNive3;
	private String nmUorNive3;
	private Short tpUorNive4;
	private Short cdUorNive4;
	private String nmUorNive4;
	private Short tpUorNive5;
	private Short cdUorNive5;
	private String nmUorNive5;
	private Short tpUorNive6;
	private Short cdUorNive6;
	private String nmUorNive6;
	private Short tpUorNive7;
	private Short cdUorNive7;
	private String nmUorNive7;
	private Short tpUorNive8;
	private Short cdUorNive8;
	private String nmUorNive8;
	private Short tpUorNive9;
	private Short cdUorNive9;
	private String nmUorNive9;
	private Short tpUorNive10;
	private Short cdUorNive10;
	private String nmUorNive10;
	private String nmUorSperSele;
	private String tpClafAltaRend;
	private String nmClafAltaRend;
	private String tpClafMicrRgaoSele;
	private String nmClafMicrRgaoSele;
	private Date dhInclRegt;
	private Date dhUltiAtlzRegt;
	private List<TbCart> tbCarts = new ArrayList<>(0);
	private List<TbMairRelaClie> tbMairRelaClies = new ArrayList<>(0);
	private List<TbUorBncr> tbUorBncrsForFkUorBncr03 = new ArrayList<>(0);
	private List<TbUorBncr> tbUorBncrsForFkUorBncr02 = new ArrayList<>(0);
	private List<TbFunc> tbFuncs = new ArrayList<>(0);
	private List<TbUorBncr> tbUorBncrsForFkUorBncr01 = new ArrayList<>(0);

	public TbUorBncr() {
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "tpUor", column = @Column(name = "TP_UOR", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "cdUor", column = @Column(name = "CD_UOR", nullable = false, precision = 4, scale = 0)) })
	public TbUorBncrId getId() {
		return this.id;
	}

	public void setId(TbUorBncrId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "TP_UOR_AGEN_SPER", referencedColumnName = "TP_UOR"), @JoinColumn(name = "CD_UOR_AGEN_SPER", referencedColumnName = "CD_UOR") })
	public TbUorBncr getTbUorBncrByFkUorBncr01() {
		return this.tbUorBncrByFkUorBncr01;
	}

	public void setTbUorBncrByFkUorBncr01(TbUorBncr tbUorBncrByFkUorBncr01) {
		this.tbUorBncrByFkUorBncr01 = tbUorBncrByFkUorBncr01;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "TP_UOR_COME", referencedColumnName = "TP_UOR"), @JoinColumn(name = "CD_UOR_COME", referencedColumnName = "CD_UOR") })
	public TbUorBncr getTbUorBncrByFkUorBncr02() {
		return this.tbUorBncrByFkUorBncr02;
	}

	public void setTbUorBncrByFkUorBncr02(TbUorBncr tbUorBncrByFkUorBncr02) {
		this.tbUorBncrByFkUorBncr02 = tbUorBncrByFkUorBncr02;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "TP_UOR_FUNC", referencedColumnName = "TP_UOR"), @JoinColumn(name = "CD_UOR_FUNC", referencedColumnName = "CD_UOR") })
	public TbUorBncr getTbUorBncrByFkUorBncr03() {
		return this.tbUorBncrByFkUorBncr03;
	}

	public void setTbUorBncrByFkUorBncr03(TbUorBncr tbUorBncrByFkUorBncr03) {
		this.tbUorBncrByFkUorBncr03 = tbUorBncrByFkUorBncr03;
	}

	@Column(name = "NM_TIPO_UOR", nullable = false, length = 20)
	public String getNmTipoUor() {
		return this.nmTipoUor;
	}

	public void setNmTipoUor(String nmTipoUor) {
		this.nmTipoUor = nmTipoUor;
	}

	@Column(name = "NM_UOR", nullable = false, length = 45)
	public String getNmUor() {
		return this.nmUor;
	}

	public void setNmUor(String nmUor) {
		this.nmUor = nmUor;
	}

	@Column(name = "CD_EMPR_CRAL", precision = 4, scale = 0)
	public Short getCdEmprCral() {
		return this.cdEmprCral;
	}

	public void setCdEmprCral(Short cdEmprCral) {
		this.cdEmprCral = cdEmprCral;
	}

	@Column(name = "TP_CRAL", precision = 3, scale = 0)
	public Short getTpCral() {
		return this.tpCral;
	}

	public void setTpCral(Short tpCral) {
		this.tpCral = tpCral;
	}

	@Column(name = "CD_CRAL", precision = 4, scale = 0)
	public Short getCdCral() {
		return this.cdCral;
	}

	public void setCdCral(Short cdCral) {
		this.cdCral = cdCral;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ENCE", length = 7)
	public Date getDtEnce() {
		return this.dtEnce;
	}

	public void setDtEnce(Date dtEnce) {
		this.dtEnce = dtEnce;
	}

	@Column(name = "TP_UOR_SPER_SELE", precision = 3, scale = 0)
	public Short getTpUorSperSele() {
		return this.tpUorSperSele;
	}

	public void setTpUorSperSele(Short tpUorSperSele) {
		this.tpUorSperSele = tpUorSperSele;
	}

	@Column(name = "CD_UOR_SPER_SELE", precision = 4, scale = 0)
	public Short getCdUorSperSele() {
		return this.cdUorSperSele;
	}

	public void setCdUorSperSele(Short cdUorSperSele) {
		this.cdUorSperSele = cdUorSperSele;
	}

	@Column(name = "TP_UOR_NIVE_1", precision = 4, scale = 0)
	public Short getTpUorNive1() {
		return this.tpUorNive1;
	}

	public void setTpUorNive1(Short tpUorNive1) {
		this.tpUorNive1 = tpUorNive1;
	}

	@Column(name = "CD_UOR_NIVE_1", precision = 4, scale = 0)
	public Short getCdUorNive1() {
		return this.cdUorNive1;
	}

	public void setCdUorNive1(Short cdUorNive1) {
		this.cdUorNive1 = cdUorNive1;
	}

	@Column(name = "NM_UOR_NIVE_1", length = 20)
	public String getNmUorNive1() {
		return this.nmUorNive1;
	}

	public void setNmUorNive1(String nmUorNive1) {
		this.nmUorNive1 = nmUorNive1;
	}

	@Column(name = "TP_UOR_NIVE_2", precision = 4, scale = 0)
	public Short getTpUorNive2() {
		return this.tpUorNive2;
	}

	public void setTpUorNive2(Short tpUorNive2) {
		this.tpUorNive2 = tpUorNive2;
	}

	@Column(name = "CD_UOR_NIVE_2", precision = 4, scale = 0)
	public Short getCdUorNive2() {
		return this.cdUorNive2;
	}

	public void setCdUorNive2(Short cdUorNive2) {
		this.cdUorNive2 = cdUorNive2;
	}

	@Column(name = "NM_UOR_NIVE_2", length = 20)
	public String getNmUorNive2() {
		return this.nmUorNive2;
	}

	public void setNmUorNive2(String nmUorNive2) {
		this.nmUorNive2 = nmUorNive2;
	}

	@Column(name = "TP_UOR_NIVE_3", precision = 4, scale = 0)
	public Short getTpUorNive3() {
		return this.tpUorNive3;
	}

	public void setTpUorNive3(Short tpUorNive3) {
		this.tpUorNive3 = tpUorNive3;
	}

	@Column(name = "CD_UOR_NIVE_3", precision = 4, scale = 0)
	public Short getCdUorNive3() {
		return this.cdUorNive3;
	}

	public void setCdUorNive3(Short cdUorNive3) {
		this.cdUorNive3 = cdUorNive3;
	}

	@Column(name = "NM_UOR_NIVE_3", length = 20)
	public String getNmUorNive3() {
		return this.nmUorNive3;
	}

	public void setNmUorNive3(String nmUorNive3) {
		this.nmUorNive3 = nmUorNive3;
	}

	@Column(name = "TP_UOR_NIVE_4", precision = 4, scale = 0)
	public Short getTpUorNive4() {
		return this.tpUorNive4;
	}

	public void setTpUorNive4(Short tpUorNive4) {
		this.tpUorNive4 = tpUorNive4;
	}

	@Column(name = "CD_UOR_NIVE_4", precision = 4, scale = 0)
	public Short getCdUorNive4() {
		return this.cdUorNive4;
	}

	public void setCdUorNive4(Short cdUorNive4) {
		this.cdUorNive4 = cdUorNive4;
	}

	@Column(name = "NM_UOR_NIVE_4", length = 20)
	public String getNmUorNive4() {
		return this.nmUorNive4;
	}

	public void setNmUorNive4(String nmUorNive4) {
		this.nmUorNive4 = nmUorNive4;
	}

	@Column(name = "TP_UOR_NIVE_5", precision = 4, scale = 0)
	public Short getTpUorNive5() {
		return this.tpUorNive5;
	}

	public void setTpUorNive5(Short tpUorNive5) {
		this.tpUorNive5 = tpUorNive5;
	}

	@Column(name = "CD_UOR_NIVE_5", precision = 4, scale = 0)
	public Short getCdUorNive5() {
		return this.cdUorNive5;
	}

	public void setCdUorNive5(Short cdUorNive5) {
		this.cdUorNive5 = cdUorNive5;
	}

	@Column(name = "NM_UOR_NIVE_5", length = 20)
	public String getNmUorNive5() {
		return this.nmUorNive5;
	}

	public void setNmUorNive5(String nmUorNive5) {
		this.nmUorNive5 = nmUorNive5;
	}

	@Column(name = "TP_UOR_NIVE_6", precision = 4, scale = 0)
	public Short getTpUorNive6() {
		return this.tpUorNive6;
	}

	public void setTpUorNive6(Short tpUorNive6) {
		this.tpUorNive6 = tpUorNive6;
	}

	@Column(name = "CD_UOR_NIVE_6", precision = 4, scale = 0)
	public Short getCdUorNive6() {
		return this.cdUorNive6;
	}

	public void setCdUorNive6(Short cdUorNive6) {
		this.cdUorNive6 = cdUorNive6;
	}

	@Column(name = "NM_UOR_NIVE_6", length = 20)
	public String getNmUorNive6() {
		return this.nmUorNive6;
	}

	public void setNmUorNive6(String nmUorNive6) {
		this.nmUorNive6 = nmUorNive6;
	}

	@Column(name = "TP_UOR_NIVE_7", precision = 4, scale = 0)
	public Short getTpUorNive7() {
		return this.tpUorNive7;
	}

	public void setTpUorNive7(Short tpUorNive7) {
		this.tpUorNive7 = tpUorNive7;
	}

	@Column(name = "CD_UOR_NIVE_7", precision = 4, scale = 0)
	public Short getCdUorNive7() {
		return this.cdUorNive7;
	}

	public void setCdUorNive7(Short cdUorNive7) {
		this.cdUorNive7 = cdUorNive7;
	}

	@Column(name = "NM_UOR_NIVE_7", length = 20)
	public String getNmUorNive7() {
		return this.nmUorNive7;
	}

	public void setNmUorNive7(String nmUorNive7) {
		this.nmUorNive7 = nmUorNive7;
	}

	@Column(name = "TP_UOR_NIVE_8", precision = 4, scale = 0)
	public Short getTpUorNive8() {
		return this.tpUorNive8;
	}

	public void setTpUorNive8(Short tpUorNive8) {
		this.tpUorNive8 = tpUorNive8;
	}

	@Column(name = "CD_UOR_NIVE_8", precision = 4, scale = 0)
	public Short getCdUorNive8() {
		return this.cdUorNive8;
	}

	public void setCdUorNive8(Short cdUorNive8) {
		this.cdUorNive8 = cdUorNive8;
	}

	@Column(name = "NM_UOR_NIVE_8", length = 20)
	public String getNmUorNive8() {
		return this.nmUorNive8;
	}

	public void setNmUorNive8(String nmUorNive8) {
		this.nmUorNive8 = nmUorNive8;
	}

	@Column(name = "TP_UOR_NIVE_9", precision = 4, scale = 0)
	public Short getTpUorNive9() {
		return this.tpUorNive9;
	}

	public void setTpUorNive9(Short tpUorNive9) {
		this.tpUorNive9 = tpUorNive9;
	}

	@Column(name = "CD_UOR_NIVE_9", precision = 4, scale = 0)
	public Short getCdUorNive9() {
		return this.cdUorNive9;
	}

	public void setCdUorNive9(Short cdUorNive9) {
		this.cdUorNive9 = cdUorNive9;
	}

	@Column(name = "NM_UOR_NIVE_9", length = 20)
	public String getNmUorNive9() {
		return this.nmUorNive9;
	}

	public void setNmUorNive9(String nmUorNive9) {
		this.nmUorNive9 = nmUorNive9;
	}

	@Column(name = "TP_UOR_NIVE_10", precision = 4, scale = 0)
	public Short getTpUorNive10() {
		return this.tpUorNive10;
	}

	public void setTpUorNive10(Short tpUorNive10) {
		this.tpUorNive10 = tpUorNive10;
	}

	@Column(name = "CD_UOR_NIVE_10", precision = 4, scale = 0)
	public Short getCdUorNive10() {
		return this.cdUorNive10;
	}

	public void setCdUorNive10(Short cdUorNive10) {
		this.cdUorNive10 = cdUorNive10;
	}

	@Column(name = "NM_UOR_NIVE_10", length = 20)
	public String getNmUorNive10() {
		return this.nmUorNive10;
	}

	public void setNmUorNive10(String nmUorNive10) {
		this.nmUorNive10 = nmUorNive10;
	}

	@Column(name = "NM_UOR_SPER_SELE", length = 45)
	public String getNmUorSperSele() {
		return this.nmUorSperSele;
	}

	public void setNmUorSperSele(String nmUorSperSele) {
		this.nmUorSperSele = nmUorSperSele;
	}

	@Column(name = "TP_CLAF_ALTA_REND", length = 2)
	public String getTpClafAltaRend() {
		return this.tpClafAltaRend;
	}

	public void setTpClafAltaRend(String tpClafAltaRend) {
		this.tpClafAltaRend = tpClafAltaRend;
	}

	@Column(name = "NM_CLAF_ALTA_REND", length = 20)
	public String getNmClafAltaRend() {
		return this.nmClafAltaRend;
	}

	public void setNmClafAltaRend(String nmClafAltaRend) {
		this.nmClafAltaRend = nmClafAltaRend;
	}

	@Column(name = "TP_CLAF_MICR_RGAO_SELE", length = 2)
	public String getTpClafMicrRgaoSele() {
		return this.tpClafMicrRgaoSele;
	}

	public void setTpClafMicrRgaoSele(String tpClafMicrRgaoSele) {
		this.tpClafMicrRgaoSele = tpClafMicrRgaoSele;
	}

	@Column(name = "NM_CLAF_MICR_RGAO_SELE", length = 20)
	public String getNmClafMicrRgaoSele() {
		return this.nmClafMicrRgaoSele;
	}

	public void setNmClafMicrRgaoSele(String nmClafMicrRgaoSele) {
		this.nmClafMicrRgaoSele = nmClafMicrRgaoSele;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INCL_REGT", nullable = false, length = 7)
	public Date getDhInclRegt() {
		return this.dhInclRegt;
	}

	public void setDhInclRegt(Date dhInclRegt) {
		this.dhInclRegt = dhInclRegt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_ULTI_ATLZ_REGT", nullable = false, length = 7)
	public Date getDhUltiAtlzRegt() {
		return this.dhUltiAtlzRegt;
	}

	public void setDhUltiAtlzRegt(Date dhUltiAtlzRegt) {
		this.dhUltiAtlzRegt = dhUltiAtlzRegt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUorBncr")
	public List<TbCart> getTbCarts() {
		return this.tbCarts;
	}

	public void setTbCarts(List<TbCart> tbCarts) {
		this.tbCarts = tbCarts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUorBncr")
	public List<TbMairRelaClie> getTbMairRelaClies() {
		return this.tbMairRelaClies;
	}

	public void setTbMairRelaClies(List<TbMairRelaClie> tbMairRelaClies) {
		this.tbMairRelaClies = tbMairRelaClies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUorBncrByFkUorBncr03")
	public List<TbUorBncr> getTbUorBncrsForFkUorBncr03() {
		return this.tbUorBncrsForFkUorBncr03;
	}

	public void setTbUorBncrsForFkUorBncr03(List<TbUorBncr> tbUorBncrsForFkUorBncr03) {
		this.tbUorBncrsForFkUorBncr03 = tbUorBncrsForFkUorBncr03;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUorBncrByFkUorBncr02")
	public List<TbUorBncr> getTbUorBncrsForFkUorBncr02() {
		return this.tbUorBncrsForFkUorBncr02;
	}

	public void setTbUorBncrsForFkUorBncr02(List<TbUorBncr> tbUorBncrsForFkUorBncr02) {
		this.tbUorBncrsForFkUorBncr02 = tbUorBncrsForFkUorBncr02;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUorBncr")
	public List<TbFunc> getTbFuncs() {
		return this.tbFuncs;
	}

	public void setTbFuncs(List<TbFunc> tbFuncs) {
		this.tbFuncs = tbFuncs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbUorBncrByFkUorBncr01")
	public List<TbUorBncr> getTbUorBncrsForFkUorBncr01() {
		return this.tbUorBncrsForFkUorBncr01;
	}

	public void setTbUorBncrsForFkUorBncr01(List<TbUorBncr> tbUorBncrsForFkUorBncr01) {
		this.tbUorBncrsForFkUorBncr01 = tbUorBncrsForFkUorBncr01;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TbUorBncr other = (TbUorBncr) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
 
