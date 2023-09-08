package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

class CharsetRecog_UTF8 extends CharsetRecognizer {
    public String getName() {
        return "UTF-8";
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0061 A[EDGE_INSN: B:58:0x0061->B:32:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector r14) {
        /*
            r13 = this;
            byte[] r0 = r14.fRawInput
            int r1 = r14.fRawLength
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r1 < r3) goto L_0x0024
            byte r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 239(0xef, float:3.35E-43)
            if (r1 != r6) goto L_0x0024
            byte r1 = r0[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 187(0xbb, float:2.62E-43)
            if (r1 != r6) goto L_0x0024
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 191(0xbf, float:2.68E-43)
            if (r1 != r6) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0028:
            int r9 = r14.fRawLength
            if (r6 >= r9) goto L_0x0063
            byte r9 = r0[r6]
            r10 = r9 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x0033
            goto L_0x0061
        L_0x0033:
            r10 = r9 & 224(0xe0, float:3.14E-43)
            r11 = 192(0xc0, float:2.69E-43)
            if (r10 != r11) goto L_0x003b
            r9 = 1
            goto L_0x004a
        L_0x003b:
            r10 = r9 & 240(0xf0, float:3.36E-43)
            r12 = 224(0xe0, float:3.14E-43)
            if (r10 != r12) goto L_0x0043
            r9 = 2
            goto L_0x004a
        L_0x0043:
            r9 = r9 & 248(0xf8, float:3.48E-43)
            r10 = 240(0xf0, float:3.36E-43)
            if (r9 != r10) goto L_0x005f
            r9 = 3
        L_0x004a:
            int r6 = r6 + r5
            int r10 = r14.fRawLength
            if (r6 < r10) goto L_0x0050
            goto L_0x0061
        L_0x0050:
            byte r10 = r0[r6]
            r10 = r10 & r11
            r12 = 128(0x80, float:1.794E-43)
            if (r10 == r12) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            int r9 = r9 + -1
            if (r9 != 0) goto L_0x004a
            int r8 = r8 + 1
            goto L_0x0061
        L_0x005f:
            int r7 = r7 + 1
        L_0x0061:
            int r6 = r6 + r5
            goto L_0x0028
        L_0x0063:
            r0 = 80
            r2 = 100
            if (r1 == 0) goto L_0x006e
            if (r7 != 0) goto L_0x006e
        L_0x006b:
            r4 = 100
            goto L_0x008e
        L_0x006e:
            if (r1 == 0) goto L_0x0077
            int r1 = r7 * 10
            if (r8 <= r1) goto L_0x0077
        L_0x0074:
            r4 = 80
            goto L_0x008e
        L_0x0077:
            if (r8 <= r3) goto L_0x007c
            if (r7 != 0) goto L_0x007c
            goto L_0x006b
        L_0x007c:
            if (r8 <= 0) goto L_0x0081
            if (r7 != 0) goto L_0x0081
            goto L_0x0074
        L_0x0081:
            if (r8 != 0) goto L_0x0088
            if (r7 != 0) goto L_0x0088
            r4 = 15
            goto L_0x008e
        L_0x0088:
            int r7 = r7 * 10
            if (r8 <= r7) goto L_0x008e
            r4 = 25
        L_0x008e:
            if (r4 != 0) goto L_0x0092
            r14 = 0
            goto L_0x0098
        L_0x0092:
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch r0 = new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch
            r0.<init>(r14, r13, r4)
            r14 = r0
        L_0x0098:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_UTF8.match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector):com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch");
    }
}
