package il1;

import android.view.View;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qk1.C63270w1;
import rx3.C13598b0;
import te3.C48868bk1;

/* renamed from: il1.b5 */
public final class C60348b5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60541x4 f172011d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f172012e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f172013f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60348b5(C60541x4 x4Var, C8478d0 d0Var, C8478d0 d0Var2) {
        super(0);
        this.f172011d = x4Var;
        this.f172012e = d0Var;
        this.f172013f = d0Var2;
    }

    public Object invoke() {
        this.f172011d.f172578t.mo82440F(0);
        if (this.f172011d.f172584z.isEmpty()) {
            this.f172011d.f172574p.setVisibility(0);
            this.f172011d.f172576r.setVisibility(8);
        } else {
            this.f172011d.f172574p.setVisibility(8);
            this.f172011d.f172576r.setVisibility(0);
            C60541x4 x4Var = this.f172011d;
            C63270w1 w1Var = x4Var.f172580v;
            ArrayList<C48868bk1> arrayList = x4Var.f172584z;
            w1Var.getClass();
            C87412m.m108594g(arrayList, "data");
            w1Var.f179568d.clear();
            w1Var.f179568d.addAll(arrayList);
            this.f172011d.f172580v.notifyDataSetChanged();
        }
        if (this.f172012e.f27483d == 0) {
            View view = this.f172011d.f172575q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f172011d.f172574p.setVisibility(0);
            this.f172011d.f172578t.setVisibility(8);
        } else {
            View view3 = this.f172011d.f172575q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f172011d.f172574p.setVisibility(8);
            this.f172011d.f172578t.setVisibility(0);
        }
        int i = this.f172013f.f27483d;
        if (i == 0) {
            this.f172011d.f172580v.notifyDataSetChanged();
        } else {
            int i2 = this.f172012e.f27483d;
            if (i < i2) {
                this.f172011d.f172580v.notifyItemRangeInserted(i, i2 - i);
            }
        }
        return C13598b0.f38549a;
    }
}
