package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.l */
public final class C27109l extends C101653b {
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
        if (cVar instanceof C27108k) {
            C27108k kVar = (C27108k) cVar;
            String f = kVar.mo141101f(str, str2);
            Long x = kVar.mo141116x(map.get('.' + f + ".$cdnmidimgurl_size"), Long.valueOf(kVar.mo54649F()));
            if (x != null) {
                kVar.mo54655L(x.longValue());
            }
            Integer w = kVar.mo141115w(map.get('.' + f + ".$cdnmidimgurl_pd_pri"), Integer.valueOf(kVar.mo54648E()));
            if (w != null) {
                kVar.mo54654K(w.intValue());
            }
            Integer w2 = kVar.mo141115w(map.get('.' + f + ".$cdnmidimgurl_pd"), Integer.valueOf(kVar.mo54647D()));
            if (w2 != null) {
                kVar.mo54653J(w2.intValue());
            }
            Long x2 = kVar.mo141116x(map.get('.' + f + ".$cdnbigimgurl_size"), Long.valueOf(kVar.mo54646C()));
            if (x2 != null) {
                kVar.mo54652I(x2.longValue());
            }
            Integer w3 = kVar.mo141115w(map.get('.' + f + ".$cdnbigimgurl_pd_pri"), Integer.valueOf(kVar.mo54645B()));
            if (w3 != null) {
                kVar.mo54651H(w3.intValue());
            }
            Integer w4 = kVar.mo141115w(map.get('.' + f + ".$cdnbigimgurl_pd"), Integer.valueOf(kVar.mo54644A()));
            if (w4 != null) {
                kVar.mo54650G(w4.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "imgmsg_pd";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27110m(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27108k)) {
            return jSONObject;
        }
        C27108k kVar = (C27108k) cVar;
        kVar.mo141106n(jSONObject, "cdnmidimgurl_size", Long.valueOf(kVar.mo54649F()), z);
        kVar.mo141106n(jSONObject, "cdnmidimgurl_pd_pri", Integer.valueOf(kVar.mo54648E()), z);
        kVar.mo141106n(jSONObject, "cdnmidimgurl_pd", Integer.valueOf(kVar.mo54647D()), z);
        kVar.mo141106n(jSONObject, "cdnbigimgurl_size", Long.valueOf(kVar.mo54646C()), z);
        kVar.mo141106n(jSONObject, "cdnbigimgurl_pd_pri", Integer.valueOf(kVar.mo54645B()), z);
        kVar.mo141106n(jSONObject, "cdnbigimgurl_pd", Integer.valueOf(kVar.mo54644A()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27108k) || !(cVar2 instanceof C27108k)) {
            return false;
        }
        C27108k kVar = (C27108k) cVar;
        C27108k kVar2 = (C27108k) cVar2;
        return kVar.mo54649F() == kVar2.mo54649F() && kVar.mo54648E() == kVar2.mo54648E() && kVar.mo54647D() == kVar2.mo54647D() && kVar.mo54646C() == kVar2.mo54646C() && kVar.mo54645B() == kVar2.mo54645B() && kVar.mo54644A() == kVar2.mo54644A();
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
        if (!(cVar instanceof C27108k)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27108k kVar = (C27108k) cVar;
        kVar.mo141108p(sb, "cdnmidimgurl_size", Long.valueOf(kVar.mo54649F()), z);
        kVar.mo141108p(sb, "cdnmidimgurl_pd_pri", Integer.valueOf(kVar.mo54648E()), z);
        kVar.mo141108p(sb, "cdnmidimgurl_pd", Integer.valueOf(kVar.mo54647D()), z);
        kVar.mo141108p(sb, "cdnbigimgurl_size", Long.valueOf(kVar.mo54646C()), z);
        kVar.mo141108p(sb, "cdnbigimgurl_pd_pri", Integer.valueOf(kVar.mo54645B()), z);
        kVar.mo141108p(sb, "cdnbigimgurl_pd", Integer.valueOf(kVar.mo54644A()), z);
        sb.append(">");
        sb.append("</" + str + '>');
        kVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
