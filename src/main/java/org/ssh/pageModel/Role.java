package org.ssh.pageModel;

public class Role {
	private String cid;
	private String cdesc;
	private String cname;
	private String authName;
	private String authId;
	private boolean selected;
	
	private String editorValue;
	
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
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
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}
	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
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
