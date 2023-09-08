package g83;

import com.tencent.p014mm.autogen.mmdata.rpt.WowCompliancePopupWindowReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: g83.m */
public final class C59389m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f169732d;

    /* renamed from: e */
    public final /* synthetic */ long f169733e;

    /* renamed from: f */
    public final /* synthetic */ long f169734f;

    public C59389m(long j, long j2, long j3) {
        this.f169732d = j;
        this.f169733e = j2;
        this.f169734f = j3;
    }

    public final void run() {
        WowCompliancePopupWindowReportStruct wowCompliancePopupWindowReportStruct = new WowCompliancePopupWindowReportStruct();
        wowCompliancePopupWindowReportStruct.f156962d = this.f169732d;
        wowCompliancePopupWindowReportStruct.f156963e = this.f169733e;
        wowCompliancePopupWindowReportStruct.f156964f = this.f169734f;
        wowCompliancePopupWindowReportStruct.mo86054n();
        Log.m105924i("MicroMsg.WebSearch.WebSearchUtils", "25208 ,action = " + wowCompliancePopupWindowReportStruct.f156962d + ",actionInfo = " + wowCompliancePopupWindowReportStruct.f156963e + ",actionInfo = " + wowCompliancePopupWindowReportStruct.f156964f);
    }
}
