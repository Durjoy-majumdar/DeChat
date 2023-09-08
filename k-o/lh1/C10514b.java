package lh1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: lh1.b */
public final class C10514b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f31753d;

    /* renamed from: e */
    public final /* synthetic */ ShellView f31754e;

    public C10514b(C77407n nVar, ShellView shellView) {
        this.f31753d = nVar;
        this.f31754e = shellView;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        this.f31753d.mo107567l((View) null);
        e0Var.clear();
        C76874e0 e0Var2 = e0Var;
        e0Var2.mo107150j(0, this.f31754e.getContext().getResources().getString(C0966R.string.f360640dy0), C0966R.raw.finder_icons_filled_share, this.f31754e.getContext().getResources().getColor(C0966R.color.f2939n), false);
        e0Var2.mo107150j(1, this.f31754e.getContext().getResources().getString(C0966R.string.f360641dy1), C0966R.raw.bottomsheet_icon_moment, 0, false);
    }
}
