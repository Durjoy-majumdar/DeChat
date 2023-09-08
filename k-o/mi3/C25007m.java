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

/* renamed from: mi3.m */
public final class C25007m extends C23872m0 implements C23896m1 {

    /* renamed from: s */
    public static final C25007m f71233s = new C25007m();

    /* renamed from: t */
    public static final C24062w1<C25007m> f71234t = new C25008a();

    /* renamed from: d */
    public float f71235d;

    /* renamed from: e */
    public boolean f71236e;

    /* renamed from: f */
    public boolean f71237f;

    /* renamed from: g */
    public int f71238g;

    /* renamed from: h */
    public int f71239h;

    /* renamed from: i */
    public float f71240i;

    /* renamed from: j */
    public float f71241j;

    /* renamed from: n */
    public int f71242n;

    /* renamed from: o */
    public int f71243o;

    /* renamed from: p */
    public boolean f71244p;

    /* renamed from: q */
    public long f71245q;

    /* renamed from: r */
    public byte f71246r;

    /* renamed from: mi3.m$a */
    public static class C25008a extends C23813c<C25007m> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C25007m mVar = new C25007m();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    switch (F) {
                        case 0:
                            z = true;
                            break;
                        case 13:
                            mVar.f71235d = lVar.mo37773r();
                            break;
                        case 16:
                            mVar.f71236e = lVar.mo37767l();
                            break;
                        case 24:
                            mVar.f71237f = lVar.mo37767l();
                            break;
                        case 32:
                            mVar.f71238g = lVar.mo37770o();
                            break;
                        case 40:
                            mVar.f71239h = lVar.mo37770o();
                            break;
                        case 53:
                            mVar.f71240i = lVar.mo37773r();
                            break;
                        case 61:
                            mVar.f71241j = lVar.mo37773r();
                            break;
                        case 64:
                            mVar.f71242n = lVar.mo37775t();
                            break;
                        case 72:
                            mVar.f71243o = lVar.mo37775t();
                            break;
                        case 80:
                            mVar.f71244p = lVar.mo37767l();
                            break;
                        case 88:
                            mVar.f71245q = lVar.mo37776u();
                            break;
                        default:
                            if (mVar.parseUnknownField(lVar, b, a0Var, F)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (C23922p0 e) {
                    e.f68530d = mVar;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = mVar;
                    throw p0Var;
                } catch (Throwable th) {
                    mVar.unknownFields = b.build();
                    mVar.makeExtensionsImmutable();
                    throw th;
                }
            }
            mVar.unknownFields = b.build();
            mVar.makeExtensionsImmutable();
            return mVar;
        }
    }

    /* renamed from: mi3.m$b */
    public static final class C25009b extends C23872m0.C23874b<C25009b> implements C23896m1 {

        /* renamed from: d */
        public float f71247d;

        /* renamed from: e */
        public boolean f71248e;

        /* renamed from: f */
        public boolean f71249f;

        /* renamed from: g */
        public int f71250g = 0;

        /* renamed from: h */
        public int f71251h = 0;

        /* renamed from: i */
        public float f71252i;

        /* renamed from: j */
        public float f71253j;

        /* renamed from: n */
        public int f71254n;

        /* renamed from: o */
        public int f71255o;

        /* renamed from: p */
        public boolean f71256p;

        /* renamed from: q */
        public long f71257q;

        public C25009b() {
            C25007m mVar = C25007m.f71233s;
        }

        /* renamed from: a */
        public C25007m buildPartial() {
            C25007m mVar = new C25007m(this);
            mVar.f71235d = this.f71247d;
            mVar.f71236e = this.f71248e;
            mVar.f71237f = this.f71249f;
            mVar.f71238g = this.f71250g;
            mVar.f71239h = this.f71251h;
            mVar.f71240i = this.f71252i;
            mVar.f71241j = this.f71253j;
            mVar.f71242n = this.f71254n;
            mVar.f71243o = this.f71255o;
            mVar.f71244p = this.f71256p;
            mVar.f71245q = this.f71257q;
            onBuilt();
            return mVar;
        }

        /* renamed from: addRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168790addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25009b) super.addRepeatedField(gVar, obj);
        }

        /* renamed from: b */
        public C25009b mo52084b() {
            super.clear();
            this.f71247d = 0.0f;
            this.f71248e = false;
            this.f71249f = false;
            this.f71250g = 0;
            this.f71251h = 0;
            this.f71252i = 0.0f;
            this.f71253j = 0.0f;
            this.f71254n = 0;
            this.f71255o = 0;
            this.f71256p = false;
            this.f71257q = 0;
            return this;
        }

        public C23836g1 build() {
            C25007m a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        /* renamed from: c */
        public C25009b clone() {
            return (C25009b) super.clone();
        }

        /* renamed from: clearField  reason: collision with other method in class */
        public C23872m0.C23874b m168792clearField(C24025t.C24035g gVar) {
            return (C25009b) super.clearField(gVar);
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            return (C25009b) super.clearOneof(kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public mi3.C25007m.C25009b mo52086d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
            /*
                r1 = this;
                com.google.protobuf.w1<mi3.m> r0 = mi3.C25007m.f71234t     // Catch:{ p0 -> 0x0010 }
                mi3.m$a r0 = (mi3.C25007m.C25008a) r0     // Catch:{ p0 -> 0x0010 }
                java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                mi3.m r2 = (mi3.C25007m) r2     // Catch:{ p0 -> 0x0010 }
                r1.mo52087e(r2)
                return r1
            L_0x000e:
                r2 = move-exception
                goto L_0x001c
            L_0x0010:
                r2 = move-exception
                com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                mi3.m r3 = (mi3.C25007m) r3     // Catch:{ all -> 0x000e }
                java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                throw r2     // Catch:{ all -> 0x001a }
            L_0x001a:
                r2 = move-exception
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 == 0) goto L_0x0022
                r1.mo52087e(r3)
            L_0x0022:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: mi3.C25007m.C25009b.mo52086d(com.google.protobuf.l, com.google.protobuf.a0):mi3.m$b");
        }

        /* renamed from: e */
        public C25009b mo52087e(C25007m mVar) {
            if (mVar == C25007m.f71233s) {
                return this;
            }
            float f = mVar.f71235d;
            if (f != 0.0f) {
                this.f71247d = f;
                onChanged();
            }
            boolean z = mVar.f71236e;
            if (z) {
                this.f71248e = z;
                onChanged();
            }
            boolean z2 = mVar.f71237f;
            if (z2) {
                this.f71249f = z2;
                onChanged();
            }
            int i = mVar.f71238g;
            if (i != 0) {
                this.f71250g = i;
                onChanged();
            }
            int i2 = mVar.f71239h;
            if (i2 != 0) {
                this.f71251h = i2;
                onChanged();
            }
            float f2 = mVar.f71240i;
            if (f2 != 0.0f) {
                this.f71252i = f2;
                onChanged();
            }
            float f3 = mVar.f71241j;
            if (f3 != 0.0f) {
                this.f71253j = f3;
                onChanged();
            }
            int i3 = mVar.f71242n;
            if (i3 != 0) {
                this.f71254n = i3;
                onChanged();
            }
            int i4 = mVar.f71243o;
            if (i4 != 0) {
                this.f71255o = i4;
                onChanged();
            }
            boolean z3 = mVar.f71244p;
            if (z3) {
                this.f71256p = z3;
                onChanged();
            }
            long j = mVar.f71245q;
            if (j != 0) {
                this.f71257q = j;
                onChanged();
            }
            C25009b bVar = (C25009b) super.mergeUnknownFields(mVar.unknownFields);
            onChanged();
            return this;
        }

        public C23836g1 getDefaultInstanceForType() {
            return C25007m.f71233s;
        }

        public C24025t.C24027b getDescriptorForType() {
            return C25022r.f71347y;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C25022r.f71348z;
            fVar.mo37875c(C25007m.class, C25009b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            return true;
        }

        public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
            return (C25009b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: setField  reason: collision with other method in class */
        public C23872m0.C23874b m168799setField(C24025t.C24035g gVar, Object obj) {
            return (C25009b) super.setField(gVar, obj);
        }

        /* renamed from: setRepeatedField  reason: collision with other method in class */
        public C23872m0.C23874b m168800setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25009b) super.setRepeatedField(gVar, i, obj);
        }

        /* renamed from: setUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168801setUnknownFields(C24020s2 s2Var) {
            return (C25009b) super.setUnknownFields(s2Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            return (C25009b) super.addRepeatedField(gVar, obj);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            return (C25009b) super.clearField(gVar);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23872m0.C23874b m168794clearOneof(C24025t.C24042k kVar) {
            return (C25009b) super.clearOneof(kVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168795getDefaultInstanceForType() {
            return C25007m.f71233s;
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23872m0.C23874b m168798mergeUnknownFields(C24020s2 s2Var) {
            return (C25009b) super.mergeUnknownFields(s2Var);
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            return (C25009b) super.setField(gVar, obj);
        }

        public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            return (C25009b) super.setRepeatedField(gVar, i, obj);
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return (C25009b) super.setUnknownFields(s2Var);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168793clearOneof(C24025t.C24042k kVar) {
            return (C25009b) super.clearOneof(kVar);
        }

        /* renamed from: mergeUnknownFields  reason: collision with other method in class */
        public C23836g1.C23837a m168797mergeUnknownFields(C24020s2 s2Var) {
            return (C25009b) super.mergeUnknownFields(s2Var);
        }

        /* renamed from: build  reason: collision with other method in class */
        public C23845j1 m168791build() {
            C25007m a = buildPartial();
            if (a.isInitialized()) {
                return a;
            }
            throw C23803a.C23804a.newUninitializedMessageException(a);
        }

        public C25009b(C23872m0.C23876c cVar) {
            super(cVar);
            C25007m mVar = C25007m.f71233s;
        }

        public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25007m) {
                mo52087e((C25007m) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }

        /* renamed from: mergeFrom  reason: collision with other method in class */
        public C23836g1.C23837a m168796mergeFrom(C23836g1 g1Var) {
            if (g1Var instanceof C25007m) {
                mo52087e((C25007m) g1Var);
            } else {
                super.mergeFrom(g1Var);
            }
            return this;
        }
    }

    public C25007m(C23872m0.C23874b<?> bVar) {
        super(bVar);
        this.f71246r = -1;
    }

    /* renamed from: a */
    public C25009b toBuilder() {
        if (this == f71233s) {
            return new C25009b();
        }
        C25009b bVar = new C25009b();
        bVar.mo52087e(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25007m)) {
            return super.equals(obj);
        }
        C25007m mVar = (C25007m) obj;
        return Float.floatToIntBits(this.f71235d) == Float.floatToIntBits(mVar.f71235d) && this.f71236e == mVar.f71236e && this.f71237f == mVar.f71237f && this.f71238g == mVar.f71238g && this.f71239h == mVar.f71239h && Float.floatToIntBits(this.f71240i) == Float.floatToIntBits(mVar.f71240i) && Float.floatToIntBits(this.f71241j) == Float.floatToIntBits(mVar.f71241j) && this.f71242n == mVar.f71242n && this.f71243o == mVar.f71243o && this.f71244p == mVar.f71244p && this.f71245q == mVar.f71245q && this.unknownFields.equals(mVar.unknownFields);
    }

    public C23836g1 getDefaultInstanceForType() {
        return f71233s;
    }

    public C24062w1<C25007m> getParserForType() {
        return f71234t;
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        float f = this.f71235d;
        if (f != 0.0f) {
            i2 = 0 + C23897n.m29264i(1, f);
        }
        boolean z = this.f71236e;
        if (z) {
            i2 += C23897n.m29257b(2, z);
        }
        boolean z2 = this.f71237f;
        if (z2) {
            i2 += C23897n.m29257b(3, z2);
        }
        int i3 = this.f71238g;
        C109629f fVar = C109629f.PbDefault;
        if (i3 != fVar.getNumber()) {
            i2 += C23897n.m29261f(4, this.f71238g);
        }
        if (this.f71239h != fVar.getNumber()) {
            i2 += C23897n.m29261f(5, this.f71239h);
        }
        float f2 = this.f71240i;
        if (f2 != 0.0f) {
            i2 += C23897n.m29264i(6, f2);
        }
        float f3 = this.f71241j;
        if (f3 != 0.0f) {
            i2 += C23897n.m29264i(7, f3);
        }
        int i4 = this.f71242n;
        if (i4 != 0) {
            i2 += C23897n.m29266k(8, i4);
        }
        int i5 = this.f71243o;
        if (i5 != 0) {
            i2 += C23897n.m29266k(9, i5);
        }
        boolean z3 = this.f71244p;
        if (z3) {
            i2 += C23897n.m29257b(10, z3);
        }
        long j = this.f71245q;
        if (j != 0) {
            i2 += C23897n.m29268m(11, j);
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
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((C82986r.CTRL_INDEX + C25022r.f71347y.hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(this.f71235d)) * 37) + 2) * 53) + C23908o0.m29423a(this.f71236e)) * 37) + 3) * 53) + C23908o0.m29423a(this.f71237f)) * 37) + 4) * 53) + this.f71238g) * 37) + 5) * 53) + this.f71239h) * 37) + 6) * 53) + Float.floatToIntBits(this.f71240i)) * 37) + 7) * 53) + Float.floatToIntBits(this.f71241j)) * 37) + 8) * 53) + this.f71242n) * 37) + 9) * 53) + this.f71243o) * 37) + 10) * 53) + C23908o0.m29423a(this.f71244p)) * 37) + 11) * 53) + C23908o0.m29424b(this.f71245q)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public C23872m0.C23880f internalGetFieldAccessorTable() {
        C23872m0.C23880f fVar = C25022r.f71348z;
        fVar.mo37875c(C25007m.class, C25009b.class);
        return fVar;
    }

    public final boolean isInitialized() {
        byte b = this.f71246r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f71246r = 1;
        return true;
    }

    public C23836g1.C23837a newBuilderForType() {
        return f71233s.toBuilder();
    }

    public Object newInstance(C23872m0.C23895g gVar) {
        return new C25007m();
    }

    public void writeTo(C23897n nVar) {
        float f = this.f71235d;
        if (f != 0.0f) {
            nVar.mo37906M(1, f);
        }
        boolean z = this.f71236e;
        if (z) {
            nVar.mo37897D(2, z);
        }
        boolean z2 = this.f71237f;
        if (z2) {
            nVar.mo37897D(3, z2);
        }
        int i = this.f71238g;
        C109629f fVar = C109629f.PbDefault;
        if (i != fVar.getNumber()) {
            nVar.mo37907N(4, this.f71238g);
        }
        if (this.f71239h != fVar.getNumber()) {
            nVar.mo37907N(5, this.f71239h);
        }
        float f2 = this.f71240i;
        if (f2 != 0.0f) {
            nVar.mo37906M(6, f2);
        }
        float f3 = this.f71241j;
        if (f3 != 0.0f) {
            nVar.mo37906M(7, f3);
        }
        int i2 = this.f71242n;
        if (i2 != 0) {
            nVar.mo37907N(8, i2);
        }
        int i3 = this.f71243o;
        if (i3 != 0) {
            nVar.mo37907N(9, i3);
        }
        boolean z3 = this.f71244p;
        if (z3) {
            nVar.mo37897D(10, z3);
        }
        long j = this.f71245q;
        if (j != 0) {
            nVar.mo37919Z(11, j);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168788getDefaultInstanceForType() {
        return f71233s;
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168789newBuilderForType() {
        return f71233s.toBuilder();
    }

    public C25007m() {
        this.f71246r = -1;
        this.f71238g = 0;
        this.f71239h = 0;
    }

    public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
        return new C25009b(cVar);
    }
}
