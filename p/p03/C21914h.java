package p03;

import a70.C112760b;
import android.os.Build;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.IXWebPreferences;
import com.tencent.xweb.internal.ConstValue;
import e83.C45556b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87200o;
import p156gj.C87203t;
import qe3.C89625d;
import te3.C49768hy;
import te3.C64467je0;
import te3.e54;
import te3.sh4;
import te3.uh4;
import te3.vh4;
import te3.w25;
import te3.xh4;
import te3.zh4;

/* renamed from: p03.h */
public class C21914h {
    /* renamed from: a */
    public static final uh4 m25153a(uh4 uh4) {
        uh4 uh42 = new uh4();
        uh42.f64648r = uh4.f64648r;
        uh42.f64642i = uh4.f64642i;
        uh42.f64644n = uh4.f64644n;
        uh42.f64643j = uh4.f64643j;
        uh42.f64645o = uh4.f64645o;
        uh42.f64641h = uh4.f64641h;
        uh42.f64638e = uh4.f64638e;
        uh42.f64639f = uh4.f64639f;
        uh42.f64640g = uh4.f64640g;
        uh42.f64637d = uh4.f64637d;
        uh42.f64647q.addAll(uh4.f64647q);
        uh42.f64654x = uh4.f64654x;
        uh42.f64655y = uh4.f64655y;
        uh42.f64656z = uh4.f64656z;
        return uh42;
    }

