package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.content.DialogInterface;
import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.m */
public class C73445m implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C73446n f215819d;

    public C73445m(C73446n nVar) {
        this.f215819d = nVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f215819d.f215826j;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                C73446n nVar = this.f215819d;
                nVar.f215826j = nVar.f215825i.getViewTreeObserver();
            }
            C73446n nVar2 = this.f215819d;
            nVar2.f215826j.removeGlobalOnLayoutListener(nVar2);
            this.f215819d.f215826j = null;
        }
        this.f215819d.getClass();
        C73446n nVar3 = this.f215819d;
        nVar3.f215820d = null;
        nVar3.getClass();
    }
}
