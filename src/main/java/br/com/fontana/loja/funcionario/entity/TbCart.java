package br.com.fontana.loja.funcionario.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_CART", schema = "FEC")
public class TbCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_CART", unique = true, nullable = false, length = 4)
	private String cdCart;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "TP_UOR", referencedColumnName = "TP_UOR", nullable = false), @JoinColumn(name = "CD_UOR", referencedColumnName = "CD_UOR", nullable = false) })
	private TbUorBncr tbUorBncr;

	@Column(name = "TP_CART", length = 3)
	private String tpCart;

	@Column(name = "TP_CRAL_CART", precision = 3, scale = 0)
	private Short tpCralCart;

	@Column(name = "CD_CRAL_CART", precision = 4, scale = 0)
	private Short cdCralCart;

	@Column(name = "CD_SITU_CART", length = 1)
	private String cdSituCart;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INCL_REGT", nullable = false, length = 7)
	private Date dhInclRegt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_ULTI_ATLZ_REGT", nullable = false, length = 7)
	private Date dhUltiAtlzRegt;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbCart")
	private List<TbMairRelaClie> tbMairRelaClies = new ArrayList<>(0);

	public TbCart() {
	}


	public String getCdCart() {
		return this.cdCart;
	}

	public void setCdCart(String cdCart) {
		this.cdCart = cdCart;
	}

	public TbUorBncr getTbUorBncr() {
		return this.tbUorBncr;
	}

	public void setTbUorBncr(TbUorBncr tbUorBncr) {
		this.tbUorBncr = tbUorBncr;
	}


	public String getTpCart() {
		return this.tpCart;
	}

	public void setTpCart(String tpCart) {
		this.tpCart = tpCart;
	}


	public Short getTpCralCart() {
		return this.tpCralCart;
	}

	public void setTpCralCart(Short tpCralCart) {
		this.tpCralCart = tpCralCart;
	}


	public Short getCdCralCart() {
		return this.cdCralCart;
	}

	public void setCdCralCart(Short cdCralCart) {
		this.cdCralCart = cdCralCart;
	}


	public String getCdSituCart() {
		return this.cdSituCart;
	}

	public void setCdSituCart(String cdSituCart) {
		this.cdSituCart = cdSituCart;
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


	public List<TbMairRelaClie> getTbMairRelaClies() {
		return this.tbMairRelaClies;
	}

	public void setTbMairRelaClies(List<TbMairRelaClie> tbMairRelaClies) {
		this.tbMairRelaClies = tbMairRelaClies;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdCart == null) ? 0 : cdCart.hashCode());
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
		TbCart other = (TbCart) obj;
		if (cdCart == null) {
			if (other.cdCart != null)
				return false;
		} else if (!cdCart.equals(other.cdCart))
			return false;
		return true;
	}

}
 
