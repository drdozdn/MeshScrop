package com.softengine.free.MeshScrop.parse;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.softengine.free.MeshScrop.model.Disease;

public class ParseDetailsBD {
	private InputStream inputStream;

	public ParseDetailsBD(InputStream inputStream) {
		super();
		this.inputStream = inputStream;
	}
	
	public Disease getDiseases() throws Exception {
		try {
			String context = convertString();
			return DiseaseCvt.getDisease(context);
		} catch (IOException e) {
			throw new Exception(""+this.getClass().getName()+ " hata veren class "+ e.getMessage());
		}		
	}

	private String convertString() throws IOException {
		return IOUtils.toString(inputStream,"ISO-8859-1");
	}

}
