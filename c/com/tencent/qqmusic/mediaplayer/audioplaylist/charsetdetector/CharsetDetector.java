package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs;
import com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharsetDetector {
    private static final List<CSRecognizerInfo> ALL_CS_RECOGNIZERS;
    private static final int kBufSize = 8000;
    public short[] fByteStats = new short[256];
    public boolean fC1Bytes = false;
    public String fDeclaredEncoding;
    private boolean[] fEnabledRecognizers;
    public byte[] fInputBytes = new byte[8000];
    public int fInputLen;
    public InputStream fInputStream;
    public byte[] fRawInput;
    public int fRawLength;
    private boolean fStripTags = false;

    public static class CSRecognizerInfo {
        public boolean isDefaultEnabled;
        public CharsetRecognizer recognizer;

        public CSRecognizerInfo(CharsetRecognizer charsetRecognizer, boolean z) {
            this.recognizer = charsetRecognizer;
            this.isDefaultEnabled = z;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_UTF8(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_Unicode.CharsetRecog_UTF_16_BE(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_Unicode.CharsetRecog_UTF_16_LE(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_Unicode.CharsetRecog_UTF_32_BE(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_Unicode.CharsetRecog_UTF_32_LE(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_mbcs.CharsetRecog_sjis(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_2022.CharsetRecog_2022JP(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_2022.CharsetRecog_2022CN(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_2022.CharsetRecog_2022KR(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_mbcs.CharsetRecog_gb_18030(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_mbcs.CharsetRecog_euc.CharsetRecog_euc_jp(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_mbcs.CharsetRecog_euc.CharsetRecog_euc_kr(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_mbcs.CharsetRecog_big5(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_1(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_2(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_5_ru(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_6_ar(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_7_el(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_8_I_he(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_8_he(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_windows_1251(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_windows_1256(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_KOI8_R(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_8859_9_tr(), true));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_IBM424_he_rtl(), false));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_IBM424_he_ltr(), false));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_IBM420_ar_rtl(), false));
        arrayList.add(new CSRecognizerInfo(new CharsetRecog_sbcs.CharsetRecog_IBM420_ar_ltr(), false));
        ALL_CS_RECOGNIZERS = Collections.unmodifiableList(arrayList);
    }

    private void MungeInput() {
        int i;
        int i2;
        if (this.fStripTags) {
            int i3 = 0;
            i2 = 0;
            i = 0;
            boolean z = false;
            for (int i4 = 0; i4 < this.fRawLength; i4++) {
                byte[] bArr = this.fInputBytes;
                if (i3 >= bArr.length) {
                    break;
                }
                byte b = this.fRawInput[i4];
                if (b == 60) {
                    if (z) {
                        i++;
                    }
                    i2++;
                    z = true;
                }
                if (!z) {
                    bArr[i3] = b;
                    i3++;
                }
                if (b == 62) {
                    z = false;
                }
            }
            this.fInputLen = i3;
        } else {
            i2 = 0;
            i = 0;
        }
        if (i2 < 5 || i2 / 5 < i || (this.fInputLen < 100 && this.fRawLength > 600)) {
            int i5 = this.fRawLength;
            if (i5 > 8000) {
                i5 = 8000;
            }
            int i6 = 0;
            while (i6 < i5) {
                this.fInputBytes[i6] = this.fRawInput[i6];
                i6++;
            }
            this.fInputLen = i6;
        }
        Arrays.fill(this.fByteStats, 0);
        for (int i7 = 0; i7 < this.fInputLen; i7++) {
            byte b2 = this.fInputBytes[i7] & ExifInterface.MARKER;
            short[] sArr = this.fByteStats;
            sArr[b2] = (short) (sArr[b2] + 1);
        }
        this.fC1Bytes = false;
        for (int i8 = 128; i8 <= 159; i8++) {
            if (this.fByteStats[i8] != 0) {
                this.fC1Bytes = true;
                return;
            }
        }
    }

    public static String[] getAllDetectableCharsets() {
        int size = ALL_CS_RECOGNIZERS.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ALL_CS_RECOGNIZERS.get(i).recognizer.getName();
        }
        return strArr;
    }

    public CharsetMatch detect() {
        CharsetMatch[] detectAll = detectAll();
        if (detectAll == null || detectAll.length == 0) {
            return null;
        }
        return detectAll[0];
    }

    public CharsetMatch[] detectAll() {
        CharsetMatch match;
        ArrayList arrayList = new ArrayList();
        MungeInput();
        int i = 0;
        while (true) {
            List<CSRecognizerInfo> list = ALL_CS_RECOGNIZERS;
            if (i < list.size()) {
                CSRecognizerInfo cSRecognizerInfo = list.get(i);
                boolean[] zArr = this.fEnabledRecognizers;
                if ((zArr != null ? zArr[i] : cSRecognizerInfo.isDefaultEnabled) && (match = cSRecognizerInfo.recognizer.match(this)) != null) {
                    arrayList.add(match);
                }
                i++;
            } else {
                Collections.sort(arrayList);
                Collections.reverse(arrayList);
                return (CharsetMatch[]) arrayList.toArray(new CharsetMatch[arrayList.size()]);
            }
        }
    }

    public boolean enableInputFilter(boolean z) {
        boolean z2 = this.fStripTags;
        this.fStripTags = z;
        return z2;
    }

    @Deprecated
    public String[] getDetectableCharsets() {
        ArrayList arrayList = new ArrayList(ALL_CS_RECOGNIZERS.size());
        int i = 0;
        while (true) {
            List<CSRecognizerInfo> list = ALL_CS_RECOGNIZERS;
            if (i >= list.size()) {
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            CSRecognizerInfo cSRecognizerInfo = list.get(i);
            boolean[] zArr = this.fEnabledRecognizers;
            if (zArr == null ? cSRecognizerInfo.isDefaultEnabled : zArr[i]) {
                arrayList.add(cSRecognizerInfo.recognizer.getName());
            }
            i++;
        }
    }

    public Reader getReader(InputStream inputStream, String str) {
        this.fDeclaredEncoding = str;
        try {
            setText(inputStream);
            CharsetMatch detect = detect();
            if (detect == null) {
                return null;
            }
            return detect.getReader();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getString(byte[] bArr, String str) {
        this.fDeclaredEncoding = str;
        try {
            setText(bArr);
            CharsetMatch detect = detect();
            if (detect == null) {
                return null;
            }
            return detect.getString(-1);
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean inputFilterEnabled() {
        return this.fStripTags;
    }

    public CharsetDetector setDeclaredEncoding(String str) {
        this.fDeclaredEncoding = str;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r3 = false;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector setDetectableCharset(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector$CSRecognizerInfo> r2 = ALL_CS_RECOGNIZERS
            int r3 = r2.size()
            if (r1 >= r3) goto L_0x0025
            java.lang.Object r3 = r2.get(r1)
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector$CSRecognizerInfo r3 = (com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo) r3
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer r4 = r3.recognizer
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0022
            boolean r3 = r3.isDefaultEnabled
            if (r3 != r7) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0025:
            r1 = -1
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r1 < 0) goto L_0x0055
            boolean[] r6 = r5.fEnabledRecognizers
            if (r6 != 0) goto L_0x004e
            if (r3 != 0) goto L_0x004e
            int r6 = r2.size()
            boolean[] r6 = new boolean[r6]
            r5.fEnabledRecognizers = r6
        L_0x0037:
            java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector$CSRecognizerInfo> r6 = ALL_CS_RECOGNIZERS
            int r2 = r6.size()
            if (r0 >= r2) goto L_0x004e
            boolean[] r2 = r5.fEnabledRecognizers
            java.lang.Object r6 = r6.get(r0)
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector$CSRecognizerInfo r6 = (com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo) r6
            boolean r6 = r6.isDefaultEnabled
            r2[r0] = r6
            int r0 = r0 + 1
            goto L_0x0037
        L_0x004e:
            boolean[] r6 = r5.fEnabledRecognizers
            if (r6 == 0) goto L_0x0054
            r6[r1] = r7
        L_0x0054:
            return r5
        L_0x0055:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid encoding: \""
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.setDetectableCharset(java.lang.String, boolean):com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector");
    }

    public CharsetDetector setText(byte[] bArr) {
        this.fRawInput = bArr;
        this.fRawLength = bArr.length;
        return this;
    }

    public CharsetDetector setText(InputStream inputStream) {
        this.fInputStream = inputStream;
        int i = 8000;
        inputStream.mark(8000);
        this.fRawInput = new byte[8000];
        this.fRawLength = 0;
        while (i > 0) {
            int read = this.fInputStream.read(this.fRawInput, this.fRawLength, i);
            if (read <= 0) {
                break;
            }
            this.fRawLength += read;
            i -= read;
        }
        this.fInputStream.reset();
        return this;
    }
}
