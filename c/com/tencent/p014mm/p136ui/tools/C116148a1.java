package com.tencent.p014mm.p136ui.tools;

import bh3.C113177k;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.tencent.mm.ui.tools.a1 */
public class C116148a1 implements C113177k.C113181e {

    /* renamed from: a */
    public final /* synthetic */ MultiStageCitySelectUI f348601a;

    public C116148a1(MultiStageCitySelectUI multiStageCitySelectUI) {
        this.f348601a = multiStageCitySelectUI;
    }

    public void onOp(Boolean bool) {
        if (bool.booleanValue()) {
            this.f348601a.onBusinessPermissionGranted(FirebaseAnalytics.C113379b.LOCATION);
        } else {
            this.f348601a.onBusinessPermissionDenied(FirebaseAnalytics.C113379b.LOCATION);
        }
    }
}
