package org.urish.titanium.storekit.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Ti.Storekit module object which represents an asynchronous request to the
 * in-app purchase store for a product.
 */
public class ProductRequest extends JavaScriptObject {
	protected ProductRequest() {
	}

	/**
	 * Cancels an active request to the store.
	 */
	public native final void cancel()
	/*-{
		return this.cancel();
	}-*/;
}
