package com.tencent.p014mm.plugin.announcement;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.announcement.l */
public class C68574l implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ RoomCardUI f197002d;

    public C68574l(RoomCardUI roomCardUI) {
        this.f197002d = roomCardUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f197002d.finish();
    }
}
