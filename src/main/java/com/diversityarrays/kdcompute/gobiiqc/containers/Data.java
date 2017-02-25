package com.diversityarrays.kdcompute.gobiiqc.containers;

import java.util.Arrays;

public class Data {
	final Long dataSetId;
	final String dataFile;
	final String directory;
	final String qualityFile;
	// BSP: note - the only caller actually provides the database id of the AnalysisJob
	final Long contactId;
	public Data(Long dataSetId, String dataFile, String directory, String qualityFile, Long contactId) {
		super();
		this.dataSetId = dataSetId;
		this.dataFile = dataFile;
		this.directory = directory;
		this.qualityFile = qualityFile;
		this.contactId = contactId;
	}
	public Long getDataSetId() {
		return dataSetId;
	}
	public String getDataFile() {
		return dataFile;
	}
	public String getDirectory() {
		return directory;
	}
	public String getQualityFile() {
		return qualityFile;
	}
	public Long getContactId() {
		return contactId;
	}

	@Override
	public String toString() {
		return String.join(",",Arrays.asList(
				"dataSetId="+dataSetId,
				"dataFile="+dataFile,
				"directory="+directory,
				"qualityFile="+qualityFile,
				"contactId="+contactId
				));
	}


}
