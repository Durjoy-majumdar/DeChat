package vf1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import org.json.JSONObject;
import qo3.C77407n;
import rs1.C13442s8;
import z04.C112551y;

/* renamed from: vf1.j4 */
public final class C14782j4 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ FinderPoiFeedUI f40765a;

    public C14782j4(FinderPoiFeedUI finderPoiFeedUI) {
        this.f40765a = finderPoiFeedUI;
    }

    public final void onDismiss() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_option", "cancel");
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        AppCompatActivity context = this.f40765a.getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        y0Var.Cx0(1, "poi_detail_panel", n, f != null ? f.mo12861q3() : null);
    }
}
