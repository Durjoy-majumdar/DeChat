package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import kb2.C60995i;
import qb2.C62598a;
import qb2.C62600c;
import sb2.C63738a;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.d */
public final class C57063d implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C63738a f163402d;

    public C57063d(C63738a aVar) {
        this.f163402d = aVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C60995i iVar = (C60995i) oVar.f173503E;
        UIStateCenter<C62598a> c3 = this.f163402d.mo88561c3();
        C62600c.C62601a aVar = C62600c.C62601a.Select;
        C87412m.m108593f(iVar, "item");
        c3.dispatch(new C62600c(aVar, iVar));
    }
}
