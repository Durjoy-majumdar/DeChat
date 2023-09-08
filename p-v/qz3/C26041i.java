package qz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qz3.C26026e;
import qz3.C26065q;
import qz3.C26079t;
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

/* renamed from: qz3.i */
public final class C26041i extends C26593h.C26597d<C26041i> {

    /* renamed from: A */
    public static final C26041i f72620A;

    /* renamed from: B */
    public static C26610r<C26041i> f72621B = new C26042a();

    /* renamed from: e */
    public final C23156c f72622e;

    /* renamed from: f */
    public int f72623f;

    /* renamed from: g */
    public int f72624g;

    /* renamed from: h */
    public int f72625h;

    /* renamed from: i */
    public int f72626i;

    /* renamed from: j */
    public C26065q f72627j;

    /* renamed from: n */
    public int f72628n;

    /* renamed from: o */
    public List<C26075s> f72629o;

    /* renamed from: p */
    public C26065q f72630p;

    /* renamed from: q */
    public int f72631q;

    /* renamed from: r */
    public List<C26065q> f72632r;

    /* renamed from: s */
    public List<Integer> f72633s;

    /* renamed from: t */
    public int f72634t;

    /* renamed from: u */
    public List<C26082u> f72635u;

    /* renamed from: v */
    public C26079t f72636v;

    /* renamed from: w */
    public List<Integer> f72637w;

    /* renamed from: x */
    public C26026e f72638x;

    /* renamed from: y */
    public byte f72639y;

    /* renamed from: z */
    public int f72640z;

