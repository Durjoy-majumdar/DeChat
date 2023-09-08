package com.tencent.p014mm.media.widget.camerarecordview.preview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView */
public class CameraObservableTextureView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: h */
    public boolean f310748h = false;

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView$a */
    public interface C92700a {
        void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2);
    }

    public CameraObservableTextureView(Context context) {
        super(context);
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    public boolean isAvailable() {
        return this.f310748h;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
        mo82024B();
        this.f310748h = true;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
        this.f310748h = false;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105918d("MicroMsg.ObservableTextureView", "onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setTextureChangeCallback(C92700a aVar) {
    }

    public CameraObservableTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
        getSurfaceTexture();
    }

    public CameraObservableTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
