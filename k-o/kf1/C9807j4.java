package kf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: kf1.j4 */
public final class C9807j4 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C9765h4 f30342d;

    public C9807j4(C9765h4 h4Var) {
        this.f30342d = h4Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f30342d.f30262X;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        e0Var.mo107150j(0, "发送给朋友", C0966R.raw.finder_icons_filled_share, this.f30342d.getContext().getResources().getColor(C0966R.color.f2939n), false);
        e0Var.mo107150j(1, "分享到朋友圈", C0966R.raw.bottomsheet_icon_moment, 0, false);
    }
}
