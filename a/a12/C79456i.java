package a12;

import android.content.Context;
import android.content.Intent;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import gv3.C87401b;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: a12.i */
public class C79456i extends C87401b {
    public C79456i(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo109439a(File file, SharePatchInfo sharePatchInfo, String str) {
        super.mo109439a(file, sharePatchInfo, str);
        C115669n.INSTANCE.idkeyStat(338, 116, 1, false);
    }

    /* renamed from: b */
    public void mo109440b(File file, int i) {
        super.mo109440b(file, i);
        Log.m105925i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", Integer.valueOf(i));
        switch (i) {
            case -8:
                C115669n.INSTANCE.mo175910t(338, 107, 131, false);
                return;
            case -7:
                C115669n.INSTANCE.mo175910t(338, 107, 113, false);
                return;
            case -6:
                C115669n.INSTANCE.mo175910t(338, 107, 112, false);
                return;
            case -5:
                C115669n.INSTANCE.mo175910t(338, 107, 111, false);
                return;
            case -4:
                C115669n.INSTANCE.mo175910t(338, 107, 110, false);
                return;
            case -3:
                C115669n.INSTANCE.mo175910t(338, 107, 109, false);
                return;
            case -2:
                C115669n.INSTANCE.mo175910t(338, 107, 129, false);
                return;
            case -1:
                C115669n.INSTANCE.mo175910t(338, 107, 108, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public void mo109441c(File file, boolean z, long j) {
        super.mo109441c(file, z, j);
        Log.m105924i("Tinker.TinkerPatchReporter", "onPatchResult start");
        if (z) {
            C115669n.INSTANCE.idkeyStat(338, 3, 1, true);
        }
        if (z) {
            C115669n.INSTANCE.idkeyStat(338, 101, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(338, 103, 1, false);
        }
        Log.m105925i("Tinker.HotPatchReportHelper", "hp_report report apply cost = %d", Long.valueOf(j));
        if (j < 0) {
            Log.m105920e("Tinker.HotPatchReportHelper", "hp_report report apply cost failed, invalid cost");
        } else if (j <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            if (z) {
                C115669n.INSTANCE.idkeyStat(338, 117, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(338, 122, 1, false);
            }
        } else if (j <= 10000) {
            if (z) {
                C115669n.INSTANCE.idkeyStat(338, 118, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(338, 123, 1, false);
            }
        } else if (j <= 30000) {
            if (z) {
                C115669n.INSTANCE.idkeyStat(338, 119, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(338, 124, 1, false);
            }
        } else if (j > 60000) {
            if (j >= 3600000) {
                C115669n.INSTANCE.idkeyStat(338, 133, 1, false);
            }
            if (z) {
                C115669n.INSTANCE.idkeyStat(338, 121, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(338, 126, 1, false);
            }
        } else if (z) {
            C115669n.INSTANCE.idkeyStat(338, 120, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(338, 125, 1, false);
        }
        Log.appenderFlushSync();
    }

    /* renamed from: d */
    public void mo109442d(File file, File file2, String str, int i) {
        int i2 = i;
        super.mo109442d(file, file2, str, i);
        if (i2 == 1) {
            C115669n.INSTANCE.idkeyStat(338, 130, 1, false);
        } else if (i2 == 3) {
            C115669n.INSTANCE.idkeyStat(338, 114, 1, false);
        } else if (i2 == 5) {
            C115669n.INSTANCE.idkeyStat(338, 115, 1, false);
        } else if (i2 == 6) {
            C115669n.INSTANCE.idkeyStat(338, 132, 1, false);
        } else if (i2 == 7) {
            C115669n.INSTANCE.idkeyStat(338, 136, 1, false);
        }
    }

    /* renamed from: e */
    public void mo109443e(File file, List<File> list, Throwable th) {
        super.mo109443e(file, list, th);
        if (th.getMessage().contains(ShareConstants.CHECK_DEX_OAT_EXIST_FAIL)) {
            C115669n.INSTANCE.idkeyStat(338, 134, 1, false);
        } else if (th.getMessage().contains(ShareConstants.CHECK_DEX_OAT_FORMAT_FAIL)) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(338, 135, 1, false);
            nVar.mo160135k("Tinker", "Tinker Exception:apply tinker occur dexOpt format exception " + MMUncaughtExceptionHandler.getExceptionCauseString(th), (Map<String, Object>) null);
        } else {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(338, 105, 1, false);
            nVar2.mo160135k("Tinker", "Tinker Exception:apply tinker occur dexOpt exception " + MMUncaughtExceptionHandler.getExceptionCauseString(th), (Map<String, Object>) null);
        }
        TinkerStatusReport.reportKVStringValue(C80589e.f235762c, TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, android.util.Log.getStackTraceString(th));
    }

    /* renamed from: f */
    public void mo109444f(File file, String str, String str2) {
        super.mo109444f(file, str, str2);
        C115669n.INSTANCE.idkeyStat(338, 106, 1, false);
    }

    /* renamed from: g */
    public void mo109445g(File file, Throwable th) {
        super.mo109445g(file, th);
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(338, 104, 1, false);
        nVar.mo160135k("Tinker", "Tinker Exception:apply tinker occur unknown exception " + MMUncaughtExceptionHandler.getExceptionCauseString(th), (Map<String, Object>) null);
    }

    /* renamed from: h */
    public void mo109446h(Intent intent) {
        super.mo109446h(intent);
        KVCommCrossProcessReceiver.f346931c = 100;
        Log.m105924i("Tinker.HotPatchReportHelper", "hp_report try to apply patch service start");
        if (intent == null) {
            C115669n.INSTANCE.mo175910t(338, 6, 127, false);
        } else if (ShareIntentUtil.getStringExtra(intent, "patch_path_extra") == null) {
            C115669n.INSTANCE.mo175910t(338, 6, 128, false);
        } else {
            C115669n.INSTANCE.idkeyStat(338, 6, 1, true);
        }
    }
}
