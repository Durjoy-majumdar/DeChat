package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.s1 */
public final class C98371s1 extends C101653b {
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
        if (cVar instanceof C98369r1) {
            C98369r1 r1Var = (C98369r1) cVar;
            String f = r1Var.mo141101f(str, str2);
            String y = r1Var.mo141117y(map.get('.' + f + ".title"), r1Var.mo55089C());
            if (y != null) {
                r1Var.mo55093G(y);
            }
            String y2 = r1Var.mo141117y(map.get('.' + f + ".desc"), r1Var.mo55087A());
            if (y2 != null) {
                r1Var.mo55091E(y2);
            }
            String y3 = r1Var.mo141117y(map.get('.' + f + ".thumburl"), r1Var.mo55088B());
            if (y3 != null) {
                r1Var.mo55092F(y3);
            }
            String y4 = r1Var.mo141117y(map.get('.' + f + ".tvinfo"), r1Var.mo55090D());
            if (y4 != null) {
                r1Var.mo55094H(y4);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordTVItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27422t1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98369r1)) {
            return jSONObject;
        }
        C98369r1 r1Var = (C98369r1) cVar;
        r1Var.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, r1Var.mo55089C(), z);
        r1Var.mo141106n(jSONObject, "desc", r1Var.mo55087A(), z);
        r1Var.mo141106n(jSONObject, "thumburl", r1Var.mo55088B(), z);
        r1Var.mo141106n(jSONObject, "tvinfo", r1Var.mo55090D(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98369r1) || !(cVar2 instanceof C98369r1)) {
            return false;
        }
        C98369r1 r1Var = (C98369r1) cVar;
        C98369r1 r1Var2 = (C98369r1) cVar2;
        return C87412m.m108589b(r1Var.mo55089C(), r1Var2.mo55089C()) && C87412m.m108589b(r1Var.mo55087A(), r1Var2.mo55087A()) && C87412m.m108589b(r1Var.mo55088B(), r1Var2.mo55088B()) && C87412m.m108589b(r1Var.mo55090D(), r1Var2.mo55090D());
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
        if (!(cVar instanceof C98369r1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98369r1 r1Var = (C98369r1) cVar;
        C98369r1 r1Var2 = r1Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        r1Var2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", r1Var.mo55089C(), z2);
        r1Var2.mo141109q(sb5, "desc", "", r1Var.mo55087A(), z2);
        r1Var2.mo141109q(sb5, "thumburl", "", r1Var.mo55088B(), z2);
        r1Var2.mo141109q(sb5, "tvinfo", "", r1Var.mo55090D(), z2);
        sb.append("</" + str + '>');
        r1Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
