package he1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import gy3.C87412m;
import o40.C61926c;
import org.json.JSONObject;
import p001ak.C54053a;
import p006bk.C54482d;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: he1.p */
public final class C59860p implements C54482d {

    /* renamed from: a */
    public final /* synthetic */ C59854m f170921a;

    /* renamed from: b */
    public final /* synthetic */ View f170922b;

    public C59860p(C59854m mVar, View view) {
        this.f170921a = mVar;
        this.f170922b = view;
    }

    /* renamed from: a */
    public final void mo75308a(C54053a aVar) {
        if (this.f170921a.mo84817d()) {
            DATA data = aVar.f151367x;
            C87412m.m108592e(data, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
            C59840c cVar = (C59840c) data;
            C59853j jVar = C59853j.f170902a;
            Context context = this.f170922b.getContext();
            C87412m.m108593f(context, "bulletView.context");
            C39818r rVar = C39818r.f106831a;
            Context context2 = this.f170922b.getContext();
            C87412m.m108593f(context2, "bulletView.context");
            C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context2).mo75002a(C13442s8.class)).mo12861q3();
            JSONObject jSONObject = new JSONObject();
            C59854m mVar = this.f170921a;
            jSONObject.put("bs_id", C61926c.m72691p(cVar.f170850a.f138058d));
            jSONObject.put("feedid", C61926c.m72691p(mVar.mo84816c().getItemId()));
            C13598b0 b0Var = C13598b0.f38549a;
            jVar.mo84811a(context, q3, "bullet_screen", false, jSONObject, this.f170921a.f170913p, cVar.f170850a.f138064j);
        }
    }
}
