package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.c0 */
public final class C98341c0 extends C101653b {
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
        if (cVar instanceof C98340b0) {
            C98340b0 b0Var = (C98340b0) cVar;
            String f = b0Var.mo141101f(str, str2);
            String y = b0Var.mo141117y(map.get('.' + f + ".objectId"), b0Var.mo54738A());
            if (y != null) {
                b0Var.mo54740C(y);
            }
            String y2 = b0Var.mo141117y(map.get('.' + f + ".objectNonceId"), b0Var.mo54739B());
            if (y2 != null) {
                b0Var.mo54741D(y2);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderFeedMegaVideoItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27208d0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98340b0)) {
            return jSONObject;
        }
        C98340b0 b0Var = (C98340b0) cVar;
        b0Var.mo141106n(jSONObject, "objectId", b0Var.mo54738A(), z);
        b0Var.mo141106n(jSONObject, "objectNonceId", b0Var.mo54739B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98340b0) || !(cVar2 instanceof C98340b0)) {
            return false;
        }
        C98340b0 b0Var = (C98340b0) cVar;
        C98340b0 b0Var2 = (C98340b0) cVar2;
        return C87412m.m108589b(b0Var.mo54738A(), b0Var2.mo54738A()) && C87412m.m108589b(b0Var.mo54739B(), b0Var2.mo54739B());
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
        if (!(cVar instanceof C98340b0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98340b0 b0Var = (C98340b0) cVar;
        C98340b0 b0Var2 = b0Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        b0Var2.mo141109q(sb5, "objectId", "", b0Var.mo54738A(), z2);
        b0Var2.mo141109q(sb5, "objectNonceId", "", b0Var.mo54739B(), z2);
        sb.append("</" + str + '>');
        b0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
