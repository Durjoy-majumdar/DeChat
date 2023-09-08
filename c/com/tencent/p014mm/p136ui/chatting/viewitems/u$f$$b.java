package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f$$b */
public class u$f$$b implements C44580q1 {

    /* renamed from: a */
    public final /* synthetic */ C44561j f218114a;

    /* renamed from: b */
    public final /* synthetic */ C67391b f218115b;

    /* renamed from: c */
    public final /* synthetic */ C68070l.C68072b f218116c;

    /* renamed from: d */
    public final /* synthetic */ String f218117d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f218118e;

    /* renamed from: f */
    public final /* synthetic */ C74244u.C74260f f218119f;

    public u$f$$b(C74244u.C74260f fVar, C44561j jVar, C67391b bVar, C68070l.C68072b bVar2, String str, C72963f4 f4Var) {
        this.f218119f = fVar;
        this.f218114a = jVar;
        this.f218115b = bVar;
        this.f218116c = bVar2;
        this.f218117d = str;
        this.f218118e = f4Var;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        C44561j jVar = this.f218114a;
        if (jVar == null) {
            return;
        }
        if (z) {
            this.f218119f.mo103092i(this.f218115b, this.f218116c, this.f218117d, jVar, this.f218118e.mo108774y2(), 3, this.f218115b.mo91577r());
        } else {
            this.f218119f.mo103092i(this.f218115b, this.f218116c, this.f218117d, jVar, this.f218118e.mo108774y2(), 7, this.f218115b.mo91577r());
        }
    }
}
