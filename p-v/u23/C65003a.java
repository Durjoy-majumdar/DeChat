package u23;

import iy3.C60641c;
import java.util.LinkedList;

/* renamed from: u23.a */
public abstract class C65003a {

    /* renamed from: a */
    public int f187121a;

    /* renamed from: b */
    public int f187122b;

    /* renamed from: c */
    public int f187123c;

    /* renamed from: d */
    public long f187124d;

    /* renamed from: e */
    public long f187125e;

    /* renamed from: f */
    public float f187126f = 1.0f;

    /* renamed from: g */
    public final LinkedList<C65004e> f187127g = new LinkedList<>();

    /* renamed from: h */
    public boolean f187128h;

    /* renamed from: i */
    public int f187129i = -1;

    /* renamed from: j */
    public long f187130j;

    /* renamed from: k */
    public int f187131k = 1;

    /* renamed from: l */
    public boolean f187132l;

    /* renamed from: m */
    public boolean f187133m;

    /* renamed from: a */
    public abstract long mo88218a();

    /* renamed from: b */
    public abstract float mo88219b();

    /* renamed from: c */
    public abstract long mo88220c();

    /* renamed from: d */
    public abstract long mo88221d();

    /* renamed from: e */
    public abstract boolean mo88222e();

    /* renamed from: f */
    public final void mo89218f() {
        float f = this.f187126f;
        long j = (long) (((float) (this.f187125e - this.f187124d)) / f);
        int ceil = (int) Math.ceil((double) f);
        this.f187127g.clear();
        int i = j >= 1000 ? 500 : 200;
        for (int i2 = 0; i2 < ceil; i2++) {
            C65004e eVar = new C65004e();
            long j2 = (long) i;
            long c = C60641c.m70922c((double) ((((float) (((((long) i2) * j) + this.f187124d) + (j / ((long) 2)))) * 1.0f) / ((float) i))) * j2;
            eVar.f187134a = c;
            long j3 = this.f187125e;
            if (c >= j3) {
                eVar.f187134a = ((j3 - 1) / j2) * j2;
            }
            this.f187127g.add(eVar);
        }
    }
}
