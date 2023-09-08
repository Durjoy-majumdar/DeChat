package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.d4 */
public class C40549d4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandXWebDownloadProxyUI f108925d;

    public C40549d4(AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f108925d = appBrandXWebDownloadProxyUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.idkeyStat(366, 3, 1, false);
        Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, user canceled download");
        this.f108925d.setResult(2, new Intent());
        this.f108925d.finish();
    }
}
