package ln1;

import com.tencent.p014mm.autogen.mmdata.rpt.NearbyLiveSquareReportStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import p723vf.C90773a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C22489al0;
import te3.C90420iq;
import vc1.C37715b;

/* renamed from: ln1.b */
public final class C21445b {

    /* renamed from: a */
    public static final C21445b f60694a = new C21445b();

    /* renamed from: b */
    public static long f60695b;

    /* renamed from: c */
    public static long f60696c;

    /* renamed from: d */
    public static boolean f60697d;

    /* renamed from: e */
    public static boolean f60698e;

    /* renamed from: f */
    public static boolean f60699f;

    /* renamed from: g */
    public static final ConcurrentHashMap<Integer, C21446a> f60700g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final HashSet<C21446a> f60701h = new HashSet<>();

    /* renamed from: i */
    public static long f60702i;

    /* renamed from: j */
    public static long f60703j;

    /* renamed from: ln1.b$a */
    public static final class C21446a {

        /* renamed from: a */
        public long f60704a;

        /* renamed from: b */
        public long f60705b;

        /* renamed from: c */
        public long f60706c;

        /* renamed from: d */
        public long f60707d;

        /* renamed from: e */
        public long f60708e;

        /* renamed from: f */
        public long f60709f;

        /* renamed from: g */
        public long f60710g;

        /* renamed from: h */
        public C89349b f60711h;

        /* renamed from: i */
        public int f60712i;

        /* renamed from: j */
        public int f60713j;

        /* renamed from: k */
        public String f60714k = "";

        /* renamed from: l */
        public long f60715l;

        /* renamed from: m */
        public long f60716m;

        /* renamed from: n */
        public long f60717n;

        /* renamed from: o */
        public long f60718o;

        /* renamed from: p */
        public long f60719p;

        /* renamed from: q */
        public long f60720q;

        /* renamed from: r */
        public C90420iq f60721r;
    }

    /* renamed from: ln1.b$b */
    public static final class C21447b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C21446a f60722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21447b(C21446a aVar) {
            super(0);
            this.f60722d = aVar;
        }

