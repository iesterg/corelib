package eu.europeana.corelib.solr.entity;

import java.sql.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.google.code.morphia.annotations.Entity;

import eu.europeana.corelib.definitions.solr.entity.License;
@JsonSerialize(include = Inclusion.NON_EMPTY)
@Entity("License")
public class LicenseImpl extends AbstractEdmEntityImpl implements License {

	private String odrlInheritFrom;
	private Date ccDeprecatedOn;
	
	@Override
	public String getOdrlInheritFrom() {
		return this.odrlInheritFrom;
	}

	@Override
	public void setOdrlInheritFrom(String odrlInheritFrom) {
		this.odrlInheritFrom = odrlInheritFrom;
	}

	@Override
	public Date getCcDeprecatedOn() {
		return this.ccDeprecatedOn;
	}

	@Override
	public void setCcDeprecatedOn(Date ccDeprecatedOn) {
		this.ccDeprecatedOn = ccDeprecatedOn;
	}

}
