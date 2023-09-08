package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.s$$b */
public class s$$b implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ LaunchParcel f243814d;

    public s$$b(LaunchParcel launchParcel) {
        this.f243814d = launchParcel;
    }

    public Object invoke() {
        String str = this.f243814d.f243731e;
        return Util.isNullOrNil(str) ? C81661j.m100180e(this.f243814d.f243730d) : str;
    }
}
