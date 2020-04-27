package com.spring.test.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

	@Inject
	CdiDao cdidao;

	public CdiDao getCdidao() {
		return cdidao;
	}

	public void setCdidao(CdiDao cdidao) {
		this.cdidao = cdidao;
	}

}
