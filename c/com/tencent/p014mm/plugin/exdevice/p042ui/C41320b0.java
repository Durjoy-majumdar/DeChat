package com.tencent.p014mm.plugin.exdevice.p042ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.b0 */
public class C41320b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111295d;

    public C41320b0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111295d = exdeviceProfileUI;
    }

    public void run() {
        ExdeviceProfileUI.m44679H7(this.f111295d);
        this.f111295d.f111184r.notifyDataSetChanged();
    }
}
