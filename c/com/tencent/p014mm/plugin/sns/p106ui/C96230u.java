package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import ce3.C39946a;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import te3.w64;

/* renamed from: com.tencent.mm.plugin.sns.ui.u */
public class C96230u implements C39946a {

    /* renamed from: a */
    public String f281191a;

    /* renamed from: b */
    public String f281192b;

    /* renamed from: c */
    public String f281193c;

    /* renamed from: d */
    public String f281194d;

    /* renamed from: e */
    public w64 f281195e;

    /* renamed from: f */
    public Object f281196f;

    /* renamed from: g */
    public View f281197g;

    /* renamed from: h */
    public String f281198h;

    /* renamed from: i */
    public int f281199i;

    /* renamed from: j */
    public String f281200j;

    public C96230u(String str, String str2, w64 w64, String str3, String str4, View view, int i, String str5, String str6) {
        this.f281191a = str;
        this.f281192b = str2;
        this.f281195e = w64;
        this.f281194d = str3;
        this.f281193c = str4;
        this.f281197g = view;
        this.f281198h = str5;
        this.f281199i = i;
        this.f281200j = str6;
    }

    /* renamed from: a */
    public int mo62561a() {
        SnsMethodCalculate.markStartTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        SnsMethodCalculate.markEndTimeMs("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return 3;
    }

    /* renamed from: b */
    public boolean mo133895b() {
        SnsMethodCalculate.markStartTimeMs("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        String str = this.f281192b;
        StringBuilder sb = new StringBuilder();
        w64 w64 = this.f281195e;
        int i = w64.f299709j;
        sb.append(i != 0 ? (long) i : w64.f299714r);
        sb.append("");
        String d = C94965w1.m120623d(str, sb.toString());
        int i2 = -1;
        int i3 = this.f281199i;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 4;
        }
        C94965w1.C94967b e = C94965w1.m120624e(d);
        if (e == null || !e.f275306d || e.f275307e || (e.f275308f & i2) == 0) {
            SnsMethodCalculate.markEndTimeMs("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return true;
    }

    public String getMsgId() {
        SnsMethodCalculate.markStartTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        String format = String.format("%s_%s", new Object[]{this.f281200j, Integer.valueOf(this.f281195e.f299709j)});
        SnsMethodCalculate.markEndTimeMs("getMsgId", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return format;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        w64 w64 = this.f281195e;
        if (w64 == null) {
            SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
            return null;
        }
        String str = w64.f299703d;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return str;
    }
}
