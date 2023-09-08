package com.tencent.p014mm.plugin.scanner.box;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/box/BoxWebViewContainer;", "Landroid/widget/RelativeLayout;", "", "enableScroll", "Lrx3/b0;", "setEnableScroll", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.box.BoxWebViewContainer */
public final class BoxWebViewContainer extends RelativeLayout {

    /* renamed from: d */
    public boolean f116169d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BoxWebViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f116169d) {
            boolean z = false;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setEnableScroll(boolean z) {
        this.f116169d = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWebViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f116169d = true;
    }
}
