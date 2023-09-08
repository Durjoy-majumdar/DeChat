package zf1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.ArrayList;
import kf1.C9854m5;

/* renamed from: zf1.l */
public final class C16154l extends C9854m5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16154l(MMActivity mMActivity, FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter, int i, int i2) {
        super(mMActivity, finderGalleryTimelineContract$Presenter, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderGalleryTimelineContract$Presenter, "presenter");
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…d_more_footer_dark, null)");
        D.setLoadMoreFooter(inflate);
        View findViewById = this.f30122d.findViewById(C0966R.C0970id.i6k);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.profile_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (recyclerView instanceof FinderRecyclerView) {
            FinderRecyclerView finderRecyclerView = (FinderRecyclerView) recyclerView;
            if (finderRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                FinderRecyclerView.m63293z1(finderRecyclerView, (LinearLayoutManager) layoutManager, (String) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: m0 */
    public boolean mo10311m0() {
        return true;
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
