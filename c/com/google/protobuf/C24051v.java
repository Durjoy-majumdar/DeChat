package com.google.protobuf;

import com.google.protobuf.C23803a;
import com.google.protobuf.C23832g0;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.v */
public final class C24051v extends C23803a {

    /* renamed from: d */
    public final C24025t.C24027b f69170d;

    /* renamed from: e */
    public final C23832g0<C24025t.C24035g> f69171e;

    /* renamed from: f */
    public final C24025t.C24035g[] f69172f;

    /* renamed from: g */
    public final C24020s2 f69173g;

    /* renamed from: h */
    public int f69174h = -1;

    /* renamed from: com.google.protobuf.v$a */
    public class C24052a extends C23813c<C24051v> {
        public C24052a() {
        }

        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            C24053b bVar = new C24053b(C24051v.this.f69170d);
            try {
                bVar.mergeFrom(lVar, a0Var);
                return bVar.buildPartial();
            } catch (C23922p0 e) {
                e.f68530d = bVar.buildPartial();
                throw e;
            } catch (IOException e2) {
                C23922p0 p0Var = new C23922p0(e2);
                p0Var.f68530d = bVar.buildPartial();
                throw p0Var;
            }
        }
    }

    /* renamed from: com.google.protobuf.v$b */
    public static final class C24053b extends C23803a.C23804a<C24053b> {

        /* renamed from: d */
        public final C24025t.C24027b f69176d;

        /* renamed from: e */
        public C23832g0<C24025t.C24035g> f69177e = new C23832g0<>();

        /* renamed from: f */
        public final C24025t.C24035g[] f69178f;

        /* renamed from: g */
        public C24020s2 f69179g = C24020s2.f69054f;

        public C24053b(C24025t.C24027b bVar) {
            this.f69176d = bVar;
            this.f69178f = new C24025t.C24035g[bVar.f69069d.mo38046a()];
            if (bVar.mo38322k().f68912i) {
                mo38384h();
            }
        }

        /* renamed from: a */
        public C24051v build() {
            if (isInitialized()) {
                return buildPartial();
            }
            C24025t.C24027b bVar = this.f69176d;
            C23832g0<C24025t.C24035g> g0Var = this.f69177e;
            C24025t.C24035g[] gVarArr = this.f69178f;
            throw C23803a.C23804a.newUninitializedMessageException(new C24051v(bVar, g0Var, (C24025t.C24035g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f69179g));
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            mo38385j(gVar);
            mo38381e();
            this.f69177e.mo37636a(gVar, obj);
            return this;
        }

        /* renamed from: b */
        public C24051v buildPartial() {
            this.f69177e.mo37651u();
            C24025t.C24027b bVar = this.f69176d;
            C23832g0<C24025t.C24035g> g0Var = this.f69177e;
            C24025t.C24035g[] gVarArr = this.f69178f;
            return new C24051v(bVar, g0Var, (C24025t.C24035g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f69179g);
        }

        /* renamed from: c */
        public C24053b mo38379c() {
            C23832g0<C24025t.C24035g> g0Var = this.f69177e;
            if (g0Var.f68260b) {
                this.f69177e = new C23832g0<>();
            } else {
                g0Var.f68259a.clear();
                g0Var.f68261c = false;
            }
            if (this.f69176d.mo38322k().f68912i) {
                mo38384h();
            }
            this.f69179g = C24020s2.f69054f;
            return this;
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            mo38385j(gVar);
            mo38381e();
            C24025t.C24042k kVar = gVar.f69112p;
            if (kVar != null) {
                int i = kVar.f69146d;
                C24025t.C24035g[] gVarArr = this.f69178f;
                if (gVarArr[i] == gVar) {
                    gVarArr[i] = null;
                }
            }
            this.f69177e.mo37637b(gVar);
            return this;
        }

        public C23803a.C23804a clearOneof(C24025t.C24042k kVar) {
            if (kVar.f69150h == this.f69176d) {
                C24025t.C24035g gVar = this.f69178f[kVar.f69146d];
                if (gVar != null) {
                    mo38385j(gVar);
                    mo38381e();
                    C24025t.C24042k kVar2 = gVar.f69112p;
                    if (kVar2 != null) {
                        int i = kVar2.f69146d;
                        C24025t.C24035g[] gVarArr = this.f69178f;
                        if (gVarArr[i] == gVar) {
                            gVarArr[i] = null;
                        }
                    }
                    this.f69177e.mo37637b(gVar);
                }
                return this;
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        /* renamed from: d */
        public C24053b clone() {
            C24053b bVar = new C24053b(this.f69176d);
            bVar.f69177e.mo37652v(this.f69177e);
            bVar.mo38383g(this.f69179g);
            C24025t.C24035g[] gVarArr = this.f69178f;
            System.arraycopy(gVarArr, 0, bVar.f69178f, 0, gVarArr.length);
            return bVar;
        }

        /* renamed from: e */
        public final void mo38381e() {
            C23832g0<C24025t.C24035g> g0Var = this.f69177e;
            if (g0Var.f68260b) {
                this.f69177e = g0Var.clone();
            }
        }

        /* renamed from: f */
        public C24053b mergeFrom(C23836g1 g1Var) {
            if (!(g1Var instanceof C24051v)) {
                return (C24053b) super.mergeFrom(g1Var);
            }
            C24051v vVar = (C24051v) g1Var;
            if (vVar.f69170d == this.f69176d) {
                mo38381e();
                this.f69177e.mo37652v(vVar.f69171e);
                mo38383g(vVar.f69173g);
                int i = 0;
                while (true) {
                    C24025t.C24035g[] gVarArr = this.f69178f;
                    if (i >= gVarArr.length) {
                        return this;
                    }
                    C24025t.C24035g gVar = gVarArr[i];
                    if (gVar == null) {
                        gVarArr[i] = vVar.f69172f[i];
                    } else {
                        C24025t.C24035g gVar2 = vVar.f69172f[i];
                        if (!(gVar2 == null || gVar == gVar2)) {
                            this.f69177e.mo37637b(gVar);
                            this.f69178f[i] = vVar.f69172f[i];
                        }
                    }
                    i++;
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        }

        /* renamed from: g */
        public C24053b mo38383g(C24020s2 s2Var) {
            C24020s2 s2Var2 = this.f69179g;
            C24020s2.C24021a b = C24020s2.m29807b();
            b.mo38303f(s2Var2);
            b.mo38303f(s2Var);
            this.f69179g = b.build();
            return this;
        }

        public Map<C24025t.C24035g, Object> getAllFields() {
            return this.f69177e.mo37642j();
        }

        public C23836g1 getDefaultInstanceForType() {
            return C24051v.m29929a(this.f69176d);
        }

        public C24025t.C24027b getDescriptorForType() {
            return this.f69176d;
        }

        public Object getField(C24025t.C24035g gVar) {
            mo38385j(gVar);
            Object k = this.f69177e.mo37643k(gVar);
            return k == null ? gVar.mo37662E0() ? Collections.emptyList() : gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE ? C24051v.m29929a(gVar.mo38339h()) : gVar.mo38337f() : k;
        }

        public C23836g1.C23837a getFieldBuilder(C24025t.C24035g gVar) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
        }

        public C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar) {
            if (kVar.f69150h == this.f69176d) {
                return this.f69178f[kVar.f69146d];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public C23836g1.C23837a getRepeatedFieldBuilder(C24025t.C24035g gVar, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
        }

        public C24020s2 getUnknownFields() {
            return this.f69179g;
        }

        /* renamed from: h */
        public final void mo38384h() {
            for (C24025t.C24035g next : this.f69176d.mo38319h()) {
                if (next.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                    this.f69177e.mo37654x(next, C24051v.m29929a(next.mo38339h()));
                } else {
                    this.f69177e.mo37654x(next, next.mo38337f());
                }
            }
        }

        public boolean hasField(C24025t.C24035g gVar) {
            mo38385j(gVar);
            return this.f69177e.mo37647o(gVar);
        }

        public boolean hasOneof(C24025t.C24042k kVar) {
            if (kVar.f69150h == this.f69176d) {
                return this.f69178f[kVar.f69146d] != null;
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public boolean isInitialized() {
            return C24051v.m29930b(this.f69176d, this.f69177e);
        }

        /* renamed from: j */
        public final void mo38385j(C24025t.C24035g gVar) {
            if (gVar.f69110n != this.f69176d) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        public C23836g1.C23837a newBuilderForField(C24025t.C24035g gVar) {
            mo38385j(gVar);
            if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                return new C24053b(gVar.mo38339h());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            mo38385j(gVar);
            mo38381e();
            if (gVar.f69109j == C24025t.C24035g.C24037b.ENUM) {
                if (gVar.mo37662E0()) {
                    for (Object next : (List) obj) {
                        Charset charset = C23908o0.f68505a;
                        next.getClass();
                        if (!(next instanceof C24025t.C24034f)) {
                            throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                        }
                    }
                } else {
                    Charset charset2 = C23908o0.f68505a;
                    obj.getClass();
                    if (!(obj instanceof C24025t.C24034f)) {
                        throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                    }
                }
            }
            C24025t.C24042k kVar = gVar.f69112p;
            if (kVar != null) {
                int i = kVar.f69146d;
                C24025t.C24035g gVar2 = this.f69178f[i];
                if (!(gVar2 == null || gVar2 == gVar)) {
                    this.f69177e.mo37637b(gVar2);
                }
                this.f69178f[i] = gVar;
            } else if (gVar.f69106g.mo38348h() == C24025t.C24038h.C24039a.PROTO3 && !gVar.mo37662E0() && gVar.f69109j.f69132d != C24025t.C24035g.C24036a.MESSAGE && obj.equals(gVar.mo38337f())) {
                this.f69177e.mo37637b(gVar);
                return this;
            }
            this.f69177e.mo37654x(gVar, obj);
            return this;
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            this.f69179g = s2Var;
            return this;
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168472getDefaultInstanceForType() {
            return C24051v.m29929a(this.f69176d);
        }

        /* renamed from: clearOneof  reason: collision with other method in class */
        public C23836g1.C23837a m168471clearOneof(C24025t.C24042k kVar) {
            if (kVar.f69150h == this.f69176d) {
                C24025t.C24035g gVar = this.f69178f[kVar.f69146d];
                if (gVar != null) {
                    mo38385j(gVar);
                    mo38381e();
                    C24025t.C24042k kVar2 = gVar.f69112p;
                    if (kVar2 != null) {
                        int i = kVar2.f69146d;
                        C24025t.C24035g[] gVarArr = this.f69178f;
                        if (gVarArr[i] == gVar) {
                            gVarArr[i] = null;
                        }
                    }
                    this.f69177e.mo37637b(gVar);
                }
                return this;
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    public C24051v(C24025t.C24027b bVar, C23832g0<C24025t.C24035g> g0Var, C24025t.C24035g[] gVarArr, C24020s2 s2Var) {
        this.f69170d = bVar;
        this.f69171e = g0Var;
        this.f69172f = gVarArr;
        this.f69173g = s2Var;
    }

    /* renamed from: a */
    public static C24051v m29929a(C24025t.C24027b bVar) {
        return new C24051v(bVar, C23832g0.f68258d, new C24025t.C24035g[bVar.f69069d.mo38046a()], C24020s2.f69054f);
    }

    /* renamed from: b */
    public static boolean m29930b(C24025t.C24027b bVar, C23832g0<C24025t.C24035g> g0Var) {
        for (C24025t.C24035g next : bVar.mo38319h()) {
            if (next.mo38343l() && !g0Var.mo37647o(next)) {
                return false;
            }
        }
        return g0Var.mo37649q();
    }

    public Map<C24025t.C24035g, Object> getAllFields() {
        return this.f69171e.mo37642j();
    }

    public C23836g1 getDefaultInstanceForType() {
        return m29929a(this.f69170d);
    }

    public C24025t.C24027b getDescriptorForType() {
        return this.f69170d;
    }

    public Object getField(C24025t.C24035g gVar) {
        if (gVar.f69110n == this.f69170d) {
            Object k = this.f69171e.mo37643k(gVar);
            return k == null ? gVar.mo37662E0() ? Collections.emptyList() : gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE ? m29929a(gVar.mo38339h()) : gVar.mo38337f() : k;
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    public C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar) {
        if (kVar.f69150h == this.f69170d) {
            return this.f69172f[kVar.f69146d];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    public C24062w1<C24051v> getParserForType() {
        return new C24052a();
    }

    public int getSerializedSize() {
        int i;
        int i2;
        int i3 = this.f69174h;
        if (i3 != -1) {
            return i3;
        }
        if (this.f69170d.mo38322k().f68909f) {
            i2 = this.f69171e.mo37644l();
            i = this.f69173g.mo38291a();
        } else {
            i2 = this.f69171e.mo37646n();
            i = this.f69173g.getSerializedSize();
        }
        int i4 = i2 + i;
        this.f69174h = i4;
        return i4;
    }

    public C24020s2 getUnknownFields() {
        return this.f69173g;
    }

    public boolean hasField(C24025t.C24035g gVar) {
        if (gVar.f69110n == this.f69170d) {
            return this.f69171e.mo37647o(gVar);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    public boolean hasOneof(C24025t.C24042k kVar) {
        if (kVar.f69150h == this.f69170d) {
            return this.f69172f[kVar.f69146d] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    public boolean isInitialized() {
        return m29930b(this.f69170d, this.f69171e);
    }

    public C23836g1.C23837a newBuilderForType() {
        return new C24053b(this.f69170d);
    }

    public C23836g1.C23837a toBuilder() {
        return new C24053b(this.f69170d).mergeFrom(this);
    }

    public void writeTo(C23897n nVar) {
        int i = 0;
        if (this.f69170d.mo38322k().f68909f) {
            C23832g0<C24025t.C24035g> g0Var = this.f69171e;
            while (i < g0Var.f68259a.mo37720e()) {
                g0Var.mo37635B(g0Var.f68259a.mo37717c(i), nVar);
                i++;
            }
            for (Map.Entry<T, Object> B : g0Var.f68259a.mo37723f()) {
                g0Var.mo37635B(B, nVar);
            }
            this.f69173g.mo38292c(nVar);
            return;
        }
        C23832g0<C24025t.C24035g> g0Var2 = this.f69171e;
        while (i < g0Var2.f68259a.mo37720e()) {
            Map.Entry<T, Object> c = g0Var2.f68259a.mo37717c(i);
            C23832g0.m28829A((C23832g0.C23835c) c.getKey(), c.getValue(), nVar);
            i++;
        }
        for (Map.Entry next : g0Var2.f68259a.mo37723f()) {
            C23832g0.m28829A((C23832g0.C23835c) next.getKey(), next.getValue(), nVar);
        }
        this.f69173g.writeTo(nVar);
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168468getDefaultInstanceForType() {
        return m29929a(this.f69170d);
    }

    /* renamed from: newBuilderForType  reason: collision with other method in class */
    public C23845j1.C23846a m168469newBuilderForType() {
        return new C24053b(this.f69170d);
    }

    /* renamed from: toBuilder  reason: collision with other method in class */
    public C23845j1.C23846a m168470toBuilder() {
        return new C24053b(this.f69170d).mergeFrom(this);
    }
}
