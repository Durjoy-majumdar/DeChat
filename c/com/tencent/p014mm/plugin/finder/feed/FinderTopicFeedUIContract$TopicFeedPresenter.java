package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.autogen.events.FinderTagClickEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderTagView;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dm1.C7371o;
import dp1.C58408t0;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kf1.C9914ob;
import kf1.C9965rb;
import ns3.C11264b;
import ns3.C11266d;
import o40.C61926c;
import os1.C11755t;
import p204mr.C11078h;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50862pq3;
import te3.C50985qn1;
import te3.C51270sn1;
import te3.C64311db1;
import te3.C64689rq2;
import te3.C64726td1;
import ve1.C14590p;
import ve1.C14599p3;
import zp3.C16389w;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter */
public final class FinderTopicFeedUIContract$TopicFeedPresenter extends C9732g {

    /* renamed from: A */
    public final C2623x6b06ca5e f13392A;

    /* renamed from: B */
    public C11078h f13393B;

    /* renamed from: C */
    public C16389w f13394C;

    /* renamed from: h */
    public final String f13395h = "Finder.FinderTopicFeedUIContract.TopicFeedPresenter";

    /* renamed from: i */
    public int f13396i;

    /* renamed from: j */
    public long f13397j;

    /* renamed from: n */
    public String f13398n = "";

    /* renamed from: o */
    public int f13399o;

    /* renamed from: p */
    public C51270sn1 f13400p;

    /* renamed from: q */
    public long f13401q;

    /* renamed from: r */
    public C64726td1 f13402r;

    /* renamed from: s */
    public C50985qn1 f13403s;

    /* renamed from: t */
    public int f13404t;

    /* renamed from: u */
    public int f13405u;

    /* renamed from: v */
    public final C9914ob f13406v;

    /* renamed from: w */
    public IListener<FinderTagClickEvent> f13407w;

    /* renamed from: x */
    public IListener<ActivityFeedRemoveEvent> f13408x;

    /* renamed from: y */
    public final C11755t f13409y;

