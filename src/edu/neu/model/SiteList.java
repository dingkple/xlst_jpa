package edu.neu.model;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "siteList")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SiteList {
	@XmlElement(name="site")
	private List<Site> siteList;

	public List<Site> getSiteList() {
		return siteList;
	}
	public void setSiteList(List<Site> siteList) {
		this.siteList = siteList;
	}
	
	public SiteList(List<Site> siteList) {
		super();
		this.siteList = siteList;
	}
	
	public SiteList() {
		super();
	}
}
