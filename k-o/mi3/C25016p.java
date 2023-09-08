package mi3;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23872m0;
import com.google.protobuf.C23896m1;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import mi3.C24995e;
import mi3.C25013o;
import mi3.C25019q;

/* renamed from: mi3.p */
public final class C25016p extends C23872m0 implements C23896m1 {

    /* renamed from: A */
    public static final C24062w1<C25016p> f71272A = new C25017a();

    /* renamed from: z */
    public static final C25016p f71273z = new C25016p();

    /* renamed from: d */
    public long f71274d;

    /* renamed from: e */
    public volatile Object f71275e;

    /* renamed from: f */
    public int f71276f;

    /* renamed from: g */
    public long f71277g;

    /* renamed from: h */
    public long f71278h;

    /* renamed from: i */
    public long f71279i;

    /* renamed from: j */
    public long f71280j;

    /* renamed from: n */
    public long f71281n;

    /* renamed from: o */
    public int f71282o;

    /* renamed from: p */
    public int f71283p;

    /* renamed from: q */
    public float f71284q;

    /* renamed from: r */
    public float f71285r;

    /* renamed from: s */
    public int f71286s;

    /* renamed from: t */
    public float f71287t;

    /* renamed from: u */
    public C24995e f71288u;

    /* renamed from: v */
    public C25019q f71289v;

    /* renamed from: w */
    public int f71290w;

    /* renamed from: x */
    public C25013o f71291x;

    /* renamed from: y */
    public byte f71292y;

