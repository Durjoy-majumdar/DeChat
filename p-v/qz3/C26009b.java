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

/* renamed from: qz3.b */
public final class C26009b extends C26593h implements C26609q {

    /* renamed from: j */
    public static final C26009b f72405j;

    /* renamed from: n */
    public static C26610r<C26009b> f72406n = new C26010a();

    /* renamed from: d */
    public final C23156c f72407d;

    /* renamed from: e */
    public int f72408e;

    /* renamed from: f */
    public int f72409f;

    /* renamed from: g */
    public List<C26011b> f72410g;

    /* renamed from: h */
    public byte f72411h;

    /* renamed from: i */
    public int f72412i;

    /* renamed from: qz3.b$a */
    public static class C26010a extends C26585b<C26009b> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26009b(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.b$c */
    public static final class C26018c extends C26593h.C26595b<C26009b, C26018c> implements C26609q {

        /* renamed from: e */
        public int f72468e;

        /* renamed from: f */
        public int f72469f;

        /* renamed from: g */
        public List<C26011b> f72470g = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52876g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52876g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26009b e = mo52874e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26018c cVar = new C26018c();
            cVar.mo52875f(mo52874e());
            return cVar;
        }

        public Object clone() {
            C26018c cVar = new C26018c();
            cVar.mo52875f(mo52874e());
            return cVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52875f((C26009b) hVar);
            return this;
        }

        /* renamed from: e */
        public C26009b mo52874e() {
            C26009b bVar = new C26009b(this, (C26008a) null);
            int i = this.f72468e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            bVar.f72409f = this.f72469f;
            if ((i & 2) == 2) {
                this.f72470g = Collections.unmodifiableList(this.f72470g);
                this.f72468e &= -3;
            }
            bVar.f72410g = this.f72470g;
            bVar.f72408e = i2;
            return bVar;
        }

        /* renamed from: f */
        public C26018c mo52875f(C26009b bVar) {
            if (bVar == C26009b.f72405j) {
                return this;
            }
            if ((bVar.f72408e & 1) == 1) {
                int i = bVar.f72409f;
                this.f72468e = 1 | this.f72468e;
                this.f72469f = i;
            }
            if (!bVar.f72410g.isEmpty()) {
                if (this.f72470g.isEmpty()) {
                    this.f72470g = bVar.f72410g;
                    this.f72468e &= -3;
                } else {
                    if ((this.f72468e & 2) != 2) {
                        this.f72470g = new ArrayList(this.f72470g);
                        this.f72468e |= 2;
                    }
                    this.f72470g.addAll(bVar.f72410g);
                }
            }
            this.f74007d = this.f74007d.mo36541h(bVar.f72407d);
            return this;
        }

        /* renamed from: g */
        public C26018c mo52876g(C26586d dVar, C26589f fVar) {
            C26009b bVar;
            try {
                mo52875f((C26009b) ((C26010a) C26009b.f72406n).mo52860a(dVar, fVar));
                return this;
            } catch (C26601j e) {
                bVar = (C26009b) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (bVar != null) {
                mo52875f(bVar);
            }
            throw th;
        }
    }

    static {
        C26009b bVar = new C26009b(true);
        f72405j = bVar;
        bVar.f72409f = 0;
        bVar.f72410g = Collections.emptyList();
    }

    public C26009b(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72411h = -1;
        this.f72412i = -1;
        this.f72407d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        if ((this.f72408e & 1) == 1) {
            eVar.mo53539m(1, this.f72409f);
        }
        for (int i = 0; i < this.f72410g.size(); i++) {
            eVar.mo53541o(2, this.f72410g.get(i));
        }
        eVar.mo53544r(this.f72407d);
    }

    public int getSerializedSize() {
        int i = this.f72412i;
        if (i != -1) {
            return i;
        }
        int b = (this.f72408e & 1) == 1 ? C26587e.m34405b(1, this.f72409f) + 0 : 0;
        for (int i2 = 0; i2 < this.f72410g.size(); i2++) {
            b += C26587e.m34407d(2, this.f72410g.get(i2));
        }
        int size = b + this.f72407d.size();
        this.f72412i = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72411h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f72408e & 1) == 1)) {
            this.f72411h = 0;
            return false;
        }
        for (int i = 0; i < this.f72410g.size(); i++) {
            if (!this.f72410g.get(i).isInitialized()) {
                this.f72411h = 0;
                return false;
            }
        }
        this.f72411h = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26018c();
    }

    public C26607p.C26608a toBuilder() {
        C26018c cVar = new C26018c();
        cVar.mo52875f(this);
        return cVar;
    }

    /* renamed from: qz3.b$b */
    public static final class C26011b extends C26593h implements C26609q {

        /* renamed from: j */
        public static final C26011b f72413j;

        /* renamed from: n */
        public static C26610r<C26011b> f72414n = new C26012a();

        /* renamed from: d */
        public final C23156c f72415d;

        /* renamed from: e */
        public int f72416e;

        /* renamed from: f */
        public int f72417f;

        /* renamed from: g */
        public C26014c f72418g;

        /* renamed from: h */
        public byte f72419h;

        /* renamed from: i */
        public int f72420i;

        /* renamed from: qz3.b$b$a */
        public static class C26012a extends C26585b<C26011b> {
            /* renamed from: a */
            public Object mo52860a(C26586d dVar, C26589f fVar) {
                return new C26011b(dVar, fVar, (C26008a) null);
            }
        }

        /* renamed from: qz3.b$b$b */
        public static final class C26013b extends C26593h.C26595b<C26011b, C26013b> implements C26609q {

            /* renamed from: e */
            public int f72421e;

            /* renamed from: f */
            public int f72422f;

            /* renamed from: g */
            public C26014c f72423g = C26014c.f72424v;

            /* renamed from: M */
            public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
                mo52869g(dVar, fVar);
                return this;
            }

            /* renamed from: b */
            public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
                mo52869g(dVar, fVar);
                return this;
            }

            public C26607p build() {
                C26011b e = mo52867e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new C26611v(e);
            }

            /* renamed from: c */
            public C26593h.C26595b mo52864c() {
                C26013b bVar = new C26013b();
                bVar.mo52868f(mo52867e());
                return bVar;
            }

            public Object clone() {
                C26013b bVar = new C26013b();
                bVar.mo52868f(mo52867e());
                return bVar;
            }

            /* renamed from: d */
            public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
                mo52868f((C26011b) hVar);
                return this;
            }

            /* renamed from: e */
            public C26011b mo52867e() {
                C26011b bVar = new C26011b(this, (C26008a) null);
                int i = this.f72421e;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f72417f = this.f72422f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f72418g = this.f72423g;
                bVar.f72416e = i2;
                return bVar;
            }

            /* renamed from: f */
            public C26013b mo52868f(C26011b bVar) {
                C26014c cVar;
                if (bVar == C26011b.f72413j) {
                    return this;
                }
                int i = bVar.f72416e;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = bVar.f72417f;
                    this.f72421e |= 1;
                    this.f72422f = i2;
                }
                if ((i & 2) == 2) {
                    z = true;
                }
                if (z) {
                    C26014c cVar2 = bVar.f72418g;
                    if ((this.f72421e & 2) != 2 || (cVar = this.f72423g) == C26014c.f72424v) {
                        this.f72423g = cVar2;
                    } else {
                        C26014c.C26016b bVar2 = new C26014c.C26016b();
                        bVar2.mo52872f(cVar);
                        bVar2.mo52872f(cVar2);
                        this.f72423g = bVar2.mo52871e();
                    }
                    this.f72421e |= 2;
                }
                this.f74007d = this.f74007d.mo36541h(bVar.f72415d);
                return this;
            }

            /* renamed from: g */
            public C26013b mo52869g(C26586d dVar, C26589f fVar) {
                C26011b bVar;
                try {
                    mo52868f((C26011b) ((C26012a) C26011b.f72414n).mo52860a(dVar, fVar));
                    return this;
                } catch (C26601j e) {
                    bVar = (C26011b) e.f74023d;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (bVar != null) {
                    mo52868f(bVar);
                }
                throw th;
            }
        }

        static {
            C26011b bVar = new C26011b(true);
            f72413j = bVar;
            bVar.f72417f = 0;
            bVar.f72418g = C26014c.f72424v;
        }

        public C26011b(C26593h.C26595b bVar, C26008a aVar) {
            super(bVar);
            this.f72419h = -1;
            this.f72420i = -1;
            this.f72415d = bVar.f74007d;
        }

        /* renamed from: a */
        public void mo52855a(C26587e eVar) {
            getSerializedSize();
            if ((this.f72416e & 1) == 1) {
                eVar.mo53539m(1, this.f72417f);
            }
            if ((this.f72416e & 2) == 2) {
                eVar.mo53541o(2, this.f72418g);
            }
            eVar.mo53544r(this.f72415d);
        }

        public int getSerializedSize() {
            int i = this.f72420i;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f72416e & 1) == 1) {
                i2 = 0 + C26587e.m34405b(1, this.f72417f);
            }
            if ((this.f72416e & 2) == 2) {
                i2 += C26587e.m34407d(2, this.f72418g);
            }
            int size = i2 + this.f72415d.size();
            this.f72420i = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b = this.f72419h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f72416e;
            if (!((i & 1) == 1)) {
                this.f72419h = 0;
                return false;
            }
            if (!((i & 2) == 2)) {
                this.f72419h = 0;
                return false;
            } else if (!this.f72418g.isInitialized()) {
                this.f72419h = 0;
                return false;
            } else {
                this.f72419h = 1;
                return true;
            }
        }

        public C26607p.C26608a newBuilderForType() {
            return new C26013b();
        }

        public C26607p.C26608a toBuilder() {
            C26013b bVar = new C26013b();
            bVar.mo52868f(this);
            return bVar;
        }

        /* renamed from: qz3.b$b$c */
        public static final class C26014c extends C26593h implements C26609q {

            /* renamed from: v */
            public static final C26014c f72424v;

            /* renamed from: w */
            public static C26610r<C26014c> f72425w = new C26015a();

            /* renamed from: d */
            public final C23156c f72426d;

            /* renamed from: e */
            public int f72427e;

            /* renamed from: f */
            public C26017c f72428f;

            /* renamed from: g */
            public long f72429g;

            /* renamed from: h */
            public float f72430h;

            /* renamed from: i */
            public double f72431i;

            /* renamed from: j */
            public int f72432j;

            /* renamed from: n */
            public int f72433n;

            /* renamed from: o */
            public int f72434o;

            /* renamed from: p */
            public C26009b f72435p;

            /* renamed from: q */
            public List<C26014c> f72436q;

            /* renamed from: r */
            public int f72437r;

            /* renamed from: s */
            public int f72438s;

            /* renamed from: t */
            public byte f72439t;

            /* renamed from: u */
            public int f72440u;

            /* renamed from: qz3.b$b$c$a */
            public static class C26015a extends C26585b<C26014c> {
                /* renamed from: a */
                public Object mo52860a(C26586d dVar, C26589f fVar) {
                    return new C26014c(dVar, fVar, (C26008a) null);
                }
            }

            /* renamed from: qz3.b$b$c$b */
            public static final class C26016b extends C26593h.C26595b<C26014c, C26016b> implements C26609q {

                /* renamed from: e */
                public int f72441e;

                /* renamed from: f */
                public C26017c f72442f = C26017c.BYTE;

                /* renamed from: g */
                public long f72443g;

                /* renamed from: h */
                public float f72444h;

                /* renamed from: i */
                public double f72445i;

                /* renamed from: j */
                public int f72446j;

                /* renamed from: n */
                public int f72447n;

                /* renamed from: o */
                public int f72448o;

                /* renamed from: p */
                public C26009b f72449p = C26009b.f72405j;

                /* renamed from: q */
                public List<C26014c> f72450q = Collections.emptyList();

                /* renamed from: r */
                public int f72451r;

                /* renamed from: s */
                public int f72452s;

                /* renamed from: M */
                public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
                    mo52873g(dVar, fVar);
                    return this;
                }

                /* renamed from: b */
                public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
                    mo52873g(dVar, fVar);
                    return this;
                }

                public C26607p build() {
                    C26014c e = mo52871e();
                    if (e.isInitialized()) {
                        return e;
                    }
                    throw new C26611v(e);
                }

                /* renamed from: c */
                public C26593h.C26595b mo52864c() {
                    C26016b bVar = new C26016b();
                    bVar.mo52872f(mo52871e());
                    return bVar;
                }

                public Object clone() {
                    C26016b bVar = new C26016b();
                    bVar.mo52872f(mo52871e());
                    return bVar;
                }

                /* renamed from: d */
                public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
                    mo52872f((C26014c) hVar);
                    return this;
                }

                /* renamed from: e */
                public C26014c mo52871e() {
                    C26014c cVar = new C26014c(this, (C26008a) null);
                    int i = this.f72441e;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    cVar.f72428f = this.f72442f;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.f72429g = this.f72443g;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.f72430h = this.f72444h;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.f72431i = this.f72445i;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    cVar.f72432j = this.f72446j;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.f72433n = this.f72447n;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.f72434o = this.f72448o;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    cVar.f72435p = this.f72449p;
                    if ((i & 256) == 256) {
                        this.f72450q = Collections.unmodifiableList(this.f72450q);
                        this.f72441e &= -257;
                    }
                    cVar.f72436q = this.f72450q;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    cVar.f72437r = this.f72451r;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    cVar.f72438s = this.f72452s;
                    cVar.f72427e = i2;
                    return cVar;
                }

                /* renamed from: f */
                public C26016b mo52872f(C26014c cVar) {
                    C26009b bVar;
                    if (cVar == C26014c.f72424v) {
                        return this;
                    }
                    boolean z = true;
                    if ((cVar.f72427e & 1) == 1) {
                        C26017c cVar2 = cVar.f72428f;
                        cVar2.getClass();
                        this.f72441e |= 1;
                        this.f72442f = cVar2;
                    }
                    int i = cVar.f72427e;
                    if ((i & 2) == 2) {
                        long j = cVar.f72429g;
                        this.f72441e |= 2;
                        this.f72443g = j;
                    }
                    if ((i & 4) == 4) {
                        float f = cVar.f72430h;
                        this.f72441e = 4 | this.f72441e;
                        this.f72444h = f;
                    }
                    if ((i & 8) == 8) {
                        double d = cVar.f72431i;
                        this.f72441e |= 8;
                        this.f72445i = d;
                    }
                    if ((i & 16) == 16) {
                        int i2 = cVar.f72432j;
                        this.f72441e = 16 | this.f72441e;
                        this.f72446j = i2;
                    }
                    if ((i & 32) == 32) {
                        int i3 = cVar.f72433n;
                        this.f72441e = 32 | this.f72441e;
                        this.f72447n = i3;
                    }
                    if ((i & 64) == 64) {
                        int i4 = cVar.f72434o;
                        this.f72441e = 64 | this.f72441e;
                        this.f72448o = i4;
                    }
                    if ((i & 128) == 128) {
                        C26009b bVar2 = cVar.f72435p;
                        if ((this.f72441e & 128) != 128 || (bVar = this.f72449p) == C26009b.f72405j) {
                            this.f72449p = bVar2;
                        } else {
                            C26018c cVar3 = new C26018c();
                            cVar3.mo52875f(bVar);
                            cVar3.mo52875f(bVar2);
                            this.f72449p = cVar3.mo52874e();
                        }
                        this.f72441e |= 128;
                    }
                    if (!cVar.f72436q.isEmpty()) {
                        if (this.f72450q.isEmpty()) {
                            this.f72450q = cVar.f72436q;
                            this.f72441e &= -257;
                        } else {
                            if ((this.f72441e & 256) != 256) {
                                this.f72450q = new ArrayList(this.f72450q);
                                this.f72441e |= 256;
                            }
                            this.f72450q.addAll(cVar.f72436q);
                        }
                    }
                    int i5 = cVar.f72427e;
                    if ((i5 & 256) == 256) {
                        int i6 = cVar.f72437r;
                        this.f72441e |= 512;
                        this.f72451r = i6;
                    }
                    if ((i5 & 512) != 512) {
                        z = false;
                    }
                    if (z) {
                        int i7 = cVar.f72438s;
                        this.f72441e |= 1024;
                        this.f72452s = i7;
                    }
                    this.f74007d = this.f74007d.mo36541h(cVar.f72426d);
                    return this;
                }

                /* renamed from: g */
                public C26016b mo52873g(C26586d dVar, C26589f fVar) {
                    C26014c cVar;
                    C26014c cVar2 = null;
                    try {
                        C26014c cVar3 = (C26014c) ((C26015a) C26014c.f72425w).mo52860a(dVar, fVar);
                        if (cVar3 != null) {
                            mo52872f(cVar3);
                        }
                        return this;
                    } catch (C26601j e) {
                        cVar = (C26014c) e.f74023d;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cVar2 = cVar;
                    }
                    if (cVar2 != null) {
                        mo52872f(cVar2);
                    }
                    throw th;
                }
            }

            /* renamed from: qz3.b$b$c$c */
            public enum C26017c implements C23159i.C23160a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: d */
                public final int f72467d;

                /* access modifiers changed from: public */
                C26017c(int i, int i2) {
                    this.f72467d = i2;
                }

                /* renamed from: a */
                public static C26017c m33215a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                public final int getNumber() {
                    return this.f72467d;
                }
            }

            static {
                C26014c cVar = new C26014c(true);
                f72424v = cVar;
                cVar.mo52870d();
            }

            public C26014c(C26593h.C26595b bVar, C26008a aVar) {
                super(bVar);
                this.f72439t = -1;
                this.f72440u = -1;
                this.f72426d = bVar.f74007d;
            }

            /* renamed from: a */
            public void mo52855a(C26587e eVar) {
                getSerializedSize();
                if ((this.f72427e & 1) == 1) {
                    eVar.mo53538l(1, this.f72428f.f72467d);
                }
                if ((this.f72427e & 2) == 2) {
                    long j = this.f72429g;
                    eVar.mo53550x(2, 0);
                    eVar.mo53549w((j >> 63) ^ (j << 1));
                }
                if ((this.f72427e & 4) == 4) {
                    float f = this.f72430h;
                    eVar.mo53550x(3, 5);
                    eVar.mo53546t(Float.floatToRawIntBits(f));
                }
                if ((this.f72427e & 8) == 8) {
                    double d = this.f72431i;
                    eVar.mo53550x(4, 1);
                    eVar.mo53547u(Double.doubleToRawLongBits(d));
                }
                if ((this.f72427e & 16) == 16) {
                    eVar.mo53539m(5, this.f72432j);
                }
                if ((this.f72427e & 32) == 32) {
                    eVar.mo53539m(6, this.f72433n);
                }
                if ((this.f72427e & 64) == 64) {
                    eVar.mo53539m(7, this.f72434o);
                }
                if ((this.f72427e & 128) == 128) {
                    eVar.mo53541o(8, this.f72435p);
                }
                for (int i = 0; i < this.f72436q.size(); i++) {
                    eVar.mo53541o(9, this.f72436q.get(i));
                }
                if ((this.f72427e & 512) == 512) {
                    eVar.mo53539m(10, this.f72438s);
                }
                if ((this.f72427e & 256) == 256) {
                    eVar.mo53539m(11, this.f72437r);
                }
                eVar.mo53544r(this.f72426d);
            }

            /* renamed from: d */
            public final void mo52870d() {
                this.f72428f = C26017c.BYTE;
                this.f72429g = 0;
                this.f72430h = 0.0f;
                this.f72431i = 0.0d;
                this.f72432j = 0;
                this.f72433n = 0;
                this.f72434o = 0;
                this.f72435p = C26009b.f72405j;
                this.f72436q = Collections.emptyList();
                this.f72437r = 0;
                this.f72438s = 0;
            }

            public int getSerializedSize() {
                int i = this.f72440u;
                if (i != -1) {
                    return i;
                }
                int a = (this.f72427e & 1) == 1 ? C26587e.m34404a(1, this.f72428f.f72467d) + 0 : 0;
                if ((this.f72427e & 2) == 2) {
                    long j = this.f72429g;
                    a += C26587e.m34411h(2) + C26587e.m34410g((j >> 63) ^ (j << 1));
                }
                if ((this.f72427e & 4) == 4) {
                    a += C26587e.m34411h(3) + 4;
                }
                if ((this.f72427e & 8) == 8) {
                    a += C26587e.m34411h(4) + 8;
                }
                if ((this.f72427e & 16) == 16) {
                    a += C26587e.m34405b(5, this.f72432j);
                }
                if ((this.f72427e & 32) == 32) {
                    a += C26587e.m34405b(6, this.f72433n);
                }
                if ((this.f72427e & 64) == 64) {
                    a += C26587e.m34405b(7, this.f72434o);
                }
                if ((this.f72427e & 128) == 128) {
                    a += C26587e.m34407d(8, this.f72435p);
                }
                for (int i2 = 0; i2 < this.f72436q.size(); i2++) {
                    a += C26587e.m34407d(9, this.f72436q.get(i2));
                }
                if ((this.f72427e & 512) == 512) {
                    a += C26587e.m34405b(10, this.f72438s);
                }
                if ((this.f72427e & 256) == 256) {
                    a += C26587e.m34405b(11, this.f72437r);
                }
                int size = a + this.f72426d.size();
                this.f72440u = size;
                return size;
            }

            public final boolean isInitialized() {
                byte b = this.f72439t;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!((this.f72427e & 128) == 128) || this.f72435p.isInitialized()) {
                    for (int i = 0; i < this.f72436q.size(); i++) {
                        if (!this.f72436q.get(i).isInitialized()) {
                            this.f72439t = 0;
                            return false;
                        }
                    }
                    this.f72439t = 1;
                    return true;
                }
                this.f72439t = 0;
                return false;
            }

            public C26607p.C26608a newBuilderForType() {
                return new C26016b();
            }

            public C26607p.C26608a toBuilder() {
                C26016b bVar = new C26016b();
                bVar.mo52872f(this);
                return bVar;
            }

            public C26014c(boolean z) {
                this.f72439t = -1;
                this.f72440u = -1;
                this.f72426d = C23156c.f66530d;
            }

            public C26014c(C26586d dVar, C26589f fVar, C26008a aVar) {
                this.f72439t = -1;
                this.f72440u = -1;
                mo52870d();
                C23156c.C23158b p = C23156c.m27503p();
                C26587e j = C26587e.m34412j(p, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int n = dVar.mo53530n();
                        switch (n) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int k = dVar.mo53527k();
                                C26017c a = C26017c.m33215a(k);
                                if (a != null) {
                                    this.f72427e |= 1;
                                    this.f72428f = a;
                                    break;
                                } else {
                                    j.mo53548v(n);
                                    j.mo53548v(k);
                                    break;
                                }
                            case 16:
                                this.f72427e |= 2;
                                long l = dVar.mo53528l();
                                this.f72429g = (-(l & 1)) ^ (l >>> 1);
                                break;
                            case 29:
                                this.f72427e |= 4;
                                this.f72430h = Float.intBitsToFloat(dVar.mo53525i());
                                break;
                            case 33:
                                this.f72427e |= 8;
                                this.f72431i = Double.longBitsToDouble(dVar.mo53526j());
                                break;
                            case 40:
                                this.f72427e |= 16;
                                this.f72432j = dVar.mo53527k();
                                break;
                            case 48:
                                this.f72427e |= 32;
                                this.f72433n = dVar.mo53527k();
                                break;
                            case 56:
                                this.f72427e |= 64;
                                this.f72434o = dVar.mo53527k();
                                break;
                            case 66:
                                C26018c cVar = null;
                                if ((this.f72427e & 128) == 128) {
                                    C26009b bVar = this.f72435p;
                                    bVar.getClass();
                                    C26018c cVar2 = new C26018c();
                                    cVar2.mo52875f(bVar);
                                    cVar = cVar2;
                                }
                                C26009b bVar2 = (C26009b) dVar.mo53523g(C26009b.f72406n, fVar);
                                this.f72435p = bVar2;
                                if (cVar != null) {
                                    cVar.mo52875f(bVar2);
                                    this.f72435p = cVar.mo52874e();
                                }
                                this.f72427e |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.f72436q = new ArrayList();
                                    z2 |= true;
                                }
                                this.f72436q.add(dVar.mo53523g(f72425w, fVar));
                                break;
                            case 80:
                                this.f72427e |= 512;
                                this.f72438s = dVar.mo53527k();
                                break;
                            case 88:
                                this.f72427e |= 256;
                                this.f72437r = dVar.mo53527k();
                                break;
                            default:
                                if (dVar.mo53533q(n, j)) {
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
                            this.f72436q = Collections.unmodifiableList(this.f72436q);
                        }
                        try {
                            j.mo53536i();
                        } catch (IOException unused) {
                        } catch (Throwable th4) {
                            this.f72426d = p.mo36559c();
                            throw th4;
                        }
                        this.f72426d = p.mo36559c();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f72436q = Collections.unmodifiableList(this.f72436q);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f72426d = p.mo36559c();
                    throw th5;
                }
                this.f72426d = p.mo36559c();
            }
        }

        public C26011b(boolean z) {
            this.f72419h = -1;
            this.f72420i = -1;
            this.f72415d = C23156c.f66530d;
        }

        public C26011b(C26586d dVar, C26589f fVar, C26008a aVar) {
            this.f72419h = -1;
            this.f72420i = -1;
            boolean z = false;
            this.f72417f = 0;
            this.f72418g = C26014c.f72424v;
            C23156c.C23158b p = C23156c.m27503p();
            C26587e j = C26587e.m34412j(p, 1);
            while (!z) {
                try {
                    int n = dVar.mo53530n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f72416e |= 1;
                            this.f72417f = dVar.mo53527k();
                        } else if (n == 18) {
                            C26014c.C26016b bVar = null;
                            if ((this.f72416e & 2) == 2) {
                                C26014c cVar = this.f72418g;
                                cVar.getClass();
                                C26014c.C26016b bVar2 = new C26014c.C26016b();
                                bVar2.mo52872f(cVar);
                                bVar = bVar2;
                            }
                            C26014c cVar2 = (C26014c) dVar.mo53523g(C26014c.f72425w, fVar);
                            this.f72418g = cVar2;
                            if (bVar != null) {
                                bVar.mo52872f(cVar2);
                                this.f72418g = bVar.mo52871e();
                            }
                            this.f72416e |= 2;
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
                    try {
                        j.mo53536i();
                    } catch (IOException unused) {
                    } catch (Throwable th4) {
                        this.f72415d = p.mo36559c();
                        throw th4;
                    }
                    this.f72415d = p.mo36559c();
                    throw th;
                }
            }
            try {
                j.mo53536i();
            } catch (IOException unused2) {
            } catch (Throwable th5) {
                this.f72415d = p.mo36559c();
                throw th5;
            }
            this.f72415d = p.mo36559c();
        }
    }

    public C26009b(boolean z) {
        this.f72411h = -1;
        this.f72412i = -1;
        this.f72407d = C23156c.f66530d;
    }

    public C26009b(C26586d dVar, C26589f fVar, C26008a aVar) {
        this.f72411h = -1;
        this.f72412i = -1;
        boolean z = false;
        this.f72409f = 0;
        this.f72410g = Collections.emptyList();
        C23156c.C23158b p = C23156c.m27503p();
        C26587e j = C26587e.m34412j(p, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int n = dVar.mo53530n();
                if (n != 0) {
                    if (n == 8) {
                        this.f72408e |= 1;
                        this.f72409f = dVar.mo53527k();
                    } else if (n == 18) {
                        if (!(z2 & true)) {
                            this.f72410g = new ArrayList();
                            z2 |= true;
                        }
                        this.f72410g.add(dVar.mo53523g(C26011b.f72414n, fVar));
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
                if (z2 & true) {
                    this.f72410g = Collections.unmodifiableList(this.f72410g);
                }
                try {
                    j.mo53536i();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f72407d = p.mo36559c();
                    throw th4;
                }
                this.f72407d = p.mo36559c();
                throw th;
            }
        }
        if (z2 & true) {
            this.f72410g = Collections.unmodifiableList(this.f72410g);
        }
        try {
            j.mo53536i();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f72407d = p.mo36559c();
            throw th5;
        }
        this.f72407d = p.mo36559c();
    }
}
