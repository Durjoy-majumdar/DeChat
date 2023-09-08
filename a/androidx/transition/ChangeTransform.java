package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p1050v2.C111331h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108341d;
import p853i4.C108348j;
import p853i4.C108353o;
import p853i4.C108360v;

public class ChangeTransform extends Transition {

    /* renamed from: N */
    public static final String[] f306664N = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: P */
    public static final Property<C103808d, float[]> f306665P = new C103805a(float[].class, "nonTranslations");

    /* renamed from: Q */
    public static final Property<C103808d, PointF> f306666Q = new C103806b(PointF.class, "translations");

    /* renamed from: R */
    public static final boolean f306667R = true;

    /* renamed from: K */
    public boolean f306668K = true;

    /* renamed from: L */
    public boolean f306669L = true;

    /* renamed from: M */
    public Matrix f306670M = new Matrix();

    /* renamed from: androidx.transition.ChangeTransform$a */
    public static class C103805a extends Property<C103808d, float[]> {
        public C103805a(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C103808d dVar = (C103808d) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C103808d dVar = (C103808d) obj;
            float[] fArr = (float[]) obj2;
            System.arraycopy(fArr, 0, dVar.f306675c, 0, fArr.length);
            dVar.mo145296a();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    public static class C103806b extends Property<C103808d, PointF> {
        public C103806b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C103808d dVar = (C103808d) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C103808d dVar = (C103808d) obj;
            PointF pointF = (PointF) obj2;
            dVar.getClass();
            dVar.f306676d = pointF.x;
            dVar.f306677e = pointF.y;
            dVar.mo145296a();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    public static class C103807c extends C67095c {

        /* renamed from: d */
        public View f306671d;

        /* renamed from: e */
        public C108341d f306672e;

        public C103807c(View view, C108341d dVar) {
            this.f306671d = view;
            this.f306672e = dVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0017 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo77557b(androidx.transition.Transition r7) {
            /*
                r6 = this;
                r7.mo145310C(r6)
                android.view.View r7 = r6.f306671d
                boolean r0 = p853i4.C108339c.f324367g
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x002e
                boolean r0 = p853i4.C108339c.f324363c     // Catch:{ NoSuchMethodException -> 0x002c }
                if (r0 != 0) goto L_0x0019
                java.lang.String r0 = "android.view.GhostView"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0017 }
                p853i4.C108339c.f324362b = r0     // Catch:{ ClassNotFoundException -> 0x0017 }
            L_0x0017:
                p853i4.C108339c.f324363c = r1     // Catch:{ NoSuchMethodException -> 0x002c }
            L_0x0019:
                java.lang.Class<?> r0 = p853i4.C108339c.f324362b     // Catch:{ NoSuchMethodException -> 0x002c }
                java.lang.String r3 = "removeGhost"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002c }
                java.lang.Class<android.view.View> r5 = android.view.View.class
                r4[r2] = r5     // Catch:{ NoSuchMethodException -> 0x002c }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x002c }
                p853i4.C108339c.f324366f = r0     // Catch:{ NoSuchMethodException -> 0x002c }
                r0.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x002c }
            L_0x002c:
                p853i4.C108339c.f324367g = r1
            L_0x002e:
                java.lang.reflect.Method r0 = p853i4.C108339c.f324366f
                r3 = 0
                if (r0 == 0) goto L_0x0046
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x0046, InvocationTargetException -> 0x003b }
                r1[r2] = r7     // Catch:{ IllegalAccessException -> 0x0046, InvocationTargetException -> 0x003b }
                r0.invoke(r3, r1)     // Catch:{ IllegalAccessException -> 0x0046, InvocationTargetException -> 0x003b }
                goto L_0x0046
            L_0x003b:
                r7 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.Throwable r7 = r7.getCause()
                r0.<init>(r7)
                throw r0
            L_0x0046:
                android.view.View r7 = r6.f306671d
                r0 = 2131315613(0x7f094b9d, float:1.8249684E38)
                r7.setTag(r0, r3)
                android.view.View r7 = r6.f306671d
                r0 = 2131310755(0x7f0938a3, float:1.823983E38)
                r7.setTag(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.C103807c.mo77557b(androidx.transition.Transition):void");
        }

        /* renamed from: c */
        public void mo91180c(Transition transition) {
            this.f306672e.setVisibility(0);
        }

        /* renamed from: d */
        public void mo91181d(Transition transition) {
            this.f306672e.setVisibility(4);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    public static class C103808d {

        /* renamed from: a */
        public final Matrix f306673a = new Matrix();

        /* renamed from: b */
        public final View f306674b;

        /* renamed from: c */
        public final float[] f306675c;

        /* renamed from: d */
        public float f306676d;

        /* renamed from: e */
        public float f306677e;

        public C103808d(View view, float[] fArr) {
            this.f306674b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f306675c = fArr2;
            this.f306676d = fArr2[2];
            this.f306677e = fArr2[5];
            mo145296a();
        }

        /* renamed from: a */
        public final void mo145296a() {
            float[] fArr = this.f306675c;
            fArr[2] = this.f306676d;
            fArr[5] = this.f306677e;
            this.f306673a.setValues(fArr);
            C108360v.m146763a(this.f306674b, this.f306673a);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    public static class C103809e {

        /* renamed from: a */
        public final float f306678a;

        /* renamed from: b */
        public final float f306679b;

        /* renamed from: c */
        public final float f306680c;

        /* renamed from: d */
        public final float f306681d;

        /* renamed from: e */
        public final float f306682e;

        /* renamed from: f */
        public final float f306683f;

        /* renamed from: g */
        public final float f306684g;

        /* renamed from: h */
        public final float f306685h;

        public C103809e(View view) {
            this.f306678a = view.getTranslationX();
            this.f306679b = view.getTranslationY();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            this.f306680c = C107207u.C107213g.m145227l(view);
            this.f306681d = view.getScaleX();
            this.f306682e = view.getScaleY();
            this.f306683f = view.getRotationX();
            this.f306684g = view.getRotationY();
            this.f306685h = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C103809e)) {
                return false;
            }
            C103809e eVar = (C103809e) obj;
            return eVar.f306678a == this.f306678a && eVar.f306679b == this.f306679b && eVar.f306680c == this.f306680c && eVar.f306681d == this.f306681d && eVar.f306682e == this.f306682e && eVar.f306683f == this.f306683f && eVar.f306684g == this.f306684g && eVar.f306685h == this.f306685h;
        }

        public int hashCode() {
            float f = this.f306678a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f306679b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f306680c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f306681d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f306682e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f306683f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f306684g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f306685h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    public ChangeTransform() {
    }

    /* renamed from: S */
    public final void mo145291S(C108353o oVar) {
        View view = oVar.f324392b;
        if (view.getVisibility() != 8) {
            ((HashMap) oVar.f324391a).put("android:changeTransform:parent", view.getParent());
            ((HashMap) oVar.f324391a).put("android:changeTransform:transforms", new C103809e(view));
            Matrix matrix = view.getMatrix();
            ((HashMap) oVar.f324391a).put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f306669L) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C108360v.f324401a.mo158855c(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                ((HashMap) oVar.f324391a).put("android:changeTransform:parentMatrix", matrix2);
                ((HashMap) oVar.f324391a).put("android:changeTransform:intermediateMatrix", view.getTag(C0966R.C0970id.ktv));
                ((HashMap) oVar.f324391a).put("android:changeTransform:intermediateParentMatrix", view.getTag(C0966R.C0970id.hr7));
            }
        }
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145291S(oVar);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145291S(oVar);
        if (!f306667R) {
            ((ViewGroup) oVar.f324392b.getParent()).startViewTransition(oVar.f324392b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0249  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo145268o(android.view.ViewGroup r24, p853i4.C108353o r25, p853i4.C108353o r26) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r9 = r25
            r10 = r26
            if (r9 == 0) goto L_0x0251
            if (r10 == 0) goto L_0x0251
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r12 = "android:changeTransform:parent"
            boolean r1 = r1.containsKey(r12)
            if (r1 == 0) goto L_0x0251
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r1 = r1.containsKey(r12)
            if (r1 != 0) goto L_0x0024
            goto L_0x0251
        L_0x0024:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r12)
            r13 = r1
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r12)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r8.f306669L
            r15 = 1
            if (r2 == 0) goto L_0x0060
            boolean r2 = r8.mo145344z(r13)
            if (r2 == 0) goto L_0x0056
            boolean r2 = r8.mo145344z(r1)
            if (r2 != 0) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            i4.o r2 = r8.mo145341u(r13, r15)
            if (r2 == 0) goto L_0x005a
            android.view.View r2 = r2.f324392b
            if (r1 != r2) goto L_0x005a
            goto L_0x0058
        L_0x0056:
            if (r13 != r1) goto L_0x005a
        L_0x0058:
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r1 != 0) goto L_0x0060
            r16 = 1
            goto L_0x0062
        L_0x0060:
            r16 = 0
        L_0x0062:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r2 = "android:changeTransform:matrix"
            if (r1 == 0) goto L_0x0079
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f324391a
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r2, r1)
        L_0x0079:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r1.get(r3)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r7 = "android:changeTransform:parentMatrix"
            if (r1 == 0) goto L_0x0090
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f324391a
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r7, r1)
        L_0x0090:
            if (r16 == 0) goto L_0x00d4
            java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r7)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            android.view.View r3 = r10.f324392b
            r4 = 2131310755(0x7f0938a3, float:1.823983E38)
            r3.setTag(r4, r1)
            android.graphics.Matrix r3 = r8.f306670M
            r3.reset()
            r1.invert(r3)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x00c4
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.f324391a
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r2, r1)
        L_0x00c4:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.f324391a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            android.graphics.Matrix r4 = (android.graphics.Matrix) r4
            r1.postConcat(r4)
            r1.postConcat(r3)
        L_0x00d4:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f324391a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.f324391a
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r1 != 0) goto L_0x00ec
            android.graphics.Matrix r1 = p853i4.C108344f.f324372a
        L_0x00ec:
            if (r2 != 0) goto L_0x00f0
            android.graphics.Matrix r2 = p853i4.C108344f.f324372a
        L_0x00f0:
            r4 = r2
            boolean r2 = r1.equals(r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r2 == 0) goto L_0x0102
            r11 = r7
            r21 = r13
            r6 = 0
            r20 = 2
            goto L_0x0199
        L_0x0102:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f324391a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r11 = "android:changeTransform:transforms"
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            androidx.transition.ChangeTransform$e r11 = (androidx.transition.ChangeTransform.C103809e) r11
            android.view.View r2 = r10.f324392b
            r2.setTranslationX(r5)
            r2.setTranslationY(r5)
            java.util.WeakHashMap<android.view.View, e3.a0> r17 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107213g.m145238w(r2, r5)
            r2.setScaleX(r6)
            r2.setScaleY(r6)
            r2.setRotationX(r5)
            r2.setRotationY(r5)
            r2.setRotation(r5)
            r5 = 9
            float[] r6 = new float[r5]
            r1.getValues(r6)
            float[] r1 = new float[r5]
            r4.getValues(r1)
            androidx.transition.ChangeTransform$d r15 = new androidx.transition.ChangeTransform$d
            r15.<init>(r2, r6)
            android.util.Property<androidx.transition.ChangeTransform$d, float[]> r14 = f306665P
            i4.b r3 = new i4.b
            float[] r5 = new float[r5]
            r3.<init>(r5)
            r20 = r2
            r5 = 2
            float[][] r2 = new float[r5][]
            r19 = 0
            r2[r19] = r6
            r18 = 1
            r2[r18] = r1
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r14, r3, r2)
            androidx.transition.PathMotion r3 = r8.f306712G
            r14 = r6[r5]
            r21 = 5
            r6 = r6[r21]
            r22 = r7
            r7 = r1[r5]
            r1 = r1[r21]
            android.graphics.Path r1 = r3.mo145263a(r14, r6, r7, r1)
            android.util.Property<androidx.transition.ChangeTransform$d, android.graphics.PointF> r3 = f306666Q
            r6 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r3, r6, r1)
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r5]
            r6 = 0
            r3[r6] = r2
            r2 = 1
            r3[r2] = r1
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r15, r3)
            androidx.transition.a r7 = new androidx.transition.a
            r1 = r7
            r6 = r20
            r2 = r23
            r20 = 2
            r3 = r16
            r21 = r13
            r13 = 0
            r5 = r6
            r6 = r11
            r13 = r7
            r11 = r22
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.addListener(r13)
            r14.addPauseListener(r13)
            r6 = r14
        L_0x0199:
            if (r16 == 0) goto L_0x0245
            if (r6 == 0) goto L_0x0245
            boolean r1 = r8.f306668K
            if (r1 == 0) goto L_0x0245
            android.view.View r1 = r10.f324392b
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f324391a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r11)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r2)
            i4.z r2 = p853i4.C108360v.f324401a
            r2.mo158856d(r0, r3)
            boolean r2 = p853i4.C108339c.f324365e
            r4 = 3
            if (r2 != 0) goto L_0x01ec
            boolean r2 = p853i4.C108339c.f324363c     // Catch:{ NoSuchMethodException -> 0x01e8 }
            if (r2 != 0) goto L_0x01cb
            java.lang.String r2 = "android.view.GhostView"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x01c8 }
            p853i4.C108339c.f324362b = r2     // Catch:{ ClassNotFoundException -> 0x01c8 }
        L_0x01c8:
            r2 = 1
            p853i4.C108339c.f324363c = r2     // Catch:{ NoSuchMethodException -> 0x01e8 }
        L_0x01cb:
            java.lang.Class<?> r2 = p853i4.C108339c.f324362b     // Catch:{ NoSuchMethodException -> 0x01e8 }
            java.lang.String r5 = "addGhost"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01e8 }
            java.lang.Class<android.view.View> r11 = android.view.View.class
            r13 = 0
            r7[r13] = r11     // Catch:{ NoSuchMethodException -> 0x01e8 }
            java.lang.Class<android.view.ViewGroup> r11 = android.view.ViewGroup.class
            r13 = 1
            r7[r13] = r11     // Catch:{ NoSuchMethodException -> 0x01e8 }
            java.lang.Class<android.graphics.Matrix> r11 = android.graphics.Matrix.class
            r7[r20] = r11     // Catch:{ NoSuchMethodException -> 0x01e8 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r7)     // Catch:{ NoSuchMethodException -> 0x01e8 }
            p853i4.C108339c.f324364d = r2     // Catch:{ NoSuchMethodException -> 0x01e8 }
            r2.setAccessible(r13)     // Catch:{ NoSuchMethodException -> 0x01e8 }
        L_0x01e8:
            r2 = 1
            p853i4.C108339c.f324365e = r2
            goto L_0x01ed
        L_0x01ec:
            r2 = 1
        L_0x01ed:
            java.lang.reflect.Method r5 = p853i4.C108339c.f324364d
            if (r5 == 0) goto L_0x0214
            i4.c r7 = new i4.c     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            r11 = 0
            r4[r11] = r1     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            r4[r2] = r0     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            r4[r20] = r3     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            r0 = 0
            java.lang.Object r2 = r5.invoke(r0, r4)     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            r7.<init>(r2)     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0208 }
            r11 = r7
            goto L_0x0215
        L_0x0208:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
        L_0x0213:
        L_0x0214:
            r11 = 0
        L_0x0215:
            if (r11 != 0) goto L_0x0218
            goto L_0x0250
        L_0x0218:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f324391a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r12)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0 = r8
        L_0x0223:
            androidx.transition.TransitionSet r2 = r0.f306726t
            if (r2 == 0) goto L_0x0229
            r0 = r2
            goto L_0x0223
        L_0x0229:
            androidx.transition.ChangeTransform$c r2 = new androidx.transition.ChangeTransform$c
            r2.<init>(r1, r11)
            r0.mo145324a(r2)
            boolean r0 = f306667R
            if (r0 == 0) goto L_0x0250
            android.view.View r0 = r9.f324392b
            android.view.View r2 = r10.f324392b
            if (r0 == r2) goto L_0x023f
            r2 = 0
            p853i4.C108360v.m146765c(r0, r2)
        L_0x023f:
            r0 = 1065353216(0x3f800000, float:1.0)
            p853i4.C108360v.m146765c(r1, r0)
            goto L_0x0250
        L_0x0245:
            boolean r0 = f306667R
            if (r0 != 0) goto L_0x0250
            android.view.View r0 = r9.f324392b
            r1 = r21
            r1.endViewTransition(r0)
        L_0x0250:
            return r6
        L_0x0251:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.mo145268o(android.view.ViewGroup, i4.o, i4.o):android.animation.Animator");
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return f306664N;
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324380f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f306668K = C111331h.m151814a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f306669L = C111331h.m151814a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
