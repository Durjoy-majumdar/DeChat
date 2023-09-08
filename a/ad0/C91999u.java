package ad0;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import ht1.C60167f1;
import java.util.LinkedList;
import java.util.Map;
import kg3.C76577a;
import p823sg.C90193h;
import te3.C101779g1;
import te3.C101789j00;
import te3.C101799k1;
import te3.C101802kr2;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C101833r5;
import te3.C101838s5;
import te3.C64252b5;
import te3.C64401gm3;
import te3.C64623p81;
import te3.C64721t5;
import te3.C64730tk1;
import te3.d05;
import te3.w25;

/* renamed from: ad0.u */
public final class C91999u {
    /* renamed from: a */
    public static C101799k1 m115555a(Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("fillContentActionInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        C101799k1 k1Var = new C101799k1();
        int r = m115572r(map.get(".TimelineObject.actionInfo.scene"));
        String t = m115574t(map.get(".TimelineObject.actionInfo.appid"));
        int r2 = m115572r(map.get(".TimelineObject.actionInfo.type"));
        String t2 = m115574t(map.get(".TimelineObject.actionInfo.url"));
        String t3 = m115574t(map.get(".TimelineObject.actionInfo.mediaTagName"));
        String t4 = m115574t(map.get(".TimelineObject.actionInfo.wordingKey"));
        k1Var.f298577g = t;
        k1Var.f298576f = r;
        k1Var.f298574d = r2;
        k1Var.f298575e = t2;
        k1Var.f298578h = t3;
        k1Var.f298579i = t4;
        C101779g1 g1Var = new C101779g1();
        String t5 = m115574t(map.get(".TimelineObject.actionInfo.appMsg.appid"));
        String t6 = m115574t(map.get(".TimelineObject.actionInfo.appMsg.mediaTagName"));
        String t7 = m115574t(map.get(".TimelineObject.actionInfo.appMsg.messageExt"));
        String t8 = m115574t(map.get(".TimelineObject.actionInfo.appMsg.messageAction"));
        g1Var.f298271d = t5;
        g1Var.f298272e = t6;
        g1Var.f298273f = t7;
        g1Var.f298274g = t8;
        k1Var.f298580j = g1Var;
        int r3 = m115572r(map.get(".TimelineObject.actionInfo.appActionScene.installedActionScene"));
        int r4 = m115572r(map.get(".TimelineObject.actionInfo.appActionScene.uninstalledActionScene"));
        String t9 = m115574t(map.get(".TimelineObject.actionInfo.appJumpWordingKey.installedWordingKey"));
        String t15 = m115574t(map.get(".TimelineObject.actionInfo.appJumpWordingKey.uninstalledWordingKey"));
        k1Var.f298581n = m115574t(map.get(".TimelineObject.actionInfo.newWordingKey"));
        C64252b5 b5Var = new C64252b5();
        b5Var.f182212d = r3;
        b5Var.f182213e = r4;
        C64721t5 t5Var = new C64721t5();
        t5Var.f185499d = t9;
        t5Var.f185500e = t15;
        k1Var.f298582o = b5Var;
        k1Var.f298583p = t5Var;
        k1Var.f298584q = m115569o(map.get(".TimelineObject.actionInfo.installedWording"));
        k1Var.f298585r = m115569o(map.get(".TimelineObject.actionInfo.uninstalledWording"));
        SnsMethodCalculate.markEndTimeMs("fillContentActionInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        return k1Var;
    }

    /* renamed from: b */
    public static C64401gm3 m115556b(String str) {
        SnsMethodCalculate.markStartTimeMs("fillRabbit2023", "com.tencent.mm.modelsns.TimeLineHelper");
        int indexOf = str.indexOf("<Rabbit2023>");
        int indexOf2 = str.indexOf("</Rabbit2023>");
        C64623p81 p812 = null;
        if (indexOf < 0 || indexOf2 < 0) {
            SnsMethodCalculate.markEndTimeMs("fillRabbit2023", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        C64401gm3 gm32 = new C64401gm3();
        int indexOf3 = str.indexOf("<SpringFinderLive>", indexOf);
        int indexOf4 = str.indexOf("</SpringFinderLive>", indexOf);
        if (indexOf3 >= 0 && indexOf4 >= 0) {
            String trim = str.substring(indexOf3, indexOf4 + 19).trim();
            if (!TextUtils.isEmpty(trim)) {
                SnsMethodCalculate.markStartTimeMs("fillSpringShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
                C64623p81 p813 = new C64623p81();
                int indexOf5 = trim.indexOf("<SpringFinderLive>");
                int indexOf6 = trim.indexOf("</SpringFinderLive>");
                if (indexOf5 < 0 || indexOf6 < 0) {
                    SnsMethodCalculate.markEndTimeMs("fillSpringShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
                } else {
                    Map<String, String> parseXml = XmlParser.parseXml(trim.substring(indexOf5, indexOf6 + 19), "SpringFinderLive", (String) null);
                    if (parseXml != null) {
                        SnsMethodCalculate.markStartTimeMs("parseFestivalFinderLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        C64623p81 p814 = new C64623p81();
                        try {
                            if (!parseXml.isEmpty()) {
                                p814.f184778d = Util.nullAsNil(parseXml.get(".SpringFinderLive.finderLiveID"));
                                p814.f184779e = Util.nullAsNil(parseXml.get(".SpringFinderLive.finderUsername"));
                                p814.f184780f = Util.nullAsNil(parseXml.get(".SpringFinderLive.finderObjectID"));
                                p814.f184781g = Util.nullAsNil(parseXml.get(".SpringFinderLive.nickname"));
                                p814.f184782h = Util.nullAsNil(parseXml.get(".SpringFinderLive.desc"));
                                p814.f184783i = Util.nullAsNil(parseXml.get(".SpringFinderLive.media.coverUrl")).replace("&amp;", "&");
                                p814.f184785n = Util.safeParseFloat(parseXml.get(".SpringFinderLive.media.height"));
                                p814.f184784j = Util.safeParseFloat(parseXml.get(".SpringFinderLive.media.width"));
                                p814.f184789r = Util.nullAsNil(parseXml.get(".SpringFinderLive.headUrl"));
                                p814.f184790s = Util.nullAsNil(parseXml.get(".SpringFinderLive.finderNonceID"));
                                p814.f184791t = Util.safeParseInt(parseXml.get(".SpringFinderLive.liveStatus"));
                                p814.f184793v = Util.safeParseInt(parseXml.get(".SpringFinderLive.sourceType"));
                                String str2 = parseXml.get(".SpringFinderLive.liveSourceTypeStr");
                                if (p814.f184793v == 0 && !Util.isNullOrNil(str2)) {
                                    p814.f184793v = Util.safeParseInt(str2);
                                }
                                p814.f184796y = Util.safeParseInt(parseXml.get(".SpringFinderLive.authIconType"));
                                p814.f184795x = Util.nullAsNil(parseXml.get(".SpringFinderLive.authIconUrl"));
                                p814.f184797z = Util.safeParseInt(parseXml.get(".SpringFinderLive.bindType"));
                                p814.f184757A = Util.nullAsNil(parseXml.get(".SpringFinderLive.bizUsername"));
                                p814.f184758B = Util.nullAsNil(parseXml.get(".SpringFinderLive.bizNickname"));
                                p814.f184759C = Util.safeParseInt(parseXml.get(".SpringFinderLive.chargeFlag"));
                                p814.f184762F = Util.nullAsNil(parseXml.get(".SpringFinderLive.liveNickname"));
                                p814.f184763G = Util.nullAsNil(parseXml.get(".SpringFinderLive.liveUsername"));
                                p814.f184764H = Util.nullAsNil(parseXml.get(".SpringFinderLive.byPassInfoString"));
                                p814.f184765I = Util.nullAsNil(parseXml.get(".SpringFinderLive.relayIndex"));
                                p814.f184766J = Util.nullAsNil(parseXml.get(".SpringFinderLive.eventNickname"));
                                p814.f184767K = Util.nullAsNil(parseXml.get(".SpringFinderLive.eventHeadUrl"));
                                p814.f184768L = Util.nullAsNil(parseXml.get(".SpringFinderLive.eventId"));
                                p814.f184769M = Util.nullAsNil(parseXml.get(".SpringFinderLive.participantIdentity"));
                                p814.f184770N = Util.nullAsNil(parseXml.get(".SpringFinderLive.eventStatus"));
                                p814.f184771P = Util.nullAsNil(parseXml.get(".SpringFinderLive.streamStatus"));
                                p814.f184772Q = Util.safeParseInt(parseXml.get(".SpringFinderLive.coverEffectType"));
                                p814.f184773R = Util.nullAsNil(parseXml.get(".SpringFinderLive.coverEffectText"));
                                p814.f184774S = Util.nullAsNil(parseXml.get(".SpringFinderLive.chatroomId"));
                                p814.f184775T = Util.safeParseInt(parseXml.get(".SpringFinderLive.liveFlag"));
                                p814.f184776U = Util.safeParseInt(parseXml.get(".SpringFinderLive.replayStatus"));
                                p814.f184777V = Util.nullAsNil(parseXml.get(".SpringFinderLive.tailTagURL"));
                                int i = p814.f184791t;
                                if (!(i == 1 || i == 2)) {
                                    Log.m105924i("MicroMsg.FinderShareParser", "[parseFinderLive] shareObject.liveStatus = " + p814.f184791t);
                                    p814.f184791t = 1;
                                }
                                p814.f184792u = Util.safeParseInt(parseXml.get(".SpringFinderLive.extFlag"));
                                p814.f184794w = Util.nullAsNil(parseXml.get(".SpringFinderLive.ecSource"));
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
                        }
                        SnsMethodCalculate.markStartTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        SnsMethodCalculate.markEndTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        SnsMethodCalculate.markEndTimeMs("parseFestivalFinderLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                        p813 = p814;
                    }
                    SnsMethodCalculate.markStartTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                    SnsMethodCalculate.markEndTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
                    SnsMethodCalculate.markEndTimeMs("fillSpringShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
                    p812 = p813;
                }
                gm32.f183351d = p812;
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillRabbit2023", "com.tencent.mm.modelsns.TimeLineHelper");
        return gm32;
    }

    /* renamed from: c */
    public static C64730tk1 m115557c(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
        C64730tk1 tk12 = new C64730tk1();
        int indexOf = str.indexOf("<finder>");
        int indexOf2 = str.indexOf("</finder>");
        if (indexOf < 0 || indexOf2 < 0) {
            SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        String substring = str.substring(indexOf, indexOf2 + 9);
        int indexOf3 = substring.indexOf("<finderTopic>");
        int indexOf4 = substring.indexOf("</finderTopic>");
        if (indexOf3 < 0 || indexOf4 < 0) {
            SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(substring.substring(indexOf3, indexOf4 + 14), "finderTopic", (String) null);
        if (parseXml != null) {
            if (String.valueOf(i).equals(parseXml.get(".finderTopic.topicType"))) {
                tk12 = C60167f1.m70155m("", parseXml);
            } else {
                SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
                return null;
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillShareFinderActivity", "com.tencent.mm.modelsns.TimeLineHelper");
        return tk12;
    }

    /* renamed from: d */
    public static C64623p81 m115558d(String str) {
        SnsMethodCalculate.markStartTimeMs("fillShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
        C64623p81 p812 = new C64623p81();
        int indexOf = str.indexOf("<finderLive>");
        int indexOf2 = str.indexOf("</finderLive>");
        if (indexOf < 0 || indexOf2 < 0) {
            SnsMethodCalculate.markEndTimeMs("fillShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str.substring(indexOf, indexOf2 + 13), "finderLive", (String) null);
        if (parseXml != null) {
            SnsMethodCalculate.markStartTimeMs("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
            C64623p81 k = C60167f1.m70153k("", parseXml);
            SnsMethodCalculate.markStartTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            SnsMethodCalculate.markEndTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            SnsMethodCalculate.markEndTimeMs("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
            p812 = k;
        }
        SnsMethodCalculate.markStartTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        SnsMethodCalculate.markEndTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        SnsMethodCalculate.markEndTimeMs("fillShareFinderLive", "com.tencent.mm.modelsns.TimeLineHelper");
        return p812;
    }

    /* renamed from: e */
    public static w25 m115559e(Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("fillWebSearchInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        w25 w25 = new w25();
        w25.f259899d = m115574t(map.get(".TimelineObject.websearch.relevant_vid"));
        w25.f259900e = m115574t(map.get(".TimelineObject.websearch.relevant_expand"));
        w25.f259901f = m115574t(map.get(".TimelineObject.websearch.relevant_pre_searchid"));
        w25.f259902g = m115574t(map.get(".TimelineObject.websearch.relevant_shared_openid"));
        w25.f259903h = m115573s(map.get(".TimelineObject.websearch.rec_category"));
        w25.f259905j = m115574t(map.get(".TimelineObject.websearch.shareUrl"));
        w25.f259906n = m115574t(map.get(".TimelineObject.websearch.shareTitle"));
        w25.f259907o = m115574t(map.get(".TimelineObject.websearch.shareDesc"));
        w25.f259908p = m115574t(map.get(".TimelineObject.websearch.shareImgUrl"));
        w25.f259909q = m115574t(map.get(".TimelineObject.websearch.shareString"));
        w25.f259910r = m115574t(map.get(".TimelineObject.websearch.shareStringUrl"));
        w25.f259911s = m115574t(map.get(".TimelineObject.websearch.source"));
        w25.f259912t = m115574t(map.get(".TimelineObject.websearch.sourceUrl"));
        w25.f259904i = m115574t(map.get(".TimelineObject.websearch.strPlayCount"));
        w25.f259913u = m115574t(map.get(".TimelineObject.websearch.titleUrl"));
        w25.f259914v = m115574t(map.get(".TimelineObject.websearch.extReqParams"));
        w25.f259915w = m115574t(map.get(".TimelineObject.websearch.tagList"));
        w25.f259916x = m115573s(map.get(".TimelineObject.websearch.channelId"));
        w25.f259918z = m115574t(map.get(".TimelineObject.websearch.shareTag"));
        SnsMethodCalculate.markEndTimeMs("fillWebSearchInfo", "com.tencent.mm.modelsns.TimeLineHelper");
        return w25;
    }

    /* renamed from: f */
    public static C101804kv2 m115560f() {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        C101804kv2 kv22 = new C101804kv2();
        kv22.f298691f = "";
        kv22.f298696n = 0;
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        return kv22;
    }

    /* renamed from: g */
    public static C101804kv2 m115561g(String str, int i, String str2, String str3, int i2, int i3, int i4, String str4, C101817mv2 mv22) {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        C101804kv2 kv22 = new C101804kv2();
        kv22.f298689d = m115574t(str);
        kv22.f298690e = i;
        kv22.f298691f = m115574t(str4);
        kv22.f298692g = m115574t(str2);
        kv22.f298693h = i2;
        kv22.f298694i = m115574t(str3);
        kv22.f298695j = i3;
        kv22.f298696n = i4;
        kv22.f298698p = mv22;
        kv22.f298673F = C90193h.m112878f(str2 == null ? "".getBytes() : str2.getBytes());
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        return kv22;
    }

    /* renamed from: h */
    public static C101804kv2 m115562h(String str, int i, String str2, String str3, int i2, int i3, String str4) {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        C101804kv2 kv22 = new C101804kv2();
        kv22.f298689d = str;
        kv22.f298690e = i;
        kv22.f298692g = str2;
        kv22.f298694i = str3;
        kv22.f298693h = i2;
        kv22.f298695j = i3;
        kv22.f298691f = str4;
        C101817mv2 mv22 = new C101817mv2();
        mv22.f298876e = 0.0f;
        mv22.f298875d = 0.0f;
        mv22.f298877f = 0.0f;
        kv22.f298698p = mv22;
        kv22.f298673F = C90193h.m112878f(str2 == null ? "".getBytes() : str2.getBytes());
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
        return kv22;
    }

    /* renamed from: i */
    public static TimeLineObject m115563i() {
        SnsMethodCalculate.markStartTimeMs("getNewTimeLine", "com.tencent.mm.modelsns.TimeLineHelper");
        TimeLineObject timeLineObject = new TimeLineObject();
        C101789j00 j002 = new C101789j00();
        timeLineObject.AppInfo = new C101833r5();
        timeLineObject.ContentObj = j002;
        timeLineObject.Privated = 0;
        timeLineObject.CreateTime = 0;
        timeLineObject.f283893Id = "";
        C101802kr2 kr22 = new C101802kr2();
        kr22.f298648e = 0.0f;
        kr22.f298647d = 0.0f;
        timeLineObject.Location = kr22;
        timeLineObject.canvasInfo = "";
        timeLineObject.weappInfo = new d05();
        timeLineObject.videoTemplate = null;
        SnsMethodCalculate.markEndTimeMs("getNewTimeLine", "com.tencent.mm.modelsns.TimeLineHelper");
        return timeLineObject;
    }

    /* renamed from: j */
    public static Pair<Integer, Integer> m115564j(Context context) {
        SnsMethodCalculate.markStartTimeMs("getTimelineLiveSize", "com.tencent.mm.modelsns.TimeLineHelper");
        float fromDPToPix = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 225.0f);
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf((int) ((3.0f * fromDPToPix) / 4.0f)), Integer.valueOf((int) fromDPToPix));
        SnsMethodCalculate.markEndTimeMs("getTimelineLiveSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create;
    }

    /* renamed from: k */
    public static Pair<Integer, Integer> m115565k(int i, int i2, Context context, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        if (i <= 0) {
            i = C0947jz.f2205e;
        }
        if (i2 <= 0) {
            i2 = 240;
        }
        if (context == null) {
            Log.m105920e("MicroMsg.TimeLineHelper", "the context is null");
            Pair<Integer, Integer> create = Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
            SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
            return create;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int min = ((displayMetrics != null ? (int) Math.min(((float) displayMetrics.widthPixels) * 0.63f, ((float) displayMetrics.heightPixels) * 0.63f) : i) >> 5) << 5;
        if (i < i2) {
            min = Math.min(BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 160.0f), min);
        }
        int i3 = (int) (((((double) min) * 1.0d) * ((double) i2)) / ((double) i));
        if (!z) {
            int b = C76577a.m92151b(context, 225);
            int b2 = C76577a.m92151b(context, 169);
            if (i3 > min || i3 == min) {
                min = b2;
                i3 = b;
            } else {
                i3 = b2;
                min = b;
            }
        }
        Log.m105925i("MicroMsg.TimeLineHelper", "getTimelineVideoSize: width %d, height %d, expectWidth %d,expectHeight %d, isAd: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(min), Integer.valueOf(i3), Boolean.valueOf(z));
        Pair<Integer, Integer> create2 = Pair.create(Integer.valueOf(min), Integer.valueOf(i3));
        SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create2;
    }

    /* renamed from: l */
    public static Pair<Integer, Integer> m115566l(TimeLineObject timeLineObject, Context context, boolean z) {
        int i;
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        C101804kv2 kv22;
        C101817mv2 mv22;
        SnsMethodCalculate.markStartTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        int i2 = 0;
        if (!(timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.size() <= 0 || (kv22 = timeLineObject.ContentObj.f298427h.get(0)) == null || (mv22 = kv22.f298698p) == null)) {
            float f = mv22.f298875d;
            if (f > 0.0f) {
                float f2 = mv22.f298876e;
                if (f2 > 0.0f) {
                    i2 = (int) f;
                    i = (int) f2;
                    Pair<Integer, Integer> k = m115565k(i2, i, context, z);
                    SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
                    return k;
                }
            }
        }
        i = 0;
        Pair<Integer, Integer> k2 = m115565k(i2, i, context, z);
        SnsMethodCalculate.markEndTimeMs("getTimelineSightSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return k2;
    }

    /* renamed from: m */
    public static Pair<Integer, Integer> m115567m(int i, int i2, Context context) {
        double d;
        double d2;
        SnsMethodCalculate.markStartTimeMs("getTimelineSinglePhotoSize", "com.tencent.mm.modelsns.TimeLineHelper");
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 160.0f);
        int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 200.0f);
        int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 44.0f);
        double d3 = (double) i;
        double d4 = (double) i2;
        double d5 = 1.0d;
        if (d3 <= 0.0d || d4 <= 0.0d) {
            d = (double) fromDPToPix;
            d2 = d;
        } else {
            d2 = (double) fromDPToPix2;
            double min = Math.min(d2 / d3, d2 / d4);
            d = d3 * min;
            double d6 = d4 * min;
            double d7 = (double) fromDPToPix3;
            if (d < d7) {
                double d8 = (d7 * 1.0d) / d;
                d *= d8;
                d6 *= d8;
            }
            if (d6 < d7) {
                double d9 = (d7 * 1.0d) / d6;
                d *= d9;
                d6 *= d9;
            }
            if (d > d2) {
                d = d2;
            }
            if (d6 <= d2) {
                d2 = d6;
            }
        }
        if (d < 1.0d) {
            d = 1.0d;
        }
        if (d2 >= 1.0d) {
            d5 = d2;
        }
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf((int) d), Integer.valueOf((int) d5));
        SnsMethodCalculate.markEndTimeMs("getTimelineSinglePhotoSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create;
    }

    /* renamed from: n */
    public static Pair<Integer, Integer> m115568n(Context context) {
        SnsMethodCalculate.markStartTimeMs("getTimelineVerticalSightAdSize", "com.tencent.mm.modelsns.TimeLineHelper");
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf(C76577a.m92151b(context, 127)), Integer.valueOf(C76577a.m92151b(context, 225)));
        SnsMethodCalculate.markEndTimeMs("getTimelineVerticalSightAdSize", "com.tencent.mm.modelsns.TimeLineHelper");
        return create;
    }

    /* renamed from: o */
    public static C101838s5 m115569o(String str) {
        SnsMethodCalculate.markStartTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        String u = m115575u(str);
        Map<String, String> parseXml = XmlParser.parseXml("<root>" + u + "</root>", "root", (String) null);
        if (parseXml == null) {
            SnsMethodCalculate.markEndTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
            return null;
        }
        C101838s5 s5Var = new C101838s5();
        s5Var.f299376d = m115574t(parseXml.get(".root.en"));
        s5Var.f299377e = m115574t(parseXml.get(".root.zh-CN"));
        s5Var.f299378f = m115574t(parseXml.get(".root.zh-TW"));
        SnsMethodCalculate.markEndTimeMs("parseAppJumpWording", "com.tencent.mm.modelsns.TimeLineHelper");
        return s5Var;
    }

    /* renamed from: p */
    public static float m115570p(String str) {
        SnsMethodCalculate.markStartTimeMs("parserFloat", "com.tencent.mm.modelsns.TimeLineHelper");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.modelsns.TimeLineHelper");
            return 0.0f;
        }
        float f = Util.getFloat(str, 0.0f);
        SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.modelsns.TimeLineHelper");
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x0c0f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0d2b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0d30  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0efd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0f35  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0f4d  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.protocal.protobuf.TimeLineObject m115571q(java.lang.String r56) {
        /*
            r0 = r56
            java.lang.String r1 = "parserFromXml"
            java.lang.String r2 = "com.tencent.mm.modelsns.TimeLineHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "TimelineObject"
            r4 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r3, r4)
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = m115563i()
            if (r3 == 0) goto L_0x0f58
            java.lang.String r6 = ".TimelineObject.id"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            r5.f283893Id = r6
            java.lang.String r6 = ".TimelineObject.username"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            r5.UserName = r6
            java.lang.String r6 = ".TimelineObject.private"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = m115572r(r6)
            r5.Privated = r6
            java.lang.String r6 = ".TimelineObject.createTime"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = m115572r(r6)
            r5.CreateTime = r6
            java.lang.String r6 = ".TimelineObject.contentDesc"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            r5.ContentDesc = r6
            java.lang.String r6 = ".TimelineObject.contentDescShowType"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = m115572r(r6)
            r5.contentDescShowType = r6
            java.lang.String r6 = ".TimelineObject.contentDescScene"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = m115572r(r6)
            r5.contentDescScene = r6
            java.lang.String r6 = ".TimelineObject.statExtStr"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            r5.statExtStr = r6
            java.lang.String r6 = ".TimelineObject.sightFolded"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = m115572r(r6)
            r5.sightFolded = r6
            java.lang.String r6 = ".TimelineObject.showFlag"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = m115572r(r6)
            r5.showFlag = r6
            java.lang.String r6 = "fillLocation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
            te3.kr2 r7 = new te3.kr2
            r7.<init>()
            java.lang.String r8 = ".TimelineObject.location.$longitude"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            float r8 = m115570p(r8)
            r7.f298647d = r8
            java.lang.String r8 = ".TimelineObject.location.$latitude"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            float r8 = m115570p(r8)
            r7.f298648e = r8
            java.lang.String r8 = ".TimelineObject.location.$city"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298649f = r8
            java.lang.String r8 = ".TimelineObject.location.$poiScale"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f298655o = r8
            java.lang.String r8 = ".TimelineObject.location.$poiClassifyId"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298652i = r8
            java.lang.String r8 = ".TimelineObject.location.$poiClassifyType"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f298653j = r8
            java.lang.String r8 = ".TimelineObject.location.$poiAddress"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298651h = r8
            java.lang.String r8 = ".TimelineObject.location.$poiName"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298650g = r8
            java.lang.String r8 = ".TimelineObject.location.$poiClickableStatus"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f298656p = r8
            java.lang.String r8 = ".TimelineObject.location.$poiAddressName"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298661u = r8
            java.lang.String r8 = ".TimelineObject.location.$country"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298662v = r8
            r5.Location = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            java.lang.String r6 = "fillContentObj"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
            te3.j00 r7 = r5.ContentObj
            if (r7 != 0) goto L_0x015c
            te3.j00 r7 = new te3.j00
            r7.<init>()
            r5.ContentObj = r7
        L_0x015c:
            te3.j00 r7 = r5.ContentObj
            java.lang.String r8 = ".TimelineObject.ContentObject.description"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298423d = r8
            te3.j00 r7 = r5.ContentObj
            java.lang.String r8 = ".TimelineObject.ContentObject.contentStyle"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f298424e = r8
            te3.j00 r7 = r5.ContentObj
            java.lang.String r8 = ".TimelineObject.ContentObject.contentSubStyle"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f298428i = r8
            te3.j00 r7 = r5.ContentObj
            java.lang.String r8 = ".TimelineObject.ContentObject.title"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298425f = r8
            te3.j00 r7 = r5.ContentObj
            java.lang.String r8 = ".TimelineObject.ContentObject.contentUrl"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f298426g = r8
            java.lang.String r7 = ".TimelineObject.ContentObject.mmreadershare.itemshowtype"
            boolean r8 = r3.containsKey(r7)
            if (r8 == 0) goto L_0x0287
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = m115572r(r7)
            r8 = -1
            if (r7 == r8) goto L_0x01de
            te3.j00 r8 = r5.ContentObj
            te3.st2 r9 = new te3.st2
            r9.<init>()
            r8.f298430n = r9
            te3.j00 r8 = r5.ContentObj
            te3.st2 r8 = r8.f298430n
            r8.f299443d = r7
            java.lang.String r9 = ".TimelineObject.ContentObject.mmreadershare.ispaysubscribe"
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = m115572r(r9)
            r8.f299453q = r9
        L_0x01de:
            r8 = 5
            if (r7 == r8) goto L_0x01e5
            r8 = 16
            if (r7 != r8) goto L_0x0287
        L_0x01e5:
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.pubtime"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f299448i = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.vid"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f299450n = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.cover"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f299452p = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.funcflag"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f299451o = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.duration"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f299449j = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.digest"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m115574t(r8)
            r7.f299445f = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.nativepage"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f299444e = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.width"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f299446g = r8
            te3.j00 r7 = r5.ContentObj
            te3.st2 r7 = r7.f298430n
            java.lang.String r8 = ".TimelineObject.ContentObject.mmreadershare.height"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = m115572r(r8)
            r7.f299447h = r8
        L_0x0287:
            r8 = 0
        L_0x0288:
            java.lang.String r9 = ".TimelineObject.ContentObject.mediaList.media"
            if (r8 == 0) goto L_0x05b9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r8)
            java.lang.String r11 = ".id"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r8)
            java.lang.String r12 = ".type"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r8)
            java.lang.String r13 = ".title"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r8)
            java.lang.String r14 = ".description"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r8)
            java.lang.String r15 = ".url"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            java.lang.String r7 = ".url.$videomd5"
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            java.lang.String r4 = ".thumb"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            r16 = r4
            java.lang.String r4 = ".url.$type"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            r17 = r4
            java.lang.String r4 = ".thumb.$type"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            r18 = r4
            java.lang.String r4 = ".private"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            r19 = r4
            java.lang.String r4 = ".subType"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            r20 = r4
            java.lang.String r4 = ".userData"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r8)
            java.lang.String r15 = r15.toString()
            r21 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r8)
            r22 = r7
            java.lang.String r7 = ".lowBandUrl"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r23 = r4
            java.lang.String r4 = ".lowBandUrl.$type"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r24 = r4
            java.lang.String r4 = ".songalbumurl"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r25 = r4
            java.lang.String r4 = ".songlyric"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r26 = r4
            java.lang.String r4 = ".attachUrl"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r27 = r4
            java.lang.String r4 = ".attachUrl.$md5"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r28 = r4
            java.lang.String r4 = ".url.$md5"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r29 = r4
            java.lang.String r4 = ".videosize.$attachTotalTime"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r30 = r4
            java.lang.String r4 = ".attachThumbUrl"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r31 = r4
            java.lang.String r4 = ".attachShareTitle"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r32 = r4
            java.lang.String r4 = ".enc"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r33 = r4
            java.lang.String r4 = ".enc.$key"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r34 = r4
            java.lang.String r4 = ".url.$token"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r35 = r4
            java.lang.String r4 = ".url.$enc_idx"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r36 = r4
            java.lang.String r4 = ".url.$key"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r37 = r4
            java.lang.String r4 = ".thumb.$token"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r38 = r4
            java.lang.String r4 = ".thumb.$enc_idx"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r39 = r4
            java.lang.String r4 = ".thumb.$key"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r8)
            r40 = r4
            java.lang.String r4 = ".VideoColdDLRule"
            r7.append(r4)
            r41 = r10
            java.lang.String r10 = ".All"
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r8)
            r10.append(r4)
            r42 = r7
            java.lang.String r7 = ".High"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r8)
            r10.append(r4)
            java.lang.String r4 = ".Low"
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r53 = r7
            r0 = r15
            r15 = r17
            r10 = r18
            r9 = r23
            r7 = r24
            r24 = r28
            r23 = r29
            r43 = r32
            r44 = r33
            r45 = r34
            r46 = r35
            r47 = r36
            r48 = r37
            r49 = r38
            r50 = r39
            r51 = r40
            r52 = r42
            r17 = r6
            r18 = r8
            r8 = r11
            r11 = r16
            r29 = r25
            r28 = r26
            r25 = r27
            r6 = r41
            r16 = r1
            r27 = r20
            r26 = r21
            r1 = r22
            r22 = r30
            r21 = r31
            r20 = r4
            r54 = r19
            r19 = r5
            r5 = r12
            r12 = r54
            goto L_0x063f
        L_0x05b9:
            java.lang.String r10 = ".TimelineObject.ContentObject.mediaList.media.id"
            java.lang.String r11 = ".TimelineObject.ContentObject.mediaList.media.type"
            java.lang.String r12 = ".TimelineObject.ContentObject.mediaList.media.title"
            java.lang.String r13 = ".TimelineObject.ContentObject.mediaList.media.description"
            java.lang.String r14 = ".TimelineObject.ContentObject.mediaList.media.url"
            java.lang.String r7 = ".TimelineObject.ContentObject.mediaList.media.url.$videomd5"
            java.lang.String r4 = ".TimelineObject.ContentObject.mediaList.media.thumb"
            java.lang.String r15 = ".TimelineObject.ContentObject.mediaList.media.url.$type"
            java.lang.String r16 = ".TimelineObject.ContentObject.mediaList.media.thumb.$type"
            java.lang.String r17 = ".TimelineObject.ContentObject.mediaList.media.private"
            java.lang.String r18 = ".TimelineObject.ContentObject.mediaList.media.subType"
            java.lang.String r19 = ".TimelineObject.ContentObject.mediaList.media.userData"
            java.lang.String r20 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl"
            java.lang.String r21 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl.$type"
            java.lang.String r22 = ".TimelineObject.ContentObject.mediaList.media.songalbumurl"
            java.lang.String r23 = ".TimelineObject.ContentObject.mediaList.media.songlyric"
            java.lang.String r24 = ".TimelineObject.ContentObject.mediaList.media.attachUrl"
            java.lang.String r25 = ".TimelineObject.ContentObject.mediaList.media.attachUrl.$md5"
            java.lang.String r26 = ".TimelineObject.ContentObject.mediaList.media.url.$md5"
            java.lang.String r27 = ".TimelineObject.ContentObject.mediaList.media.videosize.$attachTotalTime"
            java.lang.String r28 = ".TimelineObject.ContentObject.mediaList.media.attachThumbUrl"
            java.lang.String r29 = ".TimelineObject.ContentObject.mediaList.media.attachShareTitle"
            java.lang.String r30 = ".TimelineObject.ContentObject.mediaList.media.enc"
            java.lang.String r31 = ".TimelineObject.ContentObject.mediaList.media.enc.$key"
            java.lang.String r32 = ".TimelineObject.ContentObject.mediaList.media.url.$token"
            java.lang.String r33 = ".TimelineObject.ContentObject.mediaList.media.url.$enc_idx"
            java.lang.String r34 = ".TimelineObject.ContentObject.mediaList.media.url.$key"
            java.lang.String r35 = ".TimelineObject.ContentObject.mediaList.media.thumb.$token"
            java.lang.String r36 = ".TimelineObject.ContentObject.mediaList.media.thumb.$enc_idx"
            java.lang.String r37 = ".TimelineObject.ContentObject.mediaList.media.thumb.$key"
            java.lang.String r38 = ".TimelineObject.ContentObject.mediaList.media.VideoColdDLRule.All"
            java.lang.String r39 = ".TimelineObject.ContentObject.mediaList.media.VideoColdDLRule.High"
            java.lang.String r40 = ".TimelineObject.ContentObject.mediaList.media.VideoColdDLRule.Low"
            r0 = r9
            r9 = r20
            r43 = r29
            r44 = r30
            r45 = r31
            r46 = r32
            r47 = r33
            r48 = r34
            r49 = r35
            r50 = r36
            r51 = r37
            r52 = r38
            r53 = r39
            r20 = r40
            r29 = r22
            r22 = r27
            r27 = r18
            r18 = r8
            r8 = r11
            r11 = r4
            r54 = r16
            r16 = r1
            r1 = r7
            r7 = r21
            r21 = r28
            r28 = r23
            r23 = r26
            r26 = r19
            r19 = r5
            r5 = r12
            r12 = r17
            r17 = r6
            r6 = r10
            r10 = r54
            r55 = r25
            r25 = r24
            r24 = r55
        L_0x063f:
            java.lang.String r4 = "fillContentMediaSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            r30 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r31 = r9
            java.lang.String r9 = ".size"
            r7.append(r9)
            r32 = r10
            java.lang.String r10 = ".$width"
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            r33 = r15
            java.lang.String r15 = ".$height"
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = ".$totalSize"
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r3.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            te3.mv2 r10 = new te3.mv2
            r10.<init>()
            r15 = 0
            r10.f298876e = r15
            r10.f298875d = r15
            r10.f298877f = r15
            if (r7 == 0) goto L_0x06b0
            float r7 = m115570p(r7)
            r10.f298875d = r7
        L_0x06b0:
            if (r9 == 0) goto L_0x06b8
            float r7 = m115570p(r9)
            r10.f298876e = r7
        L_0x06b8:
            if (r0 == 0) goto L_0x06c0
            float r0 = m115570p(r0)
            r10.f298877f = r0
        L_0x06c0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r3.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.get(r13)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.get(r14)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ".TimelineObject.ContentObject.mediaList.media.videoDuration"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.get(r12)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r3.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r15 = r33
            java.lang.Object r12 = r3.get(r15)
            java.lang.String r12 = (java.lang.String) r12
            r13 = r32
            java.lang.Object r13 = r3.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            r14 = r31
            java.lang.Object r14 = r3.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            r15 = r30
            java.lang.Object r15 = r3.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            r30 = r2
            r2 = r29
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r29 = r8
            r8 = r28
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r28 = r1
            r1 = r27
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r27 = r1
            r1 = r26
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r26 = r1
            r1 = r25
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r25 = r1
            r1 = r24
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r24 = r1
            r1 = r23
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r23 = r1
            r1 = r22
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r22 = r1
            r1 = r21
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            r1 = r43
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r31 = r1
            r1 = r44
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r32 = r1
            r1 = r45
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r33 = r1
            r1 = r46
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r34 = r1
            r1 = r47
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r35 = r1
            r1 = r48
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r36 = r1
            r1 = r49
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r37 = r1
            r1 = r50
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r38 = r1
            r1 = r51
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r39 = r1
            r1 = r52
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r40 = r1
            r1 = r53
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r41 = r1
            r1 = r20
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r20 = r3
            java.lang.String r3 = ""
            if (r4 == 0) goto L_0x0924
            boolean r42 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r42 == 0) goto L_0x0801
            r42 = r3
            r1 = r17
            r0 = r19
            goto L_0x092a
        L_0x0801:
            r42 = r3
            te3.kv2 r3 = new te3.kv2
            r3.<init>()
            java.lang.String r0 = m115574t(r0)
            r3.f298689d = r0
            int r0 = m115572r(r4)
            r3.f298690e = r0
            java.lang.String r0 = m115574t(r5)
            r3.f298697o = r0
            java.lang.String r0 = m115574t(r6)
            r3.f298691f = r0
            java.lang.String r0 = m115574t(r7)
            r3.f298692g = r0
            int r0 = m115572r(r12)
            r3.f298693h = r0
            java.lang.String r0 = m115574t(r11)
            r3.f298694i = r0
            int r0 = m115572r(r13)
            r3.f298695j = r0
            int r0 = m115572r(r9)
            r3.f298696n = r0
            r3.f298698p = r10
            java.lang.String r0 = m115574t(r14)
            r3.f298699q = r0
            int r0 = m115572r(r15)
            r3.f298700r = r0
            r3.f298682P = r2
            r3.f298683Q = r8
            java.lang.String r0 = m115574t(r26)
            r3.f298703u = r0
            int r0 = m115572r(r27)
            r3.f298704v = r0
            java.lang.String r0 = m115574t(r25)
            r3.f298706x = r0
            java.lang.String r0 = m115574t(r24)
            r3.f298708z = r0
            java.lang.String r0 = m115574t(r23)
            r3.f298707y = r0
            java.lang.String r0 = m115574t(r28)
            r3.f298680M = r0
            int r0 = m115572r(r22)
            r3.f298668A = r0
            java.lang.String r0 = m115574t(r21)
            r3.f298669B = r0
            java.lang.String r0 = m115574t(r31)
            r3.f298670C = r0
            int r0 = m115572r(r32)
            r3.f298671D = r0
            long r4 = m115573s(r33)
            r3.f298672E = r4
            java.lang.String r0 = r3.f298692g
            if (r0 != 0) goto L_0x0898
            r0 = r42
        L_0x0898:
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r3.f298673F = r0
            r0 = r34
            r3.f298674G = r0
            int r0 = m115572r(r35)
            r3.f298675H = r0
            r0 = r36
            r3.f298676I = r0
            r0 = r37
            r3.f298677J = r0
            int r0 = m115572r(r38)
            r3.f298678K = r0
            r0 = r39
            r3.f298679L = r0
            float r0 = m115570p(r29)
            r3.f298684R = r0
            boolean r0 = android.text.TextUtils.isEmpty(r40)
            if (r0 != 0) goto L_0x08dc
            te3.ir4 r0 = new te3.ir4
            r0.<init>()
            java.lang.String r2 = "all"
            r0.f135630d = r2
            r2 = r40
            r0.f135631e = r2
            java.util.LinkedList<te3.ir4> r2 = r3.f298686T
            r2.add(r0)
        L_0x08dc:
            boolean r0 = android.text.TextUtils.isEmpty(r41)
            if (r0 != 0) goto L_0x08f4
            te3.ir4 r0 = new te3.ir4
            r0.<init>()
            java.lang.String r2 = "high"
            r0.f135630d = r2
            r2 = r41
            r0.f135631e = r2
            java.util.LinkedList<te3.ir4> r2 = r3.f298686T
            r2.add(r0)
        L_0x08f4:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x090b
            te3.ir4 r0 = new te3.ir4
            r0.<init>()
            java.lang.String r2 = "low"
            r0.f135630d = r2
            r0.f135631e = r1
            java.util.LinkedList<te3.ir4> r1 = r3.f298686T
            r1.add(r0)
        L_0x090b:
            r0 = r19
            te3.j00 r1 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r1.add(r3)
            int r8 = r18 + 1
            r5 = r0
            r1 = r16
            r6 = r17
            r3 = r20
            r2 = r30
            r4 = 0
            r0 = r56
            goto L_0x0288
        L_0x0924:
            r42 = r3
            r0 = r19
            r1 = r17
        L_0x092a:
            r2 = r30
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            java.lang.String r1 = "fillContentObjNoteInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "<noteinfo>"
            r4 = r56
            int r3 = r4.indexOf(r3)
            java.lang.String r5 = "</noteinfo>"
            int r5 = r4.indexOf(r5)
            if (r3 < 0) goto L_0x0955
            if (r5 >= 0) goto L_0x0947
            goto L_0x0955
        L_0x0947:
            te3.j00 r6 = r0.ContentObj
            int r5 = r5 + 11
            java.lang.String r3 = r4.substring(r3, r5)
            r6.f298429j = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x0958
        L_0x0955:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0958:
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillShareFinderObject"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.rk1 r5 = new te3.rk1
            r5.<init>()
            java.lang.String r6 = "<finderFeed>"
            int r6 = r4.indexOf(r6)
            java.lang.String r7 = "</finderFeed>"
            int r7 = r4.indexOf(r7)
            if (r6 < 0) goto L_0x098e
            if (r7 >= 0) goto L_0x0975
            goto L_0x098e
        L_0x0975:
            int r7 = r7 + 13
            java.lang.String r6 = r4.substring(r6, r7)
            java.lang.String r7 = "finderFeed"
            r8 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r7, r8)
            r7 = r42
            if (r6 == 0) goto L_0x098a
            te3.rk1 r5 = ht1.C60167f1.m70151i(r7, r6)
        L_0x098a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0994
        L_0x098e:
            r7 = r42
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r5 = 0
        L_0x0994:
            r1.f298431o = r5
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillShareMusicObject"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.t23 r5 = new te3.t23
            r5.<init>()
            java.lang.String r6 = "<musicShareItem>"
            int r6 = r4.indexOf(r6)
            java.lang.String r8 = "</musicShareItem>"
            int r8 = r4.indexOf(r8)
            if (r6 < 0) goto L_0x09cb
            if (r8 >= 0) goto L_0x09b3
            goto L_0x09cb
        L_0x09b3:
            int r8 = r8 + 17
            java.lang.String r6 = r4.substring(r6, r8)
            java.lang.String r8 = "musicShareItem"
            r9 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r9)
            if (r6 == 0) goto L_0x09c7
            te3.t23 r5 = ht1.C98521u5.m127974b(r7, r6)
        L_0x09c7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x09cf
        L_0x09cb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r5 = 0
        L_0x09cf:
            r1.f298439w = r5
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillMegaVideoShareObject"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.fw2 r5 = new te3.fw2
            r5.<init>()
            java.lang.String r6 = "<finderMegaVideo>"
            int r6 = r4.indexOf(r6)
            java.lang.String r8 = "</finderMegaVideo>"
            int r8 = r4.indexOf(r8)
            if (r6 < 0) goto L_0x0a05
            if (r8 >= 0) goto L_0x09ee
            goto L_0x0a05
        L_0x09ee:
            int r8 = r8 + 18
            java.lang.String r6 = r4.substring(r6, r8)
            java.lang.String r8 = "finderMegaVideo"
            r9 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r9)
            if (r6 == 0) goto L_0x0a01
            te3.fw2 r5 = ht1.C60167f1.m70158p(r7, r6)
        L_0x0a01:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0a09
        L_0x0a05:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r5 = 0
        L_0x0a09:
            r1.f298436t = r5
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillShareFinderTopic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.tk1 r5 = new te3.tk1
            r5.<init>()
            java.lang.String r6 = "<finderTopic>"
            int r6 = r4.indexOf(r6)
            java.lang.String r8 = "</finderTopic>"
            int r8 = r4.indexOf(r8)
            if (r6 < 0) goto L_0x0a3f
            if (r8 >= 0) goto L_0x0a28
            goto L_0x0a3f
        L_0x0a28:
            int r8 = r8 + 14
            java.lang.String r6 = r4.substring(r6, r8)
            java.lang.String r8 = "finderTopic"
            r9 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r9)
            if (r6 == 0) goto L_0x0a3b
            te3.tk1 r5 = ht1.C60167f1.m70155m(r7, r6)
        L_0x0a3b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0a43
        L_0x0a3f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r5 = 0
        L_0x0a43:
            r1.f298432p = r5
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillShareFinderAlbum"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.nk1 r5 = new te3.nk1
            r5.<init>()
            java.lang.String r6 = "<finderColumn>"
            int r6 = r4.indexOf(r6)
            java.lang.String r8 = "</finderColumn>"
            int r8 = r4.indexOf(r8)
            r9 = 15
            if (r6 < 0) goto L_0x0a7a
            if (r8 >= 0) goto L_0x0a64
            goto L_0x0a7a
        L_0x0a64:
            int r8 = r8 + r9
            java.lang.String r6 = r4.substring(r6, r8)
            java.lang.String r8 = "finderColumn"
            r10 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r10)
            if (r6 == 0) goto L_0x0a76
            te3.nk1 r5 = ht1.C60167f1.m70152j(r7, r6)
        L_0x0a76:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0a7e
        L_0x0a7a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r5 = 0
        L_0x0a7e:
            r1.f298434r = r5
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillShareMPVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.fa r5 = new te3.fa
            r5.<init>()
            java.lang.String r6 = "<mmbrandmpvideo>"
            int r6 = r4.indexOf(r6)
            java.lang.String r8 = "</mmbrandmpvideo>"
            int r8 = r4.indexOf(r8)
            if (r6 < 0) goto L_0x0ab5
            if (r8 >= 0) goto L_0x0a9d
            goto L_0x0ab5
        L_0x0a9d:
            int r8 = r8 + 17
            java.lang.String r6 = r4.substring(r6, r8)
            java.lang.String r8 = "mmbrandmpvideo"
            r10 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r10)
            if (r6 == 0) goto L_0x0ab1
            te3.fa r5 = ad0.C91997p.m115546d(r7, r6)
        L_0x0ab1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0ab9
        L_0x0ab5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r5 = 0
        L_0x0ab9:
            r1.f298433q = r5
            te3.j00 r1 = r0.ContentObj
            te3.p81 r3 = m115558d(r56)
            r1.f298435s = r3
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillFinderType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            java.lang.String r5 = "<finder>"
            int r6 = r4.indexOf(r5)
            java.lang.String r7 = "</finder>"
            int r8 = r4.indexOf(r7)
            java.lang.String r10 = "finder"
            if (r6 < 0) goto L_0x0afc
            if (r8 >= 0) goto L_0x0add
            goto L_0x0afc
        L_0x0add:
            int r8 = r8 + 9
            java.lang.String r6 = r4.substring(r6, r8)
            r8 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r10, r8)
            if (r6 == 0) goto L_0x0af7
            java.lang.String r8 = ".finder.type"
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            goto L_0x0af8
        L_0x0af7:
            r6 = 0
        L_0x0af8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0b00
        L_0x0afc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r6 = 0
        L_0x0b00:
            r1.f298437u = r6
            te3.j00 r1 = r0.ContentObj
            r3 = 7
            te3.tk1 r3 = m115557c(r4, r3)
            r1.f298438v = r3
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillShareFinderPoi"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            te3.sk1 r6 = new te3.sk1
            r6.<init>()
            int r5 = r4.indexOf(r5)
            int r7 = r4.indexOf(r7)
            if (r5 < 0) goto L_0x0b53
            if (r7 >= 0) goto L_0x0b24
            goto L_0x0b53
        L_0x0b24:
            int r7 = r7 + 9
            java.lang.String r5 = r4.substring(r5, r7)
            java.lang.String r7 = "<finderpoirelatedstream>"
            int r7 = r5.indexOf(r7)
            java.lang.String r8 = "</finderpoirelatedstream>"
            int r8 = r5.indexOf(r8)
            if (r7 < 0) goto L_0x0b4f
            if (r8 >= 0) goto L_0x0b3b
            goto L_0x0b4f
        L_0x0b3b:
            r7 = 0
            java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r10, r7)
            if (r5 == 0) goto L_0x0b4a
            java.lang.String r6 = ".finder.detail"
            te3.sk1 r5 = ht1.C60167f1.m70154l(r6, r5)
            r8 = r5
            goto L_0x0b4b
        L_0x0b4a:
            r8 = r6
        L_0x0b4b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0b57
        L_0x0b4f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0b56
        L_0x0b53:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
        L_0x0b56:
            r8 = 0
        L_0x0b57:
            r1.f298440x = r8
            te3.j00 r1 = r0.ContentObj
            java.lang.String r3 = "fillTiger2022"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            java.lang.String r5 = "<Tiger2022>"
            int r5 = r4.indexOf(r5)
            java.lang.String r6 = "</Tiger2022>"
            int r6 = r4.indexOf(r6)
            r7 = 1
            if (r5 < 0) goto L_0x0bf2
            if (r6 >= 0) goto L_0x0b73
            goto L_0x0bf2
        L_0x0b73:
            te3.eg4 r8 = new te3.eg4
            r8.<init>()
            java.lang.String r6 = "<LinkEnabled>"
            int r6 = r4.indexOf(r6, r5)
            java.lang.String r10 = "</LinkEnabled>"
            int r10 = r4.indexOf(r10, r5)
            if (r6 < 0) goto L_0x0ba3
            if (r10 < 0) goto L_0x0ba3
            int r6 = r6 + 13
            java.lang.String r6 = r4.substring(r6, r10)
            java.lang.String r6 = r6.trim()
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto L_0x0ba3
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            if (r6 != r7) goto L_0x0ba0
            r6 = 1
            goto L_0x0ba1
        L_0x0ba0:
            r6 = 0
        L_0x0ba1:
            r8.f182950d = r6
        L_0x0ba3:
            java.lang.String r6 = "<EnterLiveMode>"
            int r6 = r4.indexOf(r6, r5)
            java.lang.String r10 = "</EnterLiveMode>"
            int r10 = r4.indexOf(r10, r5)
            if (r6 < 0) goto L_0x0bc8
            if (r10 < 0) goto L_0x0bc8
            int r6 = r6 + r9
            java.lang.String r6 = r4.substring(r6, r10)
            java.lang.String r6 = r6.trim()
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto L_0x0bc8
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            r8.f182952f = r6
        L_0x0bc8:
            java.lang.String r6 = "<finderLive>"
            int r6 = r4.indexOf(r6, r5)
            java.lang.String r10 = "</finderLive>"
            int r5 = r4.indexOf(r10, r5)
            if (r6 < 0) goto L_0x0bee
            if (r5 < 0) goto L_0x0bee
            int r5 = r5 + 13
            java.lang.String r5 = r4.substring(r6, r5)
            java.lang.String r5 = r5.trim()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0bee
            te3.p81 r5 = m115558d(r5)
            r8.f182951e = r5
        L_0x0bee:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            goto L_0x0bf6
        L_0x0bf2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            r8 = 0
        L_0x0bf6:
            r1.f298441y = r8
            te3.j00 r1 = r0.ContentObj
            te3.gm3 r3 = m115556b(r56)
            r1.f298422A = r3
            te3.j00 r1 = r0.ContentObj
            te3.tk1 r3 = m115557c(r4, r9)
            r1.f298442z = r3
            te3.j00 r1 = r0.ContentObj
            te3.eg4 r3 = r1.f298441y
            r8 = 0
            if (r3 == 0) goto L_0x0c11
            r1.f298435s = r8
        L_0x0c11:
            java.lang.String r1 = "fillContentAppinfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            te3.r5 r3 = new te3.r5
            r3.<init>()
            java.lang.String r4 = ".TimelineObject.appInfo.id"
            r5 = r20
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            java.lang.String r6 = ".TimelineObject.appInfo.version"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            java.lang.String r9 = ".TimelineObject.appInfo.appName"
            java.lang.Object r9 = r5.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = m115574t(r9)
            java.lang.String r10 = ".TimelineObject.appInfo.installUrl "
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = m115574t(r10)
            java.lang.String r11 = ".TimelineObject.appInfo.fromUrl "
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = m115574t(r11)
            r3.f299236d = r4
            r3.f299238f = r9
            r3.f299239g = r10
            r3.f299240h = r11
            r3.f299237e = r6
            java.lang.String r4 = ".TimelineObject.appInfo.clickable"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = m115572r(r4)
            r3.f299241i = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r0.AppInfo = r3
            java.lang.String r1 = "fillWeappInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            te3.d05 r3 = new te3.d05
            r3.<init>()
            java.lang.String r4 = ".TimelineObject.weappInfo.appUserName"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            java.lang.String r6 = ".TimelineObject.weappInfo.pagePath"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            java.lang.String r9 = ".TimelineObject.weappInfo.version"
            java.lang.Object r9 = r5.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = m115574t(r9)
            java.lang.String r10 = ".TimelineObject.weappInfo.debugMode"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = m115574t(r10)
            java.lang.String r11 = ".TimelineObject.weappInfo.shareActionId"
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = m115574t(r11)
            java.lang.String r12 = ".TimelineObject.weappInfo.isGame"
            java.lang.Object r12 = r5.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = m115574t(r12)
            java.lang.String r13 = ".TimelineObject.weappInfo.messageExtraData"
            java.lang.Object r13 = r5.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = m115574t(r13)
            java.lang.String r14 = ".TimelineObject.weappInfo.subType"
            java.lang.Object r14 = r5.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = m115574t(r14)
            java.lang.String r15 = ".TimelineObject.weappInfo.preloadResources"
            java.lang.Object r15 = r5.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = m115574t(r15)
            r3.f298070d = r4
            r3.f298071e = r6
            r4 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r4)
            r3.f298072f = r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r4)
            r3.f298073g = r6
            r3.f298074h = r11
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r4)
            r3.f298075i = r6
            r3.f298076j = r13
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r4)
            r3.f298077n = r4
            r3.f298078o = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r0.weappInfo = r3
            java.lang.String r1 = "fillLiteAppInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = ".TimelineObject.liteApp.appId"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m115574t(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0d30
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r4 = r8
            goto L_0x0d56
        L_0x0d30:
            te3.jo2 r4 = new te3.jo2
            r4.<init>()
            r4.f298552d = r3
            java.lang.String r3 = ".TimelineObject.liteApp.path"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m115574t(r3)
            r4.f298553e = r3
            java.lang.String r3 = ".TimelineObject.liteApp.query"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m115574t(r3)
            r4.f298554f = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0d56:
            r0.liteappInfo = r4
            java.lang.String r1 = "fillGameShareCardInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            te3.ms1 r3 = new te3.ms1
            r3.<init>()
            java.lang.String r4 = ".TimelineObject.gameshare.liteappext.liteappbizdata"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            r3.f298871h = r4
            java.lang.String r4 = ".TimelineObject.gameshare.liteappext.liteapppriority"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            r3.f298872i = r4
            java.lang.String r4 = ".TimelineObject.gameshare.gameshareid"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            r3.f298868e = r4
            java.lang.String r4 = ".TimelineObject.gameshare.sharedata"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            r3.f298867d = r4
            java.lang.String r4 = ".TimelineObject.gameshare.isvideo"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            r3.f298869f = r4
            java.lang.String r4 = ".TimelineObject.gameshare.duration"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            r3.f298870g = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r0.gameShareCardObject = r3
            java.lang.String r1 = "fillStreamVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            te3.sc4 r3 = new te3.sc4
            r3.<init>()
            java.lang.String r4 = ".TimelineObject.streamvideo.streamvideotitle"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            java.lang.String r6 = ".TimelineObject.streamvideo.streamvideototaltime"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            java.lang.String r9 = ".TimelineObject.streamvideo.streamvideourl"
            java.lang.Object r9 = r5.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = m115574t(r9)
            java.lang.String r10 = ".TimelineObject.streamvideo.streamvideoweburl"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = m115574t(r10)
            java.lang.String r11 = ".TimelineObject.streamvideo.streamvideowording"
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = m115574t(r11)
            java.lang.String r12 = ".TimelineObject.streamvideo.streamvideothumburl"
            java.lang.Object r12 = r5.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = m115574t(r12)
            java.lang.String r13 = ".TimelineObject.streamvideo.streamvideoaduxinfo"
            java.lang.Object r13 = r5.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = m115574t(r13)
            java.lang.String r14 = ".TimelineObject.streamvideo.streamvideopublishid"
            java.lang.Object r14 = r5.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = m115574t(r14)
            r3.f299429h = r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            r3.f299426e = r4
            r3.f299425d = r9
            r3.f299428g = r10
            r3.f299427f = r11
            r3.f299430i = r12
            r3.f299431j = r13
            r3.f299432n = r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r0.streamvideo = r3
            java.lang.String r1 = "fillSnsHbInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            te3.k74 r3 = new te3.k74
            r3.<init>()
            java.lang.String r4 = ".TimelineObject.redEnvelopesInfo.sendId"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            java.lang.String r6 = ".TimelineObject.redEnvelopesInfo.ticket"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m115574t(r6)
            r3.f136600d = r4
            r3.f136601e = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            te3.k1 r1 = m115555a(r5)
            r0.actionInfo = r1
            java.lang.String r1 = ".TimelineObject.sourceUserName"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m115574t(r1)
            r0.sourceUserName = r1
            java.lang.String r1 = ".TimelineObject.sourceNickName"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m115574t(r1)
            r0.sourceNickName = r1
            java.lang.String r1 = ".TimelineObject.publicUserName"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m115574t(r1)
            r0.publicUserName = r1
            java.lang.String r1 = ".TimelineObject.statisticsData"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m115574t(r1)
            r0.statisticsData = r1
            java.lang.String r1 = ".TimelineObject.canvasInfoXml"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m115574t(r1)
            r0.canvasInfo = r1
            java.lang.String r1 = ".TimelineObject.contentattr"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = m115572r(r1)
            r0.contentattr = r1
            te3.w25 r1 = m115559e(r5)
            r0.webSearchInfo = r1
            java.lang.String r1 = "fillVideoTemplate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = ".TimelineObject.VideoTemplate.Type"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m115574t(r3)
            java.lang.String r4 = ".TimelineObject.VideoTemplate.TemplateId"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m115574t(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x0f35
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0efd
            goto L_0x0f35
        L_0x0efd:
            te3.e94 r6 = new te3.e94
            r6.<init>()
            r6.f182942d = r3
            r6.f182943e = r4
            java.lang.String r3 = ".TimelineObject.VideoTemplate.MusicId"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m115574t(r3)
            r6.f182944f = r3
            java.lang.String r3 = ".TimelineObject.VideoTemplate.VersionInfo.IosSdkVersionMin"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r3 = m115573s(r3)
            r6.f182946h = r3
            java.lang.String r3 = ".TimelineObject.VideoTemplate.VersionInfo.AndroidSdkVersionMin"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r3 = m115573s(r3)
            r6.f182945g = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r4 = r6
            goto L_0x0f39
        L_0x0f35:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r4 = r8
        L_0x0f39:
            r0.videoTemplate = r4
            java.lang.String r1 = ".TimelineObject.ContentObject.mediaList.media.BizInfo.ExcerptUrl"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m115574t(r1)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x0f55
            java.lang.String r1 = java.net.URLDecoder.decode(r1)
            r0.snsExcerptUrl = r1
            r0.isExcerpt = r7
        L_0x0f55:
            r1 = r16
            goto L_0x0f59
        L_0x0f58:
            r0 = r5
        L_0x0f59:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad0.C91999u.m115571q(java.lang.String):com.tencent.mm.protocal.protobuf.TimeLineObject");
    }

    /* renamed from: r */
    public static int m115572r(String str) {
        SnsMethodCalculate.markStartTimeMs("parserInt", "com.tencent.mm.modelsns.TimeLineHelper");
        int i = Util.getInt(str, 0);
        SnsMethodCalculate.markEndTimeMs("parserInt", "com.tencent.mm.modelsns.TimeLineHelper");
        return i;
    }

    /* renamed from: s */
    public static long m115573s(String str) {
        SnsMethodCalculate.markStartTimeMs("parserLong", "com.tencent.mm.modelsns.TimeLineHelper");
        long j = Util.getLong(str, 0);
        SnsMethodCalculate.markEndTimeMs("parserLong", "com.tencent.mm.modelsns.TimeLineHelper");
        return j;
    }

    /* renamed from: t */
    public static String m115574t(String str) {
        SnsMethodCalculate.markStartTimeMs("parserString", "com.tencent.mm.modelsns.TimeLineHelper");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.modelsns.TimeLineHelper");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.modelsns.TimeLineHelper");
        return str;
    }

    /* renamed from: u */
    public static String m115575u(String str) {
        SnsMethodCalculate.markStartTimeMs("unescapeXML", "com.tencent.mm.modelsns.TimeLineHelper");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '&') {
                sb.append(charAt);
                i++;
            } else if (str.startsWith("&amp;", i)) {
                sb.append('&');
                i += 5;
            } else {
                if (str.startsWith("&apos;", i)) {
                    sb.append('\'');
                } else if (str.startsWith("&quot;", i)) {
                    sb.append('\"');
                } else {
                    if (str.startsWith("&lt;", i)) {
                        sb.append('<');
                    } else if (str.startsWith("&gt;", i)) {
                        sb.append('>');
                    }
                    i += 4;
                }
                i += 6;
            }
        }
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("unescapeXML", "com.tencent.mm.modelsns.TimeLineHelper");
        return sb4;
    }
}
