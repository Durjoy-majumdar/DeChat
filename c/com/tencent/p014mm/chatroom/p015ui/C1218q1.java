package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.chatroom.ui.q1 */
public class C1218q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f10257d;

    /* renamed from: e */
    public final /* synthetic */ int f10258e;

    /* renamed from: f */
    public final /* synthetic */ RoomAlphaProcessUI f10259f;

    public C1218q1(RoomAlphaProcessUI roomAlphaProcessUI, boolean z, int i) {
        this.f10259f = roomAlphaProcessUI;
        this.f10257d = z;
        this.f10258e = i;
    }

    public void run() {
        Intent intent = new Intent(this.f10259f, RoomUpgradeUI.class);
        intent.setFlags(603979776);
        intent.putExtra("room_name", this.f10259f.f10166d);
        intent.putExtra("upgrade_success", this.f10257d);
        intent.putExtra("left_quota", this.f10258e);
        RoomAlphaProcessUI roomAlphaProcessUI = this.f10259f;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        RoomAlphaProcessUI roomAlphaProcessUI2 = roomAlphaProcessUI;
        C117292a.m165358d(roomAlphaProcessUI2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        roomAlphaProcessUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(roomAlphaProcessUI2, "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
