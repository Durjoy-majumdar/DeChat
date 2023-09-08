package com.tencent.p014mm.plugin.traceroute.p115ui;

import com.tencent.p014mm.plugin.traceroute.p115ui.NetworkDiagnoseAllInOneUI;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.b */
public class C115827b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f347483d;

    /* renamed from: e */
    public final /* synthetic */ NetworkDiagnoseAllInOneUI.C1158191 f347484e;

    public C115827b(NetworkDiagnoseAllInOneUI.C1158191 r1, int i) {
        this.f347484e = r1;
        this.f347483d = i;
    }

    public void run() {
        NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = NetworkDiagnoseAllInOneUI.this;
        networkDiagnoseAllInOneUI.f347458d = this.f347483d;
        networkDiagnoseAllInOneUI.mo176313H7();
    }
}
