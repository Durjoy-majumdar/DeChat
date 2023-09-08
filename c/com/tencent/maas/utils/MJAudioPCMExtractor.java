package com.tencent.maas.utils;

import com.tencent.maas.model.time.MJTimeRange;
import java.io.File;
import java.nio.ByteBuffer;

public class MJAudioPCMExtractor {
    private static final int NATIVE_SAMPLE_FORMAT_F32 = 4;
    private static final int NATIVE_SAMPLE_FORMAT_I16 = 2;
    private static final int NATIVE_SAMPLE_FORMAT_U8 = 1;
    private static final int[] SUPPORTED_ENCODINGS = {3, 2, 4};

    private static int convertEncodingToNativeSampleFormat(int i) {
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 4;
        }
        return 1;
    }

    public static ByteBuffer extractAudioPCM(File file, int i, int i2, int i3, MJTimeRange mJTimeRange) {
        int[] iArr = SUPPORTED_ENCODINGS;
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            } else if (iArr[i4] == i) {
                z = true;
                break;
            } else {
                i4++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException("encoding not support");
        } else if (i2 < 1 || i2 > 2) {
            throw new IllegalArgumentException("channel count not support");
        } else if (file.exists() && file.isFile()) {
            return nativeExtractAudioPCM(convertEncodingToNativeSampleFormat(i), i2, i3, mJTimeRange, file.getAbsolutePath());
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static native ByteBuffer nativeExtractAudioPCM(int i, int i2, int i3, MJTimeRange mJTimeRange, String str);
}
