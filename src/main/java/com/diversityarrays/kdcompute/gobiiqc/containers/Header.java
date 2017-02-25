package com.diversityarrays.kdcompute.gobiiqc.containers;

public class Header {
	DTOHeaderAuth dtoHeaderAuth;

	public Header(DTOHeaderAuth dtoHeaderAuth) {
		super();
		this.dtoHeaderAuth = dtoHeaderAuth;
	}

	public DTOHeaderAuth getDtoHeaderAuth() {
		return dtoHeaderAuth;
	}

	public void setDtoHeaderAuth(DTOHeaderAuth dtoHeaderAuth) {
		this.dtoHeaderAuth = dtoHeaderAuth;
	}

	@Override
	public String toString() {
	return "dtoHeaderAuth=("+dtoHeaderAuth+")";
	}

}
