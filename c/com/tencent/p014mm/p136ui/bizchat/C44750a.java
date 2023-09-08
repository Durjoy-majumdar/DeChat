package com.tencent.p014mm.p136ui.bizchat;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;

/* renamed from: com.tencent.mm.ui.bizchat.a */
public class C44750a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121473d;

    public C44750a(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121473d = bizChatConversationFmUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f121473d.finish();
        return true;
    }
}
