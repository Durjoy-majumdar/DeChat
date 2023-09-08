package qz3;

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

/* renamed from: qz3.v */
public final class C26085v extends C26593h implements C26609q {

    /* renamed from: q */
    public static final C26085v f72896q;

    /* renamed from: r */
    public static C26610r<C26085v> f72897r = new C26086a();

    /* renamed from: d */
    public final C23156c f72898d;

    /* renamed from: e */
    public int f72899e;

    /* renamed from: f */
    public int f72900f;

    /* renamed from: g */
    public int f72901g;

    /* renamed from: h */
    public C26088c f72902h;

    /* renamed from: i */
    public int f72903i;

    /* renamed from: j */
    public int f72904j;

    /* renamed from: n */
    public C26089d f72905n;

    /* renamed from: o */
    public byte f72906o;

    /* renamed from: p */
    public int f72907p;

    /* renamed from: qz3.v$a */
    public static class C26086a extends C26585b<C26085v> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26085v(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.v$b */
    public static final class C26087b extends C26593h.C26595b<C26085v, C26087b> implements C26609q {

        /* renamed from: e */
        public int f72908e;

        /* renamed from: f */
        public int f72909f;

        /* renamed from: g */
        public int f72910g;

        /* renamed from: h */
        public C26088c f72911h = C26088c.ERROR;

        /* renamed from: i */
        public int f72912i;

        /* renamed from: j */
        public int f72913j;

        /* renamed from: n */
        public C26089d f72914n = C26089d.LANGUAGE_VERSION;

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52944g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52944g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26085v e = mo52942e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26087b bVar = new C26087b();
            bVar.mo52943f(mo52942e());
            return bVar;
        }

        public Object clone() {
            C26087b bVar = new C26087b();
            bVar.mo52943f(mo52942e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52943f((C26085v) hVar);
            return this;
        }

        /* renamed from: e */
        public C26085v mo52942e() {
            C26085v vVar = new C26085v(this, (C26008a) null);
            int i = this.f72908e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            vVar.f72900f = this.f72909f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            vVar.f72901g = this.f72910g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            vVar.f72902h = this.f72911h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            vVar.f72903i = this.f72912i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            vVar.f72904j = this.f72913j;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            vVar.f72905n = this.f72914n;
            vVar.f72899e = i2;
            return vVar;
        }

        /* renamed from: f */
        public C26087b mo52943f(C26085v vVar) {
            if (vVar == C26085v.f72896q) {
                return this;
            }
            int i = vVar.f72899e;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = vVar.f72900f;
                this.f72908e |= 1;
                this.f72909f = i2;
            }
            if ((i & 2) == 2) {
                int i3 = vVar.f72901g;
                this.f72908e = 2 | this.f72908e;
                this.f72910g = i3;
            }
            if ((i & 4) == 4) {
                C26088c cVar = vVar.f72902h;
                cVar.getClass();
                this.f72908e = 4 | this.f72908e;
                this.f72911h = cVar;
            }
            int i4 = vVar.f72899e;
            if ((i4 & 8) == 8) {
                int i5 = vVar.f72903i;
                this.f72908e = 8 | this.f72908e;
                this.f72912i = i5;
            }
            if ((i4 & 16) == 16) {
                int i6 = vVar.f72904j;
                this.f72908e = 16 | this.f72908e;
                this.f72913j = i6;
            }
            if ((i4 & 32) == 32) {
                z = true;
            }
            if (z) {
                C26089d dVar = vVar.f72905n;
                dVar.getClass();
                this.f72908e = 32 | this.f72908e;
                this.f72914n = dVar;
            }
            this.f74007d = this.f74007d.mo36541h(vVar.f72898d);
            return this;
        }

        /* renamed from: g */
        public C26087b mo52944g(C26586d dVar, C26589f fVar) {
            C26085v vVar;
            C26085v vVar2 = null;
            try {
                C26085v vVar3 = (C26085v) ((C26086a) C26085v.f72897r).mo52860a(dVar, fVar);
                if (vVar3 != null) {
                    mo52943f(vVar3);
                }
                return this;
            } catch (C26601j e) {
                vVar = (C26085v) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                mo52943f(vVar2);
            }
            throw th;
        }
    }

