package rk3;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;

/* renamed from: rk3.a */
public final class C63462a {

    /* renamed from: a */
    public static final C63462a f180011a = new C63462a();

    /* renamed from: b */
    public static String f180012b = "";

    /* renamed from: c */
    public static String f180013c = "";

    /* renamed from: d */
    public static String f180014d = "";

    /* renamed from: e */
    public static int f180015e = 0;

    /* renamed from: f */
    public static String f180016f = "";

    /* renamed from: g */
    public static int f180017g = 1;

    /* renamed from: h */
    public static long f180018h;

    /* renamed from: i */
    public static long f180019i;

    /* renamed from: j */
    public static HashSet<Integer> f180020j = new HashSet<>();

    /* renamed from: k */
    public static long f180021k;

    /* renamed from: l */
    public static boolean f180022l;

    /* renamed from: m */
    public static boolean f180023m;

    /* renamed from: n */
    public static int f180024n;

    /* renamed from: d */
    public static /* synthetic */ void m74799d(C63462a aVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        aVar.mo88329c(i, i2, i3);
    }

    /* renamed from: a */
    public final SessionMsgSearchActionLogStruct mo88327a() {
        SessionMsgSearchActionLogStruct sessionMsgSearchActionLogStruct = new SessionMsgSearchActionLogStruct();
        sessionMsgSearchActionLogStruct.f156817d = sessionMsgSearchActionLogStruct.mo86045b("sessionid", f180012b, true);
        sessionMsgSearchActionLogStruct.f156818e = sessionMsgSearchActionLogStruct.mo86045b("searchsessionid", f180013c, true);
        sessionMsgSearchActionLogStruct.f156820g = (long) f180015e;
        return sessionMsgSearchActionLogStruct;
    }

    /* renamed from: b */
    public final void mo88328b(int i) {
        Log.m105924i("MicroMsg.FTSMultiReporter", "reportFTSLongClickAction >> " + i + ", " + f180015e + ", " + f180012b);
        SessionMsgSearchActionLogStruct a = mo88327a();
        a.f156819f = (long) i;
        a.mo86054n();
    }

    /* renamed from: c */
    public final void mo88329c(int i, int i2, int i3) {
        Log.m105924i("MicroMsg.FTSMultiReporter", "reportItemClick >> " + i + ", " + f180015e + ", " + f180017g);
        SessionMsgSearchActionLogStruct a = mo88327a();
        a.f156819f = 5;
        a.f156821h = (long) i;
        int i4 = f180015e;
        if (i4 == 1) {
            a.f156824k = (long) f180017g;
        }
        if (i4 == 0) {
            Log.m105924i("MicroMsg.FTSMultiReporter", "reportItemClick currentTab is 0 to report position>> " + i2 + ", " + i3);
            a.f156832s = (long) i2;
            a.f156833t = (long) i3;
        }
        a.mo86054n();
    }

    /* renamed from: e */
    public final void mo88330e(int i) {
        Log.m105924i("MicroMsg.FTSMultiReporter", "reportNormalAction >> action: " + i);
        SessionMsgSearchActionLogStruct a = mo88327a();
        a.f156819f = (long) i;
        if (i == 1) {
            a.f156828o = a.mo86045b("username", f180014d, true);
        } else if (i == 6) {
            a.f156824k = (long) f180017g;
        }
        a.mo86054n();
    }

