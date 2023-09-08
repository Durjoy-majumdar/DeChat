package com.tencent.p014mm.plugin.voip.widget;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.voip.widget.e */
public class C106517e implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ VoipScoreDialog f318234d;

    public C106517e(VoipScoreDialog voipScoreDialog) {
        this.f318234d = voipScoreDialog;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f318234d.finish();
    }
}
