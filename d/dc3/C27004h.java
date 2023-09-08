package dc3;

import com.google.android.gms.dynamite.ProviderConstants;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: dc3.h */
public final class C27004h extends C101653b {
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
        if (cVar instanceof C27003g) {
            C27003g gVar = (C27003g) cVar;
            String f = gVar.mo141101f(str, str2);
            String y = gVar.mo141117y(map.get('.' + f + ".username"), gVar.mo54468D());
            if (y != null) {
                gVar.mo54474J(y);
            }
            String y2 = gVar.mo141117y(map.get('.' + f + ".appid"), gVar.mo54465A());
            if (y2 != null) {
                gVar.mo54471G(y2);
            }
            Integer w = gVar.mo141115w(map.get('.' + f + ".type"), Integer.valueOf(gVar.mo54467C()));
            if (w != null) {
                gVar.mo54473I(w.intValue());
            }
            Integer w2 = gVar.mo141115w(map.get('.' + f + ".version"), Integer.valueOf(gVar.mo54469E()));
            if (w2 != null) {
                gVar.mo54475K(w2.intValue());
            }
            String y3 = gVar.mo141117y(map.get('.' + f + ".weappiconurl"), gVar.mo54470F());
            if (y3 != null) {
                gVar.mo54476L(y3);
            }
            String y4 = gVar.mo141117y(map.get('.' + f + ".pagepath"), gVar.mo54466B());
            if (y4 != null) {
                gVar.mo54472H(y4);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "WeAppInfo";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27005i(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27003g)) {
            return jSONObject;
        }
        C27003g gVar = (C27003g) cVar;
        gVar.mo141106n(jSONObject, "username", gVar.mo54468D(), z);
        gVar.mo141106n(jSONObject, "appid", gVar.mo54465A(), z);
        gVar.mo141106n(jSONObject, "type", Integer.valueOf(gVar.mo54467C()), z);
        gVar.mo141106n(jSONObject, ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(gVar.mo54469E()), z);
        gVar.mo141106n(jSONObject, "weappiconurl", gVar.mo54470F(), z);
        gVar.mo141106n(jSONObject, "pagepath", gVar.mo54466B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27003g) || !(cVar2 instanceof C27003g)) {
            return false;
        }
        C27003g gVar = (C27003g) cVar;
        C27003g gVar2 = (C27003g) cVar2;
        return C87412m.m108589b(gVar.mo54468D(), gVar2.mo54468D()) && C87412m.m108589b(gVar.mo54465A(), gVar2.mo54465A()) && gVar.mo54467C() == gVar2.mo54467C() && gVar.mo54469E() == gVar2.mo54469E() && C87412m.m108589b(gVar.mo54470F(), gVar2.mo54470F()) && C87412m.m108589b(gVar.mo54466B(), gVar2.mo54466B());
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
        if (!(cVar instanceof C27003g)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27003g gVar = (C27003g) cVar;
        C27003g gVar2 = gVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        gVar2.mo141109q(sb5, "username", "", gVar.mo54468D(), z2);
        gVar2.mo141109q(sb5, "appid", "", gVar.mo54465A(), z2);
        gVar.mo141109q(sb5, "type", "", Integer.valueOf(gVar.mo54467C()), z2);
        C27003g gVar3 = gVar;
        gVar3.mo141109q(sb5, ProviderConstants.API_COLNAME_FEATURE_VERSION, "", Integer.valueOf(gVar.mo54469E()), z2);
        gVar3.mo141109q(sb5, "weappiconurl", "", gVar.mo54470F(), z2);
        gVar3.mo141109q(sb5, "pagepath", "", gVar.mo54466B(), z2);
        sb.append("</" + str + '>');
        gVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
