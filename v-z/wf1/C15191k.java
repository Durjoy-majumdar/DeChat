package wf1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import h81.C59774i;
import java.util.UUID;
import org.json.JSONObject;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: wf1.k */
public final class C15191k {

    /* renamed from: a */
    public static final C15191k f41360a = new C15191k();

    /* renamed from: a */
    public final String mo14126a(int i, int i2, int i3) {
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        String n = C112551y.m153814n(uuid, "-", "", false);
        return i + '-' + i2 + '-' + i3 + '-' + n;
    }

    /* renamed from: b */
    public final void mo14127b(String str, String str2) {
        C87412m.m108594g(str, "eid");
        C87412m.m108594g(str2, "pagId");
        FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
        finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
        finderBroadcastEidClickStruct.mo1017x(C66785b.f191882e.mo90662O5());
        finderBroadcastEidClickStruct.mo1012s("");
        finderBroadcastEidClickStruct.mo1011E("");
        finderBroadcastEidClickStruct.mo1008B("");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidClickStruct.mo1019z(Wb);
        finderBroadcastEidClickStruct.mo1014u(f41360a.mo14126a(3, 28, 65));
        finderBroadcastEidClickStruct.mo1013t("temp_6");
        finderBroadcastEidClickStruct.mo1010D("");
        finderBroadcastEidClickStruct.mo1007A("");
        finderBroadcastEidClickStruct.mo1018y("");
        finderBroadcastEidClickStruct.mo1015v(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", str2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        finderBroadcastEidClickStruct.mo1016w(C112551y.m153814n(jSONObject2, ",", ";", false));
        finderBroadcastEidClickStruct.mo1009C("");
        finderBroadcastEidClickStruct.mo86054n();
        Log.m105924i("Finder.FinderChatRoomLiveReporter", "report23059 eid:" + str + ", pagId:" + str2);
    }

    /* renamed from: c */
    public final void mo14128c(String str) {
        C87412m.m108594g(str, "pagId");
        FinderBroadcastPageInStruct finderBroadcastPageInStruct = new FinderBroadcastPageInStruct();
        finderBroadcastPageInStruct.mo1020s("temp_6");
        finderBroadcastPageInStruct.mo1021t(mo14126a(3, 28, 65));
        finderBroadcastPageInStruct.mo1022u(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_finder_role", C58739j4.f168176a.mo83679H() ? 1 : 0);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …e 0)\n        }.toString()");
        finderBroadcastPageInStruct.mo1023v(C112551y.m153814n(jSONObject2, ",", ";", false));
        finderBroadcastPageInStruct.mo86054n();
        Log.m105924i("Finder.FinderChatRoomLiveReporter", "report22946 pagId:" + str);
    }

    /* renamed from: d */
    public final void mo14129d(String str) {
        C87412m.m108594g(str, "pagId");
        FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
        finderBroadcastPageOutStruct.mo1024s("temp_6");
        finderBroadcastPageOutStruct.mo1025t(mo14126a(3, 28, 65));
        finderBroadcastPageOutStruct.mo1026u(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_finder_role", C58739j4.f168176a.mo83679H() ? 1 : 0);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …e 0)\n        }.toString()");
        finderBroadcastPageOutStruct.mo1027v(C112551y.m153814n(jSONObject2, ",", ";", false));
        finderBroadcastPageOutStruct.mo86054n();
        Log.m105924i("Finder.FinderChatRoomLiveReporter", "report22947 pagId:" + str);
    }

    /* renamed from: e */
    public final void mo14130e(String str, String str2) {
        C87412m.m108594g(str, "eid");
        C87412m.m108594g(str2, "pagId");
        FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new FinderBroadcastEidExposeStruct();
        finderBroadcastEidExposeStruct.f9740d = Util.nowMilliSecond();
        finderBroadcastEidExposeStruct.f9741e = finderBroadcastEidExposeStruct.mo86045b("finderusername", C66785b.f191882e.mo90662O5(), true);
        finderBroadcastEidExposeStruct.f9742f = finderBroadcastEidExposeStruct.mo86045b("chnl_extra", "", true);
        finderBroadcastEidExposeStruct.f9743g = finderBroadcastEidExposeStruct.mo86045b("tab_id", "", true);
        finderBroadcastEidExposeStruct.f9744h = finderBroadcastEidExposeStruct.mo86045b("sub_tab_id", "", true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidExposeStruct.f9745i = finderBroadcastEidExposeStruct.mo86045b("sessionid", Wb, true);
        finderBroadcastEidExposeStruct.f9746j = finderBroadcastEidExposeStruct.mo86045b("contextid", f41360a.mo14126a(3, 28, 65), true);
        finderBroadcastEidExposeStruct.f9747k = finderBroadcastEidExposeStruct.mo86045b("commentscene", "temp_6", true);
        finderBroadcastEidExposeStruct.f9748l = finderBroadcastEidExposeStruct.mo86045b("TabContextID", "", true);
        finderBroadcastEidExposeStruct.f9749m = finderBroadcastEidExposeStruct.mo86045b("SubTabContextID", "", true);
        finderBroadcastEidExposeStruct.f9750n = finderBroadcastEidExposeStruct.mo86045b("pg_udf_kv", "", true);
        finderBroadcastEidExposeStruct.f9752p = finderBroadcastEidExposeStruct.mo86045b("eid", str, true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", str2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        finderBroadcastEidExposeStruct.f9753q = finderBroadcastEidExposeStruct.mo86045b("eld_udf_kv", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        finderBroadcastEidExposeStruct.f9754r = finderBroadcastEidExposeStruct.mo86045b("switch_extra", "", true);
        finderBroadcastEidExposeStruct.mo86054n();
        Log.m105924i("Finder.FinderChatRoomLiveReporter", "report23057 eid:" + str + ", pagId:" + str2);
    }
}
