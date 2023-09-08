package ac3;

import com.tencent.p014mm.autogen.mmdata.rpt.WeDeviceScoreReportInfoStruct;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xeffect.WeDeviceScore;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13598b0;

/* renamed from: ac3.i0 */
public final class C39541i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C39541i0 f106166d = new C39541i0();

    public C39541i0() {
        super(0);
    }

    public Object invoke() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_wevision_run_score, false);
        C39538h0 h0Var = C39538h0.f106157d;
        MultiProcessMMKV vx02 = h0Var.vx0();
        C27862u0 u0Var = C27862u0.f77002a;
        boolean z = vx02.getBoolean("local_run_score", true);
        boolean z2 = h0Var.vx0().getBoolean("need_run_score", false);
        if (wf && z2 && z) {
            h0Var.vx0().encode("local_run_score", false);
            String str = C39538h0.f106158e;
            Log.m105924i(str, "checkLocalRunScore: start");
            long currentTicks = Util.currentTicks();
            boolean z3 = BuildInfo.IS_ARM64;
            double BenchDNNCPU = WeDeviceScore.BenchDNNCPU();
            double BenchDNNOCL = WeDeviceScore.BenchDNNOCL();
            h0Var.vx0().encode("local_cpu_score", (float) BenchDNNCPU);
            h0Var.vx0().encode("lcoal_gpu_score", (float) BenchDNNOCL);
            WeDeviceScoreReportInfoStruct weDeviceScoreReportInfoStruct = new WeDeviceScoreReportInfoStruct();
            weDeviceScoreReportInfoStruct.f108025d = (int) (BenchDNNCPU * 100.0d);
            weDeviceScoreReportInfoStruct.f108026e = (int) (BenchDNNOCL * 100.0d);
            weDeviceScoreReportInfoStruct.f108029h = weDeviceScoreReportInfoStruct.mo86045b("NeedBenchScore", z2 ? "YES" : "NO", true);
            if (z3) {
                weDeviceScoreReportInfoStruct.f108027f = 64;
            } else {
                weDeviceScoreReportInfoStruct.f108027f = 32;
            }
            weDeviceScoreReportInfoStruct.f108030i = Util.ticksToNow(currentTicks);
            Log.m105924i(str, "checkLocalRunScore: " + weDeviceScoreReportInfoStruct.mo1006q());
            weDeviceScoreReportInfoStruct.mo86054n();
        }
        return C13598b0.f38549a;
    }
}
