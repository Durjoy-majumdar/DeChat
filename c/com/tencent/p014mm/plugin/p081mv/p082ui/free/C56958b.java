package com.tencent.p014mm.plugin.p081mv.p082ui.free;

import fy3.C32226l;
import gy3.C87413o;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.mv.ui.free.b */
public final class C56958b extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f163124d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvFreeMakerPreviewUI f163125e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56958b(C89779i0 i0Var, MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
        super(1);
        this.f163124d = i0Var;
        this.f163125e = musicMvFreeMakerPreviewUI;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        C61926c.m72668M(new C56957a(this.f163124d, this.f163125e));
        return C13598b0.f38549a;
    }
}
