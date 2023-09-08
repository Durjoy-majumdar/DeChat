package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.sns.model.e1$$a */
public final /* synthetic */ class e1$$a implements C47883u {
    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("lambda$handleSnsDBDamage$0", "com.tencent.mm.plugin.sns.model.SnsCore");
        Log.m105924i("MicroMsg.SnsCore", "[negativeClick]:click cancel");
        SnsMethodCalculate.markEndTimeMs("lambda$handleSnsDBDamage$0", "com.tencent.mm.plugin.sns.model.SnsCore");
    }
}
