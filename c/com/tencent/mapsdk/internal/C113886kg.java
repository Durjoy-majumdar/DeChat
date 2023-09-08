package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;

/* renamed from: com.tencent.mapsdk.internal.kg */
public final class C113886kg {

    /* renamed from: a */
    private static final int f340715a = 4096;

    /* renamed from: a */
    public static final void m157515a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static byte[] m157522b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        m157515a((Closeable) byteArrayOutputStream);
                        return byteArray;
                    }
                }
            } catch (Throwable unused) {
                m157515a((Closeable) byteArrayOutputStream);
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
            m157515a((Closeable) byteArrayOutputStream);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m157524c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Stack stack = new Stack();
        stack.push(str);
        while (!stack.isEmpty()) {
            File file = new File((String) stack.peek());
            if (!file.exists()) {
                stack.pop();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (listFiles.length == 0) {
                        file.delete();
                        stack.pop();
                    } else {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                stack.push(file2.getAbsolutePath());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            } else {
                file.delete();
                stack.pop();
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m157520a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[102400];
                do {
                    int read = inputStream.read(bArr, 0, 102400);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } while (byteArrayOutputStream.size() < 102400);
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m157515a((Closeable) byteArrayOutputStream);
                return byteArray;
            } catch (Throwable unused) {
                m157515a((Closeable) byteArrayOutputStream);
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
            m157515a((Closeable) byteArrayOutputStream);
            return null;
        }
    }

    /* renamed from: b */
    public static final InputStream m157521b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m157514a(new File(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final long m157513a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            return -1;
        }
        try {
            byte[] bArr = new byte[4096];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            }
        } catch (IOException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m157512a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return m157511a(bArr, new File(str));
    }

    /* renamed from: a */
    public static int m157511a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        if (!(bArr == null || bArr.length == 0 || file.isDirectory())) {
            FileOutputStream fileOutputStream2 = null;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException unused) {
                m157515a((Closeable) fileOutputStream2);
                return 0;
            } catch (Throwable th) {
                th = th;
                m157515a((Closeable) fileOutputStream2);
                throw th;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                int length = bArr.length;
                m157515a((Closeable) fileOutputStream);
                return length;
            } catch (IOException unused2) {
                fileOutputStream2 = fileOutputStream;
                m157515a((Closeable) fileOutputStream2);
                return 0;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = fileOutputStream;
                m157515a((Closeable) fileOutputStream2);
                throw th;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private static boolean m157523c(InputStream inputStream) {
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m157518a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                return true;
            }
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            return file.mkdirs();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static final InputStream m157514a(File file) {
        try {
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                return null;
            }
            return new FileInputStream(file);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m157519a(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.renameTo(new File(str2));
        }
        return false;
    }

    /* renamed from: a */
    public static void m157517a(Bitmap... bitmapArr) {
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m157516a(byte[] bArr, OutputStream outputStream) {
        if (bArr != null && bArr.length != 0 && outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (IOException unused) {
            }
        }
    }
}
