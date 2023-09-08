package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    public static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] dstPoints = new float[6];
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final YuvUploader yuvUploader = new YuvUploader((C218651) null);

    /* renamed from: org.webrtc.VideoFrameDrawer$1 */
    public static /* synthetic */ class C218651 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r0
                org.webrtc.VideoFrame$TextureBuffer$Type r1 = org.webrtc.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.VideoFrame$TextureBuffer$Type r1 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoFrameDrawer.C218651.<clinit>():void");
        }
    }

    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public /* synthetic */ YuvUploader(C218651 r1) {
            this();
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = i / 2;
            int[] iArr2 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr3 = {i2, i4, i4};
            int i5 = 0;
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i6];
                if (i7 > i8) {
                    i5 = Math.max(i5, i8 * iArr3[i6]);
                }
            }
            if (i5 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i5)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i5);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i9 = 0; i9 < 3; i9++) {
                    this.yuvTextures[i9] = GlUtil.generateTexture(3553);
                }
            }
            for (int i15 = 0; i15 < 3; i15++) {
                GLES20.glActiveTexture(33984 + i15);
                GLES20.glBindTexture(3553, this.yuvTextures[i15]);
                int i16 = iArr[i15];
                int i17 = iArr2[i15];
                if (i16 == i17) {
                    byteBuffer = byteBufferArr[i15];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i15], i16, this.copyBuffer, i17, i17, iArr3[i15]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i15], iArr3[i15], 0, 6409, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, byteBuffer);
            }
            return this.yuvTextures;
        }
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i3 = 0; i3 < 3; i3++) {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            int i5 = i4 + 0;
            fArr[i5] = fArr[i5] * ((float) i);
            int i6 = i4 + 1;
            fArr[i6] = fArr[i6] * ((float) i2);
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        Matrix matrix3 = matrix;
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i7 = C218651.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i7 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else if (i7 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, (Matrix) null);
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i, int i2) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        VideoFrame videoFrame2 = videoFrame;
        Matrix matrix2 = matrix;
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        if (this.renderWidth <= 0 || this.renderHeight <= 0) {
            Logging.m25026w(TAG, "Illegal frame size: " + this.renderWidth + "x" + this.renderHeight);
            return;
        }
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate((float) videoFrame.getRotation());
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix2 != null) {
            this.renderMatrix.preConcat(matrix);
        }
        if (z) {
            this.lastI420Frame = null;
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4);
            return;
        }
        if (videoFrame2 != this.lastI420Frame) {
            this.lastI420Frame = videoFrame2;
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            this.yuvUploader.uploadFromBuffer(i420);
            i420.release();
        }
        glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
    }
}
