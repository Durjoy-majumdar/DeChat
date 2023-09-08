package com.tencent.tav.decoder;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.logger.Logger;
import java.lang.reflect.Field;

public class VideoTexture implements SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "VideoTexture";
    private Filter copyFilter;
    private VideoCropInfo cropInfo;
    private boolean frameAvailable;
    private final Object frameSyncObject;
    private int preferRotation;
    private boolean quitFlag;
    private RenderContext renderContext;
    private SurfaceTexture surfaceTexture;
    private TextureInfo textureInfo;
    private Matrix textureMatrix;
    private int textureType;

    public VideoTexture(TextureInfo textureInfo2) {
        this.frameSyncObject = new Object();
        this.quitFlag = false;
        this.preferRotation = 0;
        this.textureInfo = textureInfo2;
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(textureInfo2.textureID);
        this.surfaceTexture = surfaceTexture2;
        surfaceTexture2.setOnFrameAvailableListener(this, new Handler(Looper.getMainLooper()));
        this.surfaceTexture.getTransformMatrix(new float[16]);
        this.preferRotation = 0;
    }

    private Matrix getTextureMatrix(SurfaceTexture surfaceTexture2, int i) {
        int i2 = i;
        float[] fArr = new float[16];
        surfaceTexture2.getTransformMatrix(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        float f3 = fArr[12];
        float f4 = fArr[1];
        float f5 = fArr[5];
        float f6 = fArr[13];
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        if (i2 != 0) {
            DecoderUtils.getRotationMatrix(matrix2, i2, 1.0f, 1.0f);
        }
        if (((float) ((int) f)) == f && ((float) ((int) f4)) == f4 && ((float) ((int) f2)) == f2 && ((float) ((int) f5)) == f5) {
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            if (i2 != 0) {
                matrix.preConcat(matrix2);
            }
        } else {
            matrix.setValues(new float[]{f, f2, f3, f4, f5, f6, 0.0f, 0.0f, 1.0f});
        }
        if (i2 != 0) {
            Matrix matrix3 = new Matrix();
            matrix2.invert(matrix3);
            matrix.postConcat(matrix3);
        }
        return matrix;
    }

    private boolean isIdentity() {
        Matrix matrix = this.textureMatrix;
        return matrix == null || matrix.isIdentity();
    }

    private boolean isOES() {
        return this.textureType == 36197;
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
                Object newInstance = cls.getConstructor(new Class[]{SurfaceTexture.class, Looper.class}).newInstance(new Object[]{this.surfaceTexture, Looper.getMainLooper()});
                Field declaredField = this.surfaceTexture.getClass().getDeclaredField("mEventHandler");
                declaredField.setAccessible(true);
                declaredField.set(this.surfaceTexture, newInstance);
            } catch (Exception e) {
                Logger.m144644e(TAG, "reflectLooper", (Throwable) e);
            }
        }
    }

    private void releaseFilter() {
        Filter filter = this.copyFilter;
        if (filter != null) {
            filter.release();
        }
    }

    private void releaseTextureInfo() {
        TextureInfo textureInfo2 = this.textureInfo;
        if (textureInfo2 != null) {
            textureInfo2.release();
            this.textureInfo = null;
        }
    }

    public boolean awaitNewImage() {
        return awaitNewImage(3000);
    }

    public TextureInfo copyTexture() {
        if (this.copyFilter == null) {
            Filter filter = new Filter();
            this.copyFilter = filter;
            filter.setRendererWidth(this.renderContext.width());
            this.copyFilter.setRendererHeight(this.renderContext.height());
            this.copyFilter.setRenderForScreen(false);
        }
        Filter filter2 = this.copyFilter;
        TextureInfo textureInfo2 = this.textureInfo;
        return filter2.applyFilter(textureInfo2, (Matrix) null, textureInfo2.getTextureMatrix());
    }

    public VideoCropInfo getCropInfo() {
        return this.cropInfo;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public RenderContext getRenderContext() {
        return this.renderContext;
    }

    public TextureInfo getTextureInfo() {
        return this.textureInfo;
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

    public void quitIfWaiting() {
        synchronized (this.frameSyncObject) {
            this.quitFlag = true;
            this.frameSyncObject.notifyAll();
        }
    }

    public void release() {
        releaseTextureInfo();
        releaseSurfaceTexture();
        releaseFilter();
    }

    public void releaseSurfaceTexture() {
        SurfaceTexture surfaceTexture2 = this.surfaceTexture;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.surfaceTexture = null;
        }
    }

    public void setCropInfo(VideoCropInfo videoCropInfo) {
        this.cropInfo = videoCropInfo;
        if (videoCropInfo != null && videoCropInfo.width > 0 && videoCropInfo.height > 0) {
            TextureInfo textureInfo2 = this.textureInfo;
            this.textureInfo = new TextureInfo(textureInfo2.textureID, textureInfo2.textureType, videoCropInfo.width, videoCropInfo.height, (Matrix) null, textureInfo2.preferRotation);
        }
    }

    public void setRenderContext(RenderContext renderContext2) {
        this.renderContext = renderContext2;
    }

    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public Matrix surfaceTextureMatrix() {
        if (isIdentity() && isOES()) {
            this.textureMatrix = getTextureMatrix(this.surfaceTexture, this.preferRotation);
        }
        return this.textureMatrix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r4.quitFlag == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        r4.quitFlag = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        com.tencent.tav.decoder.RenderContext.checkEglError("before updateTexImage");
        r4.surfaceTexture.updateTexImage();
        r4.textureInfo.setTextureMatrix(getTextureMatrix(r4.surfaceTexture, r4.preferRotation));
        r5 = r4.cropInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if ((r5.cropRight - r5.cropLeft) != r5.width) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if ((r5.cropBottom - r5.cropTop) == r5.height) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r5 = r4.textureInfo;
        r0 = r4.cropInfo;
        r5.setTextureRect(new android.graphics.Rect(r0.cropLeft, r0.cropTop, r0.cropRight, r0.cropBottom));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0011 A[LOOP:0: B:2:0x0011->B:33:0x0011, LOOP_START, PHI: r5 
      PHI: (r5v7 int) = (r5v6 int), (r5v20 int) binds: [B:1:0x0010, B:33:0x0011] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean awaitNewImage(long r5) {
        /*
            r4 = this;
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r6
            r6 = 1112014848(0x42480000, float:50.0)
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            java.lang.Object r6 = r4.frameSyncObject
            monitor-enter(r6)
        L_0x0011:
            boolean r0 = r4.frameAvailable     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r4.quitFlag     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0025
            if (r5 <= 0) goto L_0x0025
            int r5 = r5 + -1
            java.lang.Object r0 = r4.frameSyncObject     // Catch:{ InterruptedException -> 0x0011 }
            r1 = 50
            r0.wait(r1)     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0011
        L_0x0025:
            r0 = 0
            r4.frameAvailable = r0     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x002c
            monitor-exit(r6)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x002c:
            monitor-exit(r6)     // Catch:{ all -> 0x0077 }
            boolean r5 = r4.quitFlag
            if (r5 == 0) goto L_0x0034
            r4.quitFlag = r0
            return r0
        L_0x0034:
            java.lang.String r5 = "before updateTexImage"
            com.tencent.tav.decoder.RenderContext.checkEglError(r5)
            android.graphics.SurfaceTexture r5 = r4.surfaceTexture
            r5.updateTexImage()
            android.graphics.SurfaceTexture r5 = r4.surfaceTexture
            int r6 = r4.preferRotation
            android.graphics.Matrix r5 = r4.getTextureMatrix(r5, r6)
            com.tencent.tav.coremedia.TextureInfo r6 = r4.textureInfo
            r6.setTextureMatrix(r5)
            com.tencent.tav.decoder.VideoCropInfo r5 = r4.cropInfo
            if (r5 == 0) goto L_0x0075
            int r6 = r5.cropRight
            int r0 = r5.cropLeft
            int r6 = r6 - r0
            int r0 = r5.width
            if (r6 != r0) goto L_0x0061
            int r6 = r5.cropBottom
            int r0 = r5.cropTop
            int r6 = r6 - r0
            int r5 = r5.height
            if (r6 == r5) goto L_0x0075
        L_0x0061:
            com.tencent.tav.coremedia.TextureInfo r5 = r4.textureInfo
            android.graphics.Rect r6 = new android.graphics.Rect
            com.tencent.tav.decoder.VideoCropInfo r0 = r4.cropInfo
            int r1 = r0.cropLeft
            int r2 = r0.cropTop
            int r3 = r0.cropRight
            int r0 = r0.cropBottom
            r6.<init>(r1, r2, r3, r0)
            r5.setTextureRect(r6)
        L_0x0075:
            r5 = 1
            return r5
        L_0x0077:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0077 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoTexture.awaitNewImage(long):boolean");
    }

    public VideoTexture(int i, int i2) {
        this(i, i2, 36197, 0);
    }

    public VideoTexture(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, RenderContext.createTexture(i3));
    }

    public VideoTexture(int i, int i2, int i3, int i4, int i5) {
        this.frameSyncObject = new Object();
        this.quitFlag = false;
        this.preferRotation = 0;
        this.textureType = i3;
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(i5);
        this.surfaceTexture = surfaceTexture2;
        surfaceTexture2.setOnFrameAvailableListener(this, new Handler(Looper.getMainLooper()));
        this.textureInfo = new TextureInfo(i5, i3, i, i2, (Matrix) null, i4);
        this.preferRotation = i4;
    }
}
