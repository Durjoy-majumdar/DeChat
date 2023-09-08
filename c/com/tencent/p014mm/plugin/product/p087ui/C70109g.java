package com.tencent.p014mm.plugin.product.p087ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.product.ui.g */
public class C70109g {

    /* renamed from: a */
    public int f202384a;

    /* renamed from: b */
    public int f202385b;

    public C70109g(int i, int i2) {
        this.f202385b = i;
        this.f202384a = i2;
    }

    /* renamed from: a */
    public boolean mo96502a() {
        boolean z = true;
        if ((this.f202385b & 1) <= 0) {
            z = false;
        }
        Log.m105918d("MicroMsg.MallProductConfig", "isFreePost, ret = " + z);
        return z;
    }
}
