package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.l */
public class C72804l implements C74974a.C74976b {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f212198a;

    public C72804l(ChatFooter chatFooter) {
        this.f212198a = chatFooter;
    }

    /* renamed from: a */
    public boolean mo93502a(C74974a aVar, int i, KeyEvent keyEvent) {
        if (i != 4 && (i != 0 || !this.f212198a.f211854c1)) {
            return false;
        }
        this.f212198a.f211905n.performClick();
        return true;
    }
}
