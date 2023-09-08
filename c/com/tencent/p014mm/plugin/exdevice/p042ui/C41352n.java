package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ExDeviceBindHardDeviceEvent;
import f40.C86709a0;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.n */
public class C41352n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C117747y f111337d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceDeviceProfileUI f111338e;

    public C41352n(ExdeviceDeviceProfileUI exdeviceDeviceProfileUI, C117747y yVar) {
        this.f111338e = exdeviceDeviceProfileUI;
        this.f111337d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107529k().f251779b.mo123470p(536, this.f111338e);
        ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new ExDeviceBindHardDeviceEvent();
        ExDeviceBindHardDeviceEvent.C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
        aVar.f107428c = 2;
        aVar.f107429d = this.f111337d;
        exDeviceBindHardDeviceEvent.publish();
    }
}
