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

/* renamed from: mi3.q */
public final class C25019q extends C23872m0 implements C23896m1 {

    /* renamed from: h */
    public static final C25019q f71311h = new C25019q();

    /* renamed from: i */
    public static final C24062w1<C25019q> f71312i = new C25020a();

    /* renamed from: d */
    public volatile Object f71313d;

    /* renamed from: e */
    public long f71314e;

    /* renamed from: f */
    public long f71315f;

    /* renamed from: g */
    public byte f71316g;

    /* renamed from: mi3.q$a */
    public static class C25020a extends C23813c<C25019q> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25019q qVar = new C25019q();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            qVar.f71313d = lVar.mo37756E();
                        } else if (F == 16) {
                            qVar.f71314e = lVar.mo37776u();
                        } else if (F == 24) {
                            qVar.f71315f = lVar.mo37776u();
                        } else if (!qVar.parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = qVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = qVar;
                    throw p0Var;
                } catch (Throwable th) {
                    qVar.unknownFields = b.build();
                    qVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            qVar.unknownFields = b.build();
            qVar.makeExtensionsImmutable();
            return qVar;
        }
    }

    /* renamed from: mi3.q$b */
    public static final class C25021b extends C23872m0.C23874b<C25021b> implements C23896m1 {

        /* renamed from: d */
        public Object f71317d = "";

        /* renamed from: e */
        public long f71318e;

        /* renamed from: f */
        public long f71319f;

        public C25021b() {
            C25019q qVar = C25019q.f71311h;
        }

        /* renamed from: a */
        public C25019q buildPartial() {
            C25019q qVar = new C25019q(this);
            qVar.f71313d = this.f71317d;
            qVar.f71314e = this.f71318e;
            qVar.f71315f = this.f71319f;
            onBuilt();
            return qVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168849addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25021b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25021b mo52114b() {
            super.clear();
            this.f71317d = "";
            this.f71318e = 0;
            this.f71319f = 0;
            return this;
        }

        public C23836g1 build() {
            C25019q a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25021b clone() {
            return (C25021b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168851clearField(C24025t.C24035g gVar) {
            return (C25021b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25021b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25019q.C25021b mo52116d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.q> r0 = mi3.C25019q.f71312i     // Catch:{ p0 -> 0x0010 }
                mi3.q$a r0 = (mi3.C25019q.C25020a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.q r2 = (mi3.C25019q) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52117e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.q r3 = (mi3.C25019q) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52117e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25019q.C25021b.mo52116d(com.google.protobuf.l, com.google.protobuf.a0):mi3.q$b");
        }

        /* renamed from: e */
        public C25021b mo52117e(C25019q qVar) {
            if (qVar == C25019q.f71311h) {
                return this;
            }
            if (!qVar.getPath().isEmpty()) {
                this.f71317d = qVar.f71313d;
                onChanged();
            }
            long j = qVar.f71314e;
            if (j != 0) {
                this.f71318e = j;
                onChanged();
            }
            long j2 = qVar.f71315f;
            if (j2 != 0) {
                this.f71319f = j2;
                onChanged();
            }
            C25021b bVar = (C25021b) super.mergeUnknownFields(qVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25019q.f71311h;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71327e;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71328f;
            fVar.mo37875c(C25019q.class, C25021b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25021b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168858setField(C24025t.C24035g gVar, Object obj) {
            return (C25021b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168859setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25021b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168860setUnknownFields(C24020s2 s2Var) {
            return (C25021b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25021b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25021b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168853clearOneof(C24025t.C24042k kVar) {
            return (C25021b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168854getDefaultInstanceForType() {
            return C25019q.f71311h;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168857mergeUnknownFields(C24020s2 s2Var) {
            return (C25021b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25021b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25021b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25021b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168852clearOneof(C24025t.C24042k kVar) {
            return (C25021b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168856mergeUnknownFields(C24020s2 s2Var) {
            return (C25021b) super.mergeUnknownFields(s2Var);
        }

        public C25021b(C23872m0.C23876c cVar) {
            super(cVar);
            C25019q qVar = C25019q.f71311h;
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168850build() {
            C25019q a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25019q) {
                mo52117e((C25019q) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168855mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25019q) {
                mo52117e((C25019q) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C25019q(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71316g = -1;
    }

    /* renamed from: a */
    public C25021b toBuilder() {
        if (this == f71311h) {
            return new C25021b();
        }
        C25021b bVar = new C25021b();
        bVar.mo52117e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25019q)) {
            return super.equals(obj);
        }
        C25019q qVar = (C25019q) obj;
        return getPath().equals(qVar.getPath()) && this.f71314e == qVar.f71314e && this.f71315f == qVar.f71315f && this.unknownFields.equals(qVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71311h;
    }

    public C24062w1<C25019q> getParserForType() {
        return f71312i;
    }

    public String getPath() {
        Object obj = this.f71313d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String u = ((C16994k) obj).mo18752u();
        this.f71313d = u;
        return u;
    }

    public int getSerializedSize() {
        C16994k kVar;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        Object obj = this.f71313d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71313d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            i2 = 0 + C23872m0.computeStringSize(1, this.f71313d);
        }
        long j = this.f71314e;
        if (j != 0) {
            i2 += C23897n.m29268m(2, j);
        }
        long j2 = this.f71315f;
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
        int hashCode = ((((((((((((((C82986r.CTRL_INDEX + C25022r.f71327e.hashCode()) * 37) + 1) * 53) + getPath().hashCode()) * 37) + 2) * 53) + C23908o0.m29424b(this.f71314e)) * 37) + 3) * 53) + C23908o0.m29424b(this.f71315f)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71328f;
        fVar.mo37875c(C25019q.class, C25021b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71316g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71316g = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71311h.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25019q();
    }

    public void writeTo(C23897n nVar) {
        C16994k kVar;
        Object obj = this.f71313d;
        if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
            this.f71313d = kVar;
        } else {
            kVar = (C16994k) obj;
        }
        if (!kVar.isEmpty()) {
            C23872m0.writeString(nVar, 1, this.f71313d);
        }
        long j = this.f71314e;
        if (j != 0) {
            nVar.mo37919Z(2, j);
        }
        long j2 = this.f71315f;
        if (j2 != 0) {
            nVar.mo37919Z(3, j2);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168847getDefaultInstanceForType() {
        return f71311h;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168848newBuilderForType() {
        return f71311h.toBuilder();
    }

    public C25019q() {
        this.f71316g = -1;
        this.f71313d = "";
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25021b(cVar);
    }
}
