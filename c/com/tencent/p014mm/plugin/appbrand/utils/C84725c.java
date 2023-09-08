package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.c */
public final class C84725c implements C84796y0 {

    /* renamed from: e */
    public static final C84725c f247120e = new C84725c();

    /* renamed from: d */
    public final /* synthetic */ C84796y0 f247121d;

    public C84725c() {
        C84796y0 y0Var = (C84796y0) C89909e.m112436a(C84796y0.class);
        this.f247121d = y0Var == null ? C84729d.f247128d : y0Var;
    }

    /* renamed from: Q9 */
    public MvvmObserverOwner<IMvvmObserver<Boolean>, Boolean> mo117450Q9() {
        return this.f247121d.mo117450Q9();
    }

    public boolean isEnable() {
        return this.f247121d.isEnable();
    }
}
