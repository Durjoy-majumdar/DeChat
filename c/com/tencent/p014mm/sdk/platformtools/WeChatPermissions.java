package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatPermissions */
public class WeChatPermissions {
    public static final String PERMISSION_MATRIX_STRATEGYNOTIFY() {
        return MMApplicationContext.getApplicationId() + ".matrix.strategynotify";
    }

    public static final String PERMISSION_MM_MESSAGE() {
        return MMApplicationContext.getApplicationId() + ".permission.MM_MESSAGE";
    }

    public static final String PERMISSION_WEAR_MESSAGE() {
        return MMApplicationContext.getApplicationId() + ".wear.message";
    }
}
