package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.a */
public abstract class C95711a implements C95778f1 {
    /* renamed from: b */
    public void mo132253b(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.IWidget");
        SnsMethodCalculate.markEndTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.IWidget");
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.AbstractWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.AbstractWidget");
        return true;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.AbstractWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.AbstractWidget");
        return true;
    }

    /* renamed from: j */
    public abstract void mo133155j(Bundle bundle);

    /* renamed from: k */
    public abstract int mo133156k();
}
