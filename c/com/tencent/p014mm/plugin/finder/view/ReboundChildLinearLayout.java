package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import v00.C14402a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/ReboundChildLinearLayout;", "Landroid/widget/LinearLayout;", "", "orientation", "Lrx3/b0;", "setOrientation", "e", "I", "getReboundChildId", "()I", "setReboundChildId", "(I)V", "reboundChildId", "f", "getSubOrientation", "setSubOrientation", "subOrientation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finder-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.ReboundChildLinearLayout */
public final class ReboundChildLinearLayout extends LinearLayout {

    /* renamed from: d */
    public final String f18042d = "Finder.ReboundChildLinearLayout";

    /* renamed from: e */
    public int f18043e = -1;

    /* renamed from: f */
    public int f18044f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReboundChildLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo4821a(attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo4821a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14402a.f39980b, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…inearLayout, defStyle, 0)");
        this.f18043e = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        String str = this.f18042d;
        Log.m105924i(str, "[initAttribute],reboundId:" + this.f18043e);
    }

    public final int getReboundChildId() {
        return this.f18043e;
    }

    public final int getSubOrientation() {
        return this.f18044f;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18043e != -1) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (!(childAt != null && childAt.getId() == this.f18043e)) {
                    i3++;
                } else if (this.f18044f == 1) {
                    C87412m.m108593f(childAt, "child");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (layoutParams2.height != 0 || layoutParams2.weight <= 0.0f) {
                        String str = this.f18042d;
                        Log.m105920e(str, "tryToReboundChildVertical " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",height:" + layoutParams2.height + ",weight:" + layoutParams2.weight + '!');
                        return;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        String str2 = this.f18042d;
                        Log.m105920e(str2, "tryToReboundChildVertical " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureHeight:" + measuredHeight + ",measuredHeight:" + getMeasuredHeight() + '!');
                        return;
                    }
                    layoutParams2.height = -2;
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824), 0);
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    layoutParams2.height = 0;
                    String str3 = this.f18042d;
                    Log.m105924i(str3, "tryToReboundChildVertical " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureHeight:" + measuredHeight + ",measuredHeight:" + getMeasuredHeight() + ",newReboundChildMeasureHeight:" + measuredHeight2 + '!');
                    if (measuredHeight2 > 0 && measuredHeight2 > measuredHeight) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                        return;
                    }
                    return;
                } else {
                    C87412m.m108593f(childAt, "child");
                    ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                    C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    if (layoutParams4.width != 0 || layoutParams4.weight <= 0.0f) {
                        String str4 = this.f18042d;
                        Log.m105920e(str4, "tryToReboundChildHorizontal " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",width:" + layoutParams4.width + ",weight:" + layoutParams4.weight + '!');
                        return;
                    }
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (measuredWidth <= 0) {
                        String str5 = this.f18042d;
                        Log.m105920e(str5, "tryToReboundChildHorizontal " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureWidth:" + measuredWidth + ",measuredWidth:" + getMeasuredWidth() + '!');
                        return;
                    }
                    layoutParams4.width = -2;
                    measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), 0, i2, 0);
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    layoutParams4.width = 0;
                    String str6 = this.f18042d;
                    Log.m105924i(str6, "tryToReboundChildHorizontal " + childAt.getContext().getResources().getResourceEntryName(childAt.getId()) + ",oldReboundChildMeasureWidth:" + measuredWidth + ",measuredWidth:" + getMeasuredWidth() + ",newReboundChildMeasureWidth:" + measuredWidth2 + '!');
                    if (measuredWidth2 > 0 && measuredWidth2 > measuredWidth) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        String str = this.f18042d;
        Log.m105924i(str, "[setOrientation],orientation:" + i);
        this.f18044f = i;
    }

    public final void setReboundChildId(int i) {
        this.f18043e = i;
    }

    public final void setSubOrientation(int i) {
        this.f18044f = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReboundChildLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo4821a(attributeSet, i);
    }
}
