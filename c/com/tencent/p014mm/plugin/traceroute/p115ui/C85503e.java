package com.tencent.p014mm.plugin.traceroute.p115ui;

import android.content.DialogInterface;
import b13.C79646a;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.e */
public class C85503e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NetworkDiagnoseUI f249166d;

    public C85503e(NetworkDiagnoseUI networkDiagnoseUI) {
        this.f249166d = networkDiagnoseUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        NetworkDiagnoseUI networkDiagnoseUI = this.f249166d;
        networkDiagnoseUI.f249154i.stopTimer();
        C79646a aVar = networkDiagnoseUI.f249151f;
        if (aVar != null) {
            aVar.mo109778e();
        }
        this.f249166d.finish();
    }
}
