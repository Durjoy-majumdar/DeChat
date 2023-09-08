package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsUploadReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.sns.statistics.w */
public class C95003w {

    /* renamed from: a */
    public static C95004a f275626a = new C95004a();

    /* renamed from: com.tencent.mm.plugin.sns.statistics.w$a */
    public static class C95004a {

        /* renamed from: a */
        public SnsUploadReportStruct f275627a = new SnsUploadReportStruct();

        /* renamed from: b */
        public long f275628b = 0;

        /* renamed from: c */
        public long f275629c = 0;

        /* renamed from: d */
        public HashMap<Integer, Long> f275630d = new HashMap<>();

        /* renamed from: e */
        public long f275631e = 0;
    }

    /* renamed from: a */
    public static void m120753a(int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("cdnCallback", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = f275626a.f275630d.get(Integer.valueOf(i)) == null ? 0 : f275626a.f275630d.get(Integer.valueOf(i)).longValue();
        if (longValue > 0) {
            SnsUploadReportStruct snsUploadReportStruct = f275626a.f275627a;
            long j = currentTimeMillis - longValue;
            snsUploadReportStruct.f266203r = j;
            snsUploadReportStruct.mo86046c("CDNCostTimeMs", j);
        } else {
            SnsUploadReportStruct snsUploadReportStruct2 = f275626a.f275627a;
            snsUploadReportStruct2.f266203r = -1;
            snsUploadReportStruct2.mo86046c("CDNCostTimeMs", -1);
        }
        C95004a aVar = f275626a;
        SnsUploadReportStruct snsUploadReportStruct3 = aVar.f275627a;
        snsUploadReportStruct3.f266195j = (long) i;
        snsUploadReportStruct3.f266194i = 4;
        snsUploadReportStruct3.f266196k = (long) i2;
        snsUploadReportStruct3.f266197l = (long) i3;
        m120754b(aVar);
        SnsMethodCalculate.markEndTimeMs("cdnCallback", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }

    /* renamed from: b */
    public static void m120754b(C95004a aVar) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        aVar.f275627a.mo86054n();
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }

    /* renamed from: c */
    public static void m120755c(int i) {
        SnsMethodCalculate.markStartTimeMs("startUploadCDN", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = System.currentTimeMillis();
        f275626a.f275630d.put(Integer.valueOf(i), Long.valueOf(currentTimeMillis));
        C95004a aVar = f275626a;
        SnsUploadReportStruct snsUploadReportStruct = aVar.f275627a;
        long j = currentTimeMillis - aVar.f275629c;
        snsUploadReportStruct.f266202q = j;
        snsUploadReportStruct.mo86046c("WaitTimeMs", j);
        SnsUploadReportStruct snsUploadReportStruct2 = f275626a.f275627a;
        snsUploadReportStruct2.f266195j = (long) i;
        snsUploadReportStruct2.f266203r = 0;
        snsUploadReportStruct2.mo86046c("CDNCostTimeMs", 0);
        C95004a aVar2 = f275626a;
        aVar2.f275627a.f266194i = 3;
        m120754b(aVar2);
        SnsMethodCalculate.markEndTimeMs("startUploadCDN", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }
}
