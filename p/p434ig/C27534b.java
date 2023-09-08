package p434ig;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ig.b */
public final class C27534b extends C101653b {
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
        if (cVar instanceof C98671a) {
            C98671a aVar = (C98671a) cVar;
            String f = aVar.mo141101f(str, str2);
            String y = aVar.mo141117y(map.get('.' + f + ".action"), aVar.mo53864A());
            if (y != null) {
                aVar.mo53874K(y);
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".$appid"), aVar.mo53865B());
            if (y2 != null) {
                aVar.mo53875L(y2);
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".content"), aVar.mo53866C());
            if (y3 != null) {
                aVar.mo53876M(y3);
            }
            String y4 = aVar.mo141117y(map.get('.' + f + ".des"), aVar.mo53867D());
            if (y4 != null) {
                aVar.mo53877N(y4);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".$sdkver"), Integer.valueOf(aVar.mo53868E()));
            if (w != null) {
                aVar.mo53878O(w.intValue());
            }
            Integer w2 = aVar.mo141115w(map.get('.' + f + ".showtype"), Integer.valueOf(aVar.mo53869F()));
            if (w2 != null) {
                aVar.mo53879P(w2.intValue());
            }
            String y5 = aVar.mo141117y(map.get('.' + f + ".title"), aVar.mo53870G());
            if (y5 != null) {
                aVar.mo53880Q(y5);
            }
            Integer w3 = aVar.mo141115w(map.get('.' + f + ".type"), Integer.valueOf(aVar.mo53871H()));
            if (w3 != null) {
                aVar.mo53881R(w3.intValue());
            }
            String y6 = aVar.mo141117y(map.get('.' + f + ".url"), aVar.mo53872I());
            if (y6 != null) {
                aVar.mo53882S(y6);
            }
            String y7 = aVar.mo141117y(map.get('.' + f + ".username"), aVar.mo53873J());
            if (y7 != null) {
                aVar.mo53883T(y7);
            }
            String y8 = aVar.mo141117y(map.get('.' + f + ".mediacontent"), aVar.mo55242U());
            if (y8 != null) {
                aVar.mo55243V(y8);
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
        return new C27535c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98671a)) {
            return jSONObject;
        }
        C98671a aVar = (C98671a) cVar;
        aVar.mo141106n(jSONObject, "action", aVar.mo53864A(), z);
        aVar.mo141106n(jSONObject, "appid", aVar.mo53865B(), z);
        aVar.mo141106n(jSONObject, "content", aVar.mo53866C(), z);
        aVar.mo141106n(jSONObject, "des", aVar.mo53867D(), z);
        aVar.mo141106n(jSONObject, "sdkver", Integer.valueOf(aVar.mo53868E()), z);
        aVar.mo141106n(jSONObject, "showtype", Integer.valueOf(aVar.mo53869F()), z);
        aVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, aVar.mo53870G(), z);
        aVar.mo141106n(jSONObject, "type", Integer.valueOf(aVar.mo53871H()), z);
        aVar.mo141106n(jSONObject, "url", aVar.mo53872I(), z);
        aVar.mo141106n(jSONObject, "username", aVar.mo53873J(), z);
        aVar.mo141106n(jSONObject, "mediacontent", aVar.mo55242U(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98671a) || !(cVar2 instanceof C98671a)) {
            return false;
        }
        C98671a aVar = (C98671a) cVar;
        C98671a aVar2 = (C98671a) cVar2;
        return C87412m.m108589b(aVar.mo53864A(), aVar2.mo53864A()) && C87412m.m108589b(aVar.mo53865B(), aVar2.mo53865B()) && C87412m.m108589b(aVar.mo53866C(), aVar2.mo53866C()) && C87412m.m108589b(aVar.mo53867D(), aVar2.mo53867D()) && aVar.mo53868E() == aVar2.mo53868E() && aVar.mo53869F() == aVar2.mo53869F() && C87412m.m108589b(aVar.mo53870G(), aVar2.mo53870G()) && aVar.mo53871H() == aVar2.mo53871H() && C87412m.m108589b(aVar.mo53872I(), aVar2.mo53872I()) && C87412m.m108589b(aVar.mo53873J(), aVar2.mo53873J()) && C87412m.m108589b(aVar.mo55242U(), aVar2.mo55242U());
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
        if (!(cVar instanceof C98671a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C98671a aVar = (C98671a) cVar;
        aVar.mo141108p(sb, "appid", aVar.mo53865B(), z);
        aVar.mo141108p(sb, "sdkver", Integer.valueOf(aVar.mo53868E()), z);
        sb.append(">");
        C98671a aVar2 = aVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        aVar2.mo141109q(sb5, "action", "", aVar.mo53864A(), z2);
        aVar2.mo141109q(sb5, "content", "", aVar.mo53866C(), z2);
        aVar2.mo141109q(sb5, "des", "", aVar.mo53867D(), z2);
        C98671a aVar3 = aVar;
        aVar3.mo141109q(sb5, "showtype", "", Integer.valueOf(aVar.mo53869F()), z2);
        aVar3.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", aVar.mo53870G(), z2);
        C98671a aVar4 = aVar;
        aVar4.mo141109q(sb5, "type", "", Integer.valueOf(aVar.mo53871H()), z2);
        aVar4.mo141109q(sb5, "url", "", aVar.mo53872I(), z2);
        aVar4.mo141109q(sb5, "username", "", aVar.mo53873J(), z2);
        aVar4.mo141109q(sb5, "mediacontent", "", aVar.mo55242U(), z2);
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
