package x02;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;

/* renamed from: x02.f */
public class C38431f {

    /* renamed from: a */
    public static long f101382a;

    /* renamed from: a */
    public static void m41870a(String str, String str2, String str3, int i, int i2) {
        C115669n.INSTANCE.mo160131h(15974, str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), Boolean.FALSE);
        Log.m105925i("Tinker.HotPatchReportHelper", "CodeVersion:%s PatchVersion:%s TinkerId:%s Scene:%d Result:%d", str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: b */
    public static void m41871b(int i) {
        int i2 = i;
        Log.m105924i("Tinker.HotPatchReportHelper", "hp_report download failed");
        if (i2 == 0) {
            C115669n.INSTANCE.idkeyStat(338, 41, 1, false);
        } else if (i2 == 1) {
            C115669n.INSTANCE.idkeyStat(338, 42, 1, false);
        } else if (i2 == 2) {
            C115669n.INSTANCE.idkeyStat(614, 3, 1, false);
        }
    }

    /* renamed from: c */
    public static void m41872c(int i) {
        long ticksToNow = Util.ticksToNow(f101382a);
        Log.m105925i("Tinker.HotPatchReportHelper", "hp_report report download cost = %d", Long.valueOf(ticksToNow));
        if (i == 1) {
            C115669n.INSTANCE.idkeyStat(338, 40, 1, false);
        }
        if (ticksToNow < 0) {
            Log.m105920e("Tinker.HotPatchReportHelper", "hp_report report download cost failed, invalid cost");
        } else if (ticksToNow <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            C115669n.INSTANCE.mo175910t(338, 1, 43, false);
        } else if (ticksToNow <= 60000) {
            C115669n.INSTANCE.mo175910t(338, 1, 44, false);
        } else if (ticksToNow <= ApkDownloadManager.INTERVAL) {
            C115669n.INSTANCE.mo175910t(338, 1, 45, false);
        } else {
            C115669n.INSTANCE.mo175910t(338, 1, 46, false);
        }
    }

    /* renamed from: d */
    public static void m41873d(int i) {
        int i2 = i;
        Log.m105924i("Tinker.HotPatchReportHelper", "hp_report new hotpatch requested");
        if (i2 == 0) {
            C115669n.INSTANCE.idkeyStat(338, 0, 1, false);
        } else if (i2 == 1) {
            C115669n.INSTANCE.idkeyStat(338, 20, 1, false);
        } else if (i2 == 2) {
            C115669n.INSTANCE.idkeyStat(614, 0, 1, false);
        }
        f101382a = Util.currentTicks();
    }
}
