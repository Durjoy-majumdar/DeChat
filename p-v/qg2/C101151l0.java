package qg2;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import ht1.C60167f1;
import ht1.C98521u5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Map;
import pb1.C100697a1;
import pe3.C89349b;
import rb1.C101368b;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C64581nk1;
import te3.C64659qk1;
import te3.C90431pc0;

/* renamed from: qg2.l0 */
public class C101151l0 {
    /* renamed from: a */
    public static long m132648a(C101834rc0 rc02) {
        long j;
        if (Util.isNullOrNil(rc02.f299302f1)) {
            return 0;
        }
        try {
            j = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).parse(rc02.f299302f1).getTime() / 1000;
        } catch (ParseException unused) {
            j = 0;
        }
        if (j != 0) {
            return j;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(rc02.f299302f1).getTime() / 1000;
        } catch (ParseException unused2) {
            return j;
        }
    }

    /* renamed from: b */
    public static C101834rc0 m132649b(Map<String, String> map, String str, int i) {
        String str2;
        String str3;
        String str4;
        C101834rc0 rc02;
        String str5;
        String str6;
        String str7;
        String str8;
        Map<String, String> map2 = map;
        String str9 = str;
        if (map2 == null) {
            return null;
        }
        C101834rc0 rc03 = new C101834rc0();
        rc03.mo141260p(Util.getInt(map2.get(".dataitem" + ".$datatype"), 0));
        rc03.mo141259o(map2.get(".dataitem" + ".$datasourceid"));
        rc03.f299291Y0 = Util.getInt(map2.get(".dataitem" + ".$datastatus"), 0);
        rc03.f299293Z0 = true;
        rc03.mo141261q(map2.get(".dataitem" + ".datafmt"));
        rc03.mo141246U(map2.get(".dataitem" + ".datatitle"));
        rc03.mo141265u(map2.get(".dataitem" + ".datadesc"));
        rc03.mo141256l(map2.get(".dataitem" + ".cdnthumburl"));
        rc03.mo141255k(map2.get(".dataitem" + ".cdnthumbkey"));
        rc03.f299316o = Util.getInt(map2.get(".dataitem" + ".thumbwidth"), 0);
        rc03.f299318p = true;
        rc03.f299321q = Util.getInt(map2.get(".dataitem" + ".thumbheight"), 0);
        rc03.f299323r = true;
        rc03.mo141254j(map2.get(".dataitem" + ".cdndataurl"));
        rc03.mo141253f(map2.get(".dataitem" + ".cdndatakey"));
        rc03.f299334w1 = map2.get(".dataitem" + ".tpthumburl");
        rc03.f299337x1 = map2.get(".dataitem" + ".tpaeskey");
        rc03.f299340y1 = map2.get(".dataitem" + ".tpauthkey");
        rc03.f299342z1 = map2.get(".dataitem" + ".tpdataurl");
        rc03.f299243A1 = map2.get(".dataitem" + ".tpthumbaeskey");
        String str10 = map2.get(".dataitem" + ".duration");
        if (str10 != null && str10.length() > 0) {
            rc03.mo141266v(Util.getInt(str10, 0));
        }
        rc03.mo141240O(map2.get(".dataitem" + ".streamdataurl"));
        rc03.mo141241P(map2.get(".dataitem" + ".streamlowbandurl"));
        rc03.mo141242Q(map2.get(".dataitem" + ".streamweburl"));
        rc03.mo141268x(map2.get(".dataitem" + ".fullmd5"));
        rc03.mo141270z(map2.get(".dataitem" + ".head256md5"));
        String str11 = map2.get(".dataitem" + ".datasize");
        if (!Util.isNullOrNil(str11)) {
            rc03.mo141269y((long) Util.getInt(str11, 0));
        }
        rc03.mo141267w(map2.get(".dataitem" + ".dataext"));
        rc03.mo141245T(map2.get(".dataitem" + ".thumbfullmd5"));
        rc03.mo141244S(map2.get(".dataitem" + ".thumbhead256md5"));
        String str12 = map2.get(".dataitem" + ".thumbsize");
        if (!Util.isNullOrNil(str12)) {
            rc03.mo141243R((long) Util.getInt(str12, 0));
        }
        rc03.mo141250Y(map2.get(".dataitem" + ".streamvideoid"));
        String str13 = map2.get(".dataitem" + ".$dataid");
        if (Util.isNullOrNil(str13)) {
            str13 = String.valueOf(i);
        }
        rc03.mo141257m(str13);
        String str14 = map2.get(".dataitem" + ".$htmlid");
        if (!Util.isNullOrNil(str14)) {
            rc03.mo141228A(str14);
        }
        rc03.mo141262r(Util.getInt(map2.get(".dataitem" + ".$dataillegaltype"), 0));
        rc03.f299294a1 = map2.get(".dataitem" + ".sourcetitle");
        rc03.f299295b1 = true;
        rc03.mo141263s(map2.get(".dataitem" + ".sourcename"));
        rc03.f299245B1 = map2.get(".dataitem" + ".sourcedesc");
        rc03.f299247C1 = map2.get(".dataitem" + ".sourceheadurl");
        rc03.f299249D1 = true;
        rc03.mo141264t(map2.get(".dataitem" + ".sourcetime"));
        rc03.mo141239N(map2.get(".dataitem" + ".statextstr"));
        if (str9 != null) {
            rc03.mo141234H(str9);
            rc03.f299275Q1 = ((C100697a1) C86312j.m106911c(C100697a1.class)).mo135049T7(str9);
        }
        rc03.mo141235I(map2.get(".dataitem" + ".songalbumurl"));
        rc03.mo141236J(map2.get(".dataitem" + ".songlyric"));
        rc03.mo141230C(map2.get(".dataitem" + ".messageuuid"));
        rc03.mo141229B(Util.getLong(map2.get(".dataitem" + ".fromnewmsgid"), 0));
        rc03.f299267M1 = Util.getInt(map2.get(".dataitem" + ".thumbfiletype"), 0);
        rc03.f299269N1 = true;
        rc03.f299270O1 = Util.getInt(map2.get(".dataitem" + ".filetype"), 0);
        rc03.f299272P1 = true;
        C101841sc0 sc02 = new C101841sc0();
        C101846tc0 tc02 = new C101846tc0();
        tc02.mo141309p(Util.getInt(map2.get(".dataitem" + ".$sourcetype"), 0));
        String str15 = map2.get(".dataitem" + ".dataitemsource.fromusr");
        if (!Util.isNullOrNil(str15)) {
            tc02.mo141306m(str15);
            Log.m105919d("MicroMsg.RecordMsgParser", "fromusr %s", tc02.f299519f);
        }
        String str16 = map2.get(".dataitem" + ".dataitemsource.realchatname");
        if (!Util.isNullOrNil(str16)) {
            tc02.mo141308o(str16);
            Log.m105919d("MicroMsg.RecordMsgParser", "realChatname %s", tc02.f299525o);
        }
        tc02.f299533w = map2.get(".dataitem" + ".appid");
        tc02.f299534x = true;
        tc02.mo141307n(map2.get(".dataitem" + ".link"));
        tc02.mo141305l(map2.get(".dataitem" + ".brandid"));
        tc02.f299515D = map2.get(".dataitem" + ".dataitemsource.hashusername");
        tc02.f299516E = true;
        sc02.f299405d = tc02;
        String str17 = ".dataitem" + ".locitem";
        if (map2.containsKey(str17)) {
            C101871zc0 zc02 = new C101871zc0();
            if (!Util.isNullOrNil(map2.get(str17 + ".label"))) {
                zc02.mo141339v(map2.get(str17 + ".label"));
            }
            if (!Util.isNullOrNil(map2.get(str17 + ".poiname"))) {
                zc02.mo141322E(map2.get(str17 + ".poiname"));
            }
            String str18 = map2.get(str17 + ".lng");
            if (!Util.isNullOrNil(str18)) {
                zc02.mo141341x(Util.getDouble(str18, 0.0d));
            }
            String str19 = map2.get(str17 + ".lat");
            if (!Util.isNullOrNil(str19)) {
                zc02.mo141340w(Util.getDouble(str19, 0.0d));
            }
            String str20 = map2.get(str17 + ".scale");
            if (!Util.isNullOrNil(str20)) {
                if (str20.indexOf(46) != -1) {
                    zc02.mo141323F(Util.getInt(str20.substring(0, str20.indexOf(46)), -1));
                } else {
                    zc02.mo141323F(Util.getInt(str20, -1));
                }
            }
            if (!Util.isNullOrNil(map2.get(str17 + ".poiid"))) {
                zc02.mo141321C(map2.get(str17 + ".poiid"));
            }
            if (!Util.isNullOrNil(map2.get(str17 + ".poiCategoryTips"))) {
                zc02.mo141343z(map2.get(str17 + ".poiCategoryTips"));
            }
            if (!Util.isNullOrNil(map2.get(str17 + ".poiBusinessHour"))) {
                zc02.mo141342y(map2.get(str17 + ".poiBusinessHour"));
            }
            if (!Util.isNullOrNil(map2.get(str17 + ".poiPhone"))) {
                zc02.mo141319A(map2.get(str17 + ".poiPhone"));
            }
            String str21 = map2.get(str17 + ".poiPriceTips");
            if (!Util.isNullOrNil(str21)) {
                zc02.mo141320B(Util.getFloat(str21, 0.0f));
            }
            String str22 = map2.get(str17 + ".isFromPoiList");
            if (!Util.isNullOrNil(str22)) {
                zc02.mo141338u(Util.getBoolean(str22, false));
            }
            zc02.mo141336s(map2.get(str17 + ".buildingId"));
            zc02.mo141337t(map2.get(str17 + ".floorName"));
            sc02.f299406e = zc02;
        }
        String str23 = ".dataitem" + ".weburlitem";
        if (map2.containsKey(str23)) {
            C101756ae0 ae02 = new C101756ae0();
            ae02.mo141198r(map2.get(str23 + ".title"));
            ae02.mo141194n(map2.get(str23 + ".desc"));
            ae02.mo141197q(map2.get(str23 + ".thumburl"));
            ae02.f297867h = map2.get(str23 + ".link");
            ae02.f297868i = true;
            ae02.mo141196p(Util.getInt(map2.get(str23 + ".opencache"), 0));
            ae02.mo141195o(Util.getInt(map2.get(str23 + ".forwardflag"), 0));
            sc02.f299407f = ae02;
        }
        sc02.f299423y = C60167f1.m70151i(".dataitem", map2);
        sc02.f299424z = C60167f1.m70153k(".dataitem", map2);
        sc02.f299404F = C60167f1.m70159q(".dataitem", map2);
        sc02.f299403E = C60167f1.m70156n(".dataitem", map2);
        sc02.f299402D = C60167f1.m70156n(".dataitem", map2);
        C64659qk1 qk12 = new C64659qk1();
        String str24 = ".dataitem" + ".finderShareNameCard";
        String str25 = "";
        if (!map.isEmpty()) {
            qk12.f185045d = Util.nullAsNil(map2.get(str24 + ".username"));
            qk12.f185046e = Util.nullAsNil(map2.get(str24 + ".nickname"));
            qk12.f185047f = Util.nullAsNil(map2.get(str24 + ".avatar"));
            qk12.f185048g = Util.nullAsNil(map2.get(str24 + ".authJob"));
            qk12.f185049h = Util.getInt(map2.get(str24 + ".authIcon"), -1);
        } else {
            qk12.f185045d = str25;
            qk12.f185046e = str25;
            qk12.f185047f = str25;
            qk12.f185048g = str25;
            qk12.f185049h = -1;
        }
        sc02.f299399A = qk12;
        C64581nk1 nk12 = new C64581nk1();
        String str26 = ".dataitem" + ".finderContentColumnSharedItem";
        if (!map.isEmpty()) {
            nk12.f184480i = new C89349b(Base64.decode(Util.nullAsNil(map2.get(str26 + ".cardbuffer")), 0));
            String nullAsNil = Util.nullAsNil(map2.get(str26 + ".iconUrl"));
            String nullAsNil2 = Util.nullAsNil(map2.get(str26 + ".iconUrl_1"));
            String nullAsNil3 = Util.nullAsNil(map2.get(str26 + ".iconUrl_2"));
            StringBuilder sb = new StringBuilder();
            sb.append(str26);
            rc02 = rc03;
            sb.append(".iconUrl_3");
            String nullAsNil4 = Util.nullAsNil(map2.get(sb.toString()));
            String[] split = nullAsNil.split("&token");
            str3 = ".appid";
            str2 = ".username";
            nk12.f184478g.add(split[0]);
            LinkedList<String> linkedList = nk12.f184479h;
            str4 = ".thumburl";
            if (split.length > 1) {
                str6 = "&token" + split[1];
            } else {
                str6 = str25;
            }
            linkedList.add(str6);
            String[] split2 = nullAsNil2.split("&token");
            nk12.f184478g.add(split2[0]);
            LinkedList<String> linkedList2 = nk12.f184479h;
            if (split2.length > 1) {
                str7 = "&token" + split2[1];
            } else {
                str7 = str25;
            }
            linkedList2.add(str7);
            String[] split3 = nullAsNil3.split("&token");
            nk12.f184478g.add(split3[0]);
            LinkedList<String> linkedList3 = nk12.f184479h;
            if (split3.length > 1) {
                str8 = "&token" + split3[1];
            } else {
                str8 = str25;
            }
            linkedList3.add(str8);
            String[] split4 = nullAsNil4.split("&token");
            nk12.f184478g.add(split4[0]);
            LinkedList<String> linkedList4 = nk12.f184479h;
            if (split4.length > 1) {
                str25 = "&token" + split4[1];
            }
            linkedList4.add(str25);
            nk12.f184475d = Util.nullAsNil(map2.get(str26 + ".cardId"));
            nk12.f184476e = Util.nullAsNil(map2.get(str26 + ".title"));
            nk12.f184477f = Util.nullAsNil(map2.get(str26 + ".secondTitle"));
        } else {
            rc02 = rc03;
            str3 = ".appid";
            str4 = ".thumburl";
            str2 = ".username";
            nk12.f184475d = str25;
            nk12.f184476e = str25;
            nk12.f184477f = str25;
            nk12.f184480i = null;
        }
        sc02.f299400B = nk12;
        String str27 = ".dataitem" + ".productitem";
        if (!map2.containsKey(str27)) {
            str5 = str4;
        } else {
            C101793jd0 jd02 = new C101793jd0();
            jd02.mo141207o(map2.get(str27 + ".title"));
            jd02.mo141204l(map2.get(str27 + ".desc"));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str27);
            str5 = str4;
            sb4.append(str5);
            jd02.mo141206n(map2.get(sb4.toString()));
            jd02.mo141205m(map2.get(str27 + ".productinfo"));
            jd02.mo141208p(Util.getInt(map2.get(str27 + ".$type"), 0));
            sc02.f299408g = jd02;
        }
        String str28 = ".dataitem" + ".tvitem";
        if (map2.containsKey(str28)) {
            C101850ud0 ud02 = new C101850ud0();
            ud02.mo141318n(map2.get(str28 + ".title"));
            ud02.mo141315k(map2.get(str28 + ".desc"));
            ud02.mo141317m(map2.get(str28 + str5));
            ud02.mo141316l(map2.get(str28 + ".tvinfo"));
            sc02.f299409h = ud02;
        }
        String str29 = ".dataitem" + ".appbranditem";
        if (map2.containsKey(str29)) {
            C90431pc0 pc02 = new C90431pc0();
            pc02.f259741d = map2.get(str29 + str2);
            pc02.f259742e = map2.get(str29 + str3);
            pc02.f259743f = Util.getInt(map2.get(str29 + ".pkgtype"), 0);
            pc02.f259744g = map2.get(str29 + ".iconurl");
            pc02.f259745h = Util.getInt(map2.get(str29 + ".type"), 0);
            pc02.f259746i = map2.get(str29 + ".pagepath");
            pc02.f259747j = map2.get(str29 + ".sourcedisplayname");
            pc02.f259748n = Util.getInt(map2.get(str29 + ".version"), 0);
            pc02.f259749o = Util.getInt(map2.get(str29 + ".disableforward"), 0);
            pc02.f259753s = Util.getInt(map2.get(str29 + ".showRelievedBuyFlag"), 0);
            pc02.f259751q = map2.get(str29 + ".messageextradata");
            pc02.f259752r = Util.getInt(map2.get(str29 + ".subtype"), 0);
            sc02.f299420v = pc02;
        }
        String str30 = ".dataitem" + ".weburlitem.appmsgshareitem";
        if (map2.containsKey(str30)) {
            sc02.f299421w = C101368b.m133010a(str30, map2);
        }
        String str31 = ".dataitem" + ".favbrandmpvideo";
        if (map2.containsKey(str31)) {
            sc02.f299422x = C101368b.m133011b(str31, map2);
        }
        sc02.f299401C = C98521u5.m127974b(".dataitem", map2);
        C101834rc0 rc04 = rc02;
        rc04.f299296c1 = sc02;
        return rc04;
    }
}
