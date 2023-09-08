package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j20.C117292a;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p905j3.C108547c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: d */
    public C108547c f309122d;

    /* renamed from: e */
    public boolean f309123e;

    /* renamed from: f */
    public int f309124f = 2;

    /* renamed from: g */
    public float f309125g = 0.5f;

    /* renamed from: h */
    public float f309126h = 0.0f;

    /* renamed from: i */
    public float f309127i = 0.5f;

    /* renamed from: j */
    public final C108547c.C108549c f309128j = new C104406a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C104406a extends C108547c.C108549c {

        /* renamed from: a */
        public int f309129a;

        /* renamed from: b */
        public int f309130b = -1;

        public C104406a() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            boolean z = C107207u.C107209c.m145195d(view) == 1;
            int i5 = SwipeDismissBehavior.this.f309124f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f309129a - view.getWidth();
                    i4 = view.getWidth() + this.f309129a;
                } else if (z) {
                    i3 = this.f309129a;
                    width = view.getWidth();
                } else {
                    i3 = this.f309129a - view.getWidth();
                    i4 = this.f309129a;
                }
                return Math.min(Math.max(i3, i), i4);
            } else if (z) {
                i3 = this.f309129a - view.getWidth();
                i4 = this.f309129a;
                return Math.min(Math.max(i3, i), i4);
            } else {
                i3 = this.f309129a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return Math.min(Math.max(i3, i), i4);
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: c */
        public int mo145103c(View view) {
            return view.getWidth();
        }

        /* renamed from: g */
        public void mo145106g(View view, int i) {
            this.f309130b = i;
            this.f309129a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: h */
        public void mo143325h(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f309129a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f309126h);
            float width2 = ((float) this.f309129a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f309127i);
            float f = (float) i;
            if (f <= width) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (f >= width2) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                float min = Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(min));
                View view4 = view;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f309129a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f309131c.f309125g)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo96792j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f309130b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003c
                java.util.WeakHashMap<android.view.View, e3.a0> r4 = p849e3.C107207u.f320808a
                int r4 = p849e3.C107207u.C107209c.m145195d(r8)
                if (r4 != r2) goto L_0x0018
                r4 = 1
                goto L_0x0019
            L_0x0018:
                r4 = 0
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f309124f
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x002c
            L_0x0021:
                if (r5 != 0) goto L_0x0030
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x002a:
                if (r3 <= 0) goto L_0x002e
            L_0x002c:
                r9 = 1
                goto L_0x0059
            L_0x002e:
                r9 = 0
                goto L_0x0059
            L_0x0030:
                if (r5 != r2) goto L_0x002e
                if (r4 == 0) goto L_0x0037
                if (r3 <= 0) goto L_0x002e
                goto L_0x003b
            L_0x0037:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
            L_0x003b:
                goto L_0x002c
            L_0x003c:
                int r9 = r8.getLeft()
                int r0 = r7.f309129a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f309125g
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002e
                goto L_0x002c
            L_0x0059:
                if (r9 == 0) goto L_0x0068
                int r9 = r8.getLeft()
                int r0 = r7.f309129a
                if (r9 >= r0) goto L_0x0065
                int r0 = r0 - r10
                goto L_0x0066
            L_0x0065:
                int r0 = r0 + r10
            L_0x0066:
                r1 = 1
                goto L_0x006a
            L_0x0068:
                int r0 = r7.f309129a
            L_0x006a:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                j3.c r9 = r9.f309122d
                int r10 = r8.getTop()
                boolean r9 = r9.mo159430s(r0, r10)
                if (r9 == 0) goto L_0x0085
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                java.util.WeakHashMap<android.view.View, e3.a0> r10 = p849e3.C107207u.f320808a
                p849e3.C107207u.C107208b.m145185m(r8, r9)
                goto L_0x008c
            L_0x0085:
                if (r1 == 0) goto L_0x008c
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.getClass()
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C104406a.mo96792j(android.view.View, float, float):void");
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            return this.f309130b == -1 && SwipeDismissBehavior.this.mo146269w(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C104407b implements Runnable {

        /* renamed from: d */
        public final View f309132d;

        /* renamed from: e */
        public final boolean f309133e;

        public C104407b(View view, boolean z) {
            this.f309132d = view;
            this.f309133e = z;
        }

        public void run() {
            C108547c cVar = SwipeDismissBehavior.this.f309122d;
            if (cVar != null && cVar.mo159420h(true)) {
                View view = this.f309132d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(view, this);
            } else if (this.f309133e) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* renamed from: e */
    public boolean mo143313e(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f309123e;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo144909q(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f309123e = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f309123e = false;
        }
        if (!z) {
            return false;
        }
        if (this.f309122d == null) {
            this.f309122d = new C108547c(coordinatorLayout.getContext(), coordinatorLayout, this.f309128j);
        }
        return this.f309122d.mo159431t(motionEvent);
    }

    /* renamed from: v */
    public boolean mo843v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C108547c cVar = this.f309122d;
        if (cVar == null) {
            return false;
        }
        cVar.mo159424m(motionEvent);
        return true;
    }

    /* renamed from: w */
    public boolean mo146269w(View view) {
        return true;
    }
}
