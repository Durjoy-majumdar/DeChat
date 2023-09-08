package com.tencent.p014mm.plugin.appbrand.task;

import fy3.C32227p;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.task.h */
public final class C29644h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f80579d;

    /* renamed from: e */
    public final /* synthetic */ int f80580e;

    public C29644h(int i, int i2) {
        this.f80579d = i;
        this.f80580e = i2;
    }

    public final void run() {
        List<C32227p<Integer, Integer, C13598b0>> list = C84281e.f246150a;
        int i = this.f80579d;
        int i2 = this.f80580e;
        for (C32227p invoke : list) {
            invoke.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
