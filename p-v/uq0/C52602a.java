package uq0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import gy3.C87412m;

/* renamed from: uq0.a */
public final class C52602a extends FrameLayout {

    /* renamed from: d */
    public boolean f146908d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52602a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        super.setDescendantFocusability(262144);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("can host only one child".toString());
    }

    public final boolean getEnableFixSize() {
        return this.f146908d;
    }

    public void measureChild(View view, int i, int i2) {
        if (!this.f146908d) {
            super.measureChild(view, i, i2);
            return;
        }
        C87412m.m108591d(view);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom(), C75054z4.m90003a(getContext()).y));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (!this.f146908d) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        C87412m.m108591d(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, C75054z4.m90003a(getContext()).y));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f146908d && (getChildAt(0) instanceof C83797e3)) {
            View childAt = getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.IAppBrandWebView");
            ((C83797e3) childAt).mo63310e0(i3 - i, i4 - i2);
        }
    }

    public void setDescendantFocusability(int i) {
        if (getChildAt(0) instanceof ViewGroup) {
            View childAt = getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) childAt).setDescendantFocusability(i);
        }
    }

    public final void setEnableFixSize(boolean z) {
        this.f146908d = z;
    }

    public void setFocusable(boolean z) {
        if (getChildAt(0) instanceof ViewGroup) {
            View childAt = getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) childAt).setFocusable(z);
        }
    }

    public void setFocusableInTouchMode(boolean z) {
        if (getChildAt(0) instanceof ViewGroup) {
            View childAt = getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) childAt).setFocusableInTouchMode(z);
        }
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("can host only one  child".toString());
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("can host only one child".toString());
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("can host only one child".toString());
    }
}
