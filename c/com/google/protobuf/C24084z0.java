package com.google.protobuf;

import com.google.protobuf.C23845j1;
import com.google.protobuf.C24087z2;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.protobuf.z0 */
public class C24084z0<K, V> {

    /* renamed from: com.google.protobuf.z0$a */
    public static class C24085a<K, V> {

        /* renamed from: a */
        public final C24087z2.C24089b f69221a;

        /* renamed from: b */
        public final K f69222b;

        /* renamed from: c */
        public final C24087z2.C24089b f69223c;

        /* renamed from: d */
        public final V f69224d;

        public C24085a(C24087z2.C24089b bVar, K k, C24087z2.C24089b bVar2, V v) {
            this.f69221a = bVar;
            this.f69222b = k;
            this.f69223c = bVar2;
            this.f69224d = v;
        }
    }

    /* renamed from: a */
    public static <K, V> int m30082a(C24085a<K, V> aVar, K k, V v) {
        return C23832g0.m28833g(aVar.f69221a, 1, k) + C23832g0.m28833g(aVar.f69223c, 2, v);
    }

    /* renamed from: b */
    public static <K, V> Map.Entry<K, V> m30083b(C23856l lVar, C24085a<K, V> aVar, C23806a0 a0Var) {
        K k = aVar.f69222b;
        V v = aVar.f69224d;
        while (true) {
            int F = lVar.mo37757F();
            if (F == 0) {
                break;
            }
            C24087z2.C24089b bVar = aVar.f69221a;
            if (F == (bVar.f69234e | 8)) {
                k = m30084c(lVar, a0Var, bVar, k);
            } else {
                C24087z2.C24089b bVar2 = aVar.f69223c;
                if (F == (bVar2.f69234e | 16)) {
                    v = m30084c(lVar, a0Var, bVar2, v);
                } else if (!lVar.mo37760I(F)) {
                    break;
                }
            }
        }
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: c */
    public static <T> T m30084c(C23856l lVar, C23806a0 a0Var, C24087z2.C24089b bVar, T t) {
        int ordinal = bVar.ordinal();
        if (ordinal == 9) {
            throw new RuntimeException("Groups are not allowed in maps.");
        } else if (ordinal == 10) {
            C23845j1.C23846a builder = ((C23845j1) t).toBuilder();
            lVar.mo37778w(builder, a0Var);
            return builder.buildPartial();
        } else if (ordinal == 13) {
            return Integer.valueOf(lVar.mo37770o());
        } else {
            C23832g0 g0Var = C23832g0.f68258d;
            return C24087z2.m30087a(lVar, bVar, C24087z2.C24095d.STRICT);
        }
    }

    /* renamed from: d */
    public static <K, V> void m30085d(C23897n nVar, C24085a<K, V> aVar, K k, V v) {
        C23832g0.m28838y(nVar, aVar.f69221a, 1, k);
        C23832g0.m28838y(nVar, aVar.f69223c, 2, v);
    }
}
