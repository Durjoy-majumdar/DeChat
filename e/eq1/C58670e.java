package eq1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI25;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import k20.C9556a;
import rs1.C13442s8;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;

/* renamed from: eq1.e */
public final class C58670e implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C58666b f167966d;

    public C58670e(C58666b bVar) {
        this.f167966d = bVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        Object obj = oVar.f173503E;
        C49712hj1 hj12 = null;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            Intent intent = new Intent(this.f167966d.f167947a, OccupyFinderUI25.class);
            ArrayList<C9493c> arrayList = this.f167966d.f167949c.f167945d;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator<C9493c> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(it.next().getItemId()));
            }
            long[] z0 = C110818d0.m150954z0(arrayList2);
            C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(this.f167966d.f167948b).mo75002a(C13442s8.class);
            if (s8Var != null) {
                hj12 = s8Var.mo12861q3();
            }
            C49712hj1 hj13 = hj12;
            if (hj13 != null) {
                C58666b bVar = this.f167966d;
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.Qx0((C58417y0) c, hj13, baseFinderFeed.getItemId(), bVar.mo83538b(), 0, (String) null, 24, (Object) null);
            }
            intent.putExtra("KEY_FEED_ID_LIST", z0);
            intent.putExtra("KEY_CENTER_FEED_ID", baseFinderFeed.getItemId());
            intent.putExtra("KEY_CENTER_FEED_POS", i);
            intent.putExtra("KEY_COMMENT_SCENE", 198);
            intent.putExtra("KEY_HAS_MORE", false);
            C7287o.m7447c(intent, view, 0, false, false, (C32227p) null, 30, (Object) null);
            Activity activity = this.f167966d.f167947a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
