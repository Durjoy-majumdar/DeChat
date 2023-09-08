package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.e0 */
public final class C29735e0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f80740d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f80741e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29735e0(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f80740d = multiProcessMMKV;
        this.f80741e = bizTestUI;
    }

    public Object invoke() {
        this.f80740d.putBoolean("preload_tmpl_always_check_tmpl_ver", true);
        C76879j.m92726T(this.f80741e, "enable tmpl always check");
        ((C45696d) C86709a0.m107533q(C45696d.class)).mo70972RM(90);
        return C13598b0.f38549a;
    }
}
