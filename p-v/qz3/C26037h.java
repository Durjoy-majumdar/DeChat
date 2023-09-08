package qz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qz3.C26065q;
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

/* renamed from: qz3.h */
public final class C26037h extends C26593h implements C26609q {

    /* renamed from: r */
    public static final C26037h f72594r;

    /* renamed from: s */
    public static C26610r<C26037h> f72595s = new C26038a();

    /* renamed from: d */
    public final C23156c f72596d;

    /* renamed from: e */
    public int f72597e;

    /* renamed from: f */
    public int f72598f;

    /* renamed from: g */
    public int f72599g;

    /* renamed from: h */
    public C26040c f72600h;

    /* renamed from: i */
    public C26065q f72601i;

    /* renamed from: j */
    public int f72602j;

    /* renamed from: n */
    public List<C26037h> f72603n;

    /* renamed from: o */
    public List<C26037h> f72604o;

    /* renamed from: p */
    public byte f72605p;

    /* renamed from: q */
    public int f72606q;

    /* renamed from: qz3.h$a */
    public static class C26038a extends C26585b<C26037h> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26037h(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.h$b */
    public static final class C26039b extends C26593h.C26595b<C26037h, C26039b> implements C26609q {

        /* renamed from: e */
        public int f72607e;

        /* renamed from: f */
        public int f72608f;

        /* renamed from: g */
        public int f72609g;

        /* renamed from: h */
        public C26040c f72610h = C26040c.TRUE;

        /* renamed from: i */
        public C26065q f72611i = C26065q.f72763z;

        /* renamed from: j */
        public int f72612j;

        /* renamed from: n */
        public List<C26037h> f72613n = Collections.emptyList();

        /* renamed from: o */
        public List<C26037h> f72614o = Collections.emptyList();

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52895g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52895g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26037h e = mo52893e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26039b bVar = new C26039b();
            bVar.mo52894f(mo52893e());
            return bVar;
        }

        public Object clone() {
            C26039b bVar = new C26039b();
            bVar.mo52894f(mo52893e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52894f((C26037h) hVar);
            return this;
        }

        /* renamed from: e */
        public C26037h mo52893e() {
            C26037h hVar = new C26037h(this, (C26008a) null);
            int i = this.f72607e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            hVar.f72598f = this.f72608f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            hVar.f72599g = this.f72609g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            hVar.f72600h = this.f72610h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            hVar.f72601i = this.f72611i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            hVar.f72602j = this.f72612j;
            if ((i & 32) == 32) {
                this.f72613n = Collections.unmodifiableList(this.f72613n);
                this.f72607e &= -33;
            }
            hVar.f72603n = this.f72613n;
            if ((this.f72607e & 64) == 64) {
                this.f72614o = Collections.unmodifiableList(this.f72614o);
                this.f72607e &= -65;
            }
            hVar.f72604o = this.f72614o;
            hVar.f72597e = i2;
            return hVar;
        }

        /* renamed from: f */
        public C26039b mo52894f(C26037h hVar) {
            C26065q qVar;
            if (hVar == C26037h.f72594r) {
                return this;
            }
            int i = hVar.f72597e;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = hVar.f72598f;
                this.f72607e |= 1;
                this.f72608f = i2;
            }
            if ((i & 2) == 2) {
                int i3 = hVar.f72599g;
                this.f72607e = 2 | this.f72607e;
                this.f72609g = i3;
            }
            if ((i & 4) == 4) {
                C26040c cVar = hVar.f72600h;
                cVar.getClass();
                this.f72607e = 4 | this.f72607e;
                this.f72610h = cVar;
            }
            if ((hVar.f72597e & 8) == 8) {
                C26065q qVar2 = hVar.f72601i;
                if ((this.f72607e & 8) != 8 || (qVar = this.f72611i) == C26065q.f72763z) {
                    this.f72611i = qVar2;
                } else {
                    C26065q.C26071c n = C26065q.m33342n(qVar);
                    n.mo52866d(qVar2);
                    this.f72611i = n.mo52925f();
                }
                this.f72607e |= 8;
            }
            if ((hVar.f72597e & 16) == 16) {
                z = true;
            }
            if (z) {
                int i4 = hVar.f72602j;
                this.f72607e = 16 | this.f72607e;
                this.f72612j = i4;
            }
            if (!hVar.f72603n.isEmpty()) {
                if (this.f72613n.isEmpty()) {
                    this.f72613n = hVar.f72603n;
                    this.f72607e &= -33;
                } else {
                    if ((this.f72607e & 32) != 32) {
                        this.f72613n = new ArrayList(this.f72613n);
                        this.f72607e |= 32;
                    }
                    this.f72613n.addAll(hVar.f72603n);
                }
            }
            if (!hVar.f72604o.isEmpty()) {
                if (this.f72614o.isEmpty()) {
                    this.f72614o = hVar.f72604o;
                    this.f72607e &= -65;
                } else {
                    if ((this.f72607e & 64) != 64) {
                        this.f72614o = new ArrayList(this.f72614o);
                        this.f72607e |= 64;
                    }
                    this.f72614o.addAll(hVar.f72604o);
                }
            }
            this.f74007d = this.f74007d.mo36541h(hVar.f72596d);
            return this;
        }

        /* renamed from: g */
        public C26039b mo52895g(C26586d dVar, C26589f fVar) {
            C26037h hVar;
            C26037h hVar2 = null;
            try {
                C26037h hVar3 = (C26037h) ((C26038a) C26037h.f72595s).mo52860a(dVar, fVar);
                if (hVar3 != null) {
                    mo52894f(hVar3);
                }
                return this;
            } catch (C26601j e) {
                hVar = (C26037h) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                mo52894f(hVar2);
            }
            throw th;
        }
    }

