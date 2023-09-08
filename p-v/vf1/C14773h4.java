package vf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import er1.C58784w3;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.C51824we3;

/* renamed from: vf1.h4 */
public final class C14773h4 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderPoiFeedUI f40754d;

    public C14773h4(FinderPoiFeedUI finderPoiFeedUI) {
        this.f40754d = finderPoiFeedUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        if (e0Var.mo107176v()) {
            String string = this.f40754d.getContext().getString(C0966R.string.f360098a33);
            C87412m.m108593f(string, "context.getString(com.te…ring.app_share_to_weixin)");
            String string2 = this.f40754d.getContext().getString(C0966R.string.epb);
            C87412m.m108593f(string2, "context.getString(com.te…ng.finder_share_timeline)");
            String string3 = this.f40754d.getContext().getString(C0966R.string.eh8);
            C87412m.m108593f(string3, "context.getString(R.string.finder_poi_claim)");
            String string4 = this.f40754d.getContext().getString(C0966R.string.ehp);
            C87412m.m108593f(string4, "context.getString(R.string.finder_poi_report_err)");
            FinderPoiFeedUI finderPoiFeedUI = this.f40754d;
            int i = FinderPoiFeedUI.f14655t;
            if (finderPoiFeedUI.mo3075N7().f13766e == null) {
                C58784w3 w3Var = C58784w3.f168295a;
                String Y = w3Var.mo83911Y("", C0966R.string.eo6);
                str = w3Var.mo83911Y("", C0966R.string.eo7);
                str2 = Y;
                z2 = true;
                z = true;
            } else {
                str2 = string;
                str = string2;
                z2 = false;
                z = false;
            }
            C76874e0 e0Var2 = e0Var;
            e0Var2.mo107150j(10002, str2, C0966R.raw.finder_icons_filled_share, this.f40754d.getContext().getResources().getColor(C0966R.color.f2939n), z2);
            e0Var2.mo107150j(10003, str, C0966R.raw.bottomsheet_icon_moment, 0, z);
            C51824we3 we32 = this.f40754d.mo3075N7().f13767f;
            if (we32 != null) {
                if (we32.f143996d == 1) {
                    e0Var.mo107142f(10004, string3);
                }
                if (we32.f143997e == 1) {
                    e0Var.mo107142f(10005, string4);
                }
            }
        }
    }
}
