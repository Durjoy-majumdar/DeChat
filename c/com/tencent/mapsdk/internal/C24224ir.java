package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;

/* renamed from: com.tencent.mapsdk.internal.ir */
public abstract class C24224ir implements Cloneable {

    /* renamed from: a */
    public float f69346a;

    /* renamed from: b */
    public Class<?> f69347b;

    /* renamed from: c */
    public Interpolator f69348c = null;

    /* renamed from: d */
    public boolean f69349d = false;

    /* renamed from: com.tencent.mapsdk.internal.ir$c */
    public static class C24227c extends C24224ir {

        /* renamed from: e */
        public Object f69352e;

        public C24227c(float f, Object obj) {
            this.f69346a = f;
            this.f69352e = obj;
            boolean z = obj != null;
            this.f69349d = z;
            this.f69347b = z ? obj.getClass() : Object.class;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C24227c mo40994e() {
            C24227c cVar = new C24227c(this.f69346a, this.f69352e);
            cVar.f69348c = this.f69348c;
            return cVar;
        }

        /* renamed from: a */
        public final void mo40991a(Object obj) {
            this.f69352e = obj;
            this.f69349d = obj != null;
        }

        /* renamed from: d */
        public final Object mo40993d() {
            return this.f69352e;
        }
    }

    /* renamed from: a */
    public static C24224ir m30198a(float f, int i) {
        return new C24226b(f, i);
    }

    /* renamed from: b */
    public static C24224ir m30202b() {
        return new C24225a();
    }

    /* renamed from: c */
    public static C24224ir m30203c() {
        return new C24227c(0.0f, (Object) null);
    }

    /* renamed from: f */
    private boolean m30204f() {
        return this.f69349d;
    }

    /* renamed from: g */
    private float m30205g() {
        return this.f69346a;
    }

    /* renamed from: h */
    private Interpolator m30206h() {
        return this.f69348c;
    }

    /* renamed from: i */
    private Class m30207i() {
        return this.f69347b;
    }

    /* renamed from: a */
    public abstract void mo40991a(Object obj);

    /* renamed from: d */
    public abstract Object mo40993d();

    /* renamed from: e */
    public abstract C24224ir clone();

    /* renamed from: a */
    public static C24224ir m30196a() {
        return new C24226b();
    }

    /* renamed from: a */
    public static C24224ir m30197a(float f, double d) {
        return new C24225a(f, d);
    }

    /* renamed from: a */
    public static C24224ir m30199a(float f, Object obj) {
        return new C24227c(f, obj);
    }

    /* renamed from: com.tencent.mapsdk.internal.ir$a */
    public static class C24225a extends C24224ir {

        /* renamed from: e */
        public double f69350e;

        public C24225a(float f, double d) {
            this.f69346a = f;
            this.f69350e = d;
            this.f69347b = Double.TYPE;
            this.f69349d = true;
        }

        /* renamed from: f */
        private double m30211f() {
            return this.f69350e;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C24225a mo40994e() {
            C24225a aVar = new C24225a(this.f69346a, this.f69350e);
            aVar.f69348c = this.f69348c;
            return aVar;
        }

        /* renamed from: a */
        public final void mo40991a(Object obj) {
            if (obj != null && obj.getClass() == Double.class) {
                this.f69350e = ((Double) obj).doubleValue();
                this.f69349d = true;
            }
        }

        /* renamed from: d */
        public final Object mo40993d() {
            return Double.valueOf(this.f69350e);
        }

        public C24225a() {
            this.f69346a = 0.0f;
            this.f69347b = Double.TYPE;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ir$b */
    public static class C24226b extends C24224ir {

        /* renamed from: e */
        public int f69351e;

        public C24226b(float f, int i) {
            this.f69346a = f;
            this.f69351e = i;
            this.f69347b = Integer.TYPE;
            this.f69349d = true;
        }

        /* renamed from: f */
        private int m30216f() {
            return this.f69351e;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C24226b mo40994e() {
            C24226b bVar = new C24226b(this.f69346a, this.f69351e);
            bVar.f69348c = this.f69348c;
            return bVar;
        }

        /* renamed from: a */
        public final void mo40991a(Object obj) {
            if (obj != null && obj.getClass() == Integer.class) {
                this.f69351e = ((Integer) obj).intValue();
                this.f69349d = true;
            }
        }

        /* renamed from: d */
        public final Object mo40993d() {
            return Integer.valueOf(this.f69351e);
        }

        public C24226b() {
            this.f69346a = 0.0f;
            this.f69347b = Integer.TYPE;
        }
    }

    /* renamed from: a */
    private void m30200a(float f) {
        this.f69346a = f;
    }

    /* renamed from: a */
    private void m30201a(Interpolator interpolator) {
        this.f69348c = interpolator;
    }
}
