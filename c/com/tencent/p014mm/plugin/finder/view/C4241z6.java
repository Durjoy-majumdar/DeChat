package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.C4226y6;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.finder.view.z6 */
public final class C4241z6 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C4226y6 f18563d;

    public C4241z6(C4226y6 y6Var) {
        this.f18563d = y6Var;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C4226y6 y6Var = this.f18563d;
        Object obj = oVar.f173503E;
        C87412m.m108593f(obj, "holder.getAssociatedObject()");
        C4226y6.C4228b bVar = (C4226y6.C4228b) obj;
        y6Var.getClass();
        if (i != y6Var.f18538d.size() - 1) {
            y6Var.f18536b.invoke(Integer.valueOf(bVar.f18541d));
            C12925w wVar = y6Var.f18537c;
            if (wVar != null) {
                wVar.mo5085n();
            }
        } else {
            C4021b7 b7Var = y6Var.f18540f;
            C12925w wVar2 = y6Var.f18537c;
            b7Var.f36949a = wVar2;
            if (wVar2 != null) {
                wVar2.mo12468h(b7Var);
            }
        }
        y6Var.f18538d.size();
    }
}
