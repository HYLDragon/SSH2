package org.ssh.pageModel;

import java.sql.Clob;
import java.util.Date;

public class Bug {
	private String cid;
	private String cname;
	private Clob cdesc;
	private Date ccreatedatetime;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Clob getCdesc() {
		return cdesc;
	}
	public void setCdesc(Clob cdesc) {
		this.cdesc = cdesc;
	}
	public Date getCcreatedatetime() {
		return ccreatedatetime;
	}
	public void setCcreatedatetime(Date ccreatedatetime) {
		this.ccreatedatetime = ccreatedatetime;
	}
}
