package rb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ht1.C60167f1;
import ht1.C98521u5;
import java.util.LinkedList;
import java.util.List;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C101849uc0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C52097yc0;
import te3.C64623p81;
import te3.C64682rk1;
import te3.C64719t23;
import te3.C64730tk1;
import te3.C90431pc0;

/* renamed from: rb1.a */
public class C101367a {
    /* renamed from: a */
    public static void m133007a(C101841sc0 sc02, StringBuffer stringBuffer) {
        C90431pc0 pc02;
        if (sc02 == null || (pc02 = sc02.f299420v) == null) {
            Log.m105918d("MicroMsg.FavDataItemParser", "setAppBrandXml toXml, item empty");
        } else if (pc02 != null) {
            stringBuffer.append("<appbranditem>");
            stringBuffer.append("<username>");
            stringBuffer.append(Util.escapeStringForXml(pc02.f259741d));
            stringBuffer.append("</username>");
            stringBuffer.append("<appid>");
            stringBuffer.append(Util.escapeStringForXml(pc02.f259742e));
            stringBuffer.append("</appid>");
            stringBuffer.append("<pkgtype>");
            stringBuffer.append(pc02.f259743f);
            stringBuffer.append("</pkgtype>");
            stringBuffer.append("<iconurl>");
            stringBuffer.append(Util.escapeStringForXml(pc02.f259744g));
            stringBuffer.append("</iconurl>");
            stringBuffer.append("<type>");
            stringBuffer.append(pc02.f259745h);
            stringBuffer.append("</type>");
            stringBuffer.append("<pagepath>");
            stringBuffer.append(Util.escapeStringForXml(pc02.f259746i));
            stringBuffer.append("</pagepath>");
            stringBuffer.append("<sourcedisplayname>");
            stringBuffer.append(Util.escapeStringForXml(pc02.f259747j));
            stringBuffer.append("</sourcedisplayname>");
            stringBuffer.append("<version>");
            stringBuffer.append(pc02.f259748n);
            stringBuffer.append("</version>");
            stringBuffer.append("<disableforward>");
            stringBuffer.append(pc02.f259749o);
            stringBuffer.append("</disableforward>");
            stringBuffer.append("<tradingguaranteeflag>");
            stringBuffer.append(pc02.f259750p);
            stringBuffer.append("</tradingguaranteeflag>");
            stringBuffer.append("<showRelievedBuyFlag>");
            stringBuffer.append(pc02.f259753s);
            stringBuffer.append("</showRelievedBuyFlag>");
            stringBuffer.append("<messageextradata>");
            stringBuffer.append(String.format("<![CDATA[%s]]>", new Object[]{pc02.f259751q}));
            stringBuffer.append("</messageextradata>");
            stringBuffer.append("<subtype>");
            stringBuffer.append(pc02.f259752r);
            stringBuffer.append("</subtype>");
            stringBuffer.append("</appbranditem>");
        }
    }

