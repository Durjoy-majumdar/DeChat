package com.tencent.p014mm.plugin.finder.live;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.c */
public final class C55903c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f159287d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveViewCallback f159288e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55903c(boolean z, FinderLiveViewCallback finderLiveViewCallback) {
        super(0);
        this.f159287d = z;
        this.f159288e = finderLiveViewCallback;
    }

    public Object invoke() {
        boolean z = this.f159287d;
        if (z) {
            FinderLiveViewCallback finderLiveViewCallback = this.f159288e;
            int i = finderLiveViewCallback.f159223t.f167729f;
            if (i != 0) {
                FinderLiveViewCallback.m63696p(finderLiveViewCallback, i - 1, z);
            }
        } else {
            FinderLiveViewCallback finderLiveViewCallback2 = this.f159288e;
            FinderLiveViewCallback.m63696p(finderLiveViewCallback2, finderLiveViewCallback2.f159223t.f167729f + 1, z);
        }
        return C13598b0.f38549a;
    }
}
