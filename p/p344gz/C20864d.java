package p344gz;

import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wxmm.v2helper;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21914h;
import p167hz.C21032k;
import p167hz.C46138l;
import p167hz.C8835h;
import p206nj.C117627q;
import q62.C101048b;
import te3.C49768hy;
import te3.C51593us3;
import te3.e54;
import te3.uh4;
import te3.w25;
import te3.xh4;
import te3.zh4;
import u73.C52464j0;

@C86522b
/* renamed from: gz.d */
public class C20864d extends C86301e implements C8835h, C46138l {
    /* renamed from: GP */
    public uh4 mo9677GP(JSONObject jSONObject) {
        return C21914h.m25166n(jSONObject);
    }

    /* renamed from: GQ */
    public boolean mo9678GQ() {
        int Pe = ((C101048b) C86312j.m106911c(C101048b.class)).mo60591Pe();
        boolean z = Pe == 3 || Pe == 4 || Pe == 5;
        Log.m105925i("MicroMsg.TopStory.TopStoryApiLogic", "isFreeSimCard result :%b simType: %d", Boolean.valueOf(z), Integer.valueOf(Pe));
        return z;
    }

    public void Os0(w25 w25, TimeLineObject timeLineObject) {
        String str = timeLineObject.UserName;
        String str2 = timeLineObject.f283893Id;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("isShareClick=1");
        stringBuffer.append("&relevant_vid=");
        stringBuffer.append(w25.f259899d);
        stringBuffer.append("&relevant_pre_searchid=");
        stringBuffer.append(w25.f259901f);
        stringBuffer.append("&relevant_shared_openid=");
        stringBuffer.append(w25.f259902g);
        stringBuffer.append("&rec_category=");
        long j = w25.f259916x;
        if (j > 0) {
            stringBuffer.append(j);
        } else {
            stringBuffer.append(w25.f259903h);
        }
        stringBuffer.append("&source=");
        stringBuffer.append(w25.f259911s);
        stringBuffer.append("&fromUser=");
        stringBuffer.append(str);
        stringBuffer.append("&fromScene=");
        stringBuffer.append(3);
        stringBuffer.append("&targetInfo=");
        stringBuffer.append(str2);
        stringBuffer.append("&expand=");
        stringBuffer.append(w25.f259900e);
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", stringBuffer.toString());
        C51593us3 us32 = new C51593us3();
        us32.f143104t = stringBuffer.toString();
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: Qr */
    public uh4 mo9679Qr(w25 w25, int i, String str) {
        return C21914h.m25167o(w25, i, str);
    }

    public String Ta0(HashMap<String, String> hashMap) {
        return C21914h.m25156d(hashMap);
    }

    /* renamed from: VQ */
    public void mo32566VQ(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryWebViewVisitTime %s", str);
        C51593us3 us32 = new C51593us3();
        us32.f143104t = str;
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: aW */
    public void mo32567aW(String str, String str2, int i, long j) {
        if (!Util.isNullOrNil(str) && str.startsWith("wrd")) {
            try {
                String format = String.format("%s,%s,%s,%s", new Object[]{C117627q.m165909b(str2, "utf8"), Integer.valueOf(i), str, Long.valueOf(j)});
                Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "kvReportTopStoryOpenWebViewError 15728 %s", format);
                C115669n.INSTANCE.kvStat(15728, format);
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    /* renamed from: qk */
    public void mo32568qk(String str, int i) {
        if (!Util.isNullOrNil(str) && str.startsWith("wrd")) {
            C115669n.INSTANCE.idkeyStat(900, (long) i, 1, false);
        }
    }

    /* renamed from: t4 */
    public C21032k mo9681t4() {
        return ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4();
    }

    /* renamed from: yK */
    public uh4 mo9682yK(Map<String, Object> map) {
        uh4 uh4 = new uh4();
        uh4.f64644n = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        uh4.f64642i = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
        uh4.f64648r = UUID.randomUUID().toString();
        uh4.f64643j = C43471q.m46982f(map, "searchId");
        if (NetStatusUtil.isConnected(MMApplicationContext.getContext()) && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            uh4.f64650t = true;
        }
        String f = C43471q.m46982f(map, "videoId");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(C43471q.m46982f(map, "videoUrls"));
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    zh4 zh4 = new zh4();
                    zh4.f145964d = jSONArray.getString(i);
                    arrayList.add(zh4);
                }
            }
        } catch (JSONException unused) {
        }
        if (!Util.isNullOrNil(f)) {
            xh4 xh4 = new xh4();
            uh4.f64645o = xh4;
            xh4.f64725d = C43471q.m46982f(map, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            uh4.f64645o.f64727f = C43471q.m46982f(map, "thumbUrl");
            uh4.f64645o.f64728g = C43471q.m46981e(map, "mediaDuration", 0);
            xh4 xh42 = uh4.f64645o;
            xh42.f64729h = f;
            xh42.f64744y = C43471q.m46982f(map, "strPlayCount");
            uh4.f64645o.f64732n = C43471q.m46982f(map, "shareUrl");
            uh4.f64645o.f64733o = C43471q.m46982f(map, "shareTitle");
            uh4.f64645o.f64745z = C43471q.m46982f(map, "titleUrl");
            uh4.f64645o.f64734p = C43471q.m46982f(map, "shareDesc");
            uh4.f64645o.f64736q = C43471q.m46982f(map, "shareImgUrl");
            uh4.f64645o.f64737r = C43471q.m46982f(map, "shareString");
            uh4.f64645o.f64738s = C43471q.m46982f(map, "shareStringUrl");
            uh4.f64645o.f64739t = C43471q.m46982f(map, FirebaseAnalytics.C113379b.SOURCE);
            uh4.f64645o.f64740u = C43471q.m46982f(map, "sourceUrl");
            xh4 xh43 = uh4.f64645o;
            long j = -1;
            String f2 = C43471q.m46982f(map, "relevant_category");
            if (!Util.isNullOrNil(f2)) {
                try {
                    j = Long.valueOf(f2).longValue();
                } catch (Exception unused2) {
                }
            }
            xh43.f64741v = j;
            uh4.f64645o.f64742w = C43471q.m46982f(map, "shareOpenId");
            uh4.f64645o.f64706G = C43471q.m46982f(map, "docID");
            xh4 xh44 = uh4.f64645o;
            long j2 = 0;
            String f3 = C43471q.m46982f(map, "videoSize");
            if (!Util.isNullOrNil(f3)) {
                try {
                    j2 = Long.valueOf(f3).longValue();
                } catch (Exception unused3) {
                }
            }
            xh44.f64709J = j2;
            uh4.f64645o.f64704E = Util.currentTicks();
            uh4.f64645o.f64700A = C43471q.m46981e(map, "itemType", 0);
            uh4.f64645o.f64711L = C43471q.m46981e(map, "switchFlag", 0);
            if (Util.isNullOrNil(uh4.f64645o.f64727f)) {
                xh4 xh45 = uh4.f64645o;
                xh45.f64727f = "http://shp.qpic.cn/qqvideo_ori/0/" + uh4.f64645o.f64729h + String.format("_%s_%s/0", new Object[]{Integer.valueOf(C83031z.CTRL_INDEX), 280});
            }
            try {
                JSONObject jSONObject = new JSONObject(C43471q.m46982f(map, "block"));
                uh4.f64645o.f64707H = jSONObject.optLong("resultType");
                uh4.f64645o.f64708I = jSONObject.optLong("type");
            } catch (JSONException unused4) {
            }
            uh4.f64645o.f64743x = C43471q.m46982f(map, "expand");
            uh4.f64645o.f64710K.addAll(arrayList);
            zh4 e = C21914h.m25157e(arrayList);
            if (e != null) {
                xh4 xh46 = uh4.f64645o;
                xh46.f64726e = e.f145964d;
                xh46.f64719U = e.f145965e;
            }
            String f4 = C43471q.m46982f(map, "show_tag_list");
            if (!Util.isNullOrNil(f4)) {
                try {
                    uh4.f64645o.f64703D.addAll(C21914h.m25154b(new JSONArray(f4)));
                } catch (JSONException unused5) {
                }
            }
            uh4.f64641h = uh4.f64645o.f64741v;
            uh4.f64638e = C43471q.m46982f(map, "expand");
            uh4.f64639f = uh4.f64643j;
            xh4 xh47 = uh4.f64645o;
            uh4.f64637d = xh47.f64729h;
            if (uh4.f64641h == 100203) {
                xh47.f64730i = v2helper.VOIP_ENC_HEIGHT_LV1;
                xh47.f64731j = 640;
            } else {
                xh47.f64730i = C83031z.CTRL_INDEX;
                xh47.f64731j = 280;
            }
            String f5 = C43471q.m46982f(map, "videoChannelTitle");
            if (!Util.isNullOrNil(uh4.f64645o.f64737r)) {
                long j3 = uh4.f64641h;
                if (j3 == 100202 || j3 == 100204 || j3 == 100205) {
                    e54 e54 = new e54();
                    uh4.f64646p = e54;
                    e54.f63775i = f5;
                }
            }
            String f6 = C43471q.m46982f(map, "extReqParams");
            if (!Util.isNullOrNil(f6)) {
                try {
                    JSONArray jSONArray2 = new JSONArray(f6);
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        C49768hy hyVar = new C49768hy();
                        hyVar.f134951d = jSONObject2.optString("key", "");
                        hyVar.f134952e = (long) jSONObject2.optInt("uintValue", 0);
                        hyVar.f134953f = jSONObject2.optString("textValue", "");
                        uh4.f64647q.add(hyVar);
                    }
                } catch (Exception unused6) {
                }
            }
        }
        return uh4;
    }
}
