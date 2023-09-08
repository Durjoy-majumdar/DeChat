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

/* renamed from: qz3.e */
public final class C26026e extends C26593h implements C26609q {

    /* renamed from: h */
    public static final C26026e f72552h;

    /* renamed from: i */
    public static C26610r<C26026e> f72553i = new C26027a();

    /* renamed from: d */
    public final C23156c f72554d;

    /* renamed from: e */
    public List<C26029f> f72555e;

    /* renamed from: f */
    public byte f72556f;

    /* renamed from: g */
    public int f72557g;

    /* renamed from: qz3.e$a */
    public static class C26027a extends C26585b<C26026e> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26026e(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.e$b */
    public static final class C26028b extends C26593h.C26595b<C26026e, C26028b> implements C26609q {

        /* renamed from: e */
        public int f72558e;

        /* renamed from: f */
        public List<C26029f> f72559f = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52887g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52887g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26026e e = mo52885e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26028b bVar = new C26028b();
            bVar.mo52886f(mo52885e());
            return bVar;
        }

        public Object clone() {
            C26028b bVar = new C26028b();
            bVar.mo52886f(mo52885e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52886f((C26026e) hVar);
            return this;
        }

        /* renamed from: e */
        public C26026e mo52885e() {
            C26026e eVar = new C26026e(this, (C26008a) null);
            if ((this.f72558e & 1) == 1) {
                this.f72559f = Collections.unmodifiableList(this.f72559f);
                this.f72558e &= -2;
            }
            eVar.f72555e = this.f72559f;
            return eVar;
        }

        /* renamed from: f */
        public C26028b mo52886f(C26026e eVar) {
            if (eVar == C26026e.f72552h) {
                return this;
            }
            if (!eVar.f72555e.isEmpty()) {
                if (this.f72559f.isEmpty()) {
                    this.f72559f = eVar.f72555e;
                    this.f72558e &= -2;
                } else {
                    if ((this.f72558e & 1) != 1) {
                        this.f72559f = new ArrayList(this.f72559f);
                        this.f72558e |= 1;
                    }
                    this.f72559f.addAll(eVar.f72555e);
                }
            }
            this.f74007d = this.f74007d.mo36541h(eVar.f72554d);
            return this;
        }

        /* renamed from: g */
        public C26028b mo52887g(C26586d dVar, C26589f fVar) {
            C26026e eVar;
            C26026e eVar2 = null;
            try {
                C26026e eVar3 = (C26026e) ((C26027a) C26026e.f72553i).mo52860a(dVar, fVar);
                if (eVar3 != null) {
                    mo52886f(eVar3);
                }
                return this;
            } catch (C26601j e) {
                eVar = (C26026e) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                eVar2 = eVar;
            }
            if (eVar2 != null) {
                mo52886f(eVar2);
            }
            throw th;
        }
    }

    static {
        C26026e eVar = new C26026e(true);
        f72552h = eVar;
        eVar.f72555e = Collections.emptyList();
    }

    public C26026e(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72556f = -1;
        this.f72557g = -1;
        this.f72554d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        for (int i = 0; i < this.f72555e.size(); i++) {
            eVar.mo53541o(1, this.f72555e.get(i));
        }
        eVar.mo53544r(this.f72554d);
    }

    public int getSerializedSize() {
        int i = this.f72557g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f72555e.size(); i3++) {
            i2 += C26587e.m34407d(1, this.f72555e.get(i3));
        }
        int size = i2 + this.f72554d.size();
        this.f72557g = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72556f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72555e.size(); i++) {
            if (!this.f72555e.get(i).isInitialized()) {
                this.f72556f = 0;
                return false;
            }
        }
        this.f72556f = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26028b();
    }

    public C26607p.C26608a toBuilder() {
        C26028b bVar = new C26028b();
        bVar.mo52886f(this);
        return bVar;
    }

    public C26026e(boolean z) {
        this.f72556f = -1;
        this.f72557g = -1;
        this.f72554d = C23156c.f66530d;
    }

    public C26026e(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72556f = -1;
        this.f72557g = -1;
        this.f72555e = Collections.emptyList();
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
                            this.f72555e = new ArrayList();
                            z2 |= true;
                        }
                        this.f72555e.add(dVar.mo53523g(C26029f.f72561p, fVar));
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
                    this.f72555e = Collections.unmodifiableList(this.f72555e);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72554d = p.mo36559c();
                    throw th4;
                }
                this.f72554d = p.mo36559c();
                throw th;
            }
        }
        if (z2 && true) {
            this.f72555e = Collections.unmodifiableList(this.f72555e);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72554d = p.mo36559c();
            throw th5;
        }
        this.f72554d = p.mo36559c();
    }
}
