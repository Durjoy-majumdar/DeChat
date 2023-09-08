package kf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: kf1.y6 */
public final class C46714y6 extends C87413o implements C32226l<Void, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46697b7 f125754d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46714y6(C46697b7 b7Var) {
        super(1);
        this.f125754d = b7Var;
    }

    public Object invoke(Object obj) {
        View findViewById;
        Void voidR = (Void) obj;
        C46704t6 t6Var = this.f125754d.f125716e;
        t6Var.f125731g = null;
        t6Var.mo71952e(false, 1);
        C46697b7 b7Var = this.f125754d;
        if (b7Var.f125716e.f125732h.size() == 0 && (findViewById = b7Var.f125715d.findViewById(C0966R.C0970id.cjg)) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            RefreshLoadMoreLayout refreshLoadMoreLayout = b7Var.f125717f;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(8);
                View findViewById2 = findViewById.findViewById(C0966R.C0970id.i7j);
                if (findViewById2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
