package g50;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: g50.d */
public class C107745d implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ C107747f f322451d;

    public C107745d(C107747f fVar) {
        this.f322451d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f322462h.getSurfaceTexture();
        r1 = r4.f322451d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r5, int r6, int r7) {
        /*
            r4 = this;
            g50.f r0 = r4.f322451d
            android.graphics.SurfaceTexture r1 = r0.f322470s
            java.lang.String r2 = "CustomRender.CustomRender"
            if (r1 == 0) goto L_0x003d
            android.view.TextureView r0 = r0.f322462h
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            g50.f r1 = r4.f322451d
            android.graphics.SurfaceTexture r3 = r1.f322470s
            if (r0 == r3) goto L_0x003d
            android.view.TextureView r0 = r1.f322462h     // Catch:{ Exception -> 0x0023 }
            r0.setSurfaceTexture(r3)     // Catch:{ Exception -> 0x0023 }
            g50.f r0 = r4.f322451d     // Catch:{ Exception -> 0x0023 }
            android.graphics.SurfaceTexture r1 = r0.f322470s     // Catch:{ Exception -> 0x0023 }
            r0.f322464j = r1     // Catch:{ Exception -> 0x0023 }
            r1 = 0
            r0.f322470s = r1     // Catch:{ Exception -> 0x0023 }
            goto L_0x0041
        L_0x0023:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "setSurfaceTexture error onSurfacetextureAvailable "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            g50.f r0 = r4.f322451d
            r0.f322464j = r5
            goto L_0x0041
        L_0x003d:
            g50.f r0 = r4.f322451d
            r0.f322464j = r5
        L_0x0041:
            g50.f r5 = r4.f322451d
            r0 = 1
            r5.f322455C = r0
            int r1 = r5.f322465n
            if (r6 != r1) goto L_0x004e
            int r1 = r5.f322466o
            if (r7 == r1) goto L_0x005d
        L_0x004e:
            r5.f322465n = r6
            r5.f322466o = r7
            g50.j r1 = r5.f322463i
            if (r1 == 0) goto L_0x005d
            int r5 = r5.f322457E
            if (r5 == r0) goto L_0x005d
            r1.mo158179e(r6, r7)
        L_0x005d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onSurfaceTextureAvailable "
            r5.append(r6)
            g50.f r6 = r4.f322451d
            int r6 = r6.f322465n
            r5.append(r6)
            java.lang.String r6 = " "
            r5.append(r6)
            g50.f r6 = r4.f322451d
            int r6 = r6.f322466o
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g50.C107745d.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C107747f fVar = this.f322451d;
        if (fVar.f322471t) {
            fVar.f322470s = surfaceTexture;
        } else {
            if (surfaceTexture == fVar.f322470s) {
                fVar.f322470s = null;
            }
            fVar.f322464j = null;
        }
        Log.m105924i("CustomRender.CustomRender", "onSurfaceTextureDestroyed");
        return this.f322451d.f322470s == null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C107747f fVar = this.f322451d;
        if (!(i == fVar.f322465n && i2 == fVar.f322466o)) {
            fVar.f322465n = i;
            fVar.f322466o = i2;
            C107752j jVar = fVar.f322463i;
            if (!(jVar == null || fVar.f322457E == 1)) {
                jVar.mo158179e(i, i2);
            }
        }
        Log.m105924i("CustomRender.CustomRender", "onSurfaceTextureSizeChanged " + this.f322451d.f322465n + " " + this.f322451d.f322466o);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
