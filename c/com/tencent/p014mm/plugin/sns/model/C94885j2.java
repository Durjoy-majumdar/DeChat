package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.plugin.sns.model.j2 */
public final class C94885j2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f274958d;

    /* renamed from: e */
    public final /* synthetic */ C94955u2 f274959e;

    public C94885j2(String str, C94955u2 u2Var) {
        this.f274958d = str;
        this.f274959e = u2Var;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager$loadUnFoldWsUserName$1$1$1");
        SnsMethodCalculate.markStartTimeMs("access$getWsFoldMMKV$p", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        MultiProcessMMKV multiProcessMMKV = C94891k2.f274976b;
        SnsMethodCalculate.markEndTimeMs("access$getWsFoldMMKV$p", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        multiProcessMMKV.encode(this.f274958d, this.f274959e.toString());
        StringBuilder sb = new StringBuilder();
        sb.append("[loadUnFoldWsUserName] clear username = ");
        C94955u2 u2Var = this.f274959e;
        u2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.WsFoldData");
        String str = u2Var.f275272a;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.WsFoldData");
        sb.append(str);
        sb.append(" all data");
        Log.m105924i("MicroMsg.SnsWsFoldManager", sb.toString());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager$loadUnFoldWsUserName$1$1$1");
    }
}
