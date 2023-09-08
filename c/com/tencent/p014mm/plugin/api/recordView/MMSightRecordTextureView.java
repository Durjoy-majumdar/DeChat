package com.tencent.p014mm.plugin.api.recordView;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.api.recordView.MMSightRecordTextureView */
class MMSightRecordTextureView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: h */
    public C104726d f310973h;

    /* renamed from: i */
    public C104725c f310974i;

    public MMSightRecordTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureAvailable, surface: %s, width: %s, height: %s", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
        this.f310973h = new C104726d();
        this.f310974i = new C104725c(surfaceTexture, this.f310973h);
        this.f310973h.mo148393a(i, i2);
        this.f310974i.f310990j = true;
        this.f310974i.start();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f310974i.f310990j = false;
        try {
            this.f310974i.join();
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.MMSightRecordTextureViewImpl", e, "onSurfaceTextureDestroyed error: %s", e.getMessage());
        }
        this.f310974i = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.MMSightRecordTextureViewImpl", "onSurfaceTextureSizeChanged, surface: %s, width: %s, height: %s", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
        this.f310973h.mo148393a(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public MMSightRecordTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}
