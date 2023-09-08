package mf1;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import go1.C8366a;
import go1.C8368c;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;
import te3.C52275zk;
import te3.uc4;

/* renamed from: mf1.j */
public final class C10828j extends C12982a {
    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        T t;
        boolean z;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (!C8368c.f27352a.mo9335b(oVar.hashCode(), mo11037g(qVar.f34827a))) {
            mo12512t(8);
            Log.m105924i("Finder.FeedCardJumperObserver", "[onBindView] priority not ok");
            return;
        }
        uc4 uc4 = this.f37017f;
        C52275zk zkVar = null;
        if (uc4 == null) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 12) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uc4 = (uc4) t;
        }
        if (uc4 != null) {
            zkVar = uc4.f142750G;
        }
        if (zkVar != null) {
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.gr4);
            View findViewById = view.findViewById(C0966R.C0970id.f358076gr3);
            if (findViewById != null) {
                findViewById.setBackgroundColor(Color.parseColor(zkVar.f146048f));
            }
            if (textView != null) {
                textView.setText(zkVar.f146046d);
            }
            if (textView != null) {
                textView.setTextColor(Color.parseColor(zkVar.f146047e));
            }
        }
        C8368c.f27352a.mo9337d(oVar, view, mo11037g(qVar.f34827a));
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? finderJumpInfo.ext_type == 3 ? C8366a.AD_HARD : C8366a.AD_COMMON : super.mo11037g(finderJumpInfo);
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        return true;
    }

    /* renamed from: j */
    public void mo11048j(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12510f(600, view, z, aVar);
        mo12508d(false, z);
    }

    /* renamed from: u */
    public void mo11045u(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12509e(600, view, z, aVar);
        mo12508d(true, z);
    }
}
