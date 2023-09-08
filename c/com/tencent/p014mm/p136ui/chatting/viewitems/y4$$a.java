package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lp3.C46888b;
import rb0.C47961a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y4$$a */
public final /* synthetic */ class y4$$a implements C47961a.C12965b {

    /* renamed from: a */
    public final /* synthetic */ C74314y4 f218305a;

    /* renamed from: b */
    public final /* synthetic */ String f218306b;

    /* renamed from: c */
    public final /* synthetic */ C46888b f218307c;

    public /* synthetic */ y4$$a(C74314y4 y4Var, String str, C46888b bVar) {
        this.f218305a = y4Var;
        this.f218306b = str;
        this.f218307c = bVar;
    }

    /* renamed from: a */
    public final void mo12496a(boolean z, String str) {
        C74314y4 y4Var = this.f218305a;
        String str2 = this.f218306b;
        C46888b bVar = this.f218307c;
        y4Var.getClass();
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "flush bizInfo callback, username: %s, success: %b, isUpdatingBizInfo: %b", str, Boolean.valueOf(z), Boolean.valueOf(y4Var.f218304b.f216861V));
        if (!y4Var.f218304b.f216861V) {
            Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "callback when request interrupted by user");
            bVar.mo72091a(new C73930b(2, "flush bizInfo fail"));
        } else if (!Util.nullAsNil(str).equals(str2) || !z) {
            bVar.mo72091a(new C73930b(2, "flush bizInfo fail"));
        } else {
            C73938c.m87675a(13);
            bVar.mo72093c(Boolean.TRUE);
        }
    }
}
