package hc3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import p749xh.C66261f3;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.w */
public final class C98376w extends C101653b {
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
        if (cVar instanceof C98374v) {
            C98374v vVar = (C98374v) cVar;
            String f = vVar.mo141101f(str, str2);
            String y = vVar.mo141117y(map.get('.' + f + ".objectId"), vVar.mo55162U());
            if (y != null) {
                vVar.mo55185r0(y);
            }
            String y2 = vVar.mo141117y(map.get('.' + f + ".objectNonceId"), vVar.mo55163V());
            if (y2 != null) {
                vVar.mo55186s0(y2);
            }
            Integer w = vVar.mo141115w(map.get('.' + f + ".feedType"), Integer.valueOf(vVar.mo55155N()));
            if (w != null) {
                vVar.mo55178k0(w.intValue());
            }
            String y3 = vVar.mo141117y(map.get('.' + f + ".nickname"), vVar.mo55161T());
            if (y3 != null) {
                vVar.mo55184q0(y3);
            }
            String y4 = vVar.mo141117y(map.get('.' + f + ".username"), vVar.mo55164W());
            if (y4 != null) {
                vVar.mo55187t0(y4);
            }
            String y5 = vVar.mo141117y(map.get('.' + f + ".avatar"), vVar.mo55144C());
            if (y5 != null) {
                vVar.mo55167Z(y5);
            }
            String y6 = vVar.mo141117y(map.get('.' + f + ".desc"), vVar.mo55154M());
            if (y6 != null) {
                vVar.mo55177j0(y6);
            }
            Integer w2 = vVar.mo141115w(map.get('.' + f + ".mediaCount"), Integer.valueOf(vVar.mo55158Q()));
            if (w2 != null) {
                vVar.mo55181n0(w2.intValue());
            }
            Long x = vVar.mo141116x(map.get('.' + f + ".localId"), Long.valueOf(vVar.mo55157P()));
            if (x != null) {
                vVar.mo55180m0(x.longValue());
            }
            Integer w3 = vVar.mo141115w(map.get('.' + f + ".authIconType"), Integer.valueOf(vVar.mo55142A()));
            if (w3 != null) {
                vVar.mo55165X(w3.intValue());
            }
            String y7 = vVar.mo141117y(map.get('.' + f + ".authIconUrl"), vVar.mo55143B());
            if (y7 != null) {
                vVar.mo55166Y(y7);
            }
            ArrayList arrayList = new ArrayList();
            vVar.mo141107o(arrayList, C98378y.class, map, f + ".mediaList", "media");
            if (arrayList.size() > 0) {
                vVar.mo55182o0(arrayList);
            }
            if (map.containsKey('.' + f + ".megaVideo")) {
                C98340b0 b0Var = new C98340b0();
                vVar.mo141105m(b0Var, map, "megaVideo", f);
                vVar.mo55183p0(b0Var);
            }
            String y8 = vVar.mo141117y(map.get('.' + f + ".bizUsername"), vVar.mo55149H());
            if (y8 != null) {
                vVar.mo55172e0(y8);
            }
            String y9 = vVar.mo141117y(map.get('.' + f + ".bizNickname"), vVar.mo55148G());
            if (y9 != null) {
                vVar.mo55171d0(y9);
            }
            String y15 = vVar.mo141117y(map.get('.' + f + ".bizAvatar"), vVar.mo55147F());
            if (y15 != null) {
                vVar.mo55170c0(y15);
            }
            String y16 = vVar.mo141117y(map.get('.' + f + ".bizUsernameV2"), vVar.mo55150I());
            if (y16 != null) {
                vVar.mo55173f0(y16);
            }
            Integer w4 = vVar.mo141115w(map.get('.' + f + ".bizAuthIconType"), Integer.valueOf(vVar.mo55145D()));
            if (w4 != null) {
                vVar.mo55168a0(w4.intValue());
            }
            String y17 = vVar.mo141117y(map.get('.' + f + ".bizAuthIconUrl"), vVar.mo55146E());
            if (y17 != null) {
                vVar.mo55169b0(y17);
            }
            Integer w5 = vVar.mo141115w(map.get('.' + f + ".coverEffectType"), Integer.valueOf(vVar.mo55153L()));
            if (w5 != null) {
                vVar.mo55176i0(w5.intValue());
            }
            String y18 = vVar.mo141117y(map.get('.' + f + ".coverEffectText"), vVar.mo55152K());
            if (y18 != null) {
                vVar.mo55175h0(y18);
            }
            String y19 = vVar.mo141117y(map.get('.' + f + ".finderForwardSource"), vVar.mo55156O());
            if (y19 != null) {
                vVar.mo55179l0(y19);
            }
            String y25 = vVar.mo141117y(map.get('.' + f + ".contactJumpInfoStr"), vVar.mo55151J());
            if (y25 != null) {
                vVar.mo55174g0(y25);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderFeedItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27451x(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98374v)) {
            return jSONObject;
        }
        C98374v vVar = (C98374v) cVar;
        vVar.mo141106n(jSONObject, "objectId", vVar.mo55162U(), z);
        vVar.mo141106n(jSONObject, "objectNonceId", vVar.mo55163V(), z);
        vVar.mo141106n(jSONObject, "feedType", Integer.valueOf(vVar.mo55155N()), z);
        vVar.mo141106n(jSONObject, "nickname", vVar.mo55161T(), z);
        vVar.mo141106n(jSONObject, "username", vVar.mo55164W(), z);
        vVar.mo141106n(jSONObject, "avatar", vVar.mo55144C(), z);
        vVar.mo141106n(jSONObject, "desc", vVar.mo55154M(), z);
        vVar.mo141106n(jSONObject, "mediaCount", Integer.valueOf(vVar.mo55158Q()), z);
        vVar.mo141106n(jSONObject, C66261f3.COL_LOCALID, Long.valueOf(vVar.mo55157P()), z);
        vVar.mo141106n(jSONObject, "authIconType", Integer.valueOf(vVar.mo55142A()), z);
        vVar.mo141106n(jSONObject, "authIconUrl", vVar.mo55143B(), z);
        vVar.mo141106n(jSONObject, "mediaList", vVar.mo55159R(), z);
        vVar.mo141106n(jSONObject, "megaVideo", vVar.mo55160S(), z);
        vVar.mo141106n(jSONObject, "bizUsername", vVar.mo55149H(), z);
        vVar.mo141106n(jSONObject, "bizNickname", vVar.mo55148G(), z);
        vVar.mo141106n(jSONObject, "bizAvatar", vVar.mo55147F(), z);
        vVar.mo141106n(jSONObject, "bizUsernameV2", vVar.mo55150I(), z);
        vVar.mo141106n(jSONObject, "bizAuthIconType", Integer.valueOf(vVar.mo55145D()), z);
        vVar.mo141106n(jSONObject, "bizAuthIconUrl", vVar.mo55146E(), z);
        vVar.mo141106n(jSONObject, "coverEffectType", Integer.valueOf(vVar.mo55153L()), z);
        vVar.mo141106n(jSONObject, "coverEffectText", vVar.mo55152K(), z);
        vVar.mo141106n(jSONObject, "finderForwardSource", vVar.mo55156O(), z);
        vVar.mo141106n(jSONObject, "contactJumpInfoStr", vVar.mo55151J(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98374v) || !(cVar2 instanceof C98374v)) {
            return false;
        }
        C98374v vVar = (C98374v) cVar;
        C98374v vVar2 = (C98374v) cVar2;
        return C87412m.m108589b(vVar.mo55162U(), vVar2.mo55162U()) && C87412m.m108589b(vVar.mo55163V(), vVar2.mo55163V()) && vVar.mo55155N() == vVar2.mo55155N() && C87412m.m108589b(vVar.mo55161T(), vVar2.mo55161T()) && C87412m.m108589b(vVar.mo55164W(), vVar2.mo55164W()) && C87412m.m108589b(vVar.mo55144C(), vVar2.mo55144C()) && C87412m.m108589b(vVar.mo55154M(), vVar2.mo55154M()) && vVar.mo55158Q() == vVar2.mo55158Q() && vVar.mo55157P() == vVar2.mo55157P() && vVar.mo55142A() == vVar2.mo55142A() && C87412m.m108589b(vVar.mo55143B(), vVar2.mo55143B()) && vVar.mo141097b(vVar.mo55159R(), vVar2.mo55159R(), C98378y.class) && vVar.mo141098c(vVar.mo55160S(), vVar2.mo55160S()) && C87412m.m108589b(vVar.mo55149H(), vVar2.mo55149H()) && C87412m.m108589b(vVar.mo55148G(), vVar2.mo55148G()) && C87412m.m108589b(vVar.mo55147F(), vVar2.mo55147F()) && C87412m.m108589b(vVar.mo55150I(), vVar2.mo55150I()) && vVar.mo55145D() == vVar2.mo55145D() && C87412m.m108589b(vVar.mo55146E(), vVar2.mo55146E()) && vVar.mo55153L() == vVar2.mo55153L() && C87412m.m108589b(vVar.mo55152K(), vVar2.mo55152K()) && C87412m.m108589b(vVar.mo55156O(), vVar2.mo55156O()) && C87412m.m108589b(vVar.mo55151J(), vVar2.mo55151J());
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
        if (!(cVar instanceof C98374v)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98374v vVar = (C98374v) cVar;
        C98374v vVar2 = vVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        vVar2.mo141109q(sb5, "objectId", "", vVar.mo55162U(), z2);
        vVar2.mo141109q(sb5, "objectNonceId", "", vVar.mo55163V(), z2);
        C98374v vVar3 = vVar;
        vVar3.mo141109q(sb5, "feedType", "", Integer.valueOf(vVar.mo55155N()), z2);
        vVar3.mo141109q(sb5, "nickname", "", vVar.mo55161T(), z2);
        vVar3.mo141109q(sb5, "username", "", vVar.mo55164W(), z2);
        vVar3.mo141109q(sb5, "avatar", "", vVar.mo55144C(), z2);
        vVar3.mo141109q(sb5, "desc", "", vVar.mo55154M(), z2);
        vVar.mo141109q(sb5, "mediaCount", "", Integer.valueOf(vVar.mo55158Q()), z2);
        StringBuilder sb6 = sb;
        vVar.mo141109q(sb6, C66261f3.COL_LOCALID, "", Long.valueOf(vVar.mo55157P()), z2);
        C98374v vVar4 = vVar;
        vVar4.mo141109q(sb6, "authIconType", "", Integer.valueOf(vVar.mo55142A()), z2);
        vVar4.mo141109q(sb6, "authIconUrl", "", vVar.mo55143B(), z2);
        vVar4.mo141109q(sb6, "mediaList", "media", vVar.mo55159R(), z2);
        vVar4.mo141109q(sb6, "megaVideo", "", vVar.mo55160S(), z2);
        vVar4.mo141109q(sb6, "bizUsername", "", vVar.mo55149H(), z2);
        vVar4.mo141109q(sb6, "bizNickname", "", vVar.mo55148G(), z2);
        vVar4.mo141109q(sb6, "bizAvatar", "", vVar.mo55147F(), z2);
        vVar4.mo141109q(sb6, "bizUsernameV2", "", vVar.mo55150I(), z2);
        C98374v vVar5 = vVar;
        vVar5.mo141109q(sb6, "bizAuthIconType", "", Integer.valueOf(vVar.mo55145D()), z2);
        vVar5.mo141109q(sb6, "bizAuthIconUrl", "", vVar.mo55146E(), z2);
        C98374v vVar6 = vVar;
        vVar6.mo141109q(sb6, "coverEffectType", "", Integer.valueOf(vVar.mo55153L()), z2);
        vVar6.mo141109q(sb6, "coverEffectText", "", vVar.mo55152K(), z2);
        vVar6.mo141109q(sb6, "finderForwardSource", "", vVar.mo55156O(), z2);
        vVar6.mo141109q(sb6, "contactJumpInfoStr", "", vVar.mo55151J(), z2);
        sb.append("</" + str + '>');
        vVar.mo141110r(sb, str2);
        String sb7 = sb.toString();
        C87412m.m108593f(sb7, "xmlBuilder.toString()");
        return sb7;
    }
}
