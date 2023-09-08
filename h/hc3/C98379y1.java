package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.y1 */
public final class C98379y1 extends C101653b {
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
        if (cVar instanceof C98377x1) {
            C98377x1 x1Var = (C98377x1) cVar;
            String f = x1Var.mo141101f(str, str2);
            if (map.containsKey('.' + f + ".recordinfo")) {
                C98381z0 z0Var = new C98381z0();
                x1Var.mo141105m(z0Var, map, "recordinfo", f);
                x1Var.mo137668B(z0Var);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordXmlDataItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C98382z1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98377x1)) {
            return jSONObject;
        }
        C98377x1 x1Var = (C98377x1) cVar;
        x1Var.mo141106n(jSONObject, "recordinfo", x1Var.mo137667A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98377x1) || !(cVar2 instanceof C98377x1)) {
            return false;
        }
        C98377x1 x1Var = (C98377x1) cVar;
        return x1Var.mo141098c(x1Var.mo137667A(), ((C98377x1) cVar2).mo137667A());
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
        if (!(cVar instanceof C98377x1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98377x1 x1Var = (C98377x1) cVar;
        x1Var.mo141109q(sb, "recordinfo", "", x1Var.mo137667A(), z);
        sb.append("</" + str + '>');
        x1Var.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
