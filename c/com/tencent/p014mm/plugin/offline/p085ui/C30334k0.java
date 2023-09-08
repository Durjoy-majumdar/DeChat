package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.autogen.events.SyncOfflineTokenEvent;
import com.tencent.p014mm.plugin.offline.C69963m;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.offline.ui.k0 */
public class C30334k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SyncOfflineTokenEvent f81876d;

    /* renamed from: e */
    public final /* synthetic */ boolean f81877e;

    public C30334k0(C30335l0 l0Var, SyncOfflineTokenEvent syncOfflineTokenEvent, boolean z) {
        this.f81876d = syncOfflineTokenEvent;
        this.f81877e = z;
    }

    public void run() {
        if (C86709a0.m107522a()) {
            this.f81876d.f79021d.getClass();
            C69963m.wx0().Bx0().mo96270e(this.f81877e);
        }
    }
}
