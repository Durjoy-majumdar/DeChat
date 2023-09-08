package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.j1 */
public final class C98357j1 extends C101653b {
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
        if (cVar instanceof C98355i1) {
            C98355i1 i1Var = (C98355i1) cVar;
            String f = i1Var.mo141101f(str, str2);
            String y = i1Var.mo141117y(map.get('.' + f + ".mvObjectId"), i1Var.mo54876L());
            if (y != null) {
                i1Var.mo54890Z(y);
            }
            String y2 = i1Var.mo141117y(map.get('.' + f + ".mvNonceId"), i1Var.mo54875K());
            if (y2 != null) {
                i1Var.mo54889Y(y2);
            }
            String y3 = i1Var.mo141117y(map.get('.' + f + ".mvCoverUrl"), i1Var.mo54869E());
            if (y3 != null) {
                i1Var.mo54883S(y3);
            }
            String y4 = i1Var.mo141117y(map.get('.' + f + ".mvMakerFinderNickname"), i1Var.mo54873I());
            if (y4 != null) {
                i1Var.mo54887W(y4);
            }
            String y5 = i1Var.mo141117y(map.get('.' + f + ".mvSingerName"), i1Var.mo54878N());
            if (y5 != null) {
                i1Var.mo54892b0(y5);
            }
            String y6 = i1Var.mo141117y(map.get('.' + f + ".mvAlbumName"), i1Var.mo54868D());
            if (y6 != null) {
                i1Var.mo54882R(y6);
            }
            String y7 = i1Var.mo141117y(map.get('.' + f + ".mvMusicGenre"), i1Var.mo54874J());
            if (y7 != null) {
                i1Var.mo54888X(y7);
            }
            Long x = i1Var.mo141116x(map.get('.' + f + ".mvIssueDate"), Long.valueOf(i1Var.mo54872H()));
            if (x != null) {
                i1Var.mo54886V(x.longValue());
            }
            String y8 = i1Var.mo141117y(map.get('.' + f + ".mvIdentification"), i1Var.mo54871G());
            if (y8 != null) {
                i1Var.mo54885U(y8);
            }
            Integer w = i1Var.mo141115w(map.get('.' + f + ".musicDuration"), Integer.valueOf(i1Var.mo54867C()));
            if (w != null) {
                i1Var.mo54881Q(w.intValue());
            }
            String y9 = i1Var.mo141117y(map.get('.' + f + ".mvExtInfo"), i1Var.mo54870F());
            if (y9 != null) {
                i1Var.mo54884T(y9);
            }
            String y15 = i1Var.mo141117y(map.get('.' + f + ".mvOperationUrl"), i1Var.mo54877M());
            if (y15 != null) {
                i1Var.mo54891a0(y15);
            }
            String y16 = i1Var.mo141117y(map.get('.' + f + ".mid"), i1Var.mo54866B());
            if (y16 != null) {
                i1Var.mo54880P(y16);
            }
            String y17 = i1Var.mo141117y(map.get('.' + f + ".appIdForSourceDisplay"), i1Var.mo54865A());
            if (y17 != null) {
                i1Var.mo54879O(y17);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordMusicItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27288k1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98355i1)) {
            return jSONObject;
        }
        C98355i1 i1Var = (C98355i1) cVar;
        i1Var.mo141106n(jSONObject, "mvObjectId", i1Var.mo54876L(), z);
        i1Var.mo141106n(jSONObject, "mvNonceId", i1Var.mo54875K(), z);
        i1Var.mo141106n(jSONObject, "mvCoverUrl", i1Var.mo54869E(), z);
        i1Var.mo141106n(jSONObject, "mvMakerFinderNickname", i1Var.mo54873I(), z);
        i1Var.mo141106n(jSONObject, "mvSingerName", i1Var.mo54878N(), z);
        i1Var.mo141106n(jSONObject, "mvAlbumName", i1Var.mo54868D(), z);
        i1Var.mo141106n(jSONObject, "mvMusicGenre", i1Var.mo54874J(), z);
        i1Var.mo141106n(jSONObject, "mvIssueDate", Long.valueOf(i1Var.mo54872H()), z);
        i1Var.mo141106n(jSONObject, "mvIdentification", i1Var.mo54871G(), z);
        i1Var.mo141106n(jSONObject, "musicDuration", Integer.valueOf(i1Var.mo54867C()), z);
        i1Var.mo141106n(jSONObject, "mvExtInfo", i1Var.mo54870F(), z);
        i1Var.mo141106n(jSONObject, "mvOperationUrl", i1Var.mo54877M(), z);
        i1Var.mo141106n(jSONObject, "mid", i1Var.mo54866B(), z);
        i1Var.mo141106n(jSONObject, "appIdForSourceDisplay", i1Var.mo54865A(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98355i1) || !(cVar2 instanceof C98355i1)) {
            return false;
        }
        C98355i1 i1Var = (C98355i1) cVar;
        C98355i1 i1Var2 = (C98355i1) cVar2;
        return C87412m.m108589b(i1Var.mo54876L(), i1Var2.mo54876L()) && C87412m.m108589b(i1Var.mo54875K(), i1Var2.mo54875K()) && C87412m.m108589b(i1Var.mo54869E(), i1Var2.mo54869E()) && C87412m.m108589b(i1Var.mo54873I(), i1Var2.mo54873I()) && C87412m.m108589b(i1Var.mo54878N(), i1Var2.mo54878N()) && C87412m.m108589b(i1Var.mo54868D(), i1Var2.mo54868D()) && C87412m.m108589b(i1Var.mo54874J(), i1Var2.mo54874J()) && i1Var.mo54872H() == i1Var2.mo54872H() && C87412m.m108589b(i1Var.mo54871G(), i1Var2.mo54871G()) && i1Var.mo54867C() == i1Var2.mo54867C() && C87412m.m108589b(i1Var.mo54870F(), i1Var2.mo54870F()) && C87412m.m108589b(i1Var.mo54877M(), i1Var2.mo54877M()) && C87412m.m108589b(i1Var.mo54866B(), i1Var2.mo54866B()) && C87412m.m108589b(i1Var.mo54865A(), i1Var2.mo54865A());
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
        if (!(cVar instanceof C98355i1)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98355i1 i1Var = (C98355i1) cVar;
        C98355i1 i1Var2 = i1Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        i1Var2.mo141109q(sb5, "mvObjectId", "", i1Var.mo54876L(), z2);
        i1Var2.mo141109q(sb5, "mvNonceId", "", i1Var.mo54875K(), z2);
        i1Var2.mo141109q(sb5, "mvCoverUrl", "", i1Var.mo54869E(), z2);
        i1Var2.mo141109q(sb5, "mvMakerFinderNickname", "", i1Var.mo54873I(), z2);
        i1Var2.mo141109q(sb5, "mvSingerName", "", i1Var.mo54878N(), z2);
        i1Var2.mo141109q(sb5, "mvAlbumName", "", i1Var.mo54868D(), z2);
        i1Var2.mo141109q(sb5, "mvMusicGenre", "", i1Var.mo54874J(), z2);
        C98355i1 i1Var3 = i1Var;
        StringBuilder sb6 = sb;
        i1Var3.mo141109q(sb6, "mvIssueDate", "", Long.valueOf(i1Var.mo54872H()), z2);
        i1Var3.mo141109q(sb6, "mvIdentification", "", i1Var.mo54871G(), z2);
        C98355i1 i1Var4 = i1Var;
        i1Var4.mo141109q(sb6, "musicDuration", "", Integer.valueOf(i1Var.mo54867C()), z2);
        i1Var4.mo141109q(sb6, "mvExtInfo", "", i1Var.mo54870F(), z2);
        i1Var4.mo141109q(sb6, "mvOperationUrl", "", i1Var.mo54877M(), z2);
        i1Var4.mo141109q(sb6, "mid", "", i1Var.mo54866B(), z2);
        i1Var4.mo141109q(sb6, "appIdForSourceDisplay", "", i1Var.mo54865A(), z2);
        sb.append("</" + str + '>');
        i1Var.mo141110r(sb, str2);
        String sb7 = sb.toString();
        C87412m.m108593f(sb7, "xmlBuilder.toString()");
        return sb7;
    }
}
