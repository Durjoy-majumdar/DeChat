package gq1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavLoader;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: gq1.d */
public final class C59609d extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59606c f170322d;

    /* renamed from: e */
    public final /* synthetic */ FinderGlobalFavLoader f170323e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59609d(C59606c cVar, FinderGlobalFavLoader finderGlobalFavLoader) {
        super(1);
        this.f170322d = cVar;
        this.f170323e = finderGlobalFavLoader;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, "resp");
        C59606c cVar = this.f170322d;
        int size = this.f170323e.getDataList().size();
        List incrementList = iResponse.getIncrementList();
        if (incrementList != null) {
            cVar.f170312d.addAll(incrementList);
            RecyclerView.C16613e adapter = cVar.mo84620e().mo84629b().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeInserted(size, incrementList.size());
            }
        }
        cVar.mo84620e().mo84630c().mo26642z(!iResponse.getHasMore());
        C59613h e = cVar.mo84620e();
        FrameLayout frameLayout = e.f170334h;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = e.f170337k;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                if (this.f170322d.f170312d.isEmpty()) {
                    cVar.mo84620e().mo84631d();
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("retryView");
            throw null;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }
}
