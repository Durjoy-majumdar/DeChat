package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111141c;
import w80.C111742d;

/* renamed from: com.tencent.mm.plugin.multitalk.model.o0 */
public final class C105824o0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105834r0 f314739d;

    /* renamed from: e */
    public final /* synthetic */ int f314740e;

    /* renamed from: f */
    public final /* synthetic */ int f314741f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105824o0(C105834r0 r0Var, int i, int i2) {
        super(0);
        this.f314739d = r0Var;
        this.f314740e = i;
        this.f314741f = i2;
    }

    public Object invoke() {
        this.f314739d.f314774e = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, this.f314740e, this.f314741f, (EGLContext) null, 16, (Object) null);
        C105834r0 r0Var = this.f314739d;
        C110194c cVar = new C110194c(false, 19);
        C105834r0 r0Var2 = this.f314739d;
        SurfaceTexture surfaceTexture = new SurfaceTexture(cVar.f329652e);
        surfaceTexture.setOnFrameAvailableListener(new C105822n0(r0Var2, surfaceTexture));
        r0Var2.f314771b = surfaceTexture;
        r0Var2.f314772c = new Surface(r0Var2.f314771b);
        r0Var.f314770a = cVar;
        C105834r0 r0Var3 = this.f314739d;
        C111141c cVar2 = new C111141c(this.f314740e, this.f314741f, 0, 0, 2, 0, 44, (C8480h) null);
        cVar2.f332765t = false;
        r0Var3.f314778i = cVar2;
        return C13598b0.f38549a;
    }
}
