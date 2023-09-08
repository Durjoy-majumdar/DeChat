package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import lp3.C46888b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a5$$a */
public final /* synthetic */ class a5$$a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C46888b f216989d;

    public /* synthetic */ a5$$a(C46888b bVar) {
        this.f216989d = bVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f216989d.mo72091a(new C73930b(0, "cancel by user"));
    }
}
