package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.LayoutListenerView */
public class LayoutListenerView extends FrameLayout {

    /* renamed from: d */
    public String f318636d = "MicroMsg.LayoutListenerView";

    /* renamed from: e */
    public byte[] f318637e = new byte[0];

    /* renamed from: f */
    public C73074c f318638f;

    /* renamed from: com.tencent.mm.ui.LayoutListenerView$a */
    public interface C73072a {
        /* renamed from: a */
        void mo101405a(boolean z, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.tencent.mm.ui.LayoutListenerView$b */
    public interface C73073b {
        /* renamed from: a */
        void mo101406a(boolean z, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.tencent.mm.ui.LayoutListenerView$c */
    public interface C73074c {
    }

    public LayoutListenerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        synchronized (this.f318637e) {
            this.f318638f = null;
        }
        super.onDetachedFromWindow();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        Log.m105918d(this.f318636d, "jacks onInitializeAccessibilityEvent");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Log.m105918d(this.f318636d, "jacks onInitializeAccessibilityNodeInfo");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        synchronized (this.f318637e) {
        }
        super.onLayout(z, i, i2, i3, i4);
        synchronized (this.f318637e) {
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        Log.m105918d(this.f318636d, "jacks onPopulateAccessibilityEvent");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        synchronized (this.f318637e) {
            C73074c cVar = this.f318638f;
            if (cVar != null) {
                MMActivityController.C106635m mVar = (MMActivityController.C106635m) cVar;
                if (!((MMActivityController.this.mo177096t().getWindow().getAttributes().flags & 1024) != 0)) {
                    if (!(i == 0 || i2 == 0 || i3 == 0 || i4 == 0 || i != i3)) {
                        if (i2 > i4 && i2 - i4 > mVar.f318642a) {
                            MMActivityController mMActivityController = MMActivityController.this;
                            mMActivityController.f348099g0 = 2;
                            mMActivityController.mo177026c0();
                        } else if (i4 > i2 && i4 - i2 > mVar.f318642a) {
                            MMActivityController mMActivityController2 = MMActivityController.this;
                            mMActivityController2.f348099g0 = 1;
                            mMActivityController2.mo177026c0();
                        }
                    }
                }
            }
        }
    }

    public void setOnLayoutListener(C73072a aVar) {
        synchronized (this.f318637e) {
        }
    }

    public void setOnPreLayoutListener(C73073b bVar) {
        synchronized (this.f318637e) {
        }
    }

    public void setOnResizedListener(C73074c cVar) {
        synchronized (this.f318637e) {
            this.f318638f = cVar;
        }
    }
}
