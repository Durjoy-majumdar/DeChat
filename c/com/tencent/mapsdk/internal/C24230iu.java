package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C24224ir;

/* renamed from: com.tencent.mapsdk.internal.iu */
public class C24230iu implements Cloneable {

    /* renamed from: d */
    private static final C24236ix<Integer> f69360d = new C28649ip();

    /* renamed from: e */
    private static final C24236ix<Number> f69361e = new C28648in();

    /* renamed from: a */
    public int f69362a;

    /* renamed from: b */
    public Class<?> f69363b;

    /* renamed from: c */
    public C24228is f69364c;

    /* renamed from: f */
    private C24236ix f69365f;

    /* renamed from: g */
    private Object f69366g;

    /* renamed from: com.tencent.mapsdk.internal.iu$a */
    public static class C24232a extends C24230iu {

        /* renamed from: d */
        public C24222io f69367d;

        /* renamed from: e */
        public double f69368e;

        private C24232a(int i, C24222io ioVar) {
            super(i, (byte) 0);
            this.f69363b = Float.TYPE;
            this.f69364c = ioVar;
            this.f69367d = ioVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C24232a clone() {
            C24232a aVar = (C24232a) C24230iu.super.clone();
            aVar.f69367d = (C24222io) aVar.f69364c;
            return aVar;
        }

        /* renamed from: b */
        public final Object mo41007b() {
            return Double.valueOf(this.f69368e);
        }

        /* renamed from: a */
        public final void mo41004a(double... dArr) {
            C24230iu.super.mo41004a(dArr);
            this.f69367d = (C24222io) this.f69364c;
        }

        /* renamed from: a */
        public final void mo41001a(float f) {
            this.f69368e = this.f69367d.mo40988b(f);
        }

        public C24232a(int i, double... dArr) {
            super(i, (byte) 0);
            mo41004a(dArr);
        }

        /* renamed from: a */
        public final void mo41002a(C24211ig igVar) {
            if (igVar != null) {
                igVar.mo40962a(this.f69362a, Double.valueOf(this.f69368e));
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.iu$b */
    public static class C24233b extends C24230iu {

        /* renamed from: d */
        public C24223iq f69369d;

        /* renamed from: e */
        public int f69370e;

        private C24233b(int i, C24223iq iqVar) {
            super(i, (byte) 0);
            this.f69363b = Integer.TYPE;
            this.f69364c = iqVar;
            this.f69369d = iqVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C24233b clone() {
            C24233b bVar = (C24233b) C24230iu.super.clone();
            bVar.f69369d = (C24223iq) bVar.f69364c;
            return bVar;
        }

        /* renamed from: b */
        public final Object mo41007b() {
            return Integer.valueOf(this.f69370e);
        }

        /* renamed from: a */
        public final void mo41005a(int... iArr) {
            C24230iu.super.mo41005a(iArr);
            this.f69369d = (C24223iq) this.f69364c;
        }

        /* renamed from: a */
        public final void mo41001a(float f) {
            this.f69370e = this.f69369d.mo40990b(f);
        }

        public C24233b(int i, int... iArr) {
            super(i, (byte) 0);
            mo41005a(iArr);
        }

        /* renamed from: a */
        public final void mo41002a(C24211ig igVar) {
            if (igVar != null) {
                igVar.mo40962a(this.f69362a, Integer.valueOf(this.f69370e));
            }
        }
    }

    public /* synthetic */ C24230iu(int i, byte b) {
        this(i);
    }

    /* renamed from: a */
    public static C24230iu m30247a(int i, int... iArr) {
        return new C24233b(i, iArr);
    }

    /* renamed from: c */
    private void m30252c() {
        if (this.f69365f == null) {
            Class<?> cls = this.f69363b;
            this.f69365f = cls == Integer.class ? f69360d : cls == Double.class ? f69361e : null;
        }
        C24236ix ixVar = this.f69365f;
        if (ixVar != null) {
            this.f69364c.f69358f = ixVar;
        }
    }

    /* renamed from: d */
    private int m30253d() {
        return this.f69362a;
    }

    /* renamed from: b */
    public Object mo41007b() {
        return this.f69366g;
    }

    public String toString() {
        return this.f69362a + ": " + this.f69364c.toString();
    }

    private C24230iu(int i) {
        this.f69364c = null;
        this.f69362a = i;
    }

    /* renamed from: a */
    public static C24230iu m30246a(int i, double... dArr) {
        return new C24232a(i, dArr);
    }

    /* renamed from: a */
    public static C24230iu m30249a(int i, Object... objArr) {
        C24230iu iuVar = new C24230iu(i);
        iuVar.mo41006a(objArr);
        iuVar.mo41003a((C24236ix) null);
        return iuVar;
    }

    /* renamed from: a */
    public void mo41005a(int... iArr) {
        this.f69363b = Integer.TYPE;
        int length = iArr.length;
        C24224ir.C24226b[] bVarArr = new C24224ir.C24226b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = new C24224ir.C24226b();
            bVarArr[1] = (C24224ir.C24226b) C24224ir.m30198a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (C24224ir.C24226b) C24224ir.m30198a(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                bVarArr[i] = (C24224ir.C24226b) C24224ir.m30198a(((float) i) / ((float) (length - 1)), iArr[i]);
            }
        }
        this.f69364c = new C24223iq(bVarArr);
    }

    /* renamed from: a */
    public void mo41004a(double... dArr) {
        this.f69363b = Double.TYPE;
        int length = dArr.length;
        C24224ir.C24225a[] aVarArr = new C24224ir.C24225a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = new C24224ir.C24225a();
            aVarArr[1] = (C24224ir.C24225a) C24224ir.m30197a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (C24224ir.C24225a) C24224ir.m30197a(0.0f, dArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (C24224ir.C24225a) C24224ir.m30197a(((float) i) / ((float) (length - 1)), dArr[i]);
            }
        }
        this.f69364c = new C24222io(aVarArr);
    }

    /* renamed from: a */
    private void m30251a(C24224ir... irVarArr) {
        int length = irVarArr.length;
        C24224ir[] irVarArr2 = new C24224ir[Math.max(length, 2)];
        for (int i = 0; i < length; i++) {
            irVarArr2[i] = irVarArr[i];
        }
        this.f69364c = new C24228is(irVarArr2);
    }

    /* renamed from: a */
    public final void mo41006a(Object... objArr) {
        this.f69363b = objArr[0].getClass();
        this.f69364c = C24228is.m30228a(objArr);
    }

    /* renamed from: a */
    public C24230iu clone() {
        try {
            C24230iu iuVar = (C24230iu) super.clone();
            iuVar.f69362a = this.f69362a;
            iuVar.f69364c = this.f69364c.clone();
            iuVar.f69365f = this.f69365f;
            return iuVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo41002a(C24211ig igVar) {
        if (igVar != null) {
            igVar.mo40962a(this.f69362a, mo41007b());
        }
    }

    /* renamed from: a */
    public final void mo41003a(C24236ix ixVar) {
        this.f69365f = ixVar;
        this.f69364c.f69358f = ixVar;
    }

    /* renamed from: a */
    public void mo41001a(float f) {
        this.f69366g = this.f69364c.mo40987a(f);
    }

    /* renamed from: a */
    private void m30250a(int i) {
        this.f69362a = i;
    }

    /* renamed from: a */
    private static C24230iu m30248a(int i, C24224ir... irVarArr) {
        C24228is isVar;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (C24224ir irVar : irVarArr) {
            if (irVar instanceof C24224ir.C24225a) {
                z = true;
            } else if (irVar instanceof C24224ir.C24226b) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if (z && !z2 && !z3) {
            C24224ir.C24225a[] aVarArr = new C24224ir.C24225a[r0];
            while (i2 < r0) {
                aVarArr[i2] = irVarArr[i2];
                i2++;
            }
            isVar = new C24222io(aVarArr);
        } else if (!z2 || z || z3) {
            isVar = new C24228is(irVarArr);
        } else {
            C24224ir.C24226b[] bVarArr = new C24224ir.C24226b[r0];
            while (i2 < r0) {
                bVarArr[i2] = irVarArr[i2];
                i2++;
            }
            isVar = new C24223iq(bVarArr);
        }
        C24230iu iuVar = new C24230iu(i);
        iuVar.f69364c = isVar;
        return iuVar;
    }
}
