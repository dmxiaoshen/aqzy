package com.bell.aqzy.api.model;

import com.bell.common.api.model.AbstractModel;

public class Role extends AbstractModel {
	/** */
	private static final long serialVersionUID = -8202267904303234693L;

	private String id;

	private String code;

	private String name;

	private String description;

	private Integer sort;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

}