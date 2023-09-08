package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.p1 */
public final class C98367p1 extends C101653b {
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
        if (cVar instanceof C98365o1) {
            C98365o1 o1Var = (C98365o1) cVar;
            String f = o1Var.mo141101f(str, str2);
            Integer w = o1Var.mo141115w(map.get('.' + f + ".$type"), Integer.valueOf(o1Var.mo55069E()));
            if (w != null) {
                o1Var.mo55074J(w.intValue());
            }
            String y = o1Var.mo141117y(map.get('.' + f + ".title"), o1Var.mo55068D());
            if (y != null) {
                o1Var.mo55073I(y);
            }
            String y2 = o1Var.mo141117y(map.get('.' + f + ".desc"), o1Var.mo55065A());
            if (y2 != null) {
                o1Var.mo55070F(y2);
            }
            String y3 = o1Var.mo141117y(map.get('.' + f + ".thumburl"), o1Var.mo55067C());
            if (y3 != null) {
                o1Var.mo55072H(y3);
            }
            String y4 = o1Var.mo141117y(map.get('.' + f + ".productinfo"), o1Var.mo55066B());
            if (y4 != null) {
                o1Var.mo55071G(y4);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordProductItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27404q1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98365o1)) {
            return jSONObject;
        }
        C98365o1 o1Var = (C98365o1) cVar;
        o1Var.mo141106n(jSONObject, "type", Integer.valueOf(o1Var.mo55069E()), z);
        o1Var.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, o1Var.mo55068D(), z);
        o1Var.mo141106n(jSONObject, "desc", o1Var.mo55065A(), z);
        o1Var.mo141106n(jSONObject, "thumburl", o1Var.mo55067C(), z);
        o1Var.mo141106n(jSONObject, "productinfo", o1Var.mo55066B(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98365o1) || !(cVar2 instanceof C98365o1)) {
            return false;
        }
        C98365o1 o1Var = (C98365o1) cVar;
        C98365o1 o1Var2 = (C98365o1) cVar2;
        return o1Var.mo55069E() == o1Var2.mo55069E() && C87412m.m108589b(o1Var.mo55068D(), o1Var2.mo55068D()) && C87412m.m108589b(o1Var.mo55065A(), o1Var2.mo55065A()) && C87412m.m108589b(o1Var.mo55067C(), o1Var2.mo55067C()) && C87412m.m108589b(o1Var.mo55066B(), o1Var2.mo55066B());
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
        if (!(cVar instanceof C98365o1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C98365o1 o1Var = (C98365o1) cVar;
        o1Var.mo141108p(sb, "type", Integer.valueOf(o1Var.mo55069E()), z);
        sb.append(">");
        C98365o1 o1Var2 = o1Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        o1Var2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", o1Var.mo55068D(), z2);
        o1Var2.mo141109q(sb5, "desc", "", o1Var.mo55065A(), z2);
        o1Var2.mo141109q(sb5, "thumburl", "", o1Var.mo55067C(), z2);
        o1Var2.mo141109q(sb5, "productinfo", "", o1Var.mo55066B(), z2);
        sb.append("</" + str + '>');
        o1Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
