package cc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: cc3.k */
public final class C26857k extends C101653b {
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
        if (cVar instanceof C26856j) {
            C26856j jVar = (C26856j) cVar;
            String f = jVar.mo141101f(str, str2);
            String y = jVar.mo141117y(map.get('.' + f + ".$appid"), jVar.mo53865B());
            if (y != null) {
                jVar.mo53875L(y);
            }
            Integer w = jVar.mo141115w(map.get('.' + f + ".$sdkver"), Integer.valueOf(jVar.mo53868E()));
            if (w != null) {
                jVar.mo53878O(w.intValue());
            }
            String y2 = jVar.mo141117y(map.get('.' + f + ".title"), jVar.mo53870G());
            if (y2 != null) {
                jVar.mo53880Q(y2);
            }
            String y3 = jVar.mo141117y(map.get('.' + f + ".des"), jVar.mo53867D());
            if (y3 != null) {
                jVar.mo53877N(y3);
            }
            String y4 = jVar.mo141117y(map.get('.' + f + ".username"), jVar.mo53873J());
            if (y4 != null) {
                jVar.mo53883T(y4);
            }
            String y5 = jVar.mo141117y(map.get('.' + f + ".action"), jVar.mo53864A());
            if (y5 != null) {
                jVar.mo53874K(y5);
            }
            Integer w2 = jVar.mo141115w(map.get('.' + f + ".type"), Integer.valueOf(jVar.mo53871H()));
            if (w2 != null) {
                jVar.mo53881R(w2.intValue());
            }
            Integer w3 = jVar.mo141115w(map.get('.' + f + ".showtype"), Integer.valueOf(jVar.mo53869F()));
            if (w3 != null) {
                jVar.mo53879P(w3.intValue());
            }
            String y6 = jVar.mo141117y(map.get('.' + f + ".content"), jVar.mo53866C());
            if (y6 != null) {
                jVar.mo53876M(y6);
            }
            String y7 = jVar.mo141117y(map.get('.' + f + ".url"), jVar.mo53872I());
            if (y7 != null) {
                jVar.mo53882S(y7);
            }
            if (map.containsKey('.' + f + ".appattach")) {
                C26848g gVar = new C26848g();
                jVar.mo141105m(gVar, map, "appattach", f);
                jVar.mo53889W(gVar);
            }
            String y8 = jVar.mo141117y(map.get('.' + f + ".thumburl"), jVar.mo53888V());
            if (y8 != null) {
                jVar.mo53890X(y8);
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
        return new C26858l(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C26856j)) {
            return jSONObject;
        }
        C26856j jVar = (C26856j) cVar;
        jVar.mo141106n(jSONObject, "appid", jVar.mo53865B(), z);
        jVar.mo141106n(jSONObject, "sdkver", Integer.valueOf(jVar.mo53868E()), z);
        jVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, jVar.mo53870G(), z);
        jVar.mo141106n(jSONObject, "des", jVar.mo53867D(), z);
        jVar.mo141106n(jSONObject, "username", jVar.mo53873J(), z);
        jVar.mo141106n(jSONObject, "action", jVar.mo53864A(), z);
        jVar.mo141106n(jSONObject, "type", Integer.valueOf(jVar.mo53871H()), z);
        jVar.mo141106n(jSONObject, "showtype", Integer.valueOf(jVar.mo53869F()), z);
        jVar.mo141106n(jSONObject, "content", jVar.mo53866C(), z);
        jVar.mo141106n(jSONObject, "url", jVar.mo53872I(), z);
        jVar.mo141106n(jSONObject, "appattach", jVar.mo53887U(), z);
        jVar.mo141106n(jSONObject, "thumburl", jVar.mo53888V(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C26856j) || !(cVar2 instanceof C26856j)) {
            return false;
        }
        C26856j jVar = (C26856j) cVar;
        C26856j jVar2 = (C26856j) cVar2;
        return C87412m.m108589b(jVar.mo53865B(), jVar2.mo53865B()) && jVar.mo53868E() == jVar2.mo53868E() && C87412m.m108589b(jVar.mo53870G(), jVar2.mo53870G()) && C87412m.m108589b(jVar.mo53867D(), jVar2.mo53867D()) && C87412m.m108589b(jVar.mo53873J(), jVar2.mo53873J()) && C87412m.m108589b(jVar.mo53864A(), jVar2.mo53864A()) && jVar.mo53871H() == jVar2.mo53871H() && jVar.mo53869F() == jVar2.mo53869F() && C87412m.m108589b(jVar.mo53866C(), jVar2.mo53866C()) && C87412m.m108589b(jVar.mo53872I(), jVar2.mo53872I()) && jVar.mo141098c(jVar.mo53887U(), jVar2.mo53887U()) && C87412m.m108589b(jVar.mo53888V(), jVar2.mo53888V());
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
        if (!(cVar instanceof C26856j)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C26856j jVar = (C26856j) cVar;
        jVar.mo141108p(sb, "appid", jVar.mo53865B(), z);
        jVar.mo141108p(sb, "sdkver", Integer.valueOf(jVar.mo53868E()), z);
        sb.append(">");
        C26856j jVar2 = jVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        jVar2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", jVar.mo53870G(), z2);
        jVar2.mo141109q(sb5, "des", "", jVar.mo53867D(), z2);
        jVar2.mo141109q(sb5, "username", "", jVar.mo53873J(), z2);
        jVar2.mo141109q(sb5, "action", "", jVar.mo53864A(), z2);
        jVar.mo141109q(sb5, "type", "", Integer.valueOf(jVar.mo53871H()), z2);
        C26856j jVar3 = jVar;
        jVar3.mo141109q(sb5, "showtype", "", Integer.valueOf(jVar.mo53869F()), z2);
        jVar3.mo141109q(sb5, "content", "", jVar.mo53866C(), z2);
        jVar3.mo141109q(sb5, "url", "", jVar.mo53872I(), z2);
        jVar3.mo141109q(sb5, "appattach", "", jVar.mo53887U(), z2);
        jVar3.mo141109q(sb5, "thumburl", "", jVar.mo53888V(), z2);
        sb.append("</" + str + '>');
        jVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
