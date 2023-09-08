package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76912y0;
import p244tt.C14088e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z */
public class C74324z implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f218328a;

    /* renamed from: b */
    public final /* synthetic */ boolean f218329b;

    /* renamed from: c */
    public final /* synthetic */ C68070l.C68072b f218330c;

    /* renamed from: d */
    public final /* synthetic */ View f218331d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f218332e;

    /* renamed from: f */
    public final /* synthetic */ C74023i f218333f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f218334g;

    public C74324z(C89779i0 i0Var, boolean z, C68070l.C68072b bVar, View view, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
        this.f218328a = i0Var;
        this.f218329b = z;
        this.f218330c = bVar;
        this.f218331d = view;
        this.f218332e = bVar2;
        this.f218333f = iVar;
        this.f218334g = f4Var;
    }

    /* renamed from: a */
    public void mo1717a() {
        C115669n.INSTANCE.mo175913w(1293, 32, 1);
        this.f218328a.cancel();
    }

    /* renamed from: b */
    public void mo1718b() {
        if (this.f218329b) {
            C74244u.C74260f.m88535x0(this.f218330c, this.f218331d, this.f218332e, this.f218333f, this.f218334g);
        } else {
            C76912y0.makeText((Context) this.f218332e.mo91565f(), (int) C0966R.string.gaq, 0).show();
        }
        this.f218328a.cancel();
    }
}
