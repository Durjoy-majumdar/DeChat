package p004b0;

import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;

/* renamed from: b0.i0 */
public final class C103947i0 {

    /* renamed from: a */
    public int f307380a;

    /* renamed from: b */
    public int f307381b;

    /* renamed from: c */
    public final C60690y0<Integer> f307382c;

    /* renamed from: d */
    public final C60690y0<Integer> f307383d = C108500f2.m146996c(Integer.valueOf(this.f307381b), (C108497e2) null, 2, (Object) null);

    /* renamed from: e */
    public boolean f307384e;

    /* renamed from: f */
    public Object f307385f;

    public C103947i0(int i, int i2) {
        this.f307380a = i;
        this.f307381b = i2;
        this.f307382c = C108500f2.m146996c(Integer.valueOf(i), (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public final void mo145569a(int i, int i2) {
        boolean z = true;
        if (((float) i) >= 0.0f) {
            if (i != this.f307380a) {
                z = false;
            }
            if (!z) {
                this.f307380a = i;
                ((C108494d2) this.f307382c).setValue(Integer.valueOf(i));
            }
            if (i2 != this.f307381b) {
                this.f307381b = i2;
                ((C108494d2) this.f307383d).setValue(Integer.valueOf(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
