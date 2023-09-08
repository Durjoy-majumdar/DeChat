package com.tencent.p014mm.p136ui.transmit;

import android.content.DialogInterface;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.transmit.g */
public class C97261g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97262h f285471d;

    public C97261g(C97262h hVar) {
        this.f285471d = hVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C97262h hVar = this.f285471d;
        C77398g gVar = hVar.f285472a;
        if (gVar != null) {
            gVar.dismiss();
            hVar.f285472a = null;
        }
        ((C97258d) hVar.f285473b).f285468a.finish();
    }
}
