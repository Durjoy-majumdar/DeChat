package com.tencent.p014mm.p136ui.conversation;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.ServiceNotifySettingsUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.s2 */
public class C6971s2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ServiceNotifyConversationUI f24689d;

    public C6971s2(ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f24689d = serviceNotifyConversationUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent(this.f24689d.getContext(), ServiceNotifySettingsUI.class);
        intent.putExtra("mode", 0);
        intent.putExtra("from_scene", "scene_service_notify_conversation");
        ServiceNotifyConversationUI serviceNotifyConversationUI = this.f24689d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        ServiceNotifyConversationUI serviceNotifyConversationUI2 = serviceNotifyConversationUI;
        C117292a.m165358d(serviceNotifyConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceNotifyConversationUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(serviceNotifyConversationUI2, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115669n.INSTANCE.mo160131h(21825, 2, null, Long.valueOf(Util.nowSecond()), null, null, 0, 0, 0);
        return true;
    }
}