    /* renamed from: b */
    public static String m133008b(List<C101834rc0> list) {
        C101850ud0 ud02;
        C101793jd0 jd02;
        C101755ad0 ad02;
        C64730tk1 tk12;
        C64730tk1 tk13;
        C64623p81 p812;
        C64719t23 t232;
        C64682rk1 rk12;
        C101756ae0 ae02;
        LinkedList<C52097yc0> linkedList;
        C101871zc0 zc02;
        C101846tc0 tc02;
        C101841sc0 sc02;
        C101756ae0 ae03;
        if (list == null || list.size() == 0) {
            Log.m105926v("MicroMsg.FavDataItemParser", "klem toXml data list empty");
            return "";
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<datalist count='");
        stringBuffer.append(size);
        stringBuffer.append("'>");
        for (int i = 0; i < size; i++) {
            C101834rc0 rc02 = list.get(i);
            stringBuffer.append("<dataitem ");
            if (rc02.f299260J) {
                stringBuffer.append("datatype='");
                stringBuffer.append(rc02.f299258I);
                stringBuffer.append("'");
            }
            if (rc02.f299293Z0) {
                stringBuffer.append(" datastatus='");
                stringBuffer.append(rc02.f299291Y0);
                stringBuffer.append("'");
            }
            if (rc02.f299282U && rc02.f299280T != null) {
                stringBuffer.append(" dataid='");
                stringBuffer.append(rc02.f299280T);
                stringBuffer.append("'");
            }
            if (rc02.f299310j1 && rc02.f299308i1 != null) {
                stringBuffer.append(" htmlid='");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299308i1));
                stringBuffer.append("'");
            }
            if (rc02.f299324r1) {
                stringBuffer.append(" dataillegaltype='");
                stringBuffer.append(rc02.f299322q1);
                stringBuffer.append("'");
            }
            if (rc02.f299277R0 && rc02.f299274Q0 != null) {
                stringBuffer.append(" datasourceid='");
                stringBuffer.append(rc02.f299274Q0);
                stringBuffer.append("'");
            }
            stringBuffer.append(">");
            if (rc02.f299264L && rc02.f299262K != null) {
                stringBuffer.append("<datafmt>");
                stringBuffer.append(rc02.f299262K);
                stringBuffer.append("</datafmt>");
            }
            if (rc02.f299299e && rc02.f299297d != null) {
                stringBuffer.append("<datatitle>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299297d));
                stringBuffer.append("</datatitle>");
            }
            if (rc02.f299303g && rc02.f299301f != null) {
                stringBuffer.append("<datadesc>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299301f));
                stringBuffer.append("</datadesc>");
            }
            if (rc02.f299307i && rc02.f299305h != null) {
                stringBuffer.append("<cdn_thumburl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299305h));
                stringBuffer.append("</cdn_thumburl>");
            }
            if (rc02.f299318p) {
                stringBuffer.append("<thumb_width>");
                stringBuffer.append(rc02.f299316o);
                stringBuffer.append("</thumb_width>");
            }
            if (rc02.f299323r) {
                stringBuffer.append("<thumb_height>");
                stringBuffer.append(rc02.f299321q);
                stringBuffer.append("</thumb_height>");
            }
            if (rc02.f299327t && rc02.f299325s != null) {
                stringBuffer.append("<cdn_dataurl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299325s));
                stringBuffer.append("</cdn_dataurl>");
            }
            if (rc02.f299314n && rc02.f299309j != null) {
                stringBuffer.append("<cdn_thumbkey>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299309j));
                stringBuffer.append("</cdn_thumbkey>");
            }
            if (rc02.f299331v && rc02.f299329u != null) {
                stringBuffer.append("<cdn_datakey>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299329u));
                stringBuffer.append("</cdn_datakey>");
            }
            if (rc02.f299335x) {
                stringBuffer.append("<cdn_encryver>");
                stringBuffer.append(rc02.f299333w);
                stringBuffer.append("</cdn_encryver>");
            }
            if (rc02.f299341z) {
                stringBuffer.append("<duration>");
                stringBuffer.append(rc02.f299338y);
                stringBuffer.append("</duration>");
            }
            if (rc02.f299244B && rc02.f299242A != null) {
                stringBuffer.append("<stream_weburl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299242A));
                stringBuffer.append("</stream_weburl>");
            }
            if (rc02.f299253F1 && rc02.f299251E1 != null) {
                stringBuffer.append("<songalbumurl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299251E1));
                stringBuffer.append("</songalbumurl>");
            }
            if (rc02.f299257H1 && rc02.f299255G1 != null) {
                stringBuffer.append("<songlyric>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299255G1));
                stringBuffer.append("</songlyric>");
            }
            if (rc02.f299248D && rc02.f299246C != null) {
                stringBuffer.append("<stream_dataurl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299246C));
                stringBuffer.append("</stream_dataurl>");
            }
            if (rc02.f299252F && rc02.f299250E != null) {
                stringBuffer.append("<stream_lowbandurl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299250E));
                stringBuffer.append("</stream_lowbandurl>");
            }
            if (rc02.f299256H && rc02.f299254G != null) {
                stringBuffer.append("<dataext>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299254G));
                stringBuffer.append("</dataext>");
            }
            if (rc02.f299268N && rc02.f299266M != null) {
                stringBuffer.append("<fullmd5>");
                stringBuffer.append(rc02.f299266M);
                stringBuffer.append("</fullmd5>");
            }
            if (rc02.f299273Q && rc02.f299271P != null) {
                stringBuffer.append("<head256md5>");
                stringBuffer.append(rc02.f299271P);
                stringBuffer.append("</head256md5>");
            }
            if (rc02.f299278S) {
                stringBuffer.append("<fullsize>");
                stringBuffer.append(rc02.f299276R);
                stringBuffer.append("</fullsize>");
            }
            if (rc02.f299290Y && rc02.f299288X != null) {
                stringBuffer.append("<thumbfullmd5>");
                stringBuffer.append(rc02.f299288X);
                stringBuffer.append("</thumbfullmd5>");
            }
            if (rc02.f299319p0 && rc02.f299292Z != null) {
                stringBuffer.append("<thumbhead256md5>");
                stringBuffer.append(rc02.f299292Z);
                stringBuffer.append("</thumbhead256md5>");
            }
            if (rc02.f299339y0) {
                stringBuffer.append("<thumbfullsize>");
                stringBuffer.append(rc02.f299336x0);
                stringBuffer.append("</thumbfullsize>");
            }
            if (rc02.f299281T0 && rc02.f299279S0 != null) {
                stringBuffer.append("<stream_videoid>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299279S0));
                stringBuffer.append("</stream_videoid>");
            }
            if (rc02.f299295b1 && rc02.f299294a1 != null) {
                stringBuffer.append("<datasrctitle>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299294a1));
                stringBuffer.append("</datasrctitle>");
            }
            if (rc02.f299300e1 && rc02.f299298d1 != null) {
                stringBuffer.append("<datasrcname>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299298d1));
                stringBuffer.append("</datasrcname>");
            }
            if (rc02.f299304g1 && rc02.f299302f1 != null) {
                stringBuffer.append("<datasrctime>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299302f1));
                stringBuffer.append("</datasrctime>");
            }
            if (rc02.f299315n1 && rc02.f299313m1 != null && ((sc02 = rc02.f299296c1) == null || (ae03 = sc02.f299407f) == null || ae03.computeSize() == 0)) {
                stringBuffer.append("<canvasPageXml>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299313m1));
                stringBuffer.append("</canvasPageXml>");
            }
            if (rc02.f299312l1 && rc02.f299311k1 != null) {
                stringBuffer.append("<statextstr>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299311k1));
                stringBuffer.append("</statextstr>");
            }
            if (rc02.f299328t1 && rc02.f299326s1 != null) {
                stringBuffer.append("<recordxml>");
                stringBuffer.append(rc02.f299326s1);
                stringBuffer.append("</recordxml>");
            }
            if (rc02.f299261J1 && rc02.f299259I1 != null) {
                stringBuffer.append("<messageuuid>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299259I1));
                stringBuffer.append("</messageuuid>");
            }
            if (rc02.f299265L1) {
                stringBuffer.append("<fromnewmsgid>");
                stringBuffer.append(rc02.f299263K1);
                stringBuffer.append("</fromnewmsgid>");
            }
            if (rc02.f299249D1) {
                stringBuffer.append("<sourceheadurl>");
                stringBuffer.append(Util.escapeStringForXml(rc02.f299247C1));
                stringBuffer.append("</sourceheadurl>");
            }
            if (rc02.f299272P1) {
                stringBuffer.append("<filetype>");
                stringBuffer.append(rc02.f299270O1);
                stringBuffer.append("</filetype>");
            }
            if (rc02.f299269N1) {
                stringBuffer.append("<thumbfiletype>");
                stringBuffer.append(rc02.f299267M1);
                stringBuffer.append("</thumbfiletype>");
            }
            C101849uc0 uc02 = rc02.f299306h1;
            if (uc02 != null) {
                stringBuffer.append("<streamvideo>");
                stringBuffer.append("<streamvideourl>");
                stringBuffer.append(Util.escapeStringForXml(uc02.f299610d));
                stringBuffer.append("</streamvideourl>");
                stringBuffer.append("<streamvideototaltime>");
                stringBuffer.append(uc02.f299611e);
                stringBuffer.append("</streamvideototaltime>");
                stringBuffer.append("<streamvideotitle>");
                stringBuffer.append(Util.escapeStringForXml(uc02.f299614h));
                stringBuffer.append("</streamvideotitle>");
                stringBuffer.append("<streamvideowording>");
                stringBuffer.append(Util.escapeStringForXml(uc02.f299612f));
                stringBuffer.append("</streamvideowording>");
                stringBuffer.append("<streamvideoweburl>");
                stringBuffer.append(Util.escapeStringForXml(uc02.f299613g));
                stringBuffer.append("</streamvideoweburl>");
                stringBuffer.append("<streamvideoaduxinfo>");
                stringBuffer.append(Util.escapeStringForXml(uc02.f299616j));
                stringBuffer.append("</streamvideoaduxinfo>");
                stringBuffer.append("<streamvideopublishid>");
                stringBuffer.append(Util.escapeStringForXml(uc02.f299617n));
                stringBuffer.append("</streamvideopublishid>");
                stringBuffer.append("</streamvideo>");
            }
            C101841sc0 sc03 = rc02.f299296c1;
            if (sc03 == null || (tc02 = sc03.f299405d) == null || tc02.computeSize() == 0) {
                Log.m105926v("MicroMsg.FavDataItemParser", "klem toXml, data source item empty");
            } else {
                C101846tc0 tc03 = sc03.f299405d;
                stringBuffer.append("<dataitemsource");
                if (tc03.f299518e) {
                    stringBuffer.append(" sourcetype='");
                    stringBuffer.append(tc03.f299517d);
                    stringBuffer.append("'");
                }
                if (tc03.f299524n) {
                    stringBuffer.append(" sourceid='");
                    stringBuffer.append(tc03.f299523j);
                    stringBuffer.append("'");
                }
                stringBuffer.append(">");
                if (tc03.f299520g) {
                    stringBuffer.append("<fromusr>");
                    stringBuffer.append(Util.escapeStringForXml(tc03.f299519f));
                    stringBuffer.append("</fromusr>");
                }
                if (tc03.f299522i) {
                    stringBuffer.append("<tousr>");
                    stringBuffer.append(Util.escapeStringForXml(tc03.f299521h));
                    stringBuffer.append("</tousr>");
                }
                if (tc03.f299526p) {
                    stringBuffer.append("<realchatname>");
                    stringBuffer.append(Util.escapeStringForXml(tc03.f299525o));
                    stringBuffer.append("</realchatname>");
                }
                if (tc03.f299530t) {
                    stringBuffer.append("<msgid>");
                    stringBuffer.append(tc03.f299529s);
                    stringBuffer.append("</msgid>");
                }
                if (tc03.f299532v) {
                    stringBuffer.append("<eventid>");
                    stringBuffer.append(tc03.f299531u);
                    stringBuffer.append("</eventid>");
                }
                if (tc03.f299534x) {
                    stringBuffer.append("<appid>");
                    stringBuffer.append(tc03.f299533w);
                    stringBuffer.append("</appid>");
                }
                if (tc03.f299536z) {
                    stringBuffer.append("<link>");
                    stringBuffer.append(Util.escapeStringForXml(tc03.f299535y));
                    stringBuffer.append("</link>");
                }
                if (tc03.f299514C) {
                    stringBuffer.append("<brandid>");
                    stringBuffer.append(Util.escapeStringForXml(tc03.f299513B));
                    stringBuffer.append("</brandid>");
                }
                stringBuffer.append("</dataitemsource>");
            }
            C101841sc0 sc04 = rc02.f299296c1;
            if (sc04 == null || (zc02 = sc04.f299406e) == null || zc02.computeSize() == 0) {
                Log.m105926v("MicroMsg.FavDataItemParser", "klem toXml, loc item empty");
            } else {
                C101871zc0 zc03 = sc04.f299406e;
                stringBuffer.append("<locitem>");
                if (zc03.f299957n) {
                    stringBuffer.append("<label>");
                    stringBuffer.append(Util.escapeStringForXml(zc03.f299956j));
                    stringBuffer.append("</label>");
                }
                if (zc03.f299953g) {
                    stringBuffer.append("<lat>");
                    stringBuffer.append(zc03.f299952f);
                    stringBuffer.append("</lat>");
                }
                if (zc03.f299951e) {
                    stringBuffer.append("<lng>");
                    stringBuffer.append(zc03.f299950d);
                    stringBuffer.append("</lng>");
                }
                if (zc03.f299955i) {
                    stringBuffer.append("<scale>");
                    stringBuffer.append(zc03.f299954h);
                    stringBuffer.append("</scale>");
                }
                if (zc03.f299959p) {
                    stringBuffer.append("<poiname>");
                    stringBuffer.append(zc03.f299958o);
                    stringBuffer.append("</poiname>");
                }
                if (zc03.f299961r) {
                    stringBuffer.append("<poiid>");
                    stringBuffer.append(zc03.f299960q);
                    stringBuffer.append("</poiid>");
                }
                if (zc03.f299963t) {
                    stringBuffer.append("<poiCategoryTips>");
                    stringBuffer.append(zc03.f299962s);
                    stringBuffer.append("</poiCategoryTips>");
                }
                if (zc03.f299965v) {
                    stringBuffer.append("<poiBusinessHour>");
                    stringBuffer.append(zc03.f299964u);
                    stringBuffer.append("</poiBusinessHour>");
                }
                if (zc03.f299967x) {
                    stringBuffer.append("<poiPhone>");
                    stringBuffer.append(zc03.f299966w);
                    stringBuffer.append("</poiPhone>");
                }
                if (zc03.f299969z) {
                    stringBuffer.append("<poiPriceTips>");
                    stringBuffer.append(zc03.f299968y);
                    stringBuffer.append("</poiPriceTips>");
                }
                if (zc03.f299945B) {
                    stringBuffer.append("<isfrompoilist>");
                    stringBuffer.append(zc03.f299944A ? "1" : "0");
                    stringBuffer.append("</isfrompoilist>");
                }
                if (zc03.f299947D) {
                    stringBuffer.append("<buildingId>");
                    stringBuffer.append(zc03.f299946C);
                    stringBuffer.append("</buildingId>");
                }
                if (zc03.f299949F) {
                    stringBuffer.append("<floorName>");
                    stringBuffer.append(zc03.f299948E);
                    stringBuffer.append("</floorName>");
                }
                stringBuffer.append("</locitem>");
            }
            C101841sc0 sc05 = rc02.f299296c1;
            if (sc05 == null || (ae02 = sc05.f299407f) == null || ae02.computeSize() == 0) {
                Log.m105926v("MicroMsg.FavDataItemParser", "klem toXml, url item empty");
            } else {
                C101756ae0 ae04 = sc05.f299407f;
                stringBuffer.append("<weburlitem>");
                if (ae04.f297868i) {
                    stringBuffer.append("<clean_url>");
                    stringBuffer.append(Util.escapeStringForXml(ae04.f297867h));
                    stringBuffer.append("</clean_url>");
                }
                if (ae04.f297866g) {
                    stringBuffer.append("<pagedesc>");
                    stringBuffer.append(Util.escapeStringForXml(ae04.f297865f));
                    stringBuffer.append("</pagedesc>");
                }
                if (ae04.f297870n) {
                    stringBuffer.append("<pagethumb_url>");
                    stringBuffer.append(Util.escapeStringForXml(ae04.f297869j));
                    stringBuffer.append("</pagethumb_url>");
                }
                if (ae04.f297864e) {
                    stringBuffer.append("<pagetitle>");
                    stringBuffer.append(Util.escapeStringForXml(ae04.f297863d));
                    stringBuffer.append("</pagetitle>");
                }
                if (ae04.f297872p) {
                    stringBuffer.append("<opencache>");
                    stringBuffer.append(ae04.f297871o);
                    stringBuffer.append("</opencache>");
                }
                if (ae04.f297874r) {
                    stringBuffer.append("<contentattr>");
                    stringBuffer.append(ae04.f297873q);
                    stringBuffer.append("</contentattr>");
                }
                if (ae04.f297876t) {
                    stringBuffer.append("<canvasPageXml>");
                    stringBuffer.append(Util.escapeStringForXml(ae04.f297875s));
                    stringBuffer.append("</canvasPageXml>");
                }
                if (ae04.f297878v) {
                    stringBuffer.append("<wsVideoFlowXml>");
                    stringBuffer.append(Util.escapeStringForXml(ae04.f297877u));
                    stringBuffer.append("</wsVideoFlowXml>");
                }
                stringBuffer.append("<forwardflag>");
                stringBuffer.append(ae04.f297879w);
                stringBuffer.append("</forwardflag>");
                if (!(!ae04.f297882z || (linkedList = ae04.f297881y) == null || linkedList.size() == 0)) {
                    stringBuffer.append("<excerptlist>");
                    for (int i2 = 0; i2 < ae04.f297881y.size(); i2++) {
                        C52097yc0 yc02 = ae04.f297881y.get(i2);
                        stringBuffer.append("<excerptitem>");
                        stringBuffer.append("<content>");
                        stringBuffer.append(Util.escapeStringForXml(yc02.f145226e));
                        stringBuffer.append("</content>");
                        stringBuffer.append("<excerptkey>");
                        stringBuffer.append(Util.escapeStringForXml(yc02.f145225d));
                        stringBuffer.append("</excerptkey>");
                        stringBuffer.append("<excerpturl>");
                        stringBuffer.append(Util.escapeStringForXml(yc02.f145227f));
                        stringBuffer.append("</excerpturl>");
                        stringBuffer.append("</excerptitem>");
                    }
                    stringBuffer.append("</excerptlist>");
                }
                C101755ad0 ad03 = sc05.f299421w;
                if (ad03 == null) {
                    Log.m105918d("MicroMsg.FavDataItemParser", "setMpMsgXml toXml, item empty");
                } else {
                    stringBuffer.append(C101368b.m133012c(ad03));
                }
                stringBuffer.append("</weburlitem>");
            }
            C101841sc0 sc06 = rc02.f299296c1;
            if (sc06 == null || (rk12 = sc06.f299423y) == null) {
                Log.m105918d("MicroMsg.FavDataItemParser", "klem toXml, finder item empty");
            } else {
                stringBuffer.append(C60167f1.m70147e(rk12));
            }
            C101841sc0 sc07 = rc02.f299296c1;
            if (sc07 == null || (t232 = sc07.f299401C) == null) {
                Log.m105918d("MicroMsg.FavDataItemParser", "klem toXml, music item empty");
            } else {
                stringBuffer.append(C98521u5.m127973a(t232));
            }
            C101841sc0 sc08 = rc02.f299296c1;
            if (sc08 == null || (p812 = sc08.f299424z) == null) {
                Log.m105918d("MicroMsg.FavDataItemParser", "klem toXml, finder live item empty");
            } else {
                stringBuffer.append(C60167f1.m70145c(p812));
            }
            C101841sc0 sc09 = rc02.f299296c1;
            if (sc09 == null || (tk13 = sc09.f299403E) == null) {
                Log.m105918d("MicroMsg.FavDataItemParser", "klem toXml, finder activity item empty");
            } else {
                stringBuffer.append(C60167f1.m70149g(tk13));
            }
            C101841sc0 sc010 = rc02.f299296c1;
            if (sc010 == null || (tk12 = sc010.f299402D) == null) {
                Log.m105918d("MicroMsg.FavDataItemParser", "klem toXml, finder topic item empty");
            } else {
                stringBuffer.append(C60167f1.m70149g(tk12));
            }
            C101841sc0 sc011 = rc02.f299296c1;
            if (sc011 == null || (ad02 = sc011.f299422x) == null) {
                Log.m105918d("MicroMsg.FavDataItemParser", "setMpVideoXml toXml, item empty");
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("<favbrandmpvideo>");
                stringBuffer2.append("<vid>");
                stringBuffer2.append(Util.escapeStringForXml(ad02.f297854j));
                stringBuffer2.append("</vid>");
                stringBuffer2.append("<videourl>");
                stringBuffer2.append(Util.escapeStringForXml(ad02.f297861t));
                stringBuffer2.append("</videourl>");
                stringBuffer2.append("<mpurl>");
                stringBuffer2.append(Util.escapeStringForXml(ad02.f297860s));
                stringBuffer2.append("</mpurl>");
                stringBuffer2.append("<bizusrname>");
                stringBuffer2.append(Util.escapeStringForXml(ad02.f297855n));
                stringBuffer2.append("</bizusrname>");
                stringBuffer2.append("<biznickname>");
                stringBuffer2.append(Util.escapeStringForXml(ad02.f297856o));
                stringBuffer2.append("</biznickname>");
                stringBuffer2.append("<thumburl>");
                stringBuffer2.append(Util.escapeStringForXml(ad02.f297859r));
                stringBuffer2.append("</thumburl>");
                stringBuffer2.append("<thumbwidth>");
                stringBuffer2.append(ad02.f297850f);
                stringBuffer2.append("</thumbwidth>");
                stringBuffer2.append("<thumbheight>");
                stringBuffer2.append(ad02.f297851g);
                stringBuffer2.append("</thumbheight>");
                stringBuffer2.append("<duration>");
                stringBuffer2.append(ad02.f297853i);
                stringBuffer2.append("</duration>");
                stringBuffer2.append("</favbrandmpvideo>");
                stringBuffer.append(stringBuffer2.toString());
            }
            C101841sc0 sc012 = rc02.f299296c1;
            if (sc012 == null || (jd02 = sc012.f299408g) == null || jd02.computeSize() == 0) {
                Log.m105926v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
            } else {
                C101793jd0 jd03 = sc012.f299408g;
                stringBuffer.append("<productitem");
                if (jd03.f298520p) {
                    stringBuffer.append(" type='");
                    stringBuffer.append(jd03.f298519o);
                    stringBuffer.append("'");
                }
                stringBuffer.append(">");
                if (jd03.f298512e) {
                    stringBuffer.append("<producttitle>");
                    stringBuffer.append(Util.escapeStringForXml(jd03.f298511d));
                    stringBuffer.append("</producttitle>");
                }
                if (jd03.f298514g) {
                    stringBuffer.append("<productdesc>");
                    stringBuffer.append(Util.escapeStringForXml(jd03.f298513f));
                    stringBuffer.append("</productdesc>");
                }
                if (jd03.f298516i) {
                    stringBuffer.append("<productthumb_url>");
                    stringBuffer.append(Util.escapeStringForXml(jd03.f298515h));
                    stringBuffer.append("</productthumb_url>");
                }
                if (jd03.f298518n) {
                    stringBuffer.append("<productinfo>");
                    stringBuffer.append(Util.escapeStringForXml(jd03.f298517j));
                    stringBuffer.append("</productinfo>");
                }
                stringBuffer.append("</productitem>");
            }
            C101841sc0 sc013 = rc02.f299296c1;
            if (sc013 == null || (ud02 = sc013.f299409h) == null || ud02.computeSize() == 0) {
                Log.m105926v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
            } else {
                C101850ud0 ud03 = sc013.f299409h;
                stringBuffer.append("<tvitem>");
                if (ud03.f299619e) {
                    stringBuffer.append("<tvtitle>");
                    stringBuffer.append(Util.escapeStringForXml(ud03.f299618d));
                    stringBuffer.append("</tvtitle>");
                }
                if (ud03.f299621g) {
                    stringBuffer.append("<tvdesc>");
                    stringBuffer.append(Util.escapeStringForXml(ud03.f299620f));
                    stringBuffer.append("</tvdesc>");
                }
                if (ud03.f299623i) {
                    stringBuffer.append("<tvthumb_url>");
                    stringBuffer.append(Util.escapeStringForXml(ud03.f299622h));
                    stringBuffer.append("</tvthumb_url>");
                }
                if (ud03.f299625n) {
                    stringBuffer.append("<tvinfo>");
                    stringBuffer.append(Util.escapeStringForXml(ud03.f299624j));
                    stringBuffer.append("</tvinfo>");
                }
                stringBuffer.append("</tvitem>");
            }
            m133007a(rc02.f299296c1, stringBuffer);
            stringBuffer.append("</dataitem>");
        }
        stringBuffer.append("</datalist>");
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0b59  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0b8a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0c30  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0cb8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0e39  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0e52  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.C101834rc0 m133009c(java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.String r18) {
        /*
            r1 = r17
            r0 = r18
            te3.rc0 r2 = new te3.rc0
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ".dataitem"
            r3.append(r4)
            java.lang.String r5 = ".$datatype"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r2.mo141260p(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r6 = ".$datasourceid"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.mo141259o(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r6 = ".$datastatus"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r2.f299291Y0 = r3
            r3 = 1
            r2.f299293Z0 = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".datafmt"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141261q(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".datatitle"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141246U(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".datadesc"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141265u(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".cdn_thumburl"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141256l(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".cdn_thumbkey"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141255k(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".thumb_width"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            r2.f299316o = r6
            r2.f299318p = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".thumb_height"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            r2.f299321q = r6
            r2.f299323r = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".cdn_dataurl"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141254j(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".cdn_datakey"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141253f(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".duration"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x017e
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x017e
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            r2.mo141266v(r6)
        L_0x017e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".stream_dataurl"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141240O(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".stream_lowbandurl"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141241P(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".stream_weburl"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141242Q(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".songalbumurl"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141235I(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".songlyric"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141236J(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".canvasPageXml"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141252d(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".fullmd5"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141268x(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".head256md5"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141270z(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".fullsize"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x0273
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            long r8 = (long) r6
            r2.mo141269y(r8)
        L_0x0273:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".dataext"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141267w(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".thumbfullmd5"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141245T(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".thumbhead256md5"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141244S(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".thumbfullsize"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x02e6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            long r8 = (long) r6
            r2.mo141243R(r8)
        L_0x02e6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".stream_videoid"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141250Y(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".$dataid"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x0325
            int r8 = r6.length()
            r9 = 32
            if (r8 >= r9) goto L_0x0331
        L_0x0325:
            java.lang.String r6 = r2.toString()
            int r8 = r2.f299258I
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r9 = pb1.C100734q.f295126a
            java.lang.String r6 = pb1.C100745t.m131892d(r6, r8)
        L_0x0331:
            r2.mo141257m(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".datasrctitle"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.f299294a1 = r6
            r2.f299295b1 = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".datasrcname"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141263s(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".datasrctime"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141264t(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".statextstr"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141239N(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".$htmlid"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141228A(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".$dataillegaltype"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            r2.mo141262r(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".messageuuid"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.mo141230C(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r8 = ".fromnewmsgid"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r8 = 0
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r6, r8)
            r2.mo141229B(r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r10 = ".sourceheadurl"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r2.f299247C1 = r6
            r2.f299249D1 = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r10 = ".filetype"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            r2.f299270O1 = r6
            r2.f299272P1 = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r10 = ".thumbfiletype"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            r2.f299267M1 = r6
            r2.f299269N1 = r3
            if (r0 == 0) goto L_0x047b
            r2.mo141234H(r0)
            java.lang.Class<pb1.a1> r6 = pb1.C100697a1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            pb1.a1 r6 = (pb1.C100697a1) r6
            te3.kd0 r0 = r6.mo135049T7(r0)
            r2.f299275Q1 = r0
        L_0x047b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r6 = ".streamvideo"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0566
            te3.uc0 r0 = new te3.uc0
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r10 = ".streamvideo.streamvideourl"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r10 = ""
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r0.f299610d = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = ".streamvideo.streamvideototaltime"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            r0.f299611e = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = ".streamvideo.streamvideotitle"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r0.f299614h = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = ".streamvideo.streamvideowording"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r0.f299612f = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = ".streamvideo.streamvideoweburl"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r0.f299613g = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = ".streamvideo.streamvideoaduxinfo"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r0.f299616j = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r11 = ".streamvideo.streamvideopublishid"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r0.f299617n = r6
            r2.f299306h1 = r0
        L_0x0566:
            te3.sc0 r6 = new te3.sc0
            r6.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r10 = ".dataitemsource"
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            boolean r10 = r1.containsKey(r0)
            java.lang.String r11 = ".appid"
            if (r10 != 0) goto L_0x0586
            goto L_0x06d1
        L_0x0586:
            te3.tc0 r10 = new te3.tc0
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = ".$sourcetype"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r5)
            r10.mo141309p(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = ".$sourceid"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r10.f299523j = r12
            r10.f299524n = r3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = ".fromusr"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r10.mo141306m(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = ".tousr"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r10.mo141310q(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = ".realchatname"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r10.mo141308o(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r13 = ".createtime"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r8)
            r10.f299527q = r8
            r10.f299528r = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = ".msgid"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r10.f299529s = r8
            r10.f299530t = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = ".eventid"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r10.f299531u = r8
            r10.f299532v = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r10.f299533w = r8
            r10.f299534x = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = ".link"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r10.mo141307n(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = ".brandid"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r10.mo141305l(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r0 = ".hashusername"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r10.f299515D = r0
            r10.f299516E = r3
            r6.f299405d = r10
        L_0x06d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r8 = ".locitem"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r8 = r1.containsKey(r0)
            if (r8 != 0) goto L_0x06ea
            goto L_0x0938
        L_0x06ea:
            te3.zc0 r8 = new te3.zc0
            r8.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".label"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0724
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141339v(r9)
        L_0x0724:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".poiname"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0759
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141322E(r9)
        L_0x0759:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".lng"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r12 = 0
            if (r10 != 0) goto L_0x077f
            double r9 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r9, r12)
            r8.mo141341x(r9)
        L_0x077f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".lat"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x07a3
            double r9 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r9, r12)
            r8.mo141340w(r9)
        L_0x07a3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".scale"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x07e0
            r10 = 46
            int r12 = r9.indexOf(r10)
            r13 = -1
            if (r12 == r13) goto L_0x07d9
            int r10 = r9.indexOf(r10)
            java.lang.String r9 = r9.substring(r5, r10)
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r13)
            r8.mo141323F(r9)
            goto L_0x07e0
        L_0x07d9:
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r13)
            r8.mo141323F(r9)
        L_0x07e0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".poiid"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0815
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141321C(r9)
        L_0x0815:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".poiCategoryTips"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x084a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141343z(r9)
        L_0x084a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".poiBusinessHour"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x087f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141342y(r9)
        L_0x087f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".poiPhone"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x08b4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141319A(r9)
        L_0x08b4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".poiPriceTips"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x08d9
            r10 = 0
            float r9 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r9, r10)
            r8.mo141320B(r9)
        L_0x08d9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".isfrompoilist"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x0902
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r5)
            if (r9 != r3) goto L_0x08fe
            r9 = 1
            goto L_0x08ff
        L_0x08fe:
            r9 = 0
        L_0x08ff:
            r8.mo141338u(r9)
        L_0x0902:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = ".buildingId"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.mo141336s(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = ".floorName"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r8.mo141337t(r0)
            r6.f299406e = r8
        L_0x0938:
            java.lang.String r8 = "MicroMsg.FavDataItemParser"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r9 = ".weburlitem"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            boolean r9 = r1.containsKey(r0)
            if (r9 != 0) goto L_0x0953
            goto L_0x0b3c
        L_0x0953:
            te3.ae0 r9 = new te3.ae0
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r12 = ".clean_url"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.f297867h = r10
            r9.f297868i = r3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r12 = ".pagedesc"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.mo141194n(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r12 = ".pagethumb_url"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.mo141197q(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r12 = ".pagetitle"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.mo141198r(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r12 = ".opencache"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r5)
            r9.mo141196p(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r12 = ".contentattr"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r5)
            r9.f297873q = r10
            r9.f297874r = r3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r9.f297875s = r7
            r9.f297876t = r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r10 = ".wsVideoFlowXml"
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r9.f297877u = r7
            r9.f297878v = r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = ".forwardflag"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            r9.mo141195o(r0)
            r6.f299407f = r9
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ Exception -> 0x0b2d }
            r7.<init>()     // Catch:{ Exception -> 0x0b2d }
            java.lang.String r10 = ".excerptitem"
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ Exception -> 0x0b2d }
            org.xml.sax.InputSource r12 = new org.xml.sax.InputSource     // Catch:{ Exception -> 0x0b2d }
            java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0b2d }
            byte[] r14 = r16.getBytes()     // Catch:{ Exception -> 0x0b2d }
            r13.<init>(r14)     // Catch:{ Exception -> 0x0b2d }
            r12.<init>(r13)     // Catch:{ Exception -> 0x0b2d }
            org.w3c.dom.Document r0 = r0.parse(r12)     // Catch:{ Exception -> 0x0b2d }
            r0.normalize()     // Catch:{ Exception -> 0x0b2d }
            org.w3c.dom.Element r0 = r0.getDocumentElement()     // Catch:{ Exception -> 0x0b2d }
            java.lang.String r12 = "excerptlist"
            org.w3c.dom.NodeList r0 = r0.getElementsByTagName(r12)     // Catch:{ Exception -> 0x0b2d }
            if (r0 == 0) goto L_0x0b25
            int r12 = r0.getLength()     // Catch:{ Exception -> 0x0b2d }
            if (r12 <= 0) goto L_0x0b25
            org.w3c.dom.Node r12 = r0.item(r5)     // Catch:{ Exception -> 0x0b2d }
            if (r12 == 0) goto L_0x0b25
            org.w3c.dom.Node r0 = r0.item(r5)     // Catch:{ Exception -> 0x0b2d }
            org.w3c.dom.NodeList r12 = r0.getChildNodes()     // Catch:{ Exception -> 0x0b2d }
            int r13 = r12.getLength()     // Catch:{ Exception -> 0x0b2d }
            r14 = 0
        L_0x0a9b:
            if (r14 >= r13) goto L_0x0b25
            r15 = 0
            org.w3c.dom.Node r0 = r12.item(r14)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.nodeToString(r0)     // Catch:{ Exception -> 0x0b15 }
            boolean r0 = r0 instanceof org.w3c.dom.Element     // Catch:{ Exception -> 0x0b15 }
            if (r0 != 0) goto L_0x0aab
            goto L_0x0b1d
        L_0x0aab:
            java.lang.String r0 = r3.trim()     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r5 = "<excerptitem"
            boolean r0 = r0.startsWith(r5)     // Catch:{ Exception -> 0x0b15 }
            if (r0 == 0) goto L_0x0abe
            java.lang.String r0 = "excerptitem"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r0, r15)     // Catch:{ Exception -> 0x0b15 }
            goto L_0x0abf
        L_0x0abe:
            r0 = r15
        L_0x0abf:
            if (r0 == 0) goto L_0x0b1d
            te3.yc0 r3 = new te3.yc0     // Catch:{ Exception -> 0x0b15 }
            r3.<init>()     // Catch:{ Exception -> 0x0b15 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b15 }
            r5.<init>()     // Catch:{ Exception -> 0x0b15 }
            r5.append(r10)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r15 = ".content"
            r5.append(r15)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b15 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0b15 }
            r3.f145226e = r5     // Catch:{ Exception -> 0x0b15 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b15 }
            r5.<init>()     // Catch:{ Exception -> 0x0b15 }
            r5.append(r10)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r15 = ".excerptkey"
            r5.append(r15)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b15 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0b15 }
            r3.f145225d = r5     // Catch:{ Exception -> 0x0b15 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b15 }
            r5.<init>()     // Catch:{ Exception -> 0x0b15 }
            r5.append(r10)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r15 = ".excerpturl"
            r5.append(r15)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b15 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0b15 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0b15 }
            r3.f145227f = r0     // Catch:{ Exception -> 0x0b15 }
            r7.add(r3)     // Catch:{ Exception -> 0x0b15 }
            goto L_0x0b1d
        L_0x0b15:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0b23 }
            r3 = 0
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r5)     // Catch:{ Exception -> 0x0b23 }
        L_0x0b1d:
            int r14 = r14 + 1
            r3 = 1
            r5 = 0
            goto L_0x0a9b
        L_0x0b23:
            r0 = move-exception
            goto L_0x0b2b
        L_0x0b25:
            r9.f297881y = r7     // Catch:{ Exception -> 0x0b23 }
            r3 = 1
            r9.f297882z = r3     // Catch:{ Exception -> 0x0b23 }
            goto L_0x0b3c
        L_0x0b2b:
            r3 = 1
            goto L_0x0b2e
        L_0x0b2d:
            r0 = move-exception
        L_0x0b2e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.toString()
            r5 = 0
            r3[r5] = r0
            java.lang.String r0 = "[setUrlItem] parseXML exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r3)
        L_0x0b3c:
            te3.rk1 r0 = ht1.C60167f1.m70151i(r4, r1)
            r6.f299423y = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = ".musicShareItem"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0b5f
            te3.t23 r0 = ht1.C98521u5.m127974b(r4, r1)
            r6.f299401C = r0
        L_0x0b5f:
            te3.p81 r0 = ht1.C60167f1.m70153k(r4, r1)
            r6.f299424z = r0
            te3.tk1 r0 = ht1.C60167f1.m70155m(r4, r1)
            r6.f299403E = r0
            te3.tk1 r0 = ht1.C60167f1.m70155m(r4, r1)
            r6.f299402D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = ".productitem"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L_0x0b8a
            goto L_0x0c18
        L_0x0b8a:
            te3.jd0 r3 = new te3.jd0
            r3.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".producttitle"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141207o(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".productdesc"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141204l(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".productthumb_url"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141206n(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".productinfo"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141205m(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ".$type"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            r3.mo141208p(r0)
            r6.f299408g = r3
        L_0x0c18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = ".tvitem"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L_0x0c30
            goto L_0x0c9f
        L_0x0c30:
            te3.ud0 r3 = new te3.ud0
            r3.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".tvtitle"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141318n(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".tvdesc"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141315k(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".tvthumb_url"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo141317m(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ".tvinfo"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.mo141316l(r0)
            r6.f299409h = r3
        L_0x0c9f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = ".appbranditem"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L_0x0cb8
            goto L_0x0e22
        L_0x0cb8:
            te3.pc0 r3 = new te3.pc0
            r3.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".username"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.f259741d = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.f259742e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".pkgtype"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r7 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)
            r3.f259743f = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".iconurl"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.f259744g = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".type"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r7 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)
            r3.f259745h = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".pagepath"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.f259746i = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".sourcedisplayname"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.f259747j = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".version"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r7 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)
            r3.f259748n = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r8 = ".disableforward"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)
            r3.f259749o = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r8 = ".tradingguaranteeflag"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)
            r3.f259750p = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r8 = ".showRelievedBuyFlag"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)
            r3.f259753s = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ".messageextradata"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.f259751q = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ".subtype"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            r3.f259752r = r0
            r6.f299420v = r3
        L_0x0e22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = ".weburlitem.appmsgshareitem"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            te3.ad0 r0 = rb1.C101368b.m133010a(r0, r1)
            if (r0 == 0) goto L_0x0e3b
            r6.f299421w = r0
        L_0x0e3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = ".favbrandmpvideo"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            te3.ad0 r0 = rb1.C101368b.m133011b(r0, r1)
            if (r0 == 0) goto L_0x0e54
            r6.f299422x = r0
        L_0x0e54:
            r2.f299296c1 = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rb1.C101367a.m133009c(java.lang.String, java.util.Map, java.lang.String):te3.rc0");
    }
}
