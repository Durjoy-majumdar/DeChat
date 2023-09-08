package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75597w2;
import lp3.C46888b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z4$$a */
public final /* synthetic */ class z4$$a implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C74326z4 f218338a;

    /* renamed from: b */
    public final /* synthetic */ String f218339b;

    /* renamed from: c */
    public final /* synthetic */ C46888b f218340c;

    public /* synthetic */ z4$$a(C74326z4 z4Var, String str, C46888b bVar) {
        this.f218338a = z4Var;
        this.f218339b = str;
        this.f218340c = bVar;
    }

    /* renamed from: a */
    public final void mo1109a(String str, boolean z) {
        C74326z4 z4Var = this.f218338a;
        String str2 = this.f218339b;
        C46888b bVar = this.f218340c;
        z4Var.getClass();
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "flush contact callback, username: %s, success: %b, isUpdatingBizInfo: %b", str, Boolean.valueOf(z), Boolean.valueOf(z4Var.f218337b.f216861V));
        if (!z4Var.f218337b.f216861V) {
            Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "callback when request interrupted by user");
            bVar.mo72091a(new C73930b(1, "flush contact fail"));
        } else if (!Util.nullAsNil(str2).equals(str) || !z) {
            bVar.mo72091a(new C73930b(1, "flush contact fail"));
        } else {
            C73938c.m87675a(11);
            bVar.mo72093c(Boolean.TRUE);
        }
    }
}
