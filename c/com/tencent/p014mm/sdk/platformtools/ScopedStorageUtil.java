package com.tencent.p014mm.sdk.platformtools;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.tencent.p014mm.vfs.C86012p1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil */
public final class ScopedStorageUtil {
    private static final String TAG = "MicroMsg.ScopedStorageUtil";
    /* access modifiers changed from: private */
    public static boolean sCheckMediaStorePathRenamed = false;
    private static boolean sUseMediaStoreInApi29 = true;
    private static boolean sUseMediaStoreInDualApp = true;

    /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$WorkProfiles */
    public static final class WorkProfiles {
        public static final String PROFILE_HOST = "host";
        public static final String PROFILE_WORK = "work";
        private static AtomicBoolean sIsDualAppUser;

        public static String getAppProfile(Context context) {
            List<ComponentName> activeAdmins;
            try {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                if (devicePolicyManager == null || (activeAdmins = devicePolicyManager.getActiveAdmins()) == null) {
                    return "host";
                }
                for (ComponentName packageName : activeAdmins) {
                    if (devicePolicyManager.isProfileOwnerApp(packageName.getPackageName())) {
                        return PROFILE_WORK;
                    }
                }
                return "host";
            } catch (Exception unused) {
                return "host";
            }
        }

        public static int getAppUserId() {
            return Process.myUserHandle().hashCode();
        }

        public static List<Integer> getAppUserIds(Context context) {
            ArrayList arrayList = new ArrayList();
            try {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    for (UserHandle hashCode : userManager.getUserProfiles()) {
                        arrayList.add(Integer.valueOf(hashCode.hashCode()));
                    }
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        }

        public static String getAppUserInfo(Context context) {
            int appUserId = getAppUserId();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(appUserId));
            int i = -1;
            try {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    for (UserHandle next : userManager.getUserProfiles()) {
                        if (!arrayList.contains(Integer.valueOf(next.hashCode()))) {
                            arrayList.add(Integer.valueOf(next.hashCode()));
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        i = userManager.isSystemUser();
                    }
                }
            } catch (Throwable unused) {
            }
            Iterator it = arrayList.iterator();
            String str = "";
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (!TextUtils.isEmpty(str)) {
                    str = str + "|";
                }
                str = str + num;
            }
            return str + " sys(" + i + ")";
        }

        public static boolean isRunningInDualApp(Context context) {
            if (sIsDualAppUser == null) {
                sIsDualAppUser = new AtomicBoolean(isRunningInDualAppImpl(context));
            }
            return sIsDualAppUser.get();
        }

