package vf1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineUI;
import di3.C86312j;
import dp1.C58417y0;
import er1.C7853p2;
import gy3.C87412m;
import java.util.HashMap;
import nj3.C11182m0;
import nj3.C76874e0;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51827wf3;

/* renamed from: vf1.j5 */
public final class C14783j5 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineUI f40766d;

    public C14783j5(FinderTimelineUI finderTimelineUI) {
        this.f40766d = finderTimelineUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        Class cls = C58417y0.class;
        if (e0Var.mo107176v()) {
            e0Var.mo107125a(1001, C0966R.string.f7980y8);
            e0Var.mo107125a(1002, C0966R.string.f7989yh);
            e0Var.mo107125a(1004, C0966R.string.dku);
            C7853p2 p2Var = C7853p2.f26439a;
            FinderTimelineUI finderTimelineUI = this.f40766d;
            HashMap<Integer, C51827wf3> hashMap = finderTimelineUI.f14874w;
            AppCompatActivity context = finderTimelineUI.getContext();
            C87412m.m108593f(context, "context");
            p2Var.mo8962e(1010, hashMap, e0Var, context);
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        AppCompatActivity context2 = this.f40766d.getContext();
        C87412m.m108593f(context2, "context");
        C13442s8 f = aVar.mo12873f(context2);
        C49712hj1 hj12 = null;
        y0Var.Cx0(0, "post_acionsheet_camera", "", f != null ? f.mo12861q3() : null);
        C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
        AppCompatActivity context3 = this.f40766d.getContext();
        C87412m.m108593f(context3, "context");
        C13442s8 f2 = aVar.mo12873f(context3);
        if (f2 != null) {
            hj12 = f2.mo12861q3();
        }
        y0Var2.Cx0(0, "post_actionsheet_album", "", hj12);
    }
}
