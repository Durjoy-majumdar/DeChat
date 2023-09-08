package p299c7;

import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16747k;
import p294b7.C16748l;
import p294b7.C16750m;
import p333e8.C20541m;
import p333e8.C20551y;

/* renamed from: c7.b */
public final class C16861b implements C16741e, C16748l {

    /* renamed from: n */
    public static final int f45568n = C20551y.m22316f("FLV");

    /* renamed from: a */
    public final C20541m f45569a = new C20541m(4);

    /* renamed from: b */
    public final C20541m f45570b = new C20541m(9);

    /* renamed from: c */
    public final C20541m f45571c = new C20541m(11);

    /* renamed from: d */
    public final C20541m f45572d = new C20541m();

    /* renamed from: e */
    public C16743g f45573e;

    /* renamed from: f */
    public int f45574f = 1;

    /* renamed from: g */
    public int f45575g;

    /* renamed from: h */
    public int f45576h;

    /* renamed from: i */
    public int f45577i;

    /* renamed from: j */
    public long f45578j;

    /* renamed from: k */
    public C16860a f45579k;

    /* renamed from: l */
    public C16865e f45580l;

    /* renamed from: m */
    public C16862c f45581m;

    /* renamed from: a */
    public int mo17745a(C16742f fVar, C16747k kVar) {
        C16862c cVar;
        C16865e eVar;
        C16860a aVar;
        while (true) {
            int i = this.f45574f;
            boolean z = false;
            boolean z2 = true;
            if (i == 1) {
                if (((C16738b) fVar).mo17737e(this.f45570b.f57809a, 0, 9, true)) {
                    this.f45570b.mo32113x(0);
                    this.f45570b.mo32114y(4);
                    int n = this.f45570b.mo32103n();
                    boolean z3 = (n & 4) != 0;
                    if ((n & 1) != 0) {
                        z = true;
                    }
                    if (z3 && this.f45579k == null) {
                        this.f45579k = new C16860a(this.f45573e.mo17752o(8, 1));
                    }
                    if (z && this.f45580l == null) {
                        this.f45580l = new C16865e(this.f45573e.mo17752o(9, 2));
                    }
                    if (this.f45581m == null) {
                        this.f45581m = new C16862c((C16750m) null);
                    }
                    this.f45573e.mo17751i();
                    this.f45573e.mo17750g(this);
                    this.f45575g = (this.f45570b.mo32092c() - 9) + 4;
                    this.f45574f = 2;
                    z = true;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                ((C16738b) fVar).mo17738f(this.f45575g);
                this.f45575g = 0;
                this.f45574f = 3;
            } else if (i == 3) {
                if (((C16738b) fVar).mo17737e(this.f45571c.f57809a, 0, 11, true)) {
                    this.f45571c.mo32113x(0);
                    this.f45576h = this.f45571c.mo32103n();
                    this.f45577i = this.f45571c.mo32105p();
                    this.f45578j = (long) this.f45571c.mo32105p();
                    this.f45578j = (((long) (this.f45571c.mo32103n() << 24)) | this.f45578j) * 1000;
                    this.f45571c.mo32114y(3);
                    this.f45574f = 4;
                    z = true;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 4) {
                int i2 = this.f45576h;
                if (i2 == 8 && (aVar = this.f45579k) != null) {
                    C20541m i3 = mo17910i(fVar);
                    long j = this.f45578j;
                    aVar.mo17908a(i3);
                    aVar.mo17909b(i3, j);
                } else if (i2 == 9 && (eVar = this.f45580l) != null) {
                    C20541m i4 = mo17910i(fVar);
                    long j2 = this.f45578j;
                    if (eVar.mo17912a(i4)) {
                        eVar.mo17913b(i4, j2);
                    }
                } else if (i2 != 18 || (cVar = this.f45581m) == null) {
                    ((C16738b) fVar).mo17738f(this.f45577i);
                    z2 = false;
                } else {
                    cVar.mo17911a(mo17910i(fVar), this.f45578j);
                }
                this.f45575g = 4;
                this.f45574f = 2;
                if (z2) {
                    return 0;
                }
            } else {
                continue;
            }
        }
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f45574f = 1;
        this.f45575g = 0;
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        ((C16738b) fVar).mo17734b(this.f45569a.f57809a, 0, 3, false);
        this.f45569a.mo32113x(0);
        if (this.f45569a.mo32105p() != f45568n) {
            return false;
        }
        C16738b bVar = (C16738b) fVar;
        bVar.mo17734b(this.f45569a.f57809a, 0, 2, false);
        this.f45569a.mo32113x(0);
        if ((this.f45569a.mo32108s() & 250) != 0) {
            return false;
        }
        bVar.mo17734b(this.f45569a.f57809a, 0, 4, false);
        this.f45569a.mo32113x(0);
        int c = this.f45569a.mo32092c();
        bVar.f45244e = 0;
        bVar.mo17733a(c, false);
        bVar.mo17734b(this.f45569a.f57809a, 0, 4, false);
        this.f45569a.mo32113x(0);
        return this.f45569a.mo32092c() == 0;
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f45573e = gVar;
    }

    /* renamed from: f */
    public boolean mo17730f() {
        return false;
    }

    /* renamed from: g */
    public long mo17731g(long j) {
        return 0;
    }

    /* renamed from: h */
    public long mo17732h() {
        return this.f45581m.f45582b;
    }

    /* renamed from: i */
    public final C20541m mo17910i(C16742f fVar) {
        if (this.f45577i > this.f45572d.mo32090a()) {
            C20541m mVar = this.f45572d;
            mVar.mo32111v(new byte[Math.max(mVar.mo32090a() * 2, this.f45577i)], 0);
        } else {
            this.f45572d.mo32113x(0);
        }
        this.f45572d.mo32112w(this.f45577i);
        ((C16738b) fVar).mo17737e(this.f45572d.f57809a, 0, this.f45577i, false);
        return this.f45572d;
    }

    public void release() {
    }
}
