package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.View;
import aw1.C16735o;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashSet;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: com.tencent.mm.plugin.fts.ui.d0 */
public class C18845d0 extends C18852m implements C21891f.C21893b {

    /* renamed from: n */
    public C16735o f52845n;

    /* renamed from: o */
    public MMHandler f52846o = new MMHandler();

    /* renamed from: p */
    public boolean f52847p;

    public C18845d0(C18854q qVar, String str, int i) {
        super(qVar);
        C16735o oVar = new C16735o(qVar.getContext(), this, i);
        this.f52845n = oVar;
        oVar.f45235p = str;
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        mo23833n(fVar.mo17721d(0));
        notifyDataSetChanged();
        mo23831k(this.f52857g, true);
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        C22019b f = this.f52845n.mo17723f(i);
        if (f != null) {
            f.f62328f = 3;
        }
        return f;
    }

    /* renamed from: f */
    public void mo23813f() {
        this.f52847p = false;
        this.f52845n.mo17725h(this.f52858h, this.f52846o, new HashSet(), 0);
    }

    /* renamed from: g */
    public void mo23815g() {
        super.mo23815g();
        if (!this.f52847p) {
            this.f52847p = true;
            C18843b0.m19722i(this.f52858h, false, this.f52845n.mo23810r(), -2);
        }
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        this.f52845n.mo17718b(view, bVar, z);
        if (bVar.f62337o && !this.f52847p) {
            this.f52847p = true;
            C18843b0.m19722i(this.f52858h, true, this.f52845n.mo23810r(), -2);
        }
        mo23822b();
        mo23833n(this.f52845n.mo17721d(0));
        notifyDataSetChanged();
        mo23831k(this.f52857g, true);
        return true;
    }
}
