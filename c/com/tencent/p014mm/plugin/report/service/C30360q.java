package com.tencent.p014mm.plugin.report.service;

import androidx.camera.core.FocusMeteringAction;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.report.service.q */
public class C30360q implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ Runnable f81930d;

    public C30360q(C115669n nVar, Runnable runnable) {
        this.f81930d = runnable;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0) {
            C86709a0.m107525e().postToWorkerDelayed(this.f81930d, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}
