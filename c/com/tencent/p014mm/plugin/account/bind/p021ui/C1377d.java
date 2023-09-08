package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Intent;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.account.bind.p021ui.C1379f;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import h81.C32735h;
import hg0.C76166a;
import ke3.C88144b;
import p011cm.C39989b;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.d */
public class C1377d implements C39989b.C0706c {

    /* renamed from: a */
    public final /* synthetic */ C76166a f10567a;

    /* renamed from: b */
    public final /* synthetic */ C1379f.C1380a f10568b;

    public C1377d(C1379f.C1380a aVar, C76166a aVar2) {
        this.f10568b = aVar;
        this.f10567a = aVar2;
    }

    /* renamed from: a */
    public boolean mo678a(String str, String str2, String str3, int i, String str4) {
        Class cls = C32735h.class;
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f10567a.mo106389i());
        intent.putExtra("Contact_Nick", this.f10567a.mo106387g());
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("AntispamTicket", str3);
        intent.putExtra("sayhi_verify_add_errcode", i);
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
        String str5 = (C72996z1.m85843n5(this.f10567a.mo106389i()) || Qe != 1) ? (C72996z1.m85843n5(this.f10567a.mo106389i()) || Qe != 2 || C45628s0.m50780j() < ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
        C1379f fVar = C1379f.this;
        int i2 = C1379f.f10571r;
        C88144b.m109795m(fVar.f24696e, Scopes.PROFILE, str5, intent, 1);
        return true;
    }
}
