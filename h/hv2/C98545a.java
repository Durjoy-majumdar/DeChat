package hv2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsAdClickCoordinateInfoReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102236a0;

/* renamed from: hv2.a */
public class C98545a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f288985d;

    /* renamed from: e */
    public final /* synthetic */ int f288986e;

    /* renamed from: f */
    public final /* synthetic */ int f288987f;

    /* renamed from: g */
    public final /* synthetic */ int f288988g;

    /* renamed from: h */
    public final /* synthetic */ int f288989h;

    /* renamed from: i */
    public final /* synthetic */ SnsInfo f288990i;

    public C98545a(AdRoundedCornerFrameLayout adRoundedCornerFrameLayout, int i, int i2, int i3, int i4, int i5, SnsInfo snsInfo) {
        this.f288985d = i;
        this.f288986e = i2;
        this.f288987f = i3;
        this.f288988g = i4;
        this.f288989h = i5;
        this.f288990i = snsInfo;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout$1");
        try {
            SnsAdClickCoordinateInfoReportStruct snsAdClickCoordinateInfoReportStruct = new SnsAdClickCoordinateInfoReportStruct();
            snsAdClickCoordinateInfoReportStruct.f265924d = this.f288985d;
            snsAdClickCoordinateInfoReportStruct.f265925e = this.f288986e;
            snsAdClickCoordinateInfoReportStruct.f265926f = this.f288987f;
            snsAdClickCoordinateInfoReportStruct.f265927g = this.f288988g;
            snsAdClickCoordinateInfoReportStruct.f265928h = this.f288989h;
            snsAdClickCoordinateInfoReportStruct.f265929i = snsAdClickCoordinateInfoReportStruct.mo86045b("SnsId", C102236a0.m134765q0(this.f288990i.field_snsId), true);
            snsAdClickCoordinateInfoReportStruct.f265930j = snsAdClickCoordinateInfoReportStruct.mo86045b("Uxinfo", this.f288990i.getUxinfo(), true);
            snsAdClickCoordinateInfoReportStruct.f265931k = snsAdClickCoordinateInfoReportStruct.mo86045b("Extra1", "", true);
            snsAdClickCoordinateInfoReportStruct.f265932l = snsAdClickCoordinateInfoReportStruct.mo86045b("Extra2", "", true);
            snsAdClickCoordinateInfoReportStruct.mo86054n();
        } catch (Throwable th) {
            Log.m105920e("AdRoundedCornerFrameLayout", "reportClickCoordinate, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout$1");
    }
}
