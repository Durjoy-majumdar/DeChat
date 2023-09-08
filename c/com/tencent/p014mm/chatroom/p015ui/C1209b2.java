package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.chatroom.ui.b2 */
public class C1209b2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ RoomUpgradeUI f10240d;

    public C1209b2(RoomUpgradeUI roomUpgradeUI) {
        this.f10240d = roomUpgradeUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f10240d.f10192q != null) {
            C86709a0.m107529k().f251779b.mo123458d(this.f10240d.f10192q);
            this.f10240d.f10192q = null;
        }
        this.f10240d.finish();
    }
}
