package gq1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import dp1.C7435f2;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import org.json.JSONObject;
import rs1.C13390r2;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: gq1.f */
public final class C59611f implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C59613h f170325d;

    public C59611f(C59613h hVar) {
        this.f170325d = hVar;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        RecyclerView.C16613e eVar2 = eVar;
        View view2 = view;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        if (((C13390r2) rVar.mo62443b(this.f170325d.f170327a).mo75002a(C13390r2.class)).f37929d) {
            return false;
        }
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        C13442s8 s8Var = (C13442s8) rVar.mo62445d(this.f170325d.f170328b).mo62449e(C13442s8.class);
        C49712hj1 q3 = s8Var != null ? s8Var.mo12861q3() : null;
        this.f170325d.f170329c.mo84622q(eVar2, view2, i, oVar);
        C7435f2.m7551e(C7435f2.f25626a, q3, "channel_feedcard_moreActionPanel", true, i2Var.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
        return false;
    }
}
