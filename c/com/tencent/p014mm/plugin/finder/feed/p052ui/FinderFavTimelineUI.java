package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import kf1.C9854m5;
import kf1.C9980t1;
import kf1.C9993u1;
import kotlin.Metadata;
import rs1.C13466ta;
import rs1.C13554z;
import rs1.C63513a1;
import sx3.C110818d0;
import ts1.C14078c;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lkf1/u1;", "Lkf1/t1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI */
public final class FinderFavTimelineUI extends FinderLoaderFeedUI<BaseFinderFeedLoader, C9993u1, C9980t1> {

    /* renamed from: A */
    public final C2893a f14269A = new C2893a();

    /* renamed from: s */
    public C9980t1 f14270s;

    /* renamed from: t */
    public C9993u1 f14271t;

    /* renamed from: u */
    public BaseFinderFeedLoader f14272u;

    /* renamed from: v */
    public String f14273v = "";

    /* renamed from: w */
    public String f14274w = "";

    /* renamed from: x */
    public boolean f14275x;

    /* renamed from: y */
    public LinkedList<String> f14276y = new LinkedList<>();

    /* renamed from: z */
    public final int f14277z = 2;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI$a */
    public static final class C2893a extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        if (getIntent().getBooleanExtra("KEY_COLLECTION", false)) {
            return 166;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99504r6.mo60266n().intValue() == 1 ? 165 : 21;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        BaseFinderFeedLoader baseFinderFeedLoader = this.f14272u;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9980t1 t1Var = this.f14270s;
        if (t1Var != null) {
            return t1Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9993u1 u1Var = this.f14271t;
        if (u1Var != null) {
            return u1Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r10 = this;
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r2 = "KEY_FAV_QUERY"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0011
            r1 = r2
        L_0x0011:
            r10.f14273v = r1
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r3 = "KEY_REQUEST_ID"
            java.lang.String r1 = r1.getStringExtra(r3)
            if (r1 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r10.f14274w = r2
            android.content.Intent r1 = r10.getIntent()
            r2 = 0
            java.lang.String r3 = "KEY_COLLECTION"
            boolean r1 = r1.getBooleanExtra(r3, r2)
            r10.f14275x = r1
            java.util.LinkedList<java.lang.String> r1 = r10.f14276y
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r3 = "KEY_TAGS"
            java.util.ArrayList r2 = r2.getStringArrayListExtra(r3)
            if (r2 != 0) goto L_0x0043
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0043:
            r1.addAll(r2)
            di3.d r1 = di3.C86312j.m106911c(r0)
            l31.e r1 = (l31.C61212e) r1
            o31.b r2 = o31.C11345b.FinderFavTimelineUI
            r1.mo86178qr(r10, r2)
            kf1.t1 r1 = new kf1.t1
            int r3 = r10.f14277z
            r1.<init>(r10, r3)
            r10.f14270s = r1
            kf1.u1 r3 = new kf1.u1
            int r4 = r10.f14277z
            int r5 = r10.mo2194I7()
            r3.<init>(r10, r1, r4, r5)
            r10.f14271t = r3
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r10)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r4 = r1.mo12861q3()
            boolean r1 = r10.f14275x
            r3 = 1
            if (r1 == 0) goto L_0x009a
            com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader r1 = new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader
            r1.<init>(r4, r3)
            android.content.Intent r3 = r10.getIntent()
            r1.initFromCache(r3)
            vf1.q r3 = new vf1.q
            r3.<init>(r10, r1)
            r1.setInitDone(r3)
            vf1.r r3 = new vf1.r
            r3.<init>(r10)
            r1.f17273e = r3
            goto L_0x00fe
        L_0x009a:
            java.lang.String r1 = r10.f14273v
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x00da
            java.util.LinkedList<java.lang.String> r1 = r10.f14276y
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 == 0) goto L_0x00da
            com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r1 = new com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            r1.<init>(r5, r4, r3)
            android.content.Intent r3 = r10.getIntent()
            r1.initFromCache(r3)
            android.content.Intent r3 = r10.getIntent()
            r4 = 0
            java.lang.String r6 = "key_active_topic_id"
            long r3 = r3.getLongExtra(r6, r4)
            r1.f13522j = r3
            vf1.s r3 = new vf1.s
            r3.<init>(r10, r1)
            r1.setInitDone(r3)
            vf1.t r3 = new vf1.t
            r3.<init>(r10)
            r1.f13518f = r3
            goto L_0x00fe
        L_0x00da:
            com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader r1 = new com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader
            r5 = 1
            java.lang.String r6 = r10.f14273v
            java.lang.String r7 = r10.f14274w
            java.util.LinkedList<java.lang.String> r8 = r10.f14276y
            r9 = 2
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            android.content.Intent r3 = r10.getIntent()
            r1.initFromCache(r3)
            vf1.u r3 = new vf1.u
            r3.<init>(r10, r1)
            r1.setInitDone(r3)
            vf1.v r3 = new vf1.v
            r3.<init>(r10)
            r1.f13660i = r3
        L_0x00fe:
            r10.f14272u = r1
            kf1.u1 r1 = r10.f14271t
            if (r1 == 0) goto L_0x0134
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI$a r3 = r10.f14269A
            r1.mo17043c(r3)
            r1 = 2131297509(0x7f0904e5, float:1.8212965E38)
            android.view.View r1 = r10.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            android.content.res.Resources r3 = r10.getResources()
            r4 = 2131100932(0x7f060504, float:1.781426E38)
            int r3 = r3.getColor(r4)
            r1.setIconColor(r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            l31.e r0 = r0.mo86178qr(r10, r2)
            o31.a r1 = o31.C76986a.Finder
            r0.mo86179qs(r10, r1)
            return
        L_0x0134:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavTimelineUI.mo2941S7():void");
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_w;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet<T> w0 = C110818d0.m150951w0(super.importUIComponents());
        w0.add(C13466ta.class);
        w0.add(C14078c.class);
        w0.add(C13554z.class);
        w0.add(C63513a1.class);
        return w0;
    }

    public void onDestroy() {
        C9993u1 u1Var = this.f14271t;
        if (u1Var != null) {
            u1Var.getRecyclerView().mo17098m1(this.f14269A);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9993u1 u1Var = this.f14271t;
        if (u1Var != null) {
            C8777j5.C8778a.m8602c(j5Var, u1Var.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9993u1 u1Var = this.f14271t;
        if (u1Var != null) {
            C8777j5.C8778a.m8602c(j5Var, u1Var.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
