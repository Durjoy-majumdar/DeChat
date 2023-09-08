package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74134n3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n3$a$$a */
public final /* synthetic */ class n3$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74134n3.C74135a f217638d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f217639e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f217640f;

    public /* synthetic */ n3$a$$a(C74134n3.C74135a aVar, C67391b bVar, C72963f4 f4Var) {
        this.f217638d = aVar;
        this.f217639e = bVar;
        this.f217640f = f4Var;
    }

    public final void run() {
        C74134n3.C74135a aVar = this.f217638d;
        C67391b bVar = this.f217639e;
        C72963f4 f4Var = this.f217640f;
        aVar.getClass();
        C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
        if (u != null) {
            C115669n.INSTANCE.mo160131h(16979, u.f195577g2, u.f195569e2, 0, 2);
        }
        C74244u.C74247d.m88515e(bVar, f4Var, aVar.mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
    }
}
