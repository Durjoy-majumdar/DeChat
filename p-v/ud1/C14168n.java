package ud1;

import android.content.Intent;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import er1.C58684b;
import er1.C7842n2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jq3.C60905o;
import kf1.C9629ac;
import kf1.C9965rb;
import rs1.C13442s8;
import rx3.C13604l;
import te3.C50862pq3;
import te3.C51270sn1;

/* renamed from: ud1.n */
public final class C14168n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39608d;

    /* renamed from: e */
    public final /* synthetic */ C13604l<Integer, BaseFinderFeed> f39609e;

    public C14168n(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, C13604l<Integer, ? extends BaseFinderFeed> lVar) {
        this.f39608d = finderMusicTopicHeaderUIC;
        this.f39609e = lVar;
    }

    public final void onClick(View view) {
        C50862pq3 pq32;
        LinkedList<C51270sn1> linkedList;
        C51270sn1 sn12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initRingtone$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f39608d;
        C13604l<Integer, BaseFinderFeed> lVar = this.f39609e;
        finderMusicTopicHeaderUIC.getClass();
        int intValue = ((Number) lVar.f38555d).intValue();
        if (intValue == 1) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) lVar.f38556e;
            if (baseFinderFeed != null) {
                C7842n2.m7986b(C7842n2.f26407a, finderMusicTopicHeaderUIC.getActivity(), baseFinderFeed, 6, false, (String) null, (String) null, 0, (C60905o) null, C14157c.f39590d, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            }
        } else if (intValue == 2) {
            C39818r rVar = C39818r.f106831a;
            FinderMusicTopicFragment finderMusicTopicFragment = ((C14175t) rVar.mo62444c(finderMusicTopicHeaderUIC.getActivity()).mo75002a(C14175t.class)).f39620B;
            if (finderMusicTopicFragment != null) {
                C9965rb rbVar = ((C14174s) rVar.mo62445d(finderMusicTopicFragment).mo75002a(C14174s.class)).f12525q;
                String str = null;
                if (rbVar != null) {
                    Intent e1 = rbVar.mo10467e1(((BaseFinderFeed) rbVar.mo10348I0().f30175e.getListOfType(BaseFinderFeed.class).get(0)).mo3513o(), 0);
                    FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = (FinderTopicFeedUIContract$TopicFeedPresenter) rbVar.mo10348I0();
                    if (finderTopicFeedUIContract$TopicFeedPresenter.mo2639f0(finderTopicFeedUIContract$TopicFeedPresenter.f13400p)) {
                        pq32 = null;
                    } else {
                        pq32 = new C50862pq3();
                        LinkedList<C51270sn1> linkedList2 = new LinkedList<>();
                        pq32.f139904d = linkedList2;
                        linkedList2.add(finderTopicFeedUIContract$TopicFeedPresenter.f13400p);
                    }
                    BaseFinderFeedLoader baseFinderFeedLoader = rbVar.mo10348I0().f30175e;
                    C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                    FinderTopicFeedLoader finderTopicFeedLoader = (FinderTopicFeedLoader) baseFinderFeedLoader;
                    if (!(pq32 == null || (linkedList = pq32.f139904d) == null || (sn12 = linkedList.get(0)) == null)) {
                        str = sn12.f141617d;
                    }
                    rbVar.mo10348I0().f30175e.saveCache(e1, 0, new C9629ac(pq32, finderTopicFeedLoader.mo2811d(str)));
                    e1.putExtra("key_enable_ringtone_bubble", true);
                    C13442s8.C13443a.m12791e(C13442s8.f38060Q0, rbVar.f30214d, e1, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                    ((C58684b) C86312j.m106911c(C58684b.class)).ty0(rbVar.f30214d, e1);
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initRingtone$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
