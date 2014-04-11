package eu.europeana.corelib.solr.utils.construct;

import com.google.code.morphia.query.Query;
import com.google.code.morphia.query.UpdateOperations;

import eu.europeana.corelib.solr.MongoServer;
import eu.europeana.corelib.solr.entity.ConceptImpl;
import eu.europeana.corelib.solr.utils.MongoUtils;

public class ConceptUpdater implements Updater<ConceptImpl> {

	public ConceptImpl update(ConceptImpl conceptMongo, ConceptImpl concept,
			MongoServer mongoServer) {
		Query<ConceptImpl> updateQuery = mongoServer.getDatastore()
				.createQuery(ConceptImpl.class).field("about")
				.equal(conceptMongo.getAbout());
		UpdateOperations<ConceptImpl> ops = mongoServer.getDatastore()
				.createUpdateOperations(ConceptImpl.class);
		boolean update = false;
		if (concept.getAltLabel() != null) {
			if (conceptMongo.getAltLabel() == null
					|| !MongoUtils.mapEquals(concept.getAltLabel(),
							conceptMongo.getAltLabel())) {
				ops.set("altLabel", concept.getAltLabel());
				conceptMongo.setAltLabel(concept.getAltLabel());
				update = true;
			}
		} else {
			if (conceptMongo.getAltLabel() != null) {
				ops.unset("altLabel");
				conceptMongo.setAltLabel(null);
				update = true;
			}
		}
		if (concept.getPrefLabel() != null) {
			if (conceptMongo.getPrefLabel() == null
					|| !MongoUtils.mapEquals(concept.getPrefLabel(),
							conceptMongo.getPrefLabel())) {
				ops.set("prefLabel", concept.getPrefLabel());
				conceptMongo.setPrefLabel(concept.getPrefLabel());
				update = true;
			}
		} else {
			if (conceptMongo.getPrefLabel() != null) {
				ops.unset("prefLabel");
				conceptMongo.setPrefLabel(null);
				update = true;
			}
		}
		if (concept.getHiddenLabel() != null) {
			if (conceptMongo.getHiddenLabel() == null
					|| !MongoUtils.mapEquals(concept.getHiddenLabel(),
							conceptMongo.getHiddenLabel())) {
				ops.set("hiddenLabel", concept.getHiddenLabel());
				conceptMongo.setHiddenLabel(concept.getHiddenLabel());
				update = true;
			}
		} else {
			if (conceptMongo.getHiddenLabel() != null) {
				ops.unset("hiddenLabel");
				conceptMongo.setHiddenLabel(null);
				update = true;
			}
		}
		if (concept.getNotation() != null) {
			if (conceptMongo.getNotation() == null
					|| !MongoUtils.mapEquals(concept.getNotation(),
							conceptMongo.getNotation())) {
				ops.set("notation", concept.getNotation());
				conceptMongo.setNotation(concept.getNotation());
				update = true;
			}
		} else {
			if (conceptMongo.getNotation() != null) {
				ops.unset("notation");
				conceptMongo.setNotation(null);
				update = true;
			}
		}

		if (concept.getNote() != null) {
			if (conceptMongo.getNote() == null
					|| !MongoUtils.mapEquals(concept.getNote(),
							conceptMongo.getNote())) {
				ops.set("note", concept.getNote());
				conceptMongo.setNote(concept.getNote());
				update = true;
			}
		} else {
			if (conceptMongo.getNote() != null) {
				ops.unset("note");
				conceptMongo.setNote(null);
				update = false;
			}
		}
		if (concept.getBroader() != null) {

			if (conceptMongo.getBroader() == null
					|| !MongoUtils.arrayEquals(concept.getBroader(),
							conceptMongo.getBroader())) {
				ops.set("broader", concept.getBroader());
				conceptMongo.setBroader(concept.getBroader());
				update = true;
			}
		} else {
			if (conceptMongo.getBroader() != null) {
				ops.unset("broader");
				conceptMongo.setBroader(null);
				update = true;
			}
		}
		if (concept.getBroadMatch() != null) {

			if (conceptMongo.getBroadMatch() == null
					|| !MongoUtils.arrayEquals(concept.getBroadMatch(),
							conceptMongo.getBroadMatch())) {
				ops.set("broadMatch", concept.getBroadMatch());
				conceptMongo.setBroadMatch(concept.getBroadMatch());
				update = true;
			}
		} else {
			if (conceptMongo.getBroadMatch() != null) {
				ops.unset("broadMatch");
				conceptMongo.setBroadMatch(null);
				update = true;
			}
		}
		if (concept.getCloseMatch() != null) {

			if (conceptMongo.getCloseMatch() == null
					|| !MongoUtils.arrayEquals(concept.getCloseMatch(),
							conceptMongo.getCloseMatch())) {
				ops.set("closeMatch", concept.getCloseMatch());
				conceptMongo.setCloseMatch(concept.getCloseMatch());
				update = true;
			}
		} else {
			if (conceptMongo.getBroadMatch() != null) {
				ops.unset("closeMatch");
				conceptMongo.setCloseMatch(null);
				update = true;
			}
		}
		if (concept.getExactMatch() != null) {

			if (conceptMongo.getExactMatch() == null
					|| !MongoUtils.arrayEquals(concept.getExactMatch(),
							conceptMongo.getExactMatch())) {
				ops.set("exactMatch", concept.getExactMatch());
				conceptMongo.setExactMatch(concept.getExactMatch());
				update = true;
			}
		} else {
			if (conceptMongo.getExactMatch() != null) {
				ops.unset("exactMatch");
				conceptMongo.setExactMatch(null);
				update = true;
			}
		}
		if (concept.getInScheme() != null) {

			if (conceptMongo.getInScheme() == null
					|| !MongoUtils.arrayEquals(concept.getInScheme(),
							conceptMongo.getInScheme())) {
				ops.set("inScheme", concept.getInScheme());
				conceptMongo.setInScheme(concept.getInScheme());
				update = true;
			}
		} else {
			if (conceptMongo.getInScheme() != null) {
				ops.unset("inScheme");
				concept.setInScheme(null);
				update = true;
			}
		}
		
		if (concept.getNarrower() != null) {

			if (conceptMongo.getNarrower() == null
					|| !MongoUtils.arrayEquals(concept.getNarrower(),
							conceptMongo.getNarrower())) {
				ops.set("narrower", concept.getNarrower());
				conceptMongo.setNarrower(concept.getNarrower());
				update = true;
			}
		} else {
			if (conceptMongo.getNarrower() != null) {
				ops.unset("narrower");
				conceptMongo.setNarrower(null);
				update = true;
			}
		}
		if (concept.getNarrowMatch() != null) {

			if (conceptMongo.getNarrowMatch() == null
					|| !MongoUtils.arrayEquals(concept.getNarrowMatch(),
							conceptMongo.getNarrowMatch())) {
				ops.set("narrowMatch", concept.getNarrowMatch());
				conceptMongo.setNarrowMatch(concept.getNarrowMatch());
				update = true;
			}
		} else {
			if (conceptMongo.getNarrowMatch() != null) {
				ops.unset("narrowMatch");
				conceptMongo.setNarrowMatch(null);
				update = true;
			}
		}
		if (concept.getRelatedMatch() != null) {

			if (conceptMongo.getRelatedMatch() == null
					|| !MongoUtils.arrayEquals(concept.getRelatedMatch(),
							conceptMongo.getRelatedMatch())) {
				ops.set("relatedMatch", concept.getRelatedMatch());
				conceptMongo.setRelatedMatch(concept.getRelatedMatch());
				update = true;
			}
		} else {
			if (conceptMongo.getRelatedMatch() != null) {
				ops.unset("relatedMatch");
				conceptMongo.setRelatedMatch(null);
				update = true;
			}
		}
		if (concept.getRelated() != null) {

			if (conceptMongo.getRelated() == null
					|| !MongoUtils.arrayEquals(concept.getRelated(),
							conceptMongo.getRelated())) {
				ops.set("related", concept.getRelated());
				conceptMongo.setRelated(concept.getRelated());
				update = true;
			}
		} else {
			if (conceptMongo.getRelated()!= null) {
				ops.unset("related");
				conceptMongo.setRelated(null);
				update = true;
			}
		}
		if (update) {
			mongoServer.getDatastore().update(updateQuery, ops);
		}
		return conceptMongo;
	}

}