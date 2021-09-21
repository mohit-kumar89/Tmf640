package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OrderItemActionType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.neo4j.ogm.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedServiceOrderItem (a ServiceOrder item) .The service order item which triggered service creation/change/termination.
 */
@Schema(description = "RelatedServiceOrderItem (a ServiceOrder item) .The service order item which triggered service creation/change/termination.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-15T10:06:57.629Z[GMT]")


public class RelatedServiceOrderItem   {
  @JsonProperty("itemId")
  @Id
  private String itemId;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("serviceOrderHref")
  private String serviceOrderHref = null;

  @JsonProperty("serviceOrderId")
  private String serviceOrderId = null;

  @JsonProperty("itemAction")
  private OrderItemActionType itemAction = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public RelatedServiceOrderItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Identifier of the order item where the service was managed
   * @return itemId
   **/
  @Schema(required = true, description = "Identifier of the order item where the service was managed")
      @NotNull

    public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RelatedServiceOrderItem role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the service order item for this service
   * @return role
   **/
  @Schema(description = "role of the service order item for this service")
  
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedServiceOrderItem serviceOrderHref(String serviceOrderHref) {
    this.serviceOrderHref = serviceOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return serviceOrderHref
   **/
  @Schema(description = "Reference of the related entity.")
  
    public String getServiceOrderHref() {
    return serviceOrderHref;
  }

  public void setServiceOrderHref(String serviceOrderHref) {
    this.serviceOrderHref = serviceOrderHref;
  }

  public RelatedServiceOrderItem serviceOrderId(String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return serviceOrderId
   **/
  @Schema(required = true, description = "Unique identifier of a related entity.")
      @NotNull

    public String getServiceOrderId() {
    return serviceOrderId;
  }

  public void setServiceOrderId(String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
  }

  public RelatedServiceOrderItem itemAction(OrderItemActionType itemAction) {
    this.itemAction = itemAction;
    return this;
  }

  /**
   * Get itemAction
   * @return itemAction
   **/
  @Schema(description = "")
  
    @Valid
    public OrderItemActionType getItemAction() {
    return itemAction;
  }

  public void setItemAction(OrderItemActionType itemAction) {
    this.itemAction = itemAction;
  }

  public RelatedServiceOrderItem _atBaseType(String _atBaseType) {
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

  public RelatedServiceOrderItem _atSchemaLocation(String _atSchemaLocation) {
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

  public RelatedServiceOrderItem _atType(String _atType) {
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

  public RelatedServiceOrderItem _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return _atReferredType
   **/
  @Schema(description = "The actual type of the target instance when needed for disambiguation.")
  
    public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedServiceOrderItem relatedServiceOrderItem = (RelatedServiceOrderItem) o;
    return Objects.equals(this.itemId, relatedServiceOrderItem.itemId) &&
        Objects.equals(this.role, relatedServiceOrderItem.role) &&
        Objects.equals(this.serviceOrderHref, relatedServiceOrderItem.serviceOrderHref) &&
        Objects.equals(this.serviceOrderId, relatedServiceOrderItem.serviceOrderId) &&
        Objects.equals(this.itemAction, relatedServiceOrderItem.itemAction) &&
        Objects.equals(this._atBaseType, relatedServiceOrderItem._atBaseType) &&
        Objects.equals(this._atSchemaLocation, relatedServiceOrderItem._atSchemaLocation) &&
        Objects.equals(this._atType, relatedServiceOrderItem._atType) &&
        Objects.equals(this._atReferredType, relatedServiceOrderItem._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, role, serviceOrderHref, serviceOrderId, itemAction, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedServiceOrderItem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceOrderHref: ").append(toIndentedString(serviceOrderHref)).append("\n");
    sb.append("    serviceOrderId: ").append(toIndentedString(serviceOrderId)).append("\n");
    sb.append("    itemAction: ").append(toIndentedString(itemAction)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
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
