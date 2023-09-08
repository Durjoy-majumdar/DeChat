package uo1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.mj_template.report.MaasPageFinderReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112551y;

/* renamed from: uo1.a */
public final class C14267a {

    /* renamed from: a */
    public static final C14267a f39802a = new C14267a();

    /* renamed from: b */
    public static final C13601g f39803b = C36568h.m40985a(C14268a.f39805d);

    /* renamed from: c */
    public static MaasPageFinderReporter f39804c;

    /* renamed from: uo1.a$a */
    public static final class C14268a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C14268a f39805d = new C14268a();

        public C14268a() {
            super(0);
        }

        public Object invoke() {
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            Log.m105924i("MicroMsg.FinderTemplateRecordReporter", "sessionId:" + Wb);
            return Wb;
        }
    }

    /* renamed from: a */
    public final String mo13636a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shooting_template_entrance", 1);
        if (str != null) {
            jSONObject.put("shooting_templateid", str);
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().also {\n    …   }\n        }.toString()");
        return C112551y.m153814n(jSONObject2, ",", ";", false);
    }

    /* renamed from: b */
    public final void mo13637b(String str, String str2) {
        String str3;
        C87412m.m108594g(str, "eid");
        C87412m.m108594g(str2, "templateId");
        MaasPageFinderReporter maasPageFinderReporter = f39804c;
        if (maasPageFinderReporter != null) {
            Log.m105924i("MaasPageFinderReporter", "reportRecordClick 21875 eid:" + str + " session: " + maasPageFinderReporter.f10367d + " contextId: " + maasPageFinderReporter.mo1203c() + " jumpId: " + maasPageFinderReporter.mo1205e() + " clickTabContext: " + maasPageFinderReporter.mo1202b() + " currentCommentScene: " + maasPageFinderReporter.f10368e);
            int hashCode = str.hashCode();
            if (hashCode == -1703990398 ? str.equals("shoot_same_video") : hashCode == -91524650 ? str.equals("shooting_template") : !(hashCode != 1982517987 || !str.equals("btn_start_shooting"))) {
                String jSONObject = new JSONObject().put("shooting_templateid", str2).toString();
                C87412m.m108593f(jSONObject, "JSONObject().put(UDK_TEM…Y, templateId).toString()");
                str3 = C112551y.m153814n(jSONObject, ",", ";", false);
            } else {
                str3 = "";
            }
            FinderShowInWXProfileStruct finderShowInWXProfileStruct = new FinderShowInWXProfileStruct();
            finderShowInWXProfileStruct.mo1041w(maasPageFinderReporter.f10367d);
            finderShowInWXProfileStruct.mo1040v(maasPageFinderReporter.mo1203c());
            finderShowInWXProfileStruct.mo1037s(String.valueOf(maasPageFinderReporter.f10368e));
            finderShowInWXProfileStruct.f9907l = finderShowInWXProfileStruct.mo86045b("ref_commentscene", String.valueOf(maasPageFinderReporter.mo1204d()), true);
            finderShowInWXProfileStruct.f9902g = 1;
            finderShowInWXProfileStruct.mo1039u(String.valueOf(C31543z5.m39453c()));
            finderShowInWXProfileStruct.mo1038t(str);
            finderShowInWXProfileStruct.mo1042x(str3);
            finderShowInWXProfileStruct.f9906k = finderShowInWXProfileStruct.mo86045b("clicktabcontextid", maasPageFinderReporter.mo1202b(), true);
            finderShowInWXProfileStruct.f9908m = finderShowInWXProfileStruct.mo86045b("jump_id", C112551y.m153816p(maasPageFinderReporter.mo1205e(), ",", ";", false, 4, (Object) null), true);
            finderShowInWXProfileStruct.mo86054n();
        }
    }
}
