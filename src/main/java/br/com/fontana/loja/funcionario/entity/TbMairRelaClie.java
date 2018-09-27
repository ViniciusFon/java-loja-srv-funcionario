package br.com.fontana.loja.funcionario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "TB_MAIR_RELA_CLIE", schema = "LOJA")
public class TbMairRelaClie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tbClie"))
	@GeneratedValue(generator = "generator")
	@Column(name = "CD_PESS", unique = true, nullable = false, precision = 8, scale = 0)
	private Long cdPess;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({@JoinColumn(name = "TP_UOR", referencedColumnName = "TP_UOR", nullable = false),
				  @JoinColumn(name = "CD_UOR", referencedColumnName = "CD_UOR", nullable = false) })
	private TbUorBncr tbUorBncr;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NR_MATR_FUNC", nullable = false)
	private TbFunc tbFunc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CD_CART", nullable = false)
	private TbCart tbCart;

	@Column(name = "NR_CNTA_CRRT", precision = 12, scale = 0)
	private Long nrCntaCrrt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_REFE_PROC", nullable = false, length = 7)
	private Date dtRefeProc;
	
	public TbMairRelaClie() {
	
	}
	
	public TbMairRelaClie(TbUorBncr tbUorBncr, TbFunc tbFunc, TbCart tbCart, Date dtRefeProc) {

		this.tbUorBncr = tbUorBncr;
		this.tbFunc = tbFunc;
		this.tbCart = tbCart;
		this.dtRefeProc = dtRefeProc;
	}
	
	public TbMairRelaClie(TbUorBncr tbUorBncr, TbFunc tbFunc, TbCart tbCart, Long nrCntaCrrt, Date dtRefeProc) {

		this.tbUorBncr = tbUorBncr;
		this.tbFunc = tbFunc;
		this.tbCart = tbCart;
		this.nrCntaCrrt = nrCntaCrrt;
		this.dtRefeProc = dtRefeProc;
	}
	

	public Long getCdPess() {
		return this.cdPess;
	}
	
	public void setCdPess(Long cdPess) {
		this.cdPess = cdPess;
	}

	public TbUorBncr getTbUorBncr() {
		return this.tbUorBncr;
	}
	
	public void setTbUorBncr(TbUorBncr tbUorBncr) {
		this.tbUorBncr = tbUorBncr;
	}
	

	public TbFunc getTbFunc() {
		return this.tbFunc;
	}
	
	public void setTbFunc(TbFunc tbFunc) {
		this.tbFunc = tbFunc;
	}
	

	public TbCart getTbCart() {
		return this.tbCart;
	}
	
	public void setTbCart(TbCart tbCart) {
		this.tbCart = tbCart;
	}
	

	public Long getNrCntaCrrt() {
		return this.nrCntaCrrt;
	}
	
	public void setNrCntaCrrt(Long nrCntaCrrt) {
		this.nrCntaCrrt = nrCntaCrrt;
	}
	

	public Date getDtRefeProc() {
		return this.dtRefeProc;
	}
	
	public void setDtRefeProc(Date dtRefeProc) {
		this.dtRefeProc = dtRefeProc;
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
		TbMairRelaClie other = (TbMairRelaClie) obj;
		if (cdPess == null) {
			if (other.cdPess != null)
				return false;
		} else if (!cdPess.equals(other.cdPess))
			return false;
		return true;
	}
	
}
 
