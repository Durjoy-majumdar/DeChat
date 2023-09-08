package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Looper;
import android.view.View;
import aw1.C16717a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashSet;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: com.tencent.mm.plugin.fts.ui.f */
public class C18846f extends C18852m implements C21891f.C21893b {

    /* renamed from: n */
    public C16717a f52848n;

    /* renamed from: o */
    public MMHandler f52849o = new MMHandler(Looper.getMainLooper());

    public C18846f(C18854q qVar) {
        super(qVar);
        this.f52848n = new C16717a(qVar.getContext(), this, 0);
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        int d = this.f52848n.mo17721d(0);
        mo23833n(d);
        notifyDataSetChanged();
        mo23831k(d, true);
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        return this.f52848n.mo17723f(i);
    }

    /* renamed from: f */
    public void mo23813f() {
        this.f52848n.mo17725h(this.f52858h, this.f52849o, new HashSet(), 0);
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        return false;
    }
}
