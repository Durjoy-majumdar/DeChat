package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.d1 */
public final class C98344d1 extends C101653b {
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
        if (cVar instanceof C98342c1) {
            C98342c1 c1Var = (C98342c1) cVar;
            String f = c1Var.mo141101f(str, str2);
            String y = c1Var.mo141117y(map.get('.' + f + ".label"), c1Var.mo54744C());
            if (y != null) {
                c1Var.mo54758Q(y);
            }
            Double u = c1Var.mo141113u(map.get('.' + f + ".lat"), Double.valueOf(c1Var.mo54745D()));
            if (u != null) {
                c1Var.mo54759R(u.doubleValue());
            }
            Double u2 = c1Var.mo141113u(map.get('.' + f + ".lng"), Double.valueOf(c1Var.mo54746E()));
            if (u2 != null) {
                c1Var.mo54760S(u2.doubleValue());
            }
            Integer w = c1Var.mo141115w(map.get('.' + f + ".scale"), Integer.valueOf(c1Var.mo54753L()));
            if (w != null) {
                c1Var.mo54767Z(w.intValue());
            }
            String y2 = c1Var.mo141117y(map.get('.' + f + ".poiname"), c1Var.mo54749H());
            if (y2 != null) {
                c1Var.mo54763V(y2);
            }
            String y3 = c1Var.mo141117y(map.get('.' + f + ".poiid"), c1Var.mo54752K());
            if (y3 != null) {
                c1Var.mo54766Y(y3);
            }
            String y4 = c1Var.mo141117y(map.get('.' + f + ".poiCategoryTips"), c1Var.mo54748G());
            if (y4 != null) {
                c1Var.mo54762U(y4);
            }
            String y5 = c1Var.mo141117y(map.get('.' + f + ".poiBusinessHour"), c1Var.mo54747F());
            if (y5 != null) {
                c1Var.mo54761T(y5);
            }
            String y6 = c1Var.mo141117y(map.get('.' + f + ".poiPhone"), c1Var.mo54750I());
            if (y6 != null) {
                c1Var.mo54764W(y6);
            }
            Float v = c1Var.mo141114v(map.get('.' + f + ".poiPriceTips"), Float.valueOf(c1Var.mo54751J()));
            if (v != null) {
                c1Var.mo54765X(v.floatValue());
            }
            Boolean t = c1Var.mo141112t(map.get('.' + f + ".isFromPoiList"), Boolean.valueOf(c1Var.mo54754M()));
            if (t != null) {
                c1Var.mo54757P(t.booleanValue());
            }
            String y7 = c1Var.mo141117y(map.get('.' + f + ".buildingId"), c1Var.mo54742A());
            if (y7 != null) {
                c1Var.mo54755N(y7);
            }
            String y8 = c1Var.mo141117y(map.get('.' + f + ".floorName"), c1Var.mo54743B());
            if (y8 != null) {
                c1Var.mo54756O(y8);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordLocationItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27212e1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98342c1)) {
            return jSONObject;
        }
        C98342c1 c1Var = (C98342c1) cVar;
        c1Var.mo141106n(jSONObject, "label", c1Var.mo54744C(), z);
        c1Var.mo141106n(jSONObject, "lat", Double.valueOf(c1Var.mo54745D()), z);
        c1Var.mo141106n(jSONObject, "lng", Double.valueOf(c1Var.mo54746E()), z);
        c1Var.mo141106n(jSONObject, "scale", Integer.valueOf(c1Var.mo54753L()), z);
        c1Var.mo141106n(jSONObject, "poiname", c1Var.mo54749H(), z);
        c1Var.mo141106n(jSONObject, "poiid", c1Var.mo54752K(), z);
        c1Var.mo141106n(jSONObject, "poiCategoryTips", c1Var.mo54748G(), z);
        c1Var.mo141106n(jSONObject, "poiBusinessHour", c1Var.mo54747F(), z);
        c1Var.mo141106n(jSONObject, "poiPhone", c1Var.mo54750I(), z);
        c1Var.mo141106n(jSONObject, "poiPriceTips", Float.valueOf(c1Var.mo54751J()), z);
        c1Var.mo141106n(jSONObject, "isFromPoiList", Boolean.valueOf(c1Var.mo54754M()), z);
        c1Var.mo141106n(jSONObject, "buildingId", c1Var.mo54742A(), z);
        c1Var.mo141106n(jSONObject, "floorName", c1Var.mo54743B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98342c1) || !(cVar2 instanceof C98342c1)) {
            return false;
        }
        C98342c1 c1Var = (C98342c1) cVar;
        C98342c1 c1Var2 = (C98342c1) cVar2;
        if (!C87412m.m108589b(c1Var.mo54744C(), c1Var2.mo54744C())) {
            return false;
        }
        if (!(c1Var.mo54745D() == c1Var2.mo54745D())) {
            return false;
        }
        if (!(c1Var.mo54746E() == c1Var2.mo54746E()) || c1Var.mo54753L() != c1Var2.mo54753L() || !C87412m.m108589b(c1Var.mo54749H(), c1Var2.mo54749H()) || !C87412m.m108589b(c1Var.mo54752K(), c1Var2.mo54752K()) || !C87412m.m108589b(c1Var.mo54748G(), c1Var2.mo54748G()) || !C87412m.m108589b(c1Var.mo54747F(), c1Var2.mo54747F()) || !C87412m.m108589b(c1Var.mo54750I(), c1Var2.mo54750I())) {
            return false;
        }
        return ((c1Var.mo54751J() > c1Var2.mo54751J() ? 1 : (c1Var.mo54751J() == c1Var2.mo54751J() ? 0 : -1)) == 0) && c1Var.mo54754M() == c1Var2.mo54754M() && C87412m.m108589b(c1Var.mo54742A(), c1Var2.mo54742A()) && C87412m.m108589b(c1Var.mo54743B(), c1Var2.mo54743B());
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
        if (!(cVar instanceof C98342c1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98342c1 c1Var = (C98342c1) cVar;
        boolean z2 = z;
        c1Var.mo141109q(sb, "label", "", c1Var.mo54744C(), z2);
        c1Var.mo141109q(sb, "lat", "", Double.valueOf(c1Var.mo54745D()), z2);
        StringBuilder sb5 = sb;
        c1Var.mo141109q(sb5, "lng", "", Double.valueOf(c1Var.mo54746E()), z2);
        C98342c1 c1Var2 = c1Var;
        c1Var2.mo141109q(sb5, "scale", "", Integer.valueOf(c1Var.mo54753L()), z2);
        c1Var2.mo141109q(sb5, "poiname", "", c1Var.mo54749H(), z2);
        c1Var2.mo141109q(sb5, "poiid", "", c1Var.mo54752K(), z2);
        c1Var2.mo141109q(sb5, "poiCategoryTips", "", c1Var.mo54748G(), z2);
        c1Var2.mo141109q(sb5, "poiBusinessHour", "", c1Var.mo54747F(), z2);
        c1Var2.mo141109q(sb5, "poiPhone", "", c1Var.mo54750I(), z2);
        c1Var.mo141109q(sb5, "poiPriceTips", "", Float.valueOf(c1Var.mo54751J()), z2);
        C98342c1 c1Var3 = c1Var;
        c1Var3.mo141109q(sb5, "isFromPoiList", "", Boolean.valueOf(c1Var.mo54754M()), z2);
        c1Var3.mo141109q(sb5, "buildingId", "", c1Var.mo54742A(), z2);
        c1Var3.mo141109q(sb5, "floorName", "", c1Var.mo54743B(), z2);
        sb.append("</" + str + '>');
        c1Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
