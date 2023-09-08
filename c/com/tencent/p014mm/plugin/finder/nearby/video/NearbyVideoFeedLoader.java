package com.tencent.p014mm.plugin.finder.nearby.video;

import android.os.SystemClock;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9342n1;
import je1.C9360p1;
import jp3.C46566c;
import jp3.C9486a;
import jp3.C9487b;
import kotlin.Metadata;
import le1.C10488a;
import le1.C10491c;
import le1.C10495g;
import o40.C61926c;
import os1.C11749q;
import os1.C11759w;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C51942x91;
import tf1.C13897e;
import tf1.C13908i;
import tf1.C13910j;
import tf1.C13911k;
import u60.C14121l;
import u60.C65233m;
import vp1.C14937o;
import vp1.C65834e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader */
public final class NearbyVideoFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: g */
    public static final /* synthetic */ int f15759g = 0;

    /* renamed from: d */
    public final C13908i f15760d;

    /* renamed from: e */
    public int f15761e;

    /* renamed from: f */
    public final C3347f f15762f;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$a */
    public final class C3330a extends C13911k<C0740i2> implements C9487b<C9486a>, C9360p1.C9361a {

        /* renamed from: d */
        public final C3347f f15763d;

        /* renamed from: e */
        public final C13908i f15764e;

        /* renamed from: f */
        public C65233m f15765f;

        /* renamed from: g */
        public final /* synthetic */ NearbyVideoFeedLoader f15766g;

        /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$a$a */
        public static final class C3331a extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3330a f15767d;

            /* renamed from: e */
            public final /* synthetic */ Object f15768e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0740i2> f15769f;

            /* renamed from: g */
            public final /* synthetic */ NearbyVideoFeedLoader f15770g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3331a(C3330a aVar, Object obj, long j, C13910j<C0740i2> jVar, NearbyVideoFeedLoader nearbyVideoFeedLoader) {
                super(1);
                this.f15767d = aVar;
                this.f15768e = obj;
                this.f15769f = jVar;
                this.f15770g = nearbyVideoFeedLoader;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                String tag = this.f15767d.getTAG();
                StringBuilder sb = new StringBuilder();
                sb.append("[call] hasPrefetch=");
                ((C3332b) this.f15768e).getClass();
                sb.append(false);
                sb.append(" needToRefreshForPrefetch=");
                ((C3332b) this.f15768e).getClass();
                sb.append(false);
                sb.append(" pullType=");
                sb.append(((C3332b) this.f15768e).f15771a);
                Log.m105924i(tag, sb.toString());
                ((C3332b) this.f15768e).getClass();
                C3330a aVar = this.f15767d;
                C3347f fVar = aVar.f15763d;
                Object obj2 = this.f15768e;
                C3348g gVar = new C3348g(aVar, obj2, this.f15770g, this.f15769f, lVar);
                int i = ((C3332b) obj2).f15771a;
                C3349h hVar = new C3349h(aVar, lVar);
                List<? extends BaseFinderFeed> list = ((C3332b) obj2).f15772b;
                fVar.getClass();
                Log.m105924i("Finder.NearbyVideoFeedFetcher", "[fetch] pullType=" + i + " tabType=" + fVar.f15789g + " isPreloadMore=" + false + ", isGetHistory=" + fVar.f15792j);
                C3344c cVar = new C3344c(gVar);
                if (i == 0 || i == 1) {
                    fVar.f15792j = false;
                }
                ArrayList arrayList = null;
                if (i == 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(C58784w3.f168295a.mo83914a0(fVar.f15789g), (Object) null);
                }
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C58784w3.f168295a.mo83914a0(fVar.f15789g), "");
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                C89349b a = C89349b.m111674a(Util.decodeHexString((String) f));
                Log.m105924i("Finder.NearbyVideoFeedFetcher", "[innerFetch] use tabType=" + fVar.f15789g + " lastBuffer:" + a);
                int i2 = fVar.f15789g;
                C49712hj1 hj12 = fVar.f15790h;
                if (list != null) {
                    arrayList = new ArrayList(C36907w.m41090l(list, 10));
                    for (BaseFinderFeed o : list) {
                        arrayList.add(o.mo3513o().getFeedObject());
                    }
                }
                C9342n1 n1Var = new C9342n1(i2, i, a, hj12, arrayList, false, false, false, 0, false, 992, (C8480h) null);
                n1Var.mo10081d(new C10488a(), 0);
                n1Var.mo10081d(new C10495g(), 1);
                n1Var.mo10081d(new C10491c(), 2);
                C46566c<C9486a> cVar2 = fVar.f15791i;
                C87412m.m108594g(cVar2, "keeper");
                n1Var.f29192s = cVar2;
                n1Var.f29190q = new C3345d(fVar, hVar);
                n1Var.f29189p = new C3346e(i, fVar, true, cVar);
                n1Var.mo10086i();
                return C13598b0.f38549a;
            }
        }

        public C3330a(NearbyVideoFeedLoader nearbyVideoFeedLoader, C3347f fVar, C13908i iVar) {
            C87412m.m108594g(fVar, "streamFetcher");
            C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f15766g = nearbyVideoFeedLoader;
            this.f15763d = fVar;
            this.f15764e = iVar;
        }

        /* renamed from: a */
        public void mo2805a(C2781d dVar, int i) {
            C87412m.m108594g(dVar, "info");
        }

        public void alive() {
            super.alive();
            if (this.f15764e == C13908i.FEED_TIMELINE_ALL) {
                C65233m mVar = (C65233m) ((C36570n) ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157784K).getValue();
                this.f15765f = mVar;
                if (mVar != null) {
                    mVar.mo89360c();
                    return;
                }
                return;
            }
            C65233m mVar2 = new C65233m("SingleExecutor#TabType=" + this.f15763d.f15789g);
            mVar2.mo89361d();
            this.f15765f = mVar2;
        }

        public void dead() {
            super.dead();
            C65233m mVar = this.f15765f;
            if (mVar != null) {
                mVar.reset();
            }
            this.f15765f = null;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            if (obj instanceof C3332b) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C65233m mVar = this.f15765f;
                if (mVar != null) {
                    mVar.mo11856a(new C14121l(new C3331a(this, obj, uptimeMillis, jVar, this.f15766g), (String) null, 2, (C8480h) null));
                }
            }
        }

        public void fetchInit(C13910j<C0740i2> jVar) {
            Class cls = C58417y0.class;
            Class<FinderCommonFeatureService> cls2 = FinderCommonFeatureService.class;
            C87412m.m108594g(jVar, "callback");
            LinkedList linkedList = new LinkedList();
            C11759w.C11760a d3 = ((C11759w) C39818r.f106831a.mo62446e(cls2).mo75002a(C11759w.class)).mo11635d3(this.f15764e.f39109d);
            if (d3.f34430b.isEmpty()) {
                List<C0740i2> i = C14937o.C14938a.m14143i(C14937o.f40972a, this.f15766g.getPageName(), (String) null, 2, (Object) null);
                NearbyVideoFeedLoader nearbyVideoFeedLoader = this.f15766g;
                for (C0740i2 i2Var : i) {
                    if (i2Var instanceof BaseFinderFeed) {
                        C49712hj1 contextObj = nearbyVideoFeedLoader.getContextObj();
                        if (contextObj != null) {
                            ((C58417y0) C86312j.m106911c(cls)).j80(((BaseFinderFeed) i2Var).mo3513o().getFeedObject(), contextObj.f134675i);
                        }
                        for (BaseFinderFeed o : ((BaseFinderFeed) i2Var).mo3513o().getFoldedFeedList()) {
                            ((C58417y0) C86312j.m106911c(cls)).j80(o.mo3513o().getFeedObject(), 14);
                        }
                    }
                }
                C49712hj1 contextObj2 = nearbyVideoFeedLoader.getContextObj();
                if (contextObj2 != null) {
                    C65834e eVar = C65834e.f189316a;
                    int i2 = contextObj2.f134675i;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : i) {
                        if (((C0740i2) next) instanceof BaseFinderFeed) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0740i2 i2Var2 = (C0740i2) it.next();
                        C87412m.m108592e(i2Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        arrayList2.add(((BaseFinderFeed) i2Var2).mo3513o().getFeedObject());
                    }
                    eVar.mo89867a(i2, arrayList2);
                }
                linkedList.addAll(i);
                C49712hj1 contextObj3 = this.f15766g.getContextObj();
                if (contextObj3 != null) {
                    ((C11749q) C39818r.f106831a.mo62446e(cls2).mo75002a(C11749q.class)).mo11612c3(contextObj3.f134675i, C58784w3.f168295a.mo83922d0(linkedList, BaseFinderFeed.class));
                }
            } else {
                linkedList.addAll(d3.f34430b);
            }
            C20480e0 e0Var = C20480e0.f57583a;
            int i3 = this.f15763d.f15789g;
            boolean z = !linkedList.isEmpty();
            C20480e0.C20481a e = e0Var.mo32032e(i3);
            if (e != null) {
                e.f57610T = z ? 1 : 0;
            }
            C0740i2 i2Var3 = (C0740i2) C110818d0.m150916N(linkedList);
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("fetchInit tabType=");
            sb.append(this.f15763d.f15789g);
            sb.append(" callInitData scene=");
            sb.append(this.f15764e);
            sb.append(", contextObj=");
            sb.append(this.f15766g.getContextObj() == null);
            sb.append(" list first=");
            sb.append(i2Var3 instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var3).mo3513o().getNickName() : "");
            sb.append(" => ");
            C0740i2 i2Var4 = (C0740i2) C110818d0.m150916N(linkedList);
            sb.append(C61926c.m72691p(i2Var4 != null ? i2Var4.getItemId() : 0));
            Log.m105924i(tag, sb.toString());
            C3333c cVar = new C3333c(0, 0, "", (Object) null, 8, (C8480h) null);
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : linkedList) {
                C0740i2 i2Var5 = (C0740i2) next2;
                if (i2Var5 instanceof BaseFinderFeed ? C58784w3.f168295a.mo83866E0(((BaseFinderFeed) i2Var5).mo3513o().getFeedObject()) : true) {
                    arrayList3.add(next2);
                }
            }
            cVar.setIncrementList(arrayList3);
            cVar.setPullType(1000);
            jVar.onFetchDone(cVar);
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            fetch(new C3332b(2, (List) null, 2, (C8480h) null), jVar, z);
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
            NearbyVideoFeedLoader nearbyVideoFeedLoader = this.f15766g;
            int i = nearbyVideoFeedLoader.f15761e;
            C3332b bVar = new C3332b(i, (List) null, 2, (C8480h) null);
            bVar.f15771a = i;
            if (i == 0) {
                nearbyVideoFeedLoader.f15761e = 1;
            }
            String tag = getTAG();
            Log.m105924i(tag, "[requestRefresh] pullType=" + bVar.f15771a + "  hasPrefetch=" + false + " needToRefreshForPrefetch=" + false);
            C13911k.fetch$default(this, bVar, jVar, false, 4, (Object) null);
        }

        public void keep(C9486a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$b */
    public static class C3332b {

        /* renamed from: a */
        public int f15771a;

        /* renamed from: b */
        public List<? extends BaseFinderFeed> f15772b;

        public C3332b(int i, List<? extends BaseFinderFeed> list, int i2, C8480h hVar) {
            list = (i2 & 2) != 0 ? null : list;
            this.f15771a = i;
            this.f15772b = list;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$c */
    public static final class C3333c extends IResponse<C0740i2> {

        /* renamed from: a */
        public Object f15773a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3333c(int i, int i2, String str, Object obj, int i3, C8480h hVar) {
            super(i, i2, str);
            obj = (i3 & 8) != 0 ? null : obj;
            this.f15773a = obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$d */
    public static final class C3334d extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ NearbyVideoFeedLoader f15774a;

        /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$d$a */
        public static final class C3335a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ NearbyVideoFeedLoader f15775d;

            /* renamed from: e */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f15776e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3335a(NearbyVideoFeedLoader nearbyVideoFeedLoader, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f15775d = nearbyVideoFeedLoader;
                this.f15776e = cVar;
            }

            public Object invoke() {
                this.f15775d.dispatcher().mo13381g(this.f15776e);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3334d(NearbyVideoFeedLoader nearbyVideoFeedLoader) {
            super(nearbyVideoFeedLoader, false, 1, (C8480h) null);
            this.f15774a = nearbyVideoFeedLoader;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
            if ((r3 != null && r3.f182394f == 1) == false) goto L_0x00a0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0 A[LOOP:1: B:14:0x0073->B:35:0x00b0, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00b5 A[EDGE_INSN: B:69:0x00b5->B:37:0x00b5 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mergeRefresh(com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> r18, fy3.C32226l<? super com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2>, rx3.C13598b0> r19) {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = "response"
                r2 = r18
                gy3.C87412m.m108594g(r2, r1)
                com.tencent.mm.view.RefreshLoadMoreLayout$c r1 = new com.tencent.mm.view.RefreshLoadMoreLayout$c
                r3 = 0
                r1.<init>(r3)
                boolean r4 = r18.getHasMore()
                r1.f24951f = r4
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r4 = r0.f15774a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r4.getDataList()
                int r4 = r4.size()
                java.util.List r5 = r18.getIncrementList()
                if (r5 != 0) goto L_0x002a
                java.util.LinkedList r5 = new java.util.LinkedList
                r5.<init>()
            L_0x002a:
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r7 = r0.f15774a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r7.getDataList()
                java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
                cm1.i2 r7 = (cm1.C0740i2) r7
                if (r7 == 0) goto L_0x004e
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r8 = r0.f15774a
                boolean r7 = r7 instanceof cm1.C0717c0
                if (r7 == 0) goto L_0x004e
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r8.getDataList()
                java.lang.Object r7 = r7.get(r3)
                r6.add(r7)
            L_0x004e:
                r6.addAll(r5)
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r5 = r0.f15774a
                java.util.Iterator r7 = r6.iterator()
                r8 = 0
                r9 = 0
            L_0x0059:
                boolean r10 = r7.hasNext()
                r11 = 1
                if (r10 == 0) goto L_0x00c5
                java.lang.Object r9 = r7.next()
                int r10 = r8 + 1
                if (r8 < 0) goto L_0x00c0
                cm1.i2 r9 = (cm1.C0740i2) r9
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r12 = r5.getDataList()
                java.util.Iterator r12 = r12.iterator()
                r13 = 0
            L_0x0073:
                boolean r14 = r12.hasNext()
                r15 = -1
                if (r14 == 0) goto L_0x00b4
                java.lang.Object r14 = r12.next()
                cm1.i2 r14 = (cm1.C0740i2) r14
                int r16 = r14.mo76f(r9)
                if (r16 != 0) goto L_0x00a0
                boolean r3 = r14 instanceof cm1.C0797z
                if (r3 == 0) goto L_0x00a0
                r3 = r14
                cm1.z r3 = (cm1.C0797z) r3
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                te3.c21 r3 = r3.getLiveInfo()
                if (r3 == 0) goto L_0x009d
                int r3 = r3.f182394f
                if (r3 != r11) goto L_0x009d
                r3 = 1
                goto L_0x009e
            L_0x009d:
                r3 = 0
            L_0x009e:
                if (r3 != 0) goto L_0x00aa
            L_0x00a0:
                if (r8 != 0) goto L_0x00ac
                boolean r3 = r9 instanceof cm1.C0717c0
                if (r3 == 0) goto L_0x00ac
                boolean r3 = r14 instanceof cm1.C0717c0
                if (r3 == 0) goto L_0x00ac
            L_0x00aa:
                r3 = 1
                goto L_0x00ad
            L_0x00ac:
                r3 = 0
            L_0x00ad:
                if (r3 == 0) goto L_0x00b0
                goto L_0x00b5
            L_0x00b0:
                int r13 = r13 + 1
                r3 = 0
                goto L_0x0073
            L_0x00b4:
                r13 = -1
            L_0x00b5:
                if (r13 == r15) goto L_0x00bd
                if (r13 != r8) goto L_0x00bd
                r9 = r8
                r8 = r10
                r3 = 0
                goto L_0x0059
            L_0x00bd:
                int r9 = r8 + -1
                goto L_0x00c5
            L_0x00c0:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x00c5:
                java.util.LinkedList r3 = new java.util.LinkedList
                r3.<init>()
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r5 = r0.f15774a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r5.getDataList()
                r3.addAll(r5)
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r5 = r0.f15774a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r5.getDataList()
                r5.clear()
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r5 = r0.f15774a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r5.getDataList()
                r5.addAll(r6)
                int r5 = r6.size()
                if (r5 <= 0) goto L_0x01c4
                int r9 = r9 + r11
                java.lang.String r7 = " oldList:"
                java.lang.String r8 = " newList:"
                java.lang.String r10 = "  removeSize:"
                java.lang.String r11 = " removeIndex:"
                java.lang.String r12 = "mergeRefresh() hasMore:"
                if (r9 != r5) goto L_0x0146
                int r4 = r4 - r5
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r5 = r0.f15774a
                tf1.g r5 = r5.dispatcher()
                r5.mo13380e(r9, r4)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r5 == 0) goto L_0x01d0
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r5 = r0.f15774a
                java.lang.String r5 = r5.getTAG()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r12)
                boolean r2 = r18.getHasMore()
                r13.append(r2)
                r13.append(r11)
                r13.append(r9)
                r13.append(r10)
                r13.append(r4)
                r13.append(r8)
                je1.g2 r2 = je1.C9311g2.f29093a
                java.lang.String r4 = r2.mo10063b(r6)
                r13.append(r4)
                r13.append(r7)
                java.lang.String r2 = r2.mo10063b(r3)
                r13.append(r2)
                java.lang.String r2 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                goto L_0x01d0
            L_0x0146:
                if (r9 <= r5) goto L_0x0156
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r2 = r0.f15774a
                java.lang.String r2 = r2.getTAG()
                java.lang.String r3 = "数据出错，需要检查."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
                goto L_0x01d0
            L_0x0156:
                int r13 = r4 - r9
                if (r4 <= 0) goto L_0x0165
                if (r13 <= 0) goto L_0x0165
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r4 = r0.f15774a
                tf1.g r4 = r4.dispatcher()
                r4.mo13380e(r9, r13)
            L_0x0165:
                int r5 = r5 - r9
                if (r5 <= 0) goto L_0x0171
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r4 = r0.f15774a
                tf1.g r4 = r4.dispatcher()
                r4.mo13379d(r9, r5)
            L_0x0171:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r4 == 0) goto L_0x01d0
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r4 = r0.f15774a
                java.lang.String r4 = r4.getTAG()
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r12)
                boolean r2 = r18.getHasMore()
                r14.append(r2)
                r14.append(r11)
                r14.append(r9)
                r14.append(r10)
                r14.append(r13)
                java.lang.String r2 = " insertIndex:"
                r14.append(r2)
                r14.append(r9)
                java.lang.String r2 = "  insertSize:"
                r14.append(r2)
                r14.append(r5)
                r14.append(r8)
                je1.g2 r2 = je1.C9311g2.f29093a
                java.lang.String r5 = r2.mo10063b(r6)
                r14.append(r5)
                r14.append(r7)
                java.lang.String r2 = r2.mo10063b(r3)
                r14.append(r2)
                java.lang.String r2 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                goto L_0x01d0
            L_0x01c4:
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r2 = r0.f15774a
                java.lang.String r2 = r2.getTAG()
                java.lang.String r3 = "没有新的数据."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            L_0x01d0:
                r2 = 0
                r1.f24953h = r2
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$d$a r2 = new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader$d$a
                com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r3 = r0.f15774a
                r2.<init>(r3, r1)
                o40.C61926c.m72668M(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoFeedLoader.C3334d.mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse, fy3.l):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyVideoFeedLoader(C13908i iVar, int i, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f15760d = iVar;
        this.f15761e = i;
        this.f15762f = new C3347f(iVar.f39109d, hj12);
    }

    public List<Integer> colletExtraPageName() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(4);
        return arrayList;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3330a(this, this.f15762f, this.f15760d);
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3334d(this);
    }

    public int getPageName() {
        C58784w3 w3Var = C58784w3.f168295a;
        return w3Var.mo83884L1(w3Var.mo83887M1(this.f15760d.f39109d));
    }

    public void onDead() {
        super.onDead();
        this.f15762f.f15791i.dead();
    }

    public void requestLoadMore(C51942x91 x912) {
        super.requestLoadMore(false);
    }
}
