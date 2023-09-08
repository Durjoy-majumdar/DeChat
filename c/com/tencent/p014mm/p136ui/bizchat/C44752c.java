package com.tencent.p014mm.p136ui.bizchat;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import f40.C86709a0;
import rb0.C48009v0;
import sb0.C48349h;
import sb0.C48359n;

/* renamed from: com.tencent.mm.ui.bizchat.c */
public class C44752c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C48359n f121475d;

    public C44752c(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI, C48359n nVar) {
        this.f121475d = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C48349h yx02 = C48009v0.yx0();
        C48359n nVar = this.f121475d;
        yx02.getClass();
        C86709a0.m107529k().f251779b.mo123458d(nVar);
    }
}
