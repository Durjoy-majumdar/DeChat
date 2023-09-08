package qz3;

import java.io.IOException;
import xz3.C112188n;
import xz3.C23156c;
import xz3.C23162m;
import xz3.C26583a;
import xz3.C26585b;
import xz3.C26586d;
import xz3.C26587e;
import xz3.C26589f;
import xz3.C26593h;
import xz3.C26601j;
import xz3.C26607p;
import xz3.C26609q;
import xz3.C26610r;
import xz3.C26611v;

/* renamed from: qz3.p */
public final class C26062p extends C26593h implements C26609q {

    /* renamed from: h */
    public static final C26062p f72754h;

    /* renamed from: i */
    public static C26610r<C26062p> f72755i = new C26063a();

    /* renamed from: d */
    public final C23156c f72756d;

    /* renamed from: e */
    public C112188n f72757e;

    /* renamed from: f */
    public byte f72758f;

    /* renamed from: g */
    public int f72759g;

    /* renamed from: qz3.p$a */
    public static class C26063a extends C26585b<C26062p> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26062p(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.p$b */
    public static final class C26064b extends C26593h.C26595b<C26062p, C26064b> implements C26609q {

        /* renamed from: e */
        public int f72760e;

        /* renamed from: f */
        public C112188n f72761f = C23162m.f66538e;

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52918g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52918g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26062p e = mo52916e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26064b bVar = new C26064b();
            bVar.mo52917f(mo52916e());
            return bVar;
        }

        public Object clone() {
            C26064b bVar = new C26064b();
            bVar.mo52917f(mo52916e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52917f((C26062p) hVar);
            return this;
        }

        /* renamed from: e */
        public C26062p mo52916e() {
            C26062p pVar = new C26062p(this, (C26008a) null);
            if ((this.f72760e & 1) == 1) {
                this.f72761f = this.f72761f.mo36566a();
                this.f72760e &= -2;
            }
            pVar.f72757e = this.f72761f;
            return pVar;
        }

        /* renamed from: f */
        public C26064b mo52917f(C26062p pVar) {
            if (pVar == C26062p.f72754h) {
                return this;
            }
            if (!pVar.f72757e.isEmpty()) {
                if (this.f72761f.isEmpty()) {
                    this.f72761f = pVar.f72757e;
                    this.f72760e &= -2;
                } else {
                    if ((this.f72760e & 1) != 1) {
                        this.f72761f = new C23162m(this.f72761f);
                        this.f72760e |= 1;
                    }
                    this.f72761f.addAll(pVar.f72757e);
                }
            }
            this.f74007d = this.f74007d.mo36541h(pVar.f72756d);
            return this;
        }

        /* renamed from: g */
        public C26064b mo52918g(C26586d dVar, C26589f fVar) {
            C26062p pVar;
            C26062p pVar2 = null;
            try {
                C26062p pVar3 = (C26062p) ((C26063a) C26062p.f72755i).mo52860a(dVar, fVar);
                if (pVar3 != null) {
                    mo52917f(pVar3);
                }
                return this;
            } catch (C26601j e) {
                pVar = (C26062p) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                mo52917f(pVar2);
            }
            throw th;
        }
    }

    static {
        C26062p pVar = new C26062p(true);
        f72754h = pVar;
        pVar.f72757e = C23162m.f66538e;
    }

    public C26062p(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72758f = -1;
        this.f72759g = -1;
        this.f72756d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        for (int i = 0; i < this.f72757e.size(); i++) {
            C23156c e = this.f72757e.mo36572e(i);
            eVar.mo53550x(1, 2);
            eVar.mo53548v(e.size());
            eVar.mo53544r(e);
        }
        eVar.mo53544r(this.f72756d);
    }

    public int getSerializedSize() {
        int i = this.f72759g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f72757e.size(); i3++) {
            C23156c e = this.f72757e.mo36572e(i3);
            i2 += C26587e.m34409f(e.size()) + e.size();
        }
        int size = 0 + i2 + (this.f72757e.size() * 1) + this.f72756d.size();
        this.f72759g = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72758f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f72758f = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26064b();
    }

    public C26607p.C26608a toBuilder() {
        C26064b bVar = new C26064b();
        bVar.mo52917f(this);
        return bVar;
    }

    public C26062p(boolean z) {
        this.f72758f = -1;
        this.f72759g = -1;
        this.f72756d = C23156c.f66530d;
    }

    public C26062p(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72758f = -1;
        this.f72759g = -1;
        this.f72757e = C23162m.f66538e;
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 10) {
                        C23156c e = dVar.mo53521e();
                        if (!z2 || !true) {
                            this.f72757e = new C23162m();
                            z2 |= true;
                        }
                        this.f72757e.mo36565B(e);
                    } else if (!dVar.mo53533q(n, j)) {
                    }
                }
                z = true;
            } catch (C26601j e2) {
                e2.f74023d = this;
                throw e2;
            } catch (IOException e3) {
                C26601j jVar = new C26601j(e3.getMessage());
                jVar.f74023d = this;
                throw jVar;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.f72757e = this.f72757e.mo36566a();
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72756d = p.mo36559c();
                    throw th4;
                }
                this.f72756d = p.mo36559c();
                throw th;
            }
        }
        if (z2 && true) {
            this.f72757e = this.f72757e.mo36566a();
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72756d = p.mo36559c();
            throw th5;
        }
        this.f72756d = p.mo36559c();
    }
}
