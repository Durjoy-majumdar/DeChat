package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import it1.C60628i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import je1.C9333l3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C50861pq0;
import tf1.C13897e;
import tf1.C13899f;
import tf1.C13900g;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import wp1.C15585f;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderHotWordFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "e", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader */
public class FinderHotWordFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public volatile C2690d f13625d;

    /* renamed from: e */
    public C2687a f13626e = new C2687a();

    /* renamed from: f */
    public boolean f13627f;

    /* renamed from: g */
    public int f13628g = -1;

    /* renamed from: h */
    public String f13629h;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$a */
    public final class C2687a extends C13911k<C0740i2> implements C11385n {

        /* renamed from: d */
        public C13910j<C0740i2> f13630d;

        /* renamed from: e */
        public HashSet<C117747y> f13631e = new HashSet<>();

        public C2687a() {
        }

        public void alive() {
            super.alive();
            FinderHotWordFeedLoader.this.f13627f = false;
            C86709a0.m107524d().mo123455a(WearableStatusCodes.UNKNOWN_CAPABILITY, this);
        }

        public void dead() {
            super.dead();
            C86709a0.m107524d().mo123470p(WearableStatusCodes.UNKNOWN_CAPABILITY, this);
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            if (obj instanceof C2690d) {
                this.f13630d = jVar;
                C2690d dVar = (C2690d) obj;
                dVar.mo2717a();
                this.f13631e.add(dVar.f13641b);
            }
        }

        public void fetchInit(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
            jVar.onFetchDone(new C13899f());
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String tag = getTAG();
            Log.m105924i(tag, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
            if (yVar != null && (yVar instanceof C9333l3)) {
                boolean remove = this.f13631e.remove(yVar);
                String tag2 = getTAG();
                Log.m105924i(tag2, "isRemoved :" + remove);
                if (remove) {
                    C2691e eVar = new C2691e(i, i2, str);
                    if (i == 0 && i2 == 0) {
                        C9333l3 l3Var = (C9333l3) yVar;
                        C47465a aVar = l3Var.f29154g.f127056b.f127083a;
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderHotWordStreamResp");
                        eVar.setLastBuffer(((C50861pq0) aVar).f139902e);
                        LinkedList<FinderObject> l1 = l3Var.mo10077l1();
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(l1, 10));
                        for (FinderObject a : l1) {
                            FinderItem a2 = FinderItem.Companion.mo79056a(a, 69632);
                            FinderTopicFeedUI.f14881D.put(Long.valueOf(a2.getId()), a2);
                            arrayList.add(C15585f.f42211a.mo14348k(a2));
                        }
                        eVar.setIncrementList(arrayList);
                        C47465a aVar2 = l3Var.f29154g.f127056b.f127083a;
                        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderHotWordStreamResp");
                        eVar.setHasMore(((C50861pq0) aVar2).f139903f != 0);
                        Log.m105924i(getTAG(), "onSceneEnd");
                    }
                    C13910j<C0740i2> jVar = this.f13630d;
                    if (jVar != null) {
                        jVar.onFetchDone(eVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$b */
    public static final class C2688b extends C2690d {

        /* renamed from: c */
        public final int f13633c;

        /* renamed from: d */
        public final C89349b f13634d;

        /* renamed from: e */
        public final C89349b f13635e;

        /* renamed from: f */
        public final C49712hj1 f13636f;

        public C2688b(int i, C89349b bVar, C89349b bVar2, C49712hj1 hj12) {
            this.f13633c = i;
            this.f13634d = bVar;
            this.f13635e = bVar2;
            this.f13636f = hj12;
            this.f13640a = "Finder.FinderTopicFeedLoader.HotWordLoadMoreRequest";
        }

        /* renamed from: a */
        public void mo2717a() {
            this.f13641b = new C9333l3(this.f13634d, this.f13633c, this.f13635e, this.f13636f);
            C86709a0.m107524d().mo123460f(this.f13641b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("hashCode: ");
            sb.append(hashCode());
            sb.append(", sceneType:");
            sb.append(this.f13633c);
            sb.append(", lastBuffer:");
            C89349b bVar = this.f13634d;
            String str = "null";
            sb.append(bVar == null ? str : MD5Util.getMD5String(bVar.f257327a));
            sb.append(", byPassInfo:");
            C89349b bVar2 = this.f13635e;
            if (bVar2 != null) {
                str = MD5Util.getMD5String(bVar2.f257327a);
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$c */
    public static final class C2689c extends C2690d {

        /* renamed from: c */
        public final int f13637c;

        /* renamed from: d */
        public final C89349b f13638d;

        /* renamed from: e */
        public final C49712hj1 f13639e;

        public C2689c(int i, C89349b bVar, C49712hj1 hj12) {
            this.f13637c = i;
            this.f13638d = bVar;
            this.f13639e = hj12;
            this.f13640a = "Finder.FinderTopicFeedLoader.HotWordRefreshRequest";
        }

        /* renamed from: a */
        public void mo2717a() {
            this.f13641b = new C9333l3((C89349b) null, this.f13637c, this.f13638d, this.f13639e);
            C86709a0.m107524d().mo123460f(this.f13641b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("hashCode: ");
            sb.append(hashCode());
            sb.append(", sceneType:");
            sb.append(this.f13637c);
            sb.append(", byPassInfo:");
            C89349b bVar = this.f13638d;
            sb.append(bVar == null ? "null" : MD5Util.getMD5String(bVar.f257327a));
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$d */
    public static abstract class C2690d {

        /* renamed from: a */
        public String f13640a = "Finder.FinderTopicFeedLoader.HotWordRequest";

        /* renamed from: b */
        public C60628i f13641b;

        /* renamed from: a */
        public abstract void mo2717a();

        public String toString() {
            return "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$e */
    public static final class C2691e extends IResponse<C0740i2> {
        public C2691e(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$f */
    public static final class C2692f extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderHotWordFeedLoader f13642a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$f$a */
        public static final class C2693a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2692f f13643d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13644e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13645f;

            /* renamed from: g */
            public final /* synthetic */ FinderHotWordFeedLoader f13646g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13647h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13648i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2693a(C2692f fVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderHotWordFeedLoader finderHotWordFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13643d = fVar;
                this.f13644e = tVar;
                this.f13645f = cVar;
                this.f13646g = finderHotWordFeedLoader;
                this.f13647h = lVar;
                this.f13648i = iResponse;
            }

            public Object invoke() {
                this.f13643d.convertOpToReason(this.f13644e, this.f13645f);
                C13900g.m13322f(this.f13646g.dispatcher(), this.f13645f, false, 2, (Object) null);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13647h;
                if (lVar != null) {
                    lVar.invoke(this.f13648i);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader$f$b */
        public static final class C2694b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2692f f13649d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13650e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13651f;

            /* renamed from: g */
            public final /* synthetic */ FinderHotWordFeedLoader f13652g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13653h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13654i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2694b(C2692f fVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderHotWordFeedLoader finderHotWordFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13649d = fVar;
                this.f13650e = tVar;
                this.f13651f = cVar;
                this.f13652g = finderHotWordFeedLoader;
                this.f13653h = lVar;
                this.f13654i = iResponse;
            }

            public Object invoke() {
                this.f13649d.convertOpToReason(this.f13650e, this.f13651f);
                this.f13652g.dispatcher().mo13381g(this.f13651f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13653h;
                if (lVar != null) {
                    lVar.invoke(this.f13654i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2692f(FinderHotWordFeedLoader finderHotWordFeedLoader) {
            super(finderHotWordFeedLoader, false, 1, (C8480h) null);
            this.f13642a = finderHotWordFeedLoader;
        }

        public void mergeLoadMore(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            cVar.f24952g = incrementList != null ? incrementList.isEmpty() : true;
            cVar.f24951f = iResponse.getHasMore();
            cVar.f24950e = iResponse;
            C61926c.m72668M(new C2693a(this, new C13923t(iResponse.getHasMore() ? 1 : 5, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), cVar, this.f13642a, lVar, iResponse));
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
            cVar.f24950e = iResponse;
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            String tag = this.f13642a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f13642a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2694b(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13642a, lVar, iResponse));
                }
            } else if (this.f13642a.getDataList().size() == 0 || size == 0 || this.f13642a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null || !incrementList2.containsAll(C110818d0.m150953y0(this.f13642a.getDataList()))) {
                    z = false;
                }
                if (z) {
                    i = 6;
                    C61926c.m72668M(new C2694b(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13642a, lVar, iResponse));
                }
            }
            i = 4;
            C61926c.m72668M(new C2694b(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13642a, lVar, iResponse));
        }
    }

    public FinderHotWordFeedLoader(int i, C49712hj1 hj12) {
        super(hj12);
    }

    public C13911k<C0740i2> createDataFetch() {
        return this.f13626e;
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2692f(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        String str;
        C87412m.m108594g(iResponse, "response");
        String tag = getTAG();
        Object[] objArr = new Object[1];
        List<C0740i2> incrementList = iResponse.getIncrementList();
        byte[] bArr = null;
        objArr[0] = incrementList != null ? Integer.valueOf(incrementList.size()) : null;
        Log.m105925i(tag, "onFetchDone %d feeds", objArr);
        if (iResponse instanceof C2691e) {
            String tag2 = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("incrementCount ");
            List<C0740i2> incrementList2 = iResponse.getIncrementList();
            sb.append(incrementList2 != null ? Integer.valueOf(incrementList2.size()) : null);
            sb.append("lastBuffer ");
            String str2 = "null";
            if (getLastBuffer() == null) {
                str = str2;
            } else {
                C89349b lastBuffer = getLastBuffer();
                str = MD5Util.getMD5String(lastBuffer != null ? lastBuffer.f257327a : null);
            }
            sb.append(str);
            sb.append(", resp buffer ");
            if (iResponse.getLastBuffer() != null) {
                C89349b lastBuffer2 = iResponse.getLastBuffer();
                if (lastBuffer2 != null) {
                    bArr = lastBuffer2.f257327a;
                }
                str2 = MD5Util.getMD5String(bArr);
            }
            sb.append(str2);
            Log.m105924i(tag2, sb.toString());
            if (this.f13625d instanceof C2689c) {
                setLastBuffer(iResponse.getLastBuffer());
            } else if (this.f13625d instanceof C2688b) {
                setLastBuffer(iResponse.getLastBuffer());
            }
            if (this.f13625d instanceof C2689c) {
                iResponse.setPullType(1);
            } else {
                iResponse.setPullType(2);
                this.f13627f = false;
            }
            boolean z = this.f13625d instanceof C2689c;
        }
        super.onFetchDone(iResponse);
    }

    public void onSaveLastBuffer(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
    }

    public void requestLoadMore(boolean z) {
        C89349b bVar;
        byte[] bArr;
        if (this.f13627f) {
            Log.m105924i(getTAG(), "already load more,return");
            return;
        }
        boolean z2 = true;
        this.f13627f = true;
        C89349b lastBuffer = getLastBuffer();
        Log.m105924i(getTAG(), "requestLoadMore tag");
        String str = this.f13629h;
        if (!(str == null || str.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            String str2 = this.f13629h;
            if (str2 != null) {
                bArr = str2.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            bVar = new C89349b(bArr);
        } else {
            bVar = null;
        }
        C2688b bVar2 = new C2688b(this.f13628g, bVar, lastBuffer, getContextObj());
        Log.m105924i(bVar2.f13640a, bVar2.toString());
        BaseFeedLoader.request$default(this, bVar2, (C13910j) null, 2, (Object) null);
        this.f13625d = bVar2;
    }

    public void requestRefresh() {
    }
}
