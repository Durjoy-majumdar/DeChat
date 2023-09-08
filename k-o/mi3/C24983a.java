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
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;
import mi3.C25004l;

/* renamed from: mi3.a */
public final class C24983a extends C23872m0 implements C23896m1 {

    /* renamed from: g */
    public static final C24983a f71141g = new C24983a();

    /* renamed from: h */
    public static final C24062w1<C24983a> f71142h = new C24984a();

    /* renamed from: d */
    public int f71143d;

    /* renamed from: e */
    public C25004l f71144e;

    /* renamed from: f */
    public byte f71145f = -1;

    /* renamed from: mi3.a$a */
    public static class C24984a extends C23813c<C24983a> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C24983a aVar = new C24983a();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            aVar.f71143d = lVar.mo37758G();
                        } else if (F == 18) {
                            C25004l.C25006b bVar = null;
                            C25004l lVar2 = aVar.f71144e;
                            if (lVar2 != null) {
                                bVar = lVar2.toBuilder();
                            }
                            C25004l lVar3 = (C25004l) lVar.mo37777v(C25004l.f71227h, a0Var);
                            aVar.f71144e = lVar3;
                            if (bVar != null) {
                                bVar.mo52081d(lVar3);
                                aVar.f71144e = bVar.buildPartial();
                            }
                        } else if (!aVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = aVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = aVar;
                    throw p0Var;
                } catch (Throwable th) {
                    aVar.unknownFields = b.build();
                    aVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            aVar.unknownFields = b.build();
            aVar.makeExtensionsImmutable();
            return aVar;
        }
    }

    /* renamed from: mi3.a$b */
    public static final class C24985b extends C23872m0.C23874b<C24985b> implements C23896m1 {

        /* renamed from: d */
        public int f71146d;

        /* renamed from: e */
        public C25004l f71147e;

        public C24985b() {
            C24983a aVar = C24983a.f71141g;
        }

        /* renamed from: a */
        public C24983a buildPartial() {
            C24983a aVar = new C24983a(this);
            aVar.f71143d = this.f71146d;
            aVar.f71144e = this.f71147e;
            onBuilt();
            return aVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168676addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24985b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C24985b mo52022b() {
            super.clear();
            this.f71146d = 0;
            this.f71147e = null;
            return this;
        }

        public C23836g1 build() {
            C24983a a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C24985b clone() {
            return (C24985b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168678clearField(C24025t.C24035g gVar) {
            return (C24985b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C24985b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C24983a.C24985b mo52024d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.a> r0 = mi3.C24983a.f71142h     // Catch:{ p0 -> 0x0010 }
                mi3.a$a r0 = (mi3.C24983a.C24984a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.a r2 = (mi3.C24983a) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52025e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.a r3 = (mi3.C24983a) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52025e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C24983a.C24985b.mo52024d(com.google.protobuf.l, com.google.protobuf.a0):mi3.a$b");
        }

        /* renamed from: e */
        public C24985b mo52025e(C24983a aVar) {
            if (aVar == C24983a.f71141g) {
                return this;
            }
            int i = aVar.f71143d;
            if (i != 0) {
                this.f71146d = i;
                onChanged();
            }
            if (aVar.f71144e != null) {
                C25004l a = aVar.mo52019a();
                C25004l lVar = this.f71147e;
                if (lVar != null) {
                    C25004l.C25006b a2 = C25004l.f71226g.toBuilder();
                    a2.mo52081d(lVar);
                    a2.mo52081d(a);
                    this.f71147e = a2.buildPartial();
                } else {
                    this.f71147e = a;
                }
                onChanged();
            }
            C24985b bVar = (C24985b) super.mergeUnknownFields(aVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C24983a.f71141g;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71335m;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71336n;
            fVar.mo37875c(C24983a.class, C24985b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C24985b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168685setField(C24025t.C24035g gVar, Object obj) {
            return (C24985b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168686setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24985b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168687setUnknownFields(C24020s2 s2Var) {
            return (C24985b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24985b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C24985b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168680clearOneof(C24025t.C24042k kVar) {
            return (C24985b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168681getDefaultInstanceForType() {
            return C24983a.f71141g;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168684mergeUnknownFields(C24020s2 s2Var) {
            return (C24985b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C24985b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24985b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C24985b) super.setUnknownFields(s2Var);
        }

        public C24985b(C23872m0.C23876c cVar) {
            super(cVar);
            C24983a aVar = C24983a.f71141g;
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168679clearOneof(C24025t.C24042k kVar) {
            return (C24985b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168683mergeUnknownFields(C24020s2 s2Var) {
            return (C24985b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168677build() {
            C24983a a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24983a) {
                mo52025e((C24983a) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168682mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24983a) {
                mo52025e((C24983a) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C24983a(C23872m0.C23874b<?> bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public C25004l mo52019a() {
        C25004l lVar = this.f71144e;
        return lVar == null ? C25004l.f71226g : lVar;
    }

    /* renamed from: b */
    public C24985b toBuilder() {
        if (this == f71141g) {
            return new C24985b();
        }
        C24985b bVar = new C24985b();
        bVar.mo52025e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24983a)) {
            return super.equals(obj);
        }
        C24983a aVar = (C24983a) obj;
        if (this.f71143d != aVar.f71143d) {
            return false;
        }
        C25004l lVar = this.f71144e;
        if ((lVar != null) != (aVar.f71144e != null)) {
            return false;
        }
        return (!(lVar != null) || mo52019a().equals(aVar.mo52019a())) && this.unknownFields.equals(aVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71141g;
    }

    public C24062w1<C24983a> getParserForType() {
        return f71142h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f71143d;
        if (i3 != 0) {
            i2 = 0 + C23897n.m29278w(1, i3);
        }
        if (this.f71144e != null) {
            i2 += C23897n.m29270o(2, mo52019a());
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
        int hashCode = ((((C25022r.f71335m.hashCode() + C82986r.CTRL_INDEX) * 37) + 1) * 53) + this.f71143d;
        if (this.f71144e == null) {
            z = false;
        }
        if (z) {
            hashCode = (((hashCode * 37) + 2) * 53) + mo52019a().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71336n;
        fVar.mo37875c(C24983a.class, C24985b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71145f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71145f = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71141g.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C24983a();
    }

    public void writeTo(C23897n nVar) {
        int i = this.f71143d;
        if (i != 0) {
            nVar.mo37917X(1, i);
        }
        if (this.f71144e != null) {
            nVar.mo37909P(2, mo52019a());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168674getDefaultInstanceForType() {
        return f71141g;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168675newBuilderForType() {
        return f71141g.toBuilder();
    }

    public C24983a() {
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C24985b(cVar);
    }
}
