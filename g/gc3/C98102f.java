package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.f */
public final class C98102f extends C101653b {
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
        if (cVar instanceof C98101e) {
            C98101e eVar = (C98101e) cVar;
            String f = eVar.mo141101f(str, str2);
            String y = eVar.mo141117y(map.get('.' + f + ".searchquery"), eVar.mo54635B());
            if (y != null) {
                eVar.mo54637D(y);
            }
            String y2 = eVar.mo141117y(map.get('.' + f + ".md5"), eVar.mo54634A());
            if (y2 != null) {
                eVar.mo54636C(y2);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "emojiitem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27092g(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98101e)) {
            return jSONObject;
        }
        C98101e eVar = (C98101e) cVar;
        eVar.mo141106n(jSONObject, "searchquery", eVar.mo54635B(), z);
        eVar.mo141106n(jSONObject, "md5", eVar.mo54634A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98101e) || !(cVar2 instanceof C98101e)) {
            return false;
        }
        C98101e eVar = (C98101e) cVar;
        C98101e eVar2 = (C98101e) cVar2;
        return C87412m.m108589b(eVar.mo54635B(), eVar2.mo54635B()) && C87412m.m108589b(eVar.mo54634A(), eVar2.mo54634A());
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
        if (!(cVar instanceof C98101e)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98101e eVar = (C98101e) cVar;
        C98101e eVar2 = eVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        eVar2.mo141109q(sb5, "searchquery", "", eVar.mo54635B(), z2);
        eVar2.mo141109q(sb5, "md5", "", eVar.mo54634A(), z2);
        sb.append("</" + str + '>');
        eVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
