package org.urish.titanium.storekit.client.events;

import org.urish.titanium.storekit.client.RestoredTransaction;

import com.google.gwt.core.client.JavaScriptObject;

public class RestoredCompletedTransactionsEvent extends JavaScriptObject {
    protected RestoredCompletedTransactionsEvent() {}
	
	/**
	 * An error message, if one was encountered.
	 */
	public final native String getError()
	/*-{
		return this.error;
	}-*/;
	
	/**
	 * If no errors were encountered, all of the transactions that were restored.
	 */
	public final native RestoredTransaction[] getTransactions()
	/*-{
		return this.transactions;
	}-*/;
}
