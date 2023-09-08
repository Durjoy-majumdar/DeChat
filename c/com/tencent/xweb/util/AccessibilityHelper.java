package com.tencent.xweb.util;

import android.content.Context;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;

public class AccessibilityHelper {
    private static final String TAG = "AccessibilityHelper";
    private static AccessibilityHelper mAccessibilityHelper;
    private static AccessibilityManager mAccessibilityManager;
    private boolean isAccessibilityEnable;
    private long lastUpdateAccessibilityEnable;

    public AccessibilityHelper(Context context) {
        mAccessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
    }

    public static AccessibilityHelper getInstance(Context context) {
        if (mAccessibilityHelper == null) {
            mAccessibilityHelper = new AccessibilityHelper(context);
        }
        return mAccessibilityHelper;
    }

    public boolean isAccessibilityEnable(boolean z) {
        AccessibilityManager accessibilityManager;
        if ((!z || SystemClock.uptimeMillis() - this.lastUpdateAccessibilityEnable > 2000) && (accessibilityManager = mAccessibilityManager) != null) {
            this.isAccessibilityEnable = accessibilityManager.isEnabled() && mAccessibilityManager.isTouchExplorationEnabled();
            this.lastUpdateAccessibilityEnable = SystemClock.uptimeMillis();
        }
        return this.isAccessibilityEnable;
    }

    public boolean isAccessibilityEnable() {
        return isAccessibilityEnable(true);
    }
}
