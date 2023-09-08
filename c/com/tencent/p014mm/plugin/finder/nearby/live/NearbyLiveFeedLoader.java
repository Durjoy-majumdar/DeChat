package com.tencent.p014mm.plugin.finder.nearby.live;

import android.os.SystemClock;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0784u1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hn1.C8614b;
import it1.C9256k;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C46527o;
import je1.C9311g2;
import je1.C9360p1;
import jn1.C9479b;
import jp3.C46566c;
import jp3.C9486a;
import kf1.C9833k9;
import kotlin.Metadata;
import lm1.C10546d;
import ln1.C21445b;
import nn1.C11232a;
import nn1.C11233b;
import nn1.C11235c;
import o40.C61926c;
import os1.C11759w;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C49599gr0;
import te3.C49712hj1;
import te3.C51942x91;
import tf1.C13897e;
import tf1.C13900g;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13920p;
import u60.C14121l;
import u60.C65233m;
import u60.C65234n;
import vp1.C14937o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/NearbyLiveFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader */
public class NearbyLiveFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final int f15530d;

    /* renamed from: e */
    public final int f15531e;

    /* renamed from: f */
    public final String f15532f;

    /* renamed from: g */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f15533g;

    /* renamed from: h */
    public int f15534h = 1;

    /* renamed from: i */
    public C51942x91 f15535i;

    /* renamed from: j */
    public int f15536j;

    /* renamed from: n */
    public int f15537n;

    /* renamed from: o */
    public C89349b f15538o;

    /* renamed from: p */
    public C89349b f15539p;

    /* renamed from: q */
    public boolean f15540q;

    /* renamed from: r */
    public boolean f15541r;

    /* renamed from: s */
    public LinkedList<C0740i2> f15542s;

    /* renamed from: t */
    public boolean f15543t;

    /* renamed from: u */
    public long f15544u;

    /* renamed from: v */
    public C3274b f15545v;

    /* renamed from: w */
    public C9833k9 f15546w;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$a */
    public static class C3273a implements C9360p1.C9362b {

        /* renamed from: a */
        public final C65233m f15547a;

        /* renamed from: b */
        public final C14121l f15548b;

        public C3273a(C65233m mVar, C14121l lVar) {
            C87412m.m108594g(lVar, "task");
            this.f15547a = mVar;
            this.f15548b = lVar;
        }

        /* renamed from: a */
        public boolean mo2804a(int i, int i2, String str, C49335eu3 eu32) {
            C87412m.m108594g(eu32, "resp");
            C65233m mVar = this.f15547a;
            if (mVar == null) {
                return false;
            }
            int i3 = mVar.f187773f;
            C14121l lVar = this.f15548b;
            if (i3 == lVar.f39521h) {
                return false;
            }
            lVar.mo11853b(C65234n.OK);
            Log.m105928w("CgiConsumeCallback", "[isFetchConsume] executorToken=" + this.f15547a.f187773f + " taskToken=" + this.f15548b.f39521h);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$b */
    public final class C3274b extends C13911k<C0740i2> {

        /* renamed from: d */
        public C65233m f15549d;

        /* renamed from: e */
        public C10546d f15550e;

        /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$b$a */
        public static final class C3275a extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3274b f15552d;

            /* renamed from: e */
            public final /* synthetic */ Object f15553e;

            /* renamed from: f */
            public final /* synthetic */ NearbyLiveFeedLoader f15554f;

            /* renamed from: g */
            public final /* synthetic */ C13910j<C0740i2> f15555g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3275a(C3274b bVar, Object obj, NearbyLiveFeedLoader nearbyLiveFeedLoader, C13910j<C0740i2> jVar) {
                super(1);
                this.f15552d = bVar;
                this.f15553e = obj;
                this.f15554f = nearbyLiveFeedLoader;
                this.f15555g = jVar;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                String tag = this.f15552d.getTAG();
                Log.m105924i(tag, "[call] pullType=" + ((C3277c) this.f15553e).f15560a);
                C3273a aVar = new C3273a(this.f15552d.f15549d, lVar);
                C10546d dVar = this.f15552d.f15550e;
                C87412m.m108591d(dVar);
                dVar.mo10822y1((C3277c) this.f15553e, new C3300a(this.f15552d, this.f15554f, this.f15555g, lVar), aVar);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$b$b */
        public static final class C3276b extends C87413o implements C32226l<C9256k<IResponse<C0740i2>>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3274b f15556d;

            /* renamed from: e */
            public final /* synthetic */ C3277c f15557e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0740i2> f15558f;

            /* renamed from: g */
            public final /* synthetic */ NearbyLiveFeedLoader f15559g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3276b(C3274b bVar, C3277c cVar, C13910j<C0740i2> jVar, NearbyLiveFeedLoader nearbyLiveFeedLoader) {
                super(1);
                this.f15556d = bVar;
                this.f15557e = cVar;
                this.f15558f = jVar;
                this.f15559g = nearbyLiveFeedLoader;
            }

            public Object invoke(Object obj) {
                C13598b0 b0Var;
                C9256k kVar = (C9256k) obj;
                if (kVar != null) {
                    NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15559g;
                    C13910j<C0740i2> jVar = this.f15558f;
                    nearbyLiveFeedLoader.f15538o = ((IResponse) kVar.f29003d).getLastBuffer();
                    jVar.onFetchDone((IResponse) kVar.f29003d);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C13911k.fetch$default(this.f15556d, this.f15557e, this.f15558f, false, 4, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C3274b() {
        }

        public void alive() {
            super.alive();
            this.f15550e = new C10546d(NearbyLiveFeedLoader.this.getContextObj());
            C65233m mVar = new C65233m("FinderFollowTlSingleExecutor");
            mVar.mo89361d();
            this.f15549d = mVar;
        }

        /* renamed from: b */
        public final void mo3563b(String str) {
            C87412m.m108594g(str, "invokeSource");
            C65233m mVar = this.f15549d;
            Integer num = null;
            String valueOf = String.valueOf(mVar != null ? Integer.valueOf(mVar.f187773f) : null);
            C65233m mVar2 = this.f15549d;
            if (mVar2 != null) {
                mVar2.reset();
            }
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("reset ");
            sb.append(str);
            sb.append(" before toke:");
            sb.append(valueOf);
            sb.append(" after toke:");
            C65233m mVar3 = this.f15549d;
            if (mVar3 != null) {
                num = Integer.valueOf(mVar3.f187773f);
            }
            sb.append(num);
            Log.m105924i(tag, sb.toString());
        }

        public void dead() {
            C46566c<C9486a> cVar;
            super.dead();
            C10546d dVar = this.f15550e;
            if (!(dVar == null || (cVar = dVar.f31824h) == null)) {
                cVar.dead();
            }
            C10546d dVar2 = this.f15550e;
            if (dVar2 != null) {
                dVar2.f31825i = null;
            }
            C65233m mVar = this.f15549d;
            if (mVar != null) {
                mVar.reset();
            }
            this.f15549d = null;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C65233m mVar;
            C87412m.m108594g(jVar, "callback");
            if ((obj instanceof C3277c) && (mVar = this.f15549d) != null) {
                mVar.mo11856a(new C14121l(new C3275a(this, obj, NearbyLiveFeedLoader.this, jVar), (String) null, 2, (C8480h) null));
            }
        }

        public void fetchInit(C13910j<C0740i2> jVar) {
            C49712hj1 contextObj;
            C87412m.m108594g(jVar, "callback");
            LinkedList<C0740i2> linkedList = new LinkedList<>();
            try {
                C11759w.C11760a d3 = ((C11759w) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class)).mo11635d3(NearbyLiveFeedLoader.this.f15536j);
                if (d3.f34430b.isEmpty()) {
                    linkedList.addAll(C14937o.C14938a.m14143i(C14937o.f40972a, NearbyLiveFeedLoader.this.f15537n, (String) null, 2, (Object) null));
                    String tag = getTAG();
                    Log.m105924i(tag, "load init data from FirstPage, size:" + linkedList.size() + ", memoryCacheFlag:" + NearbyLiveFeedLoader.this.f15536j + ", fileCacheFlag:" + NearbyLiveFeedLoader.this.f15537n);
                } else {
                    NearbyLiveFeedLoader.this.f15538o = d3.f34435g;
                    linkedList.addAll(d3.f34430b);
                    if (d3.f34436h) {
                        new C46527o(2, d3.f34435g).mo9225i();
                    }
                    String tag2 = getTAG();
                    Log.m105924i(tag2, "load init data from cache, size:" + linkedList.size() + ", memoryCacheFlag:" + NearbyLiveFeedLoader.this.f15536j + ", fileCacheFlag:" + NearbyLiveFeedLoader.this.f15537n + " lastBuffer:" + NearbyLiveFeedLoader.this.f15538o);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(getTAG(), th, "load init data exception", new Object[0]);
            }
            NearbyLiveFeedLoader nearbyLiveFeedLoader = NearbyLiveFeedLoader.this;
            for (C0740i2 i2Var : linkedList) {
                if ((i2Var instanceof BaseFinderFeed) && (contextObj = nearbyLiveFeedLoader.getContextObj()) != null) {
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(((BaseFinderFeed) i2Var).mo3513o().getFeedObject(), contextObj.f134675i);
                }
            }
            C3278d dVar = new C3278d(0, 0, "", (C49599gr0) null, 0, 24, (C8480h) null);
            NearbyLiveFeedLoader nearbyLiveFeedLoader2 = NearbyLiveFeedLoader.this;
            dVar.setPullType(1000);
            dVar.setIncrementList(linkedList);
            dVar.setLastBuffer(nearbyLiveFeedLoader2.f15538o);
            jVar.onFetchDone(dVar);
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            NearbyLiveFeedLoader nearbyLiveFeedLoader = NearbyLiveFeedLoader.this;
            C13911k.fetch$default(this, new C3277c(2, nearbyLiveFeedLoader.f15535i, nearbyLiveFeedLoader.f15538o, nearbyLiveFeedLoader.f15536j, nearbyLiveFeedLoader.f15531e, nearbyLiveFeedLoader.f15530d, nearbyLiveFeedLoader.f15532f, 0, 0, 384, (C8480h) null), jVar, false, 4, (Object) null);
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C51942x91 x912;
            C9256k<IResponse<C0740i2>> e;
            C13910j<C0740i2> jVar2 = jVar;
            C87412m.m108594g(jVar2, "callback");
            NearbyLiveFeedLoader nearbyLiveFeedLoader = NearbyLiveFeedLoader.this;
            int i = nearbyLiveFeedLoader.f15534h;
            C51942x91 x913 = nearbyLiveFeedLoader.f15535i;
            C89349b bVar = nearbyLiveFeedLoader.f15539p;
            C89349b lastBuffer = (bVar == null || ((!nearbyLiveFeedLoader.f15540q || i != 0) && i != 16)) ? i != 2 ? null : nearbyLiveFeedLoader.getLastBuffer() : bVar;
            NearbyLiveFeedLoader nearbyLiveFeedLoader2 = NearbyLiveFeedLoader.this;
            C3277c cVar = new C3277c(i, x913, lastBuffer, nearbyLiveFeedLoader2.f15536j, nearbyLiveFeedLoader2.f15531e, nearbyLiveFeedLoader2.f15530d, nearbyLiveFeedLoader2.f15532f, 0, nearbyLiveFeedLoader2.f15544u, 128, (C8480h) null);
            NearbyLiveFeedLoader nearbyLiveFeedLoader3 = NearbyLiveFeedLoader.this;
            if (nearbyLiveFeedLoader3.f15534h == 0 && (x912 = nearbyLiveFeedLoader3.f15535i) != null && !nearbyLiveFeedLoader3.f15540q) {
                C8614b bVar2 = C8614b.f27717a;
                C87412m.m108591d(x912);
                C9479b c = bVar2.mo9478c(x912);
                if (c != null) {
                    NearbyLiveFeedLoader nearbyLiveFeedLoader4 = NearbyLiveFeedLoader.this;
                    int ordinal = c.f29562n.ordinal();
                    if (ordinal == 1) {
                        c.mo10165f(new C3276b(this, cVar, jVar2, nearbyLiveFeedLoader4));
                        return;
                    } else if (ordinal == 5 && (e = c.mo10164e()) != null) {
                        nearbyLiveFeedLoader4.f15538o = ((IResponse) e.f29003d).getLastBuffer();
                        jVar2.onFetchDone((IResponse) e.f29003d);
                        return;
                    }
                }
            }
            NearbyLiveFeedLoader nearbyLiveFeedLoader5 = NearbyLiveFeedLoader.this;
            nearbyLiveFeedLoader5.f15538o = null;
            nearbyLiveFeedLoader5.f15540q = false;
            C13911k.fetch$default(this, cVar, jVar, false, 4, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$c */
    public static final class C3277c {

        /* renamed from: a */
        public final int f15560a;

        /* renamed from: b */
        public final C51942x91 f15561b;

        /* renamed from: c */
        public C89349b f15562c;

        /* renamed from: d */
        public final int f15563d;

        /* renamed from: e */
        public final int f15564e;

        /* renamed from: f */
        public final int f15565f;

        /* renamed from: g */
        public String f15566g;

        /* renamed from: h */
        public int f15567h;

        /* renamed from: i */
        public long f15568i;

        public C3277c(int i, C51942x91 x912, C89349b bVar, int i2, int i3, int i4, String str, int i5, long j, int i6, C8480h hVar) {
            x912 = (i6 & 2) != 0 ? null : x912;
            bVar = (i6 & 4) != 0 ? null : bVar;
            str = (i6 & 64) != 0 ? "" : str;
            i5 = (i6 & 128) != 0 ? 0 : i5;
            j = (i6 & 256) != 0 ? 0 : j;
            C87412m.m108594g(str, "by_pass");
            this.f15560a = i;
            this.f15561b = x912;
            this.f15562c = bVar;
            this.f15563d = i2;
            this.f15564e = i3;
            this.f15565f = i4;
            this.f15566g = str;
            this.f15567h = i5;
            this.f15568i = j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("pullType:");
            sb.append(this.f15560a);
            sb.append("  tabId:");
            C51942x91 x912 = this.f15561b;
            String str = null;
            sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : null);
            sb.append(" tabName:");
            C51942x91 x913 = this.f15561b;
            if (x913 != null) {
                str = x913.f144532e;
            }
            sb.append(str);
            sb.append(" lastBuffer:");
            sb.append(this.f15562c);
            sb.append(" memoryCacheFlag:");
            sb.append(this.f15563d);
            sb.append(" tabType:");
            sb.append(this.f15564e);
            sb.append(" commentScene:");
            sb.append(this.f15565f);
            sb.append(" relatedObjectId:");
            sb.append(this.f15568i);
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d */
    public static final class C3278d extends IResponse<C0740i2> {

        /* renamed from: a */
        public C49599gr0 f15569a;

        /* renamed from: b */
        public int f15570b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3278d(int i, int i2, String str, C49599gr0 gr02, int i3, int i4, C8480h hVar) {
            super(i, i2, str);
            gr02 = (i4 & 8) != 0 ? null : gr02;
            i3 = (i4 & 16) != 0 ? -1 : i3;
            this.f15569a = gr02;
            this.f15570b = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$e */
    public static final class C3279e extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ NearbyLiveFeedLoader f15571a;

        /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$e$a */
        public static final class C3280a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ NearbyLiveFeedLoader f15572d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3280a(NearbyLiveFeedLoader nearbyLiveFeedLoader) {
                super(0);
                this.f15572d = nearbyLiveFeedLoader;
            }

            public Object invoke() {
                this.f15572d.f15543t = false;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$e$b */
        public static final class C3281b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ NearbyLiveFeedLoader f15573d;

            /* renamed from: e */
            public final /* synthetic */ LinkedList<C0740i2> f15574e;

            /* renamed from: f */
            public final /* synthetic */ C8478d0 f15575f;

            /* renamed from: g */
            public final /* synthetic */ C8478d0 f15576g;

            /* renamed from: h */
            public final /* synthetic */ C8478d0 f15577h;

            /* renamed from: i */
            public final /* synthetic */ C8478d0 f15578i;

            /* renamed from: j */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f15579j;

            /* renamed from: n */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f15580n;

            /* renamed from: o */
            public final /* synthetic */ IResponse<C0740i2> f15581o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3281b(NearbyLiveFeedLoader nearbyLiveFeedLoader, LinkedList<C0740i2> linkedList, C8478d0 d0Var, C8478d0 d0Var2, C8478d0 d0Var3, C8478d0 d0Var4, RefreshLoadMoreLayout.C7080c<Object> cVar, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f15573d = nearbyLiveFeedLoader;
                this.f15574e = linkedList;
                this.f15575f = d0Var;
                this.f15576g = d0Var2;
                this.f15577h = d0Var3;
                this.f15578i = d0Var4;
                this.f15579j = cVar;
                this.f15580n = lVar;
                this.f15581o = iResponse;
            }

            public Object invoke() {
                this.f15573d.getDataList().clear();
                this.f15573d.getDataList().addAll(this.f15574e);
                if (this.f15575f.f27483d >= 0 && this.f15576g.f27483d > 0) {
                    this.f15573d.dispatcher().mo13380e(this.f15575f.f27483d, this.f15576g.f27483d);
                }
                if (this.f15577h.f27483d >= 0 && this.f15578i.f27483d > 0) {
                    this.f15573d.dispatcher().mo13379d(this.f15577h.f27483d, this.f15578i.f27483d);
                }
                this.f15579j.f24953h = this.f15578i.f27483d;
                C13900g.m13322f(this.f15573d.dispatcher(), this.f15579j, false, 2, (Object) null);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f15580n;
                if (lVar != null) {
                    lVar.invoke(this.f15581o);
                }
                this.f15573d.f15543t = false;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$e$c */
        public static final class C3282c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ NearbyLiveFeedLoader f15582d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<LinkedList<C0740i2>> f15583e;

            /* renamed from: f */
            public final /* synthetic */ long f15584f;

            /* renamed from: g */
            public final /* synthetic */ LinkedList<C0740i2> f15585g;

            /* renamed from: h */
            public final /* synthetic */ IResponse<C0740i2> f15586h;

            /* renamed from: i */
            public final /* synthetic */ C8478d0 f15587i;

            /* renamed from: j */
            public final /* synthetic */ C8478d0 f15588j;

            /* renamed from: n */
            public final /* synthetic */ C8478d0 f15589n;

            /* renamed from: o */
            public final /* synthetic */ C8478d0 f15590o;

            /* renamed from: p */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f15591p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3282c(NearbyLiveFeedLoader nearbyLiveFeedLoader, C8479f0<LinkedList<C0740i2>> f0Var, long j, LinkedList<C0740i2> linkedList, IResponse<C0740i2> iResponse, C8478d0 d0Var, C8478d0 d0Var2, C8478d0 d0Var3, C8478d0 d0Var4, RefreshLoadMoreLayout.C7080c<Object> cVar) {
                super(0);
                this.f15582d = nearbyLiveFeedLoader;
                this.f15583e = f0Var;
                this.f15584f = j;
                this.f15585g = linkedList;
                this.f15586h = iResponse;
                this.f15587i = d0Var;
                this.f15588j = d0Var2;
                this.f15589n = d0Var3;
                this.f15590o = d0Var4;
                this.f15591p = cVar;
            }

            public Object invoke() {
                this.f15582d.getDataList().clear();
                this.f15582d.getDataList().addAll((Collection) this.f15583e.f27484d);
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15584f;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                C9311g2 g2Var = C9311g2.f29093a;
                String b = g2Var.mo10063b((List) this.f15583e.f27484d);
                String b2 = g2Var.mo10063b(this.f15585g);
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                String tag = this.f15582d.getTAG();
                Log.m105924i(tag, "mergeRefresh() mergeTime:" + elapsedRealtime + " collectInfoTime:" + elapsedRealtime3 + " hasMore:" + this.f15586h.getHasMore() + " removeIndex:" + this.f15587i.f27483d + "  removeSize:" + this.f15588j.f27483d + " insertIndex:" + this.f15589n.f27483d + "  insertSize:" + this.f15590o.f27483d + " newList:" + b + " oldList:" + b2);
                if (this.f15587i.f27483d >= 0 && this.f15588j.f27483d > 0) {
                    this.f15582d.dispatcher().mo13380e(this.f15587i.f27483d, this.f15588j.f27483d);
                }
                if (this.f15589n.f27483d >= 0 && this.f15590o.f27483d > 0) {
                    this.f15582d.dispatcher().mo13379d(this.f15589n.f27483d, this.f15590o.f27483d);
                }
                this.f15591p.f24953h = this.f15590o.f27483d;
                this.f15582d.dispatcher().mo13381g(this.f15591p);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3279e(NearbyLiveFeedLoader nearbyLiveFeedLoader) {
            super(false);
            this.f15571a = nearbyLiveFeedLoader;
        }

        public int calculateIndex(C13920p pVar) {
            C87412m.m108594g(pVar, "data");
            String tag = this.f15571a.getTAG();
            Log.m105924i(tag, "calculateIndex : " + pVar.f39114b);
            if (!pVar.f39114b) {
                return super.calculateIndex(pVar);
            }
            Iterator it = this.f15571a.getDataList().iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C0740i2 i2Var = (C0740i2) it.next();
                if ((i2Var instanceof C0784u1) && C87412m.m108589b(((C0784u1) i2Var).f1834d.f140999e, MMApplicationContext.getResources().getString(C0966R.string.h68))) {
                    break;
                }
                i2++;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            }
            return i + 1;
        }

        public void mergeLoadMore(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            LinkedList<C0740i2> linkedList;
            int i;
            C87412m.m108594g(iResponse, "response");
            Object request = iResponse.getRequest();
            C87412m.m108592e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.FinderLiveFriendsRequest");
            int i2 = ((C3277c) request).f15567h;
            if (i2 == 0) {
                NearbyLiveFeedLoader.m3267d(this.f15571a, false, iResponse.getHasMore(), "mergeLoadMore0");
                super.mergeLoadMore(iResponse, lVar);
                C61926c.m72668M(new C3280a(this.f15571a));
            } else if (i2 == 1) {
                NearbyLiveFeedLoader.m3267d(this.f15571a, true, iResponse.getHasMore(), "mergeLoadMore1");
                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
                List<C0740i2> incrementList = iResponse.getIncrementList();
                cVar.f24952g = incrementList != null ? incrementList.isEmpty() : true;
                cVar.f24951f = true;
                cVar.f24947b = 1;
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null) {
                    incrementList2 = new LinkedList<>();
                }
                Iterator it = this.f15571a.getDataList().iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    C0740i2 i2Var = (C0740i2) it.next();
                    if ((i2Var instanceof C9833k9) && ((C9833k9) i2Var).f30388e == 4) {
                        break;
                    }
                    i3++;
                }
                LinkedList linkedList2 = i3 > 0 ? new LinkedList(this.f15571a.getDataList().subList(0, i3)) : new LinkedList(this.f15571a.getDataList());
                if (i3 <= 0 || (i = i3 + 1) >= this.f15571a.getDataList().size()) {
                    NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15571a;
                    boolean hasMore = iResponse.getHasMore();
                    String tag = nearbyLiveFeedLoader.getTAG();
                    Log.m105924i(tag, "checkIfAddOldRecommendList isFetchFollowMoreResp:" + true + " hasMoreFollowList:" + hasMore + " recommendFeedList:" + nearbyLiveFeedLoader.f15542s.size());
                    linkedList = !hasMore ? nearbyLiveFeedLoader.f15542s : new LinkedList<>();
                } else {
                    NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f15571a;
                    boolean hasMore2 = iResponse.getHasMore();
                    LinkedList linkedList3 = new LinkedList(this.f15571a.getDataList().subList(i, this.f15571a.getDataList().size()));
                    String tag2 = nearbyLiveFeedLoader2.getTAG();
                    Log.m105924i(tag2, "checkIfSaveRecommendList isFetchFollowMoreResp:" + true + " hasMoreFollowList:" + hasMore2 + " recommendList:" + linkedList3.size());
                    nearbyLiveFeedLoader2.f15542s.clear();
                    nearbyLiveFeedLoader2.f15542s.addAll(linkedList3);
                    linkedList = nearbyLiveFeedLoader2.f15542s;
                }
                C8478d0 d0Var = new C8478d0();
                C8478d0 d0Var2 = new C8478d0();
                C8478d0 d0Var3 = new C8478d0();
                C8478d0 d0Var4 = new C8478d0();
                LinkedList linkedList4 = new LinkedList(this.f15571a.getDataList());
                LinkedList linkedList5 = new LinkedList();
                linkedList5.addAll(linkedList2);
                linkedList5.addAll(incrementList2);
                if (!iResponse.getHasMore()) {
                    linkedList5.addAll(linkedList);
                    if (i3 > 0) {
                        d0Var3.f27483d = i3;
                        d0Var4.f27483d = 1;
                        d0Var.f27483d = i3;
                        d0Var2.f27483d = incrementList2.size() + linkedList.size();
                    } else {
                        d0Var3.f27483d = -1;
                        d0Var4.f27483d = 0;
                        d0Var.f27483d = linkedList4.size();
                        d0Var2.f27483d = incrementList2.size() + linkedList.size();
                    }
                } else if (i3 > 0) {
                    d0Var3.f27483d = i3;
                    d0Var4.f27483d = linkedList.size() + 1;
                    d0Var.f27483d = i3;
                    d0Var2.f27483d = incrementList2.size();
                } else {
                    d0Var3.f27483d = -1;
                    d0Var4.f27483d = 0;
                    d0Var.f27483d = linkedList4.size();
                    d0Var2.f27483d = incrementList2.size();
                }
                C9311g2 g2Var = C9311g2.f29093a;
                String b = g2Var.mo10063b(linkedList5);
                String b2 = g2Var.mo10063b(linkedList4);
                String b3 = g2Var.mo10063b(linkedList);
                String tag3 = this.f15571a.getTAG();
                Log.m105924i(tag3, "mergeLoadMore() hasMore:" + iResponse.getHasMore() + " moreFollowCardIndex:" + i3 + " removeIndex:" + d0Var3.f27483d + "  removeSize:" + d0Var4.f27483d + " insertIndex:" + d0Var.f27483d + "  insertSize:" + d0Var2.f27483d + " newList:" + b + " oldList:" + b2 + " oldRecommendList:" + b3);
                C61926c.m72668M(new C3281b(this.f15571a, linkedList5, d0Var3, d0Var4, d0Var, d0Var2, cVar, lVar, iResponse));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ee, code lost:
            if ((r13 != null && r13.f182394f == 1) == false) goto L_0x00f0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0102 A[LOOP:1: B:14:0x00c2->B:36:0x0102, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mergeRefresh(com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> r19, fy3.C32226l<? super com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2>, rx3.C13598b0> r20) {
            /*
                r18 = this;
                r0 = r18
                r7 = r19
                java.lang.String r1 = "response"
                gy3.C87412m.m108594g(r7, r1)
                long r4 = android.os.SystemClock.elapsedRealtime()
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r1 = r0.f15571a
                boolean r2 = r19.getHasMore()
                r3 = 0
                java.lang.String r6 = "mergeRefresh"
                com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.m3267d(r1, r3, r2, r6)
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r1 = r0.f15571a
                java.lang.String r2 = r1.getTAG()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "checkIfClearRecommendList recommendFeedList:"
                r6.append(r8)
                java.util.LinkedList<cm1.i2> r8 = r1.f15542s
                int r8 = r8.size()
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                java.util.LinkedList<cm1.i2> r1 = r1.f15542s
                r1.clear()
                com.tencent.mm.view.RefreshLoadMoreLayout$c r12 = new com.tencent.mm.view.RefreshLoadMoreLayout$c
                r12.<init>(r3)
                boolean r1 = r19.getHasMore()
                r12.f24951f = r1
                r1 = r7
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$d r1 = (com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.C3278d) r1
                te3.gr0 r1 = r1.f15569a
                r12.f24949d = r1
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r1 = r0.f15571a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
                int r1 = r1.size()
                java.util.List r2 = r19.getIncrementList()
                if (r2 != 0) goto L_0x0065
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
            L_0x0065:
                gy3.f0 r6 = new gy3.f0
                r6.<init>()
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                r6.f27484d = r8
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r8 = r0.f15571a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r8.getDataList()
                java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
                cm1.i2 r8 = (cm1.C0740i2) r8
                if (r8 == 0) goto L_0x0094
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r9 = r0.f15571a
                boolean r8 = r8 instanceof cm1.C0717c0
                if (r8 == 0) goto L_0x0094
                T r8 = r6.f27484d
                java.util.LinkedList r8 = (java.util.LinkedList) r8
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r9 = r9.getDataList()
                java.lang.Object r9 = r9.get(r3)
                r8.add(r9)
            L_0x0094:
                T r8 = r6.f27484d
                java.util.LinkedList r8 = (java.util.LinkedList) r8
                r8.addAll(r2)
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r2 = r0.f15571a
                T r8 = r6.f27484d
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
                r9 = 0
                r10 = 0
            L_0x00a7:
                boolean r11 = r8.hasNext()
                r14 = 1
                if (r11 == 0) goto L_0x0119
                java.lang.Object r10 = r8.next()
                int r11 = r9 + 1
                if (r9 < 0) goto L_0x0114
                cm1.i2 r10 = (cm1.C0740i2) r10
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r15 = r2.getDataList()
                java.util.Iterator r15 = r15.iterator()
                r16 = 0
            L_0x00c2:
                boolean r17 = r15.hasNext()
                if (r17 == 0) goto L_0x0106
                java.lang.Object r17 = r15.next()
                r3 = r17
                cm1.i2 r3 = (cm1.C0740i2) r3
                int r17 = r3.mo76f(r10)
                if (r17 != 0) goto L_0x00f0
                boolean r13 = r3 instanceof cm1.C0797z
                if (r13 == 0) goto L_0x00f0
                r13 = r3
                cm1.z r13 = (cm1.C0797z) r13
                com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
                te3.c21 r13 = r13.getLiveInfo()
                if (r13 == 0) goto L_0x00ed
                int r13 = r13.f182394f
                if (r13 != r14) goto L_0x00ed
                r13 = 1
                goto L_0x00ee
            L_0x00ed:
                r13 = 0
            L_0x00ee:
                if (r13 != 0) goto L_0x00fa
            L_0x00f0:
                if (r9 != 0) goto L_0x00fc
                boolean r13 = r10 instanceof cm1.C0717c0
                if (r13 == 0) goto L_0x00fc
                boolean r3 = r3 instanceof cm1.C0717c0
                if (r3 == 0) goto L_0x00fc
            L_0x00fa:
                r3 = 1
                goto L_0x00fd
            L_0x00fc:
                r3 = 0
            L_0x00fd:
                if (r3 == 0) goto L_0x0102
                r3 = r16
                goto L_0x0107
            L_0x0102:
                int r16 = r16 + 1
                r3 = 0
                goto L_0x00c2
            L_0x0106:
                r3 = -1
            L_0x0107:
                r10 = -1
                if (r3 == r10) goto L_0x0110
                if (r3 != r9) goto L_0x0110
                r10 = r9
                r9 = r11
                r3 = 0
                goto L_0x00a7
            L_0x0110:
                int r2 = r9 + -1
                r10 = r2
                goto L_0x0119
            L_0x0114:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x0119:
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r2 = r0.f15571a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
                r8.addAll(r2)
                T r2 = r6.f27484d
                java.util.LinkedList r2 = (java.util.LinkedList) r2
                int r2 = r2.size()
                gy3.d0 r11 = new gy3.d0
                r11.<init>()
                r3 = -1
                r11.f27483d = r3
                gy3.d0 r13 = new gy3.d0
                r13.<init>()
                gy3.d0 r9 = new gy3.d0
                r9.<init>()
                r9.f27483d = r3
                gy3.d0 r15 = new gy3.d0
                r15.<init>()
                if (r2 <= 0) goto L_0x016d
                int r10 = r10 + r14
                if (r10 != r2) goto L_0x0153
                r9.f27483d = r10
                int r1 = r1 - r2
                r15.f27483d = r1
                goto L_0x0179
            L_0x0153:
                if (r10 <= r2) goto L_0x0162
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r1 = r0.f15571a
                java.lang.String r1 = r1.getTAG()
                java.lang.String r2 = "数据出错，需要检查."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
                goto L_0x0179
            L_0x0162:
                r9.f27483d = r10
                int r1 = r1 - r10
                r15.f27483d = r1
                r11.f27483d = r10
                int r2 = r2 - r10
                r13.f27483d = r2
                goto L_0x0179
            L_0x016d:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r1 = r0.f15571a
                java.lang.String r1 = r1.getTAG()
                java.lang.String r2 = "没有新的数据."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            L_0x0179:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$e$c r14 = new com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$e$c
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r2 = r0.f15571a
                r1 = r14
                r3 = r6
                r6 = r8
                r7 = r19
                r8 = r9
                r9 = r15
                r10 = r11
                r11 = r13
                r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
                o40.C61926c.m72668M(r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.C3279e.mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse, fy3.l):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$f */
    public static final class C3283f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveFeedLoader f15592d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<C0740i2> f15593e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3283f(NearbyLiveFeedLoader nearbyLiveFeedLoader, IResponse<C0740i2> iResponse) {
            super(0);
            this.f15592d = nearbyLiveFeedLoader;
            this.f15593e = iResponse;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f15592d.f15533g;
            if (lVar != null) {
                lVar.invoke(this.f15593e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLiveFeedLoader(C49712hj1 hj12, int i, int i2, int i3, String str) {
        super(hj12);
        C87412m.m108594g(str, "by_pass");
        this.f15530d = i;
        this.f15531e = i2;
        this.f15532f = str;
        this.f15536j = i2;
        this.f15537n = i3;
        this.f15542s = new LinkedList<>();
        this.f15545v = new C3274b();
        setTAG("NearbyLiveFeedLoader." + i);
    }

    /* renamed from: d */
    public static final void m3267d(NearbyLiveFeedLoader nearbyLiveFeedLoader, boolean z, boolean z2, String str) {
        String tag = nearbyLiveFeedLoader.getTAG();
        Log.m105924i(tag, "checkIfSetFetchMoreFollowFeed " + str + " isFetchFollowMoreResp:" + z + " hasMoreFollowList:" + z2);
        nearbyLiveFeedLoader.f15541r = z && z2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return this.f15545v;
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3279e(this);
    }

    /* renamed from: e */
    public final void mo3561e(int i, int i2, C51942x91 x912) {
        this.f15536j = i;
        this.f15537n = i2;
        this.f15535i = x912;
        super.requestInit(false);
    }

    /* renamed from: f */
    public final void mo3562f(C51942x91 x912, int i, C89349b bVar, boolean z, long j) {
        C11233b.f33100i.mo11311a(this.f15536j).f33104c = System.currentTimeMillis();
        this.f15545v.mo3563b("requestRefresh");
        this.f15535i = x912;
        this.f15534h = i;
        this.f15544u = j;
        this.f15539p = bVar;
        this.f15540q = z;
        super.requestRefresh();
        this.f15543t = false;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        C61926c.m72668M(new C3283f(this, iResponse));
        C21445b bVar = C21445b.f60694a;
        bVar.mo33618g(this.f15531e);
        super.onFetchDone(iResponse);
        bVar.mo33617f(this.f15531e);
        C11233b.f33100i.mo11311a(this.f15536j).f33107f = System.currentTimeMillis();
        C11232a aVar = C11235c.f33110a;
        C11235c.f33110a.mo12482c("fetchLivesDone");
        isInitOperation(iResponse);
    }

    public void requestLoadMore(C51942x91 x912) {
        if (this.f15543t) {
            Log.m105924i(getTAG(), "requestLoadMore return for isFetchingLoadMore");
            this.f15545v.mo3563b("requestLoadMore");
        }
        String tag = getTAG();
        Log.m105924i(tag, "requestLoadMore isFetchMoreFollowFeed:" + this.f15541r);
        this.f15535i = x912;
        if (this.f15541r) {
            this.f15535i = x912;
            super.requestInsert(new C3277c(2, x912, this.f15538o, this.f15536j, this.f15531e, this.f15530d, this.f15532f, 1, 0, 256, (C8480h) null));
        } else {
            super.requestLoadMore(false);
        }
        this.f15543t = true;
    }
}
