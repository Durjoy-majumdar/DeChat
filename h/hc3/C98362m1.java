package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.m1 */
public final class C98362m1 extends C101653b {
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
        if (cVar instanceof C98361l1) {
            C98361l1 l1Var = (C98361l1) cVar;
            String f = l1Var.mo141101f(str, str2);
            String y = l1Var.mo141117y(map.get('.' + f + ".noteauthor"), l1Var.mo55028A());
            if (y != null) {
                l1Var.mo55030C(y);
            }
            String y2 = l1Var.mo141117y(map.get('.' + f + ".noteeditor"), l1Var.mo55029B());
            if (y2 != null) {
                l1Var.mo55031D(y2);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordNoteInfoItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27321n1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98361l1)) {
            return jSONObject;
        }
        C98361l1 l1Var = (C98361l1) cVar;
        l1Var.mo141106n(jSONObject, "noteauthor", l1Var.mo55028A(), z);
        l1Var.mo141106n(jSONObject, "noteeditor", l1Var.mo55029B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98361l1) || !(cVar2 instanceof C98361l1)) {
            return false;
        }
        C98361l1 l1Var = (C98361l1) cVar;
        C98361l1 l1Var2 = (C98361l1) cVar2;
        return C87412m.m108589b(l1Var.mo55028A(), l1Var2.mo55028A()) && C87412m.m108589b(l1Var.mo55029B(), l1Var2.mo55029B());
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
        if (!(cVar instanceof C98361l1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98361l1 l1Var = (C98361l1) cVar;
        C98361l1 l1Var2 = l1Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        l1Var2.mo141109q(sb5, "noteauthor", "", l1Var.mo55028A(), z2);
        l1Var2.mo141109q(sb5, "noteeditor", "", l1Var.mo55029B(), z2);
        sb.append("</" + str + '>');
        l1Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
