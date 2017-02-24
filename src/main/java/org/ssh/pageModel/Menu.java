package org.ssh.pageModel;


import org.ssh.model.Tmenu;

import java.math.BigDecimal;

public class Menu {
	private String cid;
	private Tmenu tmenu;
	private String ciconcls;
	private String cname;
	private BigDecimal cseq;
	private String curl;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Tmenu getTmenu() {
		return tmenu;
	}
	public void setTmenu(Tmenu tmenu) {
		this.tmenu = tmenu;
	}
	public String getCiconcls() {
		return ciconcls;
	}
	public void setCiconcls(String ciconcls) {
		this.ciconcls = ciconcls;
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
}
