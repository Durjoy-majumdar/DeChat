package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector;
import java.util.Iterator;

public abstract class AudioPlayListItemParser {
    public static final String TAG = "AudioListItemParser";
    public CharsetDetector charsetDetector = new CharsetDetector();
    public String mUri;

    public static String delSeprator(String str) {
        return str.substring(str.indexOf(FastJsonResponse.QUOTE) + 1, str.lastIndexOf(FastJsonResponse.QUOTE));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[SYNTHETIC, Splitter:B:21:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String guessCharsetEncoding(java.io.InputStream r7) {
        /*
            r6 = this;
            java.lang.String r0 = "guess encoding close fis ex"
            java.lang.String r1 = "AudioListItemParser"
            java.lang.String r2 = "unicode"
            r3 = 0
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x004f }
            r4.<init>(r7)     // Catch:{ IOException -> 0x004f }
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector r7 = r6.charsetDetector     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r7.setText((java.io.InputStream) r4)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector r7 = r6.charsetDetector     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch r7 = r7.detect()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            if (r7 == 0) goto L_0x003e
            int r3 = r7.getConfidence()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r2 = r7.getName()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r7.<init>()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r5 = "Audio list file encode: "
            r7.append(r5)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r7.append(r2)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r5 = " ,confidence: "
            r7.append(r5)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r7.append(r3)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r1, r7)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
        L_0x003e:
            r4.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x005a
        L_0x0042:
            r7 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r7)
            goto L_0x005a
        L_0x0047:
            r7 = move-exception
            r3 = r4
            goto L_0x005b
        L_0x004a:
            r7 = move-exception
            r3 = r4
            goto L_0x0050
        L_0x004d:
            r7 = move-exception
            goto L_0x005b
        L_0x004f:
            r7 = move-exception
        L_0x0050:
            java.lang.String r4 = "guess encoding ex"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r1, (java.lang.String) r4, (java.lang.Throwable) r7)     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ IOException -> 0x0042 }
        L_0x005a:
            return r2
        L_0x005b:
            if (r3 == 0) goto L_0x0065
            r3.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r2 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x0065:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser.guessCharsetEncoding(java.io.InputStream):java.lang.String");
    }

    public abstract boolean isParseSuccess();

    public abstract Iterator<TrackInfo> iterator();

    public abstract void parse();
}
