package com.olb;

import java.util.ArrayList;
import java.util.List;

public class PageLinks {
	private List<Link> links = new ArrayList<Link>();

	public PageLinks() {
		links.add(new Link("Start", "index.xsp"));
		links.add(new Link("Documents", "documents.xsp"));
		links.add(new Link("Messages", "inbox.xsp"));
	}

	public List<Link> getLinks() {
		return links;
	}
}
