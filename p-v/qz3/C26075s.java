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
import xz3.C26610r;
import xz3.C26611v;

/* renamed from: qz3.s */
public final class C26075s extends C26593h.C26597d<C26075s> {

    /* renamed from: s */
    public static final C26075s f72841s;

    /* renamed from: t */
    public static C26610r<C26075s> f72842t = new C26076a();

    /* renamed from: e */
    public final C23156c f72843e;

    /* renamed from: f */
    public int f72844f;

    /* renamed from: g */
    public int f72845g;

    /* renamed from: h */
    public int f72846h;

    /* renamed from: i */
    public boolean f72847i;

    /* renamed from: j */
    public C26078c f72848j;

    /* renamed from: n */
    public List<C26065q> f72849n;

    /* renamed from: o */
    public List<Integer> f72850o;

    /* renamed from: p */
    public int f72851p;

    /* renamed from: q */
    public byte f72852q;

    /* renamed from: r */
    public int f72853r;

    /* renamed from: qz3.s$a */
    public static class C26076a extends C26585b<C26075s> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26075s(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.s$b */
    public static final class C26077b extends C26593h.C26596c<C26075s, C26077b> {

        /* renamed from: g */
        public int f72854g;

        /* renamed from: h */
        public int f72855h;

        /* renamed from: i */
        public int f72856i;

        /* renamed from: j */
        public boolean f72857j;

        /* renamed from: n */
        public C26078c f72858n = C26078c.INV;

        /* renamed from: o */
        public List<C26065q> f72859o = Collections.emptyList();

        /* renamed from: p */
        public List<Integer> f72860p = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52934h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52934h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26075s f = mo52932f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26077b bVar = new C26077b();
            bVar.mo52933g(mo52932f());
            return bVar;
        }

        public Object clone() {
            C26077b bVar = new C26077b();
            bVar.mo52933g(mo52932f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52933g((C26075s) hVar);
            return this;
        }

        /* renamed from: f */
        public C26075s mo52932f() {
            C26075s sVar = new C26075s(this, (C26008a) null);
            int i = this.f72854g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            sVar.f72845g = this.f72855h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            sVar.f72846h = this.f72856i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            sVar.f72847i = this.f72857j;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            sVar.f72848j = this.f72858n;
            if ((i & 16) == 16) {
                this.f72859o = Collections.unmodifiableList(this.f72859o);
                this.f72854g &= -17;
            }
            sVar.f72849n = this.f72859o;
            if ((this.f72854g & 32) == 32) {
                this.f72860p = Collections.unmodifiableList(this.f72860p);
                this.f72854g &= -33;
            }
            sVar.f72850o = this.f72860p;
            sVar.f72844f = i2;
            return sVar;
        }

        /* renamed from: g */
        public C26077b mo52933g(C26075s sVar) {
            if (sVar == C26075s.f72841s) {
                return this;
            }
            int i = sVar.f72844f;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = sVar.f72845g;
                this.f72854g |= 1;
                this.f72855h = i2;
            }
            if ((i & 2) == 2) {
                int i3 = sVar.f72846h;
                this.f72854g = 2 | this.f72854g;
                this.f72856i = i3;
            }
            if ((i & 4) == 4) {
                boolean z2 = sVar.f72847i;
                this.f72854g = 4 | this.f72854g;
                this.f72857j = z2;
            }
            if ((i & 8) == 8) {
                z = true;
            }
            if (z) {
                C26078c cVar = sVar.f72848j;
                cVar.getClass();
                this.f72854g = 8 | this.f72854g;
                this.f72858n = cVar;
            }
            if (!sVar.f72849n.isEmpty()) {
                if (this.f72859o.isEmpty()) {
                    this.f72859o = sVar.f72849n;
                    this.f72854g &= -17;
                } else {
                    if ((this.f72854g & 16) != 16) {
                        this.f72859o = new ArrayList(this.f72859o);
                        this.f72854g |= 16;
                    }
                    this.f72859o.addAll(sVar.f72849n);
                }
            }
            if (!sVar.f72850o.isEmpty()) {
                if (this.f72860p.isEmpty()) {
                    this.f72860p = sVar.f72850o;
                    this.f72854g &= -33;
                } else {
                    if ((this.f72854g & 32) != 32) {
                        this.f72860p = new ArrayList(this.f72860p);
                        this.f72854g |= 32;
                    }
                    this.f72860p.addAll(sVar.f72850o);
                }
            }
            mo53568e(sVar);
            this.f74007d = this.f74007d.mo36541h(sVar.f72843e);
            return this;
        }

        /* renamed from: h */
        public C26077b mo52934h(C26586d dVar, C26589f fVar) {
            C26075s sVar;
            C26075s sVar2 = null;
            try {
                C26075s sVar3 = (C26075s) ((C26076a) C26075s.f72842t).mo52860a(dVar, fVar);
                if (sVar3 != null) {
                    mo52933g(sVar3);
                }
                return this;
            } catch (C26601j e) {
                sVar = (C26075s) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                sVar2 = sVar;
            }
            if (sVar2 != null) {
                mo52933g(sVar2);
            }
            throw th;
        }
    }

