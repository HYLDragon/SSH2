package org.ssh.pageModel;
import java.math.BigDecimal;

public class Auth {
	private String cid;
	private String cdesc;
	private String cname;
	private BigDecimal cseq;
	private String curl;
	
	private String editorValue;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public BigDecimal getCseq() {
		return cseq;
	}
	public void setCseq(BigDecimal cseq) {
		this.cseq = cseq;
	}
	public String getCurl() {
		return curl;
	}
	public void setCurl(String curl) {
		this.curl = curl;
	}
	/**
	 * @return the editorValue
	 */
	public String getEditorValue() {
		return editorValue;
	}
	/**
	 * @param editorValue the editorValue to set
	 */
	public void setEditorValue(String editorValue) {
		this.editorValue = editorValue;
	}
}
