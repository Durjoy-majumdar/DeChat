package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import com.tencent.p014mm.storage.C72976h2;
import fn3.C45804b;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.conversation.a2 */
public final class C44952a2 implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f121944d;

    public C44952a2(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f121944d = openImKefuServiceConversationFmUI;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f121944d;
        C44997m1 m1Var = openImKefuServiceConversationFmUI.f121856g;
        String str = null;
        openImKefuServiceConversationFmUI.f121858i = m1Var != null ? (C72976h2) m1Var.getItem(i) : null;
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI2 = this.f121944d;
        C72976h2 h2Var = openImKefuServiceConversationFmUI2.f121858i;
        if (h2Var != null) {
            str = h2Var.getUsername();
        }
        if (str == null) {
            str = "";
        }
        openImKefuServiceConversationFmUI2.f121857h = str;
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI3 = this.f121944d;
        C78253a aVar = openImKefuServiceConversationFmUI3.f121860n;
        if (aVar != null) {
            aVar.mo108272g(view, i, j, openImKefuServiceConversationFmUI3, openImKefuServiceConversationFmUI3.f121864r, openImKefuServiceConversationFmUI3.f121861o, openImKefuServiceConversationFmUI3.f121862p);
        }
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI4 = this.f121944d;
        C45804b.m51082a(5, openImKefuServiceConversationFmUI4.f121857h, openImKefuServiceConversationFmUI4.f121858i);
        return true;
    }
}
