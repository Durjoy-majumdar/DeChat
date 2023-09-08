package com.tencent.p014mm.p136ui.chatting.component.biz;

import com.tencent.p014mm.autogen.events.ScanAndReportNearFieldFreeWifiEvent;
import p248ug.C52558c;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.j */
public class C44812j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizComponent f121613d;

    public C44812j(BizComponent bizComponent) {
        this.f121613d = bizComponent;
    }

    public void run() {
        ScanAndReportNearFieldFreeWifiEvent scanAndReportNearFieldFreeWifiEvent = new ScanAndReportNearFieldFreeWifiEvent();
        C52558c cVar = this.f121613d.f121567h;
        if (cVar != null) {
            scanAndReportNearFieldFreeWifiEvent.f107748d.f107750a = cVar.field_username;
            scanAndReportNearFieldFreeWifiEvent.publish();
        }
    }
}
