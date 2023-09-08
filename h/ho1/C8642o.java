package ho1;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: ho1.o */
public final class C8642o extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f27793d;

    /* renamed from: e */
    public final /* synthetic */ C8637m f27794e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8642o(LinearLayout linearLayout, C8637m mVar) {
        super(1);
        this.f27793d = linearLayout;
        this.f27794e = mVar;
    }

    public Object invoke(Object obj) {
        FTSEditTextView ftsEditText;
        if (!((Boolean) obj).booleanValue()) {
            LinearLayout linearLayout = this.f27793d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            FTSSearchView fTSSearchView = this.f27794e.f27780p;
            if (fTSSearchView != null) {
                fTSSearchView.setVisibility(8);
            }
            FTSSearchView fTSSearchView2 = this.f27794e.f27780p;
            if (!(fTSSearchView2 == null || (ftsEditText = fTSSearchView2.getFtsEditText()) == null)) {
                ftsEditText.mo70336d();
            }
            this.f27794e.mo9507a();
            RecyclerView recyclerView = this.f27794e.f27773f;
            if (recyclerView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$initSearch$2", "invoke", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$initSearch$2", "invoke", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
