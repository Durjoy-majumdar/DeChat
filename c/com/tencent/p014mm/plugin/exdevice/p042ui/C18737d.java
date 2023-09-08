package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.d */
public class C18737d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceConnectWifiUI f52448d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.d$a */
    public class C18738a implements Runnable {
        public C18738a() {
        }

        public void run() {
            C18737d.this.f52448d.showVKB();
        }
    }

    public C18737d(ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f52448d = exdeviceConnectWifiUI;
    }

    public void run() {
        try {
            byte[] O = C86013q1.m106433O(C86709a0.m107535s().f251806d + "exdevice_wifi_infos", 0, Integer.MAX_VALUE);
            if (O != null) {
                this.f52448d.f52387B.parseFrom(O);
                this.f52448d.mo23572J7();
            }
        } catch (Exception e) {
            Log.m105918d("MicroMsg.exdevice.ExdeviceConnectWifiUI", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceConnectWifiUI", e, "", new Object[0]);
        }
        MMHandlerThread.postToMainThreadDelayed(new C18738a(), 500);
    }
}
