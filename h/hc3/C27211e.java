package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.e */
public final class C27211e extends C101653b {
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
        if (cVar instanceof C98343d) {
            C98343d dVar = (C98343d) cVar;
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
            String y8 = dVar.mo141117y(map.get('.' + f + ".recorditem"), dVar.mo54768U());
            if (y8 != null) {
                dVar.mo54769V(y8);
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
        return new C27226f(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98343d)) {
            return jSONObject;
        }
        C98343d dVar = (C98343d) cVar;
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
        dVar.mo141106n(jSONObject, "recorditem", dVar.mo54768U(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98343d) || !(cVar2 instanceof C98343d)) {
            return false;
        }
        C98343d dVar = (C98343d) cVar;
        C98343d dVar2 = (C98343d) cVar2;
        return C87412m.m108589b(dVar.mo53865B(), dVar2.mo53865B()) && dVar.mo53868E() == dVar2.mo53868E() && C87412m.m108589b(dVar.mo53870G(), dVar2.mo53870G()) && C87412m.m108589b(dVar.mo53867D(), dVar2.mo53867D()) && C87412m.m108589b(dVar.mo53873J(), dVar2.mo53873J()) && C87412m.m108589b(dVar.mo53864A(), dVar2.mo53864A()) && dVar.mo53871H() == dVar2.mo53871H() && dVar.mo53869F() == dVar2.mo53869F() && C87412m.m108589b(dVar.mo53866C(), dVar2.mo53866C()) && C87412m.m108589b(dVar.mo53872I(), dVar2.mo53872I()) && C87412m.m108589b(dVar.mo54768U(), dVar2.mo54768U());
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
        if (!(cVar instanceof C98343d)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C98343d dVar = (C98343d) cVar;
        dVar.mo141108p(sb, "appid", dVar.mo53865B(), z);
        dVar.mo141108p(sb, "sdkver", Integer.valueOf(dVar.mo53868E()), z);
        sb.append(">");
        C98343d dVar2 = dVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        dVar2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", dVar.mo53870G(), z2);
        dVar2.mo141109q(sb5, "des", "", dVar.mo53867D(), z2);
        dVar2.mo141109q(sb5, "username", "", dVar.mo53873J(), z2);
        dVar2.mo141109q(sb5, "action", "", dVar.mo53864A(), z2);
        dVar.mo141109q(sb5, "type", "", Integer.valueOf(dVar.mo53871H()), z2);
        C98343d dVar3 = dVar;
        dVar3.mo141109q(sb5, "showtype", "", Integer.valueOf(dVar.mo53869F()), z2);
        dVar3.mo141109q(sb5, "content", "", dVar.mo53866C(), z2);
        dVar3.mo141109q(sb5, "url", "", dVar.mo53872I(), z2);
        dVar3.mo141109q(sb5, "recorditem", "", dVar.mo54768U(), z2);
        sb.append("</" + str + '>');
        dVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
