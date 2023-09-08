package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import eg1.C58591p0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveSkewView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveSkewView */
public final class FinderLiveSkewView extends View {

    /* renamed from: d */
    public float f159819d;

    /* renamed from: e */
    public float f159820e;

    /* renamed from: f */
    public Drawable f159821f;

    /* renamed from: g */
    public Bitmap f159822g;

    /* renamed from: h */
    public final Matrix f159823h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveSkewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Matrix matrix = new Matrix();
        this.f159823h = matrix;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C58591p0.f167751c);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…eable.FinderLiveSkewView)");
            this.f159819d = obtainStyledAttributes.getFloat(0, 0.0f);
            this.f159820e = obtainStyledAttributes.getFloat(1, 0.0f);
            this.f159821f = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        matrix.setSkew(this.f159819d, this.f159820e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0005
            r6.save()
        L_0x0005:
            float r0 = r5.f159819d
            r1 = 0
            r2 = 1
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r4 = 0
            if (r0 == 0) goto L_0x001e
            float r0 = r5.f159820e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 != 0) goto L_0x0055
        L_0x001e:
            android.graphics.drawable.Drawable r0 = r5.f159821f
            if (r0 == 0) goto L_0x0055
            android.graphics.Bitmap r1 = r5.f159822g
            if (r1 != 0) goto L_0x0055
            int r1 = r5.getMeasuredWidth()
            int r2 = r5.getMeasuredHeight()
            r0.setBounds(r3, r3, r1, r2)
            android.graphics.drawable.Drawable r0 = r5.f159821f
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003c
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            goto L_0x003d
        L_0x003c:
            r0 = r4
        L_0x003d:
            if (r0 == 0) goto L_0x004a
            int r1 = r5.getMeasuredWidth()
            int r2 = r5.getMeasuredHeight()
            r0.setSize(r1, r2)
        L_0x004a:
            android.graphics.drawable.Drawable r0 = r5.f159821f
            gy3.C87412m.m108591d(r0)
            android.graphics.Bitmap r0 = o40.C61926c.m72686k(r0)
            r5.f159822g = r0
        L_0x0055:
            android.graphics.Bitmap r0 = r5.f159822g
            if (r0 == 0) goto L_0x0060
            if (r6 == 0) goto L_0x0060
            android.graphics.Matrix r1 = r5.f159823h
            r6.drawBitmap(r0, r1, r4)
        L_0x0060:
            super.onDraw(r6)
            if (r6 == 0) goto L_0x0068
            r6.restore()
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveSkewView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveSkewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
