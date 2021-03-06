/**
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.


 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.monoToMicro.Lambda;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * 
 * @author nirozeri
 * 
 */
@DynamoDBTable(tableName="unishop")
public class Unicorn {
	
	private String uuid = null;	
	private String name = null;    
	private String description = null;    
	private Double price = null;
	private String image = null;
	
	private String userUuid = null;
	
	/**
	 * 
	 */
	public Unicorn(){
	}
	
	/**
	 * 
	 * @param uuid
	 */  
	public Unicorn(String uuid){
		this.uuid = uuid;
	}

	/**
	 * 
	 * @return
	 */
	@DynamoDBHashKey(attributeName="uuid")
	public String getUuid() {
		return uuid;
	}

	/**
	 * 
	 * @param uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * 
	 * @return
	 */
	@DynamoDBAttribute(attributeName="name")
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	@DynamoDBAttribute(attributeName="description")
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return
	 */
	@DynamoDBAttribute(attributeName="price")
	public Double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * 
	 * @return
	 */
	@DynamoDBAttribute(attributeName="image")
	public String getImage() {
		return image;
	}

	/**
	 * 
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * 
	 * @return
	 */
	public String getUserUuid() {
		return userUuid;
	}

	/**
	 * 
	 * @param userUuid
	 */
	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}
}
