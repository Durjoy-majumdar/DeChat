package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C64264bq1;
import te3.C64514l50;
import te3.C64749uf2;
import te3.C64801wf2;
import te3.C77914cq1;
import te3.C77923eq1;
import te3.C77944hq1;
import te3.C77994sf2;
import te3.C77999tf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.i1 */
public class C69232i1 {
    /* renamed from: a */
    public static C56847o m81577a(C64264bq1 bq12) {
        if (bq12 == null) {
            return null;
        }
        C56847o oVar = new C56847o();
        oVar.f162880d = bq12.f182310d;
        Iterator<C64514l50> it = bq12.f182311e.iterator();
        while (it.hasNext()) {
            C64514l50 next = it.next();
            C56846h hVar = new C56846h();
            hVar.f162877d = next.f184038d;
            hVar.f162878e = next.f184039e;
            hVar.f162879f = next.f184040f;
            oVar.f162881e.add(hVar);
        }
        return oVar;
    }

    /* renamed from: b */
    public static C77994sf2 m81578b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C77994sf2 sf22 = new C77994sf2();
        sf22.f228201e = jSONObject.optInt("subType", -1);
        sf22.f228200d = jSONObject.optString("corpName");
        sf22.f228202f = jSONObject.optString("materialId");
        sf22.f228204h = jSONObject.optString("expire_desc");
        sf22.f228205i = jSONObject.optInt("is_expired");
        sf22.f228212s = jSONObject.optInt("detail_link_type");
        sf22.f228213t = jSONObject.optString("detail_link_appname");
        sf22.f228214u = jSONObject.optString("detail_link_url");
        sf22.f228215v = jSONObject.optString("detail_link_title");
        sf22.f228216w = jSONObject.optString("exchange_title");
        sf22.f228217x = jSONObject.optString("exchange_url");
        sf22.f228218y = jSONObject.optInt("has_source");
        sf22.f228219z = jSONObject.optLong("last_obtain_time");
        sf22.f228196A = jSONObject.optInt("disable");
        sf22.f228197B = jSONObject.optString("disable_text");
        JSONObject optJSONObject = jSONObject.optJSONObject("sourceObject");
        if (optJSONObject != null) {
            C77999tf2 tf22 = new C77999tf2();
            tf22.f228244e = optJSONObject.optString("bubbleImage");
            tf22.f228247h = optJSONObject.optString("bubbleImageMd5");
            tf22.f228243d = optJSONObject.optString("corpLogo");
            tf22.f228250n = optJSONObject.optString("corpLogoMd5");
            tf22.f228245f = optJSONObject.optString("coverImage");
            tf22.f228248i = optJSONObject.optString("coverImageMd5");
            tf22.f228246g = optJSONObject.optString("detailImage");
            tf22.f228249j = optJSONObject.optString("detailImageMd5");
            sf22.f228203g = tf22;
        }
        return sf22;
    }

    /* renamed from: c */
    public static C69261r1 m81579c(JSONObject jSONObject) {
        C69261r1 r1Var = new C69261r1();
        r1Var.f199317n = jSONObject.optString("spidLogo");
        r1Var.f199318o = jSONObject.optString("spidWishing");
        r1Var.f199319p = jSONObject.optString("spidName");
        r1Var.f199317n = jSONObject.optString("spidLogo");
        r1Var.f199320q = jSONObject.optInt("hbStatus");
        r1Var.f199321r = jSONObject.optInt("receiveStatus");
        r1Var.f199322s = jSONObject.optString("statusMess");
        jSONObject.optString("hintMess");
        r1Var.f199323t = jSONObject.optString("watermark");
        r1Var.f199315i = jSONObject.optString("sendId");
        r1Var.f199324u = jSONObject.optInt("focusFlag");
        r1Var.f199325v = jSONObject.optString("focusWording");
        r1Var.f199326w = jSONObject.optString("focusAppidUserName");
        r1Var.f199327x = jSONObject.optInt("isFocus");
        r1Var.f199328y = jSONObject.optInt("hbType");
        r1Var.f199313B = new C69249n();
        JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject != null) {
            r1Var.f199313B.f199277d = optJSONObject.optInt("enable");
            r1Var.f199313B.f199279f = optJSONObject.optString("fissionContent");
            r1Var.f199313B.f199278e = optJSONObject.optString("fissionUrl");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject2 != null) {
            optJSONObject2.optString("agreed_flag", "-1");
            optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            optJSONObject2.optString("service_protocol_wording", "");
            optJSONObject2.optString("service_protocol_url", "");
            optJSONObject2.optString("button_wording", "");
            r1Var.f199312A = optJSONObject2.optLong("delay_expired_time", 0);
        }
        if (r1Var.f199312A > 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis() + (r1Var.f199312A * 1000)));
        }
        m81584h(jSONObject.optJSONObject("operationTail"));
        return r1Var;
    }

    /* renamed from: d */
    public static C69158a0 m81580d(JSONObject jSONObject) {
        Class cls = C75339i.class;
        C69158a0 a0Var = new C69158a0();
        if (jSONObject != null) {
            a0Var.f198964d = jSONObject.optInt("hbType");
            a0Var.f198965e = jSONObject.optInt("hbStatus");
            a0Var.f198966f = jSONObject.optString("statusMess");
            a0Var.f198967g = jSONObject.optString("gameMess");
            a0Var.f198968h = jSONObject.optString("wishing");
            a0Var.f198969i = jSONObject.optString("sendNick");
            a0Var.f198970j = jSONObject.optString("sendHeadImg");
            a0Var.f198971n = jSONObject.optString("sendId");
            a0Var.f198972o = jSONObject.optString("adMessage");
            a0Var.f198973p = jSONObject.optString("adUrl");
            a0Var.f198974q = jSONObject.optLong("amount");
            a0Var.f198975r = jSONObject.optLong("recNum");
            a0Var.f198976s = jSONObject.optLong("recAmount");
            a0Var.f198977t = jSONObject.optInt("totalNum");
            a0Var.f198978u = jSONObject.optLong("totalAmount");
            a0Var.f198979v = jSONObject.optString("receiveId");
            a0Var.f198980w = jSONObject.optInt("hasWriteAnswer");
            a0Var.f198981x = jSONObject.optInt("isSender");
            a0Var.f198982y = jSONObject.optInt("isContinue");
            a0Var.f198983z = jSONObject.optString("headTitle");
            a0Var.f198939A = jSONObject.optInt("receiveStatus");
            a0Var.f198940B = jSONObject.optInt("canShare");
            a0Var.f198942D = jSONObject.optInt("jumpChange");
            a0Var.f198943E = jSONObject.optString("changeWording");
            a0Var.f198952N = jSONObject.optString("changeUrl");
            a0Var.f198948J = jSONObject.optInt("hbKind");
            a0Var.f198950L = jSONObject.optString("externMess");
            a0Var.f198954Q = jSONObject.optString("sendUserName");
            if (Util.isNullOrNil(a0Var.f198969i)) {
                a0Var.f198962Y = true;
            }
            if (Util.isNullOrNil(a0Var.f198969i) && !Util.isNullOrNil(a0Var.f198954Q)) {
                a0Var.f198969i = ((C75339i) C86312j.m106911c(cls)).getDisplayName(a0Var.f198954Q);
            }
            a0Var.f198963Z = jSONObject.optInt("not_show_avatar", 0);
            a0Var.f198961X = jSONObject.optString("sendsuffix");
            a0Var.f198941C = new C69249n();
            JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
            if (optJSONObject != null) {
                a0Var.f198941C.f199277d = optJSONObject.optInt("enable");
                a0Var.f198941C.f199279f = optJSONObject.optString("fissionContent");
                a0Var.f198941C.f199278e = optJSONObject.optString("fissionUrl");
            }
            a0Var.f198944F = new LinkedList<>();
            JSONArray optJSONArray = jSONObject.optJSONArray("operationHeader");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    a0Var.f198944F.add(m81584h(optJSONArray.getJSONObject(i)));
                }
            }
            a0Var.f198946H = jSONObject.optString("watermark");
            a0Var.f198947I = jSONObject.optString("context");
            a0Var.f198953P = jSONObject.optString("contextMd5");
            a0Var.f198949K = jSONObject.optInt("resourceId");
            a0Var.f198945G = m81584h(jSONObject.optJSONObject("operationTail"));
            JSONArray optJSONArray2 = jSONObject.optJSONArray("record");
            LinkedList<C69236j1> linkedList = new LinkedList<>();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    C69236j1 j1Var = new C69236j1();
                    if (jSONObject2 != null) {
                        j1Var.f199212d = jSONObject2.optString("receiveName");
                        j1Var.f199213e = jSONObject2.optString("receiveHeadImg");
                        j1Var.f199214f = jSONObject2.optLong("receiveAmount");
                        j1Var.f199215g = jSONObject2.optString("receiveTime");
                        j1Var.f199216h = jSONObject2.optString("answer");
                        j1Var.f199217i = jSONObject2.optString("receiveId");
                        j1Var.f199218j = jSONObject2.optString("gameTips");
                        j1Var.f199219n = jSONObject2.optString("userName");
                        j1Var.f199221p = jSONObject2.optString("receivesuffix");
                        if (Util.isNullOrNil(j1Var.f199212d) && !Util.isNullOrNil(j1Var.f199219n)) {
                            C86709a0.m107528h();
                            if (!Util.isNullOrNil(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(j1Var.f199219n).getUsername())) {
                                j1Var.f199212d = ((C75339i) C86312j.m106911c(cls)).getDisplayName(j1Var.f199219n);
                            } else {
                                j1Var.f199222q = true;
                            }
                        }
                    }
                    linkedList.add(j1Var);
                }
            }
            a0Var.f198951M = linkedList;
            a0Var.f198955R = jSONObject.optInt("jumpChangeType");
            a0Var.f198956S = jSONObject.optString("changeIconUrl");
            a0Var.f198957T = jSONObject.optString("showSourceOpen");
        }
        return a0Var;
    }

    /* renamed from: e */
    public static C69158a0 m81581e(C77923eq1 eq12) {
        Class cls = C75339i.class;
        if (eq12 == null) {
            return null;
        }
        C69158a0 a0Var = new C69158a0();
        a0Var.f198964d = eq12.f227293r;
        a0Var.f198965e = eq12.f227295t;
        a0Var.f198966f = eq12.f227297v;
        a0Var.f198968h = eq12.f227289n;
        a0Var.f198971n = eq12.f227287i;
        a0Var.f198974q = eq12.f227288j;
        a0Var.f198958U = eq12.f227279J;
        a0Var.f198975r = (long) eq12.f227284f;
        a0Var.f198976s = eq12.f227300y;
        a0Var.f198977t = eq12.f227285g;
        a0Var.f198978u = eq12.f227286h;
        a0Var.f198979v = eq12.f227291p;
        a0Var.f198981x = eq12.f227290o;
        a0Var.f198982y = eq12.f227294s;
        a0Var.f198983z = eq12.f227298w;
        a0Var.f198939A = eq12.f227296u;
        a0Var.f198942D = eq12.f227271B;
        a0Var.f198943E = eq12.f227272C;
        a0Var.f198952N = eq12.f227274E;
        String str = eq12.f227273D;
        a0Var.f198954Q = str;
        if (!Util.isNullOrNil(str)) {
            a0Var.f198969i = ((C75339i) C86312j.m106911c(cls)).getDisplayName(a0Var.f198954Q);
        }
        a0Var.f198955R = eq12.f227275F;
        a0Var.f198956S = eq12.f227276G;
        a0Var.f198944F = new LinkedList<>();
        if (!eq12.f227292q.isEmpty()) {
            Iterator<C77944hq1> it = eq12.f227292q.iterator();
            while (it.hasNext()) {
                C77944hq1 next = it.next();
                C69248m2 m2Var = new C69248m2();
                m2Var.f199273g = next.f227591f;
                m2Var.f199276j = next.f227595j;
                m2Var.f199270d = next.f227592g;
                m2Var.f199275i = next.f227593h;
                m2Var.f199271e = next.f227589d;
                m2Var.f199274h = next.f227594i;
                int i = next.f227590e;
                if (i == 1) {
                    m2Var.f199272f = "Appid";
                } else if (i == 2) {
                    m2Var.f199272f = "Text";
                } else if (i == 3) {
                    m2Var.f199272f = "Pic";
                } else if (i == 4) {
                    m2Var.f199272f = "Native";
                }
                a0Var.f198944F.add(m2Var);
            }
        }
        if (eq12.f227270A != null) {
            C69248m2 m2Var2 = new C69248m2();
            a0Var.f198945G = m2Var2;
            C77944hq1 hq12 = eq12.f227270A;
            m2Var2.f199273g = hq12.f227591f;
            m2Var2.f199276j = hq12.f227595j;
            m2Var2.f199270d = hq12.f227592g;
            m2Var2.f199275i = hq12.f227593h;
            m2Var2.f199271e = hq12.f227589d;
            m2Var2.f199274h = hq12.f227594i;
            int i2 = hq12.f227590e;
            if (i2 == 1) {
                m2Var2.f199272f = "Appid";
            } else if (i2 == 2) {
                m2Var2.f199272f = "Text";
            } else if (i2 == 3) {
                m2Var2.f199272f = "Pic";
            } else if (i2 == 4) {
                m2Var2.f199272f = "Native";
            }
        }
        a0Var.f198960W = m81577a(eq12.f227281L);
        a0Var.f198951M = new LinkedList<>();
        if (!eq12.f227301z.isEmpty()) {
            Iterator<C77914cq1> it4 = eq12.f227301z.iterator();
            while (it4.hasNext()) {
                C77914cq1 next2 = it4.next();
                C69236j1 j1Var = new C69236j1();
                j1Var.f199218j = next2.f227144h;
                j1Var.f199217i = next2.f227142f;
                j1Var.f199214f = next2.f227140d;
                j1Var.f199215g = next2.f227141e;
                j1Var.f199219n = next2.f227145i;
                j1Var.f199220o = next2.f227146j;
                if (Util.isNullOrNil(j1Var.f199212d) && !Util.isNullOrNil(j1Var.f199219n)) {
                    j1Var.f199212d = ((C75339i) C86312j.m106911c(cls)).getDisplayName(j1Var.f199219n);
                }
                a0Var.f198951M.add(j1Var);
            }
        }
        return a0Var;
    }

    /* renamed from: f */
    public static C69195b1 m81582f(JSONObject jSONObject) {
        C69195b1 b1Var = new C69195b1();
        if (jSONObject != null) {
            b1Var.f199083d = jSONObject.optInt("recTotalNum");
            b1Var.f199084e = jSONObject.optLong("recTotalAmount");
            b1Var.f199085f = jSONObject.optInt("sendTotalNum");
            b1Var.f199086g = jSONObject.optLong("sendTotalAmount");
            b1Var.f199088i = jSONObject.optInt("isContinue");
            b1Var.f199087h = jSONObject.optInt("gameCount");
            JSONArray optJSONArray = jSONObject.optJSONArray("record");
            LinkedList<C69197c1> linkedList = new LinkedList<>();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    C69197c1 c1Var = new C69197c1();
                    c1Var.f199090d = jSONObject2.optString("sendName");
                    c1Var.f199091e = jSONObject2.optString("sendHeadImg");
                    c1Var.f199092f = jSONObject2.optLong("receiveAmount");
                    c1Var.f199093g = jSONObject2.optString("receiveTime");
                    c1Var.f199094h = jSONObject2.optInt("hbType");
                    c1Var.f199095i = jSONObject2.optString("sendTitle");
                    c1Var.f199096j = jSONObject2.optString("sendTime");
                    c1Var.f199097n = jSONObject2.optLong("totalAmount");
                    c1Var.f199098o = jSONObject2.optLong("totalNum");
                    c1Var.f199099p = jSONObject2.optLong("recNum");
                    c1Var.f199100q = jSONObject2.optInt("status");
                    c1Var.f199101r = jSONObject2.optInt("thxCount");
                    c1Var.f199102s = jSONObject2.optString("receiveId");
                    c1Var.f199103t = jSONObject2.optString("sendId");
                    c1Var.f199104u = jSONObject2.optInt("hbKind");
                    c1Var.f199105v = jSONObject2.optString("sendsuffix");
                    c1Var.f199106w = jSONObject2.optString("sendDesc");
                    linkedList.add(c1Var);
                }
            }
            b1Var.f199089j = linkedList;
        }
        return b1Var;
    }

    /* renamed from: g */
    public static C69209e1 m81583g(JSONObject jSONObject) {
        C69209e1 e1Var = new C69209e1();
        if (jSONObject != null) {
            e1Var.f199136d = jSONObject.optString("cdnFileId");
            e1Var.f199137e = jSONObject.optString("cdnAesKey");
            e1Var.f199139g = jSONObject.optString("pagName");
            e1Var.f199145p = jSONObject.optString("maskPagName");
            e1Var.f199138f = jSONObject.optString("wishKeyWord");
            e1Var.f199140h = jSONObject.optString("videoUrl");
            e1Var.f199141i = jSONObject.optString("videoThumbUrl");
            e1Var.f199142j = jSONObject.optInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            e1Var.f199143n = jSONObject.optInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            e1Var.f199144o = jSONObject.optString("verifyInfo");
            e1Var.f199146q = jSONObject.optString("videoUrlWithVoice");
            e1Var.f199147r = jSONObject.optString("videoThumbUrlWithVoice");
        }
        return e1Var;
    }

    /* renamed from: h */
    public static C69248m2 m81584h(JSONObject jSONObject) {
        C69248m2 m2Var = new C69248m2();
        if (jSONObject != null) {
            m2Var.f199270d = jSONObject.optInt("enable", 0);
            m2Var.f199273g = jSONObject.optString("content");
            m2Var.f199275i = jSONObject.optString("iconUrl");
            m2Var.f199272f = jSONObject.optString("type");
            m2Var.f199271e = jSONObject.optString("name");
            m2Var.f199274h = jSONObject.optInt("ossKey");
            m2Var.f199276j = jSONObject.optInt("focus");
        }
        return m2Var;
    }

    /* renamed from: i */
    public static ArrayList<C64801wf2> m81585i(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        Log.m105925i("MicroMsg.LuckyMoneyParseHelper", "parseOptionItemList res：%s", jSONArray.toString());
        ArrayList<C64801wf2> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    arrayList.add(m81586j(jSONObject));
                }
                i++;
            } catch (JSONException e) {
                Log.m105925i("MicroMsg.LuckyMoneyParseHelper", "parseOptionItemList error：%s", e.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C64801wf2 m81586j(JSONObject jSONObject) {
        C64801wf2 wf22 = new C64801wf2();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        wf22.f186087d = jSONObject.optString("wording");
        JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        C64749uf2 uf22 = new C64749uf2();
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        uf22.f185727d = optJSONObject.optInt("type");
        uf22.f185728e = optJSONObject.optString("url");
        uf22.f185729f = optJSONObject.optString("username");
        uf22.f185730g = optJSONObject.optString("pagepath");
        wf22.f186088e = uf22;
        return wf22;
    }
}
