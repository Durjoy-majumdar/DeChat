package com.tencent.p014mm.p136ui.conversation;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.conversation.e1 */
public class C44984e1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NewBizConversationUI f122033d;

    public C44984e1(NewBizConversationUI newBizConversationUI) {
        this.f122033d = newBizConversationUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f122033d.f121825u = true;
    }
}
