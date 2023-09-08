package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.mm.sdk.platformtools.ImgUtil */
public class ImgUtil {
    private static final int MAX_CHECK_IMG_SIZE = 64;
    private static final String TAG = "MicroMsg.ImgUtil";

    public static int[] getImgWdithAndHeightFromStream(InputStream inputStream) {
        if (inputStream == null) {
            Log.m105928w(TAG, "hy: the input stream is null");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        MMBitmapFactory.m98738g(inputStream, (Rect) null, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    private static int getMaxSampleRateFromFile(String str) {
        InputStream inputStream = null;
        try {
            inputStream = C86013q1.m106423E(str);
            int[] imgWdithAndHeightFromStream = getImgWdithAndHeightFromStream(inputStream);
            if (imgWdithAndHeightFromStream == null || imgWdithAndHeightFromStream.length < 2) {
                Log.m105928w(TAG, "hy: can not get size from file");
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return 1;
            }
            int i = imgWdithAndHeightFromStream[0];
            int i2 = imgWdithAndHeightFromStream[1];
            Log.m105919d(TAG, "hy: decoded file: %s size: width: %d, height: %d", str, Integer.valueOf(i), Integer.valueOf(i2));
            int sampleRate = getSampleRate(i, i2);
            Log.m105919d(TAG, "hy: sample rate: %d", Integer.valueOf(sampleRate));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return sampleRate;
        } catch (FileNotFoundException e) {
            Log.printErrStackTrace(TAG, e, "hy: exception in getMaxSampleRateFromFile", new Object[0]);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return 1;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int getSampleRate(int i, int i2) {
        int max = Math.max(i, i2);
        int i3 = 1;
        while (max > 64) {
            i3 *= 2;
            max /= i3;
        }
        return i3;
    }

    public static String identifyImgType(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return identifyImgType(C86013q1.m106433O(str, 0, 2));
    }

    public static boolean isGif(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        String str = "";
        int i = 0;
        while (i < 6) {
            try {
                str = str + ((char) byteArrayInputStream.read());
                i++;
            } catch (IOException unused) {
                return false;
            }
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused2) {
        }
        if (!str.startsWith("GIF")) {
            return false;
        }
        return true;
    }

    public static boolean isImageFile(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[1];
            if (b == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return true;
            }
            byte b2 = bArr[0];
            if (b2 == 71 && b == 73 && bArr[2] == 70) {
                return true;
            }
            if (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) {
                return true;
            }
            return b2 == 119 && b == 120 && bArr[2] == 103 && bArr[3] == 102;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.graphics.Rect, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isImgFile(java.lang.String r6) {
        /*
            java.lang.String r0 = "MicroMsg.ImgUtil"
            r1 = 0
            if (r6 == 0) goto L_0x0050
            int r2 = r6.length()
            if (r2 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            int r2 = r6.length()
            r3 = 3
            if (r2 >= r3) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            r4 = 0
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)     // Catch:{ all -> 0x003e }
            if (r5 != 0) goto L_0x0027
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            return r1
        L_0x0027:
            java.io.InputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106423E(r6)     // Catch:{ all -> 0x003e }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r6, r4, r2)     // Catch:{ all -> 0x003b }
            int r4 = r2.outWidth     // Catch:{ all -> 0x003b }
            if (r4 <= 0) goto L_0x0037
            int r0 = r2.outHeight     // Catch:{ all -> 0x003b }
            if (r0 <= 0) goto L_0x0037
            r1 = 1
        L_0x0037:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            return r1
        L_0x003b:
            r2 = move-exception
            r4 = r6
            goto L_0x003f
        L_0x003e:
            r2 = move-exception
        L_0x003f:
            java.lang.String r6 = "unexpected exception."
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r6, r3)     // Catch:{ all -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            return r1
        L_0x004b:
            r6 = move-exception
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            throw r6
        L_0x0050:
            java.lang.String r6 = "isImgFile, invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(java.lang.String):boolean");
    }

    public static boolean isWXGF(String str) {
        InputStream inputStream = null;
        try {
            InputStream E = C86013q1.m106423E(str);
            byte[] bArr = new byte[8];
            String str2 = "";
            E.read(bArr);
            for (int i = 0; i < 8; i++) {
                str2 = str2 + ((char) bArr[i]);
            }
            if (!str2.startsWith("wxgf")) {
                try {
                    E.close();
                } catch (IOException unused) {
                }
                return false;
            }
            try {
                E.close();
                return true;
            } catch (IOException unused2) {
                return true;
            }
        } catch (Exception unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String identifyImgType(byte[] r3) {
        /*
            if (r3 == 0) goto L_0x0041
            int r0 = r3.length
            r1 = 2
            if (r0 >= r1) goto L_0x0007
            goto L_0x0041
        L_0x0007:
            r0 = 0
            byte r0 = r3[r0]
            if (r0 >= 0) goto L_0x000e
            int r0 = r0 + 256
        L_0x000e:
            r1 = 1
            byte r3 = r3[r1]
            if (r3 >= 0) goto L_0x0015
            int r3 = r3 + 256
        L_0x0015:
            r1 = 66
            java.lang.String r2 = ".jpg"
            if (r0 != r1) goto L_0x0022
            r1 = 77
            if (r3 != r1) goto L_0x0022
            java.lang.String r2 = ".bmp"
            goto L_0x0040
        L_0x0022:
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x002b
            r1 = 216(0xd8, float:3.03E-43)
            if (r3 != r1) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            r1 = 137(0x89, float:1.92E-43)
            if (r0 != r1) goto L_0x0036
            r1 = 80
            if (r3 != r1) goto L_0x0036
            java.lang.String r2 = ".png"
            goto L_0x0040
        L_0x0036:
            r1 = 71
            if (r0 != r1) goto L_0x0040
            r0 = 73
            if (r3 != r0) goto L_0x0040
            java.lang.String r2 = ".gif"
        L_0x0040:
            return r2
        L_0x0041:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ImgUtil.identifyImgType(byte[]):java.lang.String");
    }

    public static boolean isGif(String str) {
        InputStream inputStream = null;
        try {
            InputStream E = C86013q1.m106423E(str);
            byte[] bArr = new byte[6];
            String str2 = "";
            E.read(bArr);
            for (int i = 0; i < 6; i++) {
                str2 = str2 + ((char) bArr[i]);
            }
            if (!str2.startsWith("GIF")) {
                try {
                    E.close();
                } catch (IOException unused) {
                }
                return false;
            }
            try {
                E.close();
                return true;
            } catch (IOException unused2) {
                return true;
            }
        } catch (Exception unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static boolean isWXGF(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        String str = "";
        int i = 0;
        while (i < 8) {
            try {
                str = str + ((char) byteArrayInputStream.read());
                i++;
            } catch (IOException unused) {
                return false;
            }
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused2) {
        }
        if (!str.startsWith("wxgf")) {
            return false;
        }
        return true;
    }

    public static boolean isGif(Context context, int i) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            String str = "";
            int i2 = 0;
            while (i2 < 6) {
                try {
                    str = str + ((char) openRawResource.read());
                    i2++;
                } catch (IOException unused) {
                    return false;
                }
            }
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (IOException unused2) {
                }
            }
            if (!str.startsWith("GIF")) {
                return false;
            }
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }
}
