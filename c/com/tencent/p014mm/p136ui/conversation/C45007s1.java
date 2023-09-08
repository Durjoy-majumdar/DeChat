package com.tencent.p014mm.p136ui.conversation;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;

/* renamed from: com.tencent.mm.ui.conversation.s1 */
public final class C45007s1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122099d;

    public C45007s1(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122099d = openImKefuServiceConversationFmUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f122099d.f121859j = true;
    }
}
