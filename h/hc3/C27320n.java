package hc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: hc3.n */
public final class C27320n extends C101653b {
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
        if (cVar instanceof C27313m) {
            C27313m mVar = (C27313m) cVar;
            String f = mVar.mo141101f(str, str2);
            String y = mVar.mo141117y(map.get('.' + f + ".datatitle"), mVar.mo54548I());
            if (y != null) {
                mVar.mo54561V(y);
            }
            String y2 = mVar.mo141117y(map.get('.' + f + ".datadesc"), mVar.mo54544E());
            if (y2 != null) {
                mVar.mo54557R(y2);
            }
            Integer w = mVar.mo141115w(map.get('.' + f + ".$datatype"), Integer.valueOf(mVar.mo54549J()));
            if (w != null) {
                mVar.mo54562W(w.intValue());
            }
            String y3 = mVar.mo141117y(map.get('.' + f + ".$dataid"), mVar.mo54546G());
            if (y3 != null) {
                mVar.mo54559T(y3);
            }
            String y4 = mVar.mo141117y(map.get('.' + f + ".cdnthumburl"), mVar.mo54543D());
            if (y4 != null) {
                mVar.mo54556Q(y4);
            }
            String y5 = mVar.mo141117y(map.get('.' + f + ".cdnthumbkey"), mVar.mo54542C());
            if (y5 != null) {
                mVar.mo54555P(y5);
            }
            String y6 = mVar.mo141117y(map.get('.' + f + ".thumbfullmd5"), mVar.mo54551L());
            if (y6 != null) {
                mVar.mo54564Y(y6);
            }
            Long x = mVar.mo141116x(map.get('.' + f + ".thumbsize"), Long.valueOf(mVar.mo54552M()));
            if (x != null) {
                mVar.mo54565Z(x.longValue());
            }
            String y7 = mVar.mo141117y(map.get('.' + f + ".cdndataurl"), mVar.mo54541B());
            if (y7 != null) {
                mVar.mo54554O(y7);
            }
            String y8 = mVar.mo141117y(map.get('.' + f + ".cdndatakey"), mVar.mo54540A());
            if (y8 != null) {
                mVar.mo54553N(y8);
            }
            String y9 = mVar.mo141117y(map.get('.' + f + ".fullmd5"), mVar.mo54550K());
            if (y9 != null) {
                mVar.mo54563X(y9);
            }
            Long x2 = mVar.mo141116x(map.get('.' + f + ".datasize"), Long.valueOf(mVar.mo54547H()));
            if (x2 != null) {
                mVar.mo54560U(x2.longValue());
            }
            String y15 = mVar.mo141117y(map.get('.' + f + ".dataext"), mVar.mo54545F());
            if (y15 != null) {
                mVar.mo54558S(y15);
            }
            Integer w2 = mVar.mo141115w(map.get('.' + f + ".$datastatus"), Integer.valueOf(mVar.mo54981i0()));
            if (w2 != null) {
                mVar.mo54984j1(w2.intValue());
            }
            String y16 = mVar.mo141117y(map.get('.' + f + ".$htmlid"), mVar.mo55008v0());
            if (y16 != null) {
                mVar.mo55011w1(y16);
            }
            Integer w3 = mVar.mo141115w(map.get('.' + f + ".$dataillegaltype"), Integer.valueOf(mVar.mo54977g0()));
            if (w3 != null) {
                mVar.mo54980h1(w3.intValue());
            }
            String y17 = mVar.mo141117y(map.get('.' + f + ".$datasourceid"), mVar.mo54983j0());
            if (y17 != null) {
                mVar.mo54987k1(y17);
            }
            String y18 = mVar.mo141117y(map.get('.' + f + ".datafmt"), mVar.mo54975f0());
            if (y18 != null) {
                mVar.mo54978g1(y18);
            }
            Integer w4 = mVar.mo141115w(map.get('.' + f + ".thumbwidth"), Integer.valueOf(mVar.mo54949T0()));
            if (w4 != null) {
                mVar.mo54952U1(w4.intValue());
            }
            Integer w5 = mVar.mo141115w(map.get('.' + f + ".thumbheight"), Integer.valueOf(mVar.mo54947S0()));
            if (w5 != null) {
                mVar.mo54950T1(w5.intValue());
            }
            Integer w6 = mVar.mo141115w(map.get('.' + f + ".cdnencryver"), Integer.valueOf(mVar.mo54973e0()));
            if (w6 != null) {
                mVar.mo54976f1(w6.intValue());
            }
            Integer w7 = mVar.mo141115w(map.get('.' + f + ".duration"), Integer.valueOf(mVar.mo54986k0()));
            if (w7 != null) {
                mVar.mo54989l1(w7.intValue());
            }
            String y19 = mVar.mo141117y(map.get('.' + f + ".streamweburl"), mVar.mo54941P0());
            if (y19 != null) {
                mVar.mo54944Q1(y19);
            }
            String y25 = mVar.mo141117y(map.get('.' + f + ".streamdataurl"), mVar.mo54935M0());
            if (y25 != null) {
                mVar.mo54938N1(y25);
            }
            String y26 = mVar.mo141117y(map.get('.' + f + ".streamlowbandurl"), mVar.mo54937N0());
            if (y26 != null) {
                mVar.mo54940O1(y26);
            }
            String y27 = mVar.mo141117y(map.get('.' + f + ".head256md5"), mVar.mo55006u0());
            if (y27 != null) {
                mVar.mo55009v1(y27);
            }
            String y28 = mVar.mo141117y(map.get('.' + f + ".thumbhead256md5"), mVar.mo54945R0());
            if (y28 != null) {
                mVar.mo54948S1(y28);
            }
            String y29 = mVar.mo141117y(map.get('.' + f + ".streamvideoid"), mVar.mo54939O0());
            if (y29 != null) {
                mVar.mo54942P1(y29);
            }
            String y34 = mVar.mo141117y(map.get('.' + f + ".sourcetitle"), mVar.mo54929J0());
            if (y34 != null) {
                mVar.mo54932K1(y34);
            }
            String y35 = mVar.mo141117y(map.get('.' + f + ".sourcename"), mVar.mo54925H0());
            if (y35 != null) {
                mVar.mo54928I1(y35);
            }
            String y36 = mVar.mo141117y(map.get('.' + f + ".sourcedesc"), mVar.mo54921F0());
            if (y36 != null) {
                mVar.mo54924G1(y36);
            }
            String y37 = mVar.mo141117y(map.get('.' + f + ".sourceheadurl"), mVar.mo54923G0());
            if (y37 != null) {
                mVar.mo54926H1(y37);
            }
            String y38 = mVar.mo141117y(map.get('.' + f + ".sourcetime"), mVar.mo54927I0());
            if (y38 != null) {
                mVar.mo54930J1(y38);
            }
            Long x3 = mVar.mo141116x(map.get('.' + f + ".srcMsgCreateTime"), Long.valueOf(mVar.mo54931K0()));
            if (x3 != null) {
                mVar.mo54934L1(x3.longValue());
            }
            String y39 = mVar.mo141117y(map.get('.' + f + ".statextstr"), mVar.mo54933L0());
            if (y39 != null) {
                mVar.mo54936M1(y39);
            }
            String y44 = mVar.mo141117y(map.get('.' + f + ".songalbumurl"), mVar.mo54917D0());
            if (y44 != null) {
                mVar.mo54920E1(y44);
            }
            String y45 = mVar.mo141117y(map.get('.' + f + ".songlyric"), mVar.mo54919E0());
            if (y45 != null) {
                mVar.mo54922F1(y45);
            }
            if (map.containsKey('.' + f + ".recordxml")) {
                C98377x1 x1Var = new C98377x1();
                mVar.mo141105m(x1Var, map, "recordxml", f);
                mVar.mo54918D1(x1Var);
            }
            String y46 = mVar.mo141117y(map.get('.' + f + ".messageuuid"), mVar.mo55014y0());
            if (y46 != null) {
                mVar.mo55017z1(y46);
            }
            Long x4 = mVar.mo141116x(map.get('.' + f + ".fromnewmsgid"), Long.valueOf(mVar.mo55004t0()));
            if (x4 != null) {
                mVar.mo55007u1(x4.longValue());
            }
            String y47 = mVar.mo141117y(map.get('.' + f + ".appid"), mVar.mo54966b0());
            if (y47 != null) {
                mVar.mo54970c1(y47);
            }
            String y48 = mVar.mo141117y(map.get('.' + f + ".link"), mVar.mo55010w0());
            if (y48 != null) {
                mVar.mo55013x1(y48);
            }
            String y49 = mVar.mo141117y(map.get('.' + f + ".brandid"), mVar.mo54969c0());
            if (y49 != null) {
                mVar.mo54972d1(y49);
            }
            String y54 = mVar.mo141117y(map.get('.' + f + ".tpauthkey"), mVar.mo54953V0());
            if (y54 != null) {
                mVar.mo54956W1(y54);
            }
            String y55 = mVar.mo141117y(map.get('.' + f + ".tpaeskey"), mVar.mo54951U0());
            if (y55 != null) {
                mVar.mo54954V1(y55);
            }
            String y56 = mVar.mo141117y(map.get('.' + f + ".tpdataurl"), mVar.mo54955W0());
            if (y56 != null) {
                mVar.mo54958X1(y56);
            }
            String y57 = mVar.mo141117y(map.get('.' + f + ".tpthumburl"), mVar.mo54959Y0());
            if (y57 != null) {
                mVar.mo54962Z1(y57);
            }
            String y58 = mVar.mo141117y(map.get('.' + f + ".tpthumbaeskey"), mVar.mo54957X0());
            if (y58 != null) {
                mVar.mo54960Y1(y58);
            }
            if (map.containsKey('.' + f + ".dataitemsource")) {
                C98366p pVar = new C98366p();
                mVar.mo141105m(pVar, map, "dataitemsource", f);
                mVar.mo54982i1(pVar);
            }
            if (map.containsKey('.' + f + ".locitem")) {
                C98342c1 c1Var = new C98342c1();
                mVar.mo141105m(c1Var, map, "locitem", f);
                mVar.mo55015y1(c1Var);
            }
            if (map.containsKey('.' + f + ".weburlitem")) {
                C98373u1 u1Var = new C98373u1();
                mVar.mo141105m(u1Var, map, "weburlitem", f);
                mVar.mo54968b2(u1Var);
            }
            if (map.containsKey('.' + f + ".finderFeed")) {
                C98374v vVar = new C98374v();
                mVar.mo141105m(vVar, map, "finderFeed", f);
                mVar.mo54997p1(vVar);
            }
            if (map.containsKey('.' + f + ".finderLive")) {
                C98345e0 e0Var = new C98345e0();
                mVar.mo141105m(e0Var, map, "finderLive", f);
                mVar.mo54999q1(e0Var);
            }
            if (map.containsKey('.' + f + ".finderShopWindowShare")) {
                C98363n0 n0Var = new C98363n0();
                mVar.mo141105m(n0Var, map, "finderShopWindowShare", f);
                mVar.mo55003s1(n0Var);
            }
            if (map.containsKey('.' + f + ".finderTopicShareItem")) {
                C27441w0 w0Var = new C27441w0();
                mVar.mo141105m(w0Var, map, "finderTopicShareItem", f);
                mVar.mo54993n1(w0Var);
            }
            if (map.containsKey('.' + f + ".finderTopicShareItem")) {
                C27441w0 w0Var2 = new C27441w0();
                mVar.mo141105m(w0Var2, map, "finderTopicShareItem", f);
                mVar.mo55005t1(w0Var2);
            }
            if (map.containsKey('.' + f + ".finderShareNameCard")) {
                C98359k0 k0Var = new C98359k0();
                mVar.mo141105m(k0Var, map, "finderShareNameCard", f);
                mVar.mo55001r1(k0Var);
            }
            if (map.containsKey('.' + f + ".finderContentColumnSharedItem")) {
                C98370s sVar = new C98370s();
                mVar.mo141105m(sVar, map, "finderContentColumnSharedItem", f);
                mVar.mo54995o1(sVar);
            }
            if (map.containsKey('.' + f + ".favbrandmpvideo")) {
                C98356j jVar = new C98356j();
                mVar.mo141105m(jVar, map, "favbrandmpvideo", f);
                mVar.mo54974e1(jVar);
            }
            if (map.containsKey('.' + f + ".productitem")) {
                C98365o1 o1Var = new C98365o1();
                mVar.mo141105m(o1Var, map, "productitem", f);
                mVar.mo54916C1(o1Var);
            }
            if (map.containsKey('.' + f + ".tvitem")) {
                C98369r1 r1Var = new C98369r1();
                mVar.mo141105m(r1Var, map, "tvitem", f);
                mVar.mo54965a2(r1Var);
            }
            if (map.containsKey('.' + f + ".appbranditem")) {
                C98337a aVar = new C98337a();
                mVar.mo141105m(aVar, map, "appbranditem", f);
                mVar.mo54967b1(aVar);
            }
            if (map.containsKey('.' + f + ".musicShareItem")) {
                C98355i1 i1Var = new C98355i1();
                mVar.mo141105m(i1Var, map, "musicShareItem", f);
                mVar.mo54914B1(i1Var);
            }
            Integer w8 = mVar.mo141115w(map.get('.' + f + ".thumbfiletype"), Integer.valueOf(mVar.mo54943Q0()));
            if (w8 != null) {
                mVar.mo54946R1(w8.intValue());
            }
            Integer w9 = mVar.mo141115w(map.get('.' + f + ".filetype"), Integer.valueOf(mVar.mo54988l0()));
            if (w9 != null) {
                mVar.mo54991m1(w9.intValue());
            }
            Integer w15 = mVar.mo141115w(map.get('.' + f + ".midfiletype"), Integer.valueOf(mVar.mo55016z0()));
            if (w15 != null) {
                mVar.mo54912A1(w15.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "dataitem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27324o(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27313m)) {
            return jSONObject;
        }
        C27313m mVar = (C27313m) cVar;
        mVar.mo141106n(jSONObject, "datatitle", mVar.mo54548I(), z);
        mVar.mo141106n(jSONObject, "datadesc", mVar.mo54544E(), z);
        mVar.mo141106n(jSONObject, "datatype", Integer.valueOf(mVar.mo54549J()), z);
        mVar.mo141106n(jSONObject, "dataid", mVar.mo54546G(), z);
        mVar.mo141106n(jSONObject, "cdnthumburl", mVar.mo54543D(), z);
        mVar.mo141106n(jSONObject, "cdnthumbkey", mVar.mo54542C(), z);
        mVar.mo141106n(jSONObject, "thumbfullmd5", mVar.mo54551L(), z);
        mVar.mo141106n(jSONObject, "thumbsize", Long.valueOf(mVar.mo54552M()), z);
        mVar.mo141106n(jSONObject, "cdndataurl", mVar.mo54541B(), z);
        mVar.mo141106n(jSONObject, "cdndatakey", mVar.mo54540A(), z);
        mVar.mo141106n(jSONObject, "fullmd5", mVar.mo54550K(), z);
        mVar.mo141106n(jSONObject, "datasize", Long.valueOf(mVar.mo54547H()), z);
        mVar.mo141106n(jSONObject, "dataext", mVar.mo54545F(), z);
        mVar.mo141106n(jSONObject, "datastatus", Integer.valueOf(mVar.mo54981i0()), z);
        mVar.mo141106n(jSONObject, "htmlid", mVar.mo55008v0(), z);
        mVar.mo141106n(jSONObject, "dataillegaltype", Integer.valueOf(mVar.mo54977g0()), z);
        mVar.mo141106n(jSONObject, "datasourceid", mVar.mo54983j0(), z);
        mVar.mo141106n(jSONObject, "datafmt", mVar.mo54975f0(), z);
        mVar.mo141106n(jSONObject, "thumbwidth", Integer.valueOf(mVar.mo54949T0()), z);
        mVar.mo141106n(jSONObject, "thumbheight", Integer.valueOf(mVar.mo54947S0()), z);
        mVar.mo141106n(jSONObject, "cdnencryver", Integer.valueOf(mVar.mo54973e0()), z);
        mVar.mo141106n(jSONObject, "duration", Integer.valueOf(mVar.mo54986k0()), z);
        mVar.mo141106n(jSONObject, "streamweburl", mVar.mo54941P0(), z);
        mVar.mo141106n(jSONObject, "streamdataurl", mVar.mo54935M0(), z);
        mVar.mo141106n(jSONObject, "streamlowbandurl", mVar.mo54937N0(), z);
        mVar.mo141106n(jSONObject, "head256md5", mVar.mo55006u0(), z);
        mVar.mo141106n(jSONObject, "thumbhead256md5", mVar.mo54945R0(), z);
        mVar.mo141106n(jSONObject, "streamvideoid", mVar.mo54939O0(), z);
        mVar.mo141106n(jSONObject, "sourcetitle", mVar.mo54929J0(), z);
        mVar.mo141106n(jSONObject, "sourcename", mVar.mo54925H0(), z);
        mVar.mo141106n(jSONObject, "sourcedesc", mVar.mo54921F0(), z);
        mVar.mo141106n(jSONObject, "sourceheadurl", mVar.mo54923G0(), z);
        mVar.mo141106n(jSONObject, "sourcetime", mVar.mo54927I0(), z);
        mVar.mo141106n(jSONObject, "srcMsgCreateTime", Long.valueOf(mVar.mo54931K0()), z);
        mVar.mo141106n(jSONObject, "statextstr", mVar.mo54933L0(), z);
        mVar.mo141106n(jSONObject, "songalbumurl", mVar.mo54917D0(), z);
        mVar.mo141106n(jSONObject, "songlyric", mVar.mo54919E0(), z);
        mVar.mo141106n(jSONObject, "recordxml", mVar.mo54915C0(), z);
        mVar.mo141106n(jSONObject, "messageuuid", mVar.mo55014y0(), z);
        mVar.mo141106n(jSONObject, "fromnewmsgid", Long.valueOf(mVar.mo55004t0()), z);
        mVar.mo141106n(jSONObject, "appid", mVar.mo54966b0(), z);
        mVar.mo141106n(jSONObject, "link", mVar.mo55010w0(), z);
        mVar.mo141106n(jSONObject, "brandid", mVar.mo54969c0(), z);
        mVar.mo141106n(jSONObject, "tpauthkey", mVar.mo54953V0(), z);
        mVar.mo141106n(jSONObject, "tpaeskey", mVar.mo54951U0(), z);
        mVar.mo141106n(jSONObject, "tpdataurl", mVar.mo54955W0(), z);
        mVar.mo141106n(jSONObject, "tpthumburl", mVar.mo54959Y0(), z);
        mVar.mo141106n(jSONObject, "tpthumbaeskey", mVar.mo54957X0(), z);
        mVar.mo141106n(jSONObject, "dataitemsource", mVar.mo54979h0(), z);
        mVar.mo141106n(jSONObject, "locitem", mVar.mo55012x0(), z);
        mVar.mo141106n(jSONObject, "weburlitem", mVar.mo54964a1(), z);
        mVar.mo141106n(jSONObject, "finderFeed", mVar.mo54994o0(), z);
        mVar.mo141106n(jSONObject, "finderLive", mVar.mo54996p0(), z);
        mVar.mo141106n(jSONObject, "finderShopWindowShare", mVar.mo55000r0(), z);
        mVar.mo141106n(jSONObject, "finderTopicShareItem", mVar.mo54990m0(), z);
        mVar.mo141106n(jSONObject, "finderTopicShareItem", mVar.mo55002s0(), z);
        mVar.mo141106n(jSONObject, "finderShareNameCard", mVar.mo54998q0(), z);
        mVar.mo141106n(jSONObject, "finderContentColumnSharedItem", mVar.mo54992n0(), z);
        mVar.mo141106n(jSONObject, "favbrandmpvideo", mVar.mo54971d0(), z);
        mVar.mo141106n(jSONObject, "productitem", mVar.mo54913B0(), z);
        mVar.mo141106n(jSONObject, "tvitem", mVar.mo54961Z0(), z);
        mVar.mo141106n(jSONObject, "appbranditem", mVar.mo54963a0(), z);
        mVar.mo141106n(jSONObject, "musicShareItem", mVar.mo54911A0(), z);
        mVar.mo141106n(jSONObject, "thumbfiletype", Integer.valueOf(mVar.mo54943Q0()), z);
        mVar.mo141106n(jSONObject, "filetype", Integer.valueOf(mVar.mo54988l0()), z);
        mVar.mo141106n(jSONObject, "midfiletype", Integer.valueOf(mVar.mo55016z0()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27313m) || !(cVar2 instanceof C27313m)) {
            return false;
        }
        C27313m mVar = (C27313m) cVar;
        C27313m mVar2 = (C27313m) cVar2;
        return C87412m.m108589b(mVar.mo54548I(), mVar2.mo54548I()) && C87412m.m108589b(mVar.mo54544E(), mVar2.mo54544E()) && mVar.mo54549J() == mVar2.mo54549J() && C87412m.m108589b(mVar.mo54546G(), mVar2.mo54546G()) && C87412m.m108589b(mVar.mo54543D(), mVar2.mo54543D()) && C87412m.m108589b(mVar.mo54542C(), mVar2.mo54542C()) && C87412m.m108589b(mVar.mo54551L(), mVar2.mo54551L()) && mVar.mo54552M() == mVar2.mo54552M() && C87412m.m108589b(mVar.mo54541B(), mVar2.mo54541B()) && C87412m.m108589b(mVar.mo54540A(), mVar2.mo54540A()) && C87412m.m108589b(mVar.mo54550K(), mVar2.mo54550K()) && mVar.mo54547H() == mVar2.mo54547H() && C87412m.m108589b(mVar.mo54545F(), mVar2.mo54545F()) && mVar.mo54981i0() == mVar2.mo54981i0() && C87412m.m108589b(mVar.mo55008v0(), mVar2.mo55008v0()) && mVar.mo54977g0() == mVar2.mo54977g0() && C87412m.m108589b(mVar.mo54983j0(), mVar2.mo54983j0()) && C87412m.m108589b(mVar.mo54975f0(), mVar2.mo54975f0()) && mVar.mo54949T0() == mVar2.mo54949T0() && mVar.mo54947S0() == mVar2.mo54947S0() && mVar.mo54973e0() == mVar2.mo54973e0() && mVar.mo54986k0() == mVar2.mo54986k0() && C87412m.m108589b(mVar.mo54941P0(), mVar2.mo54941P0()) && C87412m.m108589b(mVar.mo54935M0(), mVar2.mo54935M0()) && C87412m.m108589b(mVar.mo54937N0(), mVar2.mo54937N0()) && C87412m.m108589b(mVar.mo55006u0(), mVar2.mo55006u0()) && C87412m.m108589b(mVar.mo54945R0(), mVar2.mo54945R0()) && C87412m.m108589b(mVar.mo54939O0(), mVar2.mo54939O0()) && C87412m.m108589b(mVar.mo54929J0(), mVar2.mo54929J0()) && C87412m.m108589b(mVar.mo54925H0(), mVar2.mo54925H0()) && C87412m.m108589b(mVar.mo54921F0(), mVar2.mo54921F0()) && C87412m.m108589b(mVar.mo54923G0(), mVar2.mo54923G0()) && C87412m.m108589b(mVar.mo54927I0(), mVar2.mo54927I0()) && mVar.mo54931K0() == mVar2.mo54931K0() && C87412m.m108589b(mVar.mo54933L0(), mVar2.mo54933L0()) && C87412m.m108589b(mVar.mo54917D0(), mVar2.mo54917D0()) && C87412m.m108589b(mVar.mo54919E0(), mVar2.mo54919E0()) && mVar.mo141098c(mVar.mo54915C0(), mVar2.mo54915C0()) && C87412m.m108589b(mVar.mo55014y0(), mVar2.mo55014y0()) && mVar.mo55004t0() == mVar2.mo55004t0() && C87412m.m108589b(mVar.mo54966b0(), mVar2.mo54966b0()) && C87412m.m108589b(mVar.mo55010w0(), mVar2.mo55010w0()) && C87412m.m108589b(mVar.mo54969c0(), mVar2.mo54969c0()) && C87412m.m108589b(mVar.mo54953V0(), mVar2.mo54953V0()) && C87412m.m108589b(mVar.mo54951U0(), mVar2.mo54951U0()) && C87412m.m108589b(mVar.mo54955W0(), mVar2.mo54955W0()) && C87412m.m108589b(mVar.mo54959Y0(), mVar2.mo54959Y0()) && C87412m.m108589b(mVar.mo54957X0(), mVar2.mo54957X0()) && mVar.mo141098c(mVar.mo54979h0(), mVar2.mo54979h0()) && mVar.mo141098c(mVar.mo55012x0(), mVar2.mo55012x0()) && mVar.mo141098c(mVar.mo54964a1(), mVar2.mo54964a1()) && mVar.mo141098c(mVar.mo54994o0(), mVar2.mo54994o0()) && mVar.mo141098c(mVar.mo54996p0(), mVar2.mo54996p0()) && mVar.mo141098c(mVar.mo55000r0(), mVar2.mo55000r0()) && mVar.mo141098c(mVar.mo54990m0(), mVar2.mo54990m0()) && mVar.mo141098c(mVar.mo55002s0(), mVar2.mo55002s0()) && mVar.mo141098c(mVar.mo54998q0(), mVar2.mo54998q0()) && mVar.mo141098c(mVar.mo54992n0(), mVar2.mo54992n0()) && mVar.mo141098c(mVar.mo54971d0(), mVar2.mo54971d0()) && mVar.mo141098c(mVar.mo54913B0(), mVar2.mo54913B0()) && mVar.mo141098c(mVar.mo54961Z0(), mVar2.mo54961Z0()) && mVar.mo141098c(mVar.mo54963a0(), mVar2.mo54963a0()) && mVar.mo141098c(mVar.mo54911A0(), mVar2.mo54911A0()) && mVar.mo54943Q0() == mVar2.mo54943Q0() && mVar.mo54988l0() == mVar2.mo54988l0() && mVar.mo55016z0() == mVar2.mo55016z0();
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
        if (!(cVar instanceof C27313m)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C27313m mVar = (C27313m) cVar;
        mVar.mo141108p(sb, "datatype", Integer.valueOf(mVar.mo54549J()), z);
        mVar.mo141108p(sb, "dataid", mVar.mo54546G(), z);
        mVar.mo141108p(sb, "datastatus", Integer.valueOf(mVar.mo54981i0()), z);
        mVar.mo141108p(sb, "htmlid", mVar.mo55008v0(), z);
        mVar.mo141108p(sb, "dataillegaltype", Integer.valueOf(mVar.mo54977g0()), z);
        mVar.mo141108p(sb, "datasourceid", mVar.mo54983j0(), z);
        sb.append(">");
        C27313m mVar2 = mVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        mVar2.mo141109q(sb5, "datatitle", "", mVar.mo54548I(), z2);
        mVar2.mo141109q(sb5, "datadesc", "", mVar.mo54544E(), z2);
        mVar2.mo141109q(sb5, "cdnthumburl", "", mVar.mo54543D(), z2);
        mVar2.mo141109q(sb5, "cdnthumbkey", "", mVar.mo54542C(), z2);
        mVar2.mo141109q(sb5, "thumbfullmd5", "", mVar.mo54551L(), z2);
        C27313m mVar3 = mVar;
        StringBuilder sb6 = sb;
        mVar3.mo141109q(sb6, "thumbsize", "", Long.valueOf(mVar.mo54552M()), z2);
        mVar3.mo141109q(sb6, "cdndataurl", "", mVar.mo54541B(), z2);
        mVar3.mo141109q(sb6, "cdndatakey", "", mVar.mo54540A(), z2);
        mVar3.mo141109q(sb6, "fullmd5", "", mVar.mo54550K(), z2);
        C27313m mVar4 = mVar;
        StringBuilder sb7 = sb;
        mVar4.mo141109q(sb7, "datasize", "", Long.valueOf(mVar.mo54547H()), z2);
        mVar4.mo141109q(sb7, "dataext", "", mVar.mo54545F(), z2);
        mVar4.mo141109q(sb7, "datafmt", "", mVar.mo54975f0(), z2);
        mVar.mo141109q(sb7, "thumbwidth", "", Integer.valueOf(mVar.mo54949T0()), z2);
        mVar.mo141109q(sb7, "thumbheight", "", Integer.valueOf(mVar.mo54947S0()), z2);
        mVar.mo141109q(sb7, "cdnencryver", "", Integer.valueOf(mVar.mo54973e0()), z2);
        C27313m mVar5 = mVar;
        mVar5.mo141109q(sb7, "duration", "", Integer.valueOf(mVar.mo54986k0()), z2);
        mVar5.mo141109q(sb7, "streamweburl", "", mVar.mo54941P0(), z2);
        mVar5.mo141109q(sb7, "streamdataurl", "", mVar.mo54935M0(), z2);
        mVar5.mo141109q(sb7, "streamlowbandurl", "", mVar.mo54937N0(), z2);
        mVar5.mo141109q(sb7, "head256md5", "", mVar.mo55006u0(), z2);
        mVar5.mo141109q(sb7, "thumbhead256md5", "", mVar.mo54945R0(), z2);
        mVar5.mo141109q(sb7, "streamvideoid", "", mVar.mo54939O0(), z2);
        mVar5.mo141109q(sb7, "sourcetitle", "", mVar.mo54929J0(), z2);
        mVar5.mo141109q(sb7, "sourcename", "", mVar.mo54925H0(), z2);
        mVar5.mo141109q(sb7, "sourcedesc", "", mVar.mo54921F0(), z2);
        mVar5.mo141109q(sb7, "sourceheadurl", "", mVar.mo54923G0(), z2);
        mVar5.mo141109q(sb7, "sourcetime", "", mVar.mo54927I0(), z2);
        C27313m mVar6 = mVar;
        StringBuilder sb8 = sb;
        mVar6.mo141109q(sb8, "srcMsgCreateTime", "", Long.valueOf(mVar.mo54931K0()), z2);
        mVar6.mo141109q(sb8, "statextstr", "", mVar.mo54933L0(), z2);
        mVar6.mo141109q(sb8, "songalbumurl", "", mVar.mo54917D0(), z2);
        mVar6.mo141109q(sb8, "songlyric", "", mVar.mo54919E0(), z2);
        mVar6.mo141109q(sb8, "recordxml", "", mVar.mo54915C0(), z2);
        mVar6.mo141109q(sb8, "messageuuid", "", mVar.mo55014y0(), z2);
        C27313m mVar7 = mVar;
        StringBuilder sb9 = sb;
        mVar7.mo141109q(sb9, "fromnewmsgid", "", Long.valueOf(mVar.mo55004t0()), z2);
        mVar7.mo141109q(sb9, "appid", "", mVar.mo54966b0(), z2);
        mVar7.mo141109q(sb9, "link", "", mVar.mo55010w0(), z2);
        mVar7.mo141109q(sb9, "brandid", "", mVar.mo54969c0(), z2);
        mVar7.mo141109q(sb9, "tpauthkey", "", mVar.mo54953V0(), z2);
        mVar7.mo141109q(sb9, "tpaeskey", "", mVar.mo54951U0(), z2);
        mVar7.mo141109q(sb9, "tpdataurl", "", mVar.mo54955W0(), z2);
        mVar7.mo141109q(sb9, "tpthumburl", "", mVar.mo54959Y0(), z2);
        mVar7.mo141109q(sb9, "tpthumbaeskey", "", mVar.mo54957X0(), z2);
        mVar7.mo141109q(sb9, "dataitemsource", "", mVar.mo54979h0(), z2);
        mVar7.mo141109q(sb9, "locitem", "", mVar.mo55012x0(), z2);
        mVar7.mo141109q(sb9, "weburlitem", "", mVar.mo54964a1(), z2);
        mVar7.mo141109q(sb9, "finderFeed", "", mVar.mo54994o0(), z2);
        mVar7.mo141109q(sb9, "finderLive", "", mVar.mo54996p0(), z2);
        mVar7.mo141109q(sb9, "finderShopWindowShare", "", mVar.mo55000r0(), z2);
        mVar7.mo141109q(sb9, "finderTopicShareItem", "", mVar.mo54990m0(), z2);
        mVar7.mo141109q(sb9, "finderTopicShareItem", "", mVar.mo55002s0(), z2);
        mVar7.mo141109q(sb9, "finderShareNameCard", "", mVar.mo54998q0(), z2);
        mVar7.mo141109q(sb9, "finderContentColumnSharedItem", "", mVar.mo54992n0(), z2);
        mVar7.mo141109q(sb9, "favbrandmpvideo", "", mVar.mo54971d0(), z2);
        mVar7.mo141109q(sb9, "productitem", "", mVar.mo54913B0(), z2);
        mVar7.mo141109q(sb9, "tvitem", "", mVar.mo54961Z0(), z2);
        mVar7.mo141109q(sb9, "appbranditem", "", mVar.mo54963a0(), z2);
        mVar7.mo141109q(sb9, "musicShareItem", "", mVar.mo54911A0(), z2);
        mVar.mo141109q(sb9, "thumbfiletype", "", Integer.valueOf(mVar.mo54943Q0()), z2);
        mVar.mo141109q(sb9, "filetype", "", Integer.valueOf(mVar.mo54988l0()), z2);
        mVar.mo141109q(sb9, "midfiletype", "", Integer.valueOf(mVar.mo55016z0()), z2);
        sb.append("</" + str + '>');
        mVar.mo141110r(sb, str2);
        String sb10 = sb.toString();
        C87412m.m108593f(sb10, "xmlBuilder.toString()");
        return sb10;
    }
}
