package com.tencent.p014mm.p136ui.chatting.viewitems;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p */
public class C74161p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74103m f217690d;

    public C74161p(C74103m mVar) {
        this.f217690d = mVar;
    }

    public void run() {
        C89779i0 i0Var = this.f217690d.f217502F;
        if (i0Var != null && i0Var.isShowing()) {
            this.f217690d.f217502F.dismiss();
        }
    }
}
