package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

abstract class CharsetRecog_Unicode extends CharsetRecognizer {

    public static class CharsetRecog_UTF_16_BE extends CharsetRecog_Unicode {
        public String getName() {
            return "UTF-16BE";
        }

        public CharsetMatch match(CharsetDetector charsetDetector) {
            byte[] bArr = charsetDetector.fRawInput;
            int min = Math.min(bArr.length, 30);
            int i = 0;
            int i2 = 10;
            int i3 = 0;
            while (true) {
                if (i3 >= min - 1) {
                    break;
                }
                int codeUnit16FromBytes = CharsetRecog_Unicode.codeUnit16FromBytes(bArr[i3], bArr[i3 + 1]);
                if (i3 != 0 || codeUnit16FromBytes != 65279) {
                    i2 = CharsetRecog_Unicode.adjustConfidence(codeUnit16FromBytes, i2);
                    if (i2 == 0 || i2 == 100) {
                        break;
                    }
                    i3 += 2;
                } else {
                    i2 = 100;
                    break;
                }
            }
            if (min >= 4 || i2 >= 100) {
                i = i2;
            }
            if (i > 0) {
                return new CharsetMatch(charsetDetector, this, i);
            }
            return null;
        }
    }

    public static class CharsetRecog_UTF_16_LE extends CharsetRecog_Unicode {
        public String getName() {
            return "UTF-16LE";
        }

        public CharsetMatch match(CharsetDetector charsetDetector) {
            byte[] bArr = charsetDetector.fRawInput;
            int min = Math.min(bArr.length, 30);
            int i = 0;
            int i2 = 10;
            int i3 = 0;
            while (true) {
                if (i3 >= min - 1) {
                    break;
                }
                int codeUnit16FromBytes = CharsetRecog_Unicode.codeUnit16FromBytes(bArr[i3 + 1], bArr[i3]);
                if (i3 != 0 || codeUnit16FromBytes != 65279) {
                    i2 = CharsetRecog_Unicode.adjustConfidence(codeUnit16FromBytes, i2);
                    if (i2 == 0 || i2 == 100) {
                        break;
                    }
                    i3 += 2;
                } else {
                    i2 = 100;
                    break;
                }
            }
            if (min >= 4 || i2 >= 100) {
                i = i2;
            }
            if (i > 0) {
                return new CharsetMatch(charsetDetector, this, i);
            }
            return null;
        }
    }

    public static abstract class CharsetRecog_UTF_32 extends CharsetRecog_Unicode {
        public abstract int getChar(byte[] bArr, int i);

        public abstract String getName();

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector r11) {
            /*
                r10 = this;
                byte[] r0 = r11.fRawInput
                int r1 = r11.fRawLength
                int r1 = r1 / 4
                int r1 = r1 * 4
                r2 = 0
                if (r1 != 0) goto L_0x000c
                return r2
            L_0x000c:
                r3 = 0
                int r4 = r10.getChar(r0, r3)
                r5 = 65279(0xfeff, float:9.1475E-41)
                if (r4 != r5) goto L_0x0018
                r4 = 1
                goto L_0x0019
            L_0x0018:
                r4 = 0
            L_0x0019:
                r5 = 0
                r6 = 0
                r7 = 0
            L_0x001c:
                if (r5 >= r1) goto L_0x003c
                int r8 = r10.getChar(r0, r5)
                if (r8 < 0) goto L_0x0037
                r9 = 1114111(0x10ffff, float:1.561202E-39)
                if (r8 >= r9) goto L_0x0037
                r9 = 55296(0xd800, float:7.7486E-41)
                if (r8 < r9) goto L_0x0034
                r9 = 57343(0xdfff, float:8.0355E-41)
                if (r8 > r9) goto L_0x0034
                goto L_0x0037
            L_0x0034:
                int r7 = r7 + 1
                goto L_0x0039
            L_0x0037:
                int r6 = r6 + 1
            L_0x0039:
                int r5 = r5 + 4
                goto L_0x001c
            L_0x003c:
                r0 = 80
                r1 = 100
                if (r4 == 0) goto L_0x0047
                if (r6 != 0) goto L_0x0047
            L_0x0044:
                r3 = 100
                goto L_0x0061
            L_0x0047:
                if (r4 == 0) goto L_0x0050
                int r4 = r6 * 10
                if (r7 <= r4) goto L_0x0050
            L_0x004d:
                r3 = 80
                goto L_0x0061
            L_0x0050:
                r4 = 3
                if (r7 <= r4) goto L_0x0056
                if (r6 != 0) goto L_0x0056
                goto L_0x0044
            L_0x0056:
                if (r7 <= 0) goto L_0x005b
                if (r6 != 0) goto L_0x005b
                goto L_0x004d
            L_0x005b:
                int r6 = r6 * 10
                if (r7 <= r6) goto L_0x0061
                r3 = 25
            L_0x0061:
                if (r3 != 0) goto L_0x0064
                goto L_0x0069
            L_0x0064:
                com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch r2 = new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch
                r2.<init>(r11, r10, r3)
            L_0x0069:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_32.match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector):com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch");
        }
    }

    public static class CharsetRecog_UTF_32_BE extends CharsetRecog_UTF_32 {
        public int getChar(byte[] bArr, int i) {
            return (bArr[i + 3] & ExifInterface.MARKER) | ((bArr[i + 0] & ExifInterface.MARKER) << 24) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 2] & ExifInterface.MARKER) << 8);
        }

        public String getName() {
            return "UTF-32BE";
        }
    }

    public static class CharsetRecog_UTF_32_LE extends CharsetRecog_UTF_32 {
        public int getChar(byte[] bArr, int i) {
            return (bArr[i + 0] & ExifInterface.MARKER) | ((bArr[i + 3] & ExifInterface.MARKER) << 24) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 1] & ExifInterface.MARKER) << 8);
        }

        public String getName() {
            return "UTF-32LE";
        }
    }

    public static int adjustConfidence(int i, int i2) {
        if (i == 0) {
            i2 -= 10;
        } else if ((i >= 32 && i <= 255) || i == 10) {
            i2 += 10;
        }
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 100) {
            return 100;
        }
        return i2;
    }

    public static int codeUnit16FromBytes(byte b, byte b2) {
        return ((b & ExifInterface.MARKER) << 8) | (b2 & ExifInterface.MARKER);
    }

    public abstract String getName();

    public abstract CharsetMatch match(CharsetDetector charsetDetector);
}
