package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import p282z2.C16095a;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107207u;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: f */
    public final Rect f309103f = new Rect();

    /* renamed from: g */
    public final Rect f309104g = new Rect();

    /* renamed from: h */
    public int f309105h = 0;

    /* renamed from: i */
    public int f309106i;

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: A */
    public float mo146194A(View view) {
        return 1.0f;
    }

    /* renamed from: B */
    public int mo146195B(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: g */
    public boolean mo144927g(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View z;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (z = mo146196z(coordinatorLayout.mo144889l(view))) == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107208b.m145174b(z) || C107207u.C107208b.m145174b(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            view.setFitsSystemWindows(true);
            if (C107207u.C107208b.m145174b(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.mo144920t(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - z.getMeasuredHeight()) + mo146195B(z), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* renamed from: x */
    public void mo146256x(CoordinatorLayout coordinatorLayout, View view, int i) {
        View z = mo146196z(coordinatorLayout.mo144889l(view));
        int i2 = 0;
        if (z != null) {
            CoordinatorLayout.C103717e eVar = (CoordinatorLayout.C103717e) view.getLayoutParams();
            Rect rect = this.f309103f;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, z.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + z.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C107179f0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107208b.m145174b(coordinatorLayout) && !C107207u.C107208b.m145174b(view)) {
                    rect.left += lastWindowInsets.mo157630b();
                    rect.right -= lastWindowInsets.mo157631c();
                }
            }
            Rect rect2 = this.f309104g;
            int i3 = eVar.f306330c;
            Gravity.apply(i3 == 0 ? 8388659 : i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.f309106i != 0) {
                float A = mo146194A(z);
                int i4 = this.f309106i;
                i2 = C16095a.m14980b((int) (A * ((float) i4)), 0, i4);
            }
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f309105h = rect2.top - z.getBottom();
            return;
        }
        coordinatorLayout.mo144913s(view, i);
        this.f309105h = 0;
    }

    /* renamed from: z */
    public abstract View mo146196z(List<View> list);

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
