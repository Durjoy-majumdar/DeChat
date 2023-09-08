package com.tencent.p014mm.plugin.finder.feed.model;

import android.text.TextUtils;
import cm1.C0714b2;
import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46549x3;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C48700ae1;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13910j;
import tf1.C13911k;
import vp1.C14937o;
import vp1.C14944s;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileQQMusicLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileQQMusicLoader */
public final class FinderProfileQQMusicLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final int f158713d;

    /* renamed from: e */
    public final String f158714e;

    /* renamed from: f */
    public final String f158715f;

    /* renamed from: g */
    public C55754d f158716g = C55754d.INIT;

    /* renamed from: h */
    public C55751a f158717h = C55751a.INIT;

    /* renamed from: i */
    public C32228q<? super Boolean, ? super Boolean, ? super List<? extends C0740i2>, C13598b0> f158718i;

    /* renamed from: j */
    public final FinderProfileQQMusicLoader$musicPlayEventListener$1 f158719j = new FinderProfileQQMusicLoader$musicPlayEventListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileQQMusicLoader$a */
    public enum C55751a {
        INIT,
        NO_CACHE,
        WITH_CACHED
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileQQMusicLoader$b */
    public final class C55752b extends C13896d {
        public C55752b() {
        }

        public IResponse<C0740i2> callInit() {
            C14937o.C14938a aVar = C14937o.f40972a;
            String str = FinderProfileQQMusicLoader.this.f158714e;
            if (str == null) {
                str = "";
            }
            List<FinderItem> j = aVar.mo13988j(str, 19);
            C55753c cVar = new C55753c(0, 0, "");
            FinderProfileQQMusicLoader finderProfileQQMusicLoader = FinderProfileQQMusicLoader.this;
            ArrayList arrayList = new ArrayList();
            for (FinderItem d : j) {
                arrayList.add(finderProfileQQMusicLoader.transformToMusicData(d));
            }
            cVar.setIncrementList(arrayList);
            cVar.setLastBuffer((C89349b) null);
            return cVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3 = i;
            int i4 = i2;
            C117747y yVar2 = yVar;
            C87412m.m108594g(yVar2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (!(yVar2 instanceof C46549x3)) {
                return null;
            }
            FinderProfileQQMusicLoader finderProfileQQMusicLoader = FinderProfileQQMusicLoader.this;
            C55754d dVar = (i3 == 0 && i4 == 0) ? C55754d.LOADED : C55754d.FAILURE;
            finderProfileQQMusicLoader.getClass();
            finderProfileQQMusicLoader.f158716g = dVar;
            C46549x3 x3Var = (C46549x3) yVar2;
            Iterable<FinderItem> iterable = x3Var.f125435n;
            if (iterable == null) {
                iterable = C64186f0.f181907d;
            }
            if (x3Var.f125434j != 2) {
                String str2 = FinderProfileQQMusicLoader.this.f158714e;
                if (str2 == null) {
                    str2 = C66785b.f191882e.mo90662O5();
                }
                LinkedList linkedList = new LinkedList();
                for (FinderItem finderItem : iterable) {
                    C14944s sVar = r11;
                    C14944s sVar2 = new C14944s(0, finderItem.getFinderObject().f164794id, finderItem.getFinderObject(), 196608, false, 16, (C8480h) null);
                    linkedList.add(sVar);
                }
                if (linkedList.size() > 0) {
                    C14937o.C14938a aVar = C14937o.f40972a;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = C66785b.f191882e.mo90662O5();
                    } else {
                        C87412m.m108591d(str2);
                    }
                    aVar.mo13980a(19, str2, linkedList);
                }
            }
            C55753c cVar = new C55753c(i3, i4, str);
            FinderProfileQQMusicLoader finderProfileQQMusicLoader2 = FinderProfileQQMusicLoader.this;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
            for (FinderItem d : iterable) {
                arrayList.add(finderProfileQQMusicLoader2.transformToMusicData(d));
            }
            cVar.setIncrementList(arrayList);
            cVar.setPullType(x3Var.f125434j);
            C47465a aVar2 = x3Var.f125433i.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicUserPageResponse");
            cVar.setHasMore(((C48700ae1) aVar2).f130468f == 1);
            C47465a aVar3 = x3Var.f125433i.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicUserPageResponse");
            cVar.setLastBuffer(((C48700ae1) aVar3).f130469g);
            return cVar;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderProfileQQMusicLoader finderProfileQQMusicLoader = FinderProfileQQMusicLoader.this;
            C55754d dVar = C55754d.LOADING;
            finderProfileQQMusicLoader.getClass();
            finderProfileQQMusicLoader.f158716g = dVar;
        }

        public C117747y genLoadMoreNetScene() {
            FinderProfileQQMusicLoader finderProfileQQMusicLoader = FinderProfileQQMusicLoader.this;
            return new C46549x3(finderProfileQQMusicLoader.f158713d, finderProfileQQMusicLoader.f158714e, finderProfileQQMusicLoader.f158715f, finderProfileQQMusicLoader.getLastBuffer(), 2, FinderProfileQQMusicLoader.this.getContextObj());
        }

        public C117747y genRefreshNetScene() {
            FinderProfileQQMusicLoader finderProfileQQMusicLoader = FinderProfileQQMusicLoader.this;
            return new C46549x3(finderProfileQQMusicLoader.f158713d, finderProfileQQMusicLoader.f158714e, finderProfileQQMusicLoader.f158715f, (C89349b) null, 0, finderProfileQQMusicLoader.getContextObj());
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(5999);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileQQMusicLoader$c */
    public static final class C55753c extends IResponse<C0740i2> {
        public C55753c(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileQQMusicLoader$d */
    public enum C55754d {
        INIT,
        LOADING,
        LOADED,
        FAILURE
    }

    public FinderProfileQQMusicLoader(int i, String str, String str2, C49712hj1 hj12) {
        super(hj12);
        this.f158713d = i;
        this.f158714e = str;
        this.f158715f = str2;
    }

    public void addRvFeed(int i, C0740i2 i2Var) {
        C87412m.m108594g(i2Var, "feed");
        if (!(i2Var instanceof BaseFinderFeed) || (i2Var instanceof C0714b2)) {
            getDataList().add(i, i2Var);
        } else {
            getDataList().add(i, transformToMusicData(((BaseFinderFeed) i2Var).mo3513o()));
        }
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55752b();
    }

    /* renamed from: d */
    public C0714b2 transformToMusicData(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "item");
        C0714b2 b2Var = new C0714b2(finderItem);
        b2Var.f1714g = 1;
        return b2Var;
    }

    public void onAlive() {
        super.onAlive();
        this.f158719j.alive();
    }

    public void onDead() {
        super.onDead();
        this.f158719j.dead();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        this.f158717h = getDataListJustForAdapter().size() > 0 ? C55751a.WITH_CACHED : C55751a.NO_CACHE;
        boolean isInitOperation = isInitOperation(iResponse);
        C32228q<? super Boolean, ? super Boolean, ? super List<? extends C0740i2>, C13598b0> qVar = this.f158718i;
        if (qVar != null) {
            qVar.invoke(Boolean.valueOf(isInitOperation), Boolean.valueOf(iResponse.getHasMore()), iResponse.getIncrementList());
        }
    }

    public BaseFinderFeed transformFinderObj(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "feedObj");
        return interceptMvFeed() ? transformToMusicData(finderItem) : super.transformFinderObj(finderItem);
    }
}
