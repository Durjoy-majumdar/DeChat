package dp1;

import android.os.SystemClock;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLivePerformanceDataStruct;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58113g;
import gg1.C32444a;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: dp1.d0 */
public final class C58358d0 {

    /* renamed from: a */
    public static final C58358d0 f167115a = new C58358d0();

    /* renamed from: b */
    public static long f167116b = 0;

    /* renamed from: c */
    public static long f167117c = 0;

    /* renamed from: d */
    public static C58359a f167118d = null;

    /* renamed from: e */
    public static boolean f167119e = false;

    /* renamed from: f */
    public static boolean f167120f = false;

    /* renamed from: g */
    public static boolean f167121g = true;

    /* renamed from: h */
    public static boolean f167122h;

    /* renamed from: dp1.d0$a */
    public static final class C58359a {

        /* renamed from: a */
        public long f167123a;

        /* renamed from: b */
        public long f167124b;

        /* renamed from: c */
        public long f167125c;

        /* renamed from: d */
        public long f167126d;

        /* renamed from: e */
        public long f167127e;

        /* renamed from: f */
        public long f167128f;

        /* renamed from: g */
        public long f167129g;
    }

    /* renamed from: e */
    public static void m67593e(C58358d0 d0Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        d0Var.getClass();
        if (!z2) {
            f167119e = z;
            C58359a aVar = f167118d;
            if (aVar != null) {
                aVar.f167123a = SystemClock.elapsedRealtime();
            }
            if (!d0Var.mo83113c()) {
                f167117c = 2;
            }
            f167122h = true;
        }
    }

    /* renamed from: f */
    public static void m67594f(C58358d0 d0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        d0Var.getClass();
        if (f167116b != 1 || f167117c != 1) {
            C58359a aVar = f167118d;
            if (aVar != null) {
                aVar.f167125c = SystemClock.elapsedRealtime();
            }
        } else if (!z) {
            C58359a aVar2 = f167118d;
            if (aVar2 != null) {
                aVar2.f167125c = SystemClock.elapsedRealtime();
            }
            if (!f167121g) {
                f167120f = false;
            } else {
                f167121g = false;
            }
        } else {
            f167120f = true;
        }
        C58359a aVar3 = f167118d;
        if (aVar3 != null) {
            aVar3.f167125c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final JSONObject mo83111a() {
        JSONObject jSONObject = new JSONObject();
        C58359a aVar = f167118d;
        if (aVar != null) {
            C58358d0 d0Var = f167115a;
            if (d0Var.mo83113c()) {
                jSONObject.put("realFirstFrameTime", aVar.f167124b - aVar.f167129g);
            } else {
                jSONObject.put("realFirstFrameTime", aVar.f167124b - aVar.f167123a);
            }
            jSONObject.put("isPrePlay", d0Var.mo83113c());
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final long mo83112b(long j) {
        if (j < 0) {
            return 0;
        }
        return j;
    }

    /* renamed from: c */
    public final boolean mo83113c() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86078L1.mo60266n().intValue() == 1;
    }

    /* renamed from: d */
    public final void mo83114d(C58113g gVar, FeedData feedData) {
        C58113g gVar2 = gVar;
        C58359a aVar = f167118d;
        if (aVar != null) {
            aVar.f167124b = SystemClock.elapsedRealtime();
        }
        C58359a aVar2 = f167118d;
        if (aVar2 != null) {
            C58358d0 d0Var = f167115a;
            if (aVar2.f167123a == 0 || aVar2.f167124b == 0 || aVar2.f167125c == 0 || aVar2.f167127e == 0 || aVar2.f167126d == 0 || aVar2.f167128f == 0) {
                Log.m105924i("FinderLiveReporter", "report invalid data, startTime=" + aVar2.f167123a + ", firstFrame=" + aVar2.f167124b + ", startPlay=" + aVar2.f167125c + ", decodeStart=" + aVar2.f167127e + ", connectSuccess=" + aVar2.f167126d + "playBegin=" + aVar2.f167128f);
                return;
            }
            FinderLivePerformanceDataStruct finderLivePerformanceDataStruct = new FinderLivePerformanceDataStruct();
            finderLivePerformanceDataStruct.f155568d = f167116b;
            finderLivePerformanceDataStruct.f155569e = f167119e ? 3 : f167117c;
            if (f167122h || f167117c != 2) {
                String jSONObject = d0Var.mo83111a().toString();
                C87412m.m108593f(jSONObject, "buildJson().toString()");
                finderLivePerformanceDataStruct.f155579o = finderLivePerformanceDataStruct.mo86045b("data", C112551y.m153814n(jSONObject, ",", ";", false), true);
                finderLivePerformanceDataStruct.f155570f = d0Var.mo83112b(aVar2.f167124b - aVar2.f167123a);
                finderLivePerformanceDataStruct.f155571g = d0Var.mo83112b(aVar2.f167125c - aVar2.f167123a);
            } else {
                String jSONObject2 = d0Var.mo83111a().toString();
                C87412m.m108593f(jSONObject2, "buildJson().toString()");
                finderLivePerformanceDataStruct.f155579o = finderLivePerformanceDataStruct.mo86045b("data", C112551y.m153814n(jSONObject2, ",", ";", false), true);
                finderLivePerformanceDataStruct.f155570f = 0;
                finderLivePerformanceDataStruct.f155571g = 0;
            }
            finderLivePerformanceDataStruct.f155572h = d0Var.mo83112b(aVar2.f167126d - aVar2.f167125c);
            finderLivePerformanceDataStruct.f155573i = d0Var.mo83112b(aVar2.f167127e - aVar2.f167126d);
            finderLivePerformanceDataStruct.f155574j = d0Var.mo83112b(aVar2.f167124b - aVar2.f167128f);
            finderLivePerformanceDataStruct.f155575k = f167120f ? 1 : 0;
            finderLivePerformanceDataStruct.f155576l = d0Var.mo83112b(aVar2.f167124b - aVar2.f167125c);
            if (gVar2 != null) {
                finderLivePerformanceDataStruct.f155577m = finderLivePerformanceDataStruct.mo86045b("snn", gVar2.f166245o, true);
                finderLivePerformanceDataStruct.f155578n = gVar2.f166232b;
            } else if (feedData != null) {
                finderLivePerformanceDataStruct.f155577m = finderLivePerformanceDataStruct.mo86045b("snn", feedData.getNickName(), true);
                finderLivePerformanceDataStruct.f155578n = feedData.getLiveId();
            }
            finderLivePerformanceDataStruct.mo86054n();
            Log.m105924i("FinderLiveReporter", "report23799 info:" + finderLivePerformanceDataStruct.mo1006q());
        }
    }
}
