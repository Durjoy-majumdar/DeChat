package mi3;

import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23821e2;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mi3.C24983a;
import mi3.C25001k;

/* renamed from: mi3.b */
public final class C24986b extends C23872m0 implements C23896m1 {

    /* renamed from: i */
    public static final C24986b f71148i = new C24986b();

    /* renamed from: j */
    public static final C24062w1<C24986b> f71149j = new C24987a();

    /* renamed from: d */
    public C25001k f71150d;

    /* renamed from: e */
    public List<C24983a> f71151e;

    /* renamed from: f */
    public boolean f71152f;

    /* renamed from: g */
    public C25001k f71153g;

    /* renamed from: h */
    public byte f71154h;

    /* renamed from: mi3.b$a */
    public static class C24987a extends C23813c<C24986b> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C24986b bVar = new C24986b();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        C25001k.C25003b bVar2 = null;
                        if (F == 10) {
                            C25001k kVar = bVar.f71150d;
                            if (kVar != null) {
                                bVar2 = kVar.toBuilder();
                            }
                            C25001k kVar2 = (C25001k) lVar.mo37777v(C25001k.f71216j, a0Var);
                            bVar.f71150d = kVar2;
                            if (bVar2 != null) {
                                bVar2.mo52076e(kVar2);
                                bVar.f71150d = bVar2.buildPartial();
                            }
                        } else if (F == 18) {
                            if (!z2 || !true) {
                                bVar.f71151e = new ArrayList();
                                z2 |= true;
                            }
                            bVar.f71151e.add(lVar.mo37777v(C24983a.f71142h, a0Var));
                        } else if (F == 24) {
                            bVar.f71152f = lVar.mo37767l();
                        } else if (F == 34) {
                            C25001k kVar3 = bVar.f71153g;
                            if (kVar3 != null) {
                                bVar2 = kVar3.toBuilder();
                            }
                            C25001k kVar4 = (C25001k) lVar.mo37777v(C25001k.f71216j, a0Var);
                            bVar.f71153g = kVar4;
                            if (bVar2 != null) {
                                bVar2.mo52076e(kVar4);
                                bVar.f71153g = bVar2.buildPartial();
                            }
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
                    if (z2 && true) {
                        bVar.f71151e = Collections.unmodifiableList(bVar.f71151e);
                    }
                    bVar.unknownFields = b.build();
                    bVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                bVar.f71151e = Collections.unmodifiableList(bVar.f71151e);
            }
            bVar.unknownFields = b.build();
            bVar.makeExtensionsImmutable();
            return bVar;
        }
    }

    /* renamed from: mi3.b$b */
    public static final class C24988b extends C23872m0.C23874b<C24988b> implements C23896m1 {

        /* renamed from: d */
        public int f71155d;

        /* renamed from: e */
        public C25001k f71156e;

        /* renamed from: f */
        public List<C24983a> f71157f = Collections.emptyList();

        /* renamed from: g */
        public C23821e2<C24983a, C24983a.C24985b, Object> f71158g;

        /* renamed from: h */
        public boolean f71159h;

        /* renamed from: i */
        public C25001k f71160i;

        public C24988b() {
            C24986b bVar = C24986b.f71148i;
            if (C23872m0.alwaysUseFieldBuilders) {
                mo52032d();
            }
        }

        /* renamed from: a */
        public C24986b buildPartial() {
            C24986b bVar = new C24986b(this);
            int i = this.f71155d;
            bVar.f71150d = this.f71156e;
            C23821e2<C24983a, C24983a.C24985b, Object> e2Var = this.f71158g;
            if (e2Var == null) {
                if ((i & 1) != 0) {
                    this.f71157f = Collections.unmodifiableList(this.f71157f);
                    this.f71155d &= -2;
                }
                bVar.f71151e = this.f71157f;
            } else {
                bVar.f71151e = e2Var.mo37583g();
            }
            bVar.f71152f = this.f71159h;
            bVar.f71153g = this.f71160i;
            onBuilt();
            return bVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168690addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24988b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C24988b mo52030b() {
            super.clear();
            this.f71156e = null;
            C23821e2<C24983a, C24983a.C24985b, Object> e2Var = this.f71158g;
            if (e2Var == null) {
                this.f71157f = Collections.emptyList();
                this.f71155d &= -2;
            } else {
                e2Var.mo37584h();
            }
            this.f71159h = false;
            this.f71160i = null;
            return this;
        }

        public C23836g1 build() {
            C24986b a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C24988b clone() {
            return (C24988b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168692clearField(C24025t.C24035g gVar) {
            return (C24988b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C24988b) super.clearOneof(kVar);
        }

        /* renamed from: d */
        public final C23821e2<C24983a, C24983a.C24985b, Object> mo52032d() {
            if (this.f71158g == null) {
                List<C24983a> list = this.f71157f;
                boolean z = true;
                if ((this.f71155d & 1) == 0) {
                    z = false;
                }
                this.f71158g = new C23821e2<>(list, z, getParentForChildren(), isClean());
                this.f71157f = null;
            }
            return this.f71158g;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C24986b.C24988b mo52033e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.b> r0 = mi3.C24986b.f71149j     // Catch:{ p0 -> 0x0010 }
                mi3.b$a r0 = (mi3.C24986b.C24987a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.b r2 = (mi3.C24986b) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52034f(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.b r3 = (mi3.C24986b) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52034f(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C24986b.C24988b.mo52033e(com.google.protobuf.l, com.google.protobuf.a0):mi3.b$b");
        }

        /* renamed from: f */
        public C24988b mo52034f(C24986b bVar) {
            if (bVar == C24986b.f71148i) {
                return this;
            }
            boolean z = false;
            if (bVar.f71150d != null) {
                C25001k a = bVar.mo52026a();
                C25001k kVar = this.f71156e;
                if (kVar != null) {
                    C25001k.C25003b a2 = C25001k.m31651a(kVar);
                    a2.mo52076e(a);
                    this.f71156e = a2.buildPartial();
                } else {
                    this.f71156e = a;
                }
                onChanged();
            }
            if (this.f71158g == null) {
                if (!bVar.f71151e.isEmpty()) {
                    if (this.f71157f.isEmpty()) {
                        this.f71157f = bVar.f71151e;
                        this.f71155d &= -2;
                    } else {
                        if ((this.f71155d & 1) == 0) {
                            this.f71157f = new ArrayList(this.f71157f);
                            this.f71155d |= 1;
                        }
                        this.f71157f.addAll(bVar.f71151e);
                    }
                    onChanged();
                }
            } else if (!bVar.f71151e.isEmpty()) {
                if (this.f71158g.mo37595s()) {
                    C23821e2<C24983a, C24983a.C24985b, Object> e2Var = null;
                    this.f71158g.f68224a = null;
                    this.f71158g = null;
                    this.f71157f = bVar.f71151e;
                    this.f71155d &= -2;
                    if (C23872m0.alwaysUseFieldBuilders) {
                        e2Var = mo52032d();
                    }
                    this.f71158g = e2Var;
                } else {
                    this.f71158g.mo37578b(bVar.f71151e);
                }
            }
            boolean z2 = bVar.f71152f;
            if (z2) {
                this.f71159h = z2;
                onChanged();
            }
            if (bVar.f71153g != null) {
                z = true;
            }
            if (z) {
                C25001k b = bVar.mo52027b();
                C25001k kVar2 = this.f71160i;
                if (kVar2 != null) {
                    C25001k.C25003b a3 = C25001k.m31651a(kVar2);
                    a3.mo52076e(b);
                    this.f71160i = a3.buildPartial();
                } else {
                    this.f71160i = b;
                }
                onChanged();
            }
            C24988b bVar2 = (C24988b) super.mergeUnknownFields(bVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C24986b.f71148i;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71337o;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71338p;
            fVar.mo37875c(C24986b.class, C24988b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C24988b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168699setField(C24025t.C24035g gVar, Object obj) {
            return (C24988b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168700setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24988b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168701setUnknownFields(C24020s2 s2Var) {
            return (C24988b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C24988b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C24988b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168694clearOneof(C24025t.C24042k kVar) {
            return (C24988b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168695getDefaultInstanceForType() {
            return C24986b.f71148i;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168698mergeUnknownFields(C24020s2 s2Var) {
            return (C24988b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C24988b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C24988b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C24988b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168693clearOneof(C24025t.C24042k kVar) {
            return (C24988b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168697mergeUnknownFields(C24020s2 s2Var) {
            return (C24988b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168691build() {
            C24986b a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24986b) {
                mo52034f((C24986b) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        public C24988b(C23872m0.C23876c cVar) {
            super(cVar);
            C24986b bVar = C24986b.f71148i;
            if (C23872m0.alwaysUseFieldBuilders) {
                mo52032d();
            }
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168696mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C24986b) {
                mo52034f((C24986b) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C24986b(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71154h = -1;
    }

    /* renamed from: a */
    public C25001k mo52026a() {
        C25001k kVar = this.f71150d;
        return kVar == null ? C25001k.f71215i : kVar;
    }

    /* renamed from: b */
    public C25001k mo52027b() {
        C25001k kVar = this.f71153g;
        return kVar == null ? C25001k.f71215i : kVar;
    }

    /* renamed from: c */
    public C24988b toBuilder() {
        if (this == f71148i) {
            return new C24988b();
        }
        C24988b bVar = new C24988b();
        bVar.mo52034f(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24986b)) {
            return super.equals(obj);
        }
        C24986b bVar = (C24986b) obj;
        C25001k kVar = this.f71150d;
        if ((kVar != null) != (bVar.f71150d != null)) {
            return false;
        }
        if (((kVar != null) && !mo52026a().equals(bVar.mo52026a())) || !this.f71151e.equals(bVar.f71151e) || this.f71152f != bVar.f71152f) {
            return false;
        }
        C25001k kVar2 = this.f71153g;
        if ((kVar2 != null) != (bVar.f71153g != null)) {
            return false;
        }
        return (!(kVar2 != null) || mo52027b().equals(bVar.mo52027b())) && this.unknownFields.equals(bVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71148i;
    }

    public C24062w1<C24986b> getParserForType() {
        return f71149j;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int o = this.f71150d != null ? C23897n.m29270o(1, mo52026a()) + 0 : 0;
        for (int i2 = 0; i2 < this.f71151e.size(); i2++) {
            o += C23897n.m29270o(2, this.f71151e.get(i2));
        }
        boolean z = this.f71152f;
        if (z) {
            o += C23897n.m29257b(3, z);
        }
        if (this.f71153g != null) {
            o += C23897n.m29270o(4, mo52027b());
        }
        int serializedSize = o + this.unknownFields.getSerializedSize();
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
        int hashCode = C25022r.f71337o.hashCode() + C82986r.CTRL_INDEX;
        boolean z = false;
        if (this.f71150d != null) {
            hashCode = (((hashCode * 37) + 1) * 53) + mo52026a().hashCode();
        }
        if (this.f71151e.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f71151e.hashCode();
        }
        int a = (((hashCode * 37) + 3) * 53) + C23908o0.m29423a(this.f71152f);
        if (this.f71153g != null) {
            z = true;
        }
        if (z) {
            a = (((a * 37) + 4) * 53) + mo52027b().hashCode();
        }
        int hashCode2 = (a * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71338p;
        fVar.mo37875c(C24986b.class, C24988b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71154h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71154h = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71148i.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C24986b();
    }

    public void writeTo(C23897n nVar) {
        if (this.f71150d != null) {
            nVar.mo37909P(1, mo52026a());
        }
        for (int i = 0; i < this.f71151e.size(); i++) {
            nVar.mo37909P(2, this.f71151e.get(i));
        }
        boolean z = this.f71152f;
        if (z) {
            nVar.mo37897D(3, z);
        }
        if (this.f71153g != null) {
            nVar.mo37909P(4, mo52027b());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168688getDefaultInstanceForType() {
        return f71148i;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168689newBuilderForType() {
        return f71148i.toBuilder();
    }

    public C24986b() {
        this.f71154h = -1;
        this.f71151e = Collections.emptyList();
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C24988b(cVar);
    }
}
