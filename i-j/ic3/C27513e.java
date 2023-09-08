package ic3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ic3.e */
public final class C27513e extends C101653b {
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
        if (cVar instanceof C27512d) {
            C27512d dVar = (C27512d) cVar;
            String f = dVar.mo141101f(str, str2);
            String y = dVar.mo141117y(map.get('.' + f + ".$aeskey"), dVar.mo55190A());
            if (y != null) {
                dVar.mo55210U(y);
            }
            String y2 = dVar.mo141117y(map.get('.' + f + ".$cdnvideourl"), dVar.mo55197H());
            if (y2 != null) {
                dVar.mo55217b0(y2);
            }
            String y3 = dVar.mo141117y(map.get('.' + f + ".$cdnthumbaeskey"), dVar.mo55192C());
            if (y3 != null) {
                dVar.mo55212W(y3);
            }
            String y4 = dVar.mo141117y(map.get('.' + f + ".$cdnthumburl"), dVar.mo55195F());
            if (y4 != null) {
                dVar.mo55215Z(y4);
            }
            Integer w = dVar.mo141115w(map.get('.' + f + ".$length"), Integer.valueOf(dVar.mo55200K()));
            if (w != null) {
                dVar.mo55220e0(w.intValue());
            }
            Integer w2 = dVar.mo141115w(map.get('.' + f + ".$playlength"), Integer.valueOf(dVar.mo55204O()));
            if (w2 != null) {
                dVar.mo55225j0(w2.intValue());
            }
            Integer w3 = dVar.mo141115w(map.get('.' + f + ".$cdnthumblength"), Integer.valueOf(dVar.mo55194E()));
            if (w3 != null) {
                dVar.mo55214Y(w3.intValue());
            }
            Integer w4 = dVar.mo141115w(map.get('.' + f + ".$cdnthumbwidth"), Integer.valueOf(dVar.mo55196G()));
            if (w4 != null) {
                dVar.mo55216a0(w4.intValue());
            }
            Integer w5 = dVar.mo141115w(map.get('.' + f + ".$cdnthumbheight"), Integer.valueOf(dVar.mo55193D()));
            if (w5 != null) {
                dVar.mo55213X(w5.intValue());
            }
            String y5 = dVar.mo141117y(map.get('.' + f + ".$fromusername"), dVar.mo55199J());
            if (y5 != null) {
                dVar.mo55219d0(y5);
            }
            String y6 = dVar.mo141117y(map.get('.' + f + ".$md5"), dVar.mo55201L());
            if (y6 != null) {
                dVar.mo55221f0(y6);
            }
            String y7 = dVar.mo141117y(map.get('.' + f + ".$newmd5"), dVar.mo55202M());
            if (y7 != null) {
                dVar.mo55222g0(y7);
            }
            Integer w6 = dVar.mo141115w(map.get('.' + f + ".$isplaceholder"), Integer.valueOf(dVar.mo55208S()));
            if (w6 != null) {
                dVar.mo55224i0(w6.intValue());
            }
            String y8 = dVar.mo141117y(map.get('.' + f + ".$rawmd5"), dVar.mo55206Q());
            if (y8 != null) {
                dVar.mo55227l0(y8);
            }
            Integer w7 = dVar.mo141115w(map.get('.' + f + ".$rawlength"), Integer.valueOf(dVar.mo55205P()));
            if (w7 != null) {
                dVar.mo55226k0(w7.intValue());
            }
            String y9 = dVar.mo141117y(map.get('.' + f + ".$cdnrawvideourl"), dVar.mo55198I());
            if (y9 != null) {
                dVar.mo55218c0(y9);
            }
            String y15 = dVar.mo141117y(map.get('.' + f + ".$cdnrawvideoaeskey"), dVar.mo55191B());
            if (y15 != null) {
                dVar.mo55211V(y15);
            }
            Integer w8 = dVar.mo141115w(map.get('.' + f + ".$overwritenewmsgid"), Integer.valueOf(dVar.mo55203N()));
            if (w8 != null) {
                dVar.mo55223h0(w8.intValue());
            }
            Integer w9 = dVar.mo141115w(map.get('.' + f + ".$isad"), Integer.valueOf(dVar.mo55207R()));
            if (w9 != null) {
                dVar.mo55209T(w9.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "videomsg";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27514f(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27512d)) {
            return jSONObject;
        }
        C27512d dVar = (C27512d) cVar;
        dVar.mo141106n(jSONObject, "aeskey", dVar.mo55190A(), z);
        dVar.mo141106n(jSONObject, "cdnvideourl", dVar.mo55197H(), z);
        dVar.mo141106n(jSONObject, "cdnthumbaeskey", dVar.mo55192C(), z);
        dVar.mo141106n(jSONObject, "cdnthumburl", dVar.mo55195F(), z);
        dVar.mo141106n(jSONObject, "length", Integer.valueOf(dVar.mo55200K()), z);
        dVar.mo141106n(jSONObject, "playlength", Integer.valueOf(dVar.mo55204O()), z);
        dVar.mo141106n(jSONObject, "cdnthumblength", Integer.valueOf(dVar.mo55194E()), z);
        dVar.mo141106n(jSONObject, "cdnthumbwidth", Integer.valueOf(dVar.mo55196G()), z);
        dVar.mo141106n(jSONObject, "cdnthumbheight", Integer.valueOf(dVar.mo55193D()), z);
        dVar.mo141106n(jSONObject, "fromusername", dVar.mo55199J(), z);
        dVar.mo141106n(jSONObject, "md5", dVar.mo55201L(), z);
        dVar.mo141106n(jSONObject, "newmd5", dVar.mo55202M(), z);
        dVar.mo141106n(jSONObject, "isplaceholder", Integer.valueOf(dVar.mo55208S()), z);
        dVar.mo141106n(jSONObject, "rawmd5", dVar.mo55206Q(), z);
        dVar.mo141106n(jSONObject, "rawlength", Integer.valueOf(dVar.mo55205P()), z);
        dVar.mo141106n(jSONObject, "cdnrawvideourl", dVar.mo55198I(), z);
        dVar.mo141106n(jSONObject, "cdnrawvideoaeskey", dVar.mo55191B(), z);
        dVar.mo141106n(jSONObject, "overwritenewmsgid", Integer.valueOf(dVar.mo55203N()), z);
        dVar.mo141106n(jSONObject, "isad", Integer.valueOf(dVar.mo55207R()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27512d) || !(cVar2 instanceof C27512d)) {
            return false;
        }
        C27512d dVar = (C27512d) cVar;
        C27512d dVar2 = (C27512d) cVar2;
        return C87412m.m108589b(dVar.mo55190A(), dVar2.mo55190A()) && C87412m.m108589b(dVar.mo55197H(), dVar2.mo55197H()) && C87412m.m108589b(dVar.mo55192C(), dVar2.mo55192C()) && C87412m.m108589b(dVar.mo55195F(), dVar2.mo55195F()) && dVar.mo55200K() == dVar2.mo55200K() && dVar.mo55204O() == dVar2.mo55204O() && dVar.mo55194E() == dVar2.mo55194E() && dVar.mo55196G() == dVar2.mo55196G() && dVar.mo55193D() == dVar2.mo55193D() && C87412m.m108589b(dVar.mo55199J(), dVar2.mo55199J()) && C87412m.m108589b(dVar.mo55201L(), dVar2.mo55201L()) && C87412m.m108589b(dVar.mo55202M(), dVar2.mo55202M()) && dVar.mo55208S() == dVar2.mo55208S() && C87412m.m108589b(dVar.mo55206Q(), dVar2.mo55206Q()) && dVar.mo55205P() == dVar2.mo55205P() && C87412m.m108589b(dVar.mo55198I(), dVar2.mo55198I()) && C87412m.m108589b(dVar.mo55191B(), dVar2.mo55191B()) && dVar.mo55203N() == dVar2.mo55203N() && dVar.mo55207R() == dVar2.mo55207R();
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
        if (!(cVar instanceof C27512d)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27512d dVar = (C27512d) cVar;
        dVar.mo141108p(sb, "aeskey", dVar.mo55190A(), z);
        dVar.mo141108p(sb, "cdnvideourl", dVar.mo55197H(), z);
        dVar.mo141108p(sb, "cdnthumbaeskey", dVar.mo55192C(), z);
        dVar.mo141108p(sb, "cdnthumburl", dVar.mo55195F(), z);
        dVar.mo141108p(sb, "length", Integer.valueOf(dVar.mo55200K()), z);
        dVar.mo141108p(sb, "playlength", Integer.valueOf(dVar.mo55204O()), z);
        dVar.mo141108p(sb, "cdnthumblength", Integer.valueOf(dVar.mo55194E()), z);
        dVar.mo141108p(sb, "cdnthumbwidth", Integer.valueOf(dVar.mo55196G()), z);
        dVar.mo141108p(sb, "cdnthumbheight", Integer.valueOf(dVar.mo55193D()), z);
        dVar.mo141108p(sb, "fromusername", dVar.mo55199J(), z);
        dVar.mo141108p(sb, "md5", dVar.mo55201L(), z);
        dVar.mo141108p(sb, "newmd5", dVar.mo55202M(), z);
        dVar.mo141108p(sb, "isplaceholder", Integer.valueOf(dVar.mo55208S()), z);
        dVar.mo141108p(sb, "rawmd5", dVar.mo55206Q(), z);
        dVar.mo141108p(sb, "rawlength", Integer.valueOf(dVar.mo55205P()), z);
        dVar.mo141108p(sb, "cdnrawvideourl", dVar.mo55198I(), z);
        dVar.mo141108p(sb, "cdnrawvideoaeskey", dVar.mo55191B(), z);
        dVar.mo141108p(sb, "overwritenewmsgid", Integer.valueOf(dVar.mo55203N()), z);
        dVar.mo141108p(sb, "isad", Integer.valueOf(dVar.mo55207R()), z);
        sb.append(">");
        sb.append("</" + str + '>');
        dVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
