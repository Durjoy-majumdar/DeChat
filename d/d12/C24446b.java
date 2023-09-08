package d12;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23821e2;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23844i2;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: d12.b */
public final class C24446b {

    /* renamed from: a */
    public static final C24025t.C24027b f69897a;

    /* renamed from: b */
    public static final C23872m0.C23880f f69898b;

    /* renamed from: c */
    public static final C24025t.C24027b f69899c;

    /* renamed from: d */
    public static final C23872m0.C23880f f69900d;

    /* renamed from: e */
    public static final C24025t.C24027b f69901e;

    /* renamed from: f */
    public static final C23872m0.C23880f f69902f;

    /* renamed from: g */
    public static final C24025t.C24027b f69903g;

    /* renamed from: h */
    public static final C23872m0.C23880f f69904h;

    /* renamed from: i */
    public static final C24025t.C24027b f69905i;

    /* renamed from: j */
    public static final C23872m0.C23880f f69906j;

    /* renamed from: k */
    public static final C24025t.C24027b f69907k;

    /* renamed from: l */
    public static final C23872m0.C23880f f69908l;

    /* renamed from: m */
    public static C24025t.C24038h f69909m;

    /* renamed from: d12.b$a */
    public static final class C24447a extends C23872m0 implements C23896m1 {

        /* renamed from: j */
        public static final C24447a f69910j = new C24447a();
        @Deprecated

        /* renamed from: n */
        public static final C24062w1<C24447a> f69911n = new C24448a();

        /* renamed from: d */
        public int f69912d;

        /* renamed from: e */
        public volatile Object f69913e;

        /* renamed from: f */
        public volatile Object f69914f;

        /* renamed from: g */
        public List<C24450b> f69915g;

        /* renamed from: h */
        public List<C24453c> f69916h;

        /* renamed from: i */
        public byte f69917i;

