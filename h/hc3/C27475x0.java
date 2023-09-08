package hc3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.x0 */
public final class C27475x0 extends C101653b {
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
        if (cVar instanceof C27441w0) {
            C27441w0 w0Var = (C27441w0) cVar;
            String f = w0Var.mo141101f(str, str2);
            String y = w0Var.mo141117y(map.get('.' + f + ".topic"), w0Var.mo55114D());
            if (y != null) {
                w0Var.mo55121K(y);
            }
            Integer w = w0Var.mo141115w(map.get('.' + f + ".topicType"), Integer.valueOf(w0Var.mo55117G()));
            if (w != null) {
                w0Var.mo55124N(w.intValue());
            }
            String y2 = w0Var.mo141117y(map.get('.' + f + ".iconUrl"), w0Var.mo55112B());
            if (y2 != null) {
                w0Var.mo55119I(y2);
            }
            String y3 = w0Var.mo141117y(map.get('.' + f + ".desc"), w0Var.mo55111A());
            if (y3 != null) {
                w0Var.mo55118H(y3);
            }
            String y4 = w0Var.mo141117y(map.get('.' + f + ".patMusicId"), w0Var.mo55113C());
            if (y4 != null) {
                w0Var.mo55120J(y4);
            }
            if (map.containsKey('.' + f + ".location")) {
                C27421t0 t0Var = new C27421t0();
                w0Var.mo141105m(t0Var, map, FirebaseAnalytics.C113379b.LOCATION, f);
                w0Var.mo55123M(t0Var);
            }
            if (map.containsKey('.' + f + ".event")) {
                C27403q0 q0Var = new C27403q0();
                w0Var.mo141105m(q0Var, map, "event", f);
                w0Var.mo55122L(q0Var);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderTopicShareItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27476y0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27441w0)) {
            return jSONObject;
        }
        C27441w0 w0Var = (C27441w0) cVar;
        w0Var.mo141106n(jSONObject, "topic", w0Var.mo55114D(), z);
        w0Var.mo141106n(jSONObject, "topicType", Integer.valueOf(w0Var.mo55117G()), z);
        w0Var.mo141106n(jSONObject, "iconUrl", w0Var.mo55112B(), z);
        w0Var.mo141106n(jSONObject, "desc", w0Var.mo55111A(), z);
        w0Var.mo141106n(jSONObject, "patMusicId", w0Var.mo55113C(), z);
        w0Var.mo141106n(jSONObject, FirebaseAnalytics.C113379b.LOCATION, w0Var.mo55116F(), z);
        w0Var.mo141106n(jSONObject, "event", w0Var.mo55115E(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27441w0) || !(cVar2 instanceof C27441w0)) {
            return false;
        }
        C27441w0 w0Var = (C27441w0) cVar;
        C27441w0 w0Var2 = (C27441w0) cVar2;
        return C87412m.m108589b(w0Var.mo55114D(), w0Var2.mo55114D()) && w0Var.mo55117G() == w0Var2.mo55117G() && C87412m.m108589b(w0Var.mo55112B(), w0Var2.mo55112B()) && C87412m.m108589b(w0Var.mo55111A(), w0Var2.mo55111A()) && C87412m.m108589b(w0Var.mo55113C(), w0Var2.mo55113C()) && w0Var.mo141098c(w0Var.mo55116F(), w0Var2.mo55116F()) && w0Var.mo141098c(w0Var.mo55115E(), w0Var2.mo55115E());
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
        if (!(cVar instanceof C27441w0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27441w0 w0Var = (C27441w0) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        w0Var.mo141109q(sb5, "topic", "", w0Var.mo55114D(), z2);
        C27441w0 w0Var2 = w0Var;
        w0Var2.mo141109q(sb5, "topicType", "", Integer.valueOf(w0Var.mo55117G()), z2);
        w0Var2.mo141109q(sb5, "iconUrl", "", w0Var.mo55112B(), z2);
        w0Var2.mo141109q(sb5, "desc", "", w0Var.mo55111A(), z2);
        w0Var2.mo141109q(sb5, "patMusicId", "", w0Var.mo55113C(), z2);
        w0Var2.mo141109q(sb5, FirebaseAnalytics.C113379b.LOCATION, "", w0Var.mo55116F(), z2);
        w0Var2.mo141109q(sb5, "event", "", w0Var.mo55115E(), z2);
        sb.append("</" + str + '>');
        w0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
