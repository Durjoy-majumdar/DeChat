package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.ui.MMImageView */
public class MMImageView extends ImageView {
    public MMImageView(Context context) {
        super(context);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    public MMImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