        public static boolean isRunningInDualAppImpl(Context context) {
            if (getAppUserId() == 0 || getAppUserIds(context).size() <= 1) {
                return false;
            }
            return "host".equals(getAppProfile(context));
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$Exports */
    public static final class Exports {
        public static OutputStream getDownloadsOutputStream(Context context, String str) {
            return Build.VERSION.SDK_INT >= 29 ? getOutputStream(context, str, MediaStore.Downloads.EXTERNAL_CONTENT_URI) : getOutputStream(context, str, (Uri) null);
        }

        public static OutputStream getFilesOutputStream(Context context, String str) {
            return Build.VERSION.SDK_INT >= 29 ? getOutputStream(context, str, MediaStore.Files.getContentUri("external")) : getOutputStream(context, str, (Uri) null);
        }

        @Deprecated
        public static OutputStream getImageOutputStream(Context context, String str) {
            return getOutputStream(context, str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.io.OutputStream getOutputStream(android.content.Context r2, java.lang.String r3, android.net.Uri r4) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "#getFileOutputStream: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.ScopedStorageUtil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                if (r4 == 0) goto L_0x003c
                boolean r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.shouldUseMediaStore(r2)
                if (r0 == 0) goto L_0x003c
                java.io.OutputStream r2 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.MediaStoreOps.getOutputStream(r2, r3, r4)     // Catch:{ Exception -> 0x0023 }
                goto L_0x003d
            L_0x0023:
                r2 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "getMediaStoreOutputStream fail: "
                r4.append(r0)
                java.lang.String r2 = r2.getMessage()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            L_0x003c:
                r2 = 0
            L_0x003d:
                if (r2 != 0) goto L_0x005e
                r4 = 0
                java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r3, r4)     // Catch:{ Exception -> 0x0045 }
                return r2
            L_0x0045:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "getFileOutputStream fail: "
                r4.append(r0)
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            L_0x005e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Exports.getOutputStream(android.content.Context, java.lang.String, android.net.Uri):java.io.OutputStream");
        }

        @Deprecated
        public static OutputStream getVideoOutputStream(Context context, String str) {
            return getOutputStream(context, str, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }

        public static boolean saveDownloads(Context context, String str, String str2) {
            return Build.VERSION.SDK_INT >= 29 ? saveFile(context, str, str2, MediaStore.Downloads.EXTERNAL_CONTENT_URI) : saveFile(context, str, str2, (Uri) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean saveFile(android.content.Context r3, java.lang.String r4, java.lang.String r5, android.net.Uri r6) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "#saveImage: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " >> "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.ScopedStorageUtil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 0
                if (r6 == 0) goto L_0x004b
                boolean r2 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.shouldUseMediaStore(r3)
                if (r2 == 0) goto L_0x004b
                java.lang.String r2 = "Try save with MediaStore"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0031 }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.MediaStoreOps.saveFile(r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
                goto L_0x004c
            L_0x0031:
                r3 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = "saveWithMediaStore fail: "
                r6.append(r2)
                java.lang.String r3 = r3.getMessage()
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            L_0x004b:
                r3 = 0
            L_0x004c:
                if (r3 != 0) goto L_0x0079
                java.lang.String r6 = "Try save with BIO"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x005f }
                long r4 = com.tencent.p014mm.vfs.C86013q1.m106443d(r4, r5, r0)     // Catch:{ Exception -> 0x005f }
                r0 = 0
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 < 0) goto L_0x0079
                r3 = 1
                goto L_0x0079
            L_0x005f:
                r4 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "saveWithBio fail: "
                r5.append(r6)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            L_0x0079:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Exports.saveFile(android.content.Context, java.lang.String, java.lang.String, android.net.Uri):boolean");
        }

        public static boolean saveFiles(Context context, String str, String str2) {
            return Build.VERSION.SDK_INT >= 29 ? saveFile(context, str, str2, MediaStore.Files.getContentUri("external")) : saveFile(context, str, str2, (Uri) null);
        }

        public static boolean saveImage(Context context, String str, String str2) {
            return saveFile(context, str, str2, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        public static boolean saveVideo(Context context, String str, String str2) {
            return saveFile(context, str, str2, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }

        public static void getImageOutputStream(final Context context, final String str, final MediaStoreOps.Callback callback) {
            MediaStoreOps.tryInsert(context, str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new MediaStoreOps.Callback() {
                public void onFail(MediaStoreOps.Controller controller) {
                    String str = str;
                    if (str.contains("/" + context.getPackageName() + "/")) {
                        onSuccess(new MediaStoreOps.Controller.FileController(str));
                        return;
                    }
                    super.onFail(controller);
                    MediaStoreOps.Callback.this.onFail(controller);
                }

                public void onSuccess(MediaStoreOps.Controller controller) {
                    MediaStoreOps.Callback.this.onSuccess(controller);
                }

                public boolean shouldAddPendingStats() {
                    return true;
                }
            });
        }

        public static void getVideoOutputStream(final Context context, final String str, final MediaStoreOps.Callback callback) {
            MediaStoreOps.tryInsert(context, str, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new MediaStoreOps.Callback() {
                public void onFail(MediaStoreOps.Controller controller) {
                    String str = str;
                    if (str.contains("/" + context.getPackageName() + "/")) {
                        onSuccess(new MediaStoreOps.Controller.FileController(str));
                        return;
                    }
                    super.onFail(controller);
                    MediaStoreOps.Callback.this.onFail(controller);
                }

                public void onSuccess(MediaStoreOps.Controller controller) {
                    MediaStoreOps.Callback.this.onSuccess(controller);
                }

                public boolean shouldAddPendingStats() {
                    return true;
                }
            });
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$Imports */
    public static final class Imports {
        public static Uri getDownloadsExternalUri(Context context, String str) {
            if (Build.VERSION.SDK_INT >= 29) {
                return getExternalUri(context, str, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
            }
            return null;
        }

        private static Uri getExternalUri(Context context, String str, Uri uri) {
            Log.m105924i(ScopedStorageUtil.TAG, "#getExternalUri: " + str);
            if (uri == null || !ScopedStorageUtil.shouldUseMediaStore(context) || TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return MediaStoreOps.pathToUri(context, str, uri);
            } catch (Exception e) {
                Log.m105928w(ScopedStorageUtil.TAG, "getExternalUri fail: " + e.getMessage());
                return null;
            }
        }

        public static Uri getFilesExternalUri(Context context, String str) {
            if (Build.VERSION.SDK_INT >= 29) {
                return getExternalUri(context, str, MediaStore.Files.getContentUri("external"));
            }
            return null;
        }

        public static Uri getImageExternalUri(Context context, String str) {
            return getExternalUri(context, str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        public static Uri getVideoExternalUri(Context context, String str) {
            return getExternalUri(context, str, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }

        public static Uri getImageExternalUri(Context context, long j) {
            return getExternalUri(context, j, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        private static Uri getExternalUri(Context context, long j, Uri uri) {
            Log.m105924i(ScopedStorageUtil.TAG, "#getExternalUri: " + j);
            if (uri == null || !ScopedStorageUtil.shouldUseMediaStore(context)) {
                return null;
            }
            try {
                return MediaStoreOps.idToUri(context, j, uri);
            } catch (Exception e) {
                Log.m105928w(ScopedStorageUtil.TAG, "getExternalUri fail: " + e.getMessage());
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps */
    public static final class MediaStoreOps {

        /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps$Callback */
        public static abstract class Callback {
            public void onFail(Controller controller) {
                if (controller != null) {
                    controller.delete();
                }
            }

            public abstract void onSuccess(Controller controller);

            public boolean shouldAddPendingStats() {
                return false;
            }
        }

        /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps$Controller */
        public static class Controller {
            public final ContentResolver resolver;
            public final Uri uri;

            /* renamed from: com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps$Controller$FileController */
            public static class FileController extends Controller {
                public final String filePath;

                public FileController(String str) {
                    super((ContentResolver) null, (Uri) null);
                    this.filePath = str;
                }

                public void delete() {
                    C86013q1.m106447h(this.filePath);
                }

                public String getFilePath(Context context) {
                    return this.filePath;
                }

                public OutputStream getOutputStream() {
                    try {
                        return C86013q1.m106429K(this.filePath, false);
                    } catch (FileNotFoundException e) {
                        Log.m105928w(ScopedStorageUtil.TAG, "VFSFileOp openWrite fail: " + e.getMessage());
                        return null;
                    }
                }

                public void removePendingStats() {
                }
            }

            public Controller(ContentResolver contentResolver, Uri uri2) {
                this.resolver = contentResolver;
                this.uri = uri2;
            }

            public void delete() {
                try {
                    this.resolver.delete(this.uri, (String) null, (String[]) null);
                } catch (Throwable th) {
                    Log.m105928w(ScopedStorageUtil.TAG, "MediaStore delete fail: " + th.getMessage());
                }
            }

            public String getFilePath(Context context) {
                return MediaStoreOps.uriToPath(context, this.uri);
            }

            public OutputStream getOutputStream() {
                try {
                    return this.resolver.openOutputStream(this.uri);
                } catch (FileNotFoundException e) {
                    Log.m105928w(ScopedStorageUtil.TAG, "MediaStore getOutputStream fail: " + e.getMessage());
                    return null;
                }
            }

            public void removePendingStats() {
                if (Build.VERSION.SDK_INT >= 30) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("is_pending", 0);
                        this.resolver.update(this.uri, contentValues, (Bundle) null);
                    } catch (Exception e) {
                        Log.m105928w(ScopedStorageUtil.TAG, "MediaStore update uri pending failed: " + e.getMessage());
                    }
                }
            }
        }

        public static boolean deleteWithMediaStore(Context context, Uri uri) {
            try {
                context.getContentResolver().delete(uri, (String) null, (String[]) null);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static OutputStream getOutputStream(Context context, String str, Uri uri) {
            final OutputStream[] outputStreamArr = {null};
            tryInsert(context, str, uri, new Callback() {
                public void onFail(Controller controller) {
                    super.onFail(controller);
                    outputStreamArr[0] = null;
                }

                public void onSuccess(Controller controller) {
                    outputStreamArr[0] = controller.getOutputStream();
                    if (outputStreamArr[0] == null) {
                        onFail(controller);
                    }
                }

                public boolean shouldAddPendingStats() {
                    return false;
                }
            });
            return outputStreamArr[0];
        }

        /* access modifiers changed from: private */
        public static Uri idToUri(Context context, long j, Uri uri) {
            if (uri == null) {
                return null;
            }
            if (MediaStore.Images.Media.EXTERNAL_CONTENT_URI.equals(uri) || MediaStore.Video.Media.EXTERNAL_CONTENT_URI.equals(uri) || MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.equals(uri) || (Build.VERSION.SDK_INT >= 29 && (MediaStore.Downloads.EXTERNAL_CONTENT_URI.equals(uri) || MediaStore.Files.getContentUri("external").equals(uri)))) {
                return Uri.withAppendedPath(uri, String.valueOf(j));
            }
            Log.m105928w(ScopedStorageUtil.TAG, "#pathToUri unsupported contentUri: " + uri);
            return null;
        }

        private static boolean isDownloadsDocument(Uri uri) {
            return "com.android.providers.downloads.documents".equals(uri.getAuthority());
        }

        private static boolean isExternalStorageDocument(Uri uri) {
            return "com.android.externalstorage.documents".equals(uri.getAuthority());
        }

        private static boolean isGooglePhotosUri(Uri uri) {
            return "com.google.android.apps.photos.content".equals(uri.getAuthority());
        }

        private static boolean isMediaDocument(Uri uri) {
            return "com.android.providers.media.documents".equals(uri.getAuthority());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            r0 = (r0 = r3.indexOf("/sdcard/")) + 8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean isPathRenamed(java.lang.String r3, java.lang.String r4) {
            /*
                java.io.File r0 = new java.io.File
                r0.<init>(r3)
                java.io.File r1 = new java.io.File
                r1.<init>(r4)
                boolean r0 = r0.equals(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0012
                return r1
            L_0x0012:
                java.lang.String r0 = "/sdcard/"
                boolean r2 = r3.startsWith(r0)
                if (r2 == 0) goto L_0x0033
                int r0 = r3.indexOf(r0)
                if (r0 < 0) goto L_0x0033
                int r0 = r0 + 8
                int r2 = r3.length()
                if (r0 >= r2) goto L_0x0033
                java.lang.String r3 = r3.substring(r0)
                boolean r3 = r4.endsWith(r3)
                if (r3 == 0) goto L_0x0033
                return r1
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.MediaStoreOps.isPathRenamed(java.lang.String, java.lang.String):boolean");
        }

        /* access modifiers changed from: private */
        public static Uri pathToUri(Context context, String str, Uri uri) {
            Cursor query;
            if (!TextUtils.isEmpty(str) && uri != null) {
                if (MediaStore.Images.Media.EXTERNAL_CONTENT_URI.equals(uri) || MediaStore.Video.Media.EXTERNAL_CONTENT_URI.equals(uri) || MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.equals(uri) || (Build.VERSION.SDK_INT >= 29 && (MediaStore.Downloads.EXTERNAL_CONTENT_URI.equals(uri) || MediaStore.Files.getContentUri("external").equals(uri)))) {
                    try {
                        Uri uri2 = uri;
                        query = context.getContentResolver().query(uri2, new String[]{"_id"}, "_data=? ", new String[]{str}, (String) null);
                        if (query != null) {
                            if (query.moveToFirst()) {
                                Uri withAppendedPath = Uri.withAppendedPath(uri, String.valueOf(query.getInt(query.getColumnIndexOrThrow("_id"))));
                                query.close();
                                return withAppendedPath;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                    } catch (Throwable th) {
                        Log.printErrStackTrace(ScopedStorageUtil.TAG, th, "convert pathToUri fail", new Object[0]);
                    }
                } else {
                    Log.m105928w(ScopedStorageUtil.TAG, "#pathToUri unsupported contentUri: " + uri);
                    return null;
                }
            }
            return null;
            throw th;
        }

        public static boolean saveFile(Context context, final String str, String str2, Uri uri) {
            final boolean[] zArr = {false};
            tryInsert(context, str2, uri, new Callback() {
                public void onFail(Controller controller) {
                    super.onFail(controller);
                    zArr[0] = false;
                }

                public void onSuccess(Controller controller) {
                    C86012p1 p1Var;
                    try {
                        OutputStream outputStream = controller.getOutputStream();
                        if (outputStream != null) {
                            try {
                                p1Var = new C86012p1(str);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = p1Var.read(bArr);
                                    if (-1 == read) {
                                        break;
                                    }
                                    outputStream.write(bArr, 0, read);
                                }
                                zArr[0] = true;
                                p1Var.close();
                                outputStream.close();
                                if (!shouldAddPendingStats()) {
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                throw th;
                            }
                        } else {
                            throw new IOException("Open file fail");
                        }
                        throw th;
                    } catch (Exception e) {
                        try {
                            Log.printErrStackTrace(ScopedStorageUtil.TAG, e, "copyFile fail", new Object[0]);
                            onFail(controller);
                        } finally {
                            if (shouldAddPendingStats()) {
                                controller.removePendingStats();
                            }
                        }
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                }

                public boolean shouldAddPendingStats() {
                    return true;
                }
            });
            return zArr[0];
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void tryInsert(android.content.Context r12, java.lang.String r13, android.net.Uri r14, com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.MediaStoreOps.Callback r15) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "#tryInsert with MediaStore: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.ScopedStorageUtil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                r3 = 0
                if (r0 >= r2) goto L_0x0026
                java.lang.String r12 = "MediaStore SDK_INT not meet"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
                r15.onFail(r3)
                return
            L_0x0026:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                r5 = 2
                r6 = 1
                r7 = 0
                if (r4 != 0) goto L_0x0035
                boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
                if (r4 == 0) goto L_0x0049
            L_0x0035:
                java.lang.Throwable r4 = new java.lang.Throwable
                r4.<init>()
                java.lang.String[] r8 = new java.lang.String[r5]
                java.lang.String r9 = r14.toString()
                r8[r7] = r9
                r8[r6] = r13
                java.lang.String r9 = "MediaStoreInsert"
                p988jj.C87968a.C87969a.C87970a.m109467a(r9, r4, r3, r8)
            L_0x0049:
                android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                boolean r4 = r4.equals(r14)
                if (r4 == 0) goto L_0x0054
                java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
                goto L_0x0070
            L_0x0054:
                android.net.Uri r4 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                boolean r4 = r4.equals(r14)
                if (r4 == 0) goto L_0x0064
                if (r0 <= r2) goto L_0x0061
                java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
                goto L_0x0070
            L_0x0061:
                java.lang.String r2 = android.os.Environment.DIRECTORY_DCIM
                goto L_0x0070
            L_0x0064:
                android.net.Uri r2 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x006f
                java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS
                goto L_0x0070
            L_0x006f:
                r2 = r3
            L_0x0070:
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                if (r4 == 0) goto L_0x0096
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "MediaStore CONTENT_URI not meet: "
                r12.append(r0)
                r12.append(r14)
                java.lang.String r14 = ", dest="
                r12.append(r14)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
                r15.onFail(r3)
                return
            L_0x0096:
                java.lang.String r4 = com.tencent.p014mm.sdk.system.MimeTypeUtil.getMimeTypeByFilePath(r13)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106457r(r13)
                r8.append(r9)
                java.lang.String r9 = "."
                r8.append(r9)
                java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106454o(r13)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                boolean r9 = android.text.TextUtils.isEmpty(r4)
                if (r9 == 0) goto L_0x00d2
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "#getOutputStream unsupported media type, path = "
                r4.append(r9)
                r4.append(r13)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
                java.lang.String r4 = "application/octet-stream"
            L_0x00d2:
                boolean r9 = r13.contains(r2)
                if (r9 == 0) goto L_0x00fd
                int r9 = r13.indexOf(r2)
                int r10 = r2.length()
                int r9 = r9 + r10
                java.lang.String r10 = java.io.File.separator
                int r10 = r13.lastIndexOf(r10)
                if (r9 >= r10) goto L_0x00fd
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r2)
                java.lang.String r2 = r13.substring(r9, r10)
                r11.append(r2)
                java.lang.String r2 = r11.toString()
                goto L_0x00fe
            L_0x00fd:
                r2 = r3
            L_0x00fe:
                boolean r9 = android.text.TextUtils.isEmpty(r2)
                if (r9 == 0) goto L_0x014a
                java.lang.String r12 = "MediaStore RELATIVE_PATH not meet"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
                r15.onFail(r3)
                boolean r12 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r12 != 0) goto L_0x0118
                boolean r12 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
                if (r12 == 0) goto L_0x0132
            L_0x0118:
                java.lang.Throwable r12 = new java.lang.Throwable
                r12.<init>()
                java.lang.String[] r15 = new java.lang.String[r5]
                java.lang.String r14 = r14.toString()
                r15[r7] = r14
                r15[r6] = r13
                java.lang.String r14 = "MediaStoreUnsupported"
                p988jj.C87968a.C87969a.C87970a.m109467a(r14, r12, r3, r15)
                boolean r12 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r12 != 0) goto L_0x0133
            L_0x0132:
                return
            L_0x0133:
                java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "MediaStore is unsupported for path: "
                r14.append(r15)
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                r12.<init>(r13)
                throw r12
            L_0x014a:
                android.content.ContentValues r9 = new android.content.ContentValues
                r9.<init>()
                java.lang.String r10 = "mime_type"
                r9.put(r10, r4)
                java.lang.String r4 = "_display_name"
                r9.put(r4, r8)
                java.lang.String r4 = "relative_path"
                r9.put(r4, r2)
                boolean r2 = r15.shouldAddPendingStats()
                if (r2 == 0) goto L_0x0174
                r2 = 30
                if (r0 < r2) goto L_0x0174
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                java.lang.String r2 = "is_pending"
                r9.put(r2, r0)
            L_0x0174:
                android.content.ContentResolver r0 = r12.getContentResolver()
                android.net.Uri r14 = r0.insert(r14, r9)     // Catch:{ all -> 0x017d }
                goto L_0x0186
            L_0x017d:
                r14 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r4 = "MediaStore insert err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r14, r4, r2)
                r14 = r3
            L_0x0186:
                if (r14 != 0) goto L_0x0190
                java.lang.String r12 = "MediaStore insert fail: uri is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
            L_0x018d:
                r6 = 0
                goto L_0x0218
            L_0x0190:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "MediaStore insert success: "
                r2.append(r4)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps$Controller r2 = new com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps$Controller
                r2.<init>(r0, r14)
                r15.onSuccess(r2)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.sCheckMediaStorePathRenamed
                if (r0 == 0) goto L_0x0217
                java.lang.String r0 = r2.getFilePath(r12)
                boolean r4 = android.text.TextUtils.isEmpty(r0)
                if (r4 != 0) goto L_0x01d7
                boolean r4 = isPathRenamed(r13, r0)
                if (r4 != 0) goto L_0x01d7
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "MediaStore Ops is COMPATIBLE: "
                r12.append(r0)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
                goto L_0x0217
            L_0x01d7:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r8 = "MediaStore RENAME dest path: "
                r4.append(r8)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
                java.lang.Throwable r4 = new java.lang.Throwable
                r4.<init>()
                r8 = 5
                java.lang.String[] r8 = new java.lang.String[r8]
                r8[r7] = r13
                r8[r6] = r0
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppUserInfo(r12)
                r8[r5] = r13
                r13 = 3
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppProfile(r12)
                r8[r13] = r12
                r12 = 4
                int r13 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppUserId()
                java.lang.String r13 = java.lang.String.valueOf(r13)
                r8[r12] = r13
                java.lang.String r12 = "MediaStoreMismatch"
                p988jj.C87968a.C87969a.C87970a.m109467a(r12, r4, r3, r8)
                r3 = r2
                goto L_0x018d
            L_0x0217:
                r3 = r2
            L_0x0218:
                if (r6 != 0) goto L_0x0231
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "MediaStore insert fail: "
                r12.append(r13)
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
                r15.onFail(r3)
            L_0x0231:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.MediaStoreOps.tryInsert(android.content.Context, java.lang.String, android.net.Uri, com.tencent.mm.sdk.platformtools.ScopedStorageUtil$MediaStoreOps$Callback):void");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009f A[Catch:{ all -> 0x00d5, all -> 0x00da, all -> 0x00f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00df A[Catch:{ all -> 0x00d5, all -> 0x00da, all -> 0x00f0 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String uriToPath(android.content.Context r9, android.net.Uri r10) {
            /*
                java.lang.String r0 = "_data"
                r1 = 0
                r2 = 0
                android.content.Context r3 = r9.getApplicationContext()     // Catch:{ all -> 0x00f0 }
                boolean r3 = android.provider.DocumentsContract.isDocumentUri(r3, r10)     // Catch:{ all -> 0x00f0 }
                if (r3 == 0) goto L_0x0090
                boolean r3 = isExternalStorageDocument(r10)     // Catch:{ all -> 0x00f0 }
                java.lang.String r4 = ":"
                r5 = 1
                if (r3 == 0) goto L_0x003a
                java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r10)     // Catch:{ all -> 0x00f0 }
                java.lang.String[] r9 = r9.split(r4)     // Catch:{ all -> 0x00f0 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r10.<init>()     // Catch:{ all -> 0x00f0 }
                java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x00f0 }
                r10.append(r0)     // Catch:{ all -> 0x00f0 }
                java.lang.String r0 = "/"
                r10.append(r0)     // Catch:{ all -> 0x00f0 }
                r9 = r9[r5]     // Catch:{ all -> 0x00f0 }
                r10.append(r9)     // Catch:{ all -> 0x00f0 }
                java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00f0 }
                return r9
            L_0x003a:
                boolean r3 = isDownloadsDocument(r10)     // Catch:{ all -> 0x00f0 }
                if (r3 == 0) goto L_0x0053
                java.lang.String r10 = android.provider.DocumentsContract.getDocumentId(r10)     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "content://downloads/public_downloads"
                android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x00f0 }
                long r4 = java.lang.Long.parseLong(r10)     // Catch:{ all -> 0x00f0 }
                android.net.Uri r10 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch:{ all -> 0x00f0 }
                goto L_0x0090
            L_0x0053:
                boolean r3 = isMediaDocument(r10)     // Catch:{ all -> 0x00f0 }
                if (r3 == 0) goto L_0x0090
                java.lang.String r3 = android.provider.DocumentsContract.getDocumentId(r10)     // Catch:{ all -> 0x00f0 }
                java.lang.String[] r3 = r3.split(r4)     // Catch:{ all -> 0x00f0 }
                r4 = r3[r1]     // Catch:{ all -> 0x00f0 }
                java.lang.String r6 = "image"
                boolean r6 = r6.equals(r4)     // Catch:{ all -> 0x00f0 }
                if (r6 == 0) goto L_0x006e
                android.net.Uri r10 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x00f0 }
                goto L_0x0084
            L_0x006e:
                java.lang.String r6 = "video"
                boolean r6 = r6.equals(r4)     // Catch:{ all -> 0x00f0 }
                if (r6 == 0) goto L_0x007a
                android.net.Uri r10 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x00f0 }
                goto L_0x0084
            L_0x007a:
                java.lang.String r6 = "audio"
                boolean r4 = r6.equals(r4)     // Catch:{ all -> 0x00f0 }
                if (r4 == 0) goto L_0x0084
                android.net.Uri r10 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x00f0 }
            L_0x0084:
                java.lang.String r4 = "_id=?"
                java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x00f0 }
                r3 = r3[r5]     // Catch:{ all -> 0x00f0 }
                r6[r1] = r3     // Catch:{ all -> 0x00f0 }
                r7 = r6
                r6 = r4
                r4 = r10
                goto L_0x0093
            L_0x0090:
                r4 = r10
                r6 = r2
                r7 = r6
            L_0x0093:
                java.lang.String r10 = "content"
                java.lang.String r3 = r4.getScheme()     // Catch:{ all -> 0x00f0 }
                boolean r10 = r10.equalsIgnoreCase(r3)     // Catch:{ all -> 0x00f0 }
                if (r10 == 0) goto L_0x00df
                boolean r10 = isGooglePhotosUri(r4)     // Catch:{ all -> 0x00f0 }
                if (r10 == 0) goto L_0x00aa
                java.lang.String r9 = r4.getLastPathSegment()     // Catch:{ all -> 0x00f0 }
                return r9
            L_0x00aa:
                java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00f0 }
                android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ all -> 0x00f0 }
                r8 = 0
                android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00f0 }
                if (r9 != 0) goto L_0x00bf
                if (r9 == 0) goto L_0x00be
                r9.close()     // Catch:{ all -> 0x00f0 }
            L_0x00be:
                return r2
            L_0x00bf:
                int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d5 }
                boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x00d5 }
                if (r0 == 0) goto L_0x00d1
                java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x00d5 }
                r9.close()     // Catch:{ all -> 0x00f0 }
                return r10
            L_0x00d1:
                r9.close()     // Catch:{ all -> 0x00f0 }
                goto L_0x00fa
            L_0x00d5:
                r10 = move-exception
                r9.close()     // Catch:{ all -> 0x00da }
                goto L_0x00de
            L_0x00da:
                r9 = move-exception
                r10.addSuppressed(r9)     // Catch:{ all -> 0x00f0 }
            L_0x00de:
                throw r10     // Catch:{ all -> 0x00f0 }
            L_0x00df:
                java.lang.String r9 = "file"
                java.lang.String r10 = r4.getScheme()     // Catch:{ all -> 0x00f0 }
                boolean r9 = r9.equalsIgnoreCase(r10)     // Catch:{ all -> 0x00f0 }
                if (r9 == 0) goto L_0x00fa
                java.lang.String r9 = r4.getPath()     // Catch:{ all -> 0x00f0 }
                return r9
            L_0x00f0:
                r9 = move-exception
                java.lang.Object[] r10 = new java.lang.Object[r1]
                java.lang.String r0 = "MicroMsg.ScopedStorageUtil"
                java.lang.String r1 = "convert uri 2 path fail"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r1, r10)
            L_0x00fa:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.MediaStoreOps.uriToPath(android.content.Context, android.net.Uri):java.lang.String");
        }
    }

    public static void setCheckMediaStorePathRenamed(boolean z) {
        sCheckMediaStorePathRenamed = z;
    }

    public static void setUseMediaStoreInApi29(boolean z) {
        sUseMediaStoreInApi29 = z;
    }

    public static void setUseMediaStoreInDualApp(boolean z) {
        sUseMediaStoreInDualApp = z;
    }

    public static boolean shouldUseMediaStore(Context context) {
        if (!sUseMediaStoreInDualApp && WorkProfiles.isRunningInDualApp(context)) {
            return false;
        }
        return Build.VERSION.SDK_INT >= (sUseMediaStoreInApi29 ? 29 : 30);
    }
}
