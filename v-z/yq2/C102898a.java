package yq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import rq2.C63505q;
import vr2.C102236a0;

/* renamed from: yq2.a */
public class C102898a extends C63505q.C63507b {

    /* renamed from: a */
    public SnsInfo f303719a;

    /* renamed from: b */
    public int f303720b;

    /* renamed from: c */
    public C102899a f303721c;

    /* renamed from: yq2.a$a */
    public static class C102899a {

        /* renamed from: a */
        public int f303722a;

        /* renamed from: b */
        public int f303723b;

        /* renamed from: c */
        public int f303724c;

        /* renamed from: d */
        public int f303725d;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
            String str = "[duration=" + this.f303722a + ", dragCount=" + this.f303723b + ", jumpCount=" + this.f303724c + ", firstPlaybackTime=" + this.f303725d + "]";
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
            return str;
        }
    }

    public C102898a(SnsInfo snsInfo, int i, C102899a aVar) {
        this.f303719a = snsInfo;
        this.f303720b = i == 0 ? 1 : 2;
        this.f303721c = aVar;
    }

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        try {
            jSONObject.putOpt("snsid", C102236a0.m134765q0(this.f303719a.field_snsId));
            jSONObject.putOpt("uxinfo", Util.nullAsNil(this.f303719a.getUxinfo()));
            jSONObject.putOpt("adExtInfo", Util.nullAsNil(this.f303719a.getAdXml().adExtInfo));
            jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f303720b));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        try {
            jSONObject.put("dragDuration", this.f303721c.f303722a);
            jSONObject.put("dragCount", this.f303721c.f303723b);
            jSONObject.put("jumpCount", this.f303721c.f303724c);
            jSONObject.put("firstPlaybackTime", this.f303721c.f303725d);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        return "sns_ad_full_card_drag_image_report";
    }
}
