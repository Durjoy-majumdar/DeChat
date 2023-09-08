package com.tencent.qqmusic.mediaplayer.codec.flac;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.wxmm.v2encoder;
import java.io.IOException;

public class FLACRecognition implements IAudioRecognition {
    public static final String TAG = "FLACRecognition";

    private boolean checkFormatBySoftDecoder(String str) {
        NativeDecoder nativeDecoder = new NativeDecoder();
        boolean z = false;
        try {
            if (nativeDecoder.init(str, false) == 0) {
                AudioInformation audioInformation = nativeDecoder.getAudioInformation();
                if (audioInformation != null && audioInformation.getAudioType() == AudioFormat.AudioType.FLAC) {
                    z = true;
                }
                try {
                    nativeDecoder.release();
                } catch (Throwable th) {
                    Logger.m21790e(TAG, th);
                }
                return z;
            }
            nativeDecoder.release();
            return false;
        } catch (Throwable th4) {
            Logger.m21790e(TAG, th4);
        }
    }

    public static boolean isFlac(IDataSource iDataSource) {
        int i;
        boolean z;
        int i2;
        byte[] bArr = new byte[10];
        try {
            iDataSource.readAt(0, bArr, 0, 10);
        } catch (IOException unused) {
        }
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i3 = ((bArr[6] & Byte.MAX_VALUE) << 21) + ((bArr[7] & Byte.MAX_VALUE) << 14) + ((bArr[8] & Byte.MAX_VALUE) << 7) + (bArr[9] & Byte.MAX_VALUE);
            if ((bArr[5] & v2encoder.enumCODEC_vcodec2) > 0) {
                i = i3 + 20;
                z = true;
            } else {
                i = i3 + 10;
                z = false;
            }
            if (!z) {
                byte[] bArr2 = new byte[1];
                try {
                    i2 = iDataSource.readAt((long) i, bArr2, 0, 1);
                } catch (IOException unused2) {
                    i2 = 0;
                }
                while (bArr2[0] == 0 && i2 == 1) {
                    i++;
                    try {
                        i2 = iDataSource.readAt((long) i, bArr2, 0, 1);
                    } catch (IOException unused3) {
                    }
                }
            }
        } else {
            i = 0;
        }
        byte[] bArr3 = new byte[4];
        try {
            iDataSource.readAt((long) i, bArr3, 0, 4);
        } catch (IOException unused4) {
        }
        return bArr3[0] == 102 && bArr3[1] == 76 && bArr3[2] == 97 && bArr3[3] == 67;
    }

    public AudioFormat.AudioType getAudioType(String str, byte[] bArr) {
        return (bArr == null || bArr.length <= 0 || !new String(bArr).startsWith("flaC")) ? checkFormatBySoftDecoder(str) ? AudioFormat.AudioType.FLAC : AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.FLAC;
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.toLowerCase().contains(".flac")) {
                return AudioFormat.AudioType.FLAC;
            }
            FileDataSource fileDataSource = new FileDataSource(str);
            boolean z = false;
            try {
                fileDataSource.open();
                z = isFlac(fileDataSource);
                fileDataSource.close();
            } catch (IOException unused) {
            }
            if (z) {
                return AudioFormat.AudioType.FLAC;
            }
        }
        return AudioFormat.AudioType.UNSUPPORT;
    }
}
