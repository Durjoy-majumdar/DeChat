package io0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import gy3.C87412m;

/* renamed from: io0.j */
public final class C33373j implements PhoneStatusWatcher.PhoneCallListener {

    /* renamed from: a */
    public final Runnable f90439a;

    /* renamed from: b */
    public final Runnable f90440b;

    public C33373j(Runnable runnable, Runnable runnable2) {
        C87412m.m108594g(runnable, "onBusy");
        C87412m.m108594g(runnable2, "onIdle");
        this.f90439a = runnable;
        this.f90440b = runnable2;
    }

    public void onPhoneCall(int i) {
        Log.m105924i("MicroMsg.CallStateListener", "onPhoneCall, state: " + i);
        if (i == 0) {
            this.f90440b.run();
        } else if (i == 1 || i == 2) {
            this.f90439a.run();
        }
    }
}
