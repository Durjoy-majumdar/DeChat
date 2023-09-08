package p370p7;

import java.util.ArrayList;
import p300c8.C16870b;
import p333e8.C20528a;
import p370p7.C21949o;
import p396x6.C22994b;
import p396x6.C22998f;
import p396x6.C23027v;

/* renamed from: p7.h */
public final class C21930h implements C21949o, C21949o.C21950a {

    /* renamed from: d */
    public final C21949o f62039d;

    /* renamed from: e */
    public final long f62040e;

    /* renamed from: f */
    public final long f62041f;

    /* renamed from: g */
    public final boolean f62042g;

    /* renamed from: h */
    public final ArrayList<C21928g> f62043h;

    /* renamed from: i */
    public C21949o.C21950a f62044i;

    /* renamed from: j */
    public C21931a f62045j;

    /* renamed from: p7.h$a */
    public static final class C21931a extends C23027v {

        /* renamed from: b */
        public final C23027v f62046b;

        /* renamed from: c */
        public final long f62047c;

        /* renamed from: d */
        public final long f62048d;

        public C21931a(C23027v vVar, long j, long j2) {
            boolean z = true;
            C20528a.m22237a(vVar.mo35006j() == 1);
            C20528a.m22237a(vVar.mo35005f() == 1);
            C23027v.C23030c h = vVar.mo36344h(0, new C23027v.C23030c(), false);
            C20528a.m22237a(!h.f66221e);
            j2 = j2 == Long.MIN_VALUE ? h.f66225i : j2;
            long j3 = h.f66225i;
            if (j3 != -9223372036854775807L) {
                j2 = j2 > j3 ? j3 : j2;
                C20528a.m22237a(j == 0 || h.f66220d);
                C20528a.m22237a(j <= j2);
            }
            C20528a.m22237a(vVar.mo34969e(0, new C23027v.C23029b(), false).f66210e != 0 ? false : z);
            this.f62046b = vVar;
            this.f62047c = j;
            this.f62048d = j2;
        }

        /* renamed from: a */
        public int mo34967a(Object obj) {
            return this.f62046b.mo34967a(obj);
        }

        /* renamed from: c */
        public int mo34968c(int i, int i2) {
            return this.f62046b.mo34968c(i, i2);
        }

        /* renamed from: e */
        public C23027v.C23029b mo34969e(int i, C23027v.C23029b bVar, boolean z) {
            C23027v.C23029b e = this.f62046b.mo34969e(0, bVar, z);
            long j = this.f62048d;
            long j2 = -9223372036854775807L;
            if (j != -9223372036854775807L) {
                j2 = j - this.f62047c;
            }
            e.f66209d = j2;
            return e;
        }

        /* renamed from: f */
        public int mo35005f() {
            return 1;
        }

        /* renamed from: i */
        public C23027v.C23030c mo34970i(int i, C23027v.C23030c cVar, boolean z, long j) {
            C23027v.C23030c i2 = this.f62046b.mo34970i(0, cVar, z, j);
            long j2 = this.f62048d;
            i2.f66225i = j2 != -9223372036854775807L ? j2 - this.f62047c : -9223372036854775807L;
            long j3 = i2.f66224h;
            if (j3 != -9223372036854775807L) {
                long max = Math.max(j3, this.f62047c);
                i2.f66224h = max;
                long j4 = this.f62048d;
                if (j4 != -9223372036854775807L) {
                    max = Math.min(max, j4);
                }
                i2.f66224h = max - this.f62047c;
            }
            long b = C22994b.m27204b(this.f62047c);
            long j5 = i2.f66218b;
            if (j5 != -9223372036854775807L) {
                i2.f66218b = j5 + b;
            }
            long j6 = i2.f66219c;
            if (j6 != -9223372036854775807L) {
                i2.f66219c = j6 + b;
            }
            return i2;
        }

        /* renamed from: j */
        public int mo35006j() {
            return 1;
        }
    }

    public C21930h(C21949o oVar, long j, long j2) {
        C20528a.m22237a(j >= 0);
        oVar.getClass();
        this.f62039d = oVar;
        this.f62040e = j;
        this.f62041f = j2;
        this.f62042g = true;
        this.f62043h = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo34999a(C21947n nVar) {
        C20528a.m22240d(this.f62043h.remove(nVar));
        this.f62039d.mo34999a(((C21928g) nVar).f62027d);
    }

    /* renamed from: b */
    public void mo35000b() {
        this.f62039d.mo35000b();
    }

    /* renamed from: c */
    public void mo35001c(C23027v vVar, Object obj) {
        C21931a aVar = new C21931a(vVar, this.f62040e, this.f62041f);
        this.f62045j = aVar;
        this.f62044i.mo35001c(aVar, obj);
        C21931a aVar2 = this.f62045j;
        long j = aVar2.f62047c;
        long j2 = aVar2.f62048d;
        if (j2 == -9223372036854775807L) {
            j2 = Long.MIN_VALUE;
        }
        int size = this.f62043h.size();
        for (int i = 0; i < size; i++) {
            C21928g gVar = this.f62043h.get(i);
            gVar.f62029f = j;
            gVar.f62030g = j2;
        }
    }

    /* renamed from: d */
    public C21947n mo35002d(C21949o.C21951b bVar, C16870b bVar2) {
        C21928g gVar = new C21928g(this.f62039d.mo35002d(bVar, bVar2), this.f62042g);
        this.f62043h.add(gVar);
        C21931a aVar = this.f62045j;
        long j = aVar.f62047c;
        long j2 = aVar.f62048d;
        gVar.f62029f = j;
        gVar.f62030g = j2;
        return gVar;
    }

    /* renamed from: e */
    public void mo35003e(C22998f fVar, boolean z, C21949o.C21950a aVar) {
        this.f62044i = aVar;
        this.f62039d.mo35003e(fVar, false, this);
    }

    /* renamed from: f */
    public void mo35004f() {
        this.f62039d.mo35004f();
    }
}
