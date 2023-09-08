package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import java.util.HashMap;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p148ei.C7660a;
import p156gj.C87203t;
import p196ln.C76706g;
import p823sg.C77710q;
import sf0.C48374j0;
import te3.C49597gq3;
import te3.C64372fq3;

/* renamed from: com.tencent.mm.plugin.account.ui.p2 */
public class C115170p2 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C64372fq3 f345215d;

    /* renamed from: e */
    public final /* synthetic */ RegAffiliateAccountUI f345216e;

    public C115170p2(RegAffiliateAccountUI regAffiliateAccountUI, C64372fq3 fq32) {
        this.f345216e = regAffiliateAccountUI;
        this.f345215d = fq32;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        this.f345216e.f344796n.dismiss();
        if (i == 0 && i2 == 0) {
            C49597gq3 gq32 = (C49597gq3) cVar.f127056b.f127083a;
            int i3 = this.f345216e.f344797o;
            if (i3 == 0 || i3 == 1) {
                C75593t5.f222075c.mo105939b(C75592q0.m90789s(), gq32.f134199d);
                C75593t5.f222075c.mo105945h(C75592q0.m90789s(), C75592q0.m90788r());
                HashMap hashMap = new HashMap();
                hashMap.put("login_weixin_username", gq32.f134199d);
                hashMap.put("login_user_name", gq32.f134199d);
                String g = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93558g(gq32.f134199d, false, false);
                C86013q1.m106463x(C112760b.m154235i() + "temp.avatar", g);
                hashMap.put("last_avatar_path", g);
                hashMap.put("last_logout_no_pwd_ticket", gq32.f134200e);
                hashMap.put("last_login_nick_name", this.f345215d.f183204d);
                hashMap.put("last_login_uin", new C77710q(gq32.f134201f).toString());
                C75593t5.f222075c.mo105945h(gq32.f134199d, hashMap);
            }
            Intent intent = new Intent();
            intent.putExtra("SWITCH_TO_USERNAME", gq32.f134199d);
            intent.putExtra("Contact_Finder_Buffer", C48374j0.m53716e(gq32.f134202g, new byte[0]));
            this.f345216e.setResult(-1, intent);
            this.f345216e.finish();
            C115669n.INSTANCE.mo160131h(23530, this.f345216e.f344799q, C87203t.m108273i(), 0, 3, 1006, 10602, null, Integer.valueOf(this.f345216e.f344797o));
        } else {
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(this.f345216e.getContext(), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            }
        }
        return 0;
    }
}
