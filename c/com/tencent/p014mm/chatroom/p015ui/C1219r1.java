package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.chatroom.ui.r1 */
public class C1219r1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f10260d;

    /* renamed from: e */
    public final /* synthetic */ RoomAlphaProcessUI f10261e;

    public C1219r1(RoomAlphaProcessUI roomAlphaProcessUI, boolean z) {
        this.f10261e = roomAlphaProcessUI;
        this.f10260d = z;
    }

    public void run() {
        Intent intent = new Intent(this.f10261e, RoomUpgradeUI.class);
        intent.setFlags(603979776);
        intent.putExtra("room_name", this.f10261e.f10166d);
        intent.putExtra("upgrade_success", this.f10260d);
        RoomAlphaProcessUI roomAlphaProcessUI = this.f10261e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        RoomAlphaProcessUI roomAlphaProcessUI2 = roomAlphaProcessUI;
        C117292a.m165358d(roomAlphaProcessUI2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        roomAlphaProcessUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(roomAlphaProcessUI2, "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
