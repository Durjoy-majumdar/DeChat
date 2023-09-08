package cc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: cc3.b */
public final class C26829b extends C101653b {
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
        if (cVar instanceof C26828a) {
            C26828a aVar = (C26828a) cVar;
            String f = aVar.mo141101f(str, str2);
            Long x = aVar.mo141116x(map.get('.' + f + ".totallen"), Long.valueOf(aVar.mo53850D()));
            if (x != null) {
                aVar.mo53854H(x.longValue());
            }
            String y = aVar.mo141117y(map.get('.' + f + ".attachid"), aVar.mo53848B());
            if (y != null) {
                aVar.mo53852F(y);
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".cdnattachurl"), aVar.mo53849C());
            if (y2 != null) {
                aVar.mo53853G(y2);
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".aeskey"), aVar.mo53847A());
            if (y3 != null) {
                aVar.mo53851E(y3);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "BaseAppAttach";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C26830c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C26828a)) {
            return jSONObject;
        }
        C26828a aVar = (C26828a) cVar;
        aVar.mo141106n(jSONObject, "totallen", Long.valueOf(aVar.mo53850D()), z);
        aVar.mo141106n(jSONObject, "attachid", aVar.mo53848B(), z);
        aVar.mo141106n(jSONObject, "cdnattachurl", aVar.mo53849C(), z);
        aVar.mo141106n(jSONObject, "aeskey", aVar.mo53847A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C26828a) || !(cVar2 instanceof C26828a)) {
            return false;
        }
        C26828a aVar = (C26828a) cVar;
        C26828a aVar2 = (C26828a) cVar2;
        return aVar.mo53850D() == aVar2.mo53850D() && C87412m.m108589b(aVar.mo53848B(), aVar2.mo53848B()) && C87412m.m108589b(aVar.mo53849C(), aVar2.mo53849C()) && C87412m.m108589b(aVar.mo53847A(), aVar2.mo53847A());
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
        if (!(cVar instanceof C26828a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C26828a aVar = (C26828a) cVar;
        C26828a aVar2 = aVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        aVar2.mo141109q(sb5, "totallen", "", Long.valueOf(aVar.mo53850D()), z2);
        aVar2.mo141109q(sb5, "attachid", "", aVar.mo53848B(), z2);
        aVar2.mo141109q(sb5, "cdnattachurl", "", aVar.mo53849C(), z2);
        aVar2.mo141109q(sb5, "aeskey", "", aVar.mo53847A(), z2);
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
