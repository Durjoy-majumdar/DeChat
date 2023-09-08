package qz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qz3.C26046l;
import qz3.C26055o;
import qz3.C26062p;
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

/* renamed from: qz3.m */
public final class C26049m extends C26593h.C26597d<C26049m> {

    /* renamed from: p */
    public static final C26049m f72677p;

    /* renamed from: q */
    public static C26610r<C26049m> f72678q = new C26050a();

    /* renamed from: e */
    public final C23156c f72679e;

    /* renamed from: f */
    public int f72680f;

    /* renamed from: g */
    public C26062p f72681g;

    /* renamed from: h */
    public C26055o f72682h;

    /* renamed from: i */
    public C26046l f72683i;

    /* renamed from: j */
    public List<C26019c> f72684j;

    /* renamed from: n */
    public byte f72685n;

    /* renamed from: o */
    public int f72686o;

    /* renamed from: qz3.m$a */
    public static class C26050a extends C26585b<C26049m> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26049m(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.m$b */
    public static final class C26051b extends C26593h.C26596c<C26049m, C26051b> {

        /* renamed from: g */
        public int f72687g;

        /* renamed from: h */
        public C26062p f72688h = C26062p.f72754h;

        /* renamed from: i */
        public C26055o f72689i = C26055o.f72728h;

        /* renamed from: j */
        public C26046l f72690j = C26046l.f72660q;

        /* renamed from: n */
        public List<C26019c> f72691n = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52905h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52905h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26049m f = mo52903f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26051b bVar = new C26051b();
            bVar.mo52904g(mo52903f());
            return bVar;
        }

        public Object clone() {
            C26051b bVar = new C26051b();
            bVar.mo52904g(mo52903f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52904g((C26049m) hVar);
            return this;
        }

        /* renamed from: f */
        public C26049m mo52903f() {
            C26049m mVar = new C26049m(this, (C26008a) null);
            int i = this.f72687g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            mVar.f72681g = this.f72688h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            mVar.f72682h = this.f72689i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            mVar.f72683i = this.f72690j;
            if ((i & 8) == 8) {
                this.f72691n = Collections.unmodifiableList(this.f72691n);
                this.f72687g &= -9;
            }
            mVar.f72684j = this.f72691n;
            mVar.f72680f = i2;
            return mVar;
        }

        /* renamed from: g */
        public C26051b mo52904g(C26049m mVar) {
            C26046l lVar;
            C26055o oVar;
            C26062p pVar;
            if (mVar == C26049m.f72677p) {
                return this;
            }
            boolean z = true;
            if ((mVar.f72680f & 1) == 1) {
                C26062p pVar2 = mVar.f72681g;
                if ((this.f72687g & 1) != 1 || (pVar = this.f72688h) == C26062p.f72754h) {
                    this.f72688h = pVar2;
                } else {
                    C26062p.C26064b bVar = new C26062p.C26064b();
                    bVar.mo52917f(pVar);
                    bVar.mo52917f(pVar2);
                    this.f72688h = bVar.mo52916e();
                }
                this.f72687g |= 1;
            }
            if ((mVar.f72680f & 2) == 2) {
                C26055o oVar2 = mVar.f72682h;
                if ((this.f72687g & 2) != 2 || (oVar = this.f72689i) == C26055o.f72728h) {
                    this.f72689i = oVar2;
                } else {
                    C26055o.C26057b bVar2 = new C26055o.C26057b();
                    bVar2.mo52911f(oVar);
                    bVar2.mo52911f(oVar2);
                    this.f72689i = bVar2.mo52910e();
                }
                this.f72687g |= 2;
            }
            if ((mVar.f72680f & 4) != 4) {
                z = false;
            }
            if (z) {
                C26046l lVar2 = mVar.f72683i;
                if ((this.f72687g & 4) != 4 || (lVar = this.f72690j) == C26046l.f72660q) {
                    this.f72690j = lVar2;
                } else {
                    C26046l.C26048b bVar3 = new C26046l.C26048b();
                    bVar3.mo52901g(lVar);
                    bVar3.mo52901g(lVar2);
                    this.f72690j = bVar3.mo52900f();
                }
                this.f72687g |= 4;
            }
            if (!mVar.f72684j.isEmpty()) {
                if (this.f72691n.isEmpty()) {
                    this.f72691n = mVar.f72684j;
                    this.f72687g &= -9;
                } else {
                    if ((this.f72687g & 8) != 8) {
                        this.f72691n = new ArrayList(this.f72691n);
                        this.f72687g |= 8;
                    }
                    this.f72691n.addAll(mVar.f72684j);
                }
            }
            mo53568e(mVar);
            this.f74007d = this.f74007d.mo36541h(mVar.f72679e);
            return this;
        }

        /* renamed from: h */
        public C26051b mo52905h(C26586d dVar, C26589f fVar) {
            C26049m mVar;
            C26049m mVar2 = null;
            try {
                C26049m mVar3 = (C26049m) ((C26050a) C26049m.f72678q).mo52860a(dVar, fVar);
                if (mVar3 != null) {
                    mo52904g(mVar3);
                }
                return this;
            } catch (C26601j e) {
                mVar = (C26049m) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                mVar2 = mVar;
            }
            if (mVar2 != null) {
                mo52904g(mVar2);
            }
            throw th;
        }
    }

    static {
        C26049m mVar = new C26049m(true);
        f72677p = mVar;
        mVar.f72681g = C26062p.f72754h;
        mVar.f72682h = C26055o.f72728h;
        mVar.f72683i = C26046l.f72660q;
        mVar.f72684j = Collections.emptyList();
    }

    public C26049m(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72685n = -1;
        this.f72686o = -1;
        this.f72679e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        if ((this.f72680f & 1) == 1) {
            eVar.mo53541o(1, this.f72681g);
        }
        if ((this.f72680f & 2) == 2) {
            eVar.mo53541o(2, this.f72682h);
        }
        if ((this.f72680f & 4) == 4) {
            eVar.mo53541o(3, this.f72683i);
        }
        for (int i2 = 0; i2 < this.f72684j.size(); i2++) {
            eVar.mo53541o(4, this.f72684j.get(i2));
        }
        i.mo53577a(200, eVar);
        eVar.mo53544r(this.f72679e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72677p;
    }

    public int getSerializedSize() {
        int i = this.f72686o;
        if (i != -1) {
            return i;
        }
        int d = (this.f72680f & 1) == 1 ? C26587e.m34407d(1, this.f72681g) + 0 : 0;
        if ((this.f72680f & 2) == 2) {
            d += C26587e.m34407d(2, this.f72682h);
        }
        if ((this.f72680f & 4) == 4) {
            d += C26587e.m34407d(3, this.f72683i);
        }
        for (int i2 = 0; i2 < this.f72684j.size(); i2++) {
            d += C26587e.m34407d(4, this.f72684j.get(i2));
        }
        int e = d + mo53570e() + this.f72679e.size();
        this.f72686o = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72685n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f72680f & 2) == 2) || this.f72682h.isInitialized()) {
            if (!((this.f72680f & 4) == 4) || this.f72683i.isInitialized()) {
                for (int i = 0; i < this.f72684j.size(); i++) {
                    if (!this.f72684j.get(i).isInitialized()) {
                        this.f72685n = 0;
                        return false;
                    }
                }
                if (!mo53569d()) {
                    this.f72685n = 0;
                    return false;
                }
                this.f72685n = 1;
                return true;
            }
            this.f72685n = 0;
            return false;
        }
        this.f72685n = 0;
        return false;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26051b();
    }

    public C26607p.C26608a toBuilder() {
        C26051b bVar = new C26051b();
        bVar.mo52904g(this);
        return bVar;
    }

    public C26049m(boolean z) {
        this.f72685n = -1;
        this.f72686o = -1;
        this.f72679e = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: qz3.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qz3.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: qz3.l$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26049m(xz3.C26586d r9, xz3.C26589f r10, qz3.C26008a r11) {
        /*
            r8 = this;
            r8.<init>()
            r11 = -1
            r8.f72685n = r11
            r8.f72686o = r11
            qz3.p r11 = qz3.C26062p.f72754h
            r8.f72681g = r11
            qz3.o r11 = qz3.C26055o.f72728h
            r8.f72682h = r11
            qz3.l r11 = qz3.C26046l.f72660q
            r8.f72683i = r11
            java.util.List r11 = java.util.Collections.emptyList()
            r8.f72684j = r11
            xz3.c$b r11 = xz3.C23156c.m27503p()
            r0 = 1
            xz3.e r1 = xz3.C26587e.m34412j(r11, r0)
            r2 = 0
            r3 = 0
        L_0x0025:
            r4 = 8
            if (r2 != 0) goto L_0x0128
            int r5 = r9.mo53530n()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            if (r5 == 0) goto L_0x00f3
            r6 = 10
            r7 = 0
            if (r5 == r6) goto L_0x00c5
            r6 = 18
            if (r5 == r6) goto L_0x0096
            r6 = 26
            if (r5 == r6) goto L_0x0061
            r6 = 34
            if (r5 == r6) goto L_0x0048
            boolean r4 = r8.mo53575j(r9, r1, r10, r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            if (r4 != 0) goto L_0x0025
            goto L_0x00f3
        L_0x0048:
            r5 = r3 & 8
            if (r5 == r4) goto L_0x0055
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5.<init>()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72684j = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r3 = r3 | 8
        L_0x0055:
            java.util.List<qz3.c> r5 = r8.f72684j     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            xz3.r<qz3.c> r6 = qz3.C26019c.f72472R     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            xz3.p r6 = r9.mo53523g(r6, r10)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5.add(r6)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            goto L_0x0025
        L_0x0061:
            int r5 = r8.f72680f     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r6 = 4
            r5 = r5 & r6
            if (r5 != r6) goto L_0x007b
            qz3.l r5 = r8.f72683i     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5.getClass()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.l$b r7 = new qz3.l$b     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r7.<init>()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r7.mo52901g(r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            goto L_0x007b
        L_0x0075:
            r9 = move-exception
            goto L_0x0106
        L_0x0078:
            r9 = move-exception
            goto L_0x00f6
        L_0x007b:
            xz3.r<qz3.l> r5 = qz3.C26046l.f72661r     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            xz3.p r5 = r9.mo53523g(r5, r10)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.l r5 = (qz3.C26046l) r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72683i = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            if (r7 == 0) goto L_0x0090
            r7.mo52901g(r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.l r5 = r7.mo52900f()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72683i = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
        L_0x0090:
            int r5 = r8.f72680f     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5 = r5 | r6
            r8.f72680f = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            goto L_0x0025
        L_0x0096:
            int r5 = r8.f72680f     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r6 = 2
            r5 = r5 & r6
            if (r5 != r6) goto L_0x00a9
            qz3.o r5 = r8.f72682h     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5.getClass()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.o$b r7 = new qz3.o$b     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r7.<init>()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r7.mo52911f(r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
        L_0x00a9:
            xz3.r<qz3.o> r5 = qz3.C26055o.f72729i     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            xz3.p r5 = r9.mo53523g(r5, r10)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.o r5 = (qz3.C26055o) r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72682h = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            if (r7 == 0) goto L_0x00be
            r7.mo52911f(r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.o r5 = r7.mo52910e()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72682h = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
        L_0x00be:
            int r5 = r8.f72680f     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5 = r5 | r6
            r8.f72680f = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            goto L_0x0025
        L_0x00c5:
            int r5 = r8.f72680f     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5 = r5 & r0
            if (r5 != r0) goto L_0x00d7
            qz3.p r5 = r8.f72681g     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5.getClass()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.p$b r7 = new qz3.p$b     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r7.<init>()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r7.mo52917f(r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
        L_0x00d7:
            xz3.r<qz3.p> r5 = qz3.C26062p.f72755i     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            xz3.p r5 = r9.mo53523g(r5, r10)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.p r5 = (qz3.C26062p) r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72681g = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            if (r7 == 0) goto L_0x00ec
            r7.mo52917f(r5)     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            qz3.p r5 = r7.mo52916e()     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r8.f72681g = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
        L_0x00ec:
            int r5 = r8.f72680f     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            r5 = r5 | r0
            r8.f72680f = r5     // Catch:{ j -> 0x0102, IOException -> 0x0078 }
            goto L_0x0025
        L_0x00f3:
            r2 = 1
            goto L_0x0025
        L_0x00f6:
            xz3.j r10 = new xz3.j     // Catch:{ all -> 0x0075 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0075 }
            r10.<init>(r9)     // Catch:{ all -> 0x0075 }
            r10.f74023d = r8     // Catch:{ all -> 0x0075 }
            throw r10     // Catch:{ all -> 0x0075 }
        L_0x0102:
            r9 = move-exception
            r9.f74023d = r8     // Catch:{ all -> 0x0075 }
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0106:
            r10 = r3 & 8
            if (r10 != r4) goto L_0x0112
            java.util.List<qz3.c> r10 = r8.f72684j
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r8.f72684j = r10
        L_0x0112:
            r1.mo53536i()     // Catch:{ IOException -> 0x011e, all -> 0x0116 }
            goto L_0x011e
        L_0x0116:
            r9 = move-exception
            xz3.c r10 = r11.mo36559c()
            r8.f72679e = r10
            throw r9
        L_0x011e:
            xz3.c r10 = r11.mo36559c()
            r8.f72679e = r10
            r8.mo53573h()
            throw r9
        L_0x0128:
            r9 = r3 & 8
            if (r9 != r4) goto L_0x0134
            java.util.List<qz3.c> r9 = r8.f72684j
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            r8.f72684j = r9
        L_0x0134:
            r1.mo53536i()     // Catch:{ IOException -> 0x0140, all -> 0x0138 }
            goto L_0x0140
        L_0x0138:
            r9 = move-exception
            xz3.c r10 = r11.mo36559c()
            r8.f72679e = r10
            throw r9
        L_0x0140:
            xz3.c r9 = r11.mo36559c()
            r8.f72679e = r9
            r8.mo53573h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26049m.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
