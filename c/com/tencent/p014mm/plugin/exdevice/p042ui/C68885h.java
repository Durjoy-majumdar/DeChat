package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectedRouterActivateStateUI;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.h */
public class C68885h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f197964d;

    /* renamed from: e */
    public final /* synthetic */ int f197965e;

    /* renamed from: f */
    public final /* synthetic */ ExdeviceConnectedRouterActivateStateUI.C68881a f197966f;

    public C68885h(ExdeviceConnectedRouterActivateStateUI.C68881a aVar, int i, int i2) {
        this.f197966f = aVar;
        this.f197964d = i;
        this.f197965e = i2;
    }

    public void run() {
        int i;
        int i2 = this.f197964d;
        if (i2 == 0 && ((i = this.f197965e) == 0 || i == 4)) {
            ExdeviceConnectedRouterActivateStateUI.this.mo94758I7(2);
        } else if (this.f197965e != 4) {
            ExdeviceConnectedRouterActivateStateUI.this.mo94758I7(4);
        } else if (i2 == 90000) {
            ExdeviceConnectedRouterActivateStateUI.this.mo94758I7(3);
        } else {
            ExdeviceConnectedRouterActivateStateUI.this.mo94758I7(5);
        }
    }
}
