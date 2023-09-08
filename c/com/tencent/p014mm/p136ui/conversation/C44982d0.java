package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;

/* renamed from: com.tencent.mm.ui.conversation.d0 */
public class C44982d0 implements C6975i1.C6977b {

    /* renamed from: a */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f122030a;

    public C44982d0(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f122030a = enterpriseConversationFmUI;
    }

    /* renamed from: a */
    public void mo1327a(Object obj) {
        EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f122030a;
        if (enterpriseConversationFmUI.f121791i.getCount() <= 0) {
            enterpriseConversationFmUI.f121789g.setVisibility(0);
            enterpriseConversationFmUI.f121790h.setVisibility(8);
            return;
        }
        enterpriseConversationFmUI.f121789g.setVisibility(8);
        enterpriseConversationFmUI.f121790h.setVisibility(0);
    }

    /* renamed from: b */
    public void mo1328b(Object obj) {
    }
}
