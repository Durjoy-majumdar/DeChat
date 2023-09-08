package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.t */
public final class C98372t extends C101653b {
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
        if (cVar instanceof C98370s) {
            C98370s sVar = (C98370s) cVar;
            String f = sVar.mo141101f(str, str2);
            String y = sVar.mo141117y(map.get('.' + f + ".cardId"), sVar.mo55095A());
            if (y != null) {
                sVar.mo55103I(y);
            }
            String y2 = sVar.mo141117y(map.get('.' + f + ".title"), sVar.mo55102H());
            if (y2 != null) {
                sVar.mo55110P(y2);
            }
            String y3 = sVar.mo141117y(map.get('.' + f + ".secondTitle"), sVar.mo55101G());
            if (y3 != null) {
                sVar.mo55109O(y3);
            }
            String y4 = sVar.mo141117y(map.get('.' + f + ".iconUrl"), sVar.mo55097C());
            if (y4 != null) {
                sVar.mo55105K(y4);
            }
            String y5 = sVar.mo141117y(map.get('.' + f + ".iconUrl_1"), sVar.mo55098D());
            if (y5 != null) {
                sVar.mo55106L(y5);
            }
            String y6 = sVar.mo141117y(map.get('.' + f + ".iconUrl_2"), sVar.mo55099E());
            if (y6 != null) {
                sVar.mo55107M(y6);
            }
            String y7 = sVar.mo141117y(map.get('.' + f + ".iconUrl_3"), sVar.mo55100F());
            if (y7 != null) {
                sVar.mo55108N(y7);
            }
            String y8 = sVar.mo141117y(map.get('.' + f + ".cardbuffer"), sVar.mo55096B());
            if (y8 != null) {
                sVar.mo55104J(y8);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderContentColumnSharedItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27427u(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98370s)) {
            return jSONObject;
        }
        C98370s sVar = (C98370s) cVar;
        sVar.mo141106n(jSONObject, "cardId", sVar.mo55095A(), z);
        sVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, sVar.mo55102H(), z);
        sVar.mo141106n(jSONObject, "secondTitle", sVar.mo55101G(), z);
        sVar.mo141106n(jSONObject, "iconUrl", sVar.mo55097C(), z);
        sVar.mo141106n(jSONObject, "iconUrl_1", sVar.mo55098D(), z);
        sVar.mo141106n(jSONObject, "iconUrl_2", sVar.mo55099E(), z);
        sVar.mo141106n(jSONObject, "iconUrl_3", sVar.mo55100F(), z);
        sVar.mo141106n(jSONObject, "cardbuffer", sVar.mo55096B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98370s) || !(cVar2 instanceof C98370s)) {
            return false;
        }
        C98370s sVar = (C98370s) cVar;
        C98370s sVar2 = (C98370s) cVar2;
        return C87412m.m108589b(sVar.mo55095A(), sVar2.mo55095A()) && C87412m.m108589b(sVar.mo55102H(), sVar2.mo55102H()) && C87412m.m108589b(sVar.mo55101G(), sVar2.mo55101G()) && C87412m.m108589b(sVar.mo55097C(), sVar2.mo55097C()) && C87412m.m108589b(sVar.mo55098D(), sVar2.mo55098D()) && C87412m.m108589b(sVar.mo55099E(), sVar2.mo55099E()) && C87412m.m108589b(sVar.mo55100F(), sVar2.mo55100F()) && C87412m.m108589b(sVar.mo55096B(), sVar2.mo55096B());
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
        if (!(cVar instanceof C98370s)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98370s sVar = (C98370s) cVar;
        C98370s sVar2 = sVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        sVar2.mo141109q(sb5, "cardId", "", sVar.mo55095A(), z2);
        sVar2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", sVar.mo55102H(), z2);
        sVar2.mo141109q(sb5, "secondTitle", "", sVar.mo55101G(), z2);
        sVar2.mo141109q(sb5, "iconUrl", "", sVar.mo55097C(), z2);
        sVar2.mo141109q(sb5, "iconUrl_1", "", sVar.mo55098D(), z2);
        sVar2.mo141109q(sb5, "iconUrl_2", "", sVar.mo55099E(), z2);
        sVar2.mo141109q(sb5, "iconUrl_3", "", sVar.mo55100F(), z2);
        sVar2.mo141109q(sb5, "cardbuffer", "", sVar.mo55096B(), z2);
        sb.append("</" + str + '>');
        sVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
