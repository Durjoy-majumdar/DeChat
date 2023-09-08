package qz3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xz3.C23156c;
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

/* renamed from: qz3.t */
public final class C26079t extends C26593h implements C26609q {

    /* renamed from: j */
    public static final C26079t f72866j;

    /* renamed from: n */
    public static C26610r<C26079t> f72867n = new C26080a();

    /* renamed from: d */
    public final C23156c f72868d;

    /* renamed from: e */
    public int f72869e;

    /* renamed from: f */
    public List<C26065q> f72870f;

    /* renamed from: g */
    public int f72871g;

    /* renamed from: h */
    public byte f72872h;

    /* renamed from: i */
    public int f72873i;

    /* renamed from: qz3.t$a */
    public static class C26080a extends C26585b<C26079t> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26079t(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.t$b */
    public static final class C26081b extends C26593h.C26595b<C26079t, C26081b> implements C26609q {

        /* renamed from: e */
        public int f72874e;

        /* renamed from: f */
        public List<C26065q> f72875f = Collections.emptyList();

        /* renamed from: g */
        public int f72876g = -1;

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52938g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52938g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26079t e = mo52936e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26081b bVar = new C26081b();
            bVar.mo52937f(mo52936e());
            return bVar;
        }

        public Object clone() {
            C26081b bVar = new C26081b();
            bVar.mo52937f(mo52936e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52937f((C26079t) hVar);
            return this;
        }

        /* renamed from: e */
        public C26079t mo52936e() {
            C26079t tVar = new C26079t(this, (C26008a) null);
            int i = this.f72874e;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f72875f = Collections.unmodifiableList(this.f72875f);
                this.f72874e &= -2;
            }
            tVar.f72870f = this.f72875f;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            tVar.f72871g = this.f72876g;
            tVar.f72869e = i2;
            return tVar;
        }

        /* renamed from: f */
        public C26081b mo52937f(C26079t tVar) {
            if (tVar == C26079t.f72866j) {
                return this;
            }
            boolean z = true;
            if (!tVar.f72870f.isEmpty()) {
                if (this.f72875f.isEmpty()) {
                    this.f72875f = tVar.f72870f;
                    this.f72874e &= -2;
                } else {
                    if ((this.f72874e & 1) != 1) {
                        this.f72875f = new ArrayList(this.f72875f);
                        this.f72874e |= 1;
                    }
                    this.f72875f.addAll(tVar.f72870f);
                }
            }
            if ((tVar.f72869e & 1) != 1) {
                z = false;
            }
            if (z) {
                int i = tVar.f72871g;
                this.f72874e |= 2;
                this.f72876g = i;
            }
            this.f74007d = this.f74007d.mo36541h(tVar.f72868d);
            return this;
        }

        /* renamed from: g */
        public C26081b mo52938g(C26586d dVar, C26589f fVar) {
            C26079t tVar;
            C26079t tVar2 = null;
            try {
                C26079t tVar3 = (C26079t) ((C26080a) C26079t.f72867n).mo52860a(dVar, fVar);
                if (tVar3 != null) {
                    mo52937f(tVar3);
                }
                return this;
            } catch (C26601j e) {
                tVar = (C26079t) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                mo52937f(tVar2);
            }
            throw th;
        }
    }

    static {
        C26079t tVar = new C26079t(true);
        f72866j = tVar;
        tVar.f72870f = Collections.emptyList();
        tVar.f72871g = -1;
    }

    public C26079t(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72872h = -1;
        this.f72873i = -1;
        this.f72868d = bVar.f74007d;
    }

    /* renamed from: d */
    public static C26081b m33383d(C26079t tVar) {
        C26081b bVar = new C26081b();
        bVar.mo52937f(tVar);
        return bVar;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        for (int i = 0; i < this.f72870f.size(); i++) {
            eVar.mo53541o(1, this.f72870f.get(i));
        }
        if ((this.f72869e & 1) == 1) {
            eVar.mo53539m(2, this.f72871g);
        }
        eVar.mo53544r(this.f72868d);
    }

    /* renamed from: e */
    public C26081b mo52935e() {
        return m33383d(this);
    }

    public int getSerializedSize() {
        int i = this.f72873i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f72870f.size(); i3++) {
            i2 += C26587e.m34407d(1, this.f72870f.get(i3));
        }
        if ((this.f72869e & 1) == 1) {
            i2 += C26587e.m34405b(2, this.f72871g);
        }
        int size = i2 + this.f72868d.size();
        this.f72873i = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72872h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72870f.size(); i++) {
            if (!this.f72870f.get(i).isInitialized()) {
                this.f72872h = 0;
                return false;
            }
        }
        this.f72872h = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26081b();
    }

    public C26607p.C26608a toBuilder() {
        return m33383d(this);
    }

    public C26079t(boolean z) {
        this.f72872h = -1;
        this.f72873i = -1;
        this.f72868d = C23156c.f66530d;
    }

    public C26079t(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72872h = -1;
        this.f72873i = -1;
        this.f72870f = Collections.emptyList();
        this.f72871g = -1;
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
                            this.f72870f = new ArrayList();
                            z2 |= true;
                        }
                        this.f72870f.add(dVar.mo53523g(C26065q.f72762A, fVar));
                    } else if (n == 16) {
                        this.f72869e |= 1;
                        this.f72871g = dVar.mo53527k();
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
                    this.f72870f = Collections.unmodifiableList(this.f72870f);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72868d = p.mo36559c();
                    throw th4;
                }
                this.f72868d = p.mo36559c();
                throw th;
            }
        }
        if (z2 && true) {
            this.f72870f = Collections.unmodifiableList(this.f72870f);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72868d = p.mo36559c();
            throw th5;
        }
        this.f72868d = p.mo36559c();
    }
}
