package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113846jl;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mapsdk.internal.jn */
public final class C113850jn {

    /* renamed from: a */
    public C113925lb f340623a = new C113925lb();

    /* renamed from: b */
    private ConcurrentHashMap<String, Map<String, C113846jl>> f340624b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final <D extends C113849jm, C extends C113846jl<D>> C mo172235a(Class<D> cls, C113846jl.C113847a aVar, Class<C> cls2) {
        C c;
        Map map = this.f340624b.get(cls2.getName());
        String a = C113853jp.m157305a(cls.getName() + aVar.toString());
        String name = cls2.getName();
        Constructor constructor = null;
        if (map != null) {
            c = (C113846jl) map.get(a);
            if (c != null) {
                return c;
            }
        } else {
            c = null;
        }
        for (Constructor constructor2 : cls2.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == aVar.getClass()) {
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            try {
                c = (C113846jl) constructor.newInstance(new Object[]{aVar});
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            }
        }
        if (c != null) {
            if (map == null) {
                map = new HashMap();
            }
            map.put(a, c);
            this.f340624b.put(name, map);
        }
        return c;
    }

    /* renamed from: com.tencent.mapsdk.internal.jn$a */
    public static class C113851a<D extends C113849jm> extends C104555ku<String, D> {

        /* renamed from: a */
        private C113846jl.C113848b<D> f340625a;

        public C113851a(int i, C113846jl.C113848b<D> bVar) {
            super(i);
            this.f340625a = bVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo147868a(Object obj) {
            C113849jm jmVar = (C113849jm) obj;
            if (jmVar != null) {
                return jmVar.mo56234a();
            }
            return 0;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo147871a(boolean z, Object obj) {
            C113846jl.C113848b<D> bVar;
            C113849jm jmVar = (C113849jm) obj;
            if (z && (bVar = this.f340625a) != null) {
                bVar.mo147866a(jmVar);
            }
        }

        /* renamed from: a */
        private static int m157280a(D d) {
            if (d != null) {
                return d.mo56234a();
            }
            return 0;
        }

        /* renamed from: a */
        private void m157281a(boolean z, D d) {
            C113846jl.C113848b<D> bVar;
            if (z && (bVar = this.f340625a) != null) {
                bVar.mo147866a(d);
            }
        }
    }

    /* renamed from: a */
    private String m157278a(String str) {
        return this.f340623a.mo172345a(str);
    }
}
