package lu0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import en0.C86586a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lu0.c */
public class C88650c implements C86586a {

    /* renamed from: b */
    public static C88650c f255956b;

    /* renamed from: a */
    public Set<String> f255957a = new HashSet();

    /* renamed from: b */
    public static C88650c m110561b() {
        if (f255956b == null) {
            synchronized (C88650c.class) {
                if (f255956b == null) {
                    C88650c cVar = new C88650c();
                    f255956b = cVar;
                    return cVar;
                }
            }
        }
        return f255956b;
    }

    /* renamed from: a */
    public void mo123088a(String str, String str2, int i, long j, long j2, long j3, int i2, String str3, long j4, long j5, long j6, long j7, String str4, int i3) {
        Log.m105925i("MicroMsg.SameLayer.VideoReporter", "downloadResult, videoUuid:%s, sourceUrl:%s, priority:%s, rangeStart:%s, rangeEnd:%s, totalLength:%s, contentType:%s, requestMethod:%s, speed:%s, retCode:%s, subRetCode:%s, responseCode:%s, costTime:%s, message:%s", str, str2, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2), str3, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Integer.valueOf(i3), str4);
        C115669n.INSTANCE.mo160131h(18693, str, str2, Integer.valueOf(i), Long.valueOf(j7), Integer.valueOf(i3), Long.valueOf(j5), Long.valueOf(j6), str4, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2), str3, Long.valueOf(j4));
    }

    /* renamed from: c */
    public void mo123089c() {
        C115669n.INSTANCE.idkeyStat(1234, 36, 1, false);
    }

    /* renamed from: d */
    public void mo123090d(String str, String str2) {
        Log.m105925i("MicroMsg.SameLayer.VideoReporter", "reportPreloadEnd, uuid:%s, url:%s", str, str2);
        if (!((HashSet) this.f255957a).contains(str)) {
            C115669n.INSTANCE.idkeyStat(1234, 32, 1, false);
        } else {
            ((HashSet) this.f255957a).remove(str);
        }
    }

    /* renamed from: e */
    public void mo123091e(String str, String str2, int i) {
        Log.m105925i("MicroMsg.SameLayer.VideoReporter", "reportPreloadError, uuid:%s, url:%s, code:%s", str, str2, Integer.valueOf(i));
        ((HashSet) this.f255957a).add(str);
        if (i == -101) {
            C115669n.INSTANCE.idkeyStat(1234, 27, 1, false);
        } else if (i == -102) {
            C115669n.INSTANCE.idkeyStat(1234, 28, 1, false);
        } else if (i == -103) {
            C115669n.INSTANCE.idkeyStat(1234, 29, 1, false);
        } else if (i == -104) {
            C115669n.INSTANCE.idkeyStat(1234, 30, 1, false);
        } else if (i == -105) {
            C115669n.INSTANCE.idkeyStat(1234, 31, 1, false);
        }
    }

    /* renamed from: f */
    public void mo123092f(String str, String str2) {
        Log.m105925i("MicroMsg.SameLayer.VideoReporter", "reportPreloadStart, uuid:%s, url:%s", str, str2);
        C115669n.INSTANCE.idkeyStat(1234, 26, 1, false);
    }

    /* renamed from: g */
    public void mo123093g(int i) {
        Log.m105925i("MicroMsg.SameLayer.VideoReporter", "startProxyResult, reason:%s", Integer.valueOf(i));
        if (i >= 0) {
            C115669n.INSTANCE.idkeyStat(1234, 16, 1, false);
        } else if (i == -1) {
            C115669n.INSTANCE.idkeyStat(1234, 17, 1, false);
        } else if (i == -2) {
            C115669n.INSTANCE.idkeyStat(1234, 18, 1, false);
        }
    }
}
