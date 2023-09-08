package com.tencent.p014mm.plugin.finder.feed.model;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import je1.C46547x1;
import kotlin.Metadata;
import kotlin.ResultKt;
import o40.C61926c;
import ob0.C89132b;
import p145dx.C58457w;
import p145dx.C7523p;
import pe3.C89349b;
import pj2.C62323d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sj2.C13683d;
import sj2.C63923e;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import tf1.C13893c;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import up1.C65426w0;
import wj2.C66132f;
import wp1.C15585f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderRingtoneTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader */
public class FinderRingtoneTimelineLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final long f13818d;

    /* renamed from: e */
    public final String f13819e;

    /* renamed from: f */
    public final int f13820f;

    /* renamed from: g */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13821g;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$a */
    public final class C2743a extends C13893c {

        /* renamed from: g */
        public final C0000n0 f13822g = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));

        /* renamed from: h */
        public C53973z1 f13823h;

        /* renamed from: i */
        public final C13601g f13824i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$FinderRingtoneTimelineDataFetcher$fetchLoadMore$1", mo125469f = "FinderRingtoneTimelineLoader.kt", mo125470l = {126, 128, 141}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$a$a */
        public static final class C2744a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f13826d;

            /* renamed from: e */
            public final /* synthetic */ C2743a f13827e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0740i2> f13828f;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$FinderRingtoneTimelineDataFetcher$fetchLoadMore$1$1", mo125469f = "FinderRingtoneTimelineLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$a$a$a */
            public static final class C2745a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C13910j<C0740i2> f13829d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2745a(C13910j<C0740i2> jVar, C15601d<? super C2745a> dVar) {
                    super(2, dVar);
                    this.f13829d = jVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C2745a(this.f13829d, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C2745a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C2748b bVar = new C2748b(4, -1, "");
                    bVar.setPullType(2);
                    this.f13829d.onFetchDone(bVar);
                    return C13598b0.f38549a;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$FinderRingtoneTimelineDataFetcher$fetchLoadMore$1$2", mo125469f = "FinderRingtoneTimelineLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$a$a$b */
            public static final class C2746b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ List<BaseFinderFeed> f13830d;

                /* renamed from: e */
                public final /* synthetic */ C63923e f13831e;

                /* renamed from: f */
                public final /* synthetic */ C13910j<C0740i2> f13832f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2746b(List<? extends BaseFinderFeed> list, C63923e eVar, C13910j<C0740i2> jVar, C15601d<? super C2746b> dVar) {
                    super(2, dVar);
                    this.f13830d = list;
                    this.f13831e = eVar;
                    this.f13832f = jVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C2746b(this.f13830d, this.f13831e, this.f13832f, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C2746b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C2748b bVar = new C2748b(0, 0, "");
                    bVar.setIncrementList(this.f13830d);
                    bVar.setHasMore(this.f13831e.f181196b);
                    bVar.setPullType(2);
                    this.f13832f.onFetchDone(bVar);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2744a(C2743a aVar, C13910j<C0740i2> jVar, C15601d<? super C2744a> dVar) {
                super(2, dVar);
                this.f13827e = aVar;
                this.f13828f = jVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C2744a(this.f13827e, this.f13828f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C2744a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f13826d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C13683d dVar = (C13683d) ((C36570n) this.f13827e.f13824i).getValue();
                    if (dVar != null) {
                        this.f13826d = 1;
                        obj = dVar.mo13066a(0, false, false, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return C13598b0.f38549a;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return C13598b0.f38549a;
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C63923e eVar = (C63923e) obj;
                if (eVar != null) {
                    if (!eVar.f181197c) {
                        C53896h0 h0Var = C53872d1.f151117a;
                        C53915k2 k2Var = C58901s.f168555a;
                        C2745a aVar2 = new C2745a(this.f13828f, (C15601d<? super C2745a>) null);
                        this.f13826d = 2;
                        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                            return aVar;
                        }
                        return C13598b0.f38549a;
                    }
                    List<C62323d> list = eVar.f181195a;
                    ArrayList arrayList = new ArrayList();
                    for (C62323d itemId : list) {
                        C66132f Xz = ((C7523p) C86312j.m106911c(C7523p.class)).mo8647Xz(itemId.getItemId());
                        FinderObject finderObject = Xz != null ? Xz.f190081d : null;
                        if (finderObject != null) {
                            arrayList.add(finderObject);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a((FinderObject) it.next(), 0)));
                    }
                    C53896h0 h0Var2 = C53872d1.f151117a;
                    C53915k2 k2Var2 = C58901s.f168555a;
                    C2746b bVar = new C2746b(arrayList2, eVar, this.f13828f, (C15601d<? super C2746b>) null);
                    this.f13826d = 3;
                    if (C53895h.m60469g(k2Var2, bVar, this) == aVar) {
                        return aVar;
                    }
                    return C13598b0.f38549a;
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$a$b */
        public static final class C2747b extends C87413o implements C32224a<C13683d> {

            /* renamed from: d */
            public final /* synthetic */ FinderRingtoneTimelineLoader f13833d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2747b(FinderRingtoneTimelineLoader finderRingtoneTimelineLoader) {
                super(0);
                this.f13833d = finderRingtoneTimelineLoader;
            }

            public Object invoke() {
                return ((C58457w) C86312j.m106911c(C58457w.class)).R10(this.f13833d.f13820f);
            }
        }

        public C2743a() {
            this.f13824i = C36568h.m40985a(new C2747b(FinderRingtoneTimelineLoader.this));
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            Integer num = null;
            if (!(eu32 instanceof C50008jm0)) {
                return null;
            }
            C2748b bVar2 = new C2748b(i, i2, str);
            ArrayList<FinderObject> arrayList = new ArrayList<>();
            C50008jm0 jm02 = (C50008jm0) eu32;
            FinderObject finderObject = jm02.f136184e;
            if (finderObject != null) {
                arrayList.add(finderObject);
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (FinderObject a : arrayList) {
                arrayList2.add(C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a(a, 256)));
            }
            bVar2.setIncrementList(arrayList2);
            C15585f.f42211a.mo14343f(arrayList, 256, FinderRingtoneTimelineLoader.this.getContextObj());
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("incrementList size: ");
            List incrementList = bVar2.getIncrementList();
            if (incrementList != null) {
                num = Integer.valueOf(incrementList.size());
            }
            sb.append(num);
            Log.m105924i(tag, sb.toString());
            bVar2.setPullType(0);
            bVar2.setLastBuffer(jm02.f136185f);
            bVar2.setHasMore(false);
            return bVar2;
        }

        public IResponse<C0740i2> callInit() {
            Log.m105924i(getTAG(), "fetchInit");
            C2748b bVar = new C2748b(0, 0, "");
            C2819w0 cache = FinderRingtoneTimelineLoader.this.getCache();
            C89349b bVar2 = null;
            bVar.setIncrementList(cache != null ? cache.f14079a : null);
            C2819w0 cache2 = FinderRingtoneTimelineLoader.this.getCache();
            if (cache2 != null) {
                bVar2 = cache2.f14080b;
            }
            bVar.setLastBuffer(bVar2);
            return bVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            return null;
        }

        public void dead() {
            C53930o0.m60558e(this.f13822g, (CancellationException) null, 1, (Object) null);
            super.dead();
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = FinderRingtoneTimelineLoader.this;
            long j = finderRingtoneTimelineLoader.f13818d;
            String str = finderRingtoneTimelineLoader.f13819e;
            return new C46547x1(j, str, 2, 2, "", false, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, finderRingtoneTimelineLoader.getContextObj(), 0, (C49946j51) null, false, 122848, (C8480h) null);
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            this.f13823h = C53895h.m60466d(this.f13822g, (C66212f) null, (C53934p0) null, new C2744a(this, jVar, (C15601d<? super C2744a>) null), 3, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$b */
    public static final class C2748b extends IResponse<C0740i2> {
        public C2748b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$c */
    public static final class C2749c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderRingtoneTimelineLoader f13834a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader$c$a */
        public static final class C2750a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2749c f13835d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13836e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13837f;

            /* renamed from: g */
            public final /* synthetic */ FinderRingtoneTimelineLoader f13838g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13839h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13840i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2750a(C2749c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderRingtoneTimelineLoader finderRingtoneTimelineLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13835d = cVar;
                this.f13836e = tVar;
                this.f13837f = cVar2;
                this.f13838g = finderRingtoneTimelineLoader;
                this.f13839h = lVar;
                this.f13840i = iResponse;
            }

            public Object invoke() {
                this.f13835d.convertOpToReason(this.f13836e, this.f13837f);
                this.f13838g.dispatcher().mo13381g(this.f13837f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13839h;
                if (lVar != null) {
                    lVar.invoke(this.f13840i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2749c(FinderRingtoneTimelineLoader finderRingtoneTimelineLoader) {
            super(finderRingtoneTimelineLoader, false, 1, (C8480h) null);
            this.f13834a = finderRingtoneTimelineLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            int i;
            C87412m.m108594g(iResponse, "response");
            int pullType = iResponse.getPullType();
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(pullType);
            boolean z = true;
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.es_);
                cVar.f24947b = 1;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esr);
                cVar.f24947b = -1;
            }
            cVar.f24952g = iResponse.getPullType() != 0;
            cVar.f24951f = iResponse.getHasMore();
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            String tag = this.f13834a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f13834a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2750a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13834a, lVar, iResponse));
                }
            } else if (this.f13834a.getDataList().size() == 0 || size == 0 || this.f13834a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 != null && incrementList2.isEmpty()) {
                    i = 7;
                } else {
                    List<C0740i2> incrementList3 = iResponse.getIncrementList();
                    if (incrementList3 == null || !incrementList3.containsAll(C110818d0.m150953y0(this.f13834a.getDataList()))) {
                        z = false;
                    }
                    if (z) {
                        i = 6;
                    }
                }
                C61926c.m72668M(new C2750a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13834a, lVar, iResponse));
            }
            i = 4;
            C61926c.m72668M(new C2750a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13834a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRingtoneTimelineLoader(long j, String str, int i, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "nonceId");
        this.f13818d = j;
        this.f13819e = str;
        this.f13820f = i;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2743a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2749c(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && (lVar = this.f13821g) != null) {
            lVar.invoke(iResponse);
        }
    }
}
