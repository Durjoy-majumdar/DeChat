package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;
import p1050v2.C111331h;
import p853i4.C108348j;
import p853i4.C108353o;
import p853i4.C108358t;
import p853i4.C108360v;

public abstract class Visibility extends Transition {

    /* renamed from: L */
    public static final String[] f306745L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: K */
    public int f306746K = 3;

    /* renamed from: androidx.transition.Visibility$a */
    public static class C103827a extends AnimatorListenerAdapter implements Transition.C103824e {

        /* renamed from: d */
        public final View f306747d;

        /* renamed from: e */
        public final int f306748e;

        /* renamed from: f */
        public final ViewGroup f306749f;

        /* renamed from: g */
        public final boolean f306750g;

        /* renamed from: h */
        public boolean f306751h;

        /* renamed from: i */
        public boolean f306752i = false;

        public C103827a(View view, int i, boolean z) {
            this.f306747d = view;
            this.f306748e = i;
            this.f306749f = (ViewGroup) view.getParent();
            this.f306750g = z;
            mo145354e(true);
        }

        /* renamed from: a */
        public void mo91179a(Transition transition) {
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            if (!this.f306752i) {
                C108360v.m146766d(this.f306747d, this.f306748e);
                ViewGroup viewGroup = this.f306749f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo145354e(false);
            transition.mo145310C(this);
        }

        /* renamed from: c */
        public void mo91180c(Transition transition) {
            mo145354e(true);
        }

        /* renamed from: d */
        public void mo91181d(Transition transition) {
            mo145354e(false);
        }

        /* renamed from: e */
        public final void mo145354e(boolean z) {
            ViewGroup viewGroup;
            if (this.f306750g && this.f306751h != z && (viewGroup = this.f306749f) != null) {
                this.f306751h = z;
                C108358t.m146762a(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f306752i = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f306752i) {
                C108360v.m146766d(this.f306747d, this.f306748e);
                ViewGroup viewGroup = this.f306749f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo145354e(false);
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f306752i) {
                C108360v.m146766d(this.f306747d, this.f306748e);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f306752i) {
                C108360v.m146766d(this.f306747d, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    public static class C103828b {

        /* renamed from: a */
        public boolean f306753a;

        /* renamed from: b */
        public boolean f306754b;

        /* renamed from: c */
        public int f306755c;

        /* renamed from: d */
        public int f306756d;

        /* renamed from: e */
        public ViewGroup f306757e;

        /* renamed from: f */
        public ViewGroup f306758f;
    }

    public Visibility() {
    }

    /* renamed from: S */
    public final void mo145352S(C108353o oVar) {
        int visibility = oVar.f324392b.getVisibility();
        ((HashMap) oVar.f324391a).put("android:visibility:visibility", Integer.valueOf(visibility));
        ((HashMap) oVar.f324391a).put("android:visibility:parent", oVar.f324392b.getParent());
        int[] iArr = new int[2];
        oVar.f324392b.getLocationOnScreen(iArr);
        ((HashMap) oVar.f324391a).put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: T */
    public final C103828b mo145353T(C108353o oVar, C108353o oVar2) {
        C103828b bVar = new C103828b();
        bVar.f306753a = false;
        bVar.f306754b = false;
        if (oVar == null || !((HashMap) oVar.f324391a).containsKey("android:visibility:visibility")) {
            bVar.f306755c = -1;
            bVar.f306757e = null;
        } else {
            bVar.f306755c = ((Integer) ((HashMap) oVar.f324391a).get("android:visibility:visibility")).intValue();
            bVar.f306757e = (ViewGroup) ((HashMap) oVar.f324391a).get("android:visibility:parent");
        }
        if (oVar2 == null || !((HashMap) oVar2.f324391a).containsKey("android:visibility:visibility")) {
            bVar.f306756d = -1;
            bVar.f306758f = null;
        } else {
            bVar.f306756d = ((Integer) ((HashMap) oVar2.f324391a).get("android:visibility:visibility")).intValue();
            bVar.f306758f = (ViewGroup) ((HashMap) oVar2.f324391a).get("android:visibility:parent");
        }
        if (oVar != null && oVar2 != null) {
            int i = bVar.f306755c;
            int i2 = bVar.f306756d;
            if (i == i2 && bVar.f306757e == bVar.f306758f) {
                return bVar;
            }
            if (i != i2) {
                if (i == 0) {
                    bVar.f306754b = false;
                    bVar.f306753a = true;
                } else if (i2 == 0) {
                    bVar.f306754b = true;
                    bVar.f306753a = true;
                }
            } else if (bVar.f306758f == null) {
                bVar.f306754b = false;
                bVar.f306753a = true;
            } else if (bVar.f306757e == null) {
                bVar.f306754b = true;
                bVar.f306753a = true;
            }
        } else if (oVar == null && bVar.f306756d == 0) {
            bVar.f306754b = true;
            bVar.f306753a = true;
        } else if (oVar2 == null && bVar.f306755c == 0) {
            bVar.f306754b = false;
            bVar.f306753a = true;
        }
        return bVar;
    }

    /* renamed from: U */
    public Animator mo145299U(ViewGroup viewGroup, View view, C108353o oVar, C108353o oVar2) {
        return null;
    }

    /* renamed from: V */
    public Animator mo145300V(ViewGroup viewGroup, View view, C108353o oVar, C108353o oVar2) {
        return null;
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145352S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145352S(oVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0114  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r10, p853i4.C108353o r11, p853i4.C108353o r12) {
        /*
            r9 = this;
            androidx.transition.Visibility$b r0 = r9.mo145353T(r11, r12)
            boolean r1 = r0.f306753a
            r2 = 0
            if (r1 == 0) goto L_0x0133
            android.view.ViewGroup r1 = r0.f306757e
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f306758f
            if (r1 == 0) goto L_0x0133
        L_0x0011:
            boolean r1 = r0.f306754b
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0041
            int r0 = r9.f306746K
            r0 = r0 & r4
            if (r0 != r4) goto L_0x0040
            if (r12 != 0) goto L_0x001f
            goto L_0x0040
        L_0x001f:
            if (r11 != 0) goto L_0x003a
            android.view.View r0 = r12.f324392b
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            i4.o r1 = r9.mo145341u(r0, r3)
            i4.o r0 = r9.mo145342x(r0, r3)
            androidx.transition.Visibility$b r0 = r9.mo145353T(r1, r0)
            boolean r0 = r0.f306753a
            if (r0 == 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            android.view.View r0 = r12.f324392b
            android.animation.Animator r2 = r9.mo145299U(r10, r0, r11, r12)
        L_0x0040:
            return r2
        L_0x0041:
            int r0 = r0.f306756d
            int r1 = r9.f306746K
            r5 = 2
            r1 = r1 & r5
            if (r1 == r5) goto L_0x004b
            goto L_0x0133
        L_0x004b:
            if (r11 == 0) goto L_0x0050
            android.view.View r1 = r11.f324392b
            goto L_0x0051
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r12 == 0) goto L_0x0056
            android.view.View r6 = r12.f324392b
            goto L_0x0057
        L_0x0056:
            r6 = r2
        L_0x0057:
            if (r6 == 0) goto L_0x0079
            android.view.ViewParent r7 = r6.getParent()
            if (r7 != 0) goto L_0x0060
            goto L_0x0079
        L_0x0060:
            r7 = 4
            if (r0 != r7) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            if (r1 != r6) goto L_0x0069
        L_0x0066:
            r1 = r2
            goto L_0x00c6
        L_0x0069:
            boolean r6 = r9.f306730x
            if (r6 == 0) goto L_0x006e
            goto L_0x00c2
        L_0x006e:
            android.view.ViewParent r6 = r1.getParent()
            android.view.View r6 = (android.view.View) r6
            android.view.View r1 = androidx.transition.C103837e.m138412a(r10, r1, r6)
            goto L_0x00c2
        L_0x0079:
            if (r6 == 0) goto L_0x007d
            r1 = r6
            goto L_0x00c2
        L_0x007d:
            if (r1 == 0) goto L_0x00c4
            android.view.ViewParent r6 = r1.getParent()
            if (r6 != 0) goto L_0x0086
            goto L_0x00c2
        L_0x0086:
            android.view.ViewParent r6 = r1.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x00c4
            android.view.ViewParent r6 = r1.getParent()
            android.view.View r6 = (android.view.View) r6
            i4.o r7 = r9.mo145342x(r6, r4)
            i4.o r8 = r9.mo145341u(r6, r4)
            androidx.transition.Visibility$b r7 = r9.mo145353T(r7, r8)
            boolean r7 = r7.f306753a
            if (r7 != 0) goto L_0x00a9
            android.view.View r1 = androidx.transition.C103837e.m138412a(r10, r1, r6)
            goto L_0x00c2
        L_0x00a9:
            android.view.ViewParent r7 = r6.getParent()
            if (r7 != 0) goto L_0x00c1
            int r6 = r6.getId()
            r7 = -1
            if (r6 == r7) goto L_0x00c1
            android.view.View r6 = r10.findViewById(r6)
            if (r6 == 0) goto L_0x00c1
            boolean r6 = r9.f306730x
            if (r6 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r1 = r2
        L_0x00c2:
            r6 = r2
            goto L_0x00c6
        L_0x00c4:
            r1 = r2
            r6 = r1
        L_0x00c6:
            if (r1 == 0) goto L_0x0112
            if (r11 == 0) goto L_0x0112
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f324391a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r2 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r2)
            int[] r0 = (int[]) r0
            r2 = r0[r3]
            r0 = r0[r4]
            int[] r5 = new int[r5]
            r10.getLocationOnScreen(r5)
            r3 = r5[r3]
            int r2 = r2 - r3
            int r3 = r1.getLeft()
            int r2 = r2 - r3
            r1.offsetLeftAndRight(r2)
            r2 = r5[r4]
            int r0 = r0 - r2
            int r2 = r1.getTop()
            int r0 = r0 - r2
            r1.offsetTopAndBottom(r0)
            i4.r r0 = new i4.r
            r0.<init>(r10)
            android.view.ViewGroupOverlay r2 = r0.f324398a
            r2.add(r1)
            android.animation.Animator r2 = r9.mo145300V(r10, r1, r11, r12)
            if (r2 != 0) goto L_0x0109
            r0.mo158849a(r1)
            goto L_0x0133
        L_0x0109:
            i4.a0 r10 = new i4.a0
            r10.<init>(r9, r0, r1)
            r2.addListener(r10)
            goto L_0x0133
        L_0x0112:
            if (r6 == 0) goto L_0x0133
            int r1 = r6.getVisibility()
            p853i4.C108360v.m146766d(r6, r3)
            android.animation.Animator r2 = r9.mo145300V(r10, r6, r11, r12)
            if (r2 == 0) goto L_0x0130
            androidx.transition.Visibility$a r10 = new androidx.transition.Visibility$a
            r10.<init>(r6, r0, r4)
            r2.addListener(r10)
            r2.addPauseListener(r10)
            r9.mo145324a(r10)
            goto L_0x0133
        L_0x0130:
            p853i4.C108360v.m146766d(r6, r1)
        L_0x0133:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return f306745L;
    }

    /* renamed from: y */
    public boolean mo145343y(C108353o oVar, C108353o oVar2) {
        if (oVar == null && oVar2 == null) {
            return false;
        }
        if (oVar != null && oVar2 != null && ((HashMap) oVar2.f324391a).containsKey("android:visibility:visibility") != ((HashMap) oVar.f324391a).containsKey("android:visibility:visibility")) {
            return false;
        }
        C103828b T = mo145353T(oVar, oVar2);
        if (T.f306753a) {
            return T.f306755c == 0 || T.f306756d == 0;
        }
        return false;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324378d);
        int d = C111331h.m151817d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (d == 0) {
            return;
        }
        if ((d & -4) == 0) {
            this.f306746K = d;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
