package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AutoCompleteBean {
	private String value;
	private List<String> values;
	private boolean value1;
	
	public List<String> completeMethod(String query) {
		List<String> lista = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			lista.add(query + Math.random());
		}
		return lista;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public boolean isValue1() {
		return value1;
	}

	public void setValue1(boolean value1) {
		this.value1 = value1;
	}
}
