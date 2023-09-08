package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.l */
public class C41342l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f111316d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceDeviceProfileUI f111317e;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.l$a */
    public class C41343a implements DialogInterface.OnCancelListener {
        public C41343a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(C41342l.this.f111316d);
        }
    }

    public C41342l(ExdeviceDeviceProfileUI exdeviceDeviceProfileUI, C117747y yVar) {
        this.f111317e = exdeviceDeviceProfileUI;
        this.f111316d = yVar;
    }

    public void run() {
        ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f111317e;
        exdeviceDeviceProfileUI.f111082e = C76879j.m92723Q(exdeviceDeviceProfileUI.getContext(), "", this.f111317e.getString(C0966R.string.a4d), true, true, new C41343a());
    }
}
