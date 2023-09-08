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

/* renamed from: mi3.s */
public final class C25023s extends C23872m0 implements C23896m1 {

    /* renamed from: i */
    public static final C25023s f71349i = new C25023s();

    /* renamed from: j */
    public static final C24062w1<C25023s> f71350j = new C25024a();

    /* renamed from: d */
    public volatile Object f71351d;

    /* renamed from: e */
    public volatile Object f71352e;

    /* renamed from: f */
    public long f71353f;

    /* renamed from: g */
    public boolean f71354g;

    /* renamed from: h */
    public byte f71355h;

    /* renamed from: mi3.s$a */
    public static class C25024a extends C23813c<C25023s> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25023s sVar = new C25023s();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            sVar.f71351d = lVar.mo37756E();
                        } else if (F == 18) {
                            sVar.f71352e = lVar.mo37756E();
                        } else if (F == 24) {
                            sVar.f71353f = lVar.mo37776u();
                        } else if (F == 32) {
                            sVar.f71354g = lVar.mo37767l();
                        } else if (!sVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = sVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = sVar;
                    throw p0Var;
                } catch (Throwable th) {
                    sVar.unknownFields = b.build();
                    sVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            sVar.unknownFields = b.build();
            sVar.makeExtensionsImmutable();
            return sVar;
        }
    }

    /* renamed from: mi3.s$b */
    public static final class C25025b extends C23872m0.C23874b<C25025b> implements C23896m1 {

        /* renamed from: d */
        public Object f71356d = "";

        /* renamed from: e */
        public Object f71357e = "";

        /* renamed from: f */
        public long f71358f;

        /* renamed from: g */
        public boolean f71359g;

        public C25025b() {
            C25023s sVar = C25023s.f71349i;
        }

        /* renamed from: a */
        public C25023s buildPartial() {
            C25023s sVar = new C25023s(this);
            sVar.f71351d = this.f71356d;
            sVar.f71352e = this.f71357e;
            sVar.f71353f = this.f71358f;
            sVar.f71354g = this.f71359g;
            onBuilt();
            return sVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168863addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25025b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25025b mo52122b() {
            super.clear();
            this.f71356d = "";
            this.f71357e = "";
            this.f71358f = 0;
            this.f71359g = false;
            return this;
        }

        public C23836g1 build() {
            C25023s a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25025b clone() {
            return (C25025b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168865clearField(C24025t.C24035g gVar) {
            return (C25025b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25025b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25023s.C25025b mo52124d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.s> r0 = mi3.C25023s.f71350j     // Catch:{ p0 -> 0x0010 }
                mi3.s$a r0 = (mi3.C25023s.C25024a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.s r2 = (mi3.C25023s) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52125e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.s r3 = (mi3.C25023s) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52125e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25023s.C25025b.mo52124d(com.google.protobuf.l, com.google.protobuf.a0):mi3.s$b");
        }

        /* renamed from: e */
        public C25025b mo52125e(C25023s sVar) {
            if (sVar == C25023s.f71349i) {
                return this;
            }
            if (!sVar.getTemplatePath().isEmpty()) {
                this.f71356d = sVar.f71351d;
                onChanged();
            }
            if (!sVar.mo52118a().isEmpty()) {
                this.f71357e = sVar.f71352e;
                onChanged();
            }
            long j = sVar.f71353f;
            if (j != 0) {
                this.f71358f = j;
                onChanged();
            }
            boolean z = sVar.f71354g;
            if (z) {
                this.f71359g = z;
                onChanged();
            }
            C25025b bVar = (C25025b) super.mergeUnknownFields(sVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25023s.f71349i;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71341s;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71342t;
            fVar.mo37875c(C25023s.class, C25025b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25025b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168872setField(C24025t.C24035g gVar, Object obj) {
            return (C25025b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168873setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25025b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168874setUnknownFields(C24020s2 s2Var) {
            return (C25025b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25025b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25025b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168867clearOneof(C24025t.C24042k kVar) {
            return (C25025b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168868getDefaultInstanceForType() {
            return C25023s.f71349i;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168871mergeUnknownFields(C24020s2 s2Var) {
            return (C25025b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25025b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25025b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25025b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168866clearOneof(C24025t.C24042k kVar) {
            return (C25025b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168870mergeUnknownFields(C24020s2 s2Var) {
            return (C25025b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168864build() {
            C25023s a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C25025b(C23872m0.C23876c cVar) {
            super(cVar);
            C25023s sVar = C25023s.f71349i;
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25023s) {
                mo52125e((C25023s) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168869mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25023s) {
                mo52125e((C25023s) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C25023s(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71355h = -1;
    }

    /* renamed from: a */
    public String mo52118a() {
        Object obj = this.f71352e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String u = ((C16994k) obj).mo18752u();
        this.f71352e = u;
        return u;
    }

    /* renamed from: b */
    public C25025b toBuilder() {
        if (this == f71349i) {
            return new C25025b();
        }
        C25025b bVar = new C25025b();
        bVar.mo52125e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25023s)) {
            return super.equals(obj);
        }
        C25023s sVar = (C25023s) obj;
        return getTemplatePath().equals(sVar.getTemplatePath()) && mo52118a().equals(sVar.mo52118a()) && this.f71353f == sVar.f71353f && this.f71354g == sVar.f71354g && this.unknownFields.equals(sVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71349i;
    }

    public C24062w1<C25023s> getParserForType() {
        return f71350j;
    }

    public int getSerializedSize() {
        C16994k kVar;
        C16994k kVar2;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        Object obj = this.f71351d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71351d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            i2 = 0 + C23872m0.computeStringSize(1, this.f71351d);
        }
        Object obj2 = this.f71352e;
        if (obj2 instanceof String) {
            kVar2 = C16994k.m16791k((String) obj2);
            this.f71352e = kVar2;
        } else {
            kVar2 = (C16994k) obj2;
        }
        if (!kVar2.isEmpty()) {
            i2 += C23872m0.computeStringSize(2, this.f71352e);
        }
        long j = this.f71353f;
        if (j != 0) {
            i2 += C23897n.m29268m(3, j);
        }
        boolean z = this.f71354g;
        if (z) {
            i2 += C23897n.m29257b(4, z);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getTemplatePath() {
        Object obj = this.f71351d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String u = ((C16994k) obj).mo18752u();
        this.f71351d = u;
        return u;
    }

    public final C24020s2 getUnknownFields() {
        return this.unknownFields;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((((((((((C82986r.CTRL_INDEX + C25022r.f71341s.hashCode()) * 37) + 1) * 53) + getTemplatePath().hashCode()) * 37) + 2) * 53) + mo52118a().hashCode()) * 37) + 3) * 53) + C23908o0.m29424b(this.f71353f)) * 37) + 4) * 53) + C23908o0.m29423a(this.f71354g)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71342t;
        fVar.mo37875c(C25023s.class, C25025b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71355h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71355h = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71349i.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25023s();
    }

    public void writeTo(C23897n nVar) {
        C16994k kVar;
        C16994k kVar2;
        Object obj = this.f71351d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71351d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            C23872m0.writeString(nVar, 1, this.f71351d);
        }
        Object obj2 = this.f71352e;
        if (obj2 instanceof String) {
            kVar2 = C16994k.m16791k((String) obj2);
            this.f71352e = kVar2;
        } else {
            kVar2 = (C16994k) obj2;
        }
        if (!kVar2.isEmpty()) {
            C23872m0.writeString(nVar, 2, this.f71352e);
        }
        long j = this.f71353f;
        if (j != 0) {
            nVar.mo37919Z(3, j);
        }
        boolean z = this.f71354g;
        if (z) {
            nVar.mo37897D(4, z);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168861getDefaultInstanceForType() {
        return f71349i;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168862newBuilderForType() {
        return f71349i.toBuilder();
    }

    public C25023s() {
        this.f71355h = -1;
        this.f71351d = "";
        this.f71352e = "";
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25025b(cVar);
    }
}
