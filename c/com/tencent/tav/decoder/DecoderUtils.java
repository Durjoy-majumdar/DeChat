package com.tencent.tav.decoder;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.MediaFormat;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tav.extractor.AssetExtractor;
import java.nio.ByteBuffer;

public class DecoderUtils {
    public static final String MIME_AUDIO = "audio/";
    public static final String MIME_VIDEO = "video/";
    public static final int TIMEOUT_US = 1000;

    public static long getAudioDuration(AssetExtractor assetExtractor) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = assetExtractor.getTrackFormat(i);
                if (trackFormat.getString("mime").startsWith("audio/") && trackFormat.containsKey("durationUs")) {
                    return trackFormat.getLong("durationUs");
                }
            }
            return 0;
        } catch (Error | Exception unused) {
            return 0;
        }
    }

    public static long getDuration(AssetExtractor assetExtractor) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = assetExtractor.getTrackFormat(i);
                String string = trackFormat.getString("mime");
                if (string.startsWith("video/")) {
                    if (trackFormat.containsKey("durationUs")) {
                        j = trackFormat.getLong("durationUs");
                    }
                } else if (string.startsWith("audio/") && trackFormat.containsKey("durationUs")) {
                    j2 = trackFormat.getLong("durationUs");
                }
            }
            return j > 0 ? j : j2;
        } catch (Error | Exception unused) {
            return 0;
        }
    }

    public static MediaFormat getFirstFormat(AssetExtractor assetExtractor, String str) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = assetExtractor.getTrackFormat(i);
                if (trackFormat.getString("mime").startsWith(str)) {
                    return trackFormat;
                }
            }
            return null;
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public static int getFirstTrackIndex(AssetExtractor assetExtractor, String str) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                if (assetExtractor.getTrackFormat(i).getString("mime").startsWith(str)) {
                    return i;
                }
            }
            return -1;
        } catch (Error | Exception unused) {
            return -1;
        }
    }

    public static ByteBuffer getInputBuffer(MediaCodecAnalyse mediaCodecAnalyse, int i) {
        return mediaCodecAnalyse.getCodec().getInputBuffer(i);
    }

    public static Rectangle getMatrixAndCropRect(CGSize cGSize, int i, float f, float f2, Point point, Matrix matrix) {
        float f3;
        float f4;
        while (i < 0) {
            i += 4;
        }
        int i2 = i % 4;
        getRotationMatrix(matrix, i2, cGSize.width, cGSize.height);
        CGSize transformedSize = getTransformedSize(cGSize, i2, f2);
        if (f2 <= 0.0f && f <= 1.0f) {
            return null;
        }
        CGSize cGSize2 = new CGSize();
        if (i2 % 2 == 1) {
            cGSize2.width = cGSize.height;
            cGSize2.height = cGSize.width;
        } else {
            cGSize2.width = cGSize.width;
            cGSize2.height = cGSize.height;
        }
        float f5 = transformedSize.width;
        float f6 = cGSize2.width;
        if (f5 != f6) {
            f4 = (f6 - f5) * 0.5f;
            f3 = 0.0f;
        } else {
            float f7 = transformedSize.height;
            float f8 = cGSize2.height;
            f3 = f7 != f8 ? (f8 - f7) * 0.5f : 0.0f;
            f4 = 0.0f;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate(-f4, -f3);
        float f9 = transformedSize.width;
        float f15 = transformedSize.height;
        float f16 = f9 / f;
        float f17 = f15 / f;
        float f18 = (f - 1.0f) / f;
        float f19 = (((-f9) * 0.5f) * f18) - ((float) point.x);
        float f25 = (((-f15) * 0.5f) * f18) - ((float) point.y);
        Matrix matrix3 = new Matrix();
        matrix3.setTranslate(f19, f25);
        float f26 = f4 - f19;
        float f27 = f3 - f25;
        matrix2.postConcat(matrix3);
        matrix2.postScale(f, f);
        Matrix matrix4 = new Matrix();
        matrix.invert(matrix4);
        RectF rectF = new RectF(f26, f27, f16 + f26, f17 + f27);
        matrix4.mapRect(rectF);
        Rectangle rectangle = new Rectangle(rectF.left, rectF.top, rectF.width(), rectF.height());
        float f28 = rectangle.f320108x;
        if (f28 < 0.0f) {
            rectangle.width += f28;
            rectangle.f320108x = 0.0f;
        }
        float f29 = rectangle.f320109y;
        if (f29 < 0.0f) {
            rectangle.height += f29;
            rectangle.f320109y = 0.0f;
        }
        float f35 = rectangle.f320108x;
        if (rectangle.width + f35 > cGSize.width) {
            rectangle.width = cGSize2.width - f35;
        }
        float f36 = rectangle.f320109y;
        if (rectangle.height + f36 > cGSize.height) {
            rectangle.height = cGSize2.height - f36;
        }
        matrix.postConcat(matrix2);
        return rectangle;
    }

    public static ByteBuffer getOutputBuffer(MediaCodecAnalyse mediaCodecAnalyse, int i) {
        return mediaCodecAnalyse.getCodec().getOutputBuffer(i);
    }

    public static Matrix getPreferMatrix(CGSize cGSize, CGSize cGSize2, int i) {
        Matrix matrix = new Matrix();
        getMatrixAndCropRect(cGSize2, i, 1.0f, 0.0f, new Point(0, 0), matrix);
        Matrix matrix2 = new Matrix();
        CGSize transformedSize = getTransformedSize(cGSize2, i, 0.0f);
        float f = transformedSize.width;
        float f2 = cGSize.width;
        float f3 = transformedSize.height;
        float f4 = cGSize.height;
        if ((f * 1.0f) / f2 > (1.0f * f3) / f4) {
            float f5 = f2 / f;
            matrix2.setScale(f5, f5);
            matrix2.postTranslate(0.0f, (float) Math.round((cGSize.height - (transformedSize.height * f5)) * 0.5f));
        } else {
            float f6 = f4 / f3;
            matrix2.setScale(f6, f6);
            matrix2.postTranslate((float) Math.round((cGSize.width - (transformedSize.width * f6)) * 0.5f), 0.0f);
        }
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static void getRotationMatrix(Matrix matrix, int i, float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i2 = i % 4;
        if (i2 < 0) {
            i2 += 4;
        }
        float f6 = -1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f3 = 0.0f;
                f5 = 0.0f;
                f4 = -1.0f;
            } else if (i2 != 3) {
                f3 = 0.0f;
                f = 0.0f;
                f2 = 0.0f;
                f6 = 1.0f;
                f5 = 0.0f;
                f4 = 1.0f;
            } else {
                f2 = f;
                f3 = 1.0f;
                f = 0.0f;
                f6 = 0.0f;
                f5 = -1.0f;
            }
            matrix.setValues(new float[]{f6, f3, f, f5, f4, f2, 0.0f, 0.0f, 1.0f});
        }
        f = f2;
        f3 = -1.0f;
        f2 = 0.0f;
        f6 = 0.0f;
        f5 = 1.0f;
        f4 = 0.0f;
        matrix.setValues(new float[]{f6, f3, f, f5, f4, f2, 0.0f, 0.0f, 1.0f});
    }

    public static CGSize getTransformedSize(CGSize cGSize, int i, float f) {
        CGSize clone = cGSize.clone();
        if (Math.abs(i) % 2 == 1) {
            float f2 = clone.width;
            clone.width = clone.height;
            clone.height = f2;
        }
        if (f > 0.0f) {
            float f3 = clone.width;
            float f4 = clone.height;
            if ((f3 * 1.0f) / f4 > f) {
                clone.width = (float) ((int) Math.ceil((double) (f4 * f)));
            } else {
                clone.height = (float) ((int) Math.ceil((double) ((f3 * 1.0f) / f)));
            }
        }
        return clone;
    }

    private static void swap(float[] fArr, int i, int i2) {
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    public static float[] toOpenGL2DMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        if (matrix == null) {
            for (int i = 0; i < 9; i++) {
                fArr[i] = i % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            matrix.getValues(fArr);
            swap(fArr, 1, 3);
            swap(fArr, 2, 6);
            swap(fArr, 5, 7);
        }
        return fArr;
    }

    public static long getAudioDuration(long j, int i, int i2) {
        return (j * TimeUtil.SECOND_TO_US) / ((long) ((i * 2) * i2));
    }

    public static long getDuration(String str) {
        try {
            AssetExtractor assetExtractor = new AssetExtractor();
            assetExtractor.setDataSource(str);
            long duration = getDuration(assetExtractor);
            try {
                assetExtractor.release();
            } catch (Error | Exception unused) {
            }
            return duration;
        } catch (Error | Exception unused2) {
            return 0;
        }
    }
}