    /* renamed from: f */
    public final void mo88331f(int i, int i2, int i3) {
        Log.m105924i("MicroMsg.FTSMultiReporter", "reportResultExpose >> " + i + ", " + i2 + ", " + f180022l + ", " + f180015e + ", " + f180013c + ", " + f180018h + ", " + f180019i + ", " + i3);
        if (f180020j.contains(Integer.valueOf(f180015e))) {
            Log.m105924i("MicroMsg.FTSMultiReporter", f180015e + " is report in " + f180013c);
            return;
        }
        if (f180019i == 0 && f180018h != 0) {
            Log.m105924i("MicroMsg.FTSMultiReporter", "firstShowSearchCost is 0");
            f180019i = System.currentTimeMillis() - f180018h;
        }
        f180020j.add(Integer.valueOf(f180015e));
        SessionMsgSearchActionLogStruct a = mo88327a();
        a.f156819f = 7;
        boolean z = f180022l;
        long j = 2;
        a.f156825l = (z || f180023m) ? 1 : 2;
        if (z || f180023m) {
            j = 1;
        }
        a.f156826m = j;
        a.f156827n = (long) i;
        a.f156830q = (long) i2;
        a.f156823j = f180019i;
        a.f156822i = a.mo86045b(SearchIntents.EXTRA_QUERY, f180016f, true);
        a.f156831r = (long) i3;
        a.mo86054n();
    }

    /* renamed from: g */
    public final void mo88332g(int i) {
        long j;
        Log.m105924i("MicroMsg.FTSMultiReporter", "reportSearchResult >> " + f180013c + ", " + f180018h + ", " + f180021k + ", " + i + ", " + f180024n);
        if (f180013c.length() > 0) {
            if (f180021k == 0 && !f180022l && f180024n == 1) {
                Log.m105924i("MicroMsg.FTSMultiReporter", "reportSearchResult >> imageQueryDoneTimeStamp is 0");
                f180021k = System.currentTimeMillis();
            }
            Log.m105924i("MicroMsg.FTSMultiReporter", "need to report result " + f180021k);
            SessionMsgSearchActionLogStruct a = mo88327a();
            a.f156819f = 8;
            if (!f180022l) {
                long j2 = f180018h;
                if (j2 != 0) {
                    long j3 = f180021k;
                    if (j3 >= j2 && f180024n == 1) {
                        j = j3 - j2;
                        a.f156829p = j;
                        a.f156830q = (long) i;
                        a.mo86054n();
                        Log.m105924i("MicroMsg.FTSMultiReporter", "resetSearchData >> " + f180013c + ", " + f180018h);
                        f180013c = "";
                        f180016f = "";
                        f180017g = 1;
                        f180018h = 0;
                        f180019i = 0;
                        f180020j.clear();
                        f180021k = 0;
                        f180024n = 0;
                    }
                }
            }
            j = 0;
            a.f156829p = j;
            a.f156830q = (long) i;
            a.mo86054n();
            Log.m105924i("MicroMsg.FTSMultiReporter", "resetSearchData >> " + f180013c + ", " + f180018h);
            f180013c = "";
            f180016f = "";
            f180017g = 1;
            f180018h = 0;
            f180019i = 0;
            f180020j.clear();
            f180021k = 0;
            f180024n = 0;
        }
    }

    /* renamed from: h */
    public final void mo88333h(int i, int i2) {
        Log.m105924i("MicroMsg.FTSMultiReporter", "reportVerticalSearch " + i + ", " + i2);
        SessionMsgSearchActionLogStruct sessionMsgSearchActionLogStruct = new SessionMsgSearchActionLogStruct();
        sessionMsgSearchActionLogStruct.f156819f = (long) i;
        sessionMsgSearchActionLogStruct.f156817d = sessionMsgSearchActionLogStruct.mo86045b("sessionid", f180012b, true);
        sessionMsgSearchActionLogStruct.f156834u = (long) i2;
        sessionMsgSearchActionLogStruct.mo86054n();
    }

    /* renamed from: i */
    public final void mo88334i() {
        Log.m105924i("MicroMsg.FTSMultiReporter", "setFirstToShowCost >> " + f180013c + ", " + f180018h);
        long currentTimeMillis = System.currentTimeMillis();
        long j = f180018h;
        long j2 = 0;
        if (j != 0 && currentTimeMillis > j) {
            j2 = currentTimeMillis - j;
        }
        f180019i = j2;
        Log.m105924i("MicroMsg.FTSMultiReporter", "setFirstToShowCost after >> " + f180019i);
    }
}
