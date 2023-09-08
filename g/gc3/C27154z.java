package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.z */
public final class C27154z extends C101653b {
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
        if (cVar instanceof C27153y) {
            C27153y yVar = (C27153y) cVar;
            String f = yVar.mo141101f(str, str2);
            Long x = yVar.mo141116x(map.get('.' + f + ".createtime"), Long.valueOf(yVar.mo54610A()));
            if (x != null) {
                yVar.mo54613D(x.longValue());
            }
            Long x2 = yVar.mo141116x(map.get('.' + f + ".svrid"), Long.valueOf(yVar.mo54612C()));
            if (x2 != null) {
                yVar.mo54615F(x2.longValue());
            }
            Long x3 = yVar.mo141116x(map.get('.' + f + ".newsvrid"), Long.valueOf(yVar.mo54611B()));
            if (x3 != null) {
                yVar.mo54614E(x3.longValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "share_msg";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27080a0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27153y)) {
            return jSONObject;
        }
        C27153y yVar = (C27153y) cVar;
        yVar.mo141106n(jSONObject, "createtime", Long.valueOf(yVar.mo54610A()), z);
        yVar.mo141106n(jSONObject, "svrid", Long.valueOf(yVar.mo54612C()), z);
        yVar.mo141106n(jSONObject, "newsvrid", Long.valueOf(yVar.mo54611B()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27153y) || !(cVar2 instanceof C27153y)) {
            return false;
        }
        C27153y yVar = (C27153y) cVar;
        C27153y yVar2 = (C27153y) cVar2;
        return yVar.mo54610A() == yVar2.mo54610A() && yVar.mo54612C() == yVar2.mo54612C() && yVar.mo54611B() == yVar2.mo54611B();
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
        if (!(cVar instanceof C27153y)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27153y yVar = (C27153y) cVar;
        boolean z2 = z;
        yVar.mo141109q(sb, "createtime", "", Long.valueOf(yVar.mo54610A()), z2);
        yVar.mo141109q(sb, "svrid", "", Long.valueOf(yVar.mo54612C()), z2);
        yVar.mo141109q(sb, "newsvrid", "", Long.valueOf(yVar.mo54611B()), z2);
        sb.append("</" + str + '>');
        yVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
