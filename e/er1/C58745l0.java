package er1;

import android.app.Activity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C7450q;
import eb0.C75592q0;
import er1.C7888v2;
import gy3.C87412m;
import ot1.C11767a;
import rs1.C13442s8;
import te3.C101801kd0;
import te3.C101835rd0;
import te3.C49712hj1;

/* renamed from: er1.l0 */
public final class C58745l0 {

    /* renamed from: a */
    public static final C58745l0 f168212a = new C58745l0();

    /* renamed from: a */
    public final void mo83743a(BaseFinderFeed baseFinderFeed, Activity activity) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(activity, "context");
        if (!C11767a.f34453a.mo11659a(FirebaseAnalytics.C113378a.SHARE)) {
            C7888v2.C7889a aVar = C7888v2.f26513a;
            FinderItem o = baseFinderFeed.mo3513o();
            aVar.getClass();
            C87412m.m108594g(o, "feed");
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            rd02.mo141275k(C75592q0.m90789s());
            rd02.mo141274j("" + o.getId());
            rd02.mo141273f(o.getCreateTime());
            rd02.mo141278n("FavSourceId" + o.getId());
            rd02.mo141277m(31);
            kd02.mo141219q(rd02);
            kd02.mo141214l(aVar.mo9010h(o, false));
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            aVar2.f264679d = "";
            aVar2.f264676a = kd02;
            aVar2.f264678c = 20;
            aVar2.f264684i = activity;
            Log.m105924i("Finder.FinderFavUtil", "publish fav event, id:" + baseFinderFeed.getItemId());
            doFavoriteEvent.publish();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C7450q.f25643a.mo8596d(q3, baseFinderFeed.mo3513o(), 42, "", q3 != null ? q3.f134675i : 0);
        }
    }
}
