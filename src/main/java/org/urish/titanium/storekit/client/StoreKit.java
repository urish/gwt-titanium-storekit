package org.urish.titanium.storekit.client;

import java.sql.Blob;

import org.urish.titanium.storekit.client.events.PurchaseHandler;
import org.urish.titanium.storekit.client.events.RequestProductsHandler;
import org.urish.titanium.storekit.client.events.RestoredCompletedTransactionsHandler;
import org.urish.titanium.storekit.client.events.VerifyReceiptHandler;

public class StoreKit {
	private static StoreKitImpl storeKitImpl = null;

	public StoreKit() {
		if (storeKitImpl == null) {
			storeKitImpl = StoreKitImpl.loadModule();
			PurchaseState.init(storeKitImpl);
		}
	}

	/**
	 * Requests to see if products identified by the strings in the id array are
	 * available. The callback function is called upon completion of the
	 * request.
	 */
	public ProductRequest requestProducts(String[] ids, RequestProductsHandler requestProductsHandler) {
		return storeKitImpl.requestProducts(ids, requestProductsHandler);
	}

	/**
	 * Purchases a given product.
	 * 
	 * @param product
	 *            Product to purchase
	 */
	public Payment purchase(Product product, PurchaseHandler purchaseHandler) {
		return storeKitImpl.purchase(product, purchaseHandler);
	}

	/**
	 * Verifies that a receipt (a blob object) passed from a Storekit purchase
	 * is valid.
	 * 
	 * @param receipt
	 *            The receipt to verify
	 * @param verifyReceiptHandler
	 *            A handler to be called when the verification request
	 *            completes.
	 * @param sandbox
	 *            Whether or not to use Apple's Sandbox verification server.
	 * @param sharedSecret
	 *            The shared secret for your app that you creates in
	 *            iTunesConnect; required for verifying auto-renewable
	 *            subscriptions.
	 */
	public ReceiptRequest verifyReceipt(Blob receipt, VerifyReceiptHandler verifyReceiptHandler, boolean sandbox,
			String sharedSecret) {
		return storeKitImpl.verifyReceipt(receipt, verifyReceiptHandler, sandbox, sharedSecret);
	}

	/**
	 * Verifies that a receipt (a blob object) passed from a Storekit purchase
	 * is valid.
	 * 
	 * @param receipt
	 *            The receipt to verify
	 * @param verifyReceiptHandler
	 *            A handler to be called when the verification request
	 *            completes.
	 */
	public ReceiptRequest verifyReceipt(Blob receipt, VerifyReceiptHandler verifyReceiptHandler) {
		return storeKitImpl.verifyReceipt(receipt, verifyReceiptHandler);
	}

	/**
	 * Asks the payment queue to restore previously completed purchases. Note
	 * that calling this may ask the user to authenticate! It is recommended
	 * that you give the user the option to restore their past purchases via a
	 * button, and invoke this method only after the user touches it.
	 */
	public void restoreCompletedTransactions() {
		storeKitImpl.restoreCompletedTransactions();
	}

	public void addRestoredCompletedTransactionsHandler(
			RestoredCompletedTransactionsHandler restoredCompletedTransactionsHandler) {
		storeKitImpl.addRestoredCompletedTransactionsHandler(restoredCompletedTransactionsHandler);
	}

	/*
	 * Whether or not payments can be made via Storekit.
	 */
	public boolean getCanMakePayments() {
		return storeKitImpl.getCanMakePayments();
	}
}
