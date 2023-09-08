package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0707a0;
import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.model.C2820x;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import er1.C7847o0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mf1.C10865t;
import o40.C61926c;
import p599lr.C61381b;
import pf1.C62273n;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C13798c0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C51942x91;
import tf1.C13897e;
import uq1.C65464w;
import vp1.C14937o;
import vp1.C65834e;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0004FILO\b&\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001YB\u0013\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bW\u0010XJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0014J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0014J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0014J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0011J\u001a\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0004J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0004J\u0012\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u001dH\u0004J\u0018\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020*H\u0016J \u00104\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00103\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0011H\u0016J\u001e\u00107\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002052\u0006\u00103\u001a\u00020*H\u0016J\u0018\u00108\u001a\u00020\u00062\u0006\u00103\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010:\u001a\u00020*2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0011J\b\u0010;\u001a\u00020*H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020*05H\u0016J\u0012\u0010?\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016J\u000e\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*J\u001c\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020*05J\u000e\u0010C\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*J\u000e\u0010D\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*J\u000e\u0010E\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*R\u0014\u0010G\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006Z"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "Luq1/w;", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "feed", "Lrx3/b0;", "updateFinderPageItem", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "response", "onFetchDone", "initResponse", "onFetchInitDone", "onFetchRefreshDone", "onFetchInsertedDone", "onFetchLoadMoreDone", "onDataChanged", "", "interceptPostStart", "interceptMvPostStart", "interceptMvFeed", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "feedObj", "transformFinderObj", "item", "transformToMusicData", "isObservePostEvent", "onAlive", "onDead", "", "localId", "isFromSns", "onPostStart", "isOk", "onPostEnd", "onPostNotify", "svrID", "onPostOk", "onMvPostStart", "updateProgressByLocalId", "newFeed", "notify", "", "updateByLocalId", "svrId", "updateItem", "feedId", "getItem", "remove", "afterIndex", "removeAll", "index", "insert", "", "feeds", "insertAll", "addRvFeed", "feedLocalId", "removeByLocalId", "getPageName", "colletExtraPageName", "Lte3/x91;", "tabInfo", "requestLoadMore", "key", "startObserveFrom", "opList", "stopObserveFrom", "startSyncDataTo", "stopSyncDataTo", "com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$feedDeleteListener$1", "feedDeleteListener", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$feedDeleteListener$1;", "com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$onExitListener$1", "onExitListener", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$onExitListener$1;", "com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$liveUninterestedListener$1", "liveUninterestedListener", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$liveUninterestedListener$1;", "com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$feedChangeListener$1", "feedChangeListener", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$feedChangeListener$1;", "Lcom/tencent/mm/plugin/finder/feed/model/x;", "syncToGroup", "Lcom/tencent/mm/plugin/finder/feed/model/x;", "Lte3/hj1;", "contextObj", "<init>", "(Lte3/hj1;)V", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader */
public abstract class BaseFinderFeedLoader extends BaseFeedLoader<C0740i2> implements C65464w {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final HashMap<Integer, C2820x> loaderGroupMap = new HashMap<>();
    private byte _hellAccFlag_;
    private final BaseFinderFeedLoader$feedChangeListener$1 feedChangeListener;
    private final BaseFinderFeedLoader$feedDeleteListener$1 feedDeleteListener;
    private final BaseFinderFeedLoader$liveUninterestedListener$1 liveUninterestedListener;
    private final BaseFinderFeedLoader$onExitListener$1 onExitListener;
    private C2820x syncToGroup;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$Companion;", "", "Ljava/util/HashMap;", "", "Lcom/tencent/mm/plugin/finder/feed/model/x;", "loaderGroupMap", "Ljava/util/HashMap;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public BaseFinderFeedLoader() {
        this((C49712hj1) null, 1, (C8480h) null);
    }

