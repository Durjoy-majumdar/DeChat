package mh0;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: mh0.o */
public final class C99890o extends C101653b {
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
        if (cVar instanceof C99889n) {
            C99889n nVar = (C99889n) cVar;
            String str3 = nVar.mo141101f(str, str2) + ".originmediainfolist";
            ArrayList arrayList = new ArrayList();
            nVar.mo141107o(arrayList, C99893q.class, map, str3, "orimediadataitem");
            if (arrayList.size() > 0) {
                nVar.mo139239B(arrayList);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "AlbumOriMediaInfo";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C99891p(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C99889n)) {
            return jSONObject;
        }
        C99889n nVar = (C99889n) cVar;
        nVar.mo141106n(jSONObject, "originmediainfolist", nVar.mo139238A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C99889n) || !(cVar2 instanceof C99889n)) {
            return false;
        }
        C99889n nVar = (C99889n) cVar;
        return nVar.mo141097b(nVar.mo139238A(), ((C99889n) cVar2).mo139238A(), C99893q.class);
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
        if (!(cVar instanceof C99889n)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C99889n nVar = (C99889n) cVar;
        nVar.mo141109q(sb, "originmediainfolist", "orimediadataitem", nVar.mo139238A(), z);
        sb.append("</" + str + '>');
        nVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
