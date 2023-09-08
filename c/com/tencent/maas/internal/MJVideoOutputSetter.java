package com.tencent.maas.internal;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public interface MJVideoOutputSetter {
    void notifySurfaceChanged(int i, int i2, int i3);

    void setRenderView(SurfaceView surfaceView);

    void setSurface(Surface surface);

    void setSurfaceHolder(SurfaceHolder surfaceHolder);
}
