package com.tencent.p014mm.media.camera.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i80.C108401d;
import kotlin.Metadata;
import v70.C111407t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitTextureView;", "Landroid/view/TextureView;", "Li80/d;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lv70/t;", "kit", "Lrx3/b0;", "setCameraKitEnv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitTextureView */
public final class CameraKitTextureView extends TextureView implements C108401d, TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public C111407t f310704d;

    /* renamed from: e */
    public SurfaceTexture f310705e;

    /* renamed from: f */
    public int f310706f;

    /* renamed from: g */
    public int f310707g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraKitTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.Camera.CameraKitTextureView", '[' + hashCode() + "]onSurfaceTextureAvailable");
        C111407t tVar = this.f310704d;
        if (tVar != null) {
            tVar.mo163068j(surfaceTexture, (Integer) null, (Integer) null);
        }
        C111407t tVar2 = this.f310704d;
        if (tVar2 != null) {
            tVar2.mo163066c(i, i2);
        }
        this.f310705e = surfaceTexture;
        this.f310706f = i;
        this.f310707g = i2;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.Camera.CameraKitTextureView", '[' + hashCode() + "]onSurfaceTextureDestroyed");
        C111407t tVar = this.f310704d;
        if (tVar != null) {
            tVar.mo163067h();
        }
        this.f310705e = null;
        this.f310706f = 0;
        this.f310707g = 0;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.Camera.CameraKitTextureView", '[' + hashCode() + "]onSurfaceTextureSizeChanged");
        C111407t tVar = this.f310704d;
        if (tVar != null) {
            tVar.mo163066c(i, i2);
        }
        this.f310706f = i;
        this.f310707g = i2;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public void setCameraKitEnv(C111407t tVar) {
        this.f310704d = tVar;
        SurfaceTexture surfaceTexture = this.f310705e;
        if (surfaceTexture != null && tVar != null) {
            tVar.mo163068j(surfaceTexture, Integer.valueOf(this.f310706f), Integer.valueOf(this.f310707g));
        }
    }
}
