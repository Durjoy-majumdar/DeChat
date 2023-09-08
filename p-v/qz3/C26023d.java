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
import xz3.C26610r;
import xz3.C26611v;

/* renamed from: qz3.d */
public final class C26023d extends C26593h.C26597d<C26023d> {

    /* renamed from: o */
    public static final C26023d f72539o;

    /* renamed from: p */
    public static C26610r<C26023d> f72540p = new C26024a();

    /* renamed from: e */
    public final C23156c f72541e;

    /* renamed from: f */
    public int f72542f;

    /* renamed from: g */
    public int f72543g;

    /* renamed from: h */
    public List<C26082u> f72544h;

    /* renamed from: i */
    public List<Integer> f72545i;

    /* renamed from: j */
    public byte f72546j;

    /* renamed from: n */
    public int f72547n;

    /* renamed from: qz3.d$a */
    public static class C26024a extends C26585b<C26023d> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26023d(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.d$b */
    public static final class C26025b extends C26593h.C26596c<C26023d, C26025b> {

        /* renamed from: g */
        public int f72548g;

        /* renamed from: h */
        public int f72549h = 6;

        /* renamed from: i */
        public List<C26082u> f72550i = Collections.emptyList();

        /* renamed from: j */
        public List<Integer> f72551j = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52884h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52884h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26023d f = mo52882f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26025b bVar = new C26025b();
            bVar.mo52883g(mo52882f());
            return bVar;
        }

        public Object clone() {
            C26025b bVar = new C26025b();
            bVar.mo52883g(mo52882f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52883g((C26023d) hVar);
            return this;
        }

        /* renamed from: f */
        public C26023d mo52882f() {
            C26023d dVar = new C26023d(this, (C26008a) null);
            int i = this.f72548g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            dVar.f72543g = this.f72549h;
            if ((i & 2) == 2) {
                this.f72550i = Collections.unmodifiableList(this.f72550i);
                this.f72548g &= -3;
            }
            dVar.f72544h = this.f72550i;
            if ((this.f72548g & 4) == 4) {
                this.f72551j = Collections.unmodifiableList(this.f72551j);
                this.f72548g &= -5;
            }
            dVar.f72545i = this.f72551j;
            dVar.f72542f = i2;
            return dVar;
        }

        /* renamed from: g */
        public C26025b mo52883g(C26023d dVar) {
            if (dVar == C26023d.f72539o) {
                return this;
            }
            if ((dVar.f72542f & 1) == 1) {
                int i = dVar.f72543g;
                this.f72548g = 1 | this.f72548g;
                this.f72549h = i;
            }
            if (!dVar.f72544h.isEmpty()) {
                if (this.f72550i.isEmpty()) {
                    this.f72550i = dVar.f72544h;
                    this.f72548g &= -3;
                } else {
                    if ((this.f72548g & 2) != 2) {
                        this.f72550i = new ArrayList(this.f72550i);
                        this.f72548g |= 2;
                    }
                    this.f72550i.addAll(dVar.f72544h);
                }
            }
            if (!dVar.f72545i.isEmpty()) {
                if (this.f72551j.isEmpty()) {
                    this.f72551j = dVar.f72545i;
                    this.f72548g &= -5;
                } else {
                    if ((this.f72548g & 4) != 4) {
                        this.f72551j = new ArrayList(this.f72551j);
                        this.f72548g |= 4;
                    }
                    this.f72551j.addAll(dVar.f72545i);
                }
            }
            mo53568e(dVar);
            this.f74007d = this.f74007d.mo36541h(dVar.f72541e);
            return this;
        }

        /* renamed from: h */
        public C26025b mo52884h(C26586d dVar, C26589f fVar) {
            C26023d dVar2;
            C26023d dVar3 = null;
            try {
                C26023d dVar4 = (C26023d) ((C26024a) C26023d.f72540p).mo52860a(dVar, fVar);
                if (dVar4 != null) {
                    mo52883g(dVar4);
                }
                return this;
            } catch (C26601j e) {
                dVar2 = (C26023d) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                dVar3 = dVar2;
            }
            if (dVar3 != null) {
                mo52883g(dVar3);
            }
            throw th;
        }
    }

    static {
        C26023d dVar = new C26023d(true);
        f72539o = dVar;
        dVar.f72543g = 6;
        dVar.f72544h = Collections.emptyList();
        dVar.f72545i = Collections.emptyList();
    }

    public C26023d(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72546j = -1;
        this.f72547n = -1;
        this.f72541e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72542f & 1) == 1) {
            eVar.mo53539m(1, this.f72543g);
        }
        for (int i2 = 0; i2 < this.f72544h.size(); i2++) {
            eVar.mo53541o(2, this.f72544h.get(i2));
        }
        for (int i3 = 0; i3 < this.f72545i.size(); i3++) {
            eVar.mo53539m(31, this.f72545i.get(i3).intValue());
        }
        i.mo53577a(19000, eVar);
        eVar.mo53544r(this.f72541e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72539o;
    }

