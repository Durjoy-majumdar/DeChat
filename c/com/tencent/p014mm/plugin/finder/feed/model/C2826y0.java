package com.tencent.p014mm.plugin.finder.feed.model;

import android.content.Intent;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import pe3.C89349b;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.y0 */
public final class C2826y0 {

    /* renamed from: g */
    public static final ConcurrentHashMap<Long, C2819w0> f14101g = new ConcurrentHashMap<>();

    /* renamed from: a */
    public C89349b f14102a;

    /* renamed from: b */
    public C49712hj1 f14103b;

    /* renamed from: c */
    public C2819w0 f14104c;

    /* renamed from: d */
    public C2819w0 f14105d;

    /* renamed from: e */
    public long f14106e;

    /* renamed from: f */
    public final HashMap<String, C2819w0> f14107f = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.y0$a */
    public static final class C2827a {
        public C2827a(C8480h hVar) {
        }
    }

    static {
        new C2827a((C8480h) null);
    }

    /* renamed from: a */
    public final C2819w0 mo2925a(String str) {
        C87412m.m108594g(str, "key");
        return this.f14107f.get(str);
    }

    /* renamed from: b */
    public final void mo2926b(C2819w0 w0Var, Intent intent) {
        C87412m.m108594g(w0Var, "toCache");
        C87412m.m108594g(intent, "intent");
        long j = this.f14106e;
        if (j != 0) {
            ConcurrentHashMap<Long, C2819w0> concurrentHashMap = f14101g;
            if (concurrentHashMap.containsKey(Long.valueOf(j))) {
                C2819w0 remove = concurrentHashMap.remove(Long.valueOf(j));
            }
        }
        long a = C31543z5.m39451a();
        f14101g.put(Long.valueOf(a), w0Var);
        intent.putExtra("LoaderCacheStoreIntentKey", a);
        this.f14106e = a;
    }
}
