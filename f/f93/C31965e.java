package f93;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: f93.e */
public final class C31965e {

    /* renamed from: f93.e$a */
    public enum C31966a {
        ACTION_PREFETCH_RESP_VALID(1),
        ACTION_MATCH_MANIFEST(2),
        ACTION_MANIFEST_OPEN_PREFETCH(3),
        ACTION_HIT_PREFETCH_CACHE(4),
        ACTION_ONLY_GETA8KEY_ASYNC(5),
        ACTION_PREFETCH_PAGE_COMMIT(6);
        

        /* renamed from: d */
        public final int f85133d;

        /* access modifiers changed from: public */
        C31966a(int i) {
            this.f85133d = i;
        }
    }

    /* renamed from: a */
    public static final void m39600a(C31966a aVar, String str, String str2, int i, int i2, int i3) {
        C87412m.m108594g(aVar, "action");
        Log.m105927v("MicroMsg.WebPrefetchReporter", "reportWebPrefetchHitRate action: " + aVar + ", entranceScene: " + i + ", bizScene: " + i2 + ", subBizScene: " + i3 + ", url: %s", str);
        C115669n.INSTANCE.mo160131h(21075, Integer.valueOf(i2), str, str2, Integer.valueOf(aVar.f85133d), Integer.valueOf(i3), Integer.valueOf(i));
    }
}
