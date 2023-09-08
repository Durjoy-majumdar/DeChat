package com.tencent.p014mm.pluginsdk.model.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.pluginsdk.model.app.g */
public class C44554g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f120828d;

    /* renamed from: e */
    public final /* synthetic */ C44583u0 f120829e;

    /* renamed from: f */
    public final /* synthetic */ C44552f f120830f;

    public C44554g(C44552f fVar, int i, C44583u0 u0Var) {
        this.f120830f = fVar;
        this.f120828d = i;
        this.f120829e = u0Var;
    }

    public void run() {
        if (!((HashMap) this.f120830f.f120819d).containsKey(Integer.valueOf(this.f120828d))) {
            ((HashMap) this.f120830f.f120819d).put(Integer.valueOf(this.f120828d), new HashSet());
        }
        if (((HashMap) this.f120830f.f120819d).get(Integer.valueOf(this.f120828d)) != null) {
            if (!((Set) ((HashMap) this.f120830f.f120819d).get(Integer.valueOf(this.f120828d))).contains(this.f120829e)) {
                ((Set) ((HashMap) this.f120830f.f120819d).get(Integer.valueOf(this.f120828d))).add(this.f120829e);
            }
        }
    }
}
