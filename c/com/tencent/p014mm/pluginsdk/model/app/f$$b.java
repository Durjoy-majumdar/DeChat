package com.tencent.p014mm.pluginsdk.model.app;

import java.util.HashMap;
import java.util.Set;

/* renamed from: com.tencent.mm.pluginsdk.model.app.f$$b */
public class f$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f120824d;

    /* renamed from: e */
    public final /* synthetic */ C44583u0 f120825e;

    /* renamed from: f */
    public final /* synthetic */ C44552f f120826f;

    public f$$b(C44552f fVar, int i, C44583u0 u0Var) {
        this.f120826f = fVar;
        this.f120824d = i;
        this.f120825e = u0Var;
    }

    public void run() {
        if (((HashMap) this.f120826f.f120819d).get(Integer.valueOf(this.f120824d)) != null) {
            ((Set) ((HashMap) this.f120826f.f120819d).get(Integer.valueOf(this.f120824d))).remove(this.f120825e);
        }
    }
}
