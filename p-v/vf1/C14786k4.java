package vf1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import qo3.C77407n;
import rs1.C13442s8;

/* renamed from: vf1.k4 */
public final class C14786k4 implements C77407n.C77419q {

    /* renamed from: a */
    public final /* synthetic */ FinderPoiFeedUI f40769a;

    public C14786k4(FinderPoiFeedUI finderPoiFeedUI) {
        this.f40769a = finderPoiFeedUI;
    }

    public final void onShow() {
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        AppCompatActivity context = this.f40769a.getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        y0Var.Cx0(0, "poi_detail_panel", "", f != null ? f.mo12861q3() : null);
    }
}
