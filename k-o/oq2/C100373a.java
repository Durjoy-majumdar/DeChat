package oq2;

import android.text.TextUtils;
import co2.C92443k;
import co2.C92444l;
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

/* renamed from: oq2.a */
public class C100373a extends C63505q.C63507b {

    /* renamed from: a */
    public String f293968a;

    /* renamed from: b */
    public String f293969b;

    /* renamed from: c */
    public int f293970c;

    /* renamed from: d */
    public int f293971d = 0;

    /* renamed from: e */
    public List<C100374a> f293972e = new ArrayList();

    /* renamed from: f */
    public int f293973f = -1;

    /* renamed from: oq2.a$a */
    public static class C100374a {

        /* renamed from: a */
        public int f293974a;

        /* renamed from: b */
        public int f293975b;

        /* renamed from: c */
        public int f293976c;

        /* renamed from: d */
        public int f293977d;

        /* renamed from: e */
        public int f293978e;

        /* renamed from: f */
        public int f293979f;

        /* renamed from: g */
        public int f293980g;

        /* renamed from: h */
        public int f293981h;

        /* renamed from: i */
        public int f293982i;

        /* renamed from: j */
        public String f293983j;

        /* renamed from: k */
        public int f293984k;
    }

    public C100373a(int i) {
        this.f293970c = i;
    }

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        try {
            jSONObject.putOpt("snsid", this.f293968a);
            jSONObject.putOpt("uxinfo", this.f293969b);
            jSONObject.putOpt("adExtInfo", (Object) null);
            jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f293970c));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        try {
            jSONObject.putOpt("infoBarClickCount", Integer.valueOf(this.f293971d));
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("reportItemList", jSONArray);
            mo139645c(jSONArray);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    /* renamed from: c */
    public final void mo139645c(JSONArray jSONArray) {
        JSONObject jSONObject;
        SnsMethodCalculate.markStartTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (C101425k.m133097a(this.f293972e)) {
            SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        Iterator it = ((ArrayList) this.f293972e).iterator();
        while (it.hasNext()) {
            C100374a aVar = (C100374a) it.next();
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                try {
                    jSONObject = new JSONObject();
                    jSONObject.putOpt(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(aVar.f293974a));
                    jSONObject.putOpt("mediaType", Integer.valueOf(aVar.f293975b));
                    jSONObject.putOpt("finderType", Util.nullAsNil(aVar.f293983j));
                    jSONObject.putOpt(C102646h.COL_EXPOSURECOUNT, Integer.valueOf(aVar.f293976c));
                    jSONObject.putOpt("clickCount", Integer.valueOf(aVar.f293977d));
                    jSONObject.putOpt("playCount", Integer.valueOf(aVar.f293978e));
                    jSONObject.putOpt("finishPlayCount", Integer.valueOf(aVar.f293979f));
                    jSONObject.putOpt("playTotalTime", Integer.valueOf(aVar.f293980g + aVar.f293984k));
                    jSONObject.putOpt("maxPlayTime", Integer.valueOf(aVar.f293979f > 0 ? aVar.f293982i : aVar.f293981h));
                    jSONObject.putOpt("videoTotalTime", Integer.valueOf(aVar.f293982i));
                    SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                } catch (Throwable unused) {
                    jSONObject = null;
                    SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    /* renamed from: d */
    public C100374a mo139646d(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        SnsMethodCalculate.markStartTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        boolean z = i >= 0 && i < ((ArrayList) this.f293972e).size();
        SnsMethodCalculate.markEndTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (z) {
            C100374a aVar = (C100374a) ((ArrayList) this.f293972e).get(i);
            SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return aVar;
        }
        SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return null;
    }

    /* renamed from: e */
    public void mo139647e(SnsInfo snsInfo, int i, C92443k kVar) {
        List<C92444l> list;
        SnsMethodCalculate.markStartTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (snsInfo == null) {
            Log.m105924i("SnsAd.AdChannelData", "the sns info is null!");
            SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        String W = C102236a0.m134728W(snsInfo);
        if (TextUtils.isEmpty(this.f293968a) || !this.f293968a.equals(W)) {
            SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            this.f293968a = Util.nullAsNil(W);
            SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            if (snsInfo.getAdInfo(i) != null) {
                String uxinfo = snsInfo.getUxinfo();
                SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                this.f293969b = Util.nullAsNil(uxinfo);
                SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
            ((ArrayList) this.f293972e).clear();
            if (!(kVar == null || (list = kVar.f264544f) == null)) {
                int size = ((ArrayList) list).size();
                for (int i2 = 0; i2 < size; i2++) {
                    C92444l lVar = (C92444l) ((ArrayList) kVar.f264544f).get(i2);
                    C100374a aVar = new C100374a();
                    aVar.f293974a = i2;
                    ((ArrayList) this.f293972e).add(aVar);
                    if (lVar != null) {
                        aVar.f293975b = lVar.mo126434a() ? 2 : 1;
                        aVar.f293983j = Util.nullAsNil(lVar.f264554j);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        Log.m105924i("SnsAd.AdChannelData", "the new sns id is same as the old one!");
        SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    /* renamed from: f */
    public void mo139648f(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        C100374a d = mo139646d(i);
        if (d != null) {
            d.f293982i = i2;
            d.f293980g += d.f293984k;
            d.f293984k = 0;
        }
        SnsMethodCalculate.markEndTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return "sns_ad_finder_topic_report";
    }

    public String getContent() {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        String content = super.getContent();
        List<C100374a> list = this.f293972e;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        this.f293968a = "";
        this.f293971d = 0;
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return content;
    }
}
