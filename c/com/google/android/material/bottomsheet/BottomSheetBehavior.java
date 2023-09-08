package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p282z2.C16095a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p905j3.C108547c;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: A */
    public VelocityTracker f309215A;

    /* renamed from: B */
    public int f309216B;

    /* renamed from: C */
    public int f309217C;

    /* renamed from: D */
    public boolean f309218D;

    /* renamed from: E */
    public Map<View, Integer> f309219E;

    /* renamed from: F */
    public final C108547c.C108549c f309220F = new C104426b();

    /* renamed from: d */
    public boolean f309221d = true;

    /* renamed from: e */
    public float f309222e;

    /* renamed from: f */
    public int f309223f;

    /* renamed from: g */
    public boolean f309224g;

    /* renamed from: h */
    public int f309225h;

    /* renamed from: i */
    public int f309226i;

    /* renamed from: j */
    public int f309227j;

    /* renamed from: n */
    public int f309228n;

    /* renamed from: o */
    public int f309229o;

    /* renamed from: p */
    public boolean f309230p;

    /* renamed from: q */
    public boolean f309231q;

    /* renamed from: r */
    public int f309232r = 4;

    /* renamed from: s */
    public C108547c f309233s;

    /* renamed from: t */
    public boolean f309234t;

    /* renamed from: u */
    public int f309235u;

    /* renamed from: v */
    public boolean f309236v;

    /* renamed from: w */
    public int f309237w;

    /* renamed from: x */
    public WeakReference<V> f309238x;

    /* renamed from: y */
    public WeakReference<View> f309239y;

    /* renamed from: z */
    public C0912c f309240z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public static abstract class C0912c {
        /* renamed from: a */
        public abstract void mo837a(View view, float f);

        /* renamed from: b */
        public abstract void mo838b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C104425a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f309242d;

        /* renamed from: e */
        public final /* synthetic */ int f309243e;

        public C104425a(View view, int i) {
            this.f309242d = view;
            this.f309243e = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo146387E(this.f309242d, this.f309243e);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C104426b extends C108547c.C108549c {
        public C104426b() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            int z = BottomSheetBehavior.this.mo146391z();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C16095a.m14980b(i, z, bottomSheetBehavior.f309230p ? bottomSheetBehavior.f309237w : bottomSheetBehavior.f309229o);
        }

        /* renamed from: d */
        public int mo96790d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f309230p ? bottomSheetBehavior.f309237w : bottomSheetBehavior.f309229o;
        }

        /* renamed from: h */
        public void mo143325h(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo146385C(1);
            }
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo146389w(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo96792j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0025
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.f309221d
                if (r10 == 0) goto L_0x0014
                int r9 = r9.f309227j
                r2 = 3
                goto L_0x00bc
            L_0x0014:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f309228n
                if (r9 <= r10) goto L_0x0021
                r0 = r10
            L_0x001f:
                r2 = 6
                goto L_0x0022
            L_0x0021:
                r2 = 3
            L_0x0022:
                r9 = r0
                goto L_0x00bc
            L_0x0025:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.f309230p
                if (r6 == 0) goto L_0x004e
                boolean r5 = r5.mo146386D(r8, r10)
                if (r5 == 0) goto L_0x004e
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.f309229o
                if (r5 > r6) goto L_0x0047
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x004e
            L_0x0047:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f309237w
                r2 = 5
                goto L_0x00bc
            L_0x004e:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0064
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x005f
                goto L_0x0064
            L_0x005f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f309229o
                goto L_0x00bc
            L_0x0064:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r10.f309221d
                if (r1 == 0) goto L_0x008b
                int r10 = r10.f309227j
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f309229o
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x0086
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f309227j
                goto L_0x0021
            L_0x0086:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f309229o
                goto L_0x0022
            L_0x008b:
                int r1 = r10.f309228n
                if (r9 >= r1) goto L_0x009f
                int r10 = r10.f309229o
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x009a
                goto L_0x0021
            L_0x009a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f309228n
                goto L_0x001f
            L_0x009f:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f309229o
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00b6
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f309228n
                goto L_0x001f
            L_0x00b6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f309229o
                goto L_0x0022
            L_0x00bc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                j3.c r10 = r10.f309233s
                int r0 = r8.getLeft()
                boolean r9 = r10.mo159430s(r0, r9)
                if (r9 == 0) goto L_0x00dd
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.mo146385C(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$d r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, e3.a0> r10 = p849e3.C107207u.f320808a
                p849e3.C107207u.C107208b.m145185m(r8, r9)
                goto L_0x00e2
            L_0x00dd:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.mo146385C(r2)
            L_0x00e2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C104426b.mo96792j(android.view.View, float, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
            r7 = r0.f309239y.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            r7 = r5.f309245a.f309238x;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo96793k(android.view.View r6, int r7) {
            /*
                r5 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r0.f309232r
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L_0x0009
                return r3
            L_0x0009:
                boolean r4 = r0.f309218D
                if (r4 == 0) goto L_0x000e
                return r3
            L_0x000e:
                r4 = 3
                if (r1 != r4) goto L_0x0027
                int r1 = r0.f309216B
                if (r1 != r7) goto L_0x0027
                java.lang.ref.WeakReference<android.view.View> r7 = r0.f309239y
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                if (r7 == 0) goto L_0x0027
                r0 = -1
                boolean r7 = r7.canScrollVertically(r0)
                if (r7 == 0) goto L_0x0027
                return r3
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.lang.ref.WeakReference<V> r7 = r7.f309238x
                if (r7 == 0) goto L_0x0034
                java.lang.Object r7 = r7.get()
                if (r7 != r6) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C104426b.mo96793k(android.view.View, int):boolean");
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C104427d implements Runnable {

        /* renamed from: d */
        public final View f309246d;

        /* renamed from: e */
        public final int f309247e;

        public C104427d(View view, int i) {
            this.f309246d = view;
            this.f309247e = i;
        }

        public void run() {
            C108547c cVar = BottomSheetBehavior.this.f309233s;
            if (cVar == null || !cVar.mo159420h(true)) {
                BottomSheetBehavior.this.mo146385C(this.f309247e);
                return;
            }
            View view = this.f309246d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(view, this);
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: y */
    public static <V extends View> BottomSheetBehavior<V> m139527y(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C103717e) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C103717e) layoutParams).f306328a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo146383A(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f309224g
            if (r4 != 0) goto L_0x0015
            r3.f309224g = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f309224g
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f309223f
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f309224g = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f309223f = r1
            int r1 = r3.f309237w
            int r1 = r1 - r4
            r3.f309229o = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f309232r
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f309238x
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo146383A(int):void");
    }

    /* renamed from: B */
    public final void mo146384B(int i) {
        if (i != this.f309232r) {
            WeakReference<V> weakReference = this.f309238x;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        if (C107207u.C107211e.m145207b(view)) {
                            view.post(new C104425a(view, i));
                            return;
                        }
                    }
                    mo146387E(view, i);
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.f309230p && i == 5)) {
                this.f309232r = i;
            }
        }
    }

    /* renamed from: C */
    public void mo146385C(int i) {
        C0912c cVar;
        if (this.f309232r != i) {
            this.f309232r = i;
            if (i == 6 || i == 3) {
                mo146388F(true);
            } else if (i == 5 || i == 4) {
                mo146388F(false);
            }
            View view = (View) this.f309238x.get();
            if (view != null && (cVar = this.f309240z) != null) {
                cVar.mo838b(view, i);
            }
        }
    }

    /* renamed from: D */
    public boolean mo146386D(View view, float f) {
        if (this.f309231q) {
            return true;
        }
        return view.getTop() >= this.f309229o && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f309229o)) / ((float) this.f309223f) > 0.5f;
    }

    /* renamed from: E */
    public void mo146387E(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f309229o;
        } else if (i == 6) {
            int i4 = this.f309228n;
            if (!this.f309221d || i4 > (i3 = this.f309227j)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo146391z();
        } else if (!this.f309230p || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f309237w;
        }
        if (this.f309233s.mo159432u(view, view.getLeft(), i2)) {
            mo146385C(2);
            C104427d dVar = new C104427d(view, i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(view, dVar);
            return;
        }
        mo146385C(i);
    }

    /* renamed from: F */
    public final void mo146388F(boolean z) {
        WeakReference<V> weakReference = this.f309238x;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f309219E == null) {
                        this.f309219E = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f309238x.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f309219E;
                            if (map != null && map.containsKey(childAt)) {
                                int intValue = this.f309219E.get(childAt).intValue();
                                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                                C107207u.C107208b.m145191s(childAt, intValue);
                            }
                        } else {
                            this.f309219E.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                            C107207u.C107208b.m145191s(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f309219E = null;
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo143313e(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C108547c cVar;
        if (!v.isShown()) {
            this.f309234t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.f309216B = -1;
            VelocityTracker velocityTracker = this.f309215A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f309215A = null;
            }
        }
        if (this.f309215A == null) {
            this.f309215A = VelocityTracker.obtain();
        }
        this.f309215A.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f309217C = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f309239y;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && coordinatorLayout.mo144909q(view2, x, this.f309217C)) {
                this.f309216B = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f309218D = true;
            }
            this.f309234t = this.f309216B == -1 && !coordinatorLayout.mo144909q(v, x, this.f309217C);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f309218D = false;
            this.f309216B = -1;
            if (this.f309234t) {
                this.f309234t = false;
                return false;
            }
        }
        if (!this.f309234t && (cVar = this.f309233s) != null && cVar.mo159431t(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f309239y;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.f309234t && this.f309232r != 1 && !coordinatorLayout.mo144909q(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f309233s != null && Math.abs(((float) this.f309217C) - motionEvent.getY()) > ((float) this.f309233s.f324912b);
    }

    /* renamed from: f */
    public boolean mo94960f(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107208b.m145174b(coordinatorLayout) && !C107207u.C107208b.m145174b(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo144913s(v, i);
        this.f309237w = coordinatorLayout.getHeight();
        if (this.f309224g) {
            if (this.f309225h == 0) {
                this.f309225h = coordinatorLayout.getResources().getDimensionPixelSize(C0966R.dimen.a0k);
            }
            this.f309226i = Math.max(this.f309225h, this.f309237w - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f309226i = this.f309223f;
        }
        int max = Math.max(0, this.f309237w - v.getHeight());
        this.f309227j = max;
        int i2 = this.f309237w;
        this.f309228n = i2 / 2;
        if (this.f309221d) {
            this.f309229o = Math.max(i2 - this.f309226i, max);
        } else {
            this.f309229o = i2 - this.f309226i;
        }
        int i3 = this.f309232r;
        if (i3 == 3) {
            C107207u.m145166g(v, mo146391z());
        } else if (i3 == 6) {
            C107207u.m145166g(v, this.f309228n);
        } else if (this.f309230p && i3 == 5) {
            C107207u.m145166g(v, this.f309237w);
        } else if (i3 == 4) {
            C107207u.m145166g(v, this.f309229o);
        } else if (i3 == 1 || i3 == 2) {
            C107207u.m145166g(v, top - v.getTop());
        }
        if (this.f309233s == null) {
            this.f309233s = new C108547c(coordinatorLayout.getContext(), coordinatorLayout, this.f309220F);
        }
        this.f309238x = new WeakReference<>(v);
        this.f309239y = new WeakReference<>(mo146390x(v));
        return true;
    }

    /* renamed from: i */
    public boolean mo95460i(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f309239y.get() && this.f309232r != 3;
    }

    /* renamed from: k */
    public void mo94961k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == this.f309239y.get()) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < mo146391z()) {
                    int z = top - mo146391z();
                    iArr[1] = z;
                    C107207u.m145166g(v, -z);
                    mo146385C(3);
                } else {
                    iArr[1] = i2;
                    C107207u.m145166g(v, -i2);
                    mo146385C(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f309229o;
                if (i4 <= i5 || this.f309230p) {
                    iArr[1] = i2;
                    C107207u.m145166g(v, -i2);
                    mo146385C(1);
                } else {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    C107207u.m145166g(v, -i6);
                    mo146385C(4);
                }
            }
            mo146389w(v.getTop());
            this.f309235u = i2;
            this.f309236v = true;
        }
    }

    /* renamed from: p */
    public void mo143315p(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        Parcelable parcelable2 = savedState.f306434d;
        int i = savedState.f309241f;
        if (i == 1 || i == 2) {
            this.f309232r = 4;
        } else {
            this.f309232r = i;
        }
    }

    /* renamed from: q */
    public Parcelable mo143316q(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, this.f309232r);
    }

    /* renamed from: s */
    public boolean mo5059s(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f309235u = 0;
        this.f309236v = false;
        return (i & 2) != 0;
    }

    /* renamed from: u */
    public void mo78309u(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        float f;
        int i4 = 3;
        if (v.getTop() == mo146391z()) {
            mo146385C(3);
        } else if (view == this.f309239y.get() && this.f309236v) {
            if (this.f309235u > 0) {
                i2 = mo146391z();
            } else {
                if (this.f309230p) {
                    VelocityTracker velocityTracker = this.f309215A;
                    if (velocityTracker == null) {
                        f = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f309222e);
                        f = this.f309215A.getYVelocity(this.f309216B);
                    }
                    if (mo146386D(v, f)) {
                        i2 = this.f309237w;
                        i4 = 5;
                    }
                }
                if (this.f309235u == 0) {
                    int top = v.getTop();
                    if (!this.f309221d) {
                        int i5 = this.f309228n;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f309229o)) {
                                i2 = 0;
                            } else {
                                i2 = this.f309228n;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f309229o)) {
                            i2 = this.f309228n;
                        } else {
                            i3 = this.f309229o;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f309227j) < Math.abs(top - this.f309229o)) {
                        i2 = this.f309227j;
                    } else {
                        i3 = this.f309229o;
                    }
                } else {
                    i3 = this.f309229o;
                }
                i4 = 4;
            }
            if (this.f309233s.mo159432u(v, v.getLeft(), i2)) {
                mo146385C(2);
                C104427d dVar = new C104427d(v, i4);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(v, dVar);
            } else {
                mo146385C(i4);
            }
            this.f309236v = false;
        }
    }

    /* renamed from: v */
    public boolean mo843v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f309232r == 1 && actionMasked == 0) {
            return true;
        }
        C108547c cVar = this.f309233s;
        if (cVar != null) {
            cVar.mo159424m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f309216B = -1;
            VelocityTracker velocityTracker = this.f309215A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f309215A = null;
            }
        }
        if (this.f309215A == null) {
            this.f309215A = VelocityTracker.obtain();
        }
        this.f309215A.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f309234t) {
            float abs = Math.abs(((float) this.f309217C) - motionEvent.getY());
            C108547c cVar2 = this.f309233s;
            if (abs > ((float) cVar2.f324912b)) {
                cVar2.mo159415c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f309234t;
    }

    /* renamed from: w */
    public void mo146389w(int i) {
        C0912c cVar;
        View view = (View) this.f309238x.get();
        if (view != null && (cVar = this.f309240z) != null) {
            int i2 = this.f309229o;
            if (i > i2) {
                cVar.mo837a(view, ((float) (i2 - i)) / ((float) (this.f309237w - i2)));
            } else {
                cVar.mo837a(view, ((float) (i2 - i)) / ((float) (i2 - mo146391z())));
            }
        }
    }

    /* renamed from: x */
    public View mo146390x(View view) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107213g.m145231p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View x = mo146390x(viewGroup.getChildAt(i));
            if (x != null) {
                return x;
            }
        }
        return null;
    }

    /* renamed from: z */
    public final int mo146391z() {
        if (this.f309221d) {
            return this.f309227j;
        }
        return 0;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C104424a();

        /* renamed from: f */
        public final int f309241f;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public static class C104424a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f309241f = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeInt(this.f309241f);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f309241f = i;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322505e);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo146383A(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo146383A(i);
        }
        this.f309230p = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        if (this.f309221d != z) {
            this.f309221d = z;
            if (this.f309238x != null) {
                if (z) {
                    this.f309229o = Math.max(this.f309237w - this.f309226i, this.f309227j);
                } else {
                    this.f309229o = this.f309237w - this.f309226i;
                }
            }
            mo146385C((!this.f309221d || this.f309232r != 6) ? this.f309232r : 3);
        }
        this.f309231q = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f309222e = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
