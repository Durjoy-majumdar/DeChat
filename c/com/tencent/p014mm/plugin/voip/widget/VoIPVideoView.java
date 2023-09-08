package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoIPVideoView */
public class VoIPVideoView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: h */
    public Paint f164675h;

    public VoIPVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo81202E();
    }

    /* renamed from: E */
    public final void mo81202E() {
        Paint paint = new Paint();
        this.f164675h = paint;
        paint.setColor(-16777216);
        this.f164675h.setFilterBitmap(true);
        this.f164675h.setTextSize(40.0f);
        setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(surfaceTexture != null);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        Log.m105925i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureAvailable %b %d %d", objArr);
        mo82024B();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (surfaceTexture == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureDestroyed %b", objArr);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(surfaceTexture != null);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        Log.m105925i("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureSizeChanged %b %d %d", objArr);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (surfaceTexture == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.VoIP.VoIPVideoView", "onSurfaceTextureUpdated %b", objArr);
    }

    public VoIPVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo81202E();
    }
}
