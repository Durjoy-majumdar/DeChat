package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProcessShareMessageProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import kb0.C76529i;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.a1 */
public class C68643a1 implements C76529i.C76531b {

    /* renamed from: a */
    public final /* synthetic */ AppBrandProcessShareMessageProxyUI.C68641c f197191a;

    public C68643a1(AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, AppBrandProcessShareMessageProxyUI.C68641c cVar) {
        this.f197191a = cVar;
    }

    /* renamed from: a */
    public void mo94358a(int i) {
        boolean z = true;
        Log.m105925i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onLoadImageResult, result:%d", Integer.valueOf(i));
        AppBrandProcessShareMessageProxyUI.C68641c cVar = this.f197191a;
        cVar.f197184d = true;
        if (!cVar.f197183c) {
            z = false;
        }
        if (z) {
            MMHandlerThread.removeRunnable(cVar.f197189i);
            cVar.mo94355a();
        }
    }
}
