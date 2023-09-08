package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import p1050v2.C111331h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108346g;
import p853i4.C108348j;
import p853i4.C108353o;
import p853i4.C108358t;
import p853i4.C108360v;

public class ChangeBounds extends Transition {

    /* renamed from: L */
    public static final String[] f306634L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: M */
    public static final Property<C103801j, PointF> f306635M = new C103793b(PointF.class, "topLeft");

    /* renamed from: N */
    public static final Property<C103801j, PointF> f306636N = new C103794c(PointF.class, "bottomRight");

    /* renamed from: P */
    public static final Property<View, PointF> f306637P = new C103795d(PointF.class, "bottomRight");

    /* renamed from: Q */
    public static final Property<View, PointF> f306638Q = new C103796e(PointF.class, "topLeft");

    /* renamed from: R */
    public static final Property<View, PointF> f306639R = new C103797f(PointF.class, "position");

    /* renamed from: S */
    public static C108346g f306640S = new C108346g();

    /* renamed from: K */
    public boolean f306641K = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    public static class C103792a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f306642a = new Rect();

        public C103792a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f306642a);
            Rect rect = this.f306642a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f306642a);
            this.f306642a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f306642a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    public static class C103793b extends Property<C103801j, PointF> {
        public C103793b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C103801j jVar = (C103801j) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C103801j jVar = (C103801j) obj;
            PointF pointF = (PointF) obj2;
            jVar.getClass();
            jVar.f306651a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            jVar.f306652b = round;
            int i = jVar.f306656f + 1;
            jVar.f306656f = i;
            if (i == jVar.f306657g) {
                C108360v.m146764b(jVar.f306655e, jVar.f306651a, round, jVar.f306653c, jVar.f306654d);
                jVar.f306656f = 0;
                jVar.f306657g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    public static class C103794c extends Property<C103801j, PointF> {
        public C103794c(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C103801j jVar = (C103801j) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C103801j jVar = (C103801j) obj;
            PointF pointF = (PointF) obj2;
            jVar.getClass();
            jVar.f306653c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            jVar.f306654d = round;
            int i = jVar.f306657g + 1;
            jVar.f306657g = i;
            if (jVar.f306656f == i) {
                C108360v.m146764b(jVar.f306655e, jVar.f306651a, jVar.f306652b, jVar.f306653c, round);
                jVar.f306656f = 0;
                jVar.f306657g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    public static class C103795d extends Property<View, PointF> {
        public C103795d(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C108360v.m146764b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    public static class C103796e extends Property<View, PointF> {
        public C103796e(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C108360v.m146764b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    public static class C103797f extends Property<View, PointF> {
        public C103797f(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C108360v.m146764b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    public class C103798g extends AnimatorListenerAdapter {
        private C103801j mViewBounds;

        public C103798g(ChangeBounds changeBounds, C103801j jVar) {
            this.mViewBounds = jVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    public class C103799h extends AnimatorListenerAdapter {

        /* renamed from: d */
        public boolean f306643d;

        /* renamed from: e */
        public final /* synthetic */ View f306644e;

        /* renamed from: f */
        public final /* synthetic */ Rect f306645f;

        /* renamed from: g */
        public final /* synthetic */ int f306646g;

        /* renamed from: h */
        public final /* synthetic */ int f306647h;

        /* renamed from: i */
        public final /* synthetic */ int f306648i;

        /* renamed from: j */
        public final /* synthetic */ int f306649j;

        public C103799h(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f306644e = view;
            this.f306645f = rect;
            this.f306646g = i;
            this.f306647h = i2;
            this.f306648i = i3;
            this.f306649j = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f306643d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f306643d) {
                View view = this.f306644e;
                Rect rect = this.f306645f;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107210d.m145205c(view, rect);
                C108360v.m146764b(this.f306644e, this.f306646g, this.f306647h, this.f306648i, this.f306649j);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    public class C103800i extends C67095c {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f306650d;

        public C103800i(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f306650d = viewGroup;
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            C108358t.m146762a(this.f306650d, false);
            transition.mo145310C(this);
        }

        /* renamed from: c */
        public void mo91180c(Transition transition) {
            C108358t.m146762a(this.f306650d, true);
        }

        /* renamed from: d */
        public void mo91181d(Transition transition) {
            C108358t.m146762a(this.f306650d, false);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    public static class C103801j {

        /* renamed from: a */
        public int f306651a;

        /* renamed from: b */
        public int f306652b;

        /* renamed from: c */
        public int f306653c;

        /* renamed from: d */
        public int f306654d;

        /* renamed from: e */
        public View f306655e;

        /* renamed from: f */
        public int f306656f;

        /* renamed from: g */
        public int f306657g;

        public C103801j(View view) {
            this.f306655e = view;
        }
    }

    static {
        new C103792a(PointF.class, "boundsOrigin");
    }

    public ChangeBounds() {
    }

    /* renamed from: S */
    public final void mo145265S(C108353o oVar) {
        View view = oVar.f324392b;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            ((HashMap) oVar.f324391a).put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            ((HashMap) oVar.f324391a).put("android:changeBounds:parent", oVar.f324392b.getParent());
            if (this.f306641K) {
                ((HashMap) oVar.f324391a).put("android:changeBounds:clip", C107207u.C107210d.m145203a(view));
            }
        }
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145265S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145265S(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r20, p853i4.C108353o r21, p853i4.C108353o r22) {
        /*
            r19 = this;
            r8 = r19
            r0 = r21
            r1 = r22
            if (r0 == 0) goto L_0x01dd
            if (r1 != 0) goto L_0x000c
            goto L_0x01dd
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f324391a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f324391a
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r3 = r3.get(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 == 0) goto L_0x01db
            if (r4 != 0) goto L_0x0028
            goto L_0x01db
        L_0x0028:
            android.view.View r9 = r1.f324392b
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f324391a
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "android:changeBounds:bounds"
            java.lang.Object r3 = r3.get(r4)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f324391a
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r4 = r5.get(r4)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r5 = r3.left
            int r6 = r4.left
            int r7 = r3.top
            int r10 = r4.top
            int r11 = r3.right
            int r12 = r4.right
            int r3 = r3.bottom
            int r13 = r4.bottom
            int r4 = r11 - r5
            int r14 = r3 - r7
            int r15 = r12 - r6
            int r2 = r13 - r10
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f324391a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r16 = r9
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            if (r4 == 0) goto L_0x0075
            if (r14 != 0) goto L_0x0079
        L_0x0075:
            if (r15 == 0) goto L_0x008a
            if (r2 == 0) goto L_0x008a
        L_0x0079:
            if (r5 != r6) goto L_0x0081
            if (r7 == r10) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r17 = 0
            goto L_0x0083
        L_0x0081:
            r17 = 1
        L_0x0083:
            if (r11 != r12) goto L_0x0087
            if (r3 == r13) goto L_0x008c
        L_0x0087:
            int r17 = r17 + 1
            goto L_0x008c
        L_0x008a:
            r17 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x0094
            boolean r18 = r0.equals(r9)
            if (r18 == 0) goto L_0x0098
        L_0x0094:
            if (r0 != 0) goto L_0x009a
            if (r9 == 0) goto L_0x009a
        L_0x0098:
            int r17 = r17 + 1
        L_0x009a:
            r1 = r17
            if (r1 <= 0) goto L_0x01d9
            r17 = r9
            boolean r9 = r8.f306641K
            r18 = r0
            r0 = 2
            if (r9 != 0) goto L_0x012f
            r9 = r16
            p853i4.C108360v.m146764b(r9, r5, r7, r11, r3)
            if (r1 != r0) goto L_0x0104
            if (r4 != r15) goto L_0x00c4
            if (r14 != r2) goto L_0x00c4
            androidx.transition.PathMotion r0 = r8.f306712G
            float r1 = (float) r5
            float r2 = (float) r7
            float r3 = (float) r6
            float r4 = (float) r10
            android.graphics.Path r0 = r0.mo145263a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f306639R
            r2 = 0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r9, r1, r2, r0)
            goto L_0x012c
        L_0x00c4:
            androidx.transition.ChangeBounds$j r1 = new androidx.transition.ChangeBounds$j
            r1.<init>(r9)
            androidx.transition.PathMotion r2 = r8.f306712G
            float r4 = (float) r5
            float r5 = (float) r7
            float r6 = (float) r6
            float r7 = (float) r10
            android.graphics.Path r2 = r2.mo145263a(r4, r5, r6, r7)
            android.util.Property<androidx.transition.ChangeBounds$j, android.graphics.PointF> r4 = f306635M
            r5 = 0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r1, r4, r5, r2)
            androidx.transition.PathMotion r4 = r8.f306712G
            float r6 = (float) r11
            float r3 = (float) r3
            float r7 = (float) r12
            float r10 = (float) r13
            android.graphics.Path r3 = r4.mo145263a(r6, r3, r7, r10)
            android.util.Property<androidx.transition.ChangeBounds$j, android.graphics.PointF> r4 = f306636N
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r1, r4, r5, r3)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r3
            r4.playTogether(r0)
            androidx.transition.ChangeBounds$g r0 = new androidx.transition.ChangeBounds$g
            r0.<init>(r8, r1)
            r4.addListener(r0)
            r0 = r4
            goto L_0x012c
        L_0x0104:
            if (r5 != r6) goto L_0x011b
            if (r7 == r10) goto L_0x0109
            goto L_0x011b
        L_0x0109:
            androidx.transition.PathMotion r0 = r8.f306712G
            float r1 = (float) r11
            float r2 = (float) r3
            float r3 = (float) r12
            float r4 = (float) r13
            android.graphics.Path r0 = r0.mo145263a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f306637P
            r2 = 0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r9, r1, r2, r0)
            goto L_0x012c
        L_0x011b:
            r2 = 0
            androidx.transition.PathMotion r0 = r8.f306712G
            float r1 = (float) r5
            float r3 = (float) r7
            float r4 = (float) r6
            float r5 = (float) r10
            android.graphics.Path r0 = r0.mo145263a(r1, r3, r4, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f306638Q
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r9, r1, r2, r0)
        L_0x012c:
            r10 = 1
            goto L_0x01bf
        L_0x012f:
            r9 = r16
            int r1 = java.lang.Math.max(r4, r15)
            int r3 = java.lang.Math.max(r14, r2)
            int r1 = r1 + r5
            int r3 = r3 + r7
            p853i4.C108360v.m146764b(r9, r5, r7, r1, r3)
            if (r5 != r6) goto L_0x0145
            if (r7 == r10) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r11 = 0
            goto L_0x0157
        L_0x0145:
            androidx.transition.PathMotion r1 = r8.f306712G
            float r3 = (float) r5
            float r5 = (float) r7
            float r7 = (float) r6
            float r11 = (float) r10
            android.graphics.Path r1 = r1.mo145263a(r3, r5, r7, r11)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f306639R
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r9, r3, r5, r1)
            r11 = r1
        L_0x0157:
            if (r18 != 0) goto L_0x0160
            android.graphics.Rect r1 = new android.graphics.Rect
            r3 = 0
            r1.<init>(r3, r3, r4, r14)
            goto L_0x0163
        L_0x0160:
            r3 = 0
            r1 = r18
        L_0x0163:
            if (r17 != 0) goto L_0x016b
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r3, r15, r2)
            goto L_0x016d
        L_0x016b:
            r4 = r17
        L_0x016d:
            boolean r2 = r1.equals(r4)
            if (r2 != 0) goto L_0x01a2
            java.util.WeakHashMap<android.view.View, e3.a0> r2 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107210d.m145205c(r9, r1)
            i4.g r2 = f306640S
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r3] = r1
            r1 = 1
            r5[r1] = r4
            java.lang.String r4 = "clipBounds"
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofObject(r9, r4, r2, r5)
            androidx.transition.ChangeBounds$h r15 = new androidx.transition.ChangeBounds$h
            r7 = 2
            r0 = r15
            r5 = 1
            r16 = 0
            r1 = r19
            r2 = r9
            r3 = r17
            r4 = r6
            r6 = 1
            r5 = r10
            r10 = 1
            r6 = r12
            r12 = 2
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.addListener(r15)
            r2 = r14
            goto L_0x01a7
        L_0x01a2:
            r10 = 1
            r12 = 2
            r16 = 0
            r2 = 0
        L_0x01a7:
            boolean r0 = androidx.transition.C103837e.f306783a
            if (r11 != 0) goto L_0x01ad
            r0 = r2
            goto L_0x01bf
        L_0x01ad:
            if (r2 != 0) goto L_0x01b1
            r0 = r11
            goto L_0x01bf
        L_0x01b1:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r12]
            r1[r16] = r11
            r1[r10] = r2
            r0.playTogether(r1)
        L_0x01bf:
            android.view.ViewParent r1 = r9.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01d8
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            p853i4.C108358t.m146762a(r1, r10)
            androidx.transition.ChangeBounds$i r2 = new androidx.transition.ChangeBounds$i
            r2.<init>(r8, r1)
            r8.mo145324a(r2)
        L_0x01d8:
            return r0
        L_0x01d9:
            r0 = 0
            return r0
        L_0x01db:
            r0 = 0
            return r0
        L_0x01dd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeBounds.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return f306634L;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324377c);
        boolean a = C111331h.m151814a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.f306641K = a;
    }
}