    /* renamed from: b */
    public static List<e54> m25154b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            e54 e54 = new e54();
            e54.f63770d = optJSONObject.optString("id", "");
            e54.f63771e = optJSONObject.optString("wording", "");
            e54.f63772f = optJSONObject.optLong("category", 0);
            e54.f63773g = optJSONObject.optInt("actionType", 0);
            e54.f63774h = optJSONObject.optString("url", "");
            e54.f63775i = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            e54.f63776j = optJSONObject.optString("subTitle", "");
            e54.f63777n = optJSONObject.optString("icon", "");
            arrayList.add(e54);
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m25155c(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7) {
        HashMap hashMap = new HashMap();
        if (!Util.isNullOrNil(str4)) {
            hashMap.put("redPointMsgId", str4);
        }
        if (!Util.isNullOrNil(str)) {
            hashMap.put("sessionId", str);
        }
        if (!Util.isNullOrNil(str2)) {
            hashMap.put(SearchIntents.EXTRA_QUERY, str2);
        }
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("requestId", str3);
            hashMap.put("pRequestId", str3);
            hashMap.put(TPReportKeys.Common.COMMON_SEQ, str3);
        }
        if (!Util.isNullOrNil(str7)) {
            hashMap.put("extParams", str7);
        }
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(i));
        if (!Util.isNullOrNil(str5)) {
            hashMap.put("tabInfo", str5);
        }
        if (i2 > 0) {
            hashMap.put("contentReddot", "" + i2);
        }
        if (i3 > 0) {
            hashMap.put("numberReddot", "" + i3);
        }
        hashMap.put(Scopes.PROFILE, "1");
        if (!Util.isNullOrNil(str6)) {
            hashMap.put("homeMsgId", str6);
        }
        try {
            hashMap.put(MJTextResolver.KEY_DEVICE_NAME, URLEncoder.encode(C89625d.f257838d, "utf8"));
            hashMap.put("deviceBrand", URLEncoder.encode(Build.BRAND, "utf8"));
            hashMap.put(ConstValue.INIT_CONFIG_KEY_DEVICE_MODEL, URLEncoder.encode(C87203t.m108275k(), "utf8"));
            hashMap.put("ostype", C87200o.f252872e);
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryApiLogic", e, "", new Object[0]);
        }
        return m25156d(hashMap);
    }

    /* renamed from: d */
    public static String m25156d(HashMap<String, String> hashMap) {
        hashMap.put(IXWebPreferences.XWEB_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        hashMap.put("platform", Platform.ANDROID);
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46983g(1).mo71078p0()));
        hashMap.put(DownloadInfo.NETTYPE, C43471q.m46979c());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", BuildInfo.CLIENT_VERSION);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        C45556b g = C43471q.m46983g(1);
        stringBuffer.append(g.mo71077o());
        stringBuffer.append("/");
        stringBuffer.append(g.mo71058f());
        stringBuffer.append("?");
        stringBuffer.append(C43471q.m46987k(hashMap));
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static final zh4 m25157e(List<zh4> list) {
        for (zh4 next : list) {
            if (next != null && !Util.isNullOrNil(next.f145964d)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static String m25158f() {
        return C112760b.m154231g() + "topstory/homecache/";
    }

    /* renamed from: g */
    public static String m25159g() {
        return C112760b.m154231g() + "topstory/negcache/";
    }

    /* renamed from: h */
    public static String m25160h() {
        return MMApplicationContext.getContext().getCacheDir() + "/topstory/";
    }

    /* renamed from: i */
    public static String m25161i(String str) {
        return MMApplicationContext.getContext().getCacheDir() + "/topstory/" + str + "/";
    }

    /* renamed from: j */
    public static final boolean m25162j(int i) {
        return i == 110 || i == 700;
    }

    /* renamed from: k */
    public static final boolean m25163k(int i) {
        return i == 100;
    }

    /* renamed from: l */
    public static final boolean m25164l(int i) {
        return i == 666;
    }

    /* renamed from: m */
    public static final void m25165m(List<C49768hy> list, String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C49768hy hyVar = new C49768hy();
                    hyVar.f134951d = jSONObject.optString("key", "");
                    hyVar.f134952e = (long) jSONObject.optInt("uintValue", 0);
                    hyVar.f134953f = jSONObject.optString("textValue", "");
                    list.add(hyVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: n */
    public static final uh4 m25166n(JSONObject jSONObject) {
        uh4 uh4 = new uh4();
        uh4.f64644n = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
        uh4.f64642i = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
        uh4.f64648r = UUID.randomUUID().toString();
        uh4.f64639f = jSONObject.optString("searchId", "");
        if (NetStatusUtil.isConnected(MMApplicationContext.getContext()) && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            uh4.f64650t = true;
        }
        String optString = jSONObject.optString("videoId", "");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.optString("videoUrls", ""));
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    zh4 zh4 = new zh4();
                    zh4.f145964d = jSONArray.getString(i);
                    arrayList.add(zh4);
                }
            }
        } catch (JSONException unused) {
        }
        if (!Util.isNullOrNil(optString)) {
            xh4 xh4 = new xh4();
            uh4.f64645o = xh4;
            xh4.f64725d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            uh4.f64645o.f64727f = jSONObject.optString("thumbUrl", "");
            uh4.f64645o.f64728g = jSONObject.optInt("mediaDuration", 0);
            xh4 xh42 = uh4.f64645o;
            xh42.f64729h = optString;
            xh42.f64744y = jSONObject.optString("strPlayCount", "");
            uh4.f64645o.f64732n = jSONObject.optString("shareUrl", "");
            uh4.f64645o.f64733o = jSONObject.optString("shareTitle", "");
            uh4.f64645o.f64745z = jSONObject.optString("titleUrl", "");
            uh4.f64645o.f64734p = jSONObject.optString("shareDesc", "");
            uh4.f64645o.f64736q = jSONObject.optString("shareImgUrl", "");
            uh4.f64645o.f64737r = jSONObject.optString("shareString", "");
            uh4.f64645o.f64738s = jSONObject.optString("shareStringUrl", "");
            uh4.f64645o.f64739t = jSONObject.optString(FirebaseAnalytics.C113379b.SOURCE, "");
            uh4.f64645o.f64740u = jSONObject.optString("sourceUrl", "");
            uh4.f64645o.f64741v = (long) jSONObject.optInt("relevant_category", -1);
            uh4.f64645o.f64742w = jSONObject.optString("shareOpenId", "");
            uh4.f64645o.f64706G = jSONObject.optString("docID", "");
            uh4.f64645o.f64709J = (long) jSONObject.optInt("videoSize", 0);
            uh4.f64645o.f64704E = Util.currentTicks();
            uh4.f64645o.f64700A = jSONObject.optInt("itemType", 0);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("block", ""));
                uh4.f64645o.f64707H = jSONObject2.optLong("resultType");
                uh4.f64645o.f64708I = jSONObject2.optLong("type");
            } catch (JSONException unused2) {
            }
            uh4.f64645o.f64743x = jSONObject.optString("expand", "");
            uh4.f64645o.f64710K.addAll(arrayList);
            zh4 e = m25157e(arrayList);
            if (e != null) {
                xh4 xh43 = uh4.f64645o;
                xh43.f64726e = e.f145964d;
                xh43.f64719U = e.f145965e;
            }
            if (Util.isNullOrNil(uh4.f64645o.f64727f)) {
                xh4 xh44 = uh4.f64645o;
                xh44.f64727f = "http://shp.qpic.cn/qqvideo_ori/0/" + uh4.f64645o.f64729h + String.format("_%s_%s/0", new Object[]{Integer.valueOf(C83031z.CTRL_INDEX), 280});
            }
            String optString2 = jSONObject.optString("tagList", "");
            if (!Util.isNullOrNil(optString2)) {
                try {
                    uh4.f64645o.f64703D.addAll(m25154b(new JSONArray(optString2)));
                } catch (Exception unused3) {
                }
            }
            if (!jSONObject.optBoolean("not_show_feedback", false)) {
                uh4.f64645o.f64718T = new vh4();
                JSONObject optJSONObject = jSONObject.optJSONObject("feedbackObj");
                if (optJSONObject != null) {
                    uh4.f64645o.f64718T.f185896d = optJSONObject.optString("detailWording");
                    uh4.f64645o.f64718T.f185897e = optJSONObject.optString("detailUrl");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("feedbackData");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            C64467je0 je02 = new C64467je0();
                            je02.f183790d = optJSONArray.optJSONObject(i2).optString("id", "");
                            je02.f183791e = optJSONArray.optJSONObject(i2).optString("wording", "");
                            uh4.f64645o.f64718T.f185898f.add(je02);
                        }
                    }
                }
            }
            String optString3 = jSONObject.optString("show_tag_list", "");
            if (!Util.isNullOrNil(optString3)) {
                try {
                    uh4.f64645o.f64703D.addAll(m25154b(new JSONArray(optString3)));
                } catch (JSONException unused4) {
                }
            }
            uh4.f64641h = uh4.f64645o.f64741v;
            uh4.f64638e = jSONObject.optString("expand", "");
            uh4.f64643j = "";
            xh4 xh45 = uh4.f64645o;
            uh4.f64637d = xh45.f64729h;
            xh45.f64711L = jSONObject.optInt("switchFlag", 0);
            uh4.f64645o.f64716R = jSONObject.optJSONObject("colikeInfo") != null && jSONObject.optJSONObject("colikeInfo").optBoolean("isSelfThumb");
            uh4.f64645o.f64717S = jSONObject.optJSONObject("colikeInfo") != null ? jSONObject.optJSONObject("colikeInfo").optString("byPass", "") : "";
            if (uh4.f64641h == 100203) {
                xh4 xh46 = uh4.f64645o;
                xh46.f64730i = v2helper.VOIP_ENC_HEIGHT_LV1;
                xh46.f64731j = 640;
            } else {
                xh4 xh47 = uh4.f64645o;
                xh47.f64730i = C83031z.CTRL_INDEX;
                xh47.f64731j = 280;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("secondVideoInfo");
            if (optJSONObject2 != null) {
                uh4.f64645o.f64713N = new sh4();
                uh4.f64645o.f64713N.f64605d = optJSONObject2.optInt("videoSecondType");
                uh4.f64645o.f64713N.f64608g = optJSONObject2.optInt("requestDuration");
                uh4.f64645o.f64713N.f64609h = optJSONObject2.optInt("requestPercent");
            }
            String optString4 = jSONObject.optString("videoChannelTitle", "");
            if (!Util.isNullOrNil(optString4)) {
                long j = uh4.f64641h;
                if (j == 100202 || j == 100204 || j == 100205) {
                    e54 e54 = new e54();
                    uh4.f64646p = e54;
                    e54.f63775i = optString4;
                }
            }
            String optString5 = jSONObject.optString("extReqParams", "");
            if (!Util.isNullOrNil(optString5)) {
                try {
                    JSONArray jSONArray2 = new JSONArray(optString5);
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                        C49768hy hyVar = new C49768hy();
                        hyVar.f134951d = jSONObject3.optString("key", "");
                        hyVar.f134952e = (long) jSONObject3.optInt("uintValue", 0);
                        hyVar.f134953f = jSONObject3.optString("textValue", "");
                        uh4.f64647q.add(hyVar);
                    }
                } catch (Exception unused5) {
                }
            }
            String optString6 = jSONObject.optString("preNetType", "");
            uh4.f64655y = optString6;
            if (optString6.equals("wangka")) {
                uh4.f64656z = 1;
            } else if (uh4.f64655y.equals("2g") || uh4.f64655y.equals("3g") || uh4.f64655y.equals("4g")) {
                uh4.f64656z = 2;
            } else {
                uh4.f64656z = 0;
            }
        }
        return uh4;
    }

    /* renamed from: o */
    public static final uh4 m25167o(w25 w25, int i, String str) {
        uh4 uh4 = new uh4();
        uh4.f64648r = UUID.randomUUID().toString();
        xh4 xh4 = new xh4();
        uh4.f64645o = xh4;
        xh4.f64725d = w25.f259906n;
        xh4.f64706G = "video-" + w25.f259899d;
        xh4 xh42 = uh4.f64645o;
        xh42.f64729h = w25.f259899d;
        String str2 = w25.f259917y;
        xh42.f64727f = str2;
        if (Util.isNullOrNil(str2)) {
            xh4 xh43 = uh4.f64645o;
            xh43.f64727f = "http://shp.qpic.cn/qqvideo_ori/0/" + w25.f259899d + String.format("_%s_%s/0", new Object[]{Integer.valueOf(C83031z.CTRL_INDEX), 280});
        }
        xh4 xh44 = uh4.f64645o;
        xh44.f64744y = w25.f259904i;
        xh44.f64739t = w25.f259911s;
        xh44.f64740u = w25.f259912t;
        String str3 = w25.f259900e;
        xh44.f64743x = str3;
        xh44.f64701B = str3;
        xh44.f64737r = w25.f259909q;
        if (w25.f259916x == 100203) {
            xh44.f64730i = v2helper.VOIP_ENC_HEIGHT_LV1;
            xh44.f64731j = 640;
        } else {
            xh44.f64730i = C83031z.CTRL_INDEX;
            xh44.f64731j = 280;
        }
        xh44.f64704E = System.currentTimeMillis();
        if (!Util.isNullOrNil(w25.f259915w)) {
            try {
                JSONArray jSONArray = new JSONArray(w25.f259915w);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    e54 e54 = new e54();
                    e54.f63770d = jSONObject.optString("id");
                    e54.f63771e = jSONObject.optString("wording");
                    e54.f63772f = jSONObject.optLong("category");
                    e54.f63773g = jSONObject.optInt("actionType");
                    e54.f63774h = jSONObject.optString("url");
                    e54.f63775i = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    e54.f63776j = jSONObject.optString("subTitle");
                    e54.f63777n = jSONObject.optString("icon");
                    uh4.f64645o.f64703D.add(e54);
                }
            } catch (Exception unused) {
            }
        }
        uh4.f64637d = w25.f259899d;
        uh4.f64638e = w25.f259900e;
        uh4.f64639f = w25.f259901f;
        uh4.f64640g = w25.f259902g;
        long j = w25.f259916x;
        uh4.f64641h = j;
        if (j <= 0) {
            uh4.f64641h = 100201;
        }
        uh4.f64650t = false;
        if (!Util.isNullOrNil(w25.f259914v)) {
            m25165m(uh4.f64647q, w25.f259914v);
        }
        uh4.f64643j = "";
        uh4.f64642i = i;
        uh4.f64644n = str;
        if (!Util.isNullOrNil(w25.f259918z)) {
            e54 e542 = new e54();
            uh4.f64646p = e542;
            e542.f63775i = w25.f259918z;
        }
        return uh4;
    }

    /* renamed from: p */
    public static JSONArray m25168p(List<e54> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                JSONObject jSONObject = new JSONObject();
                e54 e54 = list.get(i);
                jSONObject.put("id", e54.f63770d);
                jSONObject.put("wording", e54.f63771e);
                jSONObject.put("category", e54.f63772f);
                jSONObject.put("actionType", e54.f63773g);
                jSONObject.put("url", e54.f63774h);
                jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, e54.f63775i);
                jSONObject.put("subTitle", e54.f63776j);
                jSONObject.put("icon", e54.f63777n);
                jSONArray.put(jSONObject);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }
}
