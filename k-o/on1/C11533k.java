package on1;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import cm1.C0707a0;
import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.newloader.FinderDefaultLoaderActions$2;
import com.tencent.p014mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1;
import com.tencent.p014mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1;
import com.tencent.p014mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1;
import com.tencent.p014mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o40.C61926c;
import pf1.C62273n;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64197v;
import te3.C49712hj1;
import uq1.C65464w;
import vp1.C14937o;
import vp1.C65834e;
import wp1.C15585f;

/* renamed from: on1.k */
public final class C11533k implements C65464w {

    /* renamed from: d */
    public final C11548q<C0740i2> f33860d;

    /* renamed from: e */
    public final C0125s f33861e;

    /* renamed from: f */
    public final C49712hj1 f33862f;

    /* renamed from: g */
    public final FinderDefaultLoaderActions$feedDeleteListener$1 f33863g;

    /* renamed from: h */
    public final FinderDefaultLoaderActions$feedProgressListener$1 f33864h;

    /* renamed from: i */
    public final FinderDefaultLoaderActions$liveUninterestedListener$1 f33865i;

    /* renamed from: j */
    public final FinderDefaultLoaderActions$feedChangeListener$1 f33866j;

    /* renamed from: on1.k$a */
    public static final class C11534a extends C87413o implements C32226l<List<? extends C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f33867d;

        /* renamed from: e */
        public final /* synthetic */ boolean f33868e;

