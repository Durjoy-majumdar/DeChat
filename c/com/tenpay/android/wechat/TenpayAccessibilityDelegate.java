package com.tenpay.android.wechat;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import com.tenpay.bankcard.LogUtil;
import java.lang.reflect.Method;

public class TenpayAccessibilityDelegate extends View.AccessibilityDelegate {
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return false;
    }

    public void sendAccessibilityEvent(View view, int i) {
        LogUtil.m90287d("CFT", "sendAccessibilityEvent eventType=" + i);
        if (view != null && i == 128) {
            CharSequence charSequence = null;
            if (view instanceof EditText) {
                LogUtil.m90287d("CFT", "EditText");
                EditText editText = (EditText) view;
                if (!TextUtils.isEmpty(editText.getContentDescription())) {
                    charSequence = editText.getContentDescription();
                } else if (editText.getHint() != null) {
                    charSequence = editText.getHint();
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    for (int i2 = 0; i2 < charSequence.length(); i2++) {
                        TenpayTTSUtil.speak(String.valueOf(charSequence.charAt(i2)));
                    }
                }
            } else {
                LogUtil.m90287d("CFT", "not EditText");
                charSequence = view.getContentDescription();
                TenpayTTSUtil.speak(charSequence);
            }
            LogUtil.m90287d("CFT", "content = " + charSequence);
            LogUtil.m90287d("CFT", "host.getContentDescription() = " + view.getContentDescription());
            if (!TextUtils.isEmpty(charSequence)) {
                Class<View> cls = View.class;
                try {
                    Method method = cls.getMethod("clearAccessibilityFocus", new Class[0]);
                    method.setAccessible(true);
                    method.invoke(view, new Object[0]);
                    Method method2 = cls.getMethod("requestAccessibilityFocus", new Class[0]);
                    method2.setAccessible(true);
                    method2.invoke(view, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
    }
}
