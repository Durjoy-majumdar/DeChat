package com.tencent.qqmusic.mediaplayer.util;

public class StreamUtils {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long skipForBufferStream(java.io.InputStream r8, long r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x001d
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0009
            goto L_0x001d
        L_0x0009:
            r2 = r9
            r4 = r0
        L_0x000b:
            long r2 = r2 - r4
            long r4 = r8.skip(r2)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0018
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x000b
        L_0x0018:
            if (r6 <= 0) goto L_0x001b
            return r9
        L_0x001b:
            long r9 = r9 - r2
            return r9
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.util.StreamUtils.skipForBufferStream(java.io.InputStream, long):long");
    }
}
