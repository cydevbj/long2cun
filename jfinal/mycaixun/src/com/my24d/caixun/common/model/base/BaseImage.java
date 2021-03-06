package com.my24d.caixun.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseImage<M extends BaseImage<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setPath(java.lang.String path) {
		set("path", path);
		return (M)this;
	}

	public java.lang.String getPath() {
		return get("path");
	}

	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}

	public java.lang.String getType() {
		return get("type");
	}

	public M setPosition(java.lang.Integer position) {
		set("position", position);
		return (M)this;
	}

	public java.lang.Integer getPosition() {
		return get("position");
	}

	public M setBlogid(java.lang.Integer blogid) {
		set("blogid", blogid);
		return (M)this;
	}

	public java.lang.Integer getBlogid() {
		return get("blogid");
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

	public M setDiscard(java.lang.Boolean discard) {
		set("discard", discard);
		return (M)this;
	}

	public java.lang.Boolean getDiscard() {
		return get("discard");
	}

}
