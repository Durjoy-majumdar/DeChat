package ic3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ic3.b */
public final class C27484b extends C101653b {
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
        if (cVar instanceof C98663a) {
            C98663a aVar = (C98663a) cVar;
            String f = aVar.mo141101f(str, str2);
            String y = aVar.mo141117y(map.get('.' + f + ".$aeskey"), aVar.mo55190A());
            if (y != null) {
                aVar.mo55210U(y);
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".$cdnvideourl"), aVar.mo55197H());
            if (y2 != null) {
                aVar.mo55217b0(y2);
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".$cdnthumbaeskey"), aVar.mo55192C());
            if (y3 != null) {
                aVar.mo55212W(y3);
            }
            String y4 = aVar.mo141117y(map.get('.' + f + ".$cdnthumburl"), aVar.mo55195F());
            if (y4 != null) {
                aVar.mo55215Z(y4);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".$length"), Integer.valueOf(aVar.mo55200K()));
            if (w != null) {
                aVar.mo55220e0(w.intValue());
            }
            Integer w2 = aVar.mo141115w(map.get('.' + f + ".$playlength"), Integer.valueOf(aVar.mo55204O()));
            if (w2 != null) {
                aVar.mo55225j0(w2.intValue());
            }
            Integer w3 = aVar.mo141115w(map.get('.' + f + ".$cdnthumblength"), Integer.valueOf(aVar.mo55194E()));
            if (w3 != null) {
                aVar.mo55214Y(w3.intValue());
            }
            Integer w4 = aVar.mo141115w(map.get('.' + f + ".$cdnthumbwidth"), Integer.valueOf(aVar.mo55196G()));
            if (w4 != null) {
                aVar.mo55216a0(w4.intValue());
            }
            Integer w5 = aVar.mo141115w(map.get('.' + f + ".$cdnthumbheight"), Integer.valueOf(aVar.mo55193D()));
            if (w5 != null) {
                aVar.mo55213X(w5.intValue());
            }
            String y5 = aVar.mo141117y(map.get('.' + f + ".$fromusername"), aVar.mo55199J());
            if (y5 != null) {
                aVar.mo55219d0(y5);
            }
            String y6 = aVar.mo141117y(map.get('.' + f + ".$md5"), aVar.mo55201L());
            if (y6 != null) {
                aVar.mo55221f0(y6);
            }
            String y7 = aVar.mo141117y(map.get('.' + f + ".$newmd5"), aVar.mo55202M());
            if (y7 != null) {
                aVar.mo55222g0(y7);
            }
            Integer w6 = aVar.mo141115w(map.get('.' + f + ".$isplaceholder"), Integer.valueOf(aVar.mo55208S()));
            if (w6 != null) {
                aVar.mo55224i0(w6.intValue());
            }
            String y8 = aVar.mo141117y(map.get('.' + f + ".$rawmd5"), aVar.mo55206Q());
            if (y8 != null) {
                aVar.mo55227l0(y8);
            }
            Integer w7 = aVar.mo141115w(map.get('.' + f + ".$rawlength"), Integer.valueOf(aVar.mo55205P()));
            if (w7 != null) {
                aVar.mo55226k0(w7.intValue());
            }
            String y9 = aVar.mo141117y(map.get('.' + f + ".$cdnrawvideourl"), aVar.mo55198I());
            if (y9 != null) {
                aVar.mo55218c0(y9);
            }
            String y15 = aVar.mo141117y(map.get('.' + f + ".$cdnrawvideoaeskey"), aVar.mo55191B());
            if (y15 != null) {
                aVar.mo55211V(y15);
            }
            Integer w8 = aVar.mo141115w(map.get('.' + f + ".$overwritenewmsgid"), Integer.valueOf(aVar.mo55203N()));
            if (w8 != null) {
                aVar.mo55223h0(w8.intValue());
            }
            Integer w9 = aVar.mo141115w(map.get('.' + f + ".$isad"), Integer.valueOf(aVar.mo55207R()));
            if (w9 != null) {
                aVar.mo55209T(w9.intValue());
            }
            String y16 = aVar.mo141117y(map.get('.' + f + ".$thumbfullmd5"), aVar.mo55233r0());
            if (y16 != null) {
                aVar.mo55240y0(y16);
            }
            String y17 = aVar.mo141117y(map.get('.' + f + ".$rawfilename"), aVar.mo55230o0());
            if (y17 != null) {
                aVar.mo55237v0(y17);
            }
            Integer w15 = aVar.mo141115w(map.get('.' + f + ".$rawoffset"), Integer.valueOf(aVar.mo55231p0()));
            if (w15 != null) {
                aVar.mo55238w0(w15.intValue());
            }
            Integer w16 = aVar.mo141115w(map.get('.' + f + ".$rawtotallen"), Integer.valueOf(aVar.mo55232q0()));
            if (w16 != null) {
                aVar.mo55239x0(w16.intValue());
            }
            String y18 = aVar.mo141117y(map.get('.' + f + ".$filename"), aVar.mo55228m0());
            if (y18 != null) {
                aVar.mo55235t0(y18);
            }
            Integer w17 = aVar.mo141115w(map.get('.' + f + ".$offset"), Integer.valueOf(aVar.mo55229n0()));
            if (w17 != null) {
                aVar.mo55236u0(w17.intValue());
            }
            Integer w18 = aVar.mo141115w(map.get('.' + f + ".$totallen"), Integer.valueOf(aVar.mo55234s0()));
            if (w18 != null) {
                aVar.mo55241z0(w18.intValue());
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
        return new C27485c(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98663a)) {
            return jSONObject;
        }
        C98663a aVar = (C98663a) cVar;
        aVar.mo141106n(jSONObject, "aeskey", aVar.mo55190A(), z);
        aVar.mo141106n(jSONObject, "cdnvideourl", aVar.mo55197H(), z);
        aVar.mo141106n(jSONObject, "cdnthumbaeskey", aVar.mo55192C(), z);
        aVar.mo141106n(jSONObject, "cdnthumburl", aVar.mo55195F(), z);
        aVar.mo141106n(jSONObject, "length", Integer.valueOf(aVar.mo55200K()), z);
        aVar.mo141106n(jSONObject, "playlength", Integer.valueOf(aVar.mo55204O()), z);
        aVar.mo141106n(jSONObject, "cdnthumblength", Integer.valueOf(aVar.mo55194E()), z);
        aVar.mo141106n(jSONObject, "cdnthumbwidth", Integer.valueOf(aVar.mo55196G()), z);
        aVar.mo141106n(jSONObject, "cdnthumbheight", Integer.valueOf(aVar.mo55193D()), z);
        aVar.mo141106n(jSONObject, "fromusername", aVar.mo55199J(), z);
        aVar.mo141106n(jSONObject, "md5", aVar.mo55201L(), z);
        aVar.mo141106n(jSONObject, "newmd5", aVar.mo55202M(), z);
        aVar.mo141106n(jSONObject, "isplaceholder", Integer.valueOf(aVar.mo55208S()), z);
        aVar.mo141106n(jSONObject, "rawmd5", aVar.mo55206Q(), z);
        aVar.mo141106n(jSONObject, "rawlength", Integer.valueOf(aVar.mo55205P()), z);
        aVar.mo141106n(jSONObject, "cdnrawvideourl", aVar.mo55198I(), z);
        aVar.mo141106n(jSONObject, "cdnrawvideoaeskey", aVar.mo55191B(), z);
        aVar.mo141106n(jSONObject, "overwritenewmsgid", Integer.valueOf(aVar.mo55203N()), z);
        aVar.mo141106n(jSONObject, "isad", Integer.valueOf(aVar.mo55207R()), z);
        aVar.mo141106n(jSONObject, "thumbfullmd5", aVar.mo55233r0(), z);
        aVar.mo141106n(jSONObject, "rawfilename", aVar.mo55230o0(), z);
        aVar.mo141106n(jSONObject, "rawoffset", Integer.valueOf(aVar.mo55231p0()), z);
        aVar.mo141106n(jSONObject, "rawtotallen", Integer.valueOf(aVar.mo55232q0()), z);
        aVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_FILENAME, aVar.mo55228m0(), z);
        aVar.mo141106n(jSONObject, "offset", Integer.valueOf(aVar.mo55229n0()), z);
        aVar.mo141106n(jSONObject, "totallen", Integer.valueOf(aVar.mo55234s0()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98663a) || !(cVar2 instanceof C98663a)) {
            return false;
        }
        C98663a aVar = (C98663a) cVar;
        C98663a aVar2 = (C98663a) cVar2;
        return C87412m.m108589b(aVar.mo55190A(), aVar2.mo55190A()) && C87412m.m108589b(aVar.mo55197H(), aVar2.mo55197H()) && C87412m.m108589b(aVar.mo55192C(), aVar2.mo55192C()) && C87412m.m108589b(aVar.mo55195F(), aVar2.mo55195F()) && aVar.mo55200K() == aVar2.mo55200K() && aVar.mo55204O() == aVar2.mo55204O() && aVar.mo55194E() == aVar2.mo55194E() && aVar.mo55196G() == aVar2.mo55196G() && aVar.mo55193D() == aVar2.mo55193D() && C87412m.m108589b(aVar.mo55199J(), aVar2.mo55199J()) && C87412m.m108589b(aVar.mo55201L(), aVar2.mo55201L()) && C87412m.m108589b(aVar.mo55202M(), aVar2.mo55202M()) && aVar.mo55208S() == aVar2.mo55208S() && C87412m.m108589b(aVar.mo55206Q(), aVar2.mo55206Q()) && aVar.mo55205P() == aVar2.mo55205P() && C87412m.m108589b(aVar.mo55198I(), aVar2.mo55198I()) && C87412m.m108589b(aVar.mo55191B(), aVar2.mo55191B()) && aVar.mo55203N() == aVar2.mo55203N() && aVar.mo55207R() == aVar2.mo55207R() && C87412m.m108589b(aVar.mo55233r0(), aVar2.mo55233r0()) && C87412m.m108589b(aVar.mo55230o0(), aVar2.mo55230o0()) && aVar.mo55231p0() == aVar2.mo55231p0() && aVar.mo55232q0() == aVar2.mo55232q0() && C87412m.m108589b(aVar.mo55228m0(), aVar2.mo55228m0()) && aVar.mo55229n0() == aVar2.mo55229n0() && aVar.mo55234s0() == aVar2.mo55234s0();
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
        if (!(cVar instanceof C98663a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C98663a aVar = (C98663a) cVar;
        aVar.mo141108p(sb, "aeskey", aVar.mo55190A(), z);
        aVar.mo141108p(sb, "cdnvideourl", aVar.mo55197H(), z);
        aVar.mo141108p(sb, "cdnthumbaeskey", aVar.mo55192C(), z);
        aVar.mo141108p(sb, "cdnthumburl", aVar.mo55195F(), z);
        aVar.mo141108p(sb, "length", Integer.valueOf(aVar.mo55200K()), z);
        aVar.mo141108p(sb, "playlength", Integer.valueOf(aVar.mo55204O()), z);
        aVar.mo141108p(sb, "cdnthumblength", Integer.valueOf(aVar.mo55194E()), z);
        aVar.mo141108p(sb, "cdnthumbwidth", Integer.valueOf(aVar.mo55196G()), z);
        aVar.mo141108p(sb, "cdnthumbheight", Integer.valueOf(aVar.mo55193D()), z);
        aVar.mo141108p(sb, "fromusername", aVar.mo55199J(), z);
        aVar.mo141108p(sb, "md5", aVar.mo55201L(), z);
        aVar.mo141108p(sb, "newmd5", aVar.mo55202M(), z);
        aVar.mo141108p(sb, "isplaceholder", Integer.valueOf(aVar.mo55208S()), z);
        aVar.mo141108p(sb, "rawmd5", aVar.mo55206Q(), z);
        aVar.mo141108p(sb, "rawlength", Integer.valueOf(aVar.mo55205P()), z);
        aVar.mo141108p(sb, "cdnrawvideourl", aVar.mo55198I(), z);
        aVar.mo141108p(sb, "cdnrawvideoaeskey", aVar.mo55191B(), z);
        aVar.mo141108p(sb, "overwritenewmsgid", Integer.valueOf(aVar.mo55203N()), z);
        aVar.mo141108p(sb, "isad", Integer.valueOf(aVar.mo55207R()), z);
        aVar.mo141108p(sb, "thumbfullmd5", aVar.mo55233r0(), z);
        aVar.mo141108p(sb, "rawfilename", aVar.mo55230o0(), z);
        aVar.mo141108p(sb, "rawoffset", Integer.valueOf(aVar.mo55231p0()), z);
        aVar.mo141108p(sb, "rawtotallen", Integer.valueOf(aVar.mo55232q0()), z);
        aVar.mo141108p(sb, FFmpegMetadataRetriever.METADATA_KEY_FILENAME, aVar.mo55228m0(), z);
        aVar.mo141108p(sb, "offset", Integer.valueOf(aVar.mo55229n0()), z);
        aVar.mo141108p(sb, "totallen", Integer.valueOf(aVar.mo55234s0()), z);
        sb.append(">");
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "xmlBuilder.toString()");
        return sb5;
    }
}
