package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitalk.model.q */
public final class C105831q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105825p f314766d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f314767e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105831q(C105825p pVar, C32224a<C13598b0> aVar) {
        super(0);
        this.f314766d = pVar;
        this.f314767e = aVar;
    }

    public Object invoke() {
        C105825p pVar = this.f314766d;
        C32224a<C13598b0> aVar = this.f314767e;
        pVar.getClass();
        pVar.f314744f = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, 1, 1, (EGLContext) null, 16, (Object) null);
        C110194c cVar = new C110194c(false, 19);
        pVar.f314745g = cVar;
        SurfaceTexture surfaceTexture = new SurfaceTexture(cVar.f329652e);
        pVar.f314750o = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(C105833r.f314769d);
        ((C119157j) C119157j.f356862d).mo183895z(new C30297s(aVar));
        Log.m105924i("MicroMsg.MultiTalkCameraManager", "init create mulititalk camera PboSurfaceRender");
        return C13598b0.f38549a;
    }
}
