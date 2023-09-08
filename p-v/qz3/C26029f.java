package qz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qz3.C26037h;
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

/* renamed from: qz3.f */
public final class C26029f extends C26593h implements C26609q {

    /* renamed from: o */
    public static final C26029f f72560o;

    /* renamed from: p */
    public static C26610r<C26029f> f72561p = new C26030a();

    /* renamed from: d */
    public final C23156c f72562d;

    /* renamed from: e */
    public int f72563e;

    /* renamed from: f */
    public C26032c f72564f;

    /* renamed from: g */
    public List<C26037h> f72565g;

    /* renamed from: h */
    public C26037h f72566h;

    /* renamed from: i */
    public C26033d f72567i;

    /* renamed from: j */
    public byte f72568j;

    /* renamed from: n */
    public int f72569n;

    /* renamed from: qz3.f$a */
    public static class C26030a extends C26585b<C26029f> {
        /* renamed from: a */
        public Object mo52860a(C26586d dVar, C26589f fVar) {
            return new C26029f(dVar, fVar, (C26008a) null);
        }
    }

    /* renamed from: qz3.f$b */
    public static final class C26031b extends C26593h.C26595b<C26029f, C26031b> implements C26609q {

        /* renamed from: e */
        public int f72570e;

        /* renamed from: f */
        public C26032c f72571f = C26032c.RETURNS_CONSTANT;

        /* renamed from: g */
        public List<C26037h> f72572g = Collections.emptyList();

        /* renamed from: h */
        public C26037h f72573h = C26037h.f72594r;

        /* renamed from: i */
        public C26033d f72574i = C26033d.AT_MOST_ONCE;

        /* renamed from: M */
        public /* bridge */ /* synthetic */ C26607p.C26608a mo52861M(C26586d dVar, C26589f fVar) {
            mo52890g(dVar, fVar);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C26583a.C26584a mo52862b(C26586d dVar, C26589f fVar) {
            mo52890g(dVar, fVar);
            return this;
        }

        public C26607p build() {
            C26029f e = mo52888e();
            if (e.isInitialized()) {
                return e;
            }
            throw new C26611v(e);
        }

        /* renamed from: c */
        public C26593h.C26595b mo52864c() {
            C26031b bVar = new C26031b();
            bVar.mo52889f(mo52888e());
            return bVar;
        }

        public Object clone() {
            C26031b bVar = new C26031b();
            bVar.mo52889f(mo52888e());
            return bVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C26593h.C26595b mo52866d(C26593h hVar) {
            mo52889f((C26029f) hVar);
            return this;
        }

        /* renamed from: e */
        public C26029f mo52888e() {
            C26029f fVar = new C26029f(this, (C26008a) null);
            int i = this.f72570e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            fVar.f72564f = this.f72571f;
            if ((i & 2) == 2) {
                this.f72572g = Collections.unmodifiableList(this.f72572g);
                this.f72570e &= -3;
            }
            fVar.f72565g = this.f72572g;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            fVar.f72566h = this.f72573h;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            fVar.f72567i = this.f72574i;
            fVar.f72563e = i2;
            return fVar;
        }

        /* renamed from: f */
        public C26031b mo52889f(C26029f fVar) {
            C26037h hVar;
            if (fVar == C26029f.f72560o) {
                return this;
            }
            boolean z = true;
            if ((fVar.f72563e & 1) == 1) {
                C26032c cVar = fVar.f72564f;
                cVar.getClass();
                this.f72570e |= 1;
                this.f72571f = cVar;
            }
            if (!fVar.f72565g.isEmpty()) {
                if (this.f72572g.isEmpty()) {
                    this.f72572g = fVar.f72565g;
                    this.f72570e &= -3;
                } else {
                    if ((this.f72570e & 2) != 2) {
                        this.f72572g = new ArrayList(this.f72572g);
                        this.f72570e |= 2;
                    }
                    this.f72572g.addAll(fVar.f72565g);
                }
            }
            if ((fVar.f72563e & 2) == 2) {
                C26037h hVar2 = fVar.f72566h;
                if ((this.f72570e & 4) != 4 || (hVar = this.f72573h) == C26037h.f72594r) {
                    this.f72573h = hVar2;
                } else {
                    C26037h.C26039b bVar = new C26037h.C26039b();
                    bVar.mo52894f(hVar);
                    bVar.mo52894f(hVar2);
                    this.f72573h = bVar.mo52893e();
                }
                this.f72570e |= 4;
            }
            if ((fVar.f72563e & 4) != 4) {
                z = false;
            }
            if (z) {
                C26033d dVar = fVar.f72567i;
                dVar.getClass();
                this.f72570e |= 8;
                this.f72574i = dVar;
            }
            this.f74007d = this.f74007d.mo36541h(fVar.f72562d);
            return this;
        }

        /* renamed from: g */
        public C26031b mo52890g(C26586d dVar, C26589f fVar) {
            C26029f fVar2;
            C26029f fVar3 = null;
            try {
                C26029f fVar4 = (C26029f) ((C26030a) C26029f.f72561p).mo52860a(dVar, fVar);
                if (fVar4 != null) {
                    mo52889f(fVar4);
                }
                return this;
            } catch (C26601j e) {
                fVar2 = (C26029f) e.f74023d;
                throw e;
            } catch (Throwable th) {
                th = th;
                fVar3 = fVar2;
            }
            if (fVar3 != null) {
                mo52889f(fVar3);
            }
            throw th;
        }
    }

    /* renamed from: qz3.f$c */
    public enum C26032c implements C23159i.C23160a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: d */
        public final int f72579d;

        /* access modifiers changed from: public */
        C26032c(int i, int i2) {
            this.f72579d = i2;
        }

        public final int getNumber() {
            return this.f72579d;
        }
    }

