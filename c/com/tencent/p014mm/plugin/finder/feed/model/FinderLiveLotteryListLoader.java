package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0718c1;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import dj1.C7339i0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49225e31;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50617o01;
import te3.C51773w21;
import te3.C52204z21;
import tf1.C13893c;
import tf1.C13911k;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader */
public final class FinderLiveLotteryListLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final String f13739d;

    /* renamed from: e */
    public final long f13740e;

    /* renamed from: f */
    public final long f13741f;

    /* renamed from: g */
    public final String f13742g;

    /* renamed from: h */
    public final int f13743h;

    /* renamed from: i */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13744i;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader$a */
    public final class C2721a extends C13893c {
        public C2721a() {
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            int i3 = i;
            int i4 = i2;
            C89132b<? extends C49335eu3> bVar2 = bVar;
            C49335eu3 eu33 = eu32;
            String tag = getTAG();
            Log.m105924i(tag, "onSceneEnd: errType " + i3 + ", errCode " + i4 + " errMsg " + str);
            C2722b bVar3 = new C2722b(i, i2, str, (C52204z21) null, false, (String) null, (String) null, 0, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (C8480h) null);
            if (!(eu33 instanceof C50617o01) || i3 != 0 || i4 != 0) {
                return bVar3;
            }
            C50617o01 o012 = (C50617o01) eu33;
            C2722b bVar4 = r0;
            C2722b bVar5 = new C2722b(i, i2, str, o012.f138872d, o012.f138877i == 0, (String) null, (String) null, 0, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (C8480h) null);
            bVar4.setLastBuffer(o012.f138873e);
            bVar4.setHasMore(o012.f138874f == 1);
            C49225e31 e312 = o012.f138875g;
            C7339i0 i0Var = null;
            LinkedList<C51773w21> linkedList = e312 != null ? e312.f132658d : null;
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C51773w21 w212 : linkedList) {
                C87412m.m108593f(w212, LocaleUtil.ITALIAN);
                arrayList.add(new C0718c1(w212));
            }
            bVar4.setIncrementList(arrayList);
            if (bVar2 instanceof C7339i0) {
                i0Var = (C7339i0) bVar2;
            }
            bVar4.setPullType(i0Var != null ? i0Var.f25458w : 0);
            bVar4.f13748c = o012.f138878j;
            bVar4.f13749d = o012.f138880o;
            bVar4.f13750e = o012.f138879n;
            return bVar4;
        }

        /* renamed from: d */
        public C89132b mo2701d() {
            int i = FinderLiveLotteryListLoader.this.f13743h;
            String O5 = C66785b.f191882e.mo90662O5();
            FinderLiveLotteryListLoader finderLiveLotteryListLoader = FinderLiveLotteryListLoader.this;
            C7339i0 i0Var = new C7339i0(i, O5, finderLiveLotteryListLoader.f13740e, finderLiveLotteryListLoader.f13741f, (byte[]) null, finderLiveLotteryListLoader.f13742g, finderLiveLotteryListLoader.f13739d, finderLiveLotteryListLoader.getLastBuffer(), (C7339i0.C7340a) null);
            i0Var.f25458w = 2;
            return i0Var;
        }

        /* renamed from: e */
        public C89132b mo2702e() {
            int i = FinderLiveLotteryListLoader.this.f13743h;
            String O5 = C66785b.f191882e.mo90662O5();
            FinderLiveLotteryListLoader finderLiveLotteryListLoader = FinderLiveLotteryListLoader.this;
            C7339i0 i0Var = new C7339i0(i, O5, finderLiveLotteryListLoader.f13740e, finderLiveLotteryListLoader.f13741f, (byte[]) null, finderLiveLotteryListLoader.f13742g, finderLiveLotteryListLoader.f13739d, finderLiveLotteryListLoader.getLastBuffer(), (C7339i0.C7340a) null);
            i0Var.f25458w = 0;
            return i0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader$b */
    public static final class C2722b extends IResponse<C0740i2> {

        /* renamed from: a */
        public final C52204z21 f13746a;

        /* renamed from: b */
        public final boolean f13747b;

        /* renamed from: c */
        public String f13748c;

        /* renamed from: d */
        public String f13749d;

        /* renamed from: e */
        public int f13750e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2722b(int i, int i2, String str, C52204z21 z212, boolean z, String str2, String str3, int i3, int i4, C8480h hVar) {
            super(i, i2, str);
            z212 = (i4 & 8) != 0 ? null : z212;
            z = (i4 & 16) != 0 ? false : z;
            str2 = (i4 & 32) != 0 ? "" : str2;
            str3 = (i4 & 64) != 0 ? "" : str3;
            i3 = (i4 & 128) != 0 ? 0 : i3;
            this.f13746a = z212;
            this.f13747b = z;
            this.f13748c = str2;
            this.f13749d = str3;
            this.f13750e = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader$c */
    public static final class C2723c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLotteryListLoader f13751d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<C0740i2> f13752e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2723c(FinderLiveLotteryListLoader finderLiveLotteryListLoader, IResponse<C0740i2> iResponse) {
            super(0);
            this.f13751d = finderLiveLotteryListLoader;
            this.f13752e = iResponse;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13751d.f13744i;
            if (lVar != null) {
                lVar.invoke(this.f13752e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLotteryListLoader(String str, long j, long j2, String str2, int i) {
        super((C49712hj1) null);
        C87412m.m108594g(str, "lotteryId");
        C87412m.m108594g(str2, "objectNonceId");
        this.f13739d = str;
        this.f13740e = j;
        this.f13741f = j2;
        this.f13742g = str2;
        this.f13743h = i;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2721a();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryListLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (isInitOperation(iResponse)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryListLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
            return;
        }
        iResponse.getHasMore();
        C61926c.m72668M(new C2723c(this, iResponse));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryListLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
