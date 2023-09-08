package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.u */
public final class C27122u extends C101653b {
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
        if (cVar instanceof C27121t) {
            C27121t tVar = (C27121t) cVar;
            String f = tVar.mo141101f(str, str2);
            String y = tVar.mo141117y(map.get('.' + f + ".uuid"), tVar.mo54669L());
            if (y != null) {
                tVar.mo54681X(y);
            }
            Integer w = tVar.mo141115w(map.get('.' + f + ".sfn"), Integer.valueOf(tVar.mo54665H()));
            if (w != null) {
                tVar.mo54677T(w.intValue());
            }
            Integer w2 = tVar.mo141115w(map.get('.' + f + ".fold-reduce"), Integer.valueOf(tVar.mo54661D()));
            if (w2 != null) {
                tVar.mo54673P(w2.intValue());
            }
            String y2 = tVar.mo141117y(map.get('.' + f + ".show-h5"), tVar.mo54667J());
            if (y2 != null) {
                tVar.mo54679V(y2);
            }
            Integer w3 = tVar.mo141115w(map.get('.' + f + ".sec-ctrl-flag"), Integer.valueOf(tVar.mo54664G()));
            if (w3 != null) {
                tVar.mo54676S(w3.intValue());
            }
            Integer w4 = tVar.mo141115w(map.get('.' + f + ".clip-len"), Integer.valueOf(tVar.mo54660C()));
            if (w4 != null) {
                tVar.mo54672O(w4.intValue());
            }
            String y3 = tVar.mo141117y(map.get('.' + f + ".share-tip-url"), tVar.mo54666I());
            if (y3 != null) {
                tVar.mo54678U(y3);
            }
            Integer w5 = tVar.mo141115w(map.get('.' + f + ".media-to-emoji"), Integer.valueOf(tVar.mo54662E()));
            if (w5 != null) {
                tVar.mo54674Q(w5.intValue());
            }
            Integer w6 = tVar.mo141115w(map.get('.' + f + ".block-range"), Integer.valueOf(tVar.mo54658A()));
            if (w6 != null) {
                tVar.mo54670M(w6.intValue());
            }
            Integer w7 = tVar.mo141115w(map.get('.' + f + ".bubble-type"), Integer.valueOf(tVar.mo54659B()));
            if (w7 != null) {
                tVar.mo54671N(w7.intValue());
            }
            Integer w8 = tVar.mo141115w(map.get('.' + f + ".preview-type"), Integer.valueOf(tVar.mo54663F()));
            if (w8 != null) {
                tVar.mo54675R(w8.intValue());
            }
            Integer w9 = tVar.mo141115w(map.get('.' + f + ".url-click-type"), Integer.valueOf(tVar.mo54668K()));
            if (w9 != null) {
                tVar.mo54680W(w9.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "sec_msg_node";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27123v(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27121t)) {
            return jSONObject;
        }
        C27121t tVar = (C27121t) cVar;
        tVar.mo141106n(jSONObject, "uuid", tVar.mo54669L(), z);
        tVar.mo141106n(jSONObject, "sfn", Integer.valueOf(tVar.mo54665H()), z);
        tVar.mo141106n(jSONObject, "fold-reduce", Integer.valueOf(tVar.mo54661D()), z);
        tVar.mo141106n(jSONObject, "show-h5", tVar.mo54667J(), z);
        tVar.mo141106n(jSONObject, "sec-ctrl-flag", Integer.valueOf(tVar.mo54664G()), z);
        tVar.mo141106n(jSONObject, "clip-len", Integer.valueOf(tVar.mo54660C()), z);
        tVar.mo141106n(jSONObject, "share-tip-url", tVar.mo54666I(), z);
        tVar.mo141106n(jSONObject, "media-to-emoji", Integer.valueOf(tVar.mo54662E()), z);
        tVar.mo141106n(jSONObject, "block-range", Integer.valueOf(tVar.mo54658A()), z);
        tVar.mo141106n(jSONObject, "bubble-type", Integer.valueOf(tVar.mo54659B()), z);
        tVar.mo141106n(jSONObject, "preview-type", Integer.valueOf(tVar.mo54663F()), z);
        tVar.mo141106n(jSONObject, "url-click-type", Integer.valueOf(tVar.mo54668K()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27121t) || !(cVar2 instanceof C27121t)) {
            return false;
        }
        C27121t tVar = (C27121t) cVar;
        C27121t tVar2 = (C27121t) cVar2;
        return C87412m.m108589b(tVar.mo54669L(), tVar2.mo54669L()) && tVar.mo54665H() == tVar2.mo54665H() && tVar.mo54661D() == tVar2.mo54661D() && C87412m.m108589b(tVar.mo54667J(), tVar2.mo54667J()) && tVar.mo54664G() == tVar2.mo54664G() && tVar.mo54660C() == tVar2.mo54660C() && C87412m.m108589b(tVar.mo54666I(), tVar2.mo54666I()) && tVar.mo54662E() == tVar2.mo54662E() && tVar.mo54658A() == tVar2.mo54658A() && tVar.mo54659B() == tVar2.mo54659B() && tVar.mo54663F() == tVar2.mo54663F() && tVar.mo54668K() == tVar2.mo54668K();
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
        if (!(cVar instanceof C27121t)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27121t tVar = (C27121t) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        tVar.mo141109q(sb5, "uuid", "", tVar.mo54669L(), z2);
        tVar.mo141109q(sb5, "sfn", "", Integer.valueOf(tVar.mo54665H()), z2);
        C27121t tVar2 = tVar;
        tVar2.mo141109q(sb5, "fold-reduce", "", Integer.valueOf(tVar.mo54661D()), z2);
        tVar2.mo141109q(sb5, "show-h5", "", tVar.mo54667J(), z2);
        tVar.mo141109q(sb5, "sec-ctrl-flag", "", Integer.valueOf(tVar.mo54664G()), z2);
        C27121t tVar3 = tVar;
        tVar3.mo141109q(sb5, "clip-len", "", Integer.valueOf(tVar.mo54660C()), z2);
        tVar3.mo141109q(sb5, "share-tip-url", "", tVar.mo54666I(), z2);
        tVar.mo141109q(sb5, "media-to-emoji", "", Integer.valueOf(tVar.mo54662E()), z2);
        tVar.mo141109q(sb5, "block-range", "", Integer.valueOf(tVar.mo54658A()), z2);
        tVar.mo141109q(sb5, "bubble-type", "", Integer.valueOf(tVar.mo54659B()), z2);
        tVar.mo141109q(sb5, "preview-type", "", Integer.valueOf(tVar.mo54663F()), z2);
        tVar.mo141109q(sb5, "url-click-type", "", Integer.valueOf(tVar.mo54668K()), z2);
        sb.append("</" + str + '>');
        tVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
