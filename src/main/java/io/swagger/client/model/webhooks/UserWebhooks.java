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


package io.swagger.client.model.webhooks;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.webhooks.PageInfo;
import io.swagger.client.model.webhooks.UserWebhook;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserWebhooks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:53.118+05:30")
public class UserWebhooks {
  @SerializedName("page")
  private PageInfo page = null;

  @SerializedName("userWebhookList")
  private List<UserWebhook> userWebhookList = null;

  public UserWebhooks page(PageInfo page) {
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

  public UserWebhooks userWebhookList(List<UserWebhook> userWebhookList) {
    this.userWebhookList = userWebhookList;
    return this;
  }

  public UserWebhooks addUserWebhookListItem(UserWebhook userWebhookListItem) {
    if (this.userWebhookList == null) {
      this.userWebhookList = new ArrayList<UserWebhook>();
    }
    this.userWebhookList.add(userWebhookListItem);
    return this;
  }

   /**
   * An array of widget items
   * @return userWebhookList
  **/
  @ApiModelProperty(value = "An array of widget items")
  public List<UserWebhook> getUserWebhookList() {
    return userWebhookList;
  }

  public void setUserWebhookList(List<UserWebhook> userWebhookList) {
    this.userWebhookList = userWebhookList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebhooks userWebhooks = (UserWebhooks) o;
    return Objects.equals(this.page, userWebhooks.page) &&
        Objects.equals(this.userWebhookList, userWebhooks.userWebhookList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, userWebhookList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebhooks {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    userWebhookList: ").append(toIndentedString(userWebhookList)).append("\n");
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

