package g60;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.p016ui.dialog.LiveAnchorMicUserListView;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: g60.b */
public final class C59366b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorMicUserListView f169682d;

    public C59366b(LiveAnchorMicUserListView liveAnchorMicUserListView) {
        this.f169682d = liveAnchorMicUserListView;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f169682d.f157235d;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        e0Var.mo107140d(1, this.f169682d.getContext().getResources().getColor(C0966R.color.f356948a24), this.f169682d.getContext().getResources().getString(C0966R.string.g9x));
    }
}
