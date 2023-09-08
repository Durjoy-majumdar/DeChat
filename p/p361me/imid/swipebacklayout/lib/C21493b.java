package p361me.imid.swipebacklayout.lib;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.widget.C103732g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;

/* renamed from: me.imid.swipebacklayout.lib.b */
public class C21493b {

    /* renamed from: w */
    public static final Interpolator f60838w = new C21494a();

    /* renamed from: a */
    public int f60839a;

    /* renamed from: b */
    public int f60840b;

    /* renamed from: c */
    public int f60841c = -1;

    /* renamed from: d */
    public float[] f60842d;

    /* renamed from: e */
    public float[] f60843e;

    /* renamed from: f */
    public float[] f60844f;

    /* renamed from: g */
    public float[] f60845g;

    /* renamed from: h */
    public int[] f60846h;

    /* renamed from: i */
    public int[] f60847i;

    /* renamed from: j */
    public int[] f60848j;

    /* renamed from: k */
    public int f60849k;

    /* renamed from: l */
    public VelocityTracker f60850l;

    /* renamed from: m */
    public float f60851m;

    /* renamed from: n */
    public float f60852n;

    /* renamed from: o */
    public int f60853o;

    /* renamed from: p */
    public int f60854p;

    /* renamed from: q */
    public C103732g f60855q;

    /* renamed from: r */
    public final C21496c f60856r;

    /* renamed from: s */
    public View f60857s;

    /* renamed from: t */
    public boolean f60858t;

    /* renamed from: u */
    public final ViewGroup f60859u;

    /* renamed from: v */
    public final Runnable f60860v = new C21495b();

    /* renamed from: me.imid.swipebacklayout.lib.b$a */
    public class C21494a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: me.imid.swipebacklayout.lib.b$b */
    public class C21495b implements Runnable {
        public C21495b() {
        }

        public void run() {
            C21493b.this.mo33694o(0);
        }
    }

    /* renamed from: me.imid.swipebacklayout.lib.b$c */
    public static abstract class C21496c {
        /* renamed from: a */
        public abstract void mo33678a(View view, int i, int i2, int i3, int i4);
    }

