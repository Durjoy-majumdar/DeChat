package l10;

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

/* renamed from: l10.g */
public final class C24924g {

    /* renamed from: a */
    public static final C24025t.C24027b f71013a;

    /* renamed from: b */
    public static final C23872m0.C23880f f71014b;

    /* renamed from: c */
    public static final C24025t.C24027b f71015c;

    /* renamed from: d */
    public static final C23872m0.C23880f f71016d;

    /* renamed from: e */
    public static C24025t.C24038h f71017e;

    /* renamed from: l10.g$a */
    public static final class C24925a extends C23872m0 implements C23896m1 {

        /* renamed from: h */
        public static final C24925a f71018h = new C24925a();
        @Deprecated

        /* renamed from: i */
        public static final C24062w1<C24925a> f71019i = new C24926a();

        /* renamed from: d */
        public int f71020d;

        /* renamed from: e */
        public int f71021e;

        /* renamed from: f */
        public int f71022f;

        /* renamed from: g */
        public byte f71023g = -1;

        /* renamed from: l10.g$a$a */
        public class C24926a extends C23813c<C24925a> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24925a aVar = new C24925a();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                aVar.f71020d |= 1;
                                aVar.f71021e = lVar.mo37775t();
                            } else if (F == 16) {
                                aVar.f71020d |= 2;
                                aVar.f71022f = lVar.mo37775t();
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

        /* renamed from: l10.g$a$b */
        public static final class C24927b extends C23872m0.C23874b<C24927b> implements C23896m1 {

            /* renamed from: d */
            public int f71024d;

            /* renamed from: e */
            public int f71025e;

            /* renamed from: f */
            public int f71026f;

            public C24927b() {
                C24925a aVar = C24925a.f71018h;
            }

            /* renamed from: a */
            public C24925a buildPartial() {
                C24925a aVar = new C24925a(this);
                int i = this.f71024d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    aVar.f71021e = this.f71025e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    aVar.f71022f = this.f71026f;
                    i2 |= 2;
                }
                aVar.f71020d = i2;
                onBuilt();
                return aVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168566addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24927b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24927b mo51927b() {
                super.clear();
                this.f71025e = 0;
                this.f71026f = 0;
                this.f71024d = this.f71024d & -2 & -3;
                return this;
            }

            public C23836g1 build() {
                C24925a a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24927b clone() {
                return (C24927b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168568clearField(C24025t.C24035g gVar) {
                return (C24927b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24927b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24924g.C24925a.C24927b mo51929d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.g$a> r0 = l10.C24924g.C24925a.f71019i     // Catch:{ p0 -> 0x0010 }
                    l10.g$a$a r0 = (l10.C24924g.C24925a.C24926a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.g$a r2 = (l10.C24924g.C24925a) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51930e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.g$a r3 = (l10.C24924g.C24925a) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51930e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24924g.C24925a.C24927b.mo51929d(com.google.protobuf.l, com.google.protobuf.a0):l10.g$a$b");
            }

            /* renamed from: e */
            public C24927b mo51930e(C24925a aVar) {
                if (aVar == C24925a.f71018h) {
                    return this;
                }
                if (aVar.mo51923a()) {
                    int i = aVar.f71021e;
                    this.f71024d |= 1;
                    this.f71025e = i;
                    onChanged();
                }
                if (aVar.mo51924b()) {
                    int i2 = aVar.f71022f;
                    this.f71024d |= 2;
                    this.f71026f = i2;
                    onChanged();
                }
                C24927b bVar = (C24927b) super.mergeUnknownFields(aVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24925a.f71018h;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24924g.f71015c;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24924g.f71016d;
                fVar.mo37875c(C24925a.class, C24927b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                int i = this.f71024d;
                if (!((i & 1) != 0)) {
                    return false;
                }
                return (i & 2) != 0;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24927b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168575setField(C24025t.C24035g gVar, Object obj) {
                return (C24927b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168576setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24927b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168577setUnknownFields(C24020s2 s2Var) {
                return (C24927b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24927b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24927b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168570clearOneof(C24025t.C24042k kVar) {
                return (C24927b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168571getDefaultInstanceForType() {
                return C24925a.f71018h;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168574mergeUnknownFields(C24020s2 s2Var) {
                return (C24927b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24927b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24927b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24927b) super.setUnknownFields(s2Var);
            }

            public C24927b(C23872m0.C23876c cVar) {
                super(cVar);
                C24925a aVar = C24925a.f71018h;
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168569clearOneof(C24025t.C24042k kVar) {
                return (C24927b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168573mergeUnknownFields(C24020s2 s2Var) {
                return (C24927b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168567build() {
                C24925a a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24925a) {
                    mo51930e((C24925a) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168572mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24925a) {
                    mo51930e((C24925a) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24925a(C23872m0.C23874b<?> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public boolean mo51923a() {
            return (this.f71020d & 1) != 0;
        }

        /* renamed from: b */
        public boolean mo51924b() {
            return (this.f71020d & 2) != 0;
        }

        /* renamed from: c */
        public C24927b toBuilder() {
            if (this == f71018h) {
                return new C24927b();
            }
            C24927b bVar = new C24927b();
            bVar.mo51930e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24925a)) {
                return super.equals(obj);
            }
            C24925a aVar = (C24925a) obj;
            if (mo51923a() != aVar.mo51923a()) {
                return false;
            }
            if ((!mo51923a() || this.f71021e == aVar.f71021e) && mo51924b() == aVar.mo51924b()) {
                return (!mo51924b() || this.f71022f == aVar.f71022f) && this.unknownFields.equals(aVar.unknownFields);
            }
            return false;
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71018h;
        }

        public C24062w1<C24925a> getParserForType() {
            return f71019i;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71020d & 1) != 0) {
                i2 = 0 + C23897n.m29266k(1, this.f71021e);
            }
            if ((this.f71020d & 2) != 0) {
                i2 += C23897n.m29266k(2, this.f71022f);
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
            int hashCode = C82986r.CTRL_INDEX + C24924g.f71015c.hashCode();
            if (mo51923a()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.f71021e;
            }
            if (mo51924b()) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.f71022f;
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24924g.f71016d;
            fVar.mo37875c(C24925a.class, C24927b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71023g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo51923a()) {
                this.f71023g = 0;
                return false;
            } else if (!mo51924b()) {
                this.f71023g = 0;
                return false;
            } else {
                this.f71023g = 1;
                return true;
            }
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71018h.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24925a();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71020d & 1) != 0) {
                nVar.mo37907N(1, this.f71021e);
            }
            if ((this.f71020d & 2) != 0) {
                nVar.mo37907N(2, this.f71022f);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168564getDefaultInstanceForType() {
            return f71018h;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168565newBuilderForType() {
            return f71018h.toBuilder();
        }

        public C24925a() {
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24927b(cVar);
        }
    }

    /* renamed from: l10.g$b */
    public static final class C24928b extends C23872m0 implements C23896m1 {

        /* renamed from: g */
        public static final C24928b f71027g = new C24928b();
        @Deprecated

        /* renamed from: h */
        public static final C24062w1<C24928b> f71028h = new C24929a();

        /* renamed from: d */
        public int f71029d;

        /* renamed from: e */
        public volatile Object f71030e;

        /* renamed from: f */
        public byte f71031f;

        /* renamed from: l10.g$b$a */
        public class C24929a extends C23813c<C24928b> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24928b bVar = new C24928b();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                C16994k m = lVar.mo37768m();
                                bVar.f71029d |= 1;
                                bVar.f71030e = m;
                            } else if (!bVar.parseUnknownField(lVar, b, a0Var, F)) {
                            }
                        }
                        z = true;
                    } catch (C23922p0 e) {
                        e.f68530d = bVar;
                        throw e;
                    } catch (IOException e2) {
                        C23922p0 p0Var = new C23922p0(e2);
                        p0Var.f68530d = bVar;
                        throw p0Var;
                    } catch (Throwable th) {
                        bVar.unknownFields = b.build();
                        bVar.makeExtensionsImmutable();
                        throw th;
                    }
                }
                bVar.unknownFields = b.build();
                bVar.makeExtensionsImmutable();
                return bVar;
            }
        }

        /* renamed from: l10.g$b$b */
        public static final class C24930b extends C23872m0.C23874b<C24930b> implements C23896m1 {

            /* renamed from: d */
            public int f71032d;

            /* renamed from: e */
            public Object f71033e = "";

            public C24930b() {
                C24928b bVar = C24928b.f71027g;
            }

            /* renamed from: a */
            public C24928b buildPartial() {
                C24928b bVar = new C24928b(this);
                int i = 0;
                if ((this.f71032d & 1) != 0) {
                    i = 1;
                }
                bVar.f71030e = this.f71033e;
                bVar.f71029d = i;
                onBuilt();
                return bVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168580addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24930b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24930b mo51935b() {
                super.clear();
                this.f71033e = "";
                this.f71032d &= -2;
                return this;
            }

            public C23836g1 build() {
                C24928b a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24930b clone() {
                return (C24930b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168582clearField(C24025t.C24035g gVar) {
                return (C24930b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24930b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24924g.C24928b.C24930b mo51937d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.g$b> r0 = l10.C24924g.C24928b.f71028h     // Catch:{ p0 -> 0x0010 }
                    l10.g$b$a r0 = (l10.C24924g.C24928b.C24929a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.g$b r2 = (l10.C24924g.C24928b) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51938e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.g$b r3 = (l10.C24924g.C24928b) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51938e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24924g.C24928b.C24930b.mo51937d(com.google.protobuf.l, com.google.protobuf.a0):l10.g$b$b");
            }

            /* renamed from: e */
            public C24930b mo51938e(C24928b bVar) {
                if (bVar == C24928b.f71027g) {
                    return this;
                }
                if (bVar.hasData()) {
                    this.f71032d |= 1;
                    this.f71033e = bVar.f71030e;
                    onChanged();
                }
                C24930b bVar2 = (C24930b) super.mergeUnknownFields(bVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24928b.f71027g;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24924g.f71013a;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24924g.f71014b;
                fVar.mo37875c(C24928b.class, C24930b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return (this.f71032d & 1) != 0;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24930b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168589setField(C24025t.C24035g gVar, Object obj) {
                return (C24930b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168590setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24930b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168591setUnknownFields(C24020s2 s2Var) {
                return (C24930b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24930b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24930b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168584clearOneof(C24025t.C24042k kVar) {
                return (C24930b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168585getDefaultInstanceForType() {
                return C24928b.f71027g;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168588mergeUnknownFields(C24020s2 s2Var) {
                return (C24930b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24930b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24930b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24930b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168583clearOneof(C24025t.C24042k kVar) {
                return (C24930b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168587mergeUnknownFields(C24020s2 s2Var) {
                return (C24930b) super.mergeUnknownFields(s2Var);
            }

            public C24930b(C23872m0.C23876c cVar) {
                super(cVar);
                C24928b bVar = C24928b.f71027g;
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168581build() {
                C24928b a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24928b) {
                    mo51938e((C24928b) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168586mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24928b) {
                    mo51938e((C24928b) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24928b(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f71031f = -1;
        }

        /* renamed from: a */
        public C24930b toBuilder() {
            if (this == f71027g) {
                return new C24930b();
            }
            C24930b bVar = new C24930b();
            bVar.mo51938e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24928b)) {
                return super.equals(obj);
            }
            C24928b bVar = (C24928b) obj;
            if (hasData() != bVar.hasData()) {
                return false;
            }
            return (!hasData() || getData().equals(bVar.getData())) && this.unknownFields.equals(bVar.unknownFields);
        }

        public String getData() {
            Object obj = this.f71030e;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f71030e = u;
            }
            return u;
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71027g;
        }

        public C24062w1<C24928b> getParserForType() {
            return f71028h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71029d & 1) != 0) {
                i2 = 0 + C23872m0.computeStringSize(1, this.f71030e);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasData() {
            return (this.f71029d & 1) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + C24924g.f71013a.hashCode();
            if (hasData()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getData().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24924g.f71014b;
            fVar.mo37875c(C24928b.class, C24930b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71031f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasData()) {
                this.f71031f = 0;
                return false;
            }
            this.f71031f = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71027g.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24928b();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71029d & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.f71030e);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168578getDefaultInstanceForType() {
            return f71027g;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168579newBuilderForType() {
            return f71027g.toBuilder();
        }

        public C24928b() {
            this.f71031f = -1;
            this.f71030e = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24930b(cVar);
        }
    }

    static {
        C24025t.C24038h i = C24025t.C24038h.m29872i(new String[]{"\n\u0017magic_scl_biz_api.proto\u0012#com.tencent.mm.flutter.plugin.proto\"5\n\u000fInsertPopupView\u0012\u0010\n\bnickname\u0018\u0001 \u0002(\t\u0012\u0010\n\busername\u0018\u0002 \u0002(\t\"\u001f\n\u000fMBApiStringData\u0012\f\n\u0004data\u0018\u0001 \u0002(\t\":\n\u000fMBApiScrollData\u0012\u0014\n\foffsetHeight\u0018\u0001 \u0002(\u0005\u0012\u0011\n\toffsetTop\u0018\u0002 \u0002(\u0005"}, new C24025t.C24038h[0]);
        f71017e = i;
        C24025t.C24027b bVar = i.mo38347g().get(0);
        C23872m0.C23880f.C23881a[] aVarArr = new C23872m0.C23880f.C23881a[bVar.mo38319h().size()];
        C23872m0.C23880f.C23883c[] cVarArr = new C23872m0.C23880f.C23883c[bVar.mo38321j().size()];
        C24025t.C24027b bVar2 = f71017e.mo38347g().get(1);
        f71013a = bVar2;
        f71014b = new C23872m0.C23880f(bVar2, new String[]{"Data"});
        C24025t.C24027b bVar3 = f71017e.mo38347g().get(2);
        f71015c = bVar3;
        f71016d = new C23872m0.C23880f(bVar3, new String[]{"OffsetHeight", "OffsetTop"});
    }
}
