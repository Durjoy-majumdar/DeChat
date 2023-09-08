package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.List;
import os2.C100420w;

/* renamed from: com.tencent.mm.plugin.sns.ui.u4 */
public class C96235u4 {

    /* renamed from: a */
    public String f281206a;

    /* renamed from: b */
    public int f281207b;

    /* renamed from: c */
    public int f281208c;

    /* renamed from: d */
    public List<View> f281209d;

    /* renamed from: e */
    public boolean f281210e;

    /* renamed from: f */
    public int f281211f = 0;

    /* renamed from: g */
    public long f281212g;

    /* renamed from: h */
    public C100420w f281213h;

    public C96235u4() {
    }

    /* renamed from: a */
    public void mo133900a() {
        SnsMethodCalculate.markStartTimeMs("markForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
        this.f281212g = 0;
        this.f281211f = 2;
        SnsMethodCalculate.markEndTimeMs("markForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
    }

    public C96235u4(String str, int i, List<View> list, int i2) {
        this.f281206a = str;
        this.f281207b = i;
        this.f281209d = list;
        this.f281208c = i2;
    }
}
