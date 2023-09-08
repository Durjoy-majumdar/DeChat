package com.tencent.p014mm.sdk.system;

import a70.C112760b;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;
import p914oj.C89231c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sdk.system.AndroidMediaUtil */
public class AndroidMediaUtil {
    private static final String TAG = "Luggage.AndroidMediaUtil";

    private static int getExifOrientation(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105918d(TAG, "filepath is null or nil");
            return 0;
        } else if (C86013q1.m106450k(str)) {
            return Exif.fromFile(str).getOrientationInDegree();
        } else {
            Log.m105919d(TAG, "file not exist:[%s]", str);
            return 0;
        }
    }

    public static String getExportImagePath(String str) {
        return getSysCameraDirPath() + String.format(Locale.US, "%s%d.%s", new Object[]{"mmexport", Long.valueOf(System.currentTimeMillis()), str});
    }

    public static String getExportVideoPath(String str) {
        if (Build.VERSION.SDK_INT > 29) {
            return getExportImagePath(str);
        }
        return C112760b.m154245q() + String.format(Locale.US, "%s%d.%s", new Object[]{"mmexport", Long.valueOf(System.currentTimeMillis()), str});
    }

    public static String getFriendlySdcardPath(String str) {
        String str2;
        String str3;
        StringBuilder sb;
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            str2 = new File(str).getCanonicalPath();
        } catch (Throwable unused) {
            str2 = str;
        }
        int i = -1;
        if (str2.startsWith(C112760b.m154228e0())) {
            i = C112760b.m154228e0().length();
        } else if (str2.startsWith(C112760b.m154217Y())) {
            i = C112760b.m154217Y().length();
        }
        if (i < 0) {
            return str;
        }
        String substring = str.substring(i);
        if (substring.startsWith("/")) {
            sb = new StringBuilder();
            str3 = "/sdcard";
        } else {
            sb = new StringBuilder();
            str3 = "/sdcard/";
        }
        sb.append(str3);
        sb.append(substring);
        return sb.toString();
    }

    private static BitmapFactory.Options getImageOptionsJustDecodeBounds(String str) {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = C86013q1.m106423E(str);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                MMBitmapFactory.m98738g(inputStream, (Rect) null, options);
                Util.qualityClose(inputStream);
                return options;
            } catch (FileNotFoundException unused) {
                Util.qualityClose(inputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(inputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            inputStream = null;
            Util.qualityClose(inputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            Util.qualityClose(inputStream);
            throw th;
        }
    }

    public static String getSysCameraDirPath() {
        return C112760b.m154240l();
    }

    public static String getToastSysCameraPath() {
        String f0 = C112760b.m154230f0();
        String absolutePath = f0.startsWith(C112760b.m154228e0()) ? new File(f0).getParentFile().getParentFile().getParentFile().getAbsolutePath() : C112760b.m154217Y();
        try {
            absolutePath = new File(absolutePath).getCanonicalPath();
        } catch (Throwable unused) {
        }
        String i = C86013q1.m106448i(getSysCameraDirPath(), true);
        int indexOf = i.indexOf(absolutePath);
        if (indexOf < 0) {
            return i;
        }
        String substring = i.substring(indexOf + absolutePath.length());
        if (substring.startsWith("/")) {
            return "/sdcard" + substring;
        }
        return "/sdcard/" + substring;
    }

    public static void insertPathIntoMediaStore(Context context, String str) {
        updateMediaDatabase(context, str);
    }

    public static void insertPathIntoMediaStoreAsync(final Context context, final String str) {
        ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
            public void run() {
                AndroidMediaUtil.insertPathIntoMediaStore(context, str);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r6 = r6.f348991a.mo119945q(r6.f348992b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void refreshMediaScanner(java.lang.String r9, android.content.Context r10) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r9, r0)
            java.lang.String r2 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r3 = 0
            java.lang.String r4 = "Luggage.AndroidMediaUtil"
            r5 = 1
            if (r1 == 0) goto L_0x0089
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r7 = r6.getPath()
            if (r7 == 0) goto L_0x0038
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r0, r0)
            java.lang.String r8 = r6.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0038
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r7)
            android.net.Uri r6 = r6.build()
        L_0x0038:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r6 = r7.mo177799l(r6, r3)
            boolean r7 = r6.mo177810a()
            if (r7 != 0) goto L_0x0045
            goto L_0x0055
        L_0x0045:
            com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            com.tencent.mm.vfs.b0 r6 = r7.mo119945q(r6)
            if (r6 == 0) goto L_0x0055
            boolean r6 = r6.f250476f
            if (r6 == 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            if (r6 == 0) goto L_0x0063
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r0] = r1
            java.lang.String r10 = "refreshMediaScanner error for path isDirectory.%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r10, r9)
            return
        L_0x0063:
            updateMediaDatabase(r10, r1)     // Catch:{ all -> 0x0067 }
            goto L_0x006f
        L_0x0067:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = "Cannot update media database"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r6, r8, r7)
        L_0x006f:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Exception -> 0x0081 }
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0081 }
            r7.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0081 }
            android.net.Uri r7 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r10, r7)     // Catch:{ Exception -> 0x0081 }
            r6.<init>(r2, r7)     // Catch:{ Exception -> 0x0081 }
            r10.sendBroadcast(r6)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r6, r8, r7)
        L_0x0089:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r9
            java.lang.String r7 = "refreshing media scanner on path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r6 <= r8) goto L_0x00bc
            java.lang.String r2 = com.tencent.p014mm.sdk.system.MimeTypeUtil.getMimeTypeByFilePath(r9)     // Catch:{ all -> 0x00ad }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x00ad }
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x00ad }
            r6[r0] = r1     // Catch:{ all -> 0x00ad }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x00ad }
            r1[r0] = r2     // Catch:{ all -> 0x00ad }
            android.media.MediaScannerConnection.scanFile(r10, r6, r1, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00bb
        L_0x00ad:
            r10 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r1[r5] = r10
            java.lang.String r9 = "refresh by MediaScannerConnection, path = %s, thr = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r9, r1)
        L_0x00bb:
            return
        L_0x00bc:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r9)
            android.net.Uri r1 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r10, r1)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2, r1)
            android.content.Intent r1 = r3.addFlags(r5)
            r10.sendBroadcast(r1)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r0] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.system.AndroidMediaUtil.refreshMediaScanner(java.lang.String, android.content.Context):void");
    }

    public static void refreshMediaScannerAsync(final String str, final Context context) {
        ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
            public void run() {
                AndroidMediaUtil.refreshMediaScanner(str, context);
            }
        });
    }

    public static void refreshMediaScannerWithoutVFSRemap(String str, Context context) {
        if (!Util.isNullOrNil(str)) {
            try {
                updateMediaDatabase(context, str);
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "Cannot update media database", new Object[0]);
            }
            try {
                context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", FileProviderHelper.getUriForFileWithoutVFSRemap(context, new File(str))));
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
            Log.m105925i(TAG, "refreshing media scanner on path=%s", str);
            if (Build.VERSION.SDK_INT > 28) {
                try {
                    String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(str);
                    MediaScannerConnection.scanFile(context.getApplicationContext(), new String[]{str}, new String[]{mimeTypeByFilePath}, (MediaScannerConnection.OnScanCompletedListener) null);
                } catch (Throwable th4) {
                    Log.m105921e(TAG, "refresh by MediaScannerConnection, path = %s, thr = %s", str, th4);
                }
            } else {
                context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", FileProviderHelper.getUriForFileWithoutVFSRemap(context, new File(str))).addFlags(1));
                Log.m105925i(TAG, "refreshing media scanner on path=%s", str);
            }
        }
    }

    public static void refreshMediaScannerWithoutVFSRemapAsync(final String str, final Context context) {
        ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
            public void run() {
                AndroidMediaUtil.refreshMediaScannerWithoutVFSRemap(str, context);
            }
        });
    }

    private static void updateMediaDatabase(Context context, String str) {
        Uri uri;
        try {
            String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(str);
            if (mimeTypeByFilePath != null) {
                ContentValues contentValues = new ContentValues();
                if (mimeTypeByFilePath.contains("image")) {
                    uri = MediaStore.Images.Media.getContentUri("external");
                    BitmapFactory.Options imageOptionsJustDecodeBounds = getImageOptionsJustDecodeBounds(str);
                    if (imageOptionsJustDecodeBounds != null) {
                        contentValues.put("width", Integer.valueOf(imageOptionsJustDecodeBounds.outWidth));
                        contentValues.put("height", Integer.valueOf(imageOptionsJustDecodeBounds.outHeight));
                        if (mimeTypeByFilePath.contains("jpeg") || mimeTypeByFilePath.contains("jpg")) {
                            contentValues.put("orientation", Integer.valueOf(getExifOrientation(str)));
                        }
                    } else {
                        return;
                    }
                } else if (mimeTypeByFilePath.contains("video")) {
                    uri = MediaStore.Video.Media.getContentUri("external");
                    C89231c cVar = new C89231c();
                    cVar.setDataSource(str);
                    contentValues.put("width", cVar.extractMetadata(18));
                    contentValues.put("height", cVar.extractMetadata(19));
                    contentValues.put("duration", cVar.extractMetadata(9));
                    contentValues.put("orientation", cVar.extractMetadata(24));
                } else {
                    uri = MediaStore.Files.getContentUri("external");
                }
                String i = C86013q1.m106448i(str, false);
                if (i == null) {
                    i = str;
                }
                contentValues.put("_data", i);
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                String path2 = n.getPath();
                int lastIndexOf = path2.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    path2 = path2.substring(lastIndexOf + 1);
                }
                contentValues.put("_display_name", path2);
                contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, C86013q1.m106457r(str));
                contentValues.put("_size", Long.valueOf(C86013q1.m106451l(str)));
                contentValues.put("mime_type", mimeTypeByFilePath);
                context.getContentResolver().insert(uri, contentValues);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "[-] Failed when updateMediaDatabase", new Object[0]);
        }
    }
}
