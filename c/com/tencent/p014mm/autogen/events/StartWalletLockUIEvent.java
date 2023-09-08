package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartWalletLockUIEvent */
public final class StartWalletLockUIEvent extends IEvent {

    /* renamed from: d */
    public C67793a f193942d = new C67793a();

    /* renamed from: e */
    public C67794b f193943e = new C67794b();

    /* renamed from: com.tencent.mm.autogen.events.StartWalletLockUIEvent$a */
    public static final class C67793a {

        /* renamed from: a */
        public Activity f193944a;

        /* renamed from: b */
        public Intent f193945b;

        /* renamed from: c */
        public int f193946c;
    }

    /* renamed from: com.tencent.mm.autogen.events.StartWalletLockUIEvent$b */
    public static final class C67794b {

        /* renamed from: a */
        public boolean f193947a;
    }

    public StartWalletLockUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartWalletLockUIEvent)) {
            return false;
        }
        StartWalletLockUIEvent startWalletLockUIEvent = (StartWalletLockUIEvent) iEvent;
        C67793a aVar = startWalletLockUIEvent.f193942d;
        if (!C46238a.m51546a(this.f193942d.f193944a, aVar.f193944a) || !C46238a.m51546a(this.f193942d.f193945b, aVar.f193945b) || !C46238a.m51546a(Integer.valueOf(this.f193942d.f193946c), Integer.valueOf(aVar.f193946c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193943e.f193947a), Boolean.valueOf(startWalletLockUIEvent.f193943e.f193947a));
    }
}
