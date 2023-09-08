package lq2;

import android.text.TextUtils;
import co2.C92448q;
import co2.C92449r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C102646h;
import rq2.C101425k;
import rq2.C63505q;
import vr2.C102236a0;

/* renamed from: lq2.c */
public class C99583c extends C63505q.C63507b {

    /* renamed from: a */
    public List<C99584a> f291903a = new ArrayList();

    /* renamed from: b */
    public String f291904b;

    /* renamed from: c */
    public String f291905c;

    /* renamed from: d */
    public String f291906d;

    /* renamed from: e */
    public int f291907e;

    /* renamed from: f */
    public int f291908f;

    /* renamed from: g */
    public int f291909g = -1;

    /* renamed from: lq2.c$a */
    public static class C99584a {

        /* renamed from: a */
        public int f291910a;

        /* renamed from: b */
        public int f291911b;

        /* renamed from: c */
        public int f291912c;

        /* renamed from: d */
        public int f291913d;

        /* renamed from: e */
        public int f291914e;

        /* renamed from: f */
        public int f291915f;

        /* renamed from: g */
        public int f291916g;

        /* renamed from: h */
        public int f291917h;

        /* renamed from: i */
        public int f291918i;

        /* renamed from: j */
        public int f291919j;

        /* renamed from: k */
        public int f291920k;

        /* renamed from: l */
        public int f291921l;

        /* renamed from: m */
        public int f291922m;
    }

    public C99583c(int i) {
        this.f291907e = i;
    }

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        try {
            jSONObject.putOpt("snsid", this.f291904b);
            jSONObject.putOpt("uxinfo", this.f291905c);
            jSONObject.putOpt("adExtInfo", this.f291906d);
            jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f291907e));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("reportItemList", jSONArray);
            mo138950c(jSONArray);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    /* renamed from: c */
    public final void mo138950c(JSONArray jSONArray) {
        JSONObject jSONObject;
        SnsMethodCalculate.markStartTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (C101425k.m133097a(this.f291903a)) {
            SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        Iterator it = ((ArrayList) this.f291903a).iterator();
        while (it.hasNext()) {
            C99584a aVar = (C99584a) it.next();
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                try {
                    jSONObject = new JSONObject();
                    jSONObject.putOpt(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(aVar.f291910a));
                    jSONObject.putOpt("mediaType", Integer.valueOf(aVar.f291911b));
                    jSONObject.putOpt("hasBorder", Integer.valueOf(aVar.f291922m));
                    jSONObject.putOpt(C102646h.COL_EXPOSURECOUNT, Integer.valueOf(aVar.f291912c));
                    jSONObject.putOpt("autoSlideInCount", Integer.valueOf(aVar.f291913d));
                    jSONObject.putOpt("clickCount", Integer.valueOf(aVar.f291914e));
                    jSONObject.putOpt("btnClickCount", Integer.valueOf(aVar.f291915f));
                    jSONObject.putOpt("playCount", Integer.valueOf(aVar.f291916g));
                    jSONObject.putOpt("finishPlayCount", Integer.valueOf(aVar.f291917h));
                    jSONObject.putOpt("playTotalTime", Integer.valueOf(aVar.f291918i + aVar.f291921l));
                    jSONObject.putOpt("maxPlayTime", Integer.valueOf(aVar.f291917h > 0 ? aVar.f291920k : aVar.f291919j));
                    jSONObject.putOpt("videoTotalTime", Integer.valueOf(aVar.f291920k));
                    SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                } catch (Throwable unused) {
                    jSONObject = null;
                    SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    /* renamed from: d */
    public C99584a mo138951d(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        int i2 = this.f291908f;
        if (i2 <= 4) {
            i %= i2;
        }
        SnsMethodCalculate.markStartTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        boolean z = i >= 0 && i < ((ArrayList) this.f291903a).size();
        SnsMethodCalculate.markEndTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (z) {
            C99584a aVar = (C99584a) ((ArrayList) this.f291903a).get(i);
            SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return aVar;
        }
        SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return null;
    }

    /* renamed from: e */
    public void mo138952e(SnsInfo snsInfo, int i, C92449r rVar) {
        List<C92448q> list;
        SnsMethodCalculate.markStartTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (snsInfo == null) {
            Log.m105924i("SlideFullCardAdChannelData", "the sns info is null!");
            SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        String W = C102236a0.m134728W(snsInfo);
        if (TextUtils.isEmpty(this.f291904b) || !this.f291904b.equals(W)) {
            SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            this.f291904b = Util.nullAsNil(W);
            SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            if (snsInfo.getAdInfo(i) != null) {
                String uxinfo = snsInfo.getUxinfo();
                SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                this.f291905c = Util.nullAsNil(uxinfo);
                SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            String str = snsInfo.getAdXml().adExtInfo;
            SnsMethodCalculate.markStartTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            this.f291906d = Util.nullAsNil(str);
            SnsMethodCalculate.markEndTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            ((ArrayList) this.f291903a).clear();
            if (rVar != null && (list = rVar.f264582a) != null) {
                int size = ((ArrayList) list).size();
                this.f291908f = rVar.f264583b;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = this.f291908f;
                    if (i3 <= 4 && i2 == i3) {
                        break;
                    }
                    C92448q qVar = (C92448q) ((ArrayList) rVar.f264582a).get(i2);
                    C99584a aVar = new C99584a();
                    aVar.f291910a = i2;
                    ((ArrayList) this.f291903a).add(aVar);
                    if (qVar != null) {
                        aVar.f291911b = qVar.mo126435a() ? 2 : 1;
                        aVar.f291922m = 0;
                        if (!Util.isNullOrNil(qVar.f264580h) || !Util.isNullOrNil(qVar.f264581i)) {
                            aVar.f291922m = 1;
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        Log.m105924i("SlideFullCardAdChannelData", "the new sns id is same as the old one!");
        SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    /* renamed from: f */
    public void mo138953f(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        C99584a d = mo138951d(i);
        if (d != null) {
            d.f291920k = i2;
            d.f291918i += d.f291921l;
            d.f291921l = 0;
        }
        SnsMethodCalculate.markEndTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return "sns_ad_slider_card_report";
    }

    public String getContent() {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        String content = super.getContent();
        List<C99584a> list = this.f291903a;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        this.f291904b = "";
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return content;
    }
}
