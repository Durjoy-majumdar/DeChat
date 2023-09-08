package com.tencent.p014mm.model.gdpr;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.tencent.mm.model.gdpr.MPGdprPolicyUtil$1$1 */
class MPGdprPolicyUtil$1$1 extends ResultReceiver {

    /* renamed from: d */
    public final /* synthetic */ C1291c f10387d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPGdprPolicyUtil$1$1(C1291c cVar, Handler handler) {
        super(handler);
        this.f10387d = cVar;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        this.f10387d.f10393a.mo1216a(i > 0 ? 0 : 1);
    }
}