    /* renamed from: qz3.h$c */
    public enum C26040c implements C23159i.C23160a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: d */
        public final int f72619d;

        /* access modifiers changed from: public */
        C26040c(int i, int i2) {
            this.f72619d = i2;
        }

        public final int getNumber() {
            return this.f72619d;
        }
    }

    static {
        C26037h hVar = new C26037h(true);
        f72594r = hVar;
        hVar.f72598f = 0;
        hVar.f72599g = 0;
        hVar.f72600h = C26040c.TRUE;
        hVar.f72601i = C26065q.f72763z;
        hVar.f72602j = 0;
        hVar.f72603n = Collections.emptyList();
        hVar.f72604o = Collections.emptyList();
    }

    public C26037h(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72605p = -1;
        this.f72606q = -1;
        this.f72596d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        if ((this.f72597e & 1) == 1) {
            eVar.mo53539m(1, this.f72598f);
        }
        if ((this.f72597e & 2) == 2) {
            eVar.mo53539m(2, this.f72599g);
        }
        if ((this.f72597e & 4) == 4) {
            eVar.mo53538l(3, this.f72600h.f72619d);
        }
        if ((this.f72597e & 8) == 8) {
            eVar.mo53541o(4, this.f72601i);
        }
        if ((this.f72597e & 16) == 16) {
            eVar.mo53539m(5, this.f72602j);
        }
        for (int i = 0; i < this.f72603n.size(); i++) {
            eVar.mo53541o(6, this.f72603n.get(i));
        }
        for (int i2 = 0; i2 < this.f72604o.size(); i2++) {
            eVar.mo53541o(7, this.f72604o.get(i2));
        }
        eVar.mo53544r(this.f72596d);
    }

    public int getSerializedSize() {
        int i = this.f72606q;
        if (i != -1) {
            return i;
        }
        int b = (this.f72597e & 1) == 1 ? C26587e.m34405b(1, this.f72598f) + 0 : 0;
        if ((this.f72597e & 2) == 2) {
            b += C26587e.m34405b(2, this.f72599g);
        }
        if ((this.f72597e & 4) == 4) {
            b += C26587e.m34404a(3, this.f72600h.f72619d);
        }
        if ((this.f72597e & 8) == 8) {
            b += C26587e.m34407d(4, this.f72601i);
        }
        if ((this.f72597e & 16) == 16) {
            b += C26587e.m34405b(5, this.f72602j);
        }
        for (int i2 = 0; i2 < this.f72603n.size(); i2++) {
            b += C26587e.m34407d(6, this.f72603n.get(i2));
        }
        for (int i3 = 0; i3 < this.f72604o.size(); i3++) {
            b += C26587e.m34407d(7, this.f72604o.get(i3));
        }
        int size = b + this.f72596d.size();
        this.f72606q = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72605p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f72597e & 8) == 8) || this.f72601i.isInitialized()) {
            for (int i = 0; i < this.f72603n.size(); i++) {
                if (!this.f72603n.get(i).isInitialized()) {
                    this.f72605p = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.f72604o.size(); i2++) {
                if (!this.f72604o.get(i2).isInitialized()) {
                    this.f72605p = 0;
                    return false;
                }
            }
            this.f72605p = 1;
            return true;
        }
        this.f72605p = 0;
        return false;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26039b();
    }

    public C26607p.C26608a toBuilder() {
        C26039b bVar = new C26039b();
        bVar.mo52894f(this);
        return bVar;
    }

    public C26037h(boolean z) {
        this.f72605p = -1;
        this.f72606q = -1;
        this.f72596d = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: qz3.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: qz3.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: qz3.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: qz3.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: qz3.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: qz3.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: qz3.h$c} */
    /* JADX WARNING: type inference failed for: r16v5, types: [qz3.q$c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26037h(xz3.C26586d r18, xz3.C26589f r19, qz3.C26008a r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            qz3.h$c r3 = qz3.C26037h.C26040c.TRUE
            r17.<init>()
            r4 = -1
            r1.f72605p = r4
            r1.f72606q = r4
            r4 = 0
            r1.f72598f = r4
            r1.f72599g = r4
            r1.f72600h = r3
            qz3.q r5 = qz3.C26065q.f72763z
            r1.f72601i = r5
            r1.f72602j = r4
            java.util.List r5 = java.util.Collections.emptyList()
            r1.f72603n = r5
            java.util.List r5 = java.util.Collections.emptyList()
            r1.f72604o = r5
            xz3.c$b r5 = xz3.C23156c.m27503p()
            r6 = 1
            xz3.e r7 = xz3.C26587e.m34412j(r5, r6)
            r8 = 0
        L_0x0033:
            r9 = 64
            r10 = 32
            if (r4 != 0) goto L_0x0157
            int r11 = r18.mo53530n()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            if (r11 == 0) goto L_0x0118
            r12 = 8
            if (r11 == r12) goto L_0x010b
            r13 = 16
            r14 = 2
            if (r11 == r13) goto L_0x00fe
            r15 = 24
            r16 = 0
            if (r11 == r15) goto L_0x00d6
            r14 = 34
            if (r11 == r14) goto L_0x00a4
            r12 = 40
            if (r11 == r12) goto L_0x0098
            r12 = 50
            if (r11 == r12) goto L_0x007f
            r12 = 58
            if (r11 == r12) goto L_0x0066
            boolean r9 = r0.mo53533q(r11, r7)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            if (r9 != 0) goto L_0x0033
            goto L_0x0118
        L_0x0066:
            r11 = r8 & 64
            if (r11 == r9) goto L_0x0073
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11.<init>()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72604o = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r8 = r8 | 64
        L_0x0073:
            java.util.List<qz3.h> r11 = r1.f72604o     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            xz3.r<qz3.h> r12 = f72595s     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            xz3.p r12 = r0.mo53523g(r12, r2)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11.add(r12)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x007f:
            r11 = r8 & 32
            if (r11 == r10) goto L_0x008c
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11.<init>()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72603n = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r8 = r8 | 32
        L_0x008c:
            java.util.List<qz3.h> r11 = r1.f72603n     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            xz3.r<qz3.h> r12 = f72595s     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            xz3.p r12 = r0.mo53523g(r12, r2)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11.add(r12)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x0098:
            int r11 = r1.f72597e     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11 = r11 | r13
            r1.f72597e = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            int r11 = r18.mo53527k()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72602j = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x00a4:
            int r11 = r1.f72597e     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11 = r11 & r12
            if (r11 != r12) goto L_0x00b8
            qz3.q r11 = r1.f72601i     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11.getClass()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            qz3.q$c r16 = qz3.C26065q.m33342n(r11)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x00b8
        L_0x00b3:
            r0 = move-exception
            goto L_0x012b
        L_0x00b6:
            r0 = move-exception
            goto L_0x011b
        L_0x00b8:
            r11 = r16
            xz3.r<qz3.q> r13 = qz3.C26065q.f72762A     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            xz3.p r13 = r0.mo53523g(r13, r2)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            qz3.q r13 = (qz3.C26065q) r13     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72601i = r13     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            if (r11 == 0) goto L_0x00cf
            r11.mo52866d(r13)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            qz3.q r11 = r11.mo52925f()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72601i = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
        L_0x00cf:
            int r11 = r1.f72597e     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11 = r11 | r12
            r1.f72597e = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x00d6:
            int r12 = r18.mo53527k()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            if (r12 == 0) goto L_0x00e9
            if (r12 == r6) goto L_0x00e4
            if (r12 == r14) goto L_0x00e1
            goto L_0x00e6
        L_0x00e1:
            qz3.h$c r16 = qz3.C26037h.C26040c.NULL     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x00e6
        L_0x00e4:
            qz3.h$c r16 = qz3.C26037h.C26040c.FALSE     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
        L_0x00e6:
            r13 = r16
            goto L_0x00ea
        L_0x00e9:
            r13 = r3
        L_0x00ea:
            if (r13 != 0) goto L_0x00f4
            r7.mo53548v(r11)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r7.mo53548v(r12)     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x00f4:
            int r11 = r1.f72597e     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11 = r11 | 4
            r1.f72597e = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72600h = r13     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x00fe:
            int r11 = r1.f72597e     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11 = r11 | r14
            r1.f72597e = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            int r11 = r18.mo53527k()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72599g = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x010b:
            int r11 = r1.f72597e     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r11 = r11 | r6
            r1.f72597e = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            int r11 = r18.mo53527k()     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            r1.f72598f = r11     // Catch:{ j -> 0x0127, IOException -> 0x00b6 }
            goto L_0x0033
        L_0x0118:
            r4 = 1
            goto L_0x0033
        L_0x011b:
            xz3.j r2 = new xz3.j     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00b3 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b3 }
            r2.f74023d = r1     // Catch:{ all -> 0x00b3 }
            throw r2     // Catch:{ all -> 0x00b3 }
        L_0x0127:
            r0 = move-exception
            r0.f74023d = r1     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x012b:
            r2 = r8 & 32
            if (r2 != r10) goto L_0x0137
            java.util.List<qz3.h> r2 = r1.f72603n
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f72603n = r2
        L_0x0137:
            r2 = r8 & 64
            if (r2 != r9) goto L_0x0143
            java.util.List<qz3.h> r2 = r1.f72604o
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f72604o = r2
        L_0x0143:
            r7.mo53536i()     // Catch:{ IOException -> 0x0150, all -> 0x0147 }
            goto L_0x0150
        L_0x0147:
            r0 = move-exception
            r2 = r0
            xz3.c r0 = r5.mo36559c()
            r1.f72596d = r0
            throw r2
        L_0x0150:
            xz3.c r2 = r5.mo36559c()
            r1.f72596d = r2
            throw r0
        L_0x0157:
            r0 = r8 & 32
            if (r0 != r10) goto L_0x0163
            java.util.List<qz3.h> r0 = r1.f72603n
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f72603n = r0
        L_0x0163:
            r0 = r8 & 64
            if (r0 != r9) goto L_0x016f
            java.util.List<qz3.h> r0 = r1.f72604o
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f72604o = r0
        L_0x016f:
            r7.mo53536i()     // Catch:{ IOException -> 0x017c, all -> 0x0173 }
            goto L_0x017c
        L_0x0173:
            r0 = move-exception
            r2 = r0
            xz3.c r0 = r5.mo36559c()
            r1.f72596d = r0
            throw r2
        L_0x017c:
            xz3.c r0 = r5.mo36559c()
            r1.f72596d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26037h.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
