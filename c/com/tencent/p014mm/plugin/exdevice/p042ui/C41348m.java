package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.m */
public class C41348m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceDeviceProfileUI f111328d;

    public C41348m(ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f111328d = exdeviceDeviceProfileUI;
    }

    public void run() {
        C76701a.makeText((Context) this.f111328d.getContext(), (int) C0966R.string.cg8, 1).show();
    }
}
