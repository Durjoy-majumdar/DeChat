package com.tencent.p014mm.p136ui.bizchat;

import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import com.tencent.p014mm.storage.C44660i2;
import eb0.C97625j3;
import eb0.z3$$g;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.ui.bizchat.e */
public class C44754e implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ long f121477d;

    /* renamed from: e */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121478e;

    public C44754e(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI, long j) {
        this.f121478e = bizChatConversationFmUI;
        this.f121477d = j;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f121478e.f121346q;
    }

    /* renamed from: c */
    public void mo24604c() {
        if (this.f121478e.f121339g != null) {
            C48009v0.Ax0().mo73043jo(this.f121477d);
            C48009v0.Dx0().mo73031qq(this.f121477d);
            if (C48009v0.Dx0().mo73025bD(this.f121478e.f121342j) <= 0) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(this.f121478e.f121342j);
            }
            this.f121478e.f121339g.dismiss();
        }
    }
}
