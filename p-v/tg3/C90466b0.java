package tg3;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.xwebutil.C19911o;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.XWebSdk;
import java.util.HashMap;
import s01.C101493b;
import y01.C102794a;

/* renamed from: tg3.b0 */
public class C90466b0 implements C90481o {

    /* renamed from: tg3.b0$b */
    public static final class C90468b {

        /* renamed from: a */
        public static final C90466b0 f260021a = new C90466b0((C90467a) null);
    }

    public C90466b0(C90467a aVar) {
        C102794a aVar2;
        C19911o.m21657b();
        synchronized (C102794a.class) {
            if (C102794a.f303486c == null) {
                C102794a.f303486c = new C102794a();
            }
            C101493b.m133250g();
            aVar2 = C102794a.f303486c;
        }
        XWebSdk.setFileDownloaderProxy(aVar2);
    }

    /* renamed from: d */
    public boolean mo124627d(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("intent_extra_download_type", 4);
        Log.m105925i("MicroMsg.XWeb.MM.WCWebDownloadMgr", "handleCommand, downloadType:%d [4:timer/5:notify/6:config]", Integer.valueOf(intExtra));
        HashMap hashMap = new HashMap();
        if (intExtra == 5) {
            hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, "1");
        } else if (intExtra == 6) {
            hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
        } else {
            hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, "0");
        }
        XWebSdk.startCheck(MMApplicationContext.getContext(), hashMap);
        return true;
    }

    /* renamed from: h */
    public void mo124628h(boolean z) {
    }

    public boolean isBusy() {
        boolean isBusy = XWebSdk.isBusy();
        Log.m105924i("MicroMsg.XWeb.MM.WCWebDownloadMgr", "isBusy = " + isBusy);
        return isBusy;
    }

    public void onDestroy() {
    }
}
