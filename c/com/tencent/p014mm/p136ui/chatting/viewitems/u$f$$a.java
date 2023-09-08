package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f$$a */
public final /* synthetic */ class u$f$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74260f f218111d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f218112e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f218113f;

    public /* synthetic */ u$f$$a(C74244u.C74260f fVar, C67391b bVar, C72963f4 f4Var) {
        this.f218111d = fVar;
        this.f218112e = bVar;
        this.f218113f = f4Var;
    }

    public final void run() {
        C74244u.C74260f fVar = this.f218111d;
        C67391b bVar = this.f218112e;
        C72963f4 f4Var = this.f218113f;
        fVar.getClass();
        C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
        if (u == null || C74244u.m88491b(f4Var, u) != 3) {
            C74244u.C74247d.m88515e(bVar, f4Var, fVar.mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
        } else {
            C74244u.C74247d.m88515e(bVar, f4Var, fVar.mo103068y(bVar, f4Var), 2000, new C57743c0(fVar, f4Var));
        }
    }
}
