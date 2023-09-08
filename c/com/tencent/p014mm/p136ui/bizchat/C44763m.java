package com.tencent.p014mm.p136ui.bizchat;

import android.widget.ListView;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import d62.C75339i;
import di3.C86312j;

/* renamed from: com.tencent.mm.ui.bizchat.m */
public class C44763m implements C6975i1.C6977b {

    /* renamed from: a */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121488a;

    public C44763m(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121488a = bizChatConversationFmUI;
    }

    /* renamed from: a */
    public void mo1327a(Object obj) {
        this.f121488a.setMMTitle(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f121488a.f121342j));
        if (this.f121488a.f121340h.getCount() <= 0) {
            this.f121488a.f121336d.setVisibility(0);
            this.f121488a.f121338f.setVisibility(8);
            return;
        }
        this.f121488a.f121336d.setVisibility(8);
        ListView listView = this.f121488a.f121338f;
        if (listView != null) {
            listView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo1328b(Object obj) {
    }
}
