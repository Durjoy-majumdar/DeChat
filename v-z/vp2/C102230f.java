package vp2;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.C94588a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cq2.C97354d;
import io2.C98771b;
import java.util.ArrayList;
import java.util.Iterator;
import lo2.C46881t0;
import lo2.C99542h0;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import rq2.C101431r;
import t91.C64208c;
import tp2.C101914d;
import up2.C102060a;
import vr2.C102236a0;

/* renamed from: vp2.f */
public class C102230f extends C102060a {

    /* renamed from: vp2.f$a */
    public class C102231a implements C98771b.C98772a {

        /* renamed from: a */
        public final /* synthetic */ Context f301025a;

        public C102231a(Context context) {
            this.f301025a = context;
        }

        /* renamed from: a */
        public void mo130218a(String str, int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick$1");
            Log.m105924i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "showLivingRoom, snsId=" + str + ", errCode=" + i2 + ", actionType=" + i);
            if (i2 != 0) {
                C102230f fVar = C102230f.this;
                Context context = this.f301025a;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
                try {
                    C76912y0.m92767f(context, "进入直播间失败");
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
                C115669n.INSTANCE.mo175911u(1837, 5);
            }
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick$1");
        }
    }

    public C102230f(AdClickActionInfo adClickActionInfo) {
        this.f300548a = adClickActionInfo;
    }

    /* renamed from: c */
    public boolean mo73731c(View view, int i, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, C101914d dVar) {
        String str;
        int i2 = i;
        SnsInfo snsInfo2 = snsInfo;
        AdClickActionInfo adClickActionInfo2 = adClickActionInfo;
        C101914d dVar2 = dVar;
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        Log.m105924i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "AdFinderLiveRoomClick doClick, source=" + i2);
        if (view == null || adClickActionInfo2 == null || snsInfo2 == null) {
            Log.m105920e("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "info null");
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return false;
        }
        Context context = view.getContext();
        if (context == null) {
            Log.m105920e("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "context null");
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("isFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        boolean isNullOrNil = Util.isNullOrNil(adClickActionInfo2.finderUsername, adClickActionInfo2.finderLiveId, adClickActionInfo2.f273627O, adClickActionInfo2.f273628P);
        SnsMethodCalculate.markEndTimeMs("isFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        if (isNullOrNil) {
            Log.m105924i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "click actionBtn, ready to jump FinderRoomPreview， previewNode=" + adClickActionInfo2.f273629Q);
            C101431r.m133118a((SnsAdClick) dVar2.mo141403a("snsAdClick", null), 48);
            if (adClickActionInfo2.f273629Q) {
                SnsMethodCalculate.markStartTimeMs("parseFinderRoomPreviewInfoToJsonStr", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("image", Util.nullAsNil(adClickActionInfo2.f273633U));
                    jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, Util.nullAsNil(adClickActionInfo2.f273634V));
                    jSONObject.put("desc", Util.nullAsNil(adClickActionInfo2.f273635W));
                    jSONObject.put("actionTitle", Util.nullAsNil(adClickActionInfo2.f273636X));
                    jSONObject.put("canvasId", Util.nullAsNil(adClickActionInfo2.f273637Y));
                    jSONObject.put("uxInfo", Util.nullAsNil(snsInfo.getUxinfo()));
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((ArrayList) adClickActionInfo2.f273638Z).iterator();
                    while (it.hasNext()) {
                        C94588a.C94589a.C94590a aVar = (C94588a.C94589a.C94590a) it.next();
                        if (aVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("iconUrl", Util.nullAsNil(aVar.f273690a));
                            jSONObject2.put("sampleRate", Util.nullAsNil(Integer.valueOf(aVar.f273691b)));
                            jSONArray.put(jSONObject2);
                        }
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("bgImage", adClickActionInfo2.f273630R);
                    jSONObject3.put("avatar", adClickActionInfo2.f273631S);
                    jSONObject3.put("nickname", adClickActionInfo2.f273632T);
                    jSONObject3.put("productInfo", jSONObject);
                    jSONObject3.put("liveCheerIconList", jSONArray);
                    str = jSONObject3.toString();
                    SnsMethodCalculate.markEndTimeMs("parseFinderRoomPreviewInfoToJsonStr", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                } catch (Throwable th) {
                    Log.m105920e("LiteAppPreviewHelper", th.toString());
                    SnsMethodCalculate.markEndTimeMs("parseFinderRoomPreviewInfoToJsonStr", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                    str = "";
                }
                C46881t0.m52212c(context, str);
            } else {
                C46881t0.m52214e(context);
            }
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return true;
        }
        String W = C102236a0.m134728W(snsInfo);
        C101431r.m133118a((SnsAdClick) dVar2.mo141403a("snsAdClick", null), 44);
        SnsMethodCalculate.markStartTimeMs("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        try {
            C97354d.m125367c(context).mo136622a(i2, snsInfo2);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        String j = C99542h0.m129912j(snsInfo.getUxinfo(), W, C99542h0.m129905c(adClickActionInfo2.f273639a));
        C64208c.f181951a.mo89032g(j, adClickActionInfo2.finderUsername);
        Log.m105924i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "doClick, setSnsAdData, snsAdInfo=" + j + ", finderUsername=" + adClickActionInfo2.finderUsername);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("is_from_ad", Boolean.TRUE);
        arrayMap.put("key_extra_info", j);
        C98771b.m128555d(context, adClickActionInfo2.finderUsername, adClickActionInfo2.finderLiveId, adClickActionInfo2.f273627O, adClickActionInfo2.f273628P, arrayMap, W, new C102231a(context));
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        return true;
    }
}
