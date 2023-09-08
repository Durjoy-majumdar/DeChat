package vp3;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import ny3.C109824f;
import rx3.C13598b0;
import yp3.C112478a;

/* renamed from: vp3.d */
public final /* synthetic */ class C111589d extends C24563k implements C32226l<SurfaceTexture, C13598b0> {
    public C111589d(C111580c cVar) {
        super(1, cVar);
    }

    public final String getName() {
        return "onExternTextureInputUpdate";
    }

    public final C109824f getOwner() {
        return C24560g0.m30725a(C111580c.class);
    }

    public final String getSignature() {
        return "onExternTextureInputUpdate(Landroid/graphics/SurfaceTexture;)V";
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C111580c cVar = (C111580c) this.receiver;
        cVar.getClass();
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (Exception unused) {
                C112478a.m153624b(cVar.f334011t, "updateTexImage error", new Object[0]);
            }
        }
        if (!cVar.f334017z) {
            C112478a.m153625c(cVar.f334011t, "onExternTextureInputUpdate", new Object[0]);
            cVar.f334017z = true;
        }
        cVar.f334015x = (surfaceTexture != null ? surfaceTexture.getTimestamp() : 0) / ((long) 1000000);
        cVar.mo163269e(new C111591f(cVar));
        return C13598b0.f38549a;
    }
}
