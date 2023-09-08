package com.tencent.p014mm.plugin.appbrand.ipc;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$a$$a */
public final /* synthetic */ class AppBrandProcessProxyUI$a$$a implements PendingIntent.OnFinished {

    /* renamed from: a */
    public final /* synthetic */ AppBrandProxyUIProcessTask.ProcessRequest f240336a;

    public /* synthetic */ AppBrandProcessProxyUI$a$$a(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        this.f240336a = processRequest;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        Log.m105925i("MicroMsg.AppBrandProcessProxyUI", "startLogicProxy start with pendingIntent finished for req:%s", this.f240336a);
    }
}
