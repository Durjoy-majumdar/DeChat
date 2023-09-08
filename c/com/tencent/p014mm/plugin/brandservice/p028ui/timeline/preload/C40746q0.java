package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45700h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import ny0.C47307b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 */
public final class C40746q0 {

    /* renamed from: a */
    public static final C40746q0 f109487a = new C40746q0();

    /* renamed from: b */
    public static final HashMap<Long, WeakReference<C45700h.C45701a>> f109488b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<Long, HashMap<String, C47307b.C47308a>> f109489c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<Long, HashMap<String, C45700h.C45704d>> f109490d = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0$a */
    public static final class C40747a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f109491d;

        /* renamed from: e */
        public final /* synthetic */ int f109492e;

        /* renamed from: f */
        public final /* synthetic */ String f109493f;

        public C40747a(long j, int i, String str) {
            this.f109491d = j;
            this.f109492e = i;
            this.f109493f = str;
        }

        public final void run() {
            HashMap hashMap = C40746q0.f109490d.get(Long.valueOf(this.f109491d));
            if (hashMap != null) {
                long j = this.f109491d;
                int i = this.f109492e;
                String str = this.f109493f;
                Log.m105925i("MicroMsg.WebPrefetcherCallbackManager", "addPrefetchResult session: %d, prefetchResult: %d, url: %s", Long.valueOf(j), Integer.valueOf(i), str);
                C45700h.C45704d dVar = (C45700h.C45704d) hashMap.get(str);
                if (dVar != null) {
                    dVar.f123530b = i;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m44019b(C40746q0 q0Var, long j, boolean z, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j2 = 0;
        }
        q0Var.getClass();
        ((C119157j) C119157j.f356862d).mo183879j(new C40749r0(j, z), j2, "MicroMsg.WebPrefetcherCallbackManager");
    }

    /* renamed from: a */
    public final void mo63642a(long j, String str, int i) {
        C87412m.m108594g(str, "url");
        ((C119157j) C119157j.f356862d).mo183876g(new C40747a(j, i, str), "MicroMsg.WebPrefetcherCallbackManager");
    }
}
