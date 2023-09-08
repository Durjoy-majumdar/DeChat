package ht1;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import pe3.C89349b;
import te3.C64258bf0;
import te3.C64350ew2;
import te3.C64378fw2;
import te3.C64581nk1;
import te3.C64609ok1;
import te3.C64623p81;
import te3.C64628pk1;
import te3.C64682rk1;
import te3.C64711sk1;
import te3.C64730tk1;
import te3.C64831xk1;

/* renamed from: ht1.f1 */
public class C60167f1 {
    /* renamed from: a */
    public static String m70143a(int i, String str) {
        return "<finder>" + "<type>" + i + "</type>" + "<detail>" + str + "</detail>" + "</finder>";
    }

    /* renamed from: b */
    public static int m70144b(Map<String, String> map, int i) {
        return map != null ? Util.getInt(map.get(".msg.appmsg.finder.type"), -1) : i;
    }

    /* renamed from: c */
    public static String m70145c(C64623p81 p812) {
        StringBuilder sb = new StringBuilder();
        if (p812 != null) {
            try {
                if (!Util.isNullOrNil(p812.f184778d)) {
                    sb.append("<finderLive>");
                    sb.append("<finderLiveID>");
                    sb.append(p812.f184778d);
                    sb.append("</finderLiveID>");
                    sb.append("<finderUsername>");
                    sb.append(Util.escapeStringForXml(p812.f184779e));
                    sb.append("</finderUsername>");
                    sb.append("<finderObjectID>");
                    sb.append(p812.f184780f);
                    sb.append("</finderObjectID>");
                    sb.append("<nickname>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184781g));
                    sb.append("</nickname>");
                    sb.append("<desc>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184782h));
                    sb.append("</desc>");
                    sb.append("<finderNonceID>");
                    sb.append(Util.escapeStringForXml(p812.f184790s));
                    sb.append("</finderNonceID>");
                    sb.append("<headUrl>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184789r));
                    sb.append("</headUrl>");
                    sb.append("<extFlag>");
                    sb.append(XmlParser.getCDataWrapper(String.valueOf(p812.f184792u)));
                    sb.append("</extFlag>");
                    sb.append("<media>");
                    sb.append("<coverUrl>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184783i));
                    sb.append("</coverUrl>");
                    sb.append("<height>");
                    sb.append(p812.f184785n);
                    sb.append("</height>");
                    sb.append("<width>");
                    sb.append(p812.f184784j);
                    sb.append("</width>");
                    sb.append("</media>");
                    sb.append("<liveStatus>");
                    sb.append(p812.f184791t);
                    sb.append("</liveStatus>");
                    sb.append("<sourceType>");
                    sb.append(p812.f184793v);
                    sb.append("</sourceType>");
                    sb.append("<liveSourceTypeStr>");
                    sb.append(p812.f184793v);
                    sb.append("</liveSourceTypeStr>");
                    sb.append("<ecSource>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184794w));
                    sb.append("</ecSource>");
                    sb.append("<authIconType>");
                    sb.append(p812.f184796y);
                    sb.append("</authIconType>");
                    sb.append("<authIconUrl>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184795x));
                    sb.append("</authIconUrl>");
                    sb.append("<bindType>");
                    sb.append(p812.f184797z);
                    sb.append("</bindType>");
                    sb.append("<bizUsername>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184757A));
                    sb.append("</bizUsername>");
                    sb.append("<bizNickname>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184758B));
                    sb.append("</bizNickname>");
                    sb.append("<chargeFlag>");
                    sb.append(p812.f184759C);
                    sb.append("</chargeFlag>");
                    sb.append("<liveNickname>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184762F));
                    sb.append("</liveNickname>");
                    sb.append("<liveUsername>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184763G));
                    sb.append("</liveUsername>");
                    sb.append("<byPassInfoString>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184764H));
                    sb.append("</byPassInfoString>");
                    sb.append("<relayIndex>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184765I));
                    sb.append("</relayIndex>");
                    sb.append("<eventNickname>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184766J));
                    sb.append("</eventNickname>");
                    sb.append("<eventHeadUrl>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184767K));
                    sb.append("</eventHeadUrl>");
                    sb.append("<eventId>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184768L));
                    sb.append("</eventId>");
                    sb.append("<participantIdentity>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184769M));
                    sb.append("</participantIdentity>");
                    sb.append("<eventStatus>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184770N));
                    sb.append("</eventStatus>");
                    sb.append("<streamStatus>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184771P));
                    sb.append("</streamStatus>");
                    sb.append("<coverEffectType>");
                    sb.append(p812.f184772Q);
                    sb.append("</coverEffectType>");
                    sb.append("<coverEffectText>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184773R));
                    sb.append("</coverEffectText>");
                    sb.append("<replayStatus>");
                    sb.append(p812.f184776U);
                    sb.append("</replayStatus>");
                    sb.append("<tailTagURL>");
                    sb.append(XmlParser.getCDataWrapper(p812.f184777V));
                    sb.append("</tailTagURL>");
                    sb.append("</finderLive>");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FinderShareParser", "make content error! %s", e.getMessage());
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m70146d(C64581nk1 nk12) {
        StringBuilder sb = new StringBuilder();
        if (nk12 != null) {
            try {
                if (!Util.isNullOrNil(nk12.f184475d)) {
                    sb.append("<finderColumn>");
                    sb.append("<cardId>");
                    sb.append(Util.escapeStringForXml(nk12.f184475d));
                    sb.append("</cardId>");
                    sb.append("<title>");
                    sb.append(Util.escapeStringForXml(nk12.f184476e));
                    sb.append("</title>");
                    sb.append("<secondTitle>");
                    sb.append(Util.escapeStringForXml(nk12.f184477f));
                    sb.append("</secondTitle>");
                    for (int i = 0; i < nk12.f184478g.size(); i++) {
                        String str = nk12.f184478g.get(i) + nk12.f184479h.get(i);
                        if (i == 0) {
                            sb.append("<iconUrl>");
                            sb.append(XmlParser.getCDataWrapper(str));
                            sb.append("</iconUrl>");
                        } else if (i == 1) {
                            sb.append("<iconUrl_1>");
                            sb.append(XmlParser.getCDataWrapper(str));
                            sb.append("</iconUrl_1>");
                        } else if (i == 2) {
                            sb.append("<iconUrl_2>");
                            sb.append(XmlParser.getCDataWrapper(str));
                            sb.append("</iconUrl_2>");
                        } else if (i == 3) {
                            sb.append("<iconUrl_3>");
                            sb.append(XmlParser.getCDataWrapper(str));
                            sb.append("</iconUrl_3>");
                        }
                    }
                    C89349b bVar = nk12.f184480i;
                    if (bVar != null) {
                        String str2 = new String(Base64.encode(bVar.mo123703f(), 0));
                        sb.append("<cardbuffer>");
                        sb.append(XmlParser.getCDataWrapper(str2));
                        sb.append("</cardbuffer>");
                    }
                    sb.append("</finderColumn>");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FinderShareParser", "make content error! %s", e.getMessage());
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m70147e(C64682rk1 rk12) {
        StringBuilder sb = new StringBuilder();
        if (rk12 != null) {
            try {
                if (!Util.isNullOrNil(rk12.f185183d)) {
                    sb.append("<finderFeed>");
                    sb.append("<objectId>");
                    sb.append(Util.nullAsNil(rk12.f185183d));
                    sb.append("</objectId>");
                    sb.append("<objectNonceId>");
                    sb.append(Util.nullAsNil(rk12.f185191o));
                    sb.append("</objectNonceId>");
                    sb.append("<feedType>");
                    sb.append(rk12.f185188i);
                    sb.append("</feedType>");
                    sb.append("<nickname>");
                    sb.append(Util.escapeStringForXml(rk12.f185185f));
                    sb.append("</nickname>");
                    sb.append("<username>");
                    sb.append(Util.escapeStringForXml(rk12.f185184e));
                    sb.append("</username>");
                    sb.append("<avatar>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185186g));
                    sb.append("</avatar>");
                    sb.append("<desc>");
                    sb.append(Util.escapeStringForXml(rk12.f185187h));
                    sb.append("</desc>");
                    sb.append("<mediaCount>");
                    sb.append(rk12.f185189j);
                    sb.append("</mediaCount>");
                    sb.append("<localId>");
                    sb.append(rk12.f185192p);
                    sb.append("</localId>");
                    sb.append("<authIconType>");
                    sb.append(rk12.f185196t);
                    sb.append("</authIconType>");
                    sb.append("<authIconUrl>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185197u));
                    sb.append("</authIconUrl>");
                    sb.append("<mediaList>");
                    Iterator<C64628pk1> it = rk12.f185190n.iterator();
                    while (it.hasNext()) {
                        C64628pk1 next = it.next();
                        sb.append("<media>");
                        sb.append("<mediaType>");
                        sb.append(next.f184826d);
                        sb.append("</mediaType>");
                        sb.append("<url>");
                        sb.append(XmlParser.getCDataWrapper(next.f184827e));
                        sb.append("</url>");
                        sb.append("<thumbUrl>");
                        sb.append(XmlParser.getCDataWrapper(next.f184828f));
                        sb.append("</thumbUrl>");
                        sb.append("<fullCoverUrl>");
                        sb.append(XmlParser.getCDataWrapper(next.f184832j));
                        sb.append("</fullCoverUrl>");
                        sb.append("<fullClipInset>");
                        sb.append(XmlParser.getCDataWrapper(next.f184833n));
                        sb.append("</fullClipInset>");
                        sb.append("<width>");
                        sb.append(next.f184829g);
                        sb.append("</width>");
                        sb.append("<height>");
                        sb.append(next.f184830h);
                        sb.append("</height>");
                        sb.append("<videoPlayDuration>");
                        sb.append(next.f184831i);
                        sb.append("</videoPlayDuration>");
                        sb.append("</media>");
                    }
                    sb.append("</mediaList>");
                    sb.append("<megaVideo>");
                    sb.append("<objectId>");
                    sb.append(Util.nullAsNil(rk12.f185193q));
                    sb.append("</objectId>");
                    sb.append("<objectNonceId>");
                    sb.append(Util.nullAsNil(rk12.f185194r));
                    sb.append("</objectNonceId>");
                    sb.append("</megaVideo>");
                    sb.append("<bizUsername>");
                    sb.append(Util.escapeStringForXml(rk12.f185195s));
                    sb.append("</bizUsername>");
                    sb.append("<bizNickname>");
                    sb.append(Util.escapeStringForXml(rk12.f185198v));
                    sb.append("</bizNickname>");
                    sb.append("<bizAvatar>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185199w));
                    sb.append("</bizAvatar>");
                    sb.append("<bizUsernameV2>");
                    sb.append(Util.escapeStringForXml(rk12.f185200x));
                    sb.append("</bizUsernameV2>");
                    sb.append("<bizAuthIconType>");
                    sb.append(rk12.f185201y);
                    sb.append("</bizAuthIconType>");
                    sb.append("<bizAuthIconUrl>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185202z));
                    sb.append("</bizAuthIconUrl>");
                    sb.append("<coverEffectType>");
                    sb.append(rk12.f185178A);
                    sb.append("</coverEffectType>");
                    sb.append("<coverEffectText>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185179B));
                    sb.append("</coverEffectText>");
                    sb.append("<finderForwardSource>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185180C));
                    sb.append("</finderForwardSource>");
                    sb.append("<contactJumpInfoStr>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185181D));
                    sb.append("</contactJumpInfoStr>");
                    sb.append("<ecSource>");
                    sb.append(XmlParser.getCDataWrapper(rk12.f185182E));
                    sb.append("</ecSource>");
                    sb.append("</finderFeed>");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FinderShareParser", "make content error! %s", e.getMessage());
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static String m70148f(C64711sk1 sk12) {
        StringBuilder sb = new StringBuilder();
        if (sk12 != null) {
            sb.append("<finderpoirelatedstream>");
            sb.append("<longitudeString>");
            sb.append(Util.escapeStringForXml(sk12.f185423e));
            sb.append("</longitudeString>");
            sb.append("<latitudeString>");
            sb.append(Util.escapeStringForXml(sk12.f185422d));
            sb.append("</latitudeString>");
            sb.append("<poiName>");
            sb.append(Util.escapeStringForXml(sk12.f185424f));
            sb.append("</poiName>");
            sb.append("<poiScaleString>");
            sb.append(Util.escapeStringForXml(sk12.f185425g));
            sb.append("</poiScaleString>");
            sb.append("<address>");
            sb.append(Util.escapeStringForXml(sk12.f185426h));
            sb.append("</address>");
            sb.append("<infoUrl>");
            sb.append(XmlParser.getCDataWrapper(sk12.f185427i));
            sb.append("</infoUrl>");
            sb.append("<poiClassifyId>");
            sb.append(Util.escapeStringForXml(sk12.f185428j));
            sb.append("</poiClassifyId>");
            sb.append("<poiCategories>");
            sb.append(Util.escapeStringForXml(sk12.f185429n));
            sb.append("</poiCategories>");
            sb.append("</finderpoirelatedstream>");
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static String m70149g(C64730tk1 tk12) {
        StringBuilder sb = new StringBuilder();
        if (tk12 != null && !Util.isNullOrNil(tk12.f185603d)) {
            sb.append("<finderTopic>");
            sb.append("<topic>");
            sb.append(Util.escapeStringForXml(tk12.f185603d));
            sb.append("</topic>");
            sb.append("<topicType>");
            sb.append(tk12.f185604e);
            sb.append("</topicType>");
            sb.append("<iconUrl>");
            sb.append(XmlParser.getCDataWrapper(tk12.f185605f));
            sb.append("</iconUrl>");
            sb.append("<desc>");
            sb.append(Util.escapeStringForXml(tk12.f185606g));
            sb.append("</desc>");
            sb.append("<patMusicId>");
            sb.append(Util.escapeStringForXml(tk12.f185608i));
            sb.append("</patMusicId>");
            if (tk12.f185607h != null) {
                sb.append("<location>");
                sb.append("<poiClassifyId>");
                sb.append(Util.escapeStringForXml(tk12.f185607h.f184668d));
                sb.append("</poiClassifyId>");
                sb.append("<longitude>");
                sb.append(tk12.f185607h.f184669e);
                sb.append("</longitude>");
                sb.append("<latitude>");
                sb.append(tk12.f185607h.f184670f);
                sb.append("</latitude>");
                sb.append("</location>");
            }
            if (tk12.f185609j != null) {
                sb.append("<event>");
                sb.append("<topicId>");
                sb.append(tk12.f185609j.f182280d);
                sb.append("</topicId>");
                sb.append("<name>");
                sb.append(Util.escapeStringForXml(tk12.f185609j.f182281e));
                sb.append("</name>");
                sb.append("<creatorNickName>");
                sb.append(Util.escapeStringForXml(tk12.f185609j.f182282f));
                sb.append("</creatorNickName>");
                sb.append("<hiddenMark>");
                sb.append(tk12.f185609j.f182284h);
                sb.append("</hiddenMark>");
                sb.append("<title>");
                sb.append(Util.escapeStringForXml(tk12.f185609j.f182285i));
                sb.append("</title>");
                sb.append("</event>");
            }
            sb.append("</finderTopic>");
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static String m70150h(C64378fw2 fw22) {
        StringBuilder sb = new StringBuilder();
        if (fw22 != null) {
            try {
                if (!Util.isNullOrNil(fw22.f183241d)) {
                    sb.append("<finderMegaVideo>");
                    sb.append("<objectId>");
                    sb.append(fw22.f183241d);
                    sb.append("</objectId>");
                    sb.append("<objectNonceId>");
                    sb.append(fw22.f183248n);
                    sb.append("</objectNonceId>");
                    sb.append("<nickname>");
                    sb.append(Util.escapeStringForXml(fw22.f183243f));
                    sb.append("</nickname>");
                    sb.append("<avatar>");
                    sb.append(XmlParser.getCDataWrapper(fw22.f183244g));
                    sb.append("</avatar>");
                    sb.append("<desc>");
                    sb.append(Util.escapeStringForXml(fw22.f183245h));
                    sb.append("</desc>");
                    sb.append("<username>");
                    sb.append(Util.escapeStringForXml(fw22.f183242e));
                    sb.append("</username>");
                    sb.append("<mediaCount>");
                    sb.append(fw22.f183246i);
                    sb.append("</mediaCount>");
                    sb.append("<mediaList>");
                    Iterator<C64350ew2> it = fw22.f183247j.iterator();
                    while (it.hasNext()) {
                        C64350ew2 next = it.next();
                        String cDataWrapper = !TextUtils.isEmpty(next.f183043h) ? XmlParser.getCDataWrapper(next.f183043h) : XmlParser.getCDataWrapper(next.f183040e);
                        sb.append("<media>");
                        sb.append("<url>");
                        sb.append(XmlParser.getCDataWrapper(next.f183039d));
                        sb.append("</url>");
                        sb.append("<thumbUrl>");
                        sb.append(XmlParser.getCDataWrapper(next.f183040e));
                        sb.append("</thumbUrl>");
                        sb.append("<width>");
                        sb.append(next.f183041f);
                        sb.append("</width>");
                        sb.append("<height>");
                        sb.append(next.f183042g);
                        sb.append("</height>");
                        sb.append("<coverUrl>");
                        sb.append(cDataWrapper);
                        sb.append("</coverUrl>");
                        sb.append("<videoPlayDuration>");
                        sb.append(next.f183044i);
                        sb.append("</videoPlayDuration>");
                        sb.append("</media>");
                    }
                    sb.append("</mediaList>");
                    sb.append("<finderFeed>");
                    sb.append("<objectId>");
                    sb.append(fw22.f183249o);
                    sb.append("</objectId>");
                    sb.append("<objectNonceId>");
                    sb.append(fw22.f183250p);
                    sb.append("</objectNonceId>");
                    sb.append("</finderFeed>");
                    sb.append("</finderMegaVideo>");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FinderShareParser", "make content error! %s", e.getMessage());
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static C64682rk1 m70151i(String str, Map<String, String> map) {
        C64682rk1 rk12 = new C64682rk1();
        try {
            String str2 = str + ".finderFeed";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".objectId")) {
                    rk12.f185183d = Util.nullAsNil(map.get(str2 + ".objectId"));
                    rk12.f185191o = Util.nullAsNil(map.get(str2 + ".objectNonceId"));
                    rk12.f185188i = Util.safeParseInt(map.get(str2 + ".feedType"));
                    rk12.f185185f = Util.nullAsNil(map.get(str2 + ".nickname"));
                    rk12.f185184e = Util.nullAsNil(map.get(str2 + ".username"));
                    rk12.f185186g = Util.nullAsNil(map.get(str2 + ".avatar"));
                    rk12.f185187h = Util.nullAsNil(map.get(str2 + ".desc"));
                    rk12.f185189j = Util.safeParseInt(map.get(str2 + ".mediaCount"));
                    rk12.f185192p = Util.safeParseLong(map.get(str2 + ".localId"));
                    rk12.f185196t = Util.safeParseInt(map.get(str2 + ".authIconType"));
                    rk12.f185197u = Util.nullAsNil(map.get(str2 + ".authIconUrl"));
                    for (int i = 0; i < rk12.f185189j; i++) {
                        C64628pk1 pk12 = new C64628pk1();
                        String str3 = str2 + ".mediaList.media";
                        if (i > 0) {
                            str3 = str3 + i;
                        }
                        pk12.f184826d = Util.safeParseInt(map.get(str3 + ".mediaType"));
                        pk12.f184827e = Util.nullAsNil(map.get(str3 + ".url"));
                        pk12.f184828f = Util.nullAsNil(map.get(str3 + ".thumbUrl"));
                        pk12.f184832j = Util.nullAsNil(map.get(str3 + ".fullCoverUrl"));
                        pk12.f184833n = Util.nullAsNil(map.get(str3 + ".fullClipInset"));
                        pk12.f184829g = Util.safeParseFloat(map.get(str3 + ".width"));
                        pk12.f184830h = Util.safeParseFloat(map.get(str3 + ".height"));
                        pk12.f184831i = Util.safeParseInt(map.get(str3 + ".videoPlayDuration"));
                        rk12.f185190n.add(pk12);
                    }
                    String str4 = str2 + ".megaVideo";
                    rk12.f185193q = Util.nullAsNil(map.get(str4 + ".objectId"));
                    rk12.f185194r = Util.nullAsNil(map.get(str4 + ".objectNonceId"));
                    rk12.f185195s = Util.nullAsNil(map.get(str2 + ".bizUsername"));
                    rk12.f185198v = Util.nullAsNil(map.get(str2 + ".bizNickname"));
                    rk12.f185199w = Util.nullAsNil(map.get(str2 + ".bizAvatar"));
                    rk12.f185200x = Util.nullAsNil(map.get(str2 + ".bizUsernameV2"));
                    rk12.f185201y = Util.safeParseInt(map.get(str2 + ".bizAuthIconType"));
                    rk12.f185202z = Util.nullAsNil(map.get(str2 + ".bizAuthIconUrl"));
                    rk12.f185178A = Util.safeParseInt(map.get(str2 + ".coverEffectType"));
                    rk12.f185179B = Util.nullAsNil(map.get(str2 + ".coverEffectText"));
                    rk12.f185180C = Util.nullAsNil(map.get(str2 + ".finderForwardSource"));
                    rk12.f185181D = Util.nullAsNil(map.get(str2 + ".contactJumpInfoStr"));
                    rk12.f185182E = Util.nullAsNil(map.get(str2 + ".ecSource"));
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        return rk12;
    }

    /* renamed from: j */
    public static C64581nk1 m70152j(String str, Map<String, String> map) {
        String str2;
        String str3;
        String str4;
        C64581nk1 nk12 = new C64581nk1();
        String str5 = str + ".finderColumn";
        String str6 = "";
        if (!map.isEmpty()) {
            nk12.f184480i = new C89349b(Base64.decode(Util.nullAsNil(map.get(str5 + ".cardbuffer")), 0));
            String nullAsNil = Util.nullAsNil(map.get(str5 + ".iconUrl"));
            String nullAsNil2 = Util.nullAsNil(map.get(str5 + ".iconUrl_1"));
            String nullAsNil3 = Util.nullAsNil(map.get(str5 + ".iconUrl_2"));
            String nullAsNil4 = Util.nullAsNil(map.get(str5 + ".iconUrl_3"));
            String[] split = nullAsNil.split("&token");
            nk12.f184478g.add(split[0]);
            LinkedList<String> linkedList = nk12.f184479h;
            if (split.length > 1) {
                str2 = "&token" + split[1];
            } else {
                str2 = str6;
            }
            linkedList.add(str2);
            String[] split2 = nullAsNil2.split("&token");
            nk12.f184478g.add(split2[0]);
            LinkedList<String> linkedList2 = nk12.f184479h;
            if (split2.length > 1) {
                str3 = "&token" + split2[1];
            } else {
                str3 = str6;
            }
            linkedList2.add(str3);
            String[] split3 = nullAsNil3.split("&token");
            nk12.f184478g.add(split3[0]);
            LinkedList<String> linkedList3 = nk12.f184479h;
            if (split3.length > 1) {
                str4 = "&token" + split3[1];
            } else {
                str4 = str6;
            }
            linkedList3.add(str4);
            String[] split4 = nullAsNil4.split("&token");
            nk12.f184478g.add(split4[0]);
            LinkedList<String> linkedList4 = nk12.f184479h;
            if (split4.length > 1) {
                str6 = "&token" + split4[1];
            }
            linkedList4.add(str6);
            nk12.f184475d = Util.nullAsNil(map.get(str5 + ".cardId"));
            nk12.f184476e = Util.nullAsNil(map.get(str5 + ".title"));
            nk12.f184477f = Util.nullAsNil(map.get(str5 + ".secondTitle"));
        } else {
            nk12.f184475d = str6;
            nk12.f184476e = str6;
            nk12.f184477f = str6;
            nk12.f184480i = null;
        }
        return nk12;
    }

    /* renamed from: k */
    public static C64623p81 m70153k(String str, Map<String, String> map) {
        C64623p81 p812 = new C64623p81();
        try {
            String str2 = str + ".finderLive";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".finderLiveID")) {
                    p812.f184778d = Util.nullAsNil(map.get(str2 + ".finderLiveID"));
                    p812.f184779e = Util.nullAsNil(map.get(str2 + ".finderUsername"));
                    p812.f184780f = Util.nullAsNil(map.get(str2 + ".finderObjectID"));
                    p812.f184781g = Util.nullAsNil(map.get(str2 + ".nickname"));
                    p812.f184782h = Util.nullAsNil(map.get(str2 + ".desc"));
                    p812.f184783i = Util.nullAsNil(map.get(str2 + ".media.coverUrl")).replace("&amp;", "&");
                    p812.f184785n = Util.safeParseFloat(map.get(str2 + ".media.height"));
                    p812.f184784j = Util.safeParseFloat(map.get(str2 + ".media.width"));
                    p812.f184789r = Util.nullAsNil(map.get(str2 + ".headUrl"));
                    p812.f184790s = Util.nullAsNil(map.get(str2 + ".finderNonceID"));
                    p812.f184791t = Util.safeParseInt(map.get(str2 + ".liveStatus"));
                    p812.f184793v = Util.safeParseInt(map.get(str2 + ".sourceType"));
                    String str3 = map.get(str2 + ".liveSourceTypeStr");
                    if (p812.f184793v == 0 && !Util.isNullOrNil(str3)) {
                        p812.f184793v = Util.safeParseInt(str3);
                    }
                    p812.f184796y = Util.safeParseInt(map.get(str2 + ".authIconType"));
                    p812.f184795x = Util.nullAsNil(map.get(str2 + ".authIconUrl"));
                    p812.f184797z = Util.safeParseInt(map.get(str2 + ".bindType"));
                    p812.f184757A = Util.nullAsNil(map.get(str2 + ".bizUsername"));
                    p812.f184758B = Util.nullAsNil(map.get(str2 + ".bizNickname"));
                    p812.f184759C = Util.safeParseInt(map.get(str2 + ".chargeFlag"));
                    p812.f184762F = Util.nullAsNil(map.get(str2 + ".liveNickname"));
                    p812.f184763G = Util.nullAsNil(map.get(str2 + ".liveUsername"));
                    p812.f184764H = Util.nullAsNil(map.get(str2 + ".byPassInfoString"));
                    p812.f184765I = Util.nullAsNil(map.get(str2 + ".relayIndex"));
                    p812.f184766J = Util.nullAsNil(map.get(str2 + ".eventNickname"));
                    p812.f184767K = Util.nullAsNil(map.get(str2 + ".eventHeadUrl"));
                    p812.f184768L = Util.nullAsNil(map.get(str2 + ".eventId"));
                    p812.f184769M = Util.nullAsNil(map.get(str2 + ".participantIdentity"));
                    p812.f184770N = Util.nullAsNil(map.get(str2 + ".eventStatus"));
                    p812.f184771P = Util.nullAsNil(map.get(str2 + ".streamStatus"));
                    p812.f184772Q = Util.safeParseInt(map.get(str2 + ".coverEffectType"));
                    p812.f184773R = Util.nullAsNil(map.get(str2 + ".coverEffectText"));
                    p812.f184774S = Util.nullAsNil(map.get(str2 + ".chatroomId"));
                    p812.f184775T = Util.safeParseInt(map.get(str2 + ".liveFlag"));
                    p812.f184776U = Util.safeParseInt(map.get(str2 + ".replayStatus"));
                    p812.f184777V = Util.nullAsNil(map.get(str2 + ".tailTagURL"));
                    int i = p812.f184791t;
                    if (!(i == 1 || i == 2)) {
                        Log.m105924i("MicroMsg.FinderShareParser", "[parseFinderLive] shareObject.liveStatus = " + p812.f184791t);
                        p812.f184791t = 1;
                    }
                    p812.f184792u = Util.safeParseInt(map.get(str2 + ".extFlag"));
                    p812.f184794w = Util.nullAsNil(map.get(str2 + ".ecSource"));
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        return p812;
    }

    /* renamed from: l */
    public static C64711sk1 m70154l(String str, Map<String, String> map) {
        C64711sk1 sk12 = new C64711sk1();
        String str2 = str + ".finderpoirelatedstream";
        if (!map.isEmpty()) {
            sk12.f185423e = Util.nullAsNil(map.get(str2 + ".longitudeString"));
            sk12.f185422d = Util.nullAsNil(map.get(str2 + ".latitudeString"));
            sk12.f185424f = Util.nullAsNil(map.get(str2 + ".poiName"));
            sk12.f185425g = Util.nullAsNil(map.get(str2 + ".poiScaleString"));
            sk12.f185426h = Util.nullAsNil(map.get(str2 + ".address"));
            sk12.f185427i = Util.nullAsNil(map.get(str2 + ".infoUrl"));
            sk12.f185428j = Util.nullAsNil(map.get(str2 + ".poiClassifyId"));
            sk12.f185429n = Util.nullAsNil(map.get(str2 + ".poiCategories"));
        } else {
            sk12.f185423e = "";
            sk12.f185422d = "";
            sk12.f185424f = "";
            sk12.f185425g = "";
            sk12.f185426h = "";
            sk12.f185427i = "";
            sk12.f185428j = "";
            sk12.f185429n = "";
        }
        return sk12;
    }

    /* renamed from: m */
    public static C64730tk1 m70155m(String str, Map<String, String> map) {
        C64730tk1 tk12 = new C64730tk1();
        String str2 = str + ".finderTopic";
        if (!map.isEmpty()) {
            tk12.f185603d = Util.nullAsNil(map.get(str2 + ".topic"));
            tk12.f185604e = Util.getInt(map.get(str2 + ".topicType"), -1);
            tk12.f185605f = Util.nullAsNil(map.get(str2 + ".iconUrl"));
            tk12.f185606g = Util.nullAsNil(map.get(str2 + ".desc"));
            tk12.f185608i = Util.nullAsNil(map.get(str2 + ".patMusicId"));
            C64609ok1 ok12 = new C64609ok1();
            ok12.f184668d = map.get(str2 + ".location.poiClassifyId");
            ok12.f184669e = Util.getFloat(map.get(str2 + ".location.longitude"), 0.0f);
            ok12.f184670f = Util.getFloat(map.get(str2 + ".location.latitude"), 0.0f);
            tk12.f185607h = ok12;
            if (map.get(str2 + ".event.topicId") != null) {
                C64258bf0 bf02 = new C64258bf0();
                bf02.f182280d = Util.nullAsNil(map.get(str2 + ".event.topicId"));
                bf02.f182281e = Util.nullAsNil(map.get(str2 + ".event.name"));
                bf02.f182282f = Util.nullAsNil(map.get(str2 + ".event.creatorNickName"));
                bf02.f182284h = Util.getLong(map.get(str2 + ".event.hiddenMark"), 0);
                bf02.f182285i = Util.nullAsNil(map.get(str2 + ".event.title"));
                tk12.f185609j = bf02;
            }
        } else {
            tk12.f185603d = "";
            tk12.f185604e = -1;
            tk12.f185605f = "";
            tk12.f185606g = "";
            tk12.f185607h = new C64609ok1();
        }
        return tk12;
    }

    /* renamed from: n */
    public static C64730tk1 m70156n(String str, Map<String, String> map) {
        C64730tk1 tk12 = new C64730tk1();
        String str2 = str + ".finderTopicShareItem";
        if (!map.isEmpty()) {
            tk12.f185603d = Util.nullAsNil(map.get(str2 + ".topic"));
            tk12.f185604e = Util.getInt(map.get(str2 + ".topicType"), -1);
            tk12.f185605f = Util.nullAsNil(map.get(str2 + ".iconUrl"));
            tk12.f185606g = Util.nullAsNil(map.get(str2 + ".desc"));
            tk12.f185608i = Util.nullAsNil(map.get(str2 + ".patMusicId"));
            C64609ok1 ok12 = new C64609ok1();
            ok12.f184668d = map.get(str2 + ".location.poiClassifyId");
            ok12.f184669e = Util.getFloat(map.get(str2 + ".location.longitude"), 0.0f);
            ok12.f184670f = Util.getFloat(map.get(str2 + ".location.latitude"), 0.0f);
            tk12.f185607h = ok12;
            if (map.get(str2 + ".event.topicId") != null) {
                C64258bf0 bf02 = new C64258bf0();
                bf02.f182280d = Util.nullAsNil(map.get(str2 + ".event.topicId"));
                bf02.f182281e = Util.nullAsNil(map.get(str2 + ".event.name"));
                bf02.f182282f = Util.nullAsNil(map.get(str2 + ".event.creatorNickName"));
                bf02.f182284h = Util.getLong(map.get(str2 + ".event.hiddenMark"), 0);
                bf02.f182285i = Util.nullAsNil(map.get(str2 + ".event.title"));
                tk12.f185609j = bf02;
            }
        } else {
            tk12.f185603d = "";
            tk12.f185604e = -1;
            tk12.f185605f = "";
            tk12.f185606g = "";
            tk12.f185607h = new C64609ok1();
        }
        return tk12;
    }

    /* renamed from: o */
    public static C64682rk1 m70157o(String str, Map<String, String> map) {
        C64682rk1 rk12 = new C64682rk1();
        try {
            String str2 = str + ".finder_feed";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".object_id")) {
                    rk12.f185183d = Util.nullAsNil(map.get(str2 + ".object_id"));
                    rk12.f185191o = Util.nullAsNil(map.get(str2 + ".object_nonce_id"));
                    rk12.f185188i = Util.safeParseInt(map.get(str2 + ".feed_type"));
                    rk12.f185185f = Util.nullAsNil(map.get(str2 + ".nickname"));
                    rk12.f185184e = Util.nullAsNil(map.get(str2 + ".username"));
                    rk12.f185186g = Util.nullAsNil(map.get(str2 + ".avatar"));
                    rk12.f185187h = Util.nullAsNil(map.get(str2 + ".desc"));
                    rk12.f185189j = Util.safeParseInt(map.get(str2 + ".media_count"));
                    rk12.f185192p = Util.safeParseLong(map.get(str2 + ".local_id"));
                    for (int i = 0; i < rk12.f185189j; i++) {
                        C64628pk1 pk12 = new C64628pk1();
                        String str3 = str2 + ".media_list.media";
                        if (i > 0) {
                            str3 = str3 + i;
                        }
                        pk12.f184826d = Util.safeParseInt(map.get(str3 + ".media_type"));
                        pk12.f184827e = Util.nullAsNil(map.get(str3 + ".url"));
                        pk12.f184828f = Util.nullAsNil(map.get(str3 + ".thumb_url"));
                        pk12.f184832j = Util.nullAsNil(map.get(str3 + ".full_cover_url"));
                        pk12.f184833n = Util.nullAsNil(map.get(str3 + ".full_clip_inset"));
                        pk12.f184829g = Util.safeParseFloat(map.get(str3 + ".width"));
                        pk12.f184830h = Util.safeParseFloat(map.get(str3 + ".height"));
                        pk12.f184831i = Util.safeParseInt(map.get(str3 + ".video_play_duration"));
                        rk12.f185190n.add(pk12);
                    }
                    String str4 = str2 + ".mega_video";
                    rk12.f185193q = Util.nullAsNil(map.get(str4 + ".object_id"));
                    rk12.f185194r = Util.nullAsNil(map.get(str4 + ".object_nonce_id"));
                    String nullAsNil = Util.nullAsNil(map.get(".msg.fromusername"));
                    rk12.f185195s = nullAsNil;
                    rk12.f185198v = rk12.f185185f;
                    rk12.f185199w = rk12.f185186g;
                    rk12.f185200x = nullAsNil;
                }
            }
            if (Util.isNullOrNil(rk12.f185183d) || Util.isNullOrNil(rk12.f185191o)) {
                rk12 = null;
            }
            return rk12;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: p */
    public static C64378fw2 m70158p(String str, Map<String, String> map) {
        C64378fw2 fw22 = new C64378fw2();
        try {
            String str2 = str + ".finderMegaVideo";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".objectId")) {
                    fw22.f183241d = Util.nullAsNil(map.get(str2 + ".objectId"));
                    fw22.f183248n = Util.nullAsNil(map.get(str2 + ".objectNonceId"));
                    fw22.f183243f = Util.nullAsNil(map.get(str2 + ".nickname"));
                    fw22.f183242e = Util.nullAsNil(map.get(str2 + ".username"));
                    fw22.f183244g = Util.nullAsNil(map.get(str2 + ".avatar"));
                    fw22.f183245h = Util.nullAsNil(map.get(str2 + ".desc"));
                    fw22.f183246i = Util.safeParseInt(map.get(str2 + ".mediaCount"));
                    for (int i = 0; i < fw22.f183246i; i++) {
                        C64350ew2 ew22 = new C64350ew2();
                        String str3 = str2 + ".mediaList.media";
                        if (i > 0) {
                            str3 = str3 + i;
                        }
                        ew22.f183039d = Util.nullAsNil(map.get(str3 + ".url"));
                        ew22.f183040e = Util.nullAsNil(map.get(str3 + ".thumbUrl"));
                        ew22.f183041f = Util.safeParseFloat(map.get(str3 + ".width"));
                        ew22.f183042g = Util.safeParseFloat(map.get(str3 + ".height"));
                        ew22.f183043h = Util.nullAsNil(map.get(str3 + ".coverUrl"));
                        ew22.f183044i = Util.safeParseInt(map.get(str3 + ".videoPlayDuration"));
                        fw22.f183247j.add(ew22);
                    }
                    String str4 = str2 + ".finderFeed";
                    fw22.f183249o = Util.nullAsNil(map.get(str4 + ".objectId"));
                    fw22.f183250p = Util.nullAsNil(map.get(str4 + ".objectNonceId"));
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        return fw22;
    }

    /* renamed from: q */
    public static C64831xk1 m70159q(String str, Map<String, String> map) {
        C64831xk1 xk12 = new C64831xk1();
        try {
            String str2 = str + ".finderShopWindowShare";
            if (!map.isEmpty()) {
                xk12.f186326d = Util.nullAsNil(map.get(str2 + ".finderUsername"));
                xk12.f186327e = Util.nullAsNil(map.get(str2 + ".avatar"));
                xk12.f186328f = Util.nullAsNil(map.get(str2 + ".nickname"));
                xk12.f186329g = Util.nullAsNil(map.get(str2 + ".commodityInStockCount"));
                xk12.f186330h = Util.nullAsNil(map.get(str2 + ".appId"));
                xk12.f186331i = Util.nullAsNil(map.get(str2 + ".path"));
                xk12.f186332j = Util.nullAsNil(map.get(str2 + ".appUsername"));
                xk12.f186333n = Util.nullAsNil(map.get(str2 + ".query"));
                xk12.f186334o = Util.nullAsNil(map.get(str2 + ".liteAppId"));
                xk12.f186335p = Util.nullAsNil(map.get(str2 + ".liteAppPath"));
                xk12.f186336q = Util.nullAsNil(map.get(str2 + ".liteAppQuery"));
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        return xk12;
    }
}