    /* renamed from: qz3.s$c */
    public enum C26078c implements C23159i.C23160a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: d */
        public final int f72865d;

        /* access modifiers changed from: public */
        C26078c(int i, int i2) {
            this.f72865d = i2;
        }

        public final int getNumber() {
            return this.f72865d;
        }
    }

    static {
        C26075s sVar = new C26075s(true);
        f72841s = sVar;
        sVar.f72845g = 0;
        sVar.f72846h = 0;
        sVar.f72847i = false;
        sVar.f72848j = C26078c.INV;
        sVar.f72849n = Collections.emptyList();
        sVar.f72850o = Collections.emptyList();
    }

    public C26075s(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72851p = -1;
        this.f72852q = -1;
        this.f72853r = -1;
        this.f72843e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72844f & 1) == 1) {
            eVar.mo53539m(1, this.f72845g);
        }
        if ((this.f72844f & 2) == 2) {
            eVar.mo53539m(2, this.f72846h);
        }
        if ((this.f72844f & 4) == 4) {
            boolean z = this.f72847i;
            eVar.mo53550x(3, 0);
            eVar.mo53543q(z ? 1 : 0);
        }
        if ((this.f72844f & 8) == 8) {
            eVar.mo53538l(4, this.f72848j.f72865d);
        }
        for (int i2 = 0; i2 < this.f72849n.size(); i2++) {
            eVar.mo53541o(5, this.f72849n.get(i2));
        }
        if (this.f72850o.size() > 0) {
            eVar.mo53548v(50);
            eVar.mo53548v(this.f72851p);
        }
        for (int i3 = 0; i3 < this.f72850o.size(); i3++) {
            eVar.mo53540n(this.f72850o.get(i3).intValue());
        }
        i.mo53577a(1000, eVar);
        eVar.mo53544r(this.f72843e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72841s;
    }

    public int getSerializedSize() {
        int i = this.f72853r;
        if (i != -1) {
            return i;
        }
        int b = (this.f72844f & 1) == 1 ? C26587e.m34405b(1, this.f72845g) + 0 : 0;
        if ((this.f72844f & 2) == 2) {
            b += C26587e.m34405b(2, this.f72846h);
        }
        if ((this.f72844f & 4) == 4) {
            b += C26587e.m34411h(3) + 1;
        }
        if ((this.f72844f & 8) == 8) {
            b += C26587e.m34404a(4, this.f72848j.f72865d);
        }
        for (int i2 = 0; i2 < this.f72849n.size(); i2++) {
            b += C26587e.m34407d(5, this.f72849n.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f72850o.size(); i4++) {
            i3 += C26587e.m34406c(this.f72850o.get(i4).intValue());
        }
        int i5 = b + i3;
        if (!this.f72850o.isEmpty()) {
            i5 = i5 + 1 + C26587e.m34406c(i3);
        }
        this.f72851p = i3;
        int e = i5 + mo53570e() + this.f72843e.size();
        this.f72853r = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72852q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f72844f;
        if (!((i & 1) == 1)) {
            this.f72852q = 0;
            return false;
        }
        if (!((i & 2) == 2)) {
            this.f72852q = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f72849n.size(); i2++) {
            if (!this.f72849n.get(i2).isInitialized()) {
                this.f72852q = 0;
                return false;
            }
        }
        if (!mo53569d()) {
            this.f72852q = 0;
            return false;
        }
        this.f72852q = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26077b();
    }

    public C26607p.C26608a toBuilder() {
        C26077b bVar = new C26077b();
        bVar.mo52933g(this);
        return bVar;
    }

    public C26075s(boolean z) {
        this.f72851p = -1;
        this.f72852q = -1;
        this.f72853r = -1;
        this.f72843e = C23156c.f66530d;
    }

    public C26075s(C26586d dVar, C26589f fVar, C26008a aVar) {
        C26078c cVar;
        C26586d dVar2 = dVar;
        C26589f fVar2 = fVar;
        C26078c cVar2 = C26078c.INV;
        this.f72851p = -1;
        this.f72852q = -1;
        this.f72853r = -1;
        this.f72845g = 0;
        this.f72846h = 0;
        this.f72847i = false;
        this.f72848j = cVar2;
        this.f72849n = Collections.emptyList();
        this.f72850o = Collections.emptyList();
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 8) {
                        this.f72844f |= 1;
                        this.f72845g = dVar.mo53527k();
                    } else if (n == 16) {
                        this.f72844f |= 2;
                        this.f72846h = dVar.mo53527k();
                    } else if (n == 24) {
                        this.f72844f |= 4;
                        this.f72847i = dVar.mo53528l() != 0;
                    } else if (n == 32) {
                        int k = dVar.mo53527k();
                        if (k == 0) {
                            cVar = C26078c.IN;
                        } else if (k != 1) {
                            cVar = k != 2 ? null : cVar2;
                        } else {
                            cVar = C26078c.OUT;
                        }
                        if (cVar == null) {
                            j.mo53548v(n);
                            j.mo53548v(k);
                        } else {
                            this.f72844f |= 8;
                            this.f72848j = cVar;
                        }
                    } else if (n == 42) {
                        if (!(z2 & true)) {
                            this.f72849n = new ArrayList();
                            z2 |= true;
                        }
                        this.f72849n.add(dVar2.mo53523g(C26065q.f72762A, fVar2));
                    } else if (n == 48) {
                        if (!(z2 & true)) {
                            this.f72850o = new ArrayList();
                            z2 |= true;
                        }
                        this.f72850o.add(Integer.valueOf(dVar.mo53527k()));
                    } else if (n == 50) {
                        int d = dVar2.mo53520d(dVar.mo53527k());
                        if (!(z2 & true) && dVar.mo53518b() > 0) {
                            this.f72850o = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.mo53518b() > 0) {
                            this.f72850o.add(Integer.valueOf(dVar.mo53527k()));
                        }
                        dVar2.mo53519c(d);
                    } else if (!mo53575j(dVar2, j, fVar2, n)) {
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
                if (z2 & true) {
                    this.f72849n = Collections.unmodifiableList(this.f72849n);
                }
                if (z2 & true) {
                    this.f72850o = Collections.unmodifiableList(this.f72850o);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    this.f72843e = p.mo36559c();
                    throw th5;
                }
                this.f72843e = p.mo36559c();
                mo53573h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f72849n = Collections.unmodifiableList(this.f72849n);
        }
        if (z2 & true) {
            this.f72850o = Collections.unmodifiableList(this.f72850o);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th6) {
            Throwable th7 = th6;
            this.f72843e = p.mo36559c();
            throw th7;
        }
        this.f72843e = p.mo36559c();
        mo53573h();
    }
}
