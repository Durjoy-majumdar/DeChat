package cc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: cc3.h */
public final class C26849h extends C101653b {
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
        if (cVar instanceof C26848g) {
            C26848g gVar = (C26848g) cVar;
            String f = gVar.mo141101f(str, str2);
            Long x = gVar.mo141116x(map.get('.' + f + ".totallen"), Long.valueOf(gVar.mo53850D()));
            if (x != null) {
                gVar.mo53854H(x.longValue());
            }
            String y = gVar.mo141117y(map.get('.' + f + ".attachid"), gVar.mo53848B());
            if (y != null) {
                gVar.mo53852F(y);
            }
            String y2 = gVar.mo141117y(map.get('.' + f + ".cdnattachurl"), gVar.mo53849C());
            if (y2 != null) {
                gVar.mo53853G(y2);
            }
            String y3 = gVar.mo141117y(map.get('.' + f + ".aeskey"), gVar.mo53847A());
            if (y3 != null) {
                gVar.mo53851E(y3);
            }
            String y4 = gVar.mo141117y(map.get('.' + f + ".tpthumburl"), gVar.mo53885I());
            if (y4 != null) {
                gVar.mo53886J(y4);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "LinkAppAttach";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C26850i(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C26848g)) {
            return jSONObject;
        }
        C26848g gVar = (C26848g) cVar;
        gVar.mo141106n(jSONObject, "totallen", Long.valueOf(gVar.mo53850D()), z);
        gVar.mo141106n(jSONObject, "attachid", gVar.mo53848B(), z);
        gVar.mo141106n(jSONObject, "cdnattachurl", gVar.mo53849C(), z);
        gVar.mo141106n(jSONObject, "aeskey", gVar.mo53847A(), z);
        gVar.mo141106n(jSONObject, "tpthumburl", gVar.mo53885I(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C26848g) || !(cVar2 instanceof C26848g)) {
            return false;
        }
        C26848g gVar = (C26848g) cVar;
        C26848g gVar2 = (C26848g) cVar2;
        return gVar.mo53850D() == gVar2.mo53850D() && C87412m.m108589b(gVar.mo53848B(), gVar2.mo53848B()) && C87412m.m108589b(gVar.mo53849C(), gVar2.mo53849C()) && C87412m.m108589b(gVar.mo53847A(), gVar2.mo53847A()) && C87412m.m108589b(gVar.mo53885I(), gVar2.mo53885I());
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
        if (!(cVar instanceof C26848g)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C26848g gVar = (C26848g) cVar;
        C26848g gVar2 = gVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        gVar2.mo141109q(sb5, "totallen", "", Long.valueOf(gVar.mo53850D()), z2);
        gVar2.mo141109q(sb5, "attachid", "", gVar.mo53848B(), z2);
        gVar2.mo141109q(sb5, "cdnattachurl", "", gVar.mo53849C(), z2);
        gVar2.mo141109q(sb5, "aeskey", "", gVar.mo53847A(), z2);
        gVar2.mo141109q(sb5, "tpthumburl", "", gVar.mo53885I(), z2);
        sb.append("</" + str + '>');
        gVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
