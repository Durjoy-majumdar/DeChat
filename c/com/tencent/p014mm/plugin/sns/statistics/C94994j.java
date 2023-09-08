package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.sns.statistics.j */
public final class C94994j {

    /* renamed from: a */
    public static Map<String, C94996b> f275602a = new ConcurrentHashMap();

    /* renamed from: b */
    public static volatile long f275603b = 0;

    /* renamed from: com.tencent.mm.plugin.sns.statistics.j$b */
    public static class C94996b {

        /* renamed from: a */
        public String f275604a = "";

        /* renamed from: b */
        public int f275605b = 0;

        /* renamed from: c */
        public String f275606c = "";

        /* renamed from: d */
        public int f275607d = -1;

        /* renamed from: e */
        public int f275608e = -1;

        /* renamed from: f */
        public int f275609f = -1;

        /* renamed from: g */
        public long f275610g = -1;

        /* renamed from: h */
        public long f275611h = -1;

        /* renamed from: i */
        public long f275612i = -1;

        /* renamed from: a */
        public static String m120751a(C94996b bVar) {
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            StringBuilder sb = new StringBuilder(1024);
            sb.append(bVar.f275604a);
            sb.append(',');
            sb.append(bVar.f275605b);
            sb.append(',');
            sb.append(bVar.f275606c);
            sb.append(',');
            sb.append(bVar.f275607d);
            sb.append(',');
            sb.append(bVar.f275608e);
            sb.append(',');
            sb.append(bVar.f275609f);
            sb.append(',');
            sb.append(bVar.f275610g);
            sb.append(',');
            sb.append(bVar.f275611h);
            sb.append(',');
            sb.append(bVar.f275612i);
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            return sb4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.statistics.j$c */
    public static class C94997c {

        /* renamed from: a */
        public String f275613a = "";

        /* renamed from: b */
        public String f275614b = "";

        /* renamed from: c */
        public int f275615c = -1;

        /* renamed from: d */
        public int f275616d = -1;

        /* renamed from: e */
        public int f275617e = -1;

        /* renamed from: f */
        public long f275618f = -1;

        public C94997c(C94995a aVar) {
        }

        /* renamed from: a */
        public static String m120752a(C94997c cVar) {
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            StringBuilder sb = new StringBuilder(1024);
            sb.append(cVar.f275613a);
            sb.append(',');
            sb.append(cVar.f275614b);
            sb.append(',');
            sb.append(cVar.f275615c);
            sb.append(',');
            sb.append(cVar.f275616d);
            sb.append(',');
            sb.append(cVar.f275617e);
            sb.append(',');
            sb.append(cVar.f275618f);
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            return sb4;
        }
    }

    /* renamed from: a */
    public static void m120747a() {
        SnsMethodCalculate.markStartTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        synchronized (f275602a) {
            try {
                if (Util.ticksToNow(f275603b) <= 120000) {
                    SnsMethodCalculate.markEndTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                    return;
                }
                f275603b = Util.currentTicks();
                ((ConcurrentHashMap) f275602a).clear();
                SnsMethodCalculate.markEndTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m120748b(String str) {
        SnsMethodCalculate.markStartTimeMs("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        int indexOf = str.indexOf(63);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf("://");
        if (indexOf2 >= 0) {
            str = str.substring(indexOf2 + 3);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 >= 0) {
            String substring = str.substring(indexOf3 + 1);
            SnsMethodCalculate.markEndTimeMs("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            return substring;
        }
        SnsMethodCalculate.markEndTimeMs("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        return str;
    }

    /* renamed from: c */
    public static void m120749c(String str, String str2, int i, String str3, int i2, int i3, int i4, long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("prepareReportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            C94996b bVar = new C94996b();
            String b = m120748b(str2);
            SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275604a = b;
            SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275605b = i;
            SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275606c = str3;
            SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275607d = i2;
            SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275608e = i3;
            SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275609f = i4;
            SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275610g = j;
            SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275611h = j2;
            SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            ((ConcurrentHashMap) f275602a).put(str, bVar);
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("prepareReportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }

    /* renamed from: d */
    public static void m120750d(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            C94996b bVar = (C94996b) ((ConcurrentHashMap) f275602a).remove(str);
            if (bVar == null) {
                m120747a();
                SnsMethodCalculate.markEndTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            bVar.f275612i = j;
            SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            String a = C94996b.m120751a(bVar);
            Log.m105924i("MicroMsg.SnsImgStats", "report dl: " + a);
            C115669n.INSTANCE.kvStat(13513, a);
            m120747a();
            SnsMethodCalculate.markEndTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        } catch (Exception unused) {
        } catch (Throwable th) {
            m120747a();
            SnsMethodCalculate.markEndTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            throw th;
        }
    }
}
