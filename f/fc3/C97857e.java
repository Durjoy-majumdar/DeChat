package fc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: fc3.e */
public final class C97857e extends C101653b {
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
        if (cVar instanceof C97856d) {
            C97856d dVar = (C97856d) cVar;
            String f = dVar.mo141101f(str, str2);
            String y = dVar.mo141117y(map.get('.' + f + ".title"), dVar.mo54571F());
            if (y != null) {
                dVar.mo54577L(y);
            }
            String y2 = dVar.mo141117y(map.get('.' + f + ".desc"), dVar.mo54568C());
            if (y2 != null) {
                dVar.mo54574I(y2);
            }
            String y3 = dVar.mo141117y(map.get('.' + f + ".cdnthumburl"), dVar.mo54567B());
            if (y3 != null) {
                dVar.mo54573H(y3);
            }
            String y4 = dVar.mo141117y(map.get('.' + f + ".cdnthumbkey"), dVar.mo54566A());
            if (y4 != null) {
                dVar.mo54572G(y4);
            }
            String y5 = dVar.mo141117y(map.get('.' + f + ".thumbfullmd5"), dVar.mo54569D());
            if (y5 != null) {
                dVar.mo54575J(y5);
            }
            Long x = dVar.mo141116x(map.get('.' + f + ".thumbsize"), Long.valueOf(dVar.mo54570E()));
            if (x != null) {
                dVar.mo54576K(x.longValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "BaseMediaContentInfoItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27068f(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C97856d)) {
            return jSONObject;
        }
        C97856d dVar = (C97856d) cVar;
        dVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, dVar.mo54571F(), z);
        dVar.mo141106n(jSONObject, "desc", dVar.mo54568C(), z);
        dVar.mo141106n(jSONObject, "cdnthumburl", dVar.mo54567B(), z);
        dVar.mo141106n(jSONObject, "cdnthumbkey", dVar.mo54566A(), z);
        dVar.mo141106n(jSONObject, "thumbfullmd5", dVar.mo54569D(), z);
        dVar.mo141106n(jSONObject, "thumbsize", Long.valueOf(dVar.mo54570E()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C97856d) || !(cVar2 instanceof C97856d)) {
            return false;
        }
        C97856d dVar = (C97856d) cVar;
        C97856d dVar2 = (C97856d) cVar2;
        return C87412m.m108589b(dVar.mo54571F(), dVar2.mo54571F()) && C87412m.m108589b(dVar.mo54568C(), dVar2.mo54568C()) && C87412m.m108589b(dVar.mo54567B(), dVar2.mo54567B()) && C87412m.m108589b(dVar.mo54566A(), dVar2.mo54566A()) && C87412m.m108589b(dVar.mo54569D(), dVar2.mo54569D()) && dVar.mo54570E() == dVar2.mo54570E();
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
        if (!(cVar instanceof C97856d)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C97856d dVar = (C97856d) cVar;
        C97856d dVar2 = dVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        dVar2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", dVar.mo54571F(), z2);
        dVar2.mo141109q(sb5, "desc", "", dVar.mo54568C(), z2);
        dVar2.mo141109q(sb5, "cdnthumburl", "", dVar.mo54567B(), z2);
        dVar2.mo141109q(sb5, "cdnthumbkey", "", dVar.mo54566A(), z2);
        dVar2.mo141109q(sb5, "thumbfullmd5", "", dVar.mo54569D(), z2);
        dVar.mo141109q(sb, "thumbsize", "", Long.valueOf(dVar.mo54570E()), z2);
        sb.append("</" + str + '>');
        dVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
