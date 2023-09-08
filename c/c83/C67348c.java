package c83;

import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import d83.C75343a;
import eb0.C31543z5;
import gy3.C8479f0;
import gy3.C87412m;
import te3.C101810m82;
import te3.xe4;
import u73.C22613h1;

/* renamed from: c83.c */
public final class C67348c implements C75343a {

    /* renamed from: d */
    public final /* synthetic */ C75343a f193202d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<xe4> f193203e;

    /* renamed from: f */
    public final /* synthetic */ int f193204f;

    /* renamed from: g */
    public final /* synthetic */ String f193205g;

    /* renamed from: h */
    public final /* synthetic */ String f193206h;

    public C67348c(C75343a aVar, C8479f0<xe4> f0Var, int i, String str, String str2) {
        this.f193202d = aVar;
        this.f193203e = f0Var;
        this.f193204f = i;
        this.f193205g = str;
        this.f193206h = str2;
    }

    /* renamed from: a */
    public void mo91487a(String str, int i) {
        C87412m.m108594g(str, "tag");
        this.f193202d.mo91487a(str, i);
    }

    /* renamed from: b */
    public void mo91488b(C101810m82 m822) {
        C87412m.m108594g(m822, "shareContent");
        this.f193202d.mo91488b(m822);
        ((xe4) this.f193203e.f27484d).f228426q = 1;
    }

    public void onDismiss() {
        this.f193202d.onDismiss();
        WCTopicSearchVCActionReportStruct wCTopicSearchVCActionReportStruct = new WCTopicSearchVCActionReportStruct();
        long j = 2;
        wCTopicSearchVCActionReportStruct.f194690d = 2;
        if (((xe4) this.f193203e.f27484d).f228426q == 1) {
            wCTopicSearchVCActionReportStruct.f194691e = 1;
        } else {
            wCTopicSearchVCActionReportStruct.f194691e = 2;
        }
        wCTopicSearchVCActionReportStruct.f194692f = (long) this.f193204f;
        wCTopicSearchVCActionReportStruct.f194693g = (long) C31543z5.m39455e();
        if (!C72996z1.m85820U5(this.f193205g)) {
            j = 1;
        }
        wCTopicSearchVCActionReportStruct.f194694h = j;
        wCTopicSearchVCActionReportStruct.f194695i = wCTopicSearchVCActionReportStruct.mo86045b("EnterSceneId", this.f193205g, true);
        wCTopicSearchVCActionReportStruct.f194696j = wCTopicSearchVCActionReportStruct.mo86045b("SessionId", this.f193206h, true);
        wCTopicSearchVCActionReportStruct.f194697k = wCTopicSearchVCActionReportStruct.mo86045b("QueryKey", ((xe4) this.f193203e.f27484d).f228421i, true);
        wCTopicSearchVCActionReportStruct.mo86054n();
        C22613h1.m26490p(wCTopicSearchVCActionReportStruct);
        Log.m105924i("MicroMsg.WebSearch.TagSearchUILogic", "stopTagSearchDialog url:" + ((xe4) this.f193203e.f27484d).f228419g);
    }
}
