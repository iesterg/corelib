/*
 * Copyright 2007-2012 The Europeana Foundation
 *
 *  Licenced under the EUPL, Version 1.1 (the "Licence") and subsequent versions as approved
 *  by the European Commission;
 *  You may not use this work except in compliance with the Licence.
 * 
 *  You may obtain a copy of the Licence at:
 *  http://joinup.ec.europa.eu/software/page/eupl
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the Licence is distributed on an "AS IS" basis, without warranties or conditions of
 *  any kind, either express or implied.
 *  See the Licence for the specific language governing permissions and limitations under
 *  the Licence.
 */
package eu.europeana.corelib.solr.entity;

import java.util.Map;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;

/**
 * @see eu.europeana.corelib.definitions.solr.entity.Timespan
 * @author Yorgos.Mamakis@ kb.nl
 *
 */

@Entity("Timespan")
public class TimespanImpl implements
		eu.europeana.corelib.definitions.solr.entity.Timespan {

	@Id ObjectId id;
	private Map<String,String> prefLabel;
	private Map<String,String> altLabel;
	private String[] note;
	private String begin;
	private String end;
	private String[] isPartOf;
	@Indexed(unique=true)
	private String about;
	
	@Override	
	public String getAbout() {
		return about;
	}

	@Override
	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public Map<String,String> getPrefLabel() {
		return this.prefLabel;
	}

	@Override
	public Map<String,String> getAltLabel() {
		return this.altLabel;
	}

	@Override
	public String[] getNote() {
		return this.note;
	}

	@Override
	public String getBegin() {
		return this.begin;
	}

	@Override
	public String getEnd() {
		return this.end;
	}

	@Override
	public String[] getIsPartOf() {
		return this.isPartOf;
	}

	@Override
	public ObjectId getId() {
		return this.id;
	}
	@Override
	public void setId(ObjectId id) {
		this.id =id;
	}

	@Override
	public void setPrefLabel(Map<String,String> prefLabel) {
		this.prefLabel = prefLabel;
	}
	
	@Override
	public void setAltLabel(Map<String,String> altLabel) {
		this.altLabel = altLabel;
	}
	
	@Override
	public void setNote(String[] note) {
		this.note = note.clone();
	}

	@Override
	public void setBegin(String begin) {
		this.begin = begin;
	}

	@Override
	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public void setIsPartOf(String[] isPartOf) {
		this.isPartOf = isPartOf.clone();
	}
	@Override
	public boolean equals(Object o){
		return this.getId().equals(((TimespanImpl)o).getId());
	}
}
