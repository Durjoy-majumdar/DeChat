package qz3;

import java.io.IOException;
import qz3.C26065q;
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

/* renamed from: qz3.u */
public final class C26082u extends C26593h.C26597d<C26082u> {

    /* renamed from: r */
    public static final C26082u f72877r;

    /* renamed from: s */
    public static C26610r<C26082u> f72878s = new C26083a();

    /* renamed from: e */
    public final C23156c f72879e;

    /* renamed from: f */
    public int f72880f;

    /* renamed from: g */
    public int f72881g;

    /* renamed from: h */
    public int f72882h;

    /* renamed from: i */
    public C26065q f72883i;

    /* renamed from: j */
    public int f72884j;

    /* renamed from: n */
    public C26065q f72885n;

    /* renamed from: o */
    public int f72886o;

    /* renamed from: p */
    public byte f72887p;

    /* renamed from: q */
    public int f72888q;

    /* renamed from: qz3.u$a */
    public static class C26083a extends C26585b<C26082u> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26082u(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.u$b */
    public static final class C26084b extends C26593h.C26596c<C26082u, C26084b> {

        /* renamed from: g */
        public int f72889g;

        /* renamed from: h */
        public int f72890h;

        /* renamed from: i */
        public int f72891i;

        /* renamed from: j */
        public C26065q f72892j;

        /* renamed from: n */
        public int f72893n;

        /* renamed from: o */
        public C26065q f72894o;

        /* renamed from: p */
        public int f72895p;

        public C26084b() {
            C26065q qVar = C26065q.f72763z;
            this.f72892j = qVar;
            this.f72894o = qVar;
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52941h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52941h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26082u f = mo52939f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26084b bVar = new C26084b();
            bVar.mo52940g(mo52939f());
            return bVar;
        }

        public Object clone() {
            C26084b bVar = new C26084b();
            bVar.mo52940g(mo52939f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52940g((C26082u) hVar);
            return this;
        }

        /* renamed from: f */
        public C26082u mo52939f() {
            C26082u uVar = new C26082u(this, (C26008a) null);
            int i = this.f72889g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            uVar.f72881g = this.f72890h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            uVar.f72882h = this.f72891i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            uVar.f72883i = this.f72892j;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            uVar.f72884j = this.f72893n;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            uVar.f72885n = this.f72894o;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            uVar.f72886o = this.f72895p;
            uVar.f72880f = i2;
            return uVar;
        }

        /* renamed from: g */
        public C26084b mo52940g(C26082u uVar) {
            C26065q qVar;
            C26065q qVar2;
            if (uVar == C26082u.f72877r) {
                return this;
            }
            int i = uVar.f72880f;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = uVar.f72881g;
                this.f72889g |= 1;
                this.f72890h = i2;
            }
            if ((i & 2) == 2) {
                int i3 = uVar.f72882h;
                this.f72889g = 2 | this.f72889g;
                this.f72891i = i3;
            }
            if ((i & 4) == 4) {
                C26065q qVar3 = uVar.f72883i;
                if ((this.f72889g & 4) != 4 || (qVar2 = this.f72892j) == C26065q.f72763z) {
                    this.f72892j = qVar3;
                } else {
                    C26065q.C26071c n = C26065q.m33342n(qVar2);
                    n.mo52866d(qVar3);
                    this.f72892j = n.mo52925f();
                }
                this.f72889g |= 4;
            }
            int i4 = uVar.f72880f;
            if ((i4 & 8) == 8) {
                int i5 = uVar.f72884j;
                this.f72889g = 8 | this.f72889g;
                this.f72893n = i5;
            }
            if ((i4 & 16) == 16) {
                C26065q qVar4 = uVar.f72885n;
                if ((this.f72889g & 16) != 16 || (qVar = this.f72894o) == C26065q.f72763z) {
                    this.f72894o = qVar4;
                } else {
                    C26065q.C26071c n2 = C26065q.m33342n(qVar);
                    n2.mo52866d(qVar4);
                    this.f72894o = n2.mo52925f();
                }
                this.f72889g |= 16;
            }
            if ((uVar.f72880f & 32) == 32) {
                z = true;
            }
            if (z) {
                int i6 = uVar.f72886o;
                this.f72889g = 32 | this.f72889g;
                this.f72895p = i6;
            }
            mo53568e(uVar);
            this.f74007d = this.f74007d.mo36541h(uVar.f72879e);
            return this;
        }

        /* renamed from: h */
        public C26084b mo52941h(C26586d dVar, C26589f fVar) {
            C26082u uVar;
            C26082u uVar2 = null;
            try {
                C26082u uVar3 = (C26082u) ((C26083a) C26082u.f72878s).mo52860a(dVar, fVar);
                if (uVar3 != null) {
                    mo52940g(uVar3);
                }
                return this;
            } catch (C26601j e) {
                uVar = (C26082u) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                uVar2 = uVar;
            }
            if (uVar2 != null) {
                mo52940g(uVar2);
            }
            throw th;
        }
    }

    static {
        C26082u uVar = new C26082u(true);
        f72877r = uVar;
        uVar.f72881g = 0;
        uVar.f72882h = 0;
        C26065q qVar = C26065q.f72763z;
        uVar.f72883i = qVar;
        uVar.f72884j = 0;
        uVar.f72885n = qVar;
        uVar.f72886o = 0;
    }

    public C26082u(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72887p = -1;
        this.f72888q = -1;
        this.f72879e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72880f & 1) == 1) {
            eVar.mo53539m(1, this.f72881g);
        }
        if ((this.f72880f & 2) == 2) {
            eVar.mo53539m(2, this.f72882h);
        }
        if ((this.f72880f & 4) == 4) {
            eVar.mo53541o(3, this.f72883i);
        }
        if ((this.f72880f & 16) == 16) {
            eVar.mo53541o(4, this.f72885n);
        }
        if ((this.f72880f & 8) == 8) {
            eVar.mo53539m(5, this.f72884j);
        }
        if ((this.f72880f & 32) == 32) {
            eVar.mo53539m(6, this.f72886o);
        }
        i.mo53577a(200, eVar);
        eVar.mo53544r(this.f72879e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72877r;
    }