    /* renamed from: qz3.v$c */
    public enum C26088c implements C23159i.C23160a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: d */
        public final int f72919d;

        /* access modifiers changed from: public */
        C26088c(int i, int i2) {
            this.f72919d = i2;
        }

        public final int getNumber() {
            return this.f72919d;
        }
    }

    /* renamed from: qz3.v$d */
    public enum C26089d implements C23159i.C23160a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: d */
        public final int f72924d;

        /* access modifiers changed from: public */
        C26089d(int i, int i2) {
            this.f72924d = i2;
        }

        public final int getNumber() {
            return this.f72924d;
        }
    }

    static {
        C26085v vVar = new C26085v(true);
        f72896q = vVar;
        vVar.f72900f = 0;
        vVar.f72901g = 0;
        vVar.f72902h = C26088c.ERROR;
        vVar.f72903i = 0;
        vVar.f72904j = 0;
        vVar.f72905n = C26089d.LANGUAGE_VERSION;
    }

    public C26085v(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72906o = -1;
        this.f72907p = -1;
        this.f72898d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        if ((this.f72899e & 1) == 1) {
            eVar.mo53539m(1, this.f72900f);
        }
        if ((this.f72899e & 2) == 2) {
            eVar.mo53539m(2, this.f72901g);
        }
        if ((this.f72899e & 4) == 4) {
            eVar.mo53538l(3, this.f72902h.f72919d);
        }
        if ((this.f72899e & 8) == 8) {
            eVar.mo53539m(4, this.f72903i);
        }
        if ((this.f72899e & 16) == 16) {
            eVar.mo53539m(5, this.f72904j);
        }
        if ((this.f72899e & 32) == 32) {
            eVar.mo53538l(6, this.f72905n.f72924d);
        }
        eVar.mo53544r(this.f72898d);
    }

    public int getSerializedSize() {
        int i = this.f72907p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f72899e & 1) == 1) {
            i2 = 0 + C26587e.m34405b(1, this.f72900f);
        }
        if ((this.f72899e & 2) == 2) {
            i2 += C26587e.m34405b(2, this.f72901g);
        }
        if ((this.f72899e & 4) == 4) {
            i2 += C26587e.m34404a(3, this.f72902h.f72919d);
        }
        if ((this.f72899e & 8) == 8) {
            i2 += C26587e.m34405b(4, this.f72903i);
        }
        if ((this.f72899e & 16) == 16) {
            i2 += C26587e.m34405b(5, this.f72904j);
        }
        if ((this.f72899e & 32) == 32) {
            i2 += C26587e.m34404a(6, this.f72905n.f72924d);
        }
        int size = i2 + this.f72898d.size();
        this.f72907p = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72906o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f72906o = 1;
        return true;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26087b();
    }

    public C26607p.C26608a toBuilder() {
        C26087b bVar = new C26087b();
        bVar.mo52943f(this);
        return bVar;
    }

    public C26085v(boolean z) {
        this.f72906o = -1;
        this.f72907p = -1;
        this.f72898d = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: qz3.v$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: qz3.v$d} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26085v(xz3.C26586d r11, xz3.C26589f r12, qz3.C26008a r13) {
        /*
            r10 = this;
            qz3.v$d r12 = qz3.C26085v.C26089d.LANGUAGE_VERSION
            qz3.v$c r13 = qz3.C26085v.C26088c.ERROR
            r10.<init>()
            r0 = -1
            r10.f72906o = r0
            r10.f72907p = r0
            r0 = 0
            r10.f72900f = r0
            r10.f72901g = r0
            r10.f72902h = r13
            r10.f72903i = r0
            r10.f72904j = r0
            r10.f72905n = r12
            xz3.c$b r1 = xz3.C23156c.m27503p()
            r2 = 1
            xz3.e r3 = xz3.C26587e.m34412j(r1, r2)
        L_0x0022:
            if (r0 != 0) goto L_0x00f3
            int r4 = r11.mo53530n()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            if (r4 == 0) goto L_0x00cd
            r5 = 8
            if (r4 == r5) goto L_0x00c0
            r6 = 16
            r7 = 2
            if (r4 == r6) goto L_0x00b3
            r8 = 24
            r9 = 0
            if (r4 == r8) goto L_0x008d
            r8 = 32
            if (r4 == r8) goto L_0x0081
            r5 = 40
            if (r4 == r5) goto L_0x0075
            r5 = 48
            if (r4 == r5) goto L_0x004c
            boolean r4 = r11.mo53533q(r4, r3)     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            if (r4 != 0) goto L_0x0022
            goto L_0x00cd
        L_0x004c:
            int r5 = r11.mo53527k()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            if (r5 == 0) goto L_0x0063
            if (r5 == r2) goto L_0x0060
            if (r5 == r7) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            qz3.v$d r9 = qz3.C26085v.C26089d.API_VERSION     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0064
        L_0x005a:
            r11 = move-exception
            goto L_0x00e0
        L_0x005d:
            r11 = move-exception
            goto L_0x00d0
        L_0x0060:
            qz3.v$d r9 = qz3.C26085v.C26089d.COMPILER_VERSION     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0064
        L_0x0063:
            r9 = r12
        L_0x0064:
            if (r9 != 0) goto L_0x006d
            r3.mo53548v(r4)     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r3.mo53548v(r5)     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x006d:
            int r4 = r10.f72899e     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r4 = r4 | r8
            r10.f72899e = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r10.f72905n = r9     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x0075:
            int r4 = r10.f72899e     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r4 = r4 | r6
            r10.f72899e = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            int r4 = r11.mo53527k()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r10.f72904j = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x0081:
            int r4 = r10.f72899e     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r4 = r4 | r5
            r10.f72899e = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            int r4 = r11.mo53527k()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r10.f72903i = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x008d:
            int r5 = r11.mo53527k()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            if (r5 == 0) goto L_0x009d
            if (r5 == r2) goto L_0x009b
            if (r5 == r7) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            qz3.v$c r9 = qz3.C26085v.C26088c.HIDDEN     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x009f
        L_0x009b:
            r9 = r13
            goto L_0x009f
        L_0x009d:
            qz3.v$c r9 = qz3.C26085v.C26088c.WARNING     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
        L_0x009f:
            if (r9 != 0) goto L_0x00a9
            r3.mo53548v(r4)     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r3.mo53548v(r5)     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x00a9:
            int r4 = r10.f72899e     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r4 = r4 | 4
            r10.f72899e = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r10.f72902h = r9     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x00b3:
            int r4 = r10.f72899e     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r4 = r4 | r7
            r10.f72899e = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            int r4 = r11.mo53527k()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r10.f72901g = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x00c0:
            int r4 = r10.f72899e     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r4 = r4 | r2
            r10.f72899e = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            int r4 = r11.mo53527k()     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            r10.f72900f = r4     // Catch:{ j -> 0x00dc, IOException -> 0x005d }
            goto L_0x0022
        L_0x00cd:
            r0 = 1
            goto L_0x0022
        L_0x00d0:
            xz3.j r12 = new xz3.j     // Catch:{ all -> 0x005a }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x005a }
            r12.<init>(r11)     // Catch:{ all -> 0x005a }
            r12.f74023d = r10     // Catch:{ all -> 0x005a }
            throw r12     // Catch:{ all -> 0x005a }
        L_0x00dc:
            r11 = move-exception
            r11.f74023d = r10     // Catch:{ all -> 0x005a }
            throw r11     // Catch:{ all -> 0x005a }
        L_0x00e0:
            r3.mo53536i()     // Catch:{ IOException -> 0x00ec, all -> 0x00e4 }
            goto L_0x00ec
        L_0x00e4:
            r11 = move-exception
            xz3.c r12 = r1.mo36559c()
            r10.f72898d = r12
            throw r11
        L_0x00ec:
            xz3.c r12 = r1.mo36559c()
            r10.f72898d = r12
            throw r11
        L_0x00f3:
            r3.mo53536i()     // Catch:{ IOException -> 0x00ff, all -> 0x00f7 }
            goto L_0x00ff
        L_0x00f7:
            r11 = move-exception
            xz3.c r12 = r1.mo36559c()
            r10.f72898d = r12
            throw r11
        L_0x00ff:
            xz3.c r11 = r1.mo36559c()
            r10.f72898d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26085v.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
