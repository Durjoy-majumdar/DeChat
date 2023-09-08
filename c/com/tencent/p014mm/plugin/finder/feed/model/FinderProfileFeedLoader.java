package com.tencent.p014mm.plugin.finder.feed.model;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import er1.C58784w3;
import f14.C58901s;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32232u;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9377s4;
import kf1.C9632b3;
import kf1.C9664c3;
import kf1.C9683d3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C13798c0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C51108rh0;
import te3.C51243sh0;
import te3.C51270sn1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13908i;
import tf1.C13910j;
import tf1.C13911k;
import wp1.C15585f;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0004\u0001³\u0001\u0018\u00002\u00020\u0001:\bÀ\u0001Á\u0001Â\u0001Ã\u0001B;\u0012\b\u0010»\u0001\u001a\u00030º\u0001\u0012\u0006\u0010'\u001a\u00020&\u0012\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u0001\u0012\b\b\u0002\u0010+\u001a\u00020\u0014\u0012\b\b\u0002\u0010.\u001a\u00020\u0014¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0014J \u0010\u0011\u001a\u00020\t2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0004\u0012\u00020\t0\u000fJ\u0006\u0010\u0012\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0014\u0010\u001a\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u0006\u0010\u001b\u001a\u00020\tJ\u0016\u0010\u001c\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J\u0006\u0010\u001d\u001a\u00020\tJ\u001a\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020$H\u0016R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010.\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*\"\u0004\b1\u00102R6\u00103\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R0\u0010:\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R6\u0010>\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0=\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u00108R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010G\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010J\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010,\u001a\u0004\bK\u0010-\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010,\u001a\u0004\b]\u0010-\"\u0004\b^\u0010MR0\u0010_\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u00104\u001a\u0004\b`\u00106\"\u0004\ba\u00108R\"\u0010b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010h\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bh\u0010,\u001a\u0004\bi\u0010-\"\u0004\bj\u0010MR\"\u0010k\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bk\u0010,\u001a\u0004\bl\u0010-\"\u0004\bm\u0010MR\"\u0010n\u001a\u00020$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010t\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010,\u001a\u0004\bt\u0010-\"\u0004\bu\u0010MR$\u0010v\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R$\u0010|\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b|\u0010w\u001a\u0004\b}\u0010y\"\u0004\b~\u0010{R+\u0010\u0001\u001a\u0004\u0018\u000108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020$8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010o\u001a\u0005\b\u0001\u0010q\"\u0005\b\u0001\u0010sR&\u0010\u0001\u001a\u00020$8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010o\u001a\u0005\b\u0001\u0010q\"\u0005\b\u0001\u0010sRq\u0010\u0001\u001aJ\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u00030\u0001j\t\u0012\u0004\u0012\u00020\u0003`\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0001\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0=8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010B\u001a\u0005\b\u0001\u0010D\"\u0005\b\u0001\u0010FR\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R0\u0010\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00010\u0001j\n\u0012\u0005\u0012\u00030\u0001`\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010 \u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R.\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010B\u001a\u0005\b©\u0001\u0010D\"\u0005\bª\u0001\u0010FR&\u0010«\u0001\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b«\u0001\u0010c\u001a\u0005\b¬\u0001\u0010e\"\u0005\b­\u0001\u0010gR0\u0010¯\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0004\u0012\u00020\t0\u000f0®\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R4\u0010±\u0001\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b±\u0001\u00104\u001a\u0005\b±\u0001\u00106\"\u0005\b²\u0001\u00108R\u0018\u0010´\u0001\u001a\u00030³\u00018\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R3\u0010·\u0001\u001a\u000f\u0012\u0005\u0012\u00030¶\u0001\u0012\u0004\u0012\u00020\t0\u000f8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b·\u0001\u00104\u001a\u0005\b¸\u0001\u00106\"\u0005\b¹\u0001\u00108¨\u0006Ä\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Ltf1/k;", "Lcm1/i2;", "createDataFetch", "Ltf1/e;", "createDataMerger", "", "topicId", "Lrx3/b0;", "switchToTopic", "clearStoreCache", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "initResponse", "onFetchInitDone", "Lkotlin/Function1;", "callback", "callOnNextFetch", "getLastItem", "onDataChanged", "", "interceptPostStart", "isObservePostEvent", "isAuto", "requestLoadMore", "response", "markRead", "clearMarkRead", "onFetchDone", "req2JustWatched", "localId", "isFromSns", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "onPostStart", "onAlive", "onDead", "", "getPageName", "", "username", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "isPreLoadMore", "Z", "()Z", "isThreeColumn", "liveNoticeId", "getLiveNoticeId", "setLiveNoticeId", "(Ljava/lang/String;)V", "fetchEndCallback", "Lfy3/l;", "getFetchEndCallback", "()Lfy3/l;", "setFetchEndCallback", "(Lfy3/l;)V", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$ProfileResponse;", "onFetchCallback", "getOnFetchCallback", "setOnFetchCallback", "Lkotlin/Function0;", "clickToLoadJustWatch", "getClickToLoadJustWatch", "setClickToLoadJustWatch", "cantShowBtn", "Lfy3/a;", "getCantShowBtn", "()Lfy3/a;", "setCantShowBtn", "(Lfy3/a;)V", "cancelLoading", "getCancelLoading", "setCancelLoading", "needToFilterLiveData", "getNeedToFilterLiveData", "setNeedToFilterLiveData", "(Z)V", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;", "state", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;", "getState", "()Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;", "setState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;)V", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$CacheState;", "cachedState", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$CacheState;", "getCachedState", "()Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$CacheState;", "setCachedState", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$CacheState;)V", "readExist", "getReadExist", "setReadExist", "justWathcedCallback", "getJustWathcedCallback", "setJustWathcedCallback", "maxId", "J", "getMaxId", "()J", "setMaxId", "(J)V", "everIn", "getEverIn", "setEverIn", "hasMore", "getHasMore", "setHasMore", "pullLoadMoreCount", "I", "getPullLoadMoreCount", "()I", "setPullLoadMoreCount", "(I)V", "isLoadingMore", "setLoadingMore", "readFeedId", "Ljava/lang/Long;", "getReadFeedId", "()Ljava/lang/Long;", "setReadFeedId", "(Ljava/lang/Long;)V", "collectionId", "getCollectionId", "setCollectionId", "Lkf1/d3;", "justWatchedReq", "Lkf1/d3;", "getJustWatchedReq", "()Lkf1/d3;", "setJustWatchedReq", "(Lkf1/d3;)V", "showJustWatch", "getShowJustWatch", "setShowJustWatch", "allowPrefetch", "getAllowPrefetch", "setAllowPrefetch", "Lkotlin/Function7;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lpe3/b;", "onJustWatchedCallback", "Lfy3/u;", "getOnJustWatchedCallback", "()Lfy3/u;", "setOnJustWatchedCallback", "(Lfy3/u;)V", "finishLoadingMoreCallback", "getFinishLoadingMoreCallback", "setFinishLoadingMoreCallback", "com/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$liveLifeListener$1", "liveLifeListener", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$liveLifeListener$1;", "Lte3/sn1;", "topicFilterList", "Ljava/util/ArrayList;", "getTopicFilterList", "()Ljava/util/ArrayList;", "Lte3/sh0;", "collectionInfoList", "Lte3/sh0;", "getCollectionInfoList", "()Lte3/sh0;", "setCollectionInfoList", "(Lte3/sh0;)V", "onFilterDataChanged", "getOnFilterDataChanged", "setOnFilterDataChanged", "curTopicId", "getCurTopicId", "setCurTopicId", "Ljava/util/LinkedList;", "callOnNextFetchQueue", "Ljava/util/LinkedList;", "isJustWatchingCallback", "setJustWatchingCallback", "com/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$feedStickyListener$1", "feedStickyListener", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$feedStickyListener$1;", "Lcom/tencent/mm/autogen/events/FeedStickyEvent;", "handleStickyEvent", "getHandleStickyEvent", "setHandleStickyEvent", "Ltf1/i;", "scene", "Lte3/hj1;", "contextObj", "<init>", "(Ltf1/i;Ljava/lang/String;Lte3/hj1;ZZ)V", "CacheState", "ProfileDataFetcher", "ProfileResponse", "State", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader */
public final class FinderProfileFeedLoader extends BaseFinderFeedLoader {
    private int allowPrefetch;
    private CacheState cachedState;
    private final LinkedList<C32226l<IResponse<C0740i2>, C13598b0>> callOnNextFetchQueue;
    private C32224a<C13598b0> cancelLoading;
    private C32224a<C13598b0> cantShowBtn;
    private C32226l<? super C32224a<C13598b0>, C13598b0> clickToLoadJustWatch;
    private Long collectionId;
    private C51243sh0 collectionInfoList;
    private long curTopicId;
    private boolean everIn;
    private final FinderProfileFeedLoader$feedStickyListener$1 feedStickyListener;
    private C32226l<? super IResponse<C0740i2>, C13598b0> fetchEndCallback;
    private C32224a<C13598b0> finishLoadingMoreCallback;
    private C32226l<? super FeedStickyEvent, C13598b0> handleStickyEvent;
    private boolean hasMore;
    private C32226l<? super Integer, C13598b0> isJustWatchingCallback;
    private boolean isLoadingMore;
    private final boolean isPreLoadMore;
    private final boolean isThreeColumn;
    private C9683d3 justWatchedReq;
    private C32226l<? super Integer, C13598b0> justWathcedCallback;
    private final FinderProfileFeedLoader$liveLifeListener$1 liveLifeListener;
    private String liveNoticeId;
    private long maxId;
    private boolean needToFilterLiveData;
    private C32226l<? super ProfileResponse, C13598b0> onFetchCallback;
    private C32224a<C13598b0> onFilterDataChanged;
    private C32232u<? super Boolean, ? super Long, ? super Boolean, ? super ArrayList<C0740i2>, ? super C89349b, ? super Integer, ? super Boolean, C13598b0> onJustWatchedCallback;
    private int pullLoadMoreCount;
    private boolean readExist;
    private Long readFeedId;
    private int showJustWatch;
    private State state;
    private final ArrayList<C51270sn1> topicFilterList;
    private final String username;

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$CacheState;", "", "(Ljava/lang/String;I)V", "INIT", "NO_CACHE", "WITH_CACHED", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$CacheState */
    public enum CacheState {
        INIT,
        NO_CACHE,
        WITH_CACHED
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J(\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J2\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001d2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u001fH\u0016¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$ProfileDataFetcher;", "Ltf1/d;", "", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "nowList", "", "username", "", "start", "end", "mergeLocalData", "", "netscene", "Ltf1/j;", "Lcm1/i2;", "callback", "", "isAuto", "Lrx3/b0;", "fetch", "getCmdIds", "Lje1/s4;", "genRefreshNetScene", "Lob0/y;", "genLoadMoreNetScene", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "dealOnSceneEnd", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$ProfileResponse;", "callInit", "<init>", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileDataFetcher */
    public final class ProfileDataFetcher extends C13896d {
        public ProfileDataFetcher() {
        }

        private final List<FinderItem> mergeLocalData(List<? extends FinderItem> list, String str, int i, int i2) {
            if ((str.length() == 0) || !C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
                return list;
            }
            C13911k.Companion.getClass();
            if (C13911k.DEBUG) {
                C58784w3.f168295a.mo83972v1(list, "nowList");
            }
            String tag = getTAG();
            Log.m105924i(tag, "mergeLocalData start " + i + " end " + i2);
            LinkedList linkedList = new LinkedList();
            LinkedList<FinderItem> e = C15585f.f42211a.mo14342e(str, i, i2);
            ArrayList<FinderItem> arrayList = new ArrayList<>();
            for (T next : e) {
                if (((FinderItem) next).getFinderObject().objectType != 2) {
                    arrayList.add(next);
                }
            }
            linkedList.addAll(list);
            C61926c.m72673R(arrayList, new FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1(list));
            linkedList.addAll(0, arrayList);
            C13911k.Companion.getClass();
            if (C13911k.DEBUG) {
                C58784w3.f168295a.mo83972v1(linkedList, "newList");
            }
            String tag2 = getTAG();
            Log.m105924i(tag2, "dblist size:" + arrayList.size());
            for (FinderItem finderItem : arrayList) {
                String tag3 = getTAG();
                Log.m105924i(tag3, "dblist item, localId:" + finderItem.getLocalId() + ", id:" + finderItem.getId());
            }
            return linkedList;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C117747y yVar2 = yVar;
            C87412m.m108594g(yVar2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C9377s4 s4Var = (C9377s4) yVar2;
            C47465a aVar = s4Var.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            if (((FinderUserPageResponse) aVar).privateLock == 1) {
                Log.m105924i(getTAG(), "dealOnSceneEnd private lock");
                ProfileResponse profileResponse = new ProfileResponse(i, i2, str, new ArrayList(), true);
                profileResponse.setIncrementList(C64186f0.f181907d);
                profileResponse.setPullType(s4Var.f29286s);
                profileResponse.setMaxid(s4Var.mo10108n1());
                profileResponse.setHasMore(false);
                profileResponse.setLastBuffer(s4Var.getLastBuffer());
                FinderProfileFeedLoader.this.setState((i == 0 && i2 == 0) ? State.PRIVATE_LOCK : State.FAILURE);
                return profileResponse;
            }
            C58784w3 w3Var = C58784w3.f168295a;
            C58961d.C58963b bVar = C58961d.f168673a;
            C58969q b = bVar.mo84155b(FinderProfileFeedLoader.this.getUsername());
            int i3 = b != null ? b.field_extFlag : 0;
            w3Var.getClass();
            if ((i3 & 32768) != 0) {
                Log.m105924i(getTAG(), "dealOnSceneEnd isUserBlocked");
                ProfileResponse profileResponse2 = new ProfileResponse(i, i2, str, new ArrayList(), true);
                profileResponse2.setIncrementList(C64186f0.f181907d);
                profileResponse2.setPullType(s4Var.f29286s);
                profileResponse2.setMaxid(s4Var.mo10108n1());
                profileResponse2.setHasMore(false);
                profileResponse2.setLastBuffer(s4Var.getLastBuffer());
                FinderProfileFeedLoader.this.setState((i == 0 && i2 == 0) ? State.BLOCKED : State.FAILURE);
                return profileResponse2;
            }
            C58969q b2 = bVar.mo84155b(FinderProfileFeedLoader.this.getUsername());
            int i4 = b2 != null ? b2.field_extFlag : 0;
            w3Var.getClass();
            if ((65536 & i4) != 0) {
                Log.m105924i(getTAG(), "dealOnSceneEnd isUser deleting");
                ProfileResponse profileResponse3 = new ProfileResponse(i, i2, str, new ArrayList(), true);
                profileResponse3.setIncrementList(C64186f0.f181907d);
                profileResponse3.setPullType(s4Var.f29286s);
                profileResponse3.setMaxid(s4Var.mo10108n1());
                profileResponse3.setHasMore(false);
                profileResponse3.setLastBuffer(s4Var.getLastBuffer());
                FinderProfileFeedLoader.this.setState((i == 0 && i2 == 0) ? State.DELETING : State.FAILURE);
                return profileResponse3;
            }
            C51243sh0 sh02 = null;
            if (s4Var.f29278h != FinderProfileFeedLoader.this.getCurTopicId()) {
                return null;
            }
            FinderProfileFeedLoader.this.setState((i == 0 && i2 == 0) ? State.LOADED : State.FAILURE);
            boolean z = (i == 0 && i2 == 0) ? s4Var.f29285r : true;
            List list = s4Var.f29284q;
            if (list == null) {
                list = new LinkedList();
            }
            ArrayList arrayList = new ArrayList();
            if (s4Var.f29286s == 1) {
                if (s4Var.f29278h == 0) {
                    list = mergeLocalData(list, s4Var.f29277g, 0, Integer.MAX_VALUE);
                    arrayList.addAll(s4Var.mo10110p1());
                }
                FinderProfileFeedLoader.this.setShowJustWatch(s4Var.f29290w);
                FinderProfileFeedLoader.this.setAllowPrefetch(s4Var.f29291x);
                C47465a aVar2 = s4Var.f29282o.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
                sh02 = ((FinderUserPageResponse) aVar2).collection_list_info;
            }
            C51243sh0 sh03 = sh02;
            List<FinderItem> list2 = list;
            ProfileResponse profileResponse4 = new ProfileResponse(i, i2, str, arrayList, s4Var.f29278h == 0);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
            for (FinderItem k : list2) {
                arrayList2.add(C15585f.f42211a.mo14348k(k));
            }
            FinderProfileFeedLoader finderProfileFeedLoader = FinderProfileFeedLoader.this;
            ArrayList arrayList3 = new ArrayList();
            for (Object next : arrayList2) {
                if (!(finderProfileFeedLoader.getNeedToFilterLiveData() && ((BaseFinderFeed) next).mo3513o().getMediaType() == 9)) {
                    arrayList3.add(next);
                }
            }
            profileResponse4.setIncrementList(arrayList3);
            profileResponse4.setPullType(s4Var.f29286s);
            profileResponse4.setMaxid(s4Var.mo10108n1());
            profileResponse4.setHasMore(z);
            profileResponse4.setLastBuffer(s4Var.getLastBuffer());
            profileResponse4.setCollectionInfoList(sh03);
            return profileResponse4;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderProfileFeedLoader.this.setState(State.LOADING);
        }

        public C117747y genLoadMoreNetScene() {
            return new C9377s4(FinderProfileFeedLoader.this.getUsername(), FinderProfileFeedLoader.this.getLastItem(), FinderProfileFeedLoader.this.getLastBuffer(), 2, FinderProfileFeedLoader.this.getContextObj(), 0, FinderProfileFeedLoader.this.getCurTopicId(), false, (String) null, 0, (Integer) null, (Long) null, (String) null, FinderProfileFeedLoader.this.isThreeColumn(), false, (Long) null, 57248, (C8480h) null);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3736);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0051 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.ProfileResponse callInit() {
            /*
                r13 = this;
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r0 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.this
                com.tencent.mm.plugin.finder.feed.model.w0 r0 = r0.getCache()
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.util.ArrayList<cm1.i2> r0 = r0.f14079a
                goto L_0x000d
            L_0x000c:
                r0 = r1
            L_0x000d:
                r2 = 9
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L_0x0097
                int r5 = r0.size()
                if (r5 <= 0) goto L_0x0097
                java.lang.String r5 = r13.getTAG()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "use old data list, size: "
                r6.append(r7)
                int r7 = r0.size()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileResponse r5 = new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileResponse
                r8 = 0
                r9 = 0
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r12 = 1
                java.lang.String r10 = ""
                r7 = r5
                r7.<init>(r8, r9, r10, r11, r12)
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r6 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.this
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0051:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L_0x0088
                java.lang.Object r8 = r0.next()
                r9 = r8
                cm1.i2 r9 = (cm1.C0740i2) r9
                boolean r10 = r6.getNeedToFilterLiveData()
                if (r10 == 0) goto L_0x0081
                boolean r10 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r10 == 0) goto L_0x006b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
                goto L_0x006c
            L_0x006b:
                r9 = r1
            L_0x006c:
                if (r9 == 0) goto L_0x007c
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
                if (r9 == 0) goto L_0x007c
                int r9 = r9.getMediaType()
                if (r9 != r2) goto L_0x007c
                r9 = 1
                goto L_0x007d
            L_0x007c:
                r9 = 0
            L_0x007d:
                if (r9 == 0) goto L_0x0081
                r9 = 1
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                if (r9 != 0) goto L_0x0051
                r7.add(r8)
                goto L_0x0051
            L_0x0088:
                r5.setIncrementList(r7)
                com.tencent.mm.plugin.finder.feed.model.w0 r0 = r6.getCache()
                if (r0 == 0) goto L_0x0093
                pe3.b r1 = r0.f14080b
            L_0x0093:
                r5.setLastBuffer(r1)
                return r5
            L_0x0097:
                vp1.o$a r0 = vp1.C14937o.f40972a
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r5 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.this
                java.lang.String r5 = r5.getUsername()
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r6 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.this
                int r6 = r6.getPageName()
                java.util.List r0 = r0.mo13988j(r5, r6)
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r5 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.this
                java.lang.String r5 = r5.getUsername()
                r6 = 2147483647(0x7fffffff, float:NaN)
                java.util.List r0 = r13.mergeLocalData(r0, r5, r4, r6)
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileResponse r11 = new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileResponse
                r6 = 0
                r7 = 0
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r10 = 1
                java.lang.String r8 = ""
                r5 = r11
                r5.<init>(r6, r7, r8, r9, r10)
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r5 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.this
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x00d1:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x00e7
                java.lang.Object r7 = r0.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r7
                wp1.f$a r8 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r8.mo14348k(r7)
                r6.add(r7)
                goto L_0x00d1
            L_0x00e7:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x00f0:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x0116
                java.lang.Object r7 = r6.next()
                r8 = r7
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
                boolean r9 = r5.getNeedToFilterLiveData()
                if (r9 == 0) goto L_0x010f
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
                int r8 = r8.getMediaType()
                if (r8 != r2) goto L_0x010f
                r8 = 1
                goto L_0x0110
            L_0x010f:
                r8 = 0
            L_0x0110:
                if (r8 != 0) goto L_0x00f0
                r0.add(r7)
                goto L_0x00f0
            L_0x0116:
                r11.setIncrementList(r0)
                r11.setLastBuffer(r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.ProfileDataFetcher.callInit():com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileResponse");
        }

        public C9377s4 genRefreshNetScene() {
            String username = FinderProfileFeedLoader.this.getUsername();
            C49712hj1 contextObj = FinderProfileFeedLoader.this.getContextObj();
            long curTopicId = FinderProfileFeedLoader.this.getCurTopicId();
            Long readFeedId = FinderProfileFeedLoader.this.getReadFeedId();
            return new C9377s4(username, 0, (C89349b) null, 1, contextObj, 0, curTopicId, false, (String) null, readFeedId != null ? readFeedId.longValue() : 0, (Integer) null, (Long) null, FinderProfileFeedLoader.this.getLiveNoticeId(), FinderProfileFeedLoader.this.isThreeColumn(), false, FinderProfileFeedLoader.this.getCollectionId(), 19872, (C8480h) null);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b!\u0010\"R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$ProfileResponse;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lcm1/i2;", "Ljava/util/ArrayList;", "Lte3/sn1;", "Lkotlin/collections/ArrayList;", "filterList", "Ljava/util/ArrayList;", "getFilterList", "()Ljava/util/ArrayList;", "", "isRequestAll", "Z", "()Z", "", "maxid", "J", "getMaxid", "()J", "setMaxid", "(J)V", "Lte3/sh0;", "collectionInfoList", "Lte3/sh0;", "getCollectionInfoList", "()Lte3/sh0;", "setCollectionInfoList", "(Lte3/sh0;)V", "", "errType", "errCode", "", "errMsg", "<init>", "(IILjava/lang/String;Ljava/util/ArrayList;Z)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileResponse */
    public static final class ProfileResponse extends IResponse<C0740i2> {
        private C51243sh0 collectionInfoList;
        private final ArrayList<C51270sn1> filterList;
        private final boolean isRequestAll;
        private long maxid;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProfileResponse(int i, int i2, String str, ArrayList<C51270sn1> arrayList, boolean z) {
            super(i, i2, str);
            C87412m.m108594g(arrayList, "filterList");
            this.filterList = arrayList;
            this.isRequestAll = z;
        }

        public final C51243sh0 getCollectionInfoList() {
            return this.collectionInfoList;
        }

        public final ArrayList<C51270sn1> getFilterList() {
            return this.filterList;
        }

        public final long getMaxid() {
            return this.maxid;
        }

        public final boolean isRequestAll() {
            return this.isRequestAll;
        }

        public final void setCollectionInfoList(C51243sh0 sh02) {
            this.collectionInfoList = sh02;
        }

        public final void setMaxid(long j) {
            this.maxid = j;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;", "", "(Ljava/lang/String;I)V", "INIT", "LOADING", "LOADED", "FAILURE", "PRIVATE_LOCK", "BLOCKED", "DELETING", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$State */
    public enum State {
        INIT,
        LOADING,
        LOADED,
        FAILURE,
        PRIVATE_LOCK,
        BLOCKED,
        DELETING
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderProfileFeedLoader(C13908i iVar, String str, C49712hj1 hj12, boolean z, boolean z2, int i, C8480h hVar) {
        this(iVar, str, hj12, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public final void callOnNextFetch(C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.callOnNextFetchQueue.add(lVar);
    }

    public final void clearMarkRead() {
        Long l = this.readFeedId;
        if (l == null) {
            return;
        }
        if (l == null || l.longValue() != -1) {
            this.readFeedId = null;
            this.readExist = false;
            int i = 0;
            for (Object next : getDataList()) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0740i2 i2Var = (C0740i2) next;
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        if (baseFinderFeed.mo3519t()) {
                            baseFinderFeed.mo3500g0(false);
                            dispatcher().mo13378c(i, 1, 2001);
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    public final void clearStoreCache() {
        getStore().f14107f.clear();
    }

    public C13911k<C0740i2> createDataFetch() {
        return new ProfileDataFetcher();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new FinderProfileFeedLoader$createDataMerger$1(this);
    }

    public final int getAllowPrefetch() {
        return this.allowPrefetch;
    }

    public final CacheState getCachedState() {
        return this.cachedState;
    }

    public final C32224a<C13598b0> getCancelLoading() {
        return this.cancelLoading;
    }

    public final C32224a<C13598b0> getCantShowBtn() {
        return this.cantShowBtn;
    }

    public final C32226l<C32224a<C13598b0>, C13598b0> getClickToLoadJustWatch() {
        return this.clickToLoadJustWatch;
    }

    public final Long getCollectionId() {
        return this.collectionId;
    }

    public final C51243sh0 getCollectionInfoList() {
        return this.collectionInfoList;
    }

    public final long getCurTopicId() {
        return this.curTopicId;
    }

    public final boolean getEverIn() {
        return this.everIn;
    }

    public final C32226l<IResponse<C0740i2>, C13598b0> getFetchEndCallback() {
        return this.fetchEndCallback;
    }

    public final C32224a<C13598b0> getFinishLoadingMoreCallback() {
        return this.finishLoadingMoreCallback;
    }

    public final C32226l<FeedStickyEvent, C13598b0> getHandleStickyEvent() {
        return this.handleStickyEvent;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final C9683d3 getJustWatchedReq() {
        return this.justWatchedReq;
    }

    public final C32226l<Integer, C13598b0> getJustWathcedCallback() {
        return this.justWathcedCallback;
    }

    public final long getLastItem() {
        int size = getDataList().size();
        while (true) {
            size--;
            if (-1 >= size) {
                return 0;
            }
            C0740i2 i2Var = (C0740i2) getDataList().get(size);
            if (i2Var instanceof BaseFinderFeed) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                if (baseFinderFeed.mo3513o().getId() != 0) {
                    return baseFinderFeed.mo3513o().getId();
                }
            }
        }
    }

    public final String getLiveNoticeId() {
        return this.liveNoticeId;
    }

    public final long getMaxId() {
        return this.maxId;
    }

    public final boolean getNeedToFilterLiveData() {
        return this.needToFilterLiveData;
    }

    public final C32226l<ProfileResponse, C13598b0> getOnFetchCallback() {
        return this.onFetchCallback;
    }

    public final C32224a<C13598b0> getOnFilterDataChanged() {
        return this.onFilterDataChanged;
    }

    public final C32232u<Boolean, Long, Boolean, ArrayList<C0740i2>, C89349b, Integer, Boolean, C13598b0> getOnJustWatchedCallback() {
        return this.onJustWatchedCallback;
    }

    public int getPageName() {
        return ((this.username.length() == 0) || C87412m.m108589b(this.username, C66785b.f191882e.mo90662O5())) ? 1 : 3;
    }

    public final int getPullLoadMoreCount() {
        return this.pullLoadMoreCount;
    }

    public final boolean getReadExist() {
        return this.readExist;
    }

    public final Long getReadFeedId() {
        return this.readFeedId;
    }

    public final int getShowJustWatch() {
        return this.showJustWatch;
    }

    public final State getState() {
        return this.state;
    }

    public final ArrayList<C51270sn1> getTopicFilterList() {
        return this.topicFilterList;
    }

    public final String getUsername() {
        return this.username;
    }

    public boolean interceptPostStart() {
        return this.curTopicId != 0 || !C87412m.m108589b(this.username, C66785b.f191882e.mo90662O5());
    }

    public final C32226l<Integer, C13598b0> isJustWatchingCallback() {
        return this.isJustWatchingCallback;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public boolean isObservePostEvent() {
        return true;
    }

    public final boolean isPreLoadMore() {
        return this.isPreLoadMore;
    }

    public final boolean isThreeColumn() {
        return this.isThreeColumn;
    }

    public final void markRead(IResponse<C0740i2> iResponse) {
        List<C0740i2> incrementList;
        C87412m.m108594g(iResponse, "response");
        Long l = this.readFeedId;
        if (l != null && l.longValue() != -1 && (incrementList = iResponse.getIncrementList()) != null) {
            for (C0740i2 i2Var : incrementList) {
                if (i2Var instanceof BaseFinderFeed) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (baseFinderFeed.mo3513o().getId() == l.longValue() && !baseFinderFeed.mo3513o().isLiveFeed()) {
                        baseFinderFeed.mo3500g0(true);
                        this.readExist = true;
                    }
                }
            }
        }
    }

    public void onAlive() {
        super.onAlive();
        this.feedStickyListener.alive();
        this.liveLifeListener.alive();
    }

    public void onDataChanged() {
        clearStoreCache();
    }

    public void onDead() {
        super.onDead();
        this.feedStickyListener.dead();
        this.liveLifeListener.dead();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        DataBuffer dataList;
        C32226l<? super Integer, C13598b0> lVar;
        C32226l<? super C32224a<C13598b0>, C13598b0> lVar2;
        C32226l<? super Integer, C13598b0> lVar3;
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar4;
        boolean z;
        C32224a<C13598b0> aVar;
        LinkedList<C51108rh0> linkedList;
        C32226l<? super ProfileResponse, C13598b0> lVar5;
        IResponse<C0740i2> iResponse2 = iResponse;
        C87412m.m108594g(iResponse2, "response");
        markRead(iResponse);
        if (!isInitOperation(iResponse) && (iResponse2 instanceof ProfileResponse) && (lVar5 = this.onFetchCallback) != null) {
            lVar5.invoke(iResponse2);
        }
        boolean z2 = 2 == iResponse.getPullType();
        if (z2) {
            this.isLoadingMore = false;
        } else if (iResponse2 instanceof ProfileResponse) {
            ProfileResponse profileResponse = (ProfileResponse) iResponse2;
            if (profileResponse.isRequestAll()) {
                if (!profileResponse.getFilterList().isEmpty()) {
                    this.topicFilterList.clear();
                    this.topicFilterList.addAll(profileResponse.getFilterList());
                    z = true;
                } else {
                    z = false;
                }
                String tag = getTAG();
                Log.m105924i(tag, "topicFilterList refresh, size:" + this.topicFilterList.size());
                C51243sh0 collectionInfoList2 = profileResponse.getCollectionInfoList();
                this.collectionInfoList = collectionInfoList2;
                if (collectionInfoList2 != null) {
                    z = true;
                }
                String tag2 = getTAG();
                StringBuilder sb = new StringBuilder();
                sb.append("collectionInfoList refresh, size:");
                C51243sh0 sh02 = this.collectionInfoList;
                sb.append((sh02 == null || (linkedList = sh02.f141509d) == null) ? null : Integer.valueOf(linkedList.size()));
                sb.append(", lastBuff:");
                C51243sh0 sh03 = this.collectionInfoList;
                sb.append(sh03 != null ? sh03.f141511f : null);
                Log.m105924i(tag2, sb.toString());
                if (z && (aVar = this.onFilterDataChanged) != null) {
                    aVar.invoke();
                }
            }
        }
        super.onFetchDone(iResponse);
        boolean hasMore2 = iResponse.getHasMore();
        this.hasMore = hasMore2;
        if (!hasMore2 && (lVar4 = this.fetchEndCallback) != null) {
            lVar4.invoke(iResponse2);
        }
        this.cachedState = getDataListJustForAdapter().size() > 0 ? CacheState.WITH_CACHED : CacheState.NO_CACHE;
        this.justWatchedReq = new C9683d3(this.username, this.curTopicId, getContextObj(), getLastBuffer(), this.hasMore, 0, this.readExist, getDataList().size(), this.readFeedId, this.onJustWatchedCallback, this.finishLoadingMoreCallback);
        if (1 == iResponse.getPullType()) {
            boolean z3 = this.readExist;
            if (!z3 && !this.everIn && this.allowPrefetch == 1 && this.showJustWatch == 1) {
                this.isLoadingMore = true;
                req2JustWatched();
                this.everIn = true;
            } else if (z3) {
                DataBuffer dataList2 = getDataList();
                if (dataList2 != null) {
                    int i = 0;
                    for (Object next : dataList2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C0740i2 i2Var = (C0740i2) next;
                            if (i2Var instanceof BaseFinderFeed) {
                                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                                long id = baseFinderFeed.mo3513o().getId();
                                Long l = this.readFeedId;
                                if (l != null && id == l.longValue() && !baseFinderFeed.mo3513o().isLiveFeed() && (lVar3 = this.justWathcedCallback) != null) {
                                    lVar3.invoke(Integer.valueOf(i));
                                }
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
            } else {
                if (this.showJustWatch == 1 && (lVar2 = this.clickToLoadJustWatch) != null) {
                    lVar2.invoke(new FinderProfileFeedLoader$onFetchDone$2(this));
                }
                this.everIn = true;
            }
        } else if (z2 && this.readExist && (dataList = getDataList()) != null) {
            int i3 = 0;
            for (Object next2 : dataList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C0740i2 i2Var2 = (C0740i2) next2;
                    if (i2Var2 instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) i2Var2;
                        long id4 = baseFinderFeed2.mo3513o().getId();
                        Long l2 = this.readFeedId;
                        if (l2 != null && id4 == l2.longValue() && !baseFinderFeed2.mo3513o().isLiveFeed() && (lVar = this.justWathcedCallback) != null) {
                            lVar.invoke(Integer.valueOf(i3));
                        }
                    }
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        LinkedList linkedList2 = new LinkedList(this.callOnNextFetchQueue);
        this.callOnNextFetchQueue.clear();
        Iterator it = linkedList2.iterator();
        C87412m.m108593f(it, "queue.iterator()");
        while (it.hasNext()) {
            ((C32226l) it.next()).invoke(iResponse2);
        }
    }

    public void onFetchInitDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList;
        C87412m.m108594g(iResponse, "initResponse");
        C15585f.C15586a aVar = C15585f.f42211a;
        List<C0740i2> incrementList = iResponse.getIncrementList();
        if (incrementList != null) {
            List<R> z = C13798c0.m13102z(incrementList, BaseFinderFeed.class);
            arrayList = new ArrayList(C36907w.m41090l(z, 10));
            for (R o : z) {
                arrayList.add(o.mo3513o());
            }
        } else {
            arrayList = null;
        }
        aVar.mo14338a(arrayList, getContextObj());
        super.onFetchInitDone(iResponse);
    }

    public BaseFinderFeed onPostStart(long j, boolean z) {
        BaseFinderFeed onPostStart = super.onPostStart(j, z);
        this.cachedState = getDataListJustForAdapter().size() > 0 ? CacheState.WITH_CACHED : CacheState.NO_CACHE;
        return onPostStart;
    }

    public final void req2JustWatched() {
        C9683d3 d3Var = this.justWatchedReq;
        if (d3Var != null) {
            C8477a0 a0Var = new C8477a0();
            if (d3Var.f30085n == 0) {
                d3Var.f30084m = true;
            }
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C9664c3(d3Var, a0Var, (C15601d<? super C9664c3>) null), 3, (Object) null);
        }
    }

    public void requestLoadMore(boolean z) {
        C9683d3 d3Var = this.justWatchedReq;
        if (d3Var != null && !d3Var.f30084m) {
            d3Var.f30085n++;
        }
        if (this.isLoadingMore) {
            Log.m105924i(getTAG(), "isLoadingMore return");
            return;
        }
        this.isLoadingMore = true;
        super.requestLoadMore(z);
    }

    public final void setAllowPrefetch(int i) {
        this.allowPrefetch = i;
    }

    public final void setCachedState(CacheState cacheState) {
        C87412m.m108594g(cacheState, "<set-?>");
        this.cachedState = cacheState;
    }

    public final void setCancelLoading(C32224a<C13598b0> aVar) {
        this.cancelLoading = aVar;
    }

    public final void setCantShowBtn(C32224a<C13598b0> aVar) {
        this.cantShowBtn = aVar;
    }

    public final void setClickToLoadJustWatch(C32226l<? super C32224a<C13598b0>, C13598b0> lVar) {
        this.clickToLoadJustWatch = lVar;
    }

    public final void setCollectionId(Long l) {
        this.collectionId = l;
    }

    public final void setCollectionInfoList(C51243sh0 sh02) {
        this.collectionInfoList = sh02;
    }

    public final void setCurTopicId(long j) {
        this.curTopicId = j;
    }

    public final void setEverIn(boolean z) {
        this.everIn = z;
    }

    public final void setFetchEndCallback(C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
        this.fetchEndCallback = lVar;
    }

    public final void setFinishLoadingMoreCallback(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.finishLoadingMoreCallback = aVar;
    }

    public final void setHandleStickyEvent(C32226l<? super FeedStickyEvent, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.handleStickyEvent = lVar;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setJustWatchedReq(C9683d3 d3Var) {
        this.justWatchedReq = d3Var;
    }

    public final void setJustWatchingCallback(C32226l<? super Integer, C13598b0> lVar) {
        this.isJustWatchingCallback = lVar;
    }

    public final void setJustWathcedCallback(C32226l<? super Integer, C13598b0> lVar) {
        this.justWathcedCallback = lVar;
    }

    public final void setLiveNoticeId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.liveNoticeId = str;
    }

    public final void setLoadingMore(boolean z) {
        this.isLoadingMore = z;
    }

    public final void setMaxId(long j) {
        this.maxId = j;
    }

    public final void setNeedToFilterLiveData(boolean z) {
        this.needToFilterLiveData = z;
    }

    public final void setOnFetchCallback(C32226l<? super ProfileResponse, C13598b0> lVar) {
        this.onFetchCallback = lVar;
    }

    public final void setOnFilterDataChanged(C32224a<C13598b0> aVar) {
        this.onFilterDataChanged = aVar;
    }

    public final void setOnJustWatchedCallback(C32232u<? super Boolean, ? super Long, ? super Boolean, ? super ArrayList<C0740i2>, ? super C89349b, ? super Integer, ? super Boolean, C13598b0> uVar) {
        this.onJustWatchedCallback = uVar;
    }

    public final void setPullLoadMoreCount(int i) {
        this.pullLoadMoreCount = i;
    }

    public final void setReadExist(boolean z) {
        this.readExist = z;
    }

    public final void setReadFeedId(Long l) {
        this.readFeedId = l;
    }

    public final void setShowJustWatch(int i) {
        this.showJustWatch = i;
    }

    public final void setState(State state2) {
        C87412m.m108594g(state2, "<set-?>");
        this.state = state2;
    }

    public final void switchToTopic(long j) {
        long j2 = j;
        String tag = getTAG();
        Log.m105924i(tag, "switchToTopic " + j2);
        if (this.curTopicId != j2) {
            State state2 = this.state;
            State state3 = State.LOADED;
            if (state2 == state3) {
                C2826y0 store = getStore();
                String valueOf = String.valueOf(this.curTopicId);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(getDataList());
                C13598b0 b0Var = C13598b0.f38549a;
                C2819w0 w0Var = new C2819w0(arrayList, getLastBuffer(), 0, (C2780c) null);
                store.getClass();
                C87412m.m108594g(valueOf, "key");
                store.f14107f.put(valueOf, w0Var);
                String tag2 = getTAG();
                Log.m105924i(tag2, "save cache of TopicId:" + this.curTopicId + ", size:" + getDataList().size());
            }
            C32224a<C13598b0> aVar = this.cantShowBtn;
            if (aVar != null) {
                aVar.invoke();
            }
            C9683d3 d3Var = this.justWatchedReq;
            if (d3Var != null) {
                C0001s1 s1Var = C0001s1.f0d;
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C9632b3(d3Var, (C15601d<? super C9632b3>) null), 2, (Object) null);
            }
            getDataList().clear();
            this.state = State.INIT;
            this.cachedState = CacheState.INIT;
            this.curTopicId = j2;
            C2819w0 a = getStore().mo2925a(String.valueOf(j));
            if (a != null) {
                this.state = state3;
                this.cachedState = CacheState.WITH_CACHED;
                getDataList().addAll(a.f14079a);
                setLastBuffer(a.f14080b);
                String tag3 = getTAG();
                Log.m105924i(tag3, "restore cache, topicId:" + j2 + ", size:" + a.f14079a);
                this.justWatchedReq = new C9683d3(this.username, this.curTopicId, getContextObj(), getLastBuffer(), this.hasMore, 0, this.readExist, getDataList().size(), this.readFeedId, this.onJustWatchedCallback, this.finishLoadingMoreCallback);
                dispatcher().mo13376a();
                return;
            }
            this.cachedState = CacheState.NO_CACHE;
            requestRefresh();
            dispatcher().mo13376a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader(C13908i iVar, String str, C49712hj1 hj12, boolean z, boolean z2) {
        super(hj12);
        C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str, "username");
        this.username = str;
        this.isPreLoadMore = z;
        this.isThreeColumn = z2;
        this.liveNoticeId = "";
        this.state = State.INIT;
        this.cachedState = CacheState.INIT;
        this.maxId = getLastItem();
        this.hasMore = true;
        this.pullLoadMoreCount = 3;
        this.onJustWatchedCallback = new FinderProfileFeedLoader$onJustWatchedCallback$1(this);
        this.finishLoadingMoreCallback = new FinderProfileFeedLoader$finishLoadingMoreCallback$1(this);
        C40008f fVar = C40008f.f107254d;
        this.liveLifeListener = new FinderProfileFeedLoader$liveLifeListener$1(this, fVar);
        this.topicFilterList = new ArrayList<>();
        this.callOnNextFetchQueue = new LinkedList<>();
        this.feedStickyListener = new FinderProfileFeedLoader$feedStickyListener$1(this, fVar);
        this.handleStickyEvent = FinderProfileFeedLoader$handleStickyEvent$1.INSTANCE;
    }
}
