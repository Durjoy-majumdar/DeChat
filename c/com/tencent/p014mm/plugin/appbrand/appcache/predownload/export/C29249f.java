package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import android.content.ContentValues;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC;
import gy3.C8480h;
import kr0.C33983a1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.f */
public final class C29249f implements C33983a1.C33984a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<WxaPkgDownloaderExportServiceIPC.DownloadPkgResult> f79930a;

    public C29249f(C1256g<WxaPkgDownloaderExportServiceIPC.DownloadPkgResult> gVar) {
        this.f79930a = gVar;
    }

    /* renamed from: a */
    public final void mo8657a(int i, String str) {
        C1256g<WxaPkgDownloaderExportServiceIPC.DownloadPkgResult> gVar = this.f79930a;
        if (gVar != null) {
            gVar.mo894a(new WxaPkgDownloaderExportServiceIPC.DownloadPkgResult(false, (ContentValues) null, (String) null, i, str, 6, (C8480h) null));
        }
    }
}
