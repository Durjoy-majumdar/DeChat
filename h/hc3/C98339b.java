package hc3;

import com.google.android.gms.dynamite.ProviderConstants;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.b */
public final class C98339b extends C101653b {
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
        if (cVar instanceof C98337a) {
            C98337a aVar = (C98337a) cVar;
            String f = aVar.mo141101f(str, str2);
            String y = aVar.mo141117y(map.get('.' + f + ".username"), aVar.mo54724K());
            if (y != null) {
                aVar.mo54736W(y);
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".appid"), aVar.mo54714A());
            if (y2 != null) {
                aVar.mo54726M(y2);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".pkgtype"), Integer.valueOf(aVar.mo54719F()));
            if (w != null) {
                aVar.mo54731R(w.intValue());
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".iconurl"), aVar.mo54716C());
            if (y3 != null) {
                aVar.mo54728O(y3);
            }
            Integer w2 = aVar.mo141115w(map.get('.' + f + ".type"), Integer.valueOf(aVar.mo54723J()));
            if (w2 != null) {
                aVar.mo54735V(w2.intValue());
            }
            String y4 = aVar.mo141117y(map.get('.' + f + ".pagepath"), aVar.mo54718E());
            if (y4 != null) {
                aVar.mo54730Q(y4);
            }
            String y5 = aVar.mo141117y(map.get('.' + f + ".sourcedisplayname"), aVar.mo54721H());
            if (y5 != null) {
                aVar.mo54733T(y5);
            }
            Integer w3 = aVar.mo141115w(map.get('.' + f + ".version"), Integer.valueOf(aVar.mo54725L()));
            if (w3 != null) {
                aVar.mo54737X(w3.intValue());
            }
            Integer w4 = aVar.mo141115w(map.get('.' + f + ".disableforward"), Integer.valueOf(aVar.mo54715B()));
            if (w4 != null) {
                aVar.mo54727N(w4.intValue());
            }
            Integer w5 = aVar.mo141115w(map.get('.' + f + ".showRelievedBuyFlag"), Integer.valueOf(aVar.mo54720G()));
            if (w5 != null) {
                aVar.mo54732S(w5.intValue());
            }
            String y6 = aVar.mo141117y(map.get('.' + f + ".messageextradata"), aVar.mo54717D());
            if (y6 != null) {
                aVar.mo54729P(y6);
            }
            Integer w6 = aVar.mo141115w(map.get('.' + f + ".subtype"), Integer.valueOf(aVar.mo54722I()));
            if (w6 != null) {
                aVar.mo54734U(w6.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordAppBrandItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27195c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98337a)) {
            return jSONObject;
        }
        C98337a aVar = (C98337a) cVar;
        aVar.mo141106n(jSONObject, "username", aVar.mo54724K(), z);
        aVar.mo141106n(jSONObject, "appid", aVar.mo54714A(), z);
        aVar.mo141106n(jSONObject, "pkgtype", Integer.valueOf(aVar.mo54719F()), z);
        aVar.mo141106n(jSONObject, "iconurl", aVar.mo54716C(), z);
        aVar.mo141106n(jSONObject, "type", Integer.valueOf(aVar.mo54723J()), z);
        aVar.mo141106n(jSONObject, "pagepath", aVar.mo54718E(), z);
        aVar.mo141106n(jSONObject, "sourcedisplayname", aVar.mo54721H(), z);
        aVar.mo141106n(jSONObject, ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(aVar.mo54725L()), z);
        aVar.mo141106n(jSONObject, "disableforward", Integer.valueOf(aVar.mo54715B()), z);
        aVar.mo141106n(jSONObject, "showRelievedBuyFlag", Integer.valueOf(aVar.mo54720G()), z);
        aVar.mo141106n(jSONObject, "messageextradata", aVar.mo54717D(), z);
        aVar.mo141106n(jSONObject, "subtype", Integer.valueOf(aVar.mo54722I()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98337a) || !(cVar2 instanceof C98337a)) {
            return false;
        }
        C98337a aVar = (C98337a) cVar;
        C98337a aVar2 = (C98337a) cVar2;
        return C87412m.m108589b(aVar.mo54724K(), aVar2.mo54724K()) && C87412m.m108589b(aVar.mo54714A(), aVar2.mo54714A()) && aVar.mo54719F() == aVar2.mo54719F() && C87412m.m108589b(aVar.mo54716C(), aVar2.mo54716C()) && aVar.mo54723J() == aVar2.mo54723J() && C87412m.m108589b(aVar.mo54718E(), aVar2.mo54718E()) && C87412m.m108589b(aVar.mo54721H(), aVar2.mo54721H()) && aVar.mo54725L() == aVar2.mo54725L() && aVar.mo54715B() == aVar2.mo54715B() && aVar.mo54720G() == aVar2.mo54720G() && C87412m.m108589b(aVar.mo54717D(), aVar2.mo54717D()) && aVar.mo54722I() == aVar2.mo54722I();
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
        if (!(cVar instanceof C98337a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98337a aVar = (C98337a) cVar;
        C98337a aVar2 = aVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        aVar2.mo141109q(sb5, "username", "", aVar.mo54724K(), z2);
        aVar2.mo141109q(sb5, "appid", "", aVar.mo54714A(), z2);
        C98337a aVar3 = aVar;
        aVar3.mo141109q(sb5, "pkgtype", "", Integer.valueOf(aVar.mo54719F()), z2);
        aVar3.mo141109q(sb5, "iconurl", "", aVar.mo54716C(), z2);
        C98337a aVar4 = aVar;
        aVar4.mo141109q(sb5, "type", "", Integer.valueOf(aVar.mo54723J()), z2);
        aVar4.mo141109q(sb5, "pagepath", "", aVar.mo54718E(), z2);
        aVar4.mo141109q(sb5, "sourcedisplayname", "", aVar.mo54721H(), z2);
        aVar.mo141109q(sb5, ProviderConstants.API_COLNAME_FEATURE_VERSION, "", Integer.valueOf(aVar.mo54725L()), z2);
        aVar.mo141109q(sb5, "disableforward", "", Integer.valueOf(aVar.mo54715B()), z2);
        C98337a aVar5 = aVar;
        aVar5.mo141109q(sb5, "showRelievedBuyFlag", "", Integer.valueOf(aVar.mo54720G()), z2);
        aVar5.mo141109q(sb5, "messageextradata", "", aVar.mo54717D(), z2);
        aVar.mo141109q(sb5, "subtype", "", Integer.valueOf(aVar.mo54722I()), z2);
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
