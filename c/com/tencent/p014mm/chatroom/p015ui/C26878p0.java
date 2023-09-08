package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C117747y;

/* renamed from: com.tencent.mm.chatroom.ui.p0 */
public class C26878p0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C117747y f74760d;

    public C26878p0(GroupToolsManagereUI groupToolsManagereUI, C117747y yVar) {
        this.f74760d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105925i("MicroMsg.roomtools.GroupToolsManagereUI", "dialog onCancel scene:%s", Integer.valueOf(this.f74760d.getType()));
        C86709a0.m107524d().mo123458d(this.f74760d);
    }
}
