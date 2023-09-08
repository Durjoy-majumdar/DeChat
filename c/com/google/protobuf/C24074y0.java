package com.google.protobuf;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24084z0;
import com.google.protobuf.C24087z2;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.y0 */
public final class C24074y0<K, V> extends C23803a {

    /* renamed from: d */
    public final K f69205d;

    /* renamed from: e */
    public final V f69206e;

    /* renamed from: f */
    public final C24076c<K, V> f69207f;

    /* renamed from: g */
    public volatile int f69208g = -1;

    /* renamed from: com.google.protobuf.y0$c */
    public static final class C24076c<K, V> extends C24084z0.C24085a<K, V> {

        /* renamed from: e */
        public final C24025t.C24027b f69214e;

        /* renamed from: f */
        public final C24062w1<C24074y0<K, V>> f69215f = new C24077a();

        /* renamed from: com.google.protobuf.y0$c$a */
        public class C24077a extends C23813c<C24074y0<K, V>> {
            public C24077a() {
            }

            public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new C24074y0(C24076c.this, lVar, a0Var, (C17016a) null);
            }
        }

        public C24076c(C24025t.C24027b bVar, C24074y0<K, V> y0Var, C24087z2.C24089b bVar2, C24087z2.C24089b bVar3) {
            super(bVar2, y0Var.f69205d, bVar3, y0Var.f69206e);
            this.f69214e = bVar;
        }
    }

    public C24074y0(C24025t.C24027b bVar, C24087z2.C24089b bVar2, K k, C24087z2.C24089b bVar3, V v) {
        this.f69205d = k;
        this.f69206e = v;
        this.f69207f = new C24076c<>(bVar, this, bVar2, bVar3);
    }

    /* renamed from: a */
    public final void mo38426a(C24025t.C24035g gVar) {
        if (gVar.f69110n != this.f69207f.f69214e) {
            String str = gVar.f69105f;
            String str2 = this.f69207f.f69214e.f69070e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(str2).length());
            sb.append("Wrong FieldDescriptor \"");
            sb.append(str);
            sb.append("\" used in message \"");
            sb.append(str2);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public C24075b<K, V> newBuilderForType() {
        C24076c<K, V> cVar = this.f69207f;
        return new C24075b(cVar, cVar.f69222b, cVar.f69224d, false, false);
    }

    public Map<C24025t.C24035g, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (C24025t.C24035g next : this.f69207f.f69214e.mo38319h()) {
            mo38426a(next);
            treeMap.put(next, getField(next));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public C23836g1 getDefaultInstanceForType() {
        C24076c<K, V> cVar = this.f69207f;
        return new C24074y0(cVar, cVar.f69222b, cVar.f69224d);
    }

    public C24025t.C24027b getDescriptorForType() {
        return this.f69207f.f69214e;
    }

    public Object getField(C24025t.C24035g gVar) {
        mo38426a(gVar);
        Integer num = gVar.f69104e.f68739f == 1 ? this.f69205d : this.f69206e;
        return gVar.f69109j == C24025t.C24035g.C24037b.ENUM ? gVar.mo38338g().mo38333g(num.intValue()) : num;
    }

    public C24062w1<C24074y0<K, V>> getParserForType() {
        return this.f69207f.f69215f;
    }

    public int getSerializedSize() {
        if (this.f69208g != -1) {
            return this.f69208g;
        }
        int a = C24084z0.m30082a(this.f69207f, this.f69205d, this.f69206e);
        this.f69208g = a;
        return a;
    }

    public C24020s2 getUnknownFields() {
        return C24020s2.f69054f;
    }

    public boolean hasField(C24025t.C24035g gVar) {
        mo38426a(gVar);
        return true;
    }

    public boolean isInitialized() {
        C24076c<K, V> cVar = this.f69207f;
        V v = this.f69206e;
        if (cVar.f69223c.f69233d == C24087z2.C24094c.MESSAGE) {
            return ((C23845j1) v).isInitialized();
        }
        return true;
    }

    public C23836g1.C23837a toBuilder() {
        return new C24075b(this.f69207f, this.f69205d, this.f69206e, true, true);
    }

    public void writeTo(C23897n nVar) {
        C24084z0.m30085d(nVar, this.f69207f, this.f69205d, this.f69206e);
    }

    /* renamed from: com.google.protobuf.y0$b */
    public static class C24075b<K, V> extends C23803a.C23804a<C24075b<K, V>> {

        /* renamed from: d */
        public final C24076c<K, V> f69209d;

        /* renamed from: e */
        public K f69210e;

        /* renamed from: f */
        public V f69211f;

        /* renamed from: g */
        public boolean f69212g;

        /* renamed from: h */
        public boolean f69213h;

        public C24075b(C24076c<K, V> cVar, K k, V v, boolean z, boolean z2) {
            this.f69209d = cVar;
            this.f69210e = k;
            this.f69211f = v;
            this.f69212g = z;
            this.f69213h = z2;
        }

        /* renamed from: a */
        public C24074y0<K, V> build() {
            C24074y0<K, V> y0Var = new C24074y0<>(this.f69209d, this.f69210e, this.f69211f);
            if (y0Var.isInitialized()) {
                return y0Var;
            }
            throw C23803a.C23804a.newUninitializedMessageException(y0Var);
        }

        public C23836g1.C23837a addRepeatedField(C24025t.C24035g gVar, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        /* renamed from: b */
        public final void mo38429b(C24025t.C24035g gVar) {
            if (gVar.f69110n != this.f69209d.f69214e) {
                String str = gVar.f69105f;
                String str2 = this.f69209d.f69214e.f69070e;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(str2).length());
                sb.append("Wrong FieldDescriptor \"");
                sb.append(str);
                sb.append("\" used in message \"");
                sb.append(str2);
                throw new RuntimeException(sb.toString());
            }
        }

        public C23836g1 buildPartial() {
            return new C24074y0(this.f69209d, this.f69210e, this.f69211f);
        }

        /* renamed from: c */
        public C24075b<K, V> clone() {
            return new C24075b(this.f69209d, this.f69210e, this.f69211f, this.f69212g, this.f69213h);
        }

        public C23836g1.C23837a clearField(C24025t.C24035g gVar) {
            mo38429b(gVar);
            if (gVar.f69104e.f68739f == 1) {
                this.f69210e = this.f69209d.f69222b;
                this.f69212g = false;
            } else {
                this.f69211f = this.f69209d.f69224d;
                this.f69213h = false;
            }
            return this;
        }

        public Map<C24025t.C24035g, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (C24025t.C24035g next : this.f69209d.f69214e.mo38319h()) {
                if (hasField(next)) {
                    treeMap.put(next, getField(next));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        public C23836g1 getDefaultInstanceForType() {
            C24076c<K, V> cVar = this.f69209d;
            return new C24074y0(cVar, cVar.f69222b, cVar.f69224d);
        }

        public C24025t.C24027b getDescriptorForType() {
            return this.f69209d.f69214e;
        }

        public Object getField(C24025t.C24035g gVar) {
            mo38429b(gVar);
            Integer num = gVar.f69104e.f68739f == 1 ? this.f69210e : this.f69211f;
            return gVar.f69109j == C24025t.C24035g.C24037b.ENUM ? gVar.mo38338g().mo38333g(num.intValue()) : num;
        }

        public C24020s2 getUnknownFields() {
            return C24020s2.f69054f;
        }

        public boolean hasField(C24025t.C24035g gVar) {
            mo38429b(gVar);
            return gVar.f69104e.f68739f == 1 ? this.f69212g : this.f69213h;
        }

        public C23836g1.C23837a newBuilderForField(C24025t.C24035g gVar) {
            mo38429b(gVar);
            if (gVar.f69104e.f68739f == 2 && gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                return ((C23836g1) this.f69211f).newBuilderForType();
            }
            String str = gVar.f69105f;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
            sb.append(FastJsonResponse.QUOTE);
            sb.append(str);
            sb.append("\" is not a message value field.");
            throw new RuntimeException(sb.toString());
        }

        public C23836g1.C23837a setField(C24025t.C24035g gVar, Object obj) {
            mo38429b(gVar);
            if (gVar.f69104e.f68739f == 1) {
                this.f69210e = obj;
                this.f69212g = true;
            } else {
                C24025t.C24035g.C24037b bVar = gVar.f69109j;
                if (bVar == C24025t.C24035g.C24037b.ENUM) {
                    obj = Integer.valueOf(((C24025t.C24034f) obj).f69098e.f68710f);
                } else if (bVar == C24025t.C24035g.C24037b.MESSAGE && obj != null && !this.f69209d.f69224d.getClass().isInstance(obj)) {
                    obj = ((C23836g1) this.f69209d.f69224d).toBuilder().mergeFrom((C23836g1) obj).build();
                }
                this.f69211f = obj;
                this.f69213h = true;
            }
            return this;
        }

        public C23836g1.C23837a setUnknownFields(C24020s2 s2Var) {
            return this;
        }

        /* renamed from: buildPartial  reason: collision with other method in class */
        public C23845j1 m168475buildPartial() {
            return new C24074y0(this.f69209d, this.f69210e, this.f69211f);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public C23845j1 m168476getDefaultInstanceForType() {
            C24076c<K, V> cVar = this.f69209d;
            return new C24074y0(cVar, cVar.f69222b, cVar.f69224d);
        }
    }

    /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
    public C23845j1 m168473getDefaultInstanceForType() {
        C24076c<K, V> cVar = this.f69207f;
        return new C24074y0(cVar, cVar.f69222b, cVar.f69224d);
    }

    /* renamed from: toBuilder  reason: collision with other method in class */
    public C23845j1.C23846a m168474toBuilder() {
        return new C24075b(this.f69207f, this.f69205d, this.f69206e, true, true);
    }

    public C24074y0(C24076c cVar, K k, V v) {
        this.f69205d = k;
        this.f69206e = v;
        this.f69207f = cVar;
    }

    public C24074y0(C24076c cVar, C23856l lVar, C23806a0 a0Var, C17016a aVar) {
        try {
            this.f69207f = cVar;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) C24084z0.m30083b(lVar, cVar, a0Var);
            this.f69205d = simpleImmutableEntry.getKey();
            this.f69206e = simpleImmutableEntry.getValue();
        } catch (C23922p0 e) {
            e.f68530d = this;
            throw e;
        } catch (IOException e2) {
            C23922p0 p0Var = new C23922p0(e2);
            p0Var.f68530d = this;
            throw p0Var;
        }
    }
}
