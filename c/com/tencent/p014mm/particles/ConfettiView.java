package com.tencent.p014mm.particles;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bf0.C16794b;
import com.tencent.p014mm.C0966R;
import java.util.List;

/* renamed from: com.tencent.mm.particles.ConfettiView */
public class ConfettiView extends View implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public List<C16794b> f49119d;

    /* renamed from: e */
    public boolean f49120e;

    /* renamed from: f */
    public boolean f49121f;

    /* renamed from: g */
    public C16794b f49122g;

    public ConfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static ConfettiView m18216a(Context context) {
        ConfettiView confettiView = new ConfettiView(context, (AttributeSet) null);
        confettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        confettiView.setElevation((float) context.getResources().getDimensionPixelOffset(C0966R.dimen.f4296zn));
        return confettiView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        viewGroup.removeOnLayoutChangeListener(this);
        viewGroup.addOnLayoutChangeListener(this);
        if (this.f49119d == null && !this.f49120e) {
            this.f49120e = true;
            getParent().requestLayout();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f49120e) {
            canvas.save();
            for (C16794b next : this.f49119d) {
                if (next.f45362D) {
                    next.mo17824d(canvas, next.f45364F + next.f45366H, next.f45365G + next.f45367I, next.f45393z, next.f45390w);
                } else if (next.f45360B && !next.f45361C) {
                    next.mo17824d(canvas, next.f45391x, next.f45392y, next.f45393z, next.f45390w);
                }
            }
            canvas.restore();
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewParent parent;
        if (this.f49120e && (parent = getParent()) != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeViewInLayout(this);
            viewGroup.removeOnLayoutChangeListener(this);
            viewGroup.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f49121f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00db
            int r0 = r9.getAction()
            if (r0 == 0) goto L_0x0078
            if (r0 == r2) goto L_0x002f
            r3 = 2
            if (r0 == r3) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x002f
            goto L_0x00db
        L_0x0016:
            bf0.b r0 = r8.f49122g
            if (r0 == 0) goto L_0x00db
            r0.getClass()
            float r3 = r9.getX()
            r0.f45364F = r3
            float r3 = r9.getY()
            r0.f45365G = r3
            android.view.VelocityTracker r0 = r0.f45363E
            r0.addMovement(r9)
            goto L_0x0076
        L_0x002f:
            bf0.b r0 = r8.f49122g
            if (r0 == 0) goto L_0x00db
            android.view.VelocityTracker r3 = r0.f45363E
            r3.addMovement(r9)
            android.view.VelocityTracker r3 = r0.f45363E
            r3.computeCurrentVelocity(r2)
            r3 = -1
            r0.f45371d = r3
            float r3 = r9.getX()
            float r4 = r0.f45366H
            float r3 = r3 + r4
            r0.f45372e = r3
            float r3 = r9.getY()
            float r4 = r0.f45367I
            float r3 = r3 + r4
            r0.f45373f = r3
            android.view.VelocityTracker r3 = r0.f45363E
            float r3 = r3.getXVelocity()
            r0.f45374g = r3
            android.view.VelocityTracker r3 = r0.f45363E
            float r3 = r3.getYVelocity()
            r0.f45375h = r3
            float r3 = r0.f45393z
            r0.f45382o = r3
            android.view.VelocityTracker r3 = r0.f45363E
            r3.recycle()
            android.graphics.Rect r3 = r0.f45370c
            r0.mo17825h(r3)
            r0.f45362D = r1
            r0 = 0
            r8.f49122g = r0
        L_0x0076:
            r0 = 1
            goto L_0x00dc
        L_0x0078:
            java.util.List<bf0.b> r0 = r8.f49119d
            java.util.Iterator r0 = r0.iterator()
        L_0x007e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r0.next()
            bf0.b r3 = (bf0.C16794b) r3
            r3.getClass()
            float r4 = r9.getX()
            float r5 = r9.getY()
            float r6 = r3.f45391x
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x00b7
            int r7 = r3.mo17822g()
            float r7 = (float) r7
            float r6 = r6 + r7
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x00b7
            float r6 = r3.f45392y
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00b7
            int r7 = r3.mo17821f()
            float r7 = (float) r7
            float r6 = r6 + r7
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x00b7
            r6 = 1
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            if (r6 == 0) goto L_0x00d5
            r3.f45362D = r2
            r3.f45364F = r4
            r3.f45365G = r5
            float r6 = r3.f45391x
            float r6 = r6 - r4
            r3.f45366H = r6
            float r4 = r3.f45392y
            float r4 = r4 - r5
            r3.f45367I = r4
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r3.f45363E = r4
            r4.addMovement(r9)
            r4 = 1
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            if (r4 == 0) goto L_0x007e
            r8.f49122g = r3
            goto L_0x0076
        L_0x00db:
            r0 = 0
        L_0x00dc:
            if (r0 != 0) goto L_0x00e4
            boolean r9 = super.onTouchEvent(r9)
            if (r9 == 0) goto L_0x00e5
        L_0x00e4:
            r1 = 1
        L_0x00e5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.particles.ConfettiView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTouchEnabled(boolean z) {
        this.f49121f = z;
    }
}
