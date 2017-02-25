package com.diversityarrays.kdcompute.gobiiqc.containers;

import java.util.Arrays;

public class Notification {
	final Payload payload;
	final Header header;
	public Notification(Payload payload, Header header) {
		super();
		this.payload = payload;
		this.header = header;
	}
	public Payload getPayload() {
		return payload;
	}
	public Header getHeader() {
		return header;
	}

	@Override
	public String toString() {
		return String.join("\n", Arrays.asList("payload="+payload,"header="+header));
	}
}
