package lo2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import qs2.C101271i0;
import vr2.C37817q;

/* renamed from: lo2.w */
public class C99572w {
    /* renamed from: a */
    public static void m129967a(int i, C101271i0 i0Var, long j, int i2, String str) {
        int i3 = i;
        long j2 = j;
        int i4 = i2;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
        long j3 = (long) i4;
        if (j3 <= j2) {
            SnsMethodCalculate.markEndTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
            return;
        }
        int i5 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i5 < 0) {
            if (i3 == 61) {
                try {
                    C115669n.INSTANCE.mo175911u(1720, 14);
                } catch (Throwable th) {
                    Log.m105920e(str2, th.toString());
                }
            } else if (i3 == 62) {
                C115669n.INSTANCE.mo175911u(1720, 17);
            } else if (i3 == 142) {
                C115669n.INSTANCE.mo175911u(1720, 11);
            }
        } else if (i5 == 0) {
            if (i3 == 61) {
                C115669n.INSTANCE.mo175911u(1720, 15);
            } else if (i3 == 62) {
                C115669n.INSTANCE.mo175911u(1720, 18);
            } else if (i3 == 142) {
                C115669n.INSTANCE.mo175911u(1720, 12);
            }
        } else if (j3 - j2 <= 10) {
            SnsMethodCalculate.markEndTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
            return;
        } else if (i3 == 61) {
            C115669n.INSTANCE.mo175911u(1720, 16);
        } else if (i3 == 62) {
            C115669n.INSTANCE.mo175911u(1720, 19);
        } else if (i3 == 142) {
            C115669n.INSTANCE.mo175911u(1720, 13);
        }
        String str3 = "";
        if (i0Var != null) {
            str3 = i0Var.mo140742i() + "|" + i0Var.mo140745l();
        }
        if (i3 == 61) {
            C37817q.m41545a("landing_page_video_comp_play_exposure_time_diff", "1", i4, (int) j2, str3);
        } else if (i3 == 62) {
            C37817q.m41545a("landing_page_video_comp_play_exposure_time_diff", "2", i4, (int) j2, str3);
        } else if (i3 == 142) {
            C37817q.m41545a("landing_page_video_comp_play_exposure_time_diff", "0", i4, (int) j2, str3);
        }
        Log.m105920e(str2, "playTimeInterval more than compStayTime, videoComp type is " + i3 + ", playTimeInterval is " + i4 + ", compStayTime is " + j2 + ", extra is " + str3);
        SnsMethodCalculate.markEndTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
    }
}
