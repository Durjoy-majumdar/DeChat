package com.google.protobuf;

import com.google.protobuf.C16976a1;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23832g0;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23902n1;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23932r0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24051v;
import com.google.protobuf.C24074y0;
import com.google.protobuf.C24087z2;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.m0 */
public abstract class C23872m0 extends C23803a implements Serializable {
    public static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    public C24020s2 unknownFields;

    /* renamed from: com.google.protobuf.m0$a */
    public class C23873a implements C23876c {

        /* renamed from: a */
        public final /* synthetic */ C23803a.C23805b f68421a;

        public C23873a(C23872m0 m0Var, C23803a.C23805b bVar) {
            this.f68421a = bVar;
        }

        /* renamed from: a */
        public void mo37464a() {
            this.f68421a.mo37464a();
        }
    }

    /* renamed from: com.google.protobuf.m0$b */
    public static abstract class C23874b<BuilderType extends C23874b<BuilderType>> extends C23803a.C23804a<BuilderType> {
        private C23876c builderParent;
        private boolean isClean;
        private C23874b<BuilderType>.a meAsParent;
        private C24020s2 unknownFields;

        /* renamed from: com.google.protobuf.m0$b$a */
        public class C23875a implements C23876c {
            public C23875a(C23873a aVar) {
            }

            /* renamed from: a */
            public void mo37464a() {
                C23874b.this.onChanged();
            }
        }

        public C23874b() {
            this((C23876c) null);
        }

        /* access modifiers changed from: private */
        public Map<C24025t.C24035g, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<C24025t.C24035g> h = internalGetFieldAccessorTable().f68428a.mo38319h();
            int i = 0;
            while (i < h.size()) {
                C24025t.C24035g gVar = h.get(i);
                C24025t.C24042k kVar = gVar.f69112p;
                if (kVar != null) {
                    i += kVar.f69151i - 1;
                    if (!hasOneof(kVar)) {
                        i++;
                    } else {
                        gVar = getOneofFieldDescriptor(kVar);
                    }
                } else {
                    if (gVar.mo37662E0()) {
                        List list = (List) getField(gVar);
                        if (!list.isEmpty()) {
                            treeMap.put(gVar, list);
                        }
                    } else if (!hasField(gVar)) {
                    }
                    i++;
                }
                treeMap.put(gVar, getField(gVar));
                i++;
            }
            return treeMap;
        }

        private BuilderType setUnknownFieldsInternal(C24020s2 s2Var) {
            this.unknownFields = s2Var;
            onChanged();
            return this;
        }

        public BuilderType clear() {
            this.unknownFields = C24020s2.f69054f;
            onChanged();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void dispose() {
            this.builderParent = null;
        }

        public Map<C24025t.C24035g, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        public C24025t.C24027b getDescriptorForType() {
            return internalGetFieldAccessorTable().f68428a;
        }

        public Object getField(C24025t.C24035g gVar) {
            Object j = C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37885j(this);
            return gVar.mo37662E0() ? Collections.unmodifiableList((List) j) : j;
        }

        public C23836g1.C23837a getFieldBuilder(C24025t.C24035g gVar) {
            return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37889n(this);
        }

        public C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar) {
            C23880f.C23883c a = C23880f.m29176a(internalGetFieldAccessorTable(), kVar);
            C24025t.C24035g gVar = a.f68439e;
            if (gVar == null) {
                int number = ((C23908o0.C23911c) C23872m0.invokeOrDie(a.f68437c, this, new Object[0])).getNumber();
                if (number > 0) {
                    return a.f68435a.mo38317g(number);
                }
                return null;
            } else if (hasField(gVar)) {
                return a.f68439e;
            } else {
                return null;
            }
        }

