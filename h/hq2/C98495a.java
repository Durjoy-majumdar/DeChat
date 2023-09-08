package hq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import rq2.C63505q;

/* renamed from: hq2.a */
public class C98495a implements C63505q.C63506a {

    /* renamed from: a */
    public long f288873a;

    /* renamed from: b */
    public String f288874b;

    /* renamed from: c */
    public int f288875c;

    /* renamed from: d */
    public String f288876d;

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        return "timeline_ad_feedback_click_positive_btn";
    }

    public String getContent() {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        SnsMethodCalculate.markStartTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("snsid", String.valueOf(this.f288873a));
            jSONObject.put("uxinfo", Util.nullAs(this.f288874b, ""));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f288875c);
            jSONObject.put("adExtInfo", Util.nullAs(this.f288876d, ""));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        String jSONObject2 = jSONObject.toString();
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        return jSONObject2;
    }
}
