package io0;

import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import di3.C86312j;

/* renamed from: io0.i */
public final class C33372i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33373j f90438d;

    public C33372i(C33373j jVar) {
        this.f90438d = jVar;
    }

    public final void run() {
        ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).addPhoneCallListener(this.f90438d);
    }
}
