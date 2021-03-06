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
package eu.europeana.corelib.neo4j.entity;

import java.util.List;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * A complex Neo4j response structure, to contains self, parents, preceeding siblings and following siblings.
 * @author gmamakis
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Neo4jStructBean {

	/**
	 * The self object
	 */
	private Neo4jBean self;

	/**
	 * The self's parents
	 */
	private List<Neo4jBean> parents;

	/**
	 * Self's preceeding siblings
	 */
	private List<Neo4jBean> preceedingSiblings;

	/**
	 * Self's following siblings
	 */
	private List<Neo4jBean> followingSiblings;

	public Neo4jBean getSelf() {
		return self;
	}

	public void setSelf(Neo4jBean self) {
		this.self = self;
	}

	public List<Neo4jBean> getPreceedingSiblings() {
		return preceedingSiblings;
	}

	public void setPreceedingSiblings(List<Neo4jBean> preceedingSiblings) {
		this.preceedingSiblings = preceedingSiblings;
	}

	public List<Neo4jBean> getFollowingSiblings() {
		return followingSiblings;
	}

	public void setFollowingSiblings(List<Neo4jBean> followingSiblings) {
		this.followingSiblings = followingSiblings;
	}

	public List<Neo4jBean> getParents() {
		return parents;
	}

	public void setParents(List<Neo4jBean> parents) {
		this.parents = parents;
	}
}
