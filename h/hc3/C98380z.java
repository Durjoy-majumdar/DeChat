package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.z */
public final class C98380z extends C101653b {
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
        if (cVar instanceof C98378y) {
            C98378y yVar = (C98378y) cVar;
            String f = yVar.mo141101f(str, str2);
            Integer w = yVar.mo141115w(map.get('.' + f + ".mediaType"), Integer.valueOf(yVar.mo54686D()));
            if (w != null) {
                yVar.mo54694L(w.intValue());
            }
            String y = yVar.mo141117y(map.get('.' + f + ".url"), yVar.mo54688F());
            if (y != null) {
                yVar.mo54696N(y);
            }
            String y2 = yVar.mo141117y(map.get('.' + f + ".thumbUrl"), yVar.mo54687E());
            if (y2 != null) {
                yVar.mo54695M(y2);
            }
            String y3 = yVar.mo141117y(map.get('.' + f + ".fullCoverUrl"), yVar.mo54684B());
            if (y3 != null) {
                yVar.mo54692J(y3);
            }
            String y4 = yVar.mo141117y(map.get('.' + f + ".fullClipInset"), yVar.mo54683A());
            if (y4 != null) {
                yVar.mo54691I(y4);
            }
            Float v = yVar.mo141114v(map.get('.' + f + ".width"), Float.valueOf(yVar.mo54690H()));
            if (v != null) {
                yVar.mo54698P(v.floatValue());
            }
            Float v2 = yVar.mo141114v(map.get('.' + f + ".height"), Float.valueOf(yVar.mo54685C()));
            if (v2 != null) {
                yVar.mo54693K(v2.floatValue());
            }
            Integer w2 = yVar.mo141115w(map.get('.' + f + ".videoPlayDuration"), Integer.valueOf(yVar.mo54689G()));
            if (w2 != null) {
                yVar.mo54697O(w2.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderFeedMediaItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27172a0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98378y)) {
            return jSONObject;
        }
        C98378y yVar = (C98378y) cVar;
        yVar.mo141106n(jSONObject, "mediaType", Integer.valueOf(yVar.mo54686D()), z);
        yVar.mo141106n(jSONObject, "url", yVar.mo54688F(), z);
        yVar.mo141106n(jSONObject, "thumbUrl", yVar.mo54687E(), z);
        yVar.mo141106n(jSONObject, "fullCoverUrl", yVar.mo54684B(), z);
        yVar.mo141106n(jSONObject, "fullClipInset", yVar.mo54683A(), z);
        yVar.mo141106n(jSONObject, "width", Float.valueOf(yVar.mo54690H()), z);
        yVar.mo141106n(jSONObject, "height", Float.valueOf(yVar.mo54685C()), z);
        yVar.mo141106n(jSONObject, "videoPlayDuration", Integer.valueOf(yVar.mo54689G()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98378y) || !(cVar2 instanceof C98378y)) {
            return false;
        }
        C98378y yVar = (C98378y) cVar;
        C98378y yVar2 = (C98378y) cVar2;
        if (yVar.mo54686D() != yVar2.mo54686D() || !C87412m.m108589b(yVar.mo54688F(), yVar2.mo54688F()) || !C87412m.m108589b(yVar.mo54687E(), yVar2.mo54687E()) || !C87412m.m108589b(yVar.mo54684B(), yVar2.mo54684B()) || !C87412m.m108589b(yVar.mo54683A(), yVar2.mo54683A())) {
            return false;
        }
        if (!(yVar.mo54690H() == yVar2.mo54690H())) {
            return false;
        }
        return ((yVar.mo54685C() > yVar2.mo54685C() ? 1 : (yVar.mo54685C() == yVar2.mo54685C() ? 0 : -1)) == 0) && yVar.mo54689G() == yVar2.mo54689G();
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
        if (!(cVar instanceof C98378y)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98378y yVar = (C98378y) cVar;
        C98378y yVar2 = yVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        yVar2.mo141109q(sb5, "mediaType", "", Integer.valueOf(yVar.mo54686D()), z2);
        yVar2.mo141109q(sb5, "url", "", yVar.mo54688F(), z2);
        yVar2.mo141109q(sb5, "thumbUrl", "", yVar.mo54687E(), z2);
        yVar2.mo141109q(sb5, "fullCoverUrl", "", yVar.mo54684B(), z2);
        yVar2.mo141109q(sb5, "fullClipInset", "", yVar.mo54683A(), z2);
        yVar.mo141109q(sb5, "width", "", Float.valueOf(yVar.mo54690H()), z2);
        yVar.mo141109q(sb5, "height", "", Float.valueOf(yVar.mo54685C()), z2);
        yVar.mo141109q(sb5, "videoPlayDuration", "", Integer.valueOf(yVar.mo54689G()), z2);
        sb.append("</" + str + '>');
        yVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
