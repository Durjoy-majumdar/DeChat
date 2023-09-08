package com.tencent.p014mm.plugin.exdevice.p042ui;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.i */
public class C41331i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceDeviceProfileUI f111305d;

    public C41331i(ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f111305d = exdeviceDeviceProfileUI;
    }

    public void run() {
        C89779i0 i0Var = this.f111305d.f111082e;
        if (i0Var != null && i0Var.isShowing()) {
            this.f111305d.f111082e.dismiss();
        }
        C89779i0 i0Var2 = this.f111305d.f111081d;
        if (i0Var2 != null && i0Var2.isShowing()) {
            this.f111305d.f111081d.dismiss();
        }
    }
}
