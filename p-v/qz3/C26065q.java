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

/* renamed from: qz3.q */
public final class C26065q extends C26593h.C26597d<C26065q> {

    /* renamed from: A */
    public static C26610r<C26065q> f72762A = new C26066a();

    /* renamed from: z */
    public static final C26065q f72763z;

    /* renamed from: e */
    public final C23156c f72764e;

    /* renamed from: f */
    public int f72765f;

    /* renamed from: g */
    public List<C26067b> f72766g;

    /* renamed from: h */
    public boolean f72767h;

    /* renamed from: i */
    public int f72768i;

    /* renamed from: j */
    public C26065q f72769j;

    /* renamed from: n */
    public int f72770n;

    /* renamed from: o */
    public int f72771o;

    /* renamed from: p */
    public int f72772p;

    /* renamed from: q */
    public int f72773q;

    /* renamed from: r */
    public int f72774r;

    /* renamed from: s */
    public C26065q f72775s;

    /* renamed from: t */
    public int f72776t;

    /* renamed from: u */
    public C26065q f72777u;

    /* renamed from: v */
    public int f72778v;

    /* renamed from: w */
    public int f72779w;

    /* renamed from: x */
    public byte f72780x;

    /* renamed from: y */
    public int f72781y;

    /* renamed from: qz3.q$a */
    public static class C26066a extends C26585b<C26065q> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26065q(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.q$c */
    public static final class C26071c extends C26593h.C26596c<C26065q, C26071c> {

        /* renamed from: g */
        public int f72801g;

        /* renamed from: h */
        public List<C26067b> f72802h = Collections.emptyList();

        /* renamed from: i */
        public boolean f72803i;

        /* renamed from: j */
        public int f72804j;

        /* renamed from: n */
        public C26065q f72805n;

        /* renamed from: o */
        public int f72806o;

        /* renamed from: p */
        public int f72807p;

        /* renamed from: q */
        public int f72808q;

        /* renamed from: r */
        public int f72809r;

        /* renamed from: s */
        public int f72810s;

        /* renamed from: t */
        public C26065q f72811t;

        /* renamed from: u */
        public int f72812u;

        /* renamed from: v */
        public C26065q f72813v;

        /* renamed from: w */
        public int f72814w;

        /* renamed from: x */
        public int f72815x;

        public C26071c() {
            C26065q qVar = C26065q.f72763z;
            this.f72805n = qVar;
            this.f72811t = qVar;
            this.f72813v = qVar;
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52927h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52927h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26065q f = mo52925f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26071c cVar = new C26071c();
            cVar.mo52866d(mo52925f());
            return cVar;
        }

        public Object clone() {
            C26071c cVar = new C26071c();
            cVar.mo52866d(mo52925f());
            return cVar;
        }

        /* renamed from: f */
        public C26065q mo52925f() {
            C26065q qVar = new C26065q(this, (C26008a) null);
            int i = this.f72801g;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f72802h = Collections.unmodifiableList(this.f72802h);
                this.f72801g &= -2;
            }
            qVar.f72766g = this.f72802h;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            qVar.f72767h = this.f72803i;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            qVar.f72768i = this.f72804j;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            qVar.f72769j = this.f72805n;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            qVar.f72770n = this.f72806o;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            qVar.f72771o = this.f72807p;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            qVar.f72772p = this.f72808q;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            qVar.f72773q = this.f72809r;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            qVar.f72774r = this.f72810s;
            if ((i & 512) == 512) {
                i2 |= 256;
            }
            qVar.f72775s = this.f72811t;
            if ((i & 1024) == 1024) {
                i2 |= 512;
            }
            qVar.f72776t = this.f72812u;
            if ((i & 2048) == 2048) {
                i2 |= 1024;
            }
            qVar.f72777u = this.f72813v;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            qVar.f72778v = this.f72814w;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            qVar.f72779w = this.f72815x;
            qVar.f72765f = i2;
            return qVar;
        }

        /* renamed from: g */
        public C26071c mo52866d(C26065q qVar) {
            C26065q qVar2;
            C26065q qVar3;
            C26065q qVar4;
            C26065q qVar5 = C26065q.f72763z;
            if (qVar == qVar5) {
                return this;
            }
            boolean z = true;
            if (!qVar.f72766g.isEmpty()) {
                if (this.f72802h.isEmpty()) {
                    this.f72802h = qVar.f72766g;
                    this.f72801g &= -2;
                } else {
                    if ((this.f72801g & 1) != 1) {
                        this.f72802h = new ArrayList(this.f72802h);
                        this.f72801g |= 1;
                    }
                    this.f72802h.addAll(qVar.f72766g);
                }
            }
            int i = qVar.f72765f;
            if ((i & 1) == 1) {
                boolean z2 = qVar.f72767h;
                this.f72801g |= 2;
                this.f72803i = z2;
            }
            if ((i & 2) == 2) {
                int i2 = qVar.f72768i;
                this.f72801g |= 4;
                this.f72804j = i2;
            }
            if ((i & 4) == 4) {
                C26065q qVar6 = qVar.f72769j;
                if ((this.f72801g & 8) != 8 || (qVar4 = this.f72805n) == qVar5) {
                    this.f72805n = qVar6;
                } else {
                    C26071c n = C26065q.m33342n(qVar4);
                    n.mo52866d(qVar6);
                    this.f72805n = n.mo52925f();
                }
                this.f72801g |= 8;
            }
            if ((qVar.f72765f & 8) == 8) {
                int i3 = qVar.f72770n;
                this.f72801g |= 16;
                this.f72806o = i3;
            }
            if (qVar.mo52919l()) {
                int i4 = qVar.f72771o;
                this.f72801g |= 32;
                this.f72807p = i4;
            }
            int i5 = qVar.f72765f;
            if ((i5 & 32) == 32) {
                int i6 = qVar.f72772p;
                this.f72801g |= 64;
                this.f72808q = i6;
            }
            if ((i5 & 64) == 64) {
                int i7 = qVar.f72773q;
                this.f72801g |= 128;
                this.f72809r = i7;
            }
            if ((i5 & 128) == 128) {
                int i8 = qVar.f72774r;
                this.f72801g |= 256;
                this.f72810s = i8;
            }
            if ((i5 & 256) == 256) {
                C26065q qVar7 = qVar.f72775s;
                if ((this.f72801g & 512) != 512 || (qVar3 = this.f72811t) == qVar5) {
                    this.f72811t = qVar7;
                } else {
                    C26071c n2 = C26065q.m33342n(qVar3);
                    n2.mo52866d(qVar7);
                    this.f72811t = n2.mo52925f();
                }
                this.f72801g |= 512;
            }
            int i9 = qVar.f72765f;
            if ((i9 & 512) == 512) {
                int i15 = qVar.f72776t;
                this.f72801g |= 1024;
                this.f72812u = i15;
            }
            if ((i9 & 1024) == 1024) {
                C26065q qVar8 = qVar.f72777u;
                if ((this.f72801g & 2048) != 2048 || (qVar2 = this.f72813v) == qVar5) {
                    this.f72813v = qVar8;
                } else {
                    C26071c n3 = C26065q.m33342n(qVar2);
                    n3.mo52866d(qVar8);
                    this.f72813v = n3.mo52925f();
                }
                this.f72801g |= 2048;
            }
            int i16 = qVar.f72765f;
            if ((i16 & 2048) == 2048) {
                int i17 = qVar.f72778v;
                this.f72801g |= 4096;
                this.f72814w = i17;
            }
            if ((i16 & 4096) != 4096) {
                z = false;
            }
            if (z) {
                int i18 = qVar.f72779w;
                this.f72801g |= 8192;
                this.f72815x = i18;
            }
            mo53568e(qVar);
            this.f74007d = this.f74007d.mo36541h(qVar.f72764e);
            return this;
        }

        /* renamed from: h */
        public C26071c mo52927h(C26586d dVar, C26589f fVar) {
            C26065q qVar;
            C26065q qVar2 = null;
            try {
                C26065q qVar3 = (C26065q) ((C26066a) C26065q.f72762A).mo52860a(dVar, fVar);
                if (qVar3 != null) {
                    mo52866d(qVar3);
                }
                return this;
            } catch (C26601j e) {
                qVar = (C26065q) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                mo52866d(qVar2);
            }
            throw th;
        }
    }

