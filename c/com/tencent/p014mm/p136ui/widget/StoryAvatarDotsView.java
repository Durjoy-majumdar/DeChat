package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.widget.StoryAvatarDotsView */
public final class StoryAvatarDotsView extends FrameLayout {

    /* renamed from: d */
    public int f285520d = C76577a.m92151b(getContext(), 25);

    /* renamed from: e */
    public int f285521e = C76577a.m92151b(getContext(), 19);

    public StoryAvatarDotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public ImageView mo136313a(int i) {
        return (ImageView) getChildAt((getChildCount() - 1) - i);
    }

    /* renamed from: b */
    public final void mo136314b() {
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int i = this.f285520d;
                layoutParams2.height = i;
                layoutParams.width = i;
                ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity |= 5;
                ((FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin = this.f285521e * childCount;
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
        if (i >= 0 && this.f285521e != i) {
            this.f285521e = i;
            mo136314b();
        }
    }

    public void setIconLayerCount(int i) {
        if (i >= 0 && i != getChildCount()) {
            if (i > getChildCount()) {
                int childCount = i - getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ImageView imageView = new ImageView(getContext());
                    int i3 = this.f285520d;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                    layoutParams.gravity = 16;
                    addViewInLayout(imageView, 0, layoutParams, true);
                }
            } else if (i < getChildCount()) {
                removeViewsInLayout(0, getChildCount() - i);
            }
            mo136314b();
        }
    }

    public void setIconSize(int i) {
        if (i > 0 && i != this.f285520d) {
            this.f285520d = i;
            mo136314b();
        }
    }

    public StoryAvatarDotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
