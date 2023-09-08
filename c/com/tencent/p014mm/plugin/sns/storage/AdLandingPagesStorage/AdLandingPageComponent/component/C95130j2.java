package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import qs2.C101259c0;
import qs2.C101271i0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate", mo125469f = "AdLandingQRCodeBtnCompDelegate.kt", mo125470l = {174, 218}, mo125471m = "requestUrlAndImage")
/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j2 */
public final class C95130j2 extends C66704d {

    /* renamed from: d */
    public Object f276083d;

    /* renamed from: e */
    public Object f276084e;

    /* renamed from: f */
    public int f276085f;

    /* renamed from: g */
    public /* synthetic */ Object f276086g;

    /* renamed from: h */
    public final /* synthetic */ C95116i2 f276087h;

    /* renamed from: i */
    public int f276088i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95130j2(C95116i2 i2Var, C15601d<? super C95130j2> dVar) {
        super(dVar);
        this.f276087h = i2Var;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$1");
        this.f276086g = obj;
        this.f276088i |= Integer.MIN_VALUE;
        Object b = C95116i2.m120991b(this.f276087h, (String) null, (C101259c0) null, (C101271i0) null, (String) null, this);
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$1");
        return b;
    }
}
