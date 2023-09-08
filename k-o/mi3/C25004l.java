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
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24062w1;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;

/* renamed from: mi3.l */
public final class C25004l extends C23872m0 implements C23896m1 {

    /* renamed from: g */
    public static final C25004l f71226g = new C25004l();

    /* renamed from: h */
    public static final C24062w1<C25004l> f71227h = new C25005a();

    /* renamed from: d */
    public int f71228d;

    /* renamed from: e */
    public C16994k f71229e;

    /* renamed from: f */
    public byte f71230f;

    /* renamed from: mi3.l$a */
    public static class C25005a extends C23813c<C25004l> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25004l lVar2 = new C25004l();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            lVar2.f71228d = lVar.mo37758G();
                        } else if (F == 18) {
                            lVar2.f71229e = lVar.mo37768m();
                        } else if (!lVar2.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = lVar2;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = lVar2;
                    throw p0Var;
                } catch (Throwable th) {
                    lVar2.unknownFields = b.build();
                    lVar2.makeExtensionsImmutable();
                    throw th;
                }
            }
            lVar2.unknownFields = b.build();
            lVar2.makeExtensionsImmutable();
            return lVar2;
        }
    }

    /* renamed from: mi3.l$b */
    public static final class C25006b extends C23872m0.C23874b<C25006b> implements C23896m1 {

        /* renamed from: d */
        public int f71231d;

        /* renamed from: e */
        public C16994k f71232e = C16994k.f46000e;

        public C25006b() {
            C25004l lVar = C25004l.f71226g;
        }

        /* renamed from: a */
        public C25004l buildPartial() {
            C25004l lVar = new C25004l(this);
            lVar.f71228d = this.f71231d;
            lVar.f71229e = this.f71232e;
            onBuilt();
            return lVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168773addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25006b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25006b clone() {
            return (C25006b) super.clone();
        }

        public C23836g1 build() {
            C25004l a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25004l.C25006b mo52080c(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.l> r0 = mi3.C25004l.f71227h     // Catch:{ p0 -> 0x0010 }
                mi3.l$a r0 = (mi3.C25004l.C25005a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.l r2 = (mi3.C25004l) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52081d(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.l r3 = (mi3.C25004l) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52081d(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25004l.C25006b.mo52080c(com.google.protobuf.l, com.google.protobuf.a0):mi3.l$b");
        }

        public C23803a.C23804a clear() {
            super.clear();
            this.f71231d = 0;
            this.f71232e = C16994k.f46000e;
            return this;
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168778clearField(C24025t.C24035g gVar) {
            return (C25006b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25006b) super.clearOneof(kVar);
        }

        /* renamed from: d */
        public C25006b mo52081d(C25004l lVar) {
            if (lVar == C25004l.f71226g) {
                return this;
            }
            int i = lVar.f71228d;
            if (i != 0) {
                this.f71231d = i;
                onChanged();
            }
            C16994k kVar = lVar.f71229e;
            if (kVar != C16994k.f46000e) {
                kVar.getClass();
                this.f71232e = kVar;
                onChanged();
            }
            C25006b bVar = (C25006b) super.mergeUnknownFields(lVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25004l.f71226g;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71333k;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71334l;
            fVar.mo37875c(C25004l.class, C25006b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25006b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168785setField(C24025t.C24035g gVar, Object obj) {
            return (C25006b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168786setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25006b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168787setUnknownFields(C24020s2 s2Var) {
            return (C25006b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25006b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25006b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168780clearOneof(C24025t.C24042k kVar) {
            return (C25006b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168781getDefaultInstanceForType() {
            return C25004l.f71226g;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168784mergeUnknownFields(C24020s2 s2Var) {
            return (C25006b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25006b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25006b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25006b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168779clearOneof(C24025t.C24042k kVar) {
            return (C25006b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168783mergeUnknownFields(C24020s2 s2Var) {
            return (C25006b) super.mergeUnknownFields(s2Var);
        }

        public C25006b(C23872m0.C23876c cVar) {
            super(cVar);
            C25004l lVar = C25004l.f71226g;
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168774build() {
            C25004l a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: clear  reason: collision with other method in class */
        public C23872m0.C23874b m168777clear() {
            super.clear();
            this.f71231d = 0;
            this.f71232e = C16994k.f46000e;
            return this;
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25004l) {
                mo52081d((C25004l) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: clear  reason: collision with other method in class */
        public C23836g1.C23837a m168775clear() {
            super.clear();
            this.f71231d = 0;
            this.f71232e = C16994k.f46000e;
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168782mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25004l) {
                mo52081d((C25004l) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: clear  reason: collision with other method in class */
        public C23845j1.C23846a m168776clear() {
            super.clear();
            this.f71231d = 0;
            this.f71232e = C16994k.f46000e;
            return this;
        }
    }

    public C25004l(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71230f = -1;
    }

    /* renamed from: a */
    public C25006b toBuilder() {
        if (this == f71226g) {
            return new C25006b();
        }
        C25006b bVar = new C25006b();
        bVar.mo52081d(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25004l)) {
            return super.equals(obj);
        }
        C25004l lVar = (C25004l) obj;
        return this.f71228d == lVar.f71228d && this.f71229e.equals(lVar.f71229e) && this.unknownFields.equals(lVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71226g;
    }

    public C24062w1<C25004l> getParserForType() {
        return f71227h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f71228d;
        if (i3 != 0) {
            i2 = 0 + C23897n.m29278w(1, i3);
        }
        if (!this.f71229e.isEmpty()) {
            i2 += C23897n.m29258c(2, this.f71229e);
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
        int hashCode = ((((((((((C82986r.CTRL_INDEX + C25022r.f71333k.hashCode()) * 37) + 1) * 53) + this.f71228d) * 37) + 2) * 53) + this.f71229e.hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71334l;
        fVar.mo37875c(C25004l.class, C25006b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71230f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71230f = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71226g.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25004l();
    }

    public void writeTo(C23897n nVar) {
        int i = this.f71228d;
        if (i != 0) {
            nVar.mo37917X(1, i);
        }
        if (!this.f71229e.isEmpty()) {
            nVar.mo37899F(2, this.f71229e);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168771getDefaultInstanceForType() {
        return f71226g;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168772newBuilderForType() {
        return f71226g.toBuilder();
    }

    public C25004l() {
        this.f71230f = -1;
        this.f71229e = C16994k.f46000e;
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25006b(cVar);
    }
}
