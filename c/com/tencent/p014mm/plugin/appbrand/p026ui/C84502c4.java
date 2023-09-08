package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.c4 */
public class C84502c4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandXWebDownloadProxyUI f246621d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.c4$a */
    public class C84503a implements DialogInterface.OnCancelListener {
        public C84503a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, downloading canceled");
            C84502c4.this.f246621d.setResult(2, new Intent());
            C84502c4.this.f246621d.finish();
        }
    }

    public C84502c4(AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f246621d = appBrandXWebDownloadProxyUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.idkeyStat(366, 2, 1, false);
        Log.m105925i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, onClick, finishing[%b] destroyed[%b]", Boolean.valueOf(this.f246621d.isFinishing()), Boolean.valueOf(this.f246621d.activityHasDestroyed()));
        if (!this.f246621d.isFinishing() && !this.f246621d.activityHasDestroyed()) {
            AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = this.f246621d;
            appBrandXWebDownloadProxyUI.f246575e = C76879j.m92723Q(appBrandXWebDownloadProxyUI.getContext(), this.f246621d.getContext().getString(C0966R.string.a3h), this.f246621d.getContext().getString(C0966R.string.f7924wd), true, true, (DialogInterface.OnCancelListener) null);
            this.f246621d.f246575e.setOnCancelListener(new C84503a());
            XWebSdk.tryStartDownload();
            AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI2 = this.f246621d;
            appBrandXWebDownloadProxyUI2.getClass();
            Handler handler = new Handler();
            appBrandXWebDownloadProxyUI2.f246576f = handler;
            C84482a4 a4Var = new C84482a4(appBrandXWebDownloadProxyUI2);
            appBrandXWebDownloadProxyUI2.f246577g = a4Var;
            handler.postDelayed(a4Var, 20000);
        }
    }
}
