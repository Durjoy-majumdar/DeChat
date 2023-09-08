package com.tencent.p014mm.plugin.nearlife.p084ui;

import bh3.C113177k;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.b */
public class C115615b implements C113177k.C113181e {

    /* renamed from: a */
    public final /* synthetic */ BaseLifeUI f346827a;

    public C115615b(BaseLifeUI baseLifeUI) {
        this.f346827a = baseLifeUI;
    }

    public void onOp(Boolean bool) {
        if (bool.booleanValue()) {
            this.f346827a.onBusinessPermissionGranted(FirebaseAnalytics.C113379b.LOCATION);
        } else {
            this.f346827a.onBusinessPermissionDenied(FirebaseAnalytics.C113379b.LOCATION);
        }
    }
}
