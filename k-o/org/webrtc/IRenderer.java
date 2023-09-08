package org.webrtc;

import android.graphics.Bitmap;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

public interface IRenderer {

    public interface OnCaptureListener {
        void onCapture(Bitmap bitmap);
    }

    EglRenderer.OnFrameInGLEnv getFrameWithGLCallback();

    void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents);

    void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer);

    void requestCaptureOnce(OnCaptureListener onCaptureListener);

    void setFrameWithGLCallback(EglRenderer.OnFrameInGLEnv onFrameInGLEnv);
}
