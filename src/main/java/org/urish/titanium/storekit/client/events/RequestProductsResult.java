package org.urish.titanium.storekit.client.events;

import org.urish.titanium.storekit.client.Product;

import com.google.gwt.core.client.JavaScriptObject;

public class RequestProductsResult extends JavaScriptObject {
	protected RequestProductsResult() {} 
	
	/**
	 * Whether or not the request succeeded
	 */
	public final native boolean isSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * If the request failed, the reason why
	 */
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;
	
	/**
	 * An array of Ti.Storekit.Product objects which represent the valid products retrieved
	 */
	public final native Product[] getProdcuts()
	/*-{
		return this.products;
	}-*/;
	
	/**
	 * An array of identifiers passed to the request that did not correspond to a product ID.
	 */
	public final native String[] getInvalid()
	/*-{
		return this.invalid;
	}-*/;
}
