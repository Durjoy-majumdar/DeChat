package p1035sf;

import android.os.Looper;
import com.tencent.xweb.file.XVFSFile;
import p723vf.C90773a;

/* renamed from: sf.c */
public class C90183c {
    /* renamed from: a */
    public static String m112853a() {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m112854b() {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : Looper.getMainLooper().getThread().getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static int[] m112855c(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        try {
            String[] split = C90773a.m113840f(String.format("/proc/%s/stat", new Object[]{Integer.valueOf(i)})).trim().split(" ");
            if (split.length >= 19) {
                i2 = Integer.parseInt(split[17].trim());
                i3 = Integer.parseInt(split[18].trim());
            }
            return new int[]{i2, i3};
        } catch (Exception unused) {
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        }
    }

    /* renamed from: d */
    public static String m112856d() {
        return m112857e(new Throwable().getStackTrace(), "", -1);
    }

    /* renamed from: e */
    public static String m112857e(StackTraceElement[] stackTraceElementArr, String str, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 3) {
            return "";
        }
        if (i < 0) {
            i = Integer.MAX_VALUE;
        }
        StringBuilder sb = new StringBuilder(" \n");
        int i2 = 3;
        while (i2 < stackTraceElementArr.length - 3 && i2 < i) {
            sb.append(str);
            sb.append("at ");
            sb.append(stackTraceElementArr[i2].getClassName());
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(stackTraceElementArr[i2].getMethodName());
            sb.append("(" + stackTraceElementArr[i2].getLineNumber() + ")");
            sb.append("\n");
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static String m112858f(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static boolean m112859g(String str) {
        return str == null || str.equals("");
    }
}
