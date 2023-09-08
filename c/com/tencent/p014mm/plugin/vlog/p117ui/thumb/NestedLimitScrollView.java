package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p849e3.C107201m;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/NestedLimitScrollView;", "Landroid/widget/FrameLayout;", "Le3/m;", "", "", "f", "I", "getLeftLimit", "()I", "setLeftLimit", "(I)V", "leftLimit", "g", "getRightLimit", "setRightLimit", "rightLimit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.NestedLimitScrollView */
public final class NestedLimitScrollView extends FrameLayout implements C107201m, C111847h {

    /* renamed from: d */
    public final String f164658d;

    /* renamed from: e */
    public View f164659e;

    /* renamed from: f */
    public int f164660f;

    /* renamed from: g */
    public int f164661g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedLimitScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f164658d = "MicroMsg.ThumbCropView";
        this.f164659e = getChildCount() > 0 ? getChildAt(0) : null;
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        Log.m105924i(this.f164658d, "onStartNestedScroll: ");
        return i == 1;
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        Log.m105924i(this.f164658d, "onNestedScrollAccepted: ");
    }

    public final int getLeftLimit() {
        return this.f164660f;
    }

    public final int getRightLimit() {
        return this.f164661g;
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        Log.m105924i(this.f164658d, "onStopNestedScroll: ");
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "target");
        String str = this.f164658d;
        Log.m105924i(str, "onNestedScroll: " + i + ", " + i3 + ", " + getScrollX());
        int scrollX = getScrollX() + i3;
        int i6 = this.f164661g;
        if (scrollX > i6) {
            setScrollX(i6);
            return;
        }
        int scrollX2 = getScrollX() + i3;
        int i7 = this.f164660f;
        if (scrollX2 < (-i7)) {
            setScrollX(-i7);
        } else {
            setScrollX(getScrollX() + i3);
        }
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "comsumed");
        String str = this.f164658d;
        Log.m105924i(str, "onNestedPreScroll: " + i + ", " + getScrollX());
        if (i > 0 && getScrollX() < 0) {
            if (getScrollX() + i > 0) {
                i4 = getScrollX();
            }
            iArr[0] = i;
            setScrollX(getScrollX() + iArr[0]);
            iArr[1] = i2;
        } else if (i >= 0 || getScrollX() <= 0) {
            i = 0;
            iArr[0] = i;
            setScrollX(getScrollX() + iArr[0]);
            iArr[1] = i2;
        } else {
            if (getScrollX() + i < 0) {
                i4 = getScrollX();
            }
            iArr[0] = i;
            setScrollX(getScrollX() + iArr[0]);
            iArr[1] = i2;
        }
        i = -i4;
        iArr[0] = i;
        setScrollX(getScrollX() + iArr[0]);
        iArr[1] = i2;
    }

    public void onFinishInflate() {
        this.f164659e = getChildCount() > 0 ? getChildAt(0) : null;
        super.onFinishInflate();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f164659e;
        if (view != null) {
            view.getWidth();
        }
    }

    public final void setLeftLimit(int i) {
        this.f164660f = i;
    }

    public final void setRightLimit(int i) {
        this.f164661g = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NestedLimitScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
