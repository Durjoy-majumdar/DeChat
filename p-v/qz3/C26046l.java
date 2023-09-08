package qz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qz3.C26079t;
import qz3.C26090w;
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

/* renamed from: qz3.l */
public final class C26046l extends C26593h.C26597d<C26046l> {

    /* renamed from: q */
    public static final C26046l f72660q;

    /* renamed from: r */
    public static C26610r<C26046l> f72661r = new C26047a();

    /* renamed from: e */
    public final C23156c f72662e;

    /* renamed from: f */
    public int f72663f;

    /* renamed from: g */
    public List<C26041i> f72664g;

    /* renamed from: h */
    public List<C26052n> f72665h;

    /* renamed from: i */
    public List<C26072r> f72666i;

    /* renamed from: j */
    public C26079t f72667j;

    /* renamed from: n */
    public C26090w f72668n;

    /* renamed from: o */
    public byte f72669o;

    /* renamed from: p */
    public int f72670p;

    /* renamed from: qz3.l$a */
    public static class C26047a extends C26585b<C26046l> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26046l(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.l$b */
    public static final class C26048b extends C26593h.C26596c<C26046l, C26048b> {

        /* renamed from: g */
        public int f72671g;

        /* renamed from: h */
        public List<C26041i> f72672h = Collections.emptyList();

        /* renamed from: i */
        public List<C26052n> f72673i = Collections.emptyList();

        /* renamed from: j */
        public List<C26072r> f72674j = Collections.emptyList();

        /* renamed from: n */
        public C26079t f72675n = C26079t.f72866j;

        /* renamed from: o */
        public C26090w f72676o = C26090w.f72925h;

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52902h(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52902h(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26046l f = mo52900f();
            if (f.isInitialized()) {
                return f;
            }
            throw new C26611v(f);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26048b bVar = new C26048b();
            bVar.mo52901g(mo52900f());
            return bVar;
        }

        public Object clone() {
            C26048b bVar = new C26048b();
            bVar.mo52901g(mo52900f());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52901g((C26046l) hVar);
            return this;
        }

        /* renamed from: f */
        public C26046l mo52900f() {
            C26046l lVar = new C26046l(this, (C26008a) null);
            int i = this.f72671g;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f72672h = Collections.unmodifiableList(this.f72672h);
                this.f72671g &= -2;
            }
            lVar.f72664g = this.f72672h;
            if ((this.f72671g & 2) == 2) {
                this.f72673i = Collections.unmodifiableList(this.f72673i);
                this.f72671g &= -3;
            }
            lVar.f72665h = this.f72673i;
            if ((this.f72671g & 4) == 4) {
                this.f72674j = Collections.unmodifiableList(this.f72674j);
                this.f72671g &= -5;
            }
            lVar.f72666i = this.f72674j;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            lVar.f72667j = this.f72675n;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            lVar.f72668n = this.f72676o;
            lVar.f72663f = i2;
            return lVar;
        }

        /* renamed from: g */
        public C26048b mo52901g(C26046l lVar) {
            C26090w wVar;
            C26079t tVar;
            if (lVar == C26046l.f72660q) {
                return this;
            }
            boolean z = true;
            if (!lVar.f72664g.isEmpty()) {
                if (this.f72672h.isEmpty()) {
                    this.f72672h = lVar.f72664g;
                    this.f72671g &= -2;
                } else {
                    if ((this.f72671g & 1) != 1) {
                        this.f72672h = new ArrayList(this.f72672h);
                        this.f72671g |= 1;
                    }
                    this.f72672h.addAll(lVar.f72664g);
                }
            }
            if (!lVar.f72665h.isEmpty()) {
                if (this.f72673i.isEmpty()) {
                    this.f72673i = lVar.f72665h;
                    this.f72671g &= -3;
                } else {
                    if ((this.f72671g & 2) != 2) {
                        this.f72673i = new ArrayList(this.f72673i);
                        this.f72671g |= 2;
                    }
                    this.f72673i.addAll(lVar.f72665h);
                }
            }
            if (!lVar.f72666i.isEmpty()) {
                if (this.f72674j.isEmpty()) {
                    this.f72674j = lVar.f72666i;
                    this.f72671g &= -5;
                } else {
                    if ((this.f72671g & 4) != 4) {
                        this.f72674j = new ArrayList(this.f72674j);
                        this.f72671g |= 4;
                    }
                    this.f72674j.addAll(lVar.f72666i);
                }
            }
            if ((lVar.f72663f & 1) == 1) {
                C26079t tVar2 = lVar.f72667j;
                if ((this.f72671g & 8) != 8 || (tVar = this.f72675n) == C26079t.f72866j) {
                    this.f72675n = tVar2;
                } else {
                    C26079t.C26081b d = C26079t.m33383d(tVar);
                    d.mo52937f(tVar2);
                    this.f72675n = d.mo52936e();
                }
                this.f72671g |= 8;
            }
            if ((lVar.f72663f & 2) != 2) {
                z = false;
            }
            if (z) {
                C26090w wVar2 = lVar.f72668n;
                if ((this.f72671g & 16) != 16 || (wVar = this.f72676o) == C26090w.f72925h) {
                    this.f72676o = wVar2;
                } else {
                    C26090w.C26092b bVar = new C26090w.C26092b();
                    bVar.mo52946f(wVar);
                    bVar.mo52946f(wVar2);
                    this.f72676o = bVar.mo52945e();
                }
                this.f72671g |= 16;
            }
            mo53568e(lVar);
            this.f74007d = this.f74007d.mo36541h(lVar.f72662e);
            return this;
        }

        /* renamed from: h */
        public C26048b mo52902h(C26586d dVar, C26589f fVar) {
            C26046l lVar;
            C26046l lVar2 = null;
            try {
                C26046l lVar3 = (C26046l) ((C26047a) C26046l.f72661r).mo52860a(dVar, fVar);
                if (lVar3 != null) {
                    mo52901g(lVar3);
                }
                return this;
            } catch (C26601j e) {
                lVar = (C26046l) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                mo52901g(lVar2);
            }
            throw th;
        }
    }

    static {
        C26046l lVar = new C26046l(true);
        f72660q = lVar;
        lVar.f72664g = Collections.emptyList();
        lVar.f72665h = Collections.emptyList();
        lVar.f72666i = Collections.emptyList();
        lVar.f72667j = C26079t.f72866j;
        lVar.f72668n = C26090w.f72925h;
    }

    public C26046l(C26593h.C26596c cVar, C26008a aVar) {
        super(cVar);
        this.f72669o = -1;
        this.f72670p = -1;
        this.f72662e = cVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        C26593h.C26597d<MessageType>.a i = mo53574i();
        for (int i2 = 0; i2 < this.f72664g.size(); i2++) {
            eVar.mo53541o(3, this.f72664g.get(i2));
        }
        for (int i3 = 0; i3 < this.f72665h.size(); i3++) {
            eVar.mo53541o(4, this.f72665h.get(i3));
        }
        for (int i4 = 0; i4 < this.f72666i.size(); i4++) {
            eVar.mo53541o(5, this.f72666i.get(i4));
        }
        if ((this.f72663f & 1) == 1) {
            eVar.mo53541o(30, this.f72667j);
        }
        if ((this.f72663f & 2) == 2) {
            eVar.mo53541o(32, this.f72668n);
        }
        i.mo53577a(200, eVar);
        eVar.mo53544r(this.f72662e);
    }

    public C26607p getDefaultInstanceForType() {
        return f72660q;
    }

    public int getSerializedSize() {
        int i = this.f72670p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f72664g.size(); i3++) {
            i2 += C26587e.m34407d(3, this.f72664g.get(i3));
        }
        for (int i4 = 0; i4 < this.f72665h.size(); i4++) {
            i2 += C26587e.m34407d(4, this.f72665h.get(i4));
        }
        for (int i5 = 0; i5 < this.f72666i.size(); i5++) {
            i2 += C26587e.m34407d(5, this.f72666i.get(i5));
        }
        if ((this.f72663f & 1) == 1) {
            i2 += C26587e.m34407d(30, this.f72667j);
        }
        if ((this.f72663f & 2) == 2) {
            i2 += C26587e.m34407d(32, this.f72668n);
        }
        int e = i2 + mo53570e() + this.f72662e.size();
        this.f72670p = e;
        return e;
    }

