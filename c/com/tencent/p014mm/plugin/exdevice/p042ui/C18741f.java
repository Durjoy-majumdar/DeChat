package com.tencent.p014mm.plugin.exdevice.p042ui;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.f */
public class C18741f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceConnectWifiUI f52452d;

    public C18741f(ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f52452d = exdeviceConnectWifiUI;
    }

    public void run() {
        C89779i0 i0Var = this.f52452d.f52400j;
        if (i0Var != null && i0Var.isShowing()) {
            this.f52452d.f52400j.dismiss();
        }
    }
}
