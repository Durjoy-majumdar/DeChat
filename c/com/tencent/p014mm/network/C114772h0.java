package com.tencent.p014mm.network;

import com.tencent.mars.p468mm.MMLogic;

/* renamed from: com.tencent.mm.network.h0 */
public class C114772h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f344147d;

    /* renamed from: e */
    public final /* synthetic */ int f344148e;

    /* renamed from: f */
    public final /* synthetic */ C114776i0 f344149f;

    public C114772h0(C114776i0 i0Var, int i, int i2) {
        this.f344149f = i0Var;
        this.f344147d = i;
        this.f344148e = i2;
    }

    public void run() {
        MMLogic.reportCGIServerError(this.f344147d, this.f344148e);
    }
}
