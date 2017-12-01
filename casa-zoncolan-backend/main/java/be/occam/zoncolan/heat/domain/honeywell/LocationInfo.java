package be.occam.zoncolan.heat.domain.honeywell;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sven
 *
 */
public class LocationInfo {
	
	protected String locationId;
	protected List<GateWay> gateWays;
	
	@JsonProperty(value="locationId")
	public String getLocationId() {
		return this.locationId;
	}

}