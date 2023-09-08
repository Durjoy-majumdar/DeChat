package com.tencent.p014mm.p136ui.conversation;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.ui.conversation.h1 */
public class C44989h1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewBizConversationUI f122043d;

    public C44989h1(NewBizConversationUI newBizConversationUI) {
        this.f122043d = newBizConversationUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f122043d.finish();
        return true;
    }
}
