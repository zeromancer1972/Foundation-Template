package com.olb;

import java.util.ArrayList;
import java.util.List;

public class UtilityLinks {
	private List<Link> links = new ArrayList<Link>();

	public UtilityLinks() {
		links.add(new Link("Help", "help.xsp"));
	}

	public List<Link> getLinks() {
		return links;
	}
}
