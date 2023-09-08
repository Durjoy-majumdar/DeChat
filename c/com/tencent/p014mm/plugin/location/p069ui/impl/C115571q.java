package com.tencent.p014mm.plugin.location.p069ui.impl;

import bh3.C113177k;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.q */
public class C115571q implements C113177k.C113181e {

    /* renamed from: a */
    public final /* synthetic */ RealTimeLocationUI f346629a;

    public C115571q(RealTimeLocationUI realTimeLocationUI) {
        this.f346629a = realTimeLocationUI;
    }

    public void onOp(Boolean bool) {
        if (bool.booleanValue()) {
            this.f346629a.onBusinessPermissionGranted(FirebaseAnalytics.C113379b.LOCATION);
        } else {
            this.f346629a.onBusinessPermissionDenied(FirebaseAnalytics.C113379b.LOCATION);
        }
    }
}
