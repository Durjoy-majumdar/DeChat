package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView */
public final class AppBrandNearbyShowcaseView extends FrameLayout {

    /* renamed from: d */
    public int f108973d = C76577a.m92151b(getContext(), 25);

    /* renamed from: e */
    public int f108974e = C76577a.m92151b(getContext(), 19);

    public AppBrandNearbyShowcaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo63419a(boolean z) {
        if (getChildCount() > 1) {
            int i = 200;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (z) {
                    childAt.animate().setDuration((long) i).translationX((float) ((FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin).start();
                } else {
                    childAt.setTranslationX((float) ((FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin);
                }
                i += 50;
            }
        }
    }

    /* renamed from: b */
    public void mo63420b(boolean z) {
        if (getChildCount() > 1) {
            int i = 200;
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (z) {
                    childAt.animate().setDuration((long) i).translationX(0.0f).start();
                } else {
                    childAt.setTranslationX(0.0f);
                }
                i += 50;
            }
        }
    }

    /* renamed from: c */
    public final void mo63421c() {
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int i = this.f108973d;
                layoutParams2.height = i;
                layoutParams.width = i;
                ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity |= 5;
                ((FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin = this.f108974e * childCount;
            }
            requestLayout();
            invalidate();
        }
    }

    public int getExpandDuration() {
        if (getChildCount() <= 1) {
            return 0;
        }
        return ((getChildCount() - 2) * 50) + 200;
    }

    public void setIconGap(int i) {
        if (i >= 0 && this.f108974e != i) {
            this.f108974e = i;
            mo63421c();
        }
    }

    public void setIconLayerCount(int i) {
        if (i >= 0 && i != getChildCount()) {
            if (i > getChildCount()) {
                int childCount = i - getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ImageView imageView = new ImageView(getContext());
                    int i3 = this.f108973d;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                    layoutParams.gravity = 16;
                    addViewInLayout(imageView, 0, layoutParams, true);
                }
            } else if (i < getChildCount()) {
                removeViewsInLayout(0, getChildCount() - i);
            }
            mo63421c();
        }
    }

    public void setIconSize(int i) {
        if (i > 0 && i != this.f108973d) {
            this.f108973d = i;
            mo63421c();
        }
    }

    public AppBrandNearbyShowcaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
