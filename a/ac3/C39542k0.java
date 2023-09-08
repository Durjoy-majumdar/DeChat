package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.tz4;
import te3.vz4;

/* renamed from: ac3.k0 */
public final class C39542k0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public static final C39542k0<_Ret, _Var> f106167a = new C39542k0<>();

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        vz4 vz4 = (vz4) cVar.f256796d;
        String str = C39538h0.f106158e;
        Log.m105924i(str, "CgiWeVisGetDeviceScore: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            Log.m105924i(str, "loadDeviceScore resp: runScore: " + vz4.f143789e + ", size:" + vz4.f143788d.size());
            LinkedList<tz4> linkedList = vz4.f143788d;
            C87412m.m108593f(linkedList, "resp.ConfigList");
            for (tz4 tz4 : linkedList) {
                String str2 = C39538h0.f106158e;
                Log.m105924i(str2, "resp: cpu:" + tz4.f142509d + ", gpu:" + tz4.f142510e);
            }
            C39538h0 h0Var = C39538h0.f106157d;
            MultiProcessMMKV vx02 = h0Var.vx0();
            C27862u0 u0Var = C27862u0.f77002a;
            vx02.encode("need_run_score", Boolean.parseBoolean(vz4.f143789e));
            h0Var.vx0().encode("score_cgi_time", System.currentTimeMillis());
            LinkedList<tz4> linkedList2 = vz4.f143788d;
            C87412m.m108593f(linkedList2, "resp.ConfigList");
            tz4 tz42 = (tz4) C110818d0.m150916N(linkedList2);
            if (tz42 != null) {
                h0Var.vx0().encode("cpu_score", tz42.f142509d);
                h0Var.vx0().encode("gpu_score", tz42.f142510e);
            }
        }
        return C13598b0.f38549a;
    }
}
