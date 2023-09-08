package com.tencent.p014mm.booter;

import com.tencent.p014mm.booter.NotifyReceiver;
import di3.C86312j;
import jc3.C87948i;

/* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyService$$d */
public final /* synthetic */ class NotifyReceiver$NotifyService$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NotifyReceiver.NotifyService f237529d;

    /* renamed from: e */
    public final /* synthetic */ int f237530e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f237531f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f237532g;

    /* renamed from: h */
    public final /* synthetic */ long f237533h;

    public /* synthetic */ NotifyReceiver$NotifyService$$d(NotifyReceiver.NotifyService notifyService, int i, byte[] bArr, byte[] bArr2, long j) {
        this.f237529d = notifyService;
        this.f237530e = i;
        this.f237531f = bArr;
        this.f237532g = bArr2;
        this.f237533h = j;
    }

    public final void run() {
        NotifyReceiver.NotifyService notifyService = this.f237529d;
        int i = this.f237530e;
        byte[] bArr = this.f237531f;
        byte[] bArr2 = this.f237532g;
        long j = this.f237533h;
        notifyService.getClass();
        ((C87948i) C86312j.m106911c(C87948i.class)).ja0().mo119070W1(notifyService, i, bArr, bArr2, j);
    }
}
