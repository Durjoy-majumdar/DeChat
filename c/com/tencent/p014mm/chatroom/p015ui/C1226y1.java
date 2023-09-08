package com.tencent.p014mm.chatroom.p015ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.chatroom.ui.y1 */
public class C1226y1 {

    /* renamed from: com.tencent.mm.chatroom.ui.y1$a */
    public interface C1227a {
    }

    /* renamed from: a */
    public static void m1351a(Activity activity, String str, boolean z) {
        Class<RoomUpgradeUI> cls = RoomUpgradeUI.class;
        if (z) {
            Intent intent = new Intent(activity, cls);
            intent.setFlags(603979776);
            intent.putExtra("room_name", str);
            Intent intent2 = new Intent();
            intent2.setClassName(activity, "com.tencent.mm.plugin.account.ui.bind.BindMobileUI");
            intent2.putExtra("is_bind_for_chatroom_upgrade", true);
            MMWizardActivity.m7018M7(activity, intent2, intent);
            return;
        }
        Intent intent3 = new Intent(activity, cls);
        intent3.setFlags(603979776);
        intent3.putExtra("room_name", str);
        intent3.putExtra("announce_ok", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent3);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/RoomUpgradeHelper", "goUpgrade", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/chatroom/ui/RoomUpgradeHelper", "goUpgrade", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
