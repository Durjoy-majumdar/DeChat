package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p282z2.C16095a;
import p849e3.C107168a0;
import p849e3.C107207u;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: f */
    public Runnable f309093f;

    /* renamed from: g */
    public OverScroller f309094g;

    /* renamed from: h */
    public boolean f309095h;

    /* renamed from: i */
    public int f309096i = -1;

    /* renamed from: j */
    public int f309097j;

    /* renamed from: n */
    public int f309098n = -1;

    /* renamed from: o */
    public VelocityTracker f309099o;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    public class C104400a implements Runnable {

        /* renamed from: d */
        public final CoordinatorLayout f309100d;

        /* renamed from: e */
        public final V f309101e;

        public C104400a(CoordinatorLayout coordinatorLayout, V v) {
            this.f309100d = coordinatorLayout;
            this.f309101e = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f309101e != null && (overScroller = HeaderBehavior.this.f309094g) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo146254E(this.f309100d, this.f309101e, headerBehavior.f309094g.getCurrY());
                    V v = this.f309101e;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145185m(v, this);
                    return;
                }
                HeaderBehavior.this.mo146185D(this.f309100d, this.f309101e);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: A */
    public int mo146182A(V v) {
        return -v.getHeight();
    }

    /* renamed from: B */
    public int mo146183B(V v) {
        return v.getHeight();
    }

    /* renamed from: C */
    public int mo146184C() {
        return mo146259w();
    }

    /* renamed from: D */
    public void mo146185D(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: E */
    public int mo146254E(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo146186F(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: F */
    public int mo146186F(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int w = mo146259w();
        if (i2 == 0 || w < i2 || w > i3 || w == (b = C16095a.m14980b(i, i2, i3))) {
            return 0;
        }
        mo146260y(b);
        return w - b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x008a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143313e(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f309098n
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f309098n = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f309095h
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x008a
        L_0x002f:
            int r6 = r4.f309096i
            if (r6 != r5) goto L_0x0034
            goto L_0x008a
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x008a
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f309097j
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f309098n
            if (r6 <= r0) goto L_0x008a
            r4.f309095h = r2
            r4.f309097j = r5
            goto L_0x008a
        L_0x0051:
            r4.f309095h = r3
            r4.f309096i = r5
            android.view.VelocityTracker r5 = r4.f309099o
            if (r5 == 0) goto L_0x008a
            r5.recycle()
            r5 = 0
            r4.f309099o = r5
            goto L_0x008a
        L_0x0060:
            r4.f309095h = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo146190z(r6)
            if (r2 == 0) goto L_0x008a
            boolean r5 = r5.mo144909q(r6, r0, r1)
            if (r5 == 0) goto L_0x008a
            r4.f309097j = r1
            int r5 = r7.getPointerId(r3)
            r4.f309096i = r5
            android.view.VelocityTracker r5 = r4.f309099o
            if (r5 != 0) goto L_0x008a
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f309099o = r5
        L_0x008a:
            android.view.VelocityTracker r5 = r4.f309099o
            if (r5 == 0) goto L_0x0091
            r5.addMovement(r7)
        L_0x0091:
            boolean r5 = r4.f309095h
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo143313e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 != 3) goto L_0x0105;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo843v(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r6.f309098n
            if (r0 >= 0) goto L_0x001a
            android.content.Context r0 = r20.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f309098n = r0
        L_0x001a:
            int r0 = r22.getActionMasked()
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00dd
            r4 = 0
            r5 = -1
            if (r0 == r8) goto L_0x006e
            r9 = 2
            if (r0 == r9) goto L_0x002e
            r1 = 3
            if (r0 == r1) goto L_0x00cf
            goto L_0x0105
        L_0x002e:
            int r0 = r6.f309096i
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0037
            return r3
        L_0x0037:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f309097j
            int r3 = r3 - r0
            boolean r4 = r6.f309095h
            if (r4 != 0) goto L_0x0052
            int r4 = java.lang.Math.abs(r3)
            int r5 = r6.f309098n
            if (r4 <= r5) goto L_0x0052
            r6.f309095h = r8
            if (r3 <= 0) goto L_0x0051
            int r3 = r3 - r5
            goto L_0x0052
        L_0x0051:
            int r3 = r3 + r5
        L_0x0052:
            boolean r4 = r6.f309095h
            if (r4 == 0) goto L_0x0105
            r6.f309097j = r0
            int r4 = r6.mo146182A(r2)
            r5 = 0
            int r0 = r19.mo146184C()
            int r3 = r0 - r3
            r0 = r19
            r1 = r20
            r2 = r21
            r0.mo146186F(r1, r2, r3, r4, r5)
            goto L_0x0105
        L_0x006e:
            android.view.VelocityTracker r0 = r6.f309099o
            if (r0 == 0) goto L_0x00cf
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f309099o
            r9 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r9)
            android.view.VelocityTracker r0 = r6.f309099o
            int r9 = r6.f309096i
            float r0 = r0.getYVelocity(r9)
            int r9 = r6.mo146183B(r2)
            int r9 = -r9
            r18 = 0
            java.lang.Runnable r10 = r6.f309093f
            if (r10 == 0) goto L_0x0094
            r2.removeCallbacks(r10)
            r6.f309093f = r4
        L_0x0094:
            android.widget.OverScroller r10 = r6.f309094g
            if (r10 != 0) goto L_0x00a3
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.f309094g = r10
        L_0x00a3:
            android.widget.OverScroller r10 = r6.f309094g
            r11 = 0
            int r12 = r19.mo146259w()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r9
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f309094g
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00cc
            com.google.android.material.appbar.HeaderBehavior$a r0 = new com.google.android.material.appbar.HeaderBehavior$a
            r0.<init>(r1, r2)
            r6.f309093f = r0
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145185m(r2, r0)
            goto L_0x00cf
        L_0x00cc:
            r19.mo146185D(r20, r21)
        L_0x00cf:
            r6.f309095h = r3
            r6.f309096i = r5
            android.view.VelocityTracker r0 = r6.f309099o
            if (r0 == 0) goto L_0x0105
            r0.recycle()
            r6.f309099o = r4
            goto L_0x0105
        L_0x00dd:
            float r0 = r22.getX()
            int r0 = (int) r0
            float r4 = r22.getY()
            int r4 = (int) r4
            boolean r0 = r1.mo144909q(r2, r0, r4)
            if (r0 == 0) goto L_0x010d
            boolean r0 = r6.mo146190z(r2)
            if (r0 == 0) goto L_0x010d
            r6.f309097j = r4
            int r0 = r7.getPointerId(r3)
            r6.f309096i = r0
            android.view.VelocityTracker r0 = r6.f309099o
            if (r0 != 0) goto L_0x0105
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f309099o = r0
        L_0x0105:
            android.view.VelocityTracker r0 = r6.f309099o
            if (r0 == 0) goto L_0x010c
            r0.addMovement(r7)
        L_0x010c:
            return r8
        L_0x010d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo843v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: z */
    public boolean mo146190z(V v) {
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
