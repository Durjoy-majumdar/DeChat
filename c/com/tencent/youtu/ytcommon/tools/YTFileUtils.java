package com.tencent.youtu.ytcommon.tools;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class YTFileUtils {
    private YTFileUtils() {
        throw new AssertionError();
    }

    public static boolean copyAsset(AssetManager assetManager, String str, String str2) {
        try {
            InputStream open = assetManager.open(str);
            new File(str2).createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            copyFile(open, fileOutputStream);
            open.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void copyFileOrDir(AssetManager assetManager, String str, String str2) {
        String str3;
        try {
            String[] list = assetManager.list(str);
            if (list.length == 0) {
                copyAsset(assetManager, str, str2 + "/" + str);
                return;
            }
            String str4 = File.separator;
            if (str2.endsWith(str4)) {
                str3 = str2 + str;
            } else {
                str3 = str2 + str4 + str;
            }
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdir();
            }
            for (int i = 0; i < list.length; i++) {
                copyFileOrDir(assetManager, str + "/" + list[i], str2);
            }
        } catch (IOException unused) {
        }
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static String getLastPathComponent(String str) {
        String[] split = str.split("/");
        return split.length == 0 ? "" : split[split.length - 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[SYNTHETIC, Splitter:B:26:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.StringBuilder readAssetFile(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "IOException occurred. "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            r3 = 0
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004c }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ IOException -> 0x004c }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ IOException -> 0x004c }
            java.io.InputStream r5 = r5.open(r6)     // Catch:{ IOException -> 0x004c }
            r4.<init>(r5)     // Catch:{ IOException -> 0x004c }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004c }
            r5.<init>(r4)     // Catch:{ IOException -> 0x004c }
        L_0x0020:
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            if (r6 == 0) goto L_0x0039
            java.lang.String r3 = r1.toString()     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = "\r\n"
            r1.append(r3)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
        L_0x0035:
            r1.append(r6)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            goto L_0x0020
        L_0x0039:
            r5.close()     // Catch:{ IOException -> 0x003d }
            return r1
        L_0x003d:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0, r5)
            throw r6
        L_0x0044:
            r6 = move-exception
            r3 = r5
            goto L_0x0053
        L_0x0047:
            r6 = move-exception
            r3 = r5
            goto L_0x004d
        L_0x004a:
            r6 = move-exception
            goto L_0x0053
        L_0x004c:
            r6 = move-exception
        L_0x004d:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x004a }
            r5.<init>(r0, r6)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x0053:
            if (r3 == 0) goto L_0x0060
            r3.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0060
        L_0x0059:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0, r5)
            throw r6
        L_0x0060:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.ytcommon.tools.YTFileUtils.readAssetFile(android.content.Context, java.lang.String):java.lang.StringBuilder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[SYNTHETIC, Splitter:B:28:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.StringBuilder readFile(java.lang.String r6) {
        /*
            java.lang.String r0 = "IOException occurred. "
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r6.<init>(r2)
            boolean r3 = r1.isFile()
            r4 = 0
            if (r3 != 0) goto L_0x0016
            return r4
        L_0x0016:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0051 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0051 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0051 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0051 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0051 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0051 }
        L_0x0025:
            java.lang.String r3 = r1.readLine()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            if (r3 == 0) goto L_0x003e
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            boolean r4 = r4.equals(r2)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = "\r\n"
            r6.append(r4)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
        L_0x003a:
            r6.append(r3)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            goto L_0x0025
        L_0x003e:
            r1.close()     // Catch:{ IOException -> 0x0042 }
            return r6
        L_0x0042:
            r6 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r6)
            throw r1
        L_0x0049:
            r6 = move-exception
            r4 = r1
            goto L_0x0058
        L_0x004c:
            r6 = move-exception
            r4 = r1
            goto L_0x0052
        L_0x004f:
            r6 = move-exception
            goto L_0x0058
        L_0x0051:
            r6 = move-exception
        L_0x0052:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x004f }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x004f }
            throw r1     // Catch:{ all -> 0x004f }
        L_0x0058:
            if (r4 == 0) goto L_0x0065
            r4.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0065
        L_0x005e:
            r6 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r6)
            throw r1
        L_0x0065:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.ytcommon.tools.YTFileUtils.readFile(java.lang.String):java.lang.StringBuilder");
    }

    public static boolean zipFileAtPath(String str, String str2) {
        File file = new File(str);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            if (!file.isDirectory()) {
                byte[] bArr = new byte[2048];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str), 2048);
                zipOutputStream.putNextEntry(new ZipEntry(getLastPathComponent(str)));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } else {
                zipSubFolder(zipOutputStream, file, file.getParent().length());
            }
            zipOutputStream.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void zipSubFolder(ZipOutputStream zipOutputStream, File file, int i) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                zipSubFolder(zipOutputStream, file2, i);
            } else {
                byte[] bArr = new byte[2048];
                String path = file2.getPath();
                String substring = path.substring(i);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path), 2048);
                zipOutputStream.putNextEntry(new ZipEntry(substring));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                bufferedInputStream.close();
            }
        }
    }
}
