package mi3;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23872m0;
import com.google.protobuf.C23896m1;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;

/* renamed from: mi3.g */
public final class C24998g extends C23872m0 implements C23896m1 {

    /* renamed from: h */
    public static final C24998g f71206h = new C24998g();

    /* renamed from: i */
    public static final C24062w1<C24998g> f71207i = new C24999a();

    /* renamed from: d */
    public volatile Object f71208d;

    /* renamed from: e */
    public long f71209e;

    /* renamed from: f */
    public long f71210f;

    /* renamed from: g */
    public byte f71211g;

    /* renamed from: mi3.g$a */
    public static class C24999a extends C23813c<C24998g> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C24998g gVar = new C24998g();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            gVar.f71208d = lVar.mo37756E();
                        } else if (F == 16) {
                            gVar.f71209e = lVar.mo37776u();
                        } else if (F == 24) {
                            gVar.f71210f = lVar.mo37776u();
                        } else if (!gVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = gVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = gVar;
                    throw p0Var;
                } catch (Throwable th) {
                    gVar.unknownFields = b.build();
                    gVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            gVar.unknownFields = b.build();
            gVar.makeExtensionsImmutable();
            return gVar;
        }
    }

    /* renamed from: mi3.g$b */
    public static final class C25000b extends C23872m0.C23874b<C25000b> implements C23896m1 {

        /* renamed from: d */
        public Object f71212d = "";

        /* renamed from: e */
        public long f71213e;

        /* renamed from: f */
        public long f71214f;

        public C25000b() {
            C24998g gVar = C24998g.f71206h;
        }

        /* renamed from: a */
        public C24998g buildPartial() {
            C24998g gVar = new C24998g(this);
            gVar.f71208d = this.f71212d;
            gVar.f71209e = this.f71213e;
            gVar.f71210f = this.f71214f;
            onBuilt();
            return gVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168745addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25000b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25000b mo52067b() {
            super.clear();
            this.f71212d = "";
            this.f71213e = 0;
            this.f71214f = 0;
            return this;
        }

        public C23836g1 build() {
            C24998g a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25000b clone() {
            return (C25000b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168747clearField(C24025t.C24035g gVar) {
            return (C25000b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25000b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C24998g.C25000b mo52069d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.g> r0 = mi3.C24998g.f71207i     // Catch:{ p0 -> 0x0010 }
                mi3.g$a r0 = (mi3.C24998g.C24999a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.g r2 = (mi3.C24998g) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52070e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.g r3 = (mi3.C24998g) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52070e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C24998g.C25000b.mo52069d(com.google.protobuf.l, com.google.protobuf.a0):mi3.g$b");
        }

        /* renamed from: e */
        public C25000b mo52070e(C24998g gVar) {
            if (gVar == C24998g.f71206h) {
                return this;
            }
            if (!gVar.getPath().isEmpty()) {
                this.f71212d = gVar.f71208d;
                onChanged();
            }
            long j = gVar.f71209e;
            if (j != 0) {
                this.f71213e = j;
                onChanged();
            }
            long j2 = gVar.f71210f;
            if (j2 != 0) {
                this.f71214f = j2;
                onChanged();
            }
            C25000b bVar = (C25000b) super.mergeUnknownFields(gVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C24998g.f71206h;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71339q;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71340r;
            fVar.mo37875c(C24998g.class, C25000b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25000b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168754setField(C24025t.C24035g gVar, Object obj) {
            return (C25000b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168755setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25000b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168756setUnknownFields(C24020s2 s2Var) {
            return (C25000b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25000b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25000b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168749clearOneof(C24025t.C24042k kVar) {
            return (C25000b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168750getDefaultInstanceForType() {
            return C24998g.f71206h;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168753mergeUnknownFields(C24020s2 s2Var) {
            return (C25000b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25000b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25000b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25000b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168748clearOneof(C24025t.C24042k kVar) {
            return (C25000b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168752mergeUnknownFields(C24020s2 s2Var) {
            return (C25000b) super.mergeUnknownFields(s2Var);
        }

        public C25000b(C23872m0.C23876c cVar) {
            super(cVar);
            C24998g gVar = C24998g.f71206h;
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168746build() {
            C24998g a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24998g) {
                mo52070e((C24998g) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168751mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24998g) {
                mo52070e((C24998g) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C24998g(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71211g = -1;
    }

    /* renamed from: a */
    public C25000b toBuilder() {
        if (this == f71206h) {
            return new C25000b();
        }
        C25000b bVar = new C25000b();
        bVar.mo52070e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24998g)) {
            return super.equals(obj);
        }
        C24998g gVar = (C24998g) obj;
        return getPath().equals(gVar.getPath()) && this.f71209e == gVar.f71209e && this.f71210f == gVar.f71210f && this.unknownFields.equals(gVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71206h;
    }

    public C24062w1<C24998g> getParserForType() {
        return f71207i;
    }

    public String getPath() {
        Object obj = this.f71208d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String u = ((C16994k) obj).mo18752u();
        this.f71208d = u;
        return u;
    }

    public int getSerializedSize() {
        C16994k kVar;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        Object obj = this.f71208d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71208d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            i2 = 0 + C23872m0.computeStringSize(1, this.f71208d);
        }
        long j = this.f71209e;
        if (j != 0) {
            i2 += C23897n.m29268m(2, j);
        }
        long j2 = this.f71210f;
        if (j2 != 0) {
            i2 += C23897n.m29268m(3, j2);
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
        int hashCode = ((((((((((((((C82986r.CTRL_INDEX + C25022r.f71339q.hashCode()) * 37) + 1) * 53) + getPath().hashCode()) * 37) + 2) * 53) + C23908o0.m29424b(this.f71209e)) * 37) + 3) * 53) + C23908o0.m29424b(this.f71210f)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71340r;
        fVar.mo37875c(C24998g.class, C25000b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71211g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71211g = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71206h.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C24998g();
    }

    public void writeTo(C23897n nVar) {
        C16994k kVar;
        Object obj = this.f71208d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71208d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            C23872m0.writeString(nVar, 1, this.f71208d);
        }
        long j = this.f71209e;
        if (j != 0) {
            nVar.mo37919Z(2, j);
        }
        long j2 = this.f71210f;
        if (j2 != 0) {
            nVar.mo37919Z(3, j2);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168743getDefaultInstanceForType() {
        return f71206h;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168744newBuilderForType() {
        return f71206h.toBuilder();
    }

    public C24998g() {
        this.f71211g = -1;
        this.f71208d = "";
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25000b(cVar);
    }
}
