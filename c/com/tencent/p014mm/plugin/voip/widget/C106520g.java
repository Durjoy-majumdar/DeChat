package com.tencent.p014mm.plugin.voip.widget;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.voip.widget.g */
public class C106520g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipScoreDialog f318237d;

    public C106520g(VoipScoreDialog voipScoreDialog) {
        this.f318237d = voipScoreDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        VoipScoreDialog.m143781H7(this.f318237d, 2);
        this.f318237d.finish();
    }
}
