/**
 * 
 */
package org.flod.service.dto;

/**
 * @author Erik van Ingne
 * 
 */
public class FetchLodUriRequest {
	private String codelist;
	private String code;

	public String getCodelist() {
		return codelist;
	}

	public void setCodelist(String codelist) {
		this.codelist = codelist;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
