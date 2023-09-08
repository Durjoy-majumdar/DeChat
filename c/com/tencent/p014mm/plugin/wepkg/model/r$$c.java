package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wepkg.model.r$$c */
public class r$$c extends C44488a {

    /* renamed from: b */
    public final /* synthetic */ String f120748b;

    /* renamed from: c */
    public final /* synthetic */ List f120749c;

    /* renamed from: d */
    public final /* synthetic */ boolean f120750d;

    /* renamed from: e */
    public final /* synthetic */ C44523r f120751e;

    public r$$c(C44523r rVar, String str, List list, boolean z) {
        this.f120751e = rVar;
        this.f120748b = str;
        this.f120749c = list;
        this.f120750d = z;
    }

    /* renamed from: a */
    public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
        Object obj = this.f120671a;
        if (!(obj instanceof WepkgPreloadFile) || !(baseWepkgProcessTask instanceof WepkgDownloadProcessTask)) {
            Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "object instanceof  WepkgPreloadFile is false");
            this.f120751e.mo69300c(this.f120748b, this.f120749c, this.f120750d);
            return;
        }
        WepkgDownloadProcessTask wepkgDownloadProcessTask = (WepkgDownloadProcessTask) baseWepkgProcessTask;
        WepkgPreloadFile wepkgPreloadFile = (WepkgPreloadFile) obj;
        if (wepkgDownloadProcessTask.f120635t != WePkgDownloader.IWepkgUpdateCallback.RetCode.OK || Util.isNullOrNil(wepkgDownloadProcessTask.f120634s)) {
            Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "download, errCode:%s,  to loop", wepkgDownloadProcessTask.f120635t);
            this.f120751e.mo69300c(this.f120748b, this.f120749c, this.f120750d);
            return;
        }
        String str = wepkgPreloadFile.f120639e;
        String str2 = wepkgPreloadFile.f120642h;
        String str3 = wepkgDownloadProcessTask.f120634s;
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 4002;
        WepkgPreloadFile wepkgPreloadFile2 = wepkgCrossProcessTask.f120622o;
        wepkgPreloadFile2.f120639e = str;
        wepkgPreloadFile2.f120642h = str2;
        wepkgPreloadFile2.f120641g = str3;
        wepkgPreloadFile2.f120648q = true;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        this.f120751e.mo69300c(this.f120748b, this.f120749c, this.f120750d);
    }
}
