package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent", mo125469f = "AdLandingMusicComponent.kt", mo125470l = {800}, mo125471m = "prepareAndPlay")
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k0 */
public final class C94650k0 extends C66704d {

    /* renamed from: d */
    public Object f273879d;

    /* renamed from: e */
    public /* synthetic */ Object f273880e;

    /* renamed from: f */
    public final /* synthetic */ AdLandingMusicComponent f273881f;

    /* renamed from: g */
    public int f273882g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94650k0(AdLandingMusicComponent adLandingMusicComponent, C15601d<? super C94650k0> dVar) {
        super(dVar);
        this.f273881f = adLandingMusicComponent;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$1");
        this.f273880e = obj;
        this.f273882g |= Integer.MIN_VALUE;
        Object I = AdLandingMusicComponent.m119665I(this.f273881f, this);
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$1");
        return I;
    }
}
