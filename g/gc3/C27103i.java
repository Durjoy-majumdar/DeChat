package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.i */
public final class C27103i extends C101653b {
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
        if (cVar instanceof C27102h) {
            C27102h hVar = (C27102h) cVar;
            String f = hVar.mo141101f(str, str2);
            Long x = hVar.mo141116x(map.get('.' + f + ".$cdnattachurl_size"), Long.valueOf(hVar.mo54640C()));
            if (x != null) {
                hVar.mo54643F(x.longValue());
            }
            Integer w = hVar.mo141115w(map.get('.' + f + ".$cdnattachurl_pd_pri"), Integer.valueOf(hVar.mo54639B()));
            if (w != null) {
                hVar.mo54642E(w.intValue());
            }
            Integer w2 = hVar.mo141115w(map.get('.' + f + ".$cdnattachurl_pd"), Integer.valueOf(hVar.mo54638A()));
            if (w2 != null) {
                hVar.mo54641D(w2.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "appmsg_pd";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27104j(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27102h)) {
            return jSONObject;
        }
        C27102h hVar = (C27102h) cVar;
        hVar.mo141106n(jSONObject, "cdnattachurl_size", Long.valueOf(hVar.mo54640C()), z);
        hVar.mo141106n(jSONObject, "cdnattachurl_pd_pri", Integer.valueOf(hVar.mo54639B()), z);
        hVar.mo141106n(jSONObject, "cdnattachurl_pd", Integer.valueOf(hVar.mo54638A()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27102h) || !(cVar2 instanceof C27102h)) {
            return false;
        }
        C27102h hVar = (C27102h) cVar;
        C27102h hVar2 = (C27102h) cVar2;
        return hVar.mo54640C() == hVar2.mo54640C() && hVar.mo54639B() == hVar2.mo54639B() && hVar.mo54638A() == hVar2.mo54638A();
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
        if (!(cVar instanceof C27102h)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27102h hVar = (C27102h) cVar;
        hVar.mo141108p(sb, "cdnattachurl_size", Long.valueOf(hVar.mo54640C()), z);
        hVar.mo141108p(sb, "cdnattachurl_pd_pri", Integer.valueOf(hVar.mo54639B()), z);
        hVar.mo141108p(sb, "cdnattachurl_pd", Integer.valueOf(hVar.mo54638A()), z);
        sb.append(">");
        sb.append("</" + str + '>');
        hVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