        public Object invoke() {
            C21445b bVar = C21445b.f60694a;
            C21446a aVar = this.f60722d;
            NearbyLiveSquareReportStruct nearbyLiveSquareReportStruct = new NearbyLiveSquareReportStruct();
            nearbyLiveSquareReportStruct.f48546f = (int) aVar.f60718o;
            nearbyLiveSquareReportStruct.f48544d = (int) aVar.f60715l;
            nearbyLiveSquareReportStruct.f48545e = (int) aVar.f60716m;
            nearbyLiveSquareReportStruct.f48547g = (int) aVar.f60717n;
            nearbyLiveSquareReportStruct.f48555o = aVar.f60712i;
            nearbyLiveSquareReportStruct.f48553m = C90773a.m113839e(MMApplicationContext.getContext()).f260682d;
            nearbyLiveSquareReportStruct.f48551k = C21445b.f60697d ? 1 : 0;
            nearbyLiveSquareReportStruct.f48554n = nearbyLiveSquareReportStruct.mo86045b("networkType", NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext()), true);
            nearbyLiveSquareReportStruct.f48556p = 2;
            nearbyLiveSquareReportStruct.f48548h = (int) aVar.f60719p;
            nearbyLiveSquareReportStruct.f48549i = (int) aVar.f60720q;
            nearbyLiveSquareReportStruct.f48552l = C21445b.f60699f ? 1 : 0;
            nearbyLiveSquareReportStruct.f48550j = (int) C21445b.f60703j;
            nearbyLiveSquareReportStruct.f48557q = aVar.f60713j;
            nearbyLiveSquareReportStruct.f48558r = nearbyLiveSquareReportStruct.mo86045b("tabName", aVar.f60714k, true);
            if (C21445b.f60698e) {
                nearbyLiveSquareReportStruct.f48551k = 2;
            }
            Log.m105924i("FinderNearbyLiveLoadingReporter", "reportILog：\n " + nearbyLiveSquareReportStruct.mo1006q() + " ，isFromRedClick = " + C21445b.f60698e);
            nearbyLiveSquareReportStruct.mo86054n();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final boolean mo33612a() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5(C37715b.f99914a.mo61298a() ? "FinderLiveEntrance" : "NearbyEntrance") != null;
    }

    /* renamed from: b */
    public final boolean mo33613b(int i) {
        Log.m105924i("FinderNearbyLiveLoadingReporter", "checkPullType: " + i);
        return (i == 1 || i == 0) ? false : true;
    }

    /* renamed from: c */
    public final C21446a mo33614c(int i) {
        return f60700g.get(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final List<C22489al0> mo33615d() {
        LinkedList linkedList = new LinkedList();
        HashSet<C21446a> hashSet = f60701h;
        synchronized (hashSet) {
            for (C21446a aVar : hashSet) {
                C22489al0 al02 = new C22489al0();
                al02.f63690d = 3;
                al02.f63692f = aVar.f60712i;
                al02.f63694h = (int) aVar.f60715l;
                al02.f63695i = (int) aVar.f60716m;
                al02.f63699p = (int) aVar.f60718o;
                al02.f63696j = (int) aVar.f60717n;
                al02.f63700q = aVar.f60711h;
                C90420iq iqVar = aVar.f60721r;
                if (iqVar != null) {
                    al02.f63706w = iqVar.f259607n;
                    al02.f63707x = iqVar.f259600d;
                    al02.f63708y = iqVar.f259601e;
                    al02.f63709z = iqVar.f259602f;
                    al02.f63685A = iqVar.f259603g;
                    al02.f63686B = iqVar.f259604h;
                    al02.f63687C = iqVar.f259605i;
                    al02.f63688D = iqVar.f259606j;
                }
                linkedList.add(al02);
                C61926c.m72656A((String) null, new C21447b(aVar));
                Log.m105924i("FinderNearbyLiveLoadingReporter", "getStatsReportFluencyInfo real report: \npullType = " + aVar.f60712i + ", \nenterCost = " + aVar.f60715l + ", \ncgiCost = " + aVar.f60716m + ",\ndbCost = " + aVar.f60718o + ",\ndebugMessage = " + aVar.f60711h + ",\nisFromClick = " + f60697d + ",\ntabName = " + aVar.f60714k + ",\nstart_time = " + al02.f63706w + "\nstart_connect_time = " + al02.f63707x + "\nconnect_successful_time = " + al02.f63708y + "\nstart_tls_handshake_time = " + al02.f63709z + "\ntls_handshake_successful_time = " + al02.f63685A + "\nstart_send_packet_time = " + al02.f63686B + "\nstart_read_packet_time = " + al02.f63687C + "\nread_packet_finished_time = " + al02.f63688D);
            }
            f60701h.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return linkedList;
    }

    /* renamed from: e */
    public final void mo33616e(int i, C89349b bVar, C90420iq iqVar) {
        C21446a c = mo33614c(i);
        if (c != null) {
            Log.m105924i("FinderNearbyLiveLoadingReporter", "onCgiBack tabType: " + i);
            c.f60706c = C31543z5.m39453c();
            c.f60711h = bVar;
            c.f60721r = iqVar;
        }
    }

    /* renamed from: f */
    public final void mo33617f(int i) {
        C21446a c = mo33614c(i);
        if (c != null) {
            Log.m105924i("FinderNearbyLiveLoadingReporter", "onDbEnd tabType: " + i);
            c.f60708e = C31543z5.m39453c();
            C21446a c2 = f60694a.mo33614c(i);
            if (c2 != null) {
                c2.f60709f = C31543z5.m39453c();
                Log.m105924i("FinderNearbyLiveLoadingReporter", "onUIShowBegin tabType: " + i);
            }
        }
    }

    /* renamed from: g */
    public final void mo33618g(int i) {
        C21446a c = mo33614c(i);
        if (c != null) {
            Log.m105924i("FinderNearbyLiveLoadingReporter", "onDbStart tabType: " + i);
            c.f60707d = C31543z5.m39453c();
        }
    }

    /* renamed from: h */
    public final void mo33619h(int i) {
        int i2 = i;
        C21446a c = mo33614c(i);
        if (c != null) {
            c.f60710g = C31543z5.m39453c();
            Log.m105924i("FinderNearbyLiveLoadingReporter", "onUIShowEnd tabType: " + i2);
            C21446a c2 = f60694a.mo33614c(i2);
            if (c2 != null) {
                long j = c2.f60705b;
                long j2 = c2.f60704a;
                long j3 = j - j2;
                c2.f60715l = j3;
                long j4 = c2.f60706c - j;
                c2.f60716m = j4;
                long j5 = c2.f60708e - c2.f60707d;
                c2.f60718o = j5;
                long j6 = j;
                long j7 = c2.f60710g - c2.f60709f;
                c2.f60717n = j7;
                if (f60697d) {
                    long j8 = f60696c;
                    c2.f60719p = j8 - j2;
                    c2.f60720q = j6 - j8;
                }
                c2.f60715l = j3;
                c2.f60716m = j4;
                c2.f60718o = j5;
                c2.f60717n = j7;
                Log.m105924i("FinderNearbyLiveLoadingReporter", "add to report list: pullType = " + c2.f60712i + ", tabType = " + i2 + ", enterCost = " + c2.f60715l + ", cgiCost = " + c2.f60716m + ",dbCost = " + c2.f60718o + ",uiCost = " + c2.f60717n);
                HashSet<C21446a> hashSet = f60701h;
                synchronized (hashSet) {
                    long j9 = c2.f60715l;
                    if (j9 >= 0 && j9 <= 60000 && c2.f60716m >= 0 && c2.f60717n >= 0 && c2.f60718o >= 0) {
                        hashSet.add(c2);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C21446a remove = f60700g.remove(Integer.valueOf(i));
            }
            if (f60698e) {
                f60701h.clear();
            }
            if (!(!f60701h.isEmpty())) {
                return;
            }
            if (i2 == 10000) {
                new C61315h().mo9225i();
            } else {
                new C61314c().mo9225i();
            }
        }
    }

    /* renamed from: i */
    public final void mo33620i(boolean z, boolean z2) {
        f60697d = z;
        f60695b = C31543z5.m39453c();
        f60698e = !z2 && mo33612a();
        Log.m105924i("FinderNearbyLiveLoadingReporter", "saveClickEnterTime isFromClick : " + z + " isFromRedClick: " + f60698e + " isFromNearby: " + z2);
    }

    /* renamed from: j */
    public final void mo33621j(int i, int i2) {
        if (mo33613b(i)) {
            f60700g.remove(Integer.valueOf(i2));
            return;
        }
        C21446a c = mo33614c(i2);
        if (c != null) {
            Log.m105924i("FinderNearbyLiveLoadingReporter", "startCgi tabType: " + i2);
            c.f60705b = C31543z5.m39453c();
        }
    }

    /* renamed from: k */
    public final void mo33622k(int i, int i2, String str) {
        long j;
        C87412m.m108594g(str, "tabName");
        if (mo33613b(i)) {
            f60700g.remove(Integer.valueOf(i2));
            return;
        }
        ConcurrentHashMap<Integer, C21446a> concurrentHashMap = f60700g;
        if (!concurrentHashMap.containsKey(Integer.valueOf(i2))) {
            C21446a aVar = new C21446a();
            aVar.f60713j = i2;
            aVar.f60712i = i;
            aVar.f60714k = str;
            concurrentHashMap.put(Integer.valueOf(i2), aVar);
        }
        Log.m105924i("FinderNearbyLiveLoadingReporter", "tickReportStart pullTypeParams: " + i + " tabType: " + i2 + " tabName: " + str);
        C21446a c = mo33614c(i2);
        if (c != null) {
            if (i == 0) {
                j = f60695b;
            } else {
                f60697d = false;
                f60698e = false;
                j = C31543z5.m39453c();
            }
            c.f60704a = j;
        }
    }
}
