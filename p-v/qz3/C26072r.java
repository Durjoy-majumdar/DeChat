package qz3;

import com.tencent.xweb.util.WXWebReporter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

/* renamed from: qz3.r */
public final class C26072r extends C26593h.C26597d<C26072r> {

    /* renamed from: u */
    public static final C26072r f72816u;

    /* renamed from: v */
    public static C26610r<C26072r> f72817v = new C26073a();

    /* renamed from: e */
    public final C23156c f72818e;

    /* renamed from: f */
    public int f72819f;

    /* renamed from: g */
    public int f72820g;

    /* renamed from: h */
    public int f72821h;

    /* renamed from: i */
    public List<C26075s> f72822i;

    /* renamed from: j */
    public C26065q f72823j;

    /* renamed from: n */
    public int f72824n;

    /* renamed from: o */
    public C26065q f72825o;

    /* renamed from: p */
    public int f72826p;

    /* renamed from: q */
    public List<C26009b> f72827q;

    /* renamed from: r */
    public List<Integer> f72828r;

    /* renamed from: s */
    public byte f72829s;

    /* renamed from: t */
    public int f72830t;

    /* renamed from: qz3.r$a */
    public static class C26073a extends C26585b<C26072r> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26072r(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.r$b */
    public static final class C26074b extends C26593h.C26596c<C26072r, C26074b> {

        /* renamed from: g */
        public int f72831g;

        /* renamed from: h */
        public int f72832h = 6;

        /* renamed from: i */
        public int f72833i;

        /* renamed from: j */
        public List<C26075s> f72834j = Collections.emptyList();

        /* renamed from: n */
        public C26065q f72835n;

        /* renamed from: o */
        public int f72836o;

        /* renamed from: p */
        public C26065q f72837p;

        /* renamed from: q */
        public int f72838q;

        /* renamed from: r */
        public List<C26009b> f72839r;

        /* renamed from: s */
        public List<Integer> f72840s;

        public C26074b() {
            C26065q qVar = C26065q.f72763z;
            this.f72835n = qVar;
            this.f72837p = qVar;
            this.f72839r = Collections.emptyList();
            this.f72840s = Collections.emptyList();
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52931h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52931h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26072r f = mo52929f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26074b bVar = new C26074b();
            bVar.mo52930g(mo52929f());
            return bVar;
        }

        public Object clone() {
            C26074b bVar = new C26074b();
            bVar.mo52930g(mo52929f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52930g((C26072r) hVar);
            return this;
        }

        /* renamed from: f */
        public C26072r mo52929f() {
            C26072r rVar = new C26072r(this, (C26008a) null);
            int i = this.f72831g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            rVar.f72820g = this.f72832h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            rVar.f72821h = this.f72833i;
            if ((i & 4) == 4) {
                this.f72834j = Collections.unmodifiableList(this.f72834j);
                this.f72831g &= -5;
            }
            rVar.f72822i = this.f72834j;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            rVar.f72823j = this.f72835n;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            rVar.f72824n = this.f72836o;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            rVar.f72825o = this.f72837p;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            rVar.f72826p = this.f72838q;
            if ((this.f72831g & 128) == 128) {
                this.f72839r = Collections.unmodifiableList(this.f72839r);
                this.f72831g &= -129;
            }
            rVar.f72827q = this.f72839r;
            if ((this.f72831g & 256) == 256) {
                this.f72840s = Collections.unmodifiableList(this.f72840s);
                this.f72831g &= -257;
            }
            rVar.f72828r = this.f72840s;
            rVar.f72819f = i2;
            return rVar;
        }

        /* renamed from: g */
        public C26074b mo52930g(C26072r rVar) {
            C26065q qVar;
            C26065q qVar2;
            if (rVar == C26072r.f72816u) {
                return this;
            }
            int i = rVar.f72819f;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = rVar.f72820g;
                this.f72831g |= 1;
                this.f72832h = i2;
            }
            if ((i & 2) == 2) {
                int i3 = rVar.f72821h;
                this.f72831g = 2 | this.f72831g;
                this.f72833i = i3;
            }
            if (!rVar.f72822i.isEmpty()) {
                if (this.f72834j.isEmpty()) {
                    this.f72834j = rVar.f72822i;
                    this.f72831g &= -5;
                } else {
                    if ((this.f72831g & 4) != 4) {
                        this.f72834j = new ArrayList(this.f72834j);
                        this.f72831g |= 4;
                    }
                    this.f72834j.addAll(rVar.f72822i);
                }
            }
            if ((rVar.f72819f & 4) == 4) {
                C26065q qVar3 = rVar.f72823j;
                if ((this.f72831g & 8) != 8 || (qVar2 = this.f72835n) == C26065q.f72763z) {
                    this.f72835n = qVar3;
                } else {
                    C26065q.C26071c n = C26065q.m33342n(qVar2);
                    n.mo52866d(qVar3);
                    this.f72835n = n.mo52925f();
                }
                this.f72831g |= 8;
            }
            int i4 = rVar.f72819f;
            if ((i4 & 8) == 8) {
                int i5 = rVar.f72824n;
                this.f72831g |= 16;
                this.f72836o = i5;
            }
            if ((i4 & 16) == 16) {
                C26065q qVar4 = rVar.f72825o;
                if ((this.f72831g & 32) != 32 || (qVar = this.f72837p) == C26065q.f72763z) {
                    this.f72837p = qVar4;
                } else {
                    C26065q.C26071c n2 = C26065q.m33342n(qVar);
                    n2.mo52866d(qVar4);
                    this.f72837p = n2.mo52925f();
                }
                this.f72831g |= 32;
            }
            if ((rVar.f72819f & 32) == 32) {
                z = true;
            }
            if (z) {
                int i6 = rVar.f72826p;
                this.f72831g |= 64;
                this.f72838q = i6;
            }
            if (!rVar.f72827q.isEmpty()) {
                if (this.f72839r.isEmpty()) {
                    this.f72839r = rVar.f72827q;
                    this.f72831g &= -129;
                } else {
                    if ((this.f72831g & 128) != 128) {
                        this.f72839r = new ArrayList(this.f72839r);
                        this.f72831g |= 128;
                    }
                    this.f72839r.addAll(rVar.f72827q);
                }
            }
            if (!rVar.f72828r.isEmpty()) {
                if (this.f72840s.isEmpty()) {
                    this.f72840s = rVar.f72828r;
                    this.f72831g &= -257;
                } else {
                    if ((this.f72831g & 256) != 256) {
                        this.f72840s = new ArrayList(this.f72840s);
                        this.f72831g |= 256;
                    }
                    this.f72840s.addAll(rVar.f72828r);
                }
            }
            mo53568e(rVar);
            this.f74007d = this.f74007d.mo36541h(rVar.f72818e);
            return this;
        }

        /* renamed from: h */
        public C26074b mo52931h(C26586d dVar, C26589f fVar) {
            C26072r rVar;
            C26072r rVar2 = null;
            try {
                C26072r rVar3 = (C26072r) ((C26073a) C26072r.f72817v).mo52860a(dVar, fVar);
                if (rVar3 != null) {
                    mo52930g(rVar3);
                }
                return this;
            } catch (C26601j e) {
                rVar = (C26072r) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                mo52930g(rVar2);
            }
            throw th;
        }
    }

    static {
        C26072r rVar = new C26072r(true);
        f72816u = rVar;
        rVar.mo52928l();
    }

    public C26072r(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72829s = -1;
        this.f72830t = -1;
        this.f72818e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72819f & 1) == 1) {
            eVar.mo53539m(1, this.f72820g);
        }
        if ((this.f72819f & 2) == 2) {
            eVar.mo53539m(2, this.f72821h);
        }
        for (int i2 = 0; i2 < this.f72822i.size(); i2++) {
            eVar.mo53541o(3, this.f72822i.get(i2));
        }
        if ((this.f72819f & 4) == 4) {
            eVar.mo53541o(4, this.f72823j);
        }
        if ((this.f72819f & 8) == 8) {
            eVar.mo53539m(5, this.f72824n);
        }
        if ((this.f72819f & 16) == 16) {
            eVar.mo53541o(6, this.f72825o);
        }
        if ((this.f72819f & 32) == 32) {
            eVar.mo53539m(7, this.f72826p);
        }
        for (int i3 = 0; i3 < this.f72827q.size(); i3++) {
            eVar.mo53541o(8, this.f72827q.get(i3));
        }
        for (int i4 = 0; i4 < this.f72828r.size(); i4++) {
            eVar.mo53539m(31, this.f72828r.get(i4).intValue());
        }
        i.mo53577a(200, eVar);
        eVar.mo53544r(this.f72818e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72816u;
    }

