package wg1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: wg1.i3 */
public final class C15309i3 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f41618d;

    /* renamed from: e */
    public final /* synthetic */ C15278g3 f41619e;

    public C15309i3(C77407n nVar, C15278g3 g3Var) {
        this.f41618d = nVar;
        this.f41619e = g3Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        this.f41618d.mo107567l((View) null);
        e0Var.clear();
        e0Var.mo107150j(0, this.f41619e.getContext().getResources().getString(C0966R.string.f360640dy0), C0966R.raw.finder_icons_filled_share, this.f41619e.getContext().getResources().getColor(C0966R.color.f2939n), false);
        C76874e0 e0Var2 = e0Var;
        e0Var2.mo107150j(1, this.f41619e.getContext().getResources().getString(C0966R.string.f360641dy1), C0966R.raw.bottomsheet_icon_moment, 0, false);
        e0Var2.mo107150j(2, this.f41619e.getString(C0966R.string.f360552dj3), C0966R.raw.icons_filled_download, this.f41619e.getContext().getResources().getColor(C0966R.color.f2939n), false);
        e0Var.mo107150j(3, this.f41619e.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0, false);
    }
}
