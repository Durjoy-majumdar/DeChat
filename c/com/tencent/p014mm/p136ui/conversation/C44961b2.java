package com.tencent.p014mm.p136ui.conversation;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;

/* renamed from: com.tencent.mm.ui.conversation.b2 */
public final class C44961b2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f121971d;

    public C44961b2(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f121971d = openImKefuServiceConversationFmUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f121971d.finish();
        return true;
    }
}
