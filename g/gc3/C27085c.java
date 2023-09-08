package gc3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.c */
public final class C27085c extends C101653b {
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
        if (cVar instanceof C27084b) {
            C27084b bVar = (C27084b) cVar;
            String f = bVar.mo141101f(str, str2);
            Integer w = bVar.mo141115w(map.get('.' + f + ".cf"), Integer.valueOf(bVar.mo54616A()));
            if (w != null) {
                bVar.mo54619D(w.intValue());
            }
            Integer w2 = bVar.mo141115w(map.get('.' + f + ".fr"), Integer.valueOf(bVar.mo54617B()));
            if (w2 != null) {
                bVar.mo54620E(w2.intValue());
            }
            String y = bVar.mo141117y(map.get('.' + f + ".inlenlist"), bVar.mo54618C());
            if (y != null) {
                bVar.mo54621F(y);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "alnode";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27086d(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27084b)) {
            return jSONObject;
        }
        C27084b bVar = (C27084b) cVar;
        bVar.mo141106n(jSONObject, "cf", Integer.valueOf(bVar.mo54616A()), z);
        bVar.mo141106n(jSONObject, LocaleUtil.FRENCH, Integer.valueOf(bVar.mo54617B()), z);
        bVar.mo141106n(jSONObject, "inlenlist", bVar.mo54618C(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27084b) || !(cVar2 instanceof C27084b)) {
            return false;
        }
        C27084b bVar = (C27084b) cVar;
        C27084b bVar2 = (C27084b) cVar2;
        return bVar.mo54616A() == bVar2.mo54616A() && bVar.mo54617B() == bVar2.mo54617B() && C87412m.m108589b(bVar.mo54618C(), bVar2.mo54618C());
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
        if (!(cVar instanceof C27084b)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27084b bVar = (C27084b) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        bVar.mo141109q(sb5, "cf", "", Integer.valueOf(bVar.mo54616A()), z2);
        C27084b bVar2 = bVar;
        bVar2.mo141109q(sb5, LocaleUtil.FRENCH, "", Integer.valueOf(bVar.mo54617B()), z2);
        bVar2.mo141109q(sb5, "inlenlist", "", bVar.mo54618C(), z2);
        sb.append("</" + str + '>');
        bVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