    public C21493b(Context context, ViewGroup viewGroup, C21496c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f60859u = viewGroup;
            this.f60856r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f60853o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f60840b = viewConfiguration.getScaledTouchSlop();
            this.f60851m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f60852n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f60855q = new C103732g(context, f60838w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public void mo33680a() {
        this.f60841c = -1;
        float[] fArr = this.f60842d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f60843e, 0.0f);
            Arrays.fill(this.f60844f, 0.0f);
            Arrays.fill(this.f60845g, 0.0f);
            Arrays.fill(this.f60846h, 0);
            Arrays.fill(this.f60847i, 0);
            Arrays.fill(this.f60848j, 0);
            this.f60849k = 0;
        }
        VelocityTracker velocityTracker = this.f60850l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f60850l = null;
        }
    }

    /* renamed from: b */
    public final boolean mo33681b(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f60846h[i] & i2) != i2 || (this.f60854p & i2) == 0 || (this.f60848j[i] & i2) == i2 || (this.f60847i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f60840b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f60856r.getClass();
        }
        return (this.f60847i[i] & i2) == 0 && abs > ((float) this.f60840b);
    }

    /* renamed from: c */
    public boolean mo33682c(int i, int i2) {
        if (!((this.f60849k & (1 << i2)) != 0)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f60844f[i2] - this.f60842d[i2];
        float f2 = this.f60845g[i2] - this.f60843e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f60840b) : z2 && Math.abs(f2) > ((float) this.f60840b);
        }
        int i3 = this.f60840b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: d */
    public final boolean mo33683d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        C21496c cVar = this.f60856r;
        boolean z = (SwipeBackLayout.this.f60819d & 3) > 0;
        boolean z2 = (SwipeBackLayout.this.f60819d & 8) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f60840b) : z2 && Math.abs(f2) > ((float) this.f60840b);
        }
        int i = this.f60840b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: e */
    public final void mo33684e(int i) {
        float[] fArr = this.f60842d;
        if (fArr != null) {
            fArr[i] = 0.0f;
            this.f60843e[i] = 0.0f;
            this.f60844f[i] = 0.0f;
            this.f60845g[i] = 0.0f;
            this.f60846h[i] = 0;
            this.f60847i[i] = 0;
            this.f60848j[i] = 0;
            this.f60849k = (~(1 << i)) & this.f60849k;
        }
    }

    /* renamed from: f */
    public final int mo33685f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f60859u.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00af A[EDGE_INSN: B:81:0x00af->B:45:0x00af ?: BREAK  , SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33686g(float r19, float r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            r0.f60858t = r1
            me.imid.swipebacklayout.lib.b$c r2 = r0.f60856r
            android.view.View r3 = r0.f60857s
            me.imid.swipebacklayout.lib.SwipeBackLayout$d r2 = (p361me.imid.swipebacklayout.lib.SwipeBackLayout.C21491d) r2
            r2.getClass()
            int r4 = r3.getWidth()
            int r3 = r3.getHeight()
            me.imid.swipebacklayout.lib.SwipeBackLayout r5 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            int r6 = r5.f60835w
            r7 = r6 & 1
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x0038
            int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x002e
            if (r3 != 0) goto L_0x004d
            float r3 = r5.f60824i
            float r6 = r5.f60820e
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x004d
        L_0x002e:
            android.graphics.drawable.Drawable r3 = r5.f60828p
            int r3 = r3.getIntrinsicWidth()
            int r4 = r4 + r3
            int r4 = r4 + 10
            goto L_0x0059
        L_0x0038:
            r7 = r6 & 2
            if (r7 == 0) goto L_0x005b
            int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x004f
            int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x004d
            float r3 = r5.f60824i
            float r6 = r5.f60820e
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r4 = 0
            goto L_0x0059
        L_0x004f:
            android.graphics.drawable.Drawable r3 = r5.f60828p
            int r3 = r3.getIntrinsicWidth()
            int r4 = r4 + r3
            int r4 = r4 + 10
            int r4 = -r4
        L_0x0059:
            r3 = 0
            goto L_0x007c
        L_0x005b:
            r4 = r6 & 8
            if (r4 == 0) goto L_0x007a
            int r4 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x006f
            int r4 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x007a
            float r4 = r5.f60824i
            float r6 = r5.f60820e
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x007a
        L_0x006f:
            android.graphics.drawable.Drawable r4 = r5.f60830r
            int r4 = r4.getIntrinsicHeight()
            int r3 = r3 + r4
            int r3 = r3 + 10
            int r3 = -r3
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            r4 = 0
        L_0x007c:
            me.imid.swipebacklayout.lib.SwipeBackLayout r5 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            java.util.concurrent.CopyOnWriteArrayList<me.imid.swipebacklayout.lib.SwipeBackLayout$b> r5 = r5.f60827o
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L_0x00af
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00af
            me.imid.swipebacklayout.lib.SwipeBackLayout r5 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            java.util.concurrent.CopyOnWriteArrayList<me.imid.swipebacklayout.lib.SwipeBackLayout$b> r5 = r5.f60827o
            java.util.Iterator r5 = r5.iterator()
        L_0x0092:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r5.next()
            me.imid.swipebacklayout.lib.SwipeBackLayout$b r9 = (p361me.imid.swipebacklayout.lib.SwipeBackLayout.C21490b) r9
            if (r4 == 0) goto L_0x00a2
            r10 = 1
            goto L_0x00a3
        L_0x00a2:
            r10 = 0
        L_0x00a3:
            int r9 = r9.mo33674b(r10)
            if (r9 != r7) goto L_0x00ab
            r4 = 0
            goto L_0x0092
        L_0x00ab:
            if (r9 != r6) goto L_0x0092
            goto L_0x016b
        L_0x00af:
            me.imid.swipebacklayout.lib.SwipeBackLayout r5 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            me.imid.swipebacklayout.lib.b r5 = r5.f60823h
            boolean r9 = r5.f60858t
            if (r9 == 0) goto L_0x0177
            android.view.VelocityTracker r9 = r5.f60850l
            int r10 = r5.f60841c
            float r9 = r9.getXVelocity(r10)
            int r9 = (int) r9
            android.view.VelocityTracker r10 = r5.f60850l
            int r11 = r5.f60841c
            float r10 = r10.getYVelocity(r11)
            int r10 = (int) r10
            android.view.View r11 = r5.f60857s
            int r13 = r11.getLeft()
            android.view.View r11 = r5.f60857s
            int r14 = r11.getTop()
            int r15 = r4 - r13
            int r3 = r3 - r14
            if (r15 != 0) goto L_0x00e6
            if (r3 != 0) goto L_0x00e6
            androidx.core.widget.g r3 = r5.f60855q
            r3.mo145035a()
            r5.mo33694o(r8)
            goto L_0x0166
        L_0x00e6:
            float r4 = r5.f60852n
            int r4 = (int) r4
            float r11 = r5.f60851m
            int r11 = (int) r11
            int r12 = java.lang.Math.abs(r9)
            if (r12 >= r4) goto L_0x00f4
            r9 = 0
            goto L_0x00fc
        L_0x00f4:
            if (r12 <= r11) goto L_0x00fc
            if (r9 <= 0) goto L_0x00fa
            r9 = r11
            goto L_0x00fc
        L_0x00fa:
            int r4 = -r11
            r9 = r4
        L_0x00fc:
            float r4 = r5.f60852n
            int r4 = (int) r4
            float r11 = r5.f60851m
            int r11 = (int) r11
            int r12 = java.lang.Math.abs(r10)
            if (r12 >= r4) goto L_0x010a
            r10 = 0
            goto L_0x0112
        L_0x010a:
            if (r12 <= r11) goto L_0x0112
            if (r10 <= 0) goto L_0x0110
            r10 = r11
            goto L_0x0112
        L_0x0110:
            int r4 = -r11
            r10 = r4
        L_0x0112:
            int r4 = java.lang.Math.abs(r15)
            int r11 = java.lang.Math.abs(r3)
            int r12 = java.lang.Math.abs(r9)
            int r1 = java.lang.Math.abs(r10)
            int r8 = r12 + r1
            int r7 = r4 + r11
            if (r9 == 0) goto L_0x012b
            float r4 = (float) r12
            float r12 = (float) r8
            goto L_0x012d
        L_0x012b:
            float r4 = (float) r4
            float r12 = (float) r7
        L_0x012d:
            float r4 = r4 / r12
            if (r10 == 0) goto L_0x0133
            float r1 = (float) r1
            float r7 = (float) r8
            goto L_0x0135
        L_0x0133:
            float r1 = (float) r11
            float r7 = (float) r7
        L_0x0135:
            float r1 = r1 / r7
            me.imid.swipebacklayout.lib.b$c r7 = r5.f60856r
            me.imid.swipebacklayout.lib.SwipeBackLayout$d r7 = (p361me.imid.swipebacklayout.lib.SwipeBackLayout.C21491d) r7
            me.imid.swipebacklayout.lib.SwipeBackLayout r7 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            int r7 = r7.f60819d
            r6 = r6 & r7
            int r6 = r5.mo33685f(r15, r9, r6)
            me.imid.swipebacklayout.lib.b$c r7 = r5.f60856r
            me.imid.swipebacklayout.lib.SwipeBackLayout$d r7 = (p361me.imid.swipebacklayout.lib.SwipeBackLayout.C21491d) r7
            me.imid.swipebacklayout.lib.SwipeBackLayout r7 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            int r7 = r7.f60819d
            r7 = r7 & 8
            int r7 = r5.mo33685f(r3, r10, r7)
            float r6 = (float) r6
            float r6 = r6 * r4
            float r4 = (float) r7
            float r4 = r4 * r1
            float r6 = r6 + r4
            int r1 = (int) r6
            androidx.core.widget.g r12 = r5.f60855q
            r16 = r3
            r17 = r1
            r12.mo145038d(r13, r14, r15, r16, r17)
            r1 = 2
            r5.mo33694o(r1)
        L_0x0166:
            me.imid.swipebacklayout.lib.SwipeBackLayout r1 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            r1.invalidate()
        L_0x016b:
            r1 = 0
            r0.f60858t = r1
            int r2 = r0.f60839a
            r3 = 1
            if (r2 != r3) goto L_0x0176
            r0.mo33694o(r1)
        L_0x0176:
            return
        L_0x0177:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p361me.imid.swipebacklayout.lib.C21493b.mo33686g(float, float):void");
    }

    /* renamed from: h */
    public View mo33687h(int i, int i2) {
        for (int childCount = this.f60859u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f60859u;
            this.f60856r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo33688i(int i, int i2) {
        return ((this.f60849k & (1 << i2)) != 0) && (i & this.f60846h[i2]) != 0;
    }

    /* renamed from: j */
    public void mo33689j(MotionEvent motionEvent) {
        int i;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo33680a();
        }
        if (this.f60850l == null) {
            this.f60850l = VelocityTracker.obtain();
        }
        this.f60850l.addMovement(motionEvent2);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent2.getPointerId(0);
            View h = mo33687h((int) x, (int) y);
            mo33692m(x, y, pointerId);
            mo33696q(h, pointerId);
            if ((this.f60846h[pointerId] & this.f60854p) != 0) {
                this.f60856r.getClass();
            }
        } else if (actionMasked == 1) {
            if (this.f60839a == 1) {
                mo33690k();
            }
            mo33680a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f60839a == 1) {
                    mo33686g(0.0f, 0.0f);
                }
                mo33680a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent2.getPointerId(actionIndex);
                float x2 = motionEvent2.getX(actionIndex);
                float y2 = motionEvent2.getY(actionIndex);
                mo33692m(x2, y2, pointerId2);
                if (this.f60839a == 0) {
                    mo33696q(mo33687h((int) x2, (int) y2), pointerId2);
                    if ((this.f60846h[pointerId2] & this.f60854p) != 0) {
                        this.f60856r.getClass();
                        return;
                    }
                    return;
                }
                int i4 = (int) x2;
                int i5 = (int) y2;
                View view = this.f60857s;
                if (view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    mo33696q(this.f60857s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent2.getPointerId(actionIndex);
                if (this.f60839a == 1 && pointerId3 == this.f60841c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent2.getPointerId(i3);
                        if (pointerId4 != this.f60841c) {
                            View h2 = mo33687h((int) motionEvent2.getX(i3), (int) motionEvent2.getY(i3));
                            View view2 = this.f60857s;
                            if (h2 == view2 && mo33696q(view2, pointerId4)) {
                                i2 = this.f60841c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        mo33690k();
                    }
                }
                mo33684e(pointerId3);
            }
        } else if (this.f60839a == 1) {
            int findPointerIndex = motionEvent2.findPointerIndex(this.f60841c);
            float x3 = motionEvent2.getX(findPointerIndex);
            float y3 = motionEvent2.getY(findPointerIndex);
            float[] fArr = this.f60844f;
            int i6 = this.f60841c;
            int i7 = (int) (x3 - fArr[i6]);
            int i8 = (int) (y3 - this.f60845g[i6]);
            int left = this.f60857s.getLeft() + i7;
            int top = this.f60857s.getTop() + i8;
            int left2 = this.f60857s.getLeft();
            int top2 = this.f60857s.getTop();
            if (i7 != 0) {
                C21496c cVar = this.f60856r;
                View view3 = this.f60857s;
                int i9 = SwipeBackLayout.this.f60835w;
                left = (i9 & 1) != 0 ? Math.min(view3.getWidth(), Math.max(left, 0)) : (2 & i9) != 0 ? Math.min(0, Math.max(left, -view3.getWidth())) : 0;
                this.f60857s.offsetLeftAndRight(left - left2);
            }
            int i15 = left;
            if (i8 != 0) {
                C21496c cVar2 = this.f60856r;
                View view4 = this.f60857s;
                if ((SwipeBackLayout.this.f60835w & 8) != 0) {
                    i3 = Math.min(0, Math.max(top, -view4.getHeight()));
                }
                this.f60857s.offsetTopAndBottom(i3 - top2);
                i = i3;
            } else {
                i = top;
            }
            if (!(i7 == 0 && i8 == 0)) {
                this.f60856r.mo33678a(this.f60857s, i15, i, i15 - left2, i - top2);
            }
            mo33693n(motionEvent);
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent2.getPointerId(i3);
                float x4 = motionEvent2.getX(i3);
                float y4 = motionEvent2.getY(i3);
                float f = x4 - this.f60842d[pointerId5];
                float f2 = y4 - this.f60843e[pointerId5];
                mo33691l(f, f2, pointerId5);
                if (this.f60839a != 1) {
                    View h3 = mo33687h((int) x4, (int) y4);
                    if (mo33683d(h3, f, f2) && mo33696q(h3, pointerId5)) {
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            mo33693n(motionEvent);
        }
    }

    /* renamed from: k */
    public final void mo33690k() {
        this.f60850l.computeCurrentVelocity(1000, this.f60851m);
        float xVelocity = this.f60850l.getXVelocity(this.f60841c);
        float f = this.f60852n;
        float f2 = this.f60851m;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f60850l.getYVelocity(this.f60841c);
        float f4 = this.f60852n;
        float f5 = this.f60851m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > 0.0f) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        mo33686g(xVelocity, f3);
    }

    /* renamed from: l */
    public final void mo33691l(float f, float f2, int i) {
        boolean b = mo33681b(f, f2, i, 1);
        if (mo33681b(f2, f, i, 4)) {
            b |= true;
        }
        if (mo33681b(f, f2, i, 2)) {
            b |= true;
        }
        if (mo33681b(f2, f, i, 8)) {
            b |= true;
        }
        if (b) {
            int[] iArr = this.f60847i;
            iArr[i] = iArr[i] | b;
            this.f60856r.getClass();
        }
    }

    /* renamed from: m */
    public final void mo33692m(float f, float f2, int i) {
        float[] fArr = this.f60842d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f60843e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f60844f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f60845g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f60846h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f60847i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f60848j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f60842d = fArr2;
            this.f60843e = fArr3;
            this.f60844f = fArr4;
            this.f60845g = fArr5;
            this.f60846h = iArr;
            this.f60847i = iArr2;
            this.f60848j = iArr3;
        }
        float[] fArr9 = this.f60842d;
        this.f60844f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f60843e;
        this.f60845g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f60846h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f60859u.getLeft() + this.f60853o) {
            i2 = 1;
        }
        if (i5 < this.f60859u.getTop() + this.f60853o) {
            i2 = 4;
        }
        if (i4 > this.f60859u.getRight() - this.f60853o) {
            i2 = 2;
        }
        if (i5 > this.f60859u.getBottom() - this.f60853o) {
            i2 = 8;
        }
        iArr7[i] = i2;
        this.f60849k |= 1 << i;
    }

    /* renamed from: n */
    public final void mo33693n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            this.f60844f[pointerId] = x;
            this.f60845g[pointerId] = y;
        }
    }

    /* renamed from: o */
    public void mo33694o(int i) {
        if (this.f60839a != i) {
            this.f60839a = i;
            SwipeBackLayout.C21491d dVar = (SwipeBackLayout.C21491d) this.f60856r;
            CopyOnWriteArrayList<SwipeBackLayout.C21490b> copyOnWriteArrayList = SwipeBackLayout.this.f60827o;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                Iterator<SwipeBackLayout.C21490b> it = SwipeBackLayout.this.f60827o.iterator();
                while (it.hasNext()) {
                    it.next().mo33676d(i, SwipeBackLayout.this.f60824i);
                }
            }
            if (i == 0) {
                this.f60857s = null;
            }
        }
    }

    /* renamed from: p */
    public boolean mo33695p(MotionEvent motionEvent) {
        View h;
        View h2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo33680a();
        }
        if (this.f60850l == null) {
            this.f60850l = VelocityTracker.obtain();
        }
        this.f60850l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        int pointerId = motionEvent.getPointerId(i);
                        float x = motionEvent.getX(i);
                        float y = motionEvent.getY(i);
                        float f = x - this.f60842d[pointerId];
                        float f2 = y - this.f60843e[pointerId];
                        mo33691l(f, f2, pointerId);
                        if (this.f60839a == 1 || ((h = mo33687h((int) x, (int) y)) != null && mo33683d(h, f, f2) && mo33696q(h, pointerId))) {
                            break;
                        }
                    }
                    mo33693n(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        mo33692m(x2, y2, pointerId2);
                        int i2 = this.f60839a;
                        if (i2 == 0) {
                            if ((this.f60846h[pointerId2] & this.f60854p) != 0) {
                                this.f60856r.getClass();
                            }
                        } else if (i2 == 2 && (h2 = mo33687h((int) x2, (int) y2)) == this.f60857s) {
                            mo33696q(h2, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        mo33684e(motionEvent.getPointerId(actionIndex));
                    }
                }
            }
            mo33680a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            mo33692m(x3, y3, pointerId3);
            View h3 = mo33687h((int) x3, (int) y3);
            if (h3 == this.f60857s && this.f60839a == 2) {
                mo33696q(h3, pointerId3);
            }
            if ((this.f60846h[pointerId3] & this.f60854p) != 0) {
                this.f60856r.getClass();
            }
        }
        return this.f60839a == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo33696q(android.view.View r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.f60857s
            r1 = 1
            if (r10 != r0) goto L_0x000a
            int r0 = r9.f60841c
            if (r0 != r11) goto L_0x000a
            return r1
        L_0x000a:
            r0 = 0
            if (r10 == 0) goto L_0x00d4
            me.imid.swipebacklayout.lib.b$c r2 = r9.f60856r
            me.imid.swipebacklayout.lib.SwipeBackLayout$d r2 = (p361me.imid.swipebacklayout.lib.SwipeBackLayout.C21491d) r2
            me.imid.swipebacklayout.lib.SwipeBackLayout r3 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            me.imid.swipebacklayout.lib.b r4 = r3.f60823h
            int r3 = r3.f60819d
            boolean r3 = r4.mo33688i(r3, r11)
            r4 = 8
            r5 = 2
            if (r3 == 0) goto L_0x0076
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            me.imid.swipebacklayout.lib.b r6 = r6.f60823h
            boolean r6 = r6.mo33688i(r1, r11)
            if (r6 == 0) goto L_0x002f
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            r6.f60835w = r1
            goto L_0x004c
        L_0x002f:
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            me.imid.swipebacklayout.lib.b r6 = r6.f60823h
            boolean r6 = r6.mo33688i(r5, r11)
            if (r6 == 0) goto L_0x003e
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            r6.f60835w = r5
            goto L_0x004c
        L_0x003e:
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            me.imid.swipebacklayout.lib.b r6 = r6.f60823h
            boolean r6 = r6.mo33688i(r4, r11)
            if (r6 == 0) goto L_0x004c
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            r6.f60835w = r4
        L_0x004c:
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            java.util.concurrent.CopyOnWriteArrayList<me.imid.swipebacklayout.lib.SwipeBackLayout$b> r6 = r6.f60827o
            if (r6 == 0) goto L_0x0074
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0074
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            java.util.concurrent.CopyOnWriteArrayList<me.imid.swipebacklayout.lib.SwipeBackLayout$b> r6 = r6.f60827o
            java.util.Iterator r6 = r6.iterator()
        L_0x0060:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0074
            java.lang.Object r7 = r6.next()
            me.imid.swipebacklayout.lib.SwipeBackLayout$b r7 = (p361me.imid.swipebacklayout.lib.SwipeBackLayout.C21490b) r7
            me.imid.swipebacklayout.lib.SwipeBackLayout r8 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            int r8 = r8.f60835w
            r7.mo33677f(r8)
            goto L_0x0060
        L_0x0074:
            r2.f60836a = r1
        L_0x0076:
            me.imid.swipebacklayout.lib.SwipeBackLayout r6 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            int r7 = r6.f60819d
            if (r7 == r1) goto L_0x0090
            if (r7 != r5) goto L_0x007f
            goto L_0x0090
        L_0x007f:
            if (r7 != r4) goto L_0x0088
            me.imid.swipebacklayout.lib.b r4 = r6.f60823h
            boolean r4 = r4.mo33682c(r1, r11)
            goto L_0x0096
        L_0x0088:
            r4 = 11
            if (r7 != r4) goto L_0x008e
            r4 = 1
            goto L_0x0097
        L_0x008e:
            r4 = 0
            goto L_0x0097
        L_0x0090:
            me.imid.swipebacklayout.lib.b r4 = r6.f60823h
            boolean r4 = r4.mo33682c(r5, r11)
        L_0x0096:
            r4 = r4 ^ r1
        L_0x0097:
            r3 = r3 & r4
            me.imid.swipebacklayout.lib.SwipeBackLayout r2 = p361me.imid.swipebacklayout.lib.SwipeBackLayout.this
            boolean r2 = r2.f60821f
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00d4
            r9.f60841c = r11
            android.view.ViewParent r0 = r10.getParent()
            android.view.ViewGroup r2 = r9.f60859u
            if (r0 != r2) goto L_0x00b6
            r9.f60857s = r10
            r9.f60841c = r11
            me.imid.swipebacklayout.lib.b$c r10 = r9.f60856r
            r10.getClass()
            r9.mo33694o(r1)
            return r1
        L_0x00b6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r11.append(r0)
            android.view.ViewGroup r0 = r9.f60859u
            r11.append(r0)
            java.lang.String r0 = ")"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p361me.imid.swipebacklayout.lib.C21493b.mo33696q(android.view.View, int):boolean");
    }
}
