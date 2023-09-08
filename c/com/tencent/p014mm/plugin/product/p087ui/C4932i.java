package com.tencent.p014mm.plugin.product.p087ui;

import af2.C67033e;
import com.tencent.p014mm.autogen.events.RcptRecentAddrEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C77905b4;

/* renamed from: com.tencent.mm.plugin.product.ui.i */
public class C4932i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RcptRecentAddrEvent f20102d;

    /* renamed from: e */
    public final /* synthetic */ MallProductHelper f20103e;

    public C4932i(MallProductHelper mallProductHelper, RcptRecentAddrEvent rcptRecentAddrEvent) {
        this.f20103e = mallProductHelper;
        this.f20102d = rcptRecentAddrEvent;
    }

    public void run() {
        Log.m105919d("MicroMsg.MallProductUI", "JSOAUTH errCode[%s], isAccept[%s]", Integer.valueOf(this.f20102d.f9408e.f9411a), Boolean.valueOf(this.f20102d.f9408e.f9412b));
        RcptRecentAddrEvent rcptRecentAddrEvent = this.f20102d;
        if (rcptRecentAddrEvent.f9408e.f9411a == 0) {
            C67033e eVar = this.f20103e.f202273g;
            eVar.getClass();
            C77905b4 b4Var = new C77905b4();
            RcptRecentAddrEvent.C1112b bVar = rcptRecentAddrEvent.f9408e;
            String str = bVar.f9415e;
            b4Var.f226984h = str;
            b4Var.f226985i = bVar.f9414d;
            b4Var.f226986j = bVar.f9416f;
            b4Var.f226981e = bVar.f9417g;
            b4Var.f226982f = bVar.f9418h;
            b4Var.f226980d = bVar.f9419i;
            b4Var.f226983g = bVar.f9421k;
            if (!Util.isNullOrNil(str) && !Util.isNullOrNil(b4Var.f226985i)) {
                eVar.f192540i = b4Var;
            }
        }
        this.f20103e.f202271e = false;
    }
}
