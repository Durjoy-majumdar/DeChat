package com.tencent.p014mm.plugin.mall.p075ui;

import com.tencent.p014mm.plugin.mall.p075ui.MallIndexOSUI;

/* renamed from: com.tencent.mm.plugin.mall.ui.n */
public class C69791n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MallIndexOSUI.C697382 f201400d;

    public C69791n(MallIndexOSUI.C697382 r1) {
        this.f201400d = r1;
    }

    public void run() {
        MallIndexOSUI mallIndexOSUI = MallIndexOSUI.this;
        if (!mallIndexOSUI.f201204D) {
            mallIndexOSUI.finish();
        }
    }
}
