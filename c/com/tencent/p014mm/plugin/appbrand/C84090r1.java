package com.tencent.p014mm.plugin.appbrand;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.r1 */
public class C84090r1 {

    /* renamed from: a */
    public final AtomicBoolean f245504a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f245505b = new AtomicBoolean(false);

    /* renamed from: c */
    public final AppBrandRuntimeWC f245506c;

    /* renamed from: d */
    public final Runnable f245507d;

    public C84090r1(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f245506c = appBrandRuntimeWC;
        this.f245507d = new r1$$a(this, appBrandRuntimeWC);
    }
}
