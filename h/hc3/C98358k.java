package hc3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.k */
public final class C98358k extends C101653b {
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
        if (cVar instanceof C98356j) {
            C98356j jVar = (C98356j) cVar;
            String f = jVar.mo141101f(str, str2);
            String y = jVar.mo141117y(map.get('.' + f + ".vid"), jVar.mo54900H());
            if (y != null) {
                jVar.mo54909Q(y);
            }
            String y2 = jVar.mo141117y(map.get('.' + f + ".videourl"), jVar.mo54901I());
            if (y2 != null) {
                jVar.mo54910R(y2);
            }
            String y3 = jVar.mo141117y(map.get('.' + f + ".mpurl"), jVar.mo54896D());
            if (y3 != null) {
                jVar.mo54905M(y3);
            }
            String y4 = jVar.mo141117y(map.get('.' + f + ".bizusrname"), jVar.mo54894B());
            if (y4 != null) {
                jVar.mo54903K(y4);
            }
            String y5 = jVar.mo141117y(map.get('.' + f + ".biznickname"), jVar.mo54893A());
            if (y5 != null) {
                jVar.mo54902J(y5);
            }
            String y6 = jVar.mo141117y(map.get('.' + f + ".thumburl"), jVar.mo54898F());
            if (y6 != null) {
                jVar.mo54907O(y6);
            }
            Integer w = jVar.mo141115w(map.get('.' + f + ".thumbwidth"), Integer.valueOf(jVar.mo54899G()));
            if (w != null) {
                jVar.mo54908P(w.intValue());
            }
            Integer w2 = jVar.mo141115w(map.get('.' + f + ".thumbheight"), Integer.valueOf(jVar.mo54897E()));
            if (w2 != null) {
                jVar.mo54906N(w2.intValue());
            }
            Integer w3 = jVar.mo141115w(map.get('.' + f + ".duration"), Integer.valueOf(jVar.mo54895C()));
            if (w3 != null) {
                jVar.mo54904L(w3.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordBrandMpVideoItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27303l(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98356j)) {
            return jSONObject;
        }
        C98356j jVar = (C98356j) cVar;
        jVar.mo141106n(jSONObject, TPReportKeys.Common.COMMON_VID, jVar.mo54900H(), z);
        jVar.mo141106n(jSONObject, "videourl", jVar.mo54901I(), z);
        jVar.mo141106n(jSONObject, "mpurl", jVar.mo54896D(), z);
        jVar.mo141106n(jSONObject, "bizusrname", jVar.mo54894B(), z);
        jVar.mo141106n(jSONObject, "biznickname", jVar.mo54893A(), z);
        jVar.mo141106n(jSONObject, "thumburl", jVar.mo54898F(), z);
        jVar.mo141106n(jSONObject, "thumbwidth", Integer.valueOf(jVar.mo54899G()), z);
        jVar.mo141106n(jSONObject, "thumbheight", Integer.valueOf(jVar.mo54897E()), z);
        jVar.mo141106n(jSONObject, "duration", Integer.valueOf(jVar.mo54895C()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98356j) || !(cVar2 instanceof C98356j)) {
            return false;
        }
        C98356j jVar = (C98356j) cVar;
        C98356j jVar2 = (C98356j) cVar2;
        return C87412m.m108589b(jVar.mo54900H(), jVar2.mo54900H()) && C87412m.m108589b(jVar.mo54901I(), jVar2.mo54901I()) && C87412m.m108589b(jVar.mo54896D(), jVar2.mo54896D()) && C87412m.m108589b(jVar.mo54894B(), jVar2.mo54894B()) && C87412m.m108589b(jVar.mo54893A(), jVar2.mo54893A()) && C87412m.m108589b(jVar.mo54898F(), jVar2.mo54898F()) && jVar.mo54899G() == jVar2.mo54899G() && jVar.mo54897E() == jVar2.mo54897E() && jVar.mo54895C() == jVar2.mo54895C();
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
        if (!(cVar instanceof C98356j)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98356j jVar = (C98356j) cVar;
        C98356j jVar2 = jVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        jVar2.mo141109q(sb5, TPReportKeys.Common.COMMON_VID, "", jVar.mo54900H(), z2);
        jVar2.mo141109q(sb5, "videourl", "", jVar.mo54901I(), z2);
        jVar2.mo141109q(sb5, "mpurl", "", jVar.mo54896D(), z2);
        jVar2.mo141109q(sb5, "bizusrname", "", jVar.mo54894B(), z2);
        jVar2.mo141109q(sb5, "biznickname", "", jVar.mo54893A(), z2);
        jVar2.mo141109q(sb5, "thumburl", "", jVar.mo54898F(), z2);
        jVar.mo141109q(sb5, "thumbwidth", "", Integer.valueOf(jVar.mo54899G()), z2);
        jVar.mo141109q(sb5, "thumbheight", "", Integer.valueOf(jVar.mo54897E()), z2);
        jVar.mo141109q(sb5, "duration", "", Integer.valueOf(jVar.mo54895C()), z2);
        sb.append("</" + str + '>');
        jVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
