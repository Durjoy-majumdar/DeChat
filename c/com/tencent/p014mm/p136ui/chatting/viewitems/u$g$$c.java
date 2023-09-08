package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$c */
public class u$g$$c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f218128d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f218129e;

    public u$g$$c(C74244u.C74261g gVar, C72963f4 f4Var, C67391b bVar) {
        this.f218128d = f4Var;
        this.f218129e = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f218128d.mo101020w3()) {
            C72695v.m85081w(this.f218128d);
            this.f218129e.mo91541B(true);
        }
    }
}
