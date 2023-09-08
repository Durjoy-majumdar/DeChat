package ya0;

import p1166z0.C112539e;
import p1166z0.C112540f;
import p560i2.C108330s;
import p560i2.C108331t;
import p582k1.C108796a;
import wx3.C15601d;

/* renamed from: ya0.a */
public final class C112408a implements C108796a {

    /* renamed from: d */
    public final boolean f336584d;

    /* renamed from: e */
    public final boolean f336585e;

    public C112408a(boolean z, boolean z2) {
        this.f336584d = z;
        this.f336585e = z2;
    }

    /* renamed from: b */
    public long mo159896b(long j, long j2, int i) {
        if (i == 2) {
            boolean z = this.f336584d;
            boolean z2 = this.f336585e;
            float f = 0.0f;
            float c = z ? C112539e.m153738c(j2) : 0.0f;
            if (z2) {
                f = C112539e.m153739d(j2);
            }
            return C112540f.m153745a(c, f);
        }
        int i2 = C112539e.f336958e;
        return C112539e.f336955b;
    }

    /* renamed from: d */
    public Object mo159897d(long j, long j2, C15601d<? super C108330s> dVar) {
        boolean z = this.f336584d;
        boolean z2 = this.f336585e;
        float f = 0.0f;
        float b = z ? C108330s.m146746b(j2) : 0.0f;
        if (z2) {
            f = C108330s.m146747c(j2);
        }
        return new C108330s(C108331t.m146750a(b, f));
    }

    /* renamed from: e */
    public long mo159898e(long j, int i) {
        return C112539e.f336955b;
    }

    /* renamed from: f */
    public Object mo159899f(long j, C15601d<? super C108330s> dVar) {
        return new C108330s(C108330s.f324354b);
    }
}
