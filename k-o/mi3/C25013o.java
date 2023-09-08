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

/* renamed from: mi3.o */
public final class C25013o extends C23872m0 implements C23896m1 {

    /* renamed from: g */
    public static final C25013o f71265g = new C25013o();

    /* renamed from: h */
    public static final C24062w1<C25013o> f71266h = new C25014a();

    /* renamed from: d */
    public int f71267d;

    /* renamed from: e */
    public float f71268e;

    /* renamed from: f */
    public byte f71269f;

    /* renamed from: mi3.o$a */
    public static class C25014a extends C23813c<C25013o> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25013o oVar = new C25013o();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            oVar.f71267d = lVar.mo37770o();
                        } else if (F == 21) {
                            oVar.f71268e = lVar.mo37773r();
                        } else if (!oVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = oVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = oVar;
                    throw p0Var;
                } catch (Throwable th) {
                    oVar.unknownFields = b.build();
                    oVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            oVar.unknownFields = b.build();
            oVar.makeExtensionsImmutable();
            return oVar;
        }
    }

    /* renamed from: mi3.o$b */
    public static final class C25015b extends C23872m0.C23874b<C25015b> implements C23896m1 {

        /* renamed from: d */
        public int f71270d = 0;

        /* renamed from: e */
        public float f71271e;

        public C25015b() {
            C25013o oVar = C25013o.f71265g;
        }

        /* renamed from: a */
        public C25013o buildPartial() {
            C25013o oVar = new C25013o(this);
            oVar.f71267d = this.f71270d;
            oVar.f71268e = this.f71271e;
            onBuilt();
            return oVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168818addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25015b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25015b clone() {
            return (C25015b) super.clone();
        }

        public C23836g1 build() {
            C25013o a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25013o.C25015b mo52099c(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.o> r0 = mi3.C25013o.f71266h     // Catch:{ p0 -> 0x0010 }
                mi3.o$a r0 = (mi3.C25013o.C25014a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.o r2 = (mi3.C25013o) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52100d(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.o r3 = (mi3.C25013o) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52100d(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25013o.C25015b.mo52099c(com.google.protobuf.l, com.google.protobuf.a0):mi3.o$b");
        }

        public C23803a.C23804a clear() {
            super.clear();
            this.f71270d = 0;
            this.f71271e = 0.0f;
            return this;
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168823clearField(C24025t.C24035g gVar) {
            return (C25015b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25015b) super.clearOneof(kVar);
        }

        /* renamed from: d */
        public C25015b mo52100d(C25013o oVar) {
            if (oVar == C25013o.f71265g) {
                return this;
            }
            int i = oVar.f71267d;
            if (i != 0) {
                this.f71270d = i;
                onChanged();
            }
            float f = oVar.f71268e;
            if (f != 0.0f) {
                this.f71271e = f;
                onChanged();
            }
            C25015b bVar = (C25015b) super.mergeUnknownFields(oVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25013o.f71265g;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71329g;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71330h;
            fVar.mo37875c(C25013o.class, C25015b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25015b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168830setField(C24025t.C24035g gVar, Object obj) {
            return (C25015b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168831setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25015b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168832setUnknownFields(C24020s2 s2Var) {
            return (C25015b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25015b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25015b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168825clearOneof(C24025t.C24042k kVar) {
            return (C25015b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168826getDefaultInstanceForType() {
            return C25013o.f71265g;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168829mergeUnknownFields(C24020s2 s2Var) {
            return (C25015b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25015b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25015b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25015b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168824clearOneof(C24025t.C24042k kVar) {
            return (C25015b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168828mergeUnknownFields(C24020s2 s2Var) {
            return (C25015b) super.mergeUnknownFields(s2Var);
        }

        public C25015b(C23872m0.C23876c cVar) {
            super(cVar);
            C25013o oVar = C25013o.f71265g;
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168819build() {
            C25013o a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: clear  reason: collision with other method in class */
        public C23872m0.C23874b m168822clear() {
            super.clear();
            this.f71270d = 0;
            this.f71271e = 0.0f;
            return this;
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25013o) {
                mo52100d((C25013o) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: clear  reason: collision with other method in class */
        public C23836g1.C23837a m168820clear() {
            super.clear();
            this.f71270d = 0;
            this.f71271e = 0.0f;
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168827mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25013o) {
                mo52100d((C25013o) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: clear  reason: collision with other method in class */
        public C23845j1.C23846a m168821clear() {
            super.clear();
            this.f71270d = 0;
            this.f71271e = 0.0f;
            return this;
        }
    }

    public C25013o(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71269f = -1;
    }

    /* renamed from: a */
    public C25015b toBuilder() {
        if (this == f71265g) {
            return new C25015b();
        }
        C25015b bVar = new C25015b();
        bVar.mo52100d(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25013o)) {
            return super.equals(obj);
        }
        C25013o oVar = (C25013o) obj;
        return this.f71267d == oVar.f71267d && Float.floatToIntBits(this.f71268e) == Float.floatToIntBits(oVar.f71268e) && this.unknownFields.equals(oVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71265g;
    }

    public C24062w1<C25013o> getParserForType() {
        return f71266h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f71267d != C109630h.NoneAnimation.getNumber()) {
            i2 = 0 + C23897n.m29261f(1, this.f71267d);
        }
        float f = this.f71268e;
        if (f != 0.0f) {
            i2 += C23897n.m29264i(2, f);
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
        int hashCode = ((((((((((C82986r.CTRL_INDEX + C25022r.f71329g.hashCode()) * 37) + 1) * 53) + this.f71267d) * 37) + 2) * 53) + Float.floatToIntBits(this.f71268e)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71330h;
        fVar.mo37875c(C25013o.class, C25015b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71269f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71269f = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71265g.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25013o();
    }

    public void writeTo(C23897n nVar) {
        if (this.f71267d != C109630h.NoneAnimation.getNumber()) {
            nVar.mo37907N(1, this.f71267d);
        }
        float f = this.f71268e;
        if (f != 0.0f) {
            nVar.mo37906M(2, f);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168816getDefaultInstanceForType() {
        return f71265g;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168817newBuilderForType() {
        return f71265g.toBuilder();
    }

    public C25013o() {
        this.f71269f = -1;
        this.f71267d = 0;
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25015b(cVar);
    }
}
