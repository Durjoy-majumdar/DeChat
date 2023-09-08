package com.tencent.p014mm.view.ratio;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import iq3.C60599a;
import iq3.C60600b;
import iq3.C60601c;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13604l;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0012\u0010\n\u001a\u00020\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/view/ratio/RatioLayout;", "Landroid/view/ViewGroup;", "Liq3/c;", "getLayoutManager", "layoutManager", "Lrx3/b0;", "setLayoutManager", "Liq3/b;", "getAdapter", "adapter", "setAdapter", "Liq3/a;", "itemDecoration", "setItemDecoration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "LayoutParams", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.ratio.RatioLayout */
public class RatioLayout extends ViewGroup {

    /* renamed from: d */
    public final String f165724d = "MicroMsg.MultiAreaLayout";

    /* renamed from: e */
    public C60601c f165725e;

    /* renamed from: f */
    public C60600b<?> f165726f;

    /* renamed from: g */
    public C60599a f165727g;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/view/ratio/RatioLayout$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.view.ratio.RatioLayout$LayoutParams */
    public static final class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public C57914a f165728a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C87412m.m108594g(context, "c");
            C87412m.m108594g(attributeSet, "attrs");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams.width, layoutParams.height);
            C87412m.m108594g(layoutParams, FirebaseAnalytics.C113379b.SOURCE);
        }
    }

    /* renamed from: com.tencent.mm.view.ratio.RatioLayout$a */
    public static class C57914a {

        /* renamed from: a */
        public float f165729a;

        /* renamed from: b */
        public float f165730b;

        /* renamed from: c */
        public float f165731c;

        /* renamed from: d */
        public float f165732d;

        public C57914a(float f, float f2, float f3, float f4) {
            this.f165729a = f;
            this.f165730b = f2;
            this.f165731c = f3;
            this.f165732d = f4;
        }

        public String toString() {
            return "x:" + this.f165729a + ", y:" + this.f165730b + ", w:" + this.f165731c + ", h:" + this.f165732d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatioLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public final void mo82584c(String str) {
        Log.m105924i(this.f165724d, str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C60599a aVar = this.f165727g;
        if (aVar != null && canvas != null) {
            aVar.mo85552a(canvas, this);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C87412m.m108594g(layoutParams, "p");
        return new LayoutParams(layoutParams);
    }

    public final C60600b<?> getAdapter() {
        C60600b<?> bVar = this.f165726f;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public final C60601c getLayoutManager() {
        C60601c cVar = this.f165725e;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("layoutManager");
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        C13598b0 b0Var;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        mo82584c("onLayout, width:" + measuredWidth + ", height:" + measuredHeight + ", count:" + childCount + ", paddingLeft:" + getPaddingLeft() + ", paddingRight:" + getPaddingRight() + ", paddingTop:" + getPaddingTop() + ", paddingBottom:" + getPaddingBottom());
        int childCount2 = getChildCount();
        int i9 = 0;
        while (i9 < childCount2) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.view.ratio.RatioLayout.LayoutParams");
                C57914a aVar = ((LayoutParams) layoutParams).f165728a;
                if (aVar != null) {
                    i8 = childCount2;
                    int i15 = (int) (aVar.f165729a * ((float) measuredWidth));
                    int i16 = (int) (aVar.f165730b * ((float) measuredHeight));
                    int paddingLeft = getPaddingLeft() + i15;
                    i7 = i9;
                    int paddingTop = getPaddingTop() + i16;
                    i6 = measuredHeight;
                    i5 = measuredWidth;
                    childAt.layout(paddingLeft, paddingTop, paddingLeft + childAt.getMeasuredWidth(), paddingTop + childAt.getMeasuredHeight());
                    mo82584c("onLayout case1, childLayoutParams:" + childAt.getMeasuredWidth() + ',' + childAt.getMeasuredHeight() + "x:" + i15 + ", y:" + i16 + ", left:" + paddingLeft + ", top:" + paddingTop + ", right:" + (paddingLeft + childAt.getMeasuredWidth()) + ", bottom:" + (paddingTop + childAt.getMeasuredHeight()));
                    b0Var = C13598b0.f38549a;
                } else {
                    i5 = measuredWidth;
                    i6 = measuredHeight;
                    i8 = childCount2;
                    i7 = i9;
                    b0Var = null;
                }
                if (b0Var == null) {
                    C13604l lVar = childCount == 1 ? new C13604l(0, 0) : new C13604l(Integer.valueOf(i5 / childCount), Integer.valueOf(i6 / childCount));
                    int intValue = ((Number) lVar.f38555d).intValue();
                    int intValue2 = ((Number) lVar.f38556e).intValue();
                    int paddingLeft2 = getPaddingLeft() + intValue;
                    int paddingTop2 = getPaddingTop() + intValue2;
                    childAt.layout(paddingLeft2, paddingTop2, childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + paddingTop2);
                    mo82584c("onLayout case2, childLayoutParams:" + childAt.getMeasuredWidth() + ',' + childAt.getMeasuredHeight() + "x:" + intValue + ", y:" + intValue2 + ", left:" + paddingLeft2 + ", top:" + paddingTop2 + ", right:" + (paddingLeft2 + childAt.getMeasuredWidth()) + ", bottom:" + (paddingTop2 + childAt.getMeasuredHeight()));
                }
            } else {
                i5 = measuredWidth;
                i6 = measuredHeight;
                i8 = childCount2;
                i7 = i9;
            }
            i9 = i7 + 1;
            childCount2 = i8;
            measuredHeight = i6;
            measuredWidth = i5;
        }
    }

    public void onMeasure(int i, int i2) {
        C13598b0 b0Var;
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        mo82584c("onMeasure, width:" + measuredWidth + ", height:" + measuredHeight + ", count:" + childCount);
        int childCount2 = getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type com.tencent.mm.view.ratio.RatioLayout.LayoutParams");
                C57914a aVar = ((LayoutParams) layoutParams).f165728a;
                if (aVar != null) {
                    float f = (float) measuredWidth;
                    float f2 = (float) measuredHeight;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (aVar.f165731c * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (aVar.f165732d * f2), 1073741824));
                    mo82584c("onMeasure case1, index:" + i3 + ", width:" + ((int) (aVar.f165731c * f)) + ", height:" + ((int) (aVar.f165732d * f2)));
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    Integer valueOf = Integer.valueOf(measuredWidth / childCount);
                    Integer valueOf2 = Integer.valueOf(measuredHeight / childCount);
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(valueOf.intValue(), 1073741824), View.MeasureSpec.makeMeasureSpec(valueOf2.intValue(), 1073741824));
                    mo82584c("onMeasure case2, index:" + i3 + ", width:" + valueOf.intValue() + ", height:" + valueOf2.intValue());
                }
            }
        }
    }

    public final void setAdapter(C60600b<?> bVar) {
        C87412m.m108594g(bVar, "adapter");
        this.f165726f = bVar;
        bVar.f172707a = this;
    }

    public final void setItemDecoration(C60599a aVar) {
        C87412m.m108594g(aVar, "itemDecoration");
        this.f165727g = aVar;
    }

    public final void setLayoutManager(C60601c cVar) {
        C87412m.m108594g(cVar, "layoutManager");
        this.f165725e = cVar;
        cVar.f172709b = this;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C87412m.m108594g(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226880z);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.RatioLayout)");
        float f = obtainStyledAttributes.getFloat(2, 0.0f);
        float f2 = obtainStyledAttributes.getFloat(3, 0.0f);
        float f3 = obtainStyledAttributes.getFloat(1, 0.0f);
        float f4 = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
        Context context = getContext();
        C87412m.m108593f(context, "context");
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f165728a = new C57914a(f, f2, f3, f4);
        return layoutParams;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
