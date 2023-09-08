package f51;

import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.model.C29855f0;
import com.tencent.p014mm.plugin.downloader_app.model.v$$g;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import i51.C33204b;
import p763ym.C79138l;
import z41.C53736a;

/* renamed from: f51.e */
public class C45751e implements v$$g {
    /* renamed from: f */
    public void mo64031f(int i, long j) {
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            Log.m105925i("MicroMsg.DownloadStatusChangeEventListener", "onDownloadStatusChange, event = %d, appId = %s", Integer.valueOf(i), c.field_appId);
            if (C29855f0.m38891b(c.field_appId)) {
                if (i == 9) {
                    String str = c.field_appId;
                    C29855f0.m38893d();
                    if (!C29855f0.f80901b.contains(str)) {
                        C29855f0.f80900a.remove(str);
                        C29855f0.f80901b.addFirst(str);
                        C33204b.m39982c(str, 1);
                    }
                } else if (i == 1 || i == 7) {
                    C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(c.field_appId);
                    if (appInfo == null || !C72688j0.m85020f(MMApplicationContext.getContext(), appInfo.field_packageName)) {
                        String str2 = c.field_appId;
                        C29855f0.m38893d();
                        if (!C29855f0.f80900a.contains(str2)) {
                            C29855f0.f80901b.remove(str2);
                            C29855f0.f80900a.addFirst(str2);
                            C33204b.m39982c(str2, 0);
                            return;
                        }
                        return;
                    }
                    Log.m105924i("MicroMsg.DownloadStatusChangeEventListener", "onDownloadStatusChange, hasInstall");
                }
            }
        }
    }
}
