package com.tencent.p014mm.plugin.appbrand.launching;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.o3 */
public class C83400o3 implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ Future f243688d;

    /* renamed from: e */
    public final /* synthetic */ m3$$b f243689e;

    /* renamed from: f */
    public final /* synthetic */ C83385m3 f243690f;

    public C83400o3(C83385m3 m3Var, Future future, m3$$b m3__b) {
        this.f243690f = m3Var;
        this.f243688d = future;
        this.f243689e = m3__b;
    }

    public Object call() {
        try {
            this.f243688d.get(10000, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            C83385m3.m102323a(this.f243690f, this.f243689e, true);
            return null;
        }
    }
}
