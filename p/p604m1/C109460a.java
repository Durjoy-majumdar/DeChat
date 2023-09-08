package p604m1;

/* renamed from: m1.a */
public final class C109460a {

    /* renamed from: a */
    public final C109462d[] f327624a;

    public C109460a(int i, int i2) {
        C109462d[] dVarArr = new C109462d[i];
        for (int i3 = 0; i3 < i; i3++) {
            dVarArr[i3] = new C109462d(i2);
        }
        this.f327624a = dVarArr;
    }

    /* renamed from: a */
    public final float mo160692a(int i, int i2) {
        return this.f327624a[i].f327628b[i2].floatValue();
    }

    /* renamed from: b */
    public final void mo160693b(int i, int i2, float f) {
        this.f327624a[i].f327628b[i2] = Float.valueOf(f);
    }
}
