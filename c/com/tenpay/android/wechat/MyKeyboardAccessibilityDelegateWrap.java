package com.tenpay.android.wechat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.sdk.platformtools.Log;

class MyKeyboardAccessibilityDelegateWrap extends View.AccessibilityDelegate {
    private static final String TAG = "MicroMsg.MyKeyboardAccessibilityDelegateWrap";
    private View.AccessibilityDelegate origin;
    private String viewTypeName;

    public MyKeyboardAccessibilityDelegateWrap() {
        this.viewTypeName = null;
        this.origin = null;
    }

    public void addExtraDataToAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        try {
            View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate == null) {
                super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            } else if (Build.VERSION.SDK_INT >= 26) {
                accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            }
        } catch (Exception e) {
            Log.m105920e(TAG, e.getMessage());
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.getAccessibilityNodeProvider(view) : accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
        if (accessibilityNodeInfo != null && (str = this.viewTypeName) != null) {
            accessibilityNodeInfo.setClassName(str);
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.performAccessibilityAction(view, i, bundle) : accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEvent(view, i);
        } else {
            accessibilityDelegate.sendAccessibilityEvent(view, i);
        }
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            accessibilityDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void setViewTypeName(String str) {
        this.viewTypeName = str;
    }

    public MyKeyboardAccessibilityDelegateWrap(View.AccessibilityDelegate accessibilityDelegate) {
        this.viewTypeName = null;
        this.origin = accessibilityDelegate;
    }
}
