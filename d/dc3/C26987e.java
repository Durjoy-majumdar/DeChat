package dc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: dc3.e */
public final class C26987e extends C101653b {
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
        if (cVar instanceof C26986d) {
            C26986d dVar = (C26986d) cVar;
            String f = dVar.mo141101f(str, str2);
            String y = dVar.mo141117y(map.get('.' + f + ".$appid"), dVar.mo53865B());
            if (y != null) {
                dVar.mo53875L(y);
            }
            Integer w = dVar.mo141115w(map.get('.' + f + ".$sdkver"), Integer.valueOf(dVar.mo53868E()));
            if (w != null) {
                dVar.mo53878O(w.intValue());
            }
            String y2 = dVar.mo141117y(map.get('.' + f + ".title"), dVar.mo53870G());
            if (y2 != null) {
                dVar.mo53880Q(y2);
            }
            String y3 = dVar.mo141117y(map.get('.' + f + ".des"), dVar.mo53867D());
            if (y3 != null) {
                dVar.mo53877N(y3);
            }
            String y4 = dVar.mo141117y(map.get('.' + f + ".username"), dVar.mo53873J());
            if (y4 != null) {
                dVar.mo53883T(y4);
            }
            String y5 = dVar.mo141117y(map.get('.' + f + ".action"), dVar.mo53864A());
            if (y5 != null) {
                dVar.mo53874K(y5);
            }
            Integer w2 = dVar.mo141115w(map.get('.' + f + ".type"), Integer.valueOf(dVar.mo53871H()));
            if (w2 != null) {
                dVar.mo53881R(w2.intValue());
            }
            Integer w3 = dVar.mo141115w(map.get('.' + f + ".showtype"), Integer.valueOf(dVar.mo53869F()));
            if (w3 != null) {
                dVar.mo53879P(w3.intValue());
            }
            String y6 = dVar.mo141117y(map.get('.' + f + ".content"), dVar.mo53866C());
            if (y6 != null) {
                dVar.mo53876M(y6);
            }
            String y7 = dVar.mo141117y(map.get('.' + f + ".url"), dVar.mo53872I());
            if (y7 != null) {
                dVar.mo53882S(y7);
            }
            if (map.containsKey('.' + f + ".appattach")) {
                C26975a aVar = new C26975a();
                dVar.mo141105m(aVar, map, "appattach", f);
                dVar.mo54460Y(aVar);
            }
            String y8 = dVar.mo141117y(map.get('.' + f + ".sourcedisplayname"), dVar.mo54457V());
            if (y8 != null) {
                dVar.mo54461Z(y8);
            }
            String y9 = dVar.mo141117y(map.get('.' + f + ".thumburl"), dVar.mo54458W());
            if (y9 != null) {
                dVar.mo54462a0(y9);
            }
            if (map.containsKey('.' + f + ".weappinfo")) {
                C27003g gVar = new C27003g();
                dVar.mo141105m(gVar, map, "weappinfo", f);
                dVar.mo54463b0(gVar);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "appmsg";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C26988f(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C26986d)) {
            return jSONObject;
        }
        C26986d dVar = (C26986d) cVar;
        dVar.mo141106n(jSONObject, "appid", dVar.mo53865B(), z);
        dVar.mo141106n(jSONObject, "sdkver", Integer.valueOf(dVar.mo53868E()), z);
        dVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, dVar.mo53870G(), z);
        dVar.mo141106n(jSONObject, "des", dVar.mo53867D(), z);
        dVar.mo141106n(jSONObject, "username", dVar.mo53873J(), z);
        dVar.mo141106n(jSONObject, "action", dVar.mo53864A(), z);
        dVar.mo141106n(jSONObject, "type", Integer.valueOf(dVar.mo53871H()), z);
        dVar.mo141106n(jSONObject, "showtype", Integer.valueOf(dVar.mo53869F()), z);
        dVar.mo141106n(jSONObject, "content", dVar.mo53866C(), z);
        dVar.mo141106n(jSONObject, "url", dVar.mo53872I(), z);
        dVar.mo141106n(jSONObject, "appattach", dVar.mo54456U(), z);
        dVar.mo141106n(jSONObject, "sourcedisplayname", dVar.mo54457V(), z);
        dVar.mo141106n(jSONObject, "thumburl", dVar.mo54458W(), z);
        dVar.mo141106n(jSONObject, "weappinfo", dVar.mo54459X(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C26986d) || !(cVar2 instanceof C26986d)) {
            return false;
        }
        C26986d dVar = (C26986d) cVar;
        C26986d dVar2 = (C26986d) cVar2;
        return C87412m.m108589b(dVar.mo53865B(), dVar2.mo53865B()) && dVar.mo53868E() == dVar2.mo53868E() && C87412m.m108589b(dVar.mo53870G(), dVar2.mo53870G()) && C87412m.m108589b(dVar.mo53867D(), dVar2.mo53867D()) && C87412m.m108589b(dVar.mo53873J(), dVar2.mo53873J()) && C87412m.m108589b(dVar.mo53864A(), dVar2.mo53864A()) && dVar.mo53871H() == dVar2.mo53871H() && dVar.mo53869F() == dVar2.mo53869F() && C87412m.m108589b(dVar.mo53866C(), dVar2.mo53866C()) && C87412m.m108589b(dVar.mo53872I(), dVar2.mo53872I()) && dVar.mo141098c(dVar.mo54456U(), dVar2.mo54456U()) && C87412m.m108589b(dVar.mo54457V(), dVar2.mo54457V()) && C87412m.m108589b(dVar.mo54458W(), dVar2.mo54458W()) && dVar.mo141098c(dVar.mo54459X(), dVar2.mo54459X());
    }

    /* renamed from: g */
    public boolean mo53861g() {
        return true;
    }

    /* renamed from: h */
    public String mo53862h() {
        return "msg";
    }

    /* renamed from: i */
    public String mo53863i(C64054c cVar, boolean z, String str, String str2) {
        C87412m.m108594g(cVar, "serializeObj");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        StringBuilder sb = new StringBuilder();
        if (!(cVar instanceof C26986d)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C26986d dVar = (C26986d) cVar;
        dVar.mo141108p(sb, "appid", dVar.mo53865B(), z);
        dVar.mo141108p(sb, "sdkver", Integer.valueOf(dVar.mo53868E()), z);
        sb.append(">");
        C26986d dVar2 = dVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        dVar2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", dVar.mo53870G(), z2);
        dVar2.mo141109q(sb5, "des", "", dVar.mo53867D(), z2);
        dVar2.mo141109q(sb5, "username", "", dVar.mo53873J(), z2);
        dVar2.mo141109q(sb5, "action", "", dVar.mo53864A(), z2);
        dVar.mo141109q(sb5, "type", "", Integer.valueOf(dVar.mo53871H()), z2);
        C26986d dVar3 = dVar;
        dVar3.mo141109q(sb5, "showtype", "", Integer.valueOf(dVar.mo53869F()), z2);
        dVar3.mo141109q(sb5, "content", "", dVar.mo53866C(), z2);
        dVar3.mo141109q(sb5, "url", "", dVar.mo53872I(), z2);
        dVar3.mo141109q(sb5, "appattach", "", dVar.mo54456U(), z2);
        dVar3.mo141109q(sb5, "sourcedisplayname", "", dVar.mo54457V(), z2);
        dVar3.mo141109q(sb5, "thumburl", "", dVar.mo54458W(), z2);
        dVar3.mo141109q(sb5, "weappinfo", "", dVar.mo54459X(), z2);
        sb.append("</" + str + '>');
        dVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
