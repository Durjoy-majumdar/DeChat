package mh0;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: mh0.b */
public final class C99863b extends C101653b {
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
        if (cVar instanceof C99862a) {
            C99862a aVar = (C99862a) cVar;
            String f = aVar.mo141101f(str, str2);
            Long x = aVar.mo141116x(map.get('.' + f + ".localid"), Long.valueOf(aVar.mo55364C()));
            if (x != null) {
                aVar.mo55370I(x.longValue());
            }
            if (map.containsKey('.' + f + ".originmediainfo")) {
                C99889n nVar = new C99889n();
                aVar.mo141105m(nVar, map, "originmediainfo", f);
                aVar.mo55371J(nVar);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".status"), Integer.valueOf(aVar.mo55367F()));
            if (w != null) {
                aVar.mo55373L(w.intValue());
            }
            Integer w2 = aVar.mo141115w(map.get('.' + f + ".startuploadprogress"), Integer.valueOf(aVar.mo55366E()));
            if (w2 != null) {
                aVar.mo55372K(w2.intValue());
            }
            Integer w3 = aVar.mo141115w(map.get('.' + f + ".uploadprogress"), Integer.valueOf(aVar.mo55368G()));
            if (w3 != null) {
                aVar.mo55374M(w3.intValue());
            }
            Integer w4 = aVar.mo141115w(map.get('.' + f + ".downloadprogress"), Integer.valueOf(aVar.mo55363B()));
            if (w4 != null) {
                aVar.mo55369H(w4.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "AlbumExtraMediaInfo";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27609c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C99862a)) {
            return jSONObject;
        }
        C99862a aVar = (C99862a) cVar;
        aVar.mo141106n(jSONObject, "localid", Long.valueOf(aVar.mo55364C()), z);
        aVar.mo141106n(jSONObject, "originmediainfo", aVar.mo55365D(), z);
        aVar.mo141106n(jSONObject, "status", Integer.valueOf(aVar.mo55367F()), z);
        aVar.mo141106n(jSONObject, "startuploadprogress", Integer.valueOf(aVar.mo55366E()), z);
        aVar.mo141106n(jSONObject, "uploadprogress", Integer.valueOf(aVar.mo55368G()), z);
        aVar.mo141106n(jSONObject, "downloadprogress", Integer.valueOf(aVar.mo55363B()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C99862a) || !(cVar2 instanceof C99862a)) {
            return false;
        }
        C99862a aVar = (C99862a) cVar;
        C99862a aVar2 = (C99862a) cVar2;
        return aVar.mo55364C() == aVar2.mo55364C() && aVar.mo141098c(aVar.mo55365D(), aVar2.mo55365D()) && aVar.mo55367F() == aVar2.mo55367F() && aVar.mo55366E() == aVar2.mo55366E() && aVar.mo55368G() == aVar2.mo55368G() && aVar.mo55363B() == aVar2.mo55363B();
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
        if (!(cVar instanceof C99862a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C99862a aVar = (C99862a) cVar;
        C99862a aVar2 = aVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        aVar2.mo141109q(sb5, "localid", "", Long.valueOf(aVar.mo55364C()), z2);
        aVar2.mo141109q(sb5, "originmediainfo", "", aVar.mo55365D(), z2);
        aVar.mo141109q(sb5, "status", "", Integer.valueOf(aVar.mo55367F()), z2);
        aVar.mo141109q(sb5, "startuploadprogress", "", Integer.valueOf(aVar.mo55366E()), z2);
        aVar.mo141109q(sb5, "uploadprogress", "", Integer.valueOf(aVar.mo55368G()), z2);
        aVar.mo141109q(sb5, "downloadprogress", "", Integer.valueOf(aVar.mo55363B()), z2);
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
