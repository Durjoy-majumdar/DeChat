package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.b4 */
public class C40547b4 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandXWebDownloadProxyUI f108923d;

    public C40547b4(AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f108923d = appBrandXWebDownloadProxyUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showLoading, user canceled download");
        this.f108923d.setResult(2, new Intent());
        this.f108923d.finish();
    }
}
