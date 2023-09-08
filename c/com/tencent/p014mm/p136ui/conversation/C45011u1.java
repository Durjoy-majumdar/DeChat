package com.tencent.p014mm.p136ui.conversation;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import di3.C86312j;
import fn3.C45804b;
import he0.C46021h;

/* renamed from: com.tencent.mm.ui.conversation.u1 */
public final class C45011u1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f122103d;

    /* renamed from: e */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122104e;

    public C45011u1(String str, OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122103d = str;
        this.f122104e = openImKefuServiceConversationFmUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C45804b.m51082a(4, this.f122103d, this.f122104e.f121858i);
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f122104e;
        String str = this.f122103d;
        openImKefuServiceConversationFmUI.getClass();
        ((C46021h) C86312j.m106911c(C46021h.class)).mo71461gx(str, new C45015w1(openImKefuServiceConversationFmUI));
    }
}
