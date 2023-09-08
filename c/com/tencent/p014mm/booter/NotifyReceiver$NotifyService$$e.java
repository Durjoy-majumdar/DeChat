package com.tencent.p014mm.booter;

import com.tencent.p014mm.booter.NotifyReceiver;
import di3.C86312j;
import jc3.C87948i;

/* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyService$$e */
public final /* synthetic */ class NotifyReceiver$NotifyService$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NotifyReceiver.NotifyService f237534d;

    /* renamed from: e */
    public final /* synthetic */ int f237535e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f237536f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f237537g;

    /* renamed from: h */
    public final /* synthetic */ long f237538h;

    public /* synthetic */ NotifyReceiver$NotifyService$$e(NotifyReceiver.NotifyService notifyService, int i, byte[] bArr, byte[] bArr2, long j) {
        this.f237534d = notifyService;
        this.f237535e = i;
        this.f237536f = bArr;
        this.f237537g = bArr2;
        this.f237538h = j;
    }

    public final void run() {
        NotifyReceiver.NotifyService notifyService = this.f237534d;
        int i = this.f237535e;
        byte[] bArr = this.f237536f;
        byte[] bArr2 = this.f237537g;
        long j = this.f237538h;
        notifyService.getClass();
        ((C87948i) C86312j.m106911c(C87948i.class)).ja0().mo119070W1(notifyService, i, bArr, bArr2, j);
    }
}
