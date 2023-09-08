package dp1;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13604l;
import te3.C49712hj1;
import up1.C37521f;
import z04.C112551y;

/* renamed from: dp1.v */
public final class C7453v {

    /* renamed from: a */
    public static final C7453v f25647a = new C7453v();

    /* renamed from: b */
    public static boolean f25648b = false;

    /* renamed from: c */
    public static boolean f25649c = true;

    /* renamed from: d */
    public static int f25650d;

    /* renamed from: e */
    public static int f25651e;

    /* renamed from: f */
    public static final ConcurrentHashMap<Integer, C7455b> f25652f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, C7454a>> f25653g = new ConcurrentHashMap<>();

    /* renamed from: dp1.v$a */
    public static final class C7454a {

        /* renamed from: a */
        public int f25654a;

        /* renamed from: b */
        public long f25655b;

        /* renamed from: c */
        public boolean f25656c;
    }

    /* renamed from: dp1.v$b */
    public static final class C7455b {

        /* renamed from: a */
        public int f25657a;

        /* renamed from: b */
        public int f25658b;

        /* renamed from: c */
        public boolean f25659c;

        /* renamed from: d */
        public boolean f25660d;

        /* renamed from: e */
        public boolean f25661e;

        /* renamed from: f */
        public int f25662f;
    }

    /* renamed from: a */
    public final boolean mo8600a() {
        C37521f.f99374d.getClass();
        return C37521f.f99311V5.mo60266n().intValue() == 0;
    }

    /* renamed from: b */
    public final C7454a mo8601b(int i, int i2) {
        ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, C7454a>> concurrentHashMap = f25653g;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap.get(Integer.valueOf(i));
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            concurrentHashMap.put(Integer.valueOf(i), concurrentHashMap2);
        }
        C7454a aVar = (C7454a) concurrentHashMap2.get(Integer.valueOf(i2));
        if (aVar != null) {
            return aVar;
        }
        C7454a aVar2 = new C7454a();
        concurrentHashMap2.put(Integer.valueOf(i2), aVar2);
        return aVar2;
    }

    /* renamed from: c */
    public final C7455b mo8602c(int i) {
        ConcurrentHashMap<Integer, C7455b> concurrentHashMap = f25652f;
        C7455b bVar = concurrentHashMap.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        C7455b bVar2 = new C7455b();
        concurrentHashMap.put(Integer.valueOf(i), bVar2);
        return bVar2;
    }

    /* renamed from: d */
    public final void mo8603d(int i, boolean z, boolean z2, int i2) {
        if (mo8600a() || !f25648b) {
            return;
        }
        if (z) {
            Log.m105924i("Finder.HomeActionReporter", "[onCgiStart] tabType:" + i + " isAuto:" + z2 + " cgiStatus:" + i2);
            mo8607h(i, 11, z2);
            mo8602c(i).f25662f = i2;
            return;
        }
        Log.m105924i("Finder.HomeActionReporter", "[onCgiEnd] tabType:" + i + " isAuto:" + z2 + " cgiStatus:" + i2);
        mo8607h(i, 12, z2);
        mo8602c(i).f25662f = i2;
    }

    /* renamed from: e */
    public final void mo8604e(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        if (!mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onEnterList] tabType:" + i + " curPosition:" + i2);
            f25651e = i;
            mo8602c(i).f25658b = i2;
            mo8607h(i, 3, false);
            mo8606g(context, i, new C13604l(3, 0), false);
        }
    }

    /* renamed from: f */
    public final void mo8605f(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        if (!mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onLeaveList] tabType:" + i + " curPosition:" + i2);
            f25651e = i;
            mo8602c(i).f25658b = i2;
            mo8607h(i, 4, false);
            mo8606g(context, i, new C13604l(4, 3), true);
        }
    }

    /* renamed from: g */
    public final long mo8606g(Context context, int i, C13604l<Integer, Integer> lVar, boolean z) {
        long j;
        JSONObject jSONObject = new JSONObject();
        C7455b c = mo8602c(i);
        jSONObject.put("curPosition", c.f25658b);
        jSONObject.put("itemCount", c.f25657a);
        jSONObject.put("isExposed", c.f25660d);
        jSONObject.put("isLoading", c.f25659c);
        jSONObject.put("isTop", c.f25661e);
        jSONObject.put("cgiStatus", c.f25662f);
        C7454a b = mo8601b(i, ((Number) lVar.f38555d).intValue());
        jSONObject.put("actionType", b.f25654a);
        jSONObject.put("actionTime", b.f25655b);
        jSONObject.put("isAuto", b.f25656c);
        int intValue = ((Number) lVar.f38555d).intValue();
        int intValue2 = ((Number) lVar.f38556e).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append(intValue);
        sb.append('-');
        sb.append(intValue2);
        jSONObject.put("pairType", sb.toString());
        C7454a b2 = mo8601b(i, ((Number) lVar.f38556e).intValue());
        long j2 = b2.f25655b;
        long j3 = 0;
        if (j2 > 0) {
            long j4 = b.f25655b;
            j = j4 > j2 ? j4 - j2 : System.currentTimeMillis() - b2.f25655b;
        } else {
            j = 0;
        }
        jSONObject.put("pairTime", j);
        if (z) {
            C7454a b3 = mo8601b(i, 12);
            C7454a b4 = mo8601b(i, 11);
            long j5 = b4.f25655b;
            if (j5 > 0) {
                long j6 = b3.f25655b;
                j3 = j6 > j5 ? j6 - j5 : System.currentTimeMillis() - b4.f25655b;
            }
            jSONObject.put("cgiTime", j3);
        }
        jSONObject.put("tabType", i);
        jSONObject.put("enterTabType", f25650d);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            C49712hj1 q3 = f.mo12861q3();
            long j7 = b.f25655b;
            Log.m105924i("Finder.ActionReporter", "[report23788] sessionId:" + q3.f134670d + ", contextId:" + q3.f134671e + ", clickTabContextId:" + q3.f134672f + ", commentScene:" + q3.f134675i + ", changeVersion:" + 2 + " reportType:" + 1 + ", timeStamp:" + j7 + ", actionData:" + jSONObject);
            String jSONObject2 = jSONObject.toString();
            C115669n.INSTANCE.mo160131h(23788, q3.f134670d, q3.f134671e, q3.f134672f, Integer.valueOf(q3.f134675i), 2, 1, Integer.valueOf((int) (j7 / ((long) 1000))), jSONObject2 != null ? C112551y.m153814n(jSONObject2, ",", ";", false) : "");
        }
        return j;
    }

    /* renamed from: h */
    public final void mo8607h(int i, int i2, boolean z) {
        C7454a b = mo8601b(i, i2);
        b.f25655b = System.currentTimeMillis();
        b.f25654a = i2;
        b.f25656c = z;
    }
}
