package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/ControlAnimationGroup;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ControlAnimationGroup */
public final class ControlAnimationGroup extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ControlAnimationGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        new ArrayMap();
        new ArrayMap();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
