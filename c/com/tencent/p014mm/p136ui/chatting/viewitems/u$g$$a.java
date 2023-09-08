package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$a */
public final /* synthetic */ class u$g$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74261g f218120d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f218121e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f218122f;

    public /* synthetic */ u$g$$a(C74244u.C74261g gVar, C67391b bVar, C72963f4 f4Var) {
        this.f218120d = gVar;
        this.f218121e = bVar;
        this.f218122f = f4Var;
    }

    public final void run() {
        C68070l.C68072b u;
        C74244u.C74261g gVar = this.f218120d;
        C67391b bVar = this.f218121e;
        C72963f4 f4Var = this.f218122f;
        gVar.getClass();
        if (!(f4Var == null || !f4Var.mo101020w3() || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null)) {
            int i = u.f195582i;
            if (i == 40) {
                C76879j.m92754y(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.cm7), "", bVar.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                return;
            } else if (i == 33 && !WeChatBrands.Business.Entries.SessionAppbrand.checkAvailable(bVar.mo91565f())) {
                return;
            }
        }
        C68070l.C68072b u2 = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
        if (u2 == null || C74244u.m88491b(f4Var, u2) != 3) {
            C74244u.C74247d.m88515e(bVar, f4Var, gVar.mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
        } else {
            C74244u.C74247d.m88515e(bVar, f4Var, gVar.mo103068y(bVar, f4Var), 2000, new C57744d0(gVar, f4Var));
        }
    }
}
