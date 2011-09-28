package org.urish.titanium.storekit.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Ti.Storekit module object which represents a product from the in-app store.
 */
public class Product extends JavaScriptObject {
	protected Product() {
	}
	
	/**
	 * The title of the product.
	 */
	public native final String getTitle()
	/*-{
		return this.title;
	}-*/;

	/**
	 * The price of the product.
	 */
	public native final double getPrice()
	/*-{
		return this.price;
	}-*/;

	/**
	 * The price of the product, formatted for the store's locale.
	 */
	public native final String getFormattedPrice()
	/*-{
		return this.formattedPrice;
	}-*/;
	
	/**
	 * The locale of the product.
	 */
	public native final String getLocate()
	/*-{
		return this.locale;
	}-*/;

	/**
	 * The product's identifier in the in-app store.
	 */
	public native final String getIdentifier()
	/*-{
		return this.identifier;
	}-*/;
}
