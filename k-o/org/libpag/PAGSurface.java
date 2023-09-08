package org.libpag;

import a34.C79461a;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;

public class PAGSurface {
    public long nativeSurface;
    private boolean needsReleaseSurface = false;
    private Surface surface = null;
    private int textureID = 0;

    static {
        C79461a.m96419a("pag");
        nativeInit();
    }

    private PAGSurface(long j) {
        this.nativeSurface = j;
    }

    public static PAGSurface FromSurface(Surface surface2) {
        return FromSurface(surface2, EGL14.EGL_NO_CONTEXT);
    }

    public static PAGSurface FromSurfaceTexture(SurfaceTexture surfaceTexture) {
        return FromSurfaceTexture(surfaceTexture, EGL14.EGL_NO_CONTEXT);
    }

    public static PAGSurface FromTexture(int i, int i2, int i3) {
        return FromTexture(i, i2, i3, false);
    }

    public static PAGSurface FromTextureForAsyncThread(int i, int i2, int i3) {
        return FromTextureForAsyncThread(i, i2, i3, false);
    }

    private static native long SetupFromSurfaceWithGLContext(Surface surface2, long j);

    public static native long SetupFromTexture(int i, int i2, int i3, boolean z, boolean z2);

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    public native boolean clearAll();

    public void finalize() {
        nativeFinalize();
    }

    public native void freeCache();

    public native int height();

    public native Bitmap makeSnapshot();

    public void release() {
        Surface surface2;
        if (this.needsReleaseSurface && (surface2 = this.surface) != null) {
            surface2.release();
        }
        nativeRelease();
    }

    public native void updateSize();

    public native int width();

    public static PAGSurface FromSurface(Surface surface2, EGLContext eGLContext) {
        if (surface2 == null) {
            return null;
        }
        long SetupFromSurfaceWithGLContext = SetupFromSurfaceWithGLContext(surface2, (eGLContext == null || eGLContext == EGL14.EGL_NO_CONTEXT) ? 0 : eGLContext.getNativeHandle());
        if (SetupFromSurfaceWithGLContext == 0) {
            return null;
        }
        PAGSurface pAGSurface = new PAGSurface(SetupFromSurfaceWithGLContext);
        pAGSurface.surface = surface2;
        return pAGSurface;
    }

    public static PAGSurface FromSurfaceTexture(SurfaceTexture surfaceTexture, EGLContext eGLContext) {
        if (surfaceTexture == null) {
            return null;
        }
        PAGSurface FromSurface = FromSurface(new Surface(surfaceTexture), eGLContext);
        if (FromSurface != null) {
            FromSurface.needsReleaseSurface = true;
        }
        return FromSurface;
    }

    public static PAGSurface FromTexture(int i, int i2, int i3, boolean z) {
        long SetupFromTexture = SetupFromTexture(i, i2, i3, z, false);
        if (SetupFromTexture == 0) {
            return null;
        }
        PAGSurface pAGSurface = new PAGSurface(SetupFromTexture);
        pAGSurface.textureID = i;
        return pAGSurface;
    }

    public static PAGSurface FromTextureForAsyncThread(int i, int i2, int i3, boolean z) {
        long SetupFromTexture = SetupFromTexture(i, i2, i3, z, true);
        if (SetupFromTexture == 0) {
            return null;
        }
        PAGSurface pAGSurface = new PAGSurface(SetupFromTexture);
        pAGSurface.textureID = i;
        return pAGSurface;
    }
}