    public int getSerializedSize() {
        int i = this.f72830t;
        if (i != -1) {
            return i;
        }
        int b = (this.f72819f & 1) == 1 ? C26587e.m34405b(1, this.f72820g) + 0 : 0;
        if ((this.f72819f & 2) == 2) {
            b += C26587e.m34405b(2, this.f72821h);
        }
        for (int i2 = 0; i2 < this.f72822i.size(); i2++) {
            b += C26587e.m34407d(3, this.f72822i.get(i2));
        }
        if ((this.f72819f & 4) == 4) {
            b += C26587e.m34407d(4, this.f72823j);
        }
        if ((this.f72819f & 8) == 8) {
            b += C26587e.m34405b(5, this.f72824n);
        }
        if ((this.f72819f & 16) == 16) {
            b += C26587e.m34407d(6, this.f72825o);
        }
        if ((this.f72819f & 32) == 32) {
            b += C26587e.m34405b(7, this.f72826p);
        }
        for (int i3 = 0; i3 < this.f72827q.size(); i3++) {
            b += C26587e.m34407d(8, this.f72827q.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f72828r.size(); i5++) {
            i4 += C26587e.m34406c(this.f72828r.get(i5).intValue());
        }
        int size = b + i4 + (this.f72828r.size() * 2) + mo53570e() + this.f72818e.size();
        this.f72830t = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72829s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f72819f & 2) == 2)) {
            this.f72829s = 0;
            return false;
        }
        for (int i = 0; i < this.f72822i.size(); i++) {
            if (!this.f72822i.get(i).isInitialized()) {
                this.f72829s = 0;
                return false;
            }
        }
        if (!((this.f72819f & 4) == 4) || this.f72823j.isInitialized()) {
            if (!((this.f72819f & 16) == 16) || this.f72825o.isInitialized()) {
                for (int i2 = 0; i2 < this.f72827q.size(); i2++) {
                    if (!this.f72827q.get(i2).isInitialized()) {
                        this.f72829s = 0;
                        return false;
                    }
                }
                if (!mo53569d()) {
                    this.f72829s = 0;
                    return false;
                }
                this.f72829s = 1;
                return true;
            }
            this.f72829s = 0;
            return false;
        }
        this.f72829s = 0;
        return false;
    }

    /* renamed from: l */
    public final void mo52928l() {
        this.f72820g = 6;
        this.f72821h = 0;
        this.f72822i = Collections.emptyList();
        C26065q qVar = C26065q.f72763z;
        this.f72823j = qVar;
        this.f72824n = 0;
        this.f72825o = qVar;
        this.f72826p = 0;
        this.f72827q = Collections.emptyList();
        this.f72828r = Collections.emptyList();
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26074b();
    }

    public C26607p.C26608a toBuilder() {
        C26074b bVar = new C26074b();
        bVar.mo52930g(this);
        return bVar;
    }

    public C26072r(boolean z) {
        this.f72829s = -1;
        this.f72830t = -1;
        this.f72818e = C23156c.f66530d;
    }

    public C26072r(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72829s = -1;
        this.f72830t = -1;
        mo52928l();
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                C26065q.C26071c cVar = null;
                switch (n) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f72819f |= 1;
                        this.f72820g = dVar.mo53527k();
                        break;
                    case 16:
                        this.f72819f |= 2;
                        this.f72821h = dVar.mo53527k();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.f72822i = new ArrayList();
                            z2 |= true;
                        }
                        this.f72822i.add(dVar.mo53523g(C26075s.f72842t, fVar));
                        break;
                    case 34:
                        cVar = (this.f72819f & 4) == 4 ? this.f72823j.mo52921o() : cVar;
                        C26065q qVar = (C26065q) dVar.mo53523g(C26065q.f72762A, fVar);
                        this.f72823j = qVar;
                        if (cVar != null) {
                            cVar.mo52866d(qVar);
                            this.f72823j = cVar.mo52925f();
                        }
                        this.f72819f |= 4;
                        break;
                    case 40:
                        this.f72819f |= 8;
                        this.f72824n = dVar.mo53527k();
                        break;
                    case 50:
                        cVar = (this.f72819f & 16) == 16 ? this.f72825o.mo52921o() : cVar;
                        C26065q qVar2 = (C26065q) dVar.mo53523g(C26065q.f72762A, fVar);
                        this.f72825o = qVar2;
                        if (cVar != null) {
                            cVar.mo52866d(qVar2);
                            this.f72825o = cVar.mo52925f();
                        }
                        this.f72819f |= 16;
                        break;
                    case 56:
                        this.f72819f |= 32;
                        this.f72826p = dVar.mo53527k();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.f72827q = new ArrayList();
                            z2 |= true;
                        }
                        this.f72827q.add(dVar.mo53523g(C26009b.f72406n, fVar));
                        break;
                    case WXWebReporter.KEY_TRY_FIX_DEX_FAILED:
                        if (!(z2 & true)) {
                            this.f72828r = new ArrayList();
                            z2 |= true;
                        }
                        this.f72828r.add(Integer.valueOf(dVar.mo53527k()));
                        break;
                    case 250:
                        int d = dVar.mo53520d(dVar.mo53527k());
                        if (!(z2 & true) && dVar.mo53518b() > 0) {
                            this.f72828r = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.mo53518b() > 0) {
                            this.f72828r.add(Integer.valueOf(dVar.mo53527k()));
                        }
                        dVar.mo53519c(d);
                        break;
                    default:
                        if (mo53575j(dVar, j, fVar, n)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (C26601j e) {
                e.f74023d = this;
                throw e;
            } catch (IOException e2) {
                C26601j jVar = new C26601j(e2.getMessage());
                jVar.f74023d = this;
                throw jVar;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f72822i = Collections.unmodifiableList(this.f72822i);
                }
                if (z2 & true) {
                    this.f72827q = Collections.unmodifiableList(this.f72827q);
                }
                if (z2 & true) {
                    this.f72828r = Collections.unmodifiableList(this.f72828r);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72818e = p.mo36559c();
                    throw th4;
                }
                this.f72818e = p.mo36559c();
                mo53573h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f72822i = Collections.unmodifiableList(this.f72822i);
        }
        if (z2 & true) {
            this.f72827q = Collections.unmodifiableList(this.f72827q);
        }
        if (z2 & true) {
            this.f72828r = Collections.unmodifiableList(this.f72828r);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72818e = p.mo36559c();
            throw th5;
        }
        this.f72818e = p.mo36559c();
        mo53573h();
    }
}
