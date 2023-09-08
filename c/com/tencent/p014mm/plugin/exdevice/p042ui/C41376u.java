package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceManageDeviceUI;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.u */
public class C41376u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceManageDeviceUI.C41271b f111403d;

    public C41376u(ExdeviceManageDeviceUI.C41271b bVar) {
        this.f111403d = bVar;
    }

    public void run() {
        this.f111403d.notifyDataSetChanged();
    }
}
