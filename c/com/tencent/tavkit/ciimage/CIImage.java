package com.tencent.tavkit.ciimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import com.tencent.tavkit.utils.C106943Utils;
import com.tencent.tavkit.utils.MathUtils;
import com.tencent.tavkit.utils.TAVBitmapUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CIImage implements Cloneable {
    private static Bitmap.Config[] SUPPORT_CONFIGS = {Bitmap.Config.ALPHA_8, Bitmap.Config.RGB_565, Bitmap.Config.ARGB_4444, Bitmap.Config.ARGB_8888};
    private final String TAG;
    private float alpha;
    private Bitmap bitmap;
    private CGRect frame;
    private boolean isHardMode;
    private final List<CIImage> overlayImages;
    private int preferRotation;
    private int rotation;
    private final CGSize size;
    private String textureCacheKey;
    private TextureInfo textureInfo;
    private Matrix transform;

    /* renamed from: com.tencent.tavkit.ciimage.CIImage$1 */
    public static /* synthetic */ class C1069211 {

        /* renamed from: $SwitchMap$com$tencent$tavkit$composition$model$TAVVideoConfiguration$TAVVideoConfigurationContentMode */
        public static final /* synthetic */ int[] f320111xaf57ace2;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.tavkit.composition.model.TAVVideoConfiguration$TAVVideoConfigurationContentMode[] r0 = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f320111xaf57ace2 = r0
                com.tencent.tavkit.composition.model.TAVVideoConfiguration$TAVVideoConfigurationContentMode r1 = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFit     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f320111xaf57ace2     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tavkit.composition.model.TAVVideoConfiguration$TAVVideoConfigurationContentMode r1 = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f320111xaf57ace2     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.tavkit.composition.model.TAVVideoConfiguration$TAVVideoConfigurationContentMode r1 = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.scaleToFit     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.ciimage.CIImage.C1069211.<clinit>():void");
        }
    }

    public CIImage(CGSize cGSize) {
        String str = "CIImage@" + Integer.toHexString(hashCode());
        this.TAG = str;
        this.overlayImages = new ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        Logger.m144648v(str, "CIImage() called with: renderSize = [" + cGSize + "]");
        this.size = cGSize;
    }

    private void addOverlayImage(CIImage cIImage) {
        synchronized (this) {
            this.overlayImages.add(cIImage);
        }
    }

    private Bitmap checkBitmapConfig(Bitmap bitmap2) {
        return Arrays.binarySearch(SUPPORT_CONFIGS, bitmap2.getConfig()) < 0 ? transcodeBitmap(bitmap2) : bitmap2;
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
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeFile(str, options2);
    }

    private Matrix getImageTextureMatrix() {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    private Bitmap transcodeBitmap(Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void applyFillInFrame(CGRect cGRect, TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        Matrix matrix = new Matrix();
        int i = C1069211.f320111xaf57ace2[tAVVideoConfigurationContentMode.ordinal()];
        if (i == 1) {
            matrix.postConcat(MathUtils.transformBySourceRectFit(getExtent(), cGRect));
            imageByApplyingTransform(matrix);
        } else if (i == 2) {
            matrix.postConcat(MathUtils.transformBySourceRectFill(getExtent(), cGRect));
            imageByApplyingTransform(matrix);
        } else if (i == 3) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(cGRect.size.width / getExtent().size.width, cGRect.size.height / getExtent().size.height);
            matrix.postConcat(matrix2);
            Matrix matrix3 = new Matrix();
            PointF pointF = cGRect.origin;
            matrix3.postTranslate(pointF.x, pointF.y);
            matrix.postConcat(matrix3);
            imageByApplyingTransform(matrix);
        }
    }

    public void applyFixInSize(CGSize cGSize, TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        if (C106943Utils.isSizeValid(cGSize)) {
            int i = C1069211.f320111xaf57ace2[tAVVideoConfigurationContentMode.ordinal()];
            CGSize sizeFit = i != 1 ? i != 2 ? i != 3 ? MathUtils.sizeFit(this.size, cGSize) : MathUtils.sizeScale(this.size, cGSize) : MathUtils.sizeFill(this.size, cGSize) : MathUtils.sizeFit(this.size, cGSize);
            Matrix matrix = new Matrix();
            float f = sizeFit.width;
            CGSize cGSize2 = this.size;
            matrix.postScale(f / cGSize2.width, sizeFit.height / cGSize2.height);
            imageByApplyingTransform(matrix);
            CGSize cGSize3 = this.size;
            cGSize3.height = sizeFit.height;
            cGSize3.width = sizeFit.width;
        }
    }

    public void applyFlip(boolean z, boolean z2) {
        if (z || z2) {
            float f = -1.0f;
            float f2 = z ? -1.0f : 1.0f;
            float f3 = 0.0f;
            float f4 = z ? this.size.width : 0.0f;
            if (!z2) {
                f = 1.0f;
            }
            if (z2) {
                f3 = this.size.height;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f2, f);
            matrix.postTranslate(f4, f3);
            imageByApplyingTransform(matrix);
        }
    }

    public void applyPreferRotation() {
        applyPreferRotation(0);
    }

    @Deprecated
    public Bitmap convertToBitmap() {
        return TAVGLUtils.saveBitmap(this);
    }

    public void draw(TextureFilter textureFilter) {
        TextureInfo drawTextureInfo = getDrawTextureInfo();
        if (drawTextureInfo != null) {
            String str = this.TAG;
            Logger.m144648v(str, "draw: with drawTexture = " + drawTextureInfo + ", filter = " + textureFilter);
            textureFilter.applyFilter(drawTextureInfo, this.transform, drawTextureInfo.getTextureMatrix(), this.alpha, this.frame);
        }
        if (!this.overlayImages.isEmpty()) {
            String str2 = this.TAG;
            Logger.m144648v(str2, "draw: with: draw overlayImages = " + this.overlayImages + ", filter = " + textureFilter);
            for (CIImage draw : this.overlayImages) {
                draw.draw(textureFilter);
            }
        }
    }

    public float getAlpha() {
        return this.alpha;
    }

    public TextureInfo getDrawTextureInfo() {
        TextureInfo textureInfo2 = this.textureInfo;
        if (textureInfo2 != null) {
            return textureInfo2;
        }
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (this.textureCacheKey == null) {
            this.textureCacheKey = String.valueOf(hashCode());
        }
        TextureInfo textureInfo3 = ThreadLocalTextureCache.getInstance().getTextureInfo(this.textureCacheKey);
        if (eglGetCurrentContext != null && textureInfo3 != null && !textureInfo3.isReleased()) {
            return textureInfo3;
        }
        if (this.bitmap == null) {
            return null;
        }
        TextureInfo textureInfo4 = new TextureInfo(RenderContext.createTexture(3553), 3553, this.bitmap.getWidth(), this.bitmap.getHeight(), getImageTextureMatrix(), this.preferRotation);
        GLES20.glBindTexture(3553, textureInfo4.textureID);
        GLUtils.texImage2D(3553, 0, this.bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        ThreadLocalTextureCache.getInstance().putTextureInfo(this.textureCacheKey, textureInfo4);
        String str = this.TAG;
        Logger.m144648v(str, "getDrawTextureInfo: bind bitmap texture, texture = " + textureInfo4 + ", eglContext = " + eglGetCurrentContext);
        if (this.isHardMode) {
            this.bitmap.recycle();
            this.bitmap = null;
            Logger.m144648v(this.TAG, "getDrawTextureInfo: isHardMode, bitmap.recycle()");
        }
        return textureInfo4;
    }

    public CGRect getExtent() {
        return new CGRect(new PointF(0.0f, 0.0f), this.size);
    }

    public CGSize getSize() {
        return this.size;
    }

    public Matrix getTransform() {
        return this.transform;
    }

    public CIImage imageApplyFillInFrame(CGRect cGRect, TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode2 = TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFit;
        applyFillInFrame(cGRect, tAVVideoConfigurationContentMode);
        return this;
    }

    public CIImage imageByApplyingTransform(Matrix matrix) {
        if (this.transform == null) {
            this.transform = new Matrix();
        }
        this.transform.postConcat(matrix);
        String str = this.TAG;
        Logger.m144648v(str, "imageByApplyingTransform() called with: in transform = [" + matrix + "], result transform = " + this.transform);
        return this;
    }

    public CIImage imageByCompositingOverImage(CIImage cIImage) {
        String str = this.TAG;
        Logger.m144648v(str, "imageByCompositingOverImage() called with: destImage = [" + cIImage + "]");
        cIImage.addOverlayImage(this);
        return cIImage;
    }

    public CIImage imageByCroppingToRect(CGRect cGRect) {
        if (!C106943Utils.isRectValid(cGRect)) {
            return this;
        }
        String str = this.TAG;
        Logger.m144648v(str, "imageByCroppingToRect: frame = [" + cGRect + "]");
        CGSize cGSize = this.size;
        CGSize cGSize2 = cGRect.size;
        cGSize.width = cGSize2.width;
        cGSize.height = cGSize2.height;
        if (this.rotation % 2 != 0) {
            PointF pointF = cGRect.origin;
            this.frame = new CGRect(pointF.y, pointF.x, cGSize2.height, cGSize2.width);
        } else {
            this.frame = cGRect.clone();
        }
        PointF pointF2 = cGRect.origin;
        if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
            Matrix matrix = new Matrix();
            matrix.postTranslate(-pointF2.x, -pointF2.y);
            imageByApplyingTransform(matrix);
        }
        return this;
    }

    public boolean isCanvasImage() {
        return this.bitmap == null && this.textureInfo == null;
    }

    public synchronized void release() {
        Logger.m144641d(this.TAG, "release() start");
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.bitmap.recycle();
            this.bitmap = null;
        }
        TextureInfo textureInfo2 = ThreadLocalTextureCache.getInstance().getTextureInfo(this.textureCacheKey);
        if (textureInfo2 != null) {
            textureInfo2.release();
            ThreadLocalTextureCache.getInstance().remove(this.textureCacheKey);
        }
        for (CIImage next : this.overlayImages) {
            if (next != null) {
                next.release();
            }
        }
        this.overlayImages.clear();
        Logger.m144641d(this.TAG, "release() end");
    }

    public void reset() {
        String str = this.TAG;
        Logger.m144648v(str, "reset() called, before transform = " + this.transform);
        if (this.transform != null) {
            this.transform = null;
        }
    }

    public CIImage safeApplyTransform(Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            return this;
        }
        String str = this.TAG;
        Logger.m144648v(str, "safeApplyTransform: transform = [" + matrix + "]");
        float f = getExtent().origin.x + (getExtent().size.width / 2.0f);
        float f2 = getExtent().origin.y + (getExtent().size.height / 2.0f);
        Matrix matrix2 = new Matrix();
        matrix2.postTranslate(-f, -f2);
        matrix2.postConcat(matrix);
        Matrix matrix3 = new Matrix();
        matrix3.postTranslate(f, f2);
        matrix2.postConcat(matrix3);
        return imageByApplyingTransform(matrix2);
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setHardMode(boolean z) {
        this.isHardMode = z;
    }

    public CIImage simpleClone() {
        CIImage cIImage = new CIImage(this.size.clone());
        cIImage.textureInfo = this.textureInfo;
        cIImage.preferRotation = this.preferRotation;
        cIImage.bitmap = this.bitmap;
        cIImage.alpha = this.alpha;
        return cIImage;
    }

    public String toString() {
        return "CIImage{hash=" + Integer.toHexString(hashCode()) + ", size=" + this.size + ", textureInfo=" + this.textureInfo + ", bitmap=" + this.bitmap + ", transform=" + this.transform + ", frame=" + this.frame + ", overlayImages=" + this.overlayImages + '}';
    }

    public void applyPreferRotation(int i) {
        TextureInfo drawTextureInfo = getDrawTextureInfo();
        if (drawTextureInfo != null) {
            int i2 = i + drawTextureInfo.preferRotation;
            this.rotation = i2;
            if (i2 != 0) {
                String str = this.TAG;
                Logger.m144648v(str, "applyPreferRotation: textureInfo.preferRotation = " + this.rotation);
                Matrix matrix = new Matrix();
                DecoderUtils.getRotationMatrix(matrix, this.rotation, (float) drawTextureInfo.width, (float) drawTextureInfo.height);
                imageByApplyingTransform(matrix);
                if (this.rotation % 2 == 1) {
                    CGSize cGSize = this.size;
                    cGSize.width = (float) drawTextureInfo.height;
                    cGSize.height = (float) drawTextureInfo.width;
                }
            }
        }
    }

    public CIImage clone() {
        CIImage cIImage = new CIImage(this.size.clone());
        cIImage.textureInfo = this.textureInfo;
        cIImage.textureCacheKey = this.textureCacheKey;
        cIImage.bitmap = this.bitmap;
        cIImage.preferRotation = this.preferRotation;
        cIImage.transform = new Matrix(this.transform);
        CGRect cGRect = this.frame;
        cIImage.frame = cGRect != null ? new CGRect(cGRect.origin, cGRect.size) : null;
        cIImage.overlayImages.clear();
        cIImage.overlayImages.addAll(this.overlayImages);
        cIImage.alpha = this.alpha;
        return cIImage;
    }

    public CIImage(TextureInfo textureInfo2) {
        String str = "CIImage@" + Integer.toHexString(hashCode());
        this.TAG = str;
        this.overlayImages = new ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        Logger.m144648v(str, "CIImage() called with: textureInfo = [" + textureInfo2 + "]");
        this.textureInfo = textureInfo2;
        this.size = new CGSize((float) textureInfo2.width, (float) textureInfo2.height);
    }

    public CIImage(Bitmap bitmap2) {
        String str = "CIImage@" + Integer.toHexString(hashCode());
        this.TAG = str;
        this.overlayImages = new ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        Logger.m144648v(str, "CIImage() called with: bitmap = [" + bitmap2 + "]");
        this.bitmap = checkBitmapConfig(bitmap2);
        this.size = new CGSize((float) bitmap2.getWidth(), (float) bitmap2.getHeight());
    }

    public CIImage(String str) {
        this(str, (CGSize) null);
    }

    public CIImage(String str, CGSize cGSize) {
        String str2 = "CIImage@" + Integer.toHexString(hashCode());
        this.TAG = str2;
        this.overlayImages = new ArrayList();
        this.isHardMode = false;
        this.alpha = 1.0f;
        long currentTimeMillis = System.currentTimeMillis();
        this.preferRotation = TAVBitmapUtils.readImagePreferRotation(str);
        Bitmap decodeBitmap = decodeBitmap(str, cGSize);
        this.bitmap = decodeBitmap;
        Bitmap checkBitmapConfig = checkBitmapConfig(decodeBitmap);
        this.bitmap = checkBitmapConfig;
        if (checkBitmapConfig != null) {
            CGSize cGSize2 = new CGSize((float) this.bitmap.getWidth(), (float) this.bitmap.getHeight());
            this.size = cGSize2;
            Logger.m144648v(str2, "CIImage() called with: imagePath = [" + str + "], sampleSize = " + cGSize + ", BitmapFactory.decodeFile cons ms = " + (System.currentTimeMillis() - currentTimeMillis) + ", outBitmapSize = " + cGSize2);
            return;
        }
        Logger.m144643e(str2, "CIImage: 图片解码失败！imagePath = " + str);
        this.size = new CGSize();
    }
}
