package com.tencent.p014mm.plugin.exdevice.p042ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.p0 */
public class C41362p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111354d;

    public C41362p0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111354d = exdeviceProfileUI;
    }

    public void run() {
        this.f111354d.f111184r.notifyDataSetChanged();
    }
}