    static {
        C26065q qVar = new C26065q(true);
        f72763z = qVar;
        qVar.mo52920m();
    }

    public C26065q(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72780x = -1;
        this.f72781y = -1;
        this.f72764e = cVar.f74007d;
    }

    /* renamed from: n */
    public static C26071c m33342n(C26065q qVar) {
        C26071c cVar = new C26071c();
        cVar.mo52866d(qVar);
        return cVar;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72765f & 4096) == 4096) {
            eVar.mo53539m(1, this.f72779w);
        }
        for (int i2 = 0; i2 < this.f72766g.size(); i2++) {
            eVar.mo53541o(2, this.f72766g.get(i2));
        }
        if ((this.f72765f & 1) == 1) {
            boolean z = this.f72767h;
            eVar.mo53550x(3, 0);
            eVar.mo53543q(z ? 1 : 0);
        }
        if ((this.f72765f & 2) == 2) {
            eVar.mo53539m(4, this.f72768i);
        }
        if ((this.f72765f & 4) == 4) {
            eVar.mo53541o(5, this.f72769j);
        }
        if ((this.f72765f & 16) == 16) {
            eVar.mo53539m(6, this.f72771o);
        }
        if ((this.f72765f & 32) == 32) {
            eVar.mo53539m(7, this.f72772p);
        }
        if ((this.f72765f & 8) == 8) {
            eVar.mo53539m(8, this.f72770n);
        }
        if ((this.f72765f & 64) == 64) {
            eVar.mo53539m(9, this.f72773q);
        }
        if ((this.f72765f & 256) == 256) {
            eVar.mo53541o(10, this.f72775s);
        }
        if ((this.f72765f & 512) == 512) {
            eVar.mo53539m(11, this.f72776t);
        }
        if ((this.f72765f & 128) == 128) {
            eVar.mo53539m(12, this.f72774r);
        }
        if ((this.f72765f & 1024) == 1024) {
            eVar.mo53541o(13, this.f72777u);
        }
        if ((this.f72765f & 2048) == 2048) {
            eVar.mo53539m(14, this.f72778v);
        }
        i.mo53577a(200, eVar);
        eVar.mo53544r(this.f72764e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72763z;
    }

    public int getSerializedSize() {
        int i = this.f72781y;
        if (i != -1) {
            return i;
        }
        int b = (this.f72765f & 4096) == 4096 ? C26587e.m34405b(1, this.f72779w) + 0 : 0;
        for (int i2 = 0; i2 < this.f72766g.size(); i2++) {
            b += C26587e.m34407d(2, this.f72766g.get(i2));
        }
        if ((this.f72765f & 1) == 1) {
            b += C26587e.m34411h(3) + 1;
        }
        if ((this.f72765f & 2) == 2) {
            b += C26587e.m34405b(4, this.f72768i);
        }
        if ((this.f72765f & 4) == 4) {
            b += C26587e.m34407d(5, this.f72769j);
        }
        if ((this.f72765f & 16) == 16) {
            b += C26587e.m34405b(6, this.f72771o);
        }
        if ((this.f72765f & 32) == 32) {
            b += C26587e.m34405b(7, this.f72772p);
        }
        if ((this.f72765f & 8) == 8) {
            b += C26587e.m34405b(8, this.f72770n);
        }
        if ((this.f72765f & 64) == 64) {
            b += C26587e.m34405b(9, this.f72773q);
        }
        if ((this.f72765f & 256) == 256) {
            b += C26587e.m34407d(10, this.f72775s);
        }
        if ((this.f72765f & 512) == 512) {
            b += C26587e.m34405b(11, this.f72776t);
        }
        if ((this.f72765f & 128) == 128) {
            b += C26587e.m34405b(12, this.f72774r);
        }
        if ((this.f72765f & 1024) == 1024) {
            b += C26587e.m34407d(13, this.f72777u);
        }
        if ((this.f72765f & 2048) == 2048) {
            b += C26587e.m34405b(14, this.f72778v);
        }
        int e = b + mo53570e() + this.f72764e.size();
        this.f72781y = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72780x;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72766g.size(); i++) {
            if (!this.f72766g.get(i).isInitialized()) {
                this.f72780x = 0;
                return false;
            }
        }
        if (!((this.f72765f & 4) == 4) || this.f72769j.isInitialized()) {
            if (!((this.f72765f & 256) == 256) || this.f72775s.isInitialized()) {
                if (((this.f72765f & 1024) == 1024) && !this.f72777u.isInitialized()) {
                    this.f72780x = 0;
                    return false;
                } else if (!mo53569d()) {
                    this.f72780x = 0;
                    return false;
                } else {
                    this.f72780x = 1;
                    return true;
                }
            } else {
                this.f72780x = 0;
                return false;
            }
        } else {
            this.f72780x = 0;
            return false;
        }
    }

    /* renamed from: l */
    public boolean mo52919l() {
        return (this.f72765f & 16) == 16;
    }

    /* renamed from: m */
    public final void mo52920m() {
        this.f72766g = Collections.emptyList();
        this.f72767h = false;
        this.f72768i = 0;
        C26065q qVar = f72763z;
        this.f72769j = qVar;
        this.f72770n = 0;
        this.f72771o = 0;
        this.f72772p = 0;
        this.f72773q = 0;
        this.f72774r = 0;
        this.f72775s = qVar;
        this.f72776t = 0;
        this.f72777u = qVar;
        this.f72778v = 0;
        this.f72779w = 0;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26071c();
    }

    /* renamed from: o */
    public C26071c mo52921o() {
        return m33342n(this);
    }

    public C26607p.C26608a toBuilder() {
        return m33342n(this);
    }

    /* renamed from: qz3.q$b */
    public static final class C26067b extends C26593h implements C26609q {

        /* renamed from: n */
        public static final C26067b f72782n;

        /* renamed from: o */
        public static C26610r<C26067b> f72783o = new C26068a();

        /* renamed from: d */
        public final C23156c f72784d;

        /* renamed from: e */
        public int f72785e;

        /* renamed from: f */
        public C26070c f72786f;

        /* renamed from: g */
        public C26065q f72787g;

        /* renamed from: h */
        public int f72788h;

        /* renamed from: i */
        public byte f72789i;

        /* renamed from: j */
        public int f72790j;

        /* renamed from: qz3.q$b$a */
        public static class C26068a extends C26585b<C26067b> {
            /* renamed from: a */
            public Object mo52860a(C26586d dVar, C26589f fVar) {
                return new C26067b(dVar, fVar, (C26008a) null);
            }
        }

        /* renamed from: qz3.q$b$b */
        public static final class C26069b extends C26593h.C26595b<C26067b, C26069b> implements C26609q {

            /* renamed from: e */
            public int f72791e;

            /* renamed from: f */
            public C26070c f72792f = C26070c.INV;

            /* renamed from: g */
            public C26065q f72793g = C26065q.f72763z;

            /* renamed from: h */
            public int f72794h;

            /* renamed from: M */
            public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
                mo52924g(dVar, fVar);
                return this;
            }

            /* renamed from: b */
            public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
                mo52924g(dVar, fVar);
                return this;
            }

            public C26607p build() {
                C26067b e = mo52922e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new C26611v(e);
            }

            /* renamed from: c */
            public C26593h.C26595b mo52864c() {
                C26069b bVar = new C26069b();
                bVar.mo52923f(mo52922e());
                return bVar;
            }

            public Object clone() {
                C26069b bVar = new C26069b();
                bVar.mo52923f(mo52922e());
                return bVar;
            }

            /* renamed from: d */
            public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
                mo52923f((C26067b) hVar);
                return this;
            }

            /* renamed from: e */
            public C26067b mo52922e() {
                C26067b bVar = new C26067b(this, (C26008a) null);
                int i = this.f72791e;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f72786f = this.f72792f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f72787g = this.f72793g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.f72788h = this.f72794h;
                bVar.f72785e = i2;
                return bVar;
            }

            /* renamed from: f */
            public C26069b mo52923f(C26067b bVar) {
                C26065q qVar;
                if (bVar == C26067b.f72782n) {
                    return this;
                }
                boolean z = true;
                if ((bVar.f72785e & 1) == 1) {
                    C26070c cVar = bVar.f72786f;
                    cVar.getClass();
                    this.f72791e |= 1;
                    this.f72792f = cVar;
                }
                if ((bVar.f72785e & 2) == 2) {
                    C26065q qVar2 = bVar.f72787g;
                    if ((this.f72791e & 2) != 2 || (qVar = this.f72793g) == C26065q.f72763z) {
                        this.f72793g = qVar2;
                    } else {
                        C26071c n = C26065q.m33342n(qVar);
                        n.mo52866d(qVar2);
                        this.f72793g = n.mo52925f();
                    }
                    this.f72791e |= 2;
                }
                if ((bVar.f72785e & 4) != 4) {
                    z = false;
                }
                if (z) {
                    int i = bVar.f72788h;
                    this.f72791e |= 4;
                    this.f72794h = i;
                }
                this.f74007d = this.f74007d.mo36541h(bVar.f72784d);
                return this;
            }

            /* renamed from: g */
            public C26069b mo52924g(C26586d dVar, C26589f fVar) {
                C26067b bVar;
                C26067b bVar2 = null;
                try {
                    C26067b bVar3 = (C26067b) ((C26068a) C26067b.f72783o).mo52860a(dVar, fVar);
                    if (bVar3 != null) {
                        mo52923f(bVar3);
                    }
                    return this;
                } catch (C26601j e) {
                    bVar = (C26067b) e.f74023d;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo52923f(bVar2);
                }
                throw th;
            }
        }

        /* renamed from: qz3.q$b$c */
        public enum C26070c implements C23159i.C23160a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: d */
            public final int f72800d;

            /* access modifiers changed from: public */
            C26070c(int i, int i2) {
                this.f72800d = i2;
            }

            public final int getNumber() {
                return this.f72800d;
            }
        }

        static {
            C26067b bVar = new C26067b(true);
            f72782n = bVar;
            bVar.f72786f = C26070c.INV;
            bVar.f72787g = C26065q.f72763z;
            bVar.f72788h = 0;
        }

        public C26067b(C26593h.C26595b bVar, C26008a aVar) {
            super(bVar);
            this.f72789i = -1;
            this.f72790j = -1;
            this.f72784d = bVar.f74007d;
        }

        /* renamed from: a */
        public void mo52855a(C26587e eVar) {
            getSerializedSize();
            if ((this.f72785e & 1) == 1) {
                eVar.mo53538l(1, this.f72786f.f72800d);
            }
            if ((this.f72785e & 2) == 2) {
                eVar.mo53541o(2, this.f72787g);
            }
            if ((this.f72785e & 4) == 4) {
                eVar.mo53539m(3, this.f72788h);
            }
            eVar.mo53544r(this.f72784d);
        }

        public int getSerializedSize() {
            int i = this.f72790j;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f72785e & 1) == 1) {
                i2 = 0 + C26587e.m34404a(1, this.f72786f.f72800d);
            }
            if ((this.f72785e & 2) == 2) {
                i2 += C26587e.m34407d(2, this.f72787g);
            }
            if ((this.f72785e & 4) == 4) {
                i2 += C26587e.m34405b(3, this.f72788h);
            }
            int size = i2 + this.f72784d.size();
            this.f72790j = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b = this.f72789i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f72785e & 2) == 2) || this.f72787g.isInitialized()) {
                this.f72789i = 1;
                return true;
            }
            this.f72789i = 0;
            return false;
        }

        public C26607p.C26608a newBuilderForType() {
            return new C26069b();
        }

        public C26607p.C26608a toBuilder() {
            C26069b bVar = new C26069b();
            bVar.mo52923f(this);
            return bVar;
        }

        public C26067b(boolean z) {
            this.f72789i = -1;
            this.f72790j = -1;
            this.f72784d = C23156c.f66530d;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: qz3.q$b$c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: qz3.q$c} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v4 */
        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: type inference failed for: r6v10 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26067b(xz3.C26586d r9, xz3.C26589f r10, qz3.C26008a r11) {
            /*
                r8 = this;
                qz3.q$b$c r11 = qz3.C26065q.C26067b.C26070c.INV
                r8.<init>()
                r0 = -1
                r8.f72789i = r0
                r8.f72790j = r0
                r8.f72786f = r11
                qz3.q r0 = qz3.C26065q.f72763z
                r8.f72787g = r0
                r0 = 0
                r8.f72788h = r0
                xz3.c$b r1 = xz3.C23156c.m27503p()
                r2 = 1
                xz3.e r3 = xz3.C26587e.m34412j(r1, r2)
            L_0x001c:
                if (r0 != 0) goto L_0x00c5
                int r4 = r9.mo53530n()     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                if (r4 == 0) goto L_0x009f
                r5 = 8
                r6 = 0
                r7 = 2
                if (r4 == r5) goto L_0x0075
                r5 = 18
                if (r4 == r5) goto L_0x0047
                r5 = 24
                if (r4 == r5) goto L_0x003a
                boolean r4 = r9.mo53533q(r4, r3)     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                if (r4 != 0) goto L_0x001c
                goto L_0x009f
            L_0x003a:
                int r4 = r8.f72785e     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r4 = r4 | 4
                r8.f72785e = r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                int r4 = r9.mo53527k()     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r8.f72788h = r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x001c
            L_0x0047:
                int r4 = r8.f72785e     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r4 = r4 & r7
                if (r4 != r7) goto L_0x005a
                qz3.q r4 = r8.f72787g     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r4.getClass()     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                qz3.q$c r6 = qz3.C26065q.m33342n(r4)     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x005a
            L_0x0056:
                r9 = move-exception
                goto L_0x00b2
            L_0x0058:
                r9 = move-exception
                goto L_0x00a2
            L_0x005a:
                xz3.r<qz3.q> r4 = qz3.C26065q.f72762A     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                xz3.p r4 = r9.mo53523g(r4, r10)     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                qz3.q r4 = (qz3.C26065q) r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r8.f72787g = r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                if (r6 == 0) goto L_0x006f
                r6.mo52866d(r4)     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                qz3.q r4 = r6.mo52925f()     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r8.f72787g = r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
            L_0x006f:
                int r4 = r8.f72785e     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r4 = r4 | r7
                r8.f72785e = r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x001c
            L_0x0075:
                int r5 = r9.mo53527k()     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                if (r5 == 0) goto L_0x008b
                if (r5 == r2) goto L_0x0088
                if (r5 == r7) goto L_0x0086
                r7 = 3
                if (r5 == r7) goto L_0x0083
                goto L_0x008d
            L_0x0083:
                qz3.q$b$c r6 = qz3.C26065q.C26067b.C26070c.STAR     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x008d
            L_0x0086:
                r6 = r11
                goto L_0x008d
            L_0x0088:
                qz3.q$b$c r6 = qz3.C26065q.C26067b.C26070c.OUT     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x008d
            L_0x008b:
                qz3.q$b$c r6 = qz3.C26065q.C26067b.C26070c.IN     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
            L_0x008d:
                if (r6 != 0) goto L_0x0096
                r3.mo53548v(r4)     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r3.mo53548v(r5)     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x001c
            L_0x0096:
                int r4 = r8.f72785e     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r4 = r4 | r2
                r8.f72785e = r4     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                r8.f72786f = r6     // Catch:{ j -> 0x00ae, IOException -> 0x0058 }
                goto L_0x001c
            L_0x009f:
                r0 = 1
                goto L_0x001c
            L_0x00a2:
                xz3.j r10 = new xz3.j     // Catch:{ all -> 0x0056 }
                java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0056 }
                r10.<init>(r9)     // Catch:{ all -> 0x0056 }
                r10.f74023d = r8     // Catch:{ all -> 0x0056 }
                throw r10     // Catch:{ all -> 0x0056 }
            L_0x00ae:
                r9 = move-exception
                r9.f74023d = r8     // Catch:{ all -> 0x0056 }
                throw r9     // Catch:{ all -> 0x0056 }
            L_0x00b2:
                r3.mo53536i()     // Catch:{ IOException -> 0x00be, all -> 0x00b6 }
                goto L_0x00be
            L_0x00b6:
                r9 = move-exception
                xz3.c r10 = r1.mo36559c()
                r8.f72784d = r10
                throw r9
            L_0x00be:
                xz3.c r10 = r1.mo36559c()
                r8.f72784d = r10
                throw r9
            L_0x00c5:
                r3.mo53536i()     // Catch:{ IOException -> 0x00d1, all -> 0x00c9 }
                goto L_0x00d1
            L_0x00c9:
                r9 = move-exception
                xz3.c r10 = r1.mo36559c()
                r8.f72784d = r10
                throw r9
            L_0x00d1:
                xz3.c r9 = r1.mo36559c()
                r8.f72784d = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qz3.C26065q.C26067b.<init>(xz3.d, xz3.f, qz3.a):void");
        }
    }

    public C26065q(boolean z) {
        this.f72780x = -1;
        this.f72781y = -1;
        this.f72764e = C23156c.f66530d;
    }

    public C26065q(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72780x = -1;
        this.f72781y = -1;
        mo52920m();
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                C26071c cVar = null;
                switch (n) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f72765f |= 4096;
                        this.f72779w = dVar.mo53527k();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.f72766g = new ArrayList();
                            z2 |= true;
                        }
                        this.f72766g.add(dVar.mo53523g(C26067b.f72783o, fVar));
                        break;
                    case 24:
                        this.f72765f |= 1;
                        this.f72767h = dVar.mo53528l() != 0;
                        break;
                    case 32:
                        this.f72765f |= 2;
                        this.f72768i = dVar.mo53527k();
                        break;
                    case 42:
                        if ((this.f72765f & 4) == 4) {
                            C26065q qVar = this.f72769j;
                            qVar.getClass();
                            cVar = m33342n(qVar);
                        }
                        C26065q qVar2 = (C26065q) dVar.mo53523g(f72762A, fVar);
                        this.f72769j = qVar2;
                        if (cVar != null) {
                            cVar.mo52866d(qVar2);
                            this.f72769j = cVar.mo52925f();
                        }
                        this.f72765f |= 4;
                        break;
                    case 48:
                        this.f72765f |= 16;
                        this.f72771o = dVar.mo53527k();
                        break;
                    case 56:
                        this.f72765f |= 32;
                        this.f72772p = dVar.mo53527k();
                        break;
                    case 64:
                        this.f72765f |= 8;
                        this.f72770n = dVar.mo53527k();
                        break;
                    case 72:
                        this.f72765f |= 64;
                        this.f72773q = dVar.mo53527k();
                        break;
                    case 82:
                        if ((this.f72765f & 256) == 256) {
                            C26065q qVar3 = this.f72775s;
                            qVar3.getClass();
                            cVar = m33342n(qVar3);
                        }
                        C26065q qVar4 = (C26065q) dVar.mo53523g(f72762A, fVar);
                        this.f72775s = qVar4;
                        if (cVar != null) {
                            cVar.mo52866d(qVar4);
                            this.f72775s = cVar.mo52925f();
                        }
                        this.f72765f |= 256;
                        break;
                    case 88:
                        this.f72765f |= 512;
                        this.f72776t = dVar.mo53527k();
                        break;
                    case 96:
                        this.f72765f |= 128;
                        this.f72774r = dVar.mo53527k();
                        break;
                    case 106:
                        if ((this.f72765f & 1024) == 1024) {
                            C26065q qVar5 = this.f72777u;
                            qVar5.getClass();
                            cVar = m33342n(qVar5);
                        }
                        C26065q qVar6 = (C26065q) dVar.mo53523g(f72762A, fVar);
                        this.f72777u = qVar6;
                        if (cVar != null) {
                            cVar.mo52866d(qVar6);
                            this.f72777u = cVar.mo52925f();
                        }
                        this.f72765f |= 1024;
                        break;
                    case 112:
                        this.f72765f |= 2048;
                        this.f72778v = dVar.mo53527k();
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
                if (z2 && true) {
                    this.f72766g = Collections.unmodifiableList(this.f72766g);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72764e = p.mo36559c();
                    throw th4;
                }
                this.f72764e = p.mo36559c();
                mo53573h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f72766g = Collections.unmodifiableList(this.f72766g);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72764e = p.mo36559c();
            throw th5;
        }
        this.f72764e = p.mo36559c();
        mo53573h();
    }
}