    /* renamed from: qz3.i$a */
    public static class C26042a extends C26585b<C26041i> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26041i(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.i$b */
    public static final class C26043b extends C26593h.C26596c<C26041i, C26043b> {

        /* renamed from: g */
        public int f72641g;

        /* renamed from: h */
        public int f72642h = 6;

        /* renamed from: i */
        public int f72643i = 6;

        /* renamed from: j */
        public int f72644j;

        /* renamed from: n */
        public C26065q f72645n;

        /* renamed from: o */
        public int f72646o;

        /* renamed from: p */
        public List<C26075s> f72647p;

        /* renamed from: q */
        public C26065q f72648q;

        /* renamed from: r */
        public int f72649r;

        /* renamed from: s */
        public List<C26065q> f72650s;

        /* renamed from: t */
        public List<Integer> f72651t;

        /* renamed from: u */
        public List<C26082u> f72652u;

        /* renamed from: v */
        public C26079t f72653v;

        /* renamed from: w */
        public List<Integer> f72654w;

        /* renamed from: x */
        public C26026e f72655x;

        public C26043b() {
            C26065q qVar = C26065q.f72763z;
            this.f72645n = qVar;
            this.f72647p = Collections.emptyList();
            this.f72648q = qVar;
            this.f72650s = Collections.emptyList();
            this.f72651t = Collections.emptyList();
            this.f72652u = Collections.emptyList();
            this.f72653v = C26079t.f72866j;
            this.f72654w = Collections.emptyList();
            this.f72655x = C26026e.f72552h;
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52899h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52899h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26041i f = mo52897f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26043b bVar = new C26043b();
            bVar.mo52898g(mo52897f());
            return bVar;
        }

        public Object clone() {
            C26043b bVar = new C26043b();
            bVar.mo52898g(mo52897f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52898g((C26041i) hVar);
            return this;
        }

        /* renamed from: f */
        public C26041i mo52897f() {
            C26041i iVar = new C26041i(this, (C26008a) null);
            int i = this.f72641g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            iVar.f72624g = this.f72642h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            iVar.f72625h = this.f72643i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            iVar.f72626i = this.f72644j;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            iVar.f72627j = this.f72645n;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            iVar.f72628n = this.f72646o;
            if ((i & 32) == 32) {
                this.f72647p = Collections.unmodifiableList(this.f72647p);
                this.f72641g &= -33;
            }
            iVar.f72629o = this.f72647p;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            iVar.f72630p = this.f72648q;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            iVar.f72631q = this.f72649r;
            if ((this.f72641g & 256) == 256) {
                this.f72650s = Collections.unmodifiableList(this.f72650s);
                this.f72641g &= -257;
            }
            iVar.f72632r = this.f72650s;
            if ((this.f72641g & 512) == 512) {
                this.f72651t = Collections.unmodifiableList(this.f72651t);
                this.f72641g &= -513;
            }
            iVar.f72633s = this.f72651t;
            if ((this.f72641g & 1024) == 1024) {
                this.f72652u = Collections.unmodifiableList(this.f72652u);
                this.f72641g &= -1025;
            }
            iVar.f72635u = this.f72652u;
            if ((i & 2048) == 2048) {
                i2 |= 128;
            }
            iVar.f72636v = this.f72653v;
            if ((this.f72641g & 4096) == 4096) {
                this.f72654w = Collections.unmodifiableList(this.f72654w);
                this.f72641g &= -4097;
            }
            iVar.f72637w = this.f72654w;
            if ((i & 8192) == 8192) {
                i2 |= 256;
            }
            iVar.f72638x = this.f72655x;
            iVar.f72623f = i2;
            return iVar;
        }

        /* renamed from: g */
        public C26043b mo52898g(C26041i iVar) {
            C26026e eVar;
            C26079t tVar;
            C26065q qVar;
            C26065q qVar2;
            if (iVar == C26041i.f72620A) {
                return this;
            }
            int i = iVar.f72623f;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = iVar.f72624g;
                this.f72641g |= 1;
                this.f72642h = i2;
            }
            if ((i & 2) == 2) {
                int i3 = iVar.f72625h;
                this.f72641g = 2 | this.f72641g;
                this.f72643i = i3;
            }
            if ((i & 4) == 4) {
                int i4 = iVar.f72626i;
                this.f72641g = 4 | this.f72641g;
                this.f72644j = i4;
            }
            if ((i & 8) == 8) {
                C26065q qVar3 = iVar.f72627j;
                if ((this.f72641g & 8) != 8 || (qVar2 = this.f72645n) == C26065q.f72763z) {
                    this.f72645n = qVar3;
                } else {
                    C26065q.C26071c n = C26065q.m33342n(qVar2);
                    n.mo52866d(qVar3);
                    this.f72645n = n.mo52925f();
                }
                this.f72641g |= 8;
            }
            if ((iVar.f72623f & 16) == 16) {
                int i5 = iVar.f72628n;
                this.f72641g = 16 | this.f72641g;
                this.f72646o = i5;
            }
            if (!iVar.f72629o.isEmpty()) {
                if (this.f72647p.isEmpty()) {
                    this.f72647p = iVar.f72629o;
                    this.f72641g &= -33;
                } else {
                    if ((this.f72641g & 32) != 32) {
                        this.f72647p = new ArrayList(this.f72647p);
                        this.f72641g |= 32;
                    }
                    this.f72647p.addAll(iVar.f72629o);
                }
            }
            if ((iVar.f72623f & 32) == 32) {
                C26065q qVar4 = iVar.f72630p;
                if ((this.f72641g & 64) != 64 || (qVar = this.f72648q) == C26065q.f72763z) {
                    this.f72648q = qVar4;
                } else {
                    C26065q.C26071c n2 = C26065q.m33342n(qVar);
                    n2.mo52866d(qVar4);
                    this.f72648q = n2.mo52925f();
                }
                this.f72641g |= 64;
            }
            if ((iVar.f72623f & 64) == 64) {
                int i6 = iVar.f72631q;
                this.f72641g |= 128;
                this.f72649r = i6;
            }
            if (!iVar.f72632r.isEmpty()) {
                if (this.f72650s.isEmpty()) {
                    this.f72650s = iVar.f72632r;
                    this.f72641g &= -257;
                } else {
                    if ((this.f72641g & 256) != 256) {
                        this.f72650s = new ArrayList(this.f72650s);
                        this.f72641g |= 256;
                    }
                    this.f72650s.addAll(iVar.f72632r);
                }
            }
            if (!iVar.f72633s.isEmpty()) {
                if (this.f72651t.isEmpty()) {
                    this.f72651t = iVar.f72633s;
                    this.f72641g &= -513;
                } else {
                    if ((this.f72641g & 512) != 512) {
                        this.f72651t = new ArrayList(this.f72651t);
                        this.f72641g |= 512;
                    }
                    this.f72651t.addAll(iVar.f72633s);
                }
            }
            if (!iVar.f72635u.isEmpty()) {
                if (this.f72652u.isEmpty()) {
                    this.f72652u = iVar.f72635u;
                    this.f72641g &= -1025;
                } else {
                    if ((this.f72641g & 1024) != 1024) {
                        this.f72652u = new ArrayList(this.f72652u);
                        this.f72641g |= 1024;
                    }
                    this.f72652u.addAll(iVar.f72635u);
                }
            }
            if ((iVar.f72623f & 128) == 128) {
                C26079t tVar2 = iVar.f72636v;
                if ((this.f72641g & 2048) != 2048 || (tVar = this.f72653v) == C26079t.f72866j) {
                    this.f72653v = tVar2;
                } else {
                    C26079t.C26081b d = C26079t.m33383d(tVar);
                    d.mo52937f(tVar2);
                    this.f72653v = d.mo52936e();
                }
                this.f72641g |= 2048;
            }
            if (!iVar.f72637w.isEmpty()) {
                if (this.f72654w.isEmpty()) {
                    this.f72654w = iVar.f72637w;
                    this.f72641g &= -4097;
                } else {
                    if ((this.f72641g & 4096) != 4096) {
                        this.f72654w = new ArrayList(this.f72654w);
                        this.f72641g |= 4096;
                    }
                    this.f72654w.addAll(iVar.f72637w);
                }
            }
            if ((iVar.f72623f & 256) == 256) {
                z = true;
            }
            if (z) {
                C26026e eVar2 = iVar.f72638x;
                if ((this.f72641g & 8192) != 8192 || (eVar = this.f72655x) == C26026e.f72552h) {
                    this.f72655x = eVar2;
                } else {
                    C26026e.C26028b bVar = new C26026e.C26028b();
                    bVar.mo52886f(eVar);
                    bVar.mo52886f(eVar2);
                    this.f72655x = bVar.mo52885e();
                }
                this.f72641g |= 8192;
            }
            mo53568e(iVar);
            this.f74007d = this.f74007d.mo36541h(iVar.f72622e);
            return this;
        }

        /* renamed from: h */
        public C26043b mo52899h(C26586d dVar, C26589f fVar) {
            C26041i iVar;
            C26041i iVar2 = null;
            try {
                C26041i iVar3 = (C26041i) ((C26042a) C26041i.f72621B).mo52860a(dVar, fVar);
                if (iVar3 != null) {
                    mo52898g(iVar3);
                }
                return this;
            } catch (C26601j e) {
                iVar = (C26041i) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                iVar2 = iVar;
            }
            if (iVar2 != null) {
                mo52898g(iVar2);
            }
            throw th;
        }
    }

    static {
        C26041i iVar = new C26041i(true);
        f72620A = iVar;
        iVar.mo52896l();
    }

    public C26041i(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72634t = -1;
        this.f72639y = -1;
        this.f72640z = -1;
        this.f72622e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72623f & 2) == 2) {
            eVar.mo53539m(1, this.f72625h);
        }
        if ((this.f72623f & 4) == 4) {
            eVar.mo53539m(2, this.f72626i);
        }
        if ((this.f72623f & 8) == 8) {
            eVar.mo53541o(3, this.f72627j);
        }
        for (int i2 = 0; i2 < this.f72629o.size(); i2++) {
            eVar.mo53541o(4, this.f72629o.get(i2));
        }
        if ((this.f72623f & 32) == 32) {
            eVar.mo53541o(5, this.f72630p);
        }
        for (int i3 = 0; i3 < this.f72635u.size(); i3++) {
            eVar.mo53541o(6, this.f72635u.get(i3));
        }
        if ((this.f72623f & 16) == 16) {
            eVar.mo53539m(7, this.f72628n);
        }
        if ((this.f72623f & 64) == 64) {
            eVar.mo53539m(8, this.f72631q);
        }
        if ((this.f72623f & 1) == 1) {
            eVar.mo53539m(9, this.f72624g);
        }
        for (int i4 = 0; i4 < this.f72632r.size(); i4++) {
            eVar.mo53541o(10, this.f72632r.get(i4));
        }
        if (this.f72633s.size() > 0) {
            eVar.mo53548v(90);
            eVar.mo53548v(this.f72634t);
        }
        for (int i5 = 0; i5 < this.f72633s.size(); i5++) {
            eVar.mo53540n(this.f72633s.get(i5).intValue());
        }
        if ((this.f72623f & 128) == 128) {
            eVar.mo53541o(30, this.f72636v);
        }
        for (int i6 = 0; i6 < this.f72637w.size(); i6++) {
            eVar.mo53539m(31, this.f72637w.get(i6).intValue());
        }
        if ((this.f72623f & 256) == 256) {
            eVar.mo53541o(32, this.f72638x);
        }
        i.mo53577a(19000, eVar);
        eVar.mo53544r(this.f72622e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72620A;
    }

