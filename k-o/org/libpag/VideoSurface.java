package org.libpag;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.lang.reflect.Field;

public class VideoSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static int HandlerThreadCount;
    private static final Object handlerLock = new Object();
    private static HandlerThread handlerThread;
    private boolean frameAvailable = false;
    private final Object frameSyncObject = new Object();
    private int height = 0;
    private Surface outputSurface;
    private boolean released = false;
    private int retainCount = 1;
    private SurfaceTexture surfaceTexture;
    private int width = 0;

    private static VideoSurface Make(int i, int i2) {
        VideoSurface videoSurface = new VideoSurface();
        videoSurface.width = i;
        videoSurface.height = i2;
        synchronized (handlerLock) {
            StartHandlerThread();
            if (Build.VERSION.SDK_INT >= 26) {
                videoSurface.surfaceTexture = new SurfaceTexture(false);
            } else {
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(0);
                videoSurface.surfaceTexture = surfaceTexture2;
                surfaceTexture2.detachFromGLContext();
            }
            videoSurface.surfaceTexture.setOnFrameAvailableListener(videoSurface, new Handler(handlerThread.getLooper()));
        }
        videoSurface.outputSurface = new Surface(videoSurface.surfaceTexture);
        return videoSurface;
    }

    private static synchronized void StartHandlerThread() {
        synchronized (VideoSurface.class) {
            HandlerThreadCount++;
            if (handlerThread == null) {
                HandlerThread handlerThread2 = new HandlerThread("libpag_VideoSurface");
                handlerThread = handlerThread2;
                handlerThread2.start();
            }
        }
    }

    private boolean attachToGLContext(int i) {
        try {
            this.surfaceTexture.attachToGLContext(i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void reflectLooper() {
        Class cls;
        Class[] declaredClasses = SurfaceTexture.class.getDeclaredClasses();
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls = null;
                break;
            }
            cls = declaredClasses[i];
            if (cls.getName().toLowerCase().contains("handler")) {
                break;
            }
            i++;
        }
        if (cls != null) {
            try {
                Object newInstance = cls.getConstructor(new Class[]{SurfaceTexture.class, Looper.class}).newInstance(new Object[]{this.surfaceTexture, handlerThread.getLooper()});
                Field declaredField = this.surfaceTexture.getClass().getDeclaredField("mEventHandler");
                declaredField.setAccessible(true);
                declaredField.set(this.surfaceTexture, newInstance);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean updateTexImage() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.frameSyncObject
            monitor-enter(r0)
            r1 = 10
        L_0x0005:
            boolean r2 = r5.frameAvailable     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0015
            if (r1 <= 0) goto L_0x0015
            int r1 = r1 + -1
            java.lang.Object r2 = r5.frameSyncObject     // Catch:{ InterruptedException -> 0x0005 }
            r3 = 50
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x0015:
            r2 = 0
            r5.frameAvailable = r2     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            android.graphics.SurfaceTexture r0 = r5.surfaceTexture     // Catch:{ Exception -> 0x0024 }
            r0.updateTexImage()     // Catch:{ Exception -> 0x0024 }
            r0 = 1
            return r0
        L_0x0024:
            return r2
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libpag.VideoSurface.updateTexImage():boolean");
    }

    private int videoHeight() {
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        float abs = Math.abs(fArr[5]);
        return abs > 0.0f ? Math.round(((float) this.height) / (abs + ((fArr[13] - abs) * 2.0f))) : this.height;
    }

    private int videoWidth() {
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        float abs = Math.abs(fArr[0]);
        return abs > 0.0f ? Math.round(((float) this.width) / (abs + (fArr[12] * 2.0f))) : this.width;
    }

    public Surface getOutputSurface() {
        return this.outputSurface;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
        synchronized (this.frameSyncObject) {
            if (this.frameAvailable) {
                new RuntimeException("frameAvailable already set, frame could be dropped");
                return;
            }
            this.frameAvailable = true;
            this.frameSyncObject.notifyAll();
        }
    }

    public void release() {
        int i = this.retainCount - 1;
        this.retainCount = i;
        if (!this.released && i <= 0) {
            this.released = true;
            synchronized (handlerLock) {
                int i2 = HandlerThreadCount - 1;
                HandlerThreadCount = i2;
                if (i2 == 0) {
                    handlerThread.quit();
                    handlerThread = null;
                }
            }
            Surface surface = this.outputSurface;
            if (surface != null) {
                surface.release();
                this.outputSurface = null;
            }
            SurfaceTexture surfaceTexture2 = this.surfaceTexture;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
                this.surfaceTexture = null;
            }
        }
    }

    public void retain() {
        this.retainCount++;
    }
}
