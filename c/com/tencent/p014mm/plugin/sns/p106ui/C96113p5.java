package com.tencent.p014mm.plugin.sns.p106ui;

import ce3.C39946a;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.p5 */
public class C96113p5 implements C39946a {

    /* renamed from: a */
    public String f280719a;

    /* renamed from: b */
    public String f280720b;

    /* renamed from: c */
    public boolean f280721c;

    /* renamed from: d */
    public boolean f280722d;

    /* renamed from: e */
    public int f280723e;

    /* renamed from: f */
    public String f280724f;

    public C96113p5(String str, String str2, boolean z, boolean z2, int i) {
        this.f280719a = str;
        this.f280721c = z;
        this.f280722d = z2;
        this.f280723e = i;
        this.f280720b = str2;
    }

    /* renamed from: a */
    public int mo62561a() {
        SnsMethodCalculate.markStartTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        SnsMethodCalculate.markEndTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return 1;
    }

    /* renamed from: b */
    public boolean mo133678b() {
        SnsMethodCalculate.markStartTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        int i = this.f280723e;
        int i2 = 2;
        if (i != 1) {
            i2 = i == 2 ? 4 : -1;
        }
        C94965w1.C94967b e = C94965w1.m120624e(this.f280719a);
        if (e == null || !e.f275306d || e.f275307e || (e.f275308f & i2) == 0) {
            SnsMethodCalculate.markEndTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return true;
    }

    public String getMsgId() {
        SnsMethodCalculate.markStartTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        SnsMethodCalculate.markEndTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return null;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        String str = this.f280724f;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.SnsPostDescInfo");
        return str;
    }
}
