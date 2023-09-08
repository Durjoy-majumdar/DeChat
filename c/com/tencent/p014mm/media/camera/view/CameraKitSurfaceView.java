package com.tencent.p014mm.media.camera.view;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i80.C108401d;
import kotlin.Metadata;
import v70.C111407t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitSurfaceView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Li80/d;", "Lv70/t;", "kit", "Lrx3/b0;", "setCameraKitEnv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitSurfaceView */
public final class CameraKitSurfaceView extends SurfaceView implements SurfaceHolder.Callback, C108401d {

    /* renamed from: d */
    public C111407t f310700d;

    /* renamed from: e */
    public Surface f310701e;

    /* renamed from: f */
    public int f310702f;

    /* renamed from: g */
    public int f310703g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CameraKitSurfaceView(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            r1.<init>(r2, r3)
            android.view.SurfaceHolder r2 = r1.getHolder()
            r2.addCallback(r1)
            android.view.SurfaceHolder r2 = r1.getHolder()     // Catch:{ Exception -> 0x0018 }
            r3 = 2
            r2.setType(r3)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0029
        L_0x0018:
            android.view.SurfaceHolder r2 = r1.getHolder()     // Catch:{ Exception -> 0x0021 }
            r3 = 1
            r2.setType(r3)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            android.view.SurfaceHolder r2 = r1.getHolder()     // Catch:{ Exception -> 0x0029 }
            r3 = 0
            r2.setType(r3)     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            java.lang.String r2 = "MicroMsg.Camera.CameraKitSurfaceView"
            java.lang.String r3 = "CameraKitSurfaceView create"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.media.camera.view.CameraKitSurfaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void setCameraKitEnv(C111407t tVar) {
        this.f310700d = tVar;
        Surface surface = this.f310701e;
        if (surface != null && tVar != null) {
            tVar.mo163069o(surface, Integer.valueOf(this.f310702f), Integer.valueOf(this.f310703g));
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C87412m.m108594g(surfaceHolder, "holder");
        Log.m105924i("MicroMsg.Camera.CameraKitSurfaceView", '[' + hashCode() + "]surfaceChanged width:" + i2 + " height:" + i3);
        C111407t tVar = this.f310700d;
        if (tVar != null) {
            tVar.mo163066c(i2, i3);
        }
        this.f310702f = i2;
        this.f310703g = i3;
        setBackgroundColor(0);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C87412m.m108594g(surfaceHolder, "holder");
        Log.m105924i("MicroMsg.Camera.CameraKitSurfaceView", '[' + hashCode() + "]surfaceCreated");
        C111407t tVar = this.f310700d;
        if (tVar != null) {
            Surface surface = surfaceHolder.getSurface();
            C87412m.m108593f(surface, "holder.surface");
            tVar.mo163069o(surface, (Integer) null, (Integer) null);
        }
        this.f310701e = surfaceHolder.getSurface();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C87412m.m108594g(surfaceHolder, "holder");
        Log.m105924i("MicroMsg.Camera.CameraKitSurfaceView", '[' + hashCode() + "]surfaceDestroyed");
        C111407t tVar = this.f310700d;
        if (tVar != null) {
            tVar.mo163067h();
        }
        this.f310701e = null;
        this.f310702f = 0;
        this.f310703g = 0;
        setBackgroundColor(-16777216);
    }
}
