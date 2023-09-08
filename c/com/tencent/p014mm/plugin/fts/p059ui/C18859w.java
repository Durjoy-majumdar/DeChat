package com.tencent.p014mm.plugin.fts.p059ui;

import a11.C39479c;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import aw1.C16722f;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashSet;
import kv1.C99260q;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: com.tencent.mm.plugin.fts.ui.w */
public class C18859w extends C18852m implements C21891f.C21893b {

    /* renamed from: n */
    public C16722f f52869n;

    /* renamed from: o */
    public MMHandler f52870o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public boolean f52871p;

    public C18859w(C18854q qVar, String str, int i) {
        super(qVar);
        Context context = qVar.getContext();
        HashSet hashSet = new HashSet();
        hashSet.add(160);
        C16722f fVar = (C16722f) ((C99260q) C86312j.m106911c(C99260q.class)).Wh0(hashSet, context, this, i).get(0);
        fVar.f45203p = str;
        if (C72996z1.m85820U5(str)) {
            fVar.f45204q = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        }
        this.f52869n = fVar;
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        mo23833n(fVar.mo17721d(0));
        notifyDataSetChanged();
        mo23831k(this.f52857g, true);
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        C22019b f = this.f52869n.mo17723f(i);
        if (f != null) {
            f.f62331i = i;
            f.f62328f = 4;
        }
        return f;
    }

    /* renamed from: f */
    public void mo23813f() {
        this.f52871p = false;
        this.f52869n.mo17725h(this.f52858h, this.f52870o, new HashSet(), 0);
    }

    /* renamed from: g */
    public void mo23815g() {
        super.mo23815g();
        if (!this.f52871p) {
            this.f52871p = true;
            C18843b0.m19722i(this.f52858h, false, this.f52869n.mo23810r(), -2);
        }
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        this.f52869n.mo17718b(view, bVar, z);
        if (!bVar.f62337o || this.f52871p) {
            return false;
        }
        this.f52871p = true;
        C18843b0.m19722i(this.f52858h, true, this.f52869n.mo23810r(), -2);
        return false;
    }
}
