package m03;

import android.graphics.Rect;
import android.view.TextureView;

/* renamed from: m03.b */
public interface C61425b extends C61424a {
    /* renamed from: b */
    void mo81140b(int i, int i2);

    /* renamed from: f */
    void mo81141f(float f, float f2);

    int getScaleType();

    void reset();

    void setCropRect(Rect rect);

    void setOpaqueInfo(boolean z);

    void setScaleType(int i);

    void setTextureListenerCallback(TextureView.SurfaceTextureListener surfaceTextureListener);
}
