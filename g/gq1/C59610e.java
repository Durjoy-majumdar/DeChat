package gq1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI25;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.xweb.util.WXWebReporter;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import fy3.C32227p;
import gq1.C59613h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p525fr.C59313e;
import rs1.C13390r2;
import rs1.C13442s8;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;

/* renamed from: gq1.e */
public final class C59610e implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C59613h f170324d;

    public C59610e(C59613h hVar) {
        this.f170324d = hVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        boolean z;
        C59313e eVar2;
        int i2 = i;
        C60905o oVar = (C60905o) zVar;
        Class cls = C58417y0.class;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        C13442s8 s8Var = (C13442s8) rVar.mo62445d(this.f170324d.f170328b).mo62449e(C13442s8.class);
        Boolean bool = null;
        C49712hj1 q3 = s8Var != null ? s8Var.mo12861q3() : null;
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            if (this.f170324d.f170329c.mo84621n()) {
                C39622i0 a = rVar.mo62443b(this.f170324d.f170327a).mo75002a(C13390r2.class);
                C87412m.m108593f(a, "UICProvider.of(context).…ltiSelectMgr::class.java)");
                C13390r2 r2Var = (C13390r2) a;
                if (r2Var.f37929d) {
                    Boolean bool2 = r2Var.f37930e.get(Long.valueOf(baseFinderFeed.getItemId()));
                    if (bool2 == null) {
                        bool2 = Boolean.FALSE;
                    }
                    boolean z2 = !bool2.booleanValue();
                    r2Var.f37930e.put(Long.valueOf(baseFinderFeed.getItemId()), Boolean.valueOf(z2));
                    ((C59613h.C59614a) this.f170324d.f170338l).mo162I(oVar, baseFinderFeed, Integer.valueOf(i), Boolean.valueOf(z2));
                    RecyclerView.C16613e adapter = this.f170324d.mo84629b().getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemChanged(i2);
                        return;
                    }
                    return;
                }
                C59604a aVar = this.f170324d.f170329c;
                C59605b bVar = aVar instanceof C59605b ? (C59605b) aVar : null;
                if (!((bVar == null || (eVar2 = bVar.f170315g) == null) ? false : eVar2.mo84414e7(i2))) {
                    if (q3 != null) {
                        C59613h hVar = this.f170324d;
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        z = true;
                        C58417y0.Qx0((C58417y0) c, q3, baseFinderFeed.getItemId(), hVar.mo84629b(), 0, (String) null, 24, (Object) null);
                    } else {
                        z = true;
                    }
                    Intent intent = new Intent(this.f170324d.f170327a, OccupyFinderUI25.class);
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(43, 34, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD, intent);
                    ArrayList<C0740i2> arrayList = this.f170324d.f170329c.f170312d;
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator<C0740i2> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(it.next().getItemId()));
                    }
                    long[] z0 = C110818d0.m150954z0(arrayList2);
                    C13442s8.f38060Q0.mo12871c(this.f170324d.f170327a, intent);
                    intent.putExtra("KEY_FEED_ID_LIST", z0);
                    intent.putExtra("KEY_CENTER_FEED_ID", baseFinderFeed.getItemId());
                    intent.putExtra("KEY_CENTER_FEED_POS", i2);
                    C59604a aVar2 = this.f170324d.f170329c;
                    C59605b bVar2 = aVar2 instanceof C59605b ? (C59605b) aVar2 : null;
                    if (bVar2 != null) {
                        bool = Boolean.valueOf(bVar2.f170316h);
                    }
                    intent.putExtra("KEY_HAS_MORE", bool);
                    intent.putExtra("KEY_IS_GLOBAL_FAV", z);
                    C7287o.m7447c(intent, view, 0, false, false, (C32227p) null, 30, (Object) null);
                    Activity activity = this.f170324d.f170327a;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(Integer.valueOf(z ? 1 : 0));
                    aVar3.mo10233c(intent);
                    C117292a.m165364j(activity, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback$initCenter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    return;
                }
                return;
            }
            if (q3 != null) {
                C59613h hVar2 = this.f170324d;
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                C58417y0.Qx0((C58417y0) c2, q3, baseFinderFeed.getItemId(), hVar2.mo84629b(), 0, (String) null, 24, (Object) null);
            }
            Intent intent2 = new Intent();
            intent2.putExtra("KEY_COLLECTION", true);
            C59604a aVar4 = this.f170324d.f170329c;
            C59606c cVar = aVar4 instanceof C59606c ? (C59606c) aVar4 : null;
            if (cVar != null) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(cVar.f170312d);
                cVar.f170317g.mo2926b(new C2819w0(arrayList3, cVar.mo84627G().getLastBuffer(), i2, (C2780c) null), intent2);
            }
            C13442s8.f38060Q0.mo12871c(this.f170324d.f170327a, intent2);
            C7287o.m7447c(intent2, view, 0, false, false, (C32227p) null, 30, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).zx0(this.f170324d.f170327a, intent2, 10001);
        }
    }
}