    public int getSerializedSize() {
        int i = this.f72888q;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f72880f & 1) == 1) {
            i2 = 0 + C26587e.m34405b(1, this.f72881g);
        }
        if ((this.f72880f & 2) == 2) {
            i2 += C26587e.m34405b(2, this.f72882h);
        }
        if ((this.f72880f & 4) == 4) {
            i2 += C26587e.m34407d(3, this.f72883i);
        }
        if ((this.f72880f & 16) == 16) {
            i2 += C26587e.m34407d(4, this.f72885n);
        }
        if ((this.f72880f & 8) == 8) {
            i2 += C26587e.m34405b(5, this.f72884j);
        }
        if ((this.f72880f & 32) == 32) {
            i2 += C26587e.m34405b(6, this.f72886o);
        }
        int e = i2 + mo53570e() + this.f72879e.size();
        this.f72888q = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72887p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f72880f;
        if (!((i & 2) == 2)) {
            this.f72887p = 0;
            return false;
        }
        if (!((i & 4) == 4) || this.f72883i.isInitialized()) {
            if (((this.f72880f & 16) == 16) && !this.f72885n.isInitialized()) {
                this.f72887p = 0;
                return false;
            } else if (!mo53569d()) {
                this.f72887p = 0;
                return false;
            } else {
                this.f72887p = 1;
                return true;
            }
        } else {
            this.f72887p = 0;
            return false;
        }
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26084b();
    }

    public C26607p.C26608a toBuilder() {
        C26084b bVar = new C26084b();
        bVar.mo52940g(this);
        return bVar;
    }

    public C26082u(boolean z) {
        this.f72887p = -1;
        this.f72888q = -1;
        this.f72879e = C23156c.f66530d;
    }

    public C26082u(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72887p = -1;
        this.f72888q = -1;
        boolean z = false;
        this.f72881g = 0;
        this.f72882h = 0;
        C26065q qVar = C26065q.f72763z;
        this.f72883i = qVar;
        this.f72884j = 0;
        this.f72885n = qVar;
        this.f72886o = 0;
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 8) {
                        this.f72880f |= 1;
                        this.f72881g = dVar.mo53527k();
                    } else if (n != 16) {
                        C26065q.C26071c cVar = null;
                        if (n == 26) {
                            if ((this.f72880f & 4) == 4) {
                                C26065q qVar2 = this.f72883i;
                                qVar2.getClass();
                                cVar = C26065q.m33342n(qVar2);
                            }
                            C26065q qVar3 = (C26065q) dVar.mo53523g(C26065q.f72762A, fVar);
                            this.f72883i = qVar3;
                            if (cVar != null) {
                                cVar.mo52866d(qVar3);
                                this.f72883i = cVar.mo52925f();
                            }
                            this.f72880f |= 4;
                        } else if (n == 34) {
                            if ((this.f72880f & 16) == 16) {
                                C26065q qVar4 = this.f72885n;
                                qVar4.getClass();
                                cVar = C26065q.m33342n(qVar4);
                            }
                            C26065q qVar5 = (C26065q) dVar.mo53523g(C26065q.f72762A, fVar);
                            this.f72885n = qVar5;
                            if (cVar != null) {
                                cVar.mo52866d(qVar5);
                                this.f72885n = cVar.mo52925f();
                            }
                            this.f72880f |= 16;
                        } else if (n == 40) {
                            this.f72880f |= 8;
                            this.f72884j = dVar.mo53527k();
                        } else if (n == 48) {
                            this.f72880f |= 32;
                            this.f72886o = dVar.mo53527k();
                        } else if (!mo53575j(dVar, j, fVar, n)) {
                        }
                    } else {
                        this.f72880f |= 2;
                        this.f72882h = dVar.mo53527k();
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
                    this.f72879e = p.mo36559c();
                    throw th4;
                }
                this.f72879e = p.mo36559c();
                mo53573h();
                throw th;
            }
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72879e = p.mo36559c();
            throw th5;
        }
        this.f72879e = p.mo36559c();
        mo53573h();
    }
}
