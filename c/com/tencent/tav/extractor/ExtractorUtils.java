package com.tencent.tav.extractor;

import android.graphics.Matrix;
import android.media.MediaFormat;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.decoder.DecoderAssetTrack;
import com.tencent.tav.decoder.DecoderUtils;

public class ExtractorUtils {
    public static final String MIME_AUDIO = "audio/";
    public static final String MIME_VIDEO = "video/";

    public static void applyMirror(Matrix matrix, int i, int i2, int i3) {
        if (matrix != null) {
            Matrix matrix2 = new Matrix();
            if (i == 1) {
                matrix2.postScale(-1.0f, 1.0f);
                matrix2.postTranslate((float) i2, 0.0f);
            } else if (i == 2) {
                matrix2.postScale(1.0f, -1.0f);
                matrix2.postTranslate(0.0f, (float) i3);
            } else if (i == 3) {
                matrix2.postScale(-1.0f, -1.0f);
                matrix2.postTranslate((float) i2, (float) i3);
            }
            matrix.postConcat(matrix2);
        }
    }

    public static int getFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return 0;
        }
        try {
            if (mediaFormat.containsKey("frame-rate")) {
                return mediaFormat.getInteger("frame-rate");
            }
            return 0;
        } catch (Error | Exception unused) {
            return 0;
        }
    }

    public static int getPreferRotation(AssetExtractor assetExtractor) {
        try {
            MediaFormat firstFormat = DecoderUtils.getFirstFormat(assetExtractor, "video/");
            if (firstFormat == null || !firstFormat.containsKey("rotation-degrees")) {
                return 0;
            }
            return firstFormat.getInteger("rotation-degrees") / 90;
        } catch (Error | Exception unused) {
            return 0;
        }
    }

    public static CGSize getVideoSize(AssetExtractor assetExtractor) {
        try {
            MediaFormat firstFormat = DecoderUtils.getFirstFormat(assetExtractor, "video/");
            CGSize cGSize = new CGSize();
            if (firstFormat != null) {
                if (firstFormat.containsKey("display-width")) {
                    cGSize.width = (float) firstFormat.getInteger("display-width");
                } else {
                    cGSize.width = (float) firstFormat.getInteger("width");
                }
                if (firstFormat.containsKey("display-height")) {
                    cGSize.height = (float) firstFormat.getInteger("display-height");
                } else {
                    cGSize.height = (float) firstFormat.getInteger("height");
                }
            }
            return cGSize;
        } catch (Error | Exception unused) {
            return new CGSize();
        }
    }

    public static boolean isSameExtractor(DecoderAssetTrack decoderAssetTrack, DecoderAssetTrack decoderAssetTrack2) {
        String str;
        return (decoderAssetTrack != null && decoderAssetTrack2 != null) && (str = decoderAssetTrack.assetPath) != null && str.equals(decoderAssetTrack2.assetPath);
    }
}