    public int getSerializedSize() {
        int i = this.f72547n;
        if (i != -1) {
            return i;
        }
        int b = (this.f72542f & 1) == 1 ? C26587e.m34405b(1, this.f72543g) + 0 : 0;
        for (int i2 = 0; i2 < this.f72544h.size(); i2++) {
            b += C26587e.m34407d(2, this.f72544h.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f72545i.size(); i4++) {
            i3 += C26587e.m34406c(this.f72545i.get(i4).intValue());
        }
        int size = b + i3 + (this.f72545i.size() * 2) + mo53570e() + this.f72541e.size();
        this.f72547n = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72546j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72544h.size(); i++) {
            if (!this.f72544h.get(i).isInitialized()) {
                this.f72546j = 0;
                return false;
            }
        }
        if (!mo53569d()) {
            this.f72546j = 0;
            return false;
        }
        this.f72546j = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26025b();
    }

    public C26607p.C26608a toBuilder() {
        C26025b bVar = new C26025b();
        bVar.mo52883g(this);
        return bVar;
    }

    public C26023d(boolean z) {
        this.f72546j = -1;
        this.f72547n = -1;
        this.f72541e = C23156c.f66530d;
    }

    public C26023d(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72546j = -1;
        this.f72547n = -1;
        this.f72543g = 6;
        this.f72544h = Collections.emptyList();
        this.f72545i = Collections.emptyList();
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 8) {
                        this.f72542f |= 1;
                        this.f72543g = dVar.mo53527k();
                    } else if (n == 18) {
                        if (!(z2 & true)) {
                            this.f72544h = new ArrayList();
                            z2 |= true;
                        }
                        this.f72544h.add(dVar.mo53523g(C26082u.f72878s, fVar));
                    } else if (n == 248) {
                        if (!(z2 & true)) {
                            this.f72545i = new ArrayList();
                            z2 |= true;
                        }
                        this.f72545i.add(Integer.valueOf(dVar.mo53527k()));
                    } else if (n == 250) {
                        int d = dVar.mo53520d(dVar.mo53527k());
                        if (!(z2 & true) && dVar.mo53518b() > 0) {
                            this.f72545i = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.mo53518b() > 0) {
                            this.f72545i.add(Integer.valueOf(dVar.mo53527k()));
                        }
                        dVar.mo53519c(d);
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
                if (z2 & true) {
                    this.f72544h = Collections.unmodifiableList(this.f72544h);
                }
                if (z2 & true) {
                    this.f72545i = Collections.unmodifiableList(this.f72545i);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72541e = p.mo36559c();
                    throw th4;
                }
                this.f72541e = p.mo36559c();
                mo53573h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f72544h = Collections.unmodifiableList(this.f72544h);
        }
        if (z2 & true) {
            this.f72545i = Collections.unmodifiableList(this.f72545i);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72541e = p.mo36559c();
            throw th5;
        }
        this.f72541e = p.mo36559c();
        mo53573h();
    }
}
