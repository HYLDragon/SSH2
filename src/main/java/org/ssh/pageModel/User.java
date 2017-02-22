package org.ssh.pageModel;

import java.util.Date;

public class User {
	private String cid;
	private Date ccreatedatetime;
	private Date cmodifydatetime;
	
	private String createdatetime;
	private String modifydatetime;
	private String cname;
	private String cpwd;
	private String ip;// IP地址
	
	private String roleId;
	private String roleNames;
	private String authNames;
	
	private String ids;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Date getCcreatedatetime() {
		return ccreatedatetime;
	}
	public void setCcreatedatetime(Date ccreatedatetime) {
		this.ccreatedatetime = ccreatedatetime;
	}
	public Date getCmodifydatetime() {
		return cmodifydatetime;
	}
	public void setCmodifydatetime(Date cmodifydatetime) {
		this.cmodifydatetime = cmodifydatetime;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getRoleNames() {
		return roleNames;
	}
	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}
	public String getAuthNames() {
		return authNames;
	}
	public void setAuthNames(String authNames) {
		this.authNames = authNames;
	}
	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the ids
	 */
	public String getIds() {
		return ids;
	}
	/**
	 * @param ids the ids to set
	 */
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getCreatedatetime() {
		return createdatetime;
	}
	public void setCreatedatetime(String createdatetime) {
		this.createdatetime = createdatetime;
	}
	public String getModifydatetime() {
		return modifydatetime;
	}
	public void setModifydatetime(String modifydatetime) {
		this.modifydatetime = modifydatetime;
	}
}
