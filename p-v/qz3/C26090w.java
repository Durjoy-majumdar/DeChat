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

/* renamed from: qz3.w */
public final class C26090w extends C26593h implements C26609q {

    /* renamed from: h */
    public static final C26090w f72925h;

    /* renamed from: i */
    public static C26610r<C26090w> f72926i = new C26091a();

    /* renamed from: d */
    public final C23156c f72927d;

    /* renamed from: e */
    public List<C26085v> f72928e;

    /* renamed from: f */
    public byte f72929f;

    /* renamed from: g */
    public int f72930g;

    /* renamed from: qz3.w$a */
    public static class C26091a extends C26585b<C26090w> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26090w(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.w$b */
    public static final class C26092b extends C26593h.C26595b<C26090w, C26092b> implements C26609q {

        /* renamed from: e */
        public int f72931e;

        /* renamed from: f */
        public List<C26085v> f72932f = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52947g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52947g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26090w e = mo52945e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26092b bVar = new C26092b();
            bVar.mo52946f(mo52945e());
            return bVar;
        }

        public Object clone() {
            C26092b bVar = new C26092b();
            bVar.mo52946f(mo52945e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52946f((C26090w) hVar);
            return this;
        }

        /* renamed from: e */
        public C26090w mo52945e() {
            C26090w wVar = new C26090w(this, (C26008a) null);
            if ((this.f72931e & 1) == 1) {
                this.f72932f = Collections.unmodifiableList(this.f72932f);
                this.f72931e &= -2;
            }
            wVar.f72928e = this.f72932f;
            return wVar;
        }

        /* renamed from: f */
        public C26092b mo52946f(C26090w wVar) {
            if (wVar == C26090w.f72925h) {
                return this;
            }
            if (!wVar.f72928e.isEmpty()) {
                if (this.f72932f.isEmpty()) {
                    this.f72932f = wVar.f72928e;
                    this.f72931e &= -2;
                } else {
                    if ((this.f72931e & 1) != 1) {
                        this.f72932f = new ArrayList(this.f72932f);
                        this.f72931e |= 1;
                    }
                    this.f72932f.addAll(wVar.f72928e);
                }
            }
            this.f74007d = this.f74007d.mo36541h(wVar.f72927d);
            return this;
        }

        /* renamed from: g */
        public C26092b mo52947g(C26586d dVar, C26589f fVar) {
            C26090w wVar;
            C26090w wVar2 = null;
            try {
                C26090w wVar3 = (C26090w) ((C26091a) C26090w.f72926i).mo52860a(dVar, fVar);
                if (wVar3 != null) {
                    mo52946f(wVar3);
                }
                return this;
            } catch (C26601j e) {
                wVar = (C26090w) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                mo52946f(wVar2);
            }
            throw th;
        }
    }

    static {
        C26090w wVar = new C26090w(true);
        f72925h = wVar;
        wVar.f72928e = Collections.emptyList();
    }

    public C26090w(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72929f = -1;
        this.f72930g = -1;
        this.f72927d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        for (int i = 0; i < this.f72928e.size(); i++) {
            eVar.mo53541o(1, this.f72928e.get(i));
        }
        eVar.mo53544r(this.f72927d);
    }

    public int getSerializedSize() {
        int i = this.f72930g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f72928e.size(); i3++) {
            i2 += C26587e.m34407d(1, this.f72928e.get(i3));
        }
        int size = i2 + this.f72927d.size();
        this.f72930g = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72929f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f72929f = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26092b();
    }

    public C26607p.C26608a toBuilder() {
        C26092b bVar = new C26092b();
        bVar.mo52946f(this);
        return bVar;
    }

    public C26090w(boolean z) {
        this.f72929f = -1;
        this.f72930g = -1;
        this.f72927d = C23156c.f66530d;
    }

    public C26090w(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72929f = -1;
        this.f72930g = -1;
        this.f72928e = Collections.emptyList();
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
                            this.f72928e = new ArrayList();
                            z2 |= true;
                        }
                        this.f72928e.add(dVar.mo53523g(C26085v.f72897r, fVar));
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
                    this.f72928e = Collections.unmodifiableList(this.f72928e);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72927d = p.mo36559c();
                    throw th4;
                }
                this.f72927d = p.mo36559c();
                throw th;
            }
        }
        if (z2 && true) {
            this.f72928e = Collections.unmodifiableList(this.f72928e);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72927d = p.mo36559c();
            throw th5;
        }
        this.f72927d = p.mo36559c();
    }
}
