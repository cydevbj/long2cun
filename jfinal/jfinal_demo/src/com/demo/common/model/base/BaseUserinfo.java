package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUserinfo<M extends BaseUserinfo<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setUserinfo(java.lang.String userinfo) {
		set("userinfo", userinfo);
		return (M)this;
	}

	public java.lang.String getUserinfo() {
		return get("userinfo");
	}

	public M setOauthtype(java.lang.String oauthtype) {
		set("oauthtype", oauthtype);
		return (M)this;
	}

	public java.lang.String getOauthtype() {
		return get("oauthtype");
	}

	public M setSessionid(java.lang.Integer sessionid) {
		set("sessionid", sessionid);
		return (M)this;
	}

	public java.lang.Integer getSessionid() {
		return get("sessionid");
	}

	public M setUserid(java.lang.Integer userid) {
		set("userid", userid);
		return (M)this;
	}

	public java.lang.Integer getUserid() {
		return get("userid");
	}

	public M setCreatetime(java.util.Date createtime) {
		set("createtime", createtime);
		return (M)this;
	}

	public java.util.Date getCreatetime() {
		return get("createtime");
	}

	public M setUpdatetime(java.util.Date updatetime) {
		set("updatetime", updatetime);
		return (M)this;
	}

	public java.util.Date getUpdatetime() {
		return get("updatetime");
	}

	public M setDiscard(java.lang.Integer discard) {
		set("discard", discard);
		return (M)this;
	}

	public java.lang.Integer getDiscard() {
		return get("discard");
	}

}
