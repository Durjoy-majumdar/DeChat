package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import p564iq.C87790d;
import ui3.C90664c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.n3 */
public class C83393n3 implements C87790d.C33382a {

    /* renamed from: a */
    public final /* synthetic */ m3$$b f243661a;

    /* renamed from: b */
    public final /* synthetic */ C83385m3 f243662b;

    public C83393n3(C83385m3 m3Var, m3$$b m3__b) {
        this.f243662b = m3Var;
        this.f243661a = m3__b;
    }

    /* renamed from: a */
    public void mo55610a(C90664c cVar) {
        Log.m105924i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "expansions file is ready.");
        this.f243662b.mo115657b(this.f243661a);
    }
}
