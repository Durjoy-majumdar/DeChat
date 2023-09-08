package com.tencent.p014mm.plugin.appbrand.jsapi;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import p225rc.C12969d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d7 */
public final class C82372d7 {

    /* renamed from: a */
    public static final C82372d7 f241423a = new C82372d7();

    /* renamed from: b */
    public static final Map<C82367d0, HashSet<C82555k0>> f241424b = new LinkedHashMap();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d7$a */
    public static final class C82373a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82367d0 f241425d;

        /* renamed from: e */
        public final /* synthetic */ C82555k0 f241426e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82373a(C82367d0 d0Var, C82555k0 k0Var) {
            super(0);
            this.f241425d = d0Var;
            this.f241426e = k0Var;
        }

        public Object invoke() {
            C82372d7.f241423a.mo114778c(this.f241425d, this.f241426e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo114776a(C82367d0 d0Var, String str) {
        HashSet<C82555k0> hashSet;
        C87412m.m108594g(d0Var, "type");
        C87412m.m108594g(str, "url");
        Map<C82367d0, HashSet<C82555k0>> map = f241424b;
        synchronized (map) {
            hashSet = new HashSet<>();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(d0Var);
            if (obj == null) {
                obj = new HashSet();
                linkedHashMap.put(d0Var, obj);
            }
            hashSet.addAll((Collection) obj);
        }
        for (C82555k0 a : hashSet) {
            a.mo114878a(str);
        }
    }

    /* renamed from: b */
    public final void mo114777b(C82367d0 d0Var, long j, C82555k0 k0Var) {
        C87412m.m108594g(d0Var, "type");
        C87412m.m108594g(k0Var, "watcher");
        Map<C82367d0, HashSet<C82555k0>> map = f241424b;
        synchronized (map) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object obj = linkedHashMap.get(d0Var);
                if (obj == null) {
                    obj = new HashSet();
                    linkedHashMap.put(d0Var, obj);
                }
                ((HashSet) obj).add(k0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        C12969d.m12410d(j, new C82373a(d0Var, k0Var));
    }

    /* renamed from: c */
    public final void mo114778c(C82367d0 d0Var, C82555k0 k0Var) {
        C87412m.m108594g(d0Var, "type");
        C87412m.m108594g(k0Var, "watcher");
        Map<C82367d0, HashSet<C82555k0>> map = f241424b;
        synchronized (map) {
            HashSet hashSet = (HashSet) ((LinkedHashMap) map).get(d0Var);
            if (hashSet != null) {
                hashSet.remove(k0Var);
            }
        }
    }
}
