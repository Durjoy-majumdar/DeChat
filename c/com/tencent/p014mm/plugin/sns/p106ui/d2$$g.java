package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$g */
public class d2$$g implements C7013o.C7017c {
    public d2$$g(C95754d2 d2Var) {
    }

    /* renamed from: a */
    public String mo8052a(String str) {
        SnsMethodCalculate.markStartTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.PicWidget$5");
        String str2 = C94866e1.m120263iU() + C90193h.m112878f((str + System.currentTimeMillis()).getBytes());
        SnsMethodCalculate.markEndTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.PicWidget$5");
        return str2;
    }
}
