package qz3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xz3.C23156c;
import xz3.C23159i;
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

/* renamed from: qz3.o */
public final class C26055o extends C26593h implements C26609q {

    /* renamed from: h */
    public static final C26055o f72728h;

    /* renamed from: i */
    public static C26610r<C26055o> f72729i = new C26056a();

    /* renamed from: d */
    public final C23156c f72730d;

    /* renamed from: e */
    public List<C26058c> f72731e;

    /* renamed from: f */
    public byte f72732f;

    /* renamed from: g */
    public int f72733g;

    /* renamed from: qz3.o$a */
    public static class C26056a extends C26585b<C26055o> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26055o(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.o$b */
    public static final class C26057b extends C26593h.C26595b<C26055o, C26057b> implements C26609q {

        /* renamed from: e */
        public int f72734e;

        /* renamed from: f */
        public List<C26058c> f72735f = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52912g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52912g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26055o e = mo52910e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26057b bVar = new C26057b();
            bVar.mo52911f(mo52910e());
            return bVar;
        }

        public Object clone() {
            C26057b bVar = new C26057b();
            bVar.mo52911f(mo52910e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52911f((C26055o) hVar);
            return this;
        }

        /* renamed from: e */
        public C26055o mo52910e() {
            C26055o oVar = new C26055o(this, (C26008a) null);
            if ((this.f72734e & 1) == 1) {
                this.f72735f = Collections.unmodifiableList(this.f72735f);
                this.f72734e &= -2;
            }
            oVar.f72731e = this.f72735f;
            return oVar;
        }

        /* renamed from: f */
        public C26057b mo52911f(C26055o oVar) {
            if (oVar == C26055o.f72728h) {
                return this;
            }
            if (!oVar.f72731e.isEmpty()) {
                if (this.f72735f.isEmpty()) {
                    this.f72735f = oVar.f72731e;
                    this.f72734e &= -2;
                } else {
                    if ((this.f72734e & 1) != 1) {
                        this.f72735f = new ArrayList(this.f72735f);
                        this.f72734e |= 1;
                    }
                    this.f72735f.addAll(oVar.f72731e);
                }
            }
            this.f74007d = this.f74007d.mo36541h(oVar.f72730d);
            return this;
        }

        /* renamed from: g */
        public C26057b mo52912g(C26586d dVar, C26589f fVar) {
            C26055o oVar;
            C26055o oVar2 = null;
            try {
                C26055o oVar3 = (C26055o) ((C26056a) C26055o.f72729i).mo52860a(dVar, fVar);
                if (oVar3 != null) {
                    mo52911f(oVar3);
                }
                return this;
            } catch (C26601j e) {
                oVar = (C26055o) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                mo52911f(oVar2);
            }
            throw th;
        }
    }

    static {
        C26055o oVar = new C26055o(true);
        f72728h = oVar;
        oVar.f72731e = Collections.emptyList();
    }

    public C26055o(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72732f = -1;
        this.f72733g = -1;
        this.f72730d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        for (int i = 0; i < this.f72731e.size(); i++) {
            eVar.mo53541o(1, this.f72731e.get(i));
        }
        eVar.mo53544r(this.f72730d);
    }

    public int getSerializedSize() {
        int i = this.f72733g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f72731e.size(); i3++) {
            i2 += C26587e.m34407d(1, this.f72731e.get(i3));
        }
        int size = i2 + this.f72730d.size();
        this.f72733g = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72732f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72731e.size(); i++) {
            if (!this.f72731e.get(i).isInitialized()) {
                this.f72732f = 0;
                return false;
            }
        }
        this.f72732f = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26057b();
    }

    public C26607p.C26608a toBuilder() {
        C26057b bVar = new C26057b();
        bVar.mo52911f(this);
        return bVar;
    }

    /* renamed from: qz3.o$c */
    public static final class C26058c extends C26593h implements C26609q {

        /* renamed from: n */
        public static final C26058c f72736n;

        /* renamed from: o */
        public static C26610r<C26058c> f72737o = new C26059a();

        /* renamed from: d */
        public final C23156c f72738d;

        /* renamed from: e */
        public int f72739e;

        /* renamed from: f */
        public int f72740f;

        /* renamed from: g */
        public int f72741g;

        /* renamed from: h */
        public C26061c f72742h;

        /* renamed from: i */
        public byte f72743i;

        /* renamed from: j */
        public int f72744j;

        /* renamed from: qz3.o$c$a */
        public static class C26059a extends C26585b<C26058c> {
            /* renamed from: a */
            public Object mo52860a(C26586d dVar, C26589f fVar) {
                return new C26058c(dVar, fVar, (C26008a) null);
            }
        }

        /* renamed from: qz3.o$c$b */
        public static final class C26060b extends C26593h.C26595b<C26058c, C26060b> implements C26609q {

            /* renamed from: e */
            public int f72745e;

            /* renamed from: f */
            public int f72746f = -1;

            /* renamed from: g */
            public int f72747g;

            /* renamed from: h */
            public C26061c f72748h = C26061c.PACKAGE;

            /* renamed from: M */
            public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
                mo52915g(dVar, fVar);
                return this;
            }

            /* renamed from: b */
            public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
                mo52915g(dVar, fVar);
                return this;
            }

            public C26607p build() {
                C26058c e = mo52913e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new C26611v(e);
            }

            /* renamed from: c */
            public C26593h.C26595b mo52864c() {
                C26060b bVar = new C26060b();
                bVar.mo52914f(mo52913e());
                return bVar;
            }

            public Object clone() {
                C26060b bVar = new C26060b();
                bVar.mo52914f(mo52913e());
                return bVar;
            }

            /* renamed from: d */
            public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
                mo52914f((C26058c) hVar);
                return this;
            }

            /* renamed from: e */
            public C26058c mo52913e() {
                C26058c cVar = new C26058c(this, (C26008a) null);
                int i = this.f72745e;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f72740f = this.f72746f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.f72741g = this.f72747g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.f72742h = this.f72748h;
                cVar.f72739e = i2;
                return cVar;
            }

            /* renamed from: f */
            public C26060b mo52914f(C26058c cVar) {
                if (cVar == C26058c.f72736n) {
                    return this;
                }
                int i = cVar.f72739e;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = cVar.f72740f;
                    this.f72745e |= 1;
                    this.f72746f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = cVar.f72741g;
                    this.f72745e = 2 | this.f72745e;
                    this.f72747g = i3;
                }
                if ((i & 4) == 4) {
                    z = true;
                }
                if (z) {
                    C26061c cVar2 = cVar.f72742h;
                    cVar2.getClass();
                    this.f72745e = 4 | this.f72745e;
                    this.f72748h = cVar2;
                }
                this.f74007d = this.f74007d.mo36541h(cVar.f72738d);
                return this;
            }

            /* renamed from: g */
            public C26060b mo52915g(C26586d dVar, C26589f fVar) {
                C26058c cVar;
                C26058c cVar2 = null;
                try {
                    C26058c cVar3 = (C26058c) ((C26059a) C26058c.f72737o).mo52860a(dVar, fVar);
                    if (cVar3 != null) {
                        mo52914f(cVar3);
                    }
                    return this;
                } catch (C26601j e) {
                    cVar = (C26058c) e.f74023d;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    mo52914f(cVar2);
                }
                throw th;
            }
        }

        /* renamed from: qz3.o$c$c */
        public enum C26061c implements C23159i.C23160a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: d */
            public final int f72753d;

            /* access modifiers changed from: public */
            C26061c(int i, int i2) {
                this.f72753d = i2;
            }

            public final int getNumber() {
                return this.f72753d;
            }
        }

        static {
            C26058c cVar = new C26058c(true);
            f72736n = cVar;
            cVar.f72740f = -1;
            cVar.f72741g = 0;
            cVar.f72742h = C26061c.PACKAGE;
        }

        public C26058c(C26593h.C26595b bVar, C26008a aVar) {
            super(bVar);
            this.f72743i = -1;
            this.f72744j = -1;
            this.f72738d = bVar.f74007d;
        }

        /* renamed from: a */
        public void mo52855a(C26587e eVar) {
            getSerializedSize();
            if ((this.f72739e & 1) == 1) {
                eVar.mo53539m(1, this.f72740f);
            }
            if ((this.f72739e & 2) == 2) {
                eVar.mo53539m(2, this.f72741g);
            }
            if ((this.f72739e & 4) == 4) {
                eVar.mo53538l(3, this.f72742h.f72753d);
            }
            eVar.mo53544r(this.f72738d);
        }

        public int getSerializedSize() {
            int i = this.f72744j;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f72739e & 1) == 1) {
                i2 = 0 + C26587e.m34405b(1, this.f72740f);
            }
            if ((this.f72739e & 2) == 2) {
                i2 += C26587e.m34405b(2, this.f72741g);
            }
            if ((this.f72739e & 4) == 4) {
                i2 += C26587e.m34404a(3, this.f72742h.f72753d);
            }
            int size = i2 + this.f72738d.size();
            this.f72744j = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b = this.f72743i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f72739e & 2) == 2)) {
                this.f72743i = 0;
                return false;
            }
            this.f72743i = 1;
            return true;
        }

        public C26607p.C26608a newBuilderForType() {
            return new C26060b();
        }

        public C26607p.C26608a toBuilder() {
            C26060b bVar = new C26060b();
            bVar.mo52914f(this);
            return bVar;
        }

        public C26058c(boolean z) {
            this.f72743i = -1;
            this.f72744j = -1;
            this.f72738d = C23156c.f66530d;
        }

        public C26058c(C26586d dVar, C26589f fVar, C26008a aVar) {
            C26061c cVar;
            C26061c cVar2 = C26061c.PACKAGE;
            this.f72743i = -1;
            this.f72744j = -1;
            this.f72740f = -1;
            boolean z = false;
            this.f72741g = 0;
            this.f72742h = cVar2;
            C23156c.C23158b p = C23156c.m27503p();
            C26587e j = C26587e.m34412j(p, 1);
            while (!z) {
                try {
                    int n = dVar.mo53530n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f72739e |= 1;
                            this.f72740f = dVar.mo53527k();
                        } else if (n == 16) {
                            this.f72739e |= 2;
                            this.f72741g = dVar.mo53527k();
                        } else if (n == 24) {
                            int k = dVar.mo53527k();
                            if (k == 0) {
                                cVar = C26061c.CLASS;
                            } else if (k != 1) {
                                cVar = k != 2 ? null : C26061c.LOCAL;
                            } else {
                                cVar = cVar2;
                            }
                            if (cVar == null) {
                                j.mo53548v(n);
                                j.mo53548v(k);
                            } else {
                                this.f72739e |= 4;
                                this.f72742h = cVar;
                            }
                        } else if (!dVar.mo53533q(n, j)) {
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
                        this.f72738d = p.mo36559c();
                        throw th4;
                    }
                    this.f72738d = p.mo36559c();
                    throw th;
                }
            }
            try {
                j.mo53536i();
            } catch (IOException unused2) {
            } catch (Throwable th5) {
                this.f72738d = p.mo36559c();
                throw th5;
            }
            this.f72738d = p.mo36559c();
        }
    }

    public C26055o(boolean z) {
        this.f72732f = -1;
        this.f72733g = -1;
        this.f72730d = C23156c.f66530d;
    }

    public C26055o(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72732f = -1;
        this.f72733g = -1;
        this.f72731e = Collections.emptyList();
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 10) {
                        if (!z2 || !true) {
                            this.f72731e = new ArrayList();
                            z2 |= true;
                        }
                        this.f72731e.add(dVar.mo53523g(C26058c.f72737o, fVar));
                    } else if (!dVar.mo53533q(n, j)) {
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
                if (z2 && true) {
                    this.f72731e = Collections.unmodifiableList(this.f72731e);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72730d = p.mo36559c();
                    throw th4;
                }
                this.f72730d = p.mo36559c();
                throw th;
            }
        }
        if (z2 && true) {
            this.f72731e = Collections.unmodifiableList(this.f72731e);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72730d = p.mo36559c();
            throw th5;
        }
        this.f72730d = p.mo36559c();
    }
}
