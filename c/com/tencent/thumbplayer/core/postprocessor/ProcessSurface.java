package com.tencent.thumbplayer.core.postprocessor;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public class ProcessSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "sifeng: ProcessSurface";
    private boolean mFrameAvailable;
    private Object mFrameSyncObject = new Object();
    private int mHeight;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private SharpenFilterGroup mTextureRender;
    private int mWidth;

    public ProcessSurface(int i, int i2, String str) {
        this.mWidth = i;
        this.mHeight = i2;
        setup(str);
    }

    private void setup(String str) {
        SharpenFilterGroup sharpenFilterGroup = new SharpenFilterGroup(str);
        this.mTextureRender = sharpenFilterGroup;
        sharpenFilterGroup.genOESTexture();
        this.mTextureRender.checkGlError("Render surface create");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureRender.getOESTextureid());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:21:0x0003, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void awaitNewImage() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mFrameSyncObject
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.mFrameAvailable     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x001b
            java.lang.Object r1 = r4.mFrameSyncObject     // Catch:{ InterruptedException -> 0x0003 }
            r2 = 16
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0003 }
            boolean r1 = r4.mFrameAvailable     // Catch:{ InterruptedException -> 0x0003 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0003
        L_0x0013:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0003 }
            java.lang.String r2 = "sifeng: Surface frame wait timed out"
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x0003 }
            throw r1     // Catch:{ InterruptedException -> 0x0003 }
        L_0x001b:
            r1 = 0
            r4.mFrameAvailable = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            com.tencent.thumbplayer.core.postprocessor.SharpenFilterGroup r0 = r4.mTextureRender
            java.lang.String r1 = "before updateTexImage"
            r0.checkGlError(r1)
            android.graphics.SurfaceTexture r0 = r4.mSurfaceTexture
            r0.updateTexImage()
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.postprocessor.ProcessSurface.awaitNewImage():void");
    }

    public void drawImage(int i, int i2, int i3, int i4, boolean z, int i5) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mTextureRender.process(this.mSurfaceTexture, i, i2, i3, i4, z, i5);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (!this.mFrameAvailable) {
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public void release() {
        this.mTextureRender.destroyBuffers();
        this.mTextureRender = null;
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
    }
}
