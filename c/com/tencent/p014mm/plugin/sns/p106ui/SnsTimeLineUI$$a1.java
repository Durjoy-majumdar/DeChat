package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 */
public class SnsTimeLineUI$$a1 {

    /* renamed from: a */
    public boolean f278723a = true;

    /* renamed from: b */
    public String f278724b = "";

    /* renamed from: c */
    public int f278725c;

    /* renamed from: d */
    public long f278726d;

    /* renamed from: e */
    public int f278727e;

    /* renamed from: f */
    public int f278728f;

    /* renamed from: g */
    public long f278729g;

    /* renamed from: h */
    public long f278730h;

    /* renamed from: i */
    public int f278731i;

    /* renamed from: j */
    public long f278732j;

    /* renamed from: k */
    public int f278733k;

    /* renamed from: l */
    public final /* synthetic */ SnsTimeLineUI f278734l;

    public SnsTimeLineUI$$a1(SnsTimeLineUI snsTimeLineUI, SnsTimeLineUI$$d snsTimeLineUI$$d) {
        this.f278734l = snsTimeLineUI;
    }

    /* renamed from: a */
    public void mo132961a(int i) {
        SnsMethodCalculate.markStartTimeMs("entranceFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
        if (!this.f278723a) {
            SnsMethodCalculate.markEndTimeMs("entranceFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
            return;
        }
        this.f278728f = i;
        this.f278729g = Util.nowMilliSecond();
        SnsMethodCalculate.markEndTimeMs("entranceFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
    }

    /* renamed from: b */
    public void mo132962b(int i) {
        SnsMethodCalculate.markStartTimeMs("hitDialog", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
        if (!this.f278723a) {
            SnsMethodCalculate.markEndTimeMs("hitDialog", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
            return;
        }
        mo132964d();
        this.f278725c = 3;
        this.f278732j = Util.nowMilliSecond();
        this.f278733k = i;
        SnsMethodCalculate.markEndTimeMs("hitDialog", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
    }

    /* renamed from: c */
    public void mo132963c(int i) {
        SnsMethodCalculate.markStartTimeMs("hitEntrance", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
        if (!this.f278723a) {
            SnsMethodCalculate.markEndTimeMs("hitEntrance", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
            return;
        }
        mo132964d();
        this.f278725c = 2;
        this.f278730h = Util.nowMilliSecond();
        this.f278731i = i;
        SnsMethodCalculate.markEndTimeMs("hitEntrance", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
    }

    /* renamed from: d */
    public final void mo132964d() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
        this.f278725c = 0;
        this.f278726d = 0;
        this.f278727e = -1;
        this.f278728f = 0;
        this.f278729g = 0;
        this.f278730h = 0;
        this.f278731i = 0;
        this.f278732j = 0;
        this.f278733k = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
        String str = this.f278724b + "," + this.f278725c + "," + this.f278726d + "," + this.f278727e + "," + this.f278728f + "," + this.f278729g + "," + this.f278730h + "," + this.f278731i + "," + this.f278732j + "," + this.f278733k + "," + 0;
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene");
        return str;
    }
}
