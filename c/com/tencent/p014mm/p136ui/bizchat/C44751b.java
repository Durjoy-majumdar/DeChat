package com.tencent.p014mm.p136ui.bizchat;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.bizchat.b */
public class C44751b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121474d;

    public C44751b(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121474d = bizChatConversationFmUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105926v("MicroMsg.BizChatConversationFmUI", "search btn was clicked.");
        Intent intent = new Intent(this.f121474d.getContext(), BizChatSearchUI.class);
        intent.putExtra("enterprise_biz_name", this.f121474d.f121342j);
        intent.putExtra("biz_chat_search_scene", 1);
        intent.putExtra("biz_chat_search_text", "");
        intent.addFlags(67108864);
        BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f121474d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI2 = bizChatConversationFmUI;
        C117292a.m165358d(bizChatConversationFmUI2, aVar.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bizChatConversationFmUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bizChatConversationFmUI2, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
