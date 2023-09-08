package com.tencent.p014mm.p136ui.bizchat;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;

/* renamed from: com.tencent.mm.ui.bizchat.d */
public class C44753d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121476d;

    public C44753d(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121476d = bizChatConversationFmUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f121476d.f121346q = true;
    }
}
