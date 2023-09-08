package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.r0 */
public final class C27414r0 extends C101653b {
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
        if (cVar instanceof C27403q0) {
            C27403q0 q0Var = (C27403q0) cVar;
            String f = q0Var.mo141101f(str, str2);
            String y = q0Var.mo141117y(map.get('.' + f + ".topicId"), q0Var.mo55059E());
            if (y != null) {
                q0Var.mo55064J(y);
            }
            String y2 = q0Var.mo141117y(map.get('.' + f + ".name"), q0Var.mo55057C());
            if (y2 != null) {
                q0Var.mo55062H(y2);
            }
            String y3 = q0Var.mo141117y(map.get('.' + f + ".creatorNickName"), q0Var.mo55055A());
            if (y3 != null) {
                q0Var.mo55060F(y3);
            }
            Long x = q0Var.mo141116x(map.get('.' + f + ".hiddenMark"), Long.valueOf(q0Var.mo55056B()));
            if (x != null) {
                q0Var.mo55061G(x.longValue());
            }
            String y4 = q0Var.mo141117y(map.get('.' + f + ".title"), q0Var.mo55058D());
            if (y4 != null) {
                q0Var.mo55063I(y4);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderTopicEventItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27415s0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27403q0)) {
            return jSONObject;
        }
        C27403q0 q0Var = (C27403q0) cVar;
        q0Var.mo141106n(jSONObject, "topicId", q0Var.mo55059E(), z);
        q0Var.mo141106n(jSONObject, "name", q0Var.mo55057C(), z);
        q0Var.mo141106n(jSONObject, "creatorNickName", q0Var.mo55055A(), z);
        q0Var.mo141106n(jSONObject, "hiddenMark", Long.valueOf(q0Var.mo55056B()), z);
        q0Var.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, q0Var.mo55058D(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27403q0) || !(cVar2 instanceof C27403q0)) {
            return false;
        }
        C27403q0 q0Var = (C27403q0) cVar;
        C27403q0 q0Var2 = (C27403q0) cVar2;
        return C87412m.m108589b(q0Var.mo55059E(), q0Var2.mo55059E()) && C87412m.m108589b(q0Var.mo55057C(), q0Var2.mo55057C()) && C87412m.m108589b(q0Var.mo55055A(), q0Var2.mo55055A()) && q0Var.mo55056B() == q0Var2.mo55056B() && C87412m.m108589b(q0Var.mo55058D(), q0Var2.mo55058D());
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
        if (!(cVar instanceof C27403q0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27403q0 q0Var = (C27403q0) cVar;
        C27403q0 q0Var2 = q0Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        q0Var2.mo141109q(sb5, "topicId", "", q0Var.mo55059E(), z2);
        q0Var2.mo141109q(sb5, "name", "", q0Var.mo55057C(), z2);
        q0Var2.mo141109q(sb5, "creatorNickName", "", q0Var.mo55055A(), z2);
        C27403q0 q0Var3 = q0Var;
        StringBuilder sb6 = sb;
        q0Var3.mo141109q(sb6, "hiddenMark", "", Long.valueOf(q0Var.mo55056B()), z2);
        q0Var3.mo141109q(sb6, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", q0Var.mo55058D(), z2);
        sb.append("</" + str + '>');
        q0Var.mo141110r(sb, str2);
        String sb7 = sb.toString();
        C87412m.m108593f(sb7, "xmlBuilder.toString()");
        return sb7;
    }
}
