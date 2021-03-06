/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.widgets;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.widgets.PageInfo;
import io.swagger.client.model.widgets.UserWidget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserWidgets
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:50:01.583+05:30")
public class UserWidgets {
  @SerializedName("page")
  private PageInfo page = null;

  @SerializedName("userWidgetList")
  private List<UserWidget> userWidgetList = null;

  public UserWidgets page(PageInfo page) {
    this.page = page;
    return this;
  }

   /**
   * Pagination information for navigating through the response
   * @return page
  **/
  @ApiModelProperty(value = "Pagination information for navigating through the response")
  public PageInfo getPage() {
    return page;
  }

  public void setPage(PageInfo page) {
    this.page = page;
  }

  public UserWidgets userWidgetList(List<UserWidget> userWidgetList) {
    this.userWidgetList = userWidgetList;
    return this;
  }

  public UserWidgets addUserWidgetListItem(UserWidget userWidgetListItem) {
    if (this.userWidgetList == null) {
      this.userWidgetList = new ArrayList<UserWidget>();
    }
    this.userWidgetList.add(userWidgetListItem);
    return this;
  }

   /**
   * An array of widget items
   * @return userWidgetList
  **/
  @ApiModelProperty(value = "An array of widget items")
  public List<UserWidget> getUserWidgetList() {
    return userWidgetList;
  }

  public void setUserWidgetList(List<UserWidget> userWidgetList) {
    this.userWidgetList = userWidgetList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWidgets userWidgets = (UserWidgets) o;
    return Objects.equals(this.page, userWidgets.page) &&
        Objects.equals(this.userWidgetList, userWidgets.userWidgetList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, userWidgetList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWidgets {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    userWidgetList: ").append(toIndentedString(userWidgetList)).append("\n");
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

