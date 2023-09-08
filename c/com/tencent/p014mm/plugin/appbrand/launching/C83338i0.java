package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.i0 */
public class C83338i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppLaunchPrepareProcess f243532d;

    public C83338i0(AppLaunchPrepareProcess appLaunchPrepareProcess) {
        this.f243532d = appLaunchPrepareProcess;
    }

    public void run() {
        Object[] objArr = new Object[2];
        AppLaunchPrepareProcess appLaunchPrepareProcess = this.f243532d;
        boolean z = false;
        objArr[0] = appLaunchPrepareProcess.f243263p;
        if (appLaunchPrepareProcess.f243257g != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "DATA_TRANSFER_STATE_OVER_THRESHOLD with appId:%s, callback!=null:%b", objArr);
        if (this.f243532d.f243257g != null) {
            ((C83483u) this.f243532d.f243257g).mo113179K(3);
        }
    }
}
