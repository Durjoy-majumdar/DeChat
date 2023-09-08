package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$b */
public class u$g$$b implements C44580q1 {

    /* renamed from: a */
    public final /* synthetic */ C44561j f218123a;

    /* renamed from: b */
    public final /* synthetic */ C67391b f218124b;

    /* renamed from: c */
    public final /* synthetic */ C68070l.C68072b f218125c;

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f218126d;

    /* renamed from: e */
    public final /* synthetic */ C74244u.C74261g f218127e;

    public u$g$$b(C74244u.C74261g gVar, C44561j jVar, C67391b bVar, C68070l.C68072b bVar2, C72963f4 f4Var) {
        this.f218127e = gVar;
        this.f218123a = jVar;
        this.f218124b = bVar;
        this.f218125c = bVar2;
        this.f218126d = f4Var;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        if (this.f218123a == null) {
            return;
        }
        if (z) {
            this.f218127e.mo103092i(this.f218124b, this.f218125c, C75592q0.m90789s(), this.f218123a, this.f218126d.mo108774y2(), 3, this.f218124b.mo91577r());
        } else {
            this.f218127e.mo103092i(this.f218124b, this.f218125c, C75592q0.m90789s(), this.f218123a, this.f218126d.mo108774y2(), 7, this.f218124b.mo91577r());
        }
    }
}