    /* renamed from: qz3.f$d */
    public enum C26033d implements C23159i.C23160a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: d */
        public final int f72584d;

        /* access modifiers changed from: public */
        C26033d(int i, int i2) {
            this.f72584d = i2;
        }

        public final int getNumber() {
            return this.f72584d;
        }
    }

    static {
        C26029f fVar = new C26029f(true);
        f72560o = fVar;
        fVar.f72564f = C26032c.RETURNS_CONSTANT;
        fVar.f72565g = Collections.emptyList();
        fVar.f72566h = C26037h.f72594r;
        fVar.f72567i = C26033d.AT_MOST_ONCE;
    }

    public C26029f(C26593h.C26595b bVar, C26008a aVar) {
        super(bVar);
        this.f72568j = -1;
        this.f72569n = -1;
        this.f72562d = bVar.f74007d;
    }

    /* renamed from: a */
    public void mo52855a(C26587e eVar) {
        getSerializedSize();
        if ((this.f72563e & 1) == 1) {
            eVar.mo53538l(1, this.f72564f.f72579d);
        }
        for (int i = 0; i < this.f72565g.size(); i++) {
            eVar.mo53541o(2, this.f72565g.get(i));
        }
        if ((this.f72563e & 2) == 2) {
            eVar.mo53541o(3, this.f72566h);
        }
        if ((this.f72563e & 4) == 4) {
            eVar.mo53538l(4, this.f72567i.f72584d);
        }
        eVar.mo53544r(this.f72562d);
    }

