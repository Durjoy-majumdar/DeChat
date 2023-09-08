package jy0;

import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.core.C5857x;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import ky0.C46796b;
import ky0.C46799c;
import ky0.C46800d;

/* renamed from: jy0.c */
public final class C46581c {

    /* renamed from: a */
    public static Boolean f125484a;

    /* renamed from: b */
    public static final List<C46799c> f125485b;

    static {
        ArrayList arrayList = new ArrayList();
        f125485b = arrayList;
        if (m51903a()) {
            arrayList.add(C46800d.f125924a);
        }
        arrayList.add(C46796b.f125919a);
    }

    /* renamed from: a */
    public static final boolean m51903a() {
        int i;
        boolean z = false;
        if (f125484a == null) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_prefetcher_enable_fetch_content_by_web_transfer, 1);
            f125484a = Boolean.valueOf(Qe == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED);
            Log.m105924i("MicroMsg.WebPrefetcherContentManager", "initConfig enableFetchContentByWebTransfer config: " + Qe + ", enable: " + f125484a);
        }
        Boolean bool = null;
        if (C43520v.f117665a.mo67810a() && (i = C5857x.m5577a().getInt("debugTransfer", -1)) != -1) {
            if (i == 1) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = f125484a;
        C87412m.m108591d(bool2);
        return bool2.booleanValue();
    }
}
