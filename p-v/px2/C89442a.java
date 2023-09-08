package px2;

import com.tencent.p014mm.autogen.mmdata.rpt.WACanvasPerformanceReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: px2.a */
public final class C89442a {

    /* renamed from: a */
    public static final C89442a f257487a = new C89442a();

    /* renamed from: b */
    public static HashMap<String, Long> f257488b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<String, Long> f257489c = new HashMap<>();

    /* renamed from: d */
    public static final int f257490d = 16;

    /* renamed from: e */
    public static final int f257491e = 17;

    /* renamed from: a */
    public final void mo123762a(String str, long j, long j2, long j3) {
        WACanvasPerformanceReportStruct wACanvasPerformanceReportStruct = new WACanvasPerformanceReportStruct();
        wACanvasPerformanceReportStruct.f236449d = wACanvasPerformanceReportStruct.mo86045b("AppId", "wx2f3fb5db9f226462", true);
        wACanvasPerformanceReportStruct.f236452g = j2;
        wACanvasPerformanceReportStruct.f236453h = wACanvasPerformanceReportStruct.mo86045b("Scene", str, true);
        wACanvasPerformanceReportStruct.f236450e = j;
        wACanvasPerformanceReportStruct.f236451f = j3;
        Log.m105924i("MagicLiveCardReporter", "eventType:" + j + " report appId:" + wACanvasPerformanceReportStruct.f236449d + " sessionId:" + wACanvasPerformanceReportStruct.f236452g + " scene:" + wACanvasPerformanceReportStruct.f236453h + " eventTimestamp:" + wACanvasPerformanceReportStruct.f236451f);
        wACanvasPerformanceReportStruct.mo86054n();
    }

    /* renamed from: b */
    public final void mo123763b(String str) {
        C87412m.m108594g(str, "frameSetName");
        Log.m105924i("MagicLiveCardReporter", "markStartTimeForScene frameSetName:" + str);
        if (f257488b.containsKey(str)) {
            Log.m105920e("MagicLiveCardReporter", "markStartTimeForScene sessionIdMap already has frameSetName:" + str);
            return;
        }
        f257488b.put(str, Long.valueOf(System.currentTimeMillis()));
    }
}
