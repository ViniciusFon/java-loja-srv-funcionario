package br.com.fontana.loja.funcionario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TbFuncCartId implements Serializable {

	private static final long serialVersionUID = -5535450902123472393L;
	
	@Column(name = "CD_CART", nullable = false, length = 4)
	private String cdCart;
	
	@Column(name = "NR_MATR_FUNC", nullable = false, precision = 8, scale = 0)
	private Long nrMatrFunc;

	public TbFuncCartId() {
	}

	public TbFuncCartId(String cdCart, Long nrMatrFunc) {
		this.cdCart = cdCart;
		this.nrMatrFunc = nrMatrFunc;
	}

	
	public String getCdCart() {
		return this.cdCart;
	}

	public void setCdCart(String cdCart) {
		this.cdCart = cdCart;
	}

	
	public Long getNrMatrFunc() {
		return this.nrMatrFunc;
	}

	public void setNrMatrFunc(Long nrMatrFunc) {
		this.nrMatrFunc = nrMatrFunc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdCart == null) ? 0 : cdCart.hashCode());
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
		TbFuncCartId other = (TbFuncCartId) obj;
		if (cdCart == null) {
			if (other.cdCart != null)
				return false;
		} else if (!cdCart.equals(other.cdCart))
			return false;
		if (nrMatrFunc == null) {
			if (other.nrMatrFunc != null)
				return false;
		} else if (!nrMatrFunc.equals(other.nrMatrFunc))
			return false;
		return true;
	}

}
 
