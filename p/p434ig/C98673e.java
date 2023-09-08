package p434ig;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ig.e */
public final class C98673e extends C101653b {
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
        if (cVar instanceof C98672d) {
            C98672d dVar = (C98672d) cVar;
            String f = dVar.mo141101f(str, str2);
            Integer w = dVar.mo141115w(map.get('.' + f + ".$datatype"), Integer.valueOf(dVar.mo55274P()));
            if (w != null) {
                dVar.mo55275P0(w.intValue());
            }
            Integer w2 = dVar.mo141115w(map.get('.' + f + ".$datastatus"), Integer.valueOf(dVar.mo55270N()));
            if (w2 != null) {
                dVar.mo55271N0(w2.intValue());
            }
            String y = dVar.mo141117y(map.get('.' + f + ".$dataid"), dVar.mo55264K());
            if (y != null) {
                dVar.mo55265K0(y);
            }
            String y2 = dVar.mo141117y(map.get('.' + f + ".$htmlid"), dVar.mo55290X());
            if (y2 != null) {
                dVar.mo55291X0(y2);
            }
            Integer w3 = dVar.mo141115w(map.get('.' + f + ".$dataillegaltype"), Integer.valueOf(dVar.mo55266L()));
            if (w3 != null) {
                dVar.mo55267L0(w3.intValue());
            }
            String y3 = dVar.mo141117y(map.get('.' + f + ".$datasourceid"), dVar.mo55276Q());
            if (y3 != null) {
                dVar.mo55277Q0(y3);
            }
            String y4 = dVar.mo141117y(map.get('.' + f + ".datafmt"), dVar.mo55262J());
            if (y4 != null) {
                dVar.mo55263J0(y4);
            }
            String y5 = dVar.mo141117y(map.get('.' + f + ".datatitle"), dVar.mo55272O());
            if (y5 != null) {
                dVar.mo55273O0(y5);
            }
            String y6 = dVar.mo141117y(map.get('.' + f + ".datadesc"), dVar.mo55258H());
            if (y6 != null) {
                dVar.mo55259H0(y6);
            }
            String y7 = dVar.mo141117y(map.get('.' + f + ".cdnthumburl"), dVar.mo55256G());
            if (y7 != null) {
                dVar.mo55257G0(y7);
            }
            Integer w4 = dVar.mo141115w(map.get('.' + f + ".thumbwidth"), Integer.valueOf(dVar.mo55346z0()));
            if (w4 != null) {
                dVar.mo55347z1(w4.intValue());
            }
            Integer w5 = dVar.mo141115w(map.get('.' + f + ".thumbheight"), Integer.valueOf(dVar.mo55342x0()));
            if (w5 != null) {
                dVar.mo55343x1(w5.intValue());
            }
            String y8 = dVar.mo141117y(map.get('.' + f + ".cdnthumbkey"), dVar.mo55254F());
            if (y8 != null) {
                dVar.mo55255F0(y8);
            }
            Integer w6 = dVar.mo141115w(map.get('.' + f + ".cdnencryver"), Integer.valueOf(dVar.mo55252E()));
            if (w6 != null) {
                dVar.mo55253E0(w6.intValue());
            }
            Long x = dVar.mo141116x(map.get('.' + f + ".duration"), Long.valueOf(dVar.mo55278R()));
            if (x != null) {
                dVar.mo55279R0(x.longValue());
            }
            String y9 = dVar.mo141117y(map.get('.' + f + ".streamweburl"), dVar.mo55332s0());
            if (y9 != null) {
                dVar.mo55333s1(y9);
            }
            String y15 = dVar.mo141117y(map.get('.' + f + ".streamdataurl"), dVar.mo55326p0());
            if (y15 != null) {
                dVar.mo55327p1(y15);
            }
            String y16 = dVar.mo141117y(map.get('.' + f + ".streamlowbandurl"), dVar.mo55328q0());
            if (y16 != null) {
                dVar.mo55329q1(y16);
            }
            String y17 = dVar.mo141117y(map.get('.' + f + ".dataext"), dVar.mo55260I());
            if (y17 != null) {
                dVar.mo55261I0(y17);
            }
            String y18 = dVar.mo141117y(map.get('.' + f + ".head256md5"), dVar.mo55288W());
            if (y18 != null) {
                dVar.mo55289W0(y18);
            }
            String y19 = dVar.mo141117y(map.get('.' + f + ".thumbfullmd5"), dVar.mo55338v0());
            if (y19 != null) {
                dVar.mo55339v1(y19);
            }
            String y25 = dVar.mo141117y(map.get('.' + f + ".thumbhead256md5"), dVar.mo55340w0());
            if (y25 != null) {
                dVar.mo55341w1(y25);
            }
            Long x2 = dVar.mo141116x(map.get('.' + f + ".thumbsize"), Long.valueOf(dVar.mo55344y0()));
            if (x2 != null) {
                dVar.mo55345y1(x2.longValue());
            }
            String y26 = dVar.mo141117y(map.get('.' + f + ".streamvideoid"), dVar.mo55330r0());
            if (y26 != null) {
                dVar.mo55331r1(y26);
            }
            String y27 = dVar.mo141117y(map.get('.' + f + ".sourcetitle"), dVar.mo55320m0());
            if (y27 != null) {
                dVar.mo55321m1(y27);
            }
            String y28 = dVar.mo141117y(map.get('.' + f + ".sourcename"), dVar.mo55316k0());
            if (y28 != null) {
                dVar.mo55317k1(y28);
            }
            String y29 = dVar.mo141117y(map.get('.' + f + ".sourcedesc"), dVar.mo55312i0());
            if (y29 != null) {
                dVar.mo55313i1(y29);
            }
            String y34 = dVar.mo141117y(map.get('.' + f + ".sourceheadurl"), dVar.mo55314j0());
            if (y34 != null) {
                dVar.mo55315j1(y34);
            }
            String y35 = dVar.mo141117y(map.get('.' + f + ".sourcetime"), dVar.mo55318l0());
            if (y35 != null) {
                dVar.mo55319l1(y35);
            }
            Long x3 = dVar.mo141116x(map.get('.' + f + ".srcMsgCreateTime"), Long.valueOf(dVar.mo55322n0()));
            if (x3 != null) {
                dVar.mo55323n1(x3.longValue());
            }
            String y36 = dVar.mo141117y(map.get('.' + f + ".statextstr"), dVar.mo55324o0());
            if (y36 != null) {
                dVar.mo55325o1(y36);
            }
            String y37 = dVar.mo141117y(map.get('.' + f + ".songalbumurl"), dVar.mo55308g0());
            if (y37 != null) {
                dVar.mo55309g1(y37);
            }
            String y38 = dVar.mo141117y(map.get('.' + f + ".songlyric"), dVar.mo55310h0());
            if (y38 != null) {
                dVar.mo55311h1(y38);
            }
            String y39 = dVar.mo141117y(map.get('.' + f + ".messageuuid"), dVar.mo55294Z());
            if (y39 != null) {
                dVar.mo55295Z0(y39);
            }
            Long x4 = dVar.mo141116x(map.get('.' + f + ".fromnewmsgid"), Long.valueOf(dVar.mo55284U()));
            if (x4 != null) {
                dVar.mo55285U0(x4.longValue());
            }
            String y44 = dVar.mo141117y(map.get('.' + f + ".appid"), dVar.mo55244A());
            if (y44 != null) {
                dVar.mo55245A0(y44);
            }
            String y45 = dVar.mo141117y(map.get('.' + f + ".link"), dVar.mo55292Y());
            if (y45 != null) {
                dVar.mo55293Y0(y45);
            }
            String y46 = dVar.mo141117y(map.get('.' + f + ".brandid"), dVar.mo55246B());
            if (y46 != null) {
                dVar.mo55247B0(y46);
            }
            String y47 = dVar.mo141117y(map.get('.' + f + ".middataurl"), dVar.mo55302d0());
            if (y47 != null) {
                dVar.mo55303d1(y47);
            }
            String y48 = dVar.mo141117y(map.get('.' + f + ".middatakey"), dVar.mo55296a0());
            if (y48 != null) {
                dVar.mo55297a1(y48);
            }
            Long x5 = dVar.mo141116x(map.get('.' + f + ".middatasize"), Long.valueOf(dVar.mo55300c0()));
            if (x5 != null) {
                dVar.mo55301c1(x5.longValue());
            }
            String y49 = dVar.mo141117y(map.get('.' + f + ".middatamd5"), dVar.mo55298b0());
            if (y49 != null) {
                dVar.mo55299b1(y49);
            }
            String y54 = dVar.mo141117y(map.get('.' + f + ".cdndataurl"), dVar.mo55250D());
            if (y54 != null) {
                dVar.mo55251D0(y54);
            }
            String y55 = dVar.mo141117y(map.get('.' + f + ".cdndatakey"), dVar.mo55248C());
            if (y55 != null) {
                dVar.mo55249C0(y55);
            }
            String y56 = dVar.mo141117y(map.get('.' + f + ".fullmd5"), dVar.mo55286V());
            if (y56 != null) {
                dVar.mo55287V0(y56);
            }
            Long x6 = dVar.mo141116x(map.get('.' + f + ".datasize"), Long.valueOf(dVar.mo55268M()));
            if (x6 != null) {
                dVar.mo55269M0(x6.longValue());
            }
            Integer w7 = dVar.mo141115w(map.get('.' + f + ".thumbfiletype"), Integer.valueOf(dVar.mo55336u0()));
            if (w7 != null) {
                dVar.mo55337u1(w7.intValue());
            }
            Integer w8 = dVar.mo141115w(map.get('.' + f + ".midfiletype"), Integer.valueOf(dVar.mo55306f0()));
            if (w8 != null) {
                dVar.mo55307f1(w8.intValue());
            }
            Integer w9 = dVar.mo141115w(map.get('.' + f + ".filetype"), Integer.valueOf(dVar.mo55282T()));
            if (w9 != null) {
                dVar.mo55283T0(w9.intValue());
            }
            String y57 = dVar.mo141117y(map.get('.' + f + ".filepath"), dVar.mo55280S());
            if (y57 != null) {
                dVar.mo55281S0(y57);
            }
            String y58 = dVar.mo141117y(map.get('.' + f + ".midfilepath"), dVar.mo55304e0());
            if (y58 != null) {
                dVar.mo55305e1(y58);
            }
            String y59 = dVar.mo141117y(map.get('.' + f + ".thumbfilepath"), dVar.mo55334t0());
            if (y59 != null) {
                dVar.mo55335t1(y59);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "AlbumDataItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27547f(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98672d)) {
            return jSONObject;
        }
        C98672d dVar = (C98672d) cVar;
        dVar.mo141106n(jSONObject, "datatype", Integer.valueOf(dVar.mo55274P()), z);
        dVar.mo141106n(jSONObject, "datastatus", Integer.valueOf(dVar.mo55270N()), z);
        dVar.mo141106n(jSONObject, "dataid", dVar.mo55264K(), z);
        dVar.mo141106n(jSONObject, "htmlid", dVar.mo55290X(), z);
        dVar.mo141106n(jSONObject, "dataillegaltype", Integer.valueOf(dVar.mo55266L()), z);
        dVar.mo141106n(jSONObject, "datasourceid", dVar.mo55276Q(), z);
        dVar.mo141106n(jSONObject, "datafmt", dVar.mo55262J(), z);
        dVar.mo141106n(jSONObject, "datatitle", dVar.mo55272O(), z);
        dVar.mo141106n(jSONObject, "datadesc", dVar.mo55258H(), z);
        dVar.mo141106n(jSONObject, "cdnthumburl", dVar.mo55256G(), z);
        dVar.mo141106n(jSONObject, "thumbwidth", Integer.valueOf(dVar.mo55346z0()), z);
        dVar.mo141106n(jSONObject, "thumbheight", Integer.valueOf(dVar.mo55342x0()), z);
        dVar.mo141106n(jSONObject, "cdnthumbkey", dVar.mo55254F(), z);
        dVar.mo141106n(jSONObject, "cdnencryver", Integer.valueOf(dVar.mo55252E()), z);
        dVar.mo141106n(jSONObject, "duration", Long.valueOf(dVar.mo55278R()), z);
        dVar.mo141106n(jSONObject, "streamweburl", dVar.mo55332s0(), z);
        dVar.mo141106n(jSONObject, "streamdataurl", dVar.mo55326p0(), z);
        dVar.mo141106n(jSONObject, "streamlowbandurl", dVar.mo55328q0(), z);
        dVar.mo141106n(jSONObject, "dataext", dVar.mo55260I(), z);
        dVar.mo141106n(jSONObject, "head256md5", dVar.mo55288W(), z);
        dVar.mo141106n(jSONObject, "thumbfullmd5", dVar.mo55338v0(), z);
        dVar.mo141106n(jSONObject, "thumbhead256md5", dVar.mo55340w0(), z);
        dVar.mo141106n(jSONObject, "thumbsize", Long.valueOf(dVar.mo55344y0()), z);
        dVar.mo141106n(jSONObject, "streamvideoid", dVar.mo55330r0(), z);
        dVar.mo141106n(jSONObject, "sourcetitle", dVar.mo55320m0(), z);
        dVar.mo141106n(jSONObject, "sourcename", dVar.mo55316k0(), z);
        dVar.mo141106n(jSONObject, "sourcedesc", dVar.mo55312i0(), z);
        dVar.mo141106n(jSONObject, "sourceheadurl", dVar.mo55314j0(), z);
        dVar.mo141106n(jSONObject, "sourcetime", dVar.mo55318l0(), z);
        dVar.mo141106n(jSONObject, "srcMsgCreateTime", Long.valueOf(dVar.mo55322n0()), z);
        dVar.mo141106n(jSONObject, "statextstr", dVar.mo55324o0(), z);
        dVar.mo141106n(jSONObject, "songalbumurl", dVar.mo55308g0(), z);
        dVar.mo141106n(jSONObject, "songlyric", dVar.mo55310h0(), z);
        dVar.mo141106n(jSONObject, "messageuuid", dVar.mo55294Z(), z);
        dVar.mo141106n(jSONObject, "fromnewmsgid", Long.valueOf(dVar.mo55284U()), z);
        dVar.mo141106n(jSONObject, "appid", dVar.mo55244A(), z);
        dVar.mo141106n(jSONObject, "link", dVar.mo55292Y(), z);
        dVar.mo141106n(jSONObject, "brandid", dVar.mo55246B(), z);
        dVar.mo141106n(jSONObject, "middataurl", dVar.mo55302d0(), z);
        dVar.mo141106n(jSONObject, "middatakey", dVar.mo55296a0(), z);
        dVar.mo141106n(jSONObject, "middatasize", Long.valueOf(dVar.mo55300c0()), z);
        dVar.mo141106n(jSONObject, "middatamd5", dVar.mo55298b0(), z);
        dVar.mo141106n(jSONObject, "cdndataurl", dVar.mo55250D(), z);
        dVar.mo141106n(jSONObject, "cdndatakey", dVar.mo55248C(), z);
        dVar.mo141106n(jSONObject, "fullmd5", dVar.mo55286V(), z);
        dVar.mo141106n(jSONObject, "datasize", Long.valueOf(dVar.mo55268M()), z);
        dVar.mo141106n(jSONObject, "thumbfiletype", Integer.valueOf(dVar.mo55336u0()), z);
        dVar.mo141106n(jSONObject, "midfiletype", Integer.valueOf(dVar.mo55306f0()), z);
        dVar.mo141106n(jSONObject, "filetype", Integer.valueOf(dVar.mo55282T()), z);
        dVar.mo141106n(jSONObject, "filepath", dVar.mo55280S(), z);
        dVar.mo141106n(jSONObject, "midfilepath", dVar.mo55304e0(), z);
        dVar.mo141106n(jSONObject, "thumbfilepath", dVar.mo55334t0(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98672d) || !(cVar2 instanceof C98672d)) {
            return false;
        }
        C98672d dVar = (C98672d) cVar;
        C98672d dVar2 = (C98672d) cVar2;
        return dVar.mo55274P() == dVar2.mo55274P() && dVar.mo55270N() == dVar2.mo55270N() && C87412m.m108589b(dVar.mo55264K(), dVar2.mo55264K()) && C87412m.m108589b(dVar.mo55290X(), dVar2.mo55290X()) && dVar.mo55266L() == dVar2.mo55266L() && C87412m.m108589b(dVar.mo55276Q(), dVar2.mo55276Q()) && C87412m.m108589b(dVar.mo55262J(), dVar2.mo55262J()) && C87412m.m108589b(dVar.mo55272O(), dVar2.mo55272O()) && C87412m.m108589b(dVar.mo55258H(), dVar2.mo55258H()) && C87412m.m108589b(dVar.mo55256G(), dVar2.mo55256G()) && dVar.mo55346z0() == dVar2.mo55346z0() && dVar.mo55342x0() == dVar2.mo55342x0() && C87412m.m108589b(dVar.mo55254F(), dVar2.mo55254F()) && dVar.mo55252E() == dVar2.mo55252E() && dVar.mo55278R() == dVar2.mo55278R() && C87412m.m108589b(dVar.mo55332s0(), dVar2.mo55332s0()) && C87412m.m108589b(dVar.mo55326p0(), dVar2.mo55326p0()) && C87412m.m108589b(dVar.mo55328q0(), dVar2.mo55328q0()) && C87412m.m108589b(dVar.mo55260I(), dVar2.mo55260I()) && C87412m.m108589b(dVar.mo55288W(), dVar2.mo55288W()) && C87412m.m108589b(dVar.mo55338v0(), dVar2.mo55338v0()) && C87412m.m108589b(dVar.mo55340w0(), dVar2.mo55340w0()) && dVar.mo55344y0() == dVar2.mo55344y0() && C87412m.m108589b(dVar.mo55330r0(), dVar2.mo55330r0()) && C87412m.m108589b(dVar.mo55320m0(), dVar2.mo55320m0()) && C87412m.m108589b(dVar.mo55316k0(), dVar2.mo55316k0()) && C87412m.m108589b(dVar.mo55312i0(), dVar2.mo55312i0()) && C87412m.m108589b(dVar.mo55314j0(), dVar2.mo55314j0()) && C87412m.m108589b(dVar.mo55318l0(), dVar2.mo55318l0()) && dVar.mo55322n0() == dVar2.mo55322n0() && C87412m.m108589b(dVar.mo55324o0(), dVar2.mo55324o0()) && C87412m.m108589b(dVar.mo55308g0(), dVar2.mo55308g0()) && C87412m.m108589b(dVar.mo55310h0(), dVar2.mo55310h0()) && C87412m.m108589b(dVar.mo55294Z(), dVar2.mo55294Z()) && dVar.mo55284U() == dVar2.mo55284U() && C87412m.m108589b(dVar.mo55244A(), dVar2.mo55244A()) && C87412m.m108589b(dVar.mo55292Y(), dVar2.mo55292Y()) && C87412m.m108589b(dVar.mo55246B(), dVar2.mo55246B()) && C87412m.m108589b(dVar.mo55302d0(), dVar2.mo55302d0()) && C87412m.m108589b(dVar.mo55296a0(), dVar2.mo55296a0()) && dVar.mo55300c0() == dVar2.mo55300c0() && C87412m.m108589b(dVar.mo55298b0(), dVar2.mo55298b0()) && C87412m.m108589b(dVar.mo55250D(), dVar2.mo55250D()) && C87412m.m108589b(dVar.mo55248C(), dVar2.mo55248C()) && C87412m.m108589b(dVar.mo55286V(), dVar2.mo55286V()) && dVar.mo55268M() == dVar2.mo55268M() && dVar.mo55336u0() == dVar2.mo55336u0() && dVar.mo55306f0() == dVar2.mo55306f0() && dVar.mo55282T() == dVar2.mo55282T() && C87412m.m108589b(dVar.mo55280S(), dVar2.mo55280S()) && C87412m.m108589b(dVar.mo55304e0(), dVar2.mo55304e0()) && C87412m.m108589b(dVar.mo55334t0(), dVar2.mo55334t0());
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
        if (!(cVar instanceof C98672d)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C98672d dVar = (C98672d) cVar;
        dVar.mo141108p(sb, "datatype", Integer.valueOf(dVar.mo55274P()), z);
        dVar.mo141108p(sb, "datastatus", Integer.valueOf(dVar.mo55270N()), z);
        dVar.mo141108p(sb, "dataid", dVar.mo55264K(), z);
        dVar.mo141108p(sb, "htmlid", dVar.mo55290X(), z);
        dVar.mo141108p(sb, "dataillegaltype", Integer.valueOf(dVar.mo55266L()), z);
        dVar.mo141108p(sb, "datasourceid", dVar.mo55276Q(), z);
        sb.append(">");
        C98672d dVar2 = dVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        dVar2.mo141109q(sb5, "datafmt", "", dVar.mo55262J(), z2);
        dVar2.mo141109q(sb5, "datatitle", "", dVar.mo55272O(), z2);
        dVar2.mo141109q(sb5, "datadesc", "", dVar.mo55258H(), z2);
        dVar2.mo141109q(sb5, "cdnthumburl", "", dVar.mo55256G(), z2);
        dVar.mo141109q(sb5, "thumbwidth", "", Integer.valueOf(dVar.mo55346z0()), z2);
        C98672d dVar3 = dVar;
        dVar3.mo141109q(sb5, "thumbheight", "", Integer.valueOf(dVar.mo55342x0()), z2);
        dVar3.mo141109q(sb5, "cdnthumbkey", "", dVar.mo55254F(), z2);
        dVar.mo141109q(sb5, "cdnencryver", "", Integer.valueOf(dVar.mo55252E()), z2);
        C98672d dVar4 = dVar;
        StringBuilder sb6 = sb;
        dVar4.mo141109q(sb6, "duration", "", Long.valueOf(dVar.mo55278R()), z2);
        dVar4.mo141109q(sb6, "streamweburl", "", dVar.mo55332s0(), z2);
        dVar4.mo141109q(sb6, "streamdataurl", "", dVar.mo55326p0(), z2);
        dVar4.mo141109q(sb6, "streamlowbandurl", "", dVar.mo55328q0(), z2);
        dVar4.mo141109q(sb6, "dataext", "", dVar.mo55260I(), z2);
        dVar4.mo141109q(sb6, "head256md5", "", dVar.mo55288W(), z2);
        dVar4.mo141109q(sb6, "thumbfullmd5", "", dVar.mo55338v0(), z2);
        dVar4.mo141109q(sb6, "thumbhead256md5", "", dVar.mo55340w0(), z2);
        C98672d dVar5 = dVar;
        StringBuilder sb7 = sb;
        dVar5.mo141109q(sb7, "thumbsize", "", Long.valueOf(dVar.mo55344y0()), z2);
        dVar5.mo141109q(sb7, "streamvideoid", "", dVar.mo55330r0(), z2);
        dVar5.mo141109q(sb7, "sourcetitle", "", dVar.mo55320m0(), z2);
        dVar5.mo141109q(sb7, "sourcename", "", dVar.mo55316k0(), z2);
        dVar5.mo141109q(sb7, "sourcedesc", "", dVar.mo55312i0(), z2);
        dVar5.mo141109q(sb7, "sourceheadurl", "", dVar.mo55314j0(), z2);
        dVar5.mo141109q(sb7, "sourcetime", "", dVar.mo55318l0(), z2);
        C98672d dVar6 = dVar;
        StringBuilder sb8 = sb;
        dVar6.mo141109q(sb8, "srcMsgCreateTime", "", Long.valueOf(dVar.mo55322n0()), z2);
        dVar6.mo141109q(sb8, "statextstr", "", dVar.mo55324o0(), z2);
        dVar6.mo141109q(sb8, "songalbumurl", "", dVar.mo55308g0(), z2);
        dVar6.mo141109q(sb8, "songlyric", "", dVar.mo55310h0(), z2);
        dVar6.mo141109q(sb8, "messageuuid", "", dVar.mo55294Z(), z2);
        C98672d dVar7 = dVar;
        StringBuilder sb9 = sb;
        dVar7.mo141109q(sb9, "fromnewmsgid", "", Long.valueOf(dVar.mo55284U()), z2);
        dVar7.mo141109q(sb9, "appid", "", dVar.mo55244A(), z2);
        dVar7.mo141109q(sb9, "link", "", dVar.mo55292Y(), z2);
        dVar7.mo141109q(sb9, "brandid", "", dVar.mo55246B(), z2);
        dVar7.mo141109q(sb9, "middataurl", "", dVar.mo55302d0(), z2);
        dVar7.mo141109q(sb9, "middatakey", "", dVar.mo55296a0(), z2);
        C98672d dVar8 = dVar;
        StringBuilder sb10 = sb;
        dVar8.mo141109q(sb10, "middatasize", "", Long.valueOf(dVar.mo55300c0()), z2);
        dVar8.mo141109q(sb10, "middatamd5", "", dVar.mo55298b0(), z2);
        dVar8.mo141109q(sb10, "cdndataurl", "", dVar.mo55250D(), z2);
        dVar8.mo141109q(sb10, "cdndatakey", "", dVar.mo55248C(), z2);
        dVar8.mo141109q(sb10, "fullmd5", "", dVar.mo55286V(), z2);
        StringBuilder sb11 = sb;
        dVar.mo141109q(sb11, "datasize", "", Long.valueOf(dVar.mo55268M()), z2);
        dVar.mo141109q(sb11, "thumbfiletype", "", Integer.valueOf(dVar.mo55336u0()), z2);
        dVar.mo141109q(sb11, "midfiletype", "", Integer.valueOf(dVar.mo55306f0()), z2);
        C98672d dVar9 = dVar;
        dVar9.mo141109q(sb11, "filetype", "", Integer.valueOf(dVar.mo55282T()), z2);
        dVar9.mo141109q(sb11, "filepath", "", dVar.mo55280S(), z2);
        dVar9.mo141109q(sb11, "midfilepath", "", dVar.mo55304e0(), z2);
        dVar9.mo141109q(sb11, "thumbfilepath", "", dVar.mo55334t0(), z2);
        sb.append("</" + str + '>');
        dVar.mo141110r(sb, str2);
        String sb12 = sb.toString();
        C87412m.m108593f(sb12, "xmlBuilder.toString()");
        return sb12;
    }
}
