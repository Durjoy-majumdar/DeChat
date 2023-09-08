package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.x4$$f */
public final /* synthetic */ class x4$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C96313x4 f281669d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f281670e;

    /* renamed from: f */
    public final /* synthetic */ int f281671f;

    /* renamed from: g */
    public final /* synthetic */ x4$$l f281672g;

    public /* synthetic */ x4$$f(C96313x4 x4Var, ArrayList arrayList, int i, x4$$l x4__l) {
        this.f281669d = x4Var;
        this.f281670e = arrayList;
        this.f281671f = i;
        this.f281672g = x4__l;
    }

    public final void run() {
        C96313x4 x4Var = this.f281669d;
        ArrayList arrayList = this.f281670e;
        int i = this.f281671f;
        x4$$l x4__l = this.f281672g;
        x4Var.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        long currentTimeMillis = System.currentTimeMillis();
        CharSequence j = x4Var.mo134146j(arrayList, i);
        Log.m105925i("MicroMsg.Sns.AnimatedExpandableListAdapter", "packageContactName cost:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        x4__l.mo134150a(j);
        SnsMethodCalculate.markEndTimeMs("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }
}
