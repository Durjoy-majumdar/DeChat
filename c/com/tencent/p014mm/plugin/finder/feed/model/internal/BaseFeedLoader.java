package com.tencent.p014mm.plugin.finder.feed.model.internal;

import android.content.Intent;
import androidx.recyclerview.widget.C54258u;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.C2826y0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C49712hj1;
import tf1.C13897e;
import tf1.C13900g;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13913l;
import tf1.C13914m;
import tf1.C13915n;
import tf1.C13920p;
import tf1.C13921q;
import tf1.C13923t;
import vx3.C90875b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001eB\u0013\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010O¢\u0006\u0004\bd\u0010TJ\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fJ:\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0019\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0014\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0014\u0010\u001e\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0014\u0010\u001f\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0016\u0010 \u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0014\u0010!\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0016\u0010#\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0014J\u0016\u0010$\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0014J\u0016\u0010%\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0014J\u0016\u0010&\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0014J\"\u0010(\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004J\u0010\u0010+\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u001cJ\u0006\u0010,\u001a\u00020\u0007J\u001a\u0010,\u001a\u00020\u00072\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016J\b\u0010-\u001a\u00020\u0007H\u0016J\u0012\u0010/\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u001cH\u0016J\u0010\u00100\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0016J\u0014\u00107\u001a\u00020\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005J\u001c\u0010;\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u001c2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000709R\u001a\u0010=\u001a\u00020<8\u0004X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR!\u0010L\u001a\b\u0012\u0004\u0012\u00028\u0000018BX\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR(\u0010U\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010O8F@FX\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010P\u001a\u0004\u0018\u00010\u00128F@FX\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010_\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010c\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bb\u0010a¨\u0006f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Ltf1/m;", "T", "Lcom/tencent/mm/plugin/finder/feed/model/internal/Dispatcher;", "Ltf1/j;", "Landroid/content/Intent;", "intent", "Lrx3/b0;", "initFromCache", "initBackCache", "", "position", "Lcom/tencent/mm/plugin/finder/feed/model/c;", "customData", "saveCache", "", "Lcm1/i2;", "feedList", "Lpe3/b;", "lastBuffer", "saveCacheToIntent", "Lcom/tencent/mm/plugin/finder/feed/model/w0;", "cache", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "response", "onSaveLastBuffer", "onAlive", "onDead", "", "isRefreshOperation", "isInsertOperation", "isInitOperation", "onFetchDone", "isInsertSpecifyOperation", "initResponse", "onFetchInitDone", "onFetchRefreshDone", "onFetchLoadMoreDone", "onFetchInsertedDone", "", "request", "callback", "isSyncLoad", "requestInit", "requestPreload", "requestRefresh", "isAuto", "requestLoadMore", "requestInsert", "Ltf1/k;", "createDataFetch", "Ltf1/e;", "createDataMerger", "Ltf1/n;", "preloader", "setPreload", "isNeed", "Lkotlin/Function0;", "block", "checkIsNeedUiThread", "Lcom/tencent/mm/plugin/finder/feed/model/y0;", "store", "Lcom/tencent/mm/plugin/finder/feed/model/y0;", "getStore", "()Lcom/tencent/mm/plugin/finder/feed/model/y0;", "Ltf1/l;", "initDone", "Ltf1/l;", "getInitDone", "()Ltf1/l;", "setInitDone", "(Ltf1/l;)V", "dataFetch$delegate", "Lrx3/g;", "getDataFetch", "()Ltf1/k;", "dataFetch", "preload", "Ltf1/n;", "Lte3/hj1;", "value", "getContextObj", "()Lte3/hj1;", "setContextObj", "(Lte3/hj1;)V", "contextObj", "getLastBuffer", "()Lpe3/b;", "setLastBuffer", "(Lpe3/b;)V", "getInitPos", "()I", "initPos", "getRawInitPos", "()Ljava/lang/Integer;", "rawInitPos", "getCache", "()Lcom/tencent/mm/plugin/finder/feed/model/w0;", "getBackCache", "backCache", "<init>", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader */
public abstract class BaseFeedLoader<T extends C13914m> extends Dispatcher<T> implements C13910j<T> {
    private final C13601g dataFetch$delegate;
    private C13913l initDone;
    /* access modifiers changed from: private */
    public C13915n<T> preload;
    private final C2826y0 store;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a */
    public class C2784a extends C13897e<T> {
        private final boolean runUiThread;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a$a */
        public static final class C2785a implements C54258u {

            /* renamed from: a */
            public final /* synthetic */ BaseFeedLoader<T> f13983a;

            public C2785a(BaseFeedLoader<T> baseFeedLoader) {
                this.f13983a = baseFeedLoader;
            }

            /* renamed from: a */
            public void mo2860a(int i, int i2) {
                this.f13983a.dispatcher().mo13380e(i, i2);
            }

            /* renamed from: b */
            public void mo2861b(int i, int i2) {
                this.f13983a.dispatcher().mo13379d(i, i2);
            }

            /* renamed from: c */
            public void mo2862c(int i, int i2, Object obj) {
                this.f13983a.dispatcher().mo13378c(i, i2, obj);
            }

            /* renamed from: d */
            public void mo2863d(int i, int i2) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a$b */
        public static final class C2786b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFeedLoader<T> f13984d;

