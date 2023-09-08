package com.tencent.qqmusic.mediaplayer.codec.ffmpeg;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.IOException;

public class FfmpegRecognition implements IAudioRecognition {
    private static final String SO_AUDIO_COMMON = "audio_common";
    private static final String SO_BASE_NAME = "FFmpeg";
    private static final String SO_NAME = "ffmpeg_decoder";
    private static final String SO_NEON_BASE_NAME = "FFmpeg_v7a";
    private static final String SO_NEON_NAME = "ffmpeg_decoder_v7a";
    private static final String TAG = "FfmpegRecognition";

    public static boolean isM4a(IDataSource iDataSource) {
        byte[] bArr = new byte[4];
        try {
            iDataSource.readAt(4, bArr, 0, 4);
        } catch (IOException unused) {
        }
        return bArr[0] == 102 && bArr[1] == 116 && bArr[2] == 121 && bArr[3] == 112;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038 A[SYNTHETIC, Splitter:B:25:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0071 A[SYNTHETIC, Splitter:B:49:0x0071] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r0 = "FfmpegRecognition"
            if (r6 == 0) goto L_0x000e
            int r1 = r6.length
            if (r1 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L_0x0041
        L_0x000e:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r5 = 64
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x002d }
            r2.read(r5)     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x002d }
            r3.<init>(r5)     // Catch:{ Exception -> 0x002d }
            r2.close()     // Catch:{ Exception -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r5 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r5)
        L_0x0028:
            r5 = r3
            goto L_0x0041
        L_0x002a:
            r5 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x002d:
            r5 = move-exception
            goto L_0x0033
        L_0x002f:
            r5 = move-exception
            goto L_0x006f
        L_0x0031:
            r5 = move-exception
            r2 = r1
        L_0x0033:
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r5)     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ Exception -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r5 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r5)
        L_0x0040:
            r5 = r1
        L_0x0041:
            if (r5 == 0) goto L_0x004e
            java.lang.String r0 = "ftyp"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x004e
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A
            return r5
        L_0x004e:
            if (r6 == 0) goto L_0x006c
            int r5 = r6.length
            r0 = 2
            if (r5 <= r0) goto L_0x006c
            r5 = 0
            byte r5 = r6[r5]
            r0 = -1
            if (r5 != r0) goto L_0x006c
            r5 = 1
            byte r5 = r6[r5]
            r6 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 240(0xf0, float:3.36E-43)
            if (r6 != r0) goto L_0x006c
            r5 = r5 & 15
            r5 = r5 & 6
            if (r5 != 0) goto L_0x006c
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A
            return r5
        L_0x006c:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
            return r5
        L_0x006f:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ Exception -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r6 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r6)
        L_0x0079:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition.getAudioType(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        return getAudioType(str, (byte[]) null);
    }
}
