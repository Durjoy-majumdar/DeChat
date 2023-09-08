package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mapsdk.internal.kf */
public final class C113884kf {

    /* renamed from: a */
    public static final int f340708a = 1024;

    /* renamed from: b */
    public static final int f340709b = 1048576;

    /* renamed from: c */
    public static final int f340710c = 1073741824;

    /* renamed from: d */
    public static File f340711d = null;

    /* renamed from: e */
    private static final String f340712e = "FileUtil";

    /* renamed from: f */
    private static final C113925lb f340713f = new C113925lb();

    /* renamed from: a */
    public static File m157485a(File file, String str) {
        if (file == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        return file2;
    }

    /* renamed from: b */
    public static File m157494b(File file, String str) {
        File file2 = null;
        if (file != null && !TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(File.separator);
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                File file3 = new File(file, str.substring(0, lastIndexOf));
                str = substring;
                file = file3;
            }
            if (file.exists() || file.mkdirs()) {
                file2 = new File(file, str);
                try {
                    if (!file2.exists() && !file2.createNewFile() && Log.isLoggable(f340712e, 6)) {
                        file2.getAbsolutePath();
                    }
                } catch (IOException unused) {
                    Log.isLoggable(f340712e, 6);
                }
            } else {
                if (Log.isLoggable(f340712e, 6)) {
                    file.getAbsolutePath();
                }
                return null;
            }
        }
        return file2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|10|(2:11|(1:13)(1:59))|14|15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x005e, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0070, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0044 A[SYNTHETIC, Splitter:B:31:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC, Splitter:B:35:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC, Splitter:B:43:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0068 A[SYNTHETIC, Splitter:B:53:0x0068] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m157503c(java.io.File r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0073
            boolean r1 = r6.exists()
            if (r1 != 0) goto L_0x000b
            goto L_0x0073
        L_0x000b:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0052, all -> 0x003e }
            r1.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0052, all -> 0x003e }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x003c, IOException -> 0x003a, all -> 0x0035 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x003c, IOException -> 0x003a, all -> 0x0035 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0054, all -> 0x0033 }
        L_0x0019:
            int r3 = r1.read(r2)     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0054, all -> 0x0033 }
            r4 = -1
            if (r3 == r4) goto L_0x0025
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0054, all -> 0x0033 }
            goto L_0x0019
        L_0x0025:
            byte[] r0 = r6.toByteArray()     // Catch:{ FileNotFoundException -> 0x0066, IOException -> 0x0054, all -> 0x0033 }
            r6.flush()     // Catch:{ IOException -> 0x002f }
            r6.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x0042
        L_0x0035:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0042
        L_0x003a:
            r6 = r0
            goto L_0x0054
        L_0x003c:
            r6 = r0
            goto L_0x0066
        L_0x003e:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
        L_0x0042:
            if (r6 == 0) goto L_0x004c
            r6.flush()     // Catch:{ IOException -> 0x004b }
            r6.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r0
        L_0x0052:
            r6 = r0
            r1 = r6
        L_0x0054:
            if (r6 == 0) goto L_0x005e
            r6.flush()     // Catch:{ IOException -> 0x005d }
            r6.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            if (r1 == 0) goto L_0x0073
        L_0x0060:
            r1.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0073
        L_0x0064:
            r6 = r0
            r1 = r6
        L_0x0066:
            if (r6 == 0) goto L_0x0070
            r6.flush()     // Catch:{ IOException -> 0x006f }
            r6.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            if (r1 == 0) goto L_0x0073
            goto L_0x0060
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113884kf.m157503c(java.io.File):byte[]");
    }

    /* renamed from: d */
    public static List<String> m157505d(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (file != null && file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException | IOException unused) {
                bufferedReader = null;
                C113886kg.m157515a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th) {
                th = th;
                C113886kg.m157515a((Closeable) bufferedReader2);
                throw th;
            }
            try {
                ArrayList arrayList = new ArrayList();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        arrayList.add(readLine);
                    } else {
                        C113886kg.m157515a((Closeable) bufferedReader);
                        return arrayList;
                    }
                }
            } catch (FileNotFoundException | IOException unused2) {
                C113886kg.m157515a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = bufferedReader;
                C113886kg.m157515a((Closeable) bufferedReader2);
                throw th;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static File m157506e(File file) {
        if (file == null) {
            return null;
        }
        File parentFile = file.getParentFile();
        StringBuilder sb = new StringBuilder();
        C113925lb lbVar = f340713f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(System.currentTimeMillis());
        sb.append(lbVar.mo172345a(sb4.toString()));
        sb.append(".tmp");
        return m157494b(parentFile, sb.toString());
    }

    /* renamed from: f */
    public static long m157508f(File file) {
        return m157484a(file, (FileFilter) null);
    }

    /* renamed from: g */
    private static File m157509g(File file) {
        return m157485a(file.getParentFile(), file.getName());
    }

    /* renamed from: h */
    private static boolean m157510h(File file) {
        if (file == null || !file.exists() || !file.isFile()) {
            return false;
        }
        return file.delete();
    }

    /* renamed from: a */
    public static boolean m157492a(String str) {
        return m157489a(new File(str));
    }

    /* renamed from: e */
    public static File[] m157507e(File file, final String str) {
        return (file == null || !file.isDirectory()) ? new File[0] : file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                return Pattern.compile(str).matcher(file.getName()).matches();
            }
        });
    }

    /* renamed from: a */
    public static boolean m157489a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m157487a(File file, int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (!(file == null || !file.exists() || i == -1)) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (i2 == i) {
                            C113886kg.m157515a((Closeable) bufferedReader);
                            return readLine;
                        } else {
                            i2++;
                        }
                    } catch (FileNotFoundException | IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        C113886kg.m157515a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
            } catch (FileNotFoundException | IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                C113886kg.m157515a((Closeable) bufferedReader2);
                throw th;
            }
            C113886kg.m157515a((Closeable) bufferedReader);
        }
        return null;
    }

    /* renamed from: d */
    public static int m157504d(File file, String str) {
        if (file != null && file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            C113886kg.m157515a((Closeable) bufferedReader2);
                            break;
                        } else if (readLine.startsWith(str)) {
                            C113886kg.m157515a((Closeable) bufferedReader2);
                            return i;
                        } else {
                            i++;
                        }
                    } catch (FileNotFoundException | IOException unused) {
                        bufferedReader = bufferedReader2;
                        C113886kg.m157515a((Closeable) bufferedReader);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        C113886kg.m157515a((Closeable) bufferedReader);
                        throw th;
                    }
                }
            } catch (FileNotFoundException | IOException unused2) {
                C113886kg.m157515a((Closeable) bufferedReader);
                return -1;
            } catch (Throwable th4) {
                th = th4;
                C113886kg.m157515a((Closeable) bufferedReader);
                throw th;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m157500b(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        Stack stack = new Stack();
        stack.push(file);
        boolean z = false;
        while (!stack.isEmpty()) {
            File file2 = (File) stack.peek();
            if (file2.isFile()) {
                z = file2.delete();
                stack.pop();
            } else if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    z = file2.delete();
                    stack.pop();
                } else {
                    for (File push : listFiles) {
                        stack.push(push);
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x002f, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0025 A[SYNTHETIC, Splitter:B:22:0x0025] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m157491a(java.io.File r3, byte[] r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0032
            if (r4 != 0) goto L_0x0006
            goto L_0x0032
        L_0x0006:
            boolean r1 = m157489a((java.io.File) r3)
            if (r1 != 0) goto L_0x000d
            return r0
        L_0x000d:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x0029, all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x0029, all -> 0x0022 }
            r2.write(r4)     // Catch:{ FileNotFoundException -> 0x0020, IOException -> 0x001e, all -> 0x001b }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0032
        L_0x001b:
            r3 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x001e:
            r1 = r2
            goto L_0x0029
        L_0x0020:
            r1 = r2
            goto L_0x002f
        L_0x0022:
            r3 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r3
        L_0x0029:
            if (r1 == 0) goto L_0x0032
        L_0x002b:
            r1.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0032
        L_0x002f:
            if (r1 == 0) goto L_0x0032
            goto L_0x002b
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113884kf.m157491a(java.io.File, byte[]):boolean");
    }

    /* renamed from: c */
    public static void m157502c(File file, String str) {
        if (file != null && !TextUtils.isEmpty(str)) {
            if (!file.exists()) {
                m157489a(file);
            }
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.seek(randomAccessFile2.length());
                    randomAccessFile2.write((str + APLogFileUtil.SEPARATOR_LINE).getBytes());
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                } catch (FileNotFoundException unused) {
                    randomAccessFile = randomAccessFile2;
                    C113886kg.m157515a((Closeable) randomAccessFile);
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                    C113886kg.m157515a((Closeable) randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                C113886kg.m157515a((Closeable) randomAccessFile);
            } catch (IOException unused4) {
                C113886kg.m157515a((Closeable) randomAccessFile);
            } catch (Throwable th4) {
                th = th4;
                C113886kg.m157515a((Closeable) randomAccessFile);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m157488a(File file, int i, String str) {
        File file2;
        RandomAccessFile randomAccessFile;
        if (file != null && file.exists() && i != -1) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
                try {
                    file2 = m157506e(file);
                } catch (FileNotFoundException unused) {
                    file2 = null;
                    randomAccessFile = null;
                    randomAccessFile2 = randomAccessFile3;
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m157500b(file2);
                } catch (IOException unused2) {
                    file2 = null;
                    randomAccessFile = null;
                    randomAccessFile2 = randomAccessFile3;
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m157500b(file2);
                } catch (Throwable th) {
                    th = th;
                    file2 = null;
                    randomAccessFile = null;
                    randomAccessFile2 = randomAccessFile3;
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m157500b(file2);
                    throw th;
                }
                try {
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    int i2 = 0;
                    long j = 0;
                    while (true) {
                        try {
                            String readLine = randomAccessFile3.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (i2 == i) {
                                j = randomAccessFile3.getFilePointer() - ((long) APLogFileUtil.SEPARATOR_LINE.getBytes().length);
                            } else if (i2 > i) {
                                randomAccessFile.write(readLine.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                            }
                            i2++;
                        } catch (FileNotFoundException | IOException unused3) {
                            randomAccessFile2 = randomAccessFile3;
                            C113886kg.m157515a((Closeable) randomAccessFile2);
                            C113886kg.m157515a((Closeable) randomAccessFile);
                            m157500b(file2);
                        } catch (Throwable th4) {
                            th = th4;
                            randomAccessFile2 = randomAccessFile3;
                            C113886kg.m157515a((Closeable) randomAccessFile2);
                            C113886kg.m157515a((Closeable) randomAccessFile);
                            m157500b(file2);
                            throw th;
                        }
                    }
                    randomAccessFile3.seek(j);
                    randomAccessFile3.write((str + APLogFileUtil.SEPARATOR_LINE).getBytes());
                    randomAccessFile.seek(0);
                    while (true) {
                        String readLine2 = randomAccessFile.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        randomAccessFile3.write(readLine2.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                    }
                    C113886kg.m157515a((Closeable) randomAccessFile3);
                } catch (FileNotFoundException unused4) {
                    randomAccessFile = null;
                    randomAccessFile2 = randomAccessFile3;
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m157500b(file2);
                } catch (IOException unused5) {
                    randomAccessFile = null;
                    randomAccessFile2 = randomAccessFile3;
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m157500b(file2);
                } catch (Throwable th5) {
                    th = th5;
                    randomAccessFile = null;
                    randomAccessFile2 = randomAccessFile3;
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m157500b(file2);
                    throw th;
                }
            } catch (FileNotFoundException | IOException unused6) {
                file2 = null;
                randomAccessFile = null;
                C113886kg.m157515a((Closeable) randomAccessFile2);
                C113886kg.m157515a((Closeable) randomAccessFile);
                m157500b(file2);
            } catch (Throwable th6) {
                th = th6;
                file2 = null;
                randomAccessFile = null;
                C113886kg.m157515a((Closeable) randomAccessFile2);
                C113886kg.m157515a((Closeable) randomAccessFile);
                m157500b(file2);
                throw th;
            }
            C113886kg.m157515a((Closeable) randomAccessFile);
            m157500b(file2);
        }
    }

    /* renamed from: b */
    public static void m157499b(File file, byte[] bArr) {
        if (file != null && bArr != null && bArr.length != 0) {
            if (!file.exists()) {
                m157489a(file);
            }
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.seek(randomAccessFile2.length());
                    randomAccessFile2.write(bArr);
                    C113886kg.m157515a((Closeable) randomAccessFile2);
                } catch (FileNotFoundException unused) {
                    randomAccessFile = randomAccessFile2;
                    C113886kg.m157515a((Closeable) randomAccessFile);
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                    C113886kg.m157515a((Closeable) randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                C113886kg.m157515a((Closeable) randomAccessFile);
            } catch (IOException unused4) {
                C113886kg.m157515a((Closeable) randomAccessFile);
            } catch (Throwable th4) {
                th = th4;
                C113886kg.m157515a((Closeable) randomAccessFile);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0096  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m157496b(java.io.File r7, int r8) {
        /*
            java.lang.String r0 = "rw"
            boolean r1 = r7.exists()
            if (r1 == 0) goto L_0x0099
            r1 = -1
            if (r8 != r1) goto L_0x000d
            goto L_0x0099
        L_0x000d:
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x007c, all -> 0x0066 }
            r3.<init>(r7, r0)     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x007c, all -> 0x0066 }
            java.io.File r4 = m157506e(r7)     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005e, all -> 0x0059 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0057, IOException -> 0x0055, all -> 0x0052 }
            r5.<init>(r4, r0)     // Catch:{ FileNotFoundException -> 0x0057, IOException -> 0x0055, all -> 0x0052 }
            r0 = 0
        L_0x001e:
            java.lang.String r2 = r3.readLine()     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0060, all -> 0x0050 }
            if (r2 == 0) goto L_0x003d
            if (r0 == r8) goto L_0x0039
            java.lang.String r6 = "ISO-8859-1"
            byte[] r2 = r2.getBytes(r6)     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0060, all -> 0x0050 }
            r5.write(r2)     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0060, all -> 0x0050 }
            java.lang.String r2 = "\r\n"
            byte[] r2 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0060, all -> 0x0050 }
            r5.write(r2)     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x0060, all -> 0x0050 }
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            int r0 = r0 + 1
            goto L_0x001e
        L_0x003d:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r3)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x004c
        L_0x0045:
            m157500b((java.io.File) r7)
            m157490a((java.io.File) r4, (java.io.File) r7)
            return
        L_0x004c:
            m157500b((java.io.File) r4)
            return
        L_0x0050:
            r8 = move-exception
            goto L_0x005c
        L_0x0052:
            r8 = move-exception
            r5 = r2
            goto L_0x005c
        L_0x0055:
            r5 = r2
            goto L_0x0060
        L_0x0057:
            r5 = r2
            goto L_0x0064
        L_0x0059:
            r8 = move-exception
            r4 = r2
            r5 = r4
        L_0x005c:
            r2 = r3
            goto L_0x0069
        L_0x005e:
            r4 = r2
            r5 = r4
        L_0x0060:
            r2 = r3
            goto L_0x007e
        L_0x0062:
            r4 = r2
            r5 = r4
        L_0x0064:
            r2 = r3
            goto L_0x008d
        L_0x0066:
            r8 = move-exception
            r4 = r2
            r5 = r4
        L_0x0069:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r2)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x0078
            m157500b((java.io.File) r7)
            m157490a((java.io.File) r4, (java.io.File) r7)
            goto L_0x007b
        L_0x0078:
            m157500b((java.io.File) r4)
        L_0x007b:
            throw r8
        L_0x007c:
            r4 = r2
            r5 = r4
        L_0x007e:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r2)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x0087
            goto L_0x0045
        L_0x0087:
            m157500b((java.io.File) r4)
            return
        L_0x008b:
            r4 = r2
            r5 = r4
        L_0x008d:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r2)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x0096
            goto L_0x0045
        L_0x0096:
            m157500b((java.io.File) r4)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113884kf.m157496b(java.io.File, int):void");
    }

    /* renamed from: a */
    public static boolean m157490a(File file, File file2) {
        if (file == null || !file.exists()) {
            return false;
        }
        m157500b(file2);
        return file.renameTo(file2);
    }

    /* renamed from: a */
    private static boolean m157493a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file2.exists()) {
            m157508f(file2);
        }
        return file.renameTo(new File(str2));
    }

    /* renamed from: a */
    public static long m157484a(File file, FileFilter fileFilter) {
        File[] listFiles;
        long j = 0;
        if (file == null || !file.exists()) {
            return 0;
        }
        if (file.isDirectory() && (listFiles = file.listFiles(fileFilter)) != null) {
            for (File a : listFiles) {
                j += m157484a(a, fileFilter);
            }
        }
        if (fileFilter != null && !fileFilter.accept(file)) {
            return j;
        }
        long length = file.length();
        File file2 = new File(file.getAbsolutePath() + System.currentTimeMillis());
        file.renameTo(file2);
        file2.delete();
        return length;
    }

    /* renamed from: a */
    public static String m157486a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String packageName = context.getPackageName();
            if (packageName != null) {
                if (packageName.length() != 0) {
                    return packageName.length() > 255 ? packageName.substring(0, 254) : packageName;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m157497b(java.io.File r8, int r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "rw"
            if (r8 == 0) goto L_0x00b7
            boolean r1 = r8.exists()
            if (r1 == 0) goto L_0x00b7
            r1 = -1
            if (r9 == r1) goto L_0x00b7
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L_0x0015
            goto L_0x00b7
        L_0x0015:
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x009a, all -> 0x0084 }
            r3.<init>(r8, r0)     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x009a, all -> 0x0084 }
            java.io.File r4 = m157506e(r8)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007c, all -> 0x0077 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x0073, all -> 0x0070 }
            r5.<init>(r4, r0)     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x0073, all -> 0x0070 }
            r0 = 0
        L_0x0026:
            java.lang.String r2 = r3.readLine()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            if (r2 == 0) goto L_0x005b
            java.lang.String r6 = "\r\n"
            if (r0 == r9) goto L_0x0041
            java.lang.String r7 = "ISO-8859-1"
            byte[] r2 = r2.getBytes(r7)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r5.write(r2)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            byte[] r2 = r6.getBytes()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r5.write(r2)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            goto L_0x0058
        L_0x0041:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r2.append(r10)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            byte[] r2 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r5.write(r2)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007e, all -> 0x006e }
            r1 = 1
        L_0x0058:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x005b:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r3)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x006a
        L_0x0063:
            m157500b((java.io.File) r8)
            m157490a((java.io.File) r4, (java.io.File) r8)
            return
        L_0x006a:
            m157500b((java.io.File) r4)
            return
        L_0x006e:
            r9 = move-exception
            goto L_0x007a
        L_0x0070:
            r9 = move-exception
            r5 = r2
            goto L_0x007a
        L_0x0073:
            r5 = r2
            goto L_0x007e
        L_0x0075:
            r5 = r2
            goto L_0x0082
        L_0x0077:
            r9 = move-exception
            r4 = r2
            r5 = r4
        L_0x007a:
            r2 = r3
            goto L_0x0087
        L_0x007c:
            r4 = r2
            r5 = r4
        L_0x007e:
            r2 = r3
            goto L_0x009c
        L_0x0080:
            r4 = r2
            r5 = r4
        L_0x0082:
            r2 = r3
            goto L_0x00ab
        L_0x0084:
            r9 = move-exception
            r4 = r2
            r5 = r4
        L_0x0087:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r2)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x0096
            m157500b((java.io.File) r8)
            m157490a((java.io.File) r4, (java.io.File) r8)
            goto L_0x0099
        L_0x0096:
            m157500b((java.io.File) r4)
        L_0x0099:
            throw r9
        L_0x009a:
            r4 = r2
            r5 = r4
        L_0x009c:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r2)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x00a5
            goto L_0x0063
        L_0x00a5:
            m157500b((java.io.File) r4)
            return
        L_0x00a9:
            r4 = r2
            r5 = r4
        L_0x00ab:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r2)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            if (r1 == 0) goto L_0x00b4
            goto L_0x0063
        L_0x00b4:
            m157500b((java.io.File) r4)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113884kf.m157497b(java.io.File, int, java.lang.String):void");
    }

    /* renamed from: b */
    public static String m157495b(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.contains("../")) {
            trim = trim.replaceAll("\\.\\./", "");
        }
        while (trim.startsWith(File.separator)) {
            trim = trim.substring(1);
        }
        while (trim.endsWith(File.separator)) {
            trim = trim.substring(0, trim.length() - 1);
        }
        return trim;
    }

    /* renamed from: b */
    public static void m157498b(File file, File file2) {
        if (!file2.exists()) {
            m157485a(file2.getParentFile(), file2.getName());
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File b : listFiles) {
                    m157498b(b, new File(file2, file.getName()));
                }
                return;
            }
            return;
        }
        File file3 = new File(file2, file.getName());
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.copy(file.toPath(), file3.toPath(), new CopyOption[0]);
            } catch (IOException unused) {
            }
        } else {
            m157491a(file3, m157503c(file));
        }
    }

    /* renamed from: b */
    private static File[] m157501b(File file, FileFilter fileFilter) {
        File[] fileArr = new File[0];
        return (file != null && file.isDirectory()) ? file.listFiles(fileFilter) : fileArr;
    }
}
