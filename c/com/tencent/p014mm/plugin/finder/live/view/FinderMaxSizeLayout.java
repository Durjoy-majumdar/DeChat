package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import eg1.C58591p0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderMaxSizeLayout;", "Landroid/widget/FrameLayout;", "", "maxWidth", "Lrx3/b0;", "setMaxWidth", "getMaxWidth", "getMaxHeight", "", "e", "Z", "getDisallowInterceptTouch", "()Z", "setDisallowInterceptTouch", "(Z)V", "disallowInterceptTouch", "f", "getForbidHorizontalScroll", "setForbidHorizontalScroll", "forbidHorizontalScroll", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout */
public final class FinderMaxSizeLayout extends FrameLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f15300n = 0;

    /* renamed from: d */
    public final String f15301d = "Finder.FinderMaxSizeLayout";

    /* renamed from: e */
    public boolean f15302e;

    /* renamed from: f */
    public boolean f15303f;

    /* renamed from: g */
    public int f15304g;

    /* renamed from: h */
    public int f15305h;

    /* renamed from: i */
    public int f15306i;

    /* renamed from: j */
    public int f15307j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMaxSizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo3346a(attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo3346a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C58591p0.f167753e, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…xSizeLayout, defStyle, 0)");
            this.f15304g = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            this.f15305h = (int) obtainStyledAttributes.getDimension(1, 0.0f);
            obtainStyledAttributes.recycle();
            String str = this.f15301d;
            Log.m105924i(str, "[initAttribute],maxHeight:" + this.f15304g + ", maxWidth:" + this.f15305h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r1.f154420q;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3347b(int r9, boolean r10) {
        /*
            r8 = this;
            r8.f15304g = r9
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r0.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            r2 = 0
            if (r1 == 0) goto L_0x0016
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0016
            int r1 = r1.f182374S
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r3 = 65536(0x10000, float:9.18355E-41)
            boolean r3 = o40.C61926c.m72696u(r1, r3)
            android.content.Context r4 = r8.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            java.lang.Class<cl1.j> r7 = cl1.C39975j.class
            androidx.lifecycle.i0 r0 = r0.mo77630e(r7)
            cl1.j r0 = (cl1.C39975j) r0
            if (r0 == 0) goto L_0x004f
            d14.u0<java.lang.Boolean> r0 = r0.f107166f
            if (r0 == 0) goto L_0x004f
            d14.j1 r0 = (d14.C58052j1) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r6) goto L_0x004f
            r2 = 1
        L_0x004f:
            java.lang.String r0 = r8.f15301d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "flag = "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = ", check = "
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = ", isLandScape = "
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = ", isBoxLive = "
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r3 == 0) goto L_0x0086
            if (r4 != 0) goto L_0x0086
            if (r10 == 0) goto L_0x0086
            int r9 = r9 / r5
            r8.f15304g = r9
        L_0x0086:
            java.lang.String r9 = r8.f15301d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[setMaxHeight],maxHeight:"
            r10.append(r0)
            int r0 = r8.f15304g
            r10.append(r0)
            java.lang.String r0 = ", maxWidth:"
            r10.append(r0)
            int r0 = r8.f15305h
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLayout.mo3347b(int, boolean):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(this.f15302e);
        if (this.f15303f) {
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f15306i = (int) motionEvent.getX();
                this.f15307j = (int) motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                int x = (int) motionEvent.getX();
                if (Math.abs(x - this.f15306i) > Math.abs(((int) motionEvent.getY()) - this.f15307j)) {
                    String str = this.f15301d;
                    Log.m105924i(str, " canScrollHorizontally: " + canScrollHorizontally(this.f15306i - x));
                    getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(this.f15306i - x));
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getDisallowInterceptTouch() {
        return this.f15302e;
    }

    public final boolean getForbidHorizontalScroll() {
        return this.f15303f;
    }

    public final int getMaxHeight() {
        return this.f15304g;
    }

    public final int getMaxWidth() {
        return this.f15305h;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f15304g;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f15305h;
        if (i4 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setDisallowInterceptTouch(boolean z) {
        this.f15302e = z;
    }

    public final void setForbidHorizontalScroll(boolean z) {
        this.f15303f = z;
    }

    public final void setMaxWidth(int i) {
        this.f15305h = i;
        String str = this.f15301d;
        Log.m105924i(str, "[setMaxWidth],maxHeight:" + this.f15304g + ", maxWidth:" + i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMaxSizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo3346a(attributeSet, i);
    }
}
