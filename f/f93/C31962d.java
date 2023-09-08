package f93;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: f93.d */
public final class C31962d {

    /* renamed from: f93.d$a */
    public enum C31963a {
        ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD(1),
        ACTION_CACHE_EXPIRE_AND_DOWNLOAD(2),
        ACTION_NO_CACHE_AND_DOWNLOAD(3);
        

        /* renamed from: d */
        public final int f85118d;

        /* access modifiers changed from: public */
        C31963a(int i) {
            this.f85118d = i;
        }
    }

    /* renamed from: f93.d$b */
    public enum C31964b {
        MANIFEST(1),
        CONTENT(2),
        WXA_PKG_RESOURCE_BY_APPID(4),
        PKG_URL_RESOURCE_WXA_PKG(7),
        PKG_URL_RESOURCE_WX_PREFETCH_CONFIG_FILE(8);
        

        /* renamed from: d */
        public final int f85125d;

        /* access modifiers changed from: public */
        C31964b(int i) {
            this.f85125d = i;
        }
    }

    /* renamed from: a */
    public static final void m39599a(C31963a aVar, C31964b bVar, String str, int i, int i2, int i3, String str2, String str3) {
        C87412m.m108594g(aVar, "action");
        C87412m.m108594g(bVar, "type");
        Log.m105927v("MicroMsg.WebPrefetchReporter", "reportWebPrefetchDownloadAction action: " + aVar + ", type: " + bVar + ", host: " + str + ", entranceScene: " + i + ", bizScene: " + i2 + ", subBizScene: " + i3 + ", url: %s", str3);
        C115669n.INSTANCE.mo160131h(21074, str, Integer.valueOf(i2), Integer.valueOf(bVar.f85125d), str2, str3, Integer.valueOf(aVar.f85118d), Integer.valueOf(i3), Integer.valueOf(i));
    }
}
