package ja0;

import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.autogen.mmdata.rpt.MaaSEventReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: ja0.b */
public final class C108679b {

    /* renamed from: a */
    public static final C108679b f325464a = new C108679b();

    /* renamed from: b */
    public static long f325465b;

    /* renamed from: a */
    public final void mo159694a(String str, MJError mJError, long j) {
        C87412m.m108594g(str, "funName");
        C87412m.m108594g(mJError, "error");
        JSONObject jSONObject = new JSONObject();
        MJError.MaasEC maasEC = mJError.f154609ec;
        jSONObject.put("ec", maasEC != null ? Integer.valueOf(maasEC.getErrorCode()) : null);
        jSONObject.put(StateEvent.Name.MESSAGE, mJError.message);
        C13598b0 b0Var = C13598b0.f38549a;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …age)\n        }.toString()");
        mo159696c(100, str, C112551y.m153814n(jSONObject2, ",", ";", false), j);
    }

    /* renamed from: b */
    public final void mo159695b(String str, long j) {
        C87412m.m108594g(str, "funName");
        mo159696c(100, str, "success", j);
    }

    /* renamed from: c */
    public final void mo159696c(int i, String str, String str2, long j) {
        Log.m105924i("MaasReport24945", "reportMMEvent() called with: eType = " + i + ", funName = " + str + ", result = " + str2 + ", callSpend = " + j);
        MaaSEventReportStruct maaSEventReportStruct = new MaaSEventReportStruct();
        maaSEventReportStruct.f310187d = maaSEventReportStruct.mo86045b("sessionKey", C60781a.f173118a, true);
        maaSEventReportStruct.f310188e = C60781a.f173119b;
        maaSEventReportStruct.f310189f = i;
        maaSEventReportStruct.f310190g = maaSEventReportStruct.mo86045b("maasVersionCode", "1011000", true);
        maaSEventReportStruct.f310205v = maaSEventReportStruct.mo86045b("asyncFuncName", str, true);
        maaSEventReportStruct.f310206w = maaSEventReportStruct.mo86045b("asyncFuncResult", str2, true);
        maaSEventReportStruct.f310207x = j;
        long j2 = f325465b;
        f325465b = 1 + j2;
        maaSEventReportStruct.f310208y = j2;
        maaSEventReportStruct.mo86054n();
    }
}
