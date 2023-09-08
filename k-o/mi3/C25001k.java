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

/* renamed from: mi3.k */
public final class C25001k extends C23872m0 implements C23896m1 {

    /* renamed from: i */
    public static final C25001k f71215i = new C25001k();

    /* renamed from: j */
    public static final C24062w1<C25001k> f71216j = new C25002a();

    /* renamed from: d */
    public int f71217d;

    /* renamed from: e */
    public int f71218e;

    /* renamed from: f */
    public int f71219f;

    /* renamed from: g */
    public int f71220g;

    /* renamed from: h */
    public byte f71221h = -1;

    /* renamed from: mi3.k$a */
    public static class C25002a extends C23813c<C25001k> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25001k kVar = new C25001k();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            kVar.f71217d = lVar.mo37775t();
                        } else if (F == 16) {
                            kVar.f71218e = lVar.mo37775t();
                        } else if (F == 24) {
                            kVar.f71219f = lVar.mo37775t();
                        } else if (F == 32) {
                            kVar.f71220g = lVar.mo37775t();
                        } else if (!kVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = kVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = kVar;
                    throw p0Var;
                } catch (Throwable th) {
                    kVar.unknownFields = b.build();
                    kVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            kVar.unknownFields = b.build();
            kVar.makeExtensionsImmutable();
            return kVar;
        }
    }

    /* renamed from: mi3.k$b */
    public static final class C25003b extends C23872m0.C23874b<C25003b> implements C23896m1 {

        /* renamed from: d */
        public int f71222d;

        /* renamed from: e */
        public int f71223e;

        /* renamed from: f */
        public int f71224f;

        /* renamed from: g */
        public int f71225g;

        public C25003b() {
            C25001k kVar = C25001k.f71215i;
        }

        /* renamed from: a */
        public C25001k buildPartial() {
            C25001k kVar = new C25001k(this);
            kVar.f71217d = this.f71222d;
            kVar.f71218e = this.f71223e;
            kVar.f71219f = this.f71224f;
            kVar.f71220g = this.f71225g;
            onBuilt();
            return kVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168759addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25003b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25003b mo52073b() {
            super.clear();
            this.f71222d = 0;
            this.f71223e = 0;
            this.f71224f = 0;
            this.f71225g = 0;
            return this;
        }

        public C23836g1 build() {
            C25001k a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25003b clone() {
            return (C25003b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168761clearField(C24025t.C24035g gVar) {
            return (C25003b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25003b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25001k.C25003b mo52075d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.k> r0 = mi3.C25001k.f71216j     // Catch:{ p0 -> 0x0010 }
                mi3.k$a r0 = (mi3.C25001k.C25002a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.k r2 = (mi3.C25001k) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52076e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.k r3 = (mi3.C25001k) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52076e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25001k.C25003b.mo52075d(com.google.protobuf.l, com.google.protobuf.a0):mi3.k$b");
        }

        /* renamed from: e */
        public C25003b mo52076e(C25001k kVar) {
            if (kVar == C25001k.f71215i) {
                return this;
            }
            int i = kVar.f71217d;
            if (i != 0) {
                this.f71222d = i;
                onChanged();
            }
            int i2 = kVar.f71218e;
            if (i2 != 0) {
                this.f71223e = i2;
                onChanged();
            }
            int i3 = kVar.f71219f;
            if (i3 != 0) {
                this.f71224f = i3;
                onChanged();
            }
            int i4 = kVar.f71220g;
            if (i4 != 0) {
                this.f71225g = i4;
                onChanged();
            }
            C25003b bVar = (C25003b) super.mergeUnknownFields(kVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25001k.f71215i;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71323a;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71324b;
            fVar.mo37875c(C25001k.class, C25003b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25003b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168768setField(C24025t.C24035g gVar, Object obj) {
            return (C25003b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168769setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25003b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168770setUnknownFields(C24020s2 s2Var) {
            return (C25003b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25003b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25003b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168763clearOneof(C24025t.C24042k kVar) {
            return (C25003b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168764getDefaultInstanceForType() {
            return C25001k.f71215i;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168767mergeUnknownFields(C24020s2 s2Var) {
            return (C25003b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25003b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25003b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25003b) super.setUnknownFields(s2Var);
        }

        public C25003b(C23872m0.C23876c cVar) {
            super(cVar);
            C25001k kVar = C25001k.f71215i;
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168762clearOneof(C24025t.C24042k kVar) {
            return (C25003b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168766mergeUnknownFields(C24020s2 s2Var) {
            return (C25003b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168760build() {
            C25001k a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25001k) {
                mo52076e((C25001k) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168765mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25001k) {
                mo52076e((C25001k) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C25001k(C23872m0.C23874b<?> bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public static C25003b m31651a(C25001k kVar) {
        C25003b b = f71215i.toBuilder();
        b.mo52076e(kVar);
        return b;
    }

    /* renamed from: b */
    public C25003b toBuilder() {
        if (this == f71215i) {
            return new C25003b();
        }
        C25003b bVar = new C25003b();
        bVar.mo52076e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25001k)) {
            return super.equals(obj);
        }
        C25001k kVar = (C25001k) obj;
        return this.f71217d == kVar.f71217d && this.f71218e == kVar.f71218e && this.f71219f == kVar.f71219f && this.f71220g == kVar.f71220g && this.unknownFields.equals(kVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71215i;
    }

    public C24062w1<C25001k> getParserForType() {
        return f71216j;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f71217d;
        if (i3 != 0) {
            i2 = 0 + C23897n.m29266k(1, i3);
        }
        int i4 = this.f71218e;
        if (i4 != 0) {
            i2 += C23897n.m29266k(2, i4);
        }
        int i5 = this.f71219f;
        if (i5 != 0) {
            i2 += C23897n.m29266k(3, i5);
        }
        int i6 = this.f71220g;
        if (i6 != 0) {
            i2 += C23897n.m29266k(4, i6);
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
        int hashCode = ((((((((((((((((((C82986r.CTRL_INDEX + C25022r.f71323a.hashCode()) * 37) + 1) * 53) + this.f71217d) * 37) + 2) * 53) + this.f71218e) * 37) + 3) * 53) + this.f71219f) * 37) + 4) * 53) + this.f71220g) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71324b;
        fVar.mo37875c(C25001k.class, C25003b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71221h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71221h = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71215i.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25001k();
    }

    public void writeTo(C23897n nVar) {
        int i = this.f71217d;
        if (i != 0) {
            nVar.mo37907N(1, i);
        }
        int i2 = this.f71218e;
        if (i2 != 0) {
            nVar.mo37907N(2, i2);
        }
        int i3 = this.f71219f;
        if (i3 != 0) {
            nVar.mo37907N(3, i3);
        }
        int i4 = this.f71220g;
        if (i4 != 0) {
            nVar.mo37907N(4, i4);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168757getDefaultInstanceForType() {
        return f71215i;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168758newBuilderForType() {
        return f71215i.toBuilder();
    }

    public C25001k() {
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25003b(cVar);
    }
}
