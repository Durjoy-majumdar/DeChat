package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.l0 */
public final class C98360l0 extends C101653b {
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
        if (cVar instanceof C98359k0) {
            C98359k0 k0Var = (C98359k0) cVar;
            String f = k0Var.mo141101f(str, str2);
            String y = k0Var.mo141117y(map.get('.' + f + ".username"), k0Var.mo55022E());
            if (y != null) {
                k0Var.mo55027J(y);
            }
            String y2 = k0Var.mo141117y(map.get('.' + f + ".nickname"), k0Var.mo55021D());
            if (y2 != null) {
                k0Var.mo55026I(y2);
            }
            String y3 = k0Var.mo141117y(map.get('.' + f + ".avatar"), k0Var.mo55020C());
            if (y3 != null) {
                k0Var.mo55025H(y3);
            }
            String y4 = k0Var.mo141117y(map.get('.' + f + ".authJob"), k0Var.mo55019B());
            if (y4 != null) {
                k0Var.mo55024G(y4);
            }
            Integer w = k0Var.mo141115w(map.get('.' + f + ".authIcon"), Integer.valueOf(k0Var.mo55018A()));
            if (w != null) {
                k0Var.mo55023F(w.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderShareNameCardItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27314m0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98359k0)) {
            return jSONObject;
        }
        C98359k0 k0Var = (C98359k0) cVar;
        k0Var.mo141106n(jSONObject, "username", k0Var.mo55022E(), z);
        k0Var.mo141106n(jSONObject, "nickname", k0Var.mo55021D(), z);
        k0Var.mo141106n(jSONObject, "avatar", k0Var.mo55020C(), z);
        k0Var.mo141106n(jSONObject, "authJob", k0Var.mo55019B(), z);
        k0Var.mo141106n(jSONObject, "authIcon", Integer.valueOf(k0Var.mo55018A()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98359k0) || !(cVar2 instanceof C98359k0)) {
            return false;
        }
        C98359k0 k0Var = (C98359k0) cVar;
        C98359k0 k0Var2 = (C98359k0) cVar2;
        return C87412m.m108589b(k0Var.mo55022E(), k0Var2.mo55022E()) && C87412m.m108589b(k0Var.mo55021D(), k0Var2.mo55021D()) && C87412m.m108589b(k0Var.mo55020C(), k0Var2.mo55020C()) && C87412m.m108589b(k0Var.mo55019B(), k0Var2.mo55019B()) && k0Var.mo55018A() == k0Var2.mo55018A();
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
        if (!(cVar instanceof C98359k0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98359k0 k0Var = (C98359k0) cVar;
        C98359k0 k0Var2 = k0Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        k0Var2.mo141109q(sb5, "username", "", k0Var.mo55022E(), z2);
        k0Var2.mo141109q(sb5, "nickname", "", k0Var.mo55021D(), z2);
        k0Var2.mo141109q(sb5, "avatar", "", k0Var.mo55020C(), z2);
        k0Var2.mo141109q(sb5, "authJob", "", k0Var.mo55019B(), z2);
        k0Var.mo141109q(sb5, "authIcon", "", Integer.valueOf(k0Var.mo55018A()), z2);
        sb.append("</" + str + '>');
        k0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
