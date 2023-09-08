package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.chatting.c3 */
public final class C6775c3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChattingSendDataToDeviceUI f24319d;

    public C6775c3(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f24319d = chattingSendDataToDeviceUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f24319d.finish();
    }
}
