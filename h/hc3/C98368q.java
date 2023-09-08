package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.q */
public final class C98368q extends C101653b {
    /* renamed from: a */
    public boolean mo53855a() {
        return false;
    }

    /* renamed from: b */
    public void mo53856b(C64054c cVar, Map<String, String> map, String str, String str2) {
        C87412m.m108594g(cVar, "serializeObj");
        C87412m.m108594g(map, "xmlValueMap");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        if (cVar instanceof C98366p) {
            C98366p pVar = (C98366p) cVar;
            String f = pVar.mo141101f(str, str2);
            String y = pVar.mo141117y(map.get('.' + f + ".fromusr"), pVar.mo55075A());
            if (y != null) {
                pVar.mo55078E(y);
            }
            String y2 = pVar.mo141117y(map.get('.' + f + ".realchatname"), pVar.mo55077C());
            if (y2 != null) {
                pVar.mo55080G(y2);
            }
            String y3 = pVar.mo141117y(map.get('.' + f + ".hashusername"), pVar.mo55076B());
            if (y3 != null) {
                pVar.mo55079F(y3);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordDataSourceItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27410r(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98366p)) {
            return jSONObject;
        }
        C98366p pVar = (C98366p) cVar;
        pVar.mo141106n(jSONObject, "fromusr", pVar.mo55075A(), z);
        pVar.mo141106n(jSONObject, "realchatname", pVar.mo55077C(), z);
        pVar.mo141106n(jSONObject, "hashusername", pVar.mo55076B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98366p) || !(cVar2 instanceof C98366p)) {
            return false;
        }
        C98366p pVar = (C98366p) cVar;
        C98366p pVar2 = (C98366p) cVar2;
        return C87412m.m108589b(pVar.mo55075A(), pVar2.mo55075A()) && C87412m.m108589b(pVar.mo55077C(), pVar2.mo55077C()) && C87412m.m108589b(pVar.mo55076B(), pVar2.mo55076B());
    }

    /* renamed from: g */
    public boolean mo53861g() {
        return true;
    }

    /* renamed from: h */
    public String mo53862h() {
        return "";
    }

    /* renamed from: i */
    public String mo53863i(C64054c cVar, boolean z, String str, String str2) {
        C87412m.m108594g(cVar, "serializeObj");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        StringBuilder sb = new StringBuilder();
        if (!(cVar instanceof C98366p)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98366p pVar = (C98366p) cVar;
        C98366p pVar2 = pVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        pVar2.mo141109q(sb5, "fromusr", "", pVar.mo55075A(), z2);
        pVar2.mo141109q(sb5, "realchatname", "", pVar.mo55077C(), z2);
        pVar2.mo141109q(sb5, "hashusername", "", pVar.mo55076B(), z2);
        sb.append("</" + str + '>');
        pVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
