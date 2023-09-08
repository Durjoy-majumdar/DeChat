package yp3;

import android.os.Looper;
import android.os.Process;
import android.util.Log;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: yp3.a */
public final class C112478a {

    /* renamed from: a */
    public static C112479a f336787a;

    /* renamed from: yp3.a$a */
    public interface C112479a {
        int getLogLevel();

        void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);
    }

    /* renamed from: a */
    public static final void m153623a(String str, String str2, Object... objArr) {
        C87412m.m108595h(objArr, "obj");
        C112479a aVar = f336787a;
        if (aVar != null) {
            boolean z = true;
            if (aVar.getLogLevel() <= 1) {
                if (objArr.length != 0) {
                    z = false;
                }
                if (!z) {
                    if (str2 != null) {
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        str2 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                        C87412m.m108590c(str2, "java.lang.String.format(format, *args)");
                    } else {
                        C87412m.m108601n();
                        throw null;
                    }
                }
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                int myTid = Process.myTid();
                int myPid = Process.myPid();
                Thread currentThread = Thread.currentThread();
                C87412m.m108590c(currentThread, "Thread.currentThread()");
                long id = currentThread.getId();
                Looper mainLooper = Looper.getMainLooper();
                C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
                Thread thread = mainLooper.getThread();
                C87412m.m108590c(thread, "Looper.getMainLooper().thread");
                aVar.logD(str, "", "", myTid, myPid, id, thread.getId(), str3);
            }
        }
    }

    /* renamed from: b */
    public static final void m153624b(String str, String str2, Object... objArr) {
        C87412m.m108595h(objArr, "obj");
        C112479a aVar = f336787a;
        if (aVar != null && aVar.getLogLevel() <= 4) {
            if (!(objArr.length == 0)) {
                if (str2 != null) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str2 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                    C87412m.m108590c(str2, "java.lang.String.format(format, *args)");
                } else {
                    C87412m.m108601n();
                    throw null;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            int myTid = Process.myTid();
            int myPid = Process.myPid();
            Thread currentThread = Thread.currentThread();
            C87412m.m108590c(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            C87412m.m108590c(thread, "Looper.getMainLooper().thread");
            aVar.logE(str, "", "", myTid, myPid, id, thread.getId(), str3);
        }
    }

    /* renamed from: c */
    public static final void m153625c(String str, String str2, Object... objArr) {
        C87412m.m108595h(objArr, "obj");
        C112479a aVar = f336787a;
        if (aVar != null && aVar.getLogLevel() <= 2) {
            if (!(objArr.length == 0)) {
                if (str2 != null) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str2 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                    C87412m.m108590c(str2, "java.lang.String.format(format, *args)");
                } else {
                    C87412m.m108601n();
                    throw null;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            int myTid = Process.myTid();
            int myPid = Process.myPid();
            Thread currentThread = Thread.currentThread();
            C87412m.m108590c(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            C87412m.m108590c(thread, "Looper.getMainLooper().thread");
            aVar.logI(str, "", "", myTid, myPid, id, thread.getId(), str3);
        }
    }

    /* renamed from: d */
    public static final void m153626d(String str, Throwable th, String str2, Object... objArr) {
        C87412m.m108595h(objArr, "obj");
        C112479a aVar = f336787a;
        if (aVar != null && aVar.getLogLevel() <= 4) {
            if (!(objArr.length == 0)) {
                if (str2 != null) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str2 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                    C87412m.m108590c(str2, "java.lang.String.format(format, *args)");
                } else {
                    C87412m.m108601n();
                    throw null;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2 + "  " + Log.getStackTraceString(th);
            int myTid = Process.myTid();
            int myPid = Process.myPid();
            Thread currentThread = Thread.currentThread();
            C87412m.m108590c(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            C87412m.m108590c(thread, "Looper.getMainLooper().thread");
            aVar.logE(str, "", "", myTid, myPid, id, thread.getId(), str3);
        }
    }

    /* renamed from: e */
    public static final void m153627e(String str, String str2, Object... objArr) {
        C87412m.m108595h(objArr, "obj");
        C112479a aVar = f336787a;
        if (aVar != null && aVar.getLogLevel() <= 2) {
            if (!(objArr.length == 0)) {
                if (str2 != null) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str2 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                    C87412m.m108590c(str2, "java.lang.String.format(format, *args)");
                } else {
                    C87412m.m108601n();
                    throw null;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2 + "  " + new C66691d();
            int myTid = Process.myTid();
            int myPid = Process.myPid();
            Thread currentThread = Thread.currentThread();
            C87412m.m108590c(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            C87412m.m108590c(thread, "Looper.getMainLooper().thread");
            aVar.logI(str, "", "", myTid, myPid, id, thread.getId(), str3);
        }
    }

    /* renamed from: f */
    public static final void m153628f(String str, String str2, Object... objArr) {
        C87412m.m108595h(objArr, "obj");
        C112479a aVar = f336787a;
        if (aVar != null && aVar.getLogLevel() <= 3) {
            if (!(objArr.length == 0)) {
                if (str2 != null) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str2 = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                    C87412m.m108590c(str2, "java.lang.String.format(format, *args)");
                } else {
                    C87412m.m108601n();
                    throw null;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            int myTid = Process.myTid();
            int myPid = Process.myPid();
            Thread currentThread = Thread.currentThread();
            C87412m.m108590c(currentThread, "Thread.currentThread()");
            long id = currentThread.getId();
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108590c(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            C87412m.m108590c(thread, "Looper.getMainLooper().thread");
            aVar.logW(str, "", "", myTid, myPid, id, thread.getId(), str3);
        }
    }
}