        /* renamed from: f */
        public final /* synthetic */ C11533k f33869f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11534a(BaseFinderFeed baseFinderFeed, boolean z, C11533k kVar) {
            super(1);
            this.f33867d = baseFinderFeed;
            this.f33868e = z;
            this.f33869f = kVar;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, "dataList");
            BaseFinderFeed baseFinderFeed = this.f33867d;
            boolean z = this.f33868e;
            C11533k kVar = this.f33869f;
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0740i2 i2Var = (C0740i2) next;
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) i2Var;
                        if (baseFinderFeed2.mo3513o().getLocalId() == baseFinderFeed.mo3513o().getLocalId()) {
                            baseFinderFeed.mo3508l0(baseFinderFeed2.mo3468B());
                            baseFinderFeed.mo3510m0(baseFinderFeed2.mo3469C());
                            if (z) {
                                Log.m105924i("Finder.DefaultLoaderActions", "updateByLocalId " + baseFinderFeed.mo3513o().getLocalId());
                                kVar.getClass();
                                kVar.f33860d.mo11510m3(i, baseFinderFeed, 1, false);
                            }
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C11533k(C11548q qVar, C0125s sVar, C49712hj1 hj12, int i, C8480h hVar) {
        C39623j jVar = null;
        hj12 = (i & 4) != 0 ? null : hj12;
        C87412m.m108594g(qVar, "loader");
        C87412m.m108594g(sVar, "lifeCycleOwner");
        this.f33860d = qVar;
        this.f33861e = sVar;
        this.f33862f = hj12;
        C39623j lifecycle = sVar.getLifecycle();
        jVar = lifecycle.getCurrentState() != C39623j.C39626c.DESTROYED ? lifecycle : jVar;
        if (jVar != null) {
            jVar.addObserver(new FinderDefaultLoaderActions$2(this));
        }
        C40008f fVar = C40008f.f107254d;
        this.f33863g = new FinderDefaultLoaderActions$feedDeleteListener$1(this, fVar);
        this.f33864h = new FinderDefaultLoaderActions$feedProgressListener$1(this, fVar);
        this.f33865i = new FinderDefaultLoaderActions$liveUninterestedListener$1(this, fVar);
        this.f33866j = new FinderDefaultLoaderActions$feedChangeListener$1(this, fVar);
    }

    /* renamed from: c */
    public static final void m11345c(C11533k kVar, BaseFinderFeed baseFinderFeed) {
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(-1);
        arrayList.addAll(new ArrayList());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue >= 0) {
                C14937o.f40972a.mo13991m(baseFinderFeed.getItemId(), intValue, baseFinderFeed.mo3513o().getFeedObject());
            }
        }
    }

    /* renamed from: e */
    public static void m11346e(C11533k kVar, int i, int i2, Object obj, C0740i2 i2Var, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            obj = null;
        }
        if ((i3 & 8) != 0) {
            i2Var = null;
        }
        kVar.f33860d.mo11510m3(i, i2Var, obj, false);
    }

    /* renamed from: g */
    public static void m11347g(C11533k kVar, long j, C32226l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        kVar.getClass();
        FinderItem d = C15585f.f42211a.mo14341d(j);
        if (d != null) {
            Log.m105924i("Finder.DefaultLoaderActions", "updateItem localId:" + j + " itemLoadId:" + d.getLocalId() + " itemId:" + d.getId());
            BaseFinderFeed d2 = kVar.mo11486d(d);
            if (lVar != null) {
                lVar.invoke(d2);
            }
            kVar.mo11487f(d2, true);
        }
    }

    /* renamed from: d */
    public BaseFinderFeed mo11486d(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "feedObj");
        return C15585f.f42211a.mo14348k(finderItem);
    }

    /* renamed from: f */
    public final void mo11487f(BaseFinderFeed baseFinderFeed, boolean z) {
        C87412m.m108594g(baseFinderFeed, "newFeed");
        if (baseFinderFeed.mo3513o().getLocalId() > 0) {
            this.f33860d.mo11508k3(new C11524g(new C11534a(baseFinderFeed, z, this)));
        }
    }

    public void onPostEnd(long j, boolean z) {
        Log.m105924i("Finder.DefaultLoaderActions", "onPostEnd :" + j);
        m11347g(this, j, (C32226l) null, 2, (Object) null);
    }

    public void onPostNotify(long j, boolean z) {
        Log.m105924i("Finder.DefaultLoaderActions", "onPostNotify :" + j);
        m11347g(this, j, (C32226l) null, 2, (Object) null);
    }

    public void onPostOk(long j, long j2) {
        BaseFinderFeed baseFinderFeed;
        Log.m105924i("Finder.DefaultLoaderActions", "onPostOk :" + j);
        FinderItem e = C65834e.f189316a.mo89871e(j2);
        if (e != null) {
            e.setLocalId(j);
        }
        if (e != null) {
            Log.m105924i("Finder.DefaultLoaderActions", "updateItem localId:" + j + " itemLoadId:" + e.getLocalId() + " itemId:" + e.getId());
            C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…perGlobalUIC::class.java)");
            C62273n nVar = (C62273n) a;
            List b = C26236u.m33719b(e);
            C49712hj1 hj12 = this.f33862f;
            C62273n.m73200l3(nVar, b, hj12 != null ? hj12.f134675i : 0, (C49712hj1) null, 0, 12, (Object) null);
            baseFinderFeed = mo11486d(e);
            mo11487f(baseFinderFeed, true);
        } else {
            baseFinderFeed = null;
        }
        if (baseFinderFeed != null) {
            baseFinderFeed.mo3489W(true);
        }
    }

    public void onPostStart(long j) {
        Log.m105924i("Finder.DefaultLoaderActions", "onPostStart :" + j);
        FinderItem d = C15585f.f42211a.mo14341d(j);
        List<T> list = this.f33860d.f33886d;
        if (d != null) {
            BaseFinderFeed d2 = mo11486d(d);
            if (!d2.mo3513o().isMvFeed()) {
                Log.m105924i("Finder.DefaultLoaderActions", "onPostStart localId " + j + " feed " + d2);
                d2.mo3508l0(C58739j4.f168176a.mo83687P() ^ true);
                d2.mo3510m0(false);
                if (C110818d0.m150916N(list) instanceof C0707a0) {
                    C61926c.m72668M(new C11529i(this, d2));
                } else {
                    this.f33860d.mo11506i3(d2, 0, true);
                }
                C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
                C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
                C62273n nVar = (C62273n) a;
                List b = C26236u.m33719b(d);
                C49712hj1 hj12 = this.f33862f;
                C62273n.m73200l3(nVar, b, hj12 != null ? hj12.f134675i : 0, (C49712hj1) null, 0, 12, (Object) null);
            }
        }
    }
}
