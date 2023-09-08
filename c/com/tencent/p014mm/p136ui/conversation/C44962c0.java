package com.tencent.p014mm.p136ui.conversation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.ui.conversation.c0 */
public class C44962c0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f121972d;

    public C44962c0(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f121972d = enterpriseConversationFmUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String TE = C48009v0.Fx0().mo72758TE(this.f121972d.f121793n);
        if (TextUtils.isEmpty(TE)) {
            Intent intent = new Intent();
            intent.putExtra("enterprise_biz_name", this.f121972d.f121793n);
            intent.addFlags(67108864);
            C88144b.m109791i(this.f121972d.getContext(), "brandservice", ".ui.EnterpriseBizSearchUI", intent, (Bundle) null);
        } else {
            Intent intent2 = new Intent(this.f121972d.getContext(), BizChatSearchUI.class);
            intent2.putExtra("enterprise_biz_name", TE);
            intent2.putExtra("enterprise_biz_father_name", this.f121972d.f121793n);
            intent2.putExtra("biz_chat_search_scene", 1);
            intent2.putExtra("biz_chat_search_text", "");
            intent2.addFlags(67108864);
            EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f121972d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI2 = enterpriseConversationFmUI;
            C117292a.m165358d(enterpriseConversationFmUI2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            enterpriseConversationFmUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(enterpriseConversationFmUI2, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }
}