        /* renamed from: d12.b$a$a */
        public class C24448a extends C23813c<C24447a> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24447a aVar = new C24447a();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                C16994k m = lVar.mo37768m();
                                aVar.f69912d |= 1;
                                aVar.f69913e = m;
                            } else if (F == 18) {
                                C16994k m2 = lVar.mo37768m();
                                aVar.f69912d |= 2;
                                aVar.f69914f = m2;
                            } else if (F == 26) {
                                if (!z2 || !true) {
                                    aVar.f69915g = new ArrayList();
                                    z2 |= true;
                                }
                                aVar.f69915g.add((C24450b) lVar.mo37777v(C24450b.f69926i, a0Var));
                            } else if (F == 34) {
                                if (!z2 || !true) {
                                    aVar.f69916h = new ArrayList();
                                    z2 |= true;
                                }
                                aVar.f69916h.add((C24453c) lVar.mo37777v(C24453c.f69935i, a0Var));
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
                        if (z2 && true) {
                            aVar.f69915g = Collections.unmodifiableList(aVar.f69915g);
                        }
                        if (z2 && true) {
                            aVar.f69916h = Collections.unmodifiableList(aVar.f69916h);
                        }
                        aVar.unknownFields = b.build();
                        aVar.makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    aVar.f69915g = Collections.unmodifiableList(aVar.f69915g);
                }
                if (z2 && true) {
                    aVar.f69916h = Collections.unmodifiableList(aVar.f69916h);
                }
                aVar.unknownFields = b.build();
                aVar.makeExtensionsImmutable();
                return aVar;
            }
        }

        /* renamed from: d12.b$a$b */
        public static final class C24449b extends C23872m0.C23874b<C24449b> implements C23896m1 {

            /* renamed from: d */
            public int f69918d;

            /* renamed from: e */
            public Object f69919e = "";

            /* renamed from: f */
            public Object f69920f = "";

            /* renamed from: g */
            public List<C24450b> f69921g = Collections.emptyList();

            /* renamed from: h */
            public C23821e2<C24450b, C24450b.C24452b, Object> f69922h;

            /* renamed from: i */
            public List<C24453c> f69923i = Collections.emptyList();

            /* renamed from: j */
            public C23821e2<C24453c, C24453c.C24455b, Object> f69924j;

            public C24449b() {
                C24447a aVar = C24447a.f69910j;
                if (C23872m0.alwaysUseFieldBuilders) {
                    mo51116e();
                    mo51117f();
                }
            }

            /* renamed from: a */
            public C24453c.C24455b mo51112a() {
                return mo51117f().mo37580d(C24453c.f69934h);
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168483addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24449b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24447a buildPartial() {
                C24447a aVar = new C24447a(this);
                int i = this.f69918d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    i2 = 1;
                }
                aVar.f69913e = this.f69919e;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                aVar.f69914f = this.f69920f;
                C23821e2<C24450b, C24450b.C24452b, Object> e2Var = this.f69922h;
                if (e2Var == null) {
                    if ((this.f69918d & 4) != 0) {
                        this.f69921g = Collections.unmodifiableList(this.f69921g);
                        this.f69918d &= -5;
                    }
                    aVar.f69915g = this.f69921g;
                } else {
                    aVar.f69915g = e2Var.mo37583g();
                }
                C23821e2<C24453c, C24453c.C24455b, Object> e2Var2 = this.f69924j;
                if (e2Var2 == null) {
                    if ((this.f69918d & 8) != 0) {
                        this.f69923i = Collections.unmodifiableList(this.f69923i);
                        this.f69918d &= -9;
                    }
                    aVar.f69916h = this.f69923i;
                } else {
                    aVar.f69916h = e2Var2.mo37583g();
                }
                aVar.f69912d = i2;
                onBuilt();
                return aVar;
            }

            public C23836g1 build() {
                C24447a b = buildPartial();
                if (b.isInitialized()) {
                    return b;
                }
                throw C23803a.C23804a.newUninitializedMessageException(b);
            }

            /* renamed from: c */
            public C24449b mo51114c() {
                super.clear();
                this.f69919e = "";
                this.f69920f = "";
                this.f69918d = this.f69918d & -2 & -3;
                C23821e2<C24450b, C24450b.C24452b, Object> e2Var = this.f69922h;
                if (e2Var == null) {
                    this.f69921g = Collections.emptyList();
                    this.f69918d &= -5;
                } else {
                    e2Var.mo37584h();
                }
                C23821e2<C24453c, C24453c.C24455b, Object> e2Var2 = this.f69924j;
                if (e2Var2 == null) {
                    this.f69923i = Collections.emptyList();
                    this.f69918d &= -9;
                } else {
                    e2Var2.mo37584h();
                }
                return this;
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168485clearField(C24025t.C24035g gVar) {
                return (C24449b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24449b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public C24449b clone() {
                return (C24449b) super.clone();
            }

            /* renamed from: e */
            public final C23821e2<C24450b, C24450b.C24452b, Object> mo51116e() {
                if (this.f69922h == null) {
                    this.f69922h = new C23821e2<>(this.f69921g, (this.f69918d & 4) != 0, getParentForChildren(), isClean());
                    this.f69921g = null;
                }
                return this.f69922h;
            }

            /* renamed from: f */
            public final C23821e2<C24453c, C24453c.C24455b, Object> mo51117f() {
                if (this.f69924j == null) {
                    this.f69924j = new C23821e2<>(this.f69923i, (this.f69918d & 8) != 0, getParentForChildren(), isClean());
                    this.f69923i = null;
                }
                return this.f69924j;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: g */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d12.C24446b.C24447a.C24449b mo51118g(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<d12.b$a> r0 = d12.C24446b.C24447a.f69911n     // Catch:{ p0 -> 0x0010 }
                    d12.b$a$a r0 = (d12.C24446b.C24447a.C24448a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    d12.b$a r2 = (d12.C24446b.C24447a) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51119h(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    d12.b$a r3 = (d12.C24446b.C24447a) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51119h(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: d12.C24446b.C24447a.C24449b.mo51118g(com.google.protobuf.l, com.google.protobuf.a0):d12.b$a$b");
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24447a.f69910j;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24446b.f69903g;
            }

            /* renamed from: h */
            public C24449b mo51119h(C24447a aVar) {
                if (aVar == C24447a.f69910j) {
                    return this;
                }
                boolean z = true;
                if ((aVar.f69912d & 1) != 0) {
                    this.f69918d |= 1;
                    this.f69919e = aVar.f69913e;
                    onChanged();
                }
                if ((aVar.f69912d & 2) == 0) {
                    z = false;
                }
                if (z) {
                    this.f69918d |= 2;
                    this.f69920f = aVar.f69914f;
                    onChanged();
                }
                C23821e2<C24453c, C24453c.C24455b, Object> e2Var = null;
                if (this.f69922h == null) {
                    if (!aVar.f69915g.isEmpty()) {
                        if (this.f69921g.isEmpty()) {
                            this.f69921g = aVar.f69915g;
                            this.f69918d &= -5;
                        } else {
                            if ((this.f69918d & 4) == 0) {
                                this.f69921g = new ArrayList(this.f69921g);
                                this.f69918d |= 4;
                            }
                            this.f69921g.addAll(aVar.f69915g);
                        }
                        onChanged();
                    }
                } else if (!aVar.f69915g.isEmpty()) {
                    if (this.f69922h.mo37595s()) {
                        this.f69922h.f68224a = null;
                        this.f69922h = null;
                        this.f69921g = aVar.f69915g;
                        this.f69918d &= -5;
                        this.f69922h = C23872m0.alwaysUseFieldBuilders ? mo51116e() : null;
                    } else {
                        this.f69922h.mo37578b(aVar.f69915g);
                    }
                }
                if (this.f69924j == null) {
                    if (!aVar.f69916h.isEmpty()) {
                        if (this.f69923i.isEmpty()) {
                            this.f69923i = aVar.f69916h;
                            this.f69918d &= -9;
                        } else {
                            if ((this.f69918d & 8) == 0) {
                                this.f69923i = new ArrayList(this.f69923i);
                                this.f69918d |= 8;
                            }
                            this.f69923i.addAll(aVar.f69916h);
                        }
                        onChanged();
                    }
                } else if (!aVar.f69916h.isEmpty()) {
                    if (this.f69924j.mo37595s()) {
                        this.f69924j.f68224a = null;
                        this.f69924j = null;
                        this.f69923i = aVar.f69916h;
                        this.f69918d &= -9;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = mo51117f();
                        }
                        this.f69924j = e2Var;
                    } else {
                        this.f69924j.mo37578b(aVar.f69916h);
                    }
                }
                C24449b bVar = (C24449b) super.mergeUnknownFields(aVar.unknownFields);
                onChanged();
                return this;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24446b.f69904h;
                fVar.mo37875c(C24447a.class, C24449b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24449b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168492setField(C24025t.C24035g gVar, Object obj) {
                return (C24449b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168493setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24449b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168494setUnknownFields(C24020s2 s2Var) {
                return (C24449b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24449b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24449b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168487clearOneof(C24025t.C24042k kVar) {
                return (C24449b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168488getDefaultInstanceForType() {
                return C24447a.f69910j;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168491mergeUnknownFields(C24020s2 s2Var) {
                return (C24449b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24449b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24449b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24449b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168486clearOneof(C24025t.C24042k kVar) {
                return (C24449b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168490mergeUnknownFields(C24020s2 s2Var) {
                return (C24449b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168484build() {
                C24447a b = buildPartial();
                if (b.isInitialized()) {
                    return b;
                }
                throw C23803a.C23804a.newUninitializedMessageException(b);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24447a) {
                    mo51119h((C24447a) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168489mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24447a) {
                    mo51119h((C24447a) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            public C24449b(C23872m0.C23876c cVar) {
                super(cVar);
                C24447a aVar = C24447a.f69910j;
                if (C23872m0.alwaysUseFieldBuilders) {
                    mo51116e();
                    mo51117f();
                }
            }
        }

        public C24447a(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f69917i = -1;
        }

        /* renamed from: a */
        public String mo51109a() {
            Object obj = this.f69913e;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69913e = u;
            }
            return u;
        }

        /* renamed from: b */
        public String mo51110b() {
            Object obj = this.f69914f;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69914f = u;
            }
            return u;
        }

        /* renamed from: c */
        public C24449b toBuilder() {
            if (this == f69910j) {
                return new C24449b();
            }
            C24449b bVar = new C24449b();
            bVar.mo51119h(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24447a)) {
                return super.equals(obj);
            }
            C24447a aVar = (C24447a) obj;
            int i = this.f69912d;
            if (((i & 1) != 0) != ((aVar.f69912d & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !mo51109a().equals(aVar.mo51109a())) {
                return false;
            }
            int i2 = this.f69912d;
            if (((i2 & 2) != 0) != ((aVar.f69912d & 2) != 0)) {
                return false;
            }
            return (!((i2 & 2) != 0) || mo51110b().equals(aVar.mo51110b())) && this.f69915g.equals(aVar.f69915g) && this.f69916h.equals(aVar.f69916h) && this.unknownFields.equals(aVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f69910j;
        }

        public C24062w1<C24447a> getParserForType() {
            return f69911n;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.f69912d & 1) != 0 ? C23872m0.computeStringSize(1, this.f69913e) + 0 : 0;
            if ((this.f69912d & 2) != 0) {
                computeStringSize += C23872m0.computeStringSize(2, this.f69914f);
            }
            for (int i2 = 0; i2 < this.f69915g.size(); i2++) {
                computeStringSize += C23897n.m29270o(3, this.f69915g.get(i2));
            }
            for (int i3 = 0; i3 < this.f69916h.size(); i3++) {
                computeStringSize += C23897n.m29270o(4, this.f69916h.get(i3));
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
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
            int hashCode = C24446b.f69903g.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if ((this.f69912d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + mo51109a().hashCode();
            }
            if ((this.f69912d & 2) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 2) * 53) + mo51110b().hashCode();
            }
            if (this.f69915g.size() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.f69915g.hashCode();
            }
            if (this.f69916h.size() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + this.f69916h.hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24446b.f69904h;
            fVar.mo37875c(C24447a.class, C24449b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f69917i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f69917i = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f69910j.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24447a();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f69912d & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.f69913e);
            }
            if ((this.f69912d & 2) != 0) {
                C23872m0.writeString(nVar, 2, this.f69914f);
            }
            for (int i = 0; i < this.f69915g.size(); i++) {
                nVar.mo37909P(3, this.f69915g.get(i));
            }
            for (int i2 = 0; i2 < this.f69916h.size(); i2++) {
                nVar.mo37909P(4, this.f69916h.get(i2));
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168481getDefaultInstanceForType() {
            return f69910j;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168482newBuilderForType() {
            return f69910j.toBuilder();
        }

        public C24447a() {
            this.f69917i = -1;
            this.f69913e = "";
            this.f69914f = "";
            this.f69915g = Collections.emptyList();
            this.f69916h = Collections.emptyList();
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24449b(cVar);
        }
    }

    /* renamed from: d12.b$b */
    public static final class C24450b extends C23872m0 implements C23896m1 {

        /* renamed from: h */
        public static final C24450b f69925h = new C24450b();
        @Deprecated

        /* renamed from: i */
        public static final C24062w1<C24450b> f69926i = new C24451a();

        /* renamed from: d */
        public int f69927d;

        /* renamed from: e */
        public volatile Object f69928e;

        /* renamed from: f */
        public int f69929f;

        /* renamed from: g */
        public byte f69930g;

        /* renamed from: d12.b$b$a */
        public class C24451a extends C23813c<C24450b> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24450b bVar = new C24450b();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                C16994k m = lVar.mo37768m();
                                bVar.f69927d |= 1;
                                bVar.f69928e = m;
                            } else if (F == 16) {
                                bVar.f69927d |= 2;
                                bVar.f69929f = lVar.mo37758G();
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

        /* renamed from: d12.b$b$b */
        public static final class C24452b extends C23872m0.C23874b<C24452b> implements C23896m1 {

            /* renamed from: d */
            public int f69931d;

            /* renamed from: e */
            public Object f69932e = "";

            /* renamed from: f */
            public int f69933f;

            public C24452b() {
                C24450b bVar = C24450b.f69925h;
            }

            /* renamed from: a */
            public C24450b buildPartial() {
                C24450b bVar = new C24450b(this);
                int i = this.f69931d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    i2 = 1;
                }
                bVar.f69928e = this.f69932e;
                if ((i & 2) != 0) {
                    bVar.f69929f = this.f69933f;
                    i2 |= 2;
                }
                bVar.f69927d = i2;
                onBuilt();
                return bVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168497addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24452b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24452b mo51123b() {
                super.clear();
                this.f69932e = "";
                this.f69933f = 0;
                this.f69931d = this.f69931d & -2 & -3;
                return this;
            }

            public C23836g1 build() {
                C24450b a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24452b clone() {
                return (C24452b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168499clearField(C24025t.C24035g gVar) {
                return (C24452b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24452b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d12.C24446b.C24450b.C24452b mo51125d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<d12.b$b> r0 = d12.C24446b.C24450b.f69926i     // Catch:{ p0 -> 0x0010 }
                    d12.b$b$a r0 = (d12.C24446b.C24450b.C24451a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    d12.b$b r2 = (d12.C24446b.C24450b) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51126e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    d12.b$b r3 = (d12.C24446b.C24450b) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51126e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: d12.C24446b.C24450b.C24452b.mo51125d(com.google.protobuf.l, com.google.protobuf.a0):d12.b$b$b");
            }

            /* renamed from: e */
            public C24452b mo51126e(C24450b bVar) {
                if (bVar == C24450b.f69925h) {
                    return this;
                }
                boolean z = true;
                if ((bVar.f69927d & 1) != 0) {
                    this.f69931d |= 1;
                    this.f69932e = bVar.f69928e;
                    onChanged();
                }
                if ((bVar.f69927d & 2) == 0) {
                    z = false;
                }
                if (z) {
                    int i = bVar.f69929f;
                    this.f69931d |= 2;
                    this.f69933f = i;
                    onChanged();
                }
                C24452b bVar2 = (C24452b) super.mergeUnknownFields(bVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24450b.f69925h;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24446b.f69897a;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24446b.f69898b;
                fVar.mo37875c(C24450b.class, C24452b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24452b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168506setField(C24025t.C24035g gVar, Object obj) {
                return (C24452b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168507setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24452b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168508setUnknownFields(C24020s2 s2Var) {
                return (C24452b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24452b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24452b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168501clearOneof(C24025t.C24042k kVar) {
                return (C24452b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168502getDefaultInstanceForType() {
                return C24450b.f69925h;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168505mergeUnknownFields(C24020s2 s2Var) {
                return (C24452b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24452b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24452b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24452b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168500clearOneof(C24025t.C24042k kVar) {
                return (C24452b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168504mergeUnknownFields(C24020s2 s2Var) {
                return (C24452b) super.mergeUnknownFields(s2Var);
            }

            public C24452b(C23872m0.C23876c cVar) {
                super(cVar);
                C24450b bVar = C24450b.f69925h;
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168498build() {
                C24450b a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24450b) {
                    mo51126e((C24450b) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168503mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24450b) {
                    mo51126e((C24450b) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24450b(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f69930g = -1;
        }

        /* renamed from: a */
        public String mo51120a() {
            Object obj = this.f69928e;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69928e = u;
            }
            return u;
        }

        /* renamed from: b */
        public C24452b toBuilder() {
            if (this == f69925h) {
                return new C24452b();
            }
            C24452b bVar = new C24452b();
            bVar.mo51126e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24450b)) {
                return super.equals(obj);
            }
            C24450b bVar = (C24450b) obj;
            int i = this.f69927d;
            if (((i & 1) != 0) != ((bVar.f69927d & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !mo51120a().equals(bVar.mo51120a())) {
                return false;
            }
            int i2 = this.f69927d;
            if (((i2 & 2) != 0) != ((bVar.f69927d & 2) != 0)) {
                return false;
            }
            return (!((i2 & 2) != 0) || this.f69929f == bVar.f69929f) && this.unknownFields.equals(bVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f69925h;
        }

        public C24062w1<C24450b> getParserForType() {
            return f69926i;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f69927d & 1) != 0) {
                i2 = 0 + C23872m0.computeStringSize(1, this.f69928e);
            }
            if ((this.f69927d & 2) != 0) {
                i2 += C23897n.m29278w(2, this.f69929f);
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
            int hashCode = C24446b.f69897a.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if ((this.f69927d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + mo51120a().hashCode();
            }
            if ((this.f69927d & 2) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.f69929f;
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24446b.f69898b;
            fVar.mo37875c(C24450b.class, C24452b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f69930g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f69930g = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f69925h.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24450b();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f69927d & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.f69928e);
            }
            if ((this.f69927d & 2) != 0) {
                nVar.mo37917X(2, this.f69929f);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168495getDefaultInstanceForType() {
            return f69925h;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168496newBuilderForType() {
            return f69925h.toBuilder();
        }

        public C24450b() {
            this.f69930g = -1;
            this.f69928e = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24452b(cVar);
        }
    }

    /* renamed from: d12.b$c */
    public static final class C24453c extends C23872m0 implements C23896m1 {

        /* renamed from: h */
        public static final C24453c f69934h = new C24453c();
        @Deprecated

        /* renamed from: i */
        public static final C24062w1<C24453c> f69935i = new C24454a();

        /* renamed from: d */
        public int f69936d;

        /* renamed from: e */
        public volatile Object f69937e;

        /* renamed from: f */
        public C24462f f69938f;

        /* renamed from: g */
        public byte f69939g;

        /* renamed from: d12.b$c$a */
        public class C24454a extends C23813c<C24453c> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24453c cVar = new C24453c();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                C16994k m = lVar.mo37768m();
                                cVar.f69936d |= 1;
                                cVar.f69937e = m;
                            } else if (F == 18) {
                                C24462f.C24464b bVar = null;
                                if ((cVar.f69936d & 2) != 0) {
                                    bVar = cVar.f69938f.toBuilder();
                                }
                                C24462f fVar = (C24462f) lVar.mo37777v(C24462f.f69971n, a0Var);
                                cVar.f69938f = fVar;
                                if (bVar != null) {
                                    bVar.mo51163f(fVar);
                                    cVar.f69938f = bVar.buildPartial();
                                }
                                cVar.f69936d |= 2;
                            } else if (!cVar.parseUnknownField(lVar, b, a0Var, F)) {
                            }
                        }
                        z = true;
                    } catch (C23922p0 e) {
                        e.f68530d = cVar;
                        throw e;
                    } catch (IOException e2) {
                        C23922p0 p0Var = new C23922p0(e2);
                        p0Var.f68530d = cVar;
                        throw p0Var;
                    } catch (Throwable th) {
                        cVar.unknownFields = b.build();
                        cVar.makeExtensionsImmutable();
                        throw th;
                    }
                }
                cVar.unknownFields = b.build();
                cVar.makeExtensionsImmutable();
                return cVar;
            }
        }

        /* renamed from: d12.b$c$b */
        public static final class C24455b extends C23872m0.C23874b<C24455b> implements C23896m1 {

            /* renamed from: d */
            public int f69940d;

            /* renamed from: e */
            public Object f69941e = "";

            /* renamed from: f */
            public C24462f f69942f;

            /* renamed from: g */
            public C23844i2<C24462f, C24462f.C24464b, Object> f69943g;

            public C24455b() {
                C24453c cVar = C24453c.f69934h;
                if (C23872m0.alwaysUseFieldBuilders) {
                    mo51134e();
                }
            }

            /* renamed from: a */
            public C24453c buildPartial() {
                C24453c cVar = new C24453c(this);
                int i = this.f69940d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    i2 = 1;
                }
                cVar.f69937e = this.f69941e;
                if ((i & 2) != 0) {
                    C23844i2<C24462f, C24462f.C24464b, Object> i2Var = this.f69943g;
                    if (i2Var == null) {
                        cVar.f69938f = this.f69942f;
                    } else {
                        cVar.f69938f = i2Var.mo37703b();
                    }
                    i2 |= 2;
                }
                cVar.f69936d = i2;
                onBuilt();
                return cVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168511addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24455b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24455b mo51131b() {
                super.clear();
                this.f69941e = "";
                this.f69940d &= -2;
                C23844i2<C24462f, C24462f.C24464b, Object> i2Var = this.f69943g;
                if (i2Var == null) {
                    this.f69942f = null;
                } else {
                    i2Var.mo37704c();
                }
                this.f69940d &= -3;
                return this;
            }

            public C23836g1 build() {
                C24453c a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24455b clone() {
                return (C24455b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168513clearField(C24025t.C24035g gVar) {
                return (C24455b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24455b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public C24462f.C24464b mo51133d() {
                this.f69940d |= 2;
                onChanged();
                return mo51134e().mo37705d();
            }

            /* renamed from: e */
            public final C23844i2<C24462f, C24462f.C24464b, Object> mo51134e() {
                C24462f fVar;
                C23844i2<C24462f, C24462f.C24464b, Object> i2Var = this.f69943g;
                if (i2Var == null) {
                    if (i2Var == null) {
                        fVar = this.f69942f;
                        if (fVar == null) {
                            fVar = C24462f.f69970j;
                        }
                    } else {
                        fVar = i2Var.mo37706e();
                    }
                    this.f69943g = new C23844i2<>(fVar, getParentForChildren(), isClean());
                    this.f69942f = null;
                }
                return this.f69943g;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d12.C24446b.C24453c.C24455b mo51135f(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<d12.b$c> r0 = d12.C24446b.C24453c.f69935i     // Catch:{ p0 -> 0x0010 }
                    d12.b$c$a r0 = (d12.C24446b.C24453c.C24454a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    d12.b$c r2 = (d12.C24446b.C24453c) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51136g(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    d12.b$c r3 = (d12.C24446b.C24453c) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51136g(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: d12.C24446b.C24453c.C24455b.mo51135f(com.google.protobuf.l, com.google.protobuf.a0):d12.b$c$b");
            }

            /* renamed from: g */
            public C24455b mo51136g(C24453c cVar) {
                C24462f fVar;
                C24462f fVar2;
                if (cVar == C24453c.f69934h) {
                    return this;
                }
                boolean z = true;
                if ((cVar.f69936d & 1) != 0) {
                    this.f69940d |= 1;
                    this.f69941e = cVar.f69937e;
                    onChanged();
                }
                if ((cVar.f69936d & 2) == 0) {
                    z = false;
                }
                if (z) {
                    C24462f b = cVar.mo51128b();
                    C23844i2<C24462f, C24462f.C24464b, Object> i2Var = this.f69943g;
                    if (i2Var == null) {
                        if ((this.f69940d & 2) == 0 || (fVar = this.f69942f) == null || fVar == (fVar2 = C24462f.f69970j)) {
                            this.f69942f = b;
                        } else {
                            C24462f.C24464b b2 = fVar2.toBuilder();
                            b2.mo51163f(fVar);
                            b2.mo51163f(b);
                            this.f69942f = b2.buildPartial();
                        }
                        onChanged();
                    } else {
                        i2Var.mo37708g(b);
                    }
                    this.f69940d |= 2;
                }
                C24455b bVar = (C24455b) super.mergeUnknownFields(cVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24453c.f69934h;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24446b.f69901e;
            }

            /* renamed from: h */
            public C24455b mo51137h(String str) {
                str.getClass();
                this.f69940d |= 1;
                this.f69941e = str;
                onChanged();
                return this;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24446b.f69902f;
                fVar.mo37875c(C24453c.class, C24455b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: j */
            public C24455b mo51138j(C24462f.C24464b bVar) {
                C23844i2<C24462f, C24462f.C24464b, Object> i2Var = this.f69943g;
                if (i2Var == null) {
                    this.f69942f = bVar.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(bVar.build());
                }
                this.f69940d |= 2;
                return this;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24455b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168520setField(C24025t.C24035g gVar, Object obj) {
                return (C24455b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168521setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24455b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168522setUnknownFields(C24020s2 s2Var) {
                return (C24455b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24455b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24455b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168515clearOneof(C24025t.C24042k kVar) {
                return (C24455b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168516getDefaultInstanceForType() {
                return C24453c.f69934h;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168519mergeUnknownFields(C24020s2 s2Var) {
                return (C24455b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24455b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24455b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24455b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168514clearOneof(C24025t.C24042k kVar) {
                return (C24455b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168518mergeUnknownFields(C24020s2 s2Var) {
                return (C24455b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168512build() {
                C24453c a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24453c) {
                    mo51136g((C24453c) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            public C24455b(C23872m0.C23876c cVar) {
                super(cVar);
                C24453c cVar2 = C24453c.f69934h;
                if (C23872m0.alwaysUseFieldBuilders) {
                    mo51134e();
                }
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168517mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24453c) {
                    mo51136g((C24453c) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24453c(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f69939g = -1;
        }

        /* renamed from: a */
        public String mo51127a() {
            Object obj = this.f69937e;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69937e = u;
            }
            return u;
        }

        /* renamed from: b */
        public C24462f mo51128b() {
            C24462f fVar = this.f69938f;
            return fVar == null ? C24462f.f69970j : fVar;
        }

        /* renamed from: c */
        public C24455b toBuilder() {
            if (this == f69934h) {
                return new C24455b();
            }
            C24455b bVar = new C24455b();
            bVar.mo51136g(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24453c)) {
                return super.equals(obj);
            }
            C24453c cVar = (C24453c) obj;
            int i = this.f69936d;
            if (((i & 1) != 0) != ((cVar.f69936d & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !mo51127a().equals(cVar.mo51127a())) {
                return false;
            }
            int i2 = this.f69936d;
            if (((i2 & 2) != 0) != ((cVar.f69936d & 2) != 0)) {
                return false;
            }
            return (!((i2 & 2) != 0) || mo51128b().equals(cVar.mo51128b())) && this.unknownFields.equals(cVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f69934h;
        }

        public C24062w1<C24453c> getParserForType() {
            return f69935i;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f69936d & 1) != 0) {
                i2 = 0 + C23872m0.computeStringSize(1, this.f69937e);
            }
            if ((this.f69936d & 2) != 0) {
                i2 += C23897n.m29270o(2, mo51128b());
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
            int hashCode = C24446b.f69901e.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if ((this.f69936d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + mo51127a().hashCode();
            }
            if ((this.f69936d & 2) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 2) * 53) + mo51128b().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24446b.f69902f;
            fVar.mo37875c(C24453c.class, C24455b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f69939g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f69939g = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f69934h.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24453c();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f69936d & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.f69937e);
            }
            if ((this.f69936d & 2) != 0) {
                nVar.mo37909P(2, mo51128b());
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168509getDefaultInstanceForType() {
            return f69934h;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168510newBuilderForType() {
            return f69934h.toBuilder();
        }

        public C24453c() {
            this.f69939g = -1;
            this.f69937e = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24455b(cVar);
        }
    }

    /* renamed from: d12.b$d */
    public static final class C24456d extends C23872m0 implements C23896m1 {

        /* renamed from: p */
        public static final C24456d f69944p = new C24456d();
        @Deprecated

        /* renamed from: q */
        public static final C24062w1<C24456d> f69945q = new C24457a();

        /* renamed from: d */
        public int f69946d;

        /* renamed from: e */
        public volatile Object f69947e;

        /* renamed from: f */
        public volatile Object f69948f;

        /* renamed from: g */
        public int f69949g;

        /* renamed from: h */
        public int f69950h;

        /* renamed from: i */
        public volatile Object f69951i;

        /* renamed from: j */
        public volatile Object f69952j;

        /* renamed from: n */
        public int f69953n;

        /* renamed from: o */
        public byte f69954o;

        /* renamed from: d12.b$d$a */
        public class C24457a extends C23813c<C24456d> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24456d dVar = new C24456d();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                C16994k m = lVar.mo37768m();
                                dVar.f69946d |= 1;
                                dVar.f69947e = m;
                            } else if (F == 18) {
                                C16994k m2 = lVar.mo37768m();
                                dVar.f69946d |= 2;
                                dVar.f69948f = m2;
                            } else if (F == 24) {
                                dVar.f69946d |= 4;
                                dVar.f69949g = lVar.mo37758G();
                            } else if (F == 32) {
                                dVar.f69946d |= 8;
                                dVar.f69950h = lVar.mo37758G();
                            } else if (F == 42) {
                                C16994k m3 = lVar.mo37768m();
                                dVar.f69946d |= 16;
                                dVar.f69951i = m3;
                            } else if (F == 50) {
                                C16994k m4 = lVar.mo37768m();
                                dVar.f69946d = 32 | dVar.f69946d;
                                dVar.f69952j = m4;
                            } else if (F == 56) {
                                dVar.f69946d |= 64;
                                dVar.f69953n = lVar.mo37758G();
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

        /* renamed from: d12.b$d$b */
        public static final class C24458b extends C23872m0.C23874b<C24458b> implements C23896m1 {

            /* renamed from: d */
            public int f69955d;

            /* renamed from: e */
            public Object f69956e = "";

            /* renamed from: f */
            public Object f69957f = "";

            /* renamed from: g */
            public int f69958g;

            /* renamed from: h */
            public int f69959h;

            /* renamed from: i */
            public Object f69960i = "";

            /* renamed from: j */
            public Object f69961j = "";

            /* renamed from: n */
            public int f69962n;

            public C24458b() {
                C24456d dVar = C24456d.f69944p;
            }

            /* renamed from: a */
            public C24456d buildPartial() {
                C24456d dVar = new C24456d(this);
                int i = this.f69955d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    i2 = 1;
                }
                dVar.f69947e = this.f69956e;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                dVar.f69948f = this.f69957f;
                if ((i & 4) != 0) {
                    dVar.f69949g = this.f69958g;
                    i2 |= 4;
                }
                if ((i & 8) != 0) {
                    dVar.f69950h = this.f69959h;
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    i2 |= 16;
                }
                dVar.f69951i = this.f69960i;
                if ((i & 32) != 0) {
                    i2 |= 32;
                }
                dVar.f69952j = this.f69961j;
                if ((i & 64) != 0) {
                    dVar.f69953n = this.f69962n;
                    i2 |= 64;
                }
                dVar.f69946d = i2;
                onBuilt();
                return dVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168525addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24458b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24458b mo51145b() {
                super.clear();
                this.f69956e = "";
                this.f69957f = "";
                this.f69958g = 0;
                this.f69959h = 0;
                this.f69960i = "";
                this.f69961j = "";
                this.f69962n = 0;
                this.f69955d = this.f69955d & -2 & -3 & -5 & -9 & -17 & -33 & -65;
                return this;
            }

            public C23836g1 build() {
                C24456d a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24458b clone() {
                return (C24458b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168527clearField(C24025t.C24035g gVar) {
                return (C24458b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24458b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d12.C24446b.C24456d.C24458b mo51147d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<d12.b$d> r0 = d12.C24446b.C24456d.f69945q     // Catch:{ p0 -> 0x0010 }
                    d12.b$d$a r0 = (d12.C24446b.C24456d.C24457a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    d12.b$d r2 = (d12.C24446b.C24456d) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51148e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    d12.b$d r3 = (d12.C24446b.C24456d) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51148e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: d12.C24446b.C24456d.C24458b.mo51147d(com.google.protobuf.l, com.google.protobuf.a0):d12.b$d$b");
            }

            /* renamed from: e */
            public C24458b mo51148e(C24456d dVar) {
                if (dVar == C24456d.f69944p) {
                    return this;
                }
                boolean z = true;
                if ((dVar.f69946d & 1) != 0) {
                    this.f69955d |= 1;
                    this.f69956e = dVar.f69947e;
                    onChanged();
                }
                if ((dVar.f69946d & 2) != 0) {
                    this.f69955d |= 2;
                    this.f69957f = dVar.f69948f;
                    onChanged();
                }
                if ((dVar.f69946d & 4) != 0) {
                    int i = dVar.f69949g;
                    this.f69955d |= 4;
                    this.f69958g = i;
                    onChanged();
                }
                if ((dVar.f69946d & 8) != 0) {
                    int i2 = dVar.f69950h;
                    this.f69955d |= 8;
                    this.f69959h = i2;
                    onChanged();
                }
                if ((dVar.f69946d & 16) != 0) {
                    this.f69955d |= 16;
                    this.f69960i = dVar.f69951i;
                    onChanged();
                }
                if ((dVar.f69946d & 32) != 0) {
                    this.f69955d |= 32;
                    this.f69961j = dVar.f69952j;
                    onChanged();
                }
                if ((dVar.f69946d & 64) == 0) {
                    z = false;
                }
                if (z) {
                    int i3 = dVar.f69953n;
                    this.f69955d |= 64;
                    this.f69962n = i3;
                    onChanged();
                }
                C24458b bVar = (C24458b) super.mergeUnknownFields(dVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24456d.f69944p;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24446b.f69905i;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24446b.f69906j;
                fVar.mo37875c(C24456d.class, C24458b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24458b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168534setField(C24025t.C24035g gVar, Object obj) {
                return (C24458b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168535setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24458b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168536setUnknownFields(C24020s2 s2Var) {
                return (C24458b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24458b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24458b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168529clearOneof(C24025t.C24042k kVar) {
                return (C24458b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168530getDefaultInstanceForType() {
                return C24456d.f69944p;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168533mergeUnknownFields(C24020s2 s2Var) {
                return (C24458b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24458b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24458b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24458b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168528clearOneof(C24025t.C24042k kVar) {
                return (C24458b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168532mergeUnknownFields(C24020s2 s2Var) {
                return (C24458b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168526build() {
                C24456d a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24456d) {
                    mo51148e((C24456d) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            public C24458b(C23872m0.C23876c cVar) {
                super(cVar);
                C24456d dVar = C24456d.f69944p;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168531mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24456d) {
                    mo51148e((C24456d) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24456d(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f69954o = -1;
        }

        /* renamed from: a */
        public String mo51139a() {
            Object obj = this.f69947e;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69947e = u;
            }
            return u;
        }

        /* renamed from: b */
        public String mo51140b() {
            Object obj = this.f69948f;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69948f = u;
            }
            return u;
        }

        /* renamed from: c */
        public C24458b toBuilder() {
            if (this == f69944p) {
                return new C24458b();
            }
            C24458b bVar = new C24458b();
            bVar.mo51148e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24456d)) {
                return super.equals(obj);
            }
            C24456d dVar = (C24456d) obj;
            int i = this.f69946d;
            if (((i & 1) != 0) != ((dVar.f69946d & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !mo51139a().equals(dVar.mo51139a())) {
                return false;
            }
            int i2 = this.f69946d;
            if (((i2 & 2) != 0) != ((dVar.f69946d & 2) != 0)) {
                return false;
            }
            if (((i2 & 2) != 0) && !mo51140b().equals(dVar.mo51140b())) {
                return false;
            }
            int i3 = this.f69946d;
            boolean z = (i3 & 4) != 0;
            int i4 = dVar.f69946d;
            if (z != ((i4 & 4) != 0)) {
                return false;
            }
            if (((i3 & 4) != 0) && this.f69949g != dVar.f69949g) {
                return false;
            }
            if (((i3 & 8) != 0) != ((i4 & 8) != 0)) {
                return false;
            }
            if (((i3 & 8) != 0) && this.f69950h != dVar.f69950h) {
                return false;
            }
            if (((i3 & 16) != 0) != ((i4 & 16) != 0)) {
                return false;
            }
            if (((i3 & 16) != 0) && !getMd5().equals(dVar.getMd5())) {
                return false;
            }
            int i5 = this.f69946d;
            if (((i5 & 32) != 0) != ((dVar.f69946d & 32) != 0)) {
                return false;
            }
            if (((i5 & 32) != 0) && !getUrl().equals(dVar.getUrl())) {
                return false;
            }
            int i6 = this.f69946d;
            if (((i6 & 64) != 0) != ((dVar.f69946d & 64) != 0)) {
                return false;
            }
            return (!((i6 & 64) != 0) || this.f69953n == dVar.f69953n) && this.unknownFields.equals(dVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f69944p;
        }

        public String getMd5() {
            Object obj = this.f69951i;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69951i = u;
            }
            return u;
        }

        public C24062w1<C24456d> getParserForType() {
            return f69945q;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f69946d & 1) != 0) {
                i2 = 0 + C23872m0.computeStringSize(1, this.f69947e);
            }
            if ((this.f69946d & 2) != 0) {
                i2 += C23872m0.computeStringSize(2, this.f69948f);
            }
            if ((this.f69946d & 4) != 0) {
                i2 += C23897n.m29278w(3, this.f69949g);
            }
            if ((this.f69946d & 8) != 0) {
                i2 += C23897n.m29278w(4, this.f69950h);
            }
            if ((this.f69946d & 16) != 0) {
                i2 += C23872m0.computeStringSize(5, this.f69951i);
            }
            if ((this.f69946d & 32) != 0) {
                i2 += C23872m0.computeStringSize(6, this.f69952j);
            }
            if ((this.f69946d & 64) != 0) {
                i2 += C23897n.m29278w(7, this.f69953n);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public String getUrl() {
            Object obj = this.f69952j;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69952j = u;
            }
            return u;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C24446b.f69905i.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if ((this.f69946d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + mo51139a().hashCode();
            }
            if ((this.f69946d & 2) != 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + mo51140b().hashCode();
            }
            int i2 = this.f69946d;
            if ((i2 & 4) != 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.f69949g;
            }
            if ((i2 & 8) != 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + this.f69950h;
            }
            if ((i2 & 16) != 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getMd5().hashCode();
            }
            if ((this.f69946d & 32) != 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + getUrl().hashCode();
            }
            if ((this.f69946d & 64) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 7) * 53) + this.f69953n;
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24446b.f69906j;
            fVar.mo37875c(C24456d.class, C24458b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f69954o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f69954o = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f69944p.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24456d();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f69946d & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.f69947e);
            }
            if ((this.f69946d & 2) != 0) {
                C23872m0.writeString(nVar, 2, this.f69948f);
            }
            if ((this.f69946d & 4) != 0) {
                nVar.mo37917X(3, this.f69949g);
            }
            if ((this.f69946d & 8) != 0) {
                nVar.mo37917X(4, this.f69950h);
            }
            if ((this.f69946d & 16) != 0) {
                C23872m0.writeString(nVar, 5, this.f69951i);
            }
            if ((this.f69946d & 32) != 0) {
                C23872m0.writeString(nVar, 6, this.f69952j);
            }
            if ((this.f69946d & 64) != 0) {
                nVar.mo37917X(7, this.f69953n);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168523getDefaultInstanceForType() {
            return f69944p;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168524newBuilderForType() {
            return f69944p.toBuilder();
        }

        public C24456d() {
            this.f69954o = -1;
            this.f69947e = "";
            this.f69948f = "";
            this.f69951i = "";
            this.f69952j = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24458b(cVar);
        }
    }

    /* renamed from: d12.b$e */
    public static final class C24459e extends C23872m0 implements C23896m1 {

        /* renamed from: f */
        public static final C24459e f69963f = new C24459e();
        @Deprecated

        /* renamed from: g */
        public static final C24062w1<C24459e> f69964g = new C24460a();

        /* renamed from: d */
        public List<C24456d> f69965d;

        /* renamed from: e */
        public byte f69966e;

        /* renamed from: d12.b$e$a */
        public class C24460a extends C23813c<C24459e> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24459e eVar = new C24459e();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                if (!z2 || !true) {
                                    eVar.f69965d = new ArrayList();
                                    z2 |= true;
                                }
                                eVar.f69965d.add((C24456d) lVar.mo37777v(C24456d.f69945q, a0Var));
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
                        if (z2 && true) {
                            eVar.f69965d = Collections.unmodifiableList(eVar.f69965d);
                        }
                        eVar.unknownFields = b.build();
                        eVar.makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    eVar.f69965d = Collections.unmodifiableList(eVar.f69965d);
                }
                eVar.unknownFields = b.build();
                eVar.makeExtensionsImmutable();
                return eVar;
            }
        }

        /* renamed from: d12.b$e$b */
        public static final class C24461b extends C23872m0.C23874b<C24461b> implements C23896m1 {

            /* renamed from: d */
            public int f69967d;

            /* renamed from: e */
            public List<C24456d> f69968e = Collections.emptyList();

            /* renamed from: f */
            public C23821e2<C24456d, C24456d.C24458b, Object> f69969f;

            public C24461b() {
                C24459e eVar = C24459e.f69963f;
                if (C23872m0.alwaysUseFieldBuilders) {
                    mo51153d();
                }
            }

            /* renamed from: a */
            public C24459e buildPartial() {
                C24459e eVar = new C24459e(this);
                int i = this.f69967d;
                C23821e2<C24456d, C24456d.C24458b, Object> e2Var = this.f69969f;
                if (e2Var == null) {
                    if ((i & 1) != 0) {
                        this.f69968e = Collections.unmodifiableList(this.f69968e);
                        this.f69967d &= -2;
                    }
                    eVar.f69965d = this.f69968e;
                } else {
                    eVar.f69965d = e2Var.mo37583g();
                }
                onBuilt();
                return eVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168539addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24461b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24461b mo51151b() {
                super.clear();
                C23821e2<C24456d, C24456d.C24458b, Object> e2Var = this.f69969f;
                if (e2Var == null) {
                    this.f69968e = Collections.emptyList();
                    this.f69967d &= -2;
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public C23836g1 build() {
                C24459e a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24461b clone() {
                return (C24461b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168541clearField(C24025t.C24035g gVar) {
                return (C24461b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24461b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public final C23821e2<C24456d, C24456d.C24458b, Object> mo51153d() {
                if (this.f69969f == null) {
                    List<C24456d> list = this.f69968e;
                    boolean z = true;
                    if ((this.f69967d & 1) == 0) {
                        z = false;
                    }
                    this.f69969f = new C23821e2<>(list, z, getParentForChildren(), isClean());
                    this.f69968e = null;
                }
                return this.f69969f;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d12.C24446b.C24459e.C24461b mo51154e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<d12.b$e> r0 = d12.C24446b.C24459e.f69964g     // Catch:{ p0 -> 0x0010 }
                    d12.b$e$a r0 = (d12.C24446b.C24459e.C24460a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    d12.b$e r2 = (d12.C24446b.C24459e) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51155f(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    d12.b$e r3 = (d12.C24446b.C24459e) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51155f(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: d12.C24446b.C24459e.C24461b.mo51154e(com.google.protobuf.l, com.google.protobuf.a0):d12.b$e$b");
            }

            /* renamed from: f */
            public C24461b mo51155f(C24459e eVar) {
                if (eVar == C24459e.f69963f) {
                    return this;
                }
                if (this.f69969f == null) {
                    if (!eVar.f69965d.isEmpty()) {
                        if (this.f69968e.isEmpty()) {
                            this.f69968e = eVar.f69965d;
                            this.f69967d &= -2;
                        } else {
                            if ((this.f69967d & 1) == 0) {
                                this.f69968e = new ArrayList(this.f69968e);
                                this.f69967d |= 1;
                            }
                            this.f69968e.addAll(eVar.f69965d);
                        }
                        onChanged();
                    }
                } else if (!eVar.f69965d.isEmpty()) {
                    if (this.f69969f.mo37595s()) {
                        C23821e2<C24456d, C24456d.C24458b, Object> e2Var = null;
                        this.f69969f.f68224a = null;
                        this.f69969f = null;
                        this.f69968e = eVar.f69965d;
                        this.f69967d &= -2;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = mo51153d();
                        }
                        this.f69969f = e2Var;
                    } else {
                        this.f69969f.mo37578b(eVar.f69965d);
                    }
                }
                C24461b bVar = (C24461b) super.mergeUnknownFields(eVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24459e.f69963f;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24446b.f69907k;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24446b.f69908l;
                fVar.mo37875c(C24459e.class, C24461b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24461b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168548setField(C24025t.C24035g gVar, Object obj) {
                return (C24461b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168549setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24461b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168550setUnknownFields(C24020s2 s2Var) {
                return (C24461b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24461b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24461b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168543clearOneof(C24025t.C24042k kVar) {
                return (C24461b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168544getDefaultInstanceForType() {
                return C24459e.f69963f;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168547mergeUnknownFields(C24020s2 s2Var) {
                return (C24461b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24461b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24461b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24461b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168542clearOneof(C24025t.C24042k kVar) {
                return (C24461b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168546mergeUnknownFields(C24020s2 s2Var) {
                return (C24461b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168540build() {
                C24459e a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24459e) {
                    mo51155f((C24459e) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            public C24461b(C23872m0.C23876c cVar) {
                super(cVar);
                C24459e eVar = C24459e.f69963f;
                if (C23872m0.alwaysUseFieldBuilders) {
                    mo51153d();
                }
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168545mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24459e) {
                    mo51155f((C24459e) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24459e(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f69966e = -1;
        }

        /* renamed from: a */
        public C24461b toBuilder() {
            if (this == f69963f) {
                return new C24461b();
            }
            C24461b bVar = new C24461b();
            bVar.mo51155f(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24459e)) {
                return super.equals(obj);
            }
            C24459e eVar = (C24459e) obj;
            return this.f69965d.equals(eVar.f69965d) && this.unknownFields.equals(eVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f69963f;
        }

        public C24062w1<C24459e> getParserForType() {
            return f69964g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f69965d.size(); i3++) {
                i2 += C23897n.m29270o(1, this.f69965d.get(i3));
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
            int hashCode = C82986r.CTRL_INDEX + C24446b.f69907k.hashCode();
            if (this.f69965d.size() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.f69965d.hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24446b.f69908l;
            fVar.mo37875c(C24459e.class, C24461b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f69966e;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f69966e = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f69963f.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24459e();
        }

        public void writeTo(C23897n nVar) {
            for (int i = 0; i < this.f69965d.size(); i++) {
                nVar.mo37909P(1, this.f69965d.get(i));
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168537getDefaultInstanceForType() {
            return f69963f;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168538newBuilderForType() {
            return f69963f.toBuilder();
        }

        public C24459e() {
            this.f69966e = -1;
            this.f69965d = Collections.emptyList();
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24461b(cVar);
        }
    }

    /* renamed from: d12.b$f */
    public static final class C24462f extends C23872m0 implements C23896m1 {

        /* renamed from: j */
        public static final C24462f f69970j = new C24462f();
        @Deprecated

        /* renamed from: n */
        public static final C24062w1<C24462f> f69971n = new C24463a();

        /* renamed from: d */
        public int f69972d;

        /* renamed from: e */
        public long f69973e;

        /* renamed from: f */
        public double f69974f;

        /* renamed from: g */
        public volatile Object f69975g;

        /* renamed from: h */
        public long f69976h;

        /* renamed from: i */
        public byte f69977i;

        /* renamed from: d12.b$f$a */
        public class C24463a extends C23813c<C24462f> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24462f fVar = new C24462f();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                fVar.f69972d |= 1;
                                fVar.f69973e = lVar.mo37776u();
                            } else if (F == 17) {
                                fVar.f69972d |= 2;
                                fVar.f69974f = lVar.mo37769n();
                            } else if (F == 26) {
                                C16994k m = lVar.mo37768m();
                                fVar.f69972d |= 4;
                                fVar.f69975g = m;
                            } else if (F == 40) {
                                fVar.f69972d |= 8;
                                fVar.f69976h = lVar.mo37759H();
                            } else if (!fVar.parseUnknownField(lVar, b, a0Var, F)) {
                            }
                        }
                        z = true;
                    } catch (C23922p0 e) {
                        e.f68530d = fVar;
                        throw e;
                    } catch (IOException e2) {
                        C23922p0 p0Var = new C23922p0(e2);
                        p0Var.f68530d = fVar;
                        throw p0Var;
                    } catch (Throwable th) {
                        fVar.unknownFields = b.build();
                        fVar.makeExtensionsImmutable();
                        throw th;
                    }
                }
                fVar.unknownFields = b.build();
                fVar.makeExtensionsImmutable();
                return fVar;
            }
        }

        /* renamed from: d12.b$f$b */
        public static final class C24464b extends C23872m0.C23874b<C24464b> implements C23896m1 {

            /* renamed from: d */
            public int f69978d;

            /* renamed from: e */
            public long f69979e;

            /* renamed from: f */
            public double f69980f;

            /* renamed from: g */
            public Object f69981g = "";

            /* renamed from: h */
            public long f69982h;

            public C24464b() {
                C24462f fVar = C24462f.f69970j;
            }

            /* renamed from: a */
            public C24462f build() {
                C24462f b = buildPartial();
                if (b.isInitialized()) {
                    return b;
                }
                throw C23803a.C23804a.newUninitializedMessageException(b);
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168553addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24464b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24462f buildPartial() {
                C24462f fVar = new C24462f(this);
                int i = this.f69978d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    fVar.f69973e = this.f69979e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    fVar.f69974f = this.f69980f;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                fVar.f69975g = this.f69981g;
                if ((i & 8) != 0) {
                    fVar.f69976h = this.f69982h;
                    i2 |= 8;
                }
                fVar.f69972d = i2;
                onBuilt();
                return fVar;
            }

            /* renamed from: c */
            public C24464b mo51160c() {
                super.clear();
                this.f69979e = 0;
                this.f69980f = 0.0d;
                this.f69981g = "";
                this.f69982h = 0;
                this.f69978d = this.f69978d & -2 & -3 & -5 & -9;
                return this;
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168554clearField(C24025t.C24035g gVar) {
                return (C24464b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24464b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public C24464b clone() {
                return (C24464b) super.clone();
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d12.C24446b.C24462f.C24464b mo51162e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<d12.b$f> r0 = d12.C24446b.C24462f.f69971n     // Catch:{ p0 -> 0x0010 }
                    d12.b$f$a r0 = (d12.C24446b.C24462f.C24463a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    d12.b$f r2 = (d12.C24446b.C24462f) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51163f(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    d12.b$f r3 = (d12.C24446b.C24462f) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51163f(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: d12.C24446b.C24462f.C24464b.mo51162e(com.google.protobuf.l, com.google.protobuf.a0):d12.b$f$b");
            }

            /* renamed from: f */
            public C24464b mo51163f(C24462f fVar) {
                if (fVar == C24462f.f69970j) {
                    return this;
                }
                boolean z = true;
                if ((fVar.f69972d & 1) != 0) {
                    long j = fVar.f69973e;
                    this.f69978d |= 1;
                    this.f69979e = j;
                    onChanged();
                }
                if ((fVar.f69972d & 2) != 0) {
                    double d = fVar.f69974f;
                    this.f69978d |= 2;
                    this.f69980f = d;
                    onChanged();
                }
                if ((fVar.f69972d & 4) != 0) {
                    this.f69978d |= 4;
                    this.f69981g = fVar.f69975g;
                    onChanged();
                }
                if ((fVar.f69972d & 8) == 0) {
                    z = false;
                }
                if (z) {
                    long j2 = fVar.f69976h;
                    this.f69978d |= 8;
                    this.f69982h = j2;
                    onChanged();
                }
                C24464b bVar = (C24464b) super.mergeUnknownFields(fVar.unknownFields);
                onChanged();
                return this;
            }

            /* renamed from: g */
            public C24464b mo51164g(String str) {
                str.getClass();
                this.f69978d |= 4;
                this.f69981g = str;
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24462f.f69970j;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24446b.f69899c;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24446b.f69900d;
                fVar.mo37875c(C24462f.class, C24464b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24464b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168561setField(C24025t.C24035g gVar, Object obj) {
                return (C24464b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168562setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24464b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168563setUnknownFields(C24020s2 s2Var) {
                return (C24464b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24464b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24464b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168556clearOneof(C24025t.C24042k kVar) {
                return (C24464b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168557getDefaultInstanceForType() {
                return C24462f.f69970j;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168560mergeUnknownFields(C24020s2 s2Var) {
                return (C24464b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24464b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24464b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24464b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168555clearOneof(C24025t.C24042k kVar) {
                return (C24464b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168559mergeUnknownFields(C24020s2 s2Var) {
                return (C24464b) super.mergeUnknownFields(s2Var);
            }

            public C24464b(C23872m0.C23876c cVar) {
                super(cVar);
                C24462f fVar = C24462f.f69970j;
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24462f) {
                    mo51163f((C24462f) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168558mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24462f) {
                    mo51163f((C24462f) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24462f(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f69977i = -1;
        }

        /* renamed from: a */
        public String mo51156a() {
            Object obj = this.f69975g;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69975g = u;
            }
            return u;
        }

        /* renamed from: b */
        public C24464b toBuilder() {
            if (this == f69970j) {
                return new C24464b();
            }
            C24464b bVar = new C24464b();
            bVar.mo51163f(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24462f)) {
                return super.equals(obj);
            }
            C24462f fVar = (C24462f) obj;
            int i = this.f69972d;
            boolean z = (i & 1) != 0;
            int i2 = fVar.f69972d;
            if (z != ((i2 & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && this.f69973e != fVar.f69973e) {
                return false;
            }
            if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                return false;
            }
            if (((i & 2) != 0) && Double.doubleToLongBits(this.f69974f) != Double.doubleToLongBits(fVar.f69974f)) {
                return false;
            }
            int i3 = this.f69972d;
            if (((i3 & 4) != 0) != ((fVar.f69972d & 4) != 0)) {
                return false;
            }
            if (((i3 & 4) != 0) && !mo51156a().equals(fVar.mo51156a())) {
                return false;
            }
            int i4 = this.f69972d;
            if (((i4 & 8) != 0) != ((fVar.f69972d & 8) != 0)) {
                return false;
            }
            return (!((i4 & 8) != 0) || this.f69976h == fVar.f69976h) && this.unknownFields.equals(fVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f69970j;
        }

        public C24062w1<C24462f> getParserForType() {
            return f69971n;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f69972d & 1) != 0) {
                i2 = 0 + C23897n.m29268m(1, this.f69973e);
            }
            if ((this.f69972d & 2) != 0) {
                i2 += C23897n.m29260e(2, this.f69974f);
            }
            if ((this.f69972d & 4) != 0) {
                i2 += C23872m0.computeStringSize(3, this.f69975g);
            }
            if ((this.f69972d & 8) != 0) {
                i2 += C23897n.m29280y(5, this.f69976h);
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
            int hashCode = C24446b.f69899c.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if ((this.f69972d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + C23908o0.m29424b(this.f69973e);
            }
            if ((this.f69972d & 2) != 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + C23908o0.m29424b(Double.doubleToLongBits(this.f69974f));
            }
            if ((this.f69972d & 4) != 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + mo51156a().hashCode();
            }
            if ((this.f69972d & 8) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 5) * 53) + C23908o0.m29424b(this.f69976h);
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24446b.f69900d;
            fVar.mo37875c(C24462f.class, C24464b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f69977i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f69977i = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f69970j.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24462f();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f69972d & 1) != 0) {
                nVar.mo37919Z(1, this.f69973e);
            }
            if ((this.f69972d & 2) != 0) {
                nVar.mo37901H(2, this.f69974f);
            }
            if ((this.f69972d & 4) != 0) {
                C23872m0.writeString(nVar, 3, this.f69975g);
            }
            if ((this.f69972d & 8) != 0) {
                nVar.mo37919Z(5, this.f69976h);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168551getDefaultInstanceForType() {
            return f69970j;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168552newBuilderForType() {
            return f69970j.toBuilder();
        }

        public C24462f() {
            this.f69977i = -1;
            this.f69975g = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24464b(cVar);
        }
    }

    static {
        C24025t.C24038h i = C24025t.C24038h.m29872i(new String[]{"\n\u0014ilink_resource.proto\u0012\u0005ilink\"@\n\rLocalResource\u0012\u0015\n\rresource_name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010resource_version\u0018\u0002 \u0001(\r\"^\n\u0005Value\u0012\u0013\n\u000bint64_value\u0018\u0001 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0002 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0003 \u0001(\t\u0012\u0014\n\fuint64_value\u0018\u0005 \u0001(\u0004\"A\n\u0015ParameterKeyValuePair\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\u001b\n\u0005value\u0018\u0002 \u0001(\u000b2\f.ilink.Value\"¨\u0001\n\u001aGetResourceDescriptionInfo\u0012\u0012\n\nproject_id\u0018\u0001 \u0001(\t\u0012\u0015\n\rresource_name\u0018\u0002 \u0001(\t\u0012-\n\u000flocal_resources\u0018\u0003 \u0003(\u000b2\u0014.ilink.LocalResource\u00120\n\nparameters\u0018\u0004 \u0003(\u000b2\u001c.ilink.ParameterKeyValuePair\"\u0001\n\fResourceInfo\u0012\u0012\n\nproject_id\u0018\u0001 \u0001(\t\u0012\u0015\n\rresource_name\u0018\u0002 \u0001(\t\u0012\u0018\n\u0010resource_version\u0018\u0003 \u0001(\r\u0012\u0015\n\rresource_size\u0018\u0004 \u0001(\r\u0012\u000b\n\u0003md5\u0018\u0005 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bcreate_time\u0018\u0007 \u0001(\r\":\n\u0010ResourceResponse\u0012&\n\tresources\u0018\u0001 \u0003(\u000b2\u0013.ilink.ResourceInfoB/\n$com.tencent.mm.plugin.ilink.resourceB\u0005ProtoH\u0003"}, new C24025t.C24038h[0]);
        f69909m = i;
        C24025t.C24027b bVar = i.mo38347g().get(0);
        f69897a = bVar;
        f69898b = new C23872m0.C23880f(bVar, new String[]{"ResourceName", "ResourceVersion"});
        C24025t.C24027b bVar2 = f69909m.mo38347g().get(1);
        f69899c = bVar2;
        f69900d = new C23872m0.C23880f(bVar2, new String[]{"Int64Value", "DoubleValue", "StringValue", "Uint64Value"});
        C24025t.C24027b bVar3 = f69909m.mo38347g().get(2);
        f69901e = bVar3;
        f69902f = new C23872m0.C23880f(bVar3, new String[]{"Key", "Value"});
        C24025t.C24027b bVar4 = f69909m.mo38347g().get(3);
        f69903g = bVar4;
        f69904h = new C23872m0.C23880f(bVar4, new String[]{"ProjectId", "ResourceName", "LocalResources", "Parameters"});
        C24025t.C24027b bVar5 = f69909m.mo38347g().get(4);
        f69905i = bVar5;
        f69906j = new C23872m0.C23880f(bVar5, new String[]{"ProjectId", "ResourceName", "ResourceVersion", "ResourceSize", "Md5", "Url", "CreateTime"});
        C24025t.C24027b bVar6 = f69909m.mo38347g().get(5);
        f69907k = bVar6;
        f69908l = new C23872m0.C23880f(bVar6, new String[]{"Resources"});
    }
}
