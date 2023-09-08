package qz3;

import java.io.IOException;
import xz3.C23156c;
import xz3.C26583a;
import xz3.C26585b;
import xz3.C26586d;
import xz3.C26587e;
import xz3.C26589f;
import xz3.C26593h;
import xz3.C26601j;
import xz3.C26607p;
import xz3.C26610r;
import xz3.C26611v;

/* renamed from: qz3.g */
public final class C26034g extends C26593h.C26597d<C26034g> {

    /* renamed from: j */
    public static final C26034g f72585j;

    /* renamed from: n */
    public static C26610r<C26034g> f72586n = new C26035a();

    /* renamed from: e */
    public final C23156c f72587e;

    /* renamed from: f */
    public int f72588f;

    /* renamed from: g */
    public int f72589g;

    /* renamed from: h */
    public byte f72590h;

    /* renamed from: i */
    public int f72591i;

    /* renamed from: qz3.g$a */
    public static class C26035a extends C26585b<C26034g> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26034g(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.g$b */
    public static final class C26036b extends C26593h.C26596c<C26034g, C26036b> {

        /* renamed from: g */
        public int f72592g;

        /* renamed from: h */
        public int f72593h;

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52892g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52892g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26034g gVar = new C26034g(this, (C26008a) null);
            int i = 1;
            if ((this.f72592g & 1) != 1) {
                i = 0;
            }
            gVar.f72589g = this.f72593h;
            gVar.f72588f = i;
            if (gVar.isInitialized()) {
                return gVar;
            }
            throw new C26611v(gVar);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26036b bVar = new C26036b();
            C26034g gVar = new C26034g(this, (C26008a) null);
            int i = 1;
            if ((this.f72592g & 1) != 1) {
                i = 0;
            }
            gVar.f72589g = this.f72593h;
            gVar.f72588f = i;
            bVar.mo52891f(gVar);
            return bVar;
        }

        public Object clone() {
            C26036b bVar = new C26036b();
            C26034g gVar = new C26034g(this, (C26008a) null);
            int i = 1;
            if ((this.f72592g & 1) != 1) {
                i = 0;
            }
            gVar.f72589g = this.f72593h;
            gVar.f72588f = i;
            bVar.mo52891f(gVar);
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52891f((C26034g) hVar);
            return this;
        }

        /* renamed from: f */
        public C26036b mo52891f(C26034g gVar) {
            if (gVar == C26034g.f72585j) {
                return this;
            }
            if ((gVar.f72588f & 1) == 1) {
                int i = gVar.f72589g;
                this.f72592g = 1 | this.f72592g;
                this.f72593h = i;
            }
            mo53568e(gVar);
            this.f74007d = this.f74007d.mo36541h(gVar.f72587e);
            return this;
        }

        /* renamed from: g */
        public C26036b mo52892g(C26586d dVar, C26589f fVar) {
            C26034g gVar;
            C26034g gVar2 = null;
            try {
                C26034g gVar3 = (C26034g) ((C26035a) C26034g.f72586n).mo52860a(dVar, fVar);
                if (gVar3 != null) {
                    mo52891f(gVar3);
                }
                return this;
            } catch (C26601j e) {
                gVar = (C26034g) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                gVar2 = gVar;
            }
            if (gVar2 != null) {
                mo52891f(gVar2);
            }
            throw th;
        }
    }

    static {
        C26034g gVar = new C26034g(true);
        f72585j = gVar;
        gVar.f72589g = 0;
    }

    public C26034g(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72590h = -1;
        this.f72591i = -1;
        this.f72587e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72588f & 1) == 1) {
            eVar.mo53539m(1, this.f72589g);
        }
        i.mo53577a(200, eVar);
        eVar.mo53544r(this.f72587e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72585j;
    }

    public int getSerializedSize() {
        int i = this.f72591i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f72588f & 1) == 1) {
            i2 = 0 + C26587e.m34405b(1, this.f72589g);
        }
        int e = i2 + mo53570e() + this.f72587e.size();
        this.f72591i = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72590h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo53569d()) {
            this.f72590h = 0;
            return false;
        }
        this.f72590h = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26036b();
    }

    public C26607p.C26608a toBuilder() {
        C26036b bVar = new C26036b();
        bVar.mo52891f(this);
        return bVar;
    }

    public C26034g(boolean z) {
        this.f72590h = -1;
        this.f72591i = -1;
        this.f72587e = C23156c.f66530d;
    }

    public C26034g(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72590h = -1;
        this.f72591i = -1;
        boolean z = false;
        this.f72589g = 0;
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 8) {
                        this.f72588f |= 1;
                        this.f72589g = dVar.mo53527k();
                    } else if (!mo53575j(dVar, j, fVar, n)) {
                    }
                }
                z = true;
            } catch (C26601j e) {
                e.f74023d = this;
                throw e;
            } catch (IOException e2) {
                C26601j jVar = new C26601j(e2.getMessage());
                jVar.f74023d = this;
                throw jVar;
            } catch (Throwable th) {
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72587e = p.mo36559c();
                    throw th4;
                }
                this.f72587e = p.mo36559c();
                mo53573h();
                throw th;
            }
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72587e = p.mo36559c();
            throw th5;
        }
        this.f72587e = p.mo36559c();
        mo53573h();
    }
}
