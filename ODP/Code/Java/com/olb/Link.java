package com.olb;

import com.ibm.xsp.component.UIViewRootEx2;

public class Link {
	private String label;
	private String url;

	public Link(String label, String url) {
		this.label = label;
		this.url = url;
	}

	public String getLabel() {
		return label;
	}

	public String getUrl() {
		return url;
	}

	public String getActive(UIViewRootEx2 view) {
		if (view.getPageName().indexOf(this.url) != -1) {
			return "active";
		}
		return "";
	}

}
