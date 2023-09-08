package android.support.design.widget;

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
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p282z2.C16095a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p905j3.C108547c;

public class MMBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: A */
    public boolean f304893A;

    /* renamed from: B */
    public int f304894B;

    /* renamed from: C */
    public int f304895C;

    /* renamed from: D */
    public boolean f304896D;

    /* renamed from: E */
    public boolean f304897E = false;

    /* renamed from: F */
    public final C108547c.C108549c f304898F = new C103387b();

    /* renamed from: G */
    public C67072d f304899G;

    /* renamed from: d */
    public float f304900d;

    /* renamed from: e */
    public int f304901e;

    /* renamed from: f */
    public boolean f304902f;

    /* renamed from: g */
    public int f304903g;

    /* renamed from: h */
    public int f304904h;

    /* renamed from: i */
    public int f304905i;

    /* renamed from: j */
    public boolean f304906j;

    /* renamed from: n */
    public boolean f304907n;

    /* renamed from: o */
    public int f304908o = 4;

    /* renamed from: p */
    public C108547c f304909p;

    /* renamed from: q */
    public boolean f304910q;

    /* renamed from: r */
    public int f304911r;

    /* renamed from: s */
    public boolean f304912s;

    /* renamed from: t */
    public int f304913t;

    /* renamed from: u */
    public WeakReference<V> f304914u;

    /* renamed from: v */
    public WeakReference<View> f304915v;

    /* renamed from: w */
    public C0109c f304916w;

    /* renamed from: x */
    public VelocityTracker f304917x;

    /* renamed from: y */
    public int f304918y;

    /* renamed from: z */
    public boolean f304919z;

    /* renamed from: android.support.design.widget.MMBottomSheetBehavior$c */
    public static abstract class C0109c {
        /* renamed from: a */
        public abstract void mo87a(View view, float f);

        /* renamed from: b */
        public abstract void mo88b(View view, int i);
    }

    /* renamed from: android.support.design.widget.MMBottomSheetBehavior$a */
    public class C67071a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f192643d;

        /* renamed from: e */
        public final /* synthetic */ int f192644e;

        public C67071a(View view, int i) {
            this.f192643d = view;
            this.f192644e = i;
        }

        public void run() {
            MMBottomSheetBehavior.this.mo143312D(this.f192643d, this.f192644e);
        }
    }

    /* renamed from: android.support.design.widget.MMBottomSheetBehavior$d */
    public interface C67072d {
        /* renamed from: a */
        boolean mo91079a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.design.widget.MMBottomSheetBehavior$b */
    public class C103387b extends C108547c.C108549c {
        public C103387b() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            MMBottomSheetBehavior mMBottomSheetBehavior = MMBottomSheetBehavior.this;
            return C16095a.m14980b(i, mMBottomSheetBehavior.f304904h, mMBottomSheetBehavior.f304906j ? mMBottomSheetBehavior.f304913t : mMBottomSheetBehavior.f304905i);
        }

        /* renamed from: d */
        public int mo96790d(View view) {
            int i;
            int i2;
            MMBottomSheetBehavior mMBottomSheetBehavior = MMBottomSheetBehavior.this;
            if (mMBottomSheetBehavior.f304906j) {
                i = mMBottomSheetBehavior.f304913t;
                i2 = mMBottomSheetBehavior.f304904h;
            } else {
                i = mMBottomSheetBehavior.f304905i;
                i2 = mMBottomSheetBehavior.f304904h;
            }
            return i - i2;
        }

        /* renamed from: h */
        public void mo143325h(int i) {
            if (i == 1) {
                MMBottomSheetBehavior.this.mo143310B(1);
            }
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            MMBottomSheetBehavior.this.mo143319w(i2);
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = MMBottomSheetBehavior.this.f304904h;
            } else {
                MMBottomSheetBehavior mMBottomSheetBehavior = MMBottomSheetBehavior.this;
                if (!mMBottomSheetBehavior.f304906j || !mMBottomSheetBehavior.mo143311C(view, f2)) {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - MMBottomSheetBehavior.this.f304904h) < Math.abs(top - MMBottomSheetBehavior.this.f304905i)) {
                            i = MMBottomSheetBehavior.this.f304904h;
                        } else {
                            i2 = MMBottomSheetBehavior.this.f304905i;
                        }
                    } else {
                        i2 = MMBottomSheetBehavior.this.f304905i;
                    }
                    i = i2;
                    i3 = 4;
                } else {
                    i = MMBottomSheetBehavior.this.f304913t;
                    i3 = 5;
                }
            }
            if (MMBottomSheetBehavior.this.f304909p.mo159430s(view.getLeft(), i)) {
                MMBottomSheetBehavior.this.mo143310B(2);
                C103388e eVar = new C103388e(view, i3);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(view, eVar);
                return;
            }
            MMBottomSheetBehavior.this.mo143310B(i3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
            r7 = r0.f304915v.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            r7 = r5.f304921a.f304914u;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo96793k(android.view.View r6, int r7) {
            /*
                r5 = this;
                android.support.design.widget.MMBottomSheetBehavior r0 = android.support.design.widget.MMBottomSheetBehavior.this
                int r1 = r0.f304908o
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L_0x0009
                return r3
            L_0x0009:
                boolean r4 = r0.f304896D
                if (r4 == 0) goto L_0x000e
                return r3
            L_0x000e:
                r4 = 3
                if (r1 != r4) goto L_0x0027
                int r1 = r0.f304918y
                if (r1 != r7) goto L_0x0027
                java.lang.ref.WeakReference<android.view.View> r7 = r0.f304915v
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                if (r7 == 0) goto L_0x0027
                r0 = -1
                boolean r7 = r7.canScrollVertically(r0)
                if (r7 == 0) goto L_0x0027
                return r3
            L_0x0027:
                android.support.design.widget.MMBottomSheetBehavior r7 = android.support.design.widget.MMBottomSheetBehavior.this
                java.lang.ref.WeakReference<V> r7 = r7.f304914u
                if (r7 == 0) goto L_0x0034
                java.lang.Object r7 = r7.get()
                if (r7 != r6) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.MMBottomSheetBehavior.C103387b.mo96793k(android.view.View, int):boolean");
        }
    }

    /* renamed from: android.support.design.widget.MMBottomSheetBehavior$e */
    public class C103388e implements Runnable {

        /* renamed from: d */
        public final View f304922d;

        /* renamed from: e */
        public final int f304923e;

        public C103388e(View view, int i) {
            this.f304922d = view;
            this.f304923e = i;
        }

        public void run() {
            C108547c cVar = MMBottomSheetBehavior.this.f304909p;
            if (cVar == null || !cVar.mo159420h(true)) {
                MMBottomSheetBehavior.this.mo143310B(this.f304923e);
                return;
            }
            View view = this.f304922d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(view, this);
        }
    }

    public MMBottomSheetBehavior() {
    }

    /* renamed from: y */
    public static <V extends View> MMBottomSheetBehavior<V> m137073y(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C103717e) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C103717e) layoutParams).f306328a;
            if (behavior instanceof MMBottomSheetBehavior) {
                return (MMBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A */
    public final void mo143309A(int i) {
        if (i != this.f304908o) {
            WeakReference<V> weakReference = this.f304914u;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        if (C107207u.C107211e.m145207b(view)) {
                            view.post(new C67071a(view, i));
                            return;
                        }
                    }
                    mo143312D(view, i);
                }
            } else if (i == 4 || i == 3 || (this.f304906j && i == 5)) {
                this.f304908o = i;
            }
        }
    }

    /* renamed from: B */
    public void mo143310B(int i) {
        C0109c cVar;
        if (this.f304908o != i) {
            this.f304908o = i;
            View view = (View) this.f304914u.get();
            if (view != null && (cVar = this.f304916w) != null) {
                cVar.mo88b(view, i);
            }
        }
    }

    /* renamed from: C */
    public boolean mo143311C(View view, float f) {
        if (this.f304907n) {
            return true;
        }
        return view.getTop() >= this.f304905i && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f304905i)) / ((float) this.f304901e) > 0.5f;
    }

    /* renamed from: D */
    public void mo143312D(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f304905i;
        } else if (i == 3) {
            i2 = this.f304904h;
        } else if (!this.f304906j || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f304913t;
        }
        if (this.f304909p.mo159432u(view, view.getLeft(), i2)) {
            mo143310B(2);
            C103388e eVar = new C103388e(view, i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(view, eVar);
            return;
        }
        mo143310B(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0 != 3) goto L_0x012e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143313e(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r11.getAction()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r11.getX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            float r1 = r11.getY()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            float r1 = r11.getRawX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r5 = 3
            r0[r5] = r1
            float r1 = r11.getRawY()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6 = 4
            r0[r6] = r1
            java.lang.String r1 = "microMsg.MMBottomSheetBehavior"
            java.lang.String r6 = "onInterceptTouchEvent action: %d, x: %f, y: %f, rawX: %f, rawY: %f."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r0)
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x0049
            r8.f304897E = r2
        L_0x0049:
            boolean r0 = r8.f304897E
            if (r0 == 0) goto L_0x0053
            java.lang.String r9 = "external deal with, continue."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r9)
            return r2
        L_0x0053:
            android.support.design.widget.MMBottomSheetBehavior$d r0 = r8.f304899G
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.mo91079a(r11)
            if (r0 == 0) goto L_0x0065
            java.lang.String r9 = "external deal with."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r9)
            r8.f304897E = r3
            return r2
        L_0x0065:
            boolean r0 = r10.isShown()
            if (r0 != 0) goto L_0x006e
            r8.f304910q = r3
            return r2
        L_0x006e:
            int r0 = r11.getActionMasked()
            r1 = 0
            r6 = -1
            if (r0 != 0) goto L_0x0081
            r8.f304918y = r6
            android.view.VelocityTracker r7 = r8.f304917x
            if (r7 == 0) goto L_0x0081
            r7.recycle()
            r8.f304917x = r1
        L_0x0081:
            android.view.VelocityTracker r7 = r8.f304917x
            if (r7 != 0) goto L_0x008b
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r8.f304917x = r7
        L_0x008b:
            android.view.VelocityTracker r7 = r8.f304917x
            r7.addMovement(r11)
            if (r0 == 0) goto L_0x00e7
            if (r0 == r3) goto L_0x00dc
            if (r0 == r4) goto L_0x009a
            if (r0 == r5) goto L_0x00dc
            goto L_0x012e
        L_0x009a:
            float r10 = r11.getX()
            int r10 = (int) r10
            float r1 = r11.getY()
            int r1 = (int) r1
            int r5 = r8.f304894B
            int r10 = r10 - r5
            int r5 = r8.f304895C
            int r1 = r1 - r5
            boolean r5 = r8.f304919z
            if (r5 != 0) goto L_0x00c8
            int r5 = java.lang.Math.abs(r10)
            j3.c r6 = r8.f304909p
            int r6 = r6.f324912b
            if (r5 > r6) goto L_0x00c5
            int r5 = java.lang.Math.abs(r1)
            j3.c r6 = r8.f304909p
            int r6 = r6.f324912b
            if (r5 <= r6) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r5 = 0
            goto L_0x00c6
        L_0x00c5:
            r5 = 1
        L_0x00c6:
            r8.f304919z = r5
        L_0x00c8:
            boolean r5 = r8.f304919z
            if (r5 == 0) goto L_0x012e
            int r1 = java.lang.Math.abs(r1)
            int r10 = java.lang.Math.abs(r10)
            if (r1 <= r10) goto L_0x00d8
            r10 = 1
            goto L_0x00d9
        L_0x00d8:
            r10 = 0
        L_0x00d9:
            r8.f304893A = r10
            goto L_0x012e
        L_0x00dc:
            r8.f304896D = r2
            r8.f304918y = r6
            boolean r10 = r8.f304910q
            if (r10 == 0) goto L_0x012e
            r8.f304910q = r2
            return r2
        L_0x00e7:
            r8.f304919z = r2
            r8.f304893A = r2
            float r5 = r11.getX()
            int r5 = (int) r5
            r8.f304894B = r5
            float r5 = r11.getY()
            int r5 = (int) r5
            r8.f304895C = r5
            java.lang.ref.WeakReference<android.view.View> r5 = r8.f304915v
            if (r5 == 0) goto L_0x0103
            java.lang.Object r1 = r5.get()
            android.view.View r1 = (android.view.View) r1
        L_0x0103:
            if (r1 == 0) goto L_0x011b
            int r5 = r8.f304894B
            int r7 = r8.f304895C
            boolean r1 = r9.mo144909q(r1, r5, r7)
            if (r1 == 0) goto L_0x011b
            int r1 = r11.getActionIndex()
            int r1 = r11.getPointerId(r1)
            r8.f304918y = r1
            r8.f304896D = r3
        L_0x011b:
            int r1 = r8.f304918y
            if (r1 != r6) goto L_0x012b
            int r1 = r8.f304894B
            int r5 = r8.f304895C
            boolean r10 = r9.mo144909q(r10, r1, r5)
            if (r10 != 0) goto L_0x012b
            r10 = 1
            goto L_0x012c
        L_0x012b:
            r10 = 0
        L_0x012c:
            r8.f304910q = r10
        L_0x012e:
            boolean r10 = r8.f304910q
            if (r10 != 0) goto L_0x013f
            j3.c r10 = r8.f304909p
            boolean r10 = r10.mo159431t(r11)
            if (r10 == 0) goto L_0x013f
            boolean r10 = r8.f304893A
            if (r10 == 0) goto L_0x013f
            return r3
        L_0x013f:
            java.lang.ref.WeakReference<android.view.View> r10 = r8.f304915v
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            if (r0 != r4) goto L_0x017d
            if (r10 == 0) goto L_0x017d
            boolean r0 = r8.f304910q
            if (r0 != 0) goto L_0x017d
            int r0 = r8.f304908o
            if (r0 == r3) goto L_0x017d
            float r0 = r11.getX()
            int r0 = (int) r0
            float r1 = r11.getY()
            int r1 = (int) r1
            boolean r9 = r9.mo144909q(r10, r0, r1)
            if (r9 != 0) goto L_0x017d
            int r9 = r8.f304895C
            float r9 = (float) r9
            float r10 = r11.getY()
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            j3.c r10 = r8.f304909p
            int r10 = r10.f324912b
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x017d
            boolean r9 = r8.f304893A
            if (r9 == 0) goto L_0x017d
            r2 = 1
        L_0x017d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.MMBottomSheetBehavior.mo143313e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    public boolean mo94960f(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107208b.m145174b(coordinatorLayout) && !C107207u.C107208b.m145174b(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo144913s(v, i);
        this.f304913t = coordinatorLayout.getHeight();
        if (this.f304902f) {
            if (this.f304903g == 0) {
                this.f304903g = coordinatorLayout.getResources().getDimensionPixelSize(C0966R.dimen.a0k);
            }
            i2 = Math.max(this.f304903g, this.f304913t - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f304901e;
        }
        int max = Math.max(0, this.f304913t - v.getHeight());
        this.f304904h = max;
        int max2 = Math.max(this.f304913t - i2, max);
        this.f304905i = max2;
        int i3 = this.f304908o;
        if (i3 == 3) {
            C107207u.m145166g(v, this.f304904h);
        } else if (this.f304906j && i3 == 5) {
            C107207u.m145166g(v, this.f304913t);
        } else if (i3 == 4) {
            C107207u.m145166g(v, max2);
        } else if (i3 == 1 || i3 == 2) {
            C107207u.m145166g(v, top - v.getTop());
        }
        if (this.f304909p == null) {
            this.f304909p = new C108547c(coordinatorLayout.getContext(), coordinatorLayout, this.f304898F);
        }
        this.f304914u = new WeakReference<>(v);
        this.f304915v = new WeakReference<>(mo143320x(v));
        return true;
    }

    /* renamed from: i */
    public boolean mo95460i(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f304915v.get() && this.f304908o != 3;
    }

    /* renamed from: j */
    public void mo143314j(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.f304915v.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f304904h;
                if (i3 < i4) {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    C107207u.m145166g(v, -i5);
                    mo143310B(3);
                } else {
                    iArr[1] = i2;
                    C107207u.m145166g(v, -i2);
                    mo143310B(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f304905i;
                if (i3 <= i6 || this.f304906j) {
                    iArr[1] = i2;
                    C107207u.m145166g(v, -i2);
                    mo143310B(1);
                } else {
                    int i7 = top - i6;
                    iArr[1] = i7;
                    C107207u.m145166g(v, -i7);
                    mo143310B(4);
                }
            }
            mo143319w(v.getTop());
            this.f304911r = i2;
            this.f304912s = true;
        }
    }

    /* renamed from: p */
    public void mo143315p(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        Parcelable parcelable2 = savedState.f306434d;
        int i = savedState.f304920f;
        if (i == 1 || i == 2) {
            this.f304908o = 4;
        } else {
            this.f304908o = i;
        }
    }

    /* renamed from: q */
    public Parcelable mo143316q(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, this.f304908o);
    }

    /* renamed from: r */
    public boolean mo143317r(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f304911r = 0;
        this.f304912s = false;
        return (i & 2) != 0;
    }

    /* renamed from: t */
    public void mo143318t(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f304904h) {
            mo143310B(3);
            return;
        }
        WeakReference<View> weakReference = this.f304915v;
        if (weakReference != null && view == weakReference.get() && this.f304912s) {
            if (this.f304911r > 0) {
                i = this.f304904h;
            } else {
                if (this.f304906j) {
                    this.f304917x.computeCurrentVelocity(1000, this.f304900d);
                    if (mo143311C(v, this.f304917x.getYVelocity(this.f304918y))) {
                        i = this.f304913t;
                        i2 = 5;
                    }
                }
                if (this.f304911r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f304904h) < Math.abs(top - this.f304905i)) {
                        i = this.f304904h;
                    } else {
                        i = this.f304905i;
                    }
                } else {
                    i = this.f304905i;
                }
                i2 = 4;
            }
            if (this.f304909p.mo159432u(v, v.getLeft(), i)) {
                mo143310B(2);
                C103388e eVar = new C103388e(v, i2);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(v, eVar);
            } else {
                mo143310B(i2);
            }
            this.f304912s = false;
        }
    }

    /* renamed from: v */
    public boolean mo843v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        Log.m105919d("microMsg.MMBottomSheetBehavior", "onTouchEvent action: %d, x: %f, y: %f, rawX: %f, rawY: %f.", Integer.valueOf(motionEvent.getAction()), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f304908o == 1 && actionMasked == 0) {
            return true;
        }
        C108547c cVar = this.f304909p;
        if (cVar != null) {
            cVar.mo159424m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f304918y = -1;
            VelocityTracker velocityTracker = this.f304917x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f304917x = null;
            }
        }
        if (this.f304917x == null) {
            this.f304917x = VelocityTracker.obtain();
        }
        this.f304917x.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f304910q) {
            float abs = Math.abs(((float) this.f304895C) - motionEvent.getY());
            C108547c cVar2 = this.f304909p;
            if (abs > ((float) cVar2.f324912b)) {
                cVar2.mo159415c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f304910q;
    }

    /* renamed from: w */
    public void mo143319w(int i) {
        C0109c cVar;
        View view = (View) this.f304914u.get();
        if (view != null && (cVar = this.f304916w) != null) {
            int i2 = this.f304905i;
            if (i > i2) {
                cVar.mo87a(view, ((float) (i2 - i)) / ((float) (this.f304913t - i2)));
            } else {
                cVar.mo87a(view, ((float) (i2 - i)) / ((float) (i2 - this.f304904h)));
            }
        }
    }

    /* renamed from: x */
    public View mo143320x(View view) {
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
            View x = mo143320x(viewGroup.getChildAt(i));
            if (x != null) {
                return x;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo143321z(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f304902f
            if (r4 != 0) goto L_0x0015
            r3.f304902f = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f304902f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f304901e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f304902f = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f304901e = r1
            int r1 = r3.f304913t
            int r1 = r1 - r4
            r3.f304905i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f304908o
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f304914u
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.MMBottomSheetBehavior.mo143321z(int):void");
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103386a();

        /* renamed from: f */
        public final int f304920f;

        /* renamed from: android.support.design.widget.MMBottomSheetBehavior$SavedState$a */
        public class C103386a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f304920f = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeInt(this.f304920f);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f304920f = i;
        }
    }

    public MMBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322505e);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo143321z(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo143321z(i);
        }
        this.f304906j = obtainStyledAttributes.getBoolean(1, false);
        this.f304907n = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f304900d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
