package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectWifiUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.e */
public class C18739e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceConnectWifiUI f52450d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.e$a */
    public class C18740a implements DialogInterface.OnCancelListener {
        public C18740a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "On progress cancel, stop airkiss");
            ExdeviceConnectWifiUI exdeviceConnectWifiUI = C18739e.this.f52450d;
            if (exdeviceConnectWifiUI.f52388C != ExdeviceConnectWifiUI.C18727n.FINISH) {
                exdeviceConnectWifiUI.getClass();
                Java2CExDevice.stopAirKiss();
                exdeviceConnectWifiUI.mo23576N7(true);
                if (exdeviceConnectWifiUI.f52391F.isHeld()) {
                    exdeviceConnectWifiUI.f52391F.release();
                }
            }
        }
    }

    public C18739e(ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f52450d = exdeviceConnectWifiUI;
    }

    public void run() {
        ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f52450d;
        exdeviceConnectWifiUI.f52400j = C76879j.m92723Q(exdeviceConnectWifiUI.getContext(), this.f52450d.getString(C0966R.string.a3h), this.f52450d.getString(C0966R.string.cfr), true, true, new C18740a());
    }
}
