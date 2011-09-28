package org.urish.titanium.storekit.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Payment extends JavaScriptObject {
	protected Payment() {
	}

	/**
	 * The product which this payment was processed for.
	 */
	public native final Product getProduct()
	/*-{
		return this.product;
	}-*/;
}
