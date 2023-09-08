package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C104442b;

/* renamed from: com.google.android.material.circularreveal.c */
public interface C104444c extends C104442b.C104443a {

    /* renamed from: com.google.android.material.circularreveal.c$a */
    public static class C104445a implements TypeEvaluator<C104448d> {

        /* renamed from: b */
        public static final TypeEvaluator<C104448d> f309361b = new C104445a();

        /* renamed from: a */
        public final C104448d f309362a = new C104448d();

        public Object evaluate(float f, Object obj, Object obj2) {
            C104448d dVar = (C104448d) obj;
            C104448d dVar2 = (C104448d) obj2;
            C104448d dVar3 = this.f309362a;
            float f2 = 1.0f - f;
            float f3 = (dVar.f309365a * f2) + (dVar2.f309365a * f);
            float f4 = dVar.f309366b;
            float f5 = dVar.f309367c;
            dVar3.f309365a = f3;
            dVar3.f309366b = (f4 * f2) + (dVar2.f309366b * f);
            dVar3.f309367c = (f2 * f5) + (f * dVar2.f309367c);
            return dVar3;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$b */
    public static class C104446b extends Property<C104444c, C104448d> {

        /* renamed from: a */
        public static final Property<C104444c, C104448d> f309363a = new C104446b("circularReveal");

        public C104446b(String str) {
            super(C104448d.class, str);
        }

        public Object get(Object obj) {
            return ((C104444c) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((C104444c) obj).setRevealInfo((C104448d) obj2);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    public static class C104447c extends Property<C104444c, Integer> {

        /* renamed from: a */
        public static final Property<C104444c, Integer> f309364a = new C104447c("circularRevealScrimColor");

        public C104447c(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((C104444c) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((C104444c) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: a */
    void mo146664a();

    /* renamed from: c */
    void mo146666c();

    int getCircularRevealScrimColor();

    C104448d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C104448d dVar);

    /* renamed from: com.google.android.material.circularreveal.c$d */
    public static class C104448d {

        /* renamed from: a */
        public float f309365a;

        /* renamed from: b */
        public float f309366b;

        /* renamed from: c */
        public float f309367c;

        public C104448d() {
        }

        public C104448d(float f, float f2, float f3) {
            this.f309365a = f;
            this.f309366b = f2;
            this.f309367c = f3;
        }

        public C104448d(C104448d dVar) {
            this(dVar.f309365a, dVar.f309366b, dVar.f309367c);
        }
    }
}
