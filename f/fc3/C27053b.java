package fc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: fc3.b */
public final class C27053b extends C101653b {
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
        if (cVar instanceof C27052a) {
            C27052a aVar = (C27052a) cVar;
            String f = aVar.mo141101f(str, str2);
            String y = aVar.mo141117y(map.get('.' + f + ".datatitle"), aVar.mo54548I());
            if (y != null) {
                aVar.mo54561V(y);
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".datadesc"), aVar.mo54544E());
            if (y2 != null) {
                aVar.mo54557R(y2);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".$datatype"), Integer.valueOf(aVar.mo54549J()));
            if (w != null) {
                aVar.mo54562W(w.intValue());
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".$dataid"), aVar.mo54546G());
            if (y3 != null) {
                aVar.mo54559T(y3);
            }
            String y4 = aVar.mo141117y(map.get('.' + f + ".cdnthumburl"), aVar.mo54543D());
            if (y4 != null) {
                aVar.mo54556Q(y4);
            }
            String y5 = aVar.mo141117y(map.get('.' + f + ".cdnthumbkey"), aVar.mo54542C());
            if (y5 != null) {
                aVar.mo54555P(y5);
            }
            String y6 = aVar.mo141117y(map.get('.' + f + ".thumbfullmd5"), aVar.mo54551L());
            if (y6 != null) {
                aVar.mo54564Y(y6);
            }
            Long x = aVar.mo141116x(map.get('.' + f + ".thumbsize"), Long.valueOf(aVar.mo54552M()));
            if (x != null) {
                aVar.mo54565Z(x.longValue());
            }
            String y7 = aVar.mo141117y(map.get('.' + f + ".cdndataurl"), aVar.mo54541B());
            if (y7 != null) {
                aVar.mo54554O(y7);
            }
            String y8 = aVar.mo141117y(map.get('.' + f + ".cdndatakey"), aVar.mo54540A());
            if (y8 != null) {
                aVar.mo54553N(y8);
            }
            String y9 = aVar.mo141117y(map.get('.' + f + ".fullmd5"), aVar.mo54550K());
            if (y9 != null) {
                aVar.mo54563X(y9);
            }
            Long x2 = aVar.mo141116x(map.get('.' + f + ".datasize"), Long.valueOf(aVar.mo54547H()));
            if (x2 != null) {
                aVar.mo54560U(x2.longValue());
            }
            String y15 = aVar.mo141117y(map.get('.' + f + ".dataext"), aVar.mo54545F());
            if (y15 != null) {
                aVar.mo54558S(y15);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "BaseMediaContentDataItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27054c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27052a)) {
            return jSONObject;
        }
        C27052a aVar = (C27052a) cVar;
        aVar.mo141106n(jSONObject, "datatitle", aVar.mo54548I(), z);
        aVar.mo141106n(jSONObject, "datadesc", aVar.mo54544E(), z);
        aVar.mo141106n(jSONObject, "datatype", Integer.valueOf(aVar.mo54549J()), z);
        aVar.mo141106n(jSONObject, "dataid", aVar.mo54546G(), z);
        aVar.mo141106n(jSONObject, "cdnthumburl", aVar.mo54543D(), z);
        aVar.mo141106n(jSONObject, "cdnthumbkey", aVar.mo54542C(), z);
        aVar.mo141106n(jSONObject, "thumbfullmd5", aVar.mo54551L(), z);
        aVar.mo141106n(jSONObject, "thumbsize", Long.valueOf(aVar.mo54552M()), z);
        aVar.mo141106n(jSONObject, "cdndataurl", aVar.mo54541B(), z);
        aVar.mo141106n(jSONObject, "cdndatakey", aVar.mo54540A(), z);
        aVar.mo141106n(jSONObject, "fullmd5", aVar.mo54550K(), z);
        aVar.mo141106n(jSONObject, "datasize", Long.valueOf(aVar.mo54547H()), z);
        aVar.mo141106n(jSONObject, "dataext", aVar.mo54545F(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27052a) || !(cVar2 instanceof C27052a)) {
            return false;
        }
        C27052a aVar = (C27052a) cVar;
        C27052a aVar2 = (C27052a) cVar2;
        return C87412m.m108589b(aVar.mo54548I(), aVar2.mo54548I()) && C87412m.m108589b(aVar.mo54544E(), aVar2.mo54544E()) && aVar.mo54549J() == aVar2.mo54549J() && C87412m.m108589b(aVar.mo54546G(), aVar2.mo54546G()) && C87412m.m108589b(aVar.mo54543D(), aVar2.mo54543D()) && C87412m.m108589b(aVar.mo54542C(), aVar2.mo54542C()) && C87412m.m108589b(aVar.mo54551L(), aVar2.mo54551L()) && aVar.mo54552M() == aVar2.mo54552M() && C87412m.m108589b(aVar.mo54541B(), aVar2.mo54541B()) && C87412m.m108589b(aVar.mo54540A(), aVar2.mo54540A()) && C87412m.m108589b(aVar.mo54550K(), aVar2.mo54550K()) && aVar.mo54547H() == aVar2.mo54547H() && C87412m.m108589b(aVar.mo54545F(), aVar2.mo54545F());
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
        if (!(cVar instanceof C27052a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27052a aVar = (C27052a) cVar;
        aVar.mo141108p(sb, "datatype", Integer.valueOf(aVar.mo54549J()), z);
        aVar.mo141108p(sb, "dataid", aVar.mo54546G(), z);
        sb.append(">");
        C27052a aVar2 = aVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        aVar2.mo141109q(sb5, "datatitle", "", aVar.mo54548I(), z2);
        aVar2.mo141109q(sb5, "datadesc", "", aVar.mo54544E(), z2);
        aVar2.mo141109q(sb5, "cdnthumburl", "", aVar.mo54543D(), z2);
        aVar2.mo141109q(sb5, "cdnthumbkey", "", aVar.mo54542C(), z2);
        aVar2.mo141109q(sb5, "thumbfullmd5", "", aVar.mo54551L(), z2);
        C27052a aVar3 = aVar;
        StringBuilder sb6 = sb;
        aVar3.mo141109q(sb6, "thumbsize", "", Long.valueOf(aVar.mo54552M()), z2);
        aVar3.mo141109q(sb6, "cdndataurl", "", aVar.mo54541B(), z2);
        aVar3.mo141109q(sb6, "cdndatakey", "", aVar.mo54540A(), z2);
        aVar3.mo141109q(sb6, "fullmd5", "", aVar.mo54550K(), z2);
        C27052a aVar4 = aVar;
        StringBuilder sb7 = sb;
        aVar4.mo141109q(sb7, "datasize", "", Long.valueOf(aVar.mo54547H()), z2);
        aVar4.mo141109q(sb7, "dataext", "", aVar.mo54545F(), z2);
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb8 = sb.toString();
        C87412m.m108593f(sb8, "xmlBuilder.toString()");
        return sb8;
    }
}
