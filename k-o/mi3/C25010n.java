package mi3;

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
import mi3.C25016p;

/* renamed from: mi3.n */
public final class C25010n extends C23872m0 implements C23896m1 {

    /* renamed from: g */
    public static final C25010n f71258g = new C25010n();

    /* renamed from: h */
    public static final C24062w1<C25010n> f71259h = new C25011a();

    /* renamed from: d */
    public long f71260d;

    /* renamed from: e */
    public C25016p f71261e;

    /* renamed from: f */
    public byte f71262f = -1;

    /* renamed from: mi3.n$a */
    public static class C25011a extends C23813c<C25010n> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25010n nVar = new C25010n();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            nVar.f71260d = lVar.mo37759H();
                        } else if (F == 18) {
                            C25016p.C25018b bVar = null;
                            C25016p pVar = nVar.f71261e;
                            if (pVar != null) {
                                bVar = pVar.toBuilder();
                            }
                            C25016p pVar2 = (C25016p) lVar.mo37777v(C25016p.f71272A, a0Var);
                            nVar.f71261e = pVar2;
                            if (bVar != null) {
                                bVar.mo52110e(pVar2);
                                nVar.f71261e = bVar.buildPartial();
                            }
                        } else if (!nVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = nVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = nVar;
                    throw p0Var;
                } catch (Throwable th) {
                    nVar.unknownFields = b.build();
                    nVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            nVar.unknownFields = b.build();
            nVar.makeExtensionsImmutable();
            return nVar;
        }
    }

    /* renamed from: mi3.n$b */
    public static final class C25012b extends C23872m0.C23874b<C25012b> implements C23896m1 {

        /* renamed from: d */
        public long f71263d;

        /* renamed from: e */
        public C25016p f71264e;

        public C25012b() {
            C25010n nVar = C25010n.f71258g;
        }

        /* renamed from: a */
        public C25010n buildPartial() {
            C25010n nVar = new C25010n(this);
            nVar.f71260d = this.f71263d;
            nVar.f71261e = this.f71264e;
            onBuilt();
            return nVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168804addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25012b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25012b mo52092b() {
            super.clear();
            this.f71263d = 0;
            this.f71264e = null;
            return this;
        }

        public C23836g1 build() {
            C25010n a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25012b clone() {
            return (C25012b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168806clearField(C24025t.C24035g gVar) {
            return (C25012b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25012b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25010n.C25012b mo52094d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.n> r0 = mi3.C25010n.f71259h     // Catch:{ p0 -> 0x0010 }
                mi3.n$a r0 = (mi3.C25010n.C25011a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.n r2 = (mi3.C25010n) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52095e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.n r3 = (mi3.C25010n) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52095e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25010n.C25012b.mo52094d(com.google.protobuf.l, com.google.protobuf.a0):mi3.n$b");
        }

        /* renamed from: e */
        public C25012b mo52095e(C25010n nVar) {
            if (nVar == C25010n.f71258g) {
                return this;
            }
            long j = nVar.f71260d;
            if (j != 0) {
                this.f71263d = j;
                onChanged();
            }
            if (nVar.mo52089b()) {
                C25016p a = nVar.mo52088a();
                C25016p pVar = this.f71264e;
                if (pVar != null) {
                    C25016p.C25018b d = C25016p.f71273z.toBuilder();
                    d.mo52110e(pVar);
                    d.mo52110e(a);
                    this.f71264e = d.buildPartial();
                } else {
                    this.f71264e = a;
                }
                onChanged();
            }
            C25012b bVar = (C25012b) super.mergeUnknownFields(nVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25010n.f71258g;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71320A;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71321B;
            fVar.mo37875c(C25010n.class, C25012b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25012b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168813setField(C24025t.C24035g gVar, Object obj) {
            return (C25012b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168814setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25012b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168815setUnknownFields(C24020s2 s2Var) {
            return (C25012b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25012b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25012b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168808clearOneof(C24025t.C24042k kVar) {
            return (C25012b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168809getDefaultInstanceForType() {
            return C25010n.f71258g;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168812mergeUnknownFields(C24020s2 s2Var) {
            return (C25012b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25012b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25012b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25012b) super.setUnknownFields(s2Var);
        }

        public C25012b(C23872m0.C23876c cVar) {
            super(cVar);
            C25010n nVar = C25010n.f71258g;
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168807clearOneof(C24025t.C24042k kVar) {
            return (C25012b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168811mergeUnknownFields(C24020s2 s2Var) {
            return (C25012b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168805build() {
            C25010n a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25010n) {
                mo52095e((C25010n) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168810mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25010n) {
                mo52095e((C25010n) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C25010n(C23872m0.C23874b<?> bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public C25016p mo52088a() {
        C25016p pVar = this.f71261e;
        return pVar == null ? C25016p.f71273z : pVar;
    }

    /* renamed from: b */
    public boolean mo52089b() {
        return this.f71261e != null;
    }

    /* renamed from: c */
    public C25012b toBuilder() {
        if (this == f71258g) {
            return new C25012b();
        }
        C25012b bVar = new C25012b();
        bVar.mo52095e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25010n)) {
            return super.equals(obj);
        }
        C25010n nVar = (C25010n) obj;
        if (this.f71260d == nVar.f71260d && mo52089b() == nVar.mo52089b()) {
            return (!mo52089b() || mo52088a().equals(nVar.mo52088a())) && this.unknownFields.equals(nVar.unknownFields);
        }
        return false;
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71258g;
    }

    public C24062w1<C25010n> getParserForType() {
        return f71259h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f71260d;
        if (j != 0) {
            i2 = 0 + C23897n.m29280y(1, j);
        }
        if (this.f71261e != null) {
            i2 += C23897n.m29270o(2, mo52088a());
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
        int hashCode = ((((C82986r.CTRL_INDEX + C25022r.f71320A.hashCode()) * 37) + 1) * 53) + C23908o0.m29424b(this.f71260d);
        if (mo52089b()) {
            hashCode = (((hashCode * 37) + 2) * 53) + mo52088a().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71321B;
        fVar.mo37875c(C25010n.class, C25012b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71262f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71262f = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71258g.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25010n();
    }

    public void writeTo(C23897n nVar) {
        long j = this.f71260d;
        if (j != 0) {
            nVar.mo37919Z(1, j);
        }
        if (this.f71261e != null) {
            nVar.mo37909P(2, mo52088a());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168802getDefaultInstanceForType() {
        return f71258g;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168803newBuilderForType() {
        return f71258g.toBuilder();
    }

    public C25010n() {
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25012b(cVar);
    }
}
