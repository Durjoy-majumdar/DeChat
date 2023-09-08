package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.chatting.e4 */
public class C97018e4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f284335d;

    public C97018e4(RevokeMsgListener revokeMsgListener, Activity activity) {
        this.f284335d = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f284335d.finish();
    }
}
