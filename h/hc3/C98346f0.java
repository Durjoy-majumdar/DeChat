package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.f0 */
public final class C98346f0 extends C101653b {
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
        if (cVar instanceof C98345e0) {
            C98345e0 e0Var = (C98345e0) cVar;
            String f = e0Var.mo141101f(str, str2);
            String y = e0Var.mo141117y(map.get('.' + f + ".finderLiveID"), e0Var.mo54799Q());
            if (y != null) {
                e0Var.mo54831w0(y);
            }
            String y2 = e0Var.mo141117y(map.get('.' + f + ".finderUsername"), e0Var.mo54802T());
            if (y2 != null) {
                e0Var.mo54834z0(y2);
            }
            String y3 = e0Var.mo141117y(map.get('.' + f + ".finderObjectID"), e0Var.mo54801S());
            if (y3 != null) {
                e0Var.mo54833y0(y3);
            }
            String y4 = e0Var.mo141117y(map.get('.' + f + ".nickname"), e0Var.mo54809a0());
            if (y4 != null) {
                e0Var.mo54783G0(y4);
            }
            String y5 = e0Var.mo141117y(map.get('.' + f + ".desc"), e0Var.mo54788J());
            if (y5 != null) {
                e0Var.mo54824p0(y5);
            }
            String y6 = e0Var.mo141117y(map.get('.' + f + ".finderNonceID"), e0Var.mo54800R());
            if (y6 != null) {
                e0Var.mo54832x0(y6);
            }
            String y7 = e0Var.mo141117y(map.get('.' + f + ".headUrl"), e0Var.mo54803U());
            if (y7 != null) {
                e0Var.mo54771A0(y7);
            }
            Integer w = e0Var.mo141115w(map.get('.' + f + ".extFlag"), Integer.valueOf(e0Var.mo54798P()));
            if (w != null) {
                e0Var.mo54830v0(w.intValue());
            }
            if (map.containsKey('.' + f + ".media")) {
                C98351h0 h0Var = new C98351h0();
                e0Var.mo141105m(h0Var, map, "media", f);
                e0Var.mo54781F0(h0Var);
            }
            Integer w2 = e0Var.mo141115w(map.get('.' + f + ".liveStatus"), Integer.valueOf(e0Var.mo54806X()));
            if (w2 != null) {
                e0Var.mo54777D0(w2.intValue());
            }
            Integer w3 = e0Var.mo141115w(map.get('.' + f + ".sourceType"), Integer.valueOf(e0Var.mo54813e0()));
            if (w3 != null) {
                e0Var.mo54791K0(w3.intValue());
            }
            Integer w4 = e0Var.mo141115w(map.get('.' + f + ".liveSourceTypeStr"), Integer.valueOf(e0Var.mo54805W()));
            if (w4 != null) {
                e0Var.mo54775C0(w4.intValue());
            }
            String y8 = e0Var.mo141117y(map.get('.' + f + ".ecSource"), e0Var.mo54790K());
            if (y8 != null) {
                e0Var.mo54825q0(y8);
            }
            Integer w5 = e0Var.mo141115w(map.get('.' + f + ".authIconType"), Integer.valueOf(e0Var.mo54770A()));
            if (w5 != null) {
                e0Var.mo54815g0(w5.intValue());
            }
            String y9 = e0Var.mo141117y(map.get('.' + f + ".authIconUrl"), e0Var.mo54772B());
            if (y9 != null) {
                e0Var.mo54816h0(y9);
            }
            Integer w6 = e0Var.mo141115w(map.get('.' + f + ".bindType"), Integer.valueOf(e0Var.mo54774C()));
            if (w6 != null) {
                e0Var.mo54817i0(w6.intValue());
            }
            String y15 = e0Var.mo141117y(map.get('.' + f + ".bizUsername"), e0Var.mo54778E());
            if (y15 != null) {
                e0Var.mo54819k0(y15);
            }
            String y16 = e0Var.mo141117y(map.get('.' + f + ".bizNickname"), e0Var.mo54776D());
            if (y16 != null) {
                e0Var.mo54818j0(y16);
            }
            Integer w7 = e0Var.mo141115w(map.get('.' + f + ".chargeFlag"), Integer.valueOf(e0Var.mo54782G()));
            if (w7 != null) {
                e0Var.mo54821m0(w7.intValue());
            }
            String y17 = e0Var.mo141117y(map.get('.' + f + ".liveNickname"), e0Var.mo54804V());
            if (y17 != null) {
                e0Var.mo54773B0(y17);
            }
            String y18 = e0Var.mo141117y(map.get('.' + f + ".liveUsername"), e0Var.mo54807Y());
            if (y18 != null) {
                e0Var.mo54779E0(y18);
            }
            String y19 = e0Var.mo141117y(map.get('.' + f + ".byPassInfoString"), e0Var.mo54780F());
            if (y19 != null) {
                e0Var.mo54820l0(y19);
            }
            String y25 = e0Var.mo141117y(map.get('.' + f + ".relayIndex"), e0Var.mo54811c0());
            if (y25 != null) {
                e0Var.mo54787I0(y25);
            }
            String y26 = e0Var.mo141117y(map.get('.' + f + ".eventNickname"), e0Var.mo54795N());
            if (y26 != null) {
                e0Var.mo54828t0(y26);
            }
            String y27 = e0Var.mo141117y(map.get('.' + f + ".eventHeadUrl"), e0Var.mo54792L());
            if (y27 != null) {
                e0Var.mo54826r0(y27);
            }
            String y28 = e0Var.mo141117y(map.get('.' + f + ".eventId"), e0Var.mo54794M());
            if (y28 != null) {
                e0Var.mo54827s0(y28);
            }
            String y29 = e0Var.mo141117y(map.get('.' + f + ".participantIdentity"), e0Var.mo54810b0());
            if (y29 != null) {
                e0Var.mo54785H0(y29);
            }
            String y34 = e0Var.mo141117y(map.get('.' + f + ".eventStatus"), e0Var.mo54796O());
            if (y34 != null) {
                e0Var.mo54829u0(y34);
            }
            String y35 = e0Var.mo141117y(map.get('.' + f + ".streamStatus"), e0Var.mo54814f0());
            if (y35 != null) {
                e0Var.mo54793L0(y35);
            }
            Integer w8 = e0Var.mo141115w(map.get('.' + f + ".coverEffectType"), Integer.valueOf(e0Var.mo54786I()));
            if (w8 != null) {
                e0Var.mo54823o0(w8.intValue());
            }
            String y36 = e0Var.mo141117y(map.get('.' + f + ".coverEffectText"), e0Var.mo54784H());
            if (y36 != null) {
                e0Var.mo54822n0(y36);
            }
            Integer w9 = e0Var.mo141115w(map.get('.' + f + ".replayStatus"), Integer.valueOf(e0Var.mo54812d0()));
            if (w9 != null) {
                e0Var.mo54789J0(w9.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "RecordFinderLiveItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27238g0(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98345e0)) {
            return jSONObject;
        }
        C98345e0 e0Var = (C98345e0) cVar;
        e0Var.mo141106n(jSONObject, "finderLiveID", e0Var.mo54799Q(), z);
        e0Var.mo141106n(jSONObject, "finderUsername", e0Var.mo54802T(), z);
        e0Var.mo141106n(jSONObject, "finderObjectID", e0Var.mo54801S(), z);
        e0Var.mo141106n(jSONObject, "nickname", e0Var.mo54809a0(), z);
        e0Var.mo141106n(jSONObject, "desc", e0Var.mo54788J(), z);
        e0Var.mo141106n(jSONObject, "finderNonceID", e0Var.mo54800R(), z);
        e0Var.mo141106n(jSONObject, "headUrl", e0Var.mo54803U(), z);
        e0Var.mo141106n(jSONObject, "extFlag", Integer.valueOf(e0Var.mo54798P()), z);
        e0Var.mo141106n(jSONObject, "media", e0Var.mo54808Z(), z);
        e0Var.mo141106n(jSONObject, "liveStatus", Integer.valueOf(e0Var.mo54806X()), z);
        e0Var.mo141106n(jSONObject, "sourceType", Integer.valueOf(e0Var.mo54813e0()), z);
        e0Var.mo141106n(jSONObject, "liveSourceTypeStr", Integer.valueOf(e0Var.mo54805W()), z);
        e0Var.mo141106n(jSONObject, "ecSource", e0Var.mo54790K(), z);
        e0Var.mo141106n(jSONObject, "authIconType", Integer.valueOf(e0Var.mo54770A()), z);
        e0Var.mo141106n(jSONObject, "authIconUrl", e0Var.mo54772B(), z);
        e0Var.mo141106n(jSONObject, "bindType", Integer.valueOf(e0Var.mo54774C()), z);
        e0Var.mo141106n(jSONObject, "bizUsername", e0Var.mo54778E(), z);
        e0Var.mo141106n(jSONObject, "bizNickname", e0Var.mo54776D(), z);
        e0Var.mo141106n(jSONObject, "chargeFlag", Integer.valueOf(e0Var.mo54782G()), z);
        e0Var.mo141106n(jSONObject, "liveNickname", e0Var.mo54804V(), z);
        e0Var.mo141106n(jSONObject, "liveUsername", e0Var.mo54807Y(), z);
        e0Var.mo141106n(jSONObject, "byPassInfoString", e0Var.mo54780F(), z);
        e0Var.mo141106n(jSONObject, "relayIndex", e0Var.mo54811c0(), z);
        e0Var.mo141106n(jSONObject, "eventNickname", e0Var.mo54795N(), z);
        e0Var.mo141106n(jSONObject, "eventHeadUrl", e0Var.mo54792L(), z);
        e0Var.mo141106n(jSONObject, "eventId", e0Var.mo54794M(), z);
        e0Var.mo141106n(jSONObject, "participantIdentity", e0Var.mo54810b0(), z);
        e0Var.mo141106n(jSONObject, "eventStatus", e0Var.mo54796O(), z);
        e0Var.mo141106n(jSONObject, "streamStatus", e0Var.mo54814f0(), z);
        e0Var.mo141106n(jSONObject, "coverEffectType", Integer.valueOf(e0Var.mo54786I()), z);
        e0Var.mo141106n(jSONObject, "coverEffectText", e0Var.mo54784H(), z);
        e0Var.mo141106n(jSONObject, "replayStatus", Integer.valueOf(e0Var.mo54812d0()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98345e0) || !(cVar2 instanceof C98345e0)) {
            return false;
        }
        C98345e0 e0Var = (C98345e0) cVar;
        C98345e0 e0Var2 = (C98345e0) cVar2;
        return C87412m.m108589b(e0Var.mo54799Q(), e0Var2.mo54799Q()) && C87412m.m108589b(e0Var.mo54802T(), e0Var2.mo54802T()) && C87412m.m108589b(e0Var.mo54801S(), e0Var2.mo54801S()) && C87412m.m108589b(e0Var.mo54809a0(), e0Var2.mo54809a0()) && C87412m.m108589b(e0Var.mo54788J(), e0Var2.mo54788J()) && C87412m.m108589b(e0Var.mo54800R(), e0Var2.mo54800R()) && C87412m.m108589b(e0Var.mo54803U(), e0Var2.mo54803U()) && e0Var.mo54798P() == e0Var2.mo54798P() && e0Var.mo141098c(e0Var.mo54808Z(), e0Var2.mo54808Z()) && e0Var.mo54806X() == e0Var2.mo54806X() && e0Var.mo54813e0() == e0Var2.mo54813e0() && e0Var.mo54805W() == e0Var2.mo54805W() && C87412m.m108589b(e0Var.mo54790K(), e0Var2.mo54790K()) && e0Var.mo54770A() == e0Var2.mo54770A() && C87412m.m108589b(e0Var.mo54772B(), e0Var2.mo54772B()) && e0Var.mo54774C() == e0Var2.mo54774C() && C87412m.m108589b(e0Var.mo54778E(), e0Var2.mo54778E()) && C87412m.m108589b(e0Var.mo54776D(), e0Var2.mo54776D()) && e0Var.mo54782G() == e0Var2.mo54782G() && C87412m.m108589b(e0Var.mo54804V(), e0Var2.mo54804V()) && C87412m.m108589b(e0Var.mo54807Y(), e0Var2.mo54807Y()) && C87412m.m108589b(e0Var.mo54780F(), e0Var2.mo54780F()) && C87412m.m108589b(e0Var.mo54811c0(), e0Var2.mo54811c0()) && C87412m.m108589b(e0Var.mo54795N(), e0Var2.mo54795N()) && C87412m.m108589b(e0Var.mo54792L(), e0Var2.mo54792L()) && C87412m.m108589b(e0Var.mo54794M(), e0Var2.mo54794M()) && C87412m.m108589b(e0Var.mo54810b0(), e0Var2.mo54810b0()) && C87412m.m108589b(e0Var.mo54796O(), e0Var2.mo54796O()) && C87412m.m108589b(e0Var.mo54814f0(), e0Var2.mo54814f0()) && e0Var.mo54786I() == e0Var2.mo54786I() && C87412m.m108589b(e0Var.mo54784H(), e0Var2.mo54784H()) && e0Var.mo54812d0() == e0Var2.mo54812d0();
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
        if (!(cVar instanceof C98345e0)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98345e0 e0Var = (C98345e0) cVar;
        C98345e0 e0Var2 = e0Var;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        e0Var2.mo141109q(sb5, "finderLiveID", "", e0Var.mo54799Q(), z2);
        e0Var2.mo141109q(sb5, "finderUsername", "", e0Var.mo54802T(), z2);
        e0Var2.mo141109q(sb5, "finderObjectID", "", e0Var.mo54801S(), z2);
        e0Var2.mo141109q(sb5, "nickname", "", e0Var.mo54809a0(), z2);
        e0Var2.mo141109q(sb5, "desc", "", e0Var.mo54788J(), z2);
        e0Var2.mo141109q(sb5, "finderNonceID", "", e0Var.mo54800R(), z2);
        e0Var2.mo141109q(sb5, "headUrl", "", e0Var.mo54803U(), z2);
        C98345e0 e0Var3 = e0Var;
        e0Var3.mo141109q(sb5, "extFlag", "", Integer.valueOf(e0Var.mo54798P()), z2);
        e0Var3.mo141109q(sb5, "media", "", e0Var.mo54808Z(), z2);
        e0Var.mo141109q(sb5, "liveStatus", "", Integer.valueOf(e0Var.mo54806X()), z2);
        e0Var.mo141109q(sb5, "sourceType", "", Integer.valueOf(e0Var.mo54813e0()), z2);
        C98345e0 e0Var4 = e0Var;
        e0Var4.mo141109q(sb5, "liveSourceTypeStr", "", Integer.valueOf(e0Var.mo54805W()), z2);
        e0Var4.mo141109q(sb5, "ecSource", "", e0Var.mo54790K(), z2);
        C98345e0 e0Var5 = e0Var;
        e0Var5.mo141109q(sb5, "authIconType", "", Integer.valueOf(e0Var.mo54770A()), z2);
        e0Var5.mo141109q(sb5, "authIconUrl", "", e0Var.mo54772B(), z2);
        C98345e0 e0Var6 = e0Var;
        e0Var6.mo141109q(sb5, "bindType", "", Integer.valueOf(e0Var.mo54774C()), z2);
        e0Var6.mo141109q(sb5, "bizUsername", "", e0Var.mo54778E(), z2);
        e0Var6.mo141109q(sb5, "bizNickname", "", e0Var.mo54776D(), z2);
        C98345e0 e0Var7 = e0Var;
        e0Var7.mo141109q(sb5, "chargeFlag", "", Integer.valueOf(e0Var.mo54782G()), z2);
        e0Var7.mo141109q(sb5, "liveNickname", "", e0Var.mo54804V(), z2);
        e0Var7.mo141109q(sb5, "liveUsername", "", e0Var.mo54807Y(), z2);
        e0Var7.mo141109q(sb5, "byPassInfoString", "", e0Var.mo54780F(), z2);
        e0Var7.mo141109q(sb5, "relayIndex", "", e0Var.mo54811c0(), z2);
        e0Var7.mo141109q(sb5, "eventNickname", "", e0Var.mo54795N(), z2);
        e0Var7.mo141109q(sb5, "eventHeadUrl", "", e0Var.mo54792L(), z2);
        e0Var7.mo141109q(sb5, "eventId", "", e0Var.mo54794M(), z2);
        e0Var7.mo141109q(sb5, "participantIdentity", "", e0Var.mo54810b0(), z2);
        e0Var7.mo141109q(sb5, "eventStatus", "", e0Var.mo54796O(), z2);
        e0Var7.mo141109q(sb5, "streamStatus", "", e0Var.mo54814f0(), z2);
        C98345e0 e0Var8 = e0Var;
        e0Var8.mo141109q(sb5, "coverEffectType", "", Integer.valueOf(e0Var.mo54786I()), z2);
        e0Var8.mo141109q(sb5, "coverEffectText", "", e0Var.mo54784H(), z2);
        e0Var.mo141109q(sb5, "replayStatus", "", Integer.valueOf(e0Var.mo54812d0()), z2);
        sb.append("</" + str + '>');
        e0Var.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
