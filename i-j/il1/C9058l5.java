package il1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: il1.l5 */
public final class C9058l5 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMemebrProfileWidget f28596d;

    public C9058l5(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
        this.f28596d = finderLiveMemebrProfileWidget;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f28596d.f15404X;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        e0Var.mo107140d(0, this.f28596d.f28306d.getResources().getColor(C0966R.color.f356948a24), this.f28596d.f28306d.getResources().getString(C0966R.string.esw));
    }
}
