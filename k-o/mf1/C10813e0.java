package mf1;

import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import pf1.C11920q;
import rf1.C12982a;

/* renamed from: mf1.e0 */
public final class C10813e0 extends C12982a {
    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        Log.m105924i("FeedAdPosJumperObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + oVar.hashCode() + " holder position: " + oVar.mo17365l() + " feedId=" + C61926c.m72691p(this.f37014c) + " showPosition=" + qVar.f34841o + " showStyle=" + qVar.f34842p + " businessType=" + finderJumpInfo.business_type + " jumpType=" + finderJumpInfo.jumpinfo_type + " title=" + finderJumpInfo.recommend_reason + '|' + finderJumpInfo.wording + " icon_url=" + finderJumpInfo.icon_url + " ext_info=" + finderJumpInfo.ext_info + ' ');
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.mhm);
        if (textView != null) {
            textView.setText(qVar.f34827a.wording);
            int i = qVar.f34827a.banner_type;
            textView.setAlpha((i == 1 || i == 2) ? 0.5f : 1.0f);
            Log.m105924i("FeedAdPosJumperObserver", "onBindView: wording = " + qVar.f34827a.wording + ", banner_type = " + qVar.f34827a.banner_type);
        }
        this.f37024m = false;
        if (view.getVisibility() != 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.animate().alpha(1.0f).setDuration(280).start();
        }
    }
}
