package ec3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ec3.b */
public final class C27015b extends C101653b {
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
        if (cVar instanceof C27014a) {
            C27014a aVar = (C27014a) cVar;
            String f = aVar.mo141101f(str, str2);
            String y = aVar.mo141117y(map.get('.' + f + ".$aeskey"), aVar.mo54477A());
            if (y != null) {
                aVar.mo54506b0(y);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".$encryver"), Integer.valueOf(aVar.mo54490L()));
            if (w != null) {
                aVar.mo54517m0(w.intValue());
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".$cdnthumbaeskey"), aVar.mo54485G());
            if (y2 != null) {
                aVar.mo54512h0(y2);
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".$cdnthumburl"), aVar.mo54488J());
            if (y3 != null) {
                aVar.mo54515k0(y3);
            }
            Long x = aVar.mo141116x(map.get('.' + f + ".$cdnthumblength"), Long.valueOf(aVar.mo54487I()));
            if (x != null) {
                aVar.mo54514j0(x.longValue());
            }
            Integer w2 = aVar.mo141115w(map.get('.' + f + ".$cdnthumbheight"), Integer.valueOf(aVar.mo54486H()));
            if (w2 != null) {
                aVar.mo54513i0(w2.intValue());
            }
            Integer w3 = aVar.mo141115w(map.get('.' + f + ".$cdnthumbwidth"), Integer.valueOf(aVar.mo54489K()));
            if (w3 != null) {
                aVar.mo54516l0(w3.intValue());
            }
            Integer w4 = aVar.mo141115w(map.get('.' + f + ".$cdnmidheight"), Integer.valueOf(aVar.mo54482D()));
            if (w4 != null) {
                aVar.mo54509e0(w4.intValue());
            }
            Integer w5 = aVar.mo141115w(map.get('.' + f + ".$cdnmidwidth"), Integer.valueOf(aVar.mo54484F()));
            if (w5 != null) {
                aVar.mo54511g0(w5.intValue());
            }
            Integer w6 = aVar.mo141115w(map.get('.' + f + ".$cdnhdheight"), Integer.valueOf(aVar.mo54479B()));
            if (w6 != null) {
                aVar.mo54507c0(w6.intValue());
            }
            Integer w7 = aVar.mo141115w(map.get('.' + f + ".$cdnhdwidth"), Integer.valueOf(aVar.mo54481C()));
            if (w7 != null) {
                aVar.mo54508d0(w7.intValue());
            }
            String y4 = aVar.mo141117y(map.get('.' + f + ".$cdnmidimgurl"), aVar.mo54483E());
            if (y4 != null) {
                aVar.mo54510f0(y4);
            }
            Long x2 = aVar.mo141116x(map.get('.' + f + ".$length"), Long.valueOf(aVar.mo54492N()));
            if (x2 != null) {
                aVar.mo54519o0(x2.longValue());
            }
            Long x3 = aVar.mo141116x(map.get('.' + f + ".$hdlength"), Long.valueOf(aVar.mo54491M()));
            if (x3 != null) {
                aVar.mo54518n0(x3.longValue());
            }
            String y5 = aVar.mo141117y(map.get('.' + f + ".$md5"), aVar.mo54493O());
            if (y5 != null) {
                aVar.mo54520p0(y5);
            }
            String y6 = aVar.mo141117y(map.get('.' + f + ".$tpthumburl"), aVar.mo54502X());
            if (y6 != null) {
                aVar.mo54529y0(y6);
            }
            Long x4 = aVar.mo141116x(map.get('.' + f + ".$tpthumblength"), Long.valueOf(aVar.mo54501W()));
            if (x4 != null) {
                aVar.mo54528x0(x4.longValue());
            }
            Integer w8 = aVar.mo141115w(map.get('.' + f + ".$tpthumbheight"), Integer.valueOf(aVar.mo54500V()));
            if (w8 != null) {
                aVar.mo54527w0(w8.intValue());
            }
            Integer w9 = aVar.mo141115w(map.get('.' + f + ".$tpthumbwidth"), Integer.valueOf(aVar.mo54503Y()));
            if (w9 != null) {
                aVar.mo54530z0(w9.intValue());
            }
            String y7 = aVar.mo141117y(map.get('.' + f + ".$tpthumbaeskey"), aVar.mo54499U());
            if (y7 != null) {
                aVar.mo54526v0(y7);
            }
            String y8 = aVar.mo141117y(map.get('.' + f + ".$tpurl"), aVar.mo54504Z());
            if (y8 != null) {
                aVar.mo54478A0(y8);
            }
            Long x5 = aVar.mo141116x(map.get('.' + f + ".$tplength"), Long.valueOf(aVar.mo54498T()));
            if (x5 != null) {
                aVar.mo54525u0(x5.longValue());
            }
            Integer w15 = aVar.mo141115w(map.get('.' + f + ".$tpheight"), Integer.valueOf(aVar.mo54497S()));
            if (w15 != null) {
                aVar.mo54524t0(w15.intValue());
            }
            Integer w16 = aVar.mo141115w(map.get('.' + f + ".$tpwidth"), Integer.valueOf(aVar.mo54505a0()));
            if (w16 != null) {
                aVar.mo54480B0(w16.intValue());
            }
            String y9 = aVar.mo141117y(map.get('.' + f + ".$tpauthkey"), aVar.mo54494P());
            if (y9 != null) {
                aVar.mo54521q0(y9);
            }
            String y15 = aVar.mo141117y(map.get('.' + f + ".$tphdurl"), aVar.mo54496R());
            if (y15 != null) {
                aVar.mo54523s0(y15);
            }
            Long x6 = aVar.mo141116x(map.get('.' + f + ".$tphdlength"), Long.valueOf(aVar.mo54495Q()));
            if (x6 != null) {
                aVar.mo54522r0(x6.longValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "img";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27016c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27014a)) {
            return jSONObject;
        }
        C27014a aVar = (C27014a) cVar;
        aVar.mo141106n(jSONObject, "aeskey", aVar.mo54477A(), z);
        aVar.mo141106n(jSONObject, "encryver", Integer.valueOf(aVar.mo54490L()), z);
        aVar.mo141106n(jSONObject, "cdnthumbaeskey", aVar.mo54485G(), z);
        aVar.mo141106n(jSONObject, "cdnthumburl", aVar.mo54488J(), z);
        aVar.mo141106n(jSONObject, "cdnthumblength", Long.valueOf(aVar.mo54487I()), z);
        aVar.mo141106n(jSONObject, "cdnthumbheight", Integer.valueOf(aVar.mo54486H()), z);
        aVar.mo141106n(jSONObject, "cdnthumbwidth", Integer.valueOf(aVar.mo54489K()), z);
        aVar.mo141106n(jSONObject, "cdnmidheight", Integer.valueOf(aVar.mo54482D()), z);
        aVar.mo141106n(jSONObject, "cdnmidwidth", Integer.valueOf(aVar.mo54484F()), z);
        aVar.mo141106n(jSONObject, "cdnhdheight", Integer.valueOf(aVar.mo54479B()), z);
        aVar.mo141106n(jSONObject, "cdnhdwidth", Integer.valueOf(aVar.mo54481C()), z);
        aVar.mo141106n(jSONObject, "cdnmidimgurl", aVar.mo54483E(), z);
        aVar.mo141106n(jSONObject, "length", Long.valueOf(aVar.mo54492N()), z);
        aVar.mo141106n(jSONObject, "hdlength", Long.valueOf(aVar.mo54491M()), z);
        aVar.mo141106n(jSONObject, "md5", aVar.mo54493O(), z);
        aVar.mo141106n(jSONObject, "tpthumburl", aVar.mo54502X(), z);
        aVar.mo141106n(jSONObject, "tpthumblength", Long.valueOf(aVar.mo54501W()), z);
        aVar.mo141106n(jSONObject, "tpthumbheight", Integer.valueOf(aVar.mo54500V()), z);
        aVar.mo141106n(jSONObject, "tpthumbwidth", Integer.valueOf(aVar.mo54503Y()), z);
        aVar.mo141106n(jSONObject, "tpthumbaeskey", aVar.mo54499U(), z);
        aVar.mo141106n(jSONObject, "tpurl", aVar.mo54504Z(), z);
        aVar.mo141106n(jSONObject, "tplength", Long.valueOf(aVar.mo54498T()), z);
        aVar.mo141106n(jSONObject, "tpheight", Integer.valueOf(aVar.mo54497S()), z);
        aVar.mo141106n(jSONObject, "tpwidth", Integer.valueOf(aVar.mo54505a0()), z);
        aVar.mo141106n(jSONObject, "tpauthkey", aVar.mo54494P(), z);
        aVar.mo141106n(jSONObject, "tphdurl", aVar.mo54496R(), z);
        aVar.mo141106n(jSONObject, "tphdlength", Long.valueOf(aVar.mo54495Q()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27014a) || !(cVar2 instanceof C27014a)) {
            return false;
        }
        C27014a aVar = (C27014a) cVar;
        C27014a aVar2 = (C27014a) cVar2;
        return C87412m.m108589b(aVar.mo54477A(), aVar2.mo54477A()) && aVar.mo54490L() == aVar2.mo54490L() && C87412m.m108589b(aVar.mo54485G(), aVar2.mo54485G()) && C87412m.m108589b(aVar.mo54488J(), aVar2.mo54488J()) && aVar.mo54487I() == aVar2.mo54487I() && aVar.mo54486H() == aVar2.mo54486H() && aVar.mo54489K() == aVar2.mo54489K() && aVar.mo54482D() == aVar2.mo54482D() && aVar.mo54484F() == aVar2.mo54484F() && aVar.mo54479B() == aVar2.mo54479B() && aVar.mo54481C() == aVar2.mo54481C() && C87412m.m108589b(aVar.mo54483E(), aVar2.mo54483E()) && aVar.mo54492N() == aVar2.mo54492N() && aVar.mo54491M() == aVar2.mo54491M() && C87412m.m108589b(aVar.mo54493O(), aVar2.mo54493O()) && C87412m.m108589b(aVar.mo54502X(), aVar2.mo54502X()) && aVar.mo54501W() == aVar2.mo54501W() && aVar.mo54500V() == aVar2.mo54500V() && aVar.mo54503Y() == aVar2.mo54503Y() && C87412m.m108589b(aVar.mo54499U(), aVar2.mo54499U()) && C87412m.m108589b(aVar.mo54504Z(), aVar2.mo54504Z()) && aVar.mo54498T() == aVar2.mo54498T() && aVar.mo54497S() == aVar2.mo54497S() && aVar.mo54505a0() == aVar2.mo54505a0() && C87412m.m108589b(aVar.mo54494P(), aVar2.mo54494P()) && C87412m.m108589b(aVar.mo54496R(), aVar2.mo54496R()) && aVar.mo54495Q() == aVar2.mo54495Q();
    }

    /* renamed from: g */
    public boolean mo53861g() {
        return true;
    }

    /* renamed from: h */
    public String mo53862h() {
        return "msg";
    }

    /* renamed from: i */
    public String mo53863i(C64054c cVar, boolean z, String str, String str2) {
        C87412m.m108594g(cVar, "serializeObj");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        StringBuilder sb = new StringBuilder();
        if (!(cVar instanceof C27014a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27014a aVar = (C27014a) cVar;
        aVar.mo141108p(sb, "aeskey", aVar.mo54477A(), z);
        aVar.mo141108p(sb, "encryver", Integer.valueOf(aVar.mo54490L()), z);
        aVar.mo141108p(sb, "cdnthumbaeskey", aVar.mo54485G(), z);
        aVar.mo141108p(sb, "cdnthumburl", aVar.mo54488J(), z);
        aVar.mo141108p(sb, "cdnthumblength", Long.valueOf(aVar.mo54487I()), z);
        aVar.mo141108p(sb, "cdnthumbheight", Integer.valueOf(aVar.mo54486H()), z);
        aVar.mo141108p(sb, "cdnthumbwidth", Integer.valueOf(aVar.mo54489K()), z);
        aVar.mo141108p(sb, "cdnmidheight", Integer.valueOf(aVar.mo54482D()), z);
        aVar.mo141108p(sb, "cdnmidwidth", Integer.valueOf(aVar.mo54484F()), z);
        aVar.mo141108p(sb, "cdnhdheight", Integer.valueOf(aVar.mo54479B()), z);
        aVar.mo141108p(sb, "cdnhdwidth", Integer.valueOf(aVar.mo54481C()), z);
        aVar.mo141108p(sb, "cdnmidimgurl", aVar.mo54483E(), z);
        aVar.mo141108p(sb, "length", Long.valueOf(aVar.mo54492N()), z);
        aVar.mo141108p(sb, "hdlength", Long.valueOf(aVar.mo54491M()), z);
        aVar.mo141108p(sb, "md5", aVar.mo54493O(), z);
        aVar.mo141108p(sb, "tpthumburl", aVar.mo54502X(), z);
        aVar.mo141108p(sb, "tpthumblength", Long.valueOf(aVar.mo54501W()), z);
        aVar.mo141108p(sb, "tpthumbheight", Integer.valueOf(aVar.mo54500V()), z);
        aVar.mo141108p(sb, "tpthumbwidth", Integer.valueOf(aVar.mo54503Y()), z);
        aVar.mo141108p(sb, "tpthumbaeskey", aVar.mo54499U(), z);
        aVar.mo141108p(sb, "tpurl", aVar.mo54504Z(), z);
        aVar.mo141108p(sb, "tplength", Long.valueOf(aVar.mo54498T()), z);
        aVar.mo141108p(sb, "tpheight", Integer.valueOf(aVar.mo54497S()), z);
        aVar.mo141108p(sb, "tpwidth", Integer.valueOf(aVar.mo54505a0()), z);
        aVar.mo141108p(sb, "tpauthkey", aVar.mo54494P(), z);
        aVar.mo141108p(sb, "tphdurl", aVar.mo54496R(), z);
        aVar.mo141108p(sb, "tphdlength", Long.valueOf(aVar.mo54495Q()), z);
        sb.append(">");
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
