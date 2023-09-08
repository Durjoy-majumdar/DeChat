package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import ck3.C39969i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73919a;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a */
public abstract class C73919a<T extends C73919a<T>> implements C72963f4.C72966d<T> {

    /* renamed from: b */
    public final Context f216974b;

    public C73919a(C72963f4 f4Var, Context context, C39969i iVar) {
        C87412m.m108594g(f4Var, "msgInfo");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        this.f216974b = context;
    }
}
