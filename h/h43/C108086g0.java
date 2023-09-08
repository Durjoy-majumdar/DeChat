package h43;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import gy3.C8479f0;
import gy3.C87412m;

/* renamed from: h43.g0 */
public final class C108086g0 implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<SurfaceTexture> f323676d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C108091j> f323677e;

    /* renamed from: f */
    public final /* synthetic */ C108077f0 f323678f;

    /* renamed from: g */
    public final /* synthetic */ int f323679g;

    public C108086g0(C8479f0<SurfaceTexture> f0Var, C8479f0<C108091j> f0Var2, C108077f0 f0Var3, int i) {
        this.f323676d = f0Var;
        this.f323677e = f0Var2;
        this.f323678f = f0Var3;
        this.f323679g = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r3.mo158529b((h43.C108091j) r0) == true) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "surface"
            gy3.C87412m.m108594g(r3, r0)
            gy3.f0<android.graphics.SurfaceTexture> r0 = r2.f323676d
            T r0 = r0.f27484d
            if (r0 != 0) goto L_0x0041
            gy3.f0<h43.j> r0 = r2.f323677e
            h43.j r1 = new h43.j
            r1.<init>((android.graphics.SurfaceTexture) r3, (int) r4, (int) r5)
            r0.f27484d = r1
            h43.f0 r3 = r2.f323678f
            h43.x0 r3 = r3.f323646f
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002c
            gy3.f0<h43.j> r0 = r2.f323677e
            T r0 = r0.f27484d
            gy3.C87412m.m108591d(r0)
            h43.j r0 = (h43.C108091j) r0
            boolean r3 = r3.mo158529b(r0)
            if (r3 != r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 == 0) goto L_0x0052
            h43.f0 r3 = r2.f323678f
            h43.x0 r3 = r3.f323646f
            if (r3 == 0) goto L_0x0052
            gy3.f0<h43.j> r4 = r2.f323677e
            T r4 = r4.f27484d
            h43.j r4 = (h43.C108091j) r4
            int r5 = r2.f323679g
            r3.mo158528a(r4, r5)
            goto L_0x0052
        L_0x0041:
            h43.f0 r3 = r2.f323678f
            h43.x0 r3 = r3.f323646f
            if (r3 == 0) goto L_0x0052
            gy3.f0<h43.j> r4 = r2.f323677e
            T r4 = r4.f27484d
            h43.j r4 = (h43.C108091j) r4
            int r5 = r2.f323679g
            r3.mo158528a(r4, r5)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h43.C108086g0.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        C108126x0 x0Var = this.f323678f.f323646f;
        if (x0Var == null) {
            return true;
        }
        x0Var.mo158530c((C108091j) this.f323677e.f27484d, this.f323679g);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        C108091j jVar = (C108091j) this.f323677e.f27484d;
        if (jVar != null) {
            jVar.mo158511d(0, 0, i, i2);
        }
        C108126x0 x0Var = this.f323678f.f323646f;
        if (x0Var != null) {
            x0Var.mo158531d();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }
}
