package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.base.MMSmoothHorizontalScrollView */
public class MMSmoothHorizontalScrollView extends HorizontalScrollView implements C111847h {

    /* renamed from: d */
    public View f24198d;

    /* renamed from: e */
    public float f24199e;

    /* renamed from: f */
    public Rect f24200f = new Rect();

    /* renamed from: g */
    public TranslateAnimation f24201g;

    /* renamed from: h */
    public Interpolator f24202h = new DecelerateInterpolator();

    public MMSmoothHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFadingEdgeLength(0);
    }

    public void onFinishInflate() {
        if (getChildCount() > 0) {
            this.f24198d = getChildAt(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r0 != 3) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f24198d
            if (r0 != 0) goto L_0x0009
            boolean r7 = super.onTouchEvent(r7)
            return r7
        L_0x0009:
            int r0 = r7.getAction()
            if (r0 == 0) goto L_0x00ea
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0096
            r3 = 2
            if (r0 == r3) goto L_0x001b
            r3 = 3
            if (r0 == r3) goto L_0x0096
            goto L_0x00f0
        L_0x001b:
            float r0 = r7.getX()
            float r4 = r6.f24199e
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0027
            r6.f24199e = r0
        L_0x0027:
            float r1 = r6.f24199e
            float r1 = r1 - r0
            int r1 = (int) r1
            int r1 = r1 / r3
            r3 = 0
            r6.scrollBy(r1, r3)
            r6.f24199e = r0
            android.view.View r0 = r6.f24198d
            int r0 = r0.getMeasuredWidth()
            int r4 = r6.getWidth()
            int r5 = r6.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r6.getPaddingRight()
            int r4 = r4 - r5
            int r0 = r0 - r4
            int r4 = r6.getScrollX()
            if (r4 == 0) goto L_0x0051
            if (r4 != r0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            if (r2 == 0) goto L_0x00f0
            android.graphics.Rect r0 = r6.f24200f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0078
            android.graphics.Rect r0 = r6.f24200f
            android.view.View r2 = r6.f24198d
            int r2 = r2.getLeft()
            android.view.View r3 = r6.f24198d
            int r3 = r3.getTop()
            android.view.View r4 = r6.f24198d
            int r4 = r4.getRight()
            android.view.View r5 = r6.f24198d
            int r5 = r5.getBottom()
            r0.set(r2, r3, r4, r5)
        L_0x0078:
            android.view.View r0 = r6.f24198d
            int r2 = r0.getLeft()
            int r2 = r2 - r1
            android.view.View r3 = r6.f24198d
            int r3 = r3.getTop()
            android.view.View r4 = r6.f24198d
            int r4 = r4.getRight()
            int r4 = r4 - r1
            android.view.View r1 = r6.f24198d
            int r1 = r1.getBottom()
            r0.layout(r2, r3, r4, r1)
            goto L_0x00f0
        L_0x0096:
            r6.f24199e = r1
            android.graphics.Rect r0 = r6.f24200f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00f0
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            android.view.View r2 = r6.f24198d
            int r2 = r2.getLeft()
            float r2 = (float) r2
            android.graphics.Rect r3 = r6.f24200f
            int r3 = r3.left
            float r3 = (float) r3
            r0.<init>(r2, r3, r1, r1)
            r6.f24201g = r0
            android.view.animation.Interpolator r1 = r6.f24202h
            r0.setInterpolator(r1)
            android.view.animation.TranslateAnimation r0 = r6.f24201g
            android.view.View r1 = r6.f24198d
            int r1 = r1.getLeft()
            android.graphics.Rect r2 = r6.f24200f
            int r2 = r2.left
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            long r1 = (long) r1
            r0.setDuration(r1)
            android.view.View r0 = r6.f24198d
            android.view.animation.TranslateAnimation r1 = r6.f24201g
            r0.startAnimation(r1)
            android.view.View r0 = r6.f24198d
            android.graphics.Rect r1 = r6.f24200f
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            r0.layout(r2, r3, r4, r1)
            android.graphics.Rect r0 = r6.f24200f
            r0.setEmpty()
            goto L_0x00f0
        L_0x00ea:
            float r0 = r7.getX()
            r6.f24199e = r0
        L_0x00f0:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMSmoothHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
