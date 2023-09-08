package hq2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.AdFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import jp2.C98963o;
import org.json.JSONObject;
import rq2.C63505q;
import vr2.C102259p;

/* renamed from: hq2.b */
public class C98496b implements C63505q.C63506a {

    /* renamed from: a */
    public long f288877a;

    /* renamed from: b */
    public String f288878b;

    /* renamed from: c */
    public int f288879c;

    /* renamed from: d */
    public String f288880d;

    /* renamed from: e */
    public int f288881e;

    /* renamed from: f */
    public int f288882f;

    /* renamed from: g */
    public int f288883g;

    /* renamed from: h */
    public Long f288884h;

    /* renamed from: i */
    public int f288885i;

    /* renamed from: b */
    public static C63505q.C63506a m127946b(SnsInfo snsInfo, ADInfo aDInfo, ADXml aDXml, boolean z, boolean z2, View view, C98963o oVar) {
        View view2;
        SnsMethodCalculate.markStartTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (snsInfo == null || aDInfo == null || aDXml == null || view == null) {
            SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        } else if (!snsInfo.isAd()) {
            SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        } else {
            C98496b bVar = new C98496b();
            bVar.f288877a = snsInfo.field_snsId;
            bVar.f288878b = C102259p.m134828a(aDInfo.uxInfo);
            bVar.f288879c = z ? 2 : 1;
            bVar.f288880d = aDXml.adExtInfo;
            bVar.f288885i = z2 ? 2 : 1;
            SnsMethodCalculate.markStartTimeMs("computeAdOffsetScreenTop", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            SnsMethodCalculate.markStartTimeMs("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            if (z) {
                SnsMethodCalculate.markStartTimeMs("findCommentDetailAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                view2 = bVar.mo137855e(view, C0966R.C0970id.f5702m_);
                SnsMethodCalculate.markEndTimeMs("findCommentDetailAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                SnsMethodCalculate.markEndTimeMs("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } else {
                SnsMethodCalculate.markStartTimeMs("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                view2 = bVar.mo137855e(view, C0966R.C0970id.jtt);
                if (view2 instanceof AdFrameLayout) {
                    SnsMethodCalculate.markEndTimeMs("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                } else {
                    SnsMethodCalculate.markEndTimeMs("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                    view2 = view;
                }
                SnsMethodCalculate.markEndTimeMs("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            }
            if (view2 != null) {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                bVar.f288881e = iArr[1];
            }
            SnsMethodCalculate.markEndTimeMs("computeAdOffsetScreenTop", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            SnsMethodCalculate.markStartTimeMs("computeClickPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int width = view.getWidth();
            int height = view.getHeight();
            bVar.f288882f = iArr2[0] + (width / 2);
            bVar.f288883g = iArr2[1] + (height / 2);
            SnsMethodCalculate.markEndTimeMs("computeClickPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            if (!(oVar == null || snsInfo.getTimeLine() == null || snsInfo.getTimeLine().ContentObj == null || snsInfo.getTimeLine().ContentObj.f298424e != 15)) {
                bVar.f288884h = Long.valueOf(oVar.mo138305l(bVar.f288877a));
            }
            SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return bVar;
        }
    }

    /* renamed from: c */
    public static C63505q.C63506a m127947c(SnsInfo snsInfo, boolean z, View view, C98963o oVar) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (snsInfo == null || view == null) {
            SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        try {
            if (!snsInfo.isAd()) {
                SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                return null;
            }
            if (oVar != null) {
                if (oVar.f290131k != 0) {
                    z2 = true;
                    C63505q.C63506a b = m127946b(snsInfo, snsInfo.getAdInfo(), snsInfo.getAdXml(), z2, z, view, oVar);
                    SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                    return b;
                }
            }
            z2 = false;
            C63505q.C63506a b2 = m127946b(snsInfo, snsInfo.getAdInfo(), snsInfo.getAdXml(), z2, z, view, oVar);
            SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return b2;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
    }

    /* renamed from: a */
    public final JSONObject mo137853a() {
        SnsMethodCalculate.markStartTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("snsid", String.valueOf(this.f288877a));
            jSONObject.put("uxinfo", Util.nullAs(this.f288878b, ""));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f288879c);
            jSONObject.put("adExtInfo", Util.nullAs(this.f288880d, ""));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return jSONObject;
    }

    /* renamed from: d */
    public final JSONObject mo137854d() {
        SnsMethodCalculate.markStartTimeMs("extInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adOffSetTop", this.f288881e);
            jSONObject.put("clickPosX", this.f288882f);
            jSONObject.put("clickPosY", this.f288883g);
            Long l = this.f288884h;
            if (l != null) {
                jSONObject.put("videoPlayTime", l.longValue());
            }
            jSONObject.put("buttonType", this.f288885i);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("extInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return jSONObject;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo137855e(android.view.View r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "findTargetUpperLevelView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r5 == 0) goto L_0x001a
        L_0x0009:
            android.view.ViewParent r2 = r5.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x001a
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            int r2 = r5.getId()
            if (r2 != r6) goto L_0x0009
        L_0x001a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.C98496b.mo137855e(android.view.View, int):android.view.View");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return "timeline_ad_feedback_and_sns_button_click";
    }

    public String getContent() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        try {
            SnsMethodCalculate.markStartTimeMs("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            JSONObject a = mo137853a();
            a.put("extInfo", mo137854d());
            str = a.toString();
            SnsMethodCalculate.markEndTimeMs("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return str;
    }
}
