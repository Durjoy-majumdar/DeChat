package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.ExDeviceOpInChattingUIEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41154p0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.v */
public class C41172v implements C41154p0.C41156b {

    /* renamed from: a */
    public final /* synthetic */ ExDeviceOpInChattingUIEvent f110925a;

    /* renamed from: b */
    public final /* synthetic */ ExdeviceEventManager f110926b;

    public C41172v(ExdeviceEventManager exdeviceEventManager, ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent) {
        this.f110926b = exdeviceEventManager;
        this.f110925a = exDeviceOpInChattingUIEvent;
    }

    /* renamed from: a */
    public void mo64221a(boolean z) {
        if (z) {
            ExdeviceEventManager exdeviceEventManager = this.f110926b;
            ExDeviceOpInChattingUIEvent.C40076a aVar = this.f110925a.f107475d;
            exdeviceEventManager.mo64177i(aVar.f107476a, aVar.f107477b);
        }
    }
}
