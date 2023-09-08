package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.utils.cache.DiskCache;
import com.tencent.mapsdk.core.utils.cache.MemoryCache;
import com.tencent.mapsdk.internal.C113846jl;
import com.tencent.mapsdk.internal.C113856jr;
import java.util.Arrays;

/* renamed from: com.tencent.mapsdk.internal.jp */
public final class C113853jp {

    /* renamed from: a */
    private static C113850jn f340628a = new C113850jn();

    /* renamed from: a */
    public static String m157305a(String str) {
        return f340628a.f340623a.mo172345a(str);
    }

    /* renamed from: b */
    private static <D extends C113849jm> C113861js<D> m157307b(Class<D> cls, C113846jl.C113847a... aVarArr) {
        return m157304a(m157303a(cls, aVarArr));
    }

    /* renamed from: c */
    private static <D extends C113849jm> C113836jj<D> m157308c(Class<D> cls, C113846jl.C113847a... aVarArr) {
        C113846jl<D> a = m157303a(cls, aVarArr);
        if (a instanceof C113836jj) {
            return (C113836jj) a;
        }
        return null;
    }

    /* renamed from: b */
    private static <D extends C113849jm> C113836jj<D> m157306b(C113846jl<D> jlVar) {
        if (jlVar instanceof C113836jj) {
            return (C113836jj) jlVar;
        }
        return null;
    }

    /* renamed from: a */
    public static <D extends C113849jm> C113846jl<D> m157303a(Class<D> cls, C113846jl.C113847a... aVarArr) {
        C113846jl<D> jlVar = null;
        if (!(cls == null || aVarArr == null || aVarArr.length == 0)) {
            C113852jo joVar = new C113852jo();
            boolean z = aVarArr.length > 1;
            for (MemoryCache.C113493a aVar : aVarArr) {
                if (aVar instanceof MemoryCache.C113493a) {
                    jlVar = f340628a.mo172235a(cls, aVar, MemoryCache.class);
                } else if (aVar instanceof C113856jr.C113860c) {
                    C113856jr.C113860c cVar = (C113856jr.C113860c) aVar;
                    C113856jr.C113858a aVar2 = cVar.f340637i;
                    if (aVar2 == C113856jr.C113858a.DISK) {
                        jlVar = f340628a.mo172235a(cls, cVar, DiskCache.class);
                    } else if (aVar2 == C113856jr.C113858a.DB) {
                        jlVar = f340628a.mo172235a(cls, cVar, C113854jq.class);
                    }
                }
                if (z && jlVar != null) {
                    joVar.f340626a.addAll(Arrays.asList(new C113846jl[]{jlVar}));
                }
            }
            if (z) {
                return joVar;
            }
        }
        return jlVar;
    }

    /* renamed from: a */
    public static <D extends C113849jm> C113861js<D> m157304a(C113846jl<D> jlVar) {
        if (jlVar instanceof C113861js) {
            return (C113861js) jlVar;
        }
        return null;
    }
}
