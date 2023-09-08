package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gy3.C87412m;
import iy3.C60641c;
import kotlin.Metadata;
import uc1.C14153w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFixedRatioLayout;", "Landroid/widget/FrameLayout;", "", "d", "F", "getWidthWeight", "()F", "setWidthWeight", "(F)V", "widthWeight", "e", "getHeightWeight", "setHeightWeight", "heightWeight", "", "f", "Z", "getRelatedToWidth", "()Z", "setRelatedToWidth", "(Z)V", "relatedToWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout */
public final class FinderFixedRatioLayout extends FrameLayout {

    /* renamed from: d */
    public float f17777d = 1.0f;

    /* renamed from: e */
    public float f17778e = 1.0f;

    /* renamed from: f */
    public boolean f17779f = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFixedRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo4548a(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo4548a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39585d, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…RatioLayout, defStyle, 0)");
        this.f17777d = obtainStyledAttributes.getFloat(2, 1.0f);
        this.f17778e = obtainStyledAttributes.getFloat(0, 1.0f);
        this.f17779f = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public final float getHeightWeight() {
        return this.f17778e;
    }

    public final boolean getRelatedToWidth() {
        return this.f17779f;
    }

    public final float getWidthWeight() {
        return this.f17777d;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f17779f) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C60641c.m70921b((((float) getMeasuredWidth()) * this.f17778e) / this.f17777d), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C60641c.m70921b((((float) getMeasuredHeight()) * this.f17777d) / this.f17778e), 1073741824), i2);
        }
    }

    public final void setHeightWeight(float f) {
        this.f17778e = f;
    }

    public final void setRelatedToWidth(boolean z) {
        this.f17779f = z;
    }

    public final void setWidthWeight(float f) {
        this.f17777d = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFixedRatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo4548a(context, attributeSet, i);
    }
}
