package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Looper;
import android.util.SparseLongArray;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.WxaPkgPreConnectCDNEventEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.f1 */
public class C81242f1 implements CdnLogic.DownloadCallback {

    /* renamed from: d */
    public final /* synthetic */ String f238640d;

    public C81242f1(String str) {
        this.f238640d = str;
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        CdnLogic.CronetTaskResult cronetTaskResult;
        if (!(c2CDownloadResult == null || (cronetTaskResult = c2CDownloadResult.cronetTaskResult) == null || cronetTaskResult.performance == null)) {
            Log.m105925i("MicroMsg.PkgNetworkOpt", "preConnectHost, task end, url:%s, statusCode:%d, profile:%s", this.f238640d, Integer.valueOf(cronetTaskResult.statusCode), c2CDownloadResult.cronetTaskResult.performance);
        }
        WxaPkgPreConnectCDNEventEvent wxaPkgPreConnectCDNEventEvent = new WxaPkgPreConnectCDNEventEvent();
        WxaPkgPreConnectCDNEventEvent.C80749a aVar = wxaPkgPreConnectCDNEventEvent.f236315d;
        aVar.f236316a = 2;
        aVar.f236317b = c2CDownloadResult;
        wxaPkgPreConnectCDNEventEvent.asyncPublish(Looper.getMainLooper());
        long nowMilliSecond = Util.nowMilliSecond();
        SparseLongArray sparseLongArray = C81245g1.f238644b;
        synchronized (sparseLongArray) {
            sparseLongArray.put(this.f238640d.hashCode(), nowMilliSecond);
        }
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
    }
}
