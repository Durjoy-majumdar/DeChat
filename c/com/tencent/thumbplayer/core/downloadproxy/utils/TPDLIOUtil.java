package com.tencent.thumbplayer.core.downloadproxy.utils;

import android.content.Context;
import android.os.Environment;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TPDLIOUtil {
    private static final String FILE_NAME = "TPDLIOUtil";
    private static Pattern PATH_PATTERN = Pattern.compile("^(\\w+):/{2,3}(.*)");
    private static final String PROTOCOL_ASSET = "asset";
    private static final String PROTOCOL_FILE = "file";
    private static final String PROTOCOL_HTTP = "http";
    private static final String PROTOCOL_HTTPS = "https";
    private static Pattern PROTOCOL_PATTERN = Pattern.compile("^(\\w+):/{2,3}");

    public static File compare(File file, File file2) {
        return file == null ? file2 : (file2 == null || !file2.exists()) ? file : !file.exists() ? file2 : file.lastModified() > file2.lastModified() ? file : file2;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return 0;
        }
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i += read;
            } catch (IOException unused) {
            }
        }
        return i;
    }

    public static boolean createFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        if (!createParentDirectories(file)) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean createParentDirectories(File file) {
        if (file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return parentFile.mkdirs();
    }

    public static String getPath(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = PATH_PATTERN.matcher(str);
        return (!matcher.find() || !matcher.group(1).equals(PROTOCOL_ASSET)) ? str : matcher.group(2);
    }

    public static String getProtocol(String str) {
        if (str != null && str.length() > 0) {
            Matcher matcher = PROTOCOL_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return PROTOCOL_FILE;
    }

    public static boolean isExternalStorageMounted() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isRemoteFile(String str) {
        String protocol = getProtocol(str);
        return protocol.equals("https") || protocol.equals(PROTOCOL_HTTP);
    }

    public static InputStream open(Context context, String str) {
        String protocol = getProtocol(str);
        if (protocol.equals(PROTOCOL_ASSET)) {
            try {
                return context.getAssets().open(getPath(str));
            } catch (IOException unused) {
                return null;
            }
        } else if (protocol.equals(PROTOCOL_FILE)) {
            try {
                return new FileInputStream(getPath(str));
            } catch (Exception unused2) {
                return null;
            }
        } else if (!protocol.equals(PROTOCOL_HTTP) && !protocol.equals("https")) {
            return null;
        } else {
            try {
                return new URL(str).openStream();
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    public static InputStream openInputStream(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openInputStream(new File(str));
    }

    public static OutputStream openOutputStream(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openOutputStream(new File(str));
    }

    public static void recursiveDelete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            for (File recursiveDelete : listFiles) {
                                recursiveDelete(recursiveDelete);
                            }
                        } else {
                            return;
                        }
                    }
                    TPDLProxyLog.m21864d(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete: delete=" + file.delete());
                }
            } catch (Exception e) {
                TPDLProxyLog.m21864d(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete failed, error:" + e.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r6.createNewFile() == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0078 A[SYNTHETIC, Splitter:B:41:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean write(java.io.File r6, byte[] r7, int r8, int r9) {
        /*
            java.lang.String r0 = "write error:"
            java.lang.String r1 = "tpdlnative"
            java.lang.String r2 = "TPDLIOUtil"
            r3 = 0
            if (r6 == 0) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            int r4 = r7.length
            if (r4 > 0) goto L_0x0010
            goto L_0x0093
        L_0x0010:
            boolean r4 = r6.exists()
            if (r4 != 0) goto L_0x002a
            java.io.File r4 = r6.getParentFile()
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L_0x0023
            return r3
        L_0x0023:
            boolean r4 = r6.createNewFile()     // Catch:{ IOException -> 0x0029 }
            if (r4 != 0) goto L_0x002a
        L_0x0029:
            return r3
        L_0x002a:
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0075, all -> 0x0056 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0056 }
            r5.write(r7, r8, r9)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r6 = 1
            r5.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x004f
        L_0x0038:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r2, r3, r1, r7)
        L_0x004f:
            return r6
        L_0x0050:
            r6 = move-exception
            r4 = r5
            goto L_0x0057
        L_0x0053:
            r4 = r5
            goto L_0x0076
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            if (r4 == 0) goto L_0x0074
            r4.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x0074
        L_0x005d:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r2, r3, r1, r7)
        L_0x0074:
            throw r6
        L_0x0075:
        L_0x0076:
            if (r4 == 0) goto L_0x0093
            r4.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0093
        L_0x007c:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r2, r3, r1, r6)
        L_0x0093:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.write(java.io.File, byte[], int, int):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:21|22|23|24|25|26|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004a A[SYNTHETIC, Splitter:B:40:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0051 A[SYNTHETIC, Splitter:B:44:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0058 A[SYNTHETIC, Splitter:B:51:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x005f A[SYNTHETIC, Splitter:B:55:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int copy(java.io.File r3, java.io.File r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0062
            if (r4 != 0) goto L_0x0006
            goto L_0x0062
        L_0x0006:
            boolean r1 = r3.exists()
            if (r1 != 0) goto L_0x000d
            return r0
        L_0x000d:
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x0027
            java.io.File r1 = r4.getParentFile()
            if (r1 != 0) goto L_0x001a
            return r0
        L_0x001a:
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0027
            boolean r1 = r1.mkdirs()
            if (r1 != 0) goto L_0x0027
            return r0
        L_0x0027:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0055, all -> 0x0046 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0055, all -> 0x0046 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0043, all -> 0x003f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0043, all -> 0x003f }
            int r4 = copy((java.io.InputStream) r2, (java.io.OutputStream) r3)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x003d }
            r2.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r3.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            return r4
        L_0x003d:
            r4 = move-exception
            goto L_0x0041
        L_0x003f:
            r4 = move-exception
            r3 = r1
        L_0x0041:
            r1 = r2
            goto L_0x0048
        L_0x0043:
            r3 = r1
        L_0x0044:
            r1 = r2
            goto L_0x0056
        L_0x0046:
            r4 = move-exception
            r3 = r1
        L_0x0048:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r4
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.copy(java.io.File, java.io.File):int");
    }

    public static InputStream openInputStream(File file) {
        if (file == null) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static OutputStream openOutputStream(File file) {
        if (file != null && createFile(file)) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean createFile(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return createFile(new File(str));
    }

    public static boolean createParentDirectories(String str) {
        return createParentDirectories(new File(str));
    }
}
