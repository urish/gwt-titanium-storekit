package org.urish.titanium.storekit.client;

public enum PurchaseState {
	PURCHASING, PURCHASED, FAILED, RESTORED;

	private static StoreKitImpl storeKitImpl;

	public static void init(StoreKitImpl storeKitImpl) {
		PurchaseState.storeKitImpl = storeKitImpl;
	}

	public static PurchaseState fromNativeCode(int nativeCode) {
		if (nativeCode == storeKitImpl.getConst_PURCHASING()) {
			return PURCHASING;
		}
		if (nativeCode == storeKitImpl.getConst_PURCHASED()) {
			return PURCHASED;
		}
		if (nativeCode == storeKitImpl.getConst_FAILED()) {
			return FAILED;
		}
		if (nativeCode == storeKitImpl.getConst_RESTORED()) {
			return RESTORED;
		}
		return null;
	}
}
