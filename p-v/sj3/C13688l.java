package sj3;

import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import d62.C75339i;
import di3.C86312j;

/* renamed from: sj3.l */
public class C13688l implements C6975i1.C6977b {

    /* renamed from: a */
    public final /* synthetic */ BizChatFavUI f38735a;

    public C13688l(BizChatFavUI bizChatFavUI) {
        this.f38735a = bizChatFavUI;
    }

    /* renamed from: a */
    public void mo1327a(Object obj) {
        this.f38735a.setMMTitle(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f38735a.f121362h));
        if (this.f38735a.f121360f.getCount() <= 0) {
            this.f38735a.f121358d.setVisibility(0);
            this.f38735a.f121359e.setVisibility(8);
            return;
        }
        this.f38735a.f121358d.setVisibility(8);
        this.f38735a.f121359e.setVisibility(0);
    }

    /* renamed from: b */
    public void mo1328b(Object obj) {
    }
}
