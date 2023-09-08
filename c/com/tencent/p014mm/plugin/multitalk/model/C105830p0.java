package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111141c;
import w80.C111742d;

/* renamed from: com.tencent.mm.plugin.multitalk.model.p0 */
public final class C105830p0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105834r0 f314765d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105830p0(C105834r0 r0Var) {
        super(0);
        this.f314765d = r0Var;
    }

    public Object invoke() {
        C105834r0 r0Var = this.f314765d;
        C111141c cVar = r0Var.f314778i;
        if (cVar != null) {
            cVar.f332763r = null;
        }
        Surface surface = r0Var.f314772c;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f314765d.f314771b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        C110194c cVar2 = this.f314765d.f314770a;
        if (cVar2 != null) {
            cVar2.close();
        }
        C111141c cVar3 = this.f314765d.f314778i;
        if (cVar3 != null) {
            cVar3.mo158471l();
        }
        C111742d.C65942b bVar = this.f314765d.f314774e;
        if (bVar != null) {
            C111742d.f334647a.mo163471q(bVar);
        }
        return C13598b0.f38549a;
    }
}