        public C23876c getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C23875a((C23873a) null);
            }
            return this.meAsParent;
        }

        public Object getRepeatedField(C24025t.C24035g gVar, int i) {
            return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37881f(this, i);
        }

        public C23836g1.C23837a getRepeatedFieldBuilder(C24025t.C24035g gVar, int i) {
            return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37882g(this, i);
        }

        public int getRepeatedFieldCount(C24025t.C24035g gVar) {
            return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37888m(this);
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasField(C24025t.C24035g gVar) {
            return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37887l(this);
        }

        public boolean hasOneof(C24025t.C24042k kVar) {
            C23880f.C23883c a = C23880f.m29176a(internalGetFieldAccessorTable(), kVar);
            C24025t.C24035g gVar = a.f68439e;
            return gVar != null ? hasField(gVar) : ((C23908o0.C23911c) C23872m0.invokeOrDie(a.f68437c, this, new Object[0])).getNumber() != 0;
        }

        public abstract C23880f internalGetFieldAccessorTable();

        public C16976a1 internalGetMapField(int i) {
            String name = getClass().getName();
            throw new RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new String("No map fields found in "));
        }

        public C16976a1 internalGetMutableMapField(int i) {
            String name = getClass().getName();
            throw new RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new String("No map fields found in "));
        }

        public boolean isClean() {
            return this.isClean;
        }

        public boolean isInitialized() {
            for (C24025t.C24035g next : getDescriptorForType().mo38319h()) {
                if (next.mo38343l() && !hasField(next)) {
                    return false;
                }
                if (next.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                    if (next.mo37662E0()) {
                        for (C23836g1 isInitialized : (List) getField(next)) {
                            if (!isInitialized.isInitialized()) {
                                return false;
                            }
                        }
                        continue;
                    } else if (hasField(next) && !((C23836g1) getField(next)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void markClean() {
            this.isClean = true;
        }

        public C23836g1.C23837a newBuilderForField(C24025t.C24035g gVar) {
            return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).newBuilder();
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        public final void onChanged() {
            C23876c cVar;
            if (this.isClean && (cVar = this.builderParent) != null) {
                cVar.mo37464a();
                this.isClean = false;
            }
        }

        public BuilderType setUnknownFieldsProto3(C24020s2 s2Var) {
            return setUnknownFieldsInternal(s2Var);
        }

        public C23874b(C23876c cVar) {
            this.unknownFields = C24020s2.f69054f;
            this.builderParent = cVar;
        }

        public BuilderType addRepeatedField(C24025t.C24035g gVar, Object obj) {
            C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37878c(this, obj);
            return this;
        }

        public BuilderType clearField(C24025t.C24035g gVar) {
            C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37883h(this);
            return this;
        }

        public BuilderType setField(C24025t.C24035g gVar, Object obj) {
            C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37886k(this, obj);
            return this;
        }

        public BuilderType setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37880e(this, i, obj);
            return this;
        }

        public BuilderType setUnknownFields(C24020s2 s2Var) {
            return setUnknownFieldsInternal(s2Var);
        }

        public BuilderType clearOneof(C24025t.C24042k kVar) {
            Object unused = C23872m0.invokeOrDie(C23880f.m29176a(internalGetFieldAccessorTable(), kVar).f68438d, this, new Object[0]);
            return this;
        }

        public BuilderType mergeUnknownFields(C24020s2 s2Var) {
            C24020s2 s2Var2 = this.unknownFields;
            C24020s2.C24021a b = C24020s2.m29807b();
            b.mo38303f(s2Var2);
            b.mo38303f(s2Var);
            return setUnknownFields(b.build());
        }

        public BuilderType clone() {
            BuilderType buildertype = (C23874b) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }
    }

    /* renamed from: com.google.protobuf.m0$c */
    public interface C23876c extends C23803a.C23805b {
    }

    /* renamed from: com.google.protobuf.m0$d */
    public static abstract class C23877d<MessageType extends C23878e, BuilderType extends C23877d<MessageType, BuilderType>> extends C23874b<BuilderType> implements C23896m1 {

        /* renamed from: d */
        public C23832g0.C23834b<C24025t.C24035g> f68423d;

        public C23877d() {
        }

        /* renamed from: j */
        private void m29161j(C24025t.C24035g gVar) {
            if (gVar.f69110n != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        /* renamed from: a */
        public BuilderType addRepeatedField(C24025t.C24035g gVar, Object obj) {
            List list;
            if (!gVar.mo38340i()) {
                return (C23877d) super.addRepeatedField(gVar, obj);
            }
            m29161j(gVar);
            mo37865d();
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            bVar.mo37655a();
            if (gVar.mo37662E0()) {
                bVar.f68265d = bVar.f68265d || (obj instanceof C23845j1.C23846a);
                C23832g0.C23834b.m28859j(gVar.mo37663O(), obj);
                Object b = bVar.mo37656b(gVar);
                if (b == null) {
                    list = new ArrayList();
                    bVar.f68262a.put(gVar, list);
                } else {
                    list = (List) b;
                }
                list.add(obj);
                onChanged();
                return this;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: b */
        public BuilderType clear() {
            this.f68423d = null;
            return (C23877d) super.clear();
        }

        /* renamed from: c */
        public BuilderType clearField(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return (C23877d) super.clearField(gVar);
            }
            m29161j(gVar);
            mo37865d();
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            bVar.mo37655a();
            bVar.f68262a.remove(gVar);
            if (bVar.f68262a.isEmpty()) {
                bVar.f68263b = false;
            }
            onChanged();
            return this;
        }

        /* renamed from: d */
        public final void mo37865d() {
            if (this.f68423d == null) {
                C23832g0 g0Var = C23832g0.f68258d;
                this.f68423d = new C23832g0.C23834b<>((C23832g0.C23833a) null);
            }
        }

        /* renamed from: e */
        public boolean mo37866e() {
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            if (bVar == null) {
                return true;
            }
            int i = 0;
            while (true) {
                if (i >= bVar.f68262a.mo37720e()) {
                    for (Map.Entry<T, Object> r : bVar.f68262a.mo37723f()) {
                        if (!C23832g0.m28836r(r)) {
                        }
                    }
                    return true;
                } else if (!C23832g0.m28836r(bVar.f68262a.mo37717c(i))) {
                    break;
                } else {
                    i++;
                }
            }
            return false;
        }

        /* renamed from: f */
        public final void mo37867f(C23878e eVar) {
            if (eVar.f68424d != null) {
                mo37865d();
                C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
                C23832g0<C24025t.C24035g> g0Var = eVar.f68424d;
                bVar.mo37655a();
                for (int i = 0; i < g0Var.f68259a.mo37720e(); i++) {
                    bVar.mo37659e(g0Var.f68259a.mo37717c(i));
                }
                for (Map.Entry<T, Object> e : g0Var.f68259a.mo37723f()) {
                    bVar.mo37659e(e);
                }
                onChanged();
            }
        }

        /* renamed from: g */
        public BuilderType setField(C24025t.C24035g gVar, Object obj) {
            if (!gVar.mo38340i()) {
                return (C23877d) super.setField(gVar, obj);
            }
            m29161j(gVar);
            mo37865d();
            this.f68423d.mo37660h(gVar, obj);
            onChanged();
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.Map<T, java.lang.Object>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Map<T, java.lang.Object>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Map<T, java.lang.Object>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.Map<T, java.lang.Object>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.Map<com.google.protobuf.C24025t.C24035g, java.lang.Object> getAllFields() {
            /*
                r4 = this;
                java.util.Map r0 = r4.getAllFieldsMutable()
                com.google.protobuf.g0$b<com.google.protobuf.t$g> r1 = r4.f68423d
                if (r1 == 0) goto L_0x0030
                boolean r2 = r1.f68263b
                if (r2 == 0) goto L_0x0021
                com.google.protobuf.k2<T, java.lang.Object> r2 = r1.f68262a
                r3 = 0
                com.google.protobuf.k2 r2 = com.google.protobuf.C23832g0.m28830d(r2, r3)
                com.google.protobuf.k2<T, java.lang.Object> r1 = r1.f68262a
                boolean r1 = r1.f68346g
                if (r1 == 0) goto L_0x001d
                r2.mo37712i()
                goto L_0x002d
            L_0x001d:
                com.google.protobuf.C23832g0.C23834b.m28858g(r2)
                goto L_0x002d
            L_0x0021:
                com.google.protobuf.k2<T, java.lang.Object> r1 = r1.f68262a
                boolean r2 = r1.f68346g
                if (r2 == 0) goto L_0x0028
                goto L_0x002c
            L_0x0028:
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            L_0x002c:
                r2 = r1
            L_0x002d:
                r0.putAll(r2)
            L_0x0030:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23872m0.C23877d.getAllFields():java.util.Map");
        }

        public Object getField(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return super.getField(gVar);
            }
            m29161j(gVar);
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            Object b = bVar == null ? null : bVar.mo37656b(gVar);
            return b == null ? gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE ? C24051v.m29929a(gVar.mo38339h()) : gVar.mo38337f() : b;
        }

        public C23836g1.C23837a getFieldBuilder(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return super.getFieldBuilder(gVar);
            }
            m29161j(gVar);
            if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                mo37865d();
                Object c = this.f68423d.mo37657c(gVar);
                if (c == null) {
                    C24051v.C24053b bVar = new C24051v.C24053b(gVar.mo38339h());
                    this.f68423d.mo37660h(gVar, bVar);
                    onChanged();
                    return bVar;
                } else if (c instanceof C23836g1.C23837a) {
                    return (C23836g1.C23837a) c;
                } else {
                    if (c instanceof C23836g1) {
                        C23836g1.C23837a builder = ((C23836g1) c).toBuilder();
                        this.f68423d.mo37660h(gVar, builder);
                        onChanged();
                        return builder;
                    }
                    throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
                }
            } else {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
        }

        public Object getRepeatedField(C24025t.C24035g gVar, int i) {
            if (!gVar.mo38340i()) {
                return super.getRepeatedField(gVar, i);
            }
            m29161j(gVar);
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            if (bVar != null) {
                if (bVar.f68265d) {
                    bVar.mo37655a();
                }
                Object d = bVar.mo37658d(gVar, i);
                return d instanceof C23845j1.C23846a ? ((C23845j1.C23846a) d).build() : d;
            }
            throw new IndexOutOfBoundsException();
        }

        public C23836g1.C23837a getRepeatedFieldBuilder(C24025t.C24035g gVar, int i) {
            if (!gVar.mo38340i()) {
                return super.getRepeatedFieldBuilder(gVar, i);
            }
            m29161j(gVar);
            mo37865d();
            if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                Object d = this.f68423d.mo37658d(gVar, i);
                if (d instanceof C23836g1.C23837a) {
                    return (C23836g1.C23837a) d;
                }
                if (d instanceof C23836g1) {
                    C23836g1.C23837a builder = ((C23836g1) d).toBuilder();
                    this.f68423d.mo37661i(gVar, i, builder);
                    onChanged();
                    return builder;
                }
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }

        public int getRepeatedFieldCount(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return super.getRepeatedFieldCount(gVar);
            }
            m29161j(gVar);
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            if (bVar == null) {
                return 0;
            }
            bVar.getClass();
            if (gVar.mo37662E0()) {
                Object b = bVar.mo37656b(gVar);
                if (b == null) {
                    return 0;
                }
                return ((List) b).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: h */
        public BuilderType setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
            if (!gVar.mo38340i()) {
                return (C23877d) super.setRepeatedField(gVar, i, obj);
            }
            m29161j(gVar);
            mo37865d();
            this.f68423d.mo37661i(gVar, i, obj);
            onChanged();
            return this;
        }

        public boolean hasField(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return super.hasField(gVar);
            }
            m29161j(gVar);
            C23832g0.C23834b<C24025t.C24035g> bVar = this.f68423d;
            if (bVar == null) {
                return false;
            }
            bVar.getClass();
            if (!gVar.mo37662E0()) {
                return bVar.f68262a.get(gVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public boolean isInitialized() {
            return super.isInitialized() && mo37866e();
        }

        public C23836g1.C23837a newBuilderForField(C24025t.C24035g gVar) {
            return gVar.mo38340i() ? new C24051v.C24053b(gVar.mo38339h()) : super.newBuilderForField(gVar);
        }

        public C23877d(C23876c cVar) {
            super(cVar);
        }
    }

    /* renamed from: com.google.protobuf.m0$f */
    public static final class C23880f {

        /* renamed from: a */
        public final C24025t.C24027b f68428a;

        /* renamed from: b */
        public final C23881a[] f68429b;

        /* renamed from: c */
        public String[] f68430c;

        /* renamed from: d */
        public final C23883c[] f68431d;

        /* renamed from: e */
        public volatile boolean f68432e = false;

        /* renamed from: com.google.protobuf.m0$f$a */
        public interface C23881a {
            /* renamed from: a */
            Object mo37876a(C23872m0 m0Var);

            /* renamed from: b */
            int mo37877b(C23872m0 m0Var);

            /* renamed from: c */
            void mo37878c(C23874b bVar, Object obj);

            /* renamed from: d */
            boolean mo37879d(C23872m0 m0Var);

            /* renamed from: e */
            void mo37880e(C23874b bVar, int i, Object obj);

            /* renamed from: f */
            Object mo37881f(C23874b bVar, int i);

            /* renamed from: g */
            C23836g1.C23837a mo37882g(C23874b bVar, int i);

            /* renamed from: h */
            void mo37883h(C23874b bVar);

            /* renamed from: i */
            Object mo37884i(C23872m0 m0Var);

            /* renamed from: j */
            Object mo37885j(C23874b bVar);

            /* renamed from: k */
            void mo37886k(C23874b bVar, Object obj);

            /* renamed from: l */
            boolean mo37887l(C23874b bVar);

            /* renamed from: m */
            int mo37888m(C23874b bVar);

            /* renamed from: n */
            C23836g1.C23837a mo37889n(C23874b bVar);

            C23836g1.C23837a newBuilder();

            /* renamed from: o */
            Object mo37891o(C23872m0 m0Var, int i);
        }

        /* renamed from: com.google.protobuf.m0$f$b */
        public static class C23882b implements C23881a {

            /* renamed from: a */
            public final C24025t.C24035g f68433a;

            /* renamed from: b */
            public final C23836g1 f68434b;

            public C23882b(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
                this.f68433a = gVar;
                this.f68434b = ((C16976a1.C16978b) ((C23872m0) C23872m0.invokeOrDie(C23872m0.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).internalGetMapField(gVar.f69104e.f68739f).f45976e).f45977a;
            }

            /* renamed from: a */
            public Object mo37876a(C23872m0 m0Var) {
                return mo37884i(m0Var);
            }

            /* renamed from: b */
            public int mo37877b(C23872m0 m0Var) {
                return m0Var.internalGetMapField(this.f68433a.f69104e.f68739f).mo18654d().size();
            }

            /* renamed from: c */
            public void mo37878c(C23874b bVar, Object obj) {
                bVar.internalGetMutableMapField(this.f68433a.f69104e.f68739f).mo18657f().add(mo37892p((C23836g1) obj));
            }

            /* renamed from: d */
            public boolean mo37879d(C23872m0 m0Var) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            /* renamed from: e */
            public void mo37880e(C23874b bVar, int i, Object obj) {
                bVar.internalGetMutableMapField(this.f68433a.f69104e.f68739f).mo18657f().set(i, mo37892p((C23836g1) obj));
            }

            /* renamed from: f */
            public Object mo37881f(C23874b bVar, int i) {
                return bVar.internalGetMapField(this.f68433a.f69104e.f68739f).mo18654d().get(i);
            }

            /* renamed from: g */
            public C23836g1.C23837a mo37882g(C23874b bVar, int i) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            /* renamed from: h */
            public void mo37883h(C23874b bVar) {
                bVar.internalGetMutableMapField(this.f68433a.f69104e.f68739f).mo18657f().clear();
            }

            /* renamed from: i */
            public Object mo37884i(C23872m0 m0Var) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < mo37877b(m0Var); i++) {
                    arrayList.add(mo37891o(m0Var, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            /* renamed from: j */
            public Object mo37885j(C23874b bVar) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < mo37888m(bVar); i++) {
                    arrayList.add(mo37881f(bVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            /* renamed from: k */
            public void mo37886k(C23874b bVar, Object obj) {
                mo37883h(bVar);
                for (Object c : (List) obj) {
                    mo37878c(bVar, c);
                }
            }

            /* renamed from: l */
            public boolean mo37887l(C23874b bVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            /* renamed from: m */
            public int mo37888m(C23874b bVar) {
                return bVar.internalGetMapField(this.f68433a.f69104e.f68739f).mo18654d().size();
            }

            /* renamed from: n */
            public C23836g1.C23837a mo37889n(C23874b bVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            public C23836g1.C23837a newBuilder() {
                return ((C24074y0) this.f68434b).newBuilderForType();
            }

            /* renamed from: o */
            public Object mo37891o(C23872m0 m0Var, int i) {
                return m0Var.internalGetMapField(this.f68433a.f69104e.f68739f).mo18654d().get(i);
            }

            /* renamed from: p */
            public final C23836g1 mo37892p(C23836g1 g1Var) {
                if (g1Var == null) {
                    return null;
                }
                if (this.f68434b.getClass().isInstance(g1Var)) {
                    return g1Var;
                }
                C24074y0 y0Var = (C24074y0) this.f68434b;
                return new C24074y0.C24075b(y0Var.f69207f, y0Var.f69205d, y0Var.f69206e, true, true).mergeFrom(g1Var).build();
            }
        }

        /* renamed from: com.google.protobuf.m0$f$c */
        public static class C23883c {

            /* renamed from: a */
            public final C24025t.C24027b f68435a;

            /* renamed from: b */
            public final Method f68436b;

            /* renamed from: c */
            public final Method f68437c;

            /* renamed from: d */
            public final Method f68438d;

            /* renamed from: e */
            public final C24025t.C24035g f68439e;

            public C23883c(C24025t.C24027b bVar, int i, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
                this.f68435a = bVar;
                C24025t.C24035g[] gVarArr = bVar.mo38321j().get(i).f69152j;
                boolean z = true;
                if ((gVarArr.length != 1 || !gVarArr[0].f69108i) ? false : z) {
                    this.f68436b = null;
                    this.f68437c = null;
                    this.f68439e = (C24025t.C24035g) Collections.unmodifiableList(Arrays.asList(gVarArr)).get(0);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                    sb.append("get");
                    sb.append(str);
                    sb.append("Case");
                    this.f68436b = C23872m0.getMethodOrDie(cls, sb.toString(), new Class[0]);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 7);
                    sb4.append("get");
                    sb4.append(str);
                    sb4.append("Case");
                    this.f68437c = C23872m0.getMethodOrDie(cls2, sb4.toString(), new Class[0]);
                    this.f68439e = null;
                }
                String valueOf = String.valueOf(str);
                this.f68438d = C23872m0.getMethodOrDie(cls2, valueOf.length() != 0 ? "clear".concat(valueOf) : new String("clear"), new Class[0]);
            }
        }

        /* renamed from: com.google.protobuf.m0$f$d */
        public static final class C23884d extends C23885e {

            /* renamed from: c */
            public C24025t.C24033e f68440c;

            /* renamed from: d */
            public final Method f68441d = C23872m0.getMethodOrDie(this.f68448a, "valueOf", C24025t.C24034f.class);

            /* renamed from: e */
            public final Method f68442e = C23872m0.getMethodOrDie(this.f68448a, "getValueDescriptor", new Class[0]);

            /* renamed from: f */
            public boolean f68443f;

            /* renamed from: g */
            public Method f68444g;

            /* renamed from: h */
            public Method f68445h;

            /* renamed from: i */
            public Method f68446i;

            /* renamed from: j */
            public Method f68447j;

            public C23884d(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
                super(gVar, str, cls, cls2);
                this.f68440c = gVar.mo38338g();
                boolean z = gVar.f69106g.mo38348h() == C24025t.C24038h.C24039a.PROTO3;
                this.f68443f = z;
                if (z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                    sb.append("get");
                    sb.append(str);
                    sb.append("Value");
                    String sb4 = sb.toString();
                    Class cls3 = Integer.TYPE;
                    this.f68444g = C23872m0.getMethodOrDie(cls, sb4, cls3);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb5.append("get");
                    sb5.append(str);
                    sb5.append("Value");
                    this.f68445h = C23872m0.getMethodOrDie(cls2, sb5.toString(), cls3);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb6.append("set");
                    sb6.append(str);
                    sb6.append("Value");
                    this.f68446i = C23872m0.getMethodOrDie(cls2, sb6.toString(), cls3, cls3);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb7.append("add");
                    sb7.append(str);
                    sb7.append("Value");
                    this.f68447j = C23872m0.getMethodOrDie(cls2, sb7.toString(), cls3);
                }
            }

            /* renamed from: c */
            public void mo37878c(C23874b bVar, Object obj) {
                if (this.f68443f) {
                    Object unused = C23872m0.invokeOrDie(this.f68447j, bVar, Integer.valueOf(((C24025t.C24034f) obj).f69098e.f68710f));
                    return;
                }
                super.mo37878c(bVar, C23872m0.invokeOrDie(this.f68441d, (Object) null, obj));
            }

            /* renamed from: e */
            public void mo37880e(C23874b bVar, int i, Object obj) {
                if (this.f68443f) {
                    Object unused = C23872m0.invokeOrDie(this.f68446i, bVar, Integer.valueOf(i), Integer.valueOf(((C24025t.C24034f) obj).f69098e.f68710f));
                    return;
                }
                super.mo37880e(bVar, i, C23872m0.invokeOrDie(this.f68441d, (Object) null, obj));
            }

            /* renamed from: f */
            public Object mo37881f(C23874b bVar, int i) {
                if (!this.f68443f) {
                    return C23872m0.invokeOrDie(this.f68442e, super.mo37881f(bVar, i), new Object[0]);
                }
                return this.f68440c.mo38333g(((Integer) C23872m0.invokeOrDie(this.f68445h, bVar, Integer.valueOf(i))).intValue());
            }

            /* renamed from: i */
            public Object mo37884i(C23872m0 m0Var) {
                ArrayList arrayList = new ArrayList();
                int b = mo37877b(m0Var);
                for (int i = 0; i < b; i++) {
                    arrayList.add(mo37891o(m0Var, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            /* renamed from: j */
            public Object mo37885j(C23874b bVar) {
                ArrayList arrayList = new ArrayList();
                int m = mo37888m(bVar);
                for (int i = 0; i < m; i++) {
                    arrayList.add(mo37881f(bVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            /* renamed from: o */
            public Object mo37891o(C23872m0 m0Var, int i) {
                if (!this.f68443f) {
                    return C23872m0.invokeOrDie(this.f68442e, super.mo37891o(m0Var, i), new Object[0]);
                }
                return this.f68440c.mo38333g(((Integer) C23872m0.invokeOrDie(this.f68444g, m0Var, Integer.valueOf(i))).intValue());
            }
        }

        /* renamed from: com.google.protobuf.m0$f$e */
        public static class C23885e implements C23881a {

            /* renamed from: a */
            public final Class f68448a;

            /* renamed from: b */
            public final C23886a f68449b;

            /* renamed from: com.google.protobuf.m0$f$e$a */
            public interface C23886a {
            }

            /* renamed from: com.google.protobuf.m0$f$e$b */
            public static final class C23887b implements C23886a {

                /* renamed from: a */
                public final Method f68450a;

                /* renamed from: b */
                public final Method f68451b;

                /* renamed from: c */
                public final Method f68452c;

                /* renamed from: d */
                public final Method f68453d;

                /* renamed from: e */
                public final Method f68454e;

                /* renamed from: f */
                public final Method f68455f;

                /* renamed from: g */
                public final Method f68456g;

                /* renamed from: h */
                public final Method f68457h;

                /* renamed from: i */
                public final Method f68458i;

                public C23887b(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                    sb.append("get");
                    sb.append(str);
                    sb.append("List");
                    this.f68450a = C23872m0.getMethodOrDie(cls, sb.toString(), new Class[0]);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 7);
                    sb4.append("get");
                    sb4.append(str);
                    sb4.append("List");
                    this.f68451b = C23872m0.getMethodOrDie(cls2, sb4.toString(), new Class[0]);
                    String valueOf = String.valueOf(str);
                    String concat = valueOf.length() != 0 ? "get".concat(valueOf) : new String("get");
                    Class cls3 = Integer.TYPE;
                    Method access$1000 = C23872m0.getMethodOrDie(cls, concat, cls3);
                    this.f68452c = access$1000;
                    String valueOf2 = String.valueOf(str);
                    this.f68453d = C23872m0.getMethodOrDie(cls2, valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), cls3);
                    Class<?> returnType = access$1000.getReturnType();
                    String valueOf3 = String.valueOf(str);
                    this.f68454e = C23872m0.getMethodOrDie(cls2, valueOf3.length() != 0 ? "set".concat(valueOf3) : new String("set"), cls3, returnType);
                    String valueOf4 = String.valueOf(str);
                    this.f68455f = C23872m0.getMethodOrDie(cls2, valueOf4.length() != 0 ? "add".concat(valueOf4) : new String("add"), returnType);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb5.append("get");
                    sb5.append(str);
                    sb5.append("Count");
                    this.f68456g = C23872m0.getMethodOrDie(cls, sb5.toString(), new Class[0]);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb6.append("get");
                    sb6.append(str);
                    sb6.append("Count");
                    this.f68457h = C23872m0.getMethodOrDie(cls2, sb6.toString(), new Class[0]);
                    String valueOf5 = String.valueOf(str);
                    this.f68458i = C23872m0.getMethodOrDie(cls2, valueOf5.length() != 0 ? "clear".concat(valueOf5) : new String("clear"), new Class[0]);
                }
            }

            public C23885e(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
                C23887b bVar = new C23887b(gVar, str, cls, cls2);
                this.f68448a = bVar.f68452c.getReturnType();
                this.f68449b = bVar;
            }

            /* renamed from: a */
            public Object mo37876a(C23872m0 m0Var) {
                return mo37884i(m0Var);
            }

            /* renamed from: b */
            public int mo37877b(C23872m0 m0Var) {
                return ((Integer) C23872m0.invokeOrDie(((C23887b) this.f68449b).f68456g, m0Var, new Object[0])).intValue();
            }

            /* renamed from: c */
            public void mo37878c(C23874b bVar, Object obj) {
                Object unused = C23872m0.invokeOrDie(((C23887b) this.f68449b).f68455f, bVar, obj);
            }

            /* renamed from: d */
            public boolean mo37879d(C23872m0 m0Var) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            /* renamed from: e */
            public void mo37880e(C23874b bVar, int i, Object obj) {
                Object unused = C23872m0.invokeOrDie(((C23887b) this.f68449b).f68454e, bVar, Integer.valueOf(i), obj);
            }

            /* renamed from: f */
            public Object mo37881f(C23874b bVar, int i) {
                return C23872m0.invokeOrDie(((C23887b) this.f68449b).f68453d, bVar, Integer.valueOf(i));
            }

            /* renamed from: g */
            public C23836g1.C23837a mo37882g(C23874b bVar, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            /* renamed from: h */
            public void mo37883h(C23874b bVar) {
                Object unused = C23872m0.invokeOrDie(((C23887b) this.f68449b).f68458i, bVar, new Object[0]);
            }

            /* renamed from: i */
            public Object mo37884i(C23872m0 m0Var) {
                return C23872m0.invokeOrDie(((C23887b) this.f68449b).f68450a, m0Var, new Object[0]);
            }

            /* renamed from: j */
            public Object mo37885j(C23874b bVar) {
                return C23872m0.invokeOrDie(((C23887b) this.f68449b).f68451b, bVar, new Object[0]);
            }

            /* renamed from: k */
            public void mo37886k(C23874b bVar, Object obj) {
                mo37883h(bVar);
                for (Object c : (List) obj) {
                    mo37878c(bVar, c);
                }
            }

            /* renamed from: l */
            public boolean mo37887l(C23874b bVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            /* renamed from: m */
            public int mo37888m(C23874b bVar) {
                return ((Integer) C23872m0.invokeOrDie(((C23887b) this.f68449b).f68457h, bVar, new Object[0])).intValue();
            }

            /* renamed from: n */
            public C23836g1.C23837a mo37889n(C23874b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public C23836g1.C23837a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            /* renamed from: o */
            public Object mo37891o(C23872m0 m0Var, int i) {
                return C23872m0.invokeOrDie(((C23887b) this.f68449b).f68452c, m0Var, Integer.valueOf(i));
            }
        }

        /* renamed from: com.google.protobuf.m0$f$f */
        public static final class C23888f extends C23885e {

            /* renamed from: c */
            public final Method f68459c = C23872m0.getMethodOrDie(this.f68448a, "newBuilder", new Class[0]);

            /* renamed from: d */
            public final Method f68460d;

            public C23888f(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
                super(gVar, str, cls, cls2);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10);
                sb.append("get");
                sb.append(str);
                sb.append("Builder");
                this.f68460d = C23872m0.getMethodOrDie(cls2, sb.toString(), Integer.TYPE);
            }

            /* renamed from: c */
            public void mo37878c(C23874b bVar, Object obj) {
                super.mo37878c(bVar, mo37893p(obj));
            }

            /* renamed from: e */
            public void mo37880e(C23874b bVar, int i, Object obj) {
                super.mo37880e(bVar, i, mo37893p(obj));
            }

            /* renamed from: g */
            public C23836g1.C23837a mo37882g(C23874b bVar, int i) {
                return (C23836g1.C23837a) C23872m0.invokeOrDie(this.f68460d, bVar, Integer.valueOf(i));
            }

            public C23836g1.C23837a newBuilder() {
                return (C23836g1.C23837a) C23872m0.invokeOrDie(this.f68459c, (Object) null, new Object[0]);
            }

            /* renamed from: p */
            public final Object mo37893p(Object obj) {
                return this.f68448a.isInstance(obj) ? obj : ((C23836g1.C23837a) C23872m0.invokeOrDie(this.f68459c, (Object) null, new Object[0])).mergeFrom((C23836g1) obj).build();
            }
        }

        /* renamed from: com.google.protobuf.m0$f$g */
        public static final class C23889g extends C23890h {

            /* renamed from: f */
            public C24025t.C24033e f68461f;

            /* renamed from: g */
            public Method f68462g = C23872m0.getMethodOrDie(this.f68468a, "valueOf", C24025t.C24034f.class);

            /* renamed from: h */
            public Method f68463h = C23872m0.getMethodOrDie(this.f68468a, "getValueDescriptor", new Class[0]);

            /* renamed from: i */
            public boolean f68464i;

            /* renamed from: j */
            public Method f68465j;

            /* renamed from: k */
            public Method f68466k;

            /* renamed from: l */
            public Method f68467l;

            public C23889g(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f68461f = gVar.mo38338g();
                boolean z = gVar.f69106g.mo38348h() == C24025t.C24038h.C24039a.PROTO3;
                this.f68464i = z;
                if (z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                    sb.append("get");
                    sb.append(str);
                    sb.append("Value");
                    this.f68465j = C23872m0.getMethodOrDie(cls, sb.toString(), new Class[0]);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb4.append("get");
                    sb4.append(str);
                    sb4.append("Value");
                    this.f68466k = C23872m0.getMethodOrDie(cls2, sb4.toString(), new Class[0]);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 8);
                    sb5.append("set");
                    sb5.append(str);
                    sb5.append("Value");
                    this.f68467l = C23872m0.getMethodOrDie(cls2, sb5.toString(), Integer.TYPE);
                }
            }

            /* renamed from: i */
            public Object mo37884i(C23872m0 m0Var) {
                if (!this.f68464i) {
                    return C23872m0.invokeOrDie(this.f68463h, super.mo37884i(m0Var), new Object[0]);
                }
                return this.f68461f.mo38333g(((Integer) C23872m0.invokeOrDie(this.f68465j, m0Var, new Object[0])).intValue());
            }

            /* renamed from: j */
            public Object mo37885j(C23874b bVar) {
                if (!this.f68464i) {
                    return C23872m0.invokeOrDie(this.f68463h, super.mo37885j(bVar), new Object[0]);
                }
                return this.f68461f.mo38333g(((Integer) C23872m0.invokeOrDie(this.f68466k, bVar, new Object[0])).intValue());
            }

            /* renamed from: k */
            public void mo37886k(C23874b bVar, Object obj) {
                if (this.f68464i) {
                    Object unused = C23872m0.invokeOrDie(this.f68467l, bVar, Integer.valueOf(((C24025t.C24034f) obj).f69098e.f68710f));
                    return;
                }
                super.mo37886k(bVar, C23872m0.invokeOrDie(this.f68462g, (Object) null, obj));
            }
        }

        /* renamed from: com.google.protobuf.m0$f$h */
        public static class C23890h implements C23881a {

            /* renamed from: a */
            public final Class<?> f68468a;

            /* renamed from: b */
            public final C24025t.C24035g f68469b;

            /* renamed from: c */
            public final boolean f68470c;

            /* renamed from: d */
            public final boolean f68471d;

            /* renamed from: e */
            public final C23891a f68472e;

            /* renamed from: com.google.protobuf.m0$f$h$a */
            public interface C23891a {
            }

            /* renamed from: com.google.protobuf.m0$f$h$b */
            public static final class C23892b implements C23891a {

                /* renamed from: a */
                public final Method f68473a;

                /* renamed from: b */
                public final Method f68474b;

                /* renamed from: c */
                public final Method f68475c;

                /* renamed from: d */
                public final Method f68476d;

                /* renamed from: e */
                public final Method f68477e;

                /* renamed from: f */
                public final Method f68478f;

                /* renamed from: g */
                public final Method f68479g;

                /* renamed from: h */
                public final Method f68480h;

                public C23892b(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2, String str2, boolean z, boolean z2) {
                    Method method;
                    Method method2;
                    Method method3;
                    String valueOf = String.valueOf(str);
                    Method access$1000 = C23872m0.getMethodOrDie(cls, valueOf.length() != 0 ? "get".concat(valueOf) : new String("get"), new Class[0]);
                    this.f68473a = access$1000;
                    String valueOf2 = String.valueOf(str);
                    this.f68474b = C23872m0.getMethodOrDie(cls2, valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), new Class[0]);
                    Class<?> returnType = access$1000.getReturnType();
                    String valueOf3 = String.valueOf(str);
                    this.f68475c = C23872m0.getMethodOrDie(cls2, valueOf3.length() != 0 ? "set".concat(valueOf3) : new String("set"), returnType);
                    Method method4 = null;
                    if (z2) {
                        String valueOf4 = String.valueOf(str);
                        method = C23872m0.getMethodOrDie(cls, valueOf4.length() != 0 ? "has".concat(valueOf4) : new String("has"), new Class[0]);
                    } else {
                        method = null;
                    }
                    this.f68476d = method;
                    if (z2) {
                        String valueOf5 = String.valueOf(str);
                        method2 = C23872m0.getMethodOrDie(cls2, valueOf5.length() != 0 ? "has".concat(valueOf5) : new String("has"), new Class[0]);
                    } else {
                        method2 = null;
                    }
                    this.f68477e = method2;
                    String valueOf6 = String.valueOf(str);
                    this.f68478f = C23872m0.getMethodOrDie(cls2, valueOf6.length() != 0 ? "clear".concat(valueOf6) : new String("clear"), new Class[0]);
                    if (z) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7);
                        sb.append("get");
                        sb.append(str2);
                        sb.append("Case");
                        method3 = C23872m0.getMethodOrDie(cls, sb.toString(), new Class[0]);
                    } else {
                        method3 = null;
                    }
                    this.f68479g = method3;
                    if (z) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 7);
                        sb4.append("get");
                        sb4.append(str2);
                        sb4.append("Case");
                        method4 = C23872m0.getMethodOrDie(cls2, sb4.toString(), new Class[0]);
                    }
                    this.f68480h = method4;
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
                if (r9.f69112p == null) goto L_0x0052;
             */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C23890h(com.google.protobuf.C24025t.C24035g r12, java.lang.String r13, java.lang.Class<? extends com.google.protobuf.C23872m0> r14, java.lang.Class<? extends com.google.protobuf.C23872m0.C23874b> r15, java.lang.String r16) {
                /*
                    r11 = this;
                    r0 = r11
                    r9 = r12
                    r11.<init>()
                    com.google.protobuf.t$k r1 = r9.f69112p
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x001d
                    com.google.protobuf.t$g[] r1 = r1.f69152j
                    int r4 = r1.length
                    if (r4 != r3) goto L_0x0018
                    r1 = r1[r2]
                    boolean r1 = r1.f69108i
                    if (r1 == 0) goto L_0x0018
                    r1 = 1
                    goto L_0x0019
                L_0x0018:
                    r1 = 0
                L_0x0019:
                    if (r1 != 0) goto L_0x001d
                    r7 = 1
                    goto L_0x001e
                L_0x001d:
                    r7 = 0
                L_0x001e:
                    r0.f68470c = r7
                    com.google.protobuf.t$h r1 = r9.f69106g
                    com.google.protobuf.t$h$a r1 = r1.mo38348h()
                    com.google.protobuf.t$h$a r4 = com.google.protobuf.C24025t.C24038h.C24039a.PROTO2
                    if (r1 == r4) goto L_0x0062
                    boolean r1 = r9.f69108i
                    if (r1 != 0) goto L_0x0052
                    com.google.protobuf.t$h r1 = r9.f69106g
                    com.google.protobuf.t$h$a r1 = r1.mo38348h()
                    if (r1 != r4) goto L_0x0050
                    com.google.protobuf.s$h r1 = r9.f69104e
                    int r1 = r1.f68740g
                    com.google.protobuf.s$h$c r1 = com.google.protobuf.C23938s.C23967h.C23970c.m29635a(r1)
                    if (r1 != 0) goto L_0x0042
                    com.google.protobuf.s$h$c r1 = com.google.protobuf.C23938s.C23967h.C23970c.LABEL_OPTIONAL
                L_0x0042:
                    com.google.protobuf.s$h$c r4 = com.google.protobuf.C23938s.C23967h.C23970c.LABEL_OPTIONAL
                    if (r1 != r4) goto L_0x0048
                    r1 = 1
                    goto L_0x0049
                L_0x0048:
                    r1 = 0
                L_0x0049:
                    if (r1 == 0) goto L_0x0050
                    com.google.protobuf.t$k r1 = r9.f69112p
                    if (r1 != 0) goto L_0x0050
                    goto L_0x0052
                L_0x0050:
                    r1 = 0
                    goto L_0x0053
                L_0x0052:
                    r1 = 1
                L_0x0053:
                    if (r1 != 0) goto L_0x0062
                    if (r7 != 0) goto L_0x0060
                    com.google.protobuf.t$g$b r1 = r9.f69109j
                    com.google.protobuf.t$g$a r1 = r1.f69132d
                    com.google.protobuf.t$g$a r4 = com.google.protobuf.C24025t.C24035g.C24036a.MESSAGE
                    if (r1 != r4) goto L_0x0060
                    goto L_0x0062
                L_0x0060:
                    r8 = 0
                    goto L_0x0063
                L_0x0062:
                    r8 = 1
                L_0x0063:
                    r0.f68471d = r8
                    com.google.protobuf.m0$f$h$b r10 = new com.google.protobuf.m0$f$h$b
                    r1 = r10
                    r2 = r12
                    r3 = r13
                    r4 = r14
                    r5 = r15
                    r6 = r16
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r0.f68469b = r9
                    java.lang.reflect.Method r1 = r10.f68473a
                    java.lang.Class r1 = r1.getReturnType()
                    r0.f68468a = r1
                    r0.f68472e = r10
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23872m0.C23880f.C23890h.<init>(com.google.protobuf.t$g, java.lang.String, java.lang.Class, java.lang.Class, java.lang.String):void");
            }

            /* renamed from: a */
            public Object mo37876a(C23872m0 m0Var) {
                return mo37884i(m0Var);
            }

            /* renamed from: b */
            public int mo37877b(C23872m0 m0Var) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            /* renamed from: c */
            public void mo37878c(C23874b bVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            /* renamed from: d */
            public boolean mo37879d(C23872m0 m0Var) {
                return !this.f68471d ? this.f68470c ? ((C23908o0.C23911c) C23872m0.invokeOrDie(((C23892b) this.f68472e).f68479g, m0Var, new Object[0])).getNumber() == this.f68469b.f69104e.f68739f : !mo37884i(m0Var).equals(this.f68469b.mo38337f()) : ((Boolean) C23872m0.invokeOrDie(((C23892b) this.f68472e).f68476d, m0Var, new Object[0])).booleanValue();
            }

            /* renamed from: e */
            public void mo37880e(C23874b bVar, int i, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            /* renamed from: f */
            public Object mo37881f(C23874b bVar, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            /* renamed from: g */
            public C23836g1.C23837a mo37882g(C23874b bVar, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            /* renamed from: h */
            public void mo37883h(C23874b bVar) {
                Object unused = C23872m0.invokeOrDie(((C23892b) this.f68472e).f68478f, bVar, new Object[0]);
            }

            /* renamed from: i */
            public Object mo37884i(C23872m0 m0Var) {
                return C23872m0.invokeOrDie(((C23892b) this.f68472e).f68473a, m0Var, new Object[0]);
            }

            /* renamed from: j */
            public Object mo37885j(C23874b bVar) {
                return C23872m0.invokeOrDie(((C23892b) this.f68472e).f68474b, bVar, new Object[0]);
            }

            /* renamed from: k */
            public void mo37886k(C23874b bVar, Object obj) {
                Object unused = C23872m0.invokeOrDie(((C23892b) this.f68472e).f68475c, bVar, obj);
            }

            /* renamed from: l */
            public boolean mo37887l(C23874b bVar) {
                return !this.f68471d ? this.f68470c ? ((C23908o0.C23911c) C23872m0.invokeOrDie(((C23892b) this.f68472e).f68480h, bVar, new Object[0])).getNumber() == this.f68469b.f69104e.f68739f : !mo37885j(bVar).equals(this.f68469b.mo38337f()) : ((Boolean) C23872m0.invokeOrDie(((C23892b) this.f68472e).f68477e, bVar, new Object[0])).booleanValue();
            }

            /* renamed from: m */
            public int mo37888m(C23874b bVar) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            /* renamed from: n */
            public C23836g1.C23837a mo37889n(C23874b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public C23836g1.C23837a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            /* renamed from: o */
            public Object mo37891o(C23872m0 m0Var, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }
        }

        /* renamed from: com.google.protobuf.m0$f$i */
        public static final class C23893i extends C23890h {

            /* renamed from: f */
            public final Method f68481f = C23872m0.getMethodOrDie(this.f68468a, "newBuilder", new Class[0]);

            /* renamed from: g */
            public final Method f68482g;

            public C23893i(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10);
                sb.append("get");
                sb.append(str);
                sb.append("Builder");
                this.f68482g = C23872m0.getMethodOrDie(cls2, sb.toString(), new Class[0]);
            }

            /* renamed from: k */
            public void mo37886k(C23874b bVar, Object obj) {
                if (!this.f68468a.isInstance(obj)) {
                    obj = ((C23836g1.C23837a) C23872m0.invokeOrDie(this.f68481f, (Object) null, new Object[0])).mergeFrom((C23836g1) obj).buildPartial();
                }
                super.mo37886k(bVar, obj);
            }

            /* renamed from: n */
            public C23836g1.C23837a mo37889n(C23874b bVar) {
                return (C23836g1.C23837a) C23872m0.invokeOrDie(this.f68482g, bVar, new Object[0]);
            }

            public C23836g1.C23837a newBuilder() {
                return (C23836g1.C23837a) C23872m0.invokeOrDie(this.f68481f, (Object) null, new Object[0]);
            }
        }

        /* renamed from: com.google.protobuf.m0$f$j */
        public static final class C23894j extends C23890h {

            /* renamed from: f */
            public final Method f68483f;

            /* renamed from: g */
            public final Method f68484g;

            public C23894j(C24025t.C24035g gVar, String str, Class<? extends C23872m0> cls, Class<? extends C23874b> cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                sb.append("get");
                sb.append(str);
                sb.append("Bytes");
                this.f68483f = C23872m0.getMethodOrDie(cls, sb.toString(), new Class[0]);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 8);
                sb4.append("get");
                sb4.append(str);
                sb4.append("Bytes");
                Method unused = C23872m0.getMethodOrDie(cls2, sb4.toString(), new Class[0]);
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 8);
                sb5.append("set");
                sb5.append(str);
                sb5.append("Bytes");
                this.f68484g = C23872m0.getMethodOrDie(cls2, sb5.toString(), C16994k.class);
            }

            /* renamed from: a */
            public Object mo37876a(C23872m0 m0Var) {
                return C23872m0.invokeOrDie(this.f68483f, m0Var, new Object[0]);
            }

            /* renamed from: k */
            public void mo37886k(C23874b bVar, Object obj) {
                if (obj instanceof C16994k) {
                    Object unused = C23872m0.invokeOrDie(this.f68484g, bVar, obj);
                    return;
                }
                super.mo37886k(bVar, obj);
            }
        }

        public C23880f(C24025t.C24027b bVar, String[] strArr) {
            this.f68428a = bVar;
            this.f68430c = strArr;
            this.f68429b = new C23881a[bVar.mo38319h().size()];
            this.f68431d = new C23883c[bVar.mo38321j().size()];
        }

        /* renamed from: a */
        public static C23883c m29176a(C23880f fVar, C24025t.C24042k kVar) {
            fVar.getClass();
            if (kVar.f69150h == fVar.f68428a) {
                return fVar.f68431d[kVar.f69146d];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        /* renamed from: b */
        public static C23881a m29177b(C23880f fVar, C24025t.C24035g gVar) {
            fVar.getClass();
            if (gVar.f69110n != fVar.f68428a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            } else if (!gVar.mo38340i()) {
                return fVar.f68429b[gVar.f69103d];
            } else {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
        }

        /* renamed from: c */
        public C23880f mo37875c(Class<? extends C23872m0> cls, Class<? extends C23874b> cls2) {
            if (this.f68432e) {
                return this;
            }
            synchronized (this) {
                if (this.f68432e) {
                    return this;
                }
                int length = this.f68429b.length;
                int i = 0;
                while (true) {
                    String str = null;
                    if (i >= length) {
                        break;
                    }
                    C24025t.C24035g gVar = this.f68428a.mo38319h().get(i);
                    C24025t.C24042k kVar = gVar.f69112p;
                    if (kVar != null) {
                        str = this.f68430c[kVar.f69146d + length];
                    }
                    String str2 = str;
                    if (gVar.mo37662E0()) {
                        C24025t.C24035g.C24036a aVar = gVar.f69109j.f69132d;
                        if (aVar == C24025t.C24035g.C24036a.MESSAGE) {
                            if (gVar.mo38341j()) {
                                this.f68429b[i] = new C23882b(gVar, this.f68430c[i], cls, cls2);
                            } else {
                                this.f68429b[i] = new C23888f(gVar, this.f68430c[i], cls, cls2);
                            }
                        } else if (aVar == C24025t.C24035g.C24036a.ENUM) {
                            this.f68429b[i] = new C23884d(gVar, this.f68430c[i], cls, cls2);
                        } else {
                            this.f68429b[i] = new C23885e(gVar, this.f68430c[i], cls, cls2);
                        }
                    } else {
                        C24025t.C24035g.C24036a aVar2 = gVar.f69109j.f69132d;
                        if (aVar2 == C24025t.C24035g.C24036a.MESSAGE) {
                            this.f68429b[i] = new C23893i(gVar, this.f68430c[i], cls, cls2, str2);
                        } else if (aVar2 == C24025t.C24035g.C24036a.ENUM) {
                            this.f68429b[i] = new C23889g(gVar, this.f68430c[i], cls, cls2, str2);
                        } else if (aVar2 == C24025t.C24035g.C24036a.STRING) {
                            this.f68429b[i] = new C23894j(gVar, this.f68430c[i], cls, cls2, str2);
                        } else {
                            this.f68429b[i] = new C23890h(gVar, this.f68430c[i], cls, cls2, str2);
                        }
                    }
                    i++;
                }
                int length2 = this.f68431d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f68431d[i2] = new C23883c(this.f68428a, i2, this.f68430c[i2 + length], cls, cls2);
                }
                this.f68432e = true;
                this.f68430c = null;
                return this;
            }
        }
    }

    /* renamed from: com.google.protobuf.m0$g */
    public static final class C23895g {

        /* renamed from: a */
        public static final C23895g f68485a = new C23895g();
    }

    public C23872m0() {
        this.unknownFields = C24020s2.f69054f;
    }

    public static boolean canUseUnsafe() {
        return C24065x2.f69193f && C24065x2.f69192e;
    }

    /* access modifiers changed from: private */
    public static <MessageType extends C23878e<MessageType>, T> C24060w<MessageType, T> checkNotLite(C24063x<MessageType, T> xVar) {
        xVar.getClass();
        if (!(!(xVar instanceof C24060w))) {
            return (C24060w) xVar;
        }
        throw new IllegalArgumentException("Expected non-lite extension.");
    }

    public static int computeStringSize(int i, Object obj) {
        return obj instanceof String ? C23897n.m29275t(i, (String) obj) : C23897n.m29258c(i, (C16994k) obj);
    }

    public static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? C23897n.m29276u((String) obj) : C23897n.m29259d((C16994k) obj);
    }

    public static C23908o0.C23909a emptyBooleanList() {
        return C23838h.f68266g;
    }

    public static C23908o0.C23910b emptyDoubleList() {
        return C24047u.f69165g;
    }

    public static C23908o0.C23914f emptyFloatList() {
        return C23843i0.f68335g;
    }

    public static C23908o0.C23915g emptyIntList() {
        return C23901n0.f68496g;
    }

    public static C23908o0.C23918i emptyLongList() {
        return C24061w0.f69185g;
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* access modifiers changed from: private */
    public Map<C24025t.C24035g, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<C24025t.C24035g> h = internalGetFieldAccessorTable().f68428a.mo38319h();
        int i = 0;
        while (i < h.size()) {
            C24025t.C24035g gVar = h.get(i);
            C24025t.C24042k kVar = gVar.f69112p;
            if (kVar != null) {
                i += kVar.f69151i - 1;
                if (!hasOneof(kVar)) {
                    i++;
                } else {
                    gVar = getOneofFieldDescriptor(kVar);
                }
            } else {
                if (gVar.mo37662E0()) {
                    List list = (List) getField(gVar);
                    if (!list.isEmpty()) {
                        treeMap.put(gVar, list);
                    }
                } else if (!hasField(gVar)) {
                }
                i++;
            }
            if (!z || gVar.f69109j.f69132d != C24025t.C24035g.C24036a.STRING) {
                treeMap.put(gVar, getField(gVar));
                i++;
            } else {
                treeMap.put(gVar, getFieldRaw(gVar));
                i++;
            }
        }
        return treeMap;
    }

    /* access modifiers changed from: private */
    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 45 + String.valueOf(str).length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: private */
    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    private static <V> void maybeSerializeBooleanEntryTo(C23897n nVar, Map<Boolean, V> map, C24074y0<Boolean, V> y0Var, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            C24074y0.C24075b<Boolean, V> b = y0Var.newBuilderForType();
            b.f69210e = Boolean.valueOf(z);
            b.f69212g = true;
            b.f69211f = map.get(Boolean.valueOf(z));
            b.f69213h = true;
            nVar.mo37909P(i, b.build());
        }
    }

    public static C23908o0.C23915g mutableCopy(C23908o0.C23915g gVar) {
        int i = ((C23901n0) gVar).f68498f;
        return ((C23901n0) gVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static C23908o0.C23909a newBooleanList() {
        return new C23838h();
    }

    public static C23908o0.C23910b newDoubleList() {
        return new C24047u();
    }

    public static C23908o0.C23914f newFloatList() {
        return new C23843i0();
    }

    public static C23908o0.C23915g newIntList() {
        return new C23901n0();
    }

    public static C23908o0.C23918i newLongList() {
        return new C24061w0();
    }

    public static <M extends C23836g1> M parseDelimitedWithIOException(C24062w1<M> w1Var, InputStream inputStream) {
        try {
            return (C23836g1) w1Var.parseDelimitedFrom(inputStream);
        } catch (C23922p0 e) {
            throw e.mo38013j();
        }
    }

    public static <M extends C23836g1> M parseWithIOException(C24062w1<M> w1Var, InputStream inputStream) {
        try {
            return (C23836g1) w1Var.parseFrom(inputStream);
        } catch (C23922p0 e) {
            throw e.mo38013j();
        }
    }

    public static <V> void serializeBooleanMapTo(C23897n nVar, C16976a1<Boolean, V> a1Var, C24074y0<Boolean, V> y0Var, int i) {
        Map<Boolean, V> e = a1Var.mo18655e();
        nVar.getClass();
        serializeMapTo(nVar, e, y0Var, i);
    }

    public static <V> void serializeIntegerMapTo(C23897n nVar, C16976a1<Integer, V> a1Var, C24074y0<Integer, V> y0Var, int i) {
        Map<Integer, V> e = a1Var.mo18655e();
        nVar.getClass();
        serializeMapTo(nVar, e, y0Var, i);
    }

    public static <V> void serializeLongMapTo(C23897n nVar, C16976a1<Long, V> a1Var, C24074y0<Long, V> y0Var, int i) {
        Map<Long, V> e = a1Var.mo18655e();
        nVar.getClass();
        serializeMapTo(nVar, e, y0Var, i);
    }

    private static <K, V> void serializeMapTo(C23897n nVar, Map<K, V> map, C24074y0<K, V> y0Var, int i) {
        for (Map.Entry next : map.entrySet()) {
            C24074y0.C24075b<K, V> b = y0Var.newBuilderForType();
            b.f69210e = next.getKey();
            b.f69212g = true;
            b.f69211f = next.getValue();
            b.f69213h = true;
            nVar.mo37909P(i, b.build());
        }
    }

    public static <V> void serializeStringMapTo(C23897n nVar, C16976a1<String, V> a1Var, C24074y0<String, V> y0Var, int i) {
        Map<String, V> e = a1Var.mo18655e();
        nVar.getClass();
        serializeMapTo(nVar, e, y0Var, i);
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public static void writeString(C23897n nVar, int i, Object obj) {
        if (obj instanceof String) {
            nVar.mo37914U(i, (String) obj);
        } else {
            nVar.mo37899F(i, (C16994k) obj);
        }
    }

    public static void writeStringNoTag(C23897n nVar, Object obj) {
        if (obj instanceof String) {
            nVar.mo37915V((String) obj);
        } else {
            nVar.mo37900G((C16994k) obj);
        }
    }

    public Map<C24025t.C24035g, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<C24025t.C24035g, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    public C24025t.C24027b getDescriptorForType() {
        return internalGetFieldAccessorTable().f68428a;
    }

    public Object getField(C24025t.C24035g gVar) {
        return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37884i(this);
    }

    public Object getFieldRaw(C24025t.C24035g gVar) {
        return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37876a(this);
    }

    public C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar) {
        C23880f.C23883c a = C23880f.m29176a(internalGetFieldAccessorTable(), kVar);
        C24025t.C24035g gVar = a.f68439e;
        if (gVar == null) {
            int number = ((C23908o0.C23911c) invokeOrDie(a.f68436b, this, new Object[0])).getNumber();
            if (number > 0) {
                return a.f68435a.mo38317g(number);
            }
            return null;
        } else if (hasField(gVar)) {
            return a.f68439e;
        } else {
            return null;
        }
    }

    public C24062w1<? extends C23872m0> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public Object getRepeatedField(C24025t.C24035g gVar, int i) {
        return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37891o(this, i);
    }

    public int getRepeatedFieldCount(C24025t.C24035g gVar) {
        return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37877b(this);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int c = C23902n1.m29377c(this, getAllFieldsRaw());
        this.memoizedSize = c;
        return c;
    }

    public C24020s2 getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public boolean hasField(C24025t.C24035g gVar) {
        return C23880f.m29177b(internalGetFieldAccessorTable(), gVar).mo37879d(this);
    }

    public boolean hasOneof(C24025t.C24042k kVar) {
        C23880f.C23883c a = C23880f.m29176a(internalGetFieldAccessorTable(), kVar);
        C24025t.C24035g gVar = a.f68439e;
        return gVar != null ? hasField(gVar) : ((C23908o0.C23911c) invokeOrDie(a.f68436b, this, new Object[0])).getNumber() != 0;
    }

    public abstract C23880f internalGetFieldAccessorTable();

    public C16976a1 internalGetMapField(int i) {
        String name = getClass().getName();
        throw new RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new String("No map fields found in "));
    }

    public boolean isInitialized() {
        for (C24025t.C24035g next : getDescriptorForType().mo38319h()) {
            if (next.mo38343l() && !hasField(next)) {
                return false;
            }
            if (next.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                if (next.mo37662E0()) {
                    for (C23836g1 isInitialized : (List) getField(next)) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (hasField(next) && !((C23836g1) getField(next)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
    }

    public void mergeFromAndMakeImmutableInternal(C23856l lVar, C23806a0 a0Var) {
        C24086z1 z1Var = C24086z1.f69225c;
        z1Var.getClass();
        C23828f2<?> a = z1Var.mo38436a(getClass());
        try {
            C23871m mVar = lVar.f68362d;
            if (mVar == null) {
                mVar = new C23871m(lVar);
            }
            a.mo37617h(this, mVar, a0Var);
            a.mo37613e(this);
        } catch (C23922p0 e) {
            e.f68530d = this;
            throw e;
        } catch (IOException e2) {
            C23922p0 p0Var = new C23922p0(e2);
            p0Var.f68530d = this;
            throw p0Var;
        }
    }

    public C23836g1.C23837a newBuilderForType(C23803a.C23805b bVar) {
        return newBuilderForType((C23876c) new C23873a(this, bVar));
    }

    public abstract C23836g1.C23837a newBuilderForType(C23876c cVar);

    public Object newInstance(C23895g gVar) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public boolean parseUnknownField(C23856l lVar, C24020s2.C24021a aVar, C23806a0 a0Var, int i) {
        lVar.getClass();
        return aVar.mo38302e(i, lVar);
    }

    public boolean parseUnknownFieldProto3(C23856l lVar, C24020s2.C24021a aVar, C23806a0 a0Var, int i) {
        return parseUnknownField(lVar, aVar, a0Var, i);
    }

    public Object writeReplace() {
        return new C23861l0.C23868g(this);
    }

    public void writeTo(C23897n nVar) {
        C23902n1.m29380f(this, getAllFieldsRaw(), nVar, false);
    }

    /* renamed from: com.google.protobuf.m0$e */
    public static abstract class C23878e<MessageType extends C23878e> extends C23872m0 implements C23896m1 {

        /* renamed from: d */
        public final C23832g0<C24025t.C24035g> f68424d;

        /* renamed from: com.google.protobuf.m0$e$a */
        public class C23879a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C24025t.C24035g, Object>> f68425a;

            /* renamed from: b */
            public Map.Entry<C24025t.C24035g, Object> f68426b;

            /* renamed from: c */
            public final boolean f68427c;

            public C23879a(C23878e eVar, boolean z, C23873a aVar) {
                Iterator<Map.Entry<C24025t.C24035g, Object>> t = eVar.f68424d.mo37650t();
                this.f68425a = t;
                if (t.hasNext()) {
                    this.f68426b = t.next();
                }
                this.f68427c = z;
            }

            /* renamed from: a */
            public void mo37874a(int i, C23897n nVar) {
                while (true) {
                    Map.Entry<C24025t.C24035g, Object> entry = this.f68426b;
                    if (entry != null && entry.getKey().f69104e.f68739f < i) {
                        C24025t.C24035g key = this.f68426b.getKey();
                        if (!this.f68427c || key.mo37664Q() != C24087z2.C24094c.MESSAGE || key.mo37662E0()) {
                            C23832g0.m28829A(key, this.f68426b.getValue(), nVar);
                        } else {
                            Map.Entry<C24025t.C24035g, Object> entry2 = this.f68426b;
                            if (entry2 instanceof C23932r0.C23934b) {
                                nVar.mo37913T(key.f69104e.f68739f, ((C23932r0.C23934b) entry2).f68562d.getValue().mo38290b());
                            } else {
                                nVar.mo37912S(key.f69104e.f68739f, (C23836g1) entry2.getValue());
                            }
                        }
                        if (this.f68425a.hasNext()) {
                            this.f68426b = this.f68425a.next();
                        } else {
                            this.f68426b = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public C23878e() {
            this.f68424d = new C23832g0<>();
        }

        /* renamed from: e */
        private void m29170e(C24025t.C24035g gVar) {
            if (gVar.f69110n != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        /* renamed from: a */
        public boolean mo37870a() {
            return this.f68424d.mo37649q();
        }

        /* renamed from: b */
        public int mo37871b() {
            return this.f68424d.mo37646n();
        }

        /* renamed from: c */
        public Map<C24025t.C24035g, Object> mo37872c() {
            return this.f68424d.mo37642j();
        }

        /* renamed from: d */
        public C23878e<MessageType>.a mo37873d() {
            return new C23879a(this, false, (C23873a) null);
        }

        public Map<C24025t.C24035g, Object> getAllFields() {
            Map access$800 = getAllFieldsMutable(false);
            access$800.putAll(mo37872c());
            return Collections.unmodifiableMap(access$800);
        }

        public Map<C24025t.C24035g, Object> getAllFieldsRaw() {
            Map access$800 = getAllFieldsMutable(false);
            access$800.putAll(mo37872c());
            return Collections.unmodifiableMap(access$800);
        }

        public Object getField(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return C23872m0.super.getField(gVar);
            }
            m29170e(gVar);
            Object k = this.f68424d.mo37643k(gVar);
            return k == null ? gVar.mo37662E0() ? Collections.emptyList() : gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE ? C24051v.m29929a(gVar.mo38339h()) : gVar.mo38337f() : k;
        }

        public Object getRepeatedField(C24025t.C24035g gVar, int i) {
            if (!gVar.mo38340i()) {
                return C23872m0.super.getRepeatedField(gVar, i);
            }
            m29170e(gVar);
            C23832g0<C24025t.C24035g> g0Var = this.f68424d;
            g0Var.getClass();
            if (gVar.mo37662E0()) {
                Object k = g0Var.mo37643k(gVar);
                if (k != null) {
                    return ((List) k).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public int getRepeatedFieldCount(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return C23872m0.super.getRepeatedFieldCount(gVar);
            }
            m29170e(gVar);
            C23832g0<C24025t.C24035g> g0Var = this.f68424d;
            g0Var.getClass();
            if (gVar.mo37662E0()) {
                Object k = g0Var.mo37643k(gVar);
                if (k == null) {
                    return 0;
                }
                return ((List) k).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public boolean hasField(C24025t.C24035g gVar) {
            if (!gVar.mo38340i()) {
                return C23872m0.super.hasField(gVar);
            }
            m29170e(gVar);
            return this.f68424d.mo37647o(gVar);
        }

        public boolean isInitialized() {
            return C23872m0.super.isInitialized() && mo37870a();
        }

        public void makeExtensionsImmutable() {
            this.f68424d.mo37651u();
        }

        public boolean parseUnknownField(C23856l lVar, C24020s2.C24021a aVar, C23806a0 a0Var, int i) {
            lVar.getClass();
            return C23902n1.m29378d(lVar, aVar, a0Var, getDescriptorForType(), new C23902n1.C23904b(this.f68424d), i);
        }

        public boolean parseUnknownFieldProto3(C23856l lVar, C24020s2.C24021a aVar, C23806a0 a0Var, int i) {
            return parseUnknownField(lVar, aVar, a0Var, i);
        }

        public C23878e(C23877d<MessageType, ?> dVar) {
            super(dVar);
            C23832g0<C24025t.C24035g> g0Var;
            C23832g0.C23834b<C24025t.C24035g> bVar = dVar.f68423d;
            if (bVar == null) {
                g0Var = C23832g0.f68258d;
            } else if (bVar.f68262a.isEmpty()) {
                g0Var = C23832g0.f68258d;
            } else {
                bVar.f68264c = false;
                C23849k2<T, Object> k2Var = bVar.f68262a;
                if (bVar.f68265d) {
                    k2Var = C23832g0.m28830d(k2Var, false);
                    C23832g0.C23834b.m28858g(k2Var);
                }
                C23832g0<C24025t.C24035g> g0Var2 = new C23832g0<>(k2Var);
                g0Var2.f68261c = bVar.f68263b;
                g0Var = g0Var2;
            }
            this.f68424d = g0Var;
        }
    }

    public static <M extends C23836g1> M parseDelimitedWithIOException(C24062w1<M> w1Var, InputStream inputStream, C23806a0 a0Var) {
        try {
            return (C23836g1) w1Var.parseDelimitedFrom(inputStream, a0Var);
        } catch (C23922p0 e) {
            throw e.mo38013j();
        }
    }

    public static <M extends C23836g1> M parseWithIOException(C24062w1<M> w1Var, InputStream inputStream, C23806a0 a0Var) {
        try {
            return (C23836g1) w1Var.parseFrom(inputStream, a0Var);
        } catch (C23922p0 e) {
            throw e.mo38013j();
        }
    }

    public C23872m0(C23874b<?> bVar) {
        this.unknownFields = bVar.getUnknownFields();
    }

    public static C23908o0.C23918i mutableCopy(C23908o0.C23918i iVar) {
        int i = ((C24061w0) iVar).f69187f;
        return ((C24061w0) iVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static <M extends C23836g1> M parseWithIOException(C24062w1<M> w1Var, C23856l lVar) {
        try {
            return (C23836g1) w1Var.parseFrom(lVar);
        } catch (C23922p0 e) {
            throw e.mo38013j();
        }
    }

    public static C23908o0.C23914f mutableCopy(C23908o0.C23914f fVar) {
        int i = ((C23843i0) fVar).f68337f;
        return ((C23843i0) fVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static <M extends C23836g1> M parseWithIOException(C24062w1<M> w1Var, C23856l lVar, C23806a0 a0Var) {
        try {
            return (C23836g1) w1Var.parseFrom(lVar, a0Var);
        } catch (C23922p0 e) {
            throw e.mo38013j();
        }
    }

    public static C23908o0.C23910b mutableCopy(C23908o0.C23910b bVar) {
        int i = ((C24047u) bVar).f69167f;
        return ((C24047u) bVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static C23908o0.C23909a mutableCopy(C23908o0.C23909a aVar) {
        int i = ((C23838h) aVar).f68268f;
        return ((C23838h) aVar).mo37467E0(i == 0 ? 10 : i * 2);
    }
}
