package hc3;

import com.google.android.gms.actions.SearchIntents;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.o0 */
public final class C98364o0 extends C101653b {
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
        if (cVar instanceof C98363n0) {
            C98363n0 n0Var = (C98363n0) cVar;
            String f = n0Var.mo141101f(str, str2);
            String y = n0Var.mo141117y(map.get('.' + f + ".finderUsername"), n0Var.mo55037E());
            if (y != null) {
                n0Var.mo55048P(y);
            }
            String y2 = n0Var.mo141117y(map.get('.' + f + ".avatar"), n0Var.mo55035C());
            if (y2 != null) {
                n0Var.mo55046N(y2);
            }
            String y3 = n0Var.mo141117y(map.get('.' + f + ".nickname"), n0Var.mo55041I());
            if (y3 != null) {
                n0Var.mo55052T(y3);
            }
            String y4 = n0Var.mo141117y(map.get('.' + f + ".commodityInStockCount"), n0Var.mo55036D());
            if (y4 != null) {
                n0Var.mo55047O(y4);
            }
            String y5 = n0Var.mo141117y(map.get('.' + f + ".appId"), n0Var.mo55033A());
            if (y5 != null) {
                n0Var.mo55044L(y5);
            }
            String y6 = n0Var.mo141117y(map.get('.' + f + ".path"), n0Var.mo55042J());
            if (y6 != null) {
                n0Var.mo55053U(y6);
            }
            String y7 = n0Var.mo141117y(map.get('.' + f + ".appUsername"), n0Var.mo55034B());
            if (y7 != null) {
                n0Var.mo55045M(y7);
            }
            String y8 = n0Var.mo141117y(map.get('.' + f + ".query"), n0Var.mo55043K());
            if (y8 != null) {
                n0Var.mo55054V(y8);
            }
            String y9 = n0Var.mo141117y(map.get('.' + f + ".liteAppId"), n0Var.mo55038F());
            if (y9 != null) {
                n0Var.mo55049Q(y9);
            }
            String y15 = n0Var.mo141117y(map.get('.' + f + ".liteAppPath"), n0Var.mo55039G());
            if (y15 != null) {
                n0Var.mo55050R(y15);
            }
            String y16 = n0Var.mo141117y(map.get('.' + f + ".liteAppQuery"), n0Var.mo55040H());
            if (y16 != null) {
                n0Var.mo55051S(y16);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderShopWindowShareItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27391p0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98363n0)) {
            return jSONObject;
        }
        C98363n0 n0Var = (C98363n0) cVar;
        n0Var.mo141106n(jSONObject, "finderUsername", n0Var.mo55037E(), z);
        n0Var.mo141106n(jSONObject, "avatar", n0Var.mo55035C(), z);
        n0Var.mo141106n(jSONObject, "nickname", n0Var.mo55041I(), z);
        n0Var.mo141106n(jSONObject, "commodityInStockCount", n0Var.mo55036D(), z);
        n0Var.mo141106n(jSONObject, "appId", n0Var.mo55033A(), z);
        n0Var.mo141106n(jSONObject, "path", n0Var.mo55042J(), z);
        n0Var.mo141106n(jSONObject, "appUsername", n0Var.mo55034B(), z);
        n0Var.mo141106n(jSONObject, SearchIntents.EXTRA_QUERY, n0Var.mo55043K(), z);
        n0Var.mo141106n(jSONObject, "liteAppId", n0Var.mo55038F(), z);
        n0Var.mo141106n(jSONObject, "liteAppPath", n0Var.mo55039G(), z);
        n0Var.mo141106n(jSONObject, "liteAppQuery", n0Var.mo55040H(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98363n0) || !(cVar2 instanceof C98363n0)) {
            return false;
        }
        C98363n0 n0Var = (C98363n0) cVar;
        C98363n0 n0Var2 = (C98363n0) cVar2;
        return C87412m.m108589b(n0Var.mo55037E(), n0Var2.mo55037E()) && C87412m.m108589b(n0Var.mo55035C(), n0Var2.mo55035C()) && C87412m.m108589b(n0Var.mo55041I(), n0Var2.mo55041I()) && C87412m.m108589b(n0Var.mo55036D(), n0Var2.mo55036D()) && C87412m.m108589b(n0Var.mo55033A(), n0Var2.mo55033A()) && C87412m.m108589b(n0Var.mo55042J(), n0Var2.mo55042J()) && C87412m.m108589b(n0Var.mo55034B(), n0Var2.mo55034B()) && C87412m.m108589b(n0Var.mo55043K(), n0Var2.mo55043K()) && C87412m.m108589b(n0Var.mo55038F(), n0Var2.mo55038F()) && C87412m.m108589b(n0Var.mo55039G(), n0Var2.mo55039G()) && C87412m.m108589b(n0Var.mo55040H(), n0Var2.mo55040H());
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
        if (!(cVar instanceof C98363n0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98363n0 n0Var = (C98363n0) cVar;
        C98363n0 n0Var2 = n0Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        n0Var2.mo141109q(sb5, "finderUsername", "", n0Var.mo55037E(), z2);
        n0Var2.mo141109q(sb5, "avatar", "", n0Var.mo55035C(), z2);
        n0Var2.mo141109q(sb5, "nickname", "", n0Var.mo55041I(), z2);
        n0Var2.mo141109q(sb5, "commodityInStockCount", "", n0Var.mo55036D(), z2);
        n0Var2.mo141109q(sb5, "appId", "", n0Var.mo55033A(), z2);
        n0Var2.mo141109q(sb5, "path", "", n0Var.mo55042J(), z2);
        n0Var2.mo141109q(sb5, "appUsername", "", n0Var.mo55034B(), z2);
        n0Var2.mo141109q(sb5, SearchIntents.EXTRA_QUERY, "", n0Var.mo55043K(), z2);
        n0Var2.mo141109q(sb5, "liteAppId", "", n0Var.mo55038F(), z2);
        n0Var2.mo141109q(sb5, "liteAppPath", "", n0Var.mo55039G(), z2);
        n0Var2.mo141109q(sb5, "liteAppQuery", "", n0Var.mo55040H(), z2);
        sb.append("</" + str + '>');
        n0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
