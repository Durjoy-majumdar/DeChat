package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.component.C19729d;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74287w2;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.component.g */
public final class C19745g extends C19729d.C19730a.C19740j {

    /* renamed from: e */
    public final /* synthetic */ C19729d f56164e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f56165f;

    /* renamed from: g */
    public final /* synthetic */ MsgQuoteItem f56166g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19745g(C19729d dVar, C72963f4 f4Var, MsgQuoteItem msgQuoteItem, int i, String str) {
        super(i, str);
        this.f56164e = dVar;
        this.f56165f = f4Var;
        this.f56166g = msgQuoteItem;
    }

    /* renamed from: a */
    public C68070l.C68072b mo26213a() {
        C72963f4 b = mo26214b();
        if (b != null) {
            return this.f56164e.mo26193b6(b);
        }
        return null;
    }

    /* renamed from: c */
    public C72963f4 mo26215c() {
        return C74287w2.m88622b(this.f56164e.f215752d, this.f56165f.getMsgId(), this.f56166g, "toParamsPack");
    }
}
