package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.f0 */
public final class C27091f0 extends C101653b {
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
        if (cVar instanceof C27090e0) {
            C27090e0 e0Var = (C27090e0) cVar;
            String f = e0Var.mo141101f(str, str2);
            Long x = e0Var.mo141116x(map.get('.' + f + ".$cdnvideourl_size"), Long.valueOf(e0Var.mo54627F()));
            if (x != null) {
                e0Var.mo54633L(x.longValue());
            }
            Integer w = e0Var.mo141115w(map.get('.' + f + ".$cdnvideourl_pd_pri"), Integer.valueOf(e0Var.mo54626E()));
            if (w != null) {
                e0Var.mo54632K(w.intValue());
            }
            Integer w2 = e0Var.mo141115w(map.get('.' + f + ".$cdnvideourl_pd"), Integer.valueOf(e0Var.mo54625D()));
            if (w2 != null) {
                e0Var.mo54631J(w2.intValue());
            }
            Long x2 = e0Var.mo141116x(map.get('.' + f + ".$cdnrawvideourl_size"), Long.valueOf(e0Var.mo54624C()));
            if (x2 != null) {
                e0Var.mo54630I(x2.longValue());
            }
            Integer w3 = e0Var.mo141115w(map.get('.' + f + ".$cdnrawvideourl_pd_pri"), Integer.valueOf(e0Var.mo54623B()));
            if (w3 != null) {
                e0Var.mo54629H(w3.intValue());
            }
            Integer w4 = e0Var.mo141115w(map.get('.' + f + ".$cdnrawvideourl_pd"), Integer.valueOf(e0Var.mo54622A()));
            if (w4 != null) {
                e0Var.mo54628G(w4.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "videomsg_pd";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27095g0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27090e0)) {
            return jSONObject;
        }
        C27090e0 e0Var = (C27090e0) cVar;
        e0Var.mo141106n(jSONObject, "cdnvideourl_size", Long.valueOf(e0Var.mo54627F()), z);
        e0Var.mo141106n(jSONObject, "cdnvideourl_pd_pri", Integer.valueOf(e0Var.mo54626E()), z);
        e0Var.mo141106n(jSONObject, "cdnvideourl_pd", Integer.valueOf(e0Var.mo54625D()), z);
        e0Var.mo141106n(jSONObject, "cdnrawvideourl_size", Long.valueOf(e0Var.mo54624C()), z);
        e0Var.mo141106n(jSONObject, "cdnrawvideourl_pd_pri", Integer.valueOf(e0Var.mo54623B()), z);
        e0Var.mo141106n(jSONObject, "cdnrawvideourl_pd", Integer.valueOf(e0Var.mo54622A()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27090e0) || !(cVar2 instanceof C27090e0)) {
            return false;
        }
        C27090e0 e0Var = (C27090e0) cVar;
        C27090e0 e0Var2 = (C27090e0) cVar2;
        return e0Var.mo54627F() == e0Var2.mo54627F() && e0Var.mo54626E() == e0Var2.mo54626E() && e0Var.mo54625D() == e0Var2.mo54625D() && e0Var.mo54624C() == e0Var2.mo54624C() && e0Var.mo54623B() == e0Var2.mo54623B() && e0Var.mo54622A() == e0Var2.mo54622A();
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
        if (!(cVar instanceof C27090e0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27090e0 e0Var = (C27090e0) cVar;
        e0Var.mo141108p(sb, "cdnvideourl_size", Long.valueOf(e0Var.mo54627F()), z);
        e0Var.mo141108p(sb, "cdnvideourl_pd_pri", Integer.valueOf(e0Var.mo54626E()), z);
        e0Var.mo141108p(sb, "cdnvideourl_pd", Integer.valueOf(e0Var.mo54625D()), z);
        e0Var.mo141108p(sb, "cdnrawvideourl_size", Long.valueOf(e0Var.mo54624C()), z);
        e0Var.mo141108p(sb, "cdnrawvideourl_pd_pri", Integer.valueOf(e0Var.mo54623B()), z);
        e0Var.mo141108p(sb, "cdnrawvideourl_pd", Integer.valueOf(e0Var.mo54622A()), z);
        sb.append(">");
        sb.append("</" + str + '>');
        e0Var.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
