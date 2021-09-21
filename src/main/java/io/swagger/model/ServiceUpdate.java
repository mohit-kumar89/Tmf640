package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Characteristic;
import io.swagger.model.Feature;
import io.swagger.model.Note;
import io.swagger.model.RelatedEntityRefOrValue;
import io.swagger.model.RelatedParty;
import io.swagger.model.RelatedPlaceRefOrValue;
import io.swagger.model.RelatedServiceOrderItem;
import io.swagger.model.ResourceRef;
import io.swagger.model.ServiceRefOrValue;
import io.swagger.model.ServiceRelationship;
import io.swagger.model.ServiceSpecificationRef;
import io.swagger.model.ServiceStateType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService. Skipped properties: id,href
 */
@Schema(description = "Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService. Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-15T10:06:57.629Z[GMT]")


public class ServiceUpdate   {
  @Id
  @GeneratedValue
  private Long id;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endDate")
  private Date endDate = null;

  @JsonProperty("hasStarted")
  private Boolean hasStarted = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isServiceEnabled")
  private Boolean isServiceEnabled = null;

  @JsonProperty("isStateful")
  private Boolean isStateful = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("startDate")
  private Date startDate = null;

  @JsonProperty("startMode")
  private String startMode = null;

  @JsonProperty("feature")
  @Valid
  private List<Feature> feature = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("place")
  @Valid
  private List<RelatedPlaceRefOrValue> place = null;

  @JsonProperty("relatedEntity")
  @Valid
  private List<RelatedEntityRefOrValue> relatedEntity = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("serviceCharacteristic")
  @Valid
  private List<Characteristic> serviceCharacteristic = null;

  @JsonProperty("serviceOrderItem")
  @Valid
  private List<RelatedServiceOrderItem> serviceOrderItem = null;

  @JsonProperty("serviceRelationship")
  @Valid
  private List<ServiceRelationship> serviceRelationship = null;

  @JsonProperty("serviceSpecification")
  private ServiceSpecificationRef serviceSpecification = null;

  @JsonProperty("state")
  private ServiceStateType state = null;

  @JsonProperty("supportingResource")
  @Valid
  private List<ResourceRef> supportingResource = null;

  @JsonProperty("supportingService")
  @Valid
  private List<ServiceRefOrValue> supportingService = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ServiceUpdate category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Is it a customer facing or resource facing service
   * @return category
   **/
  @Schema(description = "Is it a customer facing or resource facing service")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ServiceUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-text description of the service
   * @return description
   **/
  @Schema(description = "Free-text description of the service")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceUpdate endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date when the service ends
   * @return endDate
   **/
  @Schema(description = "Date when the service ends")
  
    @Valid
    public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public ServiceUpdate hasStarted(Boolean hasStarted) {
    this.hasStarted = hasStarted;
    return this;
  }

  /**
   * If TRUE, this Service has already been started
   * @return hasStarted
   **/
  @Schema(description = "If TRUE, this Service has already been started")
  
    public Boolean isHasStarted() {
    return hasStarted;
  }

  public void setHasStarted(Boolean hasStarted) {
    this.hasStarted = hasStarted;
  }

