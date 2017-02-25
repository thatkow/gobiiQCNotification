package com.diversityarrays.kdcompute.gobiiqc.containers;

import java.util.List;
import java.util.stream.Collectors;

public class Payload {
	final List<Data> data;

	public Payload(List<Data> data) {
		this.data = data;
	}

	public List<Data> getData() {
		return data;
	}

	@Override
	public String toString() {
		return "data="+String.join("\n", data.stream().map(e -> e.toString()).collect(Collectors.toList()));
	}

}
