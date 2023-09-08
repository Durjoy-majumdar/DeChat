package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.i0 */
public final class C98354i0 extends C101653b {
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
        if (cVar instanceof C98351h0) {
            C98351h0 h0Var = (C98351h0) cVar;
            String f = h0Var.mo141101f(str, str2);
            String y = h0Var.mo141117y(map.get('.' + f + ".coverUrl"), h0Var.mo54859A());
            if (y != null) {
                h0Var.mo54862D(y);
            }
            Float v = h0Var.mo141114v(map.get('.' + f + ".height"), Float.valueOf(h0Var.mo54860B()));
            if (v != null) {
                h0Var.mo54863E(v.floatValue());
            }
            Float v2 = h0Var.mo141114v(map.get('.' + f + ".width"), Float.valueOf(h0Var.mo54861C()));
            if (v2 != null) {
                h0Var.mo54864F(v2.floatValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderLiveMediaItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27284j0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98351h0)) {
            return jSONObject;
        }
        C98351h0 h0Var = (C98351h0) cVar;
        h0Var.mo141106n(jSONObject, "coverUrl", h0Var.mo54859A(), z);
        h0Var.mo141106n(jSONObject, "height", Float.valueOf(h0Var.mo54860B()), z);
        h0Var.mo141106n(jSONObject, "width", Float.valueOf(h0Var.mo54861C()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98351h0) || !(cVar2 instanceof C98351h0)) {
            return false;
        }
        C98351h0 h0Var = (C98351h0) cVar;
        C98351h0 h0Var2 = (C98351h0) cVar2;
        if (!C87412m.m108589b(h0Var.mo54859A(), h0Var2.mo54859A())) {
            return false;
        }
        if (!(h0Var.mo54860B() == h0Var2.mo54860B())) {
            return false;
        }
        return (h0Var.mo54861C() > h0Var2.mo54861C() ? 1 : (h0Var.mo54861C() == h0Var2.mo54861C() ? 0 : -1)) == 0;
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
        if (!(cVar instanceof C98351h0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98351h0 h0Var = (C98351h0) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        h0Var.mo141109q(sb5, "coverUrl", "", h0Var.mo54859A(), z2);
        h0Var.mo141109q(sb5, "height", "", Float.valueOf(h0Var.mo54860B()), z2);
        h0Var.mo141109q(sb5, "width", "", Float.valueOf(h0Var.mo54861C()), z2);
        sb.append("</" + str + '>');
        h0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
