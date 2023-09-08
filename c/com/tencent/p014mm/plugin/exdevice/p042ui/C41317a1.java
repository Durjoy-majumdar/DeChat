package com.tencent.p014mm.plugin.exdevice.p042ui;

import t71.C48547j;
import te3.C49971jb2;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.a1 */
public class C41317a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48547j f111290d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceRankInfoUI f111291e;

    public C41317a1(ExdeviceRankInfoUI exdeviceRankInfoUI, C48547j jVar) {
        this.f111291e = exdeviceRankInfoUI;
        this.f111290d = jVar;
    }

    public void run() {
        ExdeviceRankInfoUI exdeviceRankInfoUI = this.f111291e;
        exdeviceRankInfoUI.f111235e.f111365e = exdeviceRankInfoUI.f111252y;
        if (this.f111290d.mo72130j1() != null) {
            this.f111291e.f111230M = ((C49971jb2) this.f111290d.mo72130j1()).f135995w;
            ExdeviceRankInfoUI exdeviceRankInfoUI2 = this.f111291e;
            exdeviceRankInfoUI2.f111235e.mo64440g(exdeviceRankInfoUI2.f111230M);
        }
        this.f111291e.f111235e.notifyDataSetChanged();
        ExdeviceRankInfoUI.m44689H7(this.f111291e);
    }
}
