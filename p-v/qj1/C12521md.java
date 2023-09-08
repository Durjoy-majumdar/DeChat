package qj1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: qj1.md */
public final class C12521md implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f35989d;

    public C12521md(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
        this.f35989d = finderLiveRandomMatchLinkMicStatePlugin;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f35989d.f15151u;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        e0Var.mo107140d(0, this.f35989d.f166287d.getContext().getResources().getColor(C0966R.color.f356948a24), this.f35989d.f166287d.getContext().getResources().getString(C0966R.string.dr5));
    }
}
