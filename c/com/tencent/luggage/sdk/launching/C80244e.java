package com.tencent.luggage.sdk.launching;

/* renamed from: com.tencent.luggage.sdk.launching.e */
public final class C80244e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 f234923d;

    public C80244e(OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1) {
        this.f234923d = onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1;
    }

    public final void run() {
        this.f234923d.dead();
    }
}
