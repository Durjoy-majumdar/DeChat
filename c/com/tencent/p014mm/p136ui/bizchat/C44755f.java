package com.tencent.p014mm.p136ui.bizchat;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;

/* renamed from: com.tencent.mm.ui.bizchat.f */
public class C44755f implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121479d;

    public C44755f(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121479d = bizChatConversationFmUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f121479d.finish();
    }
}
