package edu.umb.cs680.hw09;

import java.time.LocalDateTime;

public class ApfsFile extends ApfsElement {

	public ApfsFile(ApfsDirectory parent, String name, int size, LocalDateTime createdTime, String ownerName,
			LocalDateTime lastModified) {
		super(parent, name, size, createdTime, ownerName, lastModified);
		parent.appendChild(this);
	}


	protected boolean isDirectory() {
		return false;
	}
	

	protected boolean isFile() {
		return true;
	}
	

	protected boolean isLink() {
		return false;
	}	
}
