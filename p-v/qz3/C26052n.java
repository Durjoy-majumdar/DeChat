package qz3;

import em0.C86569o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qz3.C26065q;
import qz3.C26082u;
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

/* renamed from: qz3.n */
public final class C26052n extends C26593h.C26597d<C26052n> {

    /* renamed from: A */
    public static final C26052n f72692A;

    /* renamed from: B */
    public static C26610r<C26052n> f72693B = new C26053a();

    /* renamed from: e */
    public final C23156c f72694e;

    /* renamed from: f */
    public int f72695f;

    /* renamed from: g */
    public int f72696g;

    /* renamed from: h */
    public int f72697h;

    /* renamed from: i */
    public int f72698i;

    /* renamed from: j */
    public C26065q f72699j;

    /* renamed from: n */
    public int f72700n;

    /* renamed from: o */
    public List<C26075s> f72701o;

    /* renamed from: p */
    public C26065q f72702p;

    /* renamed from: q */
    public int f72703q;

    /* renamed from: r */
    public List<C26065q> f72704r;

    /* renamed from: s */
    public List<Integer> f72705s;

    /* renamed from: t */
    public int f72706t;

    /* renamed from: u */
    public C26082u f72707u;

    /* renamed from: v */
    public int f72708v;

    /* renamed from: w */
    public int f72709w;

    /* renamed from: x */
    public List<Integer> f72710x;

    /* renamed from: y */
    public byte f72711y;

    /* renamed from: z */
    public int f72712z;

