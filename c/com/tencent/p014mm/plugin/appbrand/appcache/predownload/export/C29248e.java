package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8480h;
import gy3.C87412m;
import kr0.C33983a1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.e */
public final class C29248e implements C33983a1.C33985b {

    /* renamed from: a */
    public final /* synthetic */ C1256g<WxaPkgDownloaderExportServiceIPC.DownloadPkgResult> f79929a;

    public C29248e(C1256g<WxaPkgDownloaderExportServiceIPC.DownloadPkgResult> gVar) {
        this.f79929a = gVar;
    }

    /* renamed from: b */
    public final void mo56555b(C29315z2 z2Var, String str) {
        C87412m.m108594g(z2Var, "record");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C1256g<WxaPkgDownloaderExportServiceIPC.DownloadPkgResult> gVar = this.f79929a;
        if (gVar != null) {
            gVar.mo894a(new WxaPkgDownloaderExportServiceIPC.DownloadPkgResult(true, z2Var.convertTo(), str, 0, (String) null, 24, (C8480h) null));
        }
    }
}
