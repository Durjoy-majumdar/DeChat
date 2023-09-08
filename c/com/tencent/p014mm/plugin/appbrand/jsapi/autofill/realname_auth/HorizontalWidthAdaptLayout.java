package com.tencent.p014mm.plugin.appbrand.jsapi.autofill.realname_auth;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/HorizontalWidthAdaptLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LayoutParams", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout */
public final class HorizontalWidthAdaptLayout extends ViewGroup {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/HorizontalWidthAdaptLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout$LayoutParams */
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalWidthAdaptLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo76997a(ArrayList<View> arrayList, int i) {
        Iterator<View> it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            View next = it.next();
            ViewGroup.LayoutParams layoutParams = next.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            i2 += next.getMeasuredWidth() + layoutParams2.getMarginStart() + layoutParams2.getMarginEnd();
            int measuredHeight = next.getMeasuredHeight();
            if (i3 < measuredHeight) {
                i3 = measuredHeight;
            }
        }
        int measuredWidth = (getMeasuredWidth() - i2) / 2;
        int paddingStart = getPaddingStart();
        Iterator<View> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            View next2 = it4.next();
            ViewGroup.LayoutParams layoutParams3 = next2.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
            LayoutParams layoutParams4 = (LayoutParams) layoutParams3;
            int measuredHeight2 = (i3 - next2.getMeasuredHeight()) / 2;
            int i4 = measuredWidth + paddingStart;
            next2.layout(layoutParams4.leftMargin + i4, layoutParams4.topMargin + i + measuredHeight2, i4 + next2.getMeasuredWidth() + layoutParams4.leftMargin, next2.getMeasuredHeight() + i + layoutParams4.topMargin + measuredHeight2);
            paddingStart += next2.getMeasuredWidth() + layoutParams4.leftMargin + layoutParams4.rightMargin;
        }
    }

    /* renamed from: b */
    public final int mo76998b(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i;
            }
        } else if (i <= size) {
            return i;
        }
        return size;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (paddingStart + measuredWidth + layoutParams2.leftMargin + layoutParams2.rightMargin > getMeasuredWidth()) {
                mo76997a(arrayList, paddingTop);
                arrayList.clear();
                paddingTop += measuredHeight + layoutParams2.topMargin;
                paddingStart = getPaddingStart();
            }
            arrayList.add(childAt);
            paddingStart += measuredWidth + layoutParams2.leftMargin + layoutParams2.rightMargin;
        }
        mo76997a(arrayList, paddingTop);
        arrayList.clear();
    }

    public void onMeasure(int i, int i2) {
        int b = mo76998b(0, i);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.autofill.realname_auth.HorizontalWidthAdaptLayout.LayoutParams");
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                if (i5 == 0) {
                    i3 = childAt.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                }
                if (childAt.getMeasuredWidth() + i4 + layoutParams2.leftMargin + layoutParams2.rightMargin > b) {
                    i3 += childAt.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                    i4 = 0;
                }
                i4 += childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
            }
        }
        setMeasuredDimension(mo76998b(0, i), mo76998b(i3 + getPaddingTop() + getPaddingBottom(), i2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalWidthAdaptLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
