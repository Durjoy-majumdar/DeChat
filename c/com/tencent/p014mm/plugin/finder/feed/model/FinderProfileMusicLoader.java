package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C55032t1;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C46543v3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C49712hj1;
import te3.C50807pb1;
import tf1.C13896d;
import tf1.C13910j;
import tf1.C13911k;
import vp1.C14937o;
import wp1.C15585f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileMusicLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader */
public final class FinderProfileMusicLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final String f158694d;

    /* renamed from: e */
    public final String f158695e;

    /* renamed from: f */
    public C55750d f158696f = C55750d.INIT;

    /* renamed from: g */
    public C55747a f158697g = C55747a.INIT;

    /* renamed from: h */
    public C32224a<C13598b0> f158698h;

    /* renamed from: i */
    public final FinderProfileMusicLoader$feedProgressListener$1 f158699i;

    /* renamed from: j */
    public final FinderProfileMusicLoader$musicPlayEventListener$1 f158700j;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader$a */
    public enum C55747a {
        INIT,
        NO_CACHE,
        WITH_CACHED
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader$b */
    public final class C55748b extends C13896d {
        public C55748b() {
        }

        public IResponse<C0740i2> callInit() {
            C14937o.C14938a aVar = C14937o.f40972a;
            String str = FinderProfileMusicLoader.this.f158694d;
            if (str == null) {
                str = "";
            }
            List<FinderItem> j = aVar.mo13988j(str, 17);
            String str2 = FinderProfileMusicLoader.this.f158694d;
            if (str2 == null) {
                str2 = "";
            }
            if (!(str2.length() == 0) && C87412m.m108589b(str2, C66785b.f191882e.mo90662O5())) {
                C13911k.Companion.getClass();
                if (C13911k.DEBUG) {
                    C58784w3.f168295a.mo83972v1(j, "newList");
                }
                Log.m105924i(getTAG(), "mergeLocalData start 0 end 2147483647");
                LinkedList<FinderItem> e = C15585f.f42211a.mo14342e(str2, 0, Integer.MAX_VALUE);
                ArrayList arrayList = new ArrayList();
                for (T next : e) {
                    if (((FinderItem) next).getFeedObject().objectType == 2) {
                        arrayList.add(next);
                    }
                }
                C61926c.m72673R(arrayList, new C2804j0(j));
                List<FinderItem> list = C24564k0.m30743g(j) ? j : null;
                if (list != null) {
                    list.addAll(0, arrayList);
                }
                C13911k.Companion.getClass();
                if (C13911k.DEBUG) {
                    C58784w3.f168295a.mo83972v1(j, "newList");
                }
                String tag = getTAG();
                Log.m105924i(tag, "dblist size:" + arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FinderItem finderItem = (FinderItem) it.next();
                    String tag2 = getTAG();
                    Log.m105924i(tag2, "dblist item, localId:" + finderItem.getLocalId() + ", id:" + finderItem.getId());
                }
            }
            C55749c cVar = new C55749c(0, 0, "");
            ArrayList arrayList2 = new ArrayList();
            for (FinderItem t1Var : j) {
                arrayList2.add(new C55032t1(t1Var));
            }
            cVar.setIncrementList(arrayList2);
            cVar.setLastBuffer((C89349b) null);
            return cVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (!(yVar instanceof C46543v3)) {
                return null;
            }
            FinderProfileMusicLoader finderProfileMusicLoader = FinderProfileMusicLoader.this;
            C55750d dVar = (i == 0 && i2 == 0) ? C55750d.LOADED : C55750d.FAILURE;
            finderProfileMusicLoader.getClass();
            finderProfileMusicLoader.f158696f = dVar;
            C46543v3 v3Var = (C46543v3) yVar;
            Iterable<FinderItem> iterable = v3Var.f125413n;
            if (iterable == null) {
                iterable = C64186f0.f181907d;
            }
            C55749c cVar = new C55749c(i, i2, str);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
            for (FinderItem t1Var : iterable) {
                arrayList.add(new C55032t1(t1Var));
            }
            cVar.setIncrementList(arrayList);
            cVar.setPullType(v3Var.f125412j);
            C47465a aVar = v3Var.f125410h.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMVUserPageResponse");
            boolean z = true;
            if (((C50807pb1) aVar).f139690g != 1) {
                z = false;
            }
            cVar.setHasMore(z);
            C47465a aVar2 = v3Var.f125410h.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMVUserPageResponse");
            cVar.setLastBuffer(((C50807pb1) aVar2).f139689f);
            return cVar;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderProfileMusicLoader finderProfileMusicLoader = FinderProfileMusicLoader.this;
            C55750d dVar = C55750d.LOADING;
            finderProfileMusicLoader.getClass();
            finderProfileMusicLoader.f158696f = dVar;
        }

        public C117747y genLoadMoreNetScene() {
            FinderProfileMusicLoader finderProfileMusicLoader = FinderProfileMusicLoader.this;
            return new C46543v3(finderProfileMusicLoader.f158694d, finderProfileMusicLoader.f158695e, finderProfileMusicLoader.getLastBuffer(), 2, FinderProfileMusicLoader.this.getContextObj());
        }

        public C117747y genRefreshNetScene() {
            FinderProfileMusicLoader finderProfileMusicLoader = FinderProfileMusicLoader.this;
            return new C46543v3(finderProfileMusicLoader.f158694d, finderProfileMusicLoader.f158695e, (C89349b) null, 0, finderProfileMusicLoader.getContextObj());
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(6628);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader$c */
    public static final class C55749c extends IResponse<C0740i2> {
        public C55749c(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader$d */
    public enum C55750d {
        INIT,
        LOADING,
        LOADED,
        FAILURE
    }

    public FinderProfileMusicLoader(String str, String str2, C49712hj1 hj12) {
        super(hj12);
        this.f158694d = str;
        this.f158695e = str2;
        C40008f fVar = C40008f.f107254d;
        this.f158699i = new FinderProfileMusicLoader$feedProgressListener$1(this, fVar);
        this.f158700j = new FinderProfileMusicLoader$musicPlayEventListener$1(this, fVar);
    }

    public void addRvFeed(int i, C0740i2 i2Var) {
        C87412m.m108594g(i2Var, "feed");
        if (i2Var instanceof BaseFinderFeed) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
            if (baseFinderFeed.mo3513o().isMvFeed() && !(i2Var instanceof C55032t1)) {
                getDataList().add(i, transformToMusicData(baseFinderFeed.mo3513o()));
                return;
            }
        }
        getDataList().add(i, i2Var);
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55748b();
    }

    public boolean interceptMvFeed() {
        return true;
    }

    public boolean interceptMvPostStart() {
        return false;
    }

    public boolean isObservePostEvent() {
        return true;
    }

    public void onAlive() {
        super.onAlive();
        this.f158699i.alive();
        this.f158700j.alive();
    }

    public void onDead() {
        super.onDead();
        this.f158699i.dead();
        this.f158700j.dead();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        this.f158697g = getDataListJustForAdapter().size() > 0 ? C55747a.WITH_CACHED : C55747a.NO_CACHE;
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (aVar = this.f158698h) != null) {
            aVar.invoke();
        }
    }

    public void onPostStart(long j) {
        FinderItem d = C15585f.f42211a.mo14341d(j);
        if (d != null && transformToMusicData(d).mo3513o().isMvFeed()) {
            super.onPostStart(j);
        }
    }

    public BaseFinderFeed transformFinderObj(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "feedObj");
        return transformToMusicData(finderItem);
    }

    public BaseFinderFeed transformToMusicData(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "item");
        return new C55032t1(finderItem);
    }
}