            /* renamed from: e */
            public final /* synthetic */ IResponse<T> f13985e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<IResponse<T>, C13598b0> f13986f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2786b(BaseFeedLoader<T> baseFeedLoader, IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar) {
                super(0);
                this.f13984d = baseFeedLoader;
                this.f13985e = iResponse;
                this.f13986f = lVar;
            }

            public Object invoke() {
                C13897e.mergeDataAndNotify$default(this.f13984d.getMerger(), 3, this.f13985e.getIncrementList(), true, (Object) null, 8, (Object) null);
                C32226l<IResponse<T>, C13598b0> lVar = this.f13986f;
                if (lVar != null) {
                    lVar.invoke(this.f13985e);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a$c */
        public static final class C2787c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFeedLoader<T>.a f13987d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<T> f13988e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13989f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<IResponse<T>, C13598b0> f13990g;

            /* renamed from: h */
            public final /* synthetic */ IResponse<T> f13991h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2787c(BaseFeedLoader<T>.a aVar, C13923t<T> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, C32226l<? super IResponse<T>, C13598b0> lVar, IResponse<T> iResponse) {
                super(0);
                this.f13987d = aVar;
                this.f13988e = tVar;
                this.f13989f = cVar;
                this.f13990g = lVar;
                this.f13991h = iResponse;
            }

            public Object invoke() {
                this.f13987d.convertOpToReason(this.f13988e, this.f13989f);
                C32226l<IResponse<T>, C13598b0> lVar = this.f13990g;
                if (lVar != null) {
                    lVar.invoke(this.f13991h);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a$d */
        public static final class C2788d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFeedLoader<T>.a f13992d;

            /* renamed from: e */
            public final /* synthetic */ C13920p f13993e;

            /* renamed from: f */
            public final /* synthetic */ List<T> f13994f;

            /* renamed from: g */
            public final /* synthetic */ BaseFeedLoader<T> f13995g;

            /* renamed from: h */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13996h;

            /* renamed from: i */
            public final /* synthetic */ C32226l<IResponse<T>, C13598b0> f13997i;

            /* renamed from: j */
            public final /* synthetic */ IResponse<T> f13998j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2788d(BaseFeedLoader<T>.a aVar, C13920p pVar, List<? extends T> list, BaseFeedLoader<T> baseFeedLoader, RefreshLoadMoreLayout.C7080c<Object> cVar, C32226l<? super IResponse<T>, C13598b0> lVar, IResponse<T> iResponse) {
                super(0);
                this.f13992d = aVar;
                this.f13993e = pVar;
                this.f13994f = list;
                this.f13995g = baseFeedLoader;
                this.f13996h = cVar;
                this.f13997i = lVar;
                this.f13998j = iResponse;
            }

            public Object invoke() {
                if (this.f13992d.calculateIndex(this.f13993e) != -1) {
                    BaseFeedLoader<T>.a aVar = this.f13992d;
                    E mergeInsertData = aVar.mergeInsertData(this.f13994f, aVar.calculateIndex(this.f13993e));
                    this.f13995g.dispatcher().mo13379d(mergeInsertData.f39115a, mergeInsertData.f39116b);
                    RefreshLoadMoreLayout.C7080c<Object> cVar = this.f13996h;
                    cVar.f24949d = mergeInsertData;
                    cVar.f24953h = mergeInsertData.f39116b;
                    C32226l<IResponse<T>, C13598b0> lVar = this.f13997i;
                    if (lVar != null) {
                        lVar.invoke(this.f13998j);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a$e */
        public static final class C2789e extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFeedLoader<T>.a f13999d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<T> f14000e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f14001f;

            /* renamed from: g */
            public final /* synthetic */ BaseFeedLoader<T> f14002g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<T>, C13598b0> f14003h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<T> f14004i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2789e(BaseFeedLoader<T>.a aVar, C13923t<T> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, BaseFeedLoader<T> baseFeedLoader, C32226l<? super IResponse<T>, C13598b0> lVar, IResponse<T> iResponse) {
                super(0);
                this.f13999d = aVar;
                this.f14000e = tVar;
                this.f14001f = cVar;
                this.f14002g = baseFeedLoader;
                this.f14003h = lVar;
                this.f14004i = iResponse;
            }

            public Object invoke() {
                this.f13999d.convertOpToReason(this.f14000e, this.f14001f);
                C13900g.m13322f(this.f14002g.dispatcher(), this.f14001f, false, 2, (Object) null);
                C32226l<IResponse<T>, C13598b0> lVar = this.f14003h;
                if (lVar != null) {
                    lVar.invoke(this.f14004i);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$a$f */
        public static final class C2790f extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFeedLoader<T>.a f14005d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<T> f14006e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f14007f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<IResponse<T>, C13598b0> f14008g;

            /* renamed from: h */
            public final /* synthetic */ IResponse<T> f14009h;

            /* renamed from: i */
            public final /* synthetic */ BaseFeedLoader<T> f14010i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2790f(BaseFeedLoader<T>.a aVar, C13923t<T> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, C32226l<? super IResponse<T>, C13598b0> lVar, IResponse<T> iResponse, BaseFeedLoader<T> baseFeedLoader) {
                super(0);
                this.f14005d = aVar;
                this.f14006e = tVar;
                this.f14007f = cVar;
                this.f14008g = lVar;
                this.f14009h = iResponse;
                this.f14010i = baseFeedLoader;
            }

            public Object invoke() {
                this.f14005d.convertOpToReason(this.f14006e, this.f14007f);
                C32226l<IResponse<T>, C13598b0> lVar = this.f14008g;
                if (lVar != null) {
                    lVar.invoke(this.f14009h);
                }
                this.f14010i.dispatcher().mo13381g(this.f14007f);
                return C13598b0.f38549a;
            }
        }

        public C2784a(boolean z) {
            this.runUiThread = z;
        }

        private final int getOffestIndex(int i) {
            int i2;
            boolean z = false;
            if (i >= 0) {
                int i3 = 0;
                i2 = 0;
                while (true) {
                    if (!(BaseFeedLoader.this.getDataList().get(i3) instanceof C0797z)) {
                        i2++;
                    }
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
            } else {
                i2 = 0;
            }
            int i4 = 2;
            if (i2 % 2 != 0) {
                z = true;
            }
            if (i % 2 != 0 ? !z : z) {
                i4 = 1;
            }
            return i + i4;
        }

        public static /* synthetic */ C13921q merge$default(C2784a aVar, List list, int i, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 4) != 0) {
                    obj = null;
                }
                return aVar.merge(list, i, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: merge");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            if (r3.mo3513o().getFeedObject().f164794id == r12.f39113a) goto L_0x004a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int calculateIndex(tf1.C13920p r12) {
            /*
                r11 = this;
                java.lang.String r0 = "data"
                gy3.C87412m.m108594g(r12, r0)
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<T> r0 = com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r2 = 0
            L_0x0011:
                boolean r3 = r0.hasNext()
                r4 = -1
                if (r3 == 0) goto L_0x0050
                java.lang.Object r3 = r0.next()
                tf1.m r3 = (tf1.C13914m) r3
                boolean r5 = r3 instanceof cm1.C0797z
                r6 = 1
                if (r5 == 0) goto L_0x0049
                cm1.z r3 = (cm1.C0797z) r3
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r3.mo3513o()
                te3.c21 r5 = r5.getLiveInfo()
                if (r5 == 0) goto L_0x0035
                int r5 = r5.f182394f
                if (r5 != r6) goto L_0x0035
                r5 = 1
                goto L_0x0036
            L_0x0035:
                r5 = 0
            L_0x0036:
                if (r5 == 0) goto L_0x0049
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                long r7 = r3.f164794id
                long r9 = r12.f39113a
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 != 0) goto L_0x0049
                goto L_0x004a
            L_0x0049:
                r6 = 0
            L_0x004a:
                if (r6 == 0) goto L_0x004d
                goto L_0x0051
            L_0x004d:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0050:
                r2 = -1
            L_0x0051:
                if (r2 != r4) goto L_0x0054
                return r4
            L_0x0054:
                int r12 = r11.getOffestIndex(r2)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.C2784a.calculateIndex(tf1.p):int");
        }

        public boolean canFinallyHandleMergeList(int i) {
            return false;
        }

        public void cleanDataList(DataBuffer<T> dataBuffer) {
            C87412m.m108594g(dataBuffer, "dataList");
            dataBuffer.clear();
        }

        public final void convertOpToReason(C13923t<T> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(tVar, "op");
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            E mergeDataAndNotify = mergeDataAndNotify(tVar.f39122a, tVar.f39123b, tVar.f39124c, tVar.f39125d);
            cVar.f24949d = mergeDataAndNotify;
            cVar.f24953h = mergeDataAndNotify.f39116b;
            cVar.f24957l = tVar.f39122a;
        }

        public boolean filterSameFeed() {
            return true;
        }

        public int findMergeIndex(ArrayList<T> arrayList, List<? extends T> list, int i, Object obj) {
            C87412m.m108594g(arrayList, "srcList");
            C87412m.m108594g(list, "newList");
            if (i == 1 || i == 5 || i == 9) {
                return BaseFeedLoader.this.getDataList().size();
            }
            if (i == 2 || i == 4 || i == 6 || i == 10 || i != 11) {
                return 0;
            }
            return BaseFeedLoader.this.getDataList().size();
        }

        public C54258u getListUpdateCallback() {
            return new C2785a(BaseFeedLoader.this);
        }

        public C13921q merge(List<? extends T> list, int i, Object obj) {
            boolean z;
            boolean z2;
            int i2;
            List<? extends T> list2 = list;
            int i3 = i;
            C87412m.m108594g(list2, "newList");
            printList("newList", i3, list2);
            DataBuffer<T> dataList = BaseFeedLoader.this.getDataList();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
            Iterator<T> it = list.iterator();
            boolean z3 = false;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                C13914m mVar = (C13914m) it.next();
                Iterator<E> it4 = dataList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    C13914m mVar2 = (C13914m) it4.next();
                    if ((mVar2 instanceof BaseFinderFeed) && (mVar instanceof BaseFinderFeed) && mVar2.mo76f(mVar) == 0) {
                        break;
                    }
                    i4++;
                }
                Iterator it5 = linkedList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (((C13914m) it5.next()).mo76f(mVar) == 0) {
                        break;
                    }
                    i5++;
                }
                if ((i4 == -1 && i5 == -1) || !filterSameFeed()) {
                    linkedList.add(mVar);
                } else if (i4 != -1) {
                    dataList.set(i4, mVar);
                    z3 = onDataReplace(mVar, i4);
                    linkedList2.add(Integer.valueOf(i4));
                } else {
                    String tag = baseFeedLoader.getTAG();
                    Log.m105928w(tag, "newList exist a same feed[" + linkedList.get(i5) + "], just ignore this feed=" + mVar + " existIndex=" + i4 + " existIndexInIncrementList=" + i5);
                }
            }
            printList("incrementList", i3, linkedList);
            if (linkedList.size() <= 0 && !canFinallyHandleMergeList(i3)) {
                z = false;
            }
            if ((z ? linkedList : null) != null) {
                BaseFeedLoader<T> baseFeedLoader2 = BaseFeedLoader.this;
                Object obj2 = obj;
                int findMergeIndex = findMergeIndex(dataList, linkedList, i3, obj2);
                boolean finallyHandleMergeList = finallyHandleMergeList(dataList, linkedList, findMergeIndex, i, obj2);
                String tag2 = baseFeedLoader2.getTAG();
                Log.m105924i(tag2, "merge list index " + findMergeIndex + " incrementList:" + linkedList.size() + " cmd=" + i3);
                dataList.addAll(findMergeIndex, linkedList);
                z2 = finallyHandleMergeList;
                i2 = findMergeIndex;
            } else {
                i2 = 0;
                z2 = false;
            }
            C13921q qVar = new C13921q(i2, linkedList.size(), linkedList2, z2, z3);
            printList("dataList", i3, BaseFeedLoader.this.getDataList());
            return qVar;
        }

        public C13921q mergeDataAndNotify(int i, List<? extends T> list, boolean z, Object obj) {
            String str;
            Integer num;
            if (list == null) {
                return new C13921q(-1, 0, new LinkedList(), false, false, 24, (C8480h) null);
            }
            if (!z) {
                String tag = BaseFeedLoader.this.getTAG();
                Log.m105924i(tag, "nothing need to notify, just return. cmd=" + i + " size =" + list.size());
                return new C13921q(-1, 0, new LinkedList(), false, false, 24, (C8480h) null);
            }
            int size = BaseFeedLoader.this.getDataList().size();
            if ((i == 4 || i == 10 || i == 3 || i == 7) && needCleanWhenRefresh(list) && ((!list.isEmpty()) || i == 7)) {
                cleanDataList(BaseFeedLoader.this.getDataList());
                if (i == 4 || i == 10) {
                    BaseFeedLoader.this.dispatcher().mo13380e(0, size);
                }
            }
            C13921q merge = merge(list, i, obj);
            String tag2 = BaseFeedLoader.this.getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("mergeDataAndNotify insertIndex=");
            sb.append(merge.f39115a);
            sb.append(" insertCount=");
            sb.append(merge.f39116b);
            sb.append(" changeIndex=");
            sb.append(merge.f39117c);
            sb.append(" size: ");
            sb.append(BaseFeedLoader.this.getDataList().size());
            sb.append(" isRemoveBeforeInsert=");
            sb.append(merge.f39118d);
            sb.append(" loader:");
            sb.append(getClass().getSimpleName());
            sb.append(" cmd:");
            if (i == 8) {
                str = "INSERT";
            } else if (i != 12) {
                switch (i) {
                    case 1:
                        str = "ADD_LOADMORE";
                        break;
                    case 2:
                        str = "ADD_REFRESH";
                        break;
                    case 3:
                        str = TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT;
                        break;
                    case 4:
                        str = "CLEAN_REFRESH";
                        break;
                    case 5:
                        str = "LOADMORE_THAT_ALL";
                        break;
                    case 6:
                        str = "REFRESH_THAT_ALL";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
            } else {
                str = "INSERT_REFRESH";
            }
            sb.append(str);
            sb.append('}');
            Log.m105924i(tag2, sb.toString());
            if (!(!merge.f39117c.isEmpty()) || merge.f39116b > 0 || i == 9) {
                if (i == 2 || i == 3 || i == 6 || i == 7) {
                    BaseFeedLoader.this.dispatcher().mo13376a();
                } else {
                    if (merge.f39118d) {
                        C13900g<T> dispatcher = BaseFeedLoader.this.dispatcher();
                        int i2 = merge.f39115a;
                        dispatcher.mo13380e(i2, size - i2);
                    }
                    if (i == 9 && (num = (Integer) C110818d0.m150916N(merge.f39117c)) != null) {
                        BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
                        if (num.intValue() == 0) {
                            baseFeedLoader.dispatcher().mo13378c(0, 1, 1);
                        }
                    }
                    if (merge.f39116b > 0) {
                        BaseFeedLoader.this.dispatcher().mo13379d(merge.f39115a, merge.f39116b);
                    }
                }
                return merge;
            }
            String tag3 = BaseFeedLoader.this.getTAG();
            Log.m105924i(tag3, "just change all. cmd=" + i);
            BaseFeedLoader.this.dispatcher().mo13376a();
            return merge;
        }

        public void mergeInit(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            if (iResponse.getIncrementList() == null) {
                iResponse.setIncrementList(C64186f0.f181907d);
            }
            String tag = BaseFeedLoader.this.getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("initData dataFetch.initData ");
            List<T> incrementList = iResponse.getIncrementList();
            sb.append(incrementList != null ? Integer.valueOf(incrementList.size()) : null);
            Log.m105924i(tag, sb.toString());
            BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
            baseFeedLoader.checkIsNeedUiThread(this.runUiThread, new C2786b(baseFeedLoader, iResponse, lVar));
        }

        public void mergeInsert(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(2);
            cVar.f24952g = true;
            cVar.f24951f = true;
            C13923t tVar = new C13923t(8, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null);
            tVar.f39125d = iResponse.getRequest();
            BaseFeedLoader.this.checkIsNeedUiThread(this.runUiThread, new C2787c(this, tVar, cVar, lVar, iResponse));
        }

        public final C13921q mergeInsertData(List<? extends T> list, int i) {
            C87412m.m108594g(list, "newList");
            LinkedList linkedList = new LinkedList();
            BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C13914m mVar = (C13914m) it.next();
                Iterator<E> it4 = baseFeedLoader.getDataList().iterator();
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (((C13914m) it4.next()).mo76f(mVar) == 0) {
                        break;
                    }
                    i2++;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (valueOf.intValue() == -1) {
                    z = true;
                }
                if (!z) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    valueOf.intValue();
                    linkedList.add(mVar);
                }
            }
            String tag = BaseFeedLoader.this.getTAG();
            Log.m105924i(tag, "mergeInsertData startIndex = " + i + ", incrementSize: " + linkedList.size());
            BaseFeedLoader.this.getDataList().addAll(i, linkedList);
            return new C13921q(i, linkedList.size(), new LinkedList(), true, false);
        }

        public void mergeInsertSpecifiedLocation(IResponse<T> iResponse, C13920p pVar, C32226l<? super IResponse<T>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            C87412m.m108594g(pVar, "data");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(2);
            cVar.f24952g = true;
            cVar.f24951f = true;
            List<T> incrementList = iResponse.getIncrementList();
            if (incrementList != null) {
                C61926c.m72668M(new C2788d(this, pVar, incrementList, BaseFeedLoader.this, cVar, lVar, iResponse));
            }
        }

        public void mergeLoadMore(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            List<T> incrementList = iResponse.getIncrementList();
            cVar.f24952g = incrementList != null ? incrementList.isEmpty() : true;
            cVar.f24951f = iResponse.getHasMore();
            C13923t tVar = new C13923t(iResponse.getHasMore() ? 1 : 5, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null);
            BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
            baseFeedLoader.checkIsNeedUiThread(this.runUiThread, new C2789e(this, tVar, cVar, baseFeedLoader, lVar, iResponse));
        }

        public void mergeRefresh(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
            C13923t tVar = new C13923t(iResponse.getHasMore() ? 2 : 6, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null);
            BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
            baseFeedLoader.checkIsNeedUiThread(this.runUiThread, new C2790f(this, tVar, cVar, lVar, iResponse, baseFeedLoader));
        }

        public boolean onDataReplace(T t, int i) {
            C87412m.m108594g(t, "feed");
            return false;
        }

        public final void printList(String str, int i, List<? extends T> list) {
            String str2;
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(list, "mmlist");
            if (getDEBUG()) {
                BaseFeedLoader<T> baseFeedLoader = BaseFeedLoader.this;
                int i2 = 0;
                for (T next : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C13914m mVar = (C13914m) next;
                        String tag = baseFeedLoader.getTAG();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" index ");
                        sb.append(i2);
                        sb.append(" cmd:");
                        if (i == 8) {
                            str2 = "INSERT";
                        } else if (i != 12) {
                            switch (i) {
                                case 1:
                                    str2 = "ADD_LOADMORE";
                                    break;
                                case 2:
                                    str2 = "ADD_REFRESH";
                                    break;
                                case 3:
                                    str2 = TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT;
                                    break;
                                case 4:
                                    str2 = "CLEAN_REFRESH";
                                    break;
                                case 5:
                                    str2 = "LOADMORE_THAT_ALL";
                                    break;
                                case 6:
                                    str2 = "REFRESH_THAT_ALL";
                                    break;
                                default:
                                    str2 = "UNKNOWN";
                                    break;
                            }
                        } else {
                            str2 = "INSERT_REFRESH";
                        }
                        sb.append(str2);
                        sb.append(' ');
                        sb.append(mVar);
                        Log.m105924i(tag, sb.toString());
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2784a(BaseFeedLoader baseFeedLoader, boolean z, int i, C8480h hVar) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$b */
    public static final class C2791b extends C87413o implements C32224a<C13911k<T>> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14011d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2791b(BaseFeedLoader<T> baseFeedLoader) {
            super(0);
            this.f14011d = baseFeedLoader;
        }

        public Object invoke() {
            return this.f14011d.createDataFetch();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$c */
    public static final class C2792c extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2792c(BaseFeedLoader<T> baseFeedLoader) {
            super(1);
            this.f14012d = baseFeedLoader;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            this.f14012d.onFetchInitDone(iResponse);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$d */
    public static final class C2793d extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14013d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<T> f14014e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2793d(BaseFeedLoader<T> baseFeedLoader, IResponse<T> iResponse) {
            super(1);
            this.f14013d = baseFeedLoader;
            this.f14014e = iResponse;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            this.f14013d.onFetchRefreshDone(this.f14014e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$e */
    public static final class C2794e extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14015d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<T> f14016e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2794e(BaseFeedLoader<T> baseFeedLoader, IResponse<T> iResponse) {
            super(1);
            this.f14015d = baseFeedLoader;
            this.f14016e = iResponse;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            this.f14015d.onFetchInsertedDone(this.f14016e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$f */
    public static final class C2795f extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14017d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<T> f14018e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2795f(BaseFeedLoader<T> baseFeedLoader, IResponse<T> iResponse) {
            super(1);
            this.f14017d = baseFeedLoader;
            this.f14018e = iResponse;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            this.f14017d.onFetchLoadMoreDone(this.f14018e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$g */
    public static final class C2796g extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14019d;

        /* renamed from: e */
        public final /* synthetic */ Object f14020e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2796g(BaseFeedLoader<T> baseFeedLoader, Object obj) {
            super(1);
            this.f14019d = baseFeedLoader;
            this.f14020e = obj;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            IResponse iResponse = (IResponse) obj;
            if (iResponse != null) {
                BaseFeedLoader<T> baseFeedLoader = this.f14019d;
                Log.m105924i(baseFeedLoader.getTAG(), "request hit cache");
                baseFeedLoader.onFetchDone(iResponse);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                BaseFeedLoader<T> baseFeedLoader2 = this.f14019d;
                C13911k.fetch$default(baseFeedLoader2.getDataFetch(), this.f14020e, baseFeedLoader2, false, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$h */
    public static final class C2797h extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14021d;

        /* renamed from: e */
        public final /* synthetic */ Object f14022e;

        /* renamed from: f */
        public final /* synthetic */ C13910j<T> f14023f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2797h(BaseFeedLoader<T> baseFeedLoader, Object obj, C13910j<T> jVar) {
            super(1);
            this.f14021d = baseFeedLoader;
            this.f14022e = obj;
            this.f14023f = jVar;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            IResponse iResponse = (IResponse) obj;
            if (iResponse != null) {
                BaseFeedLoader<T> baseFeedLoader = this.f14021d;
                Log.m105924i(baseFeedLoader.getTAG(), "request hit cache");
                baseFeedLoader.onFetchDone(iResponse);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                BaseFeedLoader<T> baseFeedLoader2 = this.f14021d;
                C13911k.fetch$default(baseFeedLoader2.getDataFetch(), this.f14022e, this.f14023f, false, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$i */
    public static final class C2798i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2798i(BaseFeedLoader<T> baseFeedLoader) {
            super(0);
            this.f14024d = baseFeedLoader;
        }

        public Object invoke() {
            this.f14024d.getDataFetch().fetchInit(this.f14024d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$j */
    public static final class C2799j extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14025d;

        /* renamed from: e */
        public final /* synthetic */ boolean f14026e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2799j(BaseFeedLoader<T> baseFeedLoader, boolean z) {
            super(1);
            this.f14025d = baseFeedLoader;
            this.f14026e = z;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            IResponse iResponse = (IResponse) obj;
            if (iResponse != null) {
                BaseFeedLoader<T> baseFeedLoader = this.f14025d;
                Log.m105924i(baseFeedLoader.getTAG(), "requestLoadMore hit cache");
                baseFeedLoader.onFetchDone(iResponse);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                BaseFeedLoader<T> baseFeedLoader2 = this.f14025d;
                baseFeedLoader2.getDataFetch().fetchLoadMore(baseFeedLoader2, this.f14026e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$k */
    public static final class C2800k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14027d;

        /* renamed from: e */
        public final /* synthetic */ C13910j<T> f14028e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2800k(BaseFeedLoader<T> baseFeedLoader, C13910j<T> jVar) {
            super(0);
            this.f14027d = baseFeedLoader;
            this.f14028e = jVar;
        }

        public Object invoke() {
            this.f14027d.getDataFetch().fetchPreload(new C2803a(this.f14027d, this.f14028e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader$l */
    public static final class C2801l extends C87413o implements C32226l<IResponse<T>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFeedLoader<T> f14029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2801l(BaseFeedLoader<T> baseFeedLoader) {
            super(1);
            this.f14029d = baseFeedLoader;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            IResponse iResponse = (IResponse) obj;
            if (iResponse != null) {
                BaseFeedLoader<T> baseFeedLoader = this.f14029d;
                Log.m105924i(baseFeedLoader.getTAG(), "requestRefresh hit cache");
                baseFeedLoader.onFetchDone(iResponse);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                BaseFeedLoader<T> baseFeedLoader2 = this.f14029d;
                baseFeedLoader2.getDataFetch().fetchRefresh(baseFeedLoader2);
            }
            return C13598b0.f38549a;
        }
    }

    public BaseFeedLoader() {
        this((C49712hj1) null, 1, (C8480h) null);
    }

    public BaseFeedLoader(C49712hj1 hj12) {
        C2826y0 y0Var = new C2826y0();
        this.store = y0Var;
        y0Var.f14103b = hj12;
        this.dataFetch$delegate = C36568h.m40985a(new C2791b(this));
    }

    /* access modifiers changed from: private */
    public final C13911k<T> getDataFetch() {
        return (C13911k) this.dataFetch$delegate.getValue();
    }

    public static /* synthetic */ void request$default(BaseFeedLoader baseFeedLoader, Object obj, C13910j jVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                jVar = null;
            }
            baseFeedLoader.request(obj, jVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
    }

    public static /* synthetic */ void requestInit$default(BaseFeedLoader baseFeedLoader, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            baseFeedLoader.requestInit(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestInit");
    }

    public static /* synthetic */ void requestLoadMore$default(BaseFeedLoader baseFeedLoader, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            baseFeedLoader.requestLoadMore(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestLoadMore");
    }

    public static /* synthetic */ void requestPreload$default(BaseFeedLoader baseFeedLoader, C13910j jVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                jVar = null;
            }
            baseFeedLoader.requestPreload(jVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPreload");
    }

    public static /* synthetic */ void saveCache$default(BaseFeedLoader baseFeedLoader, Intent intent, int i, C2780c cVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                cVar = null;
            }
            baseFeedLoader.saveCache(intent, i, cVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveCache");
    }

    public static /* synthetic */ void saveCacheToIntent$default(BaseFeedLoader baseFeedLoader, Intent intent, List list, C89349b bVar, int i, C2780c cVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                cVar = null;
            }
            baseFeedLoader.saveCacheToIntent(intent, list, bVar, i, cVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveCacheToIntent");
    }

    public final void checkIsNeedUiThread(boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (z) {
            C61926c.m72668M(aVar);
        } else {
            aVar.invoke();
        }
    }

    public abstract C13911k<T> createDataFetch();

    public C13897e<T> createDataMerger() {
        return new C2784a(this, false, 1, (C8480h) null);
    }

    public final C2819w0 getBackCache() {
        return this.store.f14105d;
    }

    public final C2819w0 getCache() {
        return this.store.f14104c;
    }

    public final C49712hj1 getContextObj() {
        return this.store.f14103b;
    }

    public final C13913l getInitDone() {
        return this.initDone;
    }

    public final int getInitPos() {
        C2819w0 w0Var = this.store.f14104c;
        return Math.max(w0Var != null ? w0Var.f14081c : 0, 0);
    }

    public final C89349b getLastBuffer() {
        return this.store.f14102a;
    }

    public final Integer getRawInitPos() {
        C2819w0 w0Var = this.store.f14104c;
        if (w0Var != null) {
            return Integer.valueOf(w0Var.f14081c);
        }
        return null;
    }

    public final C2826y0 getStore() {
        return this.store;
    }

    public final void initBackCache(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C2826y0 y0Var = this.store;
        y0Var.getClass();
        ConcurrentHashMap<Long, C2819w0> concurrentHashMap = C2826y0.f14101g;
        long longExtra = intent.getLongExtra("LoaderCacheStoreIntentKey", 0);
        C2819w0 w0Var = null;
        if (longExtra != 0) {
            ConcurrentHashMap<Long, C2819w0> concurrentHashMap2 = C2826y0.f14101g;
            if (concurrentHashMap2.containsKey(Long.valueOf(longExtra))) {
                w0Var = concurrentHashMap2.remove(Long.valueOf(longExtra));
            }
        }
        y0Var.f14105d = w0Var;
    }

    public final void initFromCache(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C2826y0 y0Var = this.store;
        ConcurrentHashMap<Long, C2819w0> concurrentHashMap = C2826y0.f14101g;
        y0Var.getClass();
        ConcurrentHashMap<Long, C2819w0> concurrentHashMap2 = C2826y0.f14101g;
        long longExtra = intent.getLongExtra("LoaderCacheStoreIntentKey", 0);
        C2819w0 w0Var = null;
        if (longExtra != 0) {
            ConcurrentHashMap<Long, C2819w0> concurrentHashMap3 = C2826y0.f14101g;
            if (concurrentHashMap3.containsKey(Long.valueOf(longExtra))) {
                w0Var = concurrentHashMap3.remove(Long.valueOf(longExtra));
            }
        }
        y0Var.f14104c = w0Var;
    }

    public final boolean isInitOperation(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        return 1000 == iResponse.getPullType();
    }

    public final boolean isInsertOperation(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        return -1 == iResponse.getPullType();
    }

    public final boolean isInsertSpecifyOperation(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        return 16 == iResponse.getPullType();
    }

    public final boolean isRefreshOperation(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        return 1 == iResponse.getPullType() || iResponse.getPullType() == 0 || 4 == iResponse.getPullType() || 3 == iResponse.getPullType() || 10 == iResponse.getPullType() || 11 == iResponse.getPullType() || 12 == iResponse.getPullType() || 14 == iResponse.getPullType() || 15 == iResponse.getPullType() || 18 == iResponse.getPullType() || 19 == iResponse.getPullType();
    }

    public void onAlive() {
        Log.m105924i(getTAG(), "onAlive");
        getDataFetch().alive();
    }

    public void onDead() {
        Log.m105924i(getTAG(), "onDead");
        getDataFetch().dead();
        this.initDone = null;
    }

    public void onFetchDone(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        if (isInitOperation(iResponse)) {
            getMerger().mergeInit(iResponse, new C2792c(this));
        } else if (isRefreshOperation(iResponse)) {
            getMerger().mergeRefresh(iResponse, new C2793d(this, iResponse));
        } else if (isInsertOperation(iResponse)) {
            getMerger().mergeInsert(iResponse, new C2794e(this, iResponse));
        } else if (!isInsertSpecifyOperation(iResponse)) {
            getMerger().mergeLoadMore(iResponse, new C2795f(this, iResponse));
        }
        onSaveLastBuffer(iResponse);
    }

    public void onFetchInitDone(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "initResponse");
        C13913l lVar = this.initDone;
        if (lVar != null) {
            List<T> incrementList = iResponse.getIncrementList();
            lVar.call(incrementList != null ? incrementList.size() : 0);
        }
        this.initDone = null;
    }

    public void onFetchInsertedDone(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
    }

    public void onFetchLoadMoreDone(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
    }

    public void onFetchRefreshDone(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
    }

    public void onSaveLastBuffer(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        setLastBuffer(iResponse.getLastBuffer());
    }

    public final void request(Object obj, C13910j<T> jVar) {
        Log.m105924i(getTAG(), "request");
        C13598b0 b0Var = null;
        if (jVar == null) {
            C13915n<T> nVar = this.preload;
            if (nVar != null) {
                nVar.mo13386b(new C2796g(this, obj));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                C13911k.fetch$default(getDataFetch(), obj, this, false, 4, (Object) null);
                return;
            }
            return;
        }
        C13915n<T> nVar2 = this.preload;
        if (nVar2 != null) {
            nVar2.mo13386b(new C2797h(this, obj, jVar));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C13911k.fetch$default(getDataFetch(), obj, jVar, false, 4, (Object) null);
        }
    }

    public final void requestInit(boolean z) {
        String tag = getTAG();
        Log.m105924i(tag, "initData from " + Util.getStack());
        if (z) {
            getDataFetch().fetchInit(this);
        } else {
            C90875b.m113988a(false, false, (ClassLoader) null, (String) null, 0, new C2798i(this), 31, (Object) null);
        }
    }

    public void requestInsert(Object obj) {
        C87412m.m108594g(obj, "request");
        String tag = getTAG();
        Log.m105924i(tag, "requestInsert " + obj);
        request$default(this, obj, (C13910j) null, 2, (Object) null);
    }

    public void requestLoadMore(boolean z) {
        C13598b0 b0Var;
        Log.m105924i(getTAG(), "requestLoadMore");
        C13915n<T> nVar = this.preload;
        if (nVar != null) {
            nVar.mo13386b(new C2799j(this, z));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            getDataFetch().fetchLoadMore(this, z);
        }
    }

    public final void requestPreload() {
        requestPreload(this);
    }

    public void requestRefresh() {
        C13598b0 b0Var;
        Log.m105924i(getTAG(), "requestRefresh");
        C13915n<T> nVar = this.preload;
        if (nVar != null) {
            nVar.mo13386b(new C2801l(this));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            getDataFetch().fetchRefresh(this);
        }
    }

    public final void saveCache(Intent intent, int i, C2780c cVar) {
        C87412m.m108594g(intent, "intent");
        ArrayList arrayList = new ArrayList();
        DataBuffer dataList = getDataList();
        if (!(dataList instanceof DataBuffer)) {
            dataList = null;
        }
        if (dataList != null) {
            for (C13914m mVar : getDataList()) {
                if (mVar instanceof BaseFinderFeed) {
                    ((BaseFinderFeed) mVar).mo3513o().setCommentScene(0);
                }
            }
            arrayList.addAll(dataList);
        }
        this.store.mo2926b(new C2819w0(arrayList, getLastBuffer(), i, cVar), intent);
    }

    public final void saveCacheToIntent(Intent intent, C2819w0 w0Var) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(w0Var, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        this.store.mo2926b(w0Var, intent);
    }

    public final void setContextObj(C49712hj1 hj12) {
        this.store.f14103b = hj12;
    }

    public final void setInitDone(C13913l lVar) {
        this.initDone = lVar;
    }

    public final void setLastBuffer(C89349b bVar) {
        this.store.f14102a = bVar;
    }

    public final void setPreload(C13915n<T> nVar) {
        C87412m.m108594g(nVar, "preloader");
        this.preload = nVar;
    }

    public void requestPreload(C13910j<T> jVar) {
        C13915n<T> nVar = this.preload;
        if (nVar != null) {
            nVar.mo13385a(new C2800k(this, jVar));
        }
    }

    public final void saveCacheToIntent(Intent intent, List<? extends C0740i2> list, C89349b bVar, int i, C2780c cVar) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(list, "feedList");
        for (C0740i2 i2Var : list) {
            if (i2Var instanceof BaseFinderFeed) {
                ((BaseFinderFeed) i2Var).mo3513o().setCommentScene(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.store.mo2926b(new C2819w0(arrayList, bVar, i, cVar), intent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseFeedLoader(C49712hj1 hj12, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : hj12);
    }
}
