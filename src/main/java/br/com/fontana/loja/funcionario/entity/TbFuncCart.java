package br.com.fontana.loja.funcionario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_FUNC_CART", schema = "LOJA")
public class TbFuncCart implements Serializable {

	private static final long serialVersionUID = -4871325885729608412L;
	
	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "cdCart", column = @Column(name = "CD_CART", nullable = false, length = 4)),
						  @AttributeOverride(name = "nrMatrFunc", column = @Column(name = "NR_MATR_FUNC", nullable = false, precision = 8, scale = 0)) })
	private TbFuncCartId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NR_MATR_FUNC", nullable = false, insertable = false, updatable = false)
	private TbFunc tbFunc;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CD_CART", nullable = false, insertable = false, updatable = false)
	private TbCart tbCart;
	
	@Column(name = "NR_MATR_USUA_INCL", nullable = false, precision = 8, scale = 0)
	private Long nrMatrUsuaIncl;
	
	@Column(name = "NR_MATR_ULTI_ATLZ", precision = 8, scale = 0)
	private Integer nrMatrUltiAtlz;
	
	@Column(name = "IN_GERE_SELE", length = 1)
	private String inGereSele;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INCL_REGT", nullable = false, length = 7)
	private Date dhInclRegt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_ULTI_ATLZ_REGT", nullable = false, length = 7)
	private Date dhUltiAtlzRegt;

	public TbFuncCart() {
	}
	
	public TbFuncCart(TbFuncCartId id) {
		super();
		this.id = id;
	}
	
	public TbFuncCartId getId() {
		return this.id;
	}

	public void setId(TbFuncCartId id) {
		this.id = id;
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
	
	public Long getNrMatrUsuaIncl() {
		return this.nrMatrUsuaIncl;
	}

	public void setNrMatrUsuaIncl(Long nrMatrUsuaIncl) {
		this.nrMatrUsuaIncl = nrMatrUsuaIncl;
	}
	
	public Integer getNrMatrUltiAtlz() {
		return this.nrMatrUltiAtlz;
	}

	public void setNrMatrUltiAtlz(Integer nrMatrUltiAtlz) {
		this.nrMatrUltiAtlz = nrMatrUltiAtlz;
	}
	
	public String getInGereSele() {
		return this.inGereSele;
	}

	public void setInGereSele(String inGereSele) {
		this.inGereSele = inGereSele;
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
		TbFuncCart other = (TbFuncCart) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
 
