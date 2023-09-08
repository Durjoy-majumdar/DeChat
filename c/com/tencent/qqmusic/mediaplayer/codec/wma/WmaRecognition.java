package com.tencent.qqmusic.mediaplayer.codec.wma;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class WmaRecognition implements IAudioRecognition {
    public static String TAG = "WmaRecognition";
    private final int HEARER_LENGTH = 16;
    private final byte[] WMA_HEADER = {48, 38, -78, 117, -114, 102, -49, 17, -90, ExifInterface.MARKER_EOI, 0, -86, 0, 98, -50, 108};

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[SYNTHETIC, Splitter:B:23:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004d A[LOOP:0: B:32:0x0042->B:35:0x004d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005a A[SYNTHETIC, Splitter:B:42:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            r0 = 16
            if (r6 == 0) goto L_0x0008
            int r1 = r6.length
            if (r1 < r0) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0028 }
            byte[] r6 = new byte[r0]     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            r1.read(r6)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            r1.close()     // Catch:{ IOException -> 0x0017 }
            goto L_0x003c
        L_0x0017:
            r5 = move-exception
            java.lang.String r1 = TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r1, (java.lang.Throwable) r5)
            goto L_0x003c
        L_0x001e:
            r5 = move-exception
            r6 = r1
            goto L_0x0058
        L_0x0021:
            r5 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
            goto L_0x002a
        L_0x0026:
            r5 = move-exception
            goto L_0x0058
        L_0x0028:
            r5 = move-exception
            r1 = r6
        L_0x002a:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x0026 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r2, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0026 }
            if (r6 == 0) goto L_0x003b
            r6.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r5 = move-exception
            java.lang.String r6 = TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r6, (java.lang.Throwable) r5)
        L_0x003b:
            r6 = r1
        L_0x003c:
            if (r6 == 0) goto L_0x0055
            int r5 = r6.length
            if (r5 < r0) goto L_0x0055
            r5 = 0
        L_0x0042:
            if (r5 >= r0) goto L_0x0050
            byte r1 = r6[r5]
            byte[] r2 = r4.WMA_HEADER
            byte r2 = r2[r5]
            if (r1 == r2) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0050:
            if (r5 != r0) goto L_0x0055
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WMA
            return r5
        L_0x0055:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
            return r5
        L_0x0058:
            if (r6 == 0) goto L_0x0064
            r6.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0064
        L_0x005e:
            r6 = move-exception
            java.lang.String r0 = TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r6)
        L_0x0064:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.getAudioType(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        return (TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wma")) ? AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.WMA;
    }
}
