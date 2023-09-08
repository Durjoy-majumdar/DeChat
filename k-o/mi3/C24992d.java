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

/* renamed from: mi3.d */
public final class C24992d extends C23872m0 implements C23896m1 {

    /* renamed from: h */
    public static final C24992d f71190h = new C24992d();

    /* renamed from: i */
    public static final C24062w1<C24992d> f71191i = new C24993a();

    /* renamed from: d */
    public volatile Object f71192d;

    /* renamed from: e */
    public int f71193e;

    /* renamed from: f */
    public long f71194f;

    /* renamed from: g */
    public byte f71195g;

    /* renamed from: mi3.d$a */
    public static class C24993a extends C23813c<C24992d> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C24992d dVar = new C24992d();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            dVar.f71192d = lVar.mo37756E();
                        } else if (F == 16) {
                            dVar.f71193e = lVar.mo37775t();
                        } else if (F == 24) {
                            dVar.f71194f = lVar.mo37776u();
                        } else if (!dVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = dVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = dVar;
                    throw p0Var;
                } catch (Throwable th) {
                    dVar.unknownFields = b.build();
                    dVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            dVar.unknownFields = b.build();
            dVar.makeExtensionsImmutable();
            return dVar;
        }
    }

    /* renamed from: mi3.d$b */
    public static final class C24994b extends C23872m0.C23874b<C24994b> implements C23896m1 {

        /* renamed from: d */
        public Object f71196d = "";

        /* renamed from: e */
        public int f71197e;

        /* renamed from: f */
        public long f71198f;

        public C24994b() {
            C24992d dVar = C24992d.f71190h;
        }

        /* renamed from: a */
        public C24992d buildPartial() {
            C24992d dVar = new C24992d(this);
            dVar.f71192d = this.f71196d;
            dVar.f71193e = this.f71197e;
            dVar.f71194f = this.f71198f;
            onBuilt();
            return dVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168718addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24994b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C24994b mo52051b() {
            super.clear();
            this.f71196d = "";
            this.f71197e = 0;
            this.f71198f = 0;
            return this;
        }

        public C23836g1 build() {
            C24992d a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C24994b clone() {
            return (C24994b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168720clearField(C24025t.C24035g gVar) {
            return (C24994b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C24994b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C24992d.C24994b mo52053d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.d> r0 = mi3.C24992d.f71191i     // Catch:{ p0 -> 0x0010 }
                mi3.d$a r0 = (mi3.C24992d.C24993a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.d r2 = (mi3.C24992d) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52054e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.d r3 = (mi3.C24992d) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52054e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C24992d.C24994b.mo52053d(com.google.protobuf.l, com.google.protobuf.a0):mi3.d$b");
        }

        /* renamed from: e */
        public C24994b mo52054e(C24992d dVar) {
            if (dVar == C24992d.f71190h) {
                return this;
            }
            if (!dVar.getPath().isEmpty()) {
                this.f71196d = dVar.f71192d;
                onChanged();
            }
            int i = dVar.f71193e;
            if (i != 0) {
                this.f71197e = i;
                onChanged();
            }
            long j = dVar.f71194f;
            if (j != 0) {
                this.f71198f = j;
                onChanged();
            }
            C24994b bVar = (C24994b) super.mergeUnknownFields(dVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C24992d.f71190h;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71343u;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71344v;
            fVar.mo37875c(C24992d.class, C24994b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C24994b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168727setField(C24025t.C24035g gVar, Object obj) {
            return (C24994b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168728setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24994b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168729setUnknownFields(C24020s2 s2Var) {
            return (C24994b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24994b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C24994b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168722clearOneof(C24025t.C24042k kVar) {
            return (C24994b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168723getDefaultInstanceForType() {
            return C24992d.f71190h;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168726mergeUnknownFields(C24020s2 s2Var) {
            return (C24994b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C24994b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24994b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C24994b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168721clearOneof(C24025t.C24042k kVar) {
            return (C24994b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168725mergeUnknownFields(C24020s2 s2Var) {
            return (C24994b) super.mergeUnknownFields(s2Var);
        }

        public C24994b(C23872m0.C23876c cVar) {
            super(cVar);
            C24992d dVar = C24992d.f71190h;
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168719build() {
            C24992d a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24992d) {
                mo52054e((C24992d) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168724mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24992d) {
                mo52054e((C24992d) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C24992d(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71195g = -1;
    }

    /* renamed from: a */
    public C24994b toBuilder() {
        if (this == f71190h) {
            return new C24994b();
        }
        C24994b bVar = new C24994b();
        bVar.mo52054e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24992d)) {
            return super.equals(obj);
        }
        C24992d dVar = (C24992d) obj;
        return getPath().equals(dVar.getPath()) && this.f71193e == dVar.f71193e && this.f71194f == dVar.f71194f && this.unknownFields.equals(dVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71190h;
    }

    public C24062w1<C24992d> getParserForType() {
        return f71191i;
    }

    public String getPath() {
        Object obj = this.f71192d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String u = ((C16994k) obj).mo18752u();
        this.f71192d = u;
        return u;
    }

    public int getSerializedSize() {
        C16994k kVar;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        Object obj = this.f71192d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71192d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            i2 = 0 + C23872m0.computeStringSize(1, this.f71192d);
        }
        int i3 = this.f71193e;
        if (i3 != 0) {
            i2 += C23897n.m29266k(2, i3);
        }
        long j = this.f71194f;
        if (j != 0) {
            i2 += C23897n.m29268m(3, j);
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
        int hashCode = ((((((((((((((C82986r.CTRL_INDEX + C25022r.f71343u.hashCode()) * 37) + 1) * 53) + getPath().hashCode()) * 37) + 2) * 53) + this.f71193e) * 37) + 3) * 53) + C23908o0.m29424b(this.f71194f)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71344v;
        fVar.mo37875c(C24992d.class, C24994b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71195g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71195g = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71190h.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C24992d();
    }

    public void writeTo(C23897n nVar) {
        C16994k kVar;
        Object obj = this.f71192d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71192d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            C23872m0.writeString(nVar, 1, this.f71192d);
        }
        int i = this.f71193e;
        if (i != 0) {
            nVar.mo37907N(2, i);
        }
        long j = this.f71194f;
        if (j != 0) {
            nVar.mo37919Z(3, j);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168716getDefaultInstanceForType() {
        return f71190h;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168717newBuilderForType() {
        return f71190h.toBuilder();
    }

    public C24992d() {
        this.f71195g = -1;
        this.f71192d = "";
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C24994b(cVar);
    }
}
