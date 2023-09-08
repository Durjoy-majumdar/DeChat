package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.View;
import aw1.C16733n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashSet;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: com.tencent.mm.plugin.fts.ui.c0 */
public class C18844c0 extends C18852m implements C21891f.C21893b {

    /* renamed from: n */
    public C16733n f52843n;

    /* renamed from: o */
    public MMHandler f52844o = new MMHandler();

    public C18844c0(C18854q qVar, String str, int i) {
        super(qVar);
        C16733n nVar = new C16733n(qVar.getContext(), this, i);
        this.f52843n = nVar;
        nVar.f45233p = str;
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        if (z) {
            mo23833n(fVar.mo17721d(0));
        } else {
            mo23833n(0);
        }
        notifyDataSetChanged();
        mo23831k(this.f52857g, true);
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        C22019b f = this.f52843n.mo17723f(i);
        if (f != null) {
            f.f62328f = 7;
        }
        return f;
    }

    /* renamed from: f */
    public void mo23813f() {
        this.f52843n.mo17725h(this.f52858h, this.f52844o, new HashSet(), 0);
        Log.m105925i("MicroMSsg.FTS.FTSServiceNotifyAdapter", "do search %s", this.f52858h);
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        return false;
    }
}