    public int getSerializedSize() {
        int i = this.f72569n;
        if (i != -1) {
            return i;
        }
        int a = (this.f72563e & 1) == 1 ? C26587e.m34404a(1, this.f72564f.f72579d) + 0 : 0;
        for (int i2 = 0; i2 < this.f72565g.size(); i2++) {
            a += C26587e.m34407d(2, this.f72565g.get(i2));
        }
        if ((this.f72563e & 2) == 2) {
            a += C26587e.m34407d(3, this.f72566h);
        }
        if ((this.f72563e & 4) == 4) {
            a += C26587e.m34404a(4, this.f72567i.f72584d);
        }
        int size = a + this.f72562d.size();
        this.f72569n = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.f72568j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f72565g.size(); i++) {
            if (!this.f72565g.get(i).isInitialized()) {
                this.f72568j = 0;
                return false;
            }
        }
        if (!((this.f72563e & 2) == 2) || this.f72566h.isInitialized()) {
            this.f72568j = 1;
            return true;
        }
        this.f72568j = 0;
        return false;
    }

    public C26607p.C26608a newBuilderForType() {
        return new C26031b();
    }

    public C26607p.C26608a toBuilder() {
        C26031b bVar = new C26031b();
        bVar.mo52889f(this);
        return bVar;
    }

    public C26029f(boolean z) {
        this.f72568j = -1;
        this.f72569n = -1;
        this.f72562d = C23156c.f66530d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: qz3.f$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: qz3.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: qz3.f$d} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26029f(xz3.C26586d r11, xz3.C26589f r12, qz3.C26008a r13) {
        /*
            r10 = this;
            qz3.f$d r13 = qz3.C26029f.C26033d.AT_MOST_ONCE
            qz3.f$c r0 = qz3.C26029f.C26032c.RETURNS_CONSTANT
            r10.<init>()
            r1 = -1
            r10.f72568j = r1
            r10.f72569n = r1
            r10.f72564f = r0
            java.util.List r1 = java.util.Collections.emptyList()
            r10.f72565g = r1
            qz3.h r1 = qz3.C26037h.f72594r
            r10.f72566h = r1
            r10.f72567i = r13
            xz3.c$b r1 = xz3.C23156c.m27503p()
            r2 = 1
            xz3.e r3 = xz3.C26587e.m34412j(r1, r2)
            r4 = 0
            r5 = 0
        L_0x0025:
            r6 = 2
            if (r4 != 0) goto L_0x010f
            int r7 = r11.mo53530n()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            if (r7 == 0) goto L_0x00dd
            r8 = 8
            r9 = 0
            if (r7 == r8) goto L_0x00b8
            r8 = 18
            if (r7 == r8) goto L_0x009e
            r8 = 26
            if (r7 == r8) goto L_0x0071
            r8 = 32
            if (r7 == r8) goto L_0x0047
            boolean r6 = r11.mo53533q(r7, r3)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            if (r6 != 0) goto L_0x0025
            goto L_0x00dd
        L_0x0047:
            int r8 = r11.mo53527k()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            if (r8 == 0) goto L_0x005e
            if (r8 == r2) goto L_0x005b
            if (r8 == r6) goto L_0x0052
            goto L_0x005f
        L_0x0052:
            qz3.f$d r9 = qz3.C26029f.C26033d.AT_LEAST_ONCE     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x005f
        L_0x0055:
            r11 = move-exception
            goto L_0x00f0
        L_0x0058:
            r11 = move-exception
            goto L_0x00e0
        L_0x005b:
            qz3.f$d r9 = qz3.C26029f.C26033d.EXACTLY_ONCE     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x005f
        L_0x005e:
            r9 = r13
        L_0x005f:
            if (r9 != 0) goto L_0x0068
            r3.mo53548v(r7)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r3.mo53548v(r8)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x0025
        L_0x0068:
            int r7 = r10.f72563e     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7 = r7 | 4
            r10.f72563e = r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r10.f72567i = r9     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x0025
        L_0x0071:
            int r7 = r10.f72563e     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0083
            qz3.h r7 = r10.f72566h     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7.getClass()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            qz3.h$b r9 = new qz3.h$b     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r9.<init>()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r9.mo52894f(r7)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
        L_0x0083:
            xz3.r<qz3.h> r7 = qz3.C26037h.f72595s     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            xz3.p r7 = r11.mo53523g(r7, r12)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            qz3.h r7 = (qz3.C26037h) r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r10.f72566h = r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            if (r9 == 0) goto L_0x0098
            r9.mo52894f(r7)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            qz3.h r7 = r9.mo52893e()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r10.f72566h = r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
        L_0x0098:
            int r7 = r10.f72563e     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7 = r7 | r6
            r10.f72563e = r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x0025
        L_0x009e:
            r7 = r5 & 2
            if (r7 == r6) goto L_0x00ab
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7.<init>()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r10.f72565g = r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r5 = r5 | 2
        L_0x00ab:
            java.util.List<qz3.h> r7 = r10.f72565g     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            xz3.r<qz3.h> r8 = qz3.C26037h.f72595s     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            xz3.p r8 = r11.mo53523g(r8, r12)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7.add(r8)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x0025
        L_0x00b8:
            int r8 = r11.mo53527k()     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            if (r8 == 0) goto L_0x00c9
            if (r8 == r2) goto L_0x00c6
            if (r8 == r6) goto L_0x00c3
            goto L_0x00ca
        L_0x00c3:
            qz3.f$c r9 = qz3.C26029f.C26032c.RETURNS_NOT_NULL     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x00ca
        L_0x00c6:
            qz3.f$c r9 = qz3.C26029f.C26032c.CALLS     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x00ca
        L_0x00c9:
            r9 = r0
        L_0x00ca:
            if (r9 != 0) goto L_0x00d4
            r3.mo53548v(r7)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r3.mo53548v(r8)     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x0025
        L_0x00d4:
            int r7 = r10.f72563e     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r7 = r7 | r2
            r10.f72563e = r7     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            r10.f72564f = r9     // Catch:{ j -> 0x00ec, IOException -> 0x0058 }
            goto L_0x0025
        L_0x00dd:
            r4 = 1
            goto L_0x0025
        L_0x00e0:
            xz3.j r12 = new xz3.j     // Catch:{ all -> 0x0055 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0055 }
            r12.<init>(r11)     // Catch:{ all -> 0x0055 }
            r12.f74023d = r10     // Catch:{ all -> 0x0055 }
            throw r12     // Catch:{ all -> 0x0055 }
        L_0x00ec:
            r11 = move-exception
            r11.f74023d = r10     // Catch:{ all -> 0x0055 }
            throw r11     // Catch:{ all -> 0x0055 }
        L_0x00f0:
            r12 = r5 & 2
            if (r12 != r6) goto L_0x00fc
            java.util.List<qz3.h> r12 = r10.f72565g
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f72565g = r12
        L_0x00fc:
            r3.mo53536i()     // Catch:{ IOException -> 0x0108, all -> 0x0100 }
            goto L_0x0108
        L_0x0100:
            r11 = move-exception
            xz3.c r12 = r1.mo36559c()
            r10.f72562d = r12
            throw r11
        L_0x0108:
            xz3.c r12 = r1.mo36559c()
            r10.f72562d = r12
            throw r11
        L_0x010f:
            r11 = r5 & 2
            if (r11 != r6) goto L_0x011b
            java.util.List<qz3.h> r11 = r10.f72565g
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f72565g = r11
        L_0x011b:
            r3.mo53536i()     // Catch:{ IOException -> 0x0127, all -> 0x011f }
            goto L_0x0127
        L_0x011f:
            r11 = move-exception
            xz3.c r12 = r1.mo36559c()
            r10.f72562d = r12
            throw r11
        L_0x0127:
            xz3.c r11 = r1.mo36559c()
            r10.f72562d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz3.C26029f.<init>(xz3.d, xz3.f, qz3.a):void");
    }
}
