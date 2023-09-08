package com.tencent.p014mm.p136ui.bizchat;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.bizchat.k */
public class C44761k implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78253a f121485d;

    /* renamed from: e */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121486e;

    public C44761k(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI, C78253a aVar) {
        this.f121486e = bizChatConversationFmUI;
        this.f121485d = aVar;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C78253a aVar = this.f121485d;
        BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f121486e;
        aVar.mo108272g(view, i, j, bizChatConversationFmUI, bizChatConversationFmUI.f121341i, bizChatConversationFmUI.f121348s, bizChatConversationFmUI.f121349t);
        return true;
    }
}
