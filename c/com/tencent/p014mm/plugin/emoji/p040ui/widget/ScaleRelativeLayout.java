package com.tencent.p014mm.plugin.emoji.p040ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout */
public class ScaleRelativeLayout extends RelativeLayout {

    /* renamed from: d */
    public float f269105d;

    /* renamed from: e */
    public float f269106e;

    /* renamed from: f */
    public float f269107f;

    /* renamed from: g */
    public float f269108g;

    /* renamed from: h */
    public float f269109h;

    /* renamed from: i */
    public float f269110i;

    /* renamed from: j */
    public float f269111j;

    /* renamed from: n */
    public float f269112n;

    /* renamed from: o */
    public View f269113o;

    /* renamed from: p */
    public boolean f269114p;

    /* renamed from: q */
    public ValueAnimator f269115q;

    /* renamed from: r */
    public C93273a f269116r;

    /* renamed from: s */
    public boolean f269117s;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout$a */
    public interface C93273a {
    }

    public ScaleRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f269114p
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002e
            int r0 = r9.getPointerCount()
            if (r0 != r1) goto L_0x002e
            r8.f269114p = r3
            float r0 = r9.getX(r2)
            float r4 = r9.getX(r3)
            float r0 = r0 - r4
            double r4 = (double) r0
            float r0 = r9.getY(r2)
            float r6 = r9.getY(r3)
            float r0 = r0 - r6
            double r6 = (double) r0
            double r4 = java.lang.Math.hypot(r4, r6)
            float r0 = (float) r4
            r8.f269109h = r0
            float r0 = r8.f269107f
            r8.f269108g = r0
        L_0x002e:
            int r0 = r9.getActionMasked()
            if (r0 == r3) goto L_0x00a7
            if (r0 == r1) goto L_0x004d
            r4 = 6
            if (r0 == r4) goto L_0x003b
            goto L_0x00de
        L_0x003b:
            int r9 = r9.getPointerCount()
            if (r9 != r1) goto L_0x00de
            float r9 = r8.f269110i
            r8.f269109h = r9
            float r9 = r8.f269107f
            r8.f269108g = r9
            r8.f269114p = r2
            goto L_0x00de
        L_0x004d:
            int r0 = r9.getPointerCount()
            if (r0 != r1) goto L_0x00de
            float r0 = r9.getX(r2)
            float r1 = r9.getX(r3)
            float r0 = r0 - r1
            double r0 = (double) r0
            float r2 = r9.getY(r2)
            float r9 = r9.getY(r3)
            float r2 = r2 - r9
            double r4 = (double) r2
            double r0 = java.lang.Math.hypot(r0, r4)
            float r9 = (float) r0
            float r0 = r8.f269108g
            float r0 = r0 * r9
            float r1 = r8.f269109h
            float r0 = r0 / r1
            float r2 = r8.f269111j
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x007f
            float r1 = r1 * r2
            r8.f269110i = r1
        L_0x007d:
            r0 = r2
            goto L_0x008c
        L_0x007f:
            float r2 = r8.f269112n
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x008a
            float r1 = r1 * r2
            r8.f269110i = r1
            goto L_0x007d
        L_0x008a:
            r8.f269110i = r9
        L_0x008c:
            r8.f269107f = r0
            android.animation.ValueAnimator r9 = r8.f269115q
            if (r9 == 0) goto L_0x0095
            r9.cancel()
        L_0x0095:
            boolean r9 = r8.f269117s
            if (r9 != 0) goto L_0x00de
            r8.f269117s = r3
            com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout$a r9 = r8.f269116r
            if (r9 == 0) goto L_0x00de
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$i r9 = (com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI$$i) r9
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI r9 = r9.f268376a
            com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI.m117568H7(r9, r3)
            goto L_0x00de
        L_0x00a7:
            float r9 = r8.f269107f
            float r0 = r8.f269106e
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b0
            goto L_0x00b8
        L_0x00b0:
            float r0 = r8.f269105d
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r0 = r9
        L_0x00b8:
            android.animation.ValueAnimator r4 = r8.f269115q
            if (r4 == 0) goto L_0x00bf
            r4.cancel()
        L_0x00bf:
            float[] r1 = new float[r1]
            r1[r2] = r9
            r1[r3] = r0
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r1)
            r8.f269115q = r9
            t61.n r0 = new t61.n
            r0.<init>(r8)
            r9.addUpdateListener(r0)
            android.animation.ValueAnimator r9 = r8.f269115q
            r9.start()
            boolean r9 = r8.f269117s
            if (r9 == 0) goto L_0x00de
            r8.f269117s = r2
        L_0x00de:
            float r9 = r8.f269109h
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x00ea
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r8.f269109h = r9
        L_0x00ea:
            android.view.View r9 = r8.f269113o
            if (r9 == 0) goto L_0x00f8
            float r0 = r8.f269107f
            r9.setScaleX(r0)
            float r0 = r8.f269107f
            r9.setScaleY(r0)
        L_0x00f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.widget.ScaleRelativeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setScaleActionStatusCallback(C93273a aVar) {
        this.f269116r = aVar;
    }

    public void setScaleChild(View view) {
        this.f269113o = view;
    }

    public ScaleRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f269105d = 3.0f;
        this.f269106e = 0.5f;
        this.f269107f = 1.0f;
        this.f269108g = 1.0f;
        this.f269109h = 0.0f;
        this.f269110i = 0.0f;
        this.f269111j = 6.0f;
        this.f269112n = 0.3f;
        this.f269114p = false;
        this.f269117s = false;
    }
}
