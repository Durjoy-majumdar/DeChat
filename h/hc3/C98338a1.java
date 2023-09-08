package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.a1 */
public final class C98338a1 extends C101653b {
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
        if (cVar instanceof C98381z0) {
            C98381z0 z0Var = (C98381z0) cVar;
            String f = z0Var.mo141101f(str, str2);
            String y = z0Var.mo141117y(map.get('.' + f + ".title"), z0Var.mo54571F());
            if (y != null) {
                z0Var.mo54577L(y);
            }
            String y2 = z0Var.mo141117y(map.get('.' + f + ".desc"), z0Var.mo54568C());
            if (y2 != null) {
                z0Var.mo54574I(y2);
            }
            String y3 = z0Var.mo141117y(map.get('.' + f + ".cdnthumburl"), z0Var.mo54567B());
            if (y3 != null) {
                z0Var.mo54573H(y3);
            }
            String y4 = z0Var.mo141117y(map.get('.' + f + ".cdnthumbkey"), z0Var.mo54566A());
            if (y4 != null) {
                z0Var.mo54572G(y4);
            }
            String y5 = z0Var.mo141117y(map.get('.' + f + ".thumbfullmd5"), z0Var.mo54569D());
            if (y5 != null) {
                z0Var.mo54575J(y5);
            }
            Long x = z0Var.mo141116x(map.get('.' + f + ".thumbsize"), Long.valueOf(z0Var.mo54570E()));
            if (x != null) {
                z0Var.mo54576K(x.longValue());
            }
            if (map.containsKey('.' + f + ".noteinfo")) {
                C98361l1 l1Var = new C98361l1();
                z0Var.mo141105m(l1Var, map, "noteinfo", f);
                z0Var.mo54712Z(l1Var);
            }
            ArrayList arrayList = new ArrayList();
            z0Var.mo141107o(arrayList, C27313m.class, map, f + ".datalist", "dataitem");
            if (arrayList.size() > 0) {
                z0Var.mo54707U(arrayList);
            }
            String y6 = z0Var.mo141117y(map.get('.' + f + ".favusername"), z0Var.mo54703Q());
            if (y6 != null) {
                z0Var.mo54711Y(y6);
            }
            String y7 = z0Var.mo141117y(map.get('.' + f + ".favcreatetime"), z0Var.mo54702P());
            if (y7 != null) {
                z0Var.mo54710X(y7);
            }
            Long x2 = z0Var.mo141116x(map.get('.' + f + ".edittime"), Long.valueOf(z0Var.mo54700N()));
            if (x2 != null) {
                z0Var.mo54708V(x2.longValue());
            }
            String y8 = z0Var.mo141117y(map.get('.' + f + ".editusr"), z0Var.mo54701O());
            if (y8 != null) {
                z0Var.mo54709W(y8);
            }
            Integer w = z0Var.mo141115w(map.get('.' + f + ".isChatRoom"), Integer.valueOf(z0Var.mo54705S()));
            if (w != null) {
                z0Var.mo54706T(w.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "recordinfo";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27181b1(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98381z0)) {
            return jSONObject;
        }
        C98381z0 z0Var = (C98381z0) cVar;
        z0Var.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, z0Var.mo54571F(), z);
        z0Var.mo141106n(jSONObject, "desc", z0Var.mo54568C(), z);
        z0Var.mo141106n(jSONObject, "cdnthumburl", z0Var.mo54567B(), z);
        z0Var.mo141106n(jSONObject, "cdnthumbkey", z0Var.mo54566A(), z);
        z0Var.mo141106n(jSONObject, "thumbfullmd5", z0Var.mo54569D(), z);
        z0Var.mo141106n(jSONObject, "thumbsize", Long.valueOf(z0Var.mo54570E()), z);
        z0Var.mo141106n(jSONObject, "noteinfo", z0Var.mo54704R(), z);
        z0Var.mo141106n(jSONObject, "datalist", z0Var.mo54699M(), z);
        z0Var.mo141106n(jSONObject, "favusername", z0Var.mo54703Q(), z);
        z0Var.mo141106n(jSONObject, "favcreatetime", z0Var.mo54702P(), z);
        z0Var.mo141106n(jSONObject, "edittime", Long.valueOf(z0Var.mo54700N()), z);
        z0Var.mo141106n(jSONObject, "editusr", z0Var.mo54701O(), z);
        z0Var.mo141106n(jSONObject, "isChatRoom", Integer.valueOf(z0Var.mo54705S()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98381z0) || !(cVar2 instanceof C98381z0)) {
            return false;
        }
        C98381z0 z0Var = (C98381z0) cVar;
        C98381z0 z0Var2 = (C98381z0) cVar2;
        return C87412m.m108589b(z0Var.mo54571F(), z0Var2.mo54571F()) && C87412m.m108589b(z0Var.mo54568C(), z0Var2.mo54568C()) && C87412m.m108589b(z0Var.mo54567B(), z0Var2.mo54567B()) && C87412m.m108589b(z0Var.mo54566A(), z0Var2.mo54566A()) && C87412m.m108589b(z0Var.mo54569D(), z0Var2.mo54569D()) && z0Var.mo54570E() == z0Var2.mo54570E() && z0Var.mo141098c(z0Var.mo54704R(), z0Var2.mo54704R()) && z0Var.mo141097b(z0Var.mo54699M(), z0Var2.mo54699M(), C27313m.class) && C87412m.m108589b(z0Var.mo54703Q(), z0Var2.mo54703Q()) && C87412m.m108589b(z0Var.mo54702P(), z0Var2.mo54702P()) && z0Var.mo54700N() == z0Var2.mo54700N() && C87412m.m108589b(z0Var.mo54701O(), z0Var2.mo54701O()) && z0Var.mo54705S() == z0Var2.mo54705S();
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
        if (!(cVar instanceof C98381z0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98381z0 z0Var = (C98381z0) cVar;
        C98381z0 z0Var2 = z0Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        z0Var2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", z0Var.mo54571F(), z2);
        z0Var2.mo141109q(sb5, "desc", "", z0Var.mo54568C(), z2);
        z0Var2.mo141109q(sb5, "cdnthumburl", "", z0Var.mo54567B(), z2);
        z0Var2.mo141109q(sb5, "cdnthumbkey", "", z0Var.mo54566A(), z2);
        z0Var2.mo141109q(sb5, "thumbfullmd5", "", z0Var.mo54569D(), z2);
        C98381z0 z0Var3 = z0Var;
        StringBuilder sb6 = sb;
        z0Var3.mo141109q(sb6, "thumbsize", "", Long.valueOf(z0Var.mo54570E()), z2);
        z0Var3.mo141109q(sb6, "noteinfo", "", z0Var.mo54704R(), z2);
        z0Var3.mo141109q(sb6, "datalist", "dataitem", z0Var.mo54699M(), z2);
        z0Var3.mo141109q(sb6, "favusername", "", z0Var.mo54703Q(), z2);
        z0Var3.mo141109q(sb6, "favcreatetime", "", z0Var.mo54702P(), z2);
        C98381z0 z0Var4 = z0Var;
        StringBuilder sb7 = sb;
        z0Var4.mo141109q(sb7, "edittime", "", Long.valueOf(z0Var.mo54700N()), z2);
        z0Var4.mo141109q(sb7, "editusr", "", z0Var.mo54701O(), z2);
        z0Var.mo141109q(sb7, "isChatRoom", "", Integer.valueOf(z0Var.mo54705S()), z2);
        sb.append("</" + str + '>');
        z0Var.mo141110r(sb, str2);
        String sb8 = sb.toString();
        C87412m.m108593f(sb8, "xmlBuilder.toString()");
        return sb8;
    }
}
