package l10;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23813c;
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

/* renamed from: l10.h */
public final class C24931h {

    /* renamed from: a */
    public static final C24025t.C24027b f71034a;

    /* renamed from: b */
    public static final C23872m0.C23880f f71035b;

    /* renamed from: c */
    public static final C24025t.C24027b f71036c;

    /* renamed from: d */
    public static final C23872m0.C23880f f71037d;

    /* renamed from: e */
    public static final C24025t.C24027b f71038e;

    /* renamed from: f */
    public static final C23872m0.C23880f f71039f;

    /* renamed from: g */
    public static final C24025t.C24027b f71040g;

    /* renamed from: h */
    public static final C23872m0.C23880f f71041h;

    /* renamed from: i */
    public static final C24025t.C24027b f71042i;

    /* renamed from: j */
    public static final C23872m0.C23880f f71043j;

    /* renamed from: k */
    public static final C24025t.C24027b f71044k;

    /* renamed from: l */
    public static final C23872m0.C23880f f71045l;

    /* renamed from: m */
    public static C24025t.C24038h f71046m;

    /* renamed from: l10.h$a */
    public static final class C24932a extends C23872m0 implements C23896m1 {

        /* renamed from: n */
        public static final C24932a f71047n = new C24932a();
        @Deprecated

        /* renamed from: o */
        public static final C24062w1<C24932a> f71048o = new C24933a();

        /* renamed from: d */
        public int f71049d;

        /* renamed from: e */
        public int f71050e;

        /* renamed from: f */
        public volatile Object f71051f;

        /* renamed from: g */
        public volatile Object f71052g;

        /* renamed from: h */
        public C24947f f71053h;

        /* renamed from: i */
        public boolean f71054i;

        /* renamed from: j */
        public byte f71055j;

