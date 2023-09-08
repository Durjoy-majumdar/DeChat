package com.tencent.p014mm.p136ui.chatting.component.appbrand;

import com.tencent.p014mm.p136ui.chatting.component.appbrand.AppBrandServiceComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import zj3.C79343c0;

/* renamed from: com.tencent.mm.ui.chatting.component.appbrand.a */
public class C73423a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandServiceComponent.C734191 f215792d;

    public C73423a(AppBrandServiceComponent.C734191 r1) {
        this.f215792d = r1;
    }

    public void run() {
        Class cls = C79343c0.class;
        boolean z = AppBrandServiceComponent.this.f215783q;
        if (z) {
            Log.m105919d("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent refuse:%b, setRejectIcon View.Visible", Boolean.valueOf(z));
            ((C79343c0) AppBrandServiceComponent.this.f215796d.f193278b.mo102812a(cls)).mo102626l5(0);
            return;
        }
        Log.m105919d("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent refuse:%b, setRejectIcon View.GONE", Boolean.valueOf(z));
        ((C79343c0) AppBrandServiceComponent.this.f215796d.f193278b.mo102812a(cls)).mo102626l5(8);
    }
}
