package h43;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: h43.w */
public final class C108122w implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C108117v f323763d;

    /* renamed from: e */
    public final /* synthetic */ C110194c f323764e;

    /* renamed from: h43.w$a */
    public static final class C108123a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f323765d;

        /* renamed from: e */
        public final /* synthetic */ C108117v f323766e;

        /* renamed from: f */
        public final /* synthetic */ C110194c f323767f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108123a(SurfaceTexture surfaceTexture, C108117v vVar, C110194c cVar) {
            super(0);
            this.f323765d = surfaceTexture;
            this.f323766e = vVar;
            this.f323767f = cVar;
        }

        public Object invoke() {
            try {
                this.f323765d.updateTexImage();
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.RemoteWindowSurfaceRenderer", "error happened in update tex image");
            }
            C108109r0 r0Var = this.f323766e.f323617j;
            if (r0Var != null) {
                r0Var.mo158478B(1);
            }
            C108109r0 r0Var2 = this.f323766e.f323617j;
            if (r0Var2 != null) {
                r0Var2.mo143262q(90);
            }
            C108109r0 r0Var3 = this.f323766e.f323617j;
            if (r0Var3 != null) {
                r0Var3.mo158479j(false);
            }
            this.f323766e.mo158485h(this.f323767f);
            return C13598b0.f38549a;
        }
    }

    public C108122w(C108117v vVar, C110194c cVar) {
        this.f323763d = vVar;
        this.f323764e = cVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C108117v vVar = this.f323763d;
        vVar.mo158464d(new C108123a(surfaceTexture, vVar, this.f323764e));
    }
}
