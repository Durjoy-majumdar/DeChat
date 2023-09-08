package com.tencent.p014mm.p136ui.conversation;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.ui.conversation.t2 */
public class C6972t2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ServiceNotifyConversationUI f24690d;

    public C6972t2(ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f24690d = serviceNotifyConversationUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f24690d.finish();
        return true;
    }
}
