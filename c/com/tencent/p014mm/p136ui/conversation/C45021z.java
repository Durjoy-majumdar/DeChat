package com.tencent.p014mm.p136ui.conversation;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;

/* renamed from: com.tencent.mm.ui.conversation.z */
public class C45021z implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f122116d;

    public C45021z(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f122116d = enterpriseConversationFmUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f122116d.finish();
        return true;
    }
}