    public final boolean isInitialized() {
        byte b = this.f72669o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72664g.size(); i++) {
            if (!this.f72664g.get(i).isInitialized()) {
                this.f72669o = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f72665h.size(); i2++) {
            if (!this.f72665h.get(i2).isInitialized()) {
                this.f72669o = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f72666i.size(); i3++) {
            if (!this.f72666i.get(i3).isInitialized()) {
                this.f72669o = 0;
                return false;
            }
        }
        if (((this.f72663f & 1) == 1) && !this.f72667j.isInitialized()) {
            this.f72669o = 0;
            return false;
        } else if (!mo53569d()) {
            this.f72669o = 0;
            return false;
        } else {
            this.f72669o = 1;
            return true;
        }
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26048b();
    }

    public C26607p.C26608a toBuilder() {
        C26048b bVar = new C26048b();
        bVar.mo52901g(this);
        return bVar;
    }

    public C26046l(boolean z) {
        this.f72669o = -1;
        this.f72670p = -1;
        this.f72662e = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: qz3.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: qz3.w$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26046l(xz3.C26586d r10, xz3.C26589f r11, qz3.C26008a r12) {
        /*
            r9 = this;
            r9.<init>()
            r12 = -1
            r9.f72669o = r12
            r9.f72670p = r12
            java.util.List r12 = java.util.Collections.emptyList()
            r9.f72664g = r12
            java.util.List r12 = java.util.Collections.emptyList()
            r9.f72665h = r12
            java.util.List r12 = java.util.Collections.emptyList()
            r9.f72666i = r12
            qz3.t r12 = qz3.C26079t.f72866j
            r9.f72667j = r12
            qz3.w r12 = qz3.C26090w.f72925h
            r9.f72668n = r12
            xz3.c$b r12 = xz3.C23156c.m27503p()
            r0 = 1
            xz3.e r1 = xz3.C26587e.m34412j(r12, r0)
            r2 = 0
            r3 = 0
        L_0x002d:
            r4 = 4
            r5 = 2
            if (r2 != 0) goto L_0x014d
            int r6 = r10.mo53530n()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            if (r6 == 0) goto L_0x0100
            r7 = 26
            if (r6 == r7) goto L_0x00e6
            r7 = 34
            if (r6 == r7) goto L_0x00cc
            r7 = 42
            if (r6 == r7) goto L_0x00b2
            r7 = 242(0xf2, float:3.39E-43)
            r8 = 0
            if (r6 == r7) goto L_0x0088
            r7 = 258(0x102, float:3.62E-43)
            if (r6 == r7) goto L_0x0054
            boolean r4 = r9.mo53575j(r10, r1, r11, r6)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            if (r4 != 0) goto L_0x002d
            goto L_0x0100
        L_0x0054:
            int r6 = r9.f72663f     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6 = r6 & r5
            if (r6 != r5) goto L_0x006d
            qz3.w r6 = r9.f72668n     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.getClass()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            qz3.w$b r8 = new qz3.w$b     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r8.<init>()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r8.mo52946f(r6)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            goto L_0x006d
        L_0x0067:
            r10 = move-exception
            goto L_0x0113
        L_0x006a:
            r10 = move-exception
            goto L_0x0103
        L_0x006d:
            xz3.r<qz3.w> r6 = qz3.C26090w.f72926i     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.p r6 = r10.mo53523g(r6, r11)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            qz3.w r6 = (qz3.C26090w) r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72668n = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            if (r8 == 0) goto L_0x0082
            r8.mo52946f(r6)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            qz3.w r6 = r8.mo52945e()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72668n = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
        L_0x0082:
            int r6 = r9.f72663f     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6 = r6 | r5
            r9.f72663f = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            goto L_0x002d
        L_0x0088:
            int r6 = r9.f72663f     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6 = r6 & r0
            if (r6 != r0) goto L_0x0096
            qz3.t r6 = r9.f72667j     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.getClass()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            qz3.t$b r8 = qz3.C26079t.m33383d(r6)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
        L_0x0096:
            xz3.r<qz3.t> r6 = qz3.C26079t.f72867n     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.p r6 = r10.mo53523g(r6, r11)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            qz3.t r6 = (qz3.C26079t) r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72667j = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            if (r8 == 0) goto L_0x00ab
            r8.mo52937f(r6)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            qz3.t r6 = r8.mo52936e()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72667j = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
        L_0x00ab:
            int r6 = r9.f72663f     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6 = r6 | r0
            r9.f72663f = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            goto L_0x002d
        L_0x00b2:
            r6 = r3 & 4
            if (r6 == r4) goto L_0x00bf
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.<init>()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72666i = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r3 = r3 | 4
        L_0x00bf:
            java.util.List<qz3.r> r6 = r9.f72666i     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.r<qz3.r> r7 = qz3.C26072r.f72817v     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.p r7 = r10.mo53523g(r7, r11)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.add(r7)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            goto L_0x002d
        L_0x00cc:
            r6 = r3 & 2
            if (r6 == r5) goto L_0x00d9
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.<init>()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72665h = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r3 = r3 | 2
        L_0x00d9:
            java.util.List<qz3.n> r6 = r9.f72665h     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.r<qz3.n> r7 = qz3.C26052n.f72693B     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.p r7 = r10.mo53523g(r7, r11)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.add(r7)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            goto L_0x002d
        L_0x00e6:
            r6 = r3 & 1
            if (r6 == r0) goto L_0x00f3
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.<init>()     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r9.f72664g = r6     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r3 = r3 | 1
        L_0x00f3:
            java.util.List<qz3.i> r6 = r9.f72664g     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.r<qz3.i> r7 = qz3.C26041i.f72621B     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            xz3.p r7 = r10.mo53523g(r7, r11)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            r6.add(r7)     // Catch:{ j -> 0x010f, IOException -> 0x006a }
            goto L_0x002d
        L_0x0100:
            r2 = 1
            goto L_0x002d
        L_0x0103:
            xz3.j r11 = new xz3.j     // Catch:{ all -> 0x0067 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0067 }
            r11.<init>(r10)     // Catch:{ all -> 0x0067 }
            r11.f74023d = r9     // Catch:{ all -> 0x0067 }
            throw r11     // Catch:{ all -> 0x0067 }
        L_0x010f:
            r10 = move-exception
            r10.f74023d = r9     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x0113:
            r11 = r3 & 1
            if (r11 != r0) goto L_0x011f
            java.util.List<qz3.i> r11 = r9.f72664g
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f72664g = r11
        L_0x011f:
            r11 = r3 & 2
            if (r11 != r5) goto L_0x012b
            java.util.List<qz3.n> r11 = r9.f72665h
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f72665h = r11
        L_0x012b:
            r11 = r3 & 4
            if (r11 != r4) goto L_0x0137
            java.util.List<qz3.r> r11 = r9.f72666i
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f72666i = r11
        L_0x0137:
            r1.mo53536i()     // Catch:{ IOException -> 0x0143, all -> 0x013b }
            goto L_0x0143
        L_0x013b:
            r10 = move-exception
            xz3.c r11 = r12.mo36559c()
            r9.f72662e = r11
            throw r10
        L_0x0143:
            xz3.c r11 = r12.mo36559c()
            r9.f72662e = r11
            r9.mo53573h()
            throw r10
        L_0x014d:
            r10 = r3 & 1
            if (r10 != r0) goto L_0x0159
            java.util.List<qz3.i> r10 = r9.f72664g
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f72664g = r10
        L_0x0159:
            r10 = r3 & 2
            if (r10 != r5) goto L_0x0165
            java.util.List<qz3.n> r10 = r9.f72665h
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f72665h = r10
        L_0x0165:
            r10 = r3 & 4
            if (r10 != r4) goto L_0x0171
            java.util.List<qz3.r> r10 = r9.f72666i
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f72666i = r10
        L_0x0171:
            r1.mo53536i()     // Catch:{ IOException -> 0x017d, all -> 0x0175 }
            goto L_0x017d
        L_0x0175:
            r10 = move-exception
            xz3.c r11 = r12.mo36559c()
            r9.f72662e = r11
            throw r10
        L_0x017d:
            xz3.c r10 = r12.mo36559c()
            r9.f72662e = r10
            r9.mo53573h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26046l.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
