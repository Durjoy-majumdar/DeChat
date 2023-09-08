package jq2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: jq2.d */
public class C33629d {
    /* renamed from: a */
    public static int m40144a(String str) {
        String[] split;
        SnsMethodCalculate.markStartTimeMs("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        try {
            if (!TextUtils.isEmpty(str) && (split = str.split("-")) != null && split.length > 0) {
                int safeParseInt = Util.safeParseInt(split[0]);
                SnsMethodCalculate.markEndTimeMs("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
                return safeParseInt;
            }
        } catch (Throwable th) {
            Log.m105920e("AdImgDownloadReporter", "getRawRequestType, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        return 0;
    }

    /* renamed from: b */
    public static void m40145b(int i, int i2, int i3, String str) {
        SnsMethodCalculate.markStartTimeMs("reportAdPicDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        Log.m105924i("AdImgDownloadReporter", "reportAdPicDownload, result=" + i + ", scene=" + i2 + ", downloader=" + i3 + ", imgUrl=" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(21534, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
                if (i2 == 0) {
                    if (i == 0) {
                        nVar.mo175911u(1560, 1);
                    } else {
                        nVar.mo175911u(1560, 2);
                    }
                } else if (i2 == 1) {
                    if (i == 0) {
                        nVar.mo175911u(1560, 3);
                    } else {
                        nVar.mo175911u(1560, 4);
                    }
                }
                if (i3 == 1) {
                    if (i == 0) {
                        nVar.mo175911u(1560, 6);
                    } else {
                        nVar.mo175911u(1560, 7);
                    }
                } else if (i3 == 0) {
                    if (i == 0) {
                        nVar.mo175911u(1560, 8);
                    } else {
                        nVar.mo175911u(1560, 9);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdImgDownloadReporter", "reportAdPicDownload, exp=" + th.toString());
            }
        } else {
            Log.m105920e("AdImgDownloadReporter", "reportAdPicDownload, url is empty");
        }
        SnsMethodCalculate.markEndTimeMs("reportAdPicDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
    }
}