  public ServiceUpdate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).
   * @return isBundle
   **/
  @Schema(description = "If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).")
  
    public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ServiceUpdate isServiceEnabled(Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
    return this;
  }

  /**
   * If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed 
   * @return isServiceEnabled
   **/
  @Schema(description = "If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed ")
  
    public Boolean isIsServiceEnabled() {
    return isServiceEnabled;
  }

  public void setIsServiceEnabled(Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
  }

  public ServiceUpdate isStateful(Boolean isStateful) {
    this.isStateful = isStateful;
    return this;
  }

  /**
   * If TRUE, this Service can be changed without affecting any other services
   * @return isStateful
   **/
  @Schema(description = "If TRUE, this Service can be changed without affecting any other services")
  
    public Boolean isIsStateful() {
    return isStateful;
  }

  public void setIsStateful(Boolean isStateful) {
    this.isStateful = isStateful;
  }

  public ServiceUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service
   * @return name
   **/
  @Schema(description = "Name of the service")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceUpdate serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Business type of the service
   * @return serviceType
   **/
  @Schema(description = "Business type of the service")
  
    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ServiceUpdate startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the service starts
   * @return startDate
   **/
  @Schema(description = "Date when the service starts")
  
    @Valid
    public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public ServiceUpdate startMode(String startMode) {
    this.startMode = startMode;
    return this;
  }

  /**
   * This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above
   * @return startMode
   **/
  @Schema(description = "This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above")
  
    public String getStartMode() {
    return startMode;
  }

  public void setStartMode(String startMode) {
    this.startMode = startMode;
  }

  public ServiceUpdate feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public ServiceUpdate addFeatureItem(Feature featureItem) {
    if (this.feature == null) {
      this.feature = new ArrayList<Feature>();
    }
    this.feature.add(featureItem);
    return this;
  }

  /**
   * A list of feature associated with this service 
   * @return feature
   **/
  @Schema(description = "A list of feature associated with this service ")
      @Valid
    public List<Feature> getFeature() {
    return feature;
  }

  public void setFeature(List<Feature> feature) {
    this.feature = feature;
  }

  public ServiceUpdate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceUpdate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * A list of notes made on this service
   * @return note
   **/
  @Schema(description = "A list of notes made on this service")
      @Valid
    public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ServiceUpdate place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ServiceUpdate addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceRefOrValue>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)
   * @return place
   **/
  @Schema(description = "A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)")
      @Valid
    public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public ServiceUpdate relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public ServiceUpdate addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<RelatedEntityRefOrValue>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * A list of related  entity in relationship with this service 
   * @return relatedEntity
   **/
  @Schema(description = "A list of related  entity in relationship with this service ")
      @Valid
    public List<RelatedEntityRefOrValue> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public ServiceUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity
   * @return relatedParty
   **/
  @Schema(description = "A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity")
      @Valid
    public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceUpdate serviceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public ServiceUpdate addServiceCharacteristicItem(Characteristic serviceCharacteristicItem) {
    if (this.serviceCharacteristic == null) {
      this.serviceCharacteristic = new ArrayList<Characteristic>();
    }
    this.serviceCharacteristic.add(serviceCharacteristicItem);
    return this;
  }

  /**
   * A list of characteristics that characterize this service (ServiceCharacteristic [*]) 
   * @return serviceCharacteristic
   **/
  @Schema(description = "A list of characteristics that characterize this service (ServiceCharacteristic [*]) ")
      @Valid
    public List<Characteristic> getServiceCharacteristic() {
    return serviceCharacteristic;
  }

  public void setServiceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
  }

  public ServiceUpdate serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceUpdate addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<RelatedServiceOrderItem>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items related to this service
   * @return serviceOrderItem
   **/
  @Schema(description = "A list of service order items related to this service")
      @Valid
    public List<RelatedServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceUpdate serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public ServiceUpdate addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
    if (this.serviceRelationship == null) {
      this.serviceRelationship = new ArrayList<ServiceRelationship>();
    }
    this.serviceRelationship.add(serviceRelationshipItem);
    return this;
  }

  /**
   * A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example).
   * @return serviceRelationship
   **/
  @Schema(description = "A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory (useful for describing relies-on, relies-from between CFS for example).")
      @Valid
    public List<ServiceRelationship> getServiceRelationship() {
    return serviceRelationship;
  }

  public void setServiceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
  }

  public ServiceUpdate serviceSpecification(ServiceSpecificationRef serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  /**
   * Get serviceSpecification
   * @return serviceSpecification
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceSpecificationRef getServiceSpecification() {
    return serviceSpecification;
  }

  public void setServiceSpecification(ServiceSpecificationRef serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  public ServiceUpdate state(ServiceStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceStateType getState() {
    return state;
  }

  public void setState(ServiceStateType state) {
    this.state = state;
  }

  public ServiceUpdate supportingResource(List<ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  public ServiceUpdate addSupportingResourceItem(ResourceRef supportingResourceItem) {
    if (this.supportingResource == null) {
      this.supportingResource = new ArrayList<ResourceRef>();
    }
    this.supportingResource.add(supportingResourceItem);
    return this;
  }

  /**
   * A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources
   * @return supportingResource
   **/
  @Schema(description = "A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources")
      @Valid
    public List<ResourceRef> getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(List<ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
  }

  public ServiceUpdate supportingService(List<ServiceRefOrValue> supportingService) {
    this.supportingService = supportingService;
    return this;
  }

  public ServiceUpdate addSupportingServiceItem(ServiceRefOrValue supportingServiceItem) {
    if (this.supportingService == null) {
      this.supportingService = new ArrayList<ServiceRefOrValue>();
    }
    this.supportingService.add(supportingServiceItem);
    return this;
  }

  /**
   * A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)
   * @return supportingService
   **/
  @Schema(description = "A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)")
      @Valid
    public List<ServiceRefOrValue> getSupportingService() {
    return supportingService;
  }

  public void setSupportingService(List<ServiceRefOrValue> supportingService) {
    this.supportingService = supportingService;
  }

  public ServiceUpdate _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")
  
    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public ServiceUpdate _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  
    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ServiceUpdate _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  
    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUpdate serviceUpdate = (ServiceUpdate) o;
    return Objects.equals(this.category, serviceUpdate.category) &&
        Objects.equals(this.description, serviceUpdate.description) &&
        Objects.equals(this.endDate, serviceUpdate.endDate) &&
        Objects.equals(this.hasStarted, serviceUpdate.hasStarted) &&
        Objects.equals(this.isBundle, serviceUpdate.isBundle) &&
        Objects.equals(this.isServiceEnabled, serviceUpdate.isServiceEnabled) &&
        Objects.equals(this.isStateful, serviceUpdate.isStateful) &&
        Objects.equals(this.name, serviceUpdate.name) &&
        Objects.equals(this.serviceType, serviceUpdate.serviceType) &&
        Objects.equals(this.startDate, serviceUpdate.startDate) &&
        Objects.equals(this.startMode, serviceUpdate.startMode) &&
        Objects.equals(this.feature, serviceUpdate.feature) &&
        Objects.equals(this.note, serviceUpdate.note) &&
        Objects.equals(this.place, serviceUpdate.place) &&
        Objects.equals(this.relatedEntity, serviceUpdate.relatedEntity) &&
        Objects.equals(this.relatedParty, serviceUpdate.relatedParty) &&
        Objects.equals(this.serviceCharacteristic, serviceUpdate.serviceCharacteristic) &&
        Objects.equals(this.serviceOrderItem, serviceUpdate.serviceOrderItem) &&
        Objects.equals(this.serviceRelationship, serviceUpdate.serviceRelationship) &&
        Objects.equals(this.serviceSpecification, serviceUpdate.serviceSpecification) &&
        Objects.equals(this.state, serviceUpdate.state) &&
        Objects.equals(this.supportingResource, serviceUpdate.supportingResource) &&
        Objects.equals(this.supportingService, serviceUpdate.supportingService) &&
        Objects.equals(this._atBaseType, serviceUpdate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, serviceUpdate._atSchemaLocation) &&
        Objects.equals(this._atType, serviceUpdate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, endDate, hasStarted, isBundle, isServiceEnabled, isStateful, name, serviceType, startDate, startMode, feature, note, place, relatedEntity, relatedParty, serviceCharacteristic, serviceOrderItem, serviceRelationship, serviceSpecification, state, supportingResource, supportingService, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUpdate {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hasStarted: ").append(toIndentedString(hasStarted)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isServiceEnabled: ").append(toIndentedString(isServiceEnabled)).append("\n");
    sb.append("    isStateful: ").append(toIndentedString(isStateful)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startMode: ").append(toIndentedString(startMode)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    serviceRelationship: ").append(toIndentedString(serviceRelationship)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    supportingService: ").append(toIndentedString(supportingService)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
