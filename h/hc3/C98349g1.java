package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.g1 */
public final class C98349g1 extends C101653b {
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
        if (cVar instanceof C98347f1) {
            C98347f1 f1Var = (C98347f1) cVar;
            String f = f1Var.mo141101f(str, str2);
            if (map.containsKey('.' + f + ".appmsg")) {
                C98343d dVar = new C98343d();
                f1Var.mo141105m(dVar, map, "appmsg", f);
                f1Var.mo137665B(dVar);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "msg";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C98352h1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98347f1)) {
            return jSONObject;
        }
        C98347f1 f1Var = (C98347f1) cVar;
        f1Var.mo141106n(jSONObject, "appmsg", f1Var.mo137664A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98347f1) || !(cVar2 instanceof C98347f1)) {
            return false;
        }
        C98347f1 f1Var = (C98347f1) cVar;
        return f1Var.mo141098c(f1Var.mo137664A(), ((C98347f1) cVar2).mo137664A());
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
        if (!(cVar instanceof C98347f1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98347f1 f1Var = (C98347f1) cVar;
        f1Var.mo141109q(sb, "appmsg", "", f1Var.mo137664A(), z);
        sb.append("</" + str + '>');
        f1Var.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