    /* renamed from: z */
    public int f13410z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$b */
    public static final class C2617b extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2617b(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
            super(1);
            this.f13420d = finderTopicFeedUIContract$TopicFeedPresenter;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == -6) {
                return new C14599p3(new C2638e0(this.f13420d));
            }
            C58784w3.f168295a.mo83916b(this.f13420d.f13395h, intValue);
            return new C14590p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$c */
    public static final class C2618c extends C87413o implements C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2618c(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
            super(3);
            this.f13421d = finderTopicFeedUIContract$TopicFeedPresenter;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C60905o oVar = (C60905o) obj;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g((BaseFinderFeed) obj2, "item");
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            C23564m.m28138h(view, new C2640f0(this.f13421d, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$d */
    public static final class C2619d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13422d;

        /* renamed from: e */
        public final /* synthetic */ C9753h f13423e;

        public C2619d(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, C9753h hVar) {
            this.f13422d = finderTopicFeedUIContract$TopicFeedPresenter;
            this.f13423e = hVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f13422d;
            int i3 = finderTopicFeedUIContract$TopicFeedPresenter.f13410z + i2;
            finderTopicFeedUIContract$TopicFeedPresenter.f13410z = i3;
            if (i3 < 0) {
                i3 = 0;
            }
            finderTopicFeedUIContract$TopicFeedPresenter.f13410z = i3;
            float dimensionPixelOffset = ((float) this.f13422d.f13410z) / ((float) finderTopicFeedUIContract$TopicFeedPresenter.f30174d.getResources().getDimensionPixelOffset(C0966R.dimen.f3713c6));
            if (dimensionPixelOffset == 0.0f) {
                C9753h hVar = this.f13423e;
                C87412m.m108592e(hVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                View d1 = ((C9965rb) hVar).mo10466d1();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view = d1;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d1.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9753h hVar2 = this.f13423e;
                C87412m.m108592e(hVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                if (((C9965rb) hVar2).mo10466d1().getVisibility() == 4) {
                    C58408t0.f167336a.mo83261g(true, 6);
                }
                C9753h hVar3 = this.f13423e;
                C87412m.m108592e(hVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                View d15 = ((C9965rb) hVar3).mo10466d1();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = d15;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d15.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C9753h hVar4 = this.f13423e;
            C87412m.m108592e(hVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
            View d16 = ((C9965rb) hVar4).mo10466d1();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(dimensionPixelOffset));
            View view3 = d16;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            d16.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$e */
    public static final class C2620e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2620e(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
            super(0);
            this.f13424d = finderTopicFeedUIContract$TopicFeedPresenter;
        }

        public Object invoke() {
            C9753h hVar = this.f13424d.f30176f;
            C87412m.m108592e(hVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
            C9965rb rbVar = (C9965rb) hVar;
            if (rbVar.f30625A != null) {
                WxRecyclerAdapter<?> D = rbVar.mo10346D();
                View view = rbVar.f30625A;
                C87412m.m108591d(view);
                D.mo85802j6((long) view.hashCode(), true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$f */
    public static final class C2621f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f13425d;

        public C2621f(C32224a<C13598b0> aVar) {
            this.f13425d = aVar;
        }

        public final void run() {
            C32224a<C13598b0> aVar = this.f13425d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicFeedUIContract$TopicFeedPresenter(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
        C51270sn1 sn12 = new C51270sn1();
        FinderTagView.C3978a aVar = FinderTagView.f17945w;
        sn12.f141618e = -1;
        this.f13400p = sn12;
        this.f13406v = new C9914ob((C51270sn1) null, 1, (C8480h) null);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11755t.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…cFeedCacheVM::class.java)");
        this.f13409y = (C11755t) a;
        this.f13392A = new C2623x6b06ca5e(this, C40008f.f107254d);
        this.f13394C = new C2613a(this, mMActivity);
    }

    /* renamed from: G */
    public void mo2514G() {
        C9753h hVar = this.f30176f;
        C7371o oVar = null;
        C9965rb rbVar = hVar instanceof C9965rb ? (C9965rb) hVar : null;
        View view = rbVar != null ? rbVar.f30641w : null;
        if (view instanceof C7371o) {
            oVar = (C7371o) view;
        }
        if (oVar != null) {
            oVar.onResume();
        }
        C11078h hVar2 = this.f13393B;
        if (hVar2 != null) {
            hVar2.mo11215b();
        }
    }

    /* renamed from: N */
    public final String mo2637N() {
        C64689rq2 rq22;
        List<E> listOfType = this.f30175e.getListOfType(BaseFinderFeed.class);
        if (!(!listOfType.isEmpty()) || (rq22 = (C64689rq2) C110818d0.m150917O(((BaseFinderFeed) listOfType.get(0)).mo3513o().getMediaList(), 0)) == null) {
            return "";
        }
        return rq22.f185267e + rq22.f185288z;
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        int i = this.f13396i;
        return i == 7 ? new C2622x61815354(this) : i == 15 ? new FinderTopicFeedUIContract$TopicFeedPresenter$buildMusicConvert$1() : new FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1(this, new C2617b(this), new C2618c(this));
    }

    /* renamed from: e */
    public C16389w mo2638e() {
        return this.f13394C;
    }

    /* renamed from: f0 */
    public final boolean mo2639f0(C51270sn1 sn12) {
        C87412m.m108594g(sn12, "tag");
        long j = sn12.f141618e;
        FinderTagView.C3978a aVar = FinderTagView.f17945w;
        return j == -1;
    }

    /* renamed from: j0 */
    public final void mo2640j0(C32224a<C13598b0> aVar) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C9753h hVar = this.f30176f;
        if (!(hVar == null || (recyclerView2 = hVar.getRecyclerView()) == null)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView2.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        C9753h hVar2 = this.f30176f;
        if (hVar2 != null && (recyclerView = hVar2.getRecyclerView()) != null) {
            recyclerView.post(new C2621f(aVar));
        }
    }

    /* renamed from: n */
    public void mo2519n() {
        C9753h hVar = this.f30176f;
        if (hVar != null) {
            hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
        }
        FinderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1 finderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1 = new FinderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1(this, C40008f.f107254d);
        this.f13407w = finderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1;
        finderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1.alive();
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2641n0(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.String r2 = "reason"
            gy3.C87412m.m108594g(r1, r2)
            E r2 = r1.f24950e
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.TopicResponse"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$f r2 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.C2769f) r2
            boolean r3 = r2.getHasMore()
            r4 = 0
            if (r3 != 0) goto L_0x043a
            int r3 = r0.f13396i
            r5 = 7
            r6 = 2131308010(0x7f092dea, float:1.8234263E38)
            if (r3 != r5) goto L_0x03f7
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r0.f30175e
            int r3 = r3.getSize()
            java.lang.String r5 = r0.f13395h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "setNoMoreForActivity :"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = " response:"
            r8.append(r1)
            long r1 = r2.f13925b
            r8.append(r1)
            java.lang.String r1 = " size:"
            r8.append(r1)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r1 = r0.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
            int r1 = r1.size()
            r8.append(r1)
            java.lang.String r1 = " size11: "
            r8.append(r1)
            r8.append(r3)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            kf1.h r1 = r0.f30176f
            if (r1 == 0) goto L_0x0447
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f30220j
            if (r1 == 0) goto L_0x0447
            android.view.View r1 = r1.getLoadMoreFooter()
            if (r1 == 0) goto L_0x0447
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r5 = r1.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108593f(r5, r8)
            bl3.r$a r2 = r2.mo62443b(r5)
            java.lang.Class<ce1.g> r5 = ce1.C0465g.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r5)
            ce1.g r2 = (ce1.C0465g) r2
            r2.getClass()
            boolean r2 = od1.C11405h.C11406a.m11253a(r2)
            kf1.h r5 = r0.f30176f
            boolean r8 = r5 instanceof kf1.C9965rb
            if (r8 == 0) goto L_0x0097
            kf1.rb r5 = (kf1.C9965rb) r5
            goto L_0x0098
        L_0x0097:
            r5 = r4
        L_0x0098:
            if (r5 == 0) goto L_0x009d
            android.view.View r5 = r5.f30636L
            goto L_0x009e
        L_0x009d:
            r5 = r4
        L_0x009e:
            java.lang.String r8 = r0.f13395h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "setNoMoreForActivity size:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r16 = 8
            r15 = 2131099697(0x7f060031, float:1.7811755E38)
            r14 = 0
            if (r3 <= 0) goto L_0x024b
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r3.mo10233c(r4)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r4 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r8 = r1
            r7 = 0
            r14 = r4
            r4 = 2131099697(0x7f060031, float:1.7811755E38)
            r15 = r17
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r10 = "setNoMoreForActivity"
            java.lang.String r11 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r3 = r1.findViewById(r6)
            if (r3 != 0) goto L_0x010d
            goto L_0x014e
        L_0x010d:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r6.mo10233c(r8)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r21 = "setNoMoreForActivity"
            java.lang.String r22 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r20 = "setNoMoreForActivity"
            java.lang.String r21 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x014e:
            r3 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r3 = r1.findViewById(r3)
            if (r3 != 0) goto L_0x0158
            goto L_0x0198
        L_0x0158:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r8)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r10 = "setNoMoreForActivity"
            java.lang.String r11 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x0198:
            if (r5 != 0) goto L_0x019b
            goto L_0x01db
        L_0x019b:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r3.mo10233c(r6)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r10 = "setNoMoreForActivity"
            java.lang.String r11 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x01db:
            r3 = 2131312503(0x7f093f77, float:1.8243376E38)
            r5 = 2131307234(0x7f092ae2, float:1.823269E38)
            r6 = 2131298939(0x7f090a7b, float:1.8215865E38)
            if (r2 == 0) goto L_0x0217
            android.content.res.Resources r2 = r1.getResources()
            int r2 = r2.getColor(r4)
            android.view.View r4 = r1.findViewById(r6)
            if (r4 != 0) goto L_0x01f5
            goto L_0x0203
        L_0x01f5:
            android.content.res.Resources r6 = r1.getResources()
            r7 = 2131232444(0x7f0806bc, float:1.8080997E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            r4.setBackground(r6)
        L_0x0203:
            android.view.View r4 = r1.findViewById(r5)
            if (r4 == 0) goto L_0x020c
            r4.setBackgroundColor(r2)
        L_0x020c:
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x0447
            r1.setBackgroundColor(r2)
            goto L_0x0447
        L_0x0217:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = r2.getColor(r4)
            android.view.View r4 = r1.findViewById(r6)
            if (r4 != 0) goto L_0x0229
            goto L_0x0237
        L_0x0229:
            android.content.res.Resources r6 = r1.getResources()
            r7 = 2131232446(0x7f0806be, float:1.8081001E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            r4.setBackground(r6)
        L_0x0237:
            android.view.View r4 = r1.findViewById(r5)
            if (r4 == 0) goto L_0x0240
            r4.setBackgroundColor(r2)
        L_0x0240:
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x0447
            r1.setBackgroundColor(r2)
            goto L_0x0447
        L_0x024b:
            r3 = 2131099697(0x7f060031, float:1.7811755E38)
            r7 = 0
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r6.mo10233c(r8)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r10 = "setNoMoreForActivity"
            java.lang.String r11 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            if (r5 != 0) goto L_0x0294
            goto L_0x02d4
        L_0x0294:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r8)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r10 = "setNoMoreForActivity"
            java.lang.String r11 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x02d4:
            r6 = 2131301630(0x7f0914fe, float:1.8221323E38)
            if (r5 == 0) goto L_0x02df
            android.view.View r8 = r5.findViewById(r6)
            r9 = r8
            goto L_0x02e0
        L_0x02df:
            r9 = r4
        L_0x02e0:
            if (r9 != 0) goto L_0x02e3
            goto L_0x0324
        L_0x02e3:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8.mo10233c(r10)
            java.lang.Object[] r19 = r8.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r21 = "setNoMoreForActivity"
            java.lang.String r22 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r9
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r8 = r8.mo10231a(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9.setVisibility(r8)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0324:
            if (r5 == 0) goto L_0x032f
            r8 = 2131312452(0x7f093f44, float:1.8243273E38)
            android.view.View r8 = r5.findViewById(r8)
            r9 = r8
            goto L_0x0330
        L_0x032f:
            r9 = r4
        L_0x0330:
            if (r9 != 0) goto L_0x0333
            goto L_0x0374
        L_0x0333:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            r8.mo10233c(r10)
            java.lang.Object[] r19 = r8.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r21 = "setNoMoreForActivity"
            java.lang.String r22 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r9
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r8 = r8.mo10231a(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9.setVisibility(r8)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0374:
            if (r5 == 0) goto L_0x037d
            r4 = 2131311498(0x7f093b8a, float:1.8241338E38)
            android.view.View r4 = r5.findViewById(r4)
        L_0x037d:
            if (r4 != 0) goto L_0x0380
            goto L_0x03c3
        L_0x0380:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r15.mo10233c(r8)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r11 = "setNoMoreForActivity"
            java.lang.String r12 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r4
            r3 = r15
            r15 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter"
            java.lang.String r10 = "setNoMoreForActivity"
            java.lang.String r11 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x03c3:
            if (r2 == 0) goto L_0x03de
            if (r5 == 0) goto L_0x0447
            android.view.View r2 = r5.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0447
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099697(0x7f060031, float:1.7811755E38)
            int r1 = r1.getColor(r3)
            r2.setTextColor(r1)
            goto L_0x0447
        L_0x03de:
            if (r5 == 0) goto L_0x0447
            android.view.View r2 = r5.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0447
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r3)
            r2.setTextColor(r1)
            goto L_0x0447
        L_0x03f7:
            kf1.h r1 = r0.f30176f
            if (r1 == 0) goto L_0x0413
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f30220j
            if (r1 == 0) goto L_0x0413
            android.view.View r1 = r1.getLoadMoreFooter()
            if (r1 == 0) goto L_0x0413
            android.view.View r1 = r1.findViewById(r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0413
            r2 = 2131829092(0x7f112164, float:1.9291143E38)
            r1.setText(r2)
        L_0x0413:
            kf1.h r1 = r0.f30176f
            if (r1 == 0) goto L_0x0447
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f30220j
            if (r1 == 0) goto L_0x0447
            android.view.View r1 = r1.getLoadMoreFooter()
            if (r1 == 0) goto L_0x0447
            android.view.View r1 = r1.findViewById(r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0447
            com.tencent.mm.ui.MMActivity r2 = r0.f30174d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            goto L_0x0447
        L_0x043a:
            kf1.h r1 = r0.f30176f
            if (r1 == 0) goto L_0x0440
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r1.f30220j
        L_0x0440:
            if (r4 != 0) goto L_0x0443
            goto L_0x0447
        L_0x0443:
            r1 = 1
            r4.setEnableLoadMore(r1)
        L_0x0447:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter.mo2641n0(com.tencent.mm.view.RefreshLoadMoreLayout$c):void");
    }

    /* renamed from: o */
    public void mo2521o() {
        if (mo2639f0(this.f13400p)) {
            BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
            int i = this.f13399o;
            int i2 = FinderTopicFeedLoader.f13893z;
            ((FinderTopicFeedLoader) baseFinderFeedLoader).mo2813f(i, (C50862pq3) null);
            return;
        }
        C50862pq3 pq32 = new C50862pq3();
        LinkedList<C51270sn1> linkedList = new LinkedList<>();
        pq32.f139904d = linkedList;
        linkedList.add(this.f13400p);
        BaseFinderFeedLoader baseFinderFeedLoader2 = this.f30175e;
        C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((FinderTopicFeedLoader) baseFinderFeedLoader2).mo2813f(this.f13399o, pq32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0121, code lost:
        if (r2 == null) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetach() {
        /*
            r14 = this;
            super.onDetach()
            os1.t r0 = r14.f13409y
            java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r0 = r0.f34412e
            if (r0 == 0) goto L_0x000c
            r0.clear()
        L_0x000c:
            kf1.h r0 = r14.f30176f
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback"
            gy3.C87412m.m108592e(r0, r1)
            kf1.rb r0 = (kf1.C9965rb) r0
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            com.tencent.mm.ui.MMActivity r2 = r0.f30214d
            com.tencent.mm.plugin.finder.view.FinderTagView$a r3 = com.tencent.p014mm.plugin.finder.view.FinderTagView.f17945w
            r3.mo4748a()
            r4 = 2131302901(0x7f0919f5, float:1.8223901E38)
            android.view.View r2 = r2.findViewById(r4)
            com.tencent.mm.plugin.finder.view.FinderTagView r2 = (com.tencent.p014mm.plugin.finder.view.FinderTagView) r2
            if (r2 != 0) goto L_0x0036
            androidx.recyclerview.widget.RecyclerView r2 = r0.getRecyclerView()
            r3.mo4748a()
            android.view.View r2 = r2.findViewById(r4)
            com.tencent.mm.plugin.finder.view.FinderTagView r2 = (com.tencent.p014mm.plugin.finder.view.FinderTagView) r2
        L_0x0036:
            android.view.View r3 = r0.f30641w
            boolean r4 = r3 instanceof dm1.C7371o
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.IFinderFollowTopicHeaderView"
            gy3.C87412m.m108592e(r3, r4)
            dm1.o r3 = (dm1.C7371o) r3
            r3.mo8541k()
        L_0x0046:
            if (r2 == 0) goto L_0x0123
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r4 = r0.f30214d
            rs1.s8 r3 = r3.mo12873f(r4)
            if (r3 == 0) goto L_0x0120
            te3.hj1 r5 = r3.mo12861q3()
            java.lang.String r3 = ""
            int r4 = r2.f17957r
            r6 = 35
            java.lang.String r7 = ";1;"
            r8 = 0
            r9 = 1
            if (r4 != r9) goto L_0x00b2
            te3.pq3 r4 = r2.getTagData()
            java.util.LinkedList<te3.sn1> r4 = r4.f139904d
            int r4 = r4.size()
            r9 = 0
        L_0x006d:
            if (r9 >= r4) goto L_0x010a
            te3.pq3 r10 = r2.getTagData()
            java.util.LinkedList<te3.sn1> r10 = r10.f139904d
            java.lang.Object r10 = r10.get(r9)
            te3.sn1 r10 = (te3.C51270sn1) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r3 = r10.f141617d
            r11.append(r3)
            r11.append(r7)
            java.util.HashMap r3 = r2.getTagClickMap()
            long r12 = r10.f141618e
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            java.lang.Object r3 = r3.get(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x00a1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
        L_0x00a1:
            int r3 = r3.intValue()
            r11.append(r3)
            r11.append(r6)
            java.lang.String r3 = r11.toString()
            int r9 = r9 + 1
            goto L_0x006d
        L_0x00b2:
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout r4 = r2.getTagLayout()
            java.util.List<java.util.List<android.view.View>> r4 = r4.f162129d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            r9 = 0
        L_0x00c5:
            if (r9 >= r4) goto L_0x010a
            te3.pq3 r10 = r2.getTagData()
            java.util.LinkedList<te3.sn1> r10 = r10.f139904d
            java.lang.Object r10 = r10.get(r9)
            te3.sn1 r10 = (te3.C51270sn1) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r3 = r10.f141617d
            r11.append(r3)
            r11.append(r7)
            java.util.HashMap r3 = r2.getTagClickMap()
            long r12 = r10.f141618e
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            java.lang.Object r3 = r3.get(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x00f9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
        L_0x00f9:
            int r3 = r3.intValue()
            r11.append(r3)
            r11.append(r6)
            java.lang.String r3 = r11.toString()
            int r9 = r9 + 1
            goto L_0x00c5
        L_0x010a:
            r7 = r3
            di3.d r3 = di3.C86312j.m106911c(r1)
            r4 = r3
            dp1.y0 r4 = (dp1.C58417y0) r4
            java.lang.String r6 = r0.f30629E
            int r8 = r2.getHasExpandBtn()
            int r9 = r2.f17957r
            r4.Ry0(r5, r6, r7, r8, r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            if (r2 != 0) goto L_0x0143
        L_0x0123:
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r3 = r0.f30214d
            rs1.s8 r2 = r2.mo12873f(r3)
            if (r2 == 0) goto L_0x0143
            te3.hj1 r4 = r2.mo12861q3()
            di3.d r1 = di3.C86312j.m106911c(r1)
            r3 = r1
            dp1.y0 r3 = (dp1.C58417y0) r3
            java.lang.String r5 = r0.f30629E
            r7 = 0
            r8 = 0
            java.lang.String r6 = ""
            r3.Ry0(r4, r5, r6, r7, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0143:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent> r0 = r14.f13408x
            if (r0 == 0) goto L_0x014a
            r0.dead()
        L_0x014a:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTagClickEvent> r0 = r14.f13407w
            if (r0 == 0) goto L_0x0151
            r0.dead()
        L_0x0151:
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$feedProgressListener$1 r0 = r14.f13392A
            r0.dead()
            mr.h r0 = r14.f13393B
            if (r0 == 0) goto L_0x015d
            r0.detach()
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter.onDetach():void");
    }

    public void requestRefresh() {
        if (mo2639f0(this.f13400p)) {
            BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
            int i = this.f13399o;
            int i2 = FinderTopicFeedLoader.f13893z;
            ((FinderTopicFeedLoader) baseFinderFeedLoader).mo2814g(i, (C50862pq3) null, -1);
            return;
        }
        C50862pq3 pq32 = new C50862pq3();
        LinkedList<C51270sn1> linkedList = new LinkedList<>();
        pq32.f139904d = linkedList;
        linkedList.add(this.f13400p);
        BaseFinderFeedLoader baseFinderFeedLoader2 = this.f30175e;
        C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((FinderTopicFeedLoader) baseFinderFeedLoader2).mo2814g(this.f13399o, pq32, 4);
    }

    /* renamed from: t */
    public void mo2525t(C9753h hVar) {
        RecyclerView recyclerView;
        Class cls = C11266d.class;
        C87412m.m108594g(hVar, "callback");
        super.mo2525t(hVar);
        this.f13392A.alive();
        C9753h hVar2 = this.f30176f;
        if (hVar2 != null) {
            byte[] byteArrayExtra = hVar2.getActivity().getIntent().getByteArrayExtra("key_topic_poi_location");
            if (byteArrayExtra != null) {
                C64311db1 db12 = new C64311db1();
                db12.parseFrom(byteArrayExtra);
                BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
                C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                ((FinderTopicFeedLoader) baseFinderFeedLoader).f13899i = db12;
            }
            long longExtra = hVar2.getActivity().getIntent().getLongExtra("key_ref_object_id", 0);
            if (this.f13396i != 7) {
                BaseFinderFeedLoader baseFinderFeedLoader2 = this.f30175e;
                C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                ((FinderTopicFeedLoader) baseFinderFeedLoader2).f13900j = Long.valueOf(longExtra);
            }
            if (this.f13396i == 4) {
                hVar2.f30220j.getRecyclerView().mo17043c(new C2619d(this, hVar2));
            }
            if (this.f13396i == 7) {
                FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3 finderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3 = new FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3(this, C40008f.f107254d);
                this.f13408x = finderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3;
                finderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3.alive();
            }
        }
        BaseFinderFeedLoader baseFinderFeedLoader3 = this.f30175e;
        C87412m.m108592e(baseFinderFeedLoader3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((FinderTopicFeedLoader) baseFinderFeedLoader3).f13912y = new C2620e(this);
        C9753h hVar3 = this.f30176f;
        if (!(hVar3 == null || (recyclerView = hVar3.getRecyclerView()) == null)) {
            ((C11264b) C39818r.f106831a.mo62446e(cls).mo62447c(C11264b.class)).mo11321n2(this.f30174d);
            C9753h hVar4 = this.f30176f;
            if (hVar4 instanceof C9965rb) {
                C9965rb rbVar = (C9965rb) hVar4;
            }
            MMActivity mMActivity = this.f30174d;
            DataBuffer dataListJustForAdapter = this.f30175e.getDataListJustForAdapter();
            C9753h hVar5 = this.f30176f;
            C87412m.m108591d(hVar5);
            C11078h ft = ((C11266d) C86312j.m106911c(cls)).mo9193ft(mMActivity, recyclerView, dataListJustForAdapter, hVar5.mo10346D());
            this.f13393B = ft;
            if (ft != null) {
                ft.mo11219e();
            }
        }
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    /* renamed from: x */
    public void mo2526x() {
        C11078h hVar = this.f13393B;
        if (hVar != null) {
            hVar.mo11214a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$a */
    public static final class C2613a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13411d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f13412e;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$a$a */
        public static final class C2614a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13413d;

            /* renamed from: e */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13414e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2614a(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f13413d = finderTopicFeedUIContract$TopicFeedPresenter;
                this.f13414e = cVar;
            }

            public Object invoke() {
                this.f13413d.mo2641n0(this.f13414e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$a$b */
        public static final class C2615b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13415d;

            /* renamed from: e */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13416e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2615b(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f13415d = finderTopicFeedUIContract$TopicFeedPresenter;
                this.f13416e = cVar;
            }

            public Object invoke() {
                this.f13415d.mo2641n0(this.f13416e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$a$c */
        public static final class C2616c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13417d;

            /* renamed from: e */
            public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13418e;

            /* renamed from: f */
            public final /* synthetic */ MMActivity f13419f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2616c(RefreshLoadMoreLayout.C7080c<Object> cVar, FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, MMActivity mMActivity) {
                super(0);
                this.f13417d = cVar;
                this.f13418e = finderTopicFeedUIContract$TopicFeedPresenter;
                this.f13419f = mMActivity;
            }

            /* JADX WARNING: type inference failed for: r7v18, types: [android.view.View] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r28 = this;
                    r0 = r28
                    com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r1 = r0.f13417d
                    E r1 = r1.f24950e
                    java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.TopicResponse"
                    gy3.C87412m.m108592e(r1, r2)
                    com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$f r1 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.C2769f) r1
                    com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r2 = r0.f13417d
                    int r3 = r2.f24947b
                    r4 = -1
                    if (r3 == r4) goto L_0x0572
                    int r2 = r2.f24946a
                    r3 = 3
                    java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback"
                    r6 = 0
                    if (r2 != r3) goto L_0x0566
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r2 = r0.f13418e
                    java.lang.String r2 = r2.f13395h
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r7 = "refresh incrementCount "
                    r3.append(r7)
                    java.util.List r7 = r1.getIncrementList()
                    r8 = 0
                    if (r7 == 0) goto L_0x003a
                    int r7 = r7.size()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L_0x003b
                L_0x003a:
                    r7 = r8
                L_0x003b:
                    r3.append(r7)
                    java.lang.String r7 = ", totalCount "
                    r3.append(r7)
                    long r9 = r1.f13925b
                    r3.append(r9)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r2 = r0.f13418e
                    long r9 = r1.f13925b
                    r2.f13401q = r9
                    te3.td1 r3 = r1.f13929f
                    r2.f13402r = r3
                    te3.qn1 r3 = r1.getBgmInfo()
                    r2.f13403s = r3
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r2 = r0.f13418e
                    int r3 = r1.f13930g
                    r2.f13404t = r3
                    int r3 = r1.f13931h
                    r2.f13405u = r3
                    long r9 = r2.f13397j
                    r11 = 0
                    int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r3 != 0) goto L_0x0079
                    te3.sn1 r3 = r1.f13924a
                    if (r3 == 0) goto L_0x0077
                    long r9 = r3.f141618e
                L_0x0077:
                    r2.f13397j = r9
                L_0x0079:
                    kf1.h r2 = r2.f30176f
                    gy3.C87412m.m108592e(r2, r5)
                    kf1.rb r2 = (kf1.C9965rb) r2
                    te3.pq3 r3 = r1.f13926c
                    r7 = 2
                    if (r3 == 0) goto L_0x00b2
                    java.util.LinkedList<te3.sn1> r9 = r3.f139904d
                    boolean r9 = r9.isEmpty()
                    if (r9 == 0) goto L_0x008e
                    goto L_0x00b2
                L_0x008e:
                    cm1.j r9 = r2.f30635K
                    r9.getClass()
                    r9.f1762d = r3
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter r13 = r2.mo10346D()
                    cm1.j r3 = r2.f30635K
                    int r3 = r3.hashCode()
                    long r14 = (long) r3
                    r16 = 0
                    r17 = 2
                    r18 = 0
                    jq3.C60898l.m71332k6(r13, r14, r16, r17, r18)
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = r2.mo10346D()
                    cm1.j r2 = r2.f30635K
                    jq3.C60898l.m71328U5(r3, r2, r6, r7, r8)
                L_0x00b2:
                    rs1.s8$a r2 = rs1.C13442s8.f38060Q0
                    com.tencent.mm.ui.MMActivity r3 = r0.f13419f
                    rs1.s8 r2 = r2.mo12873f(r3)
                    if (r2 == 0) goto L_0x00f4
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r3 = r0.f13418e
                    org.json.JSONObject r9 = new org.json.JSONObject
                    r9.<init>()
                    java.lang.String r10 = "topic"
                    java.lang.String r13 = r3.f13398n     // Catch:{ Exception -> 0x00db }
                    r9.put(r10, r13)     // Catch:{ Exception -> 0x00db }
                    java.lang.String r10 = "type"
                    int r13 = r3.f13396i     // Catch:{ Exception -> 0x00db }
                    r9.put(r10, r13)     // Catch:{ Exception -> 0x00db }
                    java.lang.String r10 = "count"
                    long r13 = r3.f13401q     // Catch:{ Exception -> 0x00db }
                    r9.put(r10, r13)     // Catch:{ Exception -> 0x00db }
                    goto L_0x00dc
                L_0x00db:
                L_0x00dc:
                    java.lang.String r3 = r9.toString()
                    java.lang.String r9 = "obj.toString()"
                    gy3.C87412m.m108593f(r3, r9)
                    r2.f38106u = r3
                    dp1.t r3 = r2.mo12855k3(r4)
                    if (r3 == 0) goto L_0x00f4
                    te3.hj1 r2 = r2.mo12861q3()
                    r3.mo83246K1(r2)
                L_0x00f4:
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r2 = r0.f13418e
                    kf1.h r2 = r2.f30176f
                    gy3.C87412m.m108592e(r2, r5)
                    kf1.rb r2 = (kf1.C9965rb) r2
                    java.lang.String r3 = r1.f13927d
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r4 = r0.f13418e
                    long r4 = r4.f13401q
                    te3.sn1 r9 = r1.f13924a
                    int r10 = r1.getErrCode()
                    java.lang.String r1 = r1.getErrMsg()
                    r2.f30631G = r9
                    long r13 = r2.f30632H
                    int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                    if (r15 != 0) goto L_0x011b
                    if (r9 == 0) goto L_0x0119
                    long r13 = r9.f141618e
                L_0x0119:
                    r2.f30632H = r13
                L_0x011b:
                    int r13 = r2.f30627C
                    r14 = 2131315542(0x7f094b56, float:1.824954E38)
                    r15 = 1
                    r8 = 4
                    if (r13 != r8) goto L_0x0369
                    kf1.g r13 = r2.mo10348I0()
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r13 = (com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter) r13
                    int r8 = r13.f13404t
                    r8 = r8 & r7
                    r7 = 2131300462(0x7f09106e, float:1.8218954E38)
                    if (r8 == r15) goto L_0x01f9
                    int r8 = r13.f13405u
                    if (r8 <= 0) goto L_0x0138
                    goto L_0x01f9
                L_0x0138:
                    com.tencent.mm.ui.MMActivity r8 = r2.f30214d
                    android.view.View r7 = r8.findViewById(r7)
                    if (r7 != 0) goto L_0x0141
                    goto L_0x0182
                L_0x0141:
                    k20.a r8 = new k20.a
                    r8.<init>()
                    java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
                    r8.mo10233c(r13)
                    java.lang.Object[] r21 = r8.mo10232b()
                    java.lang.String r22 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r23 = "refreshHeaderContent"
                    java.lang.String r24 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r25 = "android/view/View_EXEC_"
                    java.lang.String r26 = "setVisibility"
                    java.lang.String r27 = "(I)V"
                    r20 = r7
                    j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
                    java.lang.Object r8 = r8.mo10231a(r6)
                    java.lang.Integer r8 = (java.lang.Integer) r8
                    int r8 = r8.intValue()
                    r7.setVisibility(r8)
                    java.lang.String r21 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r22 = "refreshHeaderContent"
                    java.lang.String r23 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r24 = "android/view/View_EXEC_"
                    java.lang.String r25 = "setVisibility"
                    java.lang.String r26 = "(I)V"
                    j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
                L_0x0182:
                    android.view.View r7 = r2.f30641w
                    if (r7 == 0) goto L_0x018d
                    android.view.View r7 = r7.findViewById(r14)
                    android.widget.TextView r7 = (android.widget.TextView) r7
                    goto L_0x018e
                L_0x018d:
                    r7 = 0
                L_0x018e:
                    kf1.g r8 = r2.mo10348I0()
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r8 = (com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter) r8
                    te3.qn1 r8 = r8.f13403s
                    if (r8 == 0) goto L_0x019b
                    te3.td1 r8 = r8.f140408e
                    goto L_0x019c
                L_0x019b:
                    r8 = 0
                L_0x019c:
                    if (r8 != 0) goto L_0x01ba
                    if (r7 != 0) goto L_0x01a1
                    goto L_0x01d5
                L_0x01a1:
                    com.tencent.mm.ui.MMActivity r8 = r2.f30214d
                    android.content.res.Resources r8 = r8.getResources()
                    r13 = 2131826675(0x7f1117f3, float:1.9286241E38)
                    java.lang.Object[] r14 = new java.lang.Object[r15]
                    java.lang.String r20 = er1.C7878t0.m8035d(r4)
                    r14[r6] = r20
                    java.lang.String r8 = r8.getString(r13, r14)
                    r7.setText(r8)
                    goto L_0x01d5
                L_0x01ba:
                    if (r7 != 0) goto L_0x01bd
                    goto L_0x01d5
                L_0x01bd:
                    com.tencent.mm.ui.MMActivity r8 = r2.f30214d
                    android.content.res.Resources r8 = r8.getResources()
                    r13 = 2131826687(0x7f1117ff, float:1.9286265E38)
                    java.lang.Object[] r14 = new java.lang.Object[r15]
                    java.lang.String r20 = er1.C7878t0.m8035d(r4)
                    r14[r6] = r20
                    java.lang.String r8 = r8.getString(r13, r14)
                    r7.setText(r8)
                L_0x01d5:
                    int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                    if (r8 != 0) goto L_0x0397
                    if (r7 != 0) goto L_0x01dc
                    goto L_0x01e0
                L_0x01dc:
                    r4 = 4
                    r7.setVisibility(r4)
                L_0x01e0:
                    android.view.View r4 = r2.f30641w
                    if (r4 == 0) goto L_0x01ef
                    r5 = 2131302318(0x7f0917ae, float:1.8222719E38)
                    android.view.View r4 = r4.findViewById(r5)
                    r8 = r4
                    android.widget.TextView r8 = (android.widget.TextView) r8
                    goto L_0x01f0
                L_0x01ef:
                    r8 = 0
                L_0x01f0:
                    if (r8 != 0) goto L_0x01f4
                    goto L_0x0397
                L_0x01f4:
                    r8.setVisibility(r6)
                    goto L_0x0397
                L_0x01f9:
                    java.lang.String r1 = r2.f30640v
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = " musicInfo = "
                    r3.append(r4)
                    r8 = 0
                    r3.append(r8)
                    java.lang.String r4 = " ,bgmInfo?.contact = "
                    r3.append(r4)
                    te3.qn1 r4 = r13.f13403s
                    if (r4 == 0) goto L_0x0215
                    com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f140407d
                    goto L_0x0216
                L_0x0215:
                    r4 = r8
                L_0x0216:
                    r3.append(r4)
                    java.lang.String r4 = ", totalCount = "
                    r3.append(r4)
                    long r4 = r13.f13401q
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                    java.lang.String r1 = r2.f30640v
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Type_Follow , falg = "
                    r3.append(r4)
                    kf1.g r4 = r2.mo10348I0()
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r4 = (com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter) r4
                    int r4 = r4.f13404t
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                    com.tencent.mm.ui.MMActivity r1 = r2.f30214d
                    r3 = 2131315332(0x7f094a84, float:1.8249114E38)
                    android.view.View r9 = r1.findViewById(r3)
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                    r1.mo10233c(r3)
                    java.lang.Object[] r18 = r1.mo10232b()
                    java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r20 = "refreshHeaderContent"
                    java.lang.String r21 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r22 = "android/view/View_EXEC_"
                    java.lang.String r23 = "setVisibility"
                    java.lang.String r24 = "(I)V"
                    r17 = r9
                    j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                    java.lang.Object r1 = r1.mo10231a(r6)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r9.setVisibility(r1)
                    java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r11 = "refreshHeaderContent"
                    java.lang.String r12 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r13 = "android/view/View_EXEC_"
                    java.lang.String r14 = "setVisibility"
                    java.lang.String r15 = "(I)V"
                    j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                    com.tencent.mm.ui.MMActivity r1 = r2.f30214d
                    r3 = 2131312597(0x7f093fd5, float:1.8243567E38)
                    android.view.View r9 = r1.findViewById(r3)
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                    r1.mo10233c(r3)
                    java.lang.Object[] r18 = r1.mo10232b()
                    java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r20 = "refreshHeaderContent"
                    java.lang.String r21 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r22 = "android/view/View_EXEC_"
                    java.lang.String r23 = "setVisibility"
                    java.lang.String r24 = "(I)V"
                    r17 = r9
                    j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                    java.lang.Object r1 = r1.mo10231a(r6)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r9.setVisibility(r1)
                    java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r11 = "refreshHeaderContent"
                    java.lang.String r12 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r13 = "android/view/View_EXEC_"
                    java.lang.String r14 = "setVisibility"
                    java.lang.String r15 = "(I)V"
                    j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                    com.tencent.mm.ui.MMActivity r1 = r2.f30214d
                    android.view.View r9 = r1.findViewById(r7)
                    if (r9 != 0) goto L_0x02e3
                    goto L_0x0324
                L_0x02e3:
                    k20.a r1 = new k20.a
                    r1.<init>()
                    r3 = 8
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r1.mo10233c(r3)
                    java.lang.Object[] r18 = r1.mo10232b()
                    java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r20 = "refreshHeaderContent"
                    java.lang.String r21 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r22 = "android/view/View_EXEC_"
                    java.lang.String r23 = "setVisibility"
                    java.lang.String r24 = "(I)V"
                    r17 = r9
                    j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                    java.lang.Object r1 = r1.mo10231a(r6)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r9.setVisibility(r1)
                    java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r11 = "refreshHeaderContent"
                    java.lang.String r12 = "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V"
                    java.lang.String r13 = "android/view/View_EXEC_"
                    java.lang.String r14 = "setVisibility"
                    java.lang.String r15 = "(I)V"
                    j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                L_0x0324:
                    kf1.g r1 = r2.mo10348I0()
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r1 = (com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter) r1
                    te3.qn1 r1 = r1.f13403s
                    if (r1 == 0) goto L_0x0330
                    te3.td1 r8 = r1.f140408e
                L_0x0330:
                    r1 = 2131300809(0x7f0911c9, float:1.8219658E38)
                    if (r8 != 0) goto L_0x034f
                    com.tencent.mm.ui.MMActivity r3 = r2.f30214d
                    android.view.View r1 = r3.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    com.tencent.mm.ui.MMActivity r2 = r2.f30214d
                    android.content.res.Resources r2 = r2.getResources()
                    r3 = 2131826202(0x7f11161a, float:1.9285282E38)
                    java.lang.String r2 = r2.getString(r3)
                    r1.setText(r2)
                    goto L_0x0572
                L_0x034f:
                    com.tencent.mm.ui.MMActivity r3 = r2.f30214d
                    android.view.View r1 = r3.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    com.tencent.mm.ui.MMActivity r2 = r2.f30214d
                    android.content.res.Resources r2 = r2.getResources()
                    r3 = 2131829246(0x7f1121fe, float:1.9291456E38)
                    java.lang.String r2 = r2.getString(r3)
                    r1.setText(r2)
                    goto L_0x0572
                L_0x0369:
                    r8 = 0
                    android.view.View r7 = r2.f30641w
                    if (r7 == 0) goto L_0x0375
                    android.view.View r7 = r7.findViewById(r14)
                    r8 = r7
                    android.widget.TextView r8 = (android.widget.TextView) r8
                L_0x0375:
                    if (r8 != 0) goto L_0x0378
                    goto L_0x0390
                L_0x0378:
                    com.tencent.mm.ui.MMActivity r7 = r2.f30214d
                    android.content.res.Resources r7 = r7.getResources()
                    r11 = 2131830038(0x7f112516, float:1.9293062E38)
                    java.lang.Object[] r12 = new java.lang.Object[r15]
                    java.lang.String r4 = er1.C7878t0.m8035d(r4)
                    r12[r6] = r4
                    java.lang.String r4 = r7.getString(r11, r12)
                    r8.setText(r4)
                L_0x0390:
                    kf1.pb r4 = r2.f30639u
                    if (r4 == 0) goto L_0x0397
                    r4.mo3127o3(r9)
                L_0x0397:
                    int r4 = r2.f30627C
                    r5 = 7
                    if (r4 != r5) goto L_0x03c6
                    int r5 = r2.f30633I
                    r7 = 2
                    if (r5 > r7) goto L_0x03c6
                    kf1.g r4 = r2.mo10348I0()
                    boolean r4 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter
                    if (r4 == 0) goto L_0x03b3
                    kf1.g r4 = r2.mo10348I0()
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r4 = (com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter) r4
                    kf1.ob r4 = r4.f13406v
                    r4.f30538a = r9
                L_0x03b3:
                    com.tencent.mm.autogen.events.FinderTopicEvent r4 = new com.tencent.mm.autogen.events.FinderTopicEvent
                    r4.<init>()
                    com.tencent.mm.autogen.events.FinderTopicEvent$a r5 = r4.f9258d
                    int r7 = r2.f30627C
                    r5.f9259a = r7
                    r5.f9260b = r10
                    r5.f9261c = r1
                    r4.publish()
                    goto L_0x03dc
                L_0x03c6:
                    r5 = 15
                    if (r4 != r5) goto L_0x03dc
                    com.tencent.mm.autogen.events.FinderTopicEvent r4 = new com.tencent.mm.autogen.events.FinderTopicEvent
                    r4.<init>()
                    com.tencent.mm.autogen.events.FinderTopicEvent$a r5 = r4.f9258d
                    int r7 = r2.f30627C
                    r5.f9259a = r7
                    r5.f9260b = r10
                    r5.f9261c = r1
                    r4.publish()
                L_0x03dc:
                    int r1 = r2.f30627C
                    r4 = 5
                    if (r1 != r4) goto L_0x03e3
                    r4 = 1
                    goto L_0x03e4
                L_0x03e3:
                    r4 = 0
                L_0x03e4:
                    if (r4 == 0) goto L_0x03ef
                    kf1.j6 r1 = r2.f30642x
                    if (r1 == 0) goto L_0x0572
                    r1.mo10389a(r9)
                    goto L_0x0572
                L_0x03ef:
                    android.view.View r4 = r2.f30641w
                    if (r4 == 0) goto L_0x0572
                    r5 = 2
                    if (r1 == r5) goto L_0x0405
                    r5 = 4
                    if (r1 == r5) goto L_0x03fb
                    goto L_0x0572
                L_0x03fb:
                    kf1.tb r1 = new kf1.tb
                    r1.<init>(r2, r4)
                    r4.post(r1)
                    goto L_0x0572
                L_0x0405:
                    if (r3 == 0) goto L_0x0572
                    int r1 = r3.length()
                    if (r1 <= 0) goto L_0x040e
                    goto L_0x040f
                L_0x040e:
                    r15 = 0
                L_0x040f:
                    r1 = 2131315546(0x7f094b5a, float:1.8249548E38)
                    if (r15 == 0) goto L_0x051f
                    r5 = 2131315547(0x7f094b5b, float:1.824955E38)
                    android.view.View r5 = r4.findViewById(r5)
                    android.widget.TextView r5 = (android.widget.TextView) r5
                    r5.setText(r3)
                    android.view.View r3 = r4.findViewById(r1)
                    k20.a r5 = new k20.a
                    r5.<init>()
                    java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                    r5.mo10233c(r7)
                    java.lang.Object[] r8 = r5.mo10232b()
                    java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r10 = "refreshHeader"
                    java.lang.String r11 = "(Ljava/lang/String;)V"
                    java.lang.String r12 = "android/view/View_EXEC_"
                    java.lang.String r13 = "setVisibility"
                    java.lang.String r14 = "(I)V"
                    r7 = r3
                    j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                    java.lang.Object r5 = r5.mo10231a(r6)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    int r5 = r5.intValue()
                    r3.setVisibility(r5)
                    java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r9 = "refreshHeader"
                    java.lang.String r10 = "(Ljava/lang/String;)V"
                    java.lang.String r11 = "android/view/View_EXEC_"
                    java.lang.String r12 = "setVisibility"
                    java.lang.String r13 = "(I)V"
                    j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                    com.tencent.mm.ui.MMActivity r2 = r2.f30214d
                    android.content.Intent r2 = r2.getIntent()
                    java.lang.String r3 = "key_topic_poi_location"
                    byte[] r2 = r2.getByteArrayExtra(r3)
                    if (r2 == 0) goto L_0x0572
                    te3.db1 r3 = new te3.db1
                    r3.<init>()
                    r3.parseFrom(r2)
                    java.lang.String r2 = r3.f182664g
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    if (r2 == 0) goto L_0x04d0
                    java.lang.String r2 = r3.f182663f
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    if (r2 != 0) goto L_0x04d0
                    android.view.View r1 = r4.findViewById(r1)
                    k20.a r2 = new k20.a
                    r2.<init>()
                    r3 = 8
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2.mo10233c(r3)
                    java.lang.Object[] r8 = r2.mo10232b()
                    java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r10 = "refreshHeader"
                    java.lang.String r11 = "(Ljava/lang/String;)V"
                    java.lang.String r12 = "android/view/View_EXEC_"
                    java.lang.String r13 = "setVisibility"
                    java.lang.String r14 = "(I)V"
                    r7 = r1
                    j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                    java.lang.Object r2 = r2.mo10231a(r6)
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    r1.setVisibility(r2)
                    java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r9 = "refreshHeader"
                    java.lang.String r10 = "(Ljava/lang/String;)V"
                    java.lang.String r11 = "android/view/View_EXEC_"
                    java.lang.String r12 = "setVisibility"
                    java.lang.String r13 = "(I)V"
                    j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                    goto L_0x0572
                L_0x04d0:
                    android.view.View r2 = r4.findViewById(r1)
                    k20.a r5 = new k20.a
                    r5.<init>()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                    r5.mo10233c(r7)
                    java.lang.Object[] r15 = r5.mo10232b()
                    java.lang.String r16 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r17 = "refreshHeader"
                    java.lang.String r18 = "(Ljava/lang/String;)V"
                    java.lang.String r19 = "android/view/View_EXEC_"
                    java.lang.String r20 = "setVisibility"
                    java.lang.String r21 = "(I)V"
                    r14 = r2
                    j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
                    java.lang.Object r5 = r5.mo10231a(r6)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    int r5 = r5.intValue()
                    r2.setVisibility(r5)
                    java.lang.String r15 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r16 = "refreshHeader"
                    java.lang.String r17 = "(Ljava/lang/String;)V"
                    java.lang.String r18 = "android/view/View_EXEC_"
                    java.lang.String r19 = "setVisibility"
                    java.lang.String r20 = "(I)V"
                    j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
                    android.view.View r1 = r4.findViewById(r1)
                    kf1.sb r2 = new kf1.sb
                    r2.<init>(r4, r3)
                    r1.setOnClickListener(r2)
                    goto L_0x0572
                L_0x051f:
                    android.view.View r5 = r4.findViewById(r1)
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                    r2 = 8
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r1.mo10233c(r2)
                    java.lang.Object[] r8 = r1.mo10232b()
                    java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r10 = "refreshHeader"
                    java.lang.String r11 = "(Ljava/lang/String;)V"
                    java.lang.String r12 = "android/view/View_EXEC_"
                    java.lang.String r13 = "setVisibility"
                    java.lang.String r14 = "(I)V"
                    r7 = r5
                    j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                    java.lang.Object r1 = r1.mo10231a(r6)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r5.setVisibility(r1)
                    java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback"
                    java.lang.String r7 = "refreshHeader"
                    java.lang.String r8 = "(Ljava/lang/String;)V"
                    java.lang.String r9 = "android/view/View_EXEC_"
                    java.lang.String r10 = "setVisibility"
                    java.lang.String r11 = "(I)V"
                    j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                    goto L_0x0572
                L_0x0566:
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r1 = r0.f13418e
                    kf1.h r1 = r1.f30176f
                    gy3.C87412m.m108592e(r1, r5)
                    kf1.rb r1 = (kf1.C9965rb) r1
                    r1.mo10468f1(r6)
                L_0x0572:
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r1 = r0.f13418e
                    kf1.h r1 = r1.f30176f
                    if (r1 == 0) goto L_0x0581
                    com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f30220j
                    if (r1 == 0) goto L_0x0581
                    com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r2 = r0.f13417d
                    r1.onPreFinishRefresh(r2)
                L_0x0581:
                    com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r1 = r0.f13418e
                    com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r2 = r0.f13417d
                    r1.mo2641n0(r2)
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter.C2613a.C2616c.invoke():java.lang.Object");
            }
        }

        public C2613a(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, MMActivity mMActivity) {
            this.f13411d = finderTopicFeedUIContract$TopicFeedPresenter;
            this.f13412e = mMActivity;
        }

        public void onChanged() {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            String str = this.f13411d.f13395h;
            StringBuilder sb = new StringBuilder();
            sb.append("onChanged ");
            C9753h hVar = this.f13411d.f30176f;
            Integer num = null;
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = hVar != null ? hVar.f30220j : null;
            if (!(refreshLoadMoreLayout2 instanceof RefreshLoadMoreLayout)) {
                refreshLoadMoreLayout2 = null;
            }
            if (refreshLoadMoreLayout2 != null) {
                num = Integer.valueOf(refreshLoadMoreLayout2.getVisibility());
            }
            sb.append(num);
            Log.m105924i(str, sb.toString());
            C9753h hVar2 = this.f13411d.f30176f;
            if (hVar2 != null && (refreshLoadMoreLayout = hVar2.f30220j) != null) {
                refreshLoadMoreLayout.onChanged();
            }
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f13411d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f13411d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeInserted(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f13411d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                int i4 = 0;
                int c6 = i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0);
                C9753h hVar2 = this.f13411d.f30176f;
                if (hVar2 != null) {
                    i4 = hVar2.mo10346D().mo85796c6();
                }
                refreshLoadMoreLayout.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f13411d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.onItemRangeRemoved(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2);
            }
            C9753h hVar2 = this.f13411d.f30176f;
            if (hVar2 != null) {
                hVar2.mo9295R0();
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f13411d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.mo82441G(cVar);
            }
            C61926c.m72668M(new C2614a(this.f13411d, cVar));
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9753h hVar = this.f13411d.f30176f;
            if (!(hVar == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
                refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
            }
            C61926c.m72668M(new C2615b(this.f13411d, cVar));
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C61926c.m72668M(new C2616c(cVar, this.f13411d, this.f13412e));
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout refreshLoadMoreLayout;
            C9753h hVar = this.f13411d.f30176f;
            if (hVar != null && (refreshLoadMoreLayout = hVar.f30220j) != null) {
                refreshLoadMoreLayout.onItemRangeChanged(i + (hVar != null ? hVar.mo10346D().mo85796c6() : 0), i2, obj);
            }
        }
    }
}
