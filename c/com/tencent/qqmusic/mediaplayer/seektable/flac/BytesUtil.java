package com.tencent.qqmusic.mediaplayer.seektable.flac;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

public class BytesUtil {
    public static int from(byte[] bArr) {
        if (bArr.length > 4) {
            throw new RuntimeException("bytes can't be greater than 32 bit!");
        } else if (bArr.length == 3) {
            return (bArr[2] & ExifInterface.MARKER) | ((bArr[0] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[1] & ExifInterface.MARKER) << 8);
        } else if (bArr.length == 2) {
            return (bArr[1] & 15) | ((bArr[0] & ExifInterface.MARKER) << 8);
        } else if (bArr.length == 1) {
            return bArr[0] & ExifInterface.MARKER;
        } else {
            throw new RuntimeException("bytes must be greater than 8 bit!");
        }
    }
}
