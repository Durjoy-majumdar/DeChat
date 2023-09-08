package com.tencent.p014mm.plugin.voip_cs.p845ui.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip_cs.ui.widget.VoipCSVideoView */
public class VoipCSVideoView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: h */
    public int f164677h;

    /* renamed from: i */
    public int f164678i;

    /* renamed from: j */
    public Paint f164679j;

    public VoipCSVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo81207E();
    }

    /* renamed from: E */
    public final void mo81207E() {
        Paint paint = new Paint();
        this.f164679j = paint;
        paint.setColor(-16777216);
        this.f164679j.setFilterBitmap(true);
        this.f164679j.setTextSize(40.0f);
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
        }
    }

    public int getIndex() {
        return this.f164677h;
    }

    public int getPosition() {
        return this.f164678i;
    }

    public String getUsername() {
        return null;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = null;
        if (surfaceTexture != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i2);
        Log.m105925i("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureAvailable %s %b %d %d", objArr);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Object[] objArr = new Object[2];
        objArr[0] = null;
        objArr[1] = Boolean.valueOf(surfaceTexture != null);
        Log.m105925i("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureDestroyed %s %b", objArr);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = null;
        if (surfaceTexture != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i2);
        Log.m105925i("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureSizeChanged %s %b %d %d", objArr);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = null;
        if (surfaceTexture != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.cs.VoipCSVideoView", "onSurfaceTextureUpdated %s %b", objArr);
    }

    public void setIndex(int i) {
        this.f164677h = i;
    }

    public void setPosition(int i) {
        this.f164678i = i;
    }

    public VoipCSVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo81207E();
    }
}
