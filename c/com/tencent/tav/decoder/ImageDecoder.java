package com.tencent.tav.decoder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.Surface;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleState;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.IDecoderTrack;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.report.AverageTimeReporter;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ImageDecoder implements IVideoDecoder {
    public static final CGSize IMAGE_DECODE_SIZE = new CGSize(720.0f, 1280.0f);
    private static final String TAG = "ImageDecoder";
    private Bitmap bitmap;
    private CMTime currentDecoderTime = CMTime.CMTimeInvalid;
    private CGSize displaySize;
    private CMTime frameDuration = new CMTime(1, 30);
    private int preferRotation = 0;
    private String sourceImagePath;
    private TextureInfo textureInfo;
    private long threadId = -1;
    private CMTimeRange timeRange;

    private void checkThread() {
        long j = this.threadId;
        if (j != -1 && j != Thread.currentThread().getId()) {
            Logger.m144644e(TAG, "线程不对，注意EGL相关的泄露问题！threadId = " + this.threadId + ", Thread.currentThread() name = " + Thread.currentThread().getName(), (Throwable) new RuntimeException());
        }
    }

    private synchronized TextureInfo createTexture() {
        TextureInfo textureInfo2 = this.textureInfo;
        if (textureInfo2 == null || textureInfo2.isReleased()) {
            if (this.bitmap == null) {
                this.bitmap = decodeBitmap(this.sourceImagePath, this.displaySize);
                this.preferRotation = readImagePreferRotation(this.sourceImagePath);
            }
            if (this.bitmap == null) {
                return null;
            }
            this.threadId = Thread.currentThread().getId();
            TextureInfo textureInfo3 = new TextureInfo(RenderContext.createTexture(3553), 3553, this.bitmap.getWidth(), this.bitmap.getHeight(), getImageTextureMatrix(), this.preferRotation);
            this.textureInfo = textureInfo3;
            GLES20.glBindTexture(3553, textureInfo3.textureID);
            GLUtils.texImage2D(3553, 0, this.bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            return this.textureInfo;
        }
        return this.textureInfo;
    }

    private Bitmap decodeBitmap(String str, CGSize cGSize) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        if (cGSize != null) {
            i = (int) (((float) options.outWidth) / cGSize.width);
        }
        options2.inSampleSize = i;
        return BitmapFactory.decodeFile(str, options2);
    }

    public static CGSize getDefaultOutputImageSize(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = (int) (((float) options.outWidth) / IMAGE_DECODE_SIZE.width);
        options2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        return readImagePreferRotation(str) % 2 == 1 ? new CGSize((float) i2, (float) i) : new CGSize((float) i, (float) i2);
    }

    private Matrix getImageTextureMatrix() {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    private static int readImagePreferRotation(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 2;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 1;
            }
            return 3;
        } catch (IOException e) {
            Logger.m144644e(TAG, "readImagePreferRotation", (Throwable) e);
            return 0;
        }
    }

    public AverageTimeReporter getDecodePerformance() {
        return null;
    }

    public long getPreReadCost() {
        return 0;
    }

    public String getSourcePath() {
        return this.sourceImagePath;
    }

    public TextureInfo getTextureInfo() {
        return this.textureInfo;
    }

    public boolean hasTrack() {
        return this.sourceImagePath != null;
    }

    public void init(String str, CGSize cGSize, IDecoderTrack.SurfaceCreator surfaceCreator) {
        this.sourceImagePath = str;
        this.displaySize = cGSize;
    }

    public boolean isLastFrameValid() {
        return true;
    }

    public CMTime nextFrameTime(CMTime cMTime) {
        return cMTime.add(this.frameDuration);
    }

    public ByteBuffer outputBuffer() {
        return null;
    }

    public Surface outputSurface() {
        return null;
    }

    public CMSampleState readSample() {
        return readSample(this.currentDecoderTime.add(this.frameDuration));
    }

    public void release() {
    }

    public synchronized void release(boolean z) {
        checkThread();
        TextureInfo textureInfo2 = this.textureInfo;
        if (textureInfo2 != null) {
            textureInfo2.release();
            this.textureInfo = null;
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.bitmap.recycle();
            this.bitmap = null;
        }
    }

    public void seekTo(CMTime cMTime) {
    }

    public void seekTo(CMTime cMTime, boolean z) {
    }

    public void start(CMTimeRange cMTimeRange) {
        start(cMTimeRange, CMTime.CMTimeZero);
    }

    public void switchFrame() {
    }

    public synchronized CMSampleState readSample(CMTime cMTime) {
        if (cMTime.bigThan(this.timeRange.getDuration())) {
            return CMSampleState.fromError(-1);
        }
        createTexture();
        return new CMSampleState(cMTime);
    }

    public void start(CMTimeRange cMTimeRange, CMTime cMTime) {
        if (cMTimeRange == null) {
            this.timeRange = new CMTimeRange(CMTime.CMTimeZero, this.frameDuration);
        } else {
            this.timeRange = new CMTimeRange(cMTimeRange.getStart(), cMTimeRange.getDuration());
        }
    }
}
