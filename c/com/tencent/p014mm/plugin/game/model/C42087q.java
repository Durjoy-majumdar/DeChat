package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.model.C42091s;

/* renamed from: com.tencent.mm.plugin.game.model.q */
public class C42087q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f113387d;

    /* renamed from: e */
    public final /* synthetic */ String f113388e;

    /* renamed from: f */
    public final /* synthetic */ boolean f113389f;

    public C42087q(C42091s sVar, int i, String str, boolean z) {
        this.f113387d = i;
        this.f113388e = str;
        this.f113389f = z;
    }

    public void run() {
        synchronized (C42091s.f113397b) {
            for (C42091s.C42092a a : C42091s.f113397b) {
                a.mo66052a(this.f113387d, this.f113388e, this.f113389f);
            }
        }
    }
}
