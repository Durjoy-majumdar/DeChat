package gc3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.o */
public final class C98104o extends C101653b {
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
        if (cVar instanceof C98103n) {
            C98103n nVar = (C98103n) cVar;
            String str3 = nVar.mo141101f(str, str2) + ".emojilist";
            ArrayList arrayList = new ArrayList();
            nVar.mo141107o(arrayList, C98101e.class, map, str3, "emojiitem");
            if (arrayList.size() > 0) {
                nVar.mo137399B(arrayList);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "mediaeditcontent";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C98105p(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98103n)) {
            return jSONObject;
        }
        C98103n nVar = (C98103n) cVar;
        nVar.mo141106n(jSONObject, "emojilist", nVar.mo137398A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98103n) || !(cVar2 instanceof C98103n)) {
            return false;
        }
        C98103n nVar = (C98103n) cVar;
        return nVar.mo141097b(nVar.mo137398A(), ((C98103n) cVar2).mo137398A(), C98101e.class);
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
        if (!(cVar instanceof C98103n)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98103n nVar = (C98103n) cVar;
        nVar.mo141109q(sb, "emojilist", "emojiitem", nVar.mo137398A(), z);
        sb.append("</" + str + '>');
        nVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