    /* renamed from: qz3.n$a */
    public static class C26053a extends C26585b<C26052n> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26052n(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.n$b */
    public static final class C26054b extends C26593h.C26596c<C26052n, C26054b> {

        /* renamed from: g */
        public int f72713g;

        /* renamed from: h */
        public int f72714h = C86569o.CTRL_INDEX;

        /* renamed from: i */
        public int f72715i = 2054;

        /* renamed from: j */
        public int f72716j;

        /* renamed from: n */
        public C26065q f72717n;

        /* renamed from: o */
        public int f72718o;

        /* renamed from: p */
        public List<C26075s> f72719p;

        /* renamed from: q */
        public C26065q f72720q;

        /* renamed from: r */
        public int f72721r;

        /* renamed from: s */
        public List<C26065q> f72722s;

        /* renamed from: t */
        public List<Integer> f72723t;

        /* renamed from: u */
        public C26082u f72724u;

        /* renamed from: v */
        public int f72725v;

        /* renamed from: w */
        public int f72726w;

        /* renamed from: x */
        public List<Integer> f72727x;

        public C26054b() {
            C26065q qVar = C26065q.f72763z;
            this.f72717n = qVar;
            this.f72719p = Collections.emptyList();
            this.f72720q = qVar;
            this.f72722s = Collections.emptyList();
            this.f72723t = Collections.emptyList();
            this.f72724u = C26082u.f72877r;
            this.f72727x = Collections.emptyList();
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52909h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52909h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26052n f = mo52907f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26054b bVar = new C26054b();
            bVar.mo52908g(mo52907f());
            return bVar;
        }

        public Object clone() {
            C26054b bVar = new C26054b();
            bVar.mo52908g(mo52907f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52908g((C26052n) hVar);
            return this;
        }

        /* renamed from: f */
        public C26052n mo52907f() {
            C26052n nVar = new C26052n(this, (C26008a) null);
            int i = this.f72713g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            nVar.f72696g = this.f72714h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            nVar.f72697h = this.f72715i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            nVar.f72698i = this.f72716j;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            nVar.f72699j = this.f72717n;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            nVar.f72700n = this.f72718o;
            if ((i & 32) == 32) {
                this.f72719p = Collections.unmodifiableList(this.f72719p);
                this.f72713g &= -33;
            }
            nVar.f72701o = this.f72719p;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            nVar.f72702p = this.f72720q;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            nVar.f72703q = this.f72721r;
            if ((this.f72713g & 256) == 256) {
                this.f72722s = Collections.unmodifiableList(this.f72722s);
                this.f72713g &= -257;
            }
            nVar.f72704r = this.f72722s;
            if ((this.f72713g & 512) == 512) {
                this.f72723t = Collections.unmodifiableList(this.f72723t);
                this.f72713g &= -513;
            }
            nVar.f72705s = this.f72723t;
            if ((i & 1024) == 1024) {
                i2 |= 128;
            }
            nVar.f72707u = this.f72724u;
            if ((i & 2048) == 2048) {
                i2 |= 256;
            }
            nVar.f72708v = this.f72725v;
            if ((i & 4096) == 4096) {
                i2 |= 512;
            }
            nVar.f72709w = this.f72726w;
            if ((this.f72713g & 8192) == 8192) {
                this.f72727x = Collections.unmodifiableList(this.f72727x);
                this.f72713g &= -8193;
            }
            nVar.f72710x = this.f72727x;
            nVar.f72695f = i2;
            return nVar;
        }

        /* renamed from: g */
        public C26054b mo52908g(C26052n nVar) {
            C26082u uVar;
            C26065q qVar;
            C26065q qVar2;
            if (nVar == C26052n.f72692A) {
                return this;
            }
            int i = nVar.f72695f;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = nVar.f72696g;
                this.f72713g |= 1;
                this.f72714h = i2;
            }
            if ((i & 2) == 2) {
                int i3 = nVar.f72697h;
                this.f72713g = 2 | this.f72713g;
                this.f72715i = i3;
            }
            if ((i & 4) == 4) {
                int i4 = nVar.f72698i;
                this.f72713g = 4 | this.f72713g;
                this.f72716j = i4;
            }
            if ((i & 8) == 8) {
                C26065q qVar3 = nVar.f72699j;
                if ((this.f72713g & 8) != 8 || (qVar2 = this.f72717n) == C26065q.f72763z) {
                    this.f72717n = qVar3;
                } else {
                    C26065q.C26071c n = C26065q.m33342n(qVar2);
                    n.mo52866d(qVar3);
                    this.f72717n = n.mo52925f();
                }
                this.f72713g |= 8;
            }
            if ((nVar.f72695f & 16) == 16) {
                int i5 = nVar.f72700n;
                this.f72713g = 16 | this.f72713g;
                this.f72718o = i5;
            }
            if (!nVar.f72701o.isEmpty()) {
                if (this.f72719p.isEmpty()) {
                    this.f72719p = nVar.f72701o;
                    this.f72713g &= -33;
                } else {
                    if ((this.f72713g & 32) != 32) {
                        this.f72719p = new ArrayList(this.f72719p);
                        this.f72713g |= 32;
                    }
                    this.f72719p.addAll(nVar.f72701o);
                }
            }
            if ((nVar.f72695f & 32) == 32) {
                C26065q qVar4 = nVar.f72702p;
                if ((this.f72713g & 64) != 64 || (qVar = this.f72720q) == C26065q.f72763z) {
                    this.f72720q = qVar4;
                } else {
                    C26065q.C26071c n2 = C26065q.m33342n(qVar);
                    n2.mo52866d(qVar4);
                    this.f72720q = n2.mo52925f();
                }
                this.f72713g |= 64;
            }
            if ((nVar.f72695f & 64) == 64) {
                int i6 = nVar.f72703q;
                this.f72713g |= 128;
                this.f72721r = i6;
            }
            if (!nVar.f72704r.isEmpty()) {
                if (this.f72722s.isEmpty()) {
                    this.f72722s = nVar.f72704r;
                    this.f72713g &= -257;
                } else {
                    if ((this.f72713g & 256) != 256) {
                        this.f72722s = new ArrayList(this.f72722s);
                        this.f72713g |= 256;
                    }
                    this.f72722s.addAll(nVar.f72704r);
                }
            }
            if (!nVar.f72705s.isEmpty()) {
                if (this.f72723t.isEmpty()) {
                    this.f72723t = nVar.f72705s;
                    this.f72713g &= -513;
                } else {
                    if ((this.f72713g & 512) != 512) {
                        this.f72723t = new ArrayList(this.f72723t);
                        this.f72713g |= 512;
                    }
                    this.f72723t.addAll(nVar.f72705s);
                }
            }
            if ((nVar.f72695f & 128) == 128) {
                C26082u uVar2 = nVar.f72707u;
                if ((this.f72713g & 1024) != 1024 || (uVar = this.f72724u) == C26082u.f72877r) {
                    this.f72724u = uVar2;
                } else {
                    C26082u.C26084b bVar = new C26082u.C26084b();
                    bVar.mo52940g(uVar);
                    bVar.mo52940g(uVar2);
                    this.f72724u = bVar.mo52939f();
                }
                this.f72713g |= 1024;
            }
            int i7 = nVar.f72695f;
            if ((i7 & 256) == 256) {
                int i8 = nVar.f72708v;
                this.f72713g |= 2048;
                this.f72725v = i8;
            }
            if ((i7 & 512) == 512) {
                z = true;
            }
            if (z) {
                int i9 = nVar.f72709w;
                this.f72713g |= 4096;
                this.f72726w = i9;
            }
            if (!nVar.f72710x.isEmpty()) {
                if (this.f72727x.isEmpty()) {
                    this.f72727x = nVar.f72710x;
                    this.f72713g &= -8193;
                } else {
                    if ((this.f72713g & 8192) != 8192) {
                        this.f72727x = new ArrayList(this.f72727x);
                        this.f72713g |= 8192;
                    }
                    this.f72727x.addAll(nVar.f72710x);
                }
            }
            mo53568e(nVar);
            this.f74007d = this.f74007d.mo36541h(nVar.f72694e);
            return this;
        }

        /* renamed from: h */
        public C26054b mo52909h(C26586d dVar, C26589f fVar) {
            C26052n nVar;
            C26052n nVar2 = null;
            try {
                C26052n nVar3 = (C26052n) ((C26053a) C26052n.f72693B).mo52860a(dVar, fVar);
                if (nVar3 != null) {
                    mo52908g(nVar3);
                }
                return this;
            } catch (C26601j e) {
                nVar = (C26052n) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                mo52908g(nVar2);
            }
            throw th;
        }
    }

    static {
        C26052n nVar = new C26052n(true);
        f72692A = nVar;
        nVar.mo52906l();
    }

    public C26052n(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72706t = -1;
        this.f72711y = -1;
        this.f72712z = -1;
        this.f72694e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72695f & 2) == 2) {
            eVar.mo53539m(1, this.f72697h);
        }
        if ((this.f72695f & 4) == 4) {
            eVar.mo53539m(2, this.f72698i);
        }
        if ((this.f72695f & 8) == 8) {
            eVar.mo53541o(3, this.f72699j);
        }
        for (int i2 = 0; i2 < this.f72701o.size(); i2++) {
            eVar.mo53541o(4, this.f72701o.get(i2));
        }
        if ((this.f72695f & 32) == 32) {
            eVar.mo53541o(5, this.f72702p);
        }
        if ((this.f72695f & 128) == 128) {
            eVar.mo53541o(6, this.f72707u);
        }
        if ((this.f72695f & 256) == 256) {
            eVar.mo53539m(7, this.f72708v);
        }
        if ((this.f72695f & 512) == 512) {
            eVar.mo53539m(8, this.f72709w);
        }
        if ((this.f72695f & 16) == 16) {
            eVar.mo53539m(9, this.f72700n);
        }
        if ((this.f72695f & 64) == 64) {
            eVar.mo53539m(10, this.f72703q);
        }
        if ((this.f72695f & 1) == 1) {
            eVar.mo53539m(11, this.f72696g);
        }
        for (int i3 = 0; i3 < this.f72704r.size(); i3++) {
            eVar.mo53541o(12, this.f72704r.get(i3));
        }
        if (this.f72705s.size() > 0) {
            eVar.mo53548v(106);
            eVar.mo53548v(this.f72706t);
        }
        for (int i4 = 0; i4 < this.f72705s.size(); i4++) {
            eVar.mo53540n(this.f72705s.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.f72710x.size(); i5++) {
            eVar.mo53539m(31, this.f72710x.get(i5).intValue());
        }
        i.mo53577a(19000, eVar);
        eVar.mo53544r(this.f72694e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72692A;
    }

    public int getSerializedSize() {
        int i = this.f72712z;
        if (i != -1) {
            return i;
        }
        int b = (this.f72695f & 2) == 2 ? C26587e.m34405b(1, this.f72697h) + 0 : 0;
        if ((this.f72695f & 4) == 4) {
            b += C26587e.m34405b(2, this.f72698i);
        }
        if ((this.f72695f & 8) == 8) {
            b += C26587e.m34407d(3, this.f72699j);
        }
        for (int i2 = 0; i2 < this.f72701o.size(); i2++) {
            b += C26587e.m34407d(4, this.f72701o.get(i2));
        }
        if ((this.f72695f & 32) == 32) {
            b += C26587e.m34407d(5, this.f72702p);
        }
        if ((this.f72695f & 128) == 128) {
            b += C26587e.m34407d(6, this.f72707u);
        }
        if ((this.f72695f & 256) == 256) {
            b += C26587e.m34405b(7, this.f72708v);
        }
        if ((this.f72695f & 512) == 512) {
            b += C26587e.m34405b(8, this.f72709w);
        }
        if ((this.f72695f & 16) == 16) {
            b += C26587e.m34405b(9, this.f72700n);
        }
        if ((this.f72695f & 64) == 64) {
            b += C26587e.m34405b(10, this.f72703q);
        }
        if ((this.f72695f & 1) == 1) {
            b += C26587e.m34405b(11, this.f72696g);
        }
        for (int i3 = 0; i3 < this.f72704r.size(); i3++) {
            b += C26587e.m34407d(12, this.f72704r.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f72705s.size(); i5++) {
            i4 += C26587e.m34406c(this.f72705s.get(i5).intValue());
        }
        int i6 = b + i4;
        if (!this.f72705s.isEmpty()) {
            i6 = i6 + 1 + C26587e.m34406c(i4);
        }
        this.f72706t = i4;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f72710x.size(); i8++) {
            i7 += C26587e.m34406c(this.f72710x.get(i8).intValue());
        }
        int size = i6 + i7 + (this.f72710x.size() * 2) + mo53570e() + this.f72694e.size();
        this.f72712z = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72711y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f72695f;
        if (!((i & 4) == 4)) {
            this.f72711y = 0;
            return false;
        }
        if (!((i & 8) == 8) || this.f72699j.isInitialized()) {
            for (int i2 = 0; i2 < this.f72701o.size(); i2++) {
                if (!this.f72701o.get(i2).isInitialized()) {
                    this.f72711y = 0;
                    return false;
                }
            }
            if (!((this.f72695f & 32) == 32) || this.f72702p.isInitialized()) {
                for (int i3 = 0; i3 < this.f72704r.size(); i3++) {
                    if (!this.f72704r.get(i3).isInitialized()) {
                        this.f72711y = 0;
                        return false;
                    }
                }
                if (((this.f72695f & 128) == 128) && !this.f72707u.isInitialized()) {
                    this.f72711y = 0;
                    return false;
                } else if (!mo53569d()) {
                    this.f72711y = 0;
                    return false;
                } else {
                    this.f72711y = 1;
                    return true;
                }
            } else {
                this.f72711y = 0;
                return false;
            }
        } else {
            this.f72711y = 0;
            return false;
        }
    }

    /* renamed from: l */
    public final void mo52906l() {
        this.f72696g = C86569o.CTRL_INDEX;
        this.f72697h = 2054;
        this.f72698i = 0;
        C26065q qVar = C26065q.f72763z;
        this.f72699j = qVar;
        this.f72700n = 0;
        this.f72701o = Collections.emptyList();
        this.f72702p = qVar;
        this.f72703q = 0;
        this.f72704r = Collections.emptyList();
        this.f72705s = Collections.emptyList();
        this.f72707u = C26082u.f72877r;
        this.f72708v = 0;
        this.f72709w = 0;
        this.f72710x = Collections.emptyList();
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26054b();
    }

    public C26607p.C26608a toBuilder() {
        C26054b bVar = new C26054b();
        bVar.mo52908g(this);
        return bVar;
    }

    public C26052n(boolean z) {
        this.f72706t = -1;
        this.f72711y = -1;
        this.f72712z = -1;
        this.f72694e = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: qz3.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: qz3.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: qz3.u$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26052n(xz3.C26586d r12, xz3.C26589f r13, qz3.C26008a r14) {
        /*
            r11 = this;
            r11.<init>()
            r14 = -1
            r11.f72706t = r14
            r11.f72711y = r14
            r11.f72712z = r14
            r11.mo52906l()
            xz3.c$b r14 = xz3.C23156c.m27503p()
            r0 = 1
            xz3.e r1 = xz3.C26587e.m34412j(r14, r0)
            r2 = 0
            r3 = 0
        L_0x0018:
            r4 = 256(0x100, float:3.59E-43)
            r5 = 32
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0249
            int r8 = r12.mo53530n()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9 = 0
            switch(r8) {
                case 0: goto L_0x01f0;
                case 8: goto L_0x01e0;
                case 16: goto L_0x01d2;
                case 26: goto L_0x01a6;
                case 34: goto L_0x018c;
                case 42: goto L_0x0162;
                case 50: goto L_0x012b;
                case 56: goto L_0x011e;
                case 64: goto L_0x0111;
                case 72: goto L_0x0103;
                case 80: goto L_0x00f5;
                case 88: goto L_0x00e8;
                case 98: goto L_0x00ce;
                case 104: goto L_0x00b2;
                case 106: goto L_0x007e;
                case 248: goto L_0x0063;
                case 250: goto L_0x0030;
                default: goto L_0x002a;
            }     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
        L_0x002a:
            boolean r4 = r11.mo53575j(r12, r1, r13, r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x01ee
        L_0x0030:
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53520d(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r9 == r6) goto L_0x004b
            int r9 = r12.mo53518b()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 <= 0) goto L_0x004b
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72710x = r9     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
        L_0x004b:
            int r9 = r12.mo53518b()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 <= 0) goto L_0x005f
            java.util.List<java.lang.Integer> r9 = r11.f72710x     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r10 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9.add(r10)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x004b
        L_0x005f:
            r12.mo53519c(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x0063:
            r8 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r8 == r6) goto L_0x0070
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72710x = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            java.util.List<java.lang.Integer> r8 = r11.f72710x     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r9 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.add(r9)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x007e:
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53520d(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9 = r3 & 512(0x200, float:7.175E-43)
            if (r9 == r7) goto L_0x0099
            int r9 = r12.mo53518b()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 <= 0) goto L_0x0099
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72705s = r9     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x0099:
            int r9 = r12.mo53518b()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 <= 0) goto L_0x00ad
            java.util.List<java.lang.Integer> r9 = r11.f72705s     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r10 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9.add(r10)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0099
        L_0x00ad:
            r12.mo53519c(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x00b2:
            r8 = r3 & 512(0x200, float:7.175E-43)
            if (r8 == r7) goto L_0x00bf
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72705s = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00bf:
            java.util.List<java.lang.Integer> r8 = r11.f72705s     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r9 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.add(r9)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x00ce:
            r8 = r3 & 256(0x100, float:3.59E-43)
            if (r8 == r4) goto L_0x00db
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72704r = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x00db:
            java.util.List<qz3.q> r8 = r11.f72704r     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.r<qz3.q> r9 = qz3.C26065q.f72762A     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.p r9 = r12.mo53523g(r9, r13)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.add(r9)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x00e8:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | r0
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72696g = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x00f5:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | 64
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72703q = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x0103:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | 16
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72700n = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x0111:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | r7
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72709w = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x011e:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | r4
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72708v = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x012b:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r10 = 128(0x80, float:1.794E-43)
            r8 = r8 & r10
            if (r8 != r10) goto L_0x0146
            qz3.u r8 = r11.f72707u     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.getClass()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.u$b r9 = new qz3.u$b     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r9.mo52940g(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0146
        L_0x0140:
            r12 = move-exception
            goto L_0x0203
        L_0x0143:
            r12 = move-exception
            goto L_0x01f3
        L_0x0146:
            xz3.r<qz3.u> r8 = qz3.C26082u.f72878s     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.p r8 = r12.mo53523g(r8, r13)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.u r8 = (qz3.C26082u) r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72707u = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 == 0) goto L_0x015b
            r9.mo52940g(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.u r8 = r9.mo52939f()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72707u = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
        L_0x015b:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | r10
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x0162:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 & r5
            if (r8 != r5) goto L_0x0170
            qz3.q r8 = r11.f72702p     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.getClass()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.q$c r9 = qz3.C26065q.m33342n(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
        L_0x0170:
            xz3.r<qz3.q> r8 = qz3.C26065q.f72762A     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.p r8 = r12.mo53523g(r8, r13)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.q r8 = (qz3.C26065q) r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72702p = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 == 0) goto L_0x0185
            r9.mo52866d(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.q r8 = r9.mo52925f()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72702p = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
        L_0x0185:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | r5
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x018c:
            r8 = r3 & 32
            if (r8 == r5) goto L_0x0199
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.<init>()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72701o = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r3 = r3 | 32
        L_0x0199:
            java.util.List<qz3.s> r8 = r11.f72701o     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.r<qz3.s> r9 = qz3.C26075s.f72842t     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.p r9 = r12.mo53523g(r9, r13)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.add(r9)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x01a6:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r10 = 8
            r8 = r8 & r10
            if (r8 != r10) goto L_0x01b6
            qz3.q r8 = r11.f72699j     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8.getClass()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.q$c r9 = qz3.C26065q.m33342n(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
        L_0x01b6:
            xz3.r<qz3.q> r8 = qz3.C26065q.f72762A     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            xz3.p r8 = r12.mo53523g(r8, r13)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.q r8 = (qz3.C26065q) r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72699j = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            if (r9 == 0) goto L_0x01cb
            r9.mo52866d(r8)     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            qz3.q r8 = r9.mo52925f()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72699j = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
        L_0x01cb:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | r10
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x01d2:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | 4
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72698i = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x01e0:
            int r8 = r11.f72695f     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r8 = r8 | 2
            r11.f72695f = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            int r8 = r12.mo53527k()     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            r11.f72697h = r8     // Catch:{ j -> 0x01ff, IOException -> 0x0143 }
            goto L_0x0018
        L_0x01ee:
            if (r4 != 0) goto L_0x0018
        L_0x01f0:
            r2 = 1
            goto L_0x0018
        L_0x01f3:
            xz3.j r13 = new xz3.j     // Catch:{ all -> 0x0140 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0140 }
            r13.<init>(r12)     // Catch:{ all -> 0x0140 }
            r13.f74023d = r11     // Catch:{ all -> 0x0140 }
            throw r13     // Catch:{ all -> 0x0140 }
        L_0x01ff:
            r12 = move-exception
            r12.f74023d = r11     // Catch:{ all -> 0x0140 }
            throw r12     // Catch:{ all -> 0x0140 }
        L_0x0203:
            r13 = r3 & 32
            if (r13 != r5) goto L_0x020f
            java.util.List<qz3.s> r13 = r11.f72701o
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f72701o = r13
        L_0x020f:
            r13 = r3 & 256(0x100, float:3.59E-43)
            if (r13 != r4) goto L_0x021b
            java.util.List<qz3.q> r13 = r11.f72704r
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f72704r = r13
        L_0x021b:
            r13 = r3 & 512(0x200, float:7.175E-43)
            if (r13 != r7) goto L_0x0227
            java.util.List<java.lang.Integer> r13 = r11.f72705s
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f72705s = r13
        L_0x0227:
            r13 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r13 != r6) goto L_0x0233
            java.util.List<java.lang.Integer> r13 = r11.f72710x
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f72710x = r13
        L_0x0233:
            r1.mo53536i()     // Catch:{ IOException -> 0x023f, all -> 0x0237 }
            goto L_0x023f
        L_0x0237:
            r12 = move-exception
            xz3.c r13 = r14.mo36559c()
            r11.f72694e = r13
            throw r12
        L_0x023f:
            xz3.c r13 = r14.mo36559c()
            r11.f72694e = r13
            r11.mo53573h()
            throw r12
        L_0x0249:
            r12 = r3 & 32
            if (r12 != r5) goto L_0x0255
            java.util.List<qz3.s> r12 = r11.f72701o
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f72701o = r12
        L_0x0255:
            r12 = r3 & 256(0x100, float:3.59E-43)
            if (r12 != r4) goto L_0x0261
            java.util.List<qz3.q> r12 = r11.f72704r
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f72704r = r12
        L_0x0261:
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 != r7) goto L_0x026d
            java.util.List<java.lang.Integer> r12 = r11.f72705s
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f72705s = r12
        L_0x026d:
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 != r6) goto L_0x0279
            java.util.List<java.lang.Integer> r12 = r11.f72710x
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f72710x = r12
        L_0x0279:
            r1.mo53536i()     // Catch:{ IOException -> 0x0285, all -> 0x027d }
            goto L_0x0285
        L_0x027d:
            r12 = move-exception
            xz3.c r13 = r14.mo36559c()
            r11.f72694e = r13
            throw r12
        L_0x0285:
            xz3.c r12 = r14.mo36559c()
            r11.f72694e = r12
            r11.mo53573h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26052n.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