        /* renamed from: l10.h$a$a */
        public class C24933a extends C23813c<C24932a> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24932a aVar = new C24932a();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                aVar.f71049d |= 1;
                                aVar.f71050e = lVar.mo37775t();
                            } else if (F == 18) {
                                C16994k m = lVar.mo37768m();
                                aVar.f71049d |= 2;
                                aVar.f71051f = m;
                            } else if (F == 26) {
                                C16994k m2 = lVar.mo37768m();
                                aVar.f71049d |= 4;
                                aVar.f71052g = m2;
                            } else if (F == 34) {
                                C24947f.C24949b bVar = null;
                                if ((aVar.f71049d & 8) != 0) {
                                    bVar = aVar.f71053h.toBuilder();
                                }
                                C24947f fVar = (C24947f) lVar.mo37777v(C24947f.f71101n, a0Var);
                                aVar.f71053h = fVar;
                                if (bVar != null) {
                                    bVar.mo51995f(fVar);
                                    aVar.f71053h = bVar.buildPartial();
                                }
                                aVar.f71049d |= 8;
                            } else if (F == 40) {
                                aVar.f71049d |= 16;
                                aVar.f71054i = lVar.mo37767l();
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

        /* renamed from: l10.h$a$b */
        public static final class C24934b extends C23872m0.C23874b<C24934b> implements C23896m1 {

            /* renamed from: d */
            public int f71056d;

            /* renamed from: e */
            public int f71057e;

            /* renamed from: f */
            public Object f71058f = "";

            /* renamed from: g */
            public Object f71059g = "";

            /* renamed from: h */
            public C24947f f71060h;

            /* renamed from: i */
            public C23844i2<C24947f, C24947f.C24949b, Object> f71061i;

            /* renamed from: j */
            public boolean f71062j;

            public C24934b() {
                maybeForceBuilderInitialization();
            }

            /* renamed from: a */
            public C24932a buildPartial() {
                C24932a aVar = new C24932a(this);
                int i = this.f71056d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    aVar.f71050e = this.f71057e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                aVar.f71051f = this.f71058f;
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                aVar.f71052g = this.f71059g;
                if ((i & 8) != 0) {
                    C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71061i;
                    if (i2Var == null) {
                        aVar.f71053h = this.f71060h;
                    } else {
                        aVar.f71053h = i2Var.mo37703b();
                    }
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    aVar.f71054i = this.f71062j;
                    i2 |= 16;
                }
                aVar.f71049d = i2;
                onBuilt();
                return aVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168594addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24934b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24934b mo51949b() {
                super.clear();
                this.f71057e = 0;
                this.f71058f = "";
                this.f71059g = "";
                this.f71056d = this.f71056d & -2 & -3 & -5;
                C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71061i;
                if (i2Var == null) {
                    this.f71060h = null;
                } else {
                    i2Var.mo37704c();
                }
                this.f71062j = false;
                this.f71056d = this.f71056d & -9 & -17;
                return this;
            }

            public C23836g1 build() {
                C24932a a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24934b clone() {
                return (C24934b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168596clearField(C24025t.C24035g gVar) {
                return (C24934b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24934b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public C24947f mo51951d() {
                C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71061i;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                C24947f fVar = this.f71060h;
                return fVar == null ? C24947f.f71100j : fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24931h.C24932a.C24934b mo51952e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.h$a> r0 = l10.C24931h.C24932a.f71048o     // Catch:{ p0 -> 0x0010 }
                    l10.h$a$a r0 = (l10.C24931h.C24932a.C24933a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.h$a r2 = (l10.C24931h.C24932a) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51953f(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.h$a r3 = (l10.C24931h.C24932a) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51953f(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24931h.C24932a.C24934b.mo51952e(com.google.protobuf.l, com.google.protobuf.a0):l10.h$a$b");
            }

            /* renamed from: f */
            public C24934b mo51953f(C24932a aVar) {
                C24947f fVar;
                C24947f fVar2;
                if (aVar == C24932a.f71047n) {
                    return this;
                }
                if (aVar.mo51943e()) {
                    int i = aVar.f71050e;
                    this.f71056d |= 1;
                    this.f71057e = i;
                    onChanged();
                }
                if (aVar.hasFrameSetName()) {
                    this.f71056d |= 2;
                    this.f71058f = aVar.f71051f;
                    onChanged();
                }
                if (aVar.mo51941c()) {
                    this.f71056d |= 4;
                    this.f71059g = aVar.f71052g;
                    onChanged();
                }
                if (aVar.hasPosition()) {
                    C24947f b = aVar.mo51940b();
                    C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71061i;
                    if (i2Var == null) {
                        if ((this.f71056d & 8) == 0 || (fVar = this.f71060h) == null || fVar == (fVar2 = C24947f.f71100j)) {
                            this.f71060h = b;
                        } else {
                            C24947f.C24949b c = fVar2.toBuilder();
                            c.mo51995f(fVar);
                            c.mo51995f(b);
                            this.f71060h = c.buildPartial();
                        }
                        onChanged();
                    } else {
                        i2Var.mo37708g(b);
                    }
                    this.f71056d |= 8;
                }
                if (aVar.mo51942d()) {
                    boolean z = aVar.f71054i;
                    this.f71056d |= 16;
                    this.f71062j = z;
                    onChanged();
                }
                C24934b bVar = (C24934b) super.mergeUnknownFields(aVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24932a.f71047n;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24931h.f71042i;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24931h.f71043j;
                fVar.mo37875c(C24932a.class, C24934b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                int i = this.f71056d;
                if (!((i & 1) != 0)) {
                    return false;
                }
                if (!((i & 2) != 0)) {
                    return false;
                }
                if (!((i & 4) != 0)) {
                    return false;
                }
                if (!((i & 8) != 0)) {
                    return false;
                }
                return ((i & 16) != 0) && mo51951d().isInitialized();
            }

            public final void maybeForceBuilderInitialization() {
                C24932a aVar = C24932a.f71047n;
                if (C23872m0.alwaysUseFieldBuilders && this.f71061i == null) {
                    this.f71061i = new C23844i2<>(mo51951d(), getParentForChildren(), isClean());
                    this.f71060h = null;
                }
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24934b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168603setField(C24025t.C24035g gVar, Object obj) {
                return (C24934b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168604setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24934b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168605setUnknownFields(C24020s2 s2Var) {
                return (C24934b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24934b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24934b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168598clearOneof(C24025t.C24042k kVar) {
                return (C24934b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168599getDefaultInstanceForType() {
                return C24932a.f71047n;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168602mergeUnknownFields(C24020s2 s2Var) {
                return (C24934b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24934b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24934b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24934b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168597clearOneof(C24025t.C24042k kVar) {
                return (C24934b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168601mergeUnknownFields(C24020s2 s2Var) {
                return (C24934b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168595build() {
                C24932a a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C24934b(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24932a) {
                    mo51953f((C24932a) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168600mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24932a) {
                    mo51953f((C24932a) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24932a(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f71055j = -1;
        }

        /* renamed from: a */
        public String mo51939a() {
            Object obj = this.f71052g;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f71052g = u;
            }
            return u;
        }

        /* renamed from: b */
        public C24947f mo51940b() {
            C24947f fVar = this.f71053h;
            return fVar == null ? C24947f.f71100j : fVar;
        }

        /* renamed from: c */
        public boolean mo51941c() {
            return (this.f71049d & 4) != 0;
        }

        /* renamed from: d */
        public boolean mo51942d() {
            return (this.f71049d & 16) != 0;
        }

        /* renamed from: e */
        public boolean mo51943e() {
            return (this.f71049d & 1) != 0;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24932a)) {
                return super.equals(obj);
            }
            C24932a aVar = (C24932a) obj;
            if (mo51943e() != aVar.mo51943e()) {
                return false;
            }
            if ((mo51943e() && this.f71050e != aVar.f71050e) || hasFrameSetName() != aVar.hasFrameSetName()) {
                return false;
            }
            if ((hasFrameSetName() && !getFrameSetName().equals(aVar.getFrameSetName())) || mo51941c() != aVar.mo51941c()) {
                return false;
            }
            if ((mo51941c() && !mo51939a().equals(aVar.mo51939a())) || hasPosition() != aVar.hasPosition()) {
                return false;
            }
            if ((!hasPosition() || mo51940b().equals(aVar.mo51940b())) && mo51942d() == aVar.mo51942d()) {
                return (!mo51942d() || this.f71054i == aVar.f71054i) && this.unknownFields.equals(aVar.unknownFields);
            }
            return false;
        }

        /* renamed from: f */
        public C24934b toBuilder() {
            if (this == f71047n) {
                return new C24934b();
            }
            C24934b bVar = new C24934b();
            bVar.mo51953f(this);
            return bVar;
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71047n;
        }

        public String getFrameSetName() {
            Object obj = this.f71051f;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f71051f = u;
            }
            return u;
        }

        public C24062w1<C24932a> getParserForType() {
            return f71048o;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71049d & 1) != 0) {
                i2 = 0 + C23897n.m29266k(1, this.f71050e);
            }
            if ((this.f71049d & 2) != 0) {
                i2 += C23872m0.computeStringSize(2, this.f71051f);
            }
            if ((this.f71049d & 4) != 0) {
                i2 += C23872m0.computeStringSize(3, this.f71052g);
            }
            if ((this.f71049d & 8) != 0) {
                i2 += C23897n.m29270o(4, mo51940b());
            }
            if ((this.f71049d & 16) != 0) {
                i2 += C23897n.m29257b(5, this.f71054i);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasFrameSetName() {
            return (this.f71049d & 2) != 0;
        }

        public boolean hasPosition() {
            return (this.f71049d & 8) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + C24931h.f71042i.hashCode();
            if (mo51943e()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.f71050e;
            }
            if (hasFrameSetName()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getFrameSetName().hashCode();
            }
            if (mo51941c()) {
                hashCode = (((hashCode * 37) + 3) * 53) + mo51939a().hashCode();
            }
            if (hasPosition()) {
                hashCode = (((hashCode * 37) + 4) * 53) + mo51940b().hashCode();
            }
            if (mo51942d()) {
                hashCode = (((hashCode * 37) + 5) * 53) + C23908o0.m29423a(this.f71054i);
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24931h.f71043j;
            fVar.mo37875c(C24932a.class, C24934b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71055j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo51943e()) {
                this.f71055j = 0;
                return false;
            } else if (!hasFrameSetName()) {
                this.f71055j = 0;
                return false;
            } else if (!mo51941c()) {
                this.f71055j = 0;
                return false;
            } else if (!hasPosition()) {
                this.f71055j = 0;
                return false;
            } else if (!mo51942d()) {
                this.f71055j = 0;
                return false;
            } else if (!mo51940b().isInitialized()) {
                this.f71055j = 0;
                return false;
            } else {
                this.f71055j = 1;
                return true;
            }
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71047n.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24932a();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71049d & 1) != 0) {
                nVar.mo37907N(1, this.f71050e);
            }
            if ((this.f71049d & 2) != 0) {
                C23872m0.writeString(nVar, 2, this.f71051f);
            }
            if ((this.f71049d & 4) != 0) {
                C23872m0.writeString(nVar, 3, this.f71052g);
            }
            if ((this.f71049d & 8) != 0) {
                nVar.mo37909P(4, mo51940b());
            }
            if ((this.f71049d & 16) != 0) {
                nVar.mo37897D(5, this.f71054i);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168592getDefaultInstanceForType() {
            return f71047n;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168593newBuilderForType() {
            return f71047n.toBuilder();
        }

        public C24932a() {
            this.f71055j = -1;
            this.f71051f = "";
            this.f71052g = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24934b(cVar);
        }
    }

    /* renamed from: l10.h$b */
    public static final class C24935b extends C23872m0 implements C23896m1 {

        /* renamed from: h */
        public static final C24935b f71063h = new C24935b();
        @Deprecated

        /* renamed from: i */
        public static final C24062w1<C24935b> f71064i = new C24936a();

        /* renamed from: d */
        public int f71065d;

        /* renamed from: e */
        public int f71066e;

        /* renamed from: f */
        public int f71067f;

        /* renamed from: g */
        public byte f71068g = -1;

        /* renamed from: l10.h$b$a */
        public class C24936a extends C23813c<C24935b> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24935b bVar = new C24935b();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                bVar.f71065d |= 1;
                                bVar.f71066e = lVar.mo37775t();
                            } else if (F == 16) {
                                bVar.f71065d |= 2;
                                bVar.f71067f = lVar.mo37775t();
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

        /* renamed from: l10.h$b$b */
        public static final class C24937b extends C23872m0.C23874b<C24937b> implements C23896m1 {

            /* renamed from: d */
            public int f71069d;

            /* renamed from: e */
            public int f71070e;

            /* renamed from: f */
            public int f71071f;

            public C24937b() {
                C24935b bVar = C24935b.f71063h;
            }

            /* renamed from: a */
            public C24935b buildPartial() {
                C24935b bVar = new C24935b(this);
                int i = this.f71069d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    bVar.f71066e = this.f71070e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    bVar.f71067f = this.f71071f;
                    i2 |= 2;
                }
                bVar.f71065d = i2;
                onBuilt();
                return bVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168608addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24937b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24937b mo51957b() {
                super.clear();
                this.f71070e = 0;
                this.f71071f = 0;
                this.f71069d = this.f71069d & -2 & -3;
                return this;
            }

            public C23836g1 build() {
                C24935b a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24937b clone() {
                return (C24937b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168610clearField(C24025t.C24035g gVar) {
                return (C24937b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24937b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24931h.C24935b.C24937b mo51959d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.h$b> r0 = l10.C24931h.C24935b.f71064i     // Catch:{ p0 -> 0x0010 }
                    l10.h$b$a r0 = (l10.C24931h.C24935b.C24936a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.h$b r2 = (l10.C24931h.C24935b) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51960e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.h$b r3 = (l10.C24931h.C24935b) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51960e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24931h.C24935b.C24937b.mo51959d(com.google.protobuf.l, com.google.protobuf.a0):l10.h$b$b");
            }

            /* renamed from: e */
            public C24937b mo51960e(C24935b bVar) {
                if (bVar == C24935b.f71063h) {
                    return this;
                }
                boolean z = true;
                if ((bVar.f71065d & 1) != 0) {
                    int i = bVar.f71066e;
                    this.f71069d |= 1;
                    this.f71070e = i;
                    onChanged();
                }
                if ((bVar.f71065d & 2) == 0) {
                    z = false;
                }
                if (z) {
                    int i2 = bVar.f71067f;
                    this.f71069d |= 2;
                    this.f71071f = i2;
                    onChanged();
                }
                C24937b bVar2 = (C24937b) super.mergeUnknownFields(bVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24935b.f71063h;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24931h.f71036c;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24931h.f71037d;
                fVar.mo37875c(C24935b.class, C24937b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24937b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168617setField(C24025t.C24035g gVar, Object obj) {
                return (C24937b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168618setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24937b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168619setUnknownFields(C24020s2 s2Var) {
                return (C24937b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24937b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24937b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168612clearOneof(C24025t.C24042k kVar) {
                return (C24937b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168613getDefaultInstanceForType() {
                return C24935b.f71063h;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168616mergeUnknownFields(C24020s2 s2Var) {
                return (C24937b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24937b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24937b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24937b) super.setUnknownFields(s2Var);
            }

            public C24937b(C23872m0.C23876c cVar) {
                super(cVar);
                C24935b bVar = C24935b.f71063h;
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168611clearOneof(C24025t.C24042k kVar) {
                return (C24937b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168615mergeUnknownFields(C24020s2 s2Var) {
                return (C24937b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168609build() {
                C24935b a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24935b) {
                    mo51960e((C24935b) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168614mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24935b) {
                    mo51960e((C24935b) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24935b(C23872m0.C23874b<?> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public C24937b toBuilder() {
            if (this == f71063h) {
                return new C24937b();
            }
            C24937b bVar = new C24937b();
            bVar.mo51960e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24935b)) {
                return super.equals(obj);
            }
            C24935b bVar = (C24935b) obj;
            int i = this.f71065d;
            boolean z = (i & 1) != 0;
            int i2 = bVar.f71065d;
            if (z != ((i2 & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && this.f71066e != bVar.f71066e) {
                return false;
            }
            if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                return false;
            }
            return (!((i & 2) != 0) || this.f71067f == bVar.f71067f) && this.unknownFields.equals(bVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71063h;
        }

        public C24062w1<C24935b> getParserForType() {
            return f71064i;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71065d & 1) != 0) {
                i2 = 0 + C23897n.m29266k(1, this.f71066e);
            }
            if ((this.f71065d & 2) != 0) {
                i2 += C23897n.m29266k(2, this.f71067f);
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
            int hashCode = C24931h.f71036c.hashCode() + C82986r.CTRL_INDEX;
            int i2 = this.f71065d;
            boolean z = false;
            if ((i2 & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.f71066e;
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.f71067f;
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24931h.f71037d;
            fVar.mo37875c(C24935b.class, C24937b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71068g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f71068g = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71063h.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24935b();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71065d & 1) != 0) {
                nVar.mo37907N(1, this.f71066e);
            }
            if ((this.f71065d & 2) != 0) {
                nVar.mo37907N(2, this.f71067f);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168606getDefaultInstanceForType() {
            return f71063h;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168607newBuilderForType() {
            return f71063h.toBuilder();
        }

        public C24935b() {
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24937b(cVar);
        }
    }

    /* renamed from: l10.h$c */
    public static final class C24938c extends C23872m0 implements C23896m1 {

        /* renamed from: h */
        public static final C24938c f71072h = new C24938c();
        @Deprecated

        /* renamed from: i */
        public static final C24062w1<C24938c> f71073i = new C24939a();

        /* renamed from: d */
        public int f71074d;

        /* renamed from: e */
        public boolean f71075e;

        /* renamed from: f */
        public int f71076f;

        /* renamed from: g */
        public byte f71077g = -1;

        /* renamed from: l10.h$c$a */
        public class C24939a extends C23813c<C24938c> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24938c cVar = new C24938c();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                cVar.f71074d |= 1;
                                cVar.f71075e = lVar.mo37767l();
                            } else if (F == 16) {
                                cVar.f71074d |= 2;
                                cVar.f71076f = lVar.mo37775t();
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

        /* renamed from: l10.h$c$b */
        public static final class C24940b extends C23872m0.C23874b<C24940b> implements C23896m1 {

            /* renamed from: d */
            public int f71078d;

            /* renamed from: e */
            public boolean f71079e;

            /* renamed from: f */
            public int f71080f;

            public C24940b() {
                C24938c cVar = C24938c.f71072h;
            }

            /* renamed from: a */
            public C24938c build() {
                C24938c b = buildPartial();
                if (b.isInitialized()) {
                    return b;
                }
                throw C23803a.C23804a.newUninitializedMessageException(b);
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168622addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24940b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24938c buildPartial() {
                C24938c cVar = new C24938c(this);
                int i = this.f71078d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    cVar.f71075e = this.f71079e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    cVar.f71076f = this.f71080f;
                    i2 |= 2;
                }
                cVar.f71074d = i2;
                onBuilt();
                return cVar;
            }

            /* renamed from: c */
            public C24940b mo51964c() {
                super.clear();
                this.f71079e = false;
                this.f71080f = 0;
                this.f71078d = this.f71078d & -2 & -3;
                return this;
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168623clearField(C24025t.C24035g gVar) {
                return (C24940b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24940b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public C24940b clone() {
                return (C24940b) super.clone();
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24931h.C24938c.C24940b mo51966e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.h$c> r0 = l10.C24931h.C24938c.f71073i     // Catch:{ p0 -> 0x0010 }
                    l10.h$c$a r0 = (l10.C24931h.C24938c.C24939a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.h$c r2 = (l10.C24931h.C24938c) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51967f(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.h$c r3 = (l10.C24931h.C24938c) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51967f(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24931h.C24938c.C24940b.mo51966e(com.google.protobuf.l, com.google.protobuf.a0):l10.h$c$b");
            }

            /* renamed from: f */
            public C24940b mo51967f(C24938c cVar) {
                if (cVar == C24938c.f71072h) {
                    return this;
                }
                boolean z = true;
                if ((cVar.f71074d & 1) != 0) {
                    boolean z2 = cVar.f71075e;
                    this.f71078d |= 1;
                    this.f71079e = z2;
                    onChanged();
                }
                if ((cVar.f71074d & 2) == 0) {
                    z = false;
                }
                if (z) {
                    int i = cVar.f71076f;
                    this.f71078d |= 2;
                    this.f71080f = i;
                    onChanged();
                }
                C24940b bVar = (C24940b) super.mergeUnknownFields(cVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24938c.f71072h;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24931h.f71034a;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24931h.f71035b;
                fVar.mo37875c(C24938c.class, C24940b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24940b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168630setField(C24025t.C24035g gVar, Object obj) {
                return (C24940b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168631setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24940b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168632setUnknownFields(C24020s2 s2Var) {
                return (C24940b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24940b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24940b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168625clearOneof(C24025t.C24042k kVar) {
                return (C24940b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168626getDefaultInstanceForType() {
                return C24938c.f71072h;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168629mergeUnknownFields(C24020s2 s2Var) {
                return (C24940b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24940b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24940b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24940b) super.setUnknownFields(s2Var);
            }

            public C24940b(C23872m0.C23876c cVar) {
                super(cVar);
                C24938c cVar2 = C24938c.f71072h;
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168624clearOneof(C24025t.C24042k kVar) {
                return (C24940b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168628mergeUnknownFields(C24020s2 s2Var) {
                return (C24940b) super.mergeUnknownFields(s2Var);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24938c) {
                    mo51967f((C24938c) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168627mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24938c) {
                    mo51967f((C24938c) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24938c(C23872m0.C23874b<?> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public C24940b toBuilder() {
            if (this == f71072h) {
                return new C24940b();
            }
            C24940b bVar = new C24940b();
            bVar.mo51967f(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24938c)) {
                return super.equals(obj);
            }
            C24938c cVar = (C24938c) obj;
            int i = this.f71074d;
            boolean z = (i & 1) != 0;
            int i2 = cVar.f71074d;
            if (z != ((i2 & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && this.f71075e != cVar.f71075e) {
                return false;
            }
            if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                return false;
            }
            return (!((i & 2) != 0) || this.f71076f == cVar.f71076f) && this.unknownFields.equals(cVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71072h;
        }

        public C24062w1<C24938c> getParserForType() {
            return f71073i;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71074d & 1) != 0) {
                i2 = 0 + C23897n.m29257b(1, this.f71075e);
            }
            if ((this.f71074d & 2) != 0) {
                i2 += C23897n.m29266k(2, this.f71076f);
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
            int hashCode = C24931h.f71034a.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if ((this.f71074d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + C23908o0.m29423a(this.f71075e);
            }
            if ((this.f71074d & 2) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.f71076f;
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24931h.f71035b;
            fVar.mo37875c(C24938c.class, C24940b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71077g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f71077g = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71072h.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24938c();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71074d & 1) != 0) {
                nVar.mo37897D(1, this.f71075e);
            }
            if ((this.f71074d & 2) != 0) {
                nVar.mo37907N(2, this.f71076f);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168620getDefaultInstanceForType() {
            return f71072h;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168621newBuilderForType() {
            return f71072h.toBuilder();
        }

        public C24938c() {
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24940b(cVar);
        }
    }

    /* renamed from: l10.h$d */
    public static final class C24941d extends C23872m0 implements C23896m1 {

        /* renamed from: g */
        public static final C24941d f71081g = new C24941d();
        @Deprecated

        /* renamed from: h */
        public static final C24062w1<C24941d> f71082h = new C24942a();

        /* renamed from: d */
        public int f71083d;

        /* renamed from: e */
        public volatile Object f71084e;

        /* renamed from: f */
        public byte f71085f;

        /* renamed from: l10.h$d$a */
        public class C24942a extends C23813c<C24941d> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24941d dVar = new C24941d();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 10) {
                                C16994k m = lVar.mo37768m();
                                dVar.f71083d |= 1;
                                dVar.f71084e = m;
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

        /* renamed from: l10.h$d$b */
        public static final class C24943b extends C23872m0.C23874b<C24943b> implements C23896m1 {

            /* renamed from: d */
            public int f71086d;

            /* renamed from: e */
            public Object f71087e = "";

            public C24943b() {
                C24941d dVar = C24941d.f71081g;
            }

            /* renamed from: a */
            public C24941d buildPartial() {
                C24941d dVar = new C24941d(this);
                int i = 0;
                if ((this.f71086d & 1) != 0) {
                    i = 1;
                }
                dVar.f71084e = this.f71087e;
                dVar.f71083d = i;
                onBuilt();
                return dVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168635addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24943b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24943b mo51971b() {
                super.clear();
                this.f71087e = "";
                this.f71086d &= -2;
                return this;
            }

            public C23836g1 build() {
                C24941d a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24943b clone() {
                return (C24943b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168637clearField(C24025t.C24035g gVar) {
                return (C24943b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24943b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24931h.C24941d.C24943b mo51973d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.h$d> r0 = l10.C24931h.C24941d.f71082h     // Catch:{ p0 -> 0x0010 }
                    l10.h$d$a r0 = (l10.C24931h.C24941d.C24942a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.h$d r2 = (l10.C24931h.C24941d) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51974e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.h$d r3 = (l10.C24931h.C24941d) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51974e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24931h.C24941d.C24943b.mo51973d(com.google.protobuf.l, com.google.protobuf.a0):l10.h$d$b");
            }

            /* renamed from: e */
            public C24943b mo51974e(C24941d dVar) {
                if (dVar == C24941d.f71081g) {
                    return this;
                }
                if ((dVar.f71083d & 1) != 0) {
                    this.f71086d |= 1;
                    this.f71087e = dVar.f71084e;
                    onChanged();
                }
                C24943b bVar = (C24943b) super.mergeUnknownFields(dVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24941d.f71081g;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24931h.f71038e;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24931h.f71039f;
                fVar.mo37875c(C24941d.class, C24943b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24943b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168644setField(C24025t.C24035g gVar, Object obj) {
                return (C24943b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168645setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24943b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168646setUnknownFields(C24020s2 s2Var) {
                return (C24943b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24943b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24943b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168639clearOneof(C24025t.C24042k kVar) {
                return (C24943b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168640getDefaultInstanceForType() {
                return C24941d.f71081g;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168643mergeUnknownFields(C24020s2 s2Var) {
                return (C24943b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24943b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24943b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24943b) super.setUnknownFields(s2Var);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168638clearOneof(C24025t.C24042k kVar) {
                return (C24943b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168642mergeUnknownFields(C24020s2 s2Var) {
                return (C24943b) super.mergeUnknownFields(s2Var);
            }

            public C24943b(C23872m0.C23876c cVar) {
                super(cVar);
                C24941d dVar = C24941d.f71081g;
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168636build() {
                C24941d a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24941d) {
                    mo51974e((C24941d) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168641mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24941d) {
                    mo51974e((C24941d) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24941d(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.f71085f = -1;
        }

        /* renamed from: a */
        public C24943b toBuilder() {
            if (this == f71081g) {
                return new C24943b();
            }
            C24943b bVar = new C24943b();
            bVar.mo51974e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24941d)) {
                return super.equals(obj);
            }
            C24941d dVar = (C24941d) obj;
            int i = this.f71083d;
            if (((i & 1) != 0) != ((dVar.f71083d & 1) != 0)) {
                return false;
            }
            return (!((i & 1) != 0) || getSessionId().equals(dVar.getSessionId())) && this.unknownFields.equals(dVar.unknownFields);
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71081g;
        }

        public C24062w1<C24941d> getParserForType() {
            return f71082h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71083d & 1) != 0) {
                i2 = 0 + C23872m0.computeStringSize(1, this.f71084e);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public String getSessionId() {
            Object obj = this.f71084e;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f71084e = u;
            }
            return u;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C24931h.f71038e.hashCode() + C82986r.CTRL_INDEX;
            if ((this.f71083d & 1) != 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getSessionId().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24931h.f71039f;
            fVar.mo37875c(C24941d.class, C24943b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71085f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f71085f = 1;
            return true;
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71081g.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24941d();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71083d & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.f71084e);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168633getDefaultInstanceForType() {
            return f71081g;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168634newBuilderForType() {
            return f71081g.toBuilder();
        }

        public C24941d() {
            this.f71085f = -1;
            this.f71084e = "";
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24943b(cVar);
        }
    }

    /* renamed from: l10.h$e */
    public static final class C24944e extends C23872m0 implements C23896m1 {

        /* renamed from: i */
        public static final C24944e f71088i = new C24944e();
        @Deprecated

        /* renamed from: j */
        public static final C24062w1<C24944e> f71089j = new C24945a();

        /* renamed from: d */
        public int f71090d;

        /* renamed from: e */
        public int f71091e;

        /* renamed from: f */
        public boolean f71092f;

        /* renamed from: g */
        public C24947f f71093g;

        /* renamed from: h */
        public byte f71094h = -1;

        /* renamed from: l10.h$e$a */
        public class C24945a extends C23813c<C24944e> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24944e eVar = new C24944e();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                eVar.f71090d |= 1;
                                eVar.f71091e = lVar.mo37775t();
                            } else if (F == 16) {
                                eVar.f71090d |= 2;
                                eVar.f71092f = lVar.mo37767l();
                            } else if (F == 26) {
                                C24947f.C24949b bVar = null;
                                if ((eVar.f71090d & 4) != 0) {
                                    bVar = eVar.f71093g.toBuilder();
                                }
                                C24947f fVar = (C24947f) lVar.mo37777v(C24947f.f71101n, a0Var);
                                eVar.f71093g = fVar;
                                if (bVar != null) {
                                    bVar.mo51995f(fVar);
                                    eVar.f71093g = bVar.buildPartial();
                                }
                                eVar.f71090d |= 4;
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

        /* renamed from: l10.h$e$b */
        public static final class C24946b extends C23872m0.C23874b<C24946b> implements C23896m1 {

            /* renamed from: d */
            public int f71095d;

            /* renamed from: e */
            public int f71096e;

            /* renamed from: f */
            public boolean f71097f;

            /* renamed from: g */
            public C24947f f71098g;

            /* renamed from: h */
            public C23844i2<C24947f, C24947f.C24949b, Object> f71099h;

            public C24946b() {
                maybeForceBuilderInitialization();
            }

            /* renamed from: a */
            public C24944e buildPartial() {
                C24944e eVar = new C24944e(this);
                int i = this.f71095d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    eVar.f71091e = this.f71096e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    eVar.f71092f = this.f71097f;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71099h;
                    if (i2Var == null) {
                        eVar.f71093g = this.f71098g;
                    } else {
                        eVar.f71093g = i2Var.mo37703b();
                    }
                    i2 |= 4;
                }
                eVar.f71090d = i2;
                onBuilt();
                return eVar;
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168649addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24946b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24946b mo51980b() {
                super.clear();
                this.f71096e = 0;
                this.f71097f = false;
                this.f71095d = this.f71095d & -2 & -3;
                C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71099h;
                if (i2Var == null) {
                    this.f71098g = null;
                } else {
                    i2Var.mo37704c();
                }
                this.f71095d &= -5;
                return this;
            }

            public C23836g1 build() {
                C24944e a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            /* renamed from: c */
            public C24946b clone() {
                return (C24946b) super.clone();
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168651clearField(C24025t.C24035g gVar) {
                return (C24946b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24946b) super.clearOneof(kVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24931h.C24944e.C24946b mo51982d(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.h$e> r0 = l10.C24931h.C24944e.f71089j     // Catch:{ p0 -> 0x0010 }
                    l10.h$e$a r0 = (l10.C24931h.C24944e.C24945a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.h$e r2 = (l10.C24931h.C24944e) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51983e(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.h$e r3 = (l10.C24931h.C24944e) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51983e(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24931h.C24944e.C24946b.mo51982d(com.google.protobuf.l, com.google.protobuf.a0):l10.h$e$b");
            }

            /* renamed from: e */
            public C24946b mo51983e(C24944e eVar) {
                C24947f fVar;
                C24947f fVar2;
                if (eVar == C24944e.f71088i) {
                    return this;
                }
                boolean z = true;
                if (eVar.mo51976b()) {
                    int i = eVar.f71091e;
                    this.f71095d |= 1;
                    this.f71096e = i;
                    onChanged();
                }
                if ((eVar.f71090d & 2) == 0) {
                    z = false;
                }
                if (z) {
                    boolean z2 = eVar.f71092f;
                    this.f71095d |= 2;
                    this.f71097f = z2;
                    onChanged();
                }
                if (eVar.hasPosition()) {
                    C24947f a = eVar.mo51975a();
                    C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71099h;
                    if (i2Var == null) {
                        if ((this.f71095d & 4) == 0 || (fVar = this.f71098g) == null || fVar == (fVar2 = C24947f.f71100j)) {
                            this.f71098g = a;
                        } else {
                            C24947f.C24949b c = fVar2.toBuilder();
                            c.mo51995f(fVar);
                            c.mo51995f(a);
                            this.f71098g = c.buildPartial();
                        }
                        onChanged();
                    } else {
                        i2Var.mo37708g(a);
                    }
                    this.f71095d |= 4;
                }
                C24946b bVar = (C24946b) super.mergeUnknownFields(eVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24944e.f71088i;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24931h.f71044k;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24931h.f71045l;
                fVar.mo37875c(C24944e.class, C24946b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                C24947f fVar;
                int i = this.f71095d;
                if (!((i & 1) != 0)) {
                    return false;
                }
                if (!((i & 4) != 0)) {
                    return false;
                }
                C23844i2<C24947f, C24947f.C24949b, Object> i2Var = this.f71099h;
                if (i2Var == null) {
                    fVar = this.f71098g;
                    if (fVar == null) {
                        fVar = C24947f.f71100j;
                    }
                } else {
                    fVar = i2Var.mo37706e();
                }
                return fVar.isInitialized();
            }

            public final void maybeForceBuilderInitialization() {
                C23844i2<C24947f, C24947f.C24949b, Object> i2Var;
                C24947f fVar;
                C24944e eVar = C24944e.f71088i;
                if (C23872m0.alwaysUseFieldBuilders && (i2Var = this.f71099h) == null) {
                    if (i2Var == null) {
                        fVar = this.f71098g;
                        if (fVar == null) {
                            fVar = C24947f.f71100j;
                        }
                    } else {
                        fVar = i2Var.mo37706e();
                    }
                    this.f71099h = new C23844i2<>(fVar, getParentForChildren(), isClean());
                    this.f71098g = null;
                }
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24946b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168658setField(C24025t.C24035g gVar, Object obj) {
                return (C24946b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168659setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24946b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168660setUnknownFields(C24020s2 s2Var) {
                return (C24946b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24946b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24946b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168653clearOneof(C24025t.C24042k kVar) {
                return (C24946b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168654getDefaultInstanceForType() {
                return C24944e.f71088i;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168657mergeUnknownFields(C24020s2 s2Var) {
                return (C24946b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24946b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24946b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24946b) super.setUnknownFields(s2Var);
            }

            public C24946b(C23872m0.C23876c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168652clearOneof(C24025t.C24042k kVar) {
                return (C24946b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168656mergeUnknownFields(C24020s2 s2Var) {
                return (C24946b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: build  reason: collision with other method in class */
            public C23845j1 m168650build() {
                C24944e a = buildPartial();
                if (a.isInitialized()) {
                    return a;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24944e) {
                    mo51983e((C24944e) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168655mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24944e) {
                    mo51983e((C24944e) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24944e(C23872m0.C23874b<?> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public C24947f mo51975a() {
            C24947f fVar = this.f71093g;
            return fVar == null ? C24947f.f71100j : fVar;
        }

        /* renamed from: b */
        public boolean mo51976b() {
            return (this.f71090d & 1) != 0;
        }

        /* renamed from: c */
        public C24946b toBuilder() {
            if (this == f71088i) {
                return new C24946b();
            }
            C24946b bVar = new C24946b();
            bVar.mo51983e(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24944e)) {
                return super.equals(obj);
            }
            C24944e eVar = (C24944e) obj;
            if (mo51976b() != eVar.mo51976b()) {
                return false;
            }
            if (mo51976b() && this.f71091e != eVar.f71091e) {
                return false;
            }
            int i = this.f71090d;
            if (((i & 2) != 0) != ((eVar.f71090d & 2) != 0)) {
                return false;
            }
            if ((!((i & 2) != 0) || this.f71092f == eVar.f71092f) && hasPosition() == eVar.hasPosition()) {
                return (!hasPosition() || mo51975a().equals(eVar.mo51975a())) && this.unknownFields.equals(eVar.unknownFields);
            }
            return false;
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71088i;
        }

        public C24062w1<C24944e> getParserForType() {
            return f71089j;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71090d & 1) != 0) {
                i2 = 0 + C23897n.m29266k(1, this.f71091e);
            }
            if ((this.f71090d & 2) != 0) {
                i2 += C23897n.m29257b(2, this.f71092f);
            }
            if ((this.f71090d & 4) != 0) {
                i2 += C23897n.m29270o(3, mo51975a());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasPosition() {
            return (this.f71090d & 4) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C24931h.f71044k.hashCode() + C82986r.CTRL_INDEX;
            boolean z = true;
            if (mo51976b()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.f71091e;
            }
            if ((this.f71090d & 2) == 0) {
                z = false;
            }
            if (z) {
                hashCode = (((hashCode * 37) + 2) * 53) + C23908o0.m29423a(this.f71092f);
            }
            if (hasPosition()) {
                hashCode = (((hashCode * 37) + 3) * 53) + mo51975a().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24931h.f71045l;
            fVar.mo37875c(C24944e.class, C24946b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71094h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo51976b()) {
                this.f71094h = 0;
                return false;
            } else if (!hasPosition()) {
                this.f71094h = 0;
                return false;
            } else if (!mo51975a().isInitialized()) {
                this.f71094h = 0;
                return false;
            } else {
                this.f71094h = 1;
                return true;
            }
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71088i.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24944e();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71090d & 1) != 0) {
                nVar.mo37907N(1, this.f71091e);
            }
            if ((this.f71090d & 2) != 0) {
                nVar.mo37897D(2, this.f71092f);
            }
            if ((this.f71090d & 4) != 0) {
                nVar.mo37909P(3, mo51975a());
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168647getDefaultInstanceForType() {
            return f71088i;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168648newBuilderForType() {
            return f71088i.toBuilder();
        }

        public C24944e() {
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24946b(cVar);
        }
    }

    /* renamed from: l10.h$f */
    public static final class C24947f extends C23872m0 implements C23896m1 {

        /* renamed from: j */
        public static final C24947f f71100j = new C24947f();
        @Deprecated

        /* renamed from: n */
        public static final C24062w1<C24947f> f71101n = new C24948a();

        /* renamed from: d */
        public int f71102d;

        /* renamed from: e */
        public int f71103e;

        /* renamed from: f */
        public int f71104f;

        /* renamed from: g */
        public int f71105g;

        /* renamed from: h */
        public int f71106h;

        /* renamed from: i */
        public byte f71107i = -1;

        /* renamed from: l10.h$f$a */
        public class C24948a extends C23813c<C24947f> {
            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                C24947f fVar = new C24947f();
                a0Var.getClass();
                C24020s2.C24021a b = C24020s2.m29807b();
                boolean z = false;
                while (!z) {
                    try {
                        int F = lVar.mo37757F();
                        if (F != 0) {
                            if (F == 8) {
                                fVar.f71102d |= 1;
                                fVar.f71103e = lVar.mo37775t();
                            } else if (F == 16) {
                                fVar.f71102d |= 2;
                                fVar.f71104f = lVar.mo37775t();
                            } else if (F == 24) {
                                fVar.f71102d |= 4;
                                fVar.f71105g = lVar.mo37775t();
                            } else if (F == 32) {
                                fVar.f71102d |= 8;
                                fVar.f71106h = lVar.mo37775t();
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

        /* renamed from: l10.h$f$b */
        public static final class C24949b extends C23872m0.C23874b<C24949b> implements C23896m1 {

            /* renamed from: d */
            public int f71108d;

            /* renamed from: e */
            public int f71109e;

            /* renamed from: f */
            public int f71110f;

            /* renamed from: g */
            public int f71111g;

            /* renamed from: h */
            public int f71112h;

            public C24949b() {
                C24947f fVar = C24947f.f71100j;
            }

            /* renamed from: a */
            public C24947f build() {
                C24947f b = buildPartial();
                if (b.isInitialized()) {
                    return b;
                }
                throw C23803a.C23804a.newUninitializedMessageException(b);
            }

            /* renamed from: addRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168663addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24949b) super.addRepeatedField(gVar, obj);
            }

            /* renamed from: b */
            public C24947f buildPartial() {
                C24947f fVar = new C24947f(this);
                int i = this.f71108d;
                int i2 = 0;
                if ((i & 1) != 0) {
                    fVar.f71103e = this.f71109e;
                    i2 = 1;
                }
                if ((i & 2) != 0) {
                    fVar.f71104f = this.f71110f;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    fVar.f71105g = this.f71111g;
                    i2 |= 4;
                }
                if ((i & 8) != 0) {
                    fVar.f71106h = this.f71112h;
                    i2 |= 8;
                }
                fVar.f71102d = i2;
                onBuilt();
                return fVar;
            }

            /* renamed from: c */
            public C24949b mo51992c() {
                super.clear();
                this.f71109e = 0;
                this.f71110f = 0;
                this.f71111g = 0;
                this.f71112h = 0;
                this.f71108d = this.f71108d & -2 & -3 & -5 & -9;
                return this;
            }

            /* renamed from: clearField  reason: collision with other method in class */
            public C23872m0.C23874b m168664clearField(C24025t.C24035g gVar) {
                return (C24949b) super.clearField(gVar);
            }

            public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
                return (C24949b) super.clearOneof(kVar);
            }

            /* renamed from: d */
            public C24949b clone() {
                return (C24949b) super.clone();
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public l10.C24931h.C24947f.C24949b mo51994e(com.google.protobuf.C23856l r2, com.google.protobuf.C23806a0 r3) {
                /*
                    r1 = this;
                    com.google.protobuf.w1<l10.h$f> r0 = l10.C24931h.C24947f.f71101n     // Catch:{ p0 -> 0x0010 }
                    l10.h$f$a r0 = (l10.C24931h.C24947f.C24948a) r0     // Catch:{ p0 -> 0x0010 }
                    java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch:{ p0 -> 0x0010 }
                    l10.h$f r2 = (l10.C24931h.C24947f) r2     // Catch:{ p0 -> 0x0010 }
                    r1.mo51995f(r2)
                    return r1
                L_0x000e:
                    r2 = move-exception
                    goto L_0x001c
                L_0x0010:
                    r2 = move-exception
                    com.google.protobuf.j1 r3 = r2.f68530d     // Catch:{ all -> 0x000e }
                    l10.h$f r3 = (l10.C24931h.C24947f) r3     // Catch:{ all -> 0x000e }
                    java.io.IOException r2 = r2.mo38013j()     // Catch:{ all -> 0x001a }
                    throw r2     // Catch:{ all -> 0x001a }
                L_0x001a:
                    r2 = move-exception
                    goto L_0x001d
                L_0x001c:
                    r3 = 0
                L_0x001d:
                    if (r3 == 0) goto L_0x0022
                    r1.mo51995f(r3)
                L_0x0022:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.C24931h.C24947f.C24949b.mo51994e(com.google.protobuf.l, com.google.protobuf.a0):l10.h$f$b");
            }

            /* renamed from: f */
            public C24949b mo51995f(C24947f fVar) {
                if (fVar == C24947f.f71100j) {
                    return this;
                }
                if (fVar.mo51985a()) {
                    int i = fVar.f71103e;
                    this.f71108d |= 1;
                    this.f71109e = i;
                    onChanged();
                }
                if (fVar.mo51986b()) {
                    int i2 = fVar.f71104f;
                    this.f71108d |= 2;
                    this.f71110f = i2;
                    onChanged();
                }
                if (fVar.hasWidth()) {
                    int i3 = fVar.f71105g;
                    this.f71108d |= 4;
                    this.f71111g = i3;
                    onChanged();
                }
                if (fVar.hasHeight()) {
                    int i4 = fVar.f71106h;
                    this.f71108d |= 8;
                    this.f71112h = i4;
                    onChanged();
                }
                C24949b bVar = (C24949b) super.mergeUnknownFields(fVar.unknownFields);
                onChanged();
                return this;
            }

            public C23836g1 getDefaultInstanceForType() {
                return C24947f.f71100j;
            }

            public C24025t.C24027b getDescriptorForType() {
                return C24931h.f71040g;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f fVar = C24931h.f71041h;
                fVar.mo37875c(C24947f.class, C24949b.class);
                return fVar;
            }

            public final boolean isInitialized() {
                int i = this.f71108d;
                if (!((i & 1) != 0)) {
                    return false;
                }
                if (!((i & 2) != 0)) {
                    return false;
                }
                if (!((i & 4) != 0)) {
                    return false;
                }
                return (i & 8) != 0;
            }

            public C23803a.C23804a mergeUnknownFields(C24020s2 s2Var) {
                return (C24949b) super.mergeUnknownFields(s2Var);
            }

            /* renamed from: setField  reason: collision with other method in class */
            public C23872m0.C23874b m168671setField(C24025t.C24035g gVar, Object obj) {
                return (C24949b) super.setField(gVar, obj);
            }

            /* renamed from: setRepeatedField  reason: collision with other method in class */
            public C23872m0.C23874b m168672setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24949b) super.setRepeatedField(gVar, i, obj);
            }

            /* renamed from: setUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168673setUnknownFields(C24020s2 s2Var) {
                return (C24949b) super.setUnknownFields(s2Var);
            }

            public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (C24949b) super.addRepeatedField(gVar, obj);
            }

            public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
                return (C24949b) super.clearField(gVar);
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23872m0.C23874b m168666clearOneof(C24025t.C24042k kVar) {
                return (C24949b) super.clearOneof(kVar);
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public C23845j1 m168667getDefaultInstanceForType() {
                return C24947f.f71100j;
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23872m0.C23874b m168670mergeUnknownFields(C24020s2 s2Var) {
                return (C24949b) super.mergeUnknownFields(s2Var);
            }

            public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
                return (C24949b) super.setField(gVar, obj);
            }

            public C23836g1.C23837a setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (C24949b) super.setRepeatedField(gVar, i, obj);
            }

            public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
                return (C24949b) super.setUnknownFields(s2Var);
            }

            public C24949b(C23872m0.C23876c cVar) {
                super(cVar);
                C24947f fVar = C24947f.f71100j;
            }

            /* renamed from: clearOneof  reason: collision with other method in class */
            public C23836g1.C23837a m168665clearOneof(C24025t.C24042k kVar) {
                return (C24949b) super.clearOneof(kVar);
            }

            /* renamed from: mergeUnknownFields  reason: collision with other method in class */
            public C23836g1.C23837a m168669mergeUnknownFields(C24020s2 s2Var) {
                return (C24949b) super.mergeUnknownFields(s2Var);
            }

            public C23803a.C23804a mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24947f) {
                    mo51995f((C24947f) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public C23836g1.C23837a m168668mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof C24947f) {
                    mo51995f((C24947f) g1Var);
                } else {
                    super.mergeFrom(g1Var);
                }
                return this;
            }
        }

        public C24947f(C23872m0.C23874b<?> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public boolean mo51985a() {
            return (this.f71102d & 1) != 0;
        }

        /* renamed from: b */
        public boolean mo51986b() {
            return (this.f71102d & 2) != 0;
        }

        /* renamed from: c */
        public C24949b toBuilder() {
            if (this == f71100j) {
                return new C24949b();
            }
            C24949b bVar = new C24949b();
            bVar.mo51995f(this);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24947f)) {
                return super.equals(obj);
            }
            C24947f fVar = (C24947f) obj;
            if (mo51985a() != fVar.mo51985a()) {
                return false;
            }
            if ((mo51985a() && this.f71103e != fVar.f71103e) || mo51986b() != fVar.mo51986b()) {
                return false;
            }
            if ((mo51986b() && this.f71104f != fVar.f71104f) || hasWidth() != fVar.hasWidth()) {
                return false;
            }
            if ((!hasWidth() || this.f71105g == fVar.f71105g) && hasHeight() == fVar.hasHeight()) {
                return (!hasHeight() || this.f71106h == fVar.f71106h) && this.unknownFields.equals(fVar.unknownFields);
            }
            return false;
        }

        public C23836g1 getDefaultInstanceForType() {
            return f71100j;
        }

        public C24062w1<C24947f> getParserForType() {
            return f71101n;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f71102d & 1) != 0) {
                i2 = 0 + C23897n.m29266k(1, this.f71103e);
            }
            if ((this.f71102d & 2) != 0) {
                i2 += C23897n.m29266k(2, this.f71104f);
            }
            if ((this.f71102d & 4) != 0) {
                i2 += C23897n.m29266k(3, this.f71105g);
            }
            if ((this.f71102d & 8) != 0) {
                i2 += C23897n.m29266k(4, this.f71106h);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasHeight() {
            return (this.f71102d & 8) != 0;
        }

        public boolean hasWidth() {
            return (this.f71102d & 4) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + C24931h.f71040g.hashCode();
            if (mo51985a()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.f71103e;
            }
            if (mo51986b()) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.f71104f;
            }
            if (hasWidth()) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.f71105g;
            }
            if (hasHeight()) {
                hashCode = (((hashCode * 37) + 4) * 53) + this.f71106h;
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f fVar = C24931h.f71041h;
            fVar.mo37875c(C24947f.class, C24949b.class);
            return fVar;
        }

        public final boolean isInitialized() {
            byte b = this.f71107i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo51985a()) {
                this.f71107i = 0;
                return false;
            } else if (!mo51986b()) {
                this.f71107i = 0;
                return false;
            } else if (!hasWidth()) {
                this.f71107i = 0;
                return false;
            } else if (!hasHeight()) {
                this.f71107i = 0;
                return false;
            } else {
                this.f71107i = 1;
                return true;
            }
        }

        public C23836g1.C23837a newBuilderForType() {
            return f71100j.toBuilder();
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new C24947f();
        }

        public void writeTo(C23897n nVar) {
            if ((this.f71102d & 1) != 0) {
                nVar.mo37907N(1, this.f71103e);
            }
            if ((this.f71102d & 2) != 0) {
                nVar.mo37907N(2, this.f71104f);
            }
            if ((this.f71102d & 4) != 0) {
                nVar.mo37907N(3, this.f71105g);
            }
            if ((this.f71102d & 8) != 0) {
                nVar.mo37907N(4, this.f71106h);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168661getDefaultInstanceForType() {
            return f71100j;
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public C23845j1.C23846a m168662newBuilderForType() {
            return f71100j.toBuilder();
        }

        public C24947f() {
        }

        public C23836g1.C23837a newBuilderForType(C23872m0.C23876c cVar) {
            return new C24949b(cVar);
        }
    }

    static {
        C24025t.C24038h i = C24025t.C24038h.m29872i(new String[]{"\n\u0016magicbrush_brand.proto\u0012#com.tencent.mm.flutter.plugin.proto\"7\n\u0014MBApiPopupWindowInfo\u0012\f\n\u0004mask\u0018\u0001 \u0001(\b\u0012\u0011\n\tmaskColor\u0018\u0002 \u0001(\u0005\"B\n\fMBApiIntData\u0012\u001a\n\u0012popupDismissReason\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000eframeSetViewId\u0018\u0002 \u0001(\u0005\"!\n\fMBApiStrData\u0012\u0011\n\tsessionId\u0018\u0001 \u0001(\t\"N\n\u0012MBFrameSetPosition\u0012\f\n\u0004left\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003top\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005width\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006height\u0018\u0004 \u0002(\u0005\"ª\u0001\n\u0013MBApiInsertFrameSet\u0012\u000e\n\u0006viewId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fframeSetName\u0018\u0002 \u0002(\t\u0012\u0014\n\fcontainerTag\u0018\u0003 \u0002(\t\u0012I\n\bposition\u0018\u0004 \u0002(\u000b27.com.tencent.mm.flutter.plugin.proto.MBFrameSetPosition\u0012\f\n\u0004hide\u0018\u0005 \u0002(\b\"~\n\u0013MBApiUpdateFrameSet\u0012\u000e\n\u0006viewId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004hide\u0018\u0002 \u0001(\b\u0012I\n\bposition\u0018\u0003 \u0002(\u000b27.com.tencent.mm.flutter.plugin.proto.MBFrameSetPosition"}, new C24025t.C24038h[0]);
        f71046m = i;
        C24025t.C24027b bVar = i.mo38347g().get(0);
        f71034a = bVar;
        f71035b = new C23872m0.C23880f(bVar, new String[]{"Mask", "MaskColor"});
        C24025t.C24027b bVar2 = f71046m.mo38347g().get(1);
        f71036c = bVar2;
        f71037d = new C23872m0.C23880f(bVar2, new String[]{"PopupDismissReason", "FrameSetViewId"});
        C24025t.C24027b bVar3 = f71046m.mo38347g().get(2);
        f71038e = bVar3;
        f71039f = new C23872m0.C23880f(bVar3, new String[]{"SessionId"});
        C24025t.C24027b bVar4 = f71046m.mo38347g().get(3);
        f71040g = bVar4;
        f71041h = new C23872m0.C23880f(bVar4, new String[]{"Left", "Top", "Width", "Height"});
        C24025t.C24027b bVar5 = f71046m.mo38347g().get(4);
        f71042i = bVar5;
        f71043j = new C23872m0.C23880f(bVar5, new String[]{"ViewId", "FrameSetName", "ContainerTag", "Position", "Hide"});
        C24025t.C24027b bVar6 = f71046m.mo38347g().get(5);
        f71044k = bVar6;
        f71045l = new C23872m0.C23880f(bVar6, new String[]{"ViewId", "Hide", "Position"});
    }
}
