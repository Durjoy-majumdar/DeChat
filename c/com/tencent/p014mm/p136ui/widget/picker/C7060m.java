package com.tencent.p014mm.p136ui.widget.picker;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.widget.picker.C7061n;

/* renamed from: com.tencent.mm.ui.widget.picker.m */
public class C7060m implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C7061n f24886d;

    public C7060m(C7061n nVar) {
        this.f24886d = nVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C7061n nVar = this.f24886d;
        nVar.f24887d = null;
        C7061n.C7062a aVar = nVar.f24895o;
        if (aVar != null) {
            aVar.mo7432a(false, null);
        }
    }
}
