package nm1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import te3.C64273c21;

/* renamed from: nm1.g */
public final class C11231g extends C11227d {

    /* renamed from: j */
    public final Context f33098j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11231g(Context context) {
        super(15, context.getResources().getDimension(C0966R.dimen.a66), false, true, context);
        C87412m.m108594g(context, "context");
        this.f33098j = context;
    }

    /* renamed from: m */
    public void mo11309m(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "feed");
        super.mo11309m(oVar, baseFinderFeed);
        FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) oVar.mo85812D(C0966R.C0970id.dr9);
        View D = oVar.mo85812D(C0966R.C0970id.dv_);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.d86);
        if (baseFinderFeed.mo3513o().isLiveFeed()) {
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            boolean z = true;
            if (liveInfo == null || liveInfo.f182394f != 1) {
                z = false;
            }
            if (z) {
                finderLiveOnliveWidget.setVisibility(8);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderVideoLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderVideoLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
                return;
            }
            finderLiveOnliveWidget.setVisibility(0);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = D;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderVideoLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderVideoLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        finderLiveOnliveWidget.setVisibility(8);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view3 = D;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderVideoLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderVideoLiveFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
