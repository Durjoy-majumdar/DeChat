package com.tencent.p014mm.booter;

import di3.C86312j;
import java.util.concurrent.Callable;
import lc3.C117474c;

/* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyService$$a */
public final /* synthetic */ class NotifyReceiver$NotifyService$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ int f79250d;

    /* renamed from: e */
    public final /* synthetic */ int f79251e;

    public /* synthetic */ NotifyReceiver$NotifyService$$a(int i, int i2) {
        this.f79250d = i;
        this.f79251e = i2;
    }

    public final Object call() {
        int i = this.f79250d;
        return Integer.valueOf(((C117474c) C86312j.m106911c(C117474c.class)).yn0().mo182762f((long) i, this.f79251e, ""));
    }
}
