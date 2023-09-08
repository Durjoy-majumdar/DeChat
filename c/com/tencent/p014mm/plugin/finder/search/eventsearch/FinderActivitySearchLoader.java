package com.tencent.p014mm.plugin.finder.search.eventsearch;

import androidx.recyclerview.widget.C54258u;
import cm1.C0740i2;
import cm1.C0750m;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9328k1;
import kotlin.Metadata;
import kp1.C10381f;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C48096k;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C51253sj1;
import te3.C52271zj0;
import tf1.C13893c;
import tf1.C13897e;
import tf1.C13911k;
import tf1.C13920p;
import tf1.C13921q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/eventsearch/FinderActivitySearchLoader;", "Lkp1/f;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader */
public final class FinderActivitySearchLoader extends BaseFeedLoader<C0740i2> implements C10381f {

    /* renamed from: d */
    public String f16642d = "";

    /* renamed from: e */
    public int f16643e;

    /* renamed from: f */
    public C32226l<? super Integer, C13598b0> f16644f;

    /* renamed from: g */
    public final String f16645g = String.valueOf(C31543z5.m39453c());

    /* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader$a */
    public static final class C3585a extends IResponse<C0740i2> {
        public C3585a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader$b */
    public static final class C3586b extends C13893c {

        /* renamed from: g */
        public final /* synthetic */ FinderActivitySearchLoader f16646g;

        public C3586b(FinderActivitySearchLoader finderActivitySearchLoader) {
            this.f16646g = finderActivitySearchLoader;
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            C3585a aVar = new C3585a(i, i2, str);
            aVar.setLastBuffer(this.f16646g.getLastBuffer());
            if ((eu32 instanceof C51253sj1) && i == 0 && i2 == 0) {
                ArrayList arrayList = new ArrayList();
                C51253sj1 sj12 = (C51253sj1) eu32;
                LinkedList<C52271zj0> linkedList = sj12.f141556e;
                if (linkedList != null) {
                    for (C52271zj0 zj02 : linkedList) {
                        C87412m.m108593f(zj02, LocaleUtil.ITALIAN);
                        arrayList.add(new C0750m(zj02));
                    }
                }
                aVar.setIncrementList(arrayList);
                aVar.setLastBuffer(sj12.f141555d);
                int i3 = 0;
                boolean z = true;
                if (sj12.f141557f != 1) {
                    z = false;
                }
                aVar.setHasMore(z);
                this.f16646g.f16643e = sj12.f141557f;
                C9328k1 k1Var = bVar instanceof C9328k1 ? (C9328k1) bVar : null;
                if (k1Var != null) {
                    i3 = k1Var.f29147u;
                }
                aVar.setPullType(i3);
            }
            return aVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            FinderActivitySearchLoader finderActivitySearchLoader = this.f16646g;
            C9328k1 k1Var = new C9328k1("", "", finderActivitySearchLoader.f16642d, finderActivitySearchLoader.getLastBuffer(), this.f16646g.f16645g);
            k1Var.f29147u = 2;
            return k1Var;
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            FinderActivitySearchLoader finderActivitySearchLoader = this.f16646g;
            C9328k1 k1Var = new C9328k1("", "", finderActivitySearchLoader.f16642d, (C89349b) null, finderActivitySearchLoader.f16645g);
            k1Var.f29147u = 4;
            return k1Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader$c */
    public static final class C3587c extends C13897e<C0740i2> {

        /* renamed from: a */
        public final /* synthetic */ FinderActivitySearchLoader f16647a;

        /* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader$c$a */
        public static final class C3588a implements C54258u {
            /* renamed from: a */
            public void mo2860a(int i, int i2) {
                throw new C48096k("An operation is not implemented: Not yet implemented");
            }

            /* renamed from: b */
            public void mo2861b(int i, int i2) {
                throw new C48096k("An operation is not implemented: Not yet implemented");
            }

            /* renamed from: c */
            public void mo2862c(int i, int i2, Object obj) {
                throw new C48096k("An operation is not implemented: Not yet implemented");
            }

            /* renamed from: d */
            public void mo2863d(int i, int i2) {
                throw new C48096k("An operation is not implemented: Not yet implemented");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader$c$b */
        public static final class C3589b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderActivitySearchLoader f16648d;

            /* renamed from: e */
            public final /* synthetic */ int f16649e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3589b(FinderActivitySearchLoader finderActivitySearchLoader, int i) {
                super(0);
                this.f16648d = finderActivitySearchLoader;
                this.f16649e = i;
            }

            public Object invoke() {
                C32226l<? super Integer, C13598b0> lVar = this.f16648d.f16644f;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(this.f16649e));
                }
                return C13598b0.f38549a;
            }
        }

        public C3587c(FinderActivitySearchLoader finderActivitySearchLoader) {
            this.f16647a = finderActivitySearchLoader;
        }

        public C54258u getListUpdateCallback() {
            return new C3588a();
        }

        public C13921q mergeDataAndNotify(int i, List<? extends C0740i2> list, boolean z, Object obj) {
            return new C13921q(-1, 0, new LinkedList(), false, false, 24, (C8480h) null);
        }

        public void mergeInit(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
        }

        public void mergeInsert(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
        }

        public void mergeInsertSpecifiedLocation(IResponse<C0740i2> iResponse, C13920p pVar, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            C87412m.m108594g(pVar, "objectId");
        }

        public void mergeLoadMore(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            List incrementList;
            DataBuffer dataList;
            C87412m.m108594g(iResponse, "response");
            int size = this.f16647a.getDataList().size();
            C3585a aVar = iResponse instanceof C3585a ? (C3585a) iResponse : null;
            if (!(aVar == null || (incrementList = aVar.getIncrementList()) == null || (dataList = this.f16647a.getDataList()) == null)) {
                dataList.addAll(incrementList);
            }
            C32226l<? super Integer, C13598b0> lVar2 = this.f16647a.f16644f;
            if (lVar2 != null) {
                lVar2.invoke(Integer.valueOf(size));
            }
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            List incrementList;
            DataBuffer dataList;
            C87412m.m108594g(iResponse, "response");
            int size = this.f16647a.getDataList().size();
            C3585a aVar = iResponse instanceof C3585a ? (C3585a) iResponse : null;
            if (!(aVar == null || (incrementList = aVar.getIncrementList()) == null || (dataList = this.f16647a.getDataList()) == null)) {
                dataList.addAll(incrementList);
            }
            C61926c.m72668M(new C3589b(this.f16647a, size));
        }
    }

    public FinderActivitySearchLoader() {
        super((C49712hj1) null, 1, (C8480h) null);
    }

    /* renamed from: a */
    public void mo3944a() {
        BaseFeedLoader.requestLoadMore$default(this, false, 1, (Object) null);
    }

    /* renamed from: b */
    public void mo3945b(String str) {
        DataBuffer dataList;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        this.f16642d = str;
        if (getLastBuffer() != null) {
            setLastBuffer((C89349b) null);
        }
        if (!getDataList().isEmpty() && (dataList = getDataList()) != null) {
            dataList.clear();
        }
        requestRefresh();
    }

    /* renamed from: c */
    public ArrayList<C0740i2> mo3946c() {
        return getDataList();
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3586b(this);
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3587c(this);
    }

    public boolean hasMore() {
        return this.f16643e == 1;
    }

    public void onFetchDone(IResponse iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/eventsearch/FinderActivitySearchLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        super.onFetchDone(iResponse);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/eventsearch/FinderActivitySearchLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