    public int getSerializedSize() {
        int i = this.f72640z;
        if (i != -1) {
            return i;
        }
        int b = (this.f72623f & 2) == 2 ? C26587e.m34405b(1, this.f72625h) + 0 : 0;
        if ((this.f72623f & 4) == 4) {
            b += C26587e.m34405b(2, this.f72626i);
        }
        if ((this.f72623f & 8) == 8) {
            b += C26587e.m34407d(3, this.f72627j);
        }
        for (int i2 = 0; i2 < this.f72629o.size(); i2++) {
            b += C26587e.m34407d(4, this.f72629o.get(i2));
        }
        if ((this.f72623f & 32) == 32) {
            b += C26587e.m34407d(5, this.f72630p);
        }
        for (int i3 = 0; i3 < this.f72635u.size(); i3++) {
            b += C26587e.m34407d(6, this.f72635u.get(i3));
        }
        if ((this.f72623f & 16) == 16) {
            b += C26587e.m34405b(7, this.f72628n);
        }
        if ((this.f72623f & 64) == 64) {
            b += C26587e.m34405b(8, this.f72631q);
        }
        if ((this.f72623f & 1) == 1) {
            b += C26587e.m34405b(9, this.f72624g);
        }
        for (int i4 = 0; i4 < this.f72632r.size(); i4++) {
            b += C26587e.m34407d(10, this.f72632r.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f72633s.size(); i6++) {
            i5 += C26587e.m34406c(this.f72633s.get(i6).intValue());
        }
        int i7 = b + i5;
        if (!this.f72633s.isEmpty()) {
            i7 = i7 + 1 + C26587e.m34406c(i5);
        }
        this.f72634t = i5;
        if ((this.f72623f & 128) == 128) {
            i7 += C26587e.m34407d(30, this.f72636v);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f72637w.size(); i9++) {
            i8 += C26587e.m34406c(this.f72637w.get(i9).intValue());
        }
        int size = i7 + i8 + (this.f72637w.size() * 2);
        if ((this.f72623f & 256) == 256) {
            size += C26587e.m34407d(32, this.f72638x);
        }
        int e = size + mo53570e() + this.f72622e.size();
        this.f72640z = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72639y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f72623f;
        if (!((i & 4) == 4)) {
            this.f72639y = 0;
            return false;
        }
        if (!((i & 8) == 8) || this.f72627j.isInitialized()) {
            for (int i2 = 0; i2 < this.f72629o.size(); i2++) {
                if (!this.f72629o.get(i2).isInitialized()) {
                    this.f72639y = 0;
                    return false;
                }
            }
            if (!((this.f72623f & 32) == 32) || this.f72630p.isInitialized()) {
                for (int i3 = 0; i3 < this.f72632r.size(); i3++) {
                    if (!this.f72632r.get(i3).isInitialized()) {
                        this.f72639y = 0;
                        return false;
                    }
                }
                for (int i4 = 0; i4 < this.f72635u.size(); i4++) {
                    if (!this.f72635u.get(i4).isInitialized()) {
                        this.f72639y = 0;
                        return false;
                    }
                }
                if (!((this.f72623f & 128) == 128) || this.f72636v.isInitialized()) {
                    if (((this.f72623f & 256) == 256) && !this.f72638x.isInitialized()) {
                        this.f72639y = 0;
                        return false;
                    } else if (!mo53569d()) {
                        this.f72639y = 0;
                        return false;
                    } else {
                        this.f72639y = 1;
                        return true;
                    }
                } else {
                    this.f72639y = 0;
                    return false;
                }
            } else {
                this.f72639y = 0;
                return false;
            }
        } else {
            this.f72639y = 0;
            return false;
        }
    }

    /* renamed from: l */
    public final void mo52896l() {
        this.f72624g = 6;
        this.f72625h = 6;
        this.f72626i = 0;
        C26065q qVar = C26065q.f72763z;
        this.f72627j = qVar;
        this.f72628n = 0;
        this.f72629o = Collections.emptyList();
        this.f72630p = qVar;
        this.f72631q = 0;
        this.f72632r = Collections.emptyList();
        this.f72633s = Collections.emptyList();
        this.f72635u = Collections.emptyList();
        this.f72636v = C26079t.f72866j;
        this.f72637w = Collections.emptyList();
        this.f72638x = C26026e.f72552h;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26043b();
    }

    public C26607p.C26608a toBuilder() {
        C26043b bVar = new C26043b();
        bVar.mo52898g(this);
        return bVar;
    }

    public C26041i(boolean z) {
        this.f72634t = -1;
        this.f72639y = -1;
        this.f72640z = -1;
        this.f72622e = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: qz3.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: qz3.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: qz3.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: qz3.e$b} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v29 */
    /* JADX WARNING: type inference failed for: r10v30 */
    /* JADX WARNING: type inference failed for: r10v31 */
    /* JADX WARNING: type inference failed for: r10v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26041i(xz3.C26586d r13, xz3.C26589f r14, qz3.C26008a r15) {
        /*
            r12 = this;
            r12.<init>()
            r15 = -1
            r12.f72634t = r15
            r12.f72639y = r15
            r12.f72640z = r15
            r12.mo52896l()
            xz3.c$b r15 = xz3.C23156c.m27503p()
            r0 = 1
            xz3.e r1 = xz3.C26587e.m34412j(r15, r0)
            r2 = 0
            r3 = 0
        L_0x0018:
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 256(0x100, float:3.59E-43)
            r6 = 32
            r7 = 4096(0x1000, float:5.74E-42)
            r8 = 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0282
            int r9 = r13.mo53530n()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10 = 0
            switch(r9) {
                case 0: goto L_0x021d;
                case 8: goto L_0x020d;
                case 16: goto L_0x01ff;
                case 26: goto L_0x01d3;
                case 34: goto L_0x01b9;
                case 42: goto L_0x018f;
                case 50: goto L_0x0175;
                case 56: goto L_0x0167;
                case 64: goto L_0x0159;
                case 72: goto L_0x014c;
                case 82: goto L_0x0132;
                case 88: goto L_0x0116;
                case 90: goto L_0x00e2;
                case 242: goto L_0x00b6;
                case 248: goto L_0x009a;
                case 250: goto L_0x0066;
                case 258: goto L_0x0032;
                default: goto L_0x002c;
            }     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x002c:
            boolean r4 = r12.mo53575j(r13, r1, r14, r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x021b
        L_0x0032:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 & r5
            if (r9 != r5) goto L_0x004b
            qz3.e r9 = r12.f72638x     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.getClass()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.e$b r10 = new qz3.e$b     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10.mo52886f(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x004b
        L_0x0045:
            r13 = move-exception
            goto L_0x0230
        L_0x0048:
            r13 = move-exception
            goto L_0x0220
        L_0x004b:
            xz3.r<qz3.e> r9 = qz3.C26026e.f72553i     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r9 = r13.mo53523g(r9, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.e r9 = (qz3.C26026e) r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72638x = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 == 0) goto L_0x0060
            r10.mo52886f(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.e r9 = r10.mo52885e()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72638x = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x0060:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | r5
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x0066:
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53520d(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10 = r3 & 4096(0x1000, float:5.74E-42)
            if (r10 == r7) goto L_0x0081
            int r10 = r13.mo53518b()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 <= 0) goto L_0x0081
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72637w = r10     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L_0x0081:
            int r10 = r13.mo53518b()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 <= 0) goto L_0x0095
            java.util.List<java.lang.Integer> r10 = r12.f72637w     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r11 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10.add(r11)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0081
        L_0x0095:
            r13.mo53519c(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x009a:
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            if (r9 == r7) goto L_0x00a7
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72637w = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L_0x00a7:
            java.util.List<java.lang.Integer> r9 = r12.f72637w     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r10 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.add(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x00b6:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r11 = 128(0x80, float:1.794E-43)
            r9 = r9 & r11
            if (r9 != r11) goto L_0x00c6
            qz3.t r9 = r12.f72636v     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.getClass()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.t$b r10 = qz3.C26079t.m33383d(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x00c6:
            xz3.r<qz3.t> r9 = qz3.C26079t.f72867n     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r9 = r13.mo53523g(r9, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.t r9 = (qz3.C26079t) r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72636v = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 == 0) goto L_0x00db
            r10.mo52937f(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.t r9 = r10.mo52936e()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72636v = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x00db:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | r11
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x00e2:
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53520d(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10 = r3 & 512(0x200, float:7.175E-43)
            if (r10 == r8) goto L_0x00fd
            int r10 = r13.mo53518b()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 <= 0) goto L_0x00fd
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72633s = r10     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00fd:
            int r10 = r13.mo53518b()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 <= 0) goto L_0x0111
            java.util.List<java.lang.Integer> r10 = r12.f72633s     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r11 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r10.add(r11)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x00fd
        L_0x0111:
            r13.mo53519c(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x0116:
            r9 = r3 & 512(0x200, float:7.175E-43)
            if (r9 == r8) goto L_0x0123
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72633s = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x0123:
            java.util.List<java.lang.Integer> r9 = r12.f72633s     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r10 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.add(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x0132:
            r9 = r3 & 256(0x100, float:3.59E-43)
            if (r9 == r5) goto L_0x013f
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72632r = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x013f:
            java.util.List<qz3.q> r9 = r12.f72632r     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.r<qz3.q> r10 = qz3.C26065q.f72762A     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r10 = r13.mo53523g(r10, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.add(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x014c:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | r0
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72624g = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x0159:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | 64
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72631q = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x0167:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | 16
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72628n = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x0175:
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == r4) goto L_0x0182
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72635u = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L_0x0182:
            java.util.List<qz3.u> r9 = r12.f72635u     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.r<qz3.u> r10 = qz3.C26082u.f72878s     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r10 = r13.mo53523g(r10, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.add(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x018f:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 & r6
            if (r9 != r6) goto L_0x019d
            qz3.q r9 = r12.f72630p     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.getClass()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.q$c r10 = qz3.C26065q.m33342n(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x019d:
            xz3.r<qz3.q> r9 = qz3.C26065q.f72762A     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r9 = r13.mo53523g(r9, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.q r9 = (qz3.C26065q) r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72630p = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 == 0) goto L_0x01b2
            r10.mo52866d(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.q r9 = r10.mo52925f()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72630p = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x01b2:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | r6
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x01b9:
            r9 = r3 & 32
            if (r9 == r6) goto L_0x01c6
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.<init>()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72629o = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r3 = r3 | 32
        L_0x01c6:
            java.util.List<qz3.s> r9 = r12.f72629o     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.r<qz3.s> r10 = qz3.C26075s.f72842t     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r10 = r13.mo53523g(r10, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.add(r10)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x01d3:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r11 = 8
            r9 = r9 & r11
            if (r9 != r11) goto L_0x01e3
            qz3.q r9 = r12.f72627j     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9.getClass()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.q$c r10 = qz3.C26065q.m33342n(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x01e3:
            xz3.r<qz3.q> r9 = qz3.C26065q.f72762A     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            xz3.p r9 = r13.mo53523g(r9, r14)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.q r9 = (qz3.C26065q) r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72627j = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            if (r10 == 0) goto L_0x01f8
            r10.mo52866d(r9)     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            qz3.q r9 = r10.mo52925f()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72627j = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
        L_0x01f8:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | r11
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x01ff:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | 4
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72626i = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x020d:
            int r9 = r12.f72623f     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r9 = r9 | 2
            r12.f72623f = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            int r9 = r13.mo53527k()     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            r12.f72625h = r9     // Catch:{ j -> 0x022c, IOException -> 0x0048 }
            goto L_0x0018
        L_0x021b:
            if (r4 != 0) goto L_0x0018
        L_0x021d:
            r2 = 1
            goto L_0x0018
        L_0x0220:
            xz3.j r14 = new xz3.j     // Catch:{ all -> 0x0045 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0045 }
            r14.<init>(r13)     // Catch:{ all -> 0x0045 }
            r14.f74023d = r12     // Catch:{ all -> 0x0045 }
            throw r14     // Catch:{ all -> 0x0045 }
        L_0x022c:
            r13 = move-exception
            r13.f74023d = r12     // Catch:{ all -> 0x0045 }
            throw r13     // Catch:{ all -> 0x0045 }
        L_0x0230:
            r14 = r3 & 32
            if (r14 != r6) goto L_0x023c
            java.util.List<qz3.s> r14 = r12.f72629o
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f72629o = r14
        L_0x023c:
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 != r4) goto L_0x0248
            java.util.List<qz3.u> r14 = r12.f72635u
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f72635u = r14
        L_0x0248:
            r14 = r3 & 256(0x100, float:3.59E-43)
            if (r14 != r5) goto L_0x0254
            java.util.List<qz3.q> r14 = r12.f72632r
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f72632r = r14
        L_0x0254:
            r14 = r3 & 512(0x200, float:7.175E-43)
            if (r14 != r8) goto L_0x0260
            java.util.List<java.lang.Integer> r14 = r12.f72633s
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f72633s = r14
        L_0x0260:
            r14 = r3 & 4096(0x1000, float:5.74E-42)
            if (r14 != r7) goto L_0x026c
            java.util.List<java.lang.Integer> r14 = r12.f72637w
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f72637w = r14
        L_0x026c:
            r1.mo53536i()     // Catch:{ IOException -> 0x0278, all -> 0x0270 }
            goto L_0x0278
        L_0x0270:
            r13 = move-exception
            xz3.c r14 = r15.mo36559c()
            r12.f72622e = r14
            throw r13
        L_0x0278:
            xz3.c r14 = r15.mo36559c()
            r12.f72622e = r14
            r12.mo53573h()
            throw r13
        L_0x0282:
            r13 = r3 & 32
            if (r13 != r6) goto L_0x028e
            java.util.List<qz3.s> r13 = r12.f72629o
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f72629o = r13
        L_0x028e:
            r13 = r3 & 1024(0x400, float:1.435E-42)
            if (r13 != r4) goto L_0x029a
            java.util.List<qz3.u> r13 = r12.f72635u
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f72635u = r13
        L_0x029a:
            r13 = r3 & 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L_0x02a6
            java.util.List<qz3.q> r13 = r12.f72632r
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f72632r = r13
        L_0x02a6:
            r13 = r3 & 512(0x200, float:7.175E-43)
            if (r13 != r8) goto L_0x02b2
            java.util.List<java.lang.Integer> r13 = r12.f72633s
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f72633s = r13
        L_0x02b2:
            r13 = r3 & 4096(0x1000, float:5.74E-42)
            if (r13 != r7) goto L_0x02be
            java.util.List<java.lang.Integer> r13 = r12.f72637w
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f72637w = r13
        L_0x02be:
            r1.mo53536i()     // Catch:{ IOException -> 0x02ca, all -> 0x02c2 }
            goto L_0x02ca
        L_0x02c2:
            r13 = move-exception
            xz3.c r14 = r15.mo36559c()
            r12.f72622e = r14
            throw r13
        L_0x02ca:
            xz3.c r13 = r15.mo36559c()
            r12.f72622e = r13
            r12.mo53573h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26041i.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
