package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.chatting.f4 */
public class C97019f4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f284336d;

    public C97019f4(RevokeMsgListener revokeMsgListener, Activity activity) {
        this.f284336d = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f284336d.finish();
    }
}
