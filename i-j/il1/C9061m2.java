package il1;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: il1.m2 */
public final class C9061m2 implements C7020t0 {

    /* renamed from: d */
    public final /* synthetic */ C9030k2 f28599d;

    public C9061m2(C9030k2 k2Var) {
        this.f28599d = k2Var;
    }

    /* renamed from: Q1 */
    public final void mo531Q1(int i, boolean z) {
        Log.m105924i("Finder.FinderLiveFansClubAnnouncementSettingWidget", "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
        C9030k2 k2Var = this.f28599d;
        if (i > 0) {
            ViewGroup.LayoutParams layoutParams = k2Var.f28535u.getLayoutParams();
            layoutParams.height = C74942w4.m89784a(k2Var.getContext(), k2Var.f28526i);
            k2Var.f28535u.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = k2Var.f28538x.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(0, k2Var.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3749d0), 0, 0);
            k2Var.f28538x.setLayoutParams(layoutParams3);
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = k2Var.f28535u.getLayoutParams();
        layoutParams4.height = C74942w4.m89784a(k2Var.getContext(), k2Var.f28525h);
        k2Var.f28535u.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = k2Var.f28538x.getLayoutParams();
        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.setMargins(0, k2Var.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3720ca), 0, 0);
        k2Var.f28538x.setLayoutParams(layoutParams6);
    }
}
