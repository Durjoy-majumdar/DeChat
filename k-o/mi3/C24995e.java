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
import mi3.C25001k;

/* renamed from: mi3.e */
public final class C24995e extends C23872m0 implements C23896m1 {

    /* renamed from: g */
    public static final C24995e f71199g = new C24995e();

    /* renamed from: h */
    public static final C24062w1<C24995e> f71200h = new C24996a();

    /* renamed from: d */
    public C25001k f71201d;

    /* renamed from: e */
    public C25001k f71202e;

    /* renamed from: f */
    public byte f71203f = -1;

    /* renamed from: mi3.e$a */
    public static class C24996a extends C23813c<C24995e> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C24995e eVar = new C24995e();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        C25001k.C25003b bVar = null;
                        if (F == 10) {
                            C25001k kVar = eVar.f71201d;
                            if (kVar != null) {
                                bVar = kVar.toBuilder();
                            }
                            C25001k kVar2 = (C25001k) lVar.mo37777v(C25001k.f71216j, a0Var);
                            eVar.f71201d = kVar2;
                            if (bVar != null) {
                                bVar.mo52076e(kVar2);
                                eVar.f71201d = bVar.buildPartial();
                            }
                        } else if (F == 18) {
                            C25001k kVar3 = eVar.f71202e;
                            if (kVar3 != null) {
                                bVar = kVar3.toBuilder();
                            }
                            C25001k kVar4 = (C25001k) lVar.mo37777v(C25001k.f71216j, a0Var);
                            eVar.f71202e = kVar4;
                            if (bVar != null) {
                                bVar.mo52076e(kVar4);
                                eVar.f71202e = bVar.buildPartial();
                            }
                        } else if (!eVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = eVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = eVar;
                    throw p0Var;
                } catch (Throwable th) {
                    eVar.unknownFields = b.build();
                    eVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            eVar.unknownFields = b.build();
            eVar.makeExtensionsImmutable();
            return eVar;
        }
    }

    /* renamed from: mi3.e$b */
    public static final class C24997b extends C23872m0.C23874b<C24997b> implements C23896m1 {

        /* renamed from: d */
        public C25001k f71204d;

        /* renamed from: e */
        public C25001k f71205e;

        public C24997b() {
            C24995e eVar = C24995e.f71199g;
        }

        /* renamed from: a */
        public C24995e build() {
            C24995e b = buildPartial();
            if (b.isInitialized()) {
                return b;
            }
            throw C23803a.C23804a.newUninitializedMessageException(b);
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168732addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24997b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C24995e buildPartial() {
            C24995e eVar = new C24995e(this);
            eVar.f71201d = this.f71204d;
            eVar.f71202e = this.f71205e;
            onBuilt();
            return eVar;
        }

        /* renamed from: c */
        public C24997b mo52060c() {
            super.clear();
            this.f71204d = null;
            this.f71205e = null;
            return this;
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168733clearField(C24025t.C24035g gVar) {
            return (C24997b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C24997b) super.clearOneof(kVar);
        }

        /* renamed from: d */
        public C24997b clone() {
            return (C24997b) super.clone();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C24995e.C24997b mo52062e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.e> r0 = mi3.C24995e.f71200h     // Catch:{ p0 -> 0x0010 }
                mi3.e$a r0 = (mi3.C24995e.C24996a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.e r2 = (mi3.C24995e) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52063f(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.e r3 = (mi3.C24995e) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52063f(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C24995e.C24997b.mo52062e(com.google.protobuf.l, com.google.protobuf.a0):mi3.e$b");
        }

        /* renamed from: f */
        public C24997b mo52063f(C24995e eVar) {
            if (eVar == C24995e.f71199g) {
                return this;
            }
            boolean z = true;
            if (eVar.f71201d != null) {
                C25001k a = eVar.mo52055a();
                C25001k kVar = this.f71204d;
                if (kVar != null) {
                    C25001k.C25003b a2 = C25001k.m31651a(kVar);
                    a2.mo52076e(a);
                    this.f71204d = a2.buildPartial();
                } else {
                    this.f71204d = a;
                }
                onChanged();
            }
            if (eVar.f71202e == null) {
                z = false;
            }
            if (z) {
                C25001k b = eVar.mo52056b();
                C25001k kVar2 = this.f71205e;
                if (kVar2 != null) {
                    C25001k.C25003b a3 = C25001k.m31651a(kVar2);
                    a3.mo52076e(b);
                    this.f71205e = a3.buildPartial();
                } else {
                    this.f71205e = b;
                }
                onChanged();
            }
            C24997b bVar = (C24997b) super.mergeUnknownFields(eVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C24995e.f71199g;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71325c;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71326d;
            fVar.mo37875c(C24995e.class, C24997b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C24997b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168740setField(C24025t.C24035g gVar, Object obj) {
            return (C24997b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168741setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24997b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168742setUnknownFields(C24020s2 s2Var) {
            return (C24997b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24997b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C24997b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168735clearOneof(C24025t.C24042k kVar) {
            return (C24997b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168736getDefaultInstanceForType() {
            return C24995e.f71199g;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168739mergeUnknownFields(C24020s2 s2Var) {
            return (C24997b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C24997b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24997b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C24997b) super.setUnknownFields(s2Var);
        }

        public C24997b(C23872m0.C23876c cVar) {
            super(cVar);
            C24995e eVar = C24995e.f71199g;
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168734clearOneof(C24025t.C24042k kVar) {
            return (C24997b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168738mergeUnknownFields(C24020s2 s2Var) {
            return (C24997b) super.mergeUnknownFields(s2Var);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24995e) {
                mo52063f((C24995e) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168737mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24995e) {
                mo52063f((C24995e) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C24995e(C23872m0.C23874b<?> bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public C25001k mo52055a() {
        C25001k kVar = this.f71201d;
        return kVar == null ? C25001k.f71215i : kVar;
    }

    /* renamed from: b */
    public C25001k mo52056b() {
        C25001k kVar = this.f71202e;
        return kVar == null ? C25001k.f71215i : kVar;
    }

    /* renamed from: c */
    public C24997b toBuilder() {
        if (this == f71199g) {
            return new C24997b();
        }
        C24997b bVar = new C24997b();
        bVar.mo52063f(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24995e)) {
            return super.equals(obj);
        }
        C24995e eVar = (C24995e) obj;
        C25001k kVar = this.f71201d;
        if ((kVar != null) != (eVar.f71201d != null)) {
            return false;
        }
        if ((kVar != null) && !mo52055a().equals(eVar.mo52055a())) {
            return false;
        }
        C25001k kVar2 = this.f71202e;
        if ((kVar2 != null) != (eVar.f71202e != null)) {
            return false;
        }
        return (!(kVar2 != null) || mo52056b().equals(eVar.mo52056b())) && this.unknownFields.equals(eVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71199g;
    }

    public C24062w1<C24995e> getParserForType() {
        return f71200h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f71201d != null) {
            i2 = 0 + C23897n.m29270o(1, mo52055a());
        }
        if (this.f71202e != null) {
            i2 += C23897n.m29270o(2, mo52056b());
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
        int hashCode = C25022r.f71325c.hashCode() + C82986r.CTRL_INDEX;
        boolean z = false;
        if (this.f71201d != null) {
            hashCode = (((hashCode * 37) + 1) * 53) + mo52055a().hashCode();
        }
        if (this.f71202e != null) {
            z = true;
        }
        if (z) {
            hashCode = (((hashCode * 37) + 2) * 53) + mo52056b().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71326d;
        fVar.mo37875c(C24995e.class, C24997b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71203f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71203f = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71199g.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C24995e();
    }

    public void writeTo(C23897n nVar) {
        if (this.f71201d != null) {
            nVar.mo37909P(1, mo52055a());
        }
        if (this.f71202e != null) {
            nVar.mo37909P(2, mo52056b());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168730getDefaultInstanceForType() {
        return f71199g;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168731newBuilderForType() {
        return f71199g.toBuilder();
    }

    public C24995e() {
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C24997b(cVar);
    }
}
