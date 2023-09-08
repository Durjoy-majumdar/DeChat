package com.tencent.p014mm.p136ui.chatting.view;

import android.content.DialogInterface;
import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.ui.chatting.view.c */
public class C73882c implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C73884e f216822d;

    public C73882c(C73884e eVar) {
        this.f216822d = eVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f216822d.f216832o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                C73884e eVar = this.f216822d;
                eVar.f216832o = eVar.f216830j.getViewTreeObserver();
            }
            C73884e eVar2 = this.f216822d;
            eVar2.f216832o.removeGlobalOnLayoutListener(eVar2);
            this.f216822d.f216832o = null;
        }
        this.f216822d.getClass();
        this.f216822d.f216825e = null;
    }
}
