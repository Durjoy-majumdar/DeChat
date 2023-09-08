package com.tencent.p014mm.plugin.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import u13.C111104b;

/* renamed from: com.tencent.mm.plugin.video.ObservableTextureView */
public class ObservableTextureView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: h */
    public C111104b f316400h;

    /* renamed from: i */
    public boolean f316401i = false;

    public ObservableTextureView(Context context) {
        super(context);
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    public boolean isAvailable() {
        return this.f316401i;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
        mo82024B();
        this.f316401i = true;
        C111104b bVar = this.f316400h;
        if (bVar != null) {
            bVar.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
        this.f316401i = false;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105918d("MicroMsg.ObservableTextureView", "onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setTextureChangeCallback(C111104b bVar) {
        this.f316400h = bVar;
    }

    public ObservableTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    public ObservableTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
