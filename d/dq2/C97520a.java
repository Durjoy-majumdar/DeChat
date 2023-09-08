package dq2;

import android.app.Activity;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq2.C45147e;
import cq2.C97354d;
import eq2.C97689a;
import eq2.C97690b;
import fq2.C97948a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lp2.C46886g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rq2.C101425k;
import te3.C49364f2;
import vr2.C102236a0;

/* renamed from: dq2.a */
public class C97520a implements C97354d.C97355a, C45147e {

    /* renamed from: a */
    public final WeakReference<Activity> f286209a;

    public C97520a(Activity activity) {
        this.f286209a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public void mo70652a(int i, String str, List<C49364f2> list) {
        SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        if (i == 0) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!C101425k.m133097a(list)) {
                        mo136795c(str, list);
                        SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Log.m105928w("SnsAd.TopicCardRequestAction", "the data is empty, or request failed!!! Do nothing!!");
        SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }

    /* renamed from: b */
    public void mo136794b(int i, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("doRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        if (!(snsInfo == null || snsInfo.getAdXml() == null)) {
            try {
                String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
                ADInfo adInfo = snsInfo.getAdInfo(i);
                String uxinfo = (adInfo == null || !TextUtils.isEmpty(adInfo.uxInfo)) ? snsInfo.getUxinfo() : adInfo.uxInfo;
                snsInfo.getAdXml();
                SnsMethodCalculate.markStartTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                C49364f2 f2Var = new C49364f2();
                SnsMethodCalculate.markStartTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                SnsMethodCalculate.markEndTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                f2Var.f133246d = 3;
                f2Var.f133247e = "";
                C49364f2[] f2VarArr = {f2Var};
                SnsMethodCalculate.markEndTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                if (TextUtils.isEmpty(q0) || TextUtils.isEmpty(uxinfo)) {
                    Log.m105928w("SnsAd.TopicCardRequestAction", "are you sure input param is valid???");
                    SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                } else {
                    new C46886g(q0, uxinfo, f2VarArr).mo72088m1(this);
                    SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("doRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }

    /* renamed from: c */
    public final void mo136795c(String str, List<C49364f2> list) {
        C97948a aVar;
        C97689a aVar2;
        JSONArray jSONArray;
        String str2;
        String str3 = str;
        SnsMethodCalculate.markStartTimeMs("onResponseSuccess", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        Log.m105918d("SnsAd.TopicCardRequestAction", "the response snsId is " + str3);
        C49364f2 f2Var = list.get(0);
        if (f2Var != null) {
            int i = f2Var.f133246d;
            SnsMethodCalculate.markStartTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
            SnsMethodCalculate.markEndTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
            if (i == 3 && !TextUtils.isEmpty(f2Var.f133247e)) {
                String str4 = f2Var.f133247e;
                String str5 = "";
                SnsMethodCalculate.markStartTimeMs("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    aVar = new C97948a();
                    JSONObject jSONObject = new JSONObject(str4);
                    if (jSONObject.has("relationText")) {
                        aVar.f287287a = jSONObject.getString("relationText");
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("finderTopicResList");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        int i2 = 0;
                        while (i2 < length) {
                            C97948a.C97950b bVar = new C97948a.C97950b();
                            JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i2);
                            bVar.f287295a = jSONObject2.optString("avatar");
                            bVar.f287296b = jSONObject2.optString("nickname");
                            bVar.f287297c = jSONObject2.optString("tag");
                            bVar.f287298d = jSONObject2.optString("desc");
                            bVar.f287299e = jSONObject2.optString("barBgColor");
                            bVar.f287300f = jSONObject2.optString("duration");
                            JSONObject optJSONObject = jSONObject2.optJSONObject("imageInfo");
                            if (optJSONObject != null) {
                                C97948a.C97949a aVar3 = new C97948a.C97949a();
                                bVar.f287301g = aVar3;
                                jSONArray = optJSONArray;
                                aVar3.f287289a = optJSONObject.optString("mid", str5);
                                bVar.f287301g.f287290b = optJSONObject.optString("url", str5);
                                bVar.f287301g.f287291c = optJSONObject.optString("thumb");
                                str2 = str5;
                                bVar.f287301g.f287292d = optJSONObject.optInt("width", 0);
                                bVar.f287301g.f287293e = optJSONObject.optInt("height", 0);
                                bVar.f287301g.f287294f = optJSONObject.optInt("totalSize", 0);
                            } else {
                                jSONArray = optJSONArray;
                                str2 = str5;
                            }
                            ((ArrayList) aVar.f287288b).add(bVar);
                            i2++;
                            optJSONArray = jSONArray;
                            str5 = str2;
                        }
                    }
                    Log.m105918d("SnsAd.TopicCardRequestAction", "the parse result takes " + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
                    SnsMethodCalculate.markEndTimeMs("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                } catch (JSONException unused) {
                    aVar = null;
                    SnsMethodCalculate.markEndTimeMs("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                }
                if (!(aVar == null || this.f286209a == null)) {
                    Log.m105918d("SnsAd.TopicCardRequestAction", "TopicCardResponseModel : " + aVar);
                    RequestListenerManager a = RequestListenerManager.m119934a(this.f286209a.get());
                    if (a != null) {
                        SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                        C97690b bVar2 = a.f274152d;
                        if (bVar2 != null) {
                            SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            if (TextUtils.isEmpty(str)) {
                                SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            } else {
                                WeakReference weakReference = (WeakReference) ((HashMap) bVar2.f286536a).get(str3);
                                if (!(weakReference == null || (aVar2 = (C97689a) weakReference.get()) == null)) {
                                    aVar2.mo136945a(str3, aVar);
                                }
                                SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResponseSuccess", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }
}
