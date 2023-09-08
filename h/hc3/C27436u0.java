package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.u0 */
public final class C27436u0 extends C101653b {
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
        if (cVar instanceof C27421t0) {
            C27421t0 t0Var = (C27421t0) cVar;
            String f = t0Var.mo141101f(str, str2);
            String y = t0Var.mo141117y(map.get('.' + f + ".poiClassifyId"), t0Var.mo55083C());
            if (y != null) {
                t0Var.mo55086F(y);
            }
            Float v = t0Var.mo141114v(map.get('.' + f + ".longitude"), Float.valueOf(t0Var.mo55082B()));
            if (v != null) {
                t0Var.mo55085E(v.floatValue());
            }
            Float v2 = t0Var.mo141114v(map.get('.' + f + ".latitude"), Float.valueOf(t0Var.mo55081A()));
            if (v2 != null) {
                t0Var.mo55084D(v2.floatValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderTopicLocationItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27437v0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27421t0)) {
            return jSONObject;
        }
        C27421t0 t0Var = (C27421t0) cVar;
        t0Var.mo141106n(jSONObject, "poiClassifyId", t0Var.mo55083C(), z);
        t0Var.mo141106n(jSONObject, "longitude", Float.valueOf(t0Var.mo55082B()), z);
        t0Var.mo141106n(jSONObject, "latitude", Float.valueOf(t0Var.mo55081A()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27421t0) || !(cVar2 instanceof C27421t0)) {
            return false;
        }
        C27421t0 t0Var = (C27421t0) cVar;
        C27421t0 t0Var2 = (C27421t0) cVar2;
        if (!C87412m.m108589b(t0Var.mo55083C(), t0Var2.mo55083C())) {
            return false;
        }
        if (!(t0Var.mo55082B() == t0Var2.mo55082B())) {
            return false;
        }
        return (t0Var.mo55081A() > t0Var2.mo55081A() ? 1 : (t0Var.mo55081A() == t0Var2.mo55081A() ? 0 : -1)) == 0;
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
        if (!(cVar instanceof C27421t0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27421t0 t0Var = (C27421t0) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        t0Var.mo141109q(sb5, "poiClassifyId", "", t0Var.mo55083C(), z2);
        t0Var.mo141109q(sb5, "longitude", "", Float.valueOf(t0Var.mo55082B()), z2);
        t0Var.mo141109q(sb5, "latitude", "", Float.valueOf(t0Var.mo55081A()), z2);
        sb.append("</" + str + '>');
        t0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
