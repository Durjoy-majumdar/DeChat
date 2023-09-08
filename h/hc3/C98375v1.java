package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.v1 */
public final class C98375v1 extends C101653b {
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
        if (cVar instanceof C98373u1) {
            C98373u1 u1Var = (C98373u1) cVar;
            String f = u1Var.mo141101f(str, str2);
            String y = u1Var.mo141117y(map.get('.' + f + ".link"), u1Var.mo55128D());
            if (y != null) {
                u1Var.mo55136L(y);
            }
            String y2 = u1Var.mo141117y(map.get('.' + f + ".desc"), u1Var.mo55126B());
            if (y2 != null) {
                u1Var.mo55134J(y2);
            }
            String y3 = u1Var.mo141117y(map.get('.' + f + ".thumburl"), u1Var.mo55131G());
            if (y3 != null) {
                u1Var.mo55139O(y3);
            }
            String y4 = u1Var.mo141117y(map.get('.' + f + ".title"), u1Var.mo55132H());
            if (y4 != null) {
                u1Var.mo55140P(y4);
            }
            Integer w = u1Var.mo141115w(map.get('.' + f + ".opencache"), Integer.valueOf(u1Var.mo55129E()));
            if (w != null) {
                u1Var.mo55137M(w.intValue());
            }
            Integer w2 = u1Var.mo141115w(map.get('.' + f + ".contentattr"), Integer.valueOf(u1Var.mo55125A()));
            if (w2 != null) {
                u1Var.mo55133I(w2.intValue());
            }
            Integer w3 = u1Var.mo141115w(map.get('.' + f + ".forwardflag"), Integer.valueOf(u1Var.mo55127C()));
            if (w3 != null) {
                u1Var.mo55135K(w3.intValue());
            }
            if (map.containsKey('.' + f + ".appmsgshareitem")) {
                C98348g gVar = new C98348g();
                u1Var.mo141105m(gVar, map, "appmsgshareitem", f);
                u1Var.mo55138N(gVar);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordUrlItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27442w1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98373u1)) {
            return jSONObject;
        }
        C98373u1 u1Var = (C98373u1) cVar;
        u1Var.mo141106n(jSONObject, "link", u1Var.mo55128D(), z);
        u1Var.mo141106n(jSONObject, "desc", u1Var.mo55126B(), z);
        u1Var.mo141106n(jSONObject, "thumburl", u1Var.mo55131G(), z);
        u1Var.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, u1Var.mo55132H(), z);
        u1Var.mo141106n(jSONObject, "opencache", Integer.valueOf(u1Var.mo55129E()), z);
        u1Var.mo141106n(jSONObject, "contentattr", Integer.valueOf(u1Var.mo55125A()), z);
        u1Var.mo141106n(jSONObject, "forwardflag", Integer.valueOf(u1Var.mo55127C()), z);
        u1Var.mo141106n(jSONObject, "appmsgshareitem", u1Var.mo55130F(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98373u1) || !(cVar2 instanceof C98373u1)) {
            return false;
        }
        C98373u1 u1Var = (C98373u1) cVar;
        C98373u1 u1Var2 = (C98373u1) cVar2;
        return C87412m.m108589b(u1Var.mo55128D(), u1Var2.mo55128D()) && C87412m.m108589b(u1Var.mo55126B(), u1Var2.mo55126B()) && C87412m.m108589b(u1Var.mo55131G(), u1Var2.mo55131G()) && C87412m.m108589b(u1Var.mo55132H(), u1Var2.mo55132H()) && u1Var.mo55129E() == u1Var2.mo55129E() && u1Var.mo55125A() == u1Var2.mo55125A() && u1Var.mo55127C() == u1Var2.mo55127C() && u1Var.mo141098c(u1Var.mo55130F(), u1Var2.mo55130F());
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
        if (!(cVar instanceof C98373u1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98373u1 u1Var = (C98373u1) cVar;
        C98373u1 u1Var2 = u1Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        u1Var2.mo141109q(sb5, "link", "", u1Var.mo55128D(), z2);
        u1Var2.mo141109q(sb5, "desc", "", u1Var.mo55126B(), z2);
        u1Var2.mo141109q(sb5, "thumburl", "", u1Var.mo55131G(), z2);
        u1Var2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", u1Var.mo55132H(), z2);
        u1Var.mo141109q(sb5, "opencache", "", Integer.valueOf(u1Var.mo55129E()), z2);
        u1Var.mo141109q(sb5, "contentattr", "", Integer.valueOf(u1Var.mo55125A()), z2);
        C98373u1 u1Var3 = u1Var;
        u1Var3.mo141109q(sb5, "forwardflag", "", Integer.valueOf(u1Var.mo55127C()), z2);
        u1Var3.mo141109q(sb5, "appmsgshareitem", "", u1Var.mo55130F(), z2);
        sb.append("</" + str + '>');
        u1Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
