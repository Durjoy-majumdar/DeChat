package ks2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsFPSReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p221qf.C89643f;
import p723vf.C90773a;

/* renamed from: ks2.d */
public class C99180d implements C89643f {

    /* renamed from: a */
    public static final C99180d f290855a = new C99180d();

    /* renamed from: b */
    public static boolean f290856b;

    /* renamed from: a */
    public void mo97648a(String str, long[] jArr, int[] iArr, int[] iArr2, float f, float f2, float f3) {
        SnsMethodCalculate.markStartTimeMs("onFrameMetricsAvailable", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        try {
            int i = C90773a.m113839e(MMApplicationContext.getContext()).f260682d;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            int i6 = iArr[4];
            float f4 = (float) (i3 + i4 + i5 + i6);
            SnsFPSReportStruct snsFPSReportStruct = new SnsFPSReportStruct();
            snsFPSReportStruct.f266013d = (int) (100.0f * f3);
            snsFPSReportStruct.f266014e = i;
            snsFPSReportStruct.f266015f = i2;
            snsFPSReportStruct.f266016g = i3;
            snsFPSReportStruct.f266017h = i4;
            snsFPSReportStruct.f266018i = i5;
            snsFPSReportStruct.f266019j = i6;
            snsFPSReportStruct.f266020k = (int) (((double) (((((float) i3) * 1.0f) / f4) + ((((float) i4) * 14.0f) / f4) + ((((float) i5) * 25.0f) / f4) + ((((float) i6) * 60.0f) / f4))) * 100.0d);
            snsFPSReportStruct.mo86054n();
        } catch (Exception e) {
            Log.printErrStackTrace("SnsDropFrameReporter", e, "avgDroppedFrame: %d, avgRefreshRate: %.2f, avgFps: %.2f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        }
        SnsMethodCalculate.markEndTimeMs("onFrameMetricsAvailable", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
    }

    /* renamed from: b */
    public boolean mo97649b() {
        SnsMethodCalculate.markStartTimeMs("skipFirstFrame", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        SnsMethodCalculate.markEndTimeMs("skipFirstFrame", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return false;
    }

    /* renamed from: c */
    public int mo97650c() {
        SnsMethodCalculate.markStartTimeMs("getThreshold", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        SnsMethodCalculate.markEndTimeMs("getThreshold", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return 0;
    }

    /* renamed from: d */
    public int mo97651d() {
        SnsMethodCalculate.markStartTimeMs("getIntervalMs", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        SnsMethodCalculate.markEndTimeMs("getIntervalMs", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return 10000;
    }

    public String getName() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        String name = SnsTimeLineUI.class.getName();
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return name;
    }
}
