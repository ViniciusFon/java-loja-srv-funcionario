package br.com.fontana.loja.funcionario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TbUorBncrId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "TP_UOR", nullable = false, precision = 3, scale = 0)
	private Short tpUor;

	@Column(name = "CD_UOR", nullable = false, precision = 4, scale = 0)
	private Short cdUor;

	public TbUorBncrId() {
	}

	public TbUorBncrId(Short tpUor, Short cdUor) {
		this.tpUor = tpUor;
		this.cdUor = cdUor;
	}

	public Short getTpUor() {
		return this.tpUor;
	}

	public void setTpUor(Short tpUor) {
		this.tpUor = tpUor;
	}

	public Short getCdUor() {
		return this.cdUor;
	}

	public void setCdUor(Short cdUor) {
		this.cdUor = cdUor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbUorBncrId))
			return false;
		TbUorBncrId castOther = (TbUorBncrId) other;

		return (this.getTpUor() == castOther.getTpUor()) && (this.getCdUor() == castOther.getCdUor());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTpUor();
		result = 37 * result + this.getCdUor();
		return result;
	}

}
 
