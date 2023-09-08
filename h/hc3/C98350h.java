package hc3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.h */
public final class C98350h extends C101653b {
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
        if (cVar instanceof C98348g) {
            C98348g gVar = (C98348g) cVar;
            String f = gVar.mo141101f(str, str2);
            String y = gVar.mo141117y(map.get('.' + f + ".vid"), gVar.mo54843I());
            if (y != null) {
                gVar.mo54856V(y);
            }
            String y2 = gVar.mo141117y(map.get('.' + f + ".srcusername"), gVar.mo54842H());
            if (y2 != null) {
                gVar.mo54855U(y2);
            }
            String y3 = gVar.mo141117y(map.get('.' + f + ".srcdisplayname"), gVar.mo54841G());
            if (y3 != null) {
                gVar.mo54854T(y3);
            }
            String y4 = gVar.mo141117y(map.get('.' + f + ".cover"), gVar.mo54835A());
            if (y4 != null) {
                gVar.mo54847M(y4);
            }
            Integer w = gVar.mo141115w(map.get('.' + f + ".itemshowtype"), Integer.valueOf(gVar.mo54838D()));
            if (w != null) {
                gVar.mo54850P(w.intValue());
            }
            Integer w2 = gVar.mo141115w(map.get('.' + f + ".ispaysubscribe"), Integer.valueOf(gVar.mo54846L()));
            if (w2 != null) {
                gVar.mo54852R(w2.intValue());
            }
            Integer w3 = gVar.mo141115w(map.get('.' + f + ".nativepage"), Integer.valueOf(gVar.mo54839E()));
            if (w3 != null) {
                gVar.mo54851Q(w3.intValue());
            }
            Integer w4 = gVar.mo141115w(map.get('.' + f + ".width"), Integer.valueOf(gVar.mo54845K()));
            if (w4 != null) {
                gVar.mo54858X(w4.intValue());
            }
            Integer w5 = gVar.mo141115w(map.get('.' + f + ".height"), Integer.valueOf(gVar.mo54844J()));
            if (w5 != null) {
                gVar.mo54857W(w5.intValue());
            }
            Integer w6 = gVar.mo141115w(map.get('.' + f + ".pubtime"), Integer.valueOf(gVar.mo54840F()));
            if (w6 != null) {
                gVar.mo54853S(w6.intValue());
            }
            Integer w7 = gVar.mo141115w(map.get('.' + f + ".duration"), Integer.valueOf(gVar.mo54836B()));
            if (w7 != null) {
                gVar.mo54848N(w7.intValue());
            }
            Integer w8 = gVar.mo141115w(map.get('.' + f + ".funcflag"), Integer.valueOf(gVar.mo54837C()));
            if (w8 != null) {
                gVar.mo54849O(w8.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "appmsgshareitem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27271i(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98348g)) {
            return jSONObject;
        }
        C98348g gVar = (C98348g) cVar;
        gVar.mo141106n(jSONObject, TPReportKeys.Common.COMMON_VID, gVar.mo54843I(), z);
        gVar.mo141106n(jSONObject, "srcusername", gVar.mo54842H(), z);
        gVar.mo141106n(jSONObject, "srcdisplayname", gVar.mo54841G(), z);
        gVar.mo141106n(jSONObject, "cover", gVar.mo54835A(), z);
        gVar.mo141106n(jSONObject, "itemshowtype", Integer.valueOf(gVar.mo54838D()), z);
        gVar.mo141106n(jSONObject, "ispaysubscribe", Integer.valueOf(gVar.mo54846L()), z);
        gVar.mo141106n(jSONObject, "nativepage", Integer.valueOf(gVar.mo54839E()), z);
        gVar.mo141106n(jSONObject, "width", Integer.valueOf(gVar.mo54845K()), z);
        gVar.mo141106n(jSONObject, "height", Integer.valueOf(gVar.mo54844J()), z);
        gVar.mo141106n(jSONObject, "pubtime", Integer.valueOf(gVar.mo54840F()), z);
        gVar.mo141106n(jSONObject, "duration", Integer.valueOf(gVar.mo54836B()), z);
        gVar.mo141106n(jSONObject, "funcflag", Integer.valueOf(gVar.mo54837C()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98348g) || !(cVar2 instanceof C98348g)) {
            return false;
        }
        C98348g gVar = (C98348g) cVar;
        C98348g gVar2 = (C98348g) cVar2;
        return C87412m.m108589b(gVar.mo54843I(), gVar2.mo54843I()) && C87412m.m108589b(gVar.mo54842H(), gVar2.mo54842H()) && C87412m.m108589b(gVar.mo54841G(), gVar2.mo54841G()) && C87412m.m108589b(gVar.mo54835A(), gVar2.mo54835A()) && gVar.mo54838D() == gVar2.mo54838D() && gVar.mo54846L() == gVar2.mo54846L() && gVar.mo54839E() == gVar2.mo54839E() && gVar.mo54845K() == gVar2.mo54845K() && gVar.mo54844J() == gVar2.mo54844J() && gVar.mo54840F() == gVar2.mo54840F() && gVar.mo54836B() == gVar2.mo54836B() && gVar.mo54837C() == gVar2.mo54837C();
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
        if (!(cVar instanceof C98348g)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98348g gVar = (C98348g) cVar;
        C98348g gVar2 = gVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        gVar2.mo141109q(sb5, TPReportKeys.Common.COMMON_VID, "", gVar.mo54843I(), z2);
        gVar2.mo141109q(sb5, "srcusername", "", gVar.mo54842H(), z2);
        gVar2.mo141109q(sb5, "srcdisplayname", "", gVar.mo54841G(), z2);
        gVar2.mo141109q(sb5, "cover", "", gVar.mo54835A(), z2);
        gVar.mo141109q(sb5, "itemshowtype", "", Integer.valueOf(gVar.mo54838D()), z2);
        gVar.mo141109q(sb5, "ispaysubscribe", "", Integer.valueOf(gVar.mo54846L()), z2);
        gVar.mo141109q(sb5, "nativepage", "", Integer.valueOf(gVar.mo54839E()), z2);
        gVar.mo141109q(sb5, "width", "", Integer.valueOf(gVar.mo54845K()), z2);
        gVar.mo141109q(sb5, "height", "", Integer.valueOf(gVar.mo54844J()), z2);
        gVar.mo141109q(sb5, "pubtime", "", Integer.valueOf(gVar.mo54840F()), z2);
        gVar.mo141109q(sb5, "duration", "", Integer.valueOf(gVar.mo54836B()), z2);
        gVar.mo141109q(sb5, "funcflag", "", Integer.valueOf(gVar.mo54837C()), z2);
        sb.append("</" + str + '>');
        gVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
