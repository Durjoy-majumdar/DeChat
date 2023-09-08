package ug3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ug3.d */
public final class C27678d extends C101653b {
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
        if (cVar instanceof C27677c) {
            C27677c cVar2 = (C27677c) cVar;
            String f = cVar2.mo141101f(str, str2);
            Integer w = cVar2.mo141115w(map.get('.' + f + ".pid"), Integer.valueOf(cVar2.mo55525L()));
            if (w != null) {
                cVar2.mo55541b0(w.intValue());
            }
            Integer w2 = cVar2.mo141115w(map.get('.' + f + ".status"), Integer.valueOf(cVar2.mo55526M()));
            if (w2 != null) {
                cVar2.mo55542c0(w2.intValue());
            }
            Integer w3 = cVar2.mo141115w(map.get('.' + f + ".totalCount"), Integer.valueOf(cVar2.mo55529P()));
            if (w3 != null) {
                cVar2.mo55545f0(w3.intValue());
            }
            Integer w4 = cVar2.mo141115w(map.get('.' + f + ".tickCount"), Integer.valueOf(cVar2.mo55527N()));
            if (w4 != null) {
                cVar2.mo55543d0(w4.intValue());
            }
            Float v = cVar2.mo141114v(map.get('.' + f + ".tickRate"), Float.valueOf(cVar2.mo55528O()));
            if (v != null) {
                cVar2.mo55544e0(v.floatValue());
            }
            Integer w5 = cVar2.mo141115w(map.get('.' + f + ".networkTickCount"), Integer.valueOf(cVar2.mo55523J()));
            if (w5 != null) {
                cVar2.mo55539Z(w5.intValue());
            }
            Float v2 = cVar2.mo141114v(map.get('.' + f + ".networkTickRate"), Float.valueOf(cVar2.mo55524K()));
            if (v2 != null) {
                cVar2.mo55540a0(v2.floatValue());
            }
            Long x = cVar2.mo141116x(map.get('.' + f + ".fromTimestamp"), Long.valueOf(cVar2.mo55521H()));
            if (x != null) {
                cVar2.mo55537X(x.longValue());
            }
            String y = cVar2.mo141117y(map.get('.' + f + ".fromTimestampFormat"), cVar2.mo55522I());
            if (y != null) {
                cVar2.mo55538Y(y);
            }
            Integer w6 = cVar2.mo141115w(map.get('.' + f + ".fromCurrentProcessMin"), Integer.valueOf(cVar2.mo55514A()));
            if (w6 != null) {
                cVar2.mo55530Q(w6.intValue());
            }
            Integer w7 = cVar2.mo141115w(map.get('.' + f + ".fromLastProcessMin"), Integer.valueOf(cVar2.mo55518E()));
            if (w7 != null) {
                cVar2.mo55534U(w7.intValue());
            }
            Integer w8 = cVar2.mo141115w(map.get('.' + f + ".fromLastDeepBackgroundMin"), Integer.valueOf(cVar2.mo55515B()));
            if (w8 != null) {
                cVar2.mo55531R(w8.intValue());
            }
            Integer w9 = cVar2.mo141115w(map.get('.' + f + ".fromLastForegroundMin"), Integer.valueOf(cVar2.mo55516C()));
            if (w9 != null) {
                cVar2.mo55532S(w9.intValue());
            }
            Integer w15 = cVar2.mo141115w(map.get('.' + f + ".fromLastScreenMin"), Integer.valueOf(cVar2.mo55519F()));
            if (w15 != null) {
                cVar2.mo55535V(w15.intValue());
            }
            Integer w16 = cVar2.mo141115w(map.get('.' + f + ".fromLastNetworkMin"), Integer.valueOf(cVar2.mo55517D()));
            if (w16 != null) {
                cVar2.mo55533T(w16.intValue());
            }
            Integer w17 = cVar2.mo141115w(map.get('.' + f + ".fromLastTickMin"), Integer.valueOf(cVar2.mo55520G()));
            if (w17 != null) {
                cVar2.mo55536W(w17.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "ProcessStatus";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27679e(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27677c)) {
            return jSONObject;
        }
        C27677c cVar2 = (C27677c) cVar;
        cVar2.mo141106n(jSONObject, "pid", Integer.valueOf(cVar2.mo55525L()), z);
        cVar2.mo141106n(jSONObject, "status", Integer.valueOf(cVar2.mo55526M()), z);
        cVar2.mo141106n(jSONObject, "totalCount", Integer.valueOf(cVar2.mo55529P()), z);
        cVar2.mo141106n(jSONObject, "tickCount", Integer.valueOf(cVar2.mo55527N()), z);
        cVar2.mo141106n(jSONObject, "tickRate", Float.valueOf(cVar2.mo55528O()), z);
        cVar2.mo141106n(jSONObject, "networkTickCount", Integer.valueOf(cVar2.mo55523J()), z);
        cVar2.mo141106n(jSONObject, "networkTickRate", Float.valueOf(cVar2.mo55524K()), z);
        cVar2.mo141106n(jSONObject, "fromTimestamp", Long.valueOf(cVar2.mo55521H()), z);
        cVar2.mo141106n(jSONObject, "fromTimestampFormat", cVar2.mo55522I(), z);
        cVar2.mo141106n(jSONObject, "fromCurrentProcessMin", Integer.valueOf(cVar2.mo55514A()), z);
        cVar2.mo141106n(jSONObject, "fromLastProcessMin", Integer.valueOf(cVar2.mo55518E()), z);
        cVar2.mo141106n(jSONObject, "fromLastDeepBackgroundMin", Integer.valueOf(cVar2.mo55515B()), z);
        cVar2.mo141106n(jSONObject, "fromLastForegroundMin", Integer.valueOf(cVar2.mo55516C()), z);
        cVar2.mo141106n(jSONObject, "fromLastScreenMin", Integer.valueOf(cVar2.mo55519F()), z);
        cVar2.mo141106n(jSONObject, "fromLastNetworkMin", Integer.valueOf(cVar2.mo55517D()), z);
        cVar2.mo141106n(jSONObject, "fromLastTickMin", Integer.valueOf(cVar2.mo55520G()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27677c) || !(cVar2 instanceof C27677c)) {
            return false;
        }
        C27677c cVar3 = (C27677c) cVar;
        C27677c cVar4 = (C27677c) cVar2;
        if (cVar3.mo55525L() != cVar4.mo55525L() || cVar3.mo55526M() != cVar4.mo55526M() || cVar3.mo55529P() != cVar4.mo55529P() || cVar3.mo55527N() != cVar4.mo55527N()) {
            return false;
        }
        if (!(cVar3.mo55528O() == cVar4.mo55528O()) || cVar3.mo55523J() != cVar4.mo55523J()) {
            return false;
        }
        return ((cVar3.mo55524K() > cVar4.mo55524K() ? 1 : (cVar3.mo55524K() == cVar4.mo55524K() ? 0 : -1)) == 0) && cVar3.mo55521H() == cVar4.mo55521H() && C87412m.m108589b(cVar3.mo55522I(), cVar4.mo55522I()) && cVar3.mo55514A() == cVar4.mo55514A() && cVar3.mo55518E() == cVar4.mo55518E() && cVar3.mo55515B() == cVar4.mo55515B() && cVar3.mo55516C() == cVar4.mo55516C() && cVar3.mo55519F() == cVar4.mo55519F() && cVar3.mo55517D() == cVar4.mo55517D() && cVar3.mo55520G() == cVar4.mo55520G();
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
        if (!(cVar instanceof C27677c)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27677c cVar2 = (C27677c) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        cVar2.mo141109q(sb5, "pid", "", Integer.valueOf(cVar2.mo55525L()), z2);
        cVar2.mo141109q(sb5, "status", "", Integer.valueOf(cVar2.mo55526M()), z2);
        cVar2.mo141109q(sb5, "totalCount", "", Integer.valueOf(cVar2.mo55529P()), z2);
        cVar2.mo141109q(sb5, "tickCount", "", Integer.valueOf(cVar2.mo55527N()), z2);
        cVar2.mo141109q(sb5, "tickRate", "", Float.valueOf(cVar2.mo55528O()), z2);
        cVar2.mo141109q(sb5, "networkTickCount", "", Integer.valueOf(cVar2.mo55523J()), z2);
        cVar2.mo141109q(sb5, "networkTickRate", "", Float.valueOf(cVar2.mo55524K()), z2);
        C27677c cVar3 = cVar2;
        StringBuilder sb6 = sb;
        cVar3.mo141109q(sb6, "fromTimestamp", "", Long.valueOf(cVar2.mo55521H()), z2);
        cVar3.mo141109q(sb6, "fromTimestampFormat", "", cVar2.mo55522I(), z2);
        cVar2.mo141109q(sb6, "fromCurrentProcessMin", "", Integer.valueOf(cVar2.mo55514A()), z2);
        cVar2.mo141109q(sb6, "fromLastProcessMin", "", Integer.valueOf(cVar2.mo55518E()), z2);
        cVar2.mo141109q(sb6, "fromLastDeepBackgroundMin", "", Integer.valueOf(cVar2.mo55515B()), z2);
        cVar2.mo141109q(sb6, "fromLastForegroundMin", "", Integer.valueOf(cVar2.mo55516C()), z2);
        cVar2.mo141109q(sb6, "fromLastScreenMin", "", Integer.valueOf(cVar2.mo55519F()), z2);
        cVar2.mo141109q(sb6, "fromLastNetworkMin", "", Integer.valueOf(cVar2.mo55517D()), z2);
        cVar2.mo141109q(sb6, "fromLastTickMin", "", Integer.valueOf(cVar2.mo55520G()), z2);
        sb.append("</" + str + '>');
        cVar2.mo141110r(sb, str2);
        String sb7 = sb.toString();
        C87412m.m108593f(sb7, "xmlBuilder.toString()");
        return sb7;
    }
}