    /* renamed from: mi3.p$a */
    public static class C25017a extends C23813c<C25016p> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: mi3.e$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: mi3.q$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: mi3.o$b} */
        /* JADX WARNING: type inference failed for: r4v0 */
        /* JADX WARNING: type inference failed for: r4v7 */
        /* JADX WARNING: type inference failed for: r4v8 */
        /* JADX WARNING: type inference failed for: r4v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object parsePartialFrom(com.google.protobuf.C23856l r6, com.google.protobuf.C23806a0 r7) {
            /*
                r5 = this;
                mi3.p r0 = new mi3.p
                r0.<init>()
                r7.getClass()
                com.google.protobuf.s2$a r1 = com.google.protobuf.C24020s2.m29807b()
                r2 = 0
            L_0x000d:
                if (r2 != 0) goto L_0x010a
                int r3 = r6.mo37757F()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r4 = 0
                switch(r3) {
                    case 0: goto L_0x00ee;
                    case 8: goto L_0x00e4;
                    case 18: goto L_0x00dc;
                    case 24: goto L_0x00d4;
                    case 32: goto L_0x00cc;
                    case 40: goto L_0x00c4;
                    case 48: goto L_0x00bc;
                    case 56: goto L_0x00b4;
                    case 64: goto L_0x00ac;
                    case 72: goto L_0x00a4;
                    case 80: goto L_0x009c;
                    case 93: goto L_0x0094;
                    case 101: goto L_0x008c;
                    case 104: goto L_0x0085;
                    case 117: goto L_0x007e;
                    case 122: goto L_0x0060;
                    case 130: goto L_0x0042;
                    case 136: goto L_0x003b;
                    case 146: goto L_0x001d;
                    default: goto L_0x0017;
                }     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
            L_0x0017:
                boolean r3 = r0.parseUnknownField(r6, r1, r7, r3)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x00ec
            L_0x001d:
                mi3.o r3 = r0.f71291x     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                if (r3 == 0) goto L_0x0025
                mi3.o$b r4 = r3.toBuilder()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
            L_0x0025:
                com.google.protobuf.w1<mi3.o> r3 = mi3.C25013o.f71266h     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                com.google.protobuf.j1 r3 = r6.mo37777v(r3, r7)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                mi3.o r3 = (mi3.C25013o) r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71291x = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                if (r4 == 0) goto L_0x000d
                r4.mo52100d(r3)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                mi3.o r3 = r4.buildPartial()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71291x = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x003b:
                int r3 = r6.mo37770o()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71290w = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x0042:
                mi3.q r3 = r0.f71289v     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                if (r3 == 0) goto L_0x004a
                mi3.q$b r4 = r3.toBuilder()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
            L_0x004a:
                com.google.protobuf.w1<mi3.q> r3 = mi3.C25019q.f71312i     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                com.google.protobuf.j1 r3 = r6.mo37777v(r3, r7)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                mi3.q r3 = (mi3.C25019q) r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71289v = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                if (r4 == 0) goto L_0x000d
                r4.mo52117e(r3)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                mi3.q r3 = r4.buildPartial()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71289v = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x0060:
                mi3.e r3 = r0.f71288u     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                if (r3 == 0) goto L_0x0068
                mi3.e$b r4 = r3.toBuilder()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
            L_0x0068:
                com.google.protobuf.w1<mi3.e> r3 = mi3.C24995e.f71200h     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                com.google.protobuf.j1 r3 = r6.mo37777v(r3, r7)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                mi3.e r3 = (mi3.C24995e) r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71288u = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                if (r4 == 0) goto L_0x000d
                r4.mo52063f(r3)     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                mi3.e r3 = r4.buildPartial()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71288u = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x007e:
                float r3 = r6.mo37773r()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71287t = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x0085:
                int r3 = r6.mo37775t()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71286s = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x008c:
                float r3 = r6.mo37773r()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71285r = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x0094:
                float r3 = r6.mo37773r()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71284q = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x009c:
                int r3 = r6.mo37775t()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71283p = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00a4:
                int r3 = r6.mo37775t()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71282o = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00ac:
                long r3 = r6.mo37776u()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71281n = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00b4:
                long r3 = r6.mo37776u()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71280j = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00bc:
                long r3 = r6.mo37776u()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71279i = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00c4:
                long r3 = r6.mo37776u()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71278h = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00cc:
                long r3 = r6.mo37776u()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71277g = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00d4:
                int r3 = r6.mo37770o()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71276f = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00dc:
                java.lang.String r3 = r6.mo37756E()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71275e = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00e4:
                long r3 = r6.mo37759H()     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                r0.f71274d = r3     // Catch:{ p0 -> 0x00fc, IOException -> 0x00f3 }
                goto L_0x000d
            L_0x00ec:
                if (r3 != 0) goto L_0x000d
            L_0x00ee:
                r2 = 1
                goto L_0x000d
            L_0x00f1:
                r6 = move-exception
                goto L_0x0100
            L_0x00f3:
                r6 = move-exception
                com.google.protobuf.p0 r7 = new com.google.protobuf.p0     // Catch:{ all -> 0x00f1 }
                r7.<init>((java.io.IOException) r6)     // Catch:{ all -> 0x00f1 }
                r7.f68530d = r0     // Catch:{ all -> 0x00f1 }
                throw r7     // Catch:{ all -> 0x00f1 }
            L_0x00fc:
                r6 = move-exception
                r6.f68530d = r0     // Catch:{ all -> 0x00f1 }
                throw r6     // Catch:{ all -> 0x00f1 }
            L_0x0100:
                com.google.protobuf.s2 r7 = r1.build()
                r0.unknownFields = r7
                r0.makeExtensionsImmutable()
                throw r6
            L_0x010a:
                com.google.protobuf.s2 r6 = r1.build()
                r0.unknownFields = r6
                r0.makeExtensionsImmutable()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25016p.C25017a.parsePartialFrom(com.google.protobuf.l, com.google.protobuf.a0):java.lang.Object");
        }
    }

    /* renamed from: mi3.p$b */
    public static final class C25018b extends C23872m0.C23874b<C25018b> implements C23896m1 {

        /* renamed from: d */
        public long f71293d;

        /* renamed from: e */
        public Object f71294e = "";

        /* renamed from: f */
        public int f71295f = 0;

        /* renamed from: g */
        public long f71296g;

        /* renamed from: h */
        public long f71297h;

        /* renamed from: i */
        public long f71298i;

        /* renamed from: j */
        public long f71299j;

        /* renamed from: n */
        public long f71300n;

        /* renamed from: o */
        public int f71301o;

        /* renamed from: p */
        public int f71302p;

        /* renamed from: q */
        public float f71303q;

        /* renamed from: r */
        public float f71304r;

        /* renamed from: s */
        public int f71305s;

        /* renamed from: t */
        public float f71306t;

        /* renamed from: u */
        public C24995e f71307u;

        /* renamed from: v */
        public C25019q f71308v;

        /* renamed from: w */
        public int f71309w = 0;

        /* renamed from: x */
        public C25013o f71310x;

        public C25018b() {
            C25016p pVar = C25016p.f71273z;
        }

        /* renamed from: a */
        public C25016p buildPartial() {
            C25016p pVar = new C25016p(this);
            pVar.f71274d = this.f71293d;
            pVar.f71275e = this.f71294e;
            pVar.f71276f = this.f71295f;
            pVar.f71277g = this.f71296g;
            pVar.f71278h = this.f71297h;
            pVar.f71279i = this.f71298i;
            pVar.f71280j = this.f71299j;
            pVar.f71281n = this.f71300n;
            pVar.f71282o = this.f71301o;
            pVar.f71283p = this.f71302p;
            pVar.f71284q = this.f71303q;
            pVar.f71285r = this.f71304r;
            pVar.f71286s = this.f71305s;
            pVar.f71287t = this.f71306t;
            pVar.f71288u = this.f71307u;
            pVar.f71289v = this.f71308v;
            pVar.f71290w = this.f71309w;
            pVar.f71291x = this.f71310x;
            onBuilt();
            return pVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168835addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25018b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25018b mo52107b() {
            super.clear();
            this.f71293d = 0;
            this.f71294e = "";
            this.f71295f = 0;
            this.f71296g = 0;
            this.f71297h = 0;
            this.f71298i = 0;
            this.f71299j = 0;
            this.f71300n = 0;
            this.f71301o = 0;
            this.f71302p = 0;
            this.f71303q = 0.0f;
            this.f71304r = 0.0f;
            this.f71305s = 0;
            this.f71306t = 0.0f;
            this.f71307u = null;
            this.f71308v = null;
            this.f71309w = 0;
            this.f71310x = null;
            return this;
        }

        public C23836g1 build() {
            C25016p a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25018b clone() {
            return (C25018b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168837clearField(C24025t.C24035g gVar) {
            return (C25018b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25018b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25016p.C25018b mo52109d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.p> r0 = mi3.C25016p.f71272A     // Catch:{ p0 -> 0x0010 }
                mi3.p$a r0 = (mi3.C25016p.C25017a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.p r2 = (mi3.C25016p) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52110e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.p r3 = (mi3.C25016p) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52110e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25016p.C25018b.mo52109d(com.google.protobuf.l, com.google.protobuf.a0):mi3.p$b");
        }

        /* renamed from: e */
        public C25018b mo52110e(C25016p pVar) {
            if (pVar == C25016p.f71273z) {
                return this;
            }
            long j = pVar.f71274d;
            if (j != 0) {
                this.f71293d = j;
                onChanged();
            }
            if (!pVar.getPath().isEmpty()) {
                this.f71294e = pVar.f71275e;
                onChanged();
            }
            int i = pVar.f71276f;
            if (i != 0) {
                this.f71295f = i;
                onChanged();
            }
            long j2 = pVar.f71277g;
            if (j2 != 0) {
                this.f71296g = j2;
                onChanged();
            }
            long j3 = pVar.f71278h;
            if (j3 != 0) {
                this.f71297h = j3;
                onChanged();
            }
            long j4 = pVar.f71279i;
            if (j4 != 0) {
                this.f71298i = j4;
                onChanged();
            }
            long j5 = pVar.f71280j;
            if (j5 != 0) {
                this.f71299j = j5;
                onChanged();
            }
            long j6 = pVar.f71281n;
            if (j6 != 0) {
                this.f71300n = j6;
                onChanged();
            }
            int i2 = pVar.f71282o;
            if (i2 != 0) {
                this.f71301o = i2;
                onChanged();
            }
            int i3 = pVar.f71283p;
            if (i3 != 0) {
                this.f71302p = i3;
                onChanged();
            }
            float f = pVar.f71284q;
            if (f != 0.0f) {
                this.f71303q = f;
                onChanged();
            }
            float f2 = pVar.f71285r;
            if (f2 != 0.0f) {
                this.f71304r = f2;
                onChanged();
            }
            int i4 = pVar.f71286s;
            if (i4 != 0) {
                this.f71305s = i4;
                onChanged();
            }
            float f3 = pVar.f71287t;
            if (f3 != 0.0f) {
                this.f71306t = f3;
                onChanged();
            }
            boolean z = true;
            if (pVar.f71288u != null) {
                C24995e b = pVar.mo52102b();
                C24995e eVar = this.f71307u;
                if (eVar != null) {
                    C24995e.C24997b c = C24995e.f71199g.toBuilder();
                    c.mo52063f(eVar);
                    c.mo52063f(b);
                    this.f71307u = c.buildPartial();
                } else {
                    this.f71307u = b;
                }
                onChanged();
            }
            if (pVar.f71289v != null) {
                C25019q c2 = pVar.mo52103c();
                C25019q qVar = this.f71308v;
                if (qVar != null) {
                    C25019q.C25021b a = C25019q.f71311h.toBuilder();
                    a.mo52117e(qVar);
                    a.mo52117e(c2);
                    this.f71308v = a.buildPartial();
                } else {
                    this.f71308v = c2;
                }
                onChanged();
            }
            int i5 = pVar.f71290w;
            if (i5 != 0) {
                this.f71309w = i5;
                onChanged();
            }
            if (pVar.f71291x == null) {
                z = false;
            }
            if (z) {
                C25013o a2 = pVar.mo52101a();
                C25013o oVar = this.f71310x;
                if (oVar != null) {
                    C25013o.C25015b a3 = C25013o.f71265g.toBuilder();
                    a3.mo52100d(oVar);
                    a3.mo52100d(a2);
                    this.f71310x = a3.buildPartial();
                } else {
                    this.f71310x = a2;
                }
                onChanged();
            }
            C25018b bVar = (C25018b) super.mergeUnknownFields(pVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25016p.f71273z;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71331i;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71332j;
            fVar.mo37875c(C25016p.class, C25018b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25018b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168844setField(C24025t.C24035g gVar, Object obj) {
            return (C25018b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168845setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25018b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168846setUnknownFields(C24020s2 s2Var) {
            return (C25018b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25018b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25018b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168839clearOneof(C24025t.C24042k kVar) {
            return (C25018b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168840getDefaultInstanceForType() {
            return C25016p.f71273z;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168843mergeUnknownFields(C24020s2 s2Var) {
            return (C25018b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25018b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25018b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25018b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168838clearOneof(C24025t.C24042k kVar) {
            return (C25018b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168842mergeUnknownFields(C24020s2 s2Var) {
            return (C25018b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168836build() {
            C25016p a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25016p) {
                mo52110e((C25016p) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        public C25018b(C23872m0.C23876c cVar) {
            super(cVar);
            C25016p pVar = C25016p.f71273z;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168841mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25016p) {
                mo52110e((C25016p) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C25016p(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71292y = -1;
    }

    /* renamed from: a */
    public C25013o mo52101a() {
        C25013o oVar = this.f71291x;
        return oVar == null ? C25013o.f71265g : oVar;
    }

    /* renamed from: b */
    public C24995e mo52102b() {
        C24995e eVar = this.f71288u;
        return eVar == null ? C24995e.f71199g : eVar;
    }

    /* renamed from: c */
    public C25019q mo52103c() {
        C25019q qVar = this.f71289v;
        return qVar == null ? C25019q.f71311h : qVar;
    }

    /* renamed from: d */
    public C25018b toBuilder() {
        if (this == f71273z) {
            return new C25018b();
        }
        C25018b bVar = new C25018b();
        bVar.mo52110e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25016p)) {
            return super.equals(obj);
        }
        C25016p pVar = (C25016p) obj;
        if (this.f71274d != pVar.f71274d || !getPath().equals(pVar.getPath()) || this.f71276f != pVar.f71276f || this.f71277g != pVar.f71277g || this.f71278h != pVar.f71278h || this.f71279i != pVar.f71279i || this.f71280j != pVar.f71280j || this.f71281n != pVar.f71281n || this.f71282o != pVar.f71282o || this.f71283p != pVar.f71283p || Float.floatToIntBits(this.f71284q) != Float.floatToIntBits(pVar.f71284q) || Float.floatToIntBits(this.f71285r) != Float.floatToIntBits(pVar.f71285r) || this.f71286s != pVar.f71286s || Float.floatToIntBits(this.f71287t) != Float.floatToIntBits(pVar.f71287t)) {
            return false;
        }
        C24995e eVar = this.f71288u;
        if ((eVar != null) != (pVar.f71288u != null)) {
            return false;
        }
        if ((eVar != null) && !mo52102b().equals(pVar.mo52102b())) {
            return false;
        }
        C25019q qVar = this.f71289v;
        if ((qVar != null) != (pVar.f71289v != null)) {
            return false;
        }
        if (((qVar != null) && !mo52103c().equals(pVar.mo52103c())) || this.f71290w != pVar.f71290w) {
            return false;
        }
        C25013o oVar = this.f71291x;
        if ((oVar != null) != (pVar.f71291x != null)) {
            return false;
        }
        return (!(oVar != null) || mo52101a().equals(pVar.mo52101a())) && this.unknownFields.equals(pVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71273z;
    }

    public C24062w1<C25016p> getParserForType() {
        return f71272A;
    }

    public String getPath() {
        Object obj = this.f71275e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String u = ((C16994k) obj).mo18752u();
        this.f71275e = u;
        return u;
    }

    public int getSerializedSize() {
        C16994k kVar;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f71274d;
        if (j != 0) {
            i2 = 0 + C23897n.m29280y(1, j);
        }
        Object obj = this.f71275e;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71275e = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            i2 += C23872m0.computeStringSize(2, this.f71275e);
        }
        if (this.f71276f != C109631i.UnknownType.getNumber()) {
            i2 += C23897n.m29261f(3, this.f71276f);
        }
        long j2 = this.f71277g;
        if (j2 != 0) {
            i2 += C23897n.m29268m(4, j2);
        }
        long j3 = this.f71278h;
        if (j3 != 0) {
            i2 += C23897n.m29268m(5, j3);
        }
        long j4 = this.f71279i;
        if (j4 != 0) {
            i2 += C23897n.m29268m(6, j4);
        }
        long j5 = this.f71280j;
        if (j5 != 0) {
            i2 += C23897n.m29268m(7, j5);
        }
        long j6 = this.f71281n;
        if (j6 != 0) {
            i2 += C23897n.m29268m(8, j6);
        }
        int i3 = this.f71282o;
        if (i3 != 0) {
            i2 += C23897n.m29266k(9, i3);
        }
        int i4 = this.f71283p;
        if (i4 != 0) {
            i2 += C23897n.m29266k(10, i4);
        }
        float f = this.f71284q;
        if (f != 0.0f) {
            i2 += C23897n.m29264i(11, f);
        }
        float f2 = this.f71285r;
        if (f2 != 0.0f) {
            i2 += C23897n.m29264i(12, f2);
        }
        int i5 = this.f71286s;
        if (i5 != 0) {
            i2 += C23897n.m29266k(13, i5);
        }
        float f3 = this.f71287t;
        if (f3 != 0.0f) {
            i2 += C23897n.m29264i(14, f3);
        }
        if (this.f71288u != null) {
            i2 += C23897n.m29270o(15, mo52102b());
        }
        if (this.f71289v != null) {
            i2 += C23897n.m29270o(16, mo52103c());
        }
        if (this.f71290w != C109632j.Custom.getNumber()) {
            i2 += C23897n.m29261f(17, this.f71290w);
        }
        if (this.f71291x != null) {
            i2 += C23897n.m29270o(18, mo52101a());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final C24020s2 getUnknownFields() {
        return this.unknownFields;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        boolean z = true;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((C25022r.f71331i.hashCode() + C82986r.CTRL_INDEX) * 37) + 1) * 53) + C23908o0.m29424b(this.f71274d)) * 37) + 2) * 53) + getPath().hashCode()) * 37) + 3) * 53) + this.f71276f) * 37) + 4) * 53) + C23908o0.m29424b(this.f71277g)) * 37) + 5) * 53) + C23908o0.m29424b(this.f71278h)) * 37) + 6) * 53) + C23908o0.m29424b(this.f71279i)) * 37) + 7) * 53) + C23908o0.m29424b(this.f71280j)) * 37) + 8) * 53) + C23908o0.m29424b(this.f71281n)) * 37) + 9) * 53) + this.f71282o) * 37) + 10) * 53) + this.f71283p) * 37) + 11) * 53) + Float.floatToIntBits(this.f71284q)) * 37) + 12) * 53) + Float.floatToIntBits(this.f71285r)) * 37) + 13) * 53) + this.f71286s) * 37) + 14) * 53) + Float.floatToIntBits(this.f71287t);
        if (this.f71288u != null) {
            hashCode = (((hashCode * 37) + 15) * 53) + mo52102b().hashCode();
        }
        if (this.f71289v != null) {
            hashCode = (((hashCode * 37) + 16) * 53) + mo52103c().hashCode();
        }
        int i2 = (((hashCode * 37) + 17) * 53) + this.f71290w;
        if (this.f71291x == null) {
            z = false;
        }
        if (z) {
            i2 = (((i2 * 37) + 18) * 53) + mo52101a().hashCode();
        }
        int hashCode2 = (i2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71332j;
        fVar.mo37875c(C25016p.class, C25018b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71292y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71292y = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71273z.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25016p();
    }

    public void writeTo(C23897n nVar) {
        C16994k kVar;
        long j = this.f71274d;
        if (j != 0) {
            nVar.mo37919Z(1, j);
        }
        Object obj = this.f71275e;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71275e = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            C23872m0.writeString(nVar, 2, this.f71275e);
        }
        if (this.f71276f != C109631i.UnknownType.getNumber()) {
            nVar.mo37907N(3, this.f71276f);
        }
        long j2 = this.f71277g;
        if (j2 != 0) {
            nVar.mo37919Z(4, j2);
        }
        long j3 = this.f71278h;
        if (j3 != 0) {
            nVar.mo37919Z(5, j3);
        }
        long j4 = this.f71279i;
        if (j4 != 0) {
            nVar.mo37919Z(6, j4);
        }
        long j5 = this.f71280j;
        if (j5 != 0) {
            nVar.mo37919Z(7, j5);
        }
        long j6 = this.f71281n;
        if (j6 != 0) {
            nVar.mo37919Z(8, j6);
        }
        int i = this.f71282o;
        if (i != 0) {
            nVar.mo37907N(9, i);
        }
        int i2 = this.f71283p;
        if (i2 != 0) {
            nVar.mo37907N(10, i2);
        }
        float f = this.f71284q;
        if (f != 0.0f) {
            nVar.mo37906M(11, f);
        }
        float f2 = this.f71285r;
        if (f2 != 0.0f) {
            nVar.mo37906M(12, f2);
        }
        int i3 = this.f71286s;
        if (i3 != 0) {
            nVar.mo37907N(13, i3);
        }
        float f3 = this.f71287t;
        if (f3 != 0.0f) {
            nVar.mo37906M(14, f3);
        }
        if (this.f71288u != null) {
            nVar.mo37909P(15, mo52102b());
        }
        if (this.f71289v != null) {
            nVar.mo37909P(16, mo52103c());
        }
        if (this.f71290w != C109632j.Custom.getNumber()) {
            nVar.mo37907N(17, this.f71290w);
        }
        if (this.f71291x != null) {
            nVar.mo37909P(18, mo52101a());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168833getDefaultInstanceForType() {
        return f71273z;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168834newBuilderForType() {
        return f71273z.toBuilder();
    }

    public C25016p() {
        this.f71292y = -1;
        this.f71275e = "";
        this.f71276f = 0;
        this.f71290w = 0;
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25018b(cVar);
    }
}
