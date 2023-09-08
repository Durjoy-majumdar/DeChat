package os1;

import bl3.C0327w;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9256k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C36568h;
import te3.C51942x91;
import up1.C37521f;

/* renamed from: os1.w */
public final class C11759w extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final ConcurrentHashMap<Integer, C11760a> f34424e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<Integer, C11761b> f34425f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public ConcurrentHashMap<String, C9256k<C117747y>> f34426g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public final HashMap<String, C11763d> f34427h = new HashMap<>();

    /* renamed from: i */
    public int f34428i;

    /* renamed from: os1.w$a */
    public static final class C11760a {

        /* renamed from: a */
        public final int f34429a;

        /* renamed from: b */
        public List<? extends C0740i2> f34430b = new LinkedList();

        /* renamed from: c */
        public int f34431c;

        /* renamed from: d */
        public int f34432d;

        /* renamed from: e */
        public long f34433e;

        /* renamed from: f */
        public C11762c f34434f;

        /* renamed from: g */
        public C89349b f34435g;

        /* renamed from: h */
        public boolean f34436h;

        /* renamed from: i */
        public int f34437i;

        public C11760a(int i) {
            this.f34429a = i;
            new LinkedList();
            this.f34434f = C11762c.Default;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11760a) && this.f34429a == ((C11760a) obj).f34429a;
        }

        public int hashCode() {
            return this.f34429a;
        }

        public String toString() {
            return "Cache(tabType=" + this.f34429a + ')';
        }
    }

    /* renamed from: os1.w$b */
    public static final class C11761b {

        /* renamed from: a */
        public final int f34438a;

        /* renamed from: b */
        public long f34439b;

        /* renamed from: c */
        public long f34440c;

        /* renamed from: d */
        public long f34441d;

        public C11761b(int i) {
            this.f34438a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11761b) && this.f34438a == ((C11761b) obj).f34438a;
        }

        public int hashCode() {
            return this.f34438a;
        }

        public String toString() {
            return "LastPreloadTimeStampCache(liveTabId=" + this.f34438a + ')';
        }
    }

    /* renamed from: os1.w$c */
    public enum C11762c {
        Default,
        HardRefresh,
        Timeout,
        InCacheTime
    }

    /* renamed from: os1.w$d */
    public static final class C11763d {

        /* renamed from: a */
        public final ArrayList<C0740i2> f34447a;

        /* renamed from: b */
        public final long f34448b;

        public C11763d(ArrayList<C0740i2> arrayList, long j, int i, C8480h hVar) {
            arrayList = (i & 1) != 0 ? new ArrayList<>() : arrayList;
            C87412m.m108594g(arrayList, "data");
            this.f34447a = arrayList;
            this.f34448b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11763d)) {
                return false;
            }
            C11763d dVar = (C11763d) obj;
            return C87412m.m108589b(this.f34447a, dVar.f34447a) && this.f34448b == dVar.f34448b;
        }

        public int hashCode() {
            long j = this.f34448b;
            return (this.f34447a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "SubTabCache(data=" + this.f34447a + ", timestamp=" + this.f34448b + ')';
        }
    }

    /* renamed from: os1.w$e */
    public static final class C11764e extends C87413o implements C32224a<FinderRedDotManager> {

        /* renamed from: d */
        public static final C11764e f34449d = new C11764e();

        public C11764e() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        }
    }

    public C11759w() {
        C37521f.f99374d.getClass();
        this.f34428i = C37521f.f99269R.mo60266n().intValue();
        C36568h.m40985a(C11764e.f34449d);
    }

    /* renamed from: i3 */
    public static void m11458i3(C11759w wVar, int i, int i2, int i3, ArrayList arrayList, ArrayList arrayList2, C89349b bVar, boolean z, int i4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            arrayList2 = new ArrayList();
        }
        if ((i5 & 32) != 0) {
            bVar = null;
        }
        if ((i5 & 64) != 0) {
            z = false;
        }
        if ((i5 & 128) != 0) {
            i4 = 0;
        }
        wVar.getClass();
        C87412m.m108594g(arrayList, "lastDataList");
        C87412m.m108594g(arrayList2, "lastSectionDataList");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        wVar.f34428i = C37521f.f99269R.mo60266n().intValue();
        fVar.mo61169W();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0740i2 i2Var = (C0740i2) it.next();
            if (i2Var instanceof BaseFinderFeed) {
                ((BaseFinderFeed) i2Var).mo3482P();
            }
        }
        C11760a d3 = wVar.mo11635d3(i);
        d3.f34431c = i2;
        d3.f34432d = i3;
        d3.f34430b = arrayList;
        d3.f34434f = (!arrayList.isEmpty() || !arrayList2.isEmpty()) ? C11762c.Default : C11762c.HardRefresh;
        d3.f34435g = bVar;
        d3.f34436h = z;
        d3.f34437i = i4;
        Log.m105924i("NearbyLivePreloadCacheVM", "[store] tabType=" + i + " lastExitPosition=" + i2 + " lastExitFromTopPx=" + i3 + " refreshState=" + d3.f34434f + " subTabId:" + i4 + "current=" + C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, d3.f34433e / ((long) 1000)));
    }

    /* renamed from: c3 */
    public final String mo11634c3(C51942x91 x912, C51942x91 x913) {
        StringBuilder sb = new StringBuilder();
        Object obj = "";
        sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : obj);
        sb.append('_');
        if (x913 != null) {
            obj = Integer.valueOf(x913.f144531d);
        }
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: d3 */
    public final C11760a mo11635d3(int i) {
        if (this.f34424e.get(Integer.valueOf(i)) == null) {
            this.f34424e.put(Integer.valueOf(i), new C11760a(i));
        }
        C11760a aVar = this.f34424e.get(Integer.valueOf(i));
        C87412m.m108591d(aVar);
        return aVar;
    }

    /* renamed from: e3 */
    public final C11761b mo11636e3(int i) {
        if (this.f34425f.get(Integer.valueOf(i)) == null) {
            this.f34425f.put(Integer.valueOf(i), new C11761b(i));
        }
        C11761b bVar = this.f34425f.get(Integer.valueOf(i));
        C87412m.m108591d(bVar);
        return bVar;
    }

    /* renamed from: f3 */
    public final boolean mo11637f3(int i) {
        C11762c cVar = C11762c.Timeout;
        C11762c cVar2 = C11762c.InCacheTime;
        C11760a d3 = mo11635d3(i);
        C11762c cVar3 = d3.f34434f;
        Log.m105924i("NearbyLivePreloadCacheVM", "isAutoRefresh " + cVar3 + " tabType: " + i);
        if (cVar3 == C11762c.HardRefresh) {
            return true;
        }
        if (cVar3 == C11762c.Default || cVar3 == cVar2) {
            if (System.currentTimeMillis() - d3.f34433e > ((long) this.f34428i)) {
                d3.f34434f = cVar;
                return true;
            }
        } else if (cVar3 == cVar) {
            return true;
        }
        d3.f34434f = cVar2;
        return false;
    }

    /* renamed from: g3 */
    public final void mo11638g3(int i) {
        C11760a d3 = mo11635d3(i);
        d3.f34434f = C11762c.Default;
        d3.f34433e = System.currentTimeMillis();
        Log.m105924i("NearbyLivePreloadCacheVM", "[markUnFocusTabType] tabType=" + i);
    }
}