    public BaseFinderFeedLoader(C49712hj1 hj12) {
        super(hj12);
        C40008f fVar = C40008f.f107254d;
        this.feedDeleteListener = new BaseFinderFeedLoader$feedDeleteListener$1(this, fVar);
        this.onExitListener = new BaseFinderFeedLoader$onExitListener$1(this, fVar);
        this.liveUninterestedListener = new BaseFinderFeedLoader$liveUninterestedListener$1(this, fVar);
        this.feedChangeListener = new BaseFinderFeedLoader$feedChangeListener$1(this, hj12, fVar);
    }

    /* access modifiers changed from: private */
    public final void updateFinderPageItem(BaseFinderFeed baseFinderFeed) {
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(getPageName()));
        arrayList.addAll(colletExtraPageName());
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            if (intValue2 >= 0) {
                C14937o.f40972a.mo13991m(baseFinderFeed.getItemId(), intValue2, baseFinderFeed.mo3513o().getFeedObject());
            }
        }
    }

    public void addRvFeed(int i, C0740i2 i2Var) {
        C87412m.m108594g(i2Var, "feed");
        getDataList().add(i, i2Var);
    }

    public List<Integer> colletExtraPageName() {
        return new ArrayList();
    }

    public final C0740i2 getItem(long j) {
        Iterator it = getDataList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C0740i2) it.next()).getItemId() == j) {
                break;
            }
            i++;
        }
        if (i == -1 || i >= getDataList().size()) {
            return null;
        }
        return (C0740i2) getDataList().get(i);
    }

    public int getPageName() {
        return -1;
    }

    public int insert(C0740i2 i2Var, int i, boolean z) {
        C87412m.m108594g(i2Var, "feed");
        int indexOf = getDataList().indexOf(i2Var);
        if (indexOf == i) {
            return i;
        }
        if (indexOf >= 0) {
            getDataList().remove(i2Var);
        }
        if (i >= 0) {
            addRvFeed(i, i2Var);
            if (z) {
                dispatcher().mo13379d(i, 1);
            }
        }
        return i;
    }

    public void insertAll(List<? extends C0740i2> list, int i) {
        C87412m.m108594g(list, "feeds");
        if (i >= 0) {
            getDataList().addAll(i, list);
            dispatcher().mo13379d(i, list.size());
        }
    }

    public boolean interceptMvFeed() {
        return false;
    }

    public boolean interceptMvPostStart() {
        return true;
    }

    public boolean interceptPostStart() {
        return false;
    }

    public boolean isObservePostEvent() {
        return false;
    }

    public void onAlive() {
        super.onAlive();
        if (isObservePostEvent()) {
            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12412e(this);
        }
        this.feedDeleteListener.alive();
        this.liveUninterestedListener.alive();
        this.feedChangeListener.alive();
        C7847o0 o0Var = C7847o0.f26422a;
        C49712hj1 contextObj = getContextObj();
        int i = contextObj != null ? contextObj.f134675i : 0;
        DataBuffer dataList = getDataList();
        C87412m.m108594g(dataList, "list");
        if (i > 0 && (i == 18 || i == 17 || i == 25 || i == 20)) {
            C7847o0.f26423b.put(Integer.valueOf(i), dataList);
        }
        this.onExitListener.alive();
    }

    public void onDataChanged() {
    }

    public void onDead() {
        super.onDead();
        if (isObservePostEvent()) {
            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12417j(this);
        }
        this.feedDeleteListener.dead();
        this.liveUninterestedListener.dead();
        this.feedChangeListener.dead();
        this.onExitListener.dead();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        C2820x xVar = this.syncToGroup;
        if (xVar != null) {
            for (Map.Entry next : xVar.f14084b.entrySet()) {
                BaseFinderFeedLoader baseFinderFeedLoader = (BaseFinderFeedLoader) next.getKey();
                List<Integer> list = ((C2820x.C2821a) next.getValue()).f14085a;
                boolean z = false;
                if (!(1000 == iResponse.getPullType())) {
                    if (!(-1 == iResponse.getPullType())) {
                        if (1 == iResponse.getPullType() || iResponse.getPullType() == 0 || 4 == iResponse.getPullType() || 3 == iResponse.getPullType() || 10 == iResponse.getPullType() || 11 == iResponse.getPullType() || 12 == iResponse.getPullType() || 14 == iResponse.getPullType() || 15 == iResponse.getPullType() || 18 == iResponse.getPullType()) {
                            z = true;
                        }
                        if (z) {
                            if (list.contains(1)) {
                                baseFinderFeedLoader.onFetchDone(iResponse);
                            }
                        } else if (list.contains(3)) {
                            baseFinderFeedLoader.onFetchDone(iResponse);
                        }
                    } else if (list.contains(2)) {
                        baseFinderFeedLoader.onFetchDone(iResponse);
                    }
                } else if (list.contains(0)) {
                    baseFinderFeedLoader.onFetchDone(iResponse);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }

    public void onFetchInitDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "initResponse");
        super.onFetchInitDone(iResponse);
        List<C0740i2> incrementList = iResponse.getIncrementList();
        if (incrementList != null) {
            List<R> z = C13798c0.m13102z(incrementList, BaseFinderFeed.class);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(z, 10));
            for (R o : z) {
                arrayList.add(o.mo3513o());
            }
            C10865t.f32442c.mo11085a().mo11084a(arrayList);
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            C62273n nVar = (C62273n) a;
            C49712hj1 contextObj = getContextObj();
            C62273n.m73200l3(nVar, arrayList, contextObj != null ? contextObj.f134675i : 0, getContextObj(), 0, 8, (Object) null);
        }
    }

    public void onFetchInsertedDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchInsertedDone(iResponse);
        List<C0740i2> incrementList = iResponse.getIncrementList();
        if (incrementList != null) {
            List<R> z = C13798c0.m13102z(incrementList, BaseFinderFeed.class);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(z, 10));
            for (R o : z) {
                arrayList.add(o.mo3513o());
            }
            C10865t.f32442c.mo11085a().mo11084a(arrayList);
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            C62273n nVar = (C62273n) a;
            C49712hj1 contextObj = getContextObj();
            C62273n.m73200l3(nVar, arrayList, contextObj != null ? contextObj.f134675i : 0, getContextObj(), 0, 8, (Object) null);
        }
    }

    public void onFetchLoadMoreDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchLoadMoreDone(iResponse);
        List<C0740i2> incrementList = iResponse.getIncrementList();
        if (incrementList != null) {
            List<R> z = C13798c0.m13102z(incrementList, BaseFinderFeed.class);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(z, 10));
            for (R o : z) {
                arrayList.add(o.mo3513o());
            }
            C10865t.f32442c.mo11085a().mo11084a(arrayList);
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            C62273n nVar = (C62273n) a;
            C49712hj1 contextObj = getContextObj();
            C62273n.m73200l3(nVar, arrayList, contextObj != null ? contextObj.f134675i : 0, getContextObj(), 0, 8, (Object) null);
        }
    }

    public void onFetchRefreshDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchRefreshDone(iResponse);
        List<C0740i2> incrementList = iResponse.getIncrementList();
        if (incrementList != null) {
            List<R> z = C13798c0.m13102z(incrementList, BaseFinderFeed.class);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(z, 10));
            for (R o : z) {
                arrayList.add(o.mo3513o());
            }
            C10865t.f32442c.mo11085a().mo11084a(arrayList);
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            C62273n nVar = (C62273n) a;
            C49712hj1 contextObj = getContextObj();
            C62273n.m73200l3(nVar, arrayList, contextObj != null ? contextObj.f134675i : 0, getContextObj(), 0, 8, (Object) null);
        }
    }

    public void onMvPostStart(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "item");
    }

    public void onPostEnd(long j, boolean z) {
        updateItem(j);
    }

    public void onPostNotify(long j, boolean z) {
        updateItem(j);
    }

    public void onPostOk(long j, long j2) {
        BaseFinderFeed updateItem = updateItem(j, j2);
        if (updateItem != null) {
            updateItem.mo3489W(true);
        }
    }

    public BaseFinderFeed onPostStart(long j, boolean z) {
        FinderItem d;
        onDataChanged();
        if (interceptPostStart() || (d = C15585f.f42211a.mo14341d(j)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        BaseFinderFeed transformFinderObj = transformFinderObj(d);
        if (transformFinderObj.mo3513o().isMvFeed() && interceptMvPostStart()) {
            return null;
        }
        String tag = getTAG();
        Log.m105924i(tag, "onPostStart localId " + j + " feed " + transformFinderObj);
        transformFinderObj.mo3508l0(C58739j4.f168176a.mo83687P() ^ true);
        transformFinderObj.mo3510m0(z);
        if (C110818d0.m150916N(getDataList()) instanceof C0707a0) {
            C61926c.m72668M(new BaseFinderFeedLoader$onPostStart$1$1$1(this, transformFinderObj));
        } else {
            arrayList.add(transformFinderObj);
            C13897e.mergeDataAndNotify$default(getMerger(), 2, arrayList, true, (Object) null, 8, (Object) null);
        }
        C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
        C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
        C62273n nVar = (C62273n) a;
        List b = C26236u.m33719b(d);
        C49712hj1 contextObj = getContextObj();
        C62273n.m73200l3(nVar, b, contextObj != null ? contextObj.f134675i : 0, getContextObj(), 0, 8, (Object) null);
        return transformFinderObj;
    }

    public int remove(long j, boolean z) {
        Iterator it = getDataList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C0740i2) it.next()).getItemId() == j) {
                break;
            }
            i++;
        }
        if (i != -1) {
            Object remove = getDataList().remove(i);
            C87412m.m108593f(remove, "dataList.removeAt(index)");
            C0740i2 i2Var = (C0740i2) remove;
            if (z) {
                dispatcher().mo13380e(i, 1);
                onDataChanged();
            }
        }
        return i;
    }

    public void removeAll(int i) {
        int size = getDataList().size();
        if (i != -1 && i <= size) {
            LinkedList linkedList = new LinkedList(getDataList().subList(0, i));
            getDataList().clear();
            getDataList().addAll(linkedList);
            int size2 = size - linkedList.size();
            if (size2 > 0) {
                dispatcher().mo13380e(i, size2);
                onDataChanged();
            }
        }
    }

    public final int removeByLocalId(long j, boolean z) {
        Iterator it = getDataList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C0740i2 i2Var = (C0740i2) it.next();
            if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getLocalId() == j) {
                break;
            }
            i++;
        }
        if (i != -1) {
            Object remove = getDataList().remove(i);
            C87412m.m108593f(remove, "dataList.removeAt(index)");
            C0740i2 i2Var2 = (C0740i2) remove;
            if (z) {
                dispatcher().mo13380e(i, 1);
            }
        }
        return i;
    }

    public void requestLoadMore(C51942x91 x912) {
    }

    public final void startObserveFrom(int i) {
        HashMap<Integer, C2820x> hashMap = loaderGroupMap;
        Integer valueOf = Integer.valueOf(i);
        C2820x xVar = hashMap.get(valueOf);
        if (xVar == null) {
            xVar = new C2820x(i);
            hashMap.put(valueOf, xVar);
        }
        xVar.f14084b.put(this, new C2820x.C2821a(this, C64197v.m75537f(0, 2, 3, 1)));
    }

    public final void startSyncDataTo(int i) {
        HashMap<Integer, C2820x> hashMap = loaderGroupMap;
        Integer valueOf = Integer.valueOf(i);
        C2820x xVar = hashMap.get(valueOf);
        if (xVar == null) {
            xVar = new C2820x(i);
            hashMap.put(valueOf, xVar);
        }
        this.syncToGroup = xVar;
    }

    public final void stopObserveFrom(int i) {
        HashMap<Integer, C2820x> hashMap = loaderGroupMap;
        Integer valueOf = Integer.valueOf(i);
        C2820x xVar = hashMap.get(valueOf);
        if (xVar == null) {
            xVar = new C2820x(i);
            hashMap.put(valueOf, xVar);
        }
        xVar.f14084b.remove(this);
    }

    public final void stopSyncDataTo(int i) {
        C2820x xVar = this.syncToGroup;
        boolean z = false;
        if (xVar != null && xVar.f14083a == i) {
            z = true;
        }
        if (z) {
            this.syncToGroup = null;
        }
    }

    public BaseFinderFeed transformFinderObj(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "feedObj");
        return C15585f.f42211a.mo14348k(finderItem);
    }

    public BaseFinderFeed transformToMusicData(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "item");
        return transformFinderObj(finderItem);
    }

    public final int updateByLocalId(BaseFinderFeed baseFinderFeed, boolean z) {
        C87412m.m108594g(baseFinderFeed, "newFeed");
        if (baseFinderFeed.mo3513o().getLocalId() <= 0) {
            return -1;
        }
        int i = 0;
        for (Object next : getDataList()) {
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if (i2Var instanceof BaseFinderFeed) {
                    BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) i2Var;
                    if (baseFinderFeed2.mo3513o().getLocalId() == baseFinderFeed.mo3513o().getLocalId()) {
                        baseFinderFeed.mo3508l0(baseFinderFeed2.mo3468B());
                        baseFinderFeed.mo3510m0(baseFinderFeed2.mo3469C());
                        getDataList().set(i, baseFinderFeed);
                        if (z) {
                            String tag = getTAG();
                            Log.m105924i(tag, "updateByLocalId " + baseFinderFeed.mo3513o().getLocalId());
                            if (interceptMvFeed()) {
                                dispatcher().mo13378c(i, 1, new C13604l(20, 1));
                            } else {
                                dispatcher().mo13378c(i, 1, 1);
                            }
                        }
                        return i;
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return -1;
    }

    public final BaseFinderFeed updateItem(long j, long j2) {
        FinderItem e = C65834e.f189316a.mo89871e(j2);
        if (e != null) {
            e.setLocalId(j);
        }
        if (e == null) {
            return null;
        }
        String tag = getTAG();
        Log.m105924i(tag, "updateItem localId:" + j + " itemLoadId:" + e.getLocalId() + " itemId:" + e.getId());
        C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
        C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
        C62273n nVar = (C62273n) a;
        List b = C26236u.m33719b(e);
        C49712hj1 contextObj = getContextObj();
        C62273n.m73200l3(nVar, b, contextObj != null ? contextObj.f134675i : 0, getContextObj(), 0, 8, (Object) null);
        BaseFinderFeed transformFinderObj = transformFinderObj(e);
        updateByLocalId(transformFinderObj, true);
        return transformFinderObj;
    }

    public final void updateProgressByLocalId(long j) {
        if (j > 0) {
            C61926c.m72668M(new BaseFinderFeedLoader$updateProgressByLocalId$1(this, j));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseFinderFeedLoader(C49712hj1 hj12, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : hj12);
    }

    public final void updateItem(long j) {
        FinderItem d = C15585f.f42211a.mo14341d(j);
        if (d != null) {
            String tag = getTAG();
            Log.m105924i(tag, "updateItem localId:" + j + " itemLoadId:" + d.getLocalId() + " itemId:" + d.getId());
            updateByLocalId(transformFinderObj(d), true);
        }
    }

    public final void startObserveFrom(int i, List<Integer> list) {
        C87412m.m108594g(list, "opList");
        HashMap<Integer, C2820x> hashMap = loaderGroupMap;
        Integer valueOf = Integer.valueOf(i);
        C2820x xVar = hashMap.get(valueOf);
        if (xVar == null) {
            xVar = new C2820x(i);
            hashMap.put(valueOf, xVar);
        }
        xVar.f14084b.put(this, new C2820x.C2821a(this, list));
    }

    public void onPostStart(long j) {
        onPostStart(j, false);
    }
}
